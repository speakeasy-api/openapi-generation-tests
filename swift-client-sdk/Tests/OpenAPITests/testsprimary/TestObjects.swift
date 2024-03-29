// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation
@testable import OpenAPI

enum TestObjectsError: Error {
  case unexpectedResultType
}
func createSimpleObject() -> Shared.SimpleObject {
    return .init(
        any: AnyValue("any"),
        bool: true,
        date: createSampleDate(),
        dateTime: createSampleDate(),
        enum: .one,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: .fiftyFive,
        intEnum: .second,
        num: 1.1,
        str: "test",
        bigint: nil,
        bigintStr: nil,
        boolOpt: true,
        intOptNull: nil,
        numOptNull: nil,
        strOpt: "testOptional"
    )
}

func createDeepObject() throws -> Shared.DeepObject {
    return .init(
        any: .simpleObject(createSimpleObject()),
        arr: [createSimpleObject(), createSimpleObject()],
        bool: true,
        int: 1,
        map: ["key": createSimpleObject()],
        num: 1.1,
        obj: createSimpleObject(),
        str: "test",
        type: nil
    )
}

func createSampleDate() -> Date {
    var components = DateComponents()
    components.year = 2020
    components.month = 1
    components.day = 1
    components.hour = 0
    components.minute = 0
    components.second = 0
    return Calendar.current.date(from: components)!
}

// MARK: - Equatable

extension Shared.SimpleObject: Equatable {
    public static func == (lhs: Shared.SimpleObject, rhs: Shared.SimpleObject) -> Bool {
        return lhs.any == rhs.any &&
        lhs.bool == rhs.bool &&
        lhs.date == rhs.date &&
        lhs.dateTime == rhs.dateTime &&
        lhs.enum == rhs.enum &&
        lhs.float32 == rhs.float32 &&
        lhs.int == rhs.int &&
        lhs.int32 == rhs.int32 &&
        lhs.int32Enum == rhs.int32Enum &&
        lhs.intEnum == rhs.intEnum &&
        lhs.num == rhs.num &&
        lhs.str == rhs.str &&
        lhs.boolOpt == rhs.boolOpt &&
        lhs.intOptNull == rhs.intOptNull &&
        lhs.numOptNull == rhs.numOptNull &&
        lhs.strOpt == rhs.strOpt
    }
}

extension Shared.DeepObject: Equatable {
    public static func == (lhs: Shared.DeepObject, rhs: Shared.DeepObject) -> Bool {
        return lhs.any == rhs.any &&
        lhs.arr == rhs.arr &&
        lhs.bool == rhs.bool &&
        lhs.int == rhs.int &&
        lhs.map == rhs.map &&
        lhs.num == rhs.num &&
        lhs.obj == rhs.obj &&
        lhs.str == rhs.str &&
        lhs.type == rhs.type
    }
}

extension Shared.SimpleObjectWithType: Equatable {
  public static func == (lhs: Shared.SimpleObjectWithType, rhs: Shared.SimpleObjectWithType) -> Bool {
    return lhs.any == rhs.any &&
    lhs.bool == rhs.bool &&
    lhs.date == rhs.date &&
    lhs.dateTime == rhs.dateTime &&
    lhs.`enum` == rhs.`enum` &&
    lhs.float32 == rhs.float32 &&
    lhs.int == rhs.int &&
    lhs.int32 == rhs.int32 &&
    lhs.int32Enum == rhs.int32Enum &&
    lhs.intEnum == rhs.intEnum &&
    lhs.num == rhs.num &&
    lhs.str == rhs.str &&
    lhs.type == rhs.type &&
    lhs.bigint == rhs.bigint &&
    lhs.bigintStr == rhs.bigintStr &&
    lhs.boolOpt == rhs.boolOpt &&
    lhs.intOptNull == rhs.intOptNull &&
    lhs.numOptNull == rhs.numOptNull &&
    lhs.strOpt == rhs.strOpt
  }
}

extension Shared.DeepObjectWithType: Equatable {
  public static func == (lhs: Shared.DeepObjectWithType, rhs: Shared.DeepObjectWithType) -> Bool {
    return lhs.any == rhs.any &&
    lhs.arr == rhs.arr &&
    lhs.bool == rhs.bool &&
    lhs.int == rhs.int &&
    lhs.map == rhs.map &&
    lhs.num == rhs.num &&
    lhs.obj == rhs.obj &&
    lhs.str == rhs.str &&
    lhs.type == rhs.type
  }
}

extension Shared.TypedObject1: Equatable {
  public static func == (lhs: Shared.TypedObject1, rhs: Shared.TypedObject1) -> Bool {
    return lhs.type == rhs.type && lhs.value == rhs.value
  }
}

extension Shared.TypedObject2: Equatable {
  public static func == (lhs: Shared.TypedObject2, rhs: Shared.TypedObject2) -> Bool {
    return lhs.type == rhs.type && lhs.value == rhs.value
  }
}

extension Shared.TypedObject3: Equatable {
  public static func == (lhs: Shared.TypedObject3, rhs: Shared.TypedObject3) -> Bool {
    return lhs.type == rhs.type && lhs.value == rhs.value
  }
}

// MARK: - Union Types

extension Shared.`Any`: Equatable {
  public static func == (lhs: Shared.`Any`, rhs: Shared.`Any`) -> Bool {
    switch (lhs, rhs) {
    case (.simpleObject(let simpleObject1), .simpleObject(let simpleObject2)):
      return simpleObject1 == simpleObject2
    case (.string(let string1), .string(let string2)):
      return string1 == string2
    default:
      return false
    }
  }
}

extension Shared.DeepObjectWithTypeAny: Equatable {
  public static func == (lhs: Shared.DeepObjectWithTypeAny, rhs: Shared.DeepObjectWithTypeAny) -> Bool {
    switch (lhs, rhs) {
    case (.simpleObject(let simpleObject1), .simpleObject(let simpleObject2)):
      return simpleObject1 == simpleObject2
    case (.string(let string1), .string(let string2)):
      return string1 == string2
    default:
      return false
    }
  }
}

extension Shared.StronglyTypedOneOfObject: Equatable {
  public static func == (lhs: Shared.StronglyTypedOneOfObject, rhs: Shared.StronglyTypedOneOfObject) -> Bool {
    switch (lhs, rhs) {
    case (.simpleObjectWithType(let simpleObject1), .simpleObjectWithType(let simpleObject2)):
      return simpleObject1 == simpleObject2
    case (.deepObjectWithType(let deepObject1), .deepObjectWithType(let deepObject2)):
      return deepObject1 == deepObject2
    default:
      return false
    }
  }
}

extension Shared.WeaklyTypedOneOfObject: Equatable {
  public static func == (lhs: Shared.WeaklyTypedOneOfObject, rhs: Shared.WeaklyTypedOneOfObject) -> Bool {
    switch (lhs, rhs) {
    case (.simpleObject(let simpleObject1), .simpleObject(let simpleObject2)):
      return simpleObject1 == simpleObject2
    case (.deepObject(let deepObject1), .deepObject(let deepObject2)):
      return deepObject1 == deepObject2
    default:
      return false
    }
  }
}

extension Shared.TypedObjectOneOf: Equatable {
  public static func == (lhs: Shared.TypedObjectOneOf, rhs: Shared.TypedObjectOneOf) -> Bool {
    switch (lhs, rhs) {
    case (.typedObject1(let object1), .typedObject1(let object2)):
      return object1 == object2
    case (.typedObject2(let object1), .typedObject2(let object2)):
      return object1 == object2
    case (.typedObject3(let object1), .typedObject3(let object2)):
      return object1 == object2
    default:
      return false
    }
  }
}

extension Operations.PrimitiveTypeOneOfPostJson: Equatable {
  public static func == (lhs: Operations.PrimitiveTypeOneOfPostJson, rhs: Operations.PrimitiveTypeOneOfPostJson) -> Bool {
    switch (lhs, rhs) {
    case (.string(let value1), .string(let value2)):
      return value1 == value2
    case (.integer(let value1), .integer(let value2)):
      return value1 == value2
    case (.number(let value1), .number(let value2)):
      return value1 == value2
    case (.bool(let value1), .bool(let value2)):
      return value1 == value2
    default:
      return false
    }
  }
}

extension Operations.MixedTypeOneOfPostJson: Equatable {
  public static func == (lhs: Operations.MixedTypeOneOfPostJson, rhs: Operations.MixedTypeOneOfPostJson) -> Bool {
    switch (lhs, rhs) {
    case (.string(let value1), .string(let value2)):
      return value1 == value2
    case (.integer(let value1), .integer(let value2)):
      return value1 == value2
    case (.simpleObject(let value1), .simpleObject(let value2)):
      return value1 == value2
    default:
      return false
    }
  }
}

extension Shared.StronglyTypedOneOfObject {
  func simpleObjectWithType() throws -> Shared.SimpleObjectWithType {
    switch self {
    case .simpleObjectWithType(let object):
      return object
    case .deepObjectWithType:
      throw TestObjectsError.unexpectedResultType
    }
  }

  func deepObjectWithType() throws -> Shared.DeepObjectWithType {
    switch self {
    case .simpleObjectWithType:
      throw TestObjectsError.unexpectedResultType
    case .deepObjectWithType(let object):
      return object
    }
  }
}

extension Shared.WeaklyTypedOneOfObject {
  func simpleObject() throws -> Shared.SimpleObject {
    switch self {
    case .simpleObject(let object):
      return object
    case .deepObject:
      throw TestObjectsError.unexpectedResultType
    }
  }

  func deepObject() throws -> Shared.DeepObject {
    switch self {
    case .simpleObject:
      throw TestObjectsError.unexpectedResultType
    case .deepObject(let object):
      return object
    }
  }
}

extension Operations.DeepObjectQueryParamsMapArgs {
  func string() throws -> String {
    switch self {
    case .string(let string):
      return string
    case .array:
      throw TestObjectsError.unexpectedResultType
    }
  }

  func array() throws -> [String] {
    switch self {
    case .array(let array):
      return array
    case .string:
      throw TestObjectsError.unexpectedResultType
    }
  }
}
