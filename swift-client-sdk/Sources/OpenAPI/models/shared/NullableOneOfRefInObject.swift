// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Shared {
    /// A model object
    public struct NullableOneOfRefInObject {
        public let nullableOneOfOne: Shared.TypedObject1
        public let nullableOneOfTwo: Shared.NullableOneOfTwo
        public let oneOfOne: Shared.OneOfOne

        /// Creates an object with the specified parameters
        ///
        ///
        public init(nullableOneOfOne: Shared.TypedObject1, nullableOneOfTwo: Shared.NullableOneOfTwo, oneOfOne: Shared.OneOfOne) {
            self.nullableOneOfOne = nullableOneOfOne
            self.nullableOneOfTwo = nullableOneOfTwo
            self.oneOfOne = oneOfOne
        }
    }
}

extension Shared.NullableOneOfRefInObject: Codable {
    enum CodingKeys: String, CodingKey {
        case nullableOneOfOne = "NullableOneOfOne"
        case nullableOneOfTwo = "NullableOneOfTwo"
        case oneOfOne = "OneOfOne"
    }
}

