// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// A response model
    public enum RequestBodyPostMultipleContentTypesSplitParamFormResponse {
        case empty
        case res(Operations.RequestBodyPostMultipleContentTypesSplitParamFormRes)

        var isEmpty: Bool {
            if case .empty = self {
                return true
            } else {
                return false
            }
        }

        public func res() throws -> Operations.RequestBodyPostMultipleContentTypesSplitParamFormRes {
            guard case .res(let value) = self else {
                throw OpenAPIError.missingResponseData
            }
            return value
        }
    }
}
