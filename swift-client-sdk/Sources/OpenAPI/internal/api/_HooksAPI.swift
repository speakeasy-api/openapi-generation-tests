// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.


import Foundation

class _HooksAPI: HooksAPI {
    private let client: Client

    init(client: Client) {
        self.client = client
    }
    
    public func testHooks(request: Operations.TestHooksRequest) async throws -> Response<Operations.TestHooksResponse> {
        return try await client.makeRequest(
            configureRequest: { configuration in
                try configureTestHooksRequest(with: configuration, request: request)
            },
            handleResponse: handleTestHooksResponse
        )
    }
    
    public func testHooksAfterResponse() async throws -> Response<Operations.TestHooksAfterResponseResponse> {
        return try await client.makeRequest(
            configureRequest: { configuration in
                try configureTestHooksAfterResponseRequest(with: configuration)
            },
            handleResponse: handleTestHooksAfterResponseResponse
        )
    }
    
    public func testHooksError() async throws -> Response<Operations.TestHooksErrorResponse> {
        return try await client.makeRequest(
            configureRequest: { configuration in
                try configureTestHooksErrorRequest(with: configuration)
            },
            handleResponse: handleTestHooksErrorResponse
        )
    }

}

// MARK: - Request Configuration

private func configureTestHooksRequest(with configuration: URLRequestConfiguration, request: Operations.TestHooksRequest) throws {
    configuration.path = "/anything/hooks"
    configuration.method = .get
    configuration.queryParameterSerializable = request
    configuration.telemetryHeader = .speakeasyUserAgent
}

private func configureTestHooksAfterResponseRequest(with configuration: URLRequestConfiguration) throws {
    configuration.path = "/anything/hooks/afterResponseValidation"
    configuration.method = .get
    configuration.telemetryHeader = .speakeasyUserAgent
}

private func configureTestHooksErrorRequest(with configuration: URLRequestConfiguration) throws {
    configuration.path = "/status/400#testHooksError"
    configuration.method = .get
    configuration.telemetryHeader = .speakeasyUserAgent
}

// MARK: - Response Handlers

private func handleTestHooksResponse(response: Client.APIResponse) throws -> Operations.TestHooksResponse {
    let httpResponse = response.httpResponse
    
    if httpResponse.statusCode == 200 { 
        if httpResponse.contentType.matchContentType(pattern: "application/json"), let data = response.data {
            do {
                return .res(try JSONDecoder().decode(Operations.TestHooksRes.self, from: data))
            } catch {
                throw ResponseHandlerError.failedToDecodeJSON(error)
            }
        }
    }

    return .empty
}

private func handleTestHooksAfterResponseResponse(response: Client.APIResponse) throws -> Operations.TestHooksAfterResponseResponse {
    let httpResponse = response.httpResponse
    
    if httpResponse.statusCode == 200 { 
        return .empty
    }

    return .empty
}

private func handleTestHooksErrorResponse(response: Client.APIResponse) throws -> Operations.TestHooksErrorResponse {
    let httpResponse = response.httpResponse
    
    if [200, 400].contains(httpResponse.statusCode) { 
        return .empty
    }

    return .empty
}
