// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// A successful response that contains the simpleObject sent in the request body
    public struct IgnoredGenerationGetResponseBody {
        /// A simple object that uses all our supported primitive types and enums and has optional properties.
        public let json: Shared.SimpleObject?

        /// Creates an object with the specified parameters
        ///
        /// - Parameter json: A simple object that uses all our supported primitive types and enums and has optional properties.
        ///
        public init(json: Shared.SimpleObject? = nil) {
            self.json = json
        }
    }
}

extension Operations.IgnoredGenerationGetResponseBody: Codable {
    enum CodingKeys: String, CodingKey {
        case json
    }
}

