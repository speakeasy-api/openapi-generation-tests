# Hooks
(*Hooks*)

## Overview

Endpoints for testing hooks

### Available Operations

* [TestHooks](#testhooks)
* [TestHooksAfterResponse](#testhooksafterresponse)
* [TestHooksError](#testhookserror)

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


## TestHooksAfterResponse

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

var res = await sdk.Hooks.TestHooksAfterResponseAsync();

// handle response
```


### Response

**[TestHooksAfterResponseResponse](../../Models/Operations/TestHooksAfterResponseResponse.md)**


## TestHooksError

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

var res = await sdk.Hooks.TestHooksErrorAsync();

// handle response
```


### Response

**[TestHooksErrorResponse](../../Models/Operations/TestHooksErrorResponse.md)**

