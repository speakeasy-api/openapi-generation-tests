// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.


import Foundation

extension Operations.SampleFile: Serializable {
    func serialize(with format: SerializableFormat) throws -> String {
        switch format {
        case .multipart:
            // Deep, non-JSON encoded multipart serialization is not supported.
            throw SerializationError.invalidSerializationParameter(type: "Operations.SampleFile", format: format.formatDescription)
        case .path, .query, .header, .form:
            throw SerializationError.invalidSerializationParameter(type: "Operations.SampleFile", format: format.formatDescription)
        }
    }
}

extension Operations.SampleFile: MultipartFormBodySerializable {
    func serializedMultipartFormParameters(formatOverride: SerializableFormat?) throws -> [MultipartFormParameter] {
        return [
            .value(name: "content", serialized: try content.serialize(with: .multipart)),
            .value(name: "sampleFile", serialized: try fileName.serialize(with: .multipart))
        ]
    }
}