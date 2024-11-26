# ResponseBodies
(*responseBodies()*)

## Overview

Endpoints for testing response bodies.

### Available Operations

* [flattenedEnvelopePaginationResponse](#flattenedenvelopepaginationresponse)
* [flattenedEnvelopeResponse](#flattenedenveloperesponse)
* [flattenedEnvelopeUnionResponse](#flattenedenvelopeunionresponse)
* [flattenedUnionResponse](#flattenedunionresponse)
* [overriddenFieldNamesPost](#overriddenfieldnamespost)
* [responseBodyAdditionalPropertiesAnyPost](#responsebodyadditionalpropertiesanypost)
* [responseBodyAdditionalPropertiesComplexNumbersPost](#responsebodyadditionalpropertiescomplexnumberspost)
* [responseBodyAdditionalPropertiesDatePost](#responsebodyadditionalpropertiesdatepost)
* [responseBodyAdditionalPropertiesObjectPost](#responsebodyadditionalpropertiesobjectpost)
* [responseBodyAdditionalPropertiesPost](#responsebodyadditionalpropertiespost)
* [responseBodyBytesGet](#responsebodybytesget)
* [responseBodyDecimalStr](#responsebodydecimalstr)
* [responseBodyEmptyWithHeaders](#responsebodyemptywithheaders)
* [responseBodyMissing2xxOr3xxGet](#responsebodymissing2xxor3xxget)
* [responseBodyMultilineStringPost](#responsebodymultilinestringpost)
* [responseBodyOptionalGet](#responsebodyoptionalget)
* [responseBodyReadOnly](#responsebodyreadonly)
* [responseBodyStringGet](#responsebodystringget)
* [responseBodyXmlGet](#responsebodyxmlget)

## flattenedEnvelopePaginationResponse

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

        sdk.responseBodies().flattenedEnvelopePaginationResponse()
                .cursor("<value>")
                .callAsStreamUnwrapped()
            .forEach(item -> {
               // handle item
            });

    }
}
```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `cursor`                                                             | *Optional\<String>*                                                  | :heavy_minus_sign:                                                   | The page token used to request a specific page of the search results |

### Response

**[FlattenedEnvelopePaginationResponseResponse](../../models/operations/FlattenedEnvelopePaginationResponseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## flattenedEnvelopeResponse

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.FlattenedEnvelopeResponseResponse;
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

        FlattenedEnvelopeResponseResponse res = sdk.responseBodies().flattenedEnvelopeResponse()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[FlattenedEnvelopeResponseResponse](../../models/operations/FlattenedEnvelopeResponseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## flattenedEnvelopeUnionResponse

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.FlattenedEnvelopeUnionResponseResponse;
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

        FlattenedEnvelopeUnionResponseResponse res = sdk.responseBodies().flattenedEnvelopeUnionResponse()
                .call();

        if (res.twoHundredApplicationJsonObject().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[FlattenedEnvelopeUnionResponseResponse](../../models/operations/FlattenedEnvelopeUnionResponseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## flattenedUnionResponse

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.FlattenedUnionResponseResponse;
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

        FlattenedUnionResponseResponse res = sdk.responseBodies().flattenedUnionResponse()
                .call();

        if (res.twoHundredApplicationJsonObject().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[FlattenedUnionResponseResponse](../../models/operations/FlattenedUnionResponseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## overriddenFieldNamesPost

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.OverriddenFieldNamesPostRequestBody;
import org.openapis.openapi.models.operations.OverriddenFieldNamesPostResponse;
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

        OverriddenFieldNamesPostRequestBody req = OverriddenFieldNamesPostRequestBody.builder()
                .build();

        OverriddenFieldNamesPostResponse res = sdk.responseBodies().overriddenFieldNamesPost()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [OverriddenFieldNamesPostRequestBody](../../models/operations/OverriddenFieldNamesPostRequestBody.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[OverriddenFieldNamesPostResponse](../../models/operations/OverriddenFieldNamesPostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## responseBodyAdditionalPropertiesAnyPost

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyAdditionalPropertiesAnyPostResponse;
import org.openapis.openapi.models.shared.ObjWithAnyAdditionalProperties;
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

        ObjWithAnyAdditionalProperties req = ObjWithAnyAdditionalProperties.builder()
                .build();

        ResponseBodyAdditionalPropertiesAnyPostResponse res = sdk.responseBodies().responseBodyAdditionalPropertiesAnyPost()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ObjWithAnyAdditionalProperties](../../models/shared/ObjWithAnyAdditionalProperties.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ResponseBodyAdditionalPropertiesAnyPostResponse](../../models/operations/ResponseBodyAdditionalPropertiesAnyPostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## responseBodyAdditionalPropertiesComplexNumbersPost

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyAdditionalPropertiesComplexNumbersPostResponse;
import org.openapis.openapi.models.shared.ObjWithComplexNumbersAdditionalProperties;
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

        ObjWithComplexNumbersAdditionalProperties req = ObjWithComplexNumbersAdditionalProperties.builder()
                .normalField("<value>")
                .build();

        ResponseBodyAdditionalPropertiesComplexNumbersPostResponse res = sdk.responseBodies().responseBodyAdditionalPropertiesComplexNumbersPost()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [ObjWithComplexNumbersAdditionalProperties](../../models/shared/ObjWithComplexNumbersAdditionalProperties.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |

### Response

**[ResponseBodyAdditionalPropertiesComplexNumbersPostResponse](../../models/operations/ResponseBodyAdditionalPropertiesComplexNumbersPostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## responseBodyAdditionalPropertiesDatePost

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyAdditionalPropertiesDatePostResponse;
import org.openapis.openapi.models.shared.ObjWithDateAdditionalProperties;
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

        ObjWithDateAdditionalProperties req = ObjWithDateAdditionalProperties.builder()
                .normalField("<value>")
                .build();

        ResponseBodyAdditionalPropertiesDatePostResponse res = sdk.responseBodies().responseBodyAdditionalPropertiesDatePost()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ObjWithDateAdditionalProperties](../../models/shared/ObjWithDateAdditionalProperties.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ResponseBodyAdditionalPropertiesDatePostResponse](../../models/operations/ResponseBodyAdditionalPropertiesDatePostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## responseBodyAdditionalPropertiesObjectPost

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyAdditionalPropertiesObjectPostResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.ObjWithObjAdditionalProperties;
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

        ObjWithObjAdditionalProperties req = ObjWithObjAdditionalProperties.builder()
                .additionalProperties(List.of(
                    617205L))
                .datetime(OffsetDateTime.parse("2023-11-13T16:06:00.892Z"))
                .additionalPropertiesT(Map.ofEntries(
                    Map.entry("key", SimpleObject.builder()
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
                        .build())))
                .build();

        ResponseBodyAdditionalPropertiesObjectPostResponse res = sdk.responseBodies().responseBodyAdditionalPropertiesObjectPost()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ObjWithObjAdditionalProperties](../../models/shared/ObjWithObjAdditionalProperties.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ResponseBodyAdditionalPropertiesObjectPostResponse](../../models/operations/ResponseBodyAdditionalPropertiesObjectPostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## responseBodyAdditionalPropertiesPost

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyAdditionalPropertiesPostResponse;
import org.openapis.openapi.models.shared.ObjWithStringAdditionalProperties;
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

        ObjWithStringAdditionalProperties req = ObjWithStringAdditionalProperties.builder()
                .normalField("<value>")
                .build();

        ResponseBodyAdditionalPropertiesPostResponse res = sdk.responseBodies().responseBodyAdditionalPropertiesPost()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ObjWithStringAdditionalProperties](../../models/shared/ObjWithStringAdditionalProperties.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ResponseBodyAdditionalPropertiesPostResponse](../../models/operations/ResponseBodyAdditionalPropertiesPostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## responseBodyBytesGet

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyBytesGetResponse;
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

        ResponseBodyBytesGetResponse res = sdk.responseBodies().responseBodyBytesGet()
                .seed(95380)
                .call();

        if (res.bytes().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter            | Type                 | Required             | Description          |
| -------------------- | -------------------- | -------------------- | -------------------- |
| `seed`               | *Optional\<Integer>* | :heavy_minus_sign:   | N/A                  |

### Response

**[ResponseBodyBytesGetResponse](../../models/operations/ResponseBodyBytesGetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## responseBodyDecimalStr

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.math.BigDecimal;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyDecimalStrResponse;
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

        BigDecimal req = new BigDecimal("6437.62");

        ResponseBodyDecimalStrResponse res = sdk.responseBodies().responseBodyDecimalStr()
                .request(req)
                .call();

        if (res.decimal().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [BigDecimal](../../models//.md)            | :heavy_check_mark:                         | The request object to use for the request. |
| `serverURL`                                | *String*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |

### Response

**[ResponseBodyDecimalStrResponse](../../models/operations/ResponseBodyDecimalStrResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## responseBodyEmptyWithHeaders

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyEmptyWithHeadersResponse;
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

        ResponseBodyEmptyWithHeadersResponse res = sdk.responseBodies().responseBodyEmptyWithHeaders()
                .xNumberHeader(1751.81d)
                .xStringHeader("<value>")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `xNumberHeader`    | *double*           | :heavy_check_mark: | N/A                |
| `xStringHeader`    | *String*           | :heavy_check_mark: | N/A                |

### Response

**[ResponseBodyEmptyWithHeadersResponse](../../models/operations/ResponseBodyEmptyWithHeadersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## responseBodyMissing2xxOr3xxGet

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyMissing2xxOr3xxGetResponse;
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

        ResponseBodyMissing2xxOr3xxGetResponse res = sdk.responseBodies().responseBodyMissing2xxOr3xxGet()
                .call();

        // handle response
    }
}
```

### Response

**[ResponseBodyMissing2xxOr3xxGetResponse](../../models/operations/ResponseBodyMissing2xxOr3xxGetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## responseBodyMultilineStringPost

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.util.List;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyMultilineStringPostRequestBody;
import org.openapis.openapi.models.operations.ResponseBodyMultilineStringPostResponse;
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

        ResponseBodyMultilineStringPostRequestBody req = ResponseBodyMultilineStringPostRequestBody.builder()
                .array(List.of(
                    "<value>"))
                .build();

        ResponseBodyMultilineStringPostResponse res = sdk.responseBodies().responseBodyMultilineStringPost()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [ResponseBodyMultilineStringPostRequestBody](../../models/operations/ResponseBodyMultilineStringPostRequestBody.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |

### Response

**[ResponseBodyMultilineStringPostResponse](../../models/operations/ResponseBodyMultilineStringPostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## responseBodyOptionalGet

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyOptionalGetResponse;
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

        ResponseBodyOptionalGetResponse res = sdk.responseBodies().responseBodyOptionalGet()
                .call();

        if (res.typedObject1().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[ResponseBodyOptionalGetResponse](../../models/operations/ResponseBodyOptionalGetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## responseBodyReadOnly

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyReadOnlyResponse;
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

        ResponseBodyReadOnlyResponse res = sdk.responseBodies().responseBodyReadOnly()
                .call();

        if (res.readOnlyObject().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[ResponseBodyReadOnlyResponse](../../models/operations/ResponseBodyReadOnlyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## responseBodyStringGet

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyStringGetResponse;
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

        ResponseBodyStringGetResponse res = sdk.responseBodies().responseBodyStringGet()
                .call();

        if (res.html().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[ResponseBodyStringGetResponse](../../models/operations/ResponseBodyStringGetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## responseBodyXmlGet

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyXmlGetResponse;
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

        ResponseBodyXmlGetResponse res = sdk.responseBodies().responseBodyXmlGet()
                .call();

        if (res.xml().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[ResponseBodyXmlGetResponse](../../models/operations/ResponseBodyXmlGetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |