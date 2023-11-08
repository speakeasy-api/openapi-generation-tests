// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// A response model
    public enum BasicAuthResponse {
        case empty
        case user(Operations.BasicAuthUser)

        var isEmpty: Bool {
            if case .empty = self {
                return true
            } else {
                return false
            }
        }

        public func user() throws -> Operations.BasicAuthUser {
            guard case .user(let value) = self else {
                throw OpenAPIError.missingResponseData
            }
            return value
        }
    }
}