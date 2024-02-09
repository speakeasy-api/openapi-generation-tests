# Retries
(*Retries*)

## Overview

Endpoints for testing retries.

### Available Operations

* [RetriesGet](#retriesget)
* [RetriesPost](#retriespost)

## RetriesGet

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
    globalQueryParam: "some example global query param");

var res = await sdk.Retries.RetriesGetAsync(
    requestId: "string",
    numRetries: 75342);

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


## RetriesPost

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
    globalQueryParam: "some example global query param");

var res = await sdk.Retries.RetriesPostAsync(
    requestId: "string",
    requestBody: new RetriesPostRequestBody() {
    FieldOne = "string",
},
    numRetries: 138258);

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

