// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// A model object
    public struct MixedQueryParamsRequest: APIValue {
        /// A simple object that uses all our supported primitive types and enums and has optional properties.
        public let deepObjectParam: Shared.SimpleObject
        /// A simple object that uses all our supported primitive types and enums and has optional properties.
        public let formParam: Shared.SimpleObject
        /// A simple object that uses all our supported primitive types and enums and has optional properties.
        public let jsonParam: Shared.SimpleObject

        /// Creates an object with the specified parameters
        ///
        /// - Parameter deepObjectParam: A simple object that uses all our supported primitive types and enums and has optional properties.
        /// - Parameter formParam: A simple object that uses all our supported primitive types and enums and has optional properties.
        /// - Parameter jsonParam: A simple object that uses all our supported primitive types and enums and has optional properties.
        ///
        public init(deepObjectParam: Shared.SimpleObject, formParam: Shared.SimpleObject, jsonParam: Shared.SimpleObject) {
            self.deepObjectParam = deepObjectParam
            self.formParam = formParam
            self.jsonParam = jsonParam
        }
    }
}
