// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// A response model
    public enum ErrorUnionPostResponse {
        case empty
        case oneOf(Operations.ErrorUnionPostResponseBody)

        var isEmpty: Bool {
            if case .empty = self {
                return true
            } else {
                return false
            }
        }

        public func oneOf() throws -> Operations.ErrorUnionPostResponseBody {
            guard case .oneOf(let value) = self else {
                throw OpenAPIError.missingResponseData
            }
            return value
        }
    }
}