// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

import Foundation

extension Operations {
    /// OK
    public struct RetriesPostRetries {
        public let retries: Int

        /// Creates an object with the specified parameters
        ///
        ///
        public init(retries: Int) {
            self.retries = retries
        }
    }}

extension Operations.RetriesPostRetries: Codable {
    enum CodingKeys: String, CodingKey {
        case retries
    }
}
