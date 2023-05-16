# globals

## Overview

Endpoints for testing global parameters.

### Available Operations

* [globalPathParameterGet](#globalpathparameterget)
* [globalsQueryParameterGet](#globalsqueryparameterget)

## globalPathParameterGet

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GlobalPathParameterGetRequest;
import org.openapis.openapi.models.operations.GlobalPathParameterGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            GlobalPathParameterGetResponse res = sdk.globals.globalPathParameterGet(628982L);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## globalsQueryParameterGet

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GlobalsQueryParameterGetRequest;
import org.openapis.openapi.models.operations.GlobalsQueryParameterGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            GlobalsQueryParameterGetResponse res = sdk.globals.globalsQueryParameterGet("alias");

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
