// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

import Foundation

extension Operations {
    /// OK
    public struct RequestBodyPostMultipleContentTypesComponentFilteredDefaultTestRes {
        /// A simple object that uses all our supported primitive types and enums and has optional properties.
        public let json: Shared.SimpleObject

        /// Creates an object with the specified parameters
        ///
        /// - Parameter json: A simple object that uses all our supported primitive types and enums and has optional properties.
        ///
        public init(json: Shared.SimpleObject) {
            self.json = json
        }
    }
}

extension Operations.RequestBodyPostMultipleContentTypesComponentFilteredDefaultTestRes: Codable {
    enum CodingKeys: String, CodingKey {
        case json
    }
}
