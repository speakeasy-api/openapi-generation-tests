# ResponseBodies
(*ResponseBodies*)

## Overview

Endpoints for testing response bodies.

### Available Operations

* [FlattenedEnvelopePaginationResponse](#flattenedenvelopepaginationresponse)
* [FlattenedEnvelopeResponse](#flattenedenveloperesponse)
* [FlattenedEnvelopeUnionResponse](#flattenedenvelopeunionresponse)
* [FlattenedUnionResponse](#flattenedunionresponse)
* [OverriddenFieldNamesPost](#overriddenfieldnamespost)
* [ResponseBodyAdditionalPropertiesAnyPost](#responsebodyadditionalpropertiesanypost)
* [ResponseBodyAdditionalPropertiesComplexNumbersPost](#responsebodyadditionalpropertiescomplexnumberspost)
* [ResponseBodyAdditionalPropertiesDatePost](#responsebodyadditionalpropertiesdatepost)
* [ResponseBodyAdditionalPropertiesObjectPost](#responsebodyadditionalpropertiesobjectpost)
* [ResponseBodyAdditionalPropertiesPost](#responsebodyadditionalpropertiespost)
* [ResponseBodyBytesGet](#responsebodybytesget)
* [ResponseBodyDecimalStr](#responsebodydecimalstr)
* [ResponseBodyEmptyWithHeaders](#responsebodyemptywithheaders)
* [ResponseBodyMissing2xxOr3xxGet](#responsebodymissing2xxor3xxget)
* [ResponseBodyOptionalGet](#responsebodyoptionalget)
* [ResponseBodyReadOnly](#responsebodyreadonly)
* [ResponseBodyStringGet](#responsebodystringget)
* [ResponseBodyXmlGet](#responsebodyxmlget)

## FlattenedEnvelopePaginationResponse

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.ResponseBodies.FlattenedEnvelopePaginationResponseAsync(cursor: "<value>");


while(true)
{
    // handle items

    res = await res.Next();
    if (res == null)
    {
        break;
    }
}
```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `Cursor`                                                             | *string*                                                             | :heavy_minus_sign:                                                   | The page token used to request a specific page of the search results |


### Response

**[FlattenedEnvelopePaginationResponseResponse](../../Models/Operations/FlattenedEnvelopePaginationResponseResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## FlattenedEnvelopeResponse

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.ResponseBodies.FlattenedEnvelopeResponseAsync();

// handle response
```


### Response

**[FlattenedEnvelopeResponseResponse](../../Models/Operations/FlattenedEnvelopeResponseResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## FlattenedEnvelopeUnionResponse

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.ResponseBodies.FlattenedEnvelopeUnionResponseAsync();

// handle response
```


### Response

**[FlattenedEnvelopeUnionResponseResponse](../../Models/Operations/FlattenedEnvelopeUnionResponseResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## FlattenedUnionResponse

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.ResponseBodies.FlattenedUnionResponseAsync();

// handle response
```


### Response

**[FlattenedUnionResponseResponse](../../Models/Operations/FlattenedUnionResponseResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## OverriddenFieldNamesPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

OverriddenFieldNamesPostRequestBody req = new OverriddenFieldNamesPostRequestBody() {};

var res = await sdk.ResponseBodies.OverriddenFieldNamesPostAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [OverriddenFieldNamesPostRequestBody](../../Models/Operations/OverriddenFieldNamesPostRequestBody.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |


### Response

**[OverriddenFieldNamesPostResponse](../../Models/Operations/OverriddenFieldNamesPostResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## ResponseBodyAdditionalPropertiesAnyPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

ObjWithAnyAdditionalProperties req = new ObjWithAnyAdditionalProperties() {};

var res = await sdk.ResponseBodies.ResponseBodyAdditionalPropertiesAnyPostAsync(req);

// handle response
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ObjWithAnyAdditionalProperties](../../Models/Shared/ObjWithAnyAdditionalProperties.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |


### Response

**[ResponseBodyAdditionalPropertiesAnyPostResponse](../../Models/Operations/ResponseBodyAdditionalPropertiesAnyPostResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## ResponseBodyAdditionalPropertiesComplexNumbersPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

ObjWithComplexNumbersAdditionalProperties req = new ObjWithComplexNumbersAdditionalProperties() {
    NormalField = "<value>",
};

var res = await sdk.ResponseBodies.ResponseBodyAdditionalPropertiesComplexNumbersPostAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [ObjWithComplexNumbersAdditionalProperties](../../Models/Shared/ObjWithComplexNumbersAdditionalProperties.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[ResponseBodyAdditionalPropertiesComplexNumbersPostResponse](../../Models/Operations/ResponseBodyAdditionalPropertiesComplexNumbersPostResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## ResponseBodyAdditionalPropertiesDatePost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using NodaTime;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

ObjWithDateAdditionalProperties req = new ObjWithDateAdditionalProperties() {
    NormalField = "<value>",
};

var res = await sdk.ResponseBodies.ResponseBodyAdditionalPropertiesDatePostAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ObjWithDateAdditionalProperties](../../Models/Shared/ObjWithDateAdditionalProperties.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |


### Response

**[ResponseBodyAdditionalPropertiesDatePostResponse](../../Models/Operations/ResponseBodyAdditionalPropertiesDatePostResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## ResponseBodyAdditionalPropertiesObjectPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using NodaTime;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

ObjWithObjAdditionalProperties req = new ObjWithObjAdditionalProperties() {
    AdditionalProperties = new List<long>() {
        617205,
    },
    Datetime = System.DateTime.Parse("2023-03-22T10:46:10.684Z"),
    AdditionalPropertiesT = new Dictionary<string, SimpleObject>() {
        { "key", new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            Enum = Openapi.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
            IntEnum = Openapi.Models.Shared.IntEnum.Two,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            Float64Str = "1.1",
            Int64Str = "100",
            StrOpt = "testOptional",
        } },
    },
};

var res = await sdk.ResponseBodies.ResponseBodyAdditionalPropertiesObjectPostAsync(req);

// handle response
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ObjWithObjAdditionalProperties](../../Models/Shared/ObjWithObjAdditionalProperties.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |


### Response

**[ResponseBodyAdditionalPropertiesObjectPostResponse](../../Models/Operations/ResponseBodyAdditionalPropertiesObjectPostResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## ResponseBodyAdditionalPropertiesPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

ObjWithStringAdditionalProperties req = new ObjWithStringAdditionalProperties() {
    NormalField = "<value>",
};

var res = await sdk.ResponseBodies.ResponseBodyAdditionalPropertiesPostAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ObjWithStringAdditionalProperties](../../Models/Shared/ObjWithStringAdditionalProperties.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |


### Response

**[ResponseBodyAdditionalPropertiesPostResponse](../../Models/Operations/ResponseBodyAdditionalPropertiesPostResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## ResponseBodyBytesGet

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.ResponseBodies.ResponseBodyBytesGetAsync();

// handle response
```


### Response

**[ResponseBodyBytesGetResponse](../../Models/Operations/ResponseBodyBytesGetResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## ResponseBodyDecimalStr

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

decimal req = 6437.63M;

var res = await sdk.ResponseBodies.ResponseBodyDecimalStrAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *decimal*                                  | :heavy_check_mark:                         | The request object to use for the request. |
| `serverURL`                                | *string*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[ResponseBodyDecimalStrResponse](../../Models/Operations/ResponseBodyDecimalStrResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## ResponseBodyEmptyWithHeaders

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.ResponseBodies.ResponseBodyEmptyWithHeadersAsync(
    xNumberHeader: 1751.8D,
    xStringHeader: "<value>");

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `XNumberHeader`    | *double*           | :heavy_check_mark: | N/A                |
| `XStringHeader`    | *string*           | :heavy_check_mark: | N/A                |


### Response

**[ResponseBodyEmptyWithHeadersResponse](../../Models/Operations/ResponseBodyEmptyWithHeadersResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## ResponseBodyMissing2xxOr3xxGet

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.ResponseBodies.ResponseBodyMissing2xxOr3xxGetAsync();

// handle response
```


### Response

**[ResponseBodyMissing2xxOr3xxGetResponse](../../Models/Operations/ResponseBodyMissing2xxOr3xxGetResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## ResponseBodyOptionalGet

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.ResponseBodies.ResponseBodyOptionalGetAsync();

// handle response
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[ResponseBodyOptionalGetResponse](../../Models/Operations/ResponseBodyOptionalGetResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## ResponseBodyReadOnly

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.ResponseBodies.ResponseBodyReadOnlyAsync();

// handle response
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[ResponseBodyReadOnlyResponse](../../Models/Operations/ResponseBodyReadOnlyResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## ResponseBodyStringGet

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.ResponseBodies.ResponseBodyStringGetAsync();

// handle response
```


### Response

**[ResponseBodyStringGetResponse](../../Models/Operations/ResponseBodyStringGetResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## ResponseBodyXmlGet

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.ResponseBodies.ResponseBodyXmlGetAsync();

// handle response
```


### Response

**[ResponseBodyXmlGetResponse](../../Models/Operations/ResponseBodyXmlGetResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |
