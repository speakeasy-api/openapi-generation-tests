// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// OK
    public struct PipeDelimitedQueryParamsArrayRes {
        public let args: Operations.PipeDelimitedQueryParamsArrayArgs
        public let url: String

        /// Creates an object with the specified parameters
        ///
        ///
        public init(args: Operations.PipeDelimitedQueryParamsArrayArgs, url: String) {
            self.args = args
            self.url = url
        }
    }
}

extension Operations.PipeDelimitedQueryParamsArrayRes: Codable {
    enum CodingKeys: String, CodingKey {
        case args
        case url
    }
}
