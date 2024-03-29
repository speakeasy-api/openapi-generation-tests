// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// OK
    public struct PaginationLimitOffsetOffsetParamsRes {
        public let numPages: Int
        public let resultArray: [Int]

        /// Creates an object with the specified parameters
        ///
        ///
        public init(numPages: Int, resultArray: [Int]) {
            self.numPages = numPages
            self.resultArray = resultArray
        }
    }
}

extension Operations.PaginationLimitOffsetOffsetParamsRes: Codable {
    enum CodingKeys: String, CodingKey {
        case numPages
        case resultArray
    }
}

