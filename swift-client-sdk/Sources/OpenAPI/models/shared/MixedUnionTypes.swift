// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

import Foundation

extension Shared {
    /// A model object
    public enum MixedUnionTypes {
        case bike(Shared.Bike)
        case array([Shared.Bike])
    }}

extension Shared.MixedUnionTypes: Codable {
    public init(from decoder: Decoder) throws {
        if let value = try? Shared.Bike(from: decoder) {
            self = .bike(value)
        } else if let value = try? [Shared.Bike](from: decoder) {
            self = .array(value)
        } else {
            throw OpenAPIError.failedToHandleResponse(.failedToDecodeResponse)
        }
    }

    public func encode(to encoder: Encoder) throws {
        switch self {
        case .bike(let value):
            try value.encode(to: encoder)
        case .array(let value):
            try value.encode(to: encoder)
        }
    }
}
