// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// OK
    public struct PaginationURLParamsRes {
        public let numPages: Int
        public let resultArray: [Int]
        public let next: String?

        /// Creates an object with the specified parameters
        ///
        ///
        public init(numPages: Int, resultArray: [Int], next: String? = nil) {
            self.numPages = numPages
            self.resultArray = resultArray
            self.next = next
        }
    }
}

extension Operations.PaginationURLParamsRes: Codable {
    enum CodingKeys: String, CodingKey {
        case numPages
        case resultArray
        case next
    }
}
