// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// A response model
    public enum UnionErrorsGetResponse {
        case empty
        case oneOf(Operations.UnionErrorsGetResponseBody)

        var isEmpty: Bool {
            if case .empty = self {
                return true
            } else {
                return false
            }
        }

        public func oneOf() throws -> Operations.UnionErrorsGetResponseBody {
            guard case .oneOf(let value) = self else {
                throw OpenAPIError.missingResponseData
            }
            return value
        }
    }
}