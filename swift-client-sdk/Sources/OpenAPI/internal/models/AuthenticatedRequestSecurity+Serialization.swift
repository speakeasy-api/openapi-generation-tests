// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.


import Foundation

extension Operations.AuthenticatedRequestSecurity: SecurityParameterProviding {
    func securityParameters() -> [SecurityParameter] {
        switch self {
        case .clientCredentials(let value):
            return [.oauth2(name: "Authorization", value: value)]
        }
    }
}