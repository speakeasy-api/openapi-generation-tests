// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// A model object
    public struct RetriesGetRequest: APIValue {
        public let requestId: String
        public let numRetries: Int?

        /// Creates an object with the specified parameters
        ///
        ///
        public init(requestId: String, numRetries: Int? = nil) {
            self.requestId = requestId
            self.numRetries = numRetries
        }
    }
}