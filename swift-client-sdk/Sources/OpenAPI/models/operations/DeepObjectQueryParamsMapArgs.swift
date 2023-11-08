// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// A model object
    public enum DeepObjectQueryParamsMapArgs {
        case string(String)
        case array([String])
    }
}

extension Operations.DeepObjectQueryParamsMapArgs: Codable {
    public init(from decoder: Decoder) throws {
        if let value = try? String(from: decoder) {
            self = .string(value)
        } else if let value = try? [String](from: decoder) {
            self = .array(value)
        } else {
            throw OpenAPIError.failedToHandleResponse(.failedToDecodeResponse)
        }
    }

    public func encode(to encoder: Encoder) throws {
        switch self {
        case .string(let value):
            try value.encode(to: encoder)
        case .array(let value):
            try value.encode(to: encoder)
        }
    }
}
