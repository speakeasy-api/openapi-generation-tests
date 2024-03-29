// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.


import Foundation

extension Operations.DeepObjectQueryParamsObjectRequest: Serializable {
    func serialize(with format: SerializableFormat) throws -> String {
        switch format {
        case .query:
            return try serializeQueryParameterSerializable(self, with: format)
        case .path, .header, .multipart, .form:
            throw SerializationError.invalidSerializationParameter(type: "Operations.DeepObjectQueryParamsObjectRequest", format: format.formatDescription)
        }
    }

    func serializeQueryParameters(with format: SerializableFormat) throws -> [QueryParameter] {
        return try serializedQueryParameters(with: nil, formatOverride: format)
    }
}

extension Operations.DeepObjectQueryParamsObjectRequest: QueryParameterSerializable {
    func serializedQueryParameters(with parameterDefaults: ParameterDefaults?, formatOverride: SerializableFormat?) throws -> [QueryParameter] {
        let builder = QueryParameterBuilder()
        try builder.addQueryParameters(from: objParam, named: "objParam", format: formatOverride ?? .query(style: .deepObject, explode: true), parameterDefaults: parameterDefaults)
        try builder.addQueryParameters(from: objArrParam, named: "objArrParam", format: formatOverride ?? .query(style: .deepObject, explode: true), parameterDefaults: parameterDefaults)
        return builder.build()
    }
}
