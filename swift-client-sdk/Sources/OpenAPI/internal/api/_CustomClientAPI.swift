// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.


import Foundation

class _CustomClientAPI: CustomClientAPI {
    private let client: Client

    init(client: Client) {
        self.client = client
    }
    
    public func customClientPost(request: Operations.CustomClientPostRequest) async throws -> Response<Operations.CustomClientPostResponse> {
        return try await client.makeRequest(
            configureRequest: { configuration in
                try configureCustomClientPostRequest(with: configuration, request: request)
            },
            handleResponse: handleCustomClientPostResponse
        )
    }

}

// MARK: - Request Configuration

private func configureCustomClientPostRequest(with configuration: URLRequestConfiguration, request: Operations.CustomClientPostRequest) throws {
    configuration.path = "/anything/customClient/{pathParam}"
    configuration.method = .post
    configuration.pathParameterSerializable = request
    configuration.queryParameterSerializable = request
    configuration.headerParameterSerializable = request
    configuration.contentType = "application/json"
    configuration.body = try jsonEncoder().encode(request.simpleObject)
    configuration.telemetryHeader = .speakeasyUserAgent
}

// MARK: - Response Handlers

private func handleCustomClientPostResponse(response: Client.APIResponse) throws -> Operations.CustomClientPostResponse {
    let httpResponse = response.httpResponse
    
    if httpResponse.statusCode == 200 { 
        if httpResponse.contentType.matchContentType(pattern: "application/json"), let data = response.data {
            do {
                return .res(try JSONDecoder().decode(Operations.CustomClientPostRes.self, from: data))
            } catch {
                throw ResponseHandlerError.failedToDecodeJSON(error)
            }
        }
    }

    return .empty
}
