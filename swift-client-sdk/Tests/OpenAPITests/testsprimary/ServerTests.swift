// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import XCTest
@testable import OpenAPI

class ServerTests: XCTestCase {
    var client: Client!

    override func setUp() {
        client = Client(security: .apiKeyAuth("api_key_here"))
    }

    func testSelectGlobalServerValid() async throws {
        try recordTest(named: "servers-select-global-server-valid")

        let response = try await client.servers.selectGlobalServer()
        XCTAssertEqual(response.statusCode, 200, "Request should succeed")
    }

    func testSelectGlobalServerBroken() async throws {
        try recordTest(named: "servers-select-global-server-broken")

        client.use(server: .server2)

        let expectation = expectation(description: "API call with invalid server should throw error")
        do {
            _ = try await client.servers.selectGlobalServer()
        } catch let error as OpenAPIError {
            if case .failedToMakeNetworkRequest(let networkError) = error {
                XCTAssertEqual((networkError as NSError).domain, NSURLErrorDomain)
                XCTAssertEqual((networkError as NSError).code, -1003)
                expectation.fulfill()
            } else {
                XCTFail("Expected error to be of type OpenAPIError.failedToMakeNetworkRequest()")
            }
        }

        // TODO: This can deadlock -- replace with `await fulfillment(...)` but this isn't supported on `macos-latest` in GH actions as it requires Xcode 14.3
        wait(for: [expectation], timeout: 3.0)
    }

    func testSelectServerWithIDDefault() async throws {
        try recordTest(named: "servers-select-server-with-id-default")

        client.use(server: .server1)

        let response = try await client.servers.selectServerWithID(server: nil)
        XCTAssertEqual(response.statusCode, 200, "Request should succeed")
    }

    func testSelectServerWithIDValid() async throws {
        try recordTest(named: "servers-select-server-with-id-valid")

        client.use(server: .server1)

        let response = try await client.servers.selectServerWithID(server: .valid)
        XCTAssertEqual(response.statusCode, 200, "Request should succeed")
    }

    func testSelectServerWithIDBroken() async throws {
        try recordTest(named: "servers-select-server-with-id-broken")

        client.use(server: .server1)

        let expectation = expectation(description: "API call with broken server URL should throw error")
        do {
            _ = try await client.servers.selectServerWithID(server: .broken)
        } catch let error as OpenAPIError {
            if case .failedToMakeNetworkRequest(let networkError) = error {
                XCTAssertEqual((networkError as NSError).domain, NSURLErrorDomain)
                XCTAssertEqual((networkError as NSError).code, -1003)
                expectation.fulfill()
            } else {
                XCTFail("Expected error to be of type OpenAPIError.failedToMakeNetworkRequest()")
            }
        }

        // TODO: This can deadlock -- replace with `await fulfillment(...)` but this isn't supported on `macos-latest` in GH actions as it requires Xcode 14.3
        wait(for: [expectation], timeout: 3.0)
    }

    func testServerWithTemplatesGlobal() async throws {
        try recordTest(named: "servers-server-with-templates-global")

        client.use(server: .server3(hostname: "localhost", port: "35123"))

        let response = try await client.servers.serverWithTemplatesGlobal()
        XCTAssertEqual(response.statusCode, 200, "Request should succeed")
    }

    func testServerWithTemplatesGlobalDefaults() async throws {
        try recordTest(named: "servers-server-with-templates-global-defaults")

        client.use(server: .server3())

        let response = try await client.servers.serverWithTemplatesGlobal()
        XCTAssertEqual(response.statusCode, 200, "Request should succeed")
    }

    func testServerWithTemplatesGlobalEnum() async throws {
        try recordTest(named: "servers-server-with-templates-global-enum")

        client.use(server: .server4(something: .somethingElseAgain))

        let response = try await client.servers.serverWithTemplatesGlobal()
        XCTAssertEqual(response.statusCode, 200, "Request should succeed")
    }

    func testServerWithTemplates() async throws {
        try recordTest(named: "servers-server-with-templates")

        let response = try await client.servers.serverWithTemplates(
            server: .server1(hostname: "localhost", port: "35123")
        )
        XCTAssertEqual(response.statusCode, 200, "Request should succeed")
    }

    func testServerWithTemplatesDefaults() async throws {
        try recordTest(named: "servers-server-with-templates-defaults")

        let response = try await client.servers.serverWithTemplates(server: nil)
        XCTAssertEqual(response.statusCode, 200, "Request should succeed")
    }

    func testServerByIDWithTemplates() async throws {
        try recordTest(named: "servers-server-by-id-with-templates")

        let response = try await client.servers.serversByIDWithTemplates(server: nil)
        XCTAssertEqual(response.statusCode, 200, "Request should succeed")
    }

    func testGlobalServerWithTemplatedProtocol() async throws {
        try recordTest(named: "servers-global-server-with-templated-protocol")

        client.use(server: .server5(hostname: "localhost", port: "35123", protocol: "http"))
        let response = try await client.servers.selectGlobalServer()
        XCTAssertEqual(response.statusCode, 200, "Request should succeed")
    }

    func testGlobalServerWithInvalidTemplatedProtocol() async throws {
        try recordTest(named: "servers-global-server-with-invalid-templated-protocol")

        client.use(server: .server5(hostname: "localhost", port: "35123", protocol: "invalid"))

        let expectation = expectation(description: "API call with invalid server URL should throw error")
        do {
            _ = try await client.servers.selectGlobalServer()
        } catch let error as OpenAPIError {
            if case .failedToMakeNetworkRequest(let networkError) = error {
                XCTAssertEqual((networkError as NSError).domain, NSURLErrorDomain)
                XCTAssertEqual((networkError as NSError).code, -1002)
                expectation.fulfill()
            } else {
                XCTFail("Expected error to be of type OpenAPIError.failedToMakeNetworkRequest()")
            }
        }

        // TODO: This can deadlock -- replace with `await fulfillment(...)` but this isn't supported on `macos-latest` in GH actions as it requires Xcode 14.3
        wait(for: [expectation], timeout: 3.0)
    }

    func testServerWithProtocolTemplate() async throws {
        try recordTest(named: "servers-server-with-protocol-template")

        let response = try await client.servers.serverWithProtocolTemplate(server: .main(hostname: "localhost", port: "35123", protocol: "http"))
        XCTAssertEqual(response.statusCode, 200, "Request should succeed")
    }

    func testServerWithInvalidProtocolTemplate() async throws {
        try recordTest(named: "servers-server-with-invalid-protocol-template")

        let expectation = expectation(description: "API call with invalid server URL should throw error")
        do {
            _ = try await client.servers.serverWithProtocolTemplate(server: .main(hostname: "localhost", port: "35123", protocol: "invalid"))
        } catch let error as OpenAPIError {
            if case .failedToMakeNetworkRequest(let networkError) = error {
                XCTAssertEqual((networkError as NSError).domain, NSURLErrorDomain)
                XCTAssertEqual((networkError as NSError).code, -1002)
                expectation.fulfill()
            } else {
                XCTFail("Expected error to be of type OpenAPIError.failedToMakeNetworkRequest()")
            }
        }

        // TODO: This can deadlock -- replace with `await fulfillment(...)` but this isn't supported on `macos-latest` in GH actions as it requires Xcode 14.3
        wait(for: [expectation], timeout: 3.0)
    }
}