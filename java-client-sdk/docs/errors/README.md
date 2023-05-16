# errors

## Overview

Endpoints for testing error responses.

### Available Operations

* [connectionErrorGet](#connectionerrorget)
* [statusGet](#statusget)
* [statusPostRetries](#statuspostretries)

## connectionErrorGet

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ConnectionErrorGetResponse;
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

            ConnectionErrorGetResponse res = sdk.errors.connectionErrorGet();

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## statusGet

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.StatusGetRequest;
import org.openapis.openapi.models.operations.StatusGetResponse;
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

            StatusGetRequest req = new StatusGetRequest(551816L);            

            StatusGetResponse res = sdk.errors.statusGet(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## statusPostRetries

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.StatusPostRetriesRequest;
import org.openapis.openapi.models.operations.StatusPostRetriesResponse;
import org.openapis.openapi.models.shared.EnumEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;
import org.openapis.openapi.models.shared.SimpleObjectInt32EnumEnum;
import org.openapis.openapi.models.shared.SimpleObjectIntEnumEnum;

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

            StatusPostRetriesRequest req = new StatusPostRetriesRequest(574325L) {{
                simpleObject = new SimpleObject("accusantium", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.SIXTY_NINE, SimpleObjectIntEnumEnum.Third, 1.1, "example") {{
                    bigint = 652103L;
                    bigintStr = "ad";
                    boolOpt = true;
                    intOptNull = 999999L;
                    numOptNull = 1.1;
                    strOpt = "optional example";
                }};;
            }};            

            StatusPostRetriesResponse res = sdk.errors.statusPostRetries(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
