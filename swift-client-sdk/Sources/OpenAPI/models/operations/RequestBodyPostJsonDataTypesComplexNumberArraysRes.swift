// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// OK
    public struct RequestBodyPostJsonDataTypesComplexNumberArraysRes {
        public let json: Shared.ComplexNumberArrays

        /// Creates an object with the specified parameters
        ///
        ///
        public init(json: Shared.ComplexNumberArrays) {
            self.json = json
        }
    }
}

extension Operations.RequestBodyPostJsonDataTypesComplexNumberArraysRes: Codable {
    enum CodingKeys: String, CodingKey {
        case json
    }
}
