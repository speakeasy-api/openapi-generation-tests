# SDK


## Overview

Some test description.
About our test document.

Speakeasy Docs
<https://speakeasyapi.dev/docs/home>
### Available Operations

* [ConflictingEnum](#conflictingenum) - Test potential namespace conflicts with java.lang.Object
* [PutAnythingIgnoredGeneration](#putanythingignoredgeneration)
* [ResponseBodyJsonGet](#responsebodyjsonget)

## ConflictingEnum

Test potential namespace conflicts with java.lang.Object

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

ConflictingEnum req = new ConflictingEnum() {};

var res = await sdk.ConflictingEnumAsync(req);

// handle response
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [ConflictingEnum](../../Models/Shared/ConflictingEnum.md) | :heavy_check_mark:                                        | The request object to use for the request.                |


### Response

**[ConflictingEnumResponse](../../Models/Operations/ConflictingEnumResponse.md)**


## PutAnythingIgnoredGeneration

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

string req = "<value>";

var res = await sdk.PutAnythingIgnoredGenerationAsync(req);

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *string*                                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[PutAnythingIgnoredGenerationResponse](../../Models/Operations/PutAnythingIgnoredGenerationResponse.md)**


## ResponseBodyJsonGet

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

var res = await sdk.ResponseBodyJsonGetAsync();

// handle response
```


### Response

**[ResponseBodyJsonGetResponse](../../Models/Operations/ResponseBodyJsonGetResponse.md)**

