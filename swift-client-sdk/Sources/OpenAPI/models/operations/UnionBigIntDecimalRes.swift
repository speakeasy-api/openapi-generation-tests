// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// OK
    public struct UnionBigIntDecimalRes {
        public let json: Operations.UnionBigIntDecimalJson

        /// Creates an object with the specified parameters
        ///
        ///
        public init(json: Operations.UnionBigIntDecimalJson) {
            self.json = json
        }
    }
}

extension Operations.UnionBigIntDecimalRes: Codable {
    enum CodingKeys: String, CodingKey {
        case json
    }
}
