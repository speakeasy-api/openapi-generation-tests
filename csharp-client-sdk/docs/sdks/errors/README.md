# ErrorsSDK
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
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
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

**[ConnectionErrorGetResponse](../../models/operations/ConnectionErrorGetResponse.md)**


## StatusGetError

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using SDK.Models.Operations;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Errors.StatusGetErrorAsync(458364);

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `StatusCode`       | *long*             | :heavy_check_mark: | N/A                |


### Response

**[StatusGetErrorResponse](../../models/operations/StatusGetErrorResponse.md)**


## StatusGetXSpeakeasyErrors

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using SDK.Models.Operations;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Errors.StatusGetXSpeakeasyErrorsAsync(385913);

// handle response
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `StatusCode`                   | *long*                         | :heavy_check_mark:             | N/A                            |
| `serverURL`                    | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[StatusGetXSpeakeasyErrorsResponse](../../models/operations/StatusGetXSpeakeasyErrorsResponse.md)**

