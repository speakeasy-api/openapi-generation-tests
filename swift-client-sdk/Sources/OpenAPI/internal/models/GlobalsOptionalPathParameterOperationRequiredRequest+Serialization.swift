// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.


import Foundation

extension Operations.GlobalsOptionalPathParameterOperationRequiredRequest: Serializable {
    func serialize(with format: SerializableFormat) throws -> String {
        switch format {
        case .path:
            return try serializePathParameterSerializable(self, with: format)
        case .query, .header, .multipart, .form:
            throw SerializationError.invalidSerializationParameter(type: "Operations.GlobalsOptionalPathParameterOperationRequiredRequest", format: format.formatDescription)
        }
    }
}

extension Operations.GlobalsOptionalPathParameterOperationRequiredRequest: PathParameterSerializable {
    func serializedPathParameters(formatOverride: SerializableFormat?) throws -> [String: String] {
        return [
            "globalOptionalPathParam": try globalOptionalPathParam?.serialize(with: formatOverride ?? .path(explode: false)),
        ].compactMapValues { $0 }
    }
}