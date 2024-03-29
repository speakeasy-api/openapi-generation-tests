// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// A response model
    public enum RequestBodyPostApplicationJsonMapOfMapResponse {
        case empty
        case res([String: [String: Shared.SimpleObject]])

        var isEmpty: Bool {
            if case .empty = self {
                return true
            } else {
                return false
            }
        }

        public func res() throws -> [String: [String: Shared.SimpleObject]] {
            guard case .res(let value) = self else {
                throw OpenAPIError.missingResponseData
            }
            return value
        }
    }
}
