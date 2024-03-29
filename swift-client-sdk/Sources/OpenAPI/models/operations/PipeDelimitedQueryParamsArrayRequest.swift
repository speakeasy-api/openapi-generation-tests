// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// A model object
    public struct PipeDelimitedQueryParamsArrayRequest: APIValue {
        public let arrParam: [String]?
        public let arrParamExploded: [Int]?
        public let mapParam: [String: String]?
        /// A simple object that uses all our supported primitive types and enums and has optional properties.
        public let objParam: Shared.SimpleObject?

        /// Creates an object with the specified parameters
        ///
        /// - Parameter objParam: A simple object that uses all our supported primitive types and enums and has optional properties.
        ///
        public init(arrParam: [String]? = nil, arrParamExploded: [Int]? = nil, mapParam: [String: String]? = nil, objParam: Shared.SimpleObject? = nil) {
            self.arrParam = arrParam
            self.arrParamExploded = arrParamExploded
            self.mapParam = mapParam
            self.objParam = objParam
        }
    }
}
