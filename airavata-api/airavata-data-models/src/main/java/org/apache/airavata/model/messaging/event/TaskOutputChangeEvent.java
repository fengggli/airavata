/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.messaging.event;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)")
public class TaskOutputChangeEvent implements org.apache.thrift.TBase<TaskOutputChangeEvent, TaskOutputChangeEvent._Fields>, java.io.Serializable, Cloneable, Comparable<TaskOutputChangeEvent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TaskOutputChangeEvent");

  private static final org.apache.thrift.protocol.TField OUTPUT_FIELD_DESC = new org.apache.thrift.protocol.TField("output", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField TASK_IDENTITY_FIELD_DESC = new org.apache.thrift.protocol.TField("taskIdentity", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TaskOutputChangeEventStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TaskOutputChangeEventTupleSchemeFactory();

  private java.util.List<org.apache.airavata.model.application.io.OutputDataObjectType> output; // required
  private TaskIdentifier taskIdentity; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OUTPUT((short)1, "output"),
    TASK_IDENTITY((short)2, "taskIdentity");

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
        case 1: // OUTPUT
          return OUTPUT;
        case 2: // TASK_IDENTITY
          return TASK_IDENTITY;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OUTPUT, new org.apache.thrift.meta_data.FieldMetaData("output", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.airavata.model.application.io.OutputDataObjectType.class))));
    tmpMap.put(_Fields.TASK_IDENTITY, new org.apache.thrift.meta_data.FieldMetaData("taskIdentity", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TaskIdentifier.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TaskOutputChangeEvent.class, metaDataMap);
  }

  public TaskOutputChangeEvent() {
  }

  public TaskOutputChangeEvent(
    java.util.List<org.apache.airavata.model.application.io.OutputDataObjectType> output,
    TaskIdentifier taskIdentity)
  {
    this();
    this.output = output;
    this.taskIdentity = taskIdentity;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TaskOutputChangeEvent(TaskOutputChangeEvent other) {
    if (other.isSetOutput()) {
      java.util.List<org.apache.airavata.model.application.io.OutputDataObjectType> __this__output = new java.util.ArrayList<org.apache.airavata.model.application.io.OutputDataObjectType>(other.output.size());
      for (org.apache.airavata.model.application.io.OutputDataObjectType other_element : other.output) {
        __this__output.add(new org.apache.airavata.model.application.io.OutputDataObjectType(other_element));
      }
      this.output = __this__output;
    }
    if (other.isSetTaskIdentity()) {
      this.taskIdentity = new TaskIdentifier(other.taskIdentity);
    }
  }

  public TaskOutputChangeEvent deepCopy() {
    return new TaskOutputChangeEvent(this);
  }

  @Override
  public void clear() {
    this.output = null;
    this.taskIdentity = null;
  }

  public int getOutputSize() {
    return (this.output == null) ? 0 : this.output.size();
  }

  public java.util.Iterator<org.apache.airavata.model.application.io.OutputDataObjectType> getOutputIterator() {
    return (this.output == null) ? null : this.output.iterator();
  }

  public void addToOutput(org.apache.airavata.model.application.io.OutputDataObjectType elem) {
    if (this.output == null) {
      this.output = new java.util.ArrayList<org.apache.airavata.model.application.io.OutputDataObjectType>();
    }
    this.output.add(elem);
  }

  public java.util.List<org.apache.airavata.model.application.io.OutputDataObjectType> getOutput() {
    return this.output;
  }

  public void setOutput(java.util.List<org.apache.airavata.model.application.io.OutputDataObjectType> output) {
    this.output = output;
  }

  public void unsetOutput() {
    this.output = null;
  }

  /** Returns true if field output is set (has been assigned a value) and false otherwise */
  public boolean isSetOutput() {
    return this.output != null;
  }

  public void setOutputIsSet(boolean value) {
    if (!value) {
      this.output = null;
    }
  }

  public TaskIdentifier getTaskIdentity() {
    return this.taskIdentity;
  }

  public void setTaskIdentity(TaskIdentifier taskIdentity) {
    this.taskIdentity = taskIdentity;
  }

  public void unsetTaskIdentity() {
    this.taskIdentity = null;
  }

  /** Returns true if field taskIdentity is set (has been assigned a value) and false otherwise */
  public boolean isSetTaskIdentity() {
    return this.taskIdentity != null;
  }

  public void setTaskIdentityIsSet(boolean value) {
    if (!value) {
      this.taskIdentity = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case OUTPUT:
      if (value == null) {
        unsetOutput();
      } else {
        setOutput((java.util.List<org.apache.airavata.model.application.io.OutputDataObjectType>)value);
      }
      break;

    case TASK_IDENTITY:
      if (value == null) {
        unsetTaskIdentity();
      } else {
        setTaskIdentity((TaskIdentifier)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case OUTPUT:
      return getOutput();

    case TASK_IDENTITY:
      return getTaskIdentity();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case OUTPUT:
      return isSetOutput();
    case TASK_IDENTITY:
      return isSetTaskIdentity();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TaskOutputChangeEvent)
      return this.equals((TaskOutputChangeEvent)that);
    return false;
  }

  public boolean equals(TaskOutputChangeEvent that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_output = true && this.isSetOutput();
    boolean that_present_output = true && that.isSetOutput();
    if (this_present_output || that_present_output) {
      if (!(this_present_output && that_present_output))
        return false;
      if (!this.output.equals(that.output))
        return false;
    }

    boolean this_present_taskIdentity = true && this.isSetTaskIdentity();
    boolean that_present_taskIdentity = true && that.isSetTaskIdentity();
    if (this_present_taskIdentity || that_present_taskIdentity) {
      if (!(this_present_taskIdentity && that_present_taskIdentity))
        return false;
      if (!this.taskIdentity.equals(that.taskIdentity))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetOutput()) ? 131071 : 524287);
    if (isSetOutput())
      hashCode = hashCode * 8191 + output.hashCode();

    hashCode = hashCode * 8191 + ((isSetTaskIdentity()) ? 131071 : 524287);
    if (isSetTaskIdentity())
      hashCode = hashCode * 8191 + taskIdentity.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TaskOutputChangeEvent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetOutput()).compareTo(other.isSetOutput());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOutput()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.output, other.output);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTaskIdentity()).compareTo(other.isSetTaskIdentity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTaskIdentity()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.taskIdentity, other.taskIdentity);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TaskOutputChangeEvent(");
    boolean first = true;

    sb.append("output:");
    if (this.output == null) {
      sb.append("null");
    } else {
      sb.append(this.output);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("taskIdentity:");
    if (this.taskIdentity == null) {
      sb.append("null");
    } else {
      sb.append(this.taskIdentity);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetOutput()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'output' is unset! Struct:" + toString());
    }

    if (!isSetTaskIdentity()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'taskIdentity' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (taskIdentity != null) {
      taskIdentity.validate();
    }
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

  private static class TaskOutputChangeEventStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TaskOutputChangeEventStandardScheme getScheme() {
      return new TaskOutputChangeEventStandardScheme();
    }
  }

  private static class TaskOutputChangeEventStandardScheme extends org.apache.thrift.scheme.StandardScheme<TaskOutputChangeEvent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TaskOutputChangeEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OUTPUT
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.output = new java.util.ArrayList<org.apache.airavata.model.application.io.OutputDataObjectType>(_list0.size);
                org.apache.airavata.model.application.io.OutputDataObjectType _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new org.apache.airavata.model.application.io.OutputDataObjectType();
                  _elem1.read(iprot);
                  struct.output.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setOutputIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TASK_IDENTITY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.taskIdentity = new TaskIdentifier();
              struct.taskIdentity.read(iprot);
              struct.setTaskIdentityIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TaskOutputChangeEvent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.output != null) {
        oprot.writeFieldBegin(OUTPUT_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.output.size()));
          for (org.apache.airavata.model.application.io.OutputDataObjectType _iter3 : struct.output)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.taskIdentity != null) {
        oprot.writeFieldBegin(TASK_IDENTITY_FIELD_DESC);
        struct.taskIdentity.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TaskOutputChangeEventTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TaskOutputChangeEventTupleScheme getScheme() {
      return new TaskOutputChangeEventTupleScheme();
    }
  }

  private static class TaskOutputChangeEventTupleScheme extends org.apache.thrift.scheme.TupleScheme<TaskOutputChangeEvent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TaskOutputChangeEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.output.size());
        for (org.apache.airavata.model.application.io.OutputDataObjectType _iter4 : struct.output)
        {
          _iter4.write(oprot);
        }
      }
      struct.taskIdentity.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TaskOutputChangeEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.output = new java.util.ArrayList<org.apache.airavata.model.application.io.OutputDataObjectType>(_list5.size);
        org.apache.airavata.model.application.io.OutputDataObjectType _elem6;
        for (int _i7 = 0; _i7 < _list5.size; ++_i7)
        {
          _elem6 = new org.apache.airavata.model.application.io.OutputDataObjectType();
          _elem6.read(iprot);
          struct.output.add(_elem6);
        }
      }
      struct.setOutputIsSet(true);
      struct.taskIdentity = new TaskIdentifier();
      struct.taskIdentity.read(iprot);
      struct.setTaskIdentityIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

