// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

import Foundation

extension Shared {
    /// A model object
    public struct DeepObjectSmaller {
        public let any: Shared.DeepObjectSmallerAny
        public let arr: [Shared.SimpleObject]
        public let bool: Bool
        public let int: Int
        public let map: [String: Shared.SimpleObject]
        @DecimalSerialized
        public private(set) var num: Double
        /// A simple object that uses all our supported primitive types and enums and has optional properties.
        public let obj: Shared.SimpleObject
        public let str: String
        public let type: String?

        /// Creates an object with the specified parameters
        ///
        /// - Parameter obj: A simple object that uses all our supported primitive types and enums and has optional properties.
        ///
        public init(any: Shared.DeepObjectSmallerAny, arr: [Shared.SimpleObject], bool: Bool, int: Int, map: [String: Shared.SimpleObject], num: Double, obj: Shared.SimpleObject, str: String, type: String? = nil) {
            self.any = any
            self.arr = arr
            self.bool = bool
            self.int = int
            self.map = map
            self._num = DecimalSerialized<Double>(wrappedValue: num)
            self.obj = obj
            self.str = str
            self.type = type
        }
    }}

extension Shared.DeepObjectSmaller: Codable {
    enum CodingKeys: String, CodingKey {
        case any
        case arr
        case bool
        case int
        case map
        case num
        case obj
        case str
        case type
    }

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)
        self.any = try container.decode(Shared.DeepObjectSmallerAny.self, forKey: .any)
        self.arr = try container.decode([Shared.SimpleObject].self, forKey: .arr)
        self.bool = try container.decode(Bool.self, forKey: .bool)
        self.int = try container.decode(Int.self, forKey: .int)
        self.map = try container.decode([String: Shared.SimpleObject].self, forKey: .map)
        self._num = try container.decode(DecimalSerialized<Double>.self, forKey: .num)
        self.obj = try container.decode(Shared.SimpleObject.self, forKey: .obj)
        self.str = try container.decode(String.self, forKey: .str)
        self.type = try container.decodeIfPresent(String.self, forKey: .type)
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(self.any, forKey: .any)
        try container.encode(self.arr, forKey: .arr)
        try container.encode(self.bool, forKey: .bool)
        try container.encode(self.int, forKey: .int)
        try container.encode(self.map, forKey: .map)
        try container.encode(self._num, forKey: .num)
        try container.encode(self.obj, forKey: .obj)
        try container.encode(self.str, forKey: .str)
        try container.encodeIfPresent(self.type, forKey: .type)
    }
}

extension Shared.DeepObjectSmaller {
    var numWrapper: DecimalSerialized<Double> {
        return _num
    }
}