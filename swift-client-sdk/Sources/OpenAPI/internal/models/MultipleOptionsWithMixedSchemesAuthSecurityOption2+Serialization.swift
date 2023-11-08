// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.


import Foundation

extension Operations.MultipleOptionsWithMixedSchemesAuthSecurityOption2: SecurityParameterProviding {
    func securityParameters() -> [SecurityParameter] {
        return [
            .httpBasic(username: basicAuth.username, password: basicAuth.password),
            .apiKey(name: "x-api-key", value: apiKeyAuthNew)
        ]
    }
}