// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Shared {
    /// A model object
    public struct MapObjValue {
        public let json: [String: Shared.SimpleObject]?
        public let `required`: AnyValue?

        /// Creates an object with the specified parameters
        ///
        ///
        public init(json: [String: Shared.SimpleObject]? = nil, `required`: AnyValue? = nil) {
            self.json = json
            self.`required` = `required`
        }
    }
}

extension Shared.MapObjValue: Codable {
    enum CodingKeys: String, CodingKey {
        case json
        case `required` = "required"
    }
}

