// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// A model object
    public enum UnionDateTimeBigIntRequestBody {
        case dateTime(Date)
        case integer(Int)
    }
}

extension Operations.UnionDateTimeBigIntRequestBody: Codable {
    public init(from decoder: Decoder) throws {
        if let value = try? Date(from: decoder) {
            self = .dateTime(value)
        } else if let value = try? Int(from: decoder) {
            self = .integer(value)
        } else {
            throw OpenAPIError.failedToHandleResponse(.failedToDecodeResponse)
        }
    }

    public func encode(to encoder: Encoder) throws {
        switch self {
        case .dateTime(let value):
            try value.encode(to: encoder)
        case .integer(let value):
            try value.encode(to: encoder)
        }
    }
}
