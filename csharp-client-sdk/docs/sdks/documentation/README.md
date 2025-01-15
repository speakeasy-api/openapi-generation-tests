# Documentation
(*Documentation*)

## Overview

Testing for documentation extensions and tooling.

### Available Operations

* [GetDocumentationPerLanguage](#getdocumentationperlanguage) - Gets documentation for some language, I guess.

## GetDocumentationPerLanguage

Gets documentation for some language, I guess.

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

var res = await sdk.Documentation.GetDocumentationPerLanguageAsync(language: "<value>");

// handle response
```

### Parameters

| Parameter                                 | Type                                      | Required                                  | Description                               |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| `Language`                                | *string*                                  | :heavy_check_mark:                        | The language parameter for this endpoint. |

### Response

**[GetDocumentationPerLanguageResponse](../../Models/Operations/GetDocumentationPerLanguageResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |