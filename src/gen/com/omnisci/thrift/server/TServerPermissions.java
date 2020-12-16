/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.omnisci.thrift.server;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class TServerPermissions implements org.apache.thrift.TBase<TServerPermissions, TServerPermissions._Fields>, java.io.Serializable, Cloneable, Comparable<TServerPermissions> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TServerPermissions");

  private static final org.apache.thrift.protocol.TField CREATE__FIELD_DESC = new org.apache.thrift.protocol.TField("create_", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField DROP__FIELD_DESC = new org.apache.thrift.protocol.TField("drop_", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField ALTER__FIELD_DESC = new org.apache.thrift.protocol.TField("alter_", org.apache.thrift.protocol.TType.BOOL, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TServerPermissionsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TServerPermissionsTupleSchemeFactory();

  public boolean create_; // required
  public boolean drop_; // required
  public boolean alter_; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CREATE_((short)1, "create_"),
    DROP_((short)2, "drop_"),
    ALTER_((short)3, "alter_");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CREATE_
          return CREATE_;
        case 2: // DROP_
          return DROP_;
        case 3: // ALTER_
          return ALTER_;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __CREATE__ISSET_ID = 0;
  private static final int __DROP__ISSET_ID = 1;
  private static final int __ALTER__ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CREATE_, new org.apache.thrift.meta_data.FieldMetaData("create_", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.DROP_, new org.apache.thrift.meta_data.FieldMetaData("drop_", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ALTER_, new org.apache.thrift.meta_data.FieldMetaData("alter_", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TServerPermissions.class, metaDataMap);
  }

  public TServerPermissions() {
  }

  public TServerPermissions(
    boolean create_,
    boolean drop_,
    boolean alter_)
  {
    this();
    this.create_ = create_;
    setCreate_IsSet(true);
    this.drop_ = drop_;
    setDrop_IsSet(true);
    this.alter_ = alter_;
    setAlter_IsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TServerPermissions(TServerPermissions other) {
    __isset_bitfield = other.__isset_bitfield;
    this.create_ = other.create_;
    this.drop_ = other.drop_;
    this.alter_ = other.alter_;
  }

  public TServerPermissions deepCopy() {
    return new TServerPermissions(this);
  }

  @Override
  public void clear() {
    setCreate_IsSet(false);
    this.create_ = false;
    setDrop_IsSet(false);
    this.drop_ = false;
    setAlter_IsSet(false);
    this.alter_ = false;
  }

  public boolean isCreate_() {
    return this.create_;
  }

  public TServerPermissions setCreate_(boolean create_) {
    this.create_ = create_;
    setCreate_IsSet(true);
    return this;
  }

  public void unsetCreate_() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CREATE__ISSET_ID);
  }

  /** Returns true if field create_ is set (has been assigned a value) and false otherwise */
  public boolean isSetCreate_() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CREATE__ISSET_ID);
  }

  public void setCreate_IsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CREATE__ISSET_ID, value);
  }

  public boolean isDrop_() {
    return this.drop_;
  }

  public TServerPermissions setDrop_(boolean drop_) {
    this.drop_ = drop_;
    setDrop_IsSet(true);
    return this;
  }

  public void unsetDrop_() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DROP__ISSET_ID);
  }

  /** Returns true if field drop_ is set (has been assigned a value) and false otherwise */
  public boolean isSetDrop_() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DROP__ISSET_ID);
  }

  public void setDrop_IsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DROP__ISSET_ID, value);
  }

  public boolean isAlter_() {
    return this.alter_;
  }

  public TServerPermissions setAlter_(boolean alter_) {
    this.alter_ = alter_;
    setAlter_IsSet(true);
    return this;
  }

  public void unsetAlter_() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ALTER__ISSET_ID);
  }

  /** Returns true if field alter_ is set (has been assigned a value) and false otherwise */
  public boolean isSetAlter_() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ALTER__ISSET_ID);
  }

  public void setAlter_IsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ALTER__ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CREATE_:
      if (value == null) {
        unsetCreate_();
      } else {
        setCreate_((java.lang.Boolean)value);
      }
      break;

    case DROP_:
      if (value == null) {
        unsetDrop_();
      } else {
        setDrop_((java.lang.Boolean)value);
      }
      break;

    case ALTER_:
      if (value == null) {
        unsetAlter_();
      } else {
        setAlter_((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CREATE_:
      return isCreate_();

    case DROP_:
      return isDrop_();

    case ALTER_:
      return isAlter_();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CREATE_:
      return isSetCreate_();
    case DROP_:
      return isSetDrop_();
    case ALTER_:
      return isSetAlter_();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TServerPermissions)
      return this.equals((TServerPermissions)that);
    return false;
  }

  public boolean equals(TServerPermissions that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_create_ = true;
    boolean that_present_create_ = true;
    if (this_present_create_ || that_present_create_) {
      if (!(this_present_create_ && that_present_create_))
        return false;
      if (this.create_ != that.create_)
        return false;
    }

    boolean this_present_drop_ = true;
    boolean that_present_drop_ = true;
    if (this_present_drop_ || that_present_drop_) {
      if (!(this_present_drop_ && that_present_drop_))
        return false;
      if (this.drop_ != that.drop_)
        return false;
    }

    boolean this_present_alter_ = true;
    boolean that_present_alter_ = true;
    if (this_present_alter_ || that_present_alter_) {
      if (!(this_present_alter_ && that_present_alter_))
        return false;
      if (this.alter_ != that.alter_)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((create_) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((drop_) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((alter_) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(TServerPermissions other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetCreate_()).compareTo(other.isSetCreate_());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreate_()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.create_, other.create_);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDrop_()).compareTo(other.isSetDrop_());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDrop_()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.drop_, other.drop_);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAlter_()).compareTo(other.isSetAlter_());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAlter_()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.alter_, other.alter_);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TServerPermissions(");
    boolean first = true;

    sb.append("create_:");
    sb.append(this.create_);
    first = false;
    if (!first) sb.append(", ");
    sb.append("drop_:");
    sb.append(this.drop_);
    first = false;
    if (!first) sb.append(", ");
    sb.append("alter_:");
    sb.append(this.alter_);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TServerPermissionsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TServerPermissionsStandardScheme getScheme() {
      return new TServerPermissionsStandardScheme();
    }
  }

  private static class TServerPermissionsStandardScheme extends org.apache.thrift.scheme.StandardScheme<TServerPermissions> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TServerPermissions struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CREATE_
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.create_ = iprot.readBool();
              struct.setCreate_IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DROP_
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.drop_ = iprot.readBool();
              struct.setDrop_IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ALTER_
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.alter_ = iprot.readBool();
              struct.setAlter_IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TServerPermissions struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CREATE__FIELD_DESC);
      oprot.writeBool(struct.create_);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DROP__FIELD_DESC);
      oprot.writeBool(struct.drop_);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ALTER__FIELD_DESC);
      oprot.writeBool(struct.alter_);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TServerPermissionsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TServerPermissionsTupleScheme getScheme() {
      return new TServerPermissionsTupleScheme();
    }
  }

  private static class TServerPermissionsTupleScheme extends org.apache.thrift.scheme.TupleScheme<TServerPermissions> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TServerPermissions struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCreate_()) {
        optionals.set(0);
      }
      if (struct.isSetDrop_()) {
        optionals.set(1);
      }
      if (struct.isSetAlter_()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetCreate_()) {
        oprot.writeBool(struct.create_);
      }
      if (struct.isSetDrop_()) {
        oprot.writeBool(struct.drop_);
      }
      if (struct.isSetAlter_()) {
        oprot.writeBool(struct.alter_);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TServerPermissions struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.create_ = iprot.readBool();
        struct.setCreate_IsSet(true);
      }
      if (incoming.get(1)) {
        struct.drop_ = iprot.readBool();
        struct.setDrop_IsSet(true);
      }
      if (incoming.get(2)) {
        struct.alter_ = iprot.readBool();
        struct.setAlter_IsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

