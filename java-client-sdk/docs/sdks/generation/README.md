# generation

## Overview

Endpoints for purely testing valid generation behavior.

### Available Operations

* [anchorTypesGet](#anchortypesget)
* [circularReferenceGet](#circularreferenceget)
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
                .setSecurity(new Security() {{
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
                .setSecurity(new Security() {{
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
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.DeprecatedFieldInObject req = new DeprecatedFieldInObject() {{
                deprecatedEnum = DeprecatedFieldInObjectDeprecatedEnum.C;
                deprecatedField = "facere";
                newField = "ea";
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
                .setSecurity(new Security() {{
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
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            DeprecatedOperationNoCommentsGetResponse res = sdk.generation.deprecatedOperationNoCommentsGet("aliquid");

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
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            DeprecatedOperationWithCommentsGetResponse res = sdk.generation.deprecatedOperationWithCommentsGet("laborum", "accusamus");

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
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            EmptyObjectGetResponse res = sdk.generation.emptyObjectGet(new EmptyObjectParam() {{}});

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
                .setSecurity(new Security() {{
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
                .setSecurity(new Security() {{
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
                .setSecurity(new Security() {{
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
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            IgnoresPostResponse res = sdk.generation.ignoresPost(new IgnoresPostApplicationJSON() {{
                callbackUrl = "http://oblong-epoxy.org";
                testProp = "delectus";
            }}, "quidem");

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
| `requestBody`                                                                                                              | [org.openapis.openapi.models.operations.IgnoresPostApplicationJSON](../../models/operations/IgnoresPostApplicationJSON.md) | :heavy_minus_sign:                                                                                                         | N/A                                                                                                                        |
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
                .setSecurity(new Security() {{
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
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            TypedParameterGenerationGetResponse res = sdk.generation.typedParameterGenerationGet(588465L, LocalDate.parse("2021-09-06"), 5013.24d, new TypedParameterGenerationGetObj(false, 2305.33d, "deserunt") {{
                bool = false;
                num = 5332.06d;
                str = "sapiente";
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

            UsageExamplePostRequest req = new UsageExamplePostRequest(111111L, false, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), 1.1d, 2.2222222d, UsageExamplePostEnumParameter.VALUE3, 0d, 1.1f, 1.1d, 111111L, 1, "example 2") {{
                requestBody = new UsageExamplePostRequestBody() {{
                    email = "Libby.Moen@yahoo.com";
                    formatEmail = "Elisha.Rau@yahoo.com";
                    formatUri = "http://hideous-ottoman.net";
                    formatUuid = "6e214195-9890-4afa-963e-2516fe4c8b71";
                    hostname = "burly-trachoma.info";
                    ipv4 = "182.120.255.215";
                    ipv6 = "2ed0:2892:1cdd:c692:601f:b576:b0d5:f0d3";
                    simpleObject = new SimpleObject("aut", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                        bigint = 944124L;
                        bigintStr = "libero";
                        boolOpt = true;
                        decimal = 7499.99d;
                        intOptNull = 999999L;
                        numOptNull = 1.1d;
                        strOpt = "optional example";
                    }};;
                    unknown = "dolores";
                    uri = "http://mealy-kilometer.com";
                    uuid = "53202c73-d5fe-49b9-8c28-909b3fe49a8d";
                }};;
                optEnumParameter = UsageExamplePostOptEnumParameter.VALUE3;
            }};            

            UsageExamplePostResponse res = sdk.generation.usageExamplePost(req, new UsageExamplePostSecurity("YOUR_PASSWORD", "YOUR_USERNAME") {{
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

