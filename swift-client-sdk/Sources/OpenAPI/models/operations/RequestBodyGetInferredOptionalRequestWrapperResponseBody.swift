// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

import Foundation

extension Operations {
    /// OK
    public struct RequestBodyGetInferredOptionalRequestWrapperResponseBody {
        public let args: Operations.RequestBodyGetInferredOptionalRequestWrapperArgs

        /// Creates an object with the specified parameters
        ///
        ///
        public init(args: Operations.RequestBodyGetInferredOptionalRequestWrapperArgs) {
            self.args = args
        }
    }}

extension Operations.RequestBodyGetInferredOptionalRequestWrapperResponseBody: Codable {
    enum CodingKeys: String, CodingKey {
        case args
    }
}
