// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

import Foundation

extension Operations {
    /// OK
    public struct UnionMapRes {
        public let json: Operations.UnionMapJson

        /// Creates an object with the specified parameters
        ///
        ///
        public init(json: Operations.UnionMapJson) {
            self.json = json
        }
    }
}

extension Operations.UnionMapRes: Codable {
    enum CodingKeys: String, CodingKey {
        case json
    }
}
