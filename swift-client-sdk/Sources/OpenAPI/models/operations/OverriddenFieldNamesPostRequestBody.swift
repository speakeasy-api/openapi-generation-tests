// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// A model object
    public struct OverriddenFieldNamesPostRequestBody {
        public let inInt: Int?
        public let inStr: String?

        /// Creates an object with the specified parameters
        ///
        ///
        public init(inInt: Int? = nil, inStr: String? = nil) {
            self.inInt = inInt
            self.inStr = inStr
        }
    }
}

extension Operations.OverriddenFieldNamesPostRequestBody: Codable {
    enum CodingKeys: String, CodingKey {
        case inInt = "int"
        case inStr = "str"
    }
}
