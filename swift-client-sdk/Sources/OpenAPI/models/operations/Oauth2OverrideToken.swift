// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Operations {
    /// Successful authentication.
    public struct Oauth2OverrideToken {
        public let authenticated: Bool
        public let token: String

        /// Creates an object with the specified parameters
        ///
        ///
        public init(authenticated: Bool, token: String) {
            self.authenticated = authenticated
            self.token = token
        }
    }
}

extension Operations.Oauth2OverrideToken: Codable {
    enum CodingKeys: String, CodingKey {
        case authenticated
        case token
    }
}

