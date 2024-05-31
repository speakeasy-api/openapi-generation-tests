# Globals
(*Globals*)

## Overview

Endpoints for testing global parameters.

### Available Operations

* [GlobalPathParameterGet](#globalpathparameterget)
* [GlobalsHeaderGet](#globalsheaderget)
* [GlobalsHiddenPost](#globalshiddenpost)
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
    globalHeaderParam: true,
    globalHiddenHeaderParam: "<value>",
    globalHiddenPathParam: "<value>",
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Globals.GlobalPathParameterGetAsync(globalPathParam: 100);

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `GlobalPathParam`  | *long*             | :heavy_minus_sign: | N/A                | 100                |


### Response

**[GlobalPathParameterGetResponse](../../Models/Operations/GlobalPathParameterGetResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

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
    globalHeaderParam: true,
    globalHiddenHeaderParam: "<value>",
    globalHiddenPathParam: "<value>",
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Globals.GlobalsHeaderGetAsync(globalHeaderParam: true);

// handle response
```

### Parameters

| Parameter           | Type                | Required            | Description         | Example             |
| ------------------- | ------------------- | ------------------- | ------------------- | ------------------- |
| `GlobalHeaderParam` | *bool*              | :heavy_minus_sign:  | N/A                 | true                |


### Response

**[GlobalsHeaderGetResponse](../../Models/Operations/GlobalsHeaderGetResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## GlobalsHiddenPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenHeaderParam: "<value>",
    globalHiddenPathParam: "<value>",
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

GlobalsHiddenPostRequest req = new GlobalsHiddenPostRequest() {
    RequestBody = new GlobalsHiddenPostRequestBody() {
        Other = 37,
        Test = "friend",
    },
};

var res = await sdk.Globals.GlobalsHiddenPostAsync(req);

// handle response
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GlobalsHiddenPostRequest](../../Models/Operations/GlobalsHiddenPostRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |


### Response

**[GlobalsHiddenPostResponse](../../Models/Operations/GlobalsHiddenPostResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

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
    globalHeaderParam: true,
    globalHiddenHeaderParam: "<value>",
    globalHiddenPathParam: "<value>",
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Globals.GlobalsQueryParameterGetAsync(globalQueryParam: "some example global query param");

// handle response
```

### Parameters

| Parameter                       | Type                            | Required                        | Description                     | Example                         |
| ------------------------------- | ------------------------------- | ------------------------------- | ------------------------------- | ------------------------------- |
| `GlobalQueryParam`              | *string*                        | :heavy_minus_sign:              | N/A                             | some example global query param |


### Response

**[GlobalsQueryParameterGetResponse](../../Models/Operations/GlobalsQueryParameterGetResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |
