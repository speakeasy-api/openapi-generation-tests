// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// OK
    public struct ResponseBodyAdditionalPropertiesObjectPostResponseBody {
        public let json: [String: Shared.SimpleObject]

        /// Creates an object with the specified parameters
        ///
        ///
        public init(json: [String: Shared.SimpleObject]) {
            self.json = json
        }
    }
}

extension Operations.ResponseBodyAdditionalPropertiesObjectPostResponseBody: Codable {
    enum CodingKeys: String, CodingKey {
        case json
    }
}
