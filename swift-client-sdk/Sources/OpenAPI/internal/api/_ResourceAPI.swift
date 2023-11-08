// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.


import Foundation

class _ResourceAPI: ResourceAPI {
    private let client: Client

    init(client: Client) {
        self.client = client
    }
    
    public func createFile(request: Operations.CreateFileRequestBody) async throws -> Response<Operations.CreateFileResponse> {
        return try await client.makeRequest(
            configureRequest: { configuration in
                try configureCreateFileRequest(with: configuration, request: request)
            },
            handleResponse: handleCreateFileResponse
        )
    }
    
    public func createResource(request: Shared.ExampleResource) async throws -> Response<Operations.CreateResourceResponse> {
        return try await client.makeRequest(
            configureRequest: { configuration in
                try configureCreateResourceRequest(with: configuration, request: request)
            },
            handleResponse: handleCreateResourceResponse
        )
    }
    
    public func deleteResource(request: Operations.DeleteResourceRequest) async throws -> Response<Operations.DeleteResourceResponse> {
        return try await client.makeRequest(
            configureRequest: { configuration in
                try configureDeleteResourceRequest(with: configuration, request: request)
            },
            handleResponse: handleDeleteResourceResponse
        )
    }
    
    public func getResource(request: Operations.GetResourceRequest) async throws -> Response<Operations.GetResourceResponse> {
        return try await client.makeRequest(
            configureRequest: { configuration in
                try configureGetResourceRequest(with: configuration, request: request)
            },
            handleResponse: handleGetResourceResponse
        )
    }
    
    public func updateResource(request: Operations.UpdateResourceRequest) async throws -> Response<Operations.UpdateResourceResponse> {
        return try await client.makeRequest(
            configureRequest: { configuration in
                try configureUpdateResourceRequest(with: configuration, request: request)
            },
            handleResponse: handleUpdateResourceResponse
        )
    }

}

// MARK: - Request Configuration

private func configureCreateFileRequest(with configuration: URLRequestConfiguration, request: Operations.CreateFileRequestBody) throws {
    configuration.path = "/fileResource"
    configuration.method = .post
    let (boundary, formData) = try serializeMultipartFormData(with: request)
    configuration.contentType = multipartContentType(with: boundary)
    configuration.body = formData
    if configuration.body == nil {
        throw SerializationError.missingRequiredRequestBody
    }
    configuration.telemetryHeader = .speakeasyUserAgent
}

private func configureCreateResourceRequest(with configuration: URLRequestConfiguration, request: Shared.ExampleResource) throws {
    configuration.path = "/resource"
    configuration.method = .post
    configuration.contentType = "application/json"
    configuration.body = try jsonEncoder().encode(request)
    if configuration.body == nil {
        throw SerializationError.missingRequiredRequestBody
    }
    configuration.telemetryHeader = .speakeasyUserAgent
}

private func configureDeleteResourceRequest(with configuration: URLRequestConfiguration, request: Operations.DeleteResourceRequest) throws {
    configuration.path = "/resource/{resourceId}"
    configuration.method = .delete
    configuration.pathParameterSerializable = request
    configuration.telemetryHeader = .speakeasyUserAgent
}

private func configureGetResourceRequest(with configuration: URLRequestConfiguration, request: Operations.GetResourceRequest) throws {
    configuration.path = "/resource/{resourceId}"
    configuration.method = .get
    configuration.pathParameterSerializable = request
    configuration.telemetryHeader = .speakeasyUserAgent
}

private func configureUpdateResourceRequest(with configuration: URLRequestConfiguration, request: Operations.UpdateResourceRequest) throws {
    configuration.path = "/resource/{resourceId}"
    configuration.method = .post
    configuration.pathParameterSerializable = request
    configuration.telemetryHeader = .speakeasyUserAgent
}

// MARK: - Response Handlers

private func handleCreateFileResponse(response: Client.APIResponse) throws -> Operations.CreateFileResponse {
    let httpResponse = response.httpResponse
    
    if httpResponse.statusCode == 200 { 
        if httpResponse.contentType.matchContentType(pattern: "application/json"), let data = response.data {
            do {
                return .fileResource(try JSONDecoder().decode(Shared.FileResource.self, from: data))
            } catch {
                throw ResponseHandlerError.failedToDecodeJSON(error)
            }
        }
    }

    return .empty
}

private func handleCreateResourceResponse(response: Client.APIResponse) throws -> Operations.CreateResourceResponse {
    let httpResponse = response.httpResponse
    
    if httpResponse.statusCode == 200 { 
        if httpResponse.contentType.matchContentType(pattern: "application/json"), let data = response.data {
            do {
                return .exampleResource(try JSONDecoder().decode(Shared.ExampleResource.self, from: data))
            } catch {
                throw ResponseHandlerError.failedToDecodeJSON(error)
            }
        }
    }

    return .empty
}

private func handleDeleteResourceResponse(response: Client.APIResponse) throws -> Operations.DeleteResourceResponse {
    let httpResponse = response.httpResponse
    
    if httpResponse.statusCode == 204 { 
        return .empty
    }

    return .empty
}

private func handleGetResourceResponse(response: Client.APIResponse) throws -> Operations.GetResourceResponse {
    let httpResponse = response.httpResponse
    
    if httpResponse.statusCode == 200 { 
        if httpResponse.contentType.matchContentType(pattern: "application/json"), let data = response.data {
            do {
                return .exampleResource(try JSONDecoder().decode(Shared.ExampleResource.self, from: data))
            } catch {
                throw ResponseHandlerError.failedToDecodeJSON(error)
            }
        }
    }

    return .empty
}

private func handleUpdateResourceResponse(response: Client.APIResponse) throws -> Operations.UpdateResourceResponse {
    let httpResponse = response.httpResponse
    
    if httpResponse.statusCode == 202 { 
        return .empty
    }

    return .empty
}
