// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

import Foundation

extension Operations {
    /// OK
    public struct CollectionOneOfPostRes {
        public let json: Shared.CollectionOneOfObject

        /// Creates an object with the specified parameters
        ///
        ///
        public init(json: Shared.CollectionOneOfObject) {
            self.json = json
        }
    }}

extension Operations.CollectionOneOfPostRes: Codable {
    enum CodingKeys: String, CodingKey {
        case json
    }
}
