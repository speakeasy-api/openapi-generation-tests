# SDK

## Overview

Some test description.
About our test document.

Speakeasy Docs
<https://speakeasy.com/docs>

### Available Operations

* [AmbiguousQueryParam](#ambiguousqueryparam) - Tests conflict with C# System namespace
* [AuthenticatedRequest](#authenticatedrequest)
* [ConflictingEnum](#conflictingenum) - Test potential namespace conflicts with java.lang.Object
* [IgnoredGenerationPut](#ignoredgenerationput)
* [MultilineExample](#multilineexample)
* [PostAdditionalPropertiesWithNullableFields](#postadditionalpropertieswithnullablefields)
* [ResponseBodyJsonGet](#responsebodyjsonget)

## AmbiguousQueryParam

Tests conflict with C# System namespace

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
    globalQueryParam: "some example global query param"
);

var res = await sdk.AmbiguousQueryParamAsync(console: Openapi.Models.Operations.Console.Three);

// handle response
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `Console`                                                       | [Models.Operations.Console](../../Models/Operations/Console.md) | :heavy_check_mark:                                              | N/A                                                             |

### Response

**[AmbiguousQueryParamResponse](../../Models/Operations/AmbiguousQueryParamResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## AuthenticatedRequest

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

AuthenticatedRequestRequestBody req = new AuthenticatedRequestRequestBody() {};

var res = await sdk.AuthenticatedRequestAsync(
    security: new AuthenticatedRequestSecurity() {
        ClientCredentials = "<YOUR_CLIENT_CREDENTIALS_HERE>",
    },
    req
);

// handle response
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [AuthenticatedRequestRequestBody](../../Models/Operations/AuthenticatedRequestRequestBody.md)                     | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |
| `security`                                                                                                        | [Openapi.Models.Operations.AuthenticatedRequestSecurity](../../Models/Operations/AuthenticatedRequestSecurity.md) | :heavy_check_mark:                                                                                                | The security requirements to use for the request.                                                                 |

### Response

**[AuthenticatedRequestResponse](../../Models/Operations/AuthenticatedRequestResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## ConflictingEnum

Test potential namespace conflicts with java.lang.Object

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
    globalQueryParam: "some example global query param"
);

ConflictingEnum req = new ConflictingEnum() {};

var res = await sdk.ConflictingEnumAsync(req);

// handle response
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [ConflictingEnum](../../Models/Shared/ConflictingEnum.md) | :heavy_check_mark:                                        | The request object to use for the request.                |

### Response

**[ConflictingEnumResponse](../../Models/Operations/ConflictingEnumResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## IgnoredGenerationPut

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
    globalQueryParam: "some example global query param"
);

string req = "<value>";

var res = await sdk.IgnoredGenerationPutAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *string*                                   | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[IgnoredGenerationPutResponse](../../Models/Operations/IgnoredGenerationPutResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## MultilineExample

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
    globalQueryParam: "some example global query param"
);

MultilineExampleRequestBody req = new MultilineExampleRequestBody() {
    Message = "hello
    there!",
};

var res = await sdk.MultilineExampleAsync(req);

// handle response
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [MultilineExampleRequestBody](../../Models/Operations/MultilineExampleRequestBody.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[MultilineExampleResponse](../../Models/Operations/MultilineExampleResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## PostAdditionalPropertiesWithNullableFields

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using System.Collections.Generic;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

PostAdditionalPropertiesWithNullableFieldsRequestBody req = new PostAdditionalPropertiesWithNullableFieldsRequestBody() {};

var res = await sdk.PostAdditionalPropertiesWithNullableFieldsAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                                                 | Type                                                                                                                                      | Required                                                                                                                                  | Description                                                                                                                               |
| ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                 | [PostAdditionalPropertiesWithNullableFieldsRequestBody](../../Models/Operations/PostAdditionalPropertiesWithNullableFieldsRequestBody.md) | :heavy_check_mark:                                                                                                                        | The request object to use for the request.                                                                                                |

### Response

**[PostAdditionalPropertiesWithNullableFieldsResponse](../../Models/Operations/PostAdditionalPropertiesWithNullableFieldsResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## ResponseBodyJsonGet

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
    globalQueryParam: "some example global query param"
);

var res = await sdk.ResponseBodyJsonGetAsync();

// handle response
```

### Response

**[ResponseBodyJsonGetResponse](../../Models/Operations/ResponseBodyJsonGetResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |