// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// OK
    public struct TypedObjectNullableOneOfPostRes {
        public let json: Shared.TypedObjectNullableOneOf

        /// Creates an object with the specified parameters
        ///
        ///
        public init(json: Shared.TypedObjectNullableOneOf) {
            self.json = json
        }
    }
}

extension Operations.TypedObjectNullableOneOfPostRes: Codable {
    enum CodingKeys: String, CodingKey {
        case json
    }
}
