// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// A model object
    public struct GlobalsHiddenPostJson {
        public let other: Int
        public let test: String

        /// Creates an object with the specified parameters
        ///
        ///
        public init(other: Int, test: String) {
            self.other = other
            self.test = test
        }
    }
}

extension Operations.GlobalsHiddenPostJson: Codable {
    enum CodingKeys: String, CodingKey {
        case other
        case test
    }
}
