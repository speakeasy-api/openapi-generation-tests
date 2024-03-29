// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Shared {
    /// A model object
    public enum OneOfSameType {
        case string(String)
        case two(Shared.Two)
    }
}

extension Shared.OneOfSameType: Codable {
    public init(from decoder: Decoder) throws {
        if let value = try? String(from: decoder) {
            self = .string(value)
        } else if let value = try? Shared.Two(from: decoder) {
            self = .two(value)
        } else {
            throw OpenAPIError.failedToHandleResponse(.failedToDecodeResponse)
        }
    }

    public func encode(to encoder: Encoder) throws {
        switch self {
        case .string(let value):
            try value.encode(to: encoder)
        case .two(let value):
            try value.encode(to: encoder)
        }
    }
}

