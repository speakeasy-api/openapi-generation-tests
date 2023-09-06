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
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;
import org.openapis.openapi.models.shared.SimpleObjectInt32Enum;
import org.openapis.openapi.models.shared.SimpleObjectIntEnum;

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

            ComponentBodyAndParamConflictResponse res = sdk.flattening.componentBodyAndParamConflict(new SimpleObject("labore", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                any = "fugit";
                bigint = 677817L;
                bigintStr = "excepturi";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                decimal = 2700.08d;
                enum_ = Enum.TWO;
                float32 = 2.2222222f;
                int_ = 999999L;
                int32 = 1;
                int32Enum = SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE;
                intEnum = SimpleObjectIntEnum.Third;
                intOptNull = 999999L;
                num = 1.1d;
                numOptNull = 1.1d;
                str = "example";
                strOpt = "optional example";
            }}, "non");

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `simpleObject`                                                                         | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md) | :heavy_check_mark:                                                                     | N/A                                                                                    |
| `str`                                                                                  | *String*                                                                               | :heavy_check_mark:                                                                     | N/A                                                                                    |


### Response

**[org.openapis.openapi.models.operations.ComponentBodyAndParamConflictResponse](../../models/operations/ComponentBodyAndParamConflictResponse.md)**


## componentBodyAndParamNoConflict

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ComponentBodyAndParamNoConflictRequest;
import org.openapis.openapi.models.operations.ComponentBodyAndParamNoConflictResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;
import org.openapis.openapi.models.shared.SimpleObjectInt32Enum;
import org.openapis.openapi.models.shared.SimpleObjectIntEnum;

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

            ComponentBodyAndParamNoConflictResponse res = sdk.flattening.componentBodyAndParamNoConflict("eligendi", new SimpleObject("dolor", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                any = "sint";
                bigint = 396098L;
                bigintStr = "provident";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                decimal = 8960.39d;
                enum_ = Enum.TWO;
                float32 = 2.2222222f;
                int_ = 999999L;
                int32 = 1;
                int32Enum = SimpleObjectInt32Enum.SIXTY_NINE;
                intEnum = SimpleObjectIntEnum.Second;
                intOptNull = 999999L;
                num = 1.1d;
                numOptNull = 1.1d;
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

### Parameters

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `paramStr`                                                                             | *String*                                                                               | :heavy_check_mark:                                                                     | N/A                                                                                    |
| `simpleObject`                                                                         | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md) | :heavy_check_mark:                                                                     | N/A                                                                                    |


### Response

**[org.openapis.openapi.models.operations.ComponentBodyAndParamNoConflictResponse](../../models/operations/ComponentBodyAndParamNoConflictResponse.md)**


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

            ConflictingParamsResponse res = sdk.flattening.conflictingParams("dolorum", "in");

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter           | Type                | Required            | Description         |
| ------------------- | ------------------- | ------------------- | ------------------- |
| `strPathParameter`  | *String*            | :heavy_check_mark:  | N/A                 |
| `strQueryParameter` | *String*            | :heavy_check_mark:  | N/A                 |


### Response

**[org.openapis.openapi.models.operations.ConflictingParamsResponse](../../models/operations/ConflictingParamsResponse.md)**


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

            InlineBodyAndParamConflictResponse res = sdk.flattening.inlineBodyAndParamConflict(new InlineBodyAndParamConflictRequestBody("illum") {{
                str = "in";
            }}, "maiores");

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `requestBody`                                                                                                                                    | [org.openapis.openapi.models.operations.InlineBodyAndParamConflictRequestBody](../../models/operations/InlineBodyAndParamConflictRequestBody.md) | :heavy_check_mark:                                                                                                                               | N/A                                                                                                                                              |
| `str`                                                                                                                                            | *String*                                                                                                                                         | :heavy_check_mark:                                                                                                                               | N/A                                                                                                                                              |


### Response

**[org.openapis.openapi.models.operations.InlineBodyAndParamConflictResponse](../../models/operations/InlineBodyAndParamConflictResponse.md)**


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

            InlineBodyAndParamNoConflictResponse res = sdk.flattening.inlineBodyAndParamNoConflict(new InlineBodyAndParamNoConflictRequestBody("dicta") {{
                bodyStr = "rerum";
            }}, "magnam");

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                                                        | [org.openapis.openapi.models.operations.InlineBodyAndParamNoConflictRequestBody](../../models/operations/InlineBodyAndParamNoConflictRequestBody.md) | :heavy_check_mark:                                                                                                                                   | N/A                                                                                                                                                  |
| `paramStr`                                                                                                                                           | *String*                                                                                                                                             | :heavy_check_mark:                                                                                                                                   | N/A                                                                                                                                                  |


### Response

**[org.openapis.openapi.models.operations.InlineBodyAndParamNoConflictResponse](../../models/operations/InlineBodyAndParamNoConflictResponse.md)**

