// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// A response model
    public enum ResponseBodyAdditionalPropertiesComplexNumbersPostResponse {
        case empty
        case object(Operations.ResponseBodyAdditionalPropertiesComplexNumbersPostResponseBody)

        var isEmpty: Bool {
            if case .empty = self {
                return true
            } else {
                return false
            }
        }

        public func object() throws -> Operations.ResponseBodyAdditionalPropertiesComplexNumbersPostResponseBody {
            guard case .object(let value) = self else {
                throw OpenAPIError.missingResponseData
            }
            return value
        }
    }
}