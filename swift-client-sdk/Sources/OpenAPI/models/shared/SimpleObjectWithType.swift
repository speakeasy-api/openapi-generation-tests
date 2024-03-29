// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Shared {
    /// A simple object that uses all our supported primitive types and enums and has optional properties.
    public struct SimpleObjectWithType {
        /// An any property.
        public let any: AnyValue
        /// A boolean property.
        public let bool: Bool
        /// A date property.
        @DateOnly
        public private(set) var date: Date
        /// A date-time property.
        @DateTime
        public private(set) var dateTime: Date
        /// A string based enum
        public let `enum`: Shared.Enum
        /// A float32 property.
        @DecimalSerialized
        public private(set) var float32: Double
        /// An integer property.
        public let int: Int
        /// An int32 property.
        public let int32: Int
        /// An int32 enum property.
        public let int32Enum: Shared.SimpleObjectWithTypeInt32Enum
        /// An integer enum property.
        public let intEnum: Shared.SimpleObjectWithTypeIntEnum
        /// A number property.
        @DecimalSerialized
        public private(set) var num: Double
        /// A string property.
        public let str: String
        public let type: String = "simpleObjectWithType"
        public let bigint: Int?
        public let bigintStr: String?
        /// An optional boolean property.
        public let boolOpt: Bool?
        @DecimalSerialized
        public private(set) var decimal: Double?
        public let decimalStr: String?
        /// An optional integer property will be null for tests.
        public let intOptNull: Int?
        /// An optional number property will be null for tests.
        @DecimalSerialized
        public private(set) var numOptNull: Double?
        /// An optional string property.
        public let strOpt: String?

        /// Creates an object with the specified parameters
        ///
        /// - Parameter any: An any property.
        /// - Parameter bool: A boolean property.
        /// - Parameter date: A date property.
        /// - Parameter dateTime: A date-time property.
        /// - Parameter `enum`: A string based enum
        /// - Parameter float32: A float32 property.
        /// - Parameter int: An integer property.
        /// - Parameter int32: An int32 property.
        /// - Parameter int32Enum: An int32 enum property.
        /// - Parameter intEnum: An integer enum property.
        /// - Parameter num: A number property.
        /// - Parameter str: A string property.
        /// - Parameter boolOpt: An optional boolean property.
        /// - Parameter intOptNull: An optional integer property will be null for tests.
        /// - Parameter numOptNull: An optional number property will be null for tests.
        /// - Parameter strOpt: An optional string property.
        ///
        public init(any: AnyValue, bool: Bool, date: Date, dateTime: Date, `enum`: Shared.Enum, float32: Double, int: Int, int32: Int, int32Enum: Shared.SimpleObjectWithTypeInt32Enum, intEnum: Shared.SimpleObjectWithTypeIntEnum, num: Double, str: String, bigint: Int? = nil, bigintStr: String? = nil, boolOpt: Bool? = nil, decimal: Double? = nil, decimalStr: String? = nil, intOptNull: Int? = nil, numOptNull: Double? = nil, strOpt: String? = nil) {
            self.any = any
            self.bool = bool
            self._date = DateOnly<Date>(wrappedValue: date)
            self._dateTime = DateTime<Date>(wrappedValue: dateTime)
            self.`enum` = `enum`
            self._float32 = DecimalSerialized<Double>(wrappedValue: float32)
            self.int = int
            self.int32 = int32
            self.int32Enum = int32Enum
            self.intEnum = intEnum
            self._num = DecimalSerialized<Double>(wrappedValue: num)
            self.str = str
            self.bigint = bigint
            self.bigintStr = bigintStr
            self.boolOpt = boolOpt
            self._decimal = DecimalSerialized<Double?>(wrappedValue: decimal)
            self.decimalStr = decimalStr
            self.intOptNull = intOptNull
            self._numOptNull = DecimalSerialized<Double?>(wrappedValue: numOptNull)
            self.strOpt = strOpt
        }
    }
}

extension Shared.SimpleObjectWithType: Codable {
    enum CodingKeys: String, CodingKey {
        case any
        case bool
        case date
        case dateTime
        case `enum` = "enum"
        case float32
        case int
        case int32
        case int32Enum
        case intEnum
        case num
        case str
        case type
        case bigint
        case bigintStr
        case boolOpt
        case decimal
        case decimalStr
        case intOptNull
        case numOptNull
        case strOpt
    }

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)
        self.any = try container.decode(AnyValue.self, forKey: .any)
        self.bool = try container.decode(Bool.self, forKey: .bool)
        self._date = try container.decode(DateOnly<Date>.self, forKey: .date)
        self._dateTime = try container.decode(DateTime<Date>.self, forKey: .dateTime)
        self.`enum` = try container.decode(Shared.Enum.self, forKey: .`enum`)
        self._float32 = try container.decode(DecimalSerialized<Double>.self, forKey: .float32)
        self.int = try container.decode(Int.self, forKey: .int)
        self.int32 = try container.decode(Int.self, forKey: .int32)
        self.int32Enum = try container.decode(Shared.SimpleObjectWithTypeInt32Enum.self, forKey: .int32Enum)
        self.intEnum = try container.decode(Shared.SimpleObjectWithTypeIntEnum.self, forKey: .intEnum)
        self._num = try container.decode(DecimalSerialized<Double>.self, forKey: .num)
        self.str = try container.decode(String.self, forKey: .str)
        self.bigint = try container.decodeIfPresent(Int.self, forKey: .bigint)
        self.bigintStr = try container.decodeIfPresent(String.self, forKey: .bigintStr)
        self.boolOpt = try container.decodeIfPresent(Bool.self, forKey: .boolOpt)
        self._decimal = try container.decodeIfPresent(DecimalSerialized<Double?>.self, forKey: .decimal) ?? DecimalSerialized<Double?>(wrappedValue: nil)
        self.decimalStr = try container.decodeIfPresent(String.self, forKey: .decimalStr)
        self.intOptNull = try container.decodeIfPresent(Int.self, forKey: .intOptNull)
        self._numOptNull = try container.decodeIfPresent(DecimalSerialized<Double?>.self, forKey: .numOptNull) ?? DecimalSerialized<Double?>(wrappedValue: nil)
        self.strOpt = try container.decodeIfPresent(String.self, forKey: .strOpt)
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(self.any, forKey: .any)
        try container.encode(self.bool, forKey: .bool)
        try container.encode(self._date, forKey: .date)
        try container.encode(self._dateTime, forKey: .dateTime)
        try container.encode(self.`enum`, forKey: .`enum`)
        try container.encode(self._float32, forKey: .float32)
        try container.encode(self.int, forKey: .int)
        try container.encode(self.int32, forKey: .int32)
        try container.encode(self.int32Enum, forKey: .int32Enum)
        try container.encode(self.intEnum, forKey: .intEnum)
        try container.encode(self._num, forKey: .num)
        try container.encode(self.str, forKey: .str)
        try container.encode(self.type, forKey: .type)
        try container.encodeIfPresent(self.bigint, forKey: .bigint)
        try container.encodeIfPresent(self.bigintStr, forKey: .bigintStr)
        try container.encodeIfPresent(self.boolOpt, forKey: .boolOpt)
        if self.decimal != nil {
            try container.encode(self._decimal, forKey: .decimal)
        }
        try container.encodeIfPresent(self.decimalStr, forKey: .decimalStr)
        try container.encodeIfPresent(self.intOptNull, forKey: .intOptNull)
        if self.numOptNull != nil {
            try container.encode(self._numOptNull, forKey: .numOptNull)
        }
        try container.encodeIfPresent(self.strOpt, forKey: .strOpt)
    }
}

extension Shared.SimpleObjectWithType {
    var dateWrapper: DateOnly<Date> {
        return _date
    }
    var dateTimeWrapper: DateTime<Date> {
        return _dateTime
    }
    var decimalWrapper: DecimalSerialized<Double?> {
        return _decimal
    }
    var float32Wrapper: DecimalSerialized<Double> {
        return _float32
    }
    var numWrapper: DecimalSerialized<Double> {
        return _num
    }
    var numOptNullWrapper: DecimalSerialized<Double?> {
        return _numOptNull
    }
}
