// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Shared {
    /// A model object
    public struct AllOfToAllOf {
        public let id: String?

        /// Creates an object with the specified parameters
        ///
        ///
        public init(id: String? = nil) {
            self.id = id
        }
    }
}

extension Shared.AllOfToAllOf: Codable {
    enum CodingKeys: String, CodingKey {
        case id
    }
}
