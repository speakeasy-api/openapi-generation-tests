// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Shared {
    /// A model object
    public struct OneOfGenerationStressTest {
        public let any: AnyValue
        public let nullableAny: AnyValue
        public let oneOfFromArrayOfTypes: Shared.OneOfFromArrayOfTypes
        public let oneOfSameType: Shared.OneOfSameType

        /// Creates an object with the specified parameters
        ///
        ///
        public init(any: AnyValue, nullableAny: AnyValue, oneOfFromArrayOfTypes: Shared.OneOfFromArrayOfTypes, oneOfSameType: Shared.OneOfSameType) {
            self.any = any
            self.nullableAny = nullableAny
            self.oneOfFromArrayOfTypes = oneOfFromArrayOfTypes
            self.oneOfSameType = oneOfSameType
        }
    }
}

extension Shared.OneOfGenerationStressTest: Codable {
    enum CodingKeys: String, CodingKey {
        case any
        case nullableAny
        case oneOfFromArrayOfTypes
        case oneOfSameType
    }
}

