/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.dksou.fitting.ml.service;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * eg:
 * 1: DRIVER_MEMORY  driver 使用的内存，不可超过单机的内存总数 0g表示使用默认值 。
 * 2: NUM_EXECUTORS	创建多少个 executor , 0表示使用默认值。
 * 3: EXECUTOR_MEMORY 	各个 executor 使用的最大内存，不可超过单机的最大可使用内存，0g表示使用默认值。
 * 4: EXECUTOR_CORES 	各个 executor 使用的并发线程数目，也即每个 executor 最大可并发执行的 Task 数目，0表示使用默认值。
 * 5: QUEUE 在on yarn模式中指定使用队列的名称，default表示使用默认队列;
 * 6: PRINCIPAL 指定主体名称，default表示不使用主体;
 * 7: KEYTAB 使用keytab文件的地址，default表示不使用;
 * eg:
 *     1: DRIVER_MEMORY = "1g";
 *     2: NUM_EXECUTORS = "2";
 *     3: EXECUTOR_MEMORY = "2g";
 *     4: EXECUTOR_CORES = "2";
 *     5: QUEUE = "default";
 *     6: PRINCIPAL = "default";
 *     7: KEYTAB = "default";
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-06-20")
public class DKMLConf implements org.apache.thrift.TBase<DKMLConf, DKMLConf._Fields>, java.io.Serializable, Cloneable, Comparable<DKMLConf> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DKMLConf");

  private static final org.apache.thrift.protocol.TField DRIVER__MEMORY_FIELD_DESC = new org.apache.thrift.protocol.TField("DRIVER_MEMORY", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NUM__EXECUTORS_FIELD_DESC = new org.apache.thrift.protocol.TField("NUM_EXECUTORS", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField EXECUTOR__MEMORY_FIELD_DESC = new org.apache.thrift.protocol.TField("EXECUTOR_MEMORY", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField EXECUTOR__CORES_FIELD_DESC = new org.apache.thrift.protocol.TField("EXECUTOR_CORES", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField QUEUE_FIELD_DESC = new org.apache.thrift.protocol.TField("QUEUE", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField PRINCIPAL_FIELD_DESC = new org.apache.thrift.protocol.TField("PRINCIPAL", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField KEYTAB_FIELD_DESC = new org.apache.thrift.protocol.TField("KEYTAB", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DKMLConfStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DKMLConfTupleSchemeFactory();

  public java.lang.String DRIVER_MEMORY; // optional
  public java.lang.String NUM_EXECUTORS; // optional
  public java.lang.String EXECUTOR_MEMORY; // optional
  public java.lang.String EXECUTOR_CORES; // optional
  public java.lang.String QUEUE; // optional
  public java.lang.String PRINCIPAL; // optional
  public java.lang.String KEYTAB; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DRIVER__MEMORY((short)1, "DRIVER_MEMORY"),
    NUM__EXECUTORS((short)2, "NUM_EXECUTORS"),
    EXECUTOR__MEMORY((short)3, "EXECUTOR_MEMORY"),
    EXECUTOR__CORES((short)4, "EXECUTOR_CORES"),
    QUEUE((short)5, "QUEUE"),
    PRINCIPAL((short)6, "PRINCIPAL"),
    KEYTAB((short)7, "KEYTAB");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // DRIVER__MEMORY
          return DRIVER__MEMORY;
        case 2: // NUM__EXECUTORS
          return NUM__EXECUTORS;
        case 3: // EXECUTOR__MEMORY
          return EXECUTOR__MEMORY;
        case 4: // EXECUTOR__CORES
          return EXECUTOR__CORES;
        case 5: // QUEUE
          return QUEUE;
        case 6: // PRINCIPAL
          return PRINCIPAL;
        case 7: // KEYTAB
          return KEYTAB;
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
  private static final _Fields optionals[] = {_Fields.DRIVER__MEMORY,_Fields.NUM__EXECUTORS,_Fields.EXECUTOR__MEMORY,_Fields.EXECUTOR__CORES,_Fields.QUEUE,_Fields.PRINCIPAL,_Fields.KEYTAB};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DRIVER__MEMORY, new org.apache.thrift.meta_data.FieldMetaData("DRIVER_MEMORY", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NUM__EXECUTORS, new org.apache.thrift.meta_data.FieldMetaData("NUM_EXECUTORS", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXECUTOR__MEMORY, new org.apache.thrift.meta_data.FieldMetaData("EXECUTOR_MEMORY", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXECUTOR__CORES, new org.apache.thrift.meta_data.FieldMetaData("EXECUTOR_CORES", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.QUEUE, new org.apache.thrift.meta_data.FieldMetaData("QUEUE", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PRINCIPAL, new org.apache.thrift.meta_data.FieldMetaData("PRINCIPAL", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.KEYTAB, new org.apache.thrift.meta_data.FieldMetaData("KEYTAB", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DKMLConf.class, metaDataMap);
  }

  public DKMLConf() {
    this.DRIVER_MEMORY = "0g";

    this.NUM_EXECUTORS = "0";

    this.EXECUTOR_MEMORY = "0g";

    this.EXECUTOR_CORES = "0";

    this.QUEUE = "default";

    this.PRINCIPAL = "default";

    this.KEYTAB = "default";

  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DKMLConf(DKMLConf other) {
    if (other.isSetDRIVER_MEMORY()) {
      this.DRIVER_MEMORY = other.DRIVER_MEMORY;
    }
    if (other.isSetNUM_EXECUTORS()) {
      this.NUM_EXECUTORS = other.NUM_EXECUTORS;
    }
    if (other.isSetEXECUTOR_MEMORY()) {
      this.EXECUTOR_MEMORY = other.EXECUTOR_MEMORY;
    }
    if (other.isSetEXECUTOR_CORES()) {
      this.EXECUTOR_CORES = other.EXECUTOR_CORES;
    }
    if (other.isSetQUEUE()) {
      this.QUEUE = other.QUEUE;
    }
    if (other.isSetPRINCIPAL()) {
      this.PRINCIPAL = other.PRINCIPAL;
    }
    if (other.isSetKEYTAB()) {
      this.KEYTAB = other.KEYTAB;
    }
  }

  public DKMLConf deepCopy() {
    return new DKMLConf(this);
  }

  @Override
  public void clear() {
    this.DRIVER_MEMORY = "0g";

    this.NUM_EXECUTORS = "0";

    this.EXECUTOR_MEMORY = "0g";

    this.EXECUTOR_CORES = "0";

    this.QUEUE = "default";

    this.PRINCIPAL = "default";

    this.KEYTAB = "default";

  }

  public java.lang.String getDRIVER_MEMORY() {
    return this.DRIVER_MEMORY;
  }

  public DKMLConf setDRIVER_MEMORY(java.lang.String DRIVER_MEMORY) {
    this.DRIVER_MEMORY = DRIVER_MEMORY;
    return this;
  }

  public void unsetDRIVER_MEMORY() {
    this.DRIVER_MEMORY = null;
  }

  /** Returns true if field DRIVER_MEMORY is set (has been assigned a value) and false otherwise */
  public boolean isSetDRIVER_MEMORY() {
    return this.DRIVER_MEMORY != null;
  }

  public void setDRIVER_MEMORYIsSet(boolean value) {
    if (!value) {
      this.DRIVER_MEMORY = null;
    }
  }

  public java.lang.String getNUM_EXECUTORS() {
    return this.NUM_EXECUTORS;
  }

  public DKMLConf setNUM_EXECUTORS(java.lang.String NUM_EXECUTORS) {
    this.NUM_EXECUTORS = NUM_EXECUTORS;
    return this;
  }

  public void unsetNUM_EXECUTORS() {
    this.NUM_EXECUTORS = null;
  }

  /** Returns true if field NUM_EXECUTORS is set (has been assigned a value) and false otherwise */
  public boolean isSetNUM_EXECUTORS() {
    return this.NUM_EXECUTORS != null;
  }

  public void setNUM_EXECUTORSIsSet(boolean value) {
    if (!value) {
      this.NUM_EXECUTORS = null;
    }
  }

  public java.lang.String getEXECUTOR_MEMORY() {
    return this.EXECUTOR_MEMORY;
  }

  public DKMLConf setEXECUTOR_MEMORY(java.lang.String EXECUTOR_MEMORY) {
    this.EXECUTOR_MEMORY = EXECUTOR_MEMORY;
    return this;
  }

  public void unsetEXECUTOR_MEMORY() {
    this.EXECUTOR_MEMORY = null;
  }

  /** Returns true if field EXECUTOR_MEMORY is set (has been assigned a value) and false otherwise */
  public boolean isSetEXECUTOR_MEMORY() {
    return this.EXECUTOR_MEMORY != null;
  }

  public void setEXECUTOR_MEMORYIsSet(boolean value) {
    if (!value) {
      this.EXECUTOR_MEMORY = null;
    }
  }

  public java.lang.String getEXECUTOR_CORES() {
    return this.EXECUTOR_CORES;
  }

  public DKMLConf setEXECUTOR_CORES(java.lang.String EXECUTOR_CORES) {
    this.EXECUTOR_CORES = EXECUTOR_CORES;
    return this;
  }

  public void unsetEXECUTOR_CORES() {
    this.EXECUTOR_CORES = null;
  }

  /** Returns true if field EXECUTOR_CORES is set (has been assigned a value) and false otherwise */
  public boolean isSetEXECUTOR_CORES() {
    return this.EXECUTOR_CORES != null;
  }

  public void setEXECUTOR_CORESIsSet(boolean value) {
    if (!value) {
      this.EXECUTOR_CORES = null;
    }
  }

  public java.lang.String getQUEUE() {
    return this.QUEUE;
  }

  public DKMLConf setQUEUE(java.lang.String QUEUE) {
    this.QUEUE = QUEUE;
    return this;
  }

  public void unsetQUEUE() {
    this.QUEUE = null;
  }

  /** Returns true if field QUEUE is set (has been assigned a value) and false otherwise */
  public boolean isSetQUEUE() {
    return this.QUEUE != null;
  }

  public void setQUEUEIsSet(boolean value) {
    if (!value) {
      this.QUEUE = null;
    }
  }

  public java.lang.String getPRINCIPAL() {
    return this.PRINCIPAL;
  }

  public DKMLConf setPRINCIPAL(java.lang.String PRINCIPAL) {
    this.PRINCIPAL = PRINCIPAL;
    return this;
  }

  public void unsetPRINCIPAL() {
    this.PRINCIPAL = null;
  }

  /** Returns true if field PRINCIPAL is set (has been assigned a value) and false otherwise */
  public boolean isSetPRINCIPAL() {
    return this.PRINCIPAL != null;
  }

  public void setPRINCIPALIsSet(boolean value) {
    if (!value) {
      this.PRINCIPAL = null;
    }
  }

  public java.lang.String getKEYTAB() {
    return this.KEYTAB;
  }

  public DKMLConf setKEYTAB(java.lang.String KEYTAB) {
    this.KEYTAB = KEYTAB;
    return this;
  }

  public void unsetKEYTAB() {
    this.KEYTAB = null;
  }

  /** Returns true if field KEYTAB is set (has been assigned a value) and false otherwise */
  public boolean isSetKEYTAB() {
    return this.KEYTAB != null;
  }

  public void setKEYTABIsSet(boolean value) {
    if (!value) {
      this.KEYTAB = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case DRIVER__MEMORY:
      if (value == null) {
        unsetDRIVER_MEMORY();
      } else {
        setDRIVER_MEMORY((java.lang.String)value);
      }
      break;

    case NUM__EXECUTORS:
      if (value == null) {
        unsetNUM_EXECUTORS();
      } else {
        setNUM_EXECUTORS((java.lang.String)value);
      }
      break;

    case EXECUTOR__MEMORY:
      if (value == null) {
        unsetEXECUTOR_MEMORY();
      } else {
        setEXECUTOR_MEMORY((java.lang.String)value);
      }
      break;

    case EXECUTOR__CORES:
      if (value == null) {
        unsetEXECUTOR_CORES();
      } else {
        setEXECUTOR_CORES((java.lang.String)value);
      }
      break;

    case QUEUE:
      if (value == null) {
        unsetQUEUE();
      } else {
        setQUEUE((java.lang.String)value);
      }
      break;

    case PRINCIPAL:
      if (value == null) {
        unsetPRINCIPAL();
      } else {
        setPRINCIPAL((java.lang.String)value);
      }
      break;

    case KEYTAB:
      if (value == null) {
        unsetKEYTAB();
      } else {
        setKEYTAB((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case DRIVER__MEMORY:
      return getDRIVER_MEMORY();

    case NUM__EXECUTORS:
      return getNUM_EXECUTORS();

    case EXECUTOR__MEMORY:
      return getEXECUTOR_MEMORY();

    case EXECUTOR__CORES:
      return getEXECUTOR_CORES();

    case QUEUE:
      return getQUEUE();

    case PRINCIPAL:
      return getPRINCIPAL();

    case KEYTAB:
      return getKEYTAB();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case DRIVER__MEMORY:
      return isSetDRIVER_MEMORY();
    case NUM__EXECUTORS:
      return isSetNUM_EXECUTORS();
    case EXECUTOR__MEMORY:
      return isSetEXECUTOR_MEMORY();
    case EXECUTOR__CORES:
      return isSetEXECUTOR_CORES();
    case QUEUE:
      return isSetQUEUE();
    case PRINCIPAL:
      return isSetPRINCIPAL();
    case KEYTAB:
      return isSetKEYTAB();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof DKMLConf)
      return this.equals((DKMLConf)that);
    return false;
  }

  public boolean equals(DKMLConf that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_DRIVER_MEMORY = true && this.isSetDRIVER_MEMORY();
    boolean that_present_DRIVER_MEMORY = true && that.isSetDRIVER_MEMORY();
    if (this_present_DRIVER_MEMORY || that_present_DRIVER_MEMORY) {
      if (!(this_present_DRIVER_MEMORY && that_present_DRIVER_MEMORY))
        return false;
      if (!this.DRIVER_MEMORY.equals(that.DRIVER_MEMORY))
        return false;
    }

    boolean this_present_NUM_EXECUTORS = true && this.isSetNUM_EXECUTORS();
    boolean that_present_NUM_EXECUTORS = true && that.isSetNUM_EXECUTORS();
    if (this_present_NUM_EXECUTORS || that_present_NUM_EXECUTORS) {
      if (!(this_present_NUM_EXECUTORS && that_present_NUM_EXECUTORS))
        return false;
      if (!this.NUM_EXECUTORS.equals(that.NUM_EXECUTORS))
        return false;
    }

    boolean this_present_EXECUTOR_MEMORY = true && this.isSetEXECUTOR_MEMORY();
    boolean that_present_EXECUTOR_MEMORY = true && that.isSetEXECUTOR_MEMORY();
    if (this_present_EXECUTOR_MEMORY || that_present_EXECUTOR_MEMORY) {
      if (!(this_present_EXECUTOR_MEMORY && that_present_EXECUTOR_MEMORY))
        return false;
      if (!this.EXECUTOR_MEMORY.equals(that.EXECUTOR_MEMORY))
        return false;
    }

    boolean this_present_EXECUTOR_CORES = true && this.isSetEXECUTOR_CORES();
    boolean that_present_EXECUTOR_CORES = true && that.isSetEXECUTOR_CORES();
    if (this_present_EXECUTOR_CORES || that_present_EXECUTOR_CORES) {
      if (!(this_present_EXECUTOR_CORES && that_present_EXECUTOR_CORES))
        return false;
      if (!this.EXECUTOR_CORES.equals(that.EXECUTOR_CORES))
        return false;
    }

    boolean this_present_QUEUE = true && this.isSetQUEUE();
    boolean that_present_QUEUE = true && that.isSetQUEUE();
    if (this_present_QUEUE || that_present_QUEUE) {
      if (!(this_present_QUEUE && that_present_QUEUE))
        return false;
      if (!this.QUEUE.equals(that.QUEUE))
        return false;
    }

    boolean this_present_PRINCIPAL = true && this.isSetPRINCIPAL();
    boolean that_present_PRINCIPAL = true && that.isSetPRINCIPAL();
    if (this_present_PRINCIPAL || that_present_PRINCIPAL) {
      if (!(this_present_PRINCIPAL && that_present_PRINCIPAL))
        return false;
      if (!this.PRINCIPAL.equals(that.PRINCIPAL))
        return false;
    }

    boolean this_present_KEYTAB = true && this.isSetKEYTAB();
    boolean that_present_KEYTAB = true && that.isSetKEYTAB();
    if (this_present_KEYTAB || that_present_KEYTAB) {
      if (!(this_present_KEYTAB && that_present_KEYTAB))
        return false;
      if (!this.KEYTAB.equals(that.KEYTAB))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetDRIVER_MEMORY()) ? 131071 : 524287);
    if (isSetDRIVER_MEMORY())
      hashCode = hashCode * 8191 + DRIVER_MEMORY.hashCode();

    hashCode = hashCode * 8191 + ((isSetNUM_EXECUTORS()) ? 131071 : 524287);
    if (isSetNUM_EXECUTORS())
      hashCode = hashCode * 8191 + NUM_EXECUTORS.hashCode();

    hashCode = hashCode * 8191 + ((isSetEXECUTOR_MEMORY()) ? 131071 : 524287);
    if (isSetEXECUTOR_MEMORY())
      hashCode = hashCode * 8191 + EXECUTOR_MEMORY.hashCode();

    hashCode = hashCode * 8191 + ((isSetEXECUTOR_CORES()) ? 131071 : 524287);
    if (isSetEXECUTOR_CORES())
      hashCode = hashCode * 8191 + EXECUTOR_CORES.hashCode();

    hashCode = hashCode * 8191 + ((isSetQUEUE()) ? 131071 : 524287);
    if (isSetQUEUE())
      hashCode = hashCode * 8191 + QUEUE.hashCode();

    hashCode = hashCode * 8191 + ((isSetPRINCIPAL()) ? 131071 : 524287);
    if (isSetPRINCIPAL())
      hashCode = hashCode * 8191 + PRINCIPAL.hashCode();

    hashCode = hashCode * 8191 + ((isSetKEYTAB()) ? 131071 : 524287);
    if (isSetKEYTAB())
      hashCode = hashCode * 8191 + KEYTAB.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(DKMLConf other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetDRIVER_MEMORY()).compareTo(other.isSetDRIVER_MEMORY());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDRIVER_MEMORY()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.DRIVER_MEMORY, other.DRIVER_MEMORY);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetNUM_EXECUTORS()).compareTo(other.isSetNUM_EXECUTORS());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNUM_EXECUTORS()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.NUM_EXECUTORS, other.NUM_EXECUTORS);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetEXECUTOR_MEMORY()).compareTo(other.isSetEXECUTOR_MEMORY());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEXECUTOR_MEMORY()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.EXECUTOR_MEMORY, other.EXECUTOR_MEMORY);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetEXECUTOR_CORES()).compareTo(other.isSetEXECUTOR_CORES());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEXECUTOR_CORES()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.EXECUTOR_CORES, other.EXECUTOR_CORES);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetQUEUE()).compareTo(other.isSetQUEUE());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQUEUE()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.QUEUE, other.QUEUE);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPRINCIPAL()).compareTo(other.isSetPRINCIPAL());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPRINCIPAL()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.PRINCIPAL, other.PRINCIPAL);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetKEYTAB()).compareTo(other.isSetKEYTAB());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKEYTAB()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.KEYTAB, other.KEYTAB);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("DKMLConf(");
    boolean first = true;

    if (isSetDRIVER_MEMORY()) {
      sb.append("DRIVER_MEMORY:");
      if (this.DRIVER_MEMORY == null) {
        sb.append("null");
      } else {
        sb.append(this.DRIVER_MEMORY);
      }
      first = false;
    }
    if (isSetNUM_EXECUTORS()) {
      if (!first) sb.append(", ");
      sb.append("NUM_EXECUTORS:");
      if (this.NUM_EXECUTORS == null) {
        sb.append("null");
      } else {
        sb.append(this.NUM_EXECUTORS);
      }
      first = false;
    }
    if (isSetEXECUTOR_MEMORY()) {
      if (!first) sb.append(", ");
      sb.append("EXECUTOR_MEMORY:");
      if (this.EXECUTOR_MEMORY == null) {
        sb.append("null");
      } else {
        sb.append(this.EXECUTOR_MEMORY);
      }
      first = false;
    }
    if (isSetEXECUTOR_CORES()) {
      if (!first) sb.append(", ");
      sb.append("EXECUTOR_CORES:");
      if (this.EXECUTOR_CORES == null) {
        sb.append("null");
      } else {
        sb.append(this.EXECUTOR_CORES);
      }
      first = false;
    }
    if (isSetQUEUE()) {
      if (!first) sb.append(", ");
      sb.append("QUEUE:");
      if (this.QUEUE == null) {
        sb.append("null");
      } else {
        sb.append(this.QUEUE);
      }
      first = false;
    }
    if (isSetPRINCIPAL()) {
      if (!first) sb.append(", ");
      sb.append("PRINCIPAL:");
      if (this.PRINCIPAL == null) {
        sb.append("null");
      } else {
        sb.append(this.PRINCIPAL);
      }
      first = false;
    }
    if (isSetKEYTAB()) {
      if (!first) sb.append(", ");
      sb.append("KEYTAB:");
      if (this.KEYTAB == null) {
        sb.append("null");
      } else {
        sb.append(this.KEYTAB);
      }
      first = false;
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DKMLConfStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DKMLConfStandardScheme getScheme() {
      return new DKMLConfStandardScheme();
    }
  }

  private static class DKMLConfStandardScheme extends org.apache.thrift.scheme.StandardScheme<DKMLConf> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DKMLConf struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DRIVER__MEMORY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.DRIVER_MEMORY = iprot.readString();
              struct.setDRIVER_MEMORYIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NUM__EXECUTORS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.NUM_EXECUTORS = iprot.readString();
              struct.setNUM_EXECUTORSIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXECUTOR__MEMORY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.EXECUTOR_MEMORY = iprot.readString();
              struct.setEXECUTOR_MEMORYIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // EXECUTOR__CORES
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.EXECUTOR_CORES = iprot.readString();
              struct.setEXECUTOR_CORESIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // QUEUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.QUEUE = iprot.readString();
              struct.setQUEUEIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // PRINCIPAL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.PRINCIPAL = iprot.readString();
              struct.setPRINCIPALIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // KEYTAB
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.KEYTAB = iprot.readString();
              struct.setKEYTABIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DKMLConf struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.DRIVER_MEMORY != null) {
        if (struct.isSetDRIVER_MEMORY()) {
          oprot.writeFieldBegin(DRIVER__MEMORY_FIELD_DESC);
          oprot.writeString(struct.DRIVER_MEMORY);
          oprot.writeFieldEnd();
        }
      }
      if (struct.NUM_EXECUTORS != null) {
        if (struct.isSetNUM_EXECUTORS()) {
          oprot.writeFieldBegin(NUM__EXECUTORS_FIELD_DESC);
          oprot.writeString(struct.NUM_EXECUTORS);
          oprot.writeFieldEnd();
        }
      }
      if (struct.EXECUTOR_MEMORY != null) {
        if (struct.isSetEXECUTOR_MEMORY()) {
          oprot.writeFieldBegin(EXECUTOR__MEMORY_FIELD_DESC);
          oprot.writeString(struct.EXECUTOR_MEMORY);
          oprot.writeFieldEnd();
        }
      }
      if (struct.EXECUTOR_CORES != null) {
        if (struct.isSetEXECUTOR_CORES()) {
          oprot.writeFieldBegin(EXECUTOR__CORES_FIELD_DESC);
          oprot.writeString(struct.EXECUTOR_CORES);
          oprot.writeFieldEnd();
        }
      }
      if (struct.QUEUE != null) {
        if (struct.isSetQUEUE()) {
          oprot.writeFieldBegin(QUEUE_FIELD_DESC);
          oprot.writeString(struct.QUEUE);
          oprot.writeFieldEnd();
        }
      }
      if (struct.PRINCIPAL != null) {
        if (struct.isSetPRINCIPAL()) {
          oprot.writeFieldBegin(PRINCIPAL_FIELD_DESC);
          oprot.writeString(struct.PRINCIPAL);
          oprot.writeFieldEnd();
        }
      }
      if (struct.KEYTAB != null) {
        if (struct.isSetKEYTAB()) {
          oprot.writeFieldBegin(KEYTAB_FIELD_DESC);
          oprot.writeString(struct.KEYTAB);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DKMLConfTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DKMLConfTupleScheme getScheme() {
      return new DKMLConfTupleScheme();
    }
  }

  private static class DKMLConfTupleScheme extends org.apache.thrift.scheme.TupleScheme<DKMLConf> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DKMLConf struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetDRIVER_MEMORY()) {
        optionals.set(0);
      }
      if (struct.isSetNUM_EXECUTORS()) {
        optionals.set(1);
      }
      if (struct.isSetEXECUTOR_MEMORY()) {
        optionals.set(2);
      }
      if (struct.isSetEXECUTOR_CORES()) {
        optionals.set(3);
      }
      if (struct.isSetQUEUE()) {
        optionals.set(4);
      }
      if (struct.isSetPRINCIPAL()) {
        optionals.set(5);
      }
      if (struct.isSetKEYTAB()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetDRIVER_MEMORY()) {
        oprot.writeString(struct.DRIVER_MEMORY);
      }
      if (struct.isSetNUM_EXECUTORS()) {
        oprot.writeString(struct.NUM_EXECUTORS);
      }
      if (struct.isSetEXECUTOR_MEMORY()) {
        oprot.writeString(struct.EXECUTOR_MEMORY);
      }
      if (struct.isSetEXECUTOR_CORES()) {
        oprot.writeString(struct.EXECUTOR_CORES);
      }
      if (struct.isSetQUEUE()) {
        oprot.writeString(struct.QUEUE);
      }
      if (struct.isSetPRINCIPAL()) {
        oprot.writeString(struct.PRINCIPAL);
      }
      if (struct.isSetKEYTAB()) {
        oprot.writeString(struct.KEYTAB);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DKMLConf struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.DRIVER_MEMORY = iprot.readString();
        struct.setDRIVER_MEMORYIsSet(true);
      }
      if (incoming.get(1)) {
        struct.NUM_EXECUTORS = iprot.readString();
        struct.setNUM_EXECUTORSIsSet(true);
      }
      if (incoming.get(2)) {
        struct.EXECUTOR_MEMORY = iprot.readString();
        struct.setEXECUTOR_MEMORYIsSet(true);
      }
      if (incoming.get(3)) {
        struct.EXECUTOR_CORES = iprot.readString();
        struct.setEXECUTOR_CORESIsSet(true);
      }
      if (incoming.get(4)) {
        struct.QUEUE = iprot.readString();
        struct.setQUEUEIsSet(true);
      }
      if (incoming.get(5)) {
        struct.PRINCIPAL = iprot.readString();
        struct.setPRINCIPALIsSet(true);
      }
      if (incoming.get(6)) {
        struct.KEYTAB = iprot.readString();
        struct.setKEYTABIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

