// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

import Foundation

extension Shared {
    /// A model object
    public enum AnyOfMultiMatch {
        case anyOfMultiMatchMember1(Shared.AnyOfMultiMatchMember1)
        case anyOfMultiMatchMember2(Shared.AnyOfMultiMatchMember2)
    }
}

extension Shared.AnyOfMultiMatch: Codable {
    public init(from decoder: Decoder) throws {
        if let value = try? Shared.AnyOfMultiMatchMember1(from: decoder) {
            self = .anyOfMultiMatchMember1(value)
        } else if let value = try? Shared.AnyOfMultiMatchMember2(from: decoder) {
            self = .anyOfMultiMatchMember2(value)
        } else {
            throw OpenAPIError.failedToHandleResponse(.failedToDecodeResponse)
        }
    }

    public func encode(to encoder: Encoder) throws {
        switch self {
        case .anyOfMultiMatchMember1(let value):
            try value.encode(to: encoder)
        case .anyOfMultiMatchMember2(let value):
            try value.encode(to: encoder)
        }
    }
}
