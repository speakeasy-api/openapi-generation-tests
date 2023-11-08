// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// A model object
    public struct UsageExamplePostRequest: APIValue {
        /// An bigint parameter
        public let bigintParameter: Int
        /// An bigint parameter
        public let bigintStrParameter: String
        /// A boolean parameter
        public let boolParameter: Bool
        /// A date parameter
        @DateOnly
        public private(set) var dateParameter: Date
        /// A date time parameter with a default value
        @DateTime
        public private(set) var dateTimeDefaultParameter: Date
        /// A date time parameter
        @DateTime
        public private(set) var dateTimeParameter: Date
        /// A decimal parameter
        @DecimalSerialized
        public private(set) var decimalParameter: Double
        /// A decimal parameter
        public let decimalStrParameter: String
        /// A double parameter
        @DecimalSerialized
        public private(set) var doubleParameter: Double
        /// An enum parameter
        public let enumParameter: Operations.EnumParameter
        /// A number parameter that contains a falsey example value
        @DecimalSerialized
        public private(set) var falseyNumberParameter: Double
        /// A float32 parameter
        @DecimalSerialized
        public private(set) var float32Parameter: Double
        /// A float parameter
        @DecimalSerialized
        public private(set) var floatParameter: Double
        /// An int64 parameter
        public let int64Parameter: Int
        /// An integer parameter
        public let intParameter: Int
        /// A string parameter
        public let strParameter: String
        /// An bigint parameter
        public let bigintParameterOptional: Int?
        /// An bigint parameter
        public let bigintStrParameterOptional: String?
        /// A decimal parameter
        @DecimalSerialized
        public private(set) var decimalParameterOptional: Double?
        /// A decimal parameter
        public let decimalStrParameterOptional: String?
        /// An enum parameter
        public let optEnumParameter: Operations.OptEnumParameter?
        /// A request body that contains fields with different formats for testing example generation
        public let requestBody: Operations.UsageExamplePostRequestBody?

        /// Creates an object with the specified parameters
        ///
        /// - Parameter bigintParameter: An bigint parameter
        /// - Parameter bigintStrParameter: An bigint parameter
        /// - Parameter boolParameter: A boolean parameter
        /// - Parameter dateParameter: A date parameter
        /// - Parameter dateTimeDefaultParameter: A date time parameter with a default value
        /// - Parameter dateTimeParameter: A date time parameter
        /// - Parameter decimalParameter: A decimal parameter
        /// - Parameter decimalStrParameter: A decimal parameter
        /// - Parameter doubleParameter: A double parameter
        /// - Parameter enumParameter: An enum parameter
        /// - Parameter falseyNumberParameter: A number parameter that contains a falsey example value
        /// - Parameter float32Parameter: A float32 parameter
        /// - Parameter floatParameter: A float parameter
        /// - Parameter int64Parameter: An int64 parameter
        /// - Parameter intParameter: An integer parameter
        /// - Parameter strParameter: A string parameter
        /// - Parameter bigintParameterOptional: An bigint parameter
        /// - Parameter bigintStrParameterOptional: An bigint parameter
        /// - Parameter decimalParameterOptional: A decimal parameter
        /// - Parameter decimalStrParameterOptional: A decimal parameter
        /// - Parameter optEnumParameter: An enum parameter
        /// - Parameter requestBody: A request body that contains fields with different formats for testing example generation
        ///
        public init(bigintParameter: Int, bigintStrParameter: String, boolParameter: Bool, dateParameter: Date, dateTimeDefaultParameter: Date, dateTimeParameter: Date, decimalParameter: Double, decimalStrParameter: String, doubleParameter: Double, enumParameter: Operations.EnumParameter, falseyNumberParameter: Double, float32Parameter: Double, floatParameter: Double, int64Parameter: Int, intParameter: Int, strParameter: String, bigintParameterOptional: Int? = nil, bigintStrParameterOptional: String? = nil, decimalParameterOptional: Double? = nil, decimalStrParameterOptional: String? = nil, optEnumParameter: Operations.OptEnumParameter? = nil, requestBody: Operations.UsageExamplePostRequestBody? = nil) {
            self.bigintParameter = bigintParameter
            self.bigintStrParameter = bigintStrParameter
            self.boolParameter = boolParameter
            self._dateParameter = DateOnly<Date>(wrappedValue: dateParameter)
            self._dateTimeDefaultParameter = DateTime<Date>(wrappedValue: dateTimeDefaultParameter)
            self._dateTimeParameter = DateTime<Date>(wrappedValue: dateTimeParameter)
            self._decimalParameter = DecimalSerialized<Double>(wrappedValue: decimalParameter)
            self.decimalStrParameter = decimalStrParameter
            self._doubleParameter = DecimalSerialized<Double>(wrappedValue: doubleParameter)
            self.enumParameter = enumParameter
            self._falseyNumberParameter = DecimalSerialized<Double>(wrappedValue: falseyNumberParameter)
            self._float32Parameter = DecimalSerialized<Double>(wrappedValue: float32Parameter)
            self._floatParameter = DecimalSerialized<Double>(wrappedValue: floatParameter)
            self.int64Parameter = int64Parameter
            self.intParameter = intParameter
            self.strParameter = strParameter
            self.bigintParameterOptional = bigintParameterOptional
            self.bigintStrParameterOptional = bigintStrParameterOptional
            self._decimalParameterOptional = DecimalSerialized<Double?>(wrappedValue: decimalParameterOptional)
            self.decimalStrParameterOptional = decimalStrParameterOptional
            self.optEnumParameter = optEnumParameter
            self.requestBody = requestBody
        }
    }
}
extension Operations.UsageExamplePostRequest {
    var dateParameterWrapper: DateOnly<Date> {
        return _dateParameter
    }
    var dateTimeDefaultParameterWrapper: DateTime<Date> {
        return _dateTimeDefaultParameter
    }
    var dateTimeParameterWrapper: DateTime<Date> {
        return _dateTimeParameter
    }
    var decimalParameterWrapper: DecimalSerialized<Double> {
        return _decimalParameter
    }
    var decimalParameterOptionalWrapper: DecimalSerialized<Double?> {
        return _decimalParameterOptional
    }
    var doubleParameterWrapper: DecimalSerialized<Double> {
        return _doubleParameter
    }
    var falseyNumberParameterWrapper: DecimalSerialized<Double> {
        return _falseyNumberParameter
    }
    var float32ParameterWrapper: DecimalSerialized<Double> {
        return _float32Parameter
    }
    var floatParameterWrapper: DecimalSerialized<Double> {
        return _floatParameter
    }
}