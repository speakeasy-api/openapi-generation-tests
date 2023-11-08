// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Shared {

    @available(*, deprecated, message: "This object is deprecated")
    public struct DeprecatedObject {
        public let str: String?

        /// Creates an object with the specified parameters
        ///
        ///
        public init(str: String? = nil) {
            self.str = str
        }
    }
}

@available(*, deprecated)
extension Shared.DeprecatedObject: Codable {
    enum CodingKeys: String, CodingKey {
        case str
    }
}
