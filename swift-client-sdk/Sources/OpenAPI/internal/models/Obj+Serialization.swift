// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.


import Foundation

extension Operations.Obj: Serializable {
    func serialize(with format: SerializableFormat) throws -> String {
        switch format {
        case .query:
            return try serializeQueryParameterSerializable(self, with: format)
        case .path, .header, .multipart, .form:
            throw SerializationError.invalidSerializationParameter(type: "Operations.Obj", format: format.formatDescription)
        }
    }

    func serializeQueryParameters(with format: SerializableFormat) throws -> [QueryParameter] {
        return try serializedQueryParameters(with: nil, formatOverride: format)
    }
}

extension Operations.Obj: QueryParameterSerializable {
    func serializedQueryParameters(with parameterDefaults: ParameterDefaults?, formatOverride: SerializableFormat?) throws -> [QueryParameter] {
        let builder = QueryParameterBuilder()
        try builder.addQueryParameters(from: bool, named: "bool", format: formatOverride ?? .query(style: .form, explode: false), parameterDefaults: parameterDefaults)
        try builder.addQueryParameters(from: numWrapper, named: "num", format: formatOverride ?? .query(style: .form, explode: false), parameterDefaults: parameterDefaults)
        try builder.addQueryParameters(from: str, named: "str", format: formatOverride ?? .query(style: .form, explode: false), parameterDefaults: parameterDefaults)
        return builder.build()
    }
}