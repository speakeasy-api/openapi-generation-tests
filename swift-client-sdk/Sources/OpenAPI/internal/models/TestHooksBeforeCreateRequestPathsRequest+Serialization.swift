// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.


import Foundation

extension Operations.TestHooksBeforeCreateRequestPathsRequest: Serializable {
    func serialize(with format: SerializableFormat) throws -> String {
        switch format {
        case .path:
            return try serializePathParameterSerializable(self, with: format)
        case .query, .header, .multipart, .form:
            throw SerializationError.invalidSerializationParameter(type: "Operations.TestHooksBeforeCreateRequestPathsRequest", format: format.formatDescription)
        }
    }
}

extension Operations.TestHooksBeforeCreateRequestPathsRequest: PathParameterSerializable {
    func serializedPathParameters(formatOverride: SerializableFormat?) throws -> [String: String] {
        return [
            "namespace": try namespace.serialize(with: formatOverride ?? .path(explode: false)),
        ].compactMapValues { $0 }
    }
}