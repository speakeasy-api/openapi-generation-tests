// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.


import Foundation

class _TelemetryAPI: TelemetryAPI {
    private let client: Client

    init(client: Client) {
        self.client = client
    }
    
    public func telemetrySpeakeasyUserAgentGet(request: Operations.TelemetrySpeakeasyUserAgentGetRequest) async throws -> Response<Operations.TelemetrySpeakeasyUserAgentGetResponse> {
        return try await client.makeRequest(
            configureRequest: { configuration in
                try configureTelemetrySpeakeasyUserAgentGetRequest(with: configuration, request: request)
            },
            handleResponse: handleTelemetrySpeakeasyUserAgentGetResponse
        )
    }
    
    public func telemetryUserAgentGet() async throws -> Response<Operations.TelemetryUserAgentGetResponse> {
        return try await client.makeRequest(
            configureRequest: { configuration in
                try configureTelemetryUserAgentGetRequest(with: configuration)
            },
            handleResponse: handleTelemetryUserAgentGetResponse
        )
    }

}

// MARK: - Request Configuration

private func configureTelemetrySpeakeasyUserAgentGetRequest(with configuration: URLRequestConfiguration, request: Operations.TelemetrySpeakeasyUserAgentGetRequest) throws {
    configuration.path = "/anything/telemetry/speakeasy-user-agent"
    configuration.method = .get
    configuration.headerParameterSerializable = request
    configuration.telemetryHeader = .speakeasyUserAgent
}

private func configureTelemetryUserAgentGetRequest(with configuration: URLRequestConfiguration) throws {
    configuration.path = "/anything/telemetry/user-agent"
    configuration.method = .get
    configuration.telemetryHeader = .speakeasyUserAgent
}

// MARK: - Response Handlers

private func handleTelemetrySpeakeasyUserAgentGetResponse(response: Client.APIResponse) throws -> Operations.TelemetrySpeakeasyUserAgentGetResponse {
    let httpResponse = response.httpResponse
    
    if httpResponse.statusCode == 200 { 
        if httpResponse.contentType.matchContentType(pattern: "application/json"), let data = response.data {
            do {
                return .res(try JSONDecoder().decode(Operations.TelemetrySpeakeasyUserAgentGetRes.self, from: data))
            } catch {
                throw ResponseHandlerError.failedToDecodeJSON(error)
            }
        }
    }

    return .empty
}

private func handleTelemetryUserAgentGetResponse(response: Client.APIResponse) throws -> Operations.TelemetryUserAgentGetResponse {
    let httpResponse = response.httpResponse
    
    if httpResponse.statusCode == 200 { 
        if httpResponse.contentType.matchContentType(pattern: "application/json"), let data = response.data {
            do {
                return .res(try JSONDecoder().decode(Operations.TelemetryUserAgentGetRes.self, from: data))
            } catch {
                throw ResponseHandlerError.failedToDecodeJSON(error)
            }
        }
    }

    return .empty
}

