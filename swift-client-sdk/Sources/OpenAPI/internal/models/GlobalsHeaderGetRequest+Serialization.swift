// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.


import Foundation

extension Operations.GlobalsHeaderGetRequest: Serializable {
    func serialize(with format: SerializableFormat) throws -> String {
        switch format {
        case .header:
            return serializeModel(with: try serializedHeaderParameters(), format: format)
        case .path, .query, .multipart, .form:
            throw SerializationError.invalidSerializationParameter(type: "Operations.GlobalsHeaderGetRequest", format: format.formatDescription)
        }
    }
}

extension Operations.GlobalsHeaderGetRequest: HeaderParameterSerializable {
    func serializedHeaderParameters() throws -> [SerializedParameter] {
        return [
            SerializedParameter(name: "globalHeaderParam", serialized: try globalHeaderParam?.serialize(with: .header(explode: false)))
        ]
    }
}