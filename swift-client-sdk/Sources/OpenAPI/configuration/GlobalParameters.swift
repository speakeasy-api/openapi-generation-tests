// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

/// Describes common parameters which can be used when making API requests.
///
/// > Note: These parameters may be overridden by individual API operations
public struct GlobalParameters {
    public let globalPathParam: Int?
    public let globalQueryParam: String?

    /// Creates an object with the given parameters
    ///
    ///
    public init(
        globalPathParam: Int? = nil,
        globalQueryParam: String? = nil
    ) {
        self.globalPathParam = globalPathParam
        self.globalQueryParam = globalQueryParam
    }
}

extension GlobalParameters: ParameterDefaults {
    public func defaultSerializedPathParameter(for key: String) throws -> String? {
        switch key {
        case "globalPathParam": return try globalPathParam.serialize(with: .path(explode: false))
        default: return nil
        }
    }

    public func defaultQueryParameter(for key: String) -> AnyValue? {
        switch key {
        case "globalQueryParam": return globalQueryParam.map { AnyValue($0) }
        default: return nil
        }
    }
}
