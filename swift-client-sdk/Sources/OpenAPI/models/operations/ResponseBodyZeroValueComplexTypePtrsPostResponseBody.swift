// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// OK
    public struct ResponseBodyZeroValueComplexTypePtrsPostResponseBody {
        public let json: Shared.ObjWithZeroValueComplexTypePtrs

        /// Creates an object with the specified parameters
        ///
        ///
        public init(json: Shared.ObjWithZeroValueComplexTypePtrs) {
            self.json = json
        }
    }
}

extension Operations.ResponseBodyZeroValueComplexTypePtrsPostResponseBody: Codable {
    enum CodingKeys: String, CodingKey {
        case json
    }
}

