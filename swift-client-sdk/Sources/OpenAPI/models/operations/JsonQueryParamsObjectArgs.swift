// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// A model object
    public struct JsonQueryParamsObjectArgs {
        public let deepObjParam: String
        public let simpleObjParam: String

        /// Creates an object with the specified parameters
        ///
        ///
        public init(deepObjParam: String, simpleObjParam: String) {
            self.deepObjParam = deepObjParam
            self.simpleObjParam = simpleObjParam
        }
    }
}

extension Operations.JsonQueryParamsObjectArgs: Codable {
    enum CodingKeys: String, CodingKey {
        case deepObjParam
        case simpleObjParam
    }
}

