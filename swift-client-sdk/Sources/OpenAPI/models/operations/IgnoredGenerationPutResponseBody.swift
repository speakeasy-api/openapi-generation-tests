// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// OK
    public struct IgnoredGenerationPutResponseBody {
        public let json: String?

        /// Creates an object with the specified parameters
        ///
        ///
        public init(json: String? = nil) {
            self.json = json
        }
    }
}

extension Operations.IgnoredGenerationPutResponseBody: Codable {
    enum CodingKeys: String, CodingKey {
        case json
    }
}
