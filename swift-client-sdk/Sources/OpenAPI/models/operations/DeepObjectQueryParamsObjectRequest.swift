// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// A model object
    public struct DeepObjectQueryParamsObjectRequest: APIValue {
        /// A simple object that uses all our supported primitive types and enums and has optional properties.
        public let objParam: Shared.SimpleObject
        public let objArrParam: Operations.ObjArrParam?

        /// Creates an object with the specified parameters
        ///
        /// - Parameter objParam: A simple object that uses all our supported primitive types and enums and has optional properties.
        ///
        public init(objParam: Shared.SimpleObject, objArrParam: Operations.ObjArrParam? = nil) {
            self.objParam = objParam
            self.objArrParam = objArrParam
        }
    }
}