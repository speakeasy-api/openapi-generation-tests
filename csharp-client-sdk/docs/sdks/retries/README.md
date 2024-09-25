# Retries
(*Retries*)

## Overview

Endpoints for testing retries.

### Available Operations

* [RetriesAfter](#retriesafter)
* [RetriesConnectErrorGet](#retriesconnecterrorget) - A request to a non-valid port to test connection errors
* [RetriesFlatEmptyResponsePost](#retriesflatemptyresponsepost)
* [RetriesGet](#retriesget)
* [RetriesPost](#retriespost)

## RetriesAfter

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

var res = await sdk.Retries.RetriesAfterAsync(
    requestId: "<value>",
    numRetries: 282943,
    retryAfterVal: 502771
);

// handle response
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `RequestId`                    | *string*                       | :heavy_check_mark:             | N/A                            |
| `NumRetries`                   | *long*                         | :heavy_minus_sign:             | N/A                            |
| `RetryAfterVal`                | *long*                         | :heavy_minus_sign:             | N/A                            |
| `serverURL`                    | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[RetriesAfterResponse](../../Models/Operations/RetriesAfterResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RetriesConnectErrorGet

A request to a non-valid port to test connection errors

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

var res = await sdk.Retries.RetriesConnectErrorGetAsync();

// handle response
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[RetriesConnectErrorGetResponse](../../Models/Operations/RetriesConnectErrorGetResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RetriesFlatEmptyResponsePost

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

var res = await sdk.Retries.RetriesFlatEmptyResponsePostAsync(
    requestId: "<value>",
    requestBody: new RetriesFlatEmptyResponsePostRequestBody() {
        FieldOne = "<value>",
    },
    numRetries: 923715
);

// handle response
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `RequestId`                                                                                                   | *string*                                                                                                      | :heavy_check_mark:                                                                                            | N/A                                                                                                           |
| `RequestBody`                                                                                                 | [RetriesFlatEmptyResponsePostRequestBody](../../Models/Operations/RetriesFlatEmptyResponsePostRequestBody.md) | :heavy_minus_sign:                                                                                            | N/A                                                                                                           |
| `NumRetries`                                                                                                  | *long*                                                                                                        | :heavy_minus_sign:                                                                                            | N/A                                                                                                           |
| `serverURL`                                                                                                   | *string*                                                                                                      | :heavy_minus_sign:                                                                                            | An optional server URL to use.                                                                                |

### Response

**[RetriesFlatEmptyResponsePostResponse](../../Models/Operations/RetriesFlatEmptyResponsePostResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RetriesGet

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

var res = await sdk.Retries.RetriesGetAsync(
    requestId: "<value>",
    numRetries: 75342
);

// handle response
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `RequestId`                    | *string*                       | :heavy_check_mark:             | N/A                            |
| `NumRetries`                   | *long*                         | :heavy_minus_sign:             | N/A                            |
| `serverURL`                    | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[RetriesGetResponse](../../Models/Operations/RetriesGetResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## RetriesPost

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

var res = await sdk.Retries.RetriesPostAsync(
    requestId: "<value>",
    requestBody: new RetriesPostRequestBody() {
        FieldOne = "<value>",
    },
    numRetries: 138258
);

// handle response
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `RequestId`                                                                 | *string*                                                                    | :heavy_check_mark:                                                          | N/A                                                                         |
| `RequestBody`                                                               | [RetriesPostRequestBody](../../Models/Operations/RetriesPostRequestBody.md) | :heavy_minus_sign:                                                          | N/A                                                                         |
| `NumRetries`                                                                | *long*                                                                      | :heavy_minus_sign:                                                          | N/A                                                                         |
| `serverURL`                                                                 | *string*                                                                    | :heavy_minus_sign:                                                          | An optional server URL to use.                                              |

### Response

**[RetriesPostResponse](../../Models/Operations/RetriesPostResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |
