// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// OK
    public struct DuplicateParamDuplicateParamResponse {
        public let url: String?

        /// Creates an object with the specified parameters
        ///
        ///
        public init(url: String? = nil) {
            self.url = url
        }
    }
}

extension Operations.DuplicateParamDuplicateParamResponse: Codable {
    enum CodingKeys: String, CodingKey {
        case url
    }
}

