// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.


import Foundation

class _FlatteningAPI: FlatteningAPI {
    private let client: Client

    init(client: Client) {
        self.client = client
    }
    
    public func componentBodyAndParamConflict(request: Operations.ComponentBodyAndParamConflictRequest) async throws -> Response<Operations.ComponentBodyAndParamConflictResponse> {
        return try await client.makeRequest(
            configureRequest: { configuration in
                try configureComponentBodyAndParamConflictRequest(with: configuration, request: request)
            },
            handleResponse: handleComponentBodyAndParamConflictResponse
        )
    }
    
    public func componentBodyAndParamNoConflict(request: Operations.ComponentBodyAndParamNoConflictRequest) async throws -> Response<Operations.ComponentBodyAndParamNoConflictResponse> {
        return try await client.makeRequest(
            configureRequest: { configuration in
                try configureComponentBodyAndParamNoConflictRequest(with: configuration, request: request)
            },
            handleResponse: handleComponentBodyAndParamNoConflictResponse
        )
    }
    
    public func conflictingParams(request: Operations.ConflictingParamsRequest) async throws -> Response<Operations.ConflictingParamsResponse> {
        return try await client.makeRequest(
            configureRequest: { configuration in
                try configureConflictingParamsRequest(with: configuration, request: request)
            },
            handleResponse: handleConflictingParamsResponse
        )
    }
    
    public func inlineBodyAndParamConflict(request: Operations.InlineBodyAndParamConflictRequest) async throws -> Response<Operations.InlineBodyAndParamConflictResponse> {
        return try await client.makeRequest(
            configureRequest: { configuration in
                try configureInlineBodyAndParamConflictRequest(with: configuration, request: request)
            },
            handleResponse: handleInlineBodyAndParamConflictResponse
        )
    }
    
    public func inlineBodyAndParamNoConflict(request: Operations.InlineBodyAndParamNoConflictRequest) async throws -> Response<Operations.InlineBodyAndParamNoConflictResponse> {
        return try await client.makeRequest(
            configureRequest: { configuration in
                try configureInlineBodyAndParamNoConflictRequest(with: configuration, request: request)
            },
            handleResponse: handleInlineBodyAndParamNoConflictResponse
        )
    }

}

// MARK: - Request Configuration

private func configureComponentBodyAndParamConflictRequest(with configuration: URLRequestConfiguration, request: Operations.ComponentBodyAndParamConflictRequest) throws {
    configuration.path = "/anything/flattening/componentBodyAndParamConflict"
    configuration.method = .post
    configuration.queryParameterSerializable = request
    configuration.contentType = "application/json"
    configuration.body = try jsonEncoder().encode(request.simpleObject)
    if configuration.body == nil {
        throw SerializationError.missingRequiredRequestBody
    }
    configuration.telemetryHeader = .speakeasyUserAgent
}

private func configureComponentBodyAndParamNoConflictRequest(with configuration: URLRequestConfiguration, request: Operations.ComponentBodyAndParamNoConflictRequest) throws {
    configuration.path = "/anything/flattening/componentBodyAndParamNoConflict"
    configuration.method = .post
    configuration.queryParameterSerializable = request
    configuration.contentType = "application/json"
    configuration.body = try jsonEncoder().encode(request.simpleObject)
    if configuration.body == nil {
        throw SerializationError.missingRequiredRequestBody
    }
    configuration.telemetryHeader = .speakeasyUserAgent
}

private func configureConflictingParamsRequest(with configuration: URLRequestConfiguration, request: Operations.ConflictingParamsRequest) throws {
    configuration.path = "/anything/flattening/conflictingParams/{str}"
    configuration.method = .get
    configuration.pathParameterSerializable = request
    configuration.queryParameterSerializable = request
    configuration.telemetryHeader = .speakeasyUserAgent
}

private func configureInlineBodyAndParamConflictRequest(with configuration: URLRequestConfiguration, request: Operations.InlineBodyAndParamConflictRequest) throws {
    configuration.path = "/anything/flattening/inlineBodyAndParamConflict"
    configuration.method = .post
    configuration.queryParameterSerializable = request
    configuration.contentType = "application/json"
    configuration.body = try jsonEncoder().encode(request.requestBody)
    if configuration.body == nil {
        throw SerializationError.missingRequiredRequestBody
    }
    configuration.telemetryHeader = .speakeasyUserAgent
}

private func configureInlineBodyAndParamNoConflictRequest(with configuration: URLRequestConfiguration, request: Operations.InlineBodyAndParamNoConflictRequest) throws {
    configuration.path = "/anything/flattening/inlineBodyAndParamNoConflict"
    configuration.method = .post
    configuration.queryParameterSerializable = request
    configuration.contentType = "application/json"
    configuration.body = try jsonEncoder().encode(request.requestBody)
    if configuration.body == nil {
        throw SerializationError.missingRequiredRequestBody
    }
    configuration.telemetryHeader = .speakeasyUserAgent
}

// MARK: - Response Handlers

private func handleComponentBodyAndParamConflictResponse(response: Client.APIResponse) throws -> Operations.ComponentBodyAndParamConflictResponse {
    let httpResponse = response.httpResponse
    
    if httpResponse.statusCode == 200 { 
        if httpResponse.contentType.matchContentType(pattern: "application/json"), let data = response.data {
            do {
                return .res(try JSONDecoder().decode(Operations.ComponentBodyAndParamConflictRes.self, from: data))
            } catch {
                throw ResponseHandlerError.failedToDecodeJSON(error)
            }
        }
    }

    return .empty
}

private func handleComponentBodyAndParamNoConflictResponse(response: Client.APIResponse) throws -> Operations.ComponentBodyAndParamNoConflictResponse {
    let httpResponse = response.httpResponse
    
    if httpResponse.statusCode == 200 { 
        if httpResponse.contentType.matchContentType(pattern: "application/json"), let data = response.data {
            do {
                return .res(try JSONDecoder().decode(Operations.ComponentBodyAndParamNoConflictRes.self, from: data))
            } catch {
                throw ResponseHandlerError.failedToDecodeJSON(error)
            }
        }
    }

    return .empty
}

private func handleConflictingParamsResponse(response: Client.APIResponse) throws -> Operations.ConflictingParamsResponse {
    let httpResponse = response.httpResponse
    
    if httpResponse.statusCode == 200 { 
        if httpResponse.contentType.matchContentType(pattern: "application/json"), let data = response.data {
            do {
                return .res(try JSONDecoder().decode(Operations.ConflictingParamsRes.self, from: data))
            } catch {
                throw ResponseHandlerError.failedToDecodeJSON(error)
            }
        }
    }

    return .empty
}

private func handleInlineBodyAndParamConflictResponse(response: Client.APIResponse) throws -> Operations.InlineBodyAndParamConflictResponse {
    let httpResponse = response.httpResponse
    
    if httpResponse.statusCode == 200 { 
        if httpResponse.contentType.matchContentType(pattern: "application/json"), let data = response.data {
            do {
                return .res(try JSONDecoder().decode(Operations.InlineBodyAndParamConflictRes.self, from: data))
            } catch {
                throw ResponseHandlerError.failedToDecodeJSON(error)
            }
        }
    }

    return .empty
}

private func handleInlineBodyAndParamNoConflictResponse(response: Client.APIResponse) throws -> Operations.InlineBodyAndParamNoConflictResponse {
    let httpResponse = response.httpResponse
    
    if httpResponse.statusCode == 200 { 
        if httpResponse.contentType.matchContentType(pattern: "application/json"), let data = response.data {
            do {
                return .res(try JSONDecoder().decode(Operations.InlineBodyAndParamNoConflictRes.self, from: data))
            } catch {
                throw ResponseHandlerError.failedToDecodeJSON(error)
            }
        }
    }

    return .empty
}

