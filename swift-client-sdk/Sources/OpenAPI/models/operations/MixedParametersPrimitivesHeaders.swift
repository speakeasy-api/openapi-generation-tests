// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// A model object
    public struct MixedParametersPrimitivesHeaders {
        public let headerparam: String

        /// Creates an object with the specified parameters
        ///
        ///
        public init(headerparam: String) {
            self.headerparam = headerparam
        }
    }
}

extension Operations.MixedParametersPrimitivesHeaders: Codable {
    enum CodingKeys: String, CodingKey {
        case headerparam = "Headerparam"
    }
}
