// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.


import Foundation

extension Shared.SchemeBasicAuth: SecurityParameterProviding {
    func securityParameters() -> [SecurityParameter] {
        return [
            .httpBasic(username: self.username, password: self.password),
        ]
    }
}
