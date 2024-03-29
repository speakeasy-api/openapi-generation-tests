// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.


import Foundation

extension Operations.SimplePathParameterMapsRequest: Serializable {
    func serialize(with format: SerializableFormat) throws -> String {
        switch format {
        case .path:
            return try serializePathParameterSerializable(self, with: format)
        case .query, .header, .multipart, .form:
            throw SerializationError.invalidSerializationParameter(type: "Operations.SimplePathParameterMapsRequest", format: format.formatDescription)
        }
    }
}

extension Operations.SimplePathParameterMapsRequest: PathParameterSerializable {
    func serializedPathParameters(formatOverride: SerializableFormat?) throws -> [String: String] {
        return [
            "mapParam": try mapParam.serialize(with: formatOverride ?? .path(explode: false)),
            "mapParamExploded": try mapParamExploded.serialize(with: formatOverride ?? .path(explode: true)),
        ].compactMapValues { $0 }
    }
}
