// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Shared {
    /// A model object
    public struct ObjWithZeroValueComplexTypePtrs {
        public let bigint: Int?
        public let bigintStr: String?
        /// A date property.
        @DateOnly
        public private(set) var date: Date?
        /// A date-time property.
        @DateTime
        public private(set) var dateTime: Date?
        @DecimalSerialized
        public private(set) var decimal: Double?

        /// Creates an object with the specified parameters
        ///
        /// - Parameter date: A date property.
        /// - Parameter dateTime: A date-time property.
        ///
        public init(bigint: Int? = nil, bigintStr: String? = nil, date: Date? = nil, dateTime: Date? = nil, decimal: Double? = nil) {
            self.bigint = bigint
            self.bigintStr = bigintStr
            self._date = DateOnly<Date?>(wrappedValue: date)
            self._dateTime = DateTime<Date?>(wrappedValue: dateTime)
            self._decimal = DecimalSerialized<Double?>(wrappedValue: decimal)
        }
    }
}

extension Shared.ObjWithZeroValueComplexTypePtrs: Codable {
    enum CodingKeys: String, CodingKey {
        case bigint
        case bigintStr
        case date
        case dateTime
        case decimal
    }

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)
        self.bigint = try container.decodeIfPresent(Int.self, forKey: .bigint)
        self.bigintStr = try container.decodeIfPresent(String.self, forKey: .bigintStr)
        self._date = try container.decodeIfPresent(DateOnly<Date?>.self, forKey: .date) ?? DateOnly<Date?>(wrappedValue: nil)
        self._dateTime = try container.decodeIfPresent(DateTime<Date?>.self, forKey: .dateTime) ?? DateTime<Date?>(wrappedValue: nil)
        self._decimal = try container.decodeIfPresent(DecimalSerialized<Double?>.self, forKey: .decimal) ?? DecimalSerialized<Double?>(wrappedValue: nil)
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(self.bigint, forKey: .bigint)
        try container.encodeIfPresent(self.bigintStr, forKey: .bigintStr)
        if self.date != nil {
            try container.encode(self._date, forKey: .date)
        }
        if self.dateTime != nil {
            try container.encode(self._dateTime, forKey: .dateTime)
        }
        if self.decimal != nil {
            try container.encode(self._decimal, forKey: .decimal)
        }
    }
}

extension Shared.ObjWithZeroValueComplexTypePtrs {
    var dateWrapper: DateOnly<Date?> {
        return _date
    }
    var dateTimeWrapper: DateTime<Date?> {
        return _dateTime
    }
    var decimalWrapper: DecimalSerialized<Double?> {
        return _decimal
    }
}