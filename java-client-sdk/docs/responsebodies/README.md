# responseBodies

## Overview

Endpoints for testing response bodies.

### Available Operations

* [responseBodyBytesGet](#responsebodybytesget)
* [responseBodyStringGet](#responsebodystringget)
* [responseBodyXmlGet](#responsebodyxmlget)

## responseBodyBytesGet

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyBytesGetResponse;
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

            ResponseBodyBytesGetResponse res = sdk.responseBodies.responseBodyBytesGet();

            if (res.bytes != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## responseBodyStringGet

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyStringGetResponse;
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

            ResponseBodyStringGetResponse res = sdk.responseBodies.responseBodyStringGet();

            if (res.html != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## responseBodyXmlGet

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyXmlGetResponse;
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

            ResponseBodyXmlGetResponse res = sdk.responseBodies.responseBodyXmlGet();

            if (res.xml != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
