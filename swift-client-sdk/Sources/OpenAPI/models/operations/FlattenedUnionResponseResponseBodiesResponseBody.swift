// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

import Foundation

extension Operations {
    /// Created
    public struct FlattenedUnionResponseResponseBodiesResponseBody {
        public let message: String

        /// Creates an object with the specified parameters
        ///
        ///
        public init(message: String) {
            self.message = message
        }
    }}

extension Operations.FlattenedUnionResponseResponseBodiesResponseBody: Codable {
    enum CodingKeys: String, CodingKey {
        case message
    }
}
