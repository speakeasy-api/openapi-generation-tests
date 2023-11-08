// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// A model object
    public struct ComponentBodyAndParamConflictRequest: APIValue {
        public let simpleObject: Shared.SimpleObject
        public let str: String

        /// Creates an object with the specified parameters
        ///
        ///
        public init(simpleObject: Shared.SimpleObject, str: String) {
            self.simpleObject = simpleObject
            self.str = str
        }
    }
}