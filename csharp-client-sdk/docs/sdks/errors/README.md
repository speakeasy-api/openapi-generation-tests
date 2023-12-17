# Errors
(*Errors*)

## Overview

Endpoints for testing error responses.

### Available Operations

* [ConnectionErrorGet](#connectionerrorget)
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
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Errors.ConnectionErrorGetAsync();

// handle response
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[ConnectionErrorGetResponse](../../Models/Operations/ConnectionErrorGetResponse.md)**


## StatusGetError

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

var res = await sdk.Errors.StatusGetErrorAsync(StatusCode: 458364);

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `StatusCode`       | *long*             | :heavy_check_mark: | N/A                |


### Response

**[StatusGetErrorResponse](../../Models/Operations/StatusGetErrorResponse.md)**


## StatusGetXSpeakeasyErrors

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

var res = await sdk.Errors.StatusGetXSpeakeasyErrorsAsync(StatusCode: 385913);

// handle response
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `StatusCode`                   | *long*                         | :heavy_check_mark:             | N/A                            |
| `serverURL`                    | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[StatusGetXSpeakeasyErrorsResponse](../../Models/Operations/StatusGetXSpeakeasyErrorsResponse.md)**

