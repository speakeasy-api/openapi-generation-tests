# Errors
(*Errors*)

## Overview

Endpoints for testing error responses.

### Available Operations

* [ConnectionErrorGet](#connectionerrorget)
* [ErrorUnionDiscriminatedPost](#erroruniondiscriminatedpost)
* [ErrorUnionPost](#errorunionpost)
* [StatusGetError](#statusgeterror)
* [StatusGetXSpeakeasyErrors](#statusgetxspeakeasyerrors)

## ConnectionErrorGet

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

var res = await sdk.Errors.ConnectionErrorGetAsync();

// handle response
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[ConnectionErrorGetResponse](../../Models/Operations/ConnectionErrorGetResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## ErrorUnionDiscriminatedPost

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

ErrorUnionDiscriminatedPostRequestBody req = ErrorUnionDiscriminatedPostRequestBody.CreateTaggedError2RequestBody(
    new TaggedError2RequestBody() {
        Tag = "<value>",
        TaggedError2Message = new TaggedError2Message() {
            Message = "<value>",
        },
    }
);

var res = await sdk.Errors.ErrorUnionDiscriminatedPostAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [ErrorUnionDiscriminatedPostRequestBody](../../Models/Operations/ErrorUnionDiscriminatedPostRequestBody.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |
| `serverURL`                                                                                                 | *string*                                                                                                    | :heavy_minus_sign:                                                                                          | An optional server URL to use.                                                                              |

### Response

**[ErrorUnionDiscriminatedPostResponse](../../Models/Operations/ErrorUnionDiscriminatedPostResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.TaggedError1 | 4XX                                | application/json                   |
| Openapi.Models.Errors.TaggedError2 | 4XX                                | application/json                   |
| Openapi.Models.Errors.SDKException | 5XX                                | \*/\*                              |

## ErrorUnionPost

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

ErrorUnionPostRequestBody req = ErrorUnionPostRequestBody.CreateErrorType1RequestBody(
    new ErrorType1RequestBody() {
        Error = "<value>",
    }
);

var res = await sdk.Errors.ErrorUnionPostAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ErrorUnionPostRequestBody](../../Models/Operations/ErrorUnionPostRequestBody.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |
| `serverURL`                                                                       | *string*                                                                          | :heavy_minus_sign:                                                                | An optional server URL to use.                                                    |

### Response

**[ErrorUnionPostResponse](../../Models/Operations/ErrorUnionPostResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.ErrorType1   | 500                                | application/json                   |
| Openapi.Models.Errors.ErrorType2   | 500                                | application/json                   |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## StatusGetError

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

var res = await sdk.Errors.StatusGetErrorAsync(statusCode: 303);

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `StatusCode`       | *long*             | :heavy_check_mark: | N/A                |

### Response

**[StatusGetErrorResponse](../../Models/Operations/StatusGetErrorResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## StatusGetXSpeakeasyErrors

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

var res = await sdk.Errors.StatusGetXSpeakeasyErrorsAsync(statusCode: 203);

// handle response
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `StatusCode`                   | *long*                         | :heavy_check_mark:             | N/A                            |
| `serverURL`                    | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[StatusGetXSpeakeasyErrorsResponse](../../Models/Operations/StatusGetXSpeakeasyErrorsResponse.md)**

### Errors

| Error Type                                                  | Status Code                                                 | Content Type                                                |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| Openapi.Models.Errors.Error                                 | 500                                                         | application/json                                            |
| Openapi.Models.Errors.StatusGetXSpeakeasyErrorsResponseBody | 501                                                         | application/json                                            |
| Openapi.Models.Errors.SDKException                          | 4XX, 5XX                                                    | \*/\*                                                       |