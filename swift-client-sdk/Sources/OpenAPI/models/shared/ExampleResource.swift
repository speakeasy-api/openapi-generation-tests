// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Shared {
    /// A model object
    public struct ExampleResource {
        public let chocolates: [Shared.Chocolates]
        public let id: String
        public let name: String
        public let vehicle: Shared.ExampleVehicle
        public let arrayOfNumber: [Double]?
        public let arrayOfString: [String]?
        @DateTime
        public private(set) var createdAt: Date?
        public let enumNumber: Shared.EnumNumber?
        public let enumStr: Shared.EnumStr?
        public let mapOfInteger: [String: Int]?
        public let mapOfString: [String: String]?
        @DateTime
        public private(set) var updatedAt: Date?

        /// Creates an object with the specified parameters
        ///
        ///
        public init(chocolates: [Shared.Chocolates], id: String, name: String, vehicle: Shared.ExampleVehicle, arrayOfNumber: [Double]? = nil, arrayOfString: [String]? = nil, createdAt: Date? = nil, enumNumber: Shared.EnumNumber? = nil, enumStr: Shared.EnumStr? = nil, mapOfInteger: [String: Int]? = nil, mapOfString: [String: String]? = nil, updatedAt: Date? = nil) {
            self.chocolates = chocolates
            self.id = id
            self.name = name
            self.vehicle = vehicle
            self.arrayOfNumber = arrayOfNumber
            self.arrayOfString = arrayOfString
            self._createdAt = DateTime<Date?>(wrappedValue: createdAt)
            self.enumNumber = enumNumber
            self.enumStr = enumStr
            self.mapOfInteger = mapOfInteger
            self.mapOfString = mapOfString
            self._updatedAt = DateTime<Date?>(wrappedValue: updatedAt)
        }
    }
}

extension Shared.ExampleResource: Codable {
    enum CodingKeys: String, CodingKey {
        case chocolates
        case id
        case name
        case vehicle
        case arrayOfNumber
        case arrayOfString
        case createdAt
        case enumNumber
        case enumStr
        case mapOfInteger
        case mapOfString
        case updatedAt
    }

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)
        self.chocolates = try container.decode([Shared.Chocolates].self, forKey: .chocolates)
        self.id = try container.decode(String.self, forKey: .id)
        self.name = try container.decode(String.self, forKey: .name)
        self.vehicle = try container.decode(Shared.ExampleVehicle.self, forKey: .vehicle)
        self.arrayOfNumber = try container.decodeIfPresent([Double].self, forKey: .arrayOfNumber)
        self.arrayOfString = try container.decodeIfPresent([String].self, forKey: .arrayOfString)
        self._createdAt = try container.decodeIfPresent(DateTime<Date?>.self, forKey: .createdAt) ?? DateTime<Date?>(wrappedValue: nil)
        self.enumNumber = try container.decodeIfPresent(Shared.EnumNumber.self, forKey: .enumNumber)
        self.enumStr = try container.decodeIfPresent(Shared.EnumStr.self, forKey: .enumStr)
        self.mapOfInteger = try container.decodeIfPresent([String: Int].self, forKey: .mapOfInteger)
        self.mapOfString = try container.decodeIfPresent([String: String].self, forKey: .mapOfString)
        self._updatedAt = try container.decodeIfPresent(DateTime<Date?>.self, forKey: .updatedAt) ?? DateTime<Date?>(wrappedValue: nil)
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(self.chocolates, forKey: .chocolates)
        try container.encode(self.id, forKey: .id)
        try container.encode(self.name, forKey: .name)
        try container.encode(self.vehicle, forKey: .vehicle)
        try container.encodeIfPresent(self.arrayOfNumber, forKey: .arrayOfNumber)
        try container.encodeIfPresent(self.arrayOfString, forKey: .arrayOfString)
        if self.createdAt != nil {
            try container.encode(self._createdAt, forKey: .createdAt)
        }
        try container.encodeIfPresent(self.enumNumber, forKey: .enumNumber)
        try container.encodeIfPresent(self.enumStr, forKey: .enumStr)
        try container.encodeIfPresent(self.mapOfInteger, forKey: .mapOfInteger)
        try container.encodeIfPresent(self.mapOfString, forKey: .mapOfString)
        if self.updatedAt != nil {
            try container.encode(self._updatedAt, forKey: .updatedAt)
        }
    }
}

extension Shared.ExampleResource {
    var createdAtWrapper: DateTime<Date?> {
        return _createdAt
    }
    var updatedAtWrapper: DateTime<Date?> {
        return _updatedAt
    }
}