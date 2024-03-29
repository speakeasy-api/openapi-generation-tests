// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// A model object
    public struct PaginationLimitOffsetOffsetParamsRequest: APIValue {
        public let limit: Int?
        public let offset: Int?

        /// Creates an object with the specified parameters
        ///
        ///
        public init(limit: Int? = nil, offset: Int? = nil) {
            self.limit = limit
            self.offset = offset
        }
    }
}
