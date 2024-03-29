// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.


import Foundation

extension Operations.CreateFileFile: Serializable {
    func serialize(with format: SerializableFormat) throws -> String {
        switch format {
        case .multipart:
            // Deep, non-JSON encoded multipart serialization is not supported.
            throw SerializationError.invalidSerializationParameter(type: "Operations.CreateFileFile", format: format.formatDescription)
        case .path, .query, .header, .form:
            throw SerializationError.invalidSerializationParameter(type: "Operations.CreateFileFile", format: format.formatDescription)
        }
    }
}

extension Operations.CreateFileFile: MultipartFormBodySerializable {
    func serializedMultipartFormParameters(formatOverride: SerializableFormat?) throws -> [MultipartFormParameter] {
        return [
            .value(name: "content", serialized: try content.serialize(with: .multipart)),
            .value(name: "file", serialized: try fileName.serialize(with: .multipart))
        ]
    }
}
