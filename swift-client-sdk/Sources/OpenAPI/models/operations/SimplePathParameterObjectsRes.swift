// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// OK
    public struct SimplePathParameterObjectsRes {
        public let url: String

        /// Creates an object with the specified parameters
        ///
        ///
        public init(url: String) {
            self.url = url
        }
    }
}

extension Operations.SimplePathParameterObjectsRes: Codable {
    enum CodingKeys: String, CodingKey {
        case url
    }
}
