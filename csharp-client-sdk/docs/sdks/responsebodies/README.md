# ResponseBodies
(*ResponseBodies*)

## Overview

Endpoints for testing response bodies.

### Available Operations

* [ResponseBodyAdditionalPropertiesComplexNumbersPost](#responsebodyadditionalpropertiescomplexnumberspost)
* [ResponseBodyAdditionalPropertiesDatePost](#responsebodyadditionalpropertiesdatepost)
* [ResponseBodyAdditionalPropertiesObjectPost](#responsebodyadditionalpropertiesobjectpost)
* [ResponseBodyAdditionalPropertiesPost](#responsebodyadditionalpropertiespost)
* [ResponseBodyBytesGet](#responsebodybytesget)
* [ResponseBodyEmptyWithHeaders](#responsebodyemptywithheaders)
* [ResponseBodyOptionalGet](#responsebodyoptionalget)
* [ResponseBodyReadOnly](#responsebodyreadonly)
* [ResponseBodyStringGet](#responsebodystringget)
* [ResponseBodyXmlGet](#responsebodyxmlget)
* [ResponseBodyZeroValueComplexTypePtrsPost](#responsebodyzerovaluecomplextypeptrspost)

## ResponseBodyAdditionalPropertiesComplexNumbersPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.ResponseBodies.ResponseBodyAdditionalPropertiesComplexNumbersPostAsync(new Dictionary<string, BigInteger>() {
    { "key", 468801 },
});

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | Dictionary<String, *BigInteger*>           | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[ResponseBodyAdditionalPropertiesComplexNumbersPostResponse](../../Models/Operations/ResponseBodyAdditionalPropertiesComplexNumbersPostResponse.md)**


## ResponseBodyAdditionalPropertiesDatePost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.ResponseBodies.ResponseBodyAdditionalPropertiesDatePostAsync(new Dictionary<string, LocalDate>() {
    { "key", LocalDate.FromDateTime(System.DateTime.Parse("2021-03-16")) },
});

// handle response
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | Dictionary<String, [LocalDate](https://nodatime.org/3.1.x/api/NodaTime.LocalDate.html)> | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |


### Response

**[ResponseBodyAdditionalPropertiesDatePostResponse](../../Models/Operations/ResponseBodyAdditionalPropertiesDatePostResponse.md)**


## ResponseBodyAdditionalPropertiesObjectPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.ResponseBodies.ResponseBodyAdditionalPropertiesObjectPostAsync(new Dictionary<string, SimpleObject>() {
    { "key", new SimpleObject() {
        Any = "any",
        Bool = true,
        Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
        DateTime = System.DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
        Enum = Enum.One,
        Float32 = 1.1F,
        Int = 1,
        Int32 = 1,
        Int32Enum = Int32Enum.FiftyFive,
        IntEnum = IntEnum.Two,
        Num = 1.1D,
        Str = "test",
        Bigint = 8821239038968084,
        BigintStr = 9223372036854775808,
        BoolOpt = true,
        Decimal = 3.141592653589793M,
        DecimalStr = 3.14159265358979344719667586M,
        StrOpt = "testOptional",
    } },
});

// handle response
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | Dictionary<String, [SimpleObject](../../Models/Shared/SimpleObject.md)> | :heavy_check_mark:                                                      | The request object to use for the request.                              |


### Response

**[ResponseBodyAdditionalPropertiesObjectPostResponse](../../Models/Operations/ResponseBodyAdditionalPropertiesObjectPostResponse.md)**


## ResponseBodyAdditionalPropertiesPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.ResponseBodies.ResponseBodyAdditionalPropertiesPostAsync(new Dictionary<string, string>() {
    { "key", "string" },
});

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | Dictionary<String, *string*>               | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[ResponseBodyAdditionalPropertiesPostResponse](../../Models/Operations/ResponseBodyAdditionalPropertiesPostResponse.md)**


## ResponseBodyBytesGet

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.ResponseBodies.ResponseBodyBytesGetAsync();

// handle response
```


### Response

**[ResponseBodyBytesGetResponse](../../Models/Operations/ResponseBodyBytesGetResponse.md)**


## ResponseBodyEmptyWithHeaders

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.ResponseBodies.ResponseBodyEmptyWithHeadersAsync(1751.8D, "string");

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `XNumberHeader`    | *double*           | :heavy_check_mark: | N/A                |
| `XStringHeader`    | *string*           | :heavy_check_mark: | N/A                |


### Response

**[ResponseBodyEmptyWithHeadersResponse](../../Models/Operations/ResponseBodyEmptyWithHeadersResponse.md)**


## ResponseBodyOptionalGet

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.ResponseBodies.ResponseBodyOptionalGetAsync();

// handle response
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[ResponseBodyOptionalGetResponse](../../Models/Operations/ResponseBodyOptionalGetResponse.md)**


## ResponseBodyReadOnly

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.ResponseBodies.ResponseBodyReadOnlyAsync();

// handle response
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[ResponseBodyReadOnlyResponse](../../Models/Operations/ResponseBodyReadOnlyResponse.md)**


## ResponseBodyStringGet

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.ResponseBodies.ResponseBodyStringGetAsync();

// handle response
```


### Response

**[ResponseBodyStringGetResponse](../../Models/Operations/ResponseBodyStringGetResponse.md)**


## ResponseBodyXmlGet

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.ResponseBodies.ResponseBodyXmlGetAsync();

// handle response
```


### Response

**[ResponseBodyXmlGetResponse](../../Models/Operations/ResponseBodyXmlGetResponse.md)**


## ResponseBodyZeroValueComplexTypePtrsPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.ResponseBodies.ResponseBodyZeroValueComplexTypePtrsPostAsync(new ObjWithZeroValueComplexTypePtrs() {
    Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
    DateTime = System.DateTime.Parse("2020-01-01T00:00:00Z"),
});

// handle response
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ObjWithZeroValueComplexTypePtrs](../../Models/Shared/ObjWithZeroValueComplexTypePtrs.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |


### Response

**[ResponseBodyZeroValueComplexTypePtrsPostResponse](../../Models/Operations/ResponseBodyZeroValueComplexTypePtrsPostResponse.md)**

