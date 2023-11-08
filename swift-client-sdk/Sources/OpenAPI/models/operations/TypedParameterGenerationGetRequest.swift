// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// A model object
    public struct TypedParameterGenerationGetRequest: APIValue {
        public let bigint: Int?
        @DateOnly
        public private(set) var date: Date?
        @DecimalSerialized
        public private(set) var decimal: Double?
        public let obj: Operations.Obj?

        /// Creates an object with the specified parameters
        ///
        ///
        public init(bigint: Int? = nil, date: Date? = nil, decimal: Double? = nil, obj: Operations.Obj? = nil) {
            self.bigint = bigint
            self._date = DateOnly<Date?>(wrappedValue: date)
            self._decimal = DecimalSerialized<Double?>(wrappedValue: decimal)
            self.obj = obj
        }
    }
}
extension Operations.TypedParameterGenerationGetRequest {
    var dateWrapper: DateOnly<Date?> {
        return _date
    }
    var decimalWrapper: DecimalSerialized<Double?> {
        return _decimal
    }
}