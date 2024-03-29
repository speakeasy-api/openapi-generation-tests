// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// A model object
    public struct MixedParametersCamelCaseRequest: APIValue {
        public let headerParam: String
        public let pathParam: String
        public let queryStringParam: String

        /// Creates an object with the specified parameters
        ///
        ///
        public init(headerParam: String, pathParam: String, queryStringParam: String) {
            self.headerParam = headerParam
            self.pathParam = pathParam
            self.queryStringParam = queryStringParam
        }
    }
}
