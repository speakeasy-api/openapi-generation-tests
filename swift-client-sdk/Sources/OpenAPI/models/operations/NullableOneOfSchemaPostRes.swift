// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// OK
    public struct NullableOneOfSchemaPostRes {
        public let json: Operations.NullableOneOfSchemaPostJson

        /// Creates an object with the specified parameters
        ///
        ///
        public init(json: Operations.NullableOneOfSchemaPostJson) {
            self.json = json
        }
    }
}

extension Operations.NullableOneOfSchemaPostRes: Codable {
    enum CodingKeys: String, CodingKey {
        case json
    }
}

