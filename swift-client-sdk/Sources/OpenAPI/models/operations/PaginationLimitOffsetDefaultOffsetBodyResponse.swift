// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

import Foundation

extension Operations {
    /// A response model
    public enum PaginationLimitOffsetDefaultOffsetBodyResponse {
        case empty
        case res(Operations.PaginationLimitOffsetDefaultOffsetBodyRes)

        var isEmpty: Bool {
            if case .empty = self {
                return true
            } else {
                return false
            }
        }

        public func res() throws -> Operations.PaginationLimitOffsetDefaultOffsetBodyRes {
            guard case .res(let value) = self else {
                throw OpenAPIError.missingResponseData
            }
            return value
        }
    }}