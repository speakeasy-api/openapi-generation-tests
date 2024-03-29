// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// A response model
    public enum OneOfCircularReferenceGetResponse {
        case empty
        case oneOfCircularReferenceObject(Shared.OneOfCircularReferenceObject)

        var isEmpty: Bool {
            if case .empty = self {
                return true
            } else {
                return false
            }
        }

        public func oneOfCircularReferenceObject() throws -> Shared.OneOfCircularReferenceObject {
            guard case .oneOfCircularReferenceObject(let value) = self else {
                throw OpenAPIError.missingResponseData
            }
            return value
        }
    }
}
