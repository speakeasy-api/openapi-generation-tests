// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

import Foundation

extension Operations {
    /// A model object
    public enum ErrorUnionPostRequestBody {
        case errorType1RequestBody(Operations.ErrorType1RequestBody)
        case errorType2RequestBody(Operations.ErrorType2RequestBody)
    }}

extension Operations.ErrorUnionPostRequestBody: Codable {
    public init(from decoder: Decoder) throws {
        if let value = try? Operations.ErrorType1RequestBody(from: decoder) {
            self = .errorType1RequestBody(value)
        } else if let value = try? Operations.ErrorType2RequestBody(from: decoder) {
            self = .errorType2RequestBody(value)
        } else {
            throw OpenAPIError.failedToHandleResponse(.failedToDecodeResponse)
        }
    }

    public func encode(to encoder: Encoder) throws {
        switch self {
        case .errorType1RequestBody(let value):
            try value.encode(to: encoder)
        case .errorType2RequestBody(let value):
            try value.encode(to: encoder)
        }
    }
}
