// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// OK
    public struct RequestBodyPostComplexNumberTypesResponseBody {
        public let json: Shared.ComplexNumberTypes
        public let url: String

        /// Creates an object with the specified parameters
        ///
        ///
        public init(json: Shared.ComplexNumberTypes, url: String) {
            self.json = json
            self.url = url
        }
    }
}

extension Operations.RequestBodyPostComplexNumberTypesResponseBody: Codable {
    enum CodingKeys: String, CodingKey {
        case json
        case url
    }
}

