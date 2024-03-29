// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Shared {
    /// A model object
    public final class ObjectCircularReferenceObject {
        public let circular: Shared.ObjectCircularReferenceObject?

        /// Creates an object with the specified parameters
        ///
        ///
        public init(circular: Shared.ObjectCircularReferenceObject? = nil) {
            self.circular = circular
        }
    }
}

extension Shared.ObjectCircularReferenceObject: Codable {
    enum CodingKeys: String, CodingKey {
        case circular
    }
}

