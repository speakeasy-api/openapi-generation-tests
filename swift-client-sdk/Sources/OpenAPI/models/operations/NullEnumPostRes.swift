// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

import Foundation

extension Operations {
    /// OK
    public struct NullEnumPostRes {
        public let json: Shared.ObjectWithNullEnums

        /// Creates an object with the specified parameters
        ///
        ///
        public init(json: Shared.ObjectWithNullEnums) {
            self.json = json
        }
    }}

extension Operations.NullEnumPostRes: Codable {
    enum CodingKeys: String, CodingKey {
        case json
    }
}
