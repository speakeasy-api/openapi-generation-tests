// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// OK
    public struct MixedParametersCamelCaseRes {
        public let args: Operations.MixedParametersCamelCaseArgs
        public let headers: Operations.MixedParametersCamelCaseHeaders
        public let url: String

        /// Creates an object with the specified parameters
        ///
        ///
        public init(args: Operations.MixedParametersCamelCaseArgs, headers: Operations.MixedParametersCamelCaseHeaders, url: String) {
            self.args = args
            self.headers = headers
            self.url = url
        }
    }
}

extension Operations.MixedParametersCamelCaseRes: Codable {
    enum CodingKeys: String, CodingKey {
        case args
        case headers
        case url
    }
}

