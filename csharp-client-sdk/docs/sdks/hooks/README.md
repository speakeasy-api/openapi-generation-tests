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
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Hooks.AuthorizationHeaderModificationAsync();

// handle response
```

### Response

**[AuthorizationHeaderModificationResponse](../../Models/Operations/AuthorizationHeaderModificationResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## TestHooks

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

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

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
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Hooks.TestHooksAfterResponseAsync();

// handle response
```

### Response

**[TestHooksAfterResponseResponse](../../Models/Operations/TestHooksAfterResponseResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## TestHooksBeforeCreateRequestPaths

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

var res = await sdk.Hooks.TestHooksBeforeCreateRequestPathsAsync(namespaceP: "<value>");

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `Namespace`        | *string*           | :heavy_check_mark: | N/A                |

### Response

**[TestHooksBeforeCreateRequestPathsResponse](../../Models/Operations/TestHooksBeforeCreateRequestPathsResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

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
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Hooks.TestHooksErrorAsync();

// handle response
```

### Response

**[TestHooksErrorResponse](../../Models/Operations/TestHooksErrorResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |