// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

import Foundation

extension Operations {
    /// A model object
    public struct RequestBodyPostApplicationJsonArrayOfUnionsRequestBody {
        public let dates: [Date]
        public let unions: [Shared.TypedObjectOneOf]

        /// Creates an object with the specified parameters
        ///
        ///
        public init(dates: [Date], unions: [Shared.TypedObjectOneOf]) {
            self.dates = dates
            self.unions = unions
        }
    }}

extension Operations.RequestBodyPostApplicationJsonArrayOfUnionsRequestBody: Codable {
    enum CodingKeys: String, CodingKey {
        case dates
        case unions
    }
}
