// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.


import Foundation

class _UnionsAPI: UnionsAPI {
    private let client: Client

    init(client: Client) {
        self.client = client
    }
    
    public func flattenedTypedObjectPost(request: Shared.FlattenedTypedObject1) async throws -> Response<Operations.FlattenedTypedObjectPostResponse> {
        return try await client.makeRequest(
            configureRequest: { configuration in
                try configureFlattenedTypedObjectPostRequest(with: configuration, request: request)
            },
            handleResponse: handleFlattenedTypedObjectPostResponse
        )
    }
    
    public func mixedTypeOneOfPost(request: Operations.MixedTypeOneOfPostRequestBody) async throws -> Response<Operations.MixedTypeOneOfPostResponse> {
        return try await client.makeRequest(
            configureRequest: { configuration in
                try configureMixedTypeOneOfPostRequest(with: configuration, request: request)
            },
            handleResponse: handleMixedTypeOneOfPostResponse
        )
    }
    
    public func nullableOneOfRefInObjectPost(request: Shared.NullableOneOfRefInObject) async throws -> Response<Operations.NullableOneOfRefInObjectPostResponse> {
        return try await client.makeRequest(
            configureRequest: { configuration in
                try configureNullableOneOfRefInObjectPostRequest(with: configuration, request: request)
            },
            handleResponse: handleNullableOneOfRefInObjectPostResponse
        )
    }
    
    public func nullableOneOfSchemaPost(request: Operations.NullableOneOfSchemaPostRequestBody) async throws -> Response<Operations.NullableOneOfSchemaPostResponse> {
        return try await client.makeRequest(
            configureRequest: { configuration in
                try configureNullableOneOfSchemaPostRequest(with: configuration, request: request)
            },
            handleResponse: handleNullableOneOfSchemaPostResponse
        )
    }
    
    public func nullableOneOfTypeInObjectPost(request: Shared.NullableOneOfTypeInObject) async throws -> Response<Operations.NullableOneOfTypeInObjectPostResponse> {
        return try await client.makeRequest(
            configureRequest: { configuration in
                try configureNullableOneOfTypeInObjectPostRequest(with: configuration, request: request)
            },
            handleResponse: handleNullableOneOfTypeInObjectPostResponse
        )
    }
    
    public func nullableTypedObjectPost(request: Shared.TypedObject1) async throws -> Response<Operations.NullableTypedObjectPostResponse> {
        return try await client.makeRequest(
            configureRequest: { configuration in
                try configureNullableTypedObjectPostRequest(with: configuration, request: request)
            },
            handleResponse: handleNullableTypedObjectPostResponse
        )
    }
    
    public func primitiveTypeOneOfPost(request: Operations.PrimitiveTypeOneOfPostRequestBody) async throws -> Response<Operations.PrimitiveTypeOneOfPostResponse> {
        return try await client.makeRequest(
            configureRequest: { configuration in
                try configurePrimitiveTypeOneOfPostRequest(with: configuration, request: request)
            },
            handleResponse: handlePrimitiveTypeOneOfPostResponse
        )
    }
    
    public func stronglyTypedOneOfPost(request: Shared.StronglyTypedOneOfObject) async throws -> Response<Operations.StronglyTypedOneOfPostResponse> {
        return try await client.makeRequest(
            configureRequest: { configuration in
                try configureStronglyTypedOneOfPostRequest(with: configuration, request: request)
            },
            handleResponse: handleStronglyTypedOneOfPostResponse
        )
    }
    
    public func typedObjectNullableOneOfPost(request: Shared.TypedObjectNullableOneOf) async throws -> Response<Operations.TypedObjectNullableOneOfPostResponse> {
        return try await client.makeRequest(
            configureRequest: { configuration in
                try configureTypedObjectNullableOneOfPostRequest(with: configuration, request: request)
            },
            handleResponse: handleTypedObjectNullableOneOfPostResponse
        )
    }
    
    public func typedObjectOneOfPost(request: Shared.TypedObjectOneOf) async throws -> Response<Operations.TypedObjectOneOfPostResponse> {
        return try await client.makeRequest(
            configureRequest: { configuration in
                try configureTypedObjectOneOfPostRequest(with: configuration, request: request)
            },
            handleResponse: handleTypedObjectOneOfPostResponse
        )
    }
    
    public func unionBigIntDecimal(request: Operations.UnionBigIntDecimalRequestBody) async throws -> Response<Operations.UnionBigIntDecimalResponse> {
        return try await client.makeRequest(
            configureRequest: { configuration in
                try configureUnionBigIntDecimalRequest(with: configuration, request: request)
            },
            handleResponse: handleUnionBigIntDecimalResponse
        )
    }
    
    public func unionDateNull(request: Date) async throws -> Response<Operations.UnionDateNullResponse> {
        return try await client.makeRequest(
            configureRequest: { configuration in
                try configureUnionDateNullRequest(with: configuration, request: request)
            },
            handleResponse: handleUnionDateNullResponse
        )
    }
    
    public func unionDateTimeBigInt(request: Operations.UnionDateTimeBigIntRequestBody) async throws -> Response<Operations.UnionDateTimeBigIntResponse> {
        return try await client.makeRequest(
            configureRequest: { configuration in
                try configureUnionDateTimeBigIntRequest(with: configuration, request: request)
            },
            handleResponse: handleUnionDateTimeBigIntResponse
        )
    }
    
    public func unionDateTimeNull(request: Date) async throws -> Response<Operations.UnionDateTimeNullResponse> {
        return try await client.makeRequest(
            configureRequest: { configuration in
                try configureUnionDateTimeNullRequest(with: configuration, request: request)
            },
            handleResponse: handleUnionDateTimeNullResponse
        )
    }
    
    public func weaklyTypedOneOfPost(request: Shared.WeaklyTypedOneOfObject) async throws -> Response<Operations.WeaklyTypedOneOfPostResponse> {
        return try await client.makeRequest(
            configureRequest: { configuration in
                try configureWeaklyTypedOneOfPostRequest(with: configuration, request: request)
            },
            handleResponse: handleWeaklyTypedOneOfPostResponse
        )
    }

}

// MARK: - Request Configuration

private func configureFlattenedTypedObjectPostRequest(with configuration: URLRequestConfiguration, request: Shared.FlattenedTypedObject1) throws {
    configuration.path = "/anything/flattenedTypedObject"
    configuration.method = .post
    configuration.contentType = "application/json"
    configuration.body = try jsonEncoder().encode(request)
    if configuration.body == nil {
        throw SerializationError.missingRequiredRequestBody
    }
    configuration.telemetryHeader = .speakeasyUserAgent
}

private func configureMixedTypeOneOfPostRequest(with configuration: URLRequestConfiguration, request: Operations.MixedTypeOneOfPostRequestBody) throws {
    configuration.path = "/anything/mixedTypeOneOf"
    configuration.method = .post
    configuration.contentType = "application/json"
    configuration.body = try jsonEncoder().encode(request)
    if configuration.body == nil {
        throw SerializationError.missingRequiredRequestBody
    }
    configuration.telemetryHeader = .speakeasyUserAgent
}

private func configureNullableOneOfRefInObjectPostRequest(with configuration: URLRequestConfiguration, request: Shared.NullableOneOfRefInObject) throws {
    configuration.path = "/anything/nullableOneOfRefInObject"
    configuration.method = .post
    configuration.contentType = "application/json"
    configuration.body = try jsonEncoder().encode(request)
    if configuration.body == nil {
        throw SerializationError.missingRequiredRequestBody
    }
    configuration.telemetryHeader = .speakeasyUserAgent
}

private func configureNullableOneOfSchemaPostRequest(with configuration: URLRequestConfiguration, request: Operations.NullableOneOfSchemaPostRequestBody) throws {
    configuration.path = "/anything/nullableOneOfSchema"
    configuration.method = .post
    configuration.contentType = "application/json"
    configuration.body = try jsonEncoder().encode(request)
    if configuration.body == nil {
        throw SerializationError.missingRequiredRequestBody
    }
    configuration.telemetryHeader = .speakeasyUserAgent
}

private func configureNullableOneOfTypeInObjectPostRequest(with configuration: URLRequestConfiguration, request: Shared.NullableOneOfTypeInObject) throws {
    configuration.path = "/anything/nullableOneOfInObject"
    configuration.method = .post
    configuration.contentType = "application/json"
    configuration.body = try jsonEncoder().encode(request)
    if configuration.body == nil {
        throw SerializationError.missingRequiredRequestBody
    }
    configuration.telemetryHeader = .speakeasyUserAgent
}

private func configureNullableTypedObjectPostRequest(with configuration: URLRequestConfiguration, request: Shared.TypedObject1) throws {
    configuration.path = "/anything/nullableTypedObject"
    configuration.method = .post
    configuration.contentType = "application/json"
    configuration.body = try jsonEncoder().encode(request)
    if configuration.body == nil {
        throw SerializationError.missingRequiredRequestBody
    }
    configuration.telemetryHeader = .speakeasyUserAgent
}

private func configurePrimitiveTypeOneOfPostRequest(with configuration: URLRequestConfiguration, request: Operations.PrimitiveTypeOneOfPostRequestBody) throws {
    configuration.path = "/anything/primitiveTypeOneOf"
    configuration.method = .post
    configuration.contentType = "application/json"
    configuration.body = try jsonEncoder().encode(request)
    if configuration.body == nil {
        throw SerializationError.missingRequiredRequestBody
    }
    configuration.telemetryHeader = .speakeasyUserAgent
}

private func configureStronglyTypedOneOfPostRequest(with configuration: URLRequestConfiguration, request: Shared.StronglyTypedOneOfObject) throws {
    configuration.path = "/anything/stronglyTypedOneOf"
    configuration.method = .post
    configuration.contentType = "application/json"
    configuration.body = try jsonEncoder().encode(request)
    if configuration.body == nil {
        throw SerializationError.missingRequiredRequestBody
    }
    configuration.telemetryHeader = .speakeasyUserAgent
}

private func configureTypedObjectNullableOneOfPostRequest(with configuration: URLRequestConfiguration, request: Shared.TypedObjectNullableOneOf) throws {
    configuration.path = "/anything/typedObjectNullableOneOf"
    configuration.method = .post
    configuration.contentType = "application/json"
    configuration.body = try jsonEncoder().encode(request)
    if configuration.body == nil {
        throw SerializationError.missingRequiredRequestBody
    }
    configuration.telemetryHeader = .speakeasyUserAgent
}

private func configureTypedObjectOneOfPostRequest(with configuration: URLRequestConfiguration, request: Shared.TypedObjectOneOf) throws {
    configuration.path = "/anything/typedObjectOneOf"
    configuration.method = .post
    configuration.contentType = "application/json"
    configuration.body = try jsonEncoder().encode(request)
    if configuration.body == nil {
        throw SerializationError.missingRequiredRequestBody
    }
    configuration.telemetryHeader = .speakeasyUserAgent
}

private func configureUnionBigIntDecimalRequest(with configuration: URLRequestConfiguration, request: Operations.UnionBigIntDecimalRequestBody) throws {
    configuration.path = "/anything/unionBigIntDecimal"
    configuration.method = .post
    configuration.contentType = "application/json"
    configuration.body = try jsonEncoder().encode(request)
    if configuration.body == nil {
        throw SerializationError.missingRequiredRequestBody
    }
    configuration.telemetryHeader = .speakeasyUserAgent
}

private func configureUnionDateNullRequest(with configuration: URLRequestConfiguration, request: Date) throws {
    configuration.path = "/anything/unionDateNull"
    configuration.method = .post
    configuration.contentType = "application/json"
    configuration.body = try jsonEncoder().encode(request)
    if configuration.body == nil {
        throw SerializationError.missingRequiredRequestBody
    }
    configuration.telemetryHeader = .speakeasyUserAgent
}

private func configureUnionDateTimeBigIntRequest(with configuration: URLRequestConfiguration, request: Operations.UnionDateTimeBigIntRequestBody) throws {
    configuration.path = "/anything/unionDateTimeBigInt"
    configuration.method = .post
    configuration.contentType = "application/json"
    configuration.body = try jsonEncoder().encode(request)
    if configuration.body == nil {
        throw SerializationError.missingRequiredRequestBody
    }
    configuration.telemetryHeader = .speakeasyUserAgent
}

private func configureUnionDateTimeNullRequest(with configuration: URLRequestConfiguration, request: Date) throws {
    configuration.path = "/anything/unionDateTimeNull"
    configuration.method = .post
    configuration.contentType = "application/json"
    configuration.body = try jsonEncoder().encode(request)
    if configuration.body == nil {
        throw SerializationError.missingRequiredRequestBody
    }
    configuration.telemetryHeader = .speakeasyUserAgent
}

private func configureWeaklyTypedOneOfPostRequest(with configuration: URLRequestConfiguration, request: Shared.WeaklyTypedOneOfObject) throws {
    configuration.path = "/anything/weaklyTypedOneOf"
    configuration.method = .post
    configuration.contentType = "application/json"
    configuration.body = try jsonEncoder().encode(request)
    if configuration.body == nil {
        throw SerializationError.missingRequiredRequestBody
    }
    configuration.telemetryHeader = .speakeasyUserAgent
}

// MARK: - Response Handlers

private func handleFlattenedTypedObjectPostResponse(response: Client.APIResponse) throws -> Operations.FlattenedTypedObjectPostResponse {
    let httpResponse = response.httpResponse
    
    if httpResponse.statusCode == 200 { 
        if httpResponse.contentType.matchContentType(pattern: "application/json"), let data = response.data {
            do {
                return .res(try JSONDecoder().decode(Operations.FlattenedTypedObjectPostRes.self, from: data))
            } catch {
                throw ResponseHandlerError.failedToDecodeJSON(error)
            }
        }
    }

    return .empty
}

private func handleMixedTypeOneOfPostResponse(response: Client.APIResponse) throws -> Operations.MixedTypeOneOfPostResponse {
    let httpResponse = response.httpResponse
    
    if httpResponse.statusCode == 200 { 
        if httpResponse.contentType.matchContentType(pattern: "application/json"), let data = response.data {
            do {
                return .res(try JSONDecoder().decode(Operations.MixedTypeOneOfPostRes.self, from: data))
            } catch {
                throw ResponseHandlerError.failedToDecodeJSON(error)
            }
        }
    }

    return .empty
}

private func handleNullableOneOfRefInObjectPostResponse(response: Client.APIResponse) throws -> Operations.NullableOneOfRefInObjectPostResponse {
    let httpResponse = response.httpResponse
    
    if httpResponse.statusCode == 200 { 
        if httpResponse.contentType.matchContentType(pattern: "application/json"), let data = response.data {
            do {
                return .res(try JSONDecoder().decode(Operations.NullableOneOfRefInObjectPostRes.self, from: data))
            } catch {
                throw ResponseHandlerError.failedToDecodeJSON(error)
            }
        }
    }

    return .empty
}

private func handleNullableOneOfSchemaPostResponse(response: Client.APIResponse) throws -> Operations.NullableOneOfSchemaPostResponse {
    let httpResponse = response.httpResponse
    
    if httpResponse.statusCode == 200 { 
        if httpResponse.contentType.matchContentType(pattern: "application/json"), let data = response.data {
            do {
                return .res(try JSONDecoder().decode(Operations.NullableOneOfSchemaPostRes.self, from: data))
            } catch {
                throw ResponseHandlerError.failedToDecodeJSON(error)
            }
        }
    }

    return .empty
}

private func handleNullableOneOfTypeInObjectPostResponse(response: Client.APIResponse) throws -> Operations.NullableOneOfTypeInObjectPostResponse {
    let httpResponse = response.httpResponse
    
    if httpResponse.statusCode == 200 { 
        if httpResponse.contentType.matchContentType(pattern: "application/json"), let data = response.data {
            do {
                return .res(try JSONDecoder().decode(Operations.NullableOneOfTypeInObjectPostRes.self, from: data))
            } catch {
                throw ResponseHandlerError.failedToDecodeJSON(error)
            }
        }
    }

    return .empty
}

private func handleNullableTypedObjectPostResponse(response: Client.APIResponse) throws -> Operations.NullableTypedObjectPostResponse {
    let httpResponse = response.httpResponse
    
    if httpResponse.statusCode == 200 { 
        if httpResponse.contentType.matchContentType(pattern: "application/json"), let data = response.data {
            do {
                return .res(try JSONDecoder().decode(Operations.NullableTypedObjectPostRes.self, from: data))
            } catch {
                throw ResponseHandlerError.failedToDecodeJSON(error)
            }
        }
    }

    return .empty
}

private func handlePrimitiveTypeOneOfPostResponse(response: Client.APIResponse) throws -> Operations.PrimitiveTypeOneOfPostResponse {
    let httpResponse = response.httpResponse
    
    if httpResponse.statusCode == 200 { 
        if httpResponse.contentType.matchContentType(pattern: "application/json"), let data = response.data {
            do {
                return .res(try JSONDecoder().decode(Operations.PrimitiveTypeOneOfPostRes.self, from: data))
            } catch {
                throw ResponseHandlerError.failedToDecodeJSON(error)
            }
        }
    }

    return .empty
}

private func handleStronglyTypedOneOfPostResponse(response: Client.APIResponse) throws -> Operations.StronglyTypedOneOfPostResponse {
    let httpResponse = response.httpResponse
    
    if httpResponse.statusCode == 200 { 
        if httpResponse.contentType.matchContentType(pattern: "application/json"), let data = response.data {
            do {
                return .res(try JSONDecoder().decode(Operations.StronglyTypedOneOfPostRes.self, from: data))
            } catch {
                throw ResponseHandlerError.failedToDecodeJSON(error)
            }
        }
    }

    return .empty
}

private func handleTypedObjectNullableOneOfPostResponse(response: Client.APIResponse) throws -> Operations.TypedObjectNullableOneOfPostResponse {
    let httpResponse = response.httpResponse
    
    if httpResponse.statusCode == 200 { 
        if httpResponse.contentType.matchContentType(pattern: "application/json"), let data = response.data {
            do {
                return .res(try JSONDecoder().decode(Operations.TypedObjectNullableOneOfPostRes.self, from: data))
            } catch {
                throw ResponseHandlerError.failedToDecodeJSON(error)
            }
        }
    }

    return .empty
}

private func handleTypedObjectOneOfPostResponse(response: Client.APIResponse) throws -> Operations.TypedObjectOneOfPostResponse {
    let httpResponse = response.httpResponse
    
    if httpResponse.statusCode == 200 { 
        if httpResponse.contentType.matchContentType(pattern: "application/json"), let data = response.data {
            do {
                return .res(try JSONDecoder().decode(Operations.TypedObjectOneOfPostRes.self, from: data))
            } catch {
                throw ResponseHandlerError.failedToDecodeJSON(error)
            }
        }
    }

    return .empty
}

private func handleUnionBigIntDecimalResponse(response: Client.APIResponse) throws -> Operations.UnionBigIntDecimalResponse {
    let httpResponse = response.httpResponse
    
    if httpResponse.statusCode == 200 { 
        if httpResponse.contentType.matchContentType(pattern: "application/json"), let data = response.data {
            do {
                return .res(try JSONDecoder().decode(Operations.UnionBigIntDecimalRes.self, from: data))
            } catch {
                throw ResponseHandlerError.failedToDecodeJSON(error)
            }
        }
    }

    return .empty
}

private func handleUnionDateNullResponse(response: Client.APIResponse) throws -> Operations.UnionDateNullResponse {
    let httpResponse = response.httpResponse
    
    if httpResponse.statusCode == 200 { 
        if httpResponse.contentType.matchContentType(pattern: "application/json"), let data = response.data {
            do {
                return .res(try JSONDecoder().decode(Operations.UnionDateNullRes.self, from: data))
            } catch {
                throw ResponseHandlerError.failedToDecodeJSON(error)
            }
        }
    }

    return .empty
}

private func handleUnionDateTimeBigIntResponse(response: Client.APIResponse) throws -> Operations.UnionDateTimeBigIntResponse {
    let httpResponse = response.httpResponse
    
    if httpResponse.statusCode == 200 { 
        if httpResponse.contentType.matchContentType(pattern: "application/json"), let data = response.data {
            do {
                return .res(try JSONDecoder().decode(Operations.UnionDateTimeBigIntRes.self, from: data))
            } catch {
                throw ResponseHandlerError.failedToDecodeJSON(error)
            }
        }
    }

    return .empty
}

private func handleUnionDateTimeNullResponse(response: Client.APIResponse) throws -> Operations.UnionDateTimeNullResponse {
    let httpResponse = response.httpResponse
    
    if httpResponse.statusCode == 200 { 
        if httpResponse.contentType.matchContentType(pattern: "application/json"), let data = response.data {
            do {
                return .res(try JSONDecoder().decode(Operations.UnionDateTimeNullRes.self, from: data))
            } catch {
                throw ResponseHandlerError.failedToDecodeJSON(error)
            }
        }
    }

    return .empty
}

private func handleWeaklyTypedOneOfPostResponse(response: Client.APIResponse) throws -> Operations.WeaklyTypedOneOfPostResponse {
    let httpResponse = response.httpResponse
    
    if httpResponse.statusCode == 200 { 
        if httpResponse.contentType.matchContentType(pattern: "application/json"), let data = response.data {
            do {
                return .res(try JSONDecoder().decode(Operations.WeaklyTypedOneOfPostRes.self, from: data))
            } catch {
                throw ResponseHandlerError.failedToDecodeJSON(error)
            }
        }
    }

    return .empty
}
