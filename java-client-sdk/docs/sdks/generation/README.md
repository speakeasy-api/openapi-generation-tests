# Generation
(*generation*)

## Overview

Endpoints for purely testing valid generation behavior.

### Available Operations

* [anchorTypesGet](#anchortypesget)
* [arrayCircularReferenceGet](#arraycircularreferenceget)
* [circularReferenceGet](#circularreferenceget)
* [dateParamWithDefault](#dateparamwithdefault)
* [dateTimeParamWithDefault](#datetimeparamwithdefault)
* [decimalParamWithDefault](#decimalparamwithdefault)
* [deprecatedFieldInSchemaPost](#deprecatedfieldinschemapost)
* [deprecatedObjectInSchemaGet](#deprecatedobjectinschemaget)
* [~~deprecatedOperationNoCommentsGet~~](#deprecatedoperationnocommentsget) - :warning: **Deprecated**
* [~~deprecatedOperationWithCommentsGet~~](#deprecatedoperationwithcommentsget) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** Use `simplePathParameterObjects` instead.
* [emptyObjectGet](#emptyobjectget)
* [emptyResponseObjectWithCommentGet](#emptyresponseobjectwithcommentget)
* [globalNameOverridden](#globalnameoverridden)
* [ignoredGenerationGet](#ignoredgenerationget)
* [ignoresPost](#ignorespost)
* [nameOverride](#nameoverride)
* [objectCircularReferenceGet](#objectcircularreferenceget)
* [oneOfCircularReferenceGet](#oneofcircularreferenceget)
* [typedParameterGenerationGet](#typedparametergenerationget)
* [usageExamplePost](#usageexamplepost) - An operation used for testing usage examples

## anchorTypesGet

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.AnchorTypesGetResponse;
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

            AnchorTypesGetResponse res = sdk.generation.anchorTypesGet();

            if (res.typeFromAnchor != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[org.openapis.openapi.models.operations.AnchorTypesGetResponse](../../models/operations/AnchorTypesGetResponse.md)**


## arrayCircularReferenceGet

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ArrayCircularReferenceGetResponse;
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

            ArrayCircularReferenceGetResponse res = sdk.generation.arrayCircularReferenceGet();

            if (res.arrayCircularReferenceObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[org.openapis.openapi.models.operations.ArrayCircularReferenceGetResponse](../../models/operations/ArrayCircularReferenceGetResponse.md)**


## circularReferenceGet

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.CircularReferenceGetResponse;
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

            CircularReferenceGetResponse res = sdk.generation.circularReferenceGet();

            if (res.validCircularReferenceObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[org.openapis.openapi.models.operations.CircularReferenceGetResponse](../../models/operations/CircularReferenceGetResponse.md)**


## dateParamWithDefault

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.DateParamWithDefaultRequest;
import org.openapis.openapi.models.operations.DateParamWithDefaultResponse;
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

            DateParamWithDefaultResponse res = sdk.generation.dateParamWithDefault(LocalDate.parse("2021-11-30"));

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

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `dateInput`                                                                     | [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html) | :heavy_check_mark:                                                              | A date parameter with a default value                                           |


### Response

**[org.openapis.openapi.models.operations.DateParamWithDefaultResponse](../../models/operations/DateParamWithDefaultResponse.md)**


## dateTimeParamWithDefault

### Example Usage

```java
package hello.world;

import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.DateTimeParamWithDefaultRequest;
import org.openapis.openapi.models.operations.DateTimeParamWithDefaultResponse;
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

            DateTimeParamWithDefaultResponse res = sdk.generation.dateTimeParamWithDefault(OffsetDateTime.parse("2023-02-09T21:53:21.077Z"));

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

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `dateTimeInput`                                                                           | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_check_mark:                                                                        | A date time parameter with a default value                                                |


### Response

**[org.openapis.openapi.models.operations.DateTimeParamWithDefaultResponse](../../models/operations/DateTimeParamWithDefaultResponse.md)**


## decimalParamWithDefault

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.DecimalParamWithDefaultRequest;
import org.openapis.openapi.models.operations.DecimalParamWithDefaultResponse;
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

            DecimalParamWithDefaultResponse res = sdk.generation.decimalParamWithDefault(4060.06d);

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

| Parameter                                | Type                                     | Required                                 | Description                              |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `decimalInput`                           | *Double*                                 | :heavy_check_mark:                       | A decimal parameter with a default value |


### Response

**[org.openapis.openapi.models.operations.DecimalParamWithDefaultResponse](../../models/operations/DecimalParamWithDefaultResponse.md)**


## deprecatedFieldInSchemaPost

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.DeprecatedFieldInSchemaPostResponse;
import org.openapis.openapi.models.shared.DeprecatedFieldInObject;
import org.openapis.openapi.models.shared.DeprecatedFieldInObjectDeprecatedEnum;
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

            org.openapis.openapi.models.shared.DeprecatedFieldInObject req = new DeprecatedFieldInObject(){{
                deprecatedEnum = DeprecatedFieldInObjectDeprecatedEnum.B;
                deprecatedField = "Bike";
                newField = "Avon";
            }};            

            DeprecatedFieldInSchemaPostResponse res = sdk.generation.deprecatedFieldInSchemaPost(req);

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

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [org.openapis.openapi.models.shared.DeprecatedFieldInObject](../../models/shared/DeprecatedFieldInObject.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[org.openapis.openapi.models.operations.DeprecatedFieldInSchemaPostResponse](../../models/operations/DeprecatedFieldInSchemaPostResponse.md)**


## deprecatedObjectInSchemaGet

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.DeprecatedObjectInSchemaGetResponse;
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

            DeprecatedObjectInSchemaGetResponse res = sdk.generation.deprecatedObjectInSchemaGet();

            if (res.deprecatedObjectInSchemaGet200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[org.openapis.openapi.models.operations.DeprecatedObjectInSchemaGetResponse](../../models/operations/DeprecatedObjectInSchemaGetResponse.md)**


## ~~deprecatedOperationNoCommentsGet~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.DeprecatedOperationNoCommentsGetRequest;
import org.openapis.openapi.models.operations.DeprecatedOperationNoCommentsGetResponse;
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

            DeprecatedOperationNoCommentsGetResponse res = sdk.generation.deprecatedOperationNoCommentsGet("Account");

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

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `deprecatedParameter`                                                                                                   | *String*                                                                                                                | :heavy_minus_sign:                                                                                                      | : warning: ** DEPRECATED **: This will be removed in a future release, please migrate away from it as soon as possible. |


### Response

**[org.openapis.openapi.models.operations.DeprecatedOperationNoCommentsGetResponse](../../models/operations/DeprecatedOperationNoCommentsGetResponse.md)**


## ~~deprecatedOperationWithCommentsGet~~

This is an endpoint setup to test deprecation with comments

> :warning: **DEPRECATED**: This operation is deprecated. Use `simplePathParameterObjects` instead.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.DeprecatedOperationWithCommentsGetRequest;
import org.openapis.openapi.models.operations.DeprecatedOperationWithCommentsGetResponse;
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

            DeprecatedOperationWithCommentsGetResponse res = sdk.generation.deprecatedOperationWithCommentsGet("Account", "actuating");

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `deprecatedParameter`                                                                                            | *String*                                                                                                         | :heavy_minus_sign:                                                                                               | : warning: ** DEPRECATED **: This parameter is deprecated. Use newParameter instead.<br/><br/>This is a string parameter |
| `newParameter`                                                                                                   | *String*                                                                                                         | :heavy_minus_sign:                                                                                               | This is a string parameter                                                                                       |


### Response

**[org.openapis.openapi.models.operations.DeprecatedOperationWithCommentsGetResponse](../../models/operations/DeprecatedOperationWithCommentsGetResponse.md)**


## emptyObjectGet

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.EmptyObjectGetRequest;
import org.openapis.openapi.models.operations.EmptyObjectGetResponse;
import org.openapis.openapi.models.shared.EmptyObjectParam;
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

            EmptyObjectGetResponse res = sdk.generation.emptyObjectGet(new EmptyObjectParam(){{}});

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

| Parameter                                                                                      | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `emptyObject`                                                                                  | [org.openapis.openapi.models.shared.EmptyObjectParam](../../models/shared/EmptyObjectParam.md) | :heavy_check_mark:                                                                             | N/A                                                                                            |


### Response

**[org.openapis.openapi.models.operations.EmptyObjectGetResponse](../../models/operations/EmptyObjectGetResponse.md)**


## emptyResponseObjectWithCommentGet

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.EmptyResponseObjectWithCommentGetResponse;
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

            EmptyResponseObjectWithCommentGetResponse res = sdk.generation.emptyResponseObjectWithCommentGet();

            if (res.body != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[org.openapis.openapi.models.operations.EmptyResponseObjectWithCommentGetResponse](../../models/operations/EmptyResponseObjectWithCommentGetResponse.md)**


## globalNameOverridden

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GetGlobalNameOverrideResponse;
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

            GetGlobalNameOverrideResponse res = sdk.generation.globalNameOverridden();

            if (res.getGlobalNameOverride200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[org.openapis.openapi.models.operations.GetGlobalNameOverrideResponse](../../models/operations/GetGlobalNameOverrideResponse.md)**


## ignoredGenerationGet

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.callbacks.IgnoredGenerationGetNotIgnoredCallbackRequestBody;
import org.openapis.openapi.models.callbacks.IgnoredGenerationGetNotIgnoredCallbackResponse;
import org.openapis.openapi.models.callbacks.IgnoredGenerationGetSingledIgnoredCallbackOperationRequestBody;
import org.openapis.openapi.models.callbacks.IgnoredGenerationGetSingledIgnoredCallbackOperationResponse;
import org.openapis.openapi.models.operations.IgnoredGenerationGetResponse;
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

            IgnoredGenerationGetResponse res = sdk.generation.ignoredGenerationGet();

            if (res.ignoredGenerationGet200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[org.openapis.openapi.models.operations.IgnoredGenerationGetResponse](../../models/operations/IgnoredGenerationGetResponse.md)**


## ignoresPost

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.IgnoresPostApplicationJSON;
import org.openapis.openapi.models.operations.IgnoresPostRequest;
import org.openapis.openapi.models.operations.IgnoresPostResponse;
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

            IgnoresPostResponse res = sdk.generation.ignoresPost(new IgnoresPostApplicationJSON(){{}}, "Bike");

            if (res.httpBinSimpleJsonObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                              | [org.openapis.openapi.models.operations.IgnoresPostApplicationJSON](../../models/operations/IgnoresPostApplicationJSON.md) | :heavy_check_mark:                                                                                                         | N/A                                                                                                                        |
| `testParam`                                                                                                                | *String*                                                                                                                   | :heavy_minus_sign:                                                                                                         | N/A                                                                                                                        |


### Response

**[org.openapis.openapi.models.operations.IgnoresPostResponse](../../models/operations/IgnoresPostResponse.md)**


## nameOverride

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.NameOverrideGetEnumNameOverride;
import org.openapis.openapi.models.operations.NameOverrideGetRequest;
import org.openapis.openapi.models.operations.NameOverrideGetResponse;
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

            NameOverrideGetResponse res = sdk.generation.nameOverride(NameOverrideGetEnumNameOverride.VALUE3, "example");

            if (res.overriddenResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          | Example                                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `testEnumQueryParam`                                                                                                                 | [org.openapis.openapi.models.operations.NameOverrideGetEnumNameOverride](../../models/operations/NameOverrideGetEnumNameOverride.md) | :heavy_check_mark:                                                                                                                   | An enum type                                                                                                                         | value3                                                                                                                               |
| `testQueryParam`                                                                                                                     | *String*                                                                                                                             | :heavy_check_mark:                                                                                                                   | N/A                                                                                                                                  | example                                                                                                                              |


### Response

**[org.openapis.openapi.models.operations.NameOverrideGetResponse](../../models/operations/NameOverrideGetResponse.md)**


## objectCircularReferenceGet

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ObjectCircularReferenceGetResponse;
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

            ObjectCircularReferenceGetResponse res = sdk.generation.objectCircularReferenceGet();

            if (res.objectCircularReferenceObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[org.openapis.openapi.models.operations.ObjectCircularReferenceGetResponse](../../models/operations/ObjectCircularReferenceGetResponse.md)**


## oneOfCircularReferenceGet

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.OneOfCircularReferenceGetResponse;
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

            OneOfCircularReferenceGetResponse res = sdk.generation.oneOfCircularReferenceGet();

            if (res.oneOfCircularReferenceObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[org.openapis.openapi.models.operations.OneOfCircularReferenceGetResponse](../../models/operations/OneOfCircularReferenceGetResponse.md)**


## typedParameterGenerationGet

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.TypedParameterGenerationGetObj;
import org.openapis.openapi.models.operations.TypedParameterGenerationGetRequest;
import org.openapis.openapi.models.operations.TypedParameterGenerationGetResponse;
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

            TypedParameterGenerationGetResponse res = sdk.generation.typedParameterGenerationGet(879275L, LocalDate.parse("2023-11-18"), 3346.96d, new TypedParameterGenerationGetObj(false, 6735.52d, "Riyal"){{
                bool = false;
                num = 4778.06d;
                str = "innocently";
            }});

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

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `bigint`                                                                                                                           | *Long*                                                                                                                             | :heavy_minus_sign:                                                                                                                 | N/A                                                                                                                                |
| `date`                                                                                                                             | [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html)                                                    | :heavy_minus_sign:                                                                                                                 | N/A                                                                                                                                |
| `decimal`                                                                                                                          | *Double*                                                                                                                           | :heavy_minus_sign:                                                                                                                 | N/A                                                                                                                                |
| `obj`                                                                                                                              | [org.openapis.openapi.models.operations.TypedParameterGenerationGetObj](../../models/operations/TypedParameterGenerationGetObj.md) | :heavy_minus_sign:                                                                                                                 | N/A                                                                                                                                |


### Response

**[org.openapis.openapi.models.operations.TypedParameterGenerationGetResponse](../../models/operations/TypedParameterGenerationGetResponse.md)**


## usageExamplePost

An operation used for testing usage examples that includes a large array of parameters and input types to ensure that all are handled correctly

Usage example docs
<https://docs.example.com>

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.UsageExamplePostEnumParameter;
import org.openapis.openapi.models.operations.UsageExamplePostOptEnumParameter;
import org.openapis.openapi.models.operations.UsageExamplePostRequest;
import org.openapis.openapi.models.operations.UsageExamplePostRequestBody;
import org.openapis.openapi.models.operations.UsageExamplePostResponse;
import org.openapis.openapi.models.operations.UsageExamplePostSecurity;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.FakerFormattedStrings;
import org.openapis.openapi.models.shared.FakerStrings;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;
import org.openapis.openapi.models.shared.SimpleObjectInt32Enum;
import org.openapis.openapi.models.shared.SimpleObjectIntEnum;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            UsageExamplePostRequest req = new UsageExamplePostRequest(168827L, "invoice", false, LocalDate.parse("2022-07-22"), OffsetDateTime.parse("2021-10-21T09:16:58.799Z"), OffsetDateTime.parse("2022-07-26T23:56:07.107Z"), 2911.37d, "Manager", 1029.75d, UsageExamplePostEnumParameter.VALUE2, 0d, 1952.32f, 5696.63d, 264295L, 352778, "example 2"){{
                requestBody = new UsageExamplePostRequestBody(){{
                    fakerFormattedStrings = new FakerFormattedStrings(){{
                        addressFormat = "7011 Darrin Park";
                        directoryFormat = "/home/user";
                        domainFormat = "tame-homogenate.org";
                        emailFormat = "Oran16@gmail.com";
                        filenameFormat = "cornmeal.png";
                        filepathFormat = "/usr/green_target.z4";
                        imageFormat = "https://loremflickr.com/640/480";
                        ipv4Format = "116.31.181.178";
                        ipv6Format = "73ac:9ee2:348d:76c3:164a:258b:e7e1:3586";
                        jsonFormat = "{hill: 44935, spider: null, poem: \"lumen\"}";
                        macFormat = "5a:01:52:35:91:2b";
                        passwordFormat = "WzdveK0sHokC9nF";
                        phoneFormat = "504.722.1221";
                        timezoneFormat = "Asia/Krasnoyarsk";
                        unknownFormat = "alarm";
                        urlFormat = "https://wilted-cytoplasm.biz";
                        uuidFormat = "e0f62de2-e2d4-47a9-bf10-0f753b9b364b";
                        zipcodeFormat = "73625";
                    }};
                    fakerStrings = new FakerStrings(){{
                        city = "Schuppecester";
                        iban = "NO0300631256004";
                        id = "<ID>";
                        iPv4 = "251.251.208.201";
                        iPv6 = "ffbd:3ad7:2b20:8b2c:8188:308b:b979:0237";
                        account = "29659826";
                        address = "2500 Ambrose Circles";
                        amount = "89.73";
                        avatar = "https://loremflickr.com/640/480";
                        color = "fuchsia";
                        comment = "Carbonite web goalkeeper gloves are ergonomically designed to give easy fit";
                        company = "Sipes - Buckridge";
                        country = "Turkey";
                        countryCode = "NF";
                        currency = "Pakistan Rupee";
                        datatype = "real";
                        default_ = "Predovic";
                        description = "Switchable holistic open system";
                        directory = "/bin";
                        domainName = "all-input.biz";
                        emailAddr = "Litzy.Kozey@hotmail.com";
                        extension = "jpeg";
                        filename = "east_ubiquitous.png";
                        filepath = "/opt/buying.iota";
                        filetype = "video";
                        firstName = "Beulah";
                        fullName = "Angel Bednar II";
                        gender = "Two-spirit person";
                        job = "Legacy Security Facilitator";
                        json = "{cart: 88901, nonsense: null, switch: \"jovially\"}";
                        key = "<key>";
                        lastName = "Murazik";
                        latitude = "-66.8568";
                        locale = "en_IE";
                        longitude = "-124.4225";
                        mac = "a1:bf:6e:19:04:55";
                        manufacturer = "Mercedes Benz";
                        material = "Granite";
                        middleName = "Reese";
                        model = "Land Cruiser";
                        password = "NrTzqbDz8AXYBy7";
                        phone = "1-316-949-7364 x6960";
                        pin = "4535";
                        postalCode = "69567";
                        price = "155.00";
                        product = "Incredible Rubber Tuna";
                        sex = "female";
                        street = "Novella Center";
                        timezone = "Europe/Amsterdam";
                        unit = "sievert";
                        url = "https://burly-nondisclosure.org";
                        username = "Herman79";
                        uuid = "de9701e2-5221-4b7b-a969-fc729e9f1c7e";
                    }};
                    simpleObject = new SimpleObject("any", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z"), Enum.ONE, 1.1f, 1L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "test"){{
                        bigint = 8821239038968084L;
                        bigintStr = "9223372036854775808";
                        boolOpt = true;
                        decimal = 3.141592653589793d;
                        decimalStr = "3.14159265358979344719667586";
                        intOptNull = 870078L;
                        numOptNull = 5823.74d;
                        strOpt = "testOptional";
                    }};
                }};
                bigintParameterOptional = 134186L;
                bigintStrParameterOptional = "bypass";
                decimalParameterOptional = 9388.52d;
                decimalStrParameterOptional = "Fiat";
                optEnumParameter = UsageExamplePostOptEnumParameter.VALUE3;
            }};            

            UsageExamplePostResponse res = sdk.generation.usageExamplePost(req, new UsageExamplePostSecurity("YOUR_PASSWORD", "YOUR_USERNAME"){{
                password = "YOUR_PASSWORD";
                username = "YOUR_USERNAME";
            }});

            if (res.usageExamplePost200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [org.openapis.openapi.models.operations.UsageExamplePostRequest](../../models/operations/UsageExamplePostRequest.md)   | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `security`                                                                                                             | [org.openapis.openapi.models.operations.UsageExamplePostSecurity](../../models/operations/UsageExamplePostSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |


### Response

**[org.openapis.openapi.models.operations.UsageExamplePostResponse](../../models/operations/UsageExamplePostResponse.md)**

