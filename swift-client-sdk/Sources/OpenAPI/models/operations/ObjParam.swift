// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {

    public struct ObjParam: APIValue {
        public let encodedCount: String?
        public let encodedTerm: String?

        /// Creates an object with the specified parameters
        ///
        ///
        public init(encodedCount: String? = nil, encodedTerm: String? = nil) {
            self.encodedCount = encodedCount
            self.encodedTerm = encodedTerm
        }
    }
}