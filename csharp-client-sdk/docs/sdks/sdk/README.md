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
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.SDK.PutAnythingIgnoredGenerationAsync("bus");

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
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.SDK.ResponseBodyJsonGetAsync();

// handle response
```


### Response

**[ResponseBodyJsonGetResponse](../../models/operations/ResponseBodyJsonGetResponse.md)**

