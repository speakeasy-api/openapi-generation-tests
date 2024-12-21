# Generation
(*generation()*)

## Overview

Endpoints for purely testing valid generation behavior.

### Available Operations

* [anchorTypesGet](#anchortypesget)
* [arrayCircularReferenceGet](#arraycircularreferenceget)
* [circularReferenceGet](#circularreferenceget)
* [circularReferenceOneDegree](#circularreferenceonedegree) - A reference cycle that spans three models separated by one degree
* [dateParamWithDefault](#dateparamwithdefault)
* [dateTimeParamWithDefault](#datetimeparamwithdefault)
* [decimalParamWithDefault](#decimalparamwithdefault)
* [deprecatedFieldInSchemaPost](#deprecatedfieldinschemapost)
* [deprecatedObjectInSchemaGet](#deprecatedobjectinschemaget)
* [~~deprecatedOperationNoCommentsGet~~](#deprecatedoperationnocommentsget) - :warning: **Deprecated**
* [~~deprecatedOperationWithCommentsGet~~](#deprecatedoperationwithcommentsget) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** Use [simplePathParameterObjects](docs/sdks/parameters/README.md#simplepathparameterobjects) instead.
* [emptyObjectGet](#emptyobjectget)
* [emptyResponseObjectWithCommentGet](#emptyresponseobjectwithcommentget)
* [globalNameOverridden](#globalnameoverridden)
* [ignoredGenerationGet](#ignoredgenerationget)
* [ignoresPost](#ignorespost)
* [nameOverride](#nameoverride)
* [objectCircularReferenceGet](#objectcircularreferenceget)
* [oneOfCircularReferenceGet](#oneofcircularreferenceget)
* [reactHookCombinedOptions](#reacthookcombinedoptions)
* [reactHookDisabled](#reacthookdisabled)
* [reactHookGetAsMutation](#reacthookgetasmutation)
* [reactHookPostAsQuery](#reacthookpostasquery)
* [reactHookRenamed](#reacthookrenamed)
* [typedParameterGenerationGet](#typedparametergenerationget)
* [usageExamplePost](#usageexamplepost) - An operation used for testing usage examples

## anchorTypesGet

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.AnchorTypesGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        AnchorTypesGetResponse res = sdk.generation().anchorTypesGet()
                .call();

        if (res.typeFromAnchor().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[AnchorTypesGetResponse](../../models/operations/AnchorTypesGetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## arrayCircularReferenceGet

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ArrayCircularReferenceGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        ArrayCircularReferenceGetResponse res = sdk.generation().arrayCircularReferenceGet()
                .call();

        if (res.arrayCircularReferenceObject().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[ArrayCircularReferenceGetResponse](../../models/operations/ArrayCircularReferenceGetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## circularReferenceGet

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.CircularReferenceGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        CircularReferenceGetResponse res = sdk.generation().circularReferenceGet()
                .call();

        if (res.validCircularReferenceObject().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[CircularReferenceGetResponse](../../models/operations/CircularReferenceGetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## circularReferenceOneDegree

A reference cycle that spans three models separated by one degree

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.CircularReferenceOneDegreeResponse;
import org.openapis.openapi.models.shared.FigmaComponentNode;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        FigmaComponentNode req = FigmaComponentNode.builder()
                .build();

        CircularReferenceOneDegreeResponse res = sdk.generation().circularReferenceOneDegree()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [FigmaComponentNode](../../models/shared/FigmaComponentNode.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[CircularReferenceOneDegreeResponse](../../models/operations/CircularReferenceOneDegreeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## dateParamWithDefault

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.time.LocalDate;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.DateParamWithDefaultResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        DateParamWithDefaultResponse res = sdk.generation().dateParamWithDefault()
                .dateInput(LocalDate.parse("2023-10-13"))
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `dateInput`                                                                     | [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html) | :heavy_check_mark:                                                              | A date parameter with a default value                                           |

### Response

**[DateParamWithDefaultResponse](../../models/operations/DateParamWithDefaultResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## dateTimeParamWithDefault

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.DateTimeParamWithDefaultResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        DateTimeParamWithDefaultResponse res = sdk.generation().dateTimeParamWithDefault()
                .dateTimeInput(OffsetDateTime.parse("2023-10-13T12:42:42.999+00:00"))
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `dateTimeInput`                                                                           | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_check_mark:                                                                        | A date time parameter with a default value                                                |

### Response

**[DateTimeParamWithDefaultResponse](../../models/operations/DateTimeParamWithDefaultResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## decimalParamWithDefault

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.math.BigDecimal;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.DecimalParamWithDefaultResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        DecimalParamWithDefaultResponse res = sdk.generation().decimalParamWithDefault()
                .decimalInput(new BigDecimal("903275809834567300000"))
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `decimalInput`                           | *BigDecimal*                             | :heavy_check_mark:                       | A decimal parameter with a default value |

### Response

**[DecimalParamWithDefaultResponse](../../models/operations/DecimalParamWithDefaultResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deprecatedFieldInSchemaPost

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.DeprecatedFieldInSchemaPostResponse;
import org.openapis.openapi.models.shared.DeprecatedFieldInObject;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        DeprecatedFieldInObject req = DeprecatedFieldInObject.builder()
                .build();

        DeprecatedFieldInSchemaPostResponse res = sdk.generation().deprecatedFieldInSchemaPost()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [DeprecatedFieldInObject](../../models/shared/DeprecatedFieldInObject.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[DeprecatedFieldInSchemaPostResponse](../../models/operations/DeprecatedFieldInSchemaPostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deprecatedObjectInSchemaGet

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.DeprecatedObjectInSchemaGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        DeprecatedObjectInSchemaGetResponse res = sdk.generation().deprecatedObjectInSchemaGet()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[DeprecatedObjectInSchemaGetResponse](../../models/operations/DeprecatedObjectInSchemaGetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ~~deprecatedOperationNoCommentsGet~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.DeprecatedOperationNoCommentsGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        DeprecatedOperationNoCommentsGetResponse res = sdk.generation().deprecatedOperationNoCommentsGet()
                .deprecatedParameter("<value>")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `deprecatedParameter`                                                                                                   | *Optional\<String>*                                                                                                     | :heavy_minus_sign:                                                                                                      | : warning: ** DEPRECATED **: This will be removed in a future release, please migrate away from it as soon as possible. |

### Response

**[DeprecatedOperationNoCommentsGetResponse](../../models/operations/DeprecatedOperationNoCommentsGetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ~~deprecatedOperationWithCommentsGet~~

This is an endpoint setup to test deprecation with comments

> :warning: **DEPRECATED**: This operation is deprecated. Use `simplePathParameterObjects` instead.

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.DeprecatedOperationWithCommentsGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        DeprecatedOperationWithCommentsGetResponse res = sdk.generation().deprecatedOperationWithCommentsGet()
                .deprecatedParameter("<value>")
                .newParameter("<value>")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `deprecatedParameter`                                                                                            | *Optional\<String>*                                                                                              | :heavy_minus_sign:                                                                                               | : warning: ** DEPRECATED **: This parameter is deprecated. Use newParameter instead.<br/><br/>This is a string parameter |
| `newParameter`                                                                                                   | *Optional\<String>*                                                                                              | :heavy_minus_sign:                                                                                               | This is a string parameter                                                                                       |

### Response

**[DeprecatedOperationWithCommentsGetResponse](../../models/operations/DeprecatedOperationWithCommentsGetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## emptyObjectGet

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.EmptyObjectGetResponse;
import org.openapis.openapi.models.shared.EmptyObjectParam;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        EmptyObjectGetResponse res = sdk.generation().emptyObjectGet()
                .emptyObject(EmptyObjectParam.builder()
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `emptyObject`                                               | [EmptyObjectParam](../../models/shared/EmptyObjectParam.md) | :heavy_check_mark:                                          | N/A                                                         |

### Response

**[EmptyObjectGetResponse](../../models/operations/EmptyObjectGetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## emptyResponseObjectWithCommentGet

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.EmptyResponseObjectWithCommentGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        EmptyResponseObjectWithCommentGetResponse res = sdk.generation().emptyResponseObjectWithCommentGet()
                .call();

        if (res.body().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[EmptyResponseObjectWithCommentGetResponse](../../models/operations/EmptyResponseObjectWithCommentGetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## globalNameOverridden

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GetGlobalNameOverrideResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        SimpleObject req = SimpleObject.builder()
                .any("any")
                .bool(true)
                .date(LocalDate.parse("2020-01-01"))
                .dateTime(OffsetDateTime.parse("2020-01-01T00:00:00.001Z"))
                .enum_(Enum.ONE)
                .float32(1.1f)
                .int_(1L)
                .int32(1)
                .int32Enum(Int32Enum.FIFTY_FIVE)
                .intEnum(IntEnum.Second)
                .num(1.1d)
                .str("test")
                .bigint(new BigInteger("8821239038968084"))
                .bigintStr(new BigInteger("9223372036854775808"))
                .boolOpt(true)
                .decimal(new BigDecimal("3.141592653589793"))
                .decimalStr(new BigDecimal("3.14159265358979344719667586"))
                .float64Str("1.1")
                .int64Str("100")
                .strOpt("testOptional")
                .build();

        GetGlobalNameOverrideResponse res = sdk.generation().globalNameOverridden()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `request`                                           | [SimpleObject](../../models/shared/SimpleObject.md) | :heavy_check_mark:                                  | The request object to use for the request.          |

### Response

**[GetGlobalNameOverrideResponse](../../models/operations/GetGlobalNameOverrideResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ignoredGenerationGet

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.IgnoredGenerationGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        IgnoredGenerationGetResponse res = sdk.generation().ignoredGenerationGet()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[IgnoredGenerationGetResponse](../../models/operations/IgnoredGenerationGetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ignoresPost

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.IgnoresPostRequestBody;
import org.openapis.openapi.models.operations.IgnoresPostResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        IgnoresPostResponse res = sdk.generation().ignoresPost()
                .requestBody(IgnoresPostRequestBody.builder()
                    .build())
                .testParam("<value>")
                .call();

        if (res.httpBinSimpleJsonObject().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `requestBody`                                                               | [IgnoresPostRequestBody](../../models/operations/IgnoresPostRequestBody.md) | :heavy_check_mark:                                                          | N/A                                                                         |
| `testParam`                                                                 | *Optional\<String>*                                                         | :heavy_minus_sign:                                                          | N/A                                                                         |

### Response

**[IgnoresPostResponse](../../models/operations/IgnoresPostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## nameOverride

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.EnumNameOverride;
import org.openapis.openapi.models.operations.NameOverrideGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        NameOverrideGetResponse res = sdk.generation().nameOverride()
                .testEnumQueryParam(EnumNameOverride.VALUE3)
                .testQueryParam("example")
                .call();

        if (res.overriddenResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     | Example                                                         |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `testEnumQueryParam`                                            | [EnumNameOverride](../../models/operations/EnumNameOverride.md) | :heavy_check_mark:                                              | An enum type                                                    | value3                                                          |
| `testQueryParam`                                                | *String*                                                        | :heavy_check_mark:                                              | N/A                                                             | example                                                         |

### Response

**[NameOverrideGetResponse](../../models/operations/NameOverrideGetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## objectCircularReferenceGet

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ObjectCircularReferenceGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        ObjectCircularReferenceGetResponse res = sdk.generation().objectCircularReferenceGet()
                .call();

        if (res.objectCircularReferenceObject().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[ObjectCircularReferenceGetResponse](../../models/operations/ObjectCircularReferenceGetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## oneOfCircularReferenceGet

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.OneOfCircularReferenceGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        OneOfCircularReferenceGetResponse res = sdk.generation().oneOfCircularReferenceGet()
                .call();

        if (res.oneOfCircularReferenceObject().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[OneOfCircularReferenceGetResponse](../../models/operations/OneOfCircularReferenceGetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## reactHookCombinedOptions

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        sdk.generation().reactHookCombinedOptions()
                .page(122236L)
                .callAsStream()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `page`             | *long*             | :heavy_check_mark: | N/A                |

### Response

**[ReactHookCombinedOptionsResponse](../../models/operations/ReactHookCombinedOptionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## reactHookDisabled

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ReactHookDisabledResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        ReactHookDisabledResponse res = sdk.generation().reactHookDisabled()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[ReactHookDisabledResponse](../../models/operations/ReactHookDisabledResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## reactHookGetAsMutation

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ReactHookGetAsMutationResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        ReactHookGetAsMutationResponse res = sdk.generation().reactHookGetAsMutation()
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[ReactHookGetAsMutationResponse](../../models/operations/ReactHookGetAsMutationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## reactHookPostAsQuery

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ReactHookPostAsQueryResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        ReactHookPostAsQueryResponse res = sdk.generation().reactHookPostAsQuery()
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[ReactHookPostAsQueryResponse](../../models/operations/ReactHookPostAsQueryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## reactHookRenamed

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ReactHookRenamedResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        ReactHookRenamedResponse res = sdk.generation().reactHookRenamed()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[ReactHookRenamedResponse](../../models/operations/ReactHookRenamedResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## typedParameterGenerationGet

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.Obj;
import org.openapis.openapi.models.operations.TypedParameterGenerationGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        TypedParameterGenerationGetResponse res = sdk.generation().typedParameterGenerationGet()
                .bigint(new BigInteger("879275"))
                .date(LocalDate.parse("2023-01-02"))
                .decimal(new BigDecimal("8948.30"))
                .obj(Obj.builder()
                    .bool(false)
                    .num(6735.52d)
                    .str("<value>")
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `bigint`                                                                        | *Optional\<BigInteger>*                                                         | :heavy_minus_sign:                                                              | N/A                                                                             |
| `date`                                                                          | [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html) | :heavy_minus_sign:                                                              | N/A                                                                             |
| `decimal`                                                                       | *Optional\<BigDecimal>*                                                         | :heavy_minus_sign:                                                              | N/A                                                                             |
| `obj`                                                                           | [Optional\<Obj>](../../models/operations/Obj.md)                                | :heavy_minus_sign:                                                              | N/A                                                                             |

### Response

**[TypedParameterGenerationGetResponse](../../models/operations/TypedParameterGenerationGetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## usageExamplePost

An operation used for testing usage examples that includes a large array of parameters and input types to ensure that all are handled correctly

Usage example docs
<https://docs.example.com>

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.EnumParameter;
import org.openapis.openapi.models.operations.OptEnumParameter;
import org.openapis.openapi.models.operations.UsageExamplePostRequest;
import org.openapis.openapi.models.operations.UsageExamplePostRequestBody;
import org.openapis.openapi.models.operations.UsageExamplePostResponse;
import org.openapis.openapi.models.operations.UsageExamplePostSecurity;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.FakerCamelCasePropertyNameStrings;
import org.openapis.openapi.models.shared.FakerFormattedStrings;
import org.openapis.openapi.models.shared.FakerKebobCasePropertyNameStrings;
import org.openapis.openapi.models.shared.FakerPascalCasePropertyNameStrings;
import org.openapis.openapi.models.shared.FakerSnakeCasePropertyNameStrings;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        UsageExamplePostRequest req = UsageExamplePostRequest.builder()
                .bigintParameter(new BigInteger("341377"))
                .bigintStrParameter(new BigInteger("935014"))
                .boolParameter(false)
                .dateParameter(LocalDate.parse("2022-06-17"))
                .dateTimeDefaultParameter(OffsetDateTime.parse("2024-09-08T16:41:18.590Z"))
                .dateTimeParameter(OffsetDateTime.parse("2022-02-25T19:24:58.319Z"))
                .decimalParameter(new BigDecimal("1207.65"))
                .decimalStrParameter(new BigDecimal("5574.60"))
                .doubleParameter(1210.26d)
                .enumParameter(EnumParameter.VALUE1)
                .falseyNumberParameter(0d)
                .float32Parameter(8680.17f)
                .float64StringParameter("<value>")
                .floatParameter(9262.70d)
                .int64Parameter(921028L)
                .int64StringParameter("<value>")
                .intParameter(466225)
                .strParameter("example 1")
                .requestBody(UsageExamplePostRequestBody.builder()
                    .fakerCamelCasePropertyNameStrings(FakerCamelCasePropertyNameStrings.builder()
                        .city("Port Domenicboro")
                        .iban("TL115340030031304452481")
                        .id("<id>")
                        .iPv4("78.38.131.239")
                        .iPv6("e4c9:ca70:74d2:c3d9:33d6:c7c4:1e56:3bf5")
                        .build())
                    .fakerFormattedStrings(FakerFormattedStrings.builder()
                        .addressFormat("919 Vicarage Lane")
                        .dateFormat(LocalDate.parse("2023-05-22"))
                        .datetimeFormat(OffsetDateTime.parse("2023-10-31T03:05:14.934Z"))
                        .directoryFormat("/var/spool")
                        .domainFormat("aggravating-vanadyl.biz")
                        .emailFormat("Mateo_Rice@hotmail.com")
                        .filenameFormat("example.file")
                        .filepathFormat("/usr/obj/boo_magnificent_and.jpeg")
                        .imageFormat("https://loremflickr.com/2371/2464?lock=4205364297848786")
                        .ipv4Format("234.138.226.158")
                        .ipv6Format("5141:db2e:df9c:f06d:8b99:e7e4:2c56:addd")
                        .jsonFormat("{key: 3449297471398524, key1: null, key2: \"<value>\"}")
                        .macFormat("22:1f:e9:45:8a:7f")
                        .passwordFormat("zbz8X7IgZMC4iGZ")
                        .phoneFormat("(508) 609-3176 x5681")
                        .timezoneFormat("Pacific/Efate")
                        .unknownFormat("<value>")
                        .urlFormat("https://stark-trick.name")
                        .uuidFormat("8f5bc12b-caad-4053-9859-5e369841bdb9")
                        .zipcodeFormat("59560")
                        .build())
                    .fakerKebobCasePropertyNameStrings(FakerKebobCasePropertyNameStrings.builder()
                        .postalCode("10760-9151")
                        .build())
                    .fakerPascalCasePropertyNameStrings(FakerPascalCasePropertyNameStrings.builder()
                        .account("82091084")
                        .address("14760 Gerhold Prairie")
                        .amount("707.58")
                        .avatar("https://picsum.photos/seed/MQvsb2J6/1388/3681")
                        .city("Fayborough")
                        .color("turquoise")
                        .comment("The Football Is Good For Training And Recreational Purposes")
                        .company("Gusikowski Group")
                        .continent("Africa")
                        .country("Japan")
                        .countryCode("AG")
                        .createdAt("<value>")
                        .currency("Baht")
                        .currencyCode("PAB")
                        .currencyISO("SBD")
                        .datatype("varchar")
                        .default_("<value>")
                        .description("secondary punctually carp")
                        .directory("/var/yp")
                        .domain("front-seafood.biz")
                        .domainName("worse-heating.biz")
                        .email("Dell.Reichel10@yahoo.com")
                        .emailAddr("Coralie_Aufderhar@gmail.com")
                        .emailAddress("Janelle54@hotmail.com")
                        .expiredAt("<value>")
                        .expires("<value>")
                        .expiresAt("<value>")
                        .extension("wav")
                        .filename("example.file")
                        .filepath("/usr/lib/meh_rubbery.spx")
                        .filetype("video")
                        .firstName("Virgil")
                        .fullName("Celia Lockman")
                        .gender("Intersex")
                        .host("neighboring-backbone.org")
                        .hostName("fantastic-swim.net")
                        .httpStatus("206")
                        .iban("SK4700200863715636017876")
                        .id("<id>")
                        .ip("6070:9eea:ee8f:b94b:bdb6:a7b2:863a:c3b0")
                        .ipAddr("a56f:c6c2:9330:cbeb:47ed:5aa7:4ccc:e6aa")
                        .ipAddress("171.109.23.85")
                        .ipv4("63.149.162.195")
                        .ipv6("beae:91db:bbbe:a1eb:c170:8625:cbde:29fa")
                        .job("Direct Operations Specialist")
                        .json("{key: 5315518856826349, key1: null, key2: \"<value>\"}")
                        .key("<key>")
                        .lastName("Block")
                        .latitude("-26.8203")
                        .locale("zh")
                        .longitude("-51.1636")
                        .mac("6b:f7:74:51:67:41")
                        .manufacturer("Land Rover")
                        .material("Concrete")
                        .middleName("Gray")
                        .model("Challenger")
                        .password("sjTUYDUJQfNKef2")
                        .phone("378-421-8104 x788")
                        .pin("5500")
                        .postalCode("13074-5402")
                        .price("700.26")
                        .product("Incredible Steel Mouse")
                        .sex("male")
                        .statusCode("103")
                        .street("Eusebio Curve")
                        .timezone("Asia/Kabul")
                        .unit("steradian")
                        .updatedAt("<value>")
                        .uri("https://willing-e-mail.info")
                        .url("https://whirlwind-insolence.name")
                        .username("Hettie44")
                        .uuid("fc2e2cb0-e33c-4afd-9729-b4c83a9a6345")
                        .build())
                    .fakerSnakeCasePropertyNameStrings(FakerSnakeCasePropertyNameStrings.builder()
                        .countryCode("BE")
                        .createdAt("<value>")
                        .expiredAt("<value>")
                        .updatedAt("<value>")
                        .build())
                    .simpleObject(SimpleObject.builder()
                        .any("any")
                        .bool(true)
                        .date(LocalDate.parse("2020-01-01"))
                        .dateTime(OffsetDateTime.parse("2020-01-01T00:00:00.001Z"))
                        .enum_(Enum.ONE)
                        .float32(1.1f)
                        .int_(1L)
                        .int32(1)
                        .int32Enum(Int32Enum.FIFTY_FIVE)
                        .intEnum(IntEnum.Second)
                        .num(1.1d)
                        .str("test")
                        .bigint(new BigInteger("8821239038968084"))
                        .bigintStr(new BigInteger("9223372036854775808"))
                        .boolOpt(true)
                        .decimal(new BigDecimal("3.141592653589793"))
                        .decimalStr(new BigDecimal("3.14159265358979344719667586"))
                        .float64Str("1.1")
                        .int64Str("100")
                        .strOpt("testOptional")
                        .build())
                    .build())
                .optEnumParameter(OptEnumParameter.VALUE3)
                .build();

        UsageExamplePostResponse res = sdk.generation().usageExamplePost()
                .request(req)
                .security(UsageExamplePostSecurity.builder()
                    .password("YOUR_PASSWORD")
                    .username("YOUR_USERNAME")
                    .build())
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [UsageExamplePostRequest](../../models/operations/UsageExamplePostRequest.md)                                          | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `security`                                                                                                             | [org.openapis.openapi.models.operations.UsageExamplePostSecurity](../../models/operations/UsageExamplePostSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |

### Response

**[UsageExamplePostResponse](../../models/operations/UsageExamplePostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |