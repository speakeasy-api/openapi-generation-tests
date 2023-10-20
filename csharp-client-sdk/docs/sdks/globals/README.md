# GlobalsSDK
(*Globals*)

## Overview

Endpoints for testing global parameters.

### Available Operations

* [GlobalPathParameterGet](#globalpathparameterget)
* [GlobalsQueryParameterGet](#globalsqueryparameterget)

## GlobalPathParameterGet

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

var res = await sdk.Globals.GlobalPathParameterGetAsync(719830);

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `GlobalPathParam`  | *long*             | :heavy_minus_sign: | N/A                |


### Response

**[GlobalPathParameterGetResponse](../../models/operations/GlobalPathParameterGetResponse.md)**


## GlobalsQueryParameterGet

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

var res = await sdk.Globals.GlobalsQueryParameterGetAsync("Tricycle");

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `GlobalQueryParam` | *string*           | :heavy_minus_sign: | N/A                |


### Response

**[GlobalsQueryParameterGetResponse](../../models/operations/GlobalsQueryParameterGetResponse.md)**

