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
#ifndef application_io_models_TYPES_H
#define application_io_models_TYPES_H

#include <iosfwd>

#include <thrift/Thrift.h>
#include <thrift/TApplicationException.h>
#include <thrift/TBase.h>
#include <thrift/protocol/TProtocol.h>
#include <thrift/transport/TTransport.h>

#include <thrift/cxxfunctional.h>
#include "compute_resource_model_types.h"


namespace apache { namespace airavata { namespace model { namespace application { namespace io {

struct DataType {
  enum type {
    STRING = 0,
    INTEGER = 1,
    FLOAT = 2,
    URI = 3,
    URI_COLLECTION = 4,
    STDOUT = 5,
    STDERR = 6
  };
};

extern const std::map<int, const char*> _DataType_VALUES_TO_NAMES;

class InputDataObjectType;

class OutputDataObjectType;

typedef struct _InputDataObjectType__isset {
  _InputDataObjectType__isset() : value(false), type(false), applicationArgument(false), standardInput(false), userFriendlyDescription(false), metaData(false), inputOrder(false), isRequired(false), requiredToAddedToCommandLine(false), dataStaged(false), storageResourceId(false), isReadOnly(false) {}
  bool value :1;
  bool type :1;
  bool applicationArgument :1;
  bool standardInput :1;
  bool userFriendlyDescription :1;
  bool metaData :1;
  bool inputOrder :1;
  bool isRequired :1;
  bool requiredToAddedToCommandLine :1;
  bool dataStaged :1;
  bool storageResourceId :1;
  bool isReadOnly :1;
} _InputDataObjectType__isset;

class InputDataObjectType : public virtual ::apache::thrift::TBase {
 public:

  InputDataObjectType(const InputDataObjectType&);
  InputDataObjectType& operator=(const InputDataObjectType&);
  InputDataObjectType() : name(), value(), type((DataType::type)0), applicationArgument(), standardInput(0), userFriendlyDescription(), metaData(), inputOrder(0), isRequired(0), requiredToAddedToCommandLine(0), dataStaged(0), storageResourceId(), isReadOnly(0) {
  }

  virtual ~InputDataObjectType() throw();
  std::string name;
  std::string value;
  DataType::type type;
  std::string applicationArgument;
  bool standardInput;
  std::string userFriendlyDescription;
  std::string metaData;
  int32_t inputOrder;
  bool isRequired;
  bool requiredToAddedToCommandLine;
  bool dataStaged;
  std::string storageResourceId;
  bool isReadOnly;

  _InputDataObjectType__isset __isset;

  void __set_name(const std::string& val);

  void __set_value(const std::string& val);

  void __set_type(const DataType::type val);

  void __set_applicationArgument(const std::string& val);

  void __set_standardInput(const bool val);

  void __set_userFriendlyDescription(const std::string& val);

  void __set_metaData(const std::string& val);

  void __set_inputOrder(const int32_t val);

  void __set_isRequired(const bool val);

  void __set_requiredToAddedToCommandLine(const bool val);

  void __set_dataStaged(const bool val);

  void __set_storageResourceId(const std::string& val);

  void __set_isReadOnly(const bool val);

  bool operator == (const InputDataObjectType & rhs) const
  {
    if (!(name == rhs.name))
      return false;
    if (__isset.value != rhs.__isset.value)
      return false;
    else if (__isset.value && !(value == rhs.value))
      return false;
    if (__isset.type != rhs.__isset.type)
      return false;
    else if (__isset.type && !(type == rhs.type))
      return false;
    if (__isset.applicationArgument != rhs.__isset.applicationArgument)
      return false;
    else if (__isset.applicationArgument && !(applicationArgument == rhs.applicationArgument))
      return false;
    if (__isset.standardInput != rhs.__isset.standardInput)
      return false;
    else if (__isset.standardInput && !(standardInput == rhs.standardInput))
      return false;
    if (__isset.userFriendlyDescription != rhs.__isset.userFriendlyDescription)
      return false;
    else if (__isset.userFriendlyDescription && !(userFriendlyDescription == rhs.userFriendlyDescription))
      return false;
    if (__isset.metaData != rhs.__isset.metaData)
      return false;
    else if (__isset.metaData && !(metaData == rhs.metaData))
      return false;
    if (__isset.inputOrder != rhs.__isset.inputOrder)
      return false;
    else if (__isset.inputOrder && !(inputOrder == rhs.inputOrder))
      return false;
    if (__isset.isRequired != rhs.__isset.isRequired)
      return false;
    else if (__isset.isRequired && !(isRequired == rhs.isRequired))
      return false;
    if (__isset.requiredToAddedToCommandLine != rhs.__isset.requiredToAddedToCommandLine)
      return false;
    else if (__isset.requiredToAddedToCommandLine && !(requiredToAddedToCommandLine == rhs.requiredToAddedToCommandLine))
      return false;
    if (__isset.dataStaged != rhs.__isset.dataStaged)
      return false;
    else if (__isset.dataStaged && !(dataStaged == rhs.dataStaged))
      return false;
    if (__isset.storageResourceId != rhs.__isset.storageResourceId)
      return false;
    else if (__isset.storageResourceId && !(storageResourceId == rhs.storageResourceId))
      return false;
    if (__isset.isReadOnly != rhs.__isset.isReadOnly)
      return false;
    else if (__isset.isReadOnly && !(isReadOnly == rhs.isReadOnly))
      return false;
    return true;
  }
  bool operator != (const InputDataObjectType &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const InputDataObjectType & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

  virtual void printTo(std::ostream& out) const;
};

void swap(InputDataObjectType &a, InputDataObjectType &b);

inline std::ostream& operator<<(std::ostream& out, const InputDataObjectType& obj)
{
  obj.printTo(out);
  return out;
}

typedef struct _OutputDataObjectType__isset {
  _OutputDataObjectType__isset() : value(false), type(false), applicationArgument(false), isRequired(false), requiredToAddedToCommandLine(false), dataMovement(false), location(false), searchQuery(false), outputStreaming(false), storageResourceId(false) {}
  bool value :1;
  bool type :1;
  bool applicationArgument :1;
  bool isRequired :1;
  bool requiredToAddedToCommandLine :1;
  bool dataMovement :1;
  bool location :1;
  bool searchQuery :1;
  bool outputStreaming :1;
  bool storageResourceId :1;
} _OutputDataObjectType__isset;

class OutputDataObjectType : public virtual ::apache::thrift::TBase {
 public:

  OutputDataObjectType(const OutputDataObjectType&);
  OutputDataObjectType& operator=(const OutputDataObjectType&);
  OutputDataObjectType() : name(), value(), type((DataType::type)0), applicationArgument(), isRequired(0), requiredToAddedToCommandLine(0), dataMovement(0), location(), searchQuery(), outputStreaming(0), storageResourceId() {
  }

  virtual ~OutputDataObjectType() throw();
  std::string name;
  std::string value;
  DataType::type type;
  std::string applicationArgument;
  bool isRequired;
  bool requiredToAddedToCommandLine;
  bool dataMovement;
  std::string location;
  std::string searchQuery;
  bool outputStreaming;
  std::string storageResourceId;

  _OutputDataObjectType__isset __isset;

  void __set_name(const std::string& val);

  void __set_value(const std::string& val);

  void __set_type(const DataType::type val);

  void __set_applicationArgument(const std::string& val);

  void __set_isRequired(const bool val);

  void __set_requiredToAddedToCommandLine(const bool val);

  void __set_dataMovement(const bool val);

  void __set_location(const std::string& val);

  void __set_searchQuery(const std::string& val);

  void __set_outputStreaming(const bool val);

  void __set_storageResourceId(const std::string& val);

  bool operator == (const OutputDataObjectType & rhs) const
  {
    if (!(name == rhs.name))
      return false;
    if (__isset.value != rhs.__isset.value)
      return false;
    else if (__isset.value && !(value == rhs.value))
      return false;
    if (__isset.type != rhs.__isset.type)
      return false;
    else if (__isset.type && !(type == rhs.type))
      return false;
    if (__isset.applicationArgument != rhs.__isset.applicationArgument)
      return false;
    else if (__isset.applicationArgument && !(applicationArgument == rhs.applicationArgument))
      return false;
    if (__isset.isRequired != rhs.__isset.isRequired)
      return false;
    else if (__isset.isRequired && !(isRequired == rhs.isRequired))
      return false;
    if (__isset.requiredToAddedToCommandLine != rhs.__isset.requiredToAddedToCommandLine)
      return false;
    else if (__isset.requiredToAddedToCommandLine && !(requiredToAddedToCommandLine == rhs.requiredToAddedToCommandLine))
      return false;
    if (__isset.dataMovement != rhs.__isset.dataMovement)
      return false;
    else if (__isset.dataMovement && !(dataMovement == rhs.dataMovement))
      return false;
    if (__isset.location != rhs.__isset.location)
      return false;
    else if (__isset.location && !(location == rhs.location))
      return false;
    if (__isset.searchQuery != rhs.__isset.searchQuery)
      return false;
    else if (__isset.searchQuery && !(searchQuery == rhs.searchQuery))
      return false;
    if (__isset.outputStreaming != rhs.__isset.outputStreaming)
      return false;
    else if (__isset.outputStreaming && !(outputStreaming == rhs.outputStreaming))
      return false;
    if (__isset.storageResourceId != rhs.__isset.storageResourceId)
      return false;
    else if (__isset.storageResourceId && !(storageResourceId == rhs.storageResourceId))
      return false;
    return true;
  }
  bool operator != (const OutputDataObjectType &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const OutputDataObjectType & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

  virtual void printTo(std::ostream& out) const;
};

void swap(OutputDataObjectType &a, OutputDataObjectType &b);

inline std::ostream& operator<<(std::ostream& out, const OutputDataObjectType& obj)
{
  obj.printTo(out);
  return out;
}

}}}}} // namespace

#endif
