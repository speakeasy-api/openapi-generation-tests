// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// OK
    public struct RequestBodyPostJsonDataTypesDateResponseBody {
        public let data: String
        @DateOnly
        public private(set) var json: Date

        /// Creates an object with the specified parameters
        ///
        ///
        public init(data: String, json: Date) {
            self.data = data
            self._json = DateOnly<Date>(wrappedValue: json)
        }
    }
}

extension Operations.RequestBodyPostJsonDataTypesDateResponseBody: Codable {
    enum CodingKeys: String, CodingKey {
        case data
        case json
    }

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)
        self.data = try container.decode(String.self, forKey: .data)
        self._json = try container.decode(DateOnly<Date>.self, forKey: .json)
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(self.data, forKey: .data)
        try container.encode(self._json, forKey: .json)
    }
}

extension Operations.RequestBodyPostJsonDataTypesDateResponseBody {
    var jsonWrapper: DateOnly<Date> {
        return _json
    }
}