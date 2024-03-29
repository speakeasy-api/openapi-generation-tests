// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.


import Foundation

extension Operations.DecimalParamWithDefaultRequest: Serializable {
    func serialize(with format: SerializableFormat) throws -> String {
        switch format {
        case .query:
            return try serializeQueryParameterSerializable(self, with: format)
        case .path, .header, .multipart, .form:
            throw SerializationError.invalidSerializationParameter(type: "Operations.DecimalParamWithDefaultRequest", format: format.formatDescription)
        }
    }

    func serializeQueryParameters(with format: SerializableFormat) throws -> [QueryParameter] {
        return try serializedQueryParameters(with: nil, formatOverride: format)
    }
}

extension Operations.DecimalParamWithDefaultRequest: QueryParameterSerializable {
    func serializedQueryParameters(with parameterDefaults: ParameterDefaults?, formatOverride: SerializableFormat?) throws -> [QueryParameter] {
        let builder = QueryParameterBuilder()
        try builder.addQueryParameters(from: decimalInputWrapper, named: "decimalInput", format: formatOverride ?? .query(style: .form, explode: true), parameterDefaults: parameterDefaults)
        return builder.build()
    }
}
