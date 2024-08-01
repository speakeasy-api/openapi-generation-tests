# Parameters
(*parameters()*)

## Overview

Endpoints for testing parameters.

### Available Operations

* [deepObjectQueryParamsMap](#deepobjectqueryparamsmap)
* [deepObjectQueryParamsObject](#deepobjectqueryparamsobject)
* [duplicateParam](#duplicateparam)
* [formQueryParamsArray](#formqueryparamsarray)
* [formQueryParamsCamelObject](#formqueryparamscamelobject)
* [formQueryParamsMap](#formqueryparamsmap)
* [formQueryParamsObject](#formqueryparamsobject)
* [formQueryParamsPrimitive](#formqueryparamsprimitive)
* [formQueryParamsRefParamObject](#formqueryparamsrefparamobject)
* [headerParamsArray](#headerparamsarray)
* [headerParamsMap](#headerparamsmap)
* [headerParamsObject](#headerparamsobject)
* [headerParamsPrimitive](#headerparamsprimitive)
* [jsonQueryParamsObject](#jsonqueryparamsobject)
* [jsonQueryParamsObjectSmaller](#jsonqueryparamsobjectsmaller)
* [mixedParametersCamelCase](#mixedparameterscamelcase)
* [mixedParametersPrimitives](#mixedparametersprimitives)
* [mixedQueryParams](#mixedqueryparams)
* [pathParameterJson](#pathparameterjson)
* [pipeDelimitedQueryParamsArray](#pipedelimitedqueryparamsarray)
* [simplePathParameterArrays](#simplepathparameterarrays)
* [simplePathParameterMaps](#simplepathparametermaps)
* [simplePathParameterObjects](#simplepathparameterobjects)
* [simplePathParameterPrimitives](#simplepathparameterprimitives)

## deepObjectQueryParamsMap

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            DeepObjectQueryParamsMapResponse res = sdk.parameters().deepObjectQueryParamsMap()
                .mapArrParam(java.util.Map.ofEntries(
                    entry("test", java.util.List.of(
                        "test",
                        "test2")),
                    entry("test2", java.util.List.of(
                        "test3",
                        "test4"))))
                .mapParam(java.util.Map.ofEntries(
                    entry("test", "value"),
                    entry("test2", "value2")))
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                      | Type                                                           | Required                                                       | Description                                                    | Example                                                        |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `mapArrParam`                                                  | Map<String, List<*String*>>                                    | :heavy_minus_sign:                                             | N/A                                                            | {<br/>"test": [<br/>"test",<br/>"test2"<br/>],<br/>"test2": [<br/>"test3",<br/>"test4"<br/>]<br/>} |
| `mapParam`                                                     | Map<String, *String*>                                          | :heavy_check_mark:                                             | N/A                                                            | {<br/>"test": "value",<br/>"test2": "value2"<br/>}             |


### Response

**[org.openapis.openapi.models.operations.DeepObjectQueryParamsMapResponse](../../models/operations/DeepObjectQueryParamsMapResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## deepObjectQueryParamsObject

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            DeepObjectQueryParamsObjectResponse res = sdk.parameters().deepObjectQueryParamsObject()
                .objArrParam(ObjArrParam.builder()
                    .arr(java.util.List.of(
                        "test",
                        "test2"))
                    .build())
                .objParam(SimpleObject.builder()
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
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `objArrParam`                                                                                                    | [Optional<? extends org.openapis.openapi.models.operations.ObjArrParam>](../../models/operations/ObjArrParam.md) | :heavy_minus_sign:                                                                                               | N/A                                                                                                              |
| `objParam`                                                                                                       | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md)                           | :heavy_check_mark:                                                                                               | A simple object that uses all our supported primitive types and enums and has optional properties.               |


### Response

**[org.openapis.openapi.models.operations.DeepObjectQueryParamsObjectResponse](../../models/operations/DeepObjectQueryParamsObjectResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## duplicateParam

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            DuplicateParamResponse res = sdk.parameters().duplicateParam()
                .duplicateParamRequest("<value>")
                .call();

            if (res.duplicateParamResponse().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter               | Type                    | Required                | Description             |
| ----------------------- | ----------------------- | ----------------------- | ----------------------- |
| `duplicateParamRequest` | *String*                | :heavy_check_mark:      | N/A                     |


### Response

**[org.openapis.openapi.models.operations.DuplicateParamResponse](../../models/operations/DuplicateParamResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## formQueryParamsArray

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            FormQueryParamsArrayResponse res = sdk.parameters().formQueryParamsArray()
                .arrParam(java.util.List.of(
                    "test",
                    "test2"))
                .arrParamExploded(java.util.List.of(
                    1L,
                    2L))
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `arrParam`         | List<*String*>     | :heavy_minus_sign: | N/A                |
| `arrParamExploded` | List<*long*>       | :heavy_minus_sign: | N/A                |


### Response

**[org.openapis.openapi.models.operations.FormQueryParamsArrayResponse](../../models/operations/FormQueryParamsArrayResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## formQueryParamsCamelObject

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            FormQueryParamsCamelObjectResponse res = sdk.parameters().formQueryParamsCamelObject()
                .objParam(ObjParam.builder()
                    .encodedCount("11")
                    .encodedTerm("bar")
                    .build())
                .objParamExploded(ObjParamExploded.builder()
                    .itemCount("10")
                    .searchTerm("foo")
                    .build())
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `objParam`                                                                                                 | [Optional<? extends org.openapis.openapi.models.operations.ObjParam>](../../models/operations/ObjParam.md) | :heavy_minus_sign:                                                                                         | N/A                                                                                                        |
| `objParamExploded`                                                                                         | [org.openapis.openapi.models.operations.ObjParamExploded](../../models/operations/ObjParamExploded.md)     | :heavy_check_mark:                                                                                         | N/A                                                                                                        |


### Response

**[org.openapis.openapi.models.operations.FormQueryParamsCamelObjectResponse](../../models/operations/FormQueryParamsCamelObjectResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## formQueryParamsMap

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            FormQueryParamsMapResponse res = sdk.parameters().formQueryParamsMap()
                .mapParam(java.util.Map.ofEntries(
                    entry("test", "value"),
                    entry("test2", "value2")))
                .mapParamExploded(java.util.Map.ofEntries(
                    entry("test", 1L),
                    entry("test2", 2L)))
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                              | Type                                   | Required                               | Description                            | Example                                |
| -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- |
| `mapParam`                             | Map<String, *String*>                  | :heavy_minus_sign:                     | N/A                                    | {<br/>"test": "value",<br/>"test2": "value2"<br/>} |
| `mapParamExploded`                     | Map<String, *long*>                    | :heavy_minus_sign:                     | N/A                                    | {<br/>"test": 1,<br/>"test2": 2<br/>}  |


### Response

**[org.openapis.openapi.models.operations.FormQueryParamsMapResponse](../../models/operations/FormQueryParamsMapResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## formQueryParamsObject

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            FormQueryParamsObjectResponse res = sdk.parameters().formQueryParamsObject()
                .objParam(SimpleObject.builder()
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
                .objParamExploded(SimpleObject.builder()
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
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `objParam`                                                                                                 | [Optional<? extends org.openapis.openapi.models.shared.SimpleObject>](../../models/shared/SimpleObject.md) | :heavy_minus_sign:                                                                                         | A simple object that uses all our supported primitive types and enums and has optional properties.         |
| `objParamExploded`                                                                                         | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md)                     | :heavy_check_mark:                                                                                         | A simple object that uses all our supported primitive types and enums and has optional properties.         |


### Response

**[org.openapis.openapi.models.operations.FormQueryParamsObjectResponse](../../models/operations/FormQueryParamsObjectResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## formQueryParamsPrimitive

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            FormQueryParamsPrimitiveResponse res = sdk.parameters().formQueryParamsPrimitive()
                .boolParam(true)
                .intParam(1L)
                .numParam(1.1d)
                .strParam("test")
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `boolParam`        | *boolean*          | :heavy_check_mark: | N/A                | true               |
| `intParam`         | *long*             | :heavy_check_mark: | N/A                | 1                  |
| `numParam`         | *double*           | :heavy_check_mark: | N/A                | 1.1                |
| `strParam`         | *String*           | :heavy_check_mark: | N/A                | test               |


### Response

**[org.openapis.openapi.models.operations.FormQueryParamsPrimitiveResponse](../../models/operations/FormQueryParamsPrimitiveResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## formQueryParamsRefParamObject

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            FormQueryParamsRefParamObjectResponse res = sdk.parameters().formQueryParamsRefParamObject()
                .refObjParam(RefQueryParamObj.builder()
                    .bool(true)
                    .int_(1L)
                    .num(1.1d)
                    .str("test")
                    .build())
                .refObjParamExploded(RefQueryParamObjExploded.builder()
                    .bool(true)
                    .int_(1L)
                    .num(1.1d)
                    .str("test")
                    .build())
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `refObjParam`                                                                                                                      | [Optional<? extends org.openapis.openapi.models.shared.RefQueryParamObj>](../../models/shared/RefQueryParamObj.md)                 | :heavy_minus_sign:                                                                                                                 | N/A                                                                                                                                |
| `refObjParamExploded`                                                                                                              | [Optional<? extends org.openapis.openapi.models.shared.RefQueryParamObjExploded>](../../models/shared/RefQueryParamObjExploded.md) | :heavy_minus_sign:                                                                                                                 | N/A                                                                                                                                |


### Response

**[org.openapis.openapi.models.operations.FormQueryParamsRefParamObjectResponse](../../models/operations/FormQueryParamsRefParamObjectResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## headerParamsArray

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            HeaderParamsArrayResponse res = sdk.parameters().headerParamsArray()
                .xHeaderArray(java.util.List.of(
                    "test1",
                    "test2"))
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `xHeaderArray`     | List<*String*>     | :heavy_check_mark: | N/A                |


### Response

**[org.openapis.openapi.models.operations.HeaderParamsArrayResponse](../../models/operations/HeaderParamsArrayResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## headerParamsMap

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            HeaderParamsMapResponse res = sdk.parameters().headerParamsMap()
                .xHeaderMap(java.util.Map.ofEntries(
                    entry("key1", "value1"),
                    entry("key2", "value2")))
                .xHeaderMapExplode(java.util.Map.ofEntries(
                    entry("test1", "val1"),
                    entry("test2", "val2")))
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                              | Type                                   | Required                               | Description                            | Example                                |
| -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- |
| `xHeaderMap`                           | Map<String, *String*>                  | :heavy_check_mark:                     | N/A                                    | {<br/>"key1": "value1",<br/>"key2": "value2"<br/>} |
| `xHeaderMapExplode`                    | Map<String, *String*>                  | :heavy_check_mark:                     | N/A                                    | {<br/>"test1": "val1",<br/>"test2": "val2"<br/>} |


### Response

**[org.openapis.openapi.models.operations.HeaderParamsMapResponse](../../models/operations/HeaderParamsMapResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## headerParamsObject

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            HeaderParamsObjectResponse res = sdk.parameters().headerParamsObject()
                .xHeaderObj(SimpleObject.builder()
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
                .xHeaderObjExplode(SimpleObject.builder()
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
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `xHeaderObj`                                                                                       | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md)             | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `xHeaderObjExplode`                                                                                | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md)             | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[org.openapis.openapi.models.operations.HeaderParamsObjectResponse](../../models/operations/HeaderParamsObjectResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## headerParamsPrimitive

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            HeaderParamsPrimitiveResponse res = sdk.parameters().headerParamsPrimitive()
                .xHeaderBoolean(true)
                .xHeaderInteger(1L)
                .xHeaderNumber(1.1d)
                .xHeaderString("test")
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `xHeaderBoolean`   | *boolean*          | :heavy_check_mark: | N/A                | true               |
| `xHeaderInteger`   | *long*             | :heavy_check_mark: | N/A                | 1                  |
| `xHeaderNumber`    | *double*           | :heavy_check_mark: | N/A                | 1.1                |
| `xHeaderString`    | *String*           | :heavy_check_mark: | N/A                | test               |


### Response

**[org.openapis.openapi.models.operations.HeaderParamsPrimitiveResponse](../../models/operations/HeaderParamsPrimitiveResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## jsonQueryParamsObject

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            JsonQueryParamsObjectResponse res = sdk.parameters().jsonQueryParamsObject()
                .deepObjParam(DeepObject.builder()
                    .any(Any.of(SimpleObject.builder()
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
                                .build()))
                    .arr(java.util.List.of(
                            SimpleObject.builder()
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
                                .build(),
                            SimpleObject.builder()
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
                                .build()))
                    .bool(true)
                    .int_(1L)
                    .map(java.util.Map.ofEntries(
                            entry("key", SimpleObject.builder()
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
                                .build()),
                            entry("key2", SimpleObject.builder()
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
                    .num(1.1d)
                    .obj(SimpleObject.builder()
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
                    .str("test")
                    .build())
                .simpleObjParam(SimpleObject.builder()
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
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `deepObjParam`                                                                                     | [org.openapis.openapi.models.shared.DeepObject](../../models/shared/DeepObject.md)                 | :heavy_check_mark:                                                                                 | N/A                                                                                                |
| `simpleObjParam`                                                                                   | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md)             | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[org.openapis.openapi.models.operations.JsonQueryParamsObjectResponse](../../models/operations/JsonQueryParamsObjectResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## jsonQueryParamsObjectSmaller

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            JsonQueryParamsObjectSmallerResponse res = sdk.parameters().jsonQueryParamsObjectSmaller()
                .deepObjParam(DeepObjectSmaller.builder()
                    .any(DeepObjectSmallerAny.of(SimpleObject.builder()
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
                                .build()))
                    .arr(java.util.List.of(
                            SimpleObject.builder()
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
                                .build(),
                            SimpleObject.builder()
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
                                .build()))
                    .bool(true)
                    .int_(1L)
                    .map(java.util.Map.ofEntries(
                            entry("key", SimpleObject.builder()
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
                    .num(1.1d)
                    .obj(SimpleObject.builder()
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
                    .str("test")
                    .build())
                .simpleObjParam(SimpleObject.builder()
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
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `deepObjParam`                                                                                     | [org.openapis.openapi.models.shared.DeepObjectSmaller](../../models/shared/DeepObjectSmaller.md)   | :heavy_check_mark:                                                                                 | N/A                                                                                                |
| `simpleObjParam`                                                                                   | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md)             | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[org.openapis.openapi.models.operations.JsonQueryParamsObjectSmallerResponse](../../models/operations/JsonQueryParamsObjectSmallerResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## mixedParametersCamelCase

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            MixedParametersCamelCaseResponse res = sdk.parameters().mixedParametersCamelCase()
                .headerParam("headerValue")
                .pathParam("pathValue")
                .queryStringParam("queryValue")
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `headerParam`      | *String*           | :heavy_check_mark: | N/A                | headerValue        |
| `pathParam`        | *String*           | :heavy_check_mark: | N/A                | pathValue          |
| `queryStringParam` | *String*           | :heavy_check_mark: | N/A                | queryValue         |


### Response

**[org.openapis.openapi.models.operations.MixedParametersCamelCaseResponse](../../models/operations/MixedParametersCamelCaseResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## mixedParametersPrimitives

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            MixedParametersPrimitivesResponse res = sdk.parameters().mixedParametersPrimitives()
                .headerParam("headerValue")
                .pathParam("pathValue")
                .queryStringParam("queryValue")
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `headerParam`      | *String*           | :heavy_check_mark: | N/A                | headerValue        |
| `pathParam`        | *String*           | :heavy_check_mark: | N/A                | pathValue          |
| `queryStringParam` | *String*           | :heavy_check_mark: | N/A                | queryValue         |


### Response

**[org.openapis.openapi.models.operations.MixedParametersPrimitivesResponse](../../models/operations/MixedParametersPrimitivesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## mixedQueryParams

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            MixedQueryParamsResponse res = sdk.parameters().mixedQueryParams()
                .deepObjectParam(SimpleObject.builder()
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
                .formParam(SimpleObject.builder()
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
                .jsonParam(SimpleObject.builder()
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
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `deepObjectParam`                                                                                  | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md)             | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `formParam`                                                                                        | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md)             | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `jsonParam`                                                                                        | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md)             | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[org.openapis.openapi.models.operations.MixedQueryParamsResponse](../../models/operations/MixedQueryParamsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## pathParameterJson

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            PathParameterJsonResponse res = sdk.parameters().pathParameterJson()
                .jsonObj(SimpleObject.builder()
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
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `jsonObj`                                                                                          | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md)             | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[org.openapis.openapi.models.operations.PathParameterJsonResponse](../../models/operations/PathParameterJsonResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## pipeDelimitedQueryParamsArray

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            PipeDelimitedQueryParamsArrayResponse res = sdk.parameters().pipeDelimitedQueryParamsArray()
                .arrParam(java.util.List.of(
                    "test",
                    "test2"))
                .arrParamExploded(java.util.List.of(
                    1L,
                    2L))
                .mapParam(java.util.Map.ofEntries(
                    entry("key1", "val1"),
                    entry("key2", "val2")))
                .objParam(SimpleObject.builder()
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
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                | Example                                                                                                    |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `arrParam`                                                                                                 | List<*String*>                                                                                             | :heavy_minus_sign:                                                                                         | N/A                                                                                                        |                                                                                                            |
| `arrParamExploded`                                                                                         | List<*long*>                                                                                               | :heavy_minus_sign:                                                                                         | N/A                                                                                                        |                                                                                                            |
| `mapParam`                                                                                                 | Map<String, *String*>                                                                                      | :heavy_minus_sign:                                                                                         | N/A                                                                                                        | {<br/>"key1": "val1",<br/>"key2": "val2"<br/>}                                                             |
| `objParam`                                                                                                 | [Optional<? extends org.openapis.openapi.models.shared.SimpleObject>](../../models/shared/SimpleObject.md) | :heavy_minus_sign:                                                                                         | A simple object that uses all our supported primitive types and enums and has optional properties.         |                                                                                                            |


### Response

**[org.openapis.openapi.models.operations.PipeDelimitedQueryParamsArrayResponse](../../models/operations/PipeDelimitedQueryParamsArrayResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## simplePathParameterArrays

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            SimplePathParameterArraysResponse res = sdk.parameters().simplePathParameterArrays()
                .arrParam(java.util.List.of(
                    "test",
                    "test2"))
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `arrParam`         | List<*String*>     | :heavy_check_mark: | N/A                |


### Response

**[org.openapis.openapi.models.operations.SimplePathParameterArraysResponse](../../models/operations/SimplePathParameterArraysResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## simplePathParameterMaps

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            SimplePathParameterMapsResponse res = sdk.parameters().simplePathParameterMaps()
                .mapParam(java.util.Map.ofEntries(
                    entry("test", "value"),
                    entry("test2", "value2")))
                .mapParamExploded(java.util.Map.ofEntries(
                    entry("test", 1L),
                    entry("test2", 2L)))
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                              | Type                                   | Required                               | Description                            | Example                                |
| -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- |
| `mapParam`                             | Map<String, *String*>                  | :heavy_check_mark:                     | N/A                                    | {<br/>"test": "value",<br/>"test2": "value2"<br/>} |
| `mapParamExploded`                     | Map<String, *long*>                    | :heavy_check_mark:                     | N/A                                    | {<br/>"test": 1,<br/>"test2": 2<br/>}  |


### Response

**[org.openapis.openapi.models.operations.SimplePathParameterMapsResponse](../../models/operations/SimplePathParameterMapsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## simplePathParameterObjects

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            SimplePathParameterObjectsResponse res = sdk.parameters().simplePathParameterObjects()
                .objParam(SimpleObject.builder()
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
                .objParamExploded(SimpleObject.builder()
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
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `objParam`                                                                                         | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md)             | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `objParamExploded`                                                                                 | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md)             | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[org.openapis.openapi.models.operations.SimplePathParameterObjectsResponse](../../models/operations/SimplePathParameterObjectsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## simplePathParameterPrimitives

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            SimplePathParameterPrimitivesResponse res = sdk.parameters().simplePathParameterPrimitives()
                .boolParam(true)
                .intParam(1L)
                .numParam(1.1d)
                .strParam("test")
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `boolParam`        | *boolean*          | :heavy_check_mark: | N/A                | true               |
| `intParam`         | *long*             | :heavy_check_mark: | N/A                | 1                  |
| `numParam`         | *double*           | :heavy_check_mark: | N/A                | 1.1                |
| `strParam`         | *String*           | :heavy_check_mark: | N/A                | test               |


### Response

**[org.openapis.openapi.models.operations.SimplePathParameterPrimitivesResponse](../../models/operations/SimplePathParameterPrimitivesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
