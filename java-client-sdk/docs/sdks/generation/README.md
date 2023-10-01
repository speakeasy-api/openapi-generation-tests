# Generation
(*generation*)

## Overview

Endpoints for purely testing valid generation behavior.

### Available Operations

* [anchorTypesGet](#anchortypesget)
* [arrayCircularReferenceGet](#arraycircularreferenceget)
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
                .setSecurity(new Security() {{
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
                deprecatedEnum = DeprecatedFieldInObjectDeprecatedEnum.B;
                deprecatedField = "Car";
                newField = "compressing";
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
                .setSecurity(new Security() {{
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
                callbackUrl = "http://diligent-activist.biz";
                testProp = "solid Branding Maserati";
            }}, "Maserati");

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
                .setSecurity(new Security() {{
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
                .setSecurity(new Security() {{
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
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            TypedParameterGenerationGetResponse res = sdk.generation.typedParameterGenerationGet(879275L, LocalDate.parse("2023-11-18"), 3346.96d, new TypedParameterGenerationGetObj(false, 8887.47d, "morph") {{
                bool = false;
                num = 4778.06d;
                str = "Progressive Riyal male";
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

            UsageExamplePostRequest req = new UsageExamplePostRequest(168827L, "Gasoline Sleek", false, LocalDate.parse("2021-04-23"), OffsetDateTime.parse("2022-09-13T20:44:04.193Z"), 1952.32d, "Shoes Brockton", 1062.86d, UsageExamplePostEnumParameter.VALUE1, 0d, 2346.82f, 5954.85d, 215216L, 834441, "example 2") {{
                requestBody = new UsageExamplePostRequestBody() {{
                    fakerFormattedStrings = new FakerFormattedStrings() {{
                        addressFormat = "279 Cassandra Club";
                        directoryFormat = "/var/mail";
                        domainFormat = "dizzy-geology.net";
                        emailFormat = "Pierre49@yahoo.com";
                        filenameFormat = "deposit_male_dram.mpg4";
                        filepathFormat = "/srv/deeply_gloves_program.st";
                        imageFormat = "https://loremflickr.com/640/480";
                        ipv4Format = "101.207.63.27";
                        ipv6Format = "64a2:58be:7e13:5866:7dac:95a0:1523:5912";
                        jsonFormat = "{rate: 57509, underwire: null, cent: \"male Iodine\"}";
                        macFormat = "02:f2:2d:15:6d:c5";
                        passwordFormat = "9nF4NLa49gS71tG";
                        phoneFormat = "1-891-918-2466";
                        timezoneFormat = "Asia/Jakarta";
                        unknownFormat = "Northeast Uzbekistan HDD";
                        urlFormat = "http://sane-network.net";
                        uuidFormat = "364b6b4a-48ad-4bb3-b96c-2e388ca7107f";
                        zipcodeFormat = "87997-8268";
                    }};;
                    fakerStrings = new FakerStrings() {{
                        city = "Carolinafort";
                        iban = "CY35007005052574022Q9F55000Q";
                        id = "<ID>";
                        iPv4 = "128.213.29.233";
                        iPv6 = "aa92:fb62:d7b0:075d:a754:8270:74e6:53f1";
                        account = "10128020";
                        address = "97181 Metz Trafficway";
                        amount = "896.58";
                        avatar = "https://loremflickr.com/640/480";
                        color = "grey";
                        comment = "Carbonite web goalkeeper gloves are ergonomically designed to give easy fit";
                        company = "Gottlieb Inc";
                        country = "Nicaragua";
                        countryCode = "BO";
                        currency = "Seychelles Rupee";
                        datatype = "point";
                        default_ = "as Rock";
                        description = "Extended encompassing framework";
                        directory = "/Users";
                        domainName = "lumpy-sand.name";
                        emailAddr = "Jayde_Stracke94@gmail.com";
                        extension = "m1v";
                        filename = "oof_plastic.gif";
                        filepath = "/srv/yum.mrcx";
                        filetype = "audio";
                        firstName = "Lula";
                        fullName = "Bonnie Nitzsche";
                        gender = "Transmasculine";
                        job = "Legacy Markets Orchestrator";
                        json = "{housing: 65187, wine: null, planter: \"Lafayette array\"}";
                        key = "<key>";
                        lastName = "Leannon";
                        latitude = "-38.3898";
                        locale = "ko";
                        longitude = "179.7448";
                        mac = "99:b2:4a:a3:1c:16";
                        manufacturer = "Nissan";
                        material = "Rubber";
                        middleName = "Austin";
                        model = "Model Y";
                        password = "qIlrvZKw0C22gKb";
                        phone = "1-646-984-1595 x907";
                        pin = "4985";
                        postalCode = "51983";
                        price = "356.00";
                        product = "Handcrafted Plastic Cheese";
                        sex = "male";
                        street = "Humberto Court";
                        timezone = "Europe/Ljubljana";
                        unit = "gray";
                        url = "http://striped-cutlet.net";
                        username = "Jeanette82";
                        uuid = "004523e8-6559-4551-a938-6a9f8f4b14b9";
                    }};;
                    simpleObject = new SimpleObject("Pickup", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                        bigint = 513927L;
                        bigintStr = "CLI South";
                        boolOpt = true;
                        decimal = 2056.71d;
                        intOptNull = 999999L;
                        numOptNull = 1.1d;
                        strOpt = "optional example";
                    }};;
                }};;
                bigintParameterOptional = 972672L;
                bigintStrParameterOptional = "sensor Trans Luxurious";
                decimalParameterOptional = 651.74d;
                decimalStrParameterOptional = "Thorium Planner Southwest";
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

