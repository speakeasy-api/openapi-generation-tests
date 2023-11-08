// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {

    public struct Obj: APIValue {
        public let bool: Bool
        @DecimalSerialized
        public private(set) var num: Double
        public let str: String

        /// Creates an object with the specified parameters
        ///
        ///
        public init(bool: Bool, num: Double, str: String) {
            self.bool = bool
            self._num = DecimalSerialized<Double>(wrappedValue: num)
            self.str = str
        }
    }
}
extension Operations.Obj {
    var numWrapper: DecimalSerialized<Double> {
        return _num
    }
}