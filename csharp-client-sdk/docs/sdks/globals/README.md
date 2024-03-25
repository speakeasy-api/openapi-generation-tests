# Globals
(*Globals*)

## Overview

Endpoints for testing global parameters.

### Available Operations

* [GlobalPathParameterGet](#globalpathparameterget)
* [GlobalsHeaderGet](#globalsheaderget)
* [GlobalsQueryParameterGet](#globalsqueryparameterget)

## GlobalPathParameterGet

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

var res = await sdk.Globals.GlobalPathParameterGetAsync(globalPathParam: 719830);

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `GlobalPathParam`  | *long*             | :heavy_minus_sign: | N/A                |


### Response

**[GlobalPathParameterGetResponse](../../Models/Operations/GlobalPathParameterGetResponse.md)**


## GlobalsHeaderGet

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

var res = await sdk.Globals.GlobalsHeaderGetAsync(globalHeaderParam: true);

// handle response
```

### Parameters

| Parameter           | Type                | Required            | Description         | Example             |
| ------------------- | ------------------- | ------------------- | ------------------- | ------------------- |
| `GlobalHeaderParam` | *bool*              | :heavy_check_mark:  | N/A                 | true                |


### Response

**[GlobalsHeaderGetResponse](../../Models/Operations/GlobalsHeaderGetResponse.md)**


## GlobalsQueryParameterGet

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

var res = await sdk.Globals.GlobalsQueryParameterGetAsync(globalQueryParam: "<value>");

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `GlobalQueryParam` | *string*           | :heavy_minus_sign: | N/A                |


### Response

**[GlobalsQueryParameterGetResponse](../../Models/Operations/GlobalsQueryParameterGetResponse.md)**

