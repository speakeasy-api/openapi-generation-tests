// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// OK
    public struct GlobalsQueryParameterGetRes {
        public let args: Operations.Args

        /// Creates an object with the specified parameters
        ///
        ///
        public init(args: Operations.Args) {
            self.args = args
        }
    }
}

extension Operations.GlobalsQueryParameterGetRes: Codable {
    enum CodingKeys: String, CodingKey {
        case args
    }
}

