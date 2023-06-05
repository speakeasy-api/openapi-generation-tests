# pagination

## Overview

Endpoints for testing the pagination extension

### Available Operations

* [paginationCursorBody](#paginationcursorbody)
* [paginationCursorParams](#paginationcursorparams)
* [paginationLimitOffsetOffsetBody](#paginationlimitoffsetoffsetbody)
* [paginationLimitOffsetOffsetParams](#paginationlimitoffsetoffsetparams)
* [paginationLimitOffsetPageBody](#paginationlimitoffsetpagebody)
* [paginationLimitOffsetPageParams](#paginationlimitoffsetpageparams)

## paginationCursorBody

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PaginationCursorBodyRequestBody;
import org.openapis.openapi.models.operations.PaginationCursorBodyResponse;
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

            PaginationCursorBodyRequestBody req = new PaginationCursorBodyRequestBody(273542L);            

            PaginationCursorBodyResponse res = sdk.pagination.paginationCursorBody(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## paginationCursorParams

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PaginationCursorParamsRequest;
import org.openapis.openapi.models.operations.PaginationCursorParamsResponse;
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

            PaginationCursorParamsResponse res = sdk.pagination.paginationCursorParams(425451L);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## paginationLimitOffsetOffsetBody

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PaginationLimitOffsetOffsetBodyResponse;
import org.openapis.openapi.models.shared.LimitOffsetConfig;
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

            org.openapis.openapi.models.shared.LimitOffsetConfig req = new LimitOffsetConfig() {{
                limit = 798047L;
                offset = 885338L;
                page = 185636L;
            }};            

            PaginationLimitOffsetOffsetBodyResponse res = sdk.pagination.paginationLimitOffsetOffsetBody(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## paginationLimitOffsetOffsetParams

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PaginationLimitOffsetOffsetParamsRequest;
import org.openapis.openapi.models.operations.PaginationLimitOffsetOffsetParamsResponse;
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

            PaginationLimitOffsetOffsetParamsResponse res = sdk.pagination.paginationLimitOffsetOffsetParams(679880L, 952792L);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## paginationLimitOffsetPageBody

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PaginationLimitOffsetPageBodyResponse;
import org.openapis.openapi.models.shared.LimitOffsetConfig;
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

            org.openapis.openapi.models.shared.LimitOffsetConfig req = new LimitOffsetConfig() {{
                limit = 456130L;
                offset = 687488L;
                page = 483409L;
            }};            

            PaginationLimitOffsetPageBodyResponse res = sdk.pagination.paginationLimitOffsetPageBody(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## paginationLimitOffsetPageParams

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PaginationLimitOffsetPageParamsRequest;
import org.openapis.openapi.models.operations.PaginationLimitOffsetPageParamsResponse;
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

            PaginationLimitOffsetPageParamsResponse res = sdk.pagination.paginationLimitOffsetPageParams(215507L);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
