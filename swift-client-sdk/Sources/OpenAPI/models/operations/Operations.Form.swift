// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// A model object
    public struct Form {
        public let arr: String
        public let bool: String
        public let int: String
        public let map: String
        public let num: String
        public let obj: String
        public let str: String

        /// Creates an object with the specified parameters
        ///
        ///
        public init(arr: String, bool: String, int: String, map: String, num: String, obj: String, str: String) {
            self.arr = arr
            self.bool = bool
            self.int = int
            self.map = map
            self.num = num
            self.obj = obj
            self.str = str
        }
    }
}

extension Operations.Form: Codable {
    enum CodingKeys: String, CodingKey {
        case arr
        case bool
        case int
        case map
        case num
        case obj
        case str
    }
}
