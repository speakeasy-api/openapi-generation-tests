# Documentation
(*.documentation*)

## Overview

Testing for documentation extensions and tooling.

### Available Operations

* [getDocumentationPerLanguage](#getdocumentationperlanguage) - Gets documentation for some language, I guess.

## getDocumentationPerLanguage

Gets documentation for some language, I guess.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GetDocumentationPerLanguageRequest;
import org.openapis.openapi.models.operations.GetDocumentationPerLanguageResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            GetDocumentationPerLanguageResponse res = sdk.documentation.getDocumentationPerLanguage("string");

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                 | Type                                      | Required                                  | Description                               |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| `language`                                | *String*                                  | :heavy_check_mark:                        | The language parameter for this endpoint. |


### Response

**[org.openapis.openapi.models.operations.GetDocumentationPerLanguageResponse](../../models/operations/GetDocumentationPerLanguageResponse.md)**

