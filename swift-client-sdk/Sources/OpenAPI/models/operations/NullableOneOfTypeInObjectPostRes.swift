// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// OK
    public struct NullableOneOfTypeInObjectPostRes {
        public let json: Shared.NullableOneOfTypeInObject

        /// Creates an object with the specified parameters
        ///
        ///
        public init(json: Shared.NullableOneOfTypeInObject) {
            self.json = json
        }
    }
}

extension Operations.NullableOneOfTypeInObjectPostRes: Codable {
    enum CodingKeys: String, CodingKey {
        case json
    }
}

