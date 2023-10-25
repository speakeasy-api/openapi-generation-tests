# Documentation
(*documentation*)

## Overview

Testing for documentation extensions and tooling.

### Available Operations

* [getDocumentationPerLanguage](#getdocumentationperlanguage) - Gets documentation for some language, I guess.

## getDocumentationPerLanguage

Gets documentation for some language, I guess.

### Example Usage

```typescript
import { SDK } from "openapi";
import { GetDocumentationPerLanguageRequest } from "openapi/dist/sdk/models/operations";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const language: string = "string";

  const res = await sdk.documentation.getDocumentationPerLanguage(language);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `language`                                                   | *string*                                                     | :heavy_check_mark:                                           | The language parameter for this endpoint.                    |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.GetDocumentationPerLanguageResponse](../../models/operations/getdocumentationperlanguageresponse.md)>**

