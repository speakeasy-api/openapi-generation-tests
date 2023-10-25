# DocumentationSDK
(*Documentation*)

## Overview

Testing for documentation extensions and tooling.

### Available Operations

* [GetDocumentationPerLanguage](#getdocumentationperlanguage) - Gets documentation for some language, I guess.

## GetDocumentationPerLanguage

Gets documentation for some language, I guess.

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

var res = await sdk.Documentation.GetDocumentationPerLanguageAsync("string");

// handle response
```

### Parameters

| Parameter                                 | Type                                      | Required                                  | Description                               |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| `Language`                                | *string*                                  | :heavy_check_mark:                        | The language parameter for this endpoint. |


### Response

**[GetDocumentationPerLanguageResponse](../../models/operations/GetDocumentationPerLanguageResponse.md)**

