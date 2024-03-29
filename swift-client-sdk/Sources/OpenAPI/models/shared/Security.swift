// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import Foundation

extension Shared {
    /// Describes the available authentication methods when connecting to the API.
    ///
    /// > Note: Some API operations specify their own authentication methods. Refer to the documentation for each API operation to ensure you are passing the correct credentials.
    ///
    public enum Security {
        case apiKeyAuth(String)
        case apiKeyAuthNew(String)
        case oauth2(String)
    }
}
