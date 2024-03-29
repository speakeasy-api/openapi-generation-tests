// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// A response model
    public enum NameOverrideGetResponse {
        case empty
        case overriddenResponse(Operations.NameOverrideGetOverriddenResponse)

        var isEmpty: Bool {
            if case .empty = self {
                return true
            } else {
                return false
            }
        }

        public func overriddenResponse() throws -> Operations.NameOverrideGetOverriddenResponse {
            guard case .overriddenResponse(let value) = self else {
                throw OpenAPIError.missingResponseData
            }
            return value
        }
    }
}
