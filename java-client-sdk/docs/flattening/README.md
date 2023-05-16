# flattening

## Overview

Endpoints for testing flattening through request body and parameter combinations.

### Available Operations

* [componentBodyAndParamConflict](#componentbodyandparamconflict)
* [componentBodyAndParamNoConflict](#componentbodyandparamnoconflict)
* [conflictingParams](#conflictingparams)
* [inlineBodyAndParamConflict](#inlinebodyandparamconflict)
* [inlineBodyAndParamNoConflict](#inlinebodyandparamnoconflict)

## componentBodyAndParamConflict

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ComponentBodyAndParamConflictRequest;
import org.openapis.openapi.models.operations.ComponentBodyAndParamConflictResponse;
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

            ComponentBodyAndParamConflictResponse res = sdk.flattening.componentBodyAndParamConflict(new SimpleObject("debitis", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.FIFTY_FIVE, SimpleObjectIntEnumEnum.Third, 1.1, "example") {{
                any = "odit";
                bigint = 367562L;
                bigintStr = "quasi";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                enum_ = EnumEnum.TWO;
                float32 = 2.2222222;
                int_ = 999999L;
                int32 = 1;
                int32Enum = SimpleObjectInt32EnumEnum.SIXTY_NINE;
                intEnum = SimpleObjectIntEnumEnum.Third;
                intOptNull = 999999L;
                num = 1.1;
                numOptNull = 1.1;
                str = "example";
                strOpt = "optional example";
            }}, "deleniti");

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## componentBodyAndParamNoConflict

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ComponentBodyAndParamNoConflictRequest;
import org.openapis.openapi.models.operations.ComponentBodyAndParamNoConflictResponse;
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

            ComponentBodyAndParamNoConflictResponse res = sdk.flattening.componentBodyAndParamNoConflict("facilis", new SimpleObject("expedita", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.SIXTY_NINE, SimpleObjectIntEnumEnum.Third, 1.1, "example") {{
                any = "in";
                bigint = 100226L;
                bigintStr = "architecto";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                enum_ = EnumEnum.TWO;
                float32 = 2.2222222;
                int_ = 999999L;
                int32 = 1;
                int32Enum = SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE;
                intEnum = SimpleObjectIntEnumEnum.Second;
                intOptNull = 999999L;
                num = 1.1;
                numOptNull = 1.1;
                str = "example";
                strOpt = "optional example";
            }});

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## conflictingParams

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ConflictingParamsRequest;
import org.openapis.openapi.models.operations.ConflictingParamsResponse;
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

            ConflictingParamsResponse res = sdk.flattening.conflictingParams("quibusdam", "sed");

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## inlineBodyAndParamConflict

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.InlineBodyAndParamConflictRequest;
import org.openapis.openapi.models.operations.InlineBodyAndParamConflictRequestBody;
import org.openapis.openapi.models.operations.InlineBodyAndParamConflictResponse;
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

            InlineBodyAndParamConflictResponse res = sdk.flattening.inlineBodyAndParamConflict(new InlineBodyAndParamConflictRequestBody("pariatur") {{
                str = "saepe";
            }}, "accusantium");

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## inlineBodyAndParamNoConflict

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.InlineBodyAndParamNoConflictRequest;
import org.openapis.openapi.models.operations.InlineBodyAndParamNoConflictRequestBody;
import org.openapis.openapi.models.operations.InlineBodyAndParamNoConflictResponse;
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

            InlineBodyAndParamNoConflictResponse res = sdk.flattening.inlineBodyAndParamNoConflict(new InlineBodyAndParamNoConflictRequestBody("praesentium") {{
                bodyStr = "consequuntur";
            }}, "natus");

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
