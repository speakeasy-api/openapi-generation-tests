// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

import Foundation

extension Operations {
    /// OK
    public struct ArrayOfDiscriminatedUnionsMapRes {
        public let json: Shared.ArrayOfDiscriminatedUnionsMap

        /// Creates an object with the specified parameters
        ///
        ///
        public init(json: Shared.ArrayOfDiscriminatedUnionsMap) {
            self.json = json
        }
    }}

extension Operations.ArrayOfDiscriminatedUnionsMapRes: Codable {
    enum CodingKeys: String, CodingKey {
        case json
    }
}
