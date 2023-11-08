// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// A response model
    public enum ResponseBodyJsonGetResponse {
        case empty
        case httpBinSimpleJsonObject(Shared.HttpBinSimpleJsonObject)

        var isEmpty: Bool {
            if case .empty = self {
                return true
            } else {
                return false
            }
        }

        public func httpBinSimpleJsonObject() throws -> Shared.HttpBinSimpleJsonObject {
            guard case .httpBinSimpleJsonObject(let value) = self else {
                throw OpenAPIError.missingResponseData
            }
            return value
        }
    }
}