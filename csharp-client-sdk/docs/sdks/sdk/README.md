# SDK


## Overview

Some test description.
About our test document.

Speakeasy Docs
<https://speakeasyapi.dev/docs/home>
### Available Operations

* [PutAnythingIgnoredGeneration](#putanythingignoredgeneration)
* [ResponseBodyJsonGet](#responsebodyjsonget)

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
    globalQueryParam: "some example global query param"
);

var res = await sdk.PutAnythingIgnoredGenerationAsync("string");

// handle response
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | *string*                                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[PutAnythingIgnoredGenerationResponse](../../models/operations/PutAnythingIgnoredGenerationResponse.md)**


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
    globalQueryParam: "some example global query param"
);

var res = await sdk.ResponseBodyJsonGetAsync();

// handle response
```


### Response

**[ResponseBodyJsonGetResponse](../../models/operations/ResponseBodyJsonGetResponse.md)**

