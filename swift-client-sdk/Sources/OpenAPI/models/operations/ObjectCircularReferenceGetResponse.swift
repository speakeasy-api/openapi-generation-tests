// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// A response model
    public enum ObjectCircularReferenceGetResponse {
        case empty
        case objectCircularReferenceObject(Shared.ObjectCircularReferenceObject)

        var isEmpty: Bool {
            if case .empty = self {
                return true
            } else {
                return false
            }
        }

        public func objectCircularReferenceObject() throws -> Shared.ObjectCircularReferenceObject {
            guard case .objectCircularReferenceObject(let value) = self else {
                throw OpenAPIError.missingResponseData
            }
            return value
        }
    }
}