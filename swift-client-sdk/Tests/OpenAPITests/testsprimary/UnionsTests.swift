// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

import XCTest
@testable import OpenAPI

class UnionsTests: XCTestCase {
    var client: Client!

    override func setUp() {
        client = Client(security: .apiKeyAuth("api_key_here"))
    }

    func testStronglyTypedOneOfPostBasic() async throws {
        try recordTest(named: "unions-strongly-typed-one-of-post-basic")

        let object = Shared.SimpleObjectWithType(
            any: AnyValue("any"),
            bool: true,
            date: createSampleDate(),
            dateTime: createSampleDate(),
            enum: .one,
            float32: 1.1,
            int: 1,
            int32: 1,
            int32Enum: .fiftyFive,
            intEnum: .second,
            num: 1.1,
            str: "test"
        )

        let response = try await client.unions.stronglyTypedOneOfPost(request: .simpleObjectWithType(object))
        XCTAssertEqual(response.statusCode, 200, "Request should succeed")
        XCTAssertEqual(try response.data.res().json, .simpleObjectWithType(object))
    }

    func testStronglyTypedOneOfPostDeep() async throws {
        try recordTest(named: "unions-strongly-typed-one-of-post-deep")

        let object = Shared.DeepObjectWithType(
            any: .simpleObject(createSimpleObject()),
            arr: [createSimpleObject(), createSimpleObject()],
            bool: true,
            int: 1,
            map: ["key": createSimpleObject()],
            num: 1.1,
            obj: createSimpleObject(),
            str: "test"
        )

        let response = try await client.unions.stronglyTypedOneOfPost(request: .deepObjectWithType(object))
        XCTAssertEqual(response.statusCode, 200, "Request should succeed")
        XCTAssertEqual(try response.data.res().json.deepObjectWithType().any, object.any)
        XCTAssertEqual(try response.data.res().json.deepObjectWithType().arr, object.arr)
        XCTAssertEqual(try response.data.res().json.deepObjectWithType().bool, object.bool)
        XCTAssertEqual(try response.data.res().json.deepObjectWithType().int, object.int)
        XCTAssertEqual(try response.data.res().json.deepObjectWithType().map, object.map)
        XCTAssertEqual(try response.data.res().json.deepObjectWithType().num, object.num)
        XCTAssertEqual(try response.data.res().json.deepObjectWithType().obj, object.obj)
        XCTAssertEqual(try response.data.res().json.deepObjectWithType().str, object.str)
    }

    func testWeaklyTypedOneOfPostBasic() async throws {
        try recordTest(named: "unions-weakly-typed-one-of-post-basic")

        let object = createSimpleObject()
        let response = try await client.unions.weaklyTypedOneOfPost(request: .simpleObject(object))
        XCTAssertEqual(response.statusCode, 200, "Request should succeed")
        XCTAssertEqual(try response.data.res().json, .simpleObject(object))
    }

    func testWeaklyTypedOneOfPostDeep() async throws {
        try recordTest(named: "unions-weakly-typed-one-of-post-deep")

        let object = try createDeepObject()
        let response = try await client.unions.weaklyTypedOneOfPost(request: .deepObject(object))
        XCTAssertEqual(response.statusCode, 200, "Request should succeed")
        XCTAssertEqual(try response.data.res().json.deepObject().any, object.any)
        XCTAssertEqual(try response.data.res().json.deepObject().arr, object.arr)
        XCTAssertEqual(try response.data.res().json.deepObject().bool, object.bool)
        XCTAssertEqual(try response.data.res().json.deepObject().int, object.int)
        XCTAssertEqual(try response.data.res().json.deepObject().map, object.map)
        XCTAssertEqual(try response.data.res().json.deepObject().num, object.num)
        XCTAssertEqual(try response.data.res().json.deepObject().obj, object.obj)
        XCTAssertEqual(try response.data.res().json.deepObject().str, object.str)
    }

    func testTypedObjectOneOfPostObj1() async throws {
        try recordTest(named: "unions-typed-object-one-of-post-obj1")

        let object = Shared.TypedObject1(type: .obj1, value: "")
        let response = try await client.unions.typedObjectOneOfPost(request: .typedObject1(object))
        XCTAssertEqual(response.statusCode, 200, "Request should succeed")
        XCTAssertEqual(try response.data.res().json, .typedObject1(object))
    }

    func testTypedObjectOneOfPostObj2() async throws {
        try recordTest(named: "unions-typed-object-one-of-post-obj2")

        let object = Shared.TypedObject2(type: .obj2, value: "")
        let response = try await client.unions.typedObjectOneOfPost(request: .typedObject2(object))
        XCTAssertEqual(response.statusCode, 200, "Request should succeed")
        XCTAssertEqual(try response.data.res().json, .typedObject2(object))
    }

    func testTypedObjectOneOfPostObj3() async throws {
        try recordTest(named: "unions-typed-object-one-of-post-obj3")

        let object = Shared.TypedObject3(type: .obj3, value: "")
        let response = try await client.unions.typedObjectOneOfPost(request: .typedObject3(object))
        XCTAssertEqual(response.statusCode, 200, "Request should succeed")
        XCTAssertEqual(try response.data.res().json, .typedObject3(object))
    }

    func testPrimitiveTypeOneOfPostString() async throws {
        try recordTest(named: "unions-primitive-type-one-of-post-string")

        let response = try await client.unions.primitiveTypeOneOfPost(request: .string("test"))
        XCTAssertEqual(response.statusCode, 200, "Request should succeed")
        XCTAssertEqual(try response.data.res().json, .string("test"))
    }

    func testPrimitiveTypeOneOfPostInteger() async throws {
        try recordTest(named: "unions-primitive-type-one-of-post-integer")

        let response = try await client.unions.primitiveTypeOneOfPost(request: .integer(111))
        XCTAssertEqual(response.statusCode, 200, "Request should succeed")
        XCTAssertEqual(try response.data.res().json, .integer(111))
    }

    func testPrimitiveTypeOneOfPostNumber() async throws {
        try recordTest(named: "unions-primitive-type-one-of-post-number")

        let response = try await client.unions.primitiveTypeOneOfPost(request: .number(22.2))
        XCTAssertEqual(response.statusCode, 200, "Request should succeed")
        XCTAssertEqual(try response.data.res().json, .number(22.2))
    }

    func testPrimitiveTypeOneOfPostBoolean() async throws {
        try recordTest(named: "unions-primitive-type-one-of-post-boolean")

        let response = try await client.unions.primitiveTypeOneOfPost(request: .bool(true))
        XCTAssertEqual(response.statusCode, 200, "Request should succeed")
        XCTAssertEqual(try response.data.res().json, .bool(true))
    }

    func testMixedTypeOneOfPostString() async throws {
        try recordTest(named: "unions-mixed-type-one-of-post-string")

        let response = try await client.unions.mixedTypeOneOfPost(request: .string("test"))
        XCTAssertEqual(response.statusCode, 200, "Request should succeed")
        XCTAssertEqual(try response.data.res().json, .string("test"))
    }

    func testMixedTypeOneOfPostInteger() async throws {
        try recordTest(named: "unions-mixed-type-one-of-post-integer")

        let response = try await client.unions.mixedTypeOneOfPost(request: .integer(111))
        XCTAssertEqual(response.statusCode, 200, "Request should succeed")
        XCTAssertEqual(try response.data.res().json, .integer(111))
    }

    func testMixedTypeOneOfPostObject() async throws {
        try recordTest(named: "unions-mixed-type-one-of-post-object")

        let object = createSimpleObject()
        let response = try await client.unions.mixedTypeOneOfPost(request: .simpleObject(object))
        XCTAssertEqual(response.statusCode, 200, "Request should succeed")
        XCTAssertEqual(try response.data.res().json, .simpleObject(object))
    }
}