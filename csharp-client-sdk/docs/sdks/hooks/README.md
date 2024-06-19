# Hooks
(*Hooks*)

## Overview

Endpoints for testing hooks

### Available Operations

* [AuthorizationHeaderModification](#authorizationheadermodification)
* [TestHooks](#testhooks)
* [TestHooksAfterResponse](#testhooksafterresponse)
* [TestHooksBeforeCreateRequestPaths](#testhooksbeforecreaterequestpaths)
* [TestHooksError](#testhookserror)

## AuthorizationHeaderModification

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

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

var res = await sdk.Hooks.AuthorizationHeaderModificationAsync();

// handle response
```


### Response

**[AuthorizationHeaderModificationResponse](../../Models/Operations/AuthorizationHeaderModificationResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## TestHooks

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

var res = await sdk.Hooks.TestHooksAsync(someParam: "someInitialValue");

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `SomeParam`        | *string*           | :heavy_check_mark: | N/A                | someInitialValue   |


### Response

**[TestHooksResponse](../../Models/Operations/TestHooksResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## TestHooksAfterResponse

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

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

var res = await sdk.Hooks.TestHooksAfterResponseAsync();

// handle response
```


### Response

**[TestHooksAfterResponseResponse](../../Models/Operations/TestHooksAfterResponseResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## TestHooksBeforeCreateRequestPaths

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

var res = await sdk.Hooks.TestHooksBeforeCreateRequestPathsAsync(namespace: "<value>");

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `Namespace`        | *string*           | :heavy_check_mark: | N/A                |


### Response

**[TestHooksBeforeCreateRequestPathsResponse](../../Models/Operations/TestHooksBeforeCreateRequestPathsResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |

## TestHooksError

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

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

var res = await sdk.Hooks.TestHooksErrorAsync();

// handle response
```


### Response

**[TestHooksErrorResponse](../../Models/Operations/TestHooksErrorResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |
