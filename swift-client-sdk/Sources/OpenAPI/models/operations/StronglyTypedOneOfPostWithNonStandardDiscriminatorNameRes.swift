// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

import Foundation

extension Operations {
    /// OK
    public struct StronglyTypedOneOfPostWithNonStandardDiscriminatorNameRes {
        public let json: Shared.StronglyTypedOneOfObjectWithNonStandardDiscriminatorName

        /// Creates an object with the specified parameters
        ///
        ///
        public init(json: Shared.StronglyTypedOneOfObjectWithNonStandardDiscriminatorName) {
            self.json = json
        }
    }
}

extension Operations.StronglyTypedOneOfPostWithNonStandardDiscriminatorNameRes: Codable {
    enum CodingKeys: String, CodingKey {
        case json
    }
}
