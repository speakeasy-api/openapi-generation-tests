// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

import Foundation

extension Shared {
    /// A model object
    public struct NestedArrayOfDiscriminatedUnions {
        public let nestedArray: [[Shared.StronglyTypedOneOfObject]]

        /// Creates an object with the specified parameters
        ///
        ///
        public init(nestedArray: [[Shared.StronglyTypedOneOfObject]]) {
            self.nestedArray = nestedArray
        }
    }}

extension Shared.NestedArrayOfDiscriminatedUnions: Codable {
    enum CodingKeys: String, CodingKey {
        case nestedArray
    }
}
