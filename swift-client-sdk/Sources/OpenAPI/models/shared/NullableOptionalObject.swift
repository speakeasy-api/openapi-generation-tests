// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

import Foundation

extension Shared {
    /// A model object
    public struct NullableOptionalObject {
        public let `required`: Int
        public let `optional`: String?

        /// Creates an object with the specified parameters
        ///
        ///
        public init(`required`: Int, `optional`: String? = nil) {
            self.`required` = `required`
            self.`optional` = `optional`
        }
    }}

extension Shared.NullableOptionalObject: Codable {
    enum CodingKeys: String, CodingKey {
        case `required` = "required"
        case `optional` = "optional"
    }
}
