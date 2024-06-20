# RequestBodies
(*requestBodies()*)

## Overview

Endpoints for testing request bodies.

### Available Operations

* [nullEnumPost](#nullenumpost)
* [nullableObjectPost](#nullableobjectpost)
* [nullableRequiredEmptyObjectPost](#nullablerequiredemptyobjectpost)
* [nullableRequiredPropertyPost](#nullablerequiredpropertypost)
* [nullableRequiredSharedObjectPost](#nullablerequiredsharedobjectpost)
* [requestBodyPostApplicationJsonArray](#requestbodypostapplicationjsonarray)
* [requestBodyPostApplicationJsonArrayCamelCase](#requestbodypostapplicationjsonarraycamelcase)
* [requestBodyPostApplicationJsonArrayObj](#requestbodypostapplicationjsonarrayobj)
* [requestBodyPostApplicationJsonArrayObjCamelCase](#requestbodypostapplicationjsonarrayobjcamelcase)
* [requestBodyPostApplicationJsonArrayOfArray](#requestbodypostapplicationjsonarrayofarray)
* [requestBodyPostApplicationJsonArrayOfArrayCamelCase](#requestbodypostapplicationjsonarrayofarraycamelcase)
* [requestBodyPostApplicationJsonArrayOfArrayOfPrimitive](#requestbodypostapplicationjsonarrayofarrayofprimitive)
* [requestBodyPostApplicationJsonArrayOfMap](#requestbodypostapplicationjsonarrayofmap)
* [requestBodyPostApplicationJsonArrayOfMapCamelCase](#requestbodypostapplicationjsonarrayofmapcamelcase)
* [requestBodyPostApplicationJsonArrayOfPrimitive](#requestbodypostapplicationjsonarrayofprimitive)
* [requestBodyPostApplicationJsonDeep](#requestbodypostapplicationjsondeep)
* [requestBodyPostApplicationJsonDeepCamelCase](#requestbodypostapplicationjsondeepcamelcase)
* [requestBodyPostApplicationJsonMap](#requestbodypostapplicationjsonmap)
* [requestBodyPostApplicationJsonMapCamelCase](#requestbodypostapplicationjsonmapcamelcase)
* [requestBodyPostApplicationJsonMapObj](#requestbodypostapplicationjsonmapobj)
* [requestBodyPostApplicationJsonMapObjCamelCase](#requestbodypostapplicationjsonmapobjcamelcase)
* [requestBodyPostApplicationJsonMapOfArray](#requestbodypostapplicationjsonmapofarray)
* [requestBodyPostApplicationJsonMapOfArrayCamelCase](#requestbodypostapplicationjsonmapofarraycamelcase)
* [requestBodyPostApplicationJsonMapOfMap](#requestbodypostapplicationjsonmapofmap)
* [requestBodyPostApplicationJsonMapOfMapCamelCase](#requestbodypostapplicationjsonmapofmapcamelcase)
* [requestBodyPostApplicationJsonMapOfMapOfPrimitive](#requestbodypostapplicationjsonmapofmapofprimitive)
* [requestBodyPostApplicationJsonMapOfPrimitive](#requestbodypostapplicationjsonmapofprimitive)
* [requestBodyPostApplicationJsonMultipleJsonFiltered](#requestbodypostapplicationjsonmultiplejsonfiltered)
* [requestBodyPostApplicationJsonSimple](#requestbodypostapplicationjsonsimple)
* [requestBodyPostApplicationJsonSimpleCamelCase](#requestbodypostapplicationjsonsimplecamelcase)
* [requestBodyPostComplexNumberTypes](#requestbodypostcomplexnumbertypes)
* [requestBodyPostDefaultsAndConsts](#requestbodypostdefaultsandconsts)
* [requestBodyPostEmptyObject](#requestbodypostemptyobject)
* [requestBodyPostFormDeep](#requestbodypostformdeep)
* [requestBodyPostFormMapPrimitive](#requestbodypostformmapprimitive)
* [requestBodyPostFormSimple](#requestbodypostformsimple)
* [requestBodyPostJsonDataTypesArrayBigInt](#requestbodypostjsondatatypesarraybigint)
* [requestBodyPostJsonDataTypesArrayDate](#requestbodypostjsondatatypesarraydate)
* [requestBodyPostJsonDataTypesArrayDecimalStr](#requestbodypostjsondatatypesarraydecimalstr)
* [requestBodyPostJsonDataTypesBigInt](#requestbodypostjsondatatypesbigint)
* [requestBodyPostJsonDataTypesBigIntStr](#requestbodypostjsondatatypesbigintstr)
* [requestBodyPostJsonDataTypesBoolean](#requestbodypostjsondatatypesboolean)
* [requestBodyPostJsonDataTypesComplexNumberArrays](#requestbodypostjsondatatypescomplexnumberarrays)
* [requestBodyPostJsonDataTypesComplexNumberMaps](#requestbodypostjsondatatypescomplexnumbermaps)
* [requestBodyPostJsonDataTypesDate](#requestbodypostjsondatatypesdate)
* [requestBodyPostJsonDataTypesDateTime](#requestbodypostjsondatatypesdatetime)
* [requestBodyPostJsonDataTypesDecimal](#requestbodypostjsondatatypesdecimal)
* [requestBodyPostJsonDataTypesDecimalStr](#requestbodypostjsondatatypesdecimalstr)
* [requestBodyPostJsonDataTypesFloat32](#requestbodypostjsondatatypesfloat32)
* [requestBodyPostJsonDataTypesInt32](#requestbodypostjsondatatypesint32)
* [requestBodyPostJsonDataTypesInteger](#requestbodypostjsondatatypesinteger)
* [requestBodyPostJsonDataTypesMapBigIntStr](#requestbodypostjsondatatypesmapbigintstr)
* [requestBodyPostJsonDataTypesMapDateTime](#requestbodypostjsondatatypesmapdatetime)
* [requestBodyPostJsonDataTypesMapDecimal](#requestbodypostjsondatatypesmapdecimal)
* [requestBodyPostJsonDataTypesNumber](#requestbodypostjsondatatypesnumber)
* [requestBodyPostJsonDataTypesString](#requestbodypostjsondatatypesstring)
* [requestBodyPostMultipleContentTypesComponentFiltered](#requestbodypostmultiplecontenttypescomponentfiltered)
* [requestBodyPostMultipleContentTypesInlineFiltered](#requestbodypostmultiplecontenttypesinlinefiltered)
* [requestBodyPostMultipleContentTypesSplitParamForm](#requestbodypostmultiplecontenttypessplitparamform)
* [requestBodyPostMultipleContentTypesSplitParamJson](#requestbodypostmultiplecontenttypessplitparamjson)
* [requestBodyPostMultipleContentTypesSplitParamMultipart](#requestbodypostmultiplecontenttypessplitparammultipart)
* [requestBodyPostMultipleContentTypesSplitForm](#requestbodypostmultiplecontenttypessplitform)
* [requestBodyPostMultipleContentTypesSplitJson](#requestbodypostmultiplecontenttypessplitjson)
* [requestBodyPostMultipleContentTypesSplitMultipart](#requestbodypostmultiplecontenttypessplitmultipart)
* [requestBodyPostNotNullableNotRequiredStringBody](#requestbodypostnotnullablenotrequiredstringbody)
* [requestBodyPostNullArray](#requestbodypostnullarray)
* [requestBodyPostNullDictionary](#requestbodypostnulldictionary)
* [requestBodyPostNullableNotRequiredStringBody](#requestbodypostnullablenotrequiredstringbody)
* [requestBodyPostNullableRequiredStringBody](#requestbodypostnullablerequiredstringbody)
* [requestBodyPutBytes](#requestbodyputbytes)
* [requestBodyPutBytesWithParams](#requestbodyputbyteswithparams)
* [requestBodyPutMultipartDeep](#requestbodyputmultipartdeep)
* [requestBodyPutMultipartDifferentFileName](#requestbodyputmultipartdifferentfilename)
* [requestBodyPutMultipartFile](#requestbodyputmultipartfile)
* [requestBodyPutMultipartOptionalRequestBody](#requestbodyputmultipartoptionalrequestbody)
* [requestBodyPutMultipartSimple](#requestbodyputmultipartsimple)
* [requestBodyPutString](#requestbodyputstring)
* [requestBodyPutStringWithParams](#requestbodyputstringwithparams)
* [requestBodyReadAndWrite](#requestbodyreadandwrite)
* [requestBodyReadOnlyInput](#requestbodyreadonlyinput)
* [requestBodyReadOnlyUnion](#requestbodyreadonlyunion)
* [requestBodyReadWriteOnlyUnion](#requestbodyreadwriteonlyunion)
* [requestBodyWriteOnly](#requestbodywriteonly)
* [requestBodyWriteOnlyOutput](#requestbodywriteonlyoutput)
* [requestBodyWriteOnlyUnion](#requestbodywriteonlyunion)

## nullEnumPost

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

            ObjectWithNullEnums req = ObjectWithNullEnums.builder()
                .build();

            NullEnumPostResponse res = sdk.requestBodies().nullEnumPost()
                .request(req)
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

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `request`                                                                                            | [org.openapis.openapi.models.shared.ObjectWithNullEnums](../../models/shared/ObjectWithNullEnums.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.NullEnumPostResponse>](../../models/operations/NullEnumPostResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## nullableObjectPost

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

            NullableObjectPostResponse res = sdk.requestBodies().nullableObjectPost()
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

| Parameter                                                                                  | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `request`                                                                                  | [org.openapis.openapi.models.shared.NullableObject](../../models/shared/NullableObject.md) | :heavy_check_mark:                                                                         | The request object to use for the request.                                                 |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.NullableObjectPostResponse>](../../models/operations/NullableObjectPostResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## nullableRequiredEmptyObjectPost

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

            NullableRequiredEmptyObjectPostRequestBody req = NullableRequiredEmptyObjectPostRequestBody.builder()
                .nullableRequiredObj(Optional.empty())
                .requiredObj(RequiredObj.builder()
                        .build())
                .nullableOptionalObj(NullableOptionalObj.builder()
                    .build())
                .build();

            NullableRequiredEmptyObjectPostResponse res = sdk.requestBodies().nullableRequiredEmptyObjectPost()
                .request(req)
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                                                                                                                                  | Type                                                                                                                                                       | Required                                                                                                                                                   | Description                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                  | [org.openapis.openapi.models.operations.NullableRequiredEmptyObjectPostRequestBody](../../models/operations/NullableRequiredEmptyObjectPostRequestBody.md) | :heavy_check_mark:                                                                                                                                         | The request object to use for the request.                                                                                                                 |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.NullableRequiredEmptyObjectPostResponse>](../../models/operations/NullableRequiredEmptyObjectPostResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## nullableRequiredPropertyPost

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

            NullableRequiredPropertyPostRequestBody req = NullableRequiredPropertyPostRequestBody.builder()
                .nullableRequiredArray(Optional.empty())
                .nullableRequiredBigIntStr(new BigInteger("9223372036854775807"))
                .nullableRequiredDateTime(OffsetDateTime.parse("2024-03-02T01:02:03.001Z"))
                .nullableRequiredDecimalStr(new BigDecimal("3.14159265358979344719667586"))
                .nullableRequiredEnum(NullableRequiredEnum.SECOND)
                .nullableRequiredInt(Optional.empty())
                .nullableOptionalInt(0L)
                .build();

            NullableRequiredPropertyPostResponse res = sdk.requestBodies().nullableRequiredPropertyPost()
                .request(req)
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [org.openapis.openapi.models.operations.NullableRequiredPropertyPostRequestBody](../../models/operations/NullableRequiredPropertyPostRequestBody.md) | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.NullableRequiredPropertyPostResponse>](../../models/operations/NullableRequiredPropertyPostResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## nullableRequiredSharedObjectPost

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

            NullableRequiredSharedObjectPostRequestBody req = NullableRequiredSharedObjectPostRequestBody.builder()
                .nullableRequiredObj(Optional.empty())
                .build();

            NullableRequiredSharedObjectPostResponse res = sdk.requestBodies().nullableRequiredSharedObjectPost()
                .request(req)
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                                                                                                                                    | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                    | [org.openapis.openapi.models.operations.NullableRequiredSharedObjectPostRequestBody](../../models/operations/NullableRequiredSharedObjectPostRequestBody.md) | :heavy_check_mark:                                                                                                                                           | The request object to use for the request.                                                                                                                   |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.NullableRequiredSharedObjectPostResponse>](../../models/operations/NullableRequiredSharedObjectPostResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostApplicationJsonArray

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

            java.util.List<org.openapis.openapi.models.shared.SimpleObject> req = java.util.List.of(
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
                    .build());

            RequestBodyPostApplicationJsonArrayResponse res = sdk.requestBodies().requestBodyPostApplicationJsonArray()
                .request(req)
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

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `request`                                                                            | [java.util.List<org.openapis.openapi.models.shared.SimpleObject>](../../models//.md) | :heavy_check_mark:                                                                   | The request object to use for the request.                                           |
| `serverURL`                                                                          | *String*                                                                             | :heavy_minus_sign:                                                                   | An optional server URL to use.                                                       |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayResponse>](../../models/operations/RequestBodyPostApplicationJsonArrayResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostApplicationJsonArrayCamelCase

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

            java.util.List<org.openapis.openapi.models.shared.SimpleObjectCamelCase> req = java.util.List.of(
                SimpleObjectCamelCase.builder()
                    .anyVal("any example")
                    .boolVal(true)
                    .dateTimeVal(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                    .dateVal(LocalDate.parse("2020-01-01"))
                    .enumVal(Enum.ONE)
                    .float32Val(2.2222222f)
                    .int32EnumVal(Int32EnumVal.SIXTY_NINE)
                    .int32Val(1)
                    .intEnumVal(IntEnumVal.Third)
                    .intVal(999999L)
                    .numVal(1.1d)
                    .strVal("example")
                    .boolOptVal(true)
                    .intOptNullVal(999999L)
                    .numOptNullVal(1.1d)
                    .strOptVal("optional example")
                    .build());

            RequestBodyPostApplicationJsonArrayCamelCaseResponse res = sdk.requestBodies().requestBodyPostApplicationJsonArrayCamelCase()
                .request(req)
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

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [java.util.List<org.openapis.openapi.models.shared.SimpleObjectCamelCase>](../../models//.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |
| `serverURL`                                                                                   | *String*                                                                                      | :heavy_minus_sign:                                                                            | An optional server URL to use.                                                                |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayCamelCaseResponse>](../../models/operations/RequestBodyPostApplicationJsonArrayCamelCaseResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostApplicationJsonArrayObj

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

            java.util.List<org.openapis.openapi.models.shared.SimpleObject> req = java.util.List.of(
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
                    .build());

            RequestBodyPostApplicationJsonArrayObjResponse res = sdk.requestBodies().requestBodyPostApplicationJsonArrayObj()
                .request(req)
                .call();

            if (res.arrObjValue().isPresent()) {
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

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `request`                                                                            | [java.util.List<org.openapis.openapi.models.shared.SimpleObject>](../../models//.md) | :heavy_check_mark:                                                                   | The request object to use for the request.                                           |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayObjResponse>](../../models/operations/RequestBodyPostApplicationJsonArrayObjResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostApplicationJsonArrayObjCamelCase

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

            java.util.List<org.openapis.openapi.models.shared.SimpleObjectCamelCase> req = java.util.List.of(
                SimpleObjectCamelCase.builder()
                    .anyVal("any example")
                    .boolVal(true)
                    .dateTimeVal(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                    .dateVal(LocalDate.parse("2020-01-01"))
                    .enumVal(Enum.ONE)
                    .float32Val(2.2222222f)
                    .int32EnumVal(Int32EnumVal.SIXTY_NINE)
                    .int32Val(1)
                    .intEnumVal(IntEnumVal.Third)
                    .intVal(999999L)
                    .numVal(1.1d)
                    .strVal("example")
                    .boolOptVal(true)
                    .intOptNullVal(999999L)
                    .numOptNullVal(1.1d)
                    .strOptVal("optional example")
                    .build(),
                SimpleObjectCamelCase.builder()
                    .anyVal("any example")
                    .boolVal(true)
                    .dateTimeVal(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                    .dateVal(LocalDate.parse("2020-01-01"))
                    .enumVal(Enum.ONE)
                    .float32Val(2.2222222f)
                    .int32EnumVal(Int32EnumVal.SIXTY_NINE)
                    .int32Val(1)
                    .intEnumVal(IntEnumVal.Third)
                    .intVal(999999L)
                    .numVal(1.1d)
                    .strVal("example")
                    .boolOptVal(true)
                    .intOptNullVal(999999L)
                    .numOptNullVal(1.1d)
                    .strOptVal("optional example")
                    .build());

            RequestBodyPostApplicationJsonArrayObjCamelCaseResponse res = sdk.requestBodies().requestBodyPostApplicationJsonArrayObjCamelCase()
                .request(req)
                .call();

            if (res.arrObjValueCamelCase().isPresent()) {
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

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [java.util.List<org.openapis.openapi.models.shared.SimpleObjectCamelCase>](../../models//.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayObjCamelCaseResponse>](../../models/operations/RequestBodyPostApplicationJsonArrayObjCamelCaseResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostApplicationJsonArrayOfArray

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

            java.util.List<java.util.List<org.openapis.openapi.models.shared.SimpleObject>> req = java.util.List.of(
                java.util.List.of(
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
                        .build()));

            RequestBodyPostApplicationJsonArrayOfArrayResponse res = sdk.requestBodies().requestBodyPostApplicationJsonArrayOfArray()
                .request(req)
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

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `request`                                                                                            | [java.util.List<java.util.List<org.openapis.openapi.models.shared.SimpleObject>>](../../models//.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |
| `serverURL`                                                                                          | *String*                                                                                             | :heavy_minus_sign:                                                                                   | An optional server URL to use.                                                                       |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayOfArrayResponse>](../../models/operations/RequestBodyPostApplicationJsonArrayOfArrayResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostApplicationJsonArrayOfArrayCamelCase

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

            java.util.List<java.util.List<org.openapis.openapi.models.shared.SimpleObjectCamelCase>> req = java.util.List.of(
                java.util.List.of(
                    SimpleObjectCamelCase.builder()
                        .anyVal("any example")
                        .boolVal(true)
                        .dateTimeVal(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                        .dateVal(LocalDate.parse("2020-01-01"))
                        .enumVal(Enum.ONE)
                        .float32Val(2.2222222f)
                        .int32EnumVal(Int32EnumVal.SIXTY_NINE)
                        .int32Val(1)
                        .intEnumVal(IntEnumVal.Third)
                        .intVal(999999L)
                        .numVal(1.1d)
                        .strVal("example")
                        .boolOptVal(true)
                        .intOptNullVal(999999L)
                        .numOptNullVal(1.1d)
                        .strOptVal("optional example")
                        .build()));

            RequestBodyPostApplicationJsonArrayOfArrayCamelCaseResponse res = sdk.requestBodies().requestBodyPostApplicationJsonArrayOfArrayCamelCase()
                .request(req)
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

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [java.util.List<java.util.List<org.openapis.openapi.models.shared.SimpleObjectCamelCase>>](../../models//.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |
| `serverURL`                                                                                                   | *String*                                                                                                      | :heavy_minus_sign:                                                                                            | An optional server URL to use.                                                                                |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayOfArrayCamelCaseResponse>](../../models/operations/RequestBodyPostApplicationJsonArrayOfArrayCamelCaseResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostApplicationJsonArrayOfArrayOfPrimitive

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

            java.util.List<java.util.List<String>> req = java.util.List.of(
                java.util.List.of(
                    "foo",
                    "bar"),
                java.util.List.of(
                    "buzz",
                    "bazz"));

            RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse res = sdk.requestBodies().requestBodyPostApplicationJsonArrayOfArrayOfPrimitive()
                .request(req)
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

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [java.util.List<java.util.List<String>>](../../models//.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |
| `serverURL`                                                 | *String*                                                    | :heavy_minus_sign:                                          | An optional server URL to use.                              |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse>](../../models/operations/RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostApplicationJsonArrayOfMap

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

            java.util.List<java.util.Map<String, org.openapis.openapi.models.shared.SimpleObject>> req = java.util.List.of(
                java.util.Map.ofEntries(
                    entry("mapElem1", SimpleObject.builder()
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
                    entry("mapElem2", SimpleObject.builder()
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
                        .build())),
                java.util.Map.ofEntries(
                    entry("mapElem1", SimpleObject.builder()
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
                    entry("mapElem2", SimpleObject.builder()
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
                        .build())));

            RequestBodyPostApplicationJsonArrayOfMapResponse res = sdk.requestBodies().requestBodyPostApplicationJsonArrayOfMap()
                .request(req)
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

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [java.util.List<java.util.Map<String, org.openapis.openapi.models.shared.SimpleObject>>](../../models//.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |
| `serverURL`                                                                                                 | *String*                                                                                                    | :heavy_minus_sign:                                                                                          | An optional server URL to use.                                                                              |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayOfMapResponse>](../../models/operations/RequestBodyPostApplicationJsonArrayOfMapResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostApplicationJsonArrayOfMapCamelCase

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

            java.util.List<java.util.Map<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>> req = java.util.List.of(
                java.util.Map.ofEntries(
                    entry("mapElem1", SimpleObjectCamelCase.builder()
                        .anyVal("any example")
                        .boolVal(true)
                        .dateTimeVal(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                        .dateVal(LocalDate.parse("2020-01-01"))
                        .enumVal(Enum.ONE)
                        .float32Val(2.2222222f)
                        .int32EnumVal(Int32EnumVal.SIXTY_NINE)
                        .int32Val(1)
                        .intEnumVal(IntEnumVal.Third)
                        .intVal(999999L)
                        .numVal(1.1d)
                        .strVal("example")
                        .boolOptVal(true)
                        .intOptNullVal(999999L)
                        .numOptNullVal(1.1d)
                        .strOptVal("optional example")
                        .build()),
                    entry("mapElem2", SimpleObjectCamelCase.builder()
                        .anyVal("any example")
                        .boolVal(true)
                        .dateTimeVal(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                        .dateVal(LocalDate.parse("2020-01-01"))
                        .enumVal(Enum.ONE)
                        .float32Val(2.2222222f)
                        .int32EnumVal(Int32EnumVal.SIXTY_NINE)
                        .int32Val(1)
                        .intEnumVal(IntEnumVal.Third)
                        .intVal(999999L)
                        .numVal(1.1d)
                        .strVal("example")
                        .boolOptVal(true)
                        .intOptNullVal(999999L)
                        .numOptNullVal(1.1d)
                        .strOptVal("optional example")
                        .build())),
                java.util.Map.ofEntries(
                    entry("mapElem1", SimpleObjectCamelCase.builder()
                        .anyVal("any example")
                        .boolVal(true)
                        .dateTimeVal(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                        .dateVal(LocalDate.parse("2020-01-01"))
                        .enumVal(Enum.ONE)
                        .float32Val(2.2222222f)
                        .int32EnumVal(Int32EnumVal.SIXTY_NINE)
                        .int32Val(1)
                        .intEnumVal(IntEnumVal.Third)
                        .intVal(999999L)
                        .numVal(1.1d)
                        .strVal("example")
                        .boolOptVal(true)
                        .intOptNullVal(999999L)
                        .numOptNullVal(1.1d)
                        .strOptVal("optional example")
                        .build()),
                    entry("mapElem2", SimpleObjectCamelCase.builder()
                        .anyVal("any example")
                        .boolVal(true)
                        .dateTimeVal(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                        .dateVal(LocalDate.parse("2020-01-01"))
                        .enumVal(Enum.ONE)
                        .float32Val(2.2222222f)
                        .int32EnumVal(Int32EnumVal.SIXTY_NINE)
                        .int32Val(1)
                        .intEnumVal(IntEnumVal.Third)
                        .intVal(999999L)
                        .numVal(1.1d)
                        .strVal("example")
                        .boolOptVal(true)
                        .intOptNullVal(999999L)
                        .numOptNullVal(1.1d)
                        .strOptVal("optional example")
                        .build())));

            RequestBodyPostApplicationJsonArrayOfMapCamelCaseResponse res = sdk.requestBodies().requestBodyPostApplicationJsonArrayOfMapCamelCase()
                .request(req)
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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [java.util.List<java.util.Map<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>>](../../models//.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `serverURL`                                                                                                          | *String*                                                                                                             | :heavy_minus_sign:                                                                                                   | An optional server URL to use.                                                                                       |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayOfMapCamelCaseResponse>](../../models/operations/RequestBodyPostApplicationJsonArrayOfMapCamelCaseResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostApplicationJsonArrayOfPrimitive

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

            java.util.List<String> req = java.util.List.of(
                "hello",
                "world");

            RequestBodyPostApplicationJsonArrayOfPrimitiveResponse res = sdk.requestBodies().requestBodyPostApplicationJsonArrayOfPrimitive()
                .request(req)
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

| Parameter                                   | Type                                        | Required                                    | Description                                 |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| `request`                                   | [java.util.List<String>](../../models//.md) | :heavy_check_mark:                          | The request object to use for the request.  |
| `serverURL`                                 | *String*                                    | :heavy_minus_sign:                          | An optional server URL to use.              |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayOfPrimitiveResponse>](../../models/operations/RequestBodyPostApplicationJsonArrayOfPrimitiveResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostApplicationJsonDeep

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

            DeepObject req = DeepObject.builder()
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
                .build();

            RequestBodyPostApplicationJsonDeepResponse res = sdk.requestBodies().requestBodyPostApplicationJsonDeep()
                .request(req)
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

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `request`                                                                          | [org.openapis.openapi.models.shared.DeepObject](../../models/shared/DeepObject.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonDeepResponse>](../../models/operations/RequestBodyPostApplicationJsonDeepResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostApplicationJsonDeepCamelCase

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

            DeepObjectCamelCase req = DeepObjectCamelCase.builder()
                .anyVal(AnyVal.of(SimpleObjectCamelCase.builder()
                            .anyVal("any example")
                            .boolVal(true)
                            .dateTimeVal(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                            .dateVal(LocalDate.parse("2020-01-01"))
                            .enumVal(Enum.ONE)
                            .float32Val(2.2222222f)
                            .int32EnumVal(Int32EnumVal.SIXTY_NINE)
                            .int32Val(1)
                            .intEnumVal(IntEnumVal.Third)
                            .intVal(999999L)
                            .numVal(1.1d)
                            .strVal("example")
                            .boolOptVal(true)
                            .intOptNullVal(999999L)
                            .numOptNullVal(1.1d)
                            .strOptVal("optional example")
                            .build()))
                .arrVal(java.util.List.of(
                        SimpleObjectCamelCase.builder()
                            .anyVal("any example")
                            .boolVal(true)
                            .dateTimeVal(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                            .dateVal(LocalDate.parse("2020-01-01"))
                            .enumVal(Enum.ONE)
                            .float32Val(2.2222222f)
                            .int32EnumVal(Int32EnumVal.SIXTY_NINE)
                            .int32Val(1)
                            .intEnumVal(IntEnumVal.Third)
                            .intVal(999999L)
                            .numVal(1.1d)
                            .strVal("example")
                            .boolOptVal(true)
                            .intOptNullVal(999999L)
                            .numOptNullVal(1.1d)
                            .strOptVal("optional example")
                            .build(),
                        SimpleObjectCamelCase.builder()
                            .anyVal("any example")
                            .boolVal(true)
                            .dateTimeVal(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                            .dateVal(LocalDate.parse("2020-01-01"))
                            .enumVal(Enum.ONE)
                            .float32Val(2.2222222f)
                            .int32EnumVal(Int32EnumVal.SIXTY_NINE)
                            .int32Val(1)
                            .intEnumVal(IntEnumVal.Third)
                            .intVal(999999L)
                            .numVal(1.1d)
                            .strVal("example")
                            .boolOptVal(true)
                            .intOptNullVal(999999L)
                            .numOptNullVal(1.1d)
                            .strOptVal("optional example")
                            .build()))
                .boolVal(true)
                .intVal(1L)
                .mapVal(java.util.Map.ofEntries(
                        entry("key", SimpleObjectCamelCase.builder()
                            .anyVal("any example")
                            .boolVal(true)
                            .dateTimeVal(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                            .dateVal(LocalDate.parse("2020-01-01"))
                            .enumVal(Enum.ONE)
                            .float32Val(2.2222222f)
                            .int32EnumVal(Int32EnumVal.SIXTY_NINE)
                            .int32Val(1)
                            .intEnumVal(IntEnumVal.Third)
                            .intVal(999999L)
                            .numVal(1.1d)
                            .strVal("example")
                            .boolOptVal(true)
                            .intOptNullVal(999999L)
                            .numOptNullVal(1.1d)
                            .strOptVal("optional example")
                            .build())))
                .numVal(1.1d)
                .objVal(SimpleObjectCamelCase.builder()
                        .anyVal("any example")
                        .boolVal(true)
                        .dateTimeVal(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                        .dateVal(LocalDate.parse("2020-01-01"))
                        .enumVal(Enum.ONE)
                        .float32Val(2.2222222f)
                        .int32EnumVal(Int32EnumVal.SIXTY_NINE)
                        .int32Val(1)
                        .intEnumVal(IntEnumVal.Third)
                        .intVal(999999L)
                        .numVal(1.1d)
                        .strVal("example")
                        .boolOptVal(true)
                        .intOptNullVal(999999L)
                        .numOptNullVal(1.1d)
                        .strOptVal("optional example")
                        .build())
                .strVal("test")
                .build();

            RequestBodyPostApplicationJsonDeepCamelCaseResponse res = sdk.requestBodies().requestBodyPostApplicationJsonDeepCamelCase()
                .request(req)
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

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `request`                                                                                            | [org.openapis.openapi.models.shared.DeepObjectCamelCase](../../models/shared/DeepObjectCamelCase.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonDeepCamelCaseResponse>](../../models/operations/RequestBodyPostApplicationJsonDeepCamelCaseResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostApplicationJsonMap

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

            java.util.Map<String, org.openapis.openapi.models.shared.SimpleObject> req = java.util.Map.ofEntries(
                entry("mapElem1", SimpleObject.builder()
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
                entry("mapElem2", SimpleObject.builder()
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
                    .build()));

            RequestBodyPostApplicationJsonMapResponse res = sdk.requestBodies().requestBodyPostApplicationJsonMap()
                .request(req)
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

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [java.util.Map<String, org.openapis.openapi.models.shared.SimpleObject>](../../models//.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |
| `serverURL`                                                                                 | *String*                                                                                    | :heavy_minus_sign:                                                                          | An optional server URL to use.                                                              |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapResponse>](../../models/operations/RequestBodyPostApplicationJsonMapResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostApplicationJsonMapCamelCase

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

            java.util.Map<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase> req = java.util.Map.ofEntries(
                entry("mapElem1", SimpleObjectCamelCase.builder()
                    .anyVal("any example")
                    .boolVal(true)
                    .dateTimeVal(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                    .dateVal(LocalDate.parse("2020-01-01"))
                    .enumVal(Enum.ONE)
                    .float32Val(2.2222222f)
                    .int32EnumVal(Int32EnumVal.SIXTY_NINE)
                    .int32Val(1)
                    .intEnumVal(IntEnumVal.Third)
                    .intVal(999999L)
                    .numVal(1.1d)
                    .strVal("example")
                    .boolOptVal(true)
                    .intOptNullVal(999999L)
                    .numOptNullVal(1.1d)
                    .strOptVal("optional example")
                    .build()),
                entry("mapElem2", SimpleObjectCamelCase.builder()
                    .anyVal("any example")
                    .boolVal(true)
                    .dateTimeVal(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                    .dateVal(LocalDate.parse("2020-01-01"))
                    .enumVal(Enum.ONE)
                    .float32Val(2.2222222f)
                    .int32EnumVal(Int32EnumVal.SIXTY_NINE)
                    .int32Val(1)
                    .intEnumVal(IntEnumVal.Third)
                    .intVal(999999L)
                    .numVal(1.1d)
                    .strVal("example")
                    .boolOptVal(true)
                    .intOptNullVal(999999L)
                    .numOptNullVal(1.1d)
                    .strOptVal("optional example")
                    .build()));

            RequestBodyPostApplicationJsonMapCamelCaseResponse res = sdk.requestBodies().requestBodyPostApplicationJsonMapCamelCase()
                .request(req)
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

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `request`                                                                                            | [java.util.Map<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>](../../models//.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |
| `serverURL`                                                                                          | *String*                                                                                             | :heavy_minus_sign:                                                                                   | An optional server URL to use.                                                                       |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapCamelCaseResponse>](../../models/operations/RequestBodyPostApplicationJsonMapCamelCaseResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostApplicationJsonMapObj

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

            java.util.Map<String, org.openapis.openapi.models.shared.SimpleObject> req = java.util.Map.ofEntries(
                entry("mapElem1", SimpleObject.builder()
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
                entry("mapElem2", SimpleObject.builder()
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
                    .build()));

            RequestBodyPostApplicationJsonMapObjResponse res = sdk.requestBodies().requestBodyPostApplicationJsonMapObj()
                .request(req)
                .call();

            if (res.mapObjValue().isPresent()) {
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

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [java.util.Map<String, org.openapis.openapi.models.shared.SimpleObject>](../../models//.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapObjResponse>](../../models/operations/RequestBodyPostApplicationJsonMapObjResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostApplicationJsonMapObjCamelCase

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

            java.util.Map<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase> req = java.util.Map.ofEntries(
                entry("mapElem1", SimpleObjectCamelCase.builder()
                    .anyVal("any example")
                    .boolVal(true)
                    .dateTimeVal(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                    .dateVal(LocalDate.parse("2020-01-01"))
                    .enumVal(Enum.ONE)
                    .float32Val(2.2222222f)
                    .int32EnumVal(Int32EnumVal.SIXTY_NINE)
                    .int32Val(1)
                    .intEnumVal(IntEnumVal.Third)
                    .intVal(999999L)
                    .numVal(1.1d)
                    .strVal("example")
                    .boolOptVal(true)
                    .intOptNullVal(999999L)
                    .numOptNullVal(1.1d)
                    .strOptVal("optional example")
                    .build()),
                entry("mapElem2", SimpleObjectCamelCase.builder()
                    .anyVal("any example")
                    .boolVal(true)
                    .dateTimeVal(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                    .dateVal(LocalDate.parse("2020-01-01"))
                    .enumVal(Enum.ONE)
                    .float32Val(2.2222222f)
                    .int32EnumVal(Int32EnumVal.SIXTY_NINE)
                    .int32Val(1)
                    .intEnumVal(IntEnumVal.Third)
                    .intVal(999999L)
                    .numVal(1.1d)
                    .strVal("example")
                    .boolOptVal(true)
                    .intOptNullVal(999999L)
                    .numOptNullVal(1.1d)
                    .strOptVal("optional example")
                    .build()));

            RequestBodyPostApplicationJsonMapObjCamelCaseResponse res = sdk.requestBodies().requestBodyPostApplicationJsonMapObjCamelCase()
                .request(req)
                .call();

            if (res.mapObjValueCamelCase().isPresent()) {
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

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `request`                                                                                            | [java.util.Map<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>](../../models//.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapObjCamelCaseResponse>](../../models/operations/RequestBodyPostApplicationJsonMapObjCamelCaseResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostApplicationJsonMapOfArray

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

            java.util.Map<String, java.util.List<org.openapis.openapi.models.shared.SimpleObject>> req = java.util.Map.ofEntries(
                entry("mapElem1", java.util.List.of(
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
                        .build())),
                entry("mapElem2", java.util.List.of(
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
                        .build())));

            RequestBodyPostApplicationJsonMapOfArrayResponse res = sdk.requestBodies().requestBodyPostApplicationJsonMapOfArray()
                .request(req)
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

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [java.util.Map<String, java.util.List<org.openapis.openapi.models.shared.SimpleObject>>](../../models//.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |
| `serverURL`                                                                                                 | *String*                                                                                                    | :heavy_minus_sign:                                                                                          | An optional server URL to use.                                                                              |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapOfArrayResponse>](../../models/operations/RequestBodyPostApplicationJsonMapOfArrayResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostApplicationJsonMapOfArrayCamelCase

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

            java.util.Map<String, java.util.List<org.openapis.openapi.models.shared.SimpleObjectCamelCase>> req = java.util.Map.ofEntries(
                entry("mapElem1", java.util.List.of(
                    SimpleObjectCamelCase.builder()
                        .anyVal("any example")
                        .boolVal(true)
                        .dateTimeVal(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                        .dateVal(LocalDate.parse("2020-01-01"))
                        .enumVal(Enum.ONE)
                        .float32Val(2.2222222f)
                        .int32EnumVal(Int32EnumVal.SIXTY_NINE)
                        .int32Val(1)
                        .intEnumVal(IntEnumVal.Third)
                        .intVal(999999L)
                        .numVal(1.1d)
                        .strVal("example")
                        .boolOptVal(true)
                        .intOptNullVal(999999L)
                        .numOptNullVal(1.1d)
                        .strOptVal("optional example")
                        .build(),
                    SimpleObjectCamelCase.builder()
                        .anyVal("any example")
                        .boolVal(true)
                        .dateTimeVal(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                        .dateVal(LocalDate.parse("2020-01-01"))
                        .enumVal(Enum.ONE)
                        .float32Val(2.2222222f)
                        .int32EnumVal(Int32EnumVal.SIXTY_NINE)
                        .int32Val(1)
                        .intEnumVal(IntEnumVal.Third)
                        .intVal(999999L)
                        .numVal(1.1d)
                        .strVal("example")
                        .boolOptVal(true)
                        .intOptNullVal(999999L)
                        .numOptNullVal(1.1d)
                        .strOptVal("optional example")
                        .build())),
                entry("mapElem2", java.util.List.of(
                    SimpleObjectCamelCase.builder()
                        .anyVal("any example")
                        .boolVal(true)
                        .dateTimeVal(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                        .dateVal(LocalDate.parse("2020-01-01"))
                        .enumVal(Enum.ONE)
                        .float32Val(2.2222222f)
                        .int32EnumVal(Int32EnumVal.SIXTY_NINE)
                        .int32Val(1)
                        .intEnumVal(IntEnumVal.Third)
                        .intVal(999999L)
                        .numVal(1.1d)
                        .strVal("example")
                        .boolOptVal(true)
                        .intOptNullVal(999999L)
                        .numOptNullVal(1.1d)
                        .strOptVal("optional example")
                        .build(),
                    SimpleObjectCamelCase.builder()
                        .anyVal("any example")
                        .boolVal(true)
                        .dateTimeVal(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                        .dateVal(LocalDate.parse("2020-01-01"))
                        .enumVal(Enum.ONE)
                        .float32Val(2.2222222f)
                        .int32EnumVal(Int32EnumVal.SIXTY_NINE)
                        .int32Val(1)
                        .intEnumVal(IntEnumVal.Third)
                        .intVal(999999L)
                        .numVal(1.1d)
                        .strVal("example")
                        .boolOptVal(true)
                        .intOptNullVal(999999L)
                        .numOptNullVal(1.1d)
                        .strOptVal("optional example")
                        .build())));

            RequestBodyPostApplicationJsonMapOfArrayCamelCaseResponse res = sdk.requestBodies().requestBodyPostApplicationJsonMapOfArrayCamelCase()
                .request(req)
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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [java.util.Map<String, java.util.List<org.openapis.openapi.models.shared.SimpleObjectCamelCase>>](../../models//.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `serverURL`                                                                                                          | *String*                                                                                                             | :heavy_minus_sign:                                                                                                   | An optional server URL to use.                                                                                       |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapOfArrayCamelCaseResponse>](../../models/operations/RequestBodyPostApplicationJsonMapOfArrayCamelCaseResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostApplicationJsonMapOfMap

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

            java.util.Map<String, java.util.Map<String, org.openapis.openapi.models.shared.SimpleObject>> req = java.util.Map.ofEntries(
                entry("mapElem1", java.util.Map.ofEntries(
                    entry("subMapElem1", SimpleObject.builder()
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
                    entry("subMapElem2", SimpleObject.builder()
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
                        .build()))),
                entry("mapElem2", java.util.Map.ofEntries(
                    entry("subMapElem1", SimpleObject.builder()
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
                    entry("subMapElem2", SimpleObject.builder()
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
                        .build()))));

            RequestBodyPostApplicationJsonMapOfMapResponse res = sdk.requestBodies().requestBodyPostApplicationJsonMapOfMap()
                .request(req)
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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [java.util.Map<String, java.util.Map<String, org.openapis.openapi.models.shared.SimpleObject>>](../../models//.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |
| `serverURL`                                                                                                        | *String*                                                                                                           | :heavy_minus_sign:                                                                                                 | An optional server URL to use.                                                                                     |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapOfMapResponse>](../../models/operations/RequestBodyPostApplicationJsonMapOfMapResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostApplicationJsonMapOfMapCamelCase

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

            java.util.Map<String, java.util.Map<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>> req = java.util.Map.ofEntries(
                entry("mapElem1", java.util.Map.ofEntries(
                    entry("subMapElem1", SimpleObjectCamelCase.builder()
                        .anyVal("any example")
                        .boolVal(true)
                        .dateTimeVal(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                        .dateVal(LocalDate.parse("2020-01-01"))
                        .enumVal(Enum.ONE)
                        .float32Val(2.2222222f)
                        .int32EnumVal(Int32EnumVal.SIXTY_NINE)
                        .int32Val(1)
                        .intEnumVal(IntEnumVal.Third)
                        .intVal(999999L)
                        .numVal(1.1d)
                        .strVal("example")
                        .boolOptVal(true)
                        .intOptNullVal(999999L)
                        .numOptNullVal(1.1d)
                        .strOptVal("optional example")
                        .build()),
                    entry("subMapElem2", SimpleObjectCamelCase.builder()
                        .anyVal("any example")
                        .boolVal(true)
                        .dateTimeVal(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                        .dateVal(LocalDate.parse("2020-01-01"))
                        .enumVal(Enum.ONE)
                        .float32Val(2.2222222f)
                        .int32EnumVal(Int32EnumVal.SIXTY_NINE)
                        .int32Val(1)
                        .intEnumVal(IntEnumVal.Third)
                        .intVal(999999L)
                        .numVal(1.1d)
                        .strVal("example")
                        .boolOptVal(true)
                        .intOptNullVal(999999L)
                        .numOptNullVal(1.1d)
                        .strOptVal("optional example")
                        .build()))),
                entry("mapElem2", java.util.Map.ofEntries(
                    entry("subMapElem1", SimpleObjectCamelCase.builder()
                        .anyVal("any example")
                        .boolVal(true)
                        .dateTimeVal(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                        .dateVal(LocalDate.parse("2020-01-01"))
                        .enumVal(Enum.ONE)
                        .float32Val(2.2222222f)
                        .int32EnumVal(Int32EnumVal.SIXTY_NINE)
                        .int32Val(1)
                        .intEnumVal(IntEnumVal.Third)
                        .intVal(999999L)
                        .numVal(1.1d)
                        .strVal("example")
                        .boolOptVal(true)
                        .intOptNullVal(999999L)
                        .numOptNullVal(1.1d)
                        .strOptVal("optional example")
                        .build()),
                    entry("subMapElem2", SimpleObjectCamelCase.builder()
                        .anyVal("any example")
                        .boolVal(true)
                        .dateTimeVal(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                        .dateVal(LocalDate.parse("2020-01-01"))
                        .enumVal(Enum.ONE)
                        .float32Val(2.2222222f)
                        .int32EnumVal(Int32EnumVal.SIXTY_NINE)
                        .int32Val(1)
                        .intEnumVal(IntEnumVal.Third)
                        .intVal(999999L)
                        .numVal(1.1d)
                        .strVal("example")
                        .boolOptVal(true)
                        .intOptNullVal(999999L)
                        .numOptNullVal(1.1d)
                        .strOptVal("optional example")
                        .build()))));

            RequestBodyPostApplicationJsonMapOfMapCamelCaseResponse res = sdk.requestBodies().requestBodyPostApplicationJsonMapOfMapCamelCase()
                .request(req)
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

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [java.util.Map<String, java.util.Map<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>>](../../models//.md) | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |
| `serverURL`                                                                                                                 | *String*                                                                                                                    | :heavy_minus_sign:                                                                                                          | An optional server URL to use.                                                                                              |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapOfMapCamelCaseResponse>](../../models/operations/RequestBodyPostApplicationJsonMapOfMapCamelCaseResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostApplicationJsonMapOfMapOfPrimitive

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

            java.util.Map<String, java.util.Map<String, String>> req = java.util.Map.ofEntries(
                entry("mapElem1", java.util.Map.ofEntries(
                    entry("subMapElem1", "foo"),
                    entry("subMapElem2", "bar"))),
                entry("mapElem2", java.util.Map.ofEntries(
                    entry("subMapElem1", "buzz"),
                    entry("subMapElem2", "bazz"))));

            RequestBodyPostApplicationJsonMapOfMapOfPrimitiveResponse res = sdk.requestBodies().requestBodyPostApplicationJsonMapOfMapOfPrimitive()
                .request(req)
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

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [java.util.Map<String, java.util.Map<String, String>>](../../models//.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |
| `serverURL`                                                               | *String*                                                                  | :heavy_minus_sign:                                                        | An optional server URL to use.                                            |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapOfMapOfPrimitiveResponse>](../../models/operations/RequestBodyPostApplicationJsonMapOfMapOfPrimitiveResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostApplicationJsonMapOfPrimitive

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

            java.util.Map<String, String> req = java.util.Map.ofEntries(
                entry("mapElem1", "hello"),
                entry("mapElem2", "world"));

            RequestBodyPostApplicationJsonMapOfPrimitiveResponse res = sdk.requestBodies().requestBodyPostApplicationJsonMapOfPrimitive()
                .request(req)
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

| Parameter                                          | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `request`                                          | [java.util.Map<String, String>](../../models//.md) | :heavy_check_mark:                                 | The request object to use for the request.         |
| `serverURL`                                        | *String*                                           | :heavy_minus_sign:                                 | An optional server URL to use.                     |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapOfPrimitiveResponse>](../../models/operations/RequestBodyPostApplicationJsonMapOfPrimitiveResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostApplicationJsonMultipleJsonFiltered

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

            RequestBodyPostApplicationJsonMultipleJsonFilteredResponse res = sdk.requestBodies().requestBodyPostApplicationJsonMultipleJsonFiltered()
                .request(req)
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

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `request`                                                                              | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md) | :heavy_check_mark:                                                                     | The request object to use for the request.                                             |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMultipleJsonFilteredResponse>](../../models/operations/RequestBodyPostApplicationJsonMultipleJsonFilteredResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostApplicationJsonSimple

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

            RequestBodyPostApplicationJsonSimpleResponse res = sdk.requestBodies().requestBodyPostApplicationJsonSimple()
                .request(req)
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

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `request`                                                                              | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md) | :heavy_check_mark:                                                                     | The request object to use for the request.                                             |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonSimpleResponse>](../../models/operations/RequestBodyPostApplicationJsonSimpleResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostApplicationJsonSimpleCamelCase

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

            SimpleObjectCamelCase req = SimpleObjectCamelCase.builder()
                .anyVal("any example")
                .boolVal(true)
                .dateTimeVal(OffsetDateTime.parse("2020-01-01T00:00:00Z"))
                .dateVal(LocalDate.parse("2020-01-01"))
                .enumVal(Enum.ONE)
                .float32Val(2.2222222f)
                .int32EnumVal(Int32EnumVal.SIXTY_NINE)
                .int32Val(1)
                .intEnumVal(IntEnumVal.Third)
                .intVal(999999L)
                .numVal(1.1d)
                .strVal("example")
                .boolOptVal(true)
                .intOptNullVal(999999L)
                .numOptNullVal(1.1d)
                .strOptVal("optional example")
                .build();

            RequestBodyPostApplicationJsonSimpleCamelCaseResponse res = sdk.requestBodies().requestBodyPostApplicationJsonSimpleCamelCase()
                .request(req)
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

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                | [org.openapis.openapi.models.shared.SimpleObjectCamelCase](../../models/shared/SimpleObjectCamelCase.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonSimpleCamelCaseResponse>](../../models/operations/RequestBodyPostApplicationJsonSimpleCamelCaseResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostComplexNumberTypes

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

            RequestBodyPostComplexNumberTypesRequest req = RequestBodyPostComplexNumberTypesRequest.builder()
                .complexNumberTypes(ComplexNumberTypes.builder()
                        .bigint(new BigInteger("8821239038968084"))
                        .bigintStr(new BigInteger("9223372036854775808"))
                        .decimal(new BigDecimal("3.141592653589793"))
                        .decimalStr(new BigDecimal("3.14159265358979344719667586"))
                        .build())
                .pathBigInt(new BigInteger("8821239038968084"))
                .pathBigIntStr(new BigInteger("9223372036854775808"))
                .pathDecimal(new BigDecimal("3.141592653589793"))
                .pathDecimalStr(new BigDecimal("3.14159265358979344719667586"))
                .queryBigInt(new BigInteger("8821239038968084"))
                .queryBigIntStr(new BigInteger("9223372036854775808"))
                .queryDecimal(new BigDecimal("3.141592653589793"))
                .queryDecimalStr(new BigDecimal("3.14159265358979344719667586"))
                .build();

            RequestBodyPostComplexNumberTypesResponse res = sdk.requestBodies().requestBodyPostComplexNumberTypes()
                .request(req)
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                              | [org.openapis.openapi.models.operations.RequestBodyPostComplexNumberTypesRequest](../../models/operations/RequestBodyPostComplexNumberTypesRequest.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostComplexNumberTypesResponse>](../../models/operations/RequestBodyPostComplexNumberTypesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostDefaultsAndConsts

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

            DefaultsAndConsts req = DefaultsAndConsts.builder()
                .normalField("test")
                .build();

            RequestBodyPostDefaultsAndConstsResponse res = sdk.requestBodies().requestBodyPostDefaultsAndConsts()
                .request(req)
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `request`                                                                                        | [org.openapis.openapi.models.shared.DefaultsAndConsts](../../models/shared/DefaultsAndConsts.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostDefaultsAndConstsResponse>](../../models/operations/RequestBodyPostDefaultsAndConstsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostEmptyObject

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

            RequestBodyPostEmptyObjectRequestBody req = RequestBodyPostEmptyObjectRequestBody.builder()
                .build();

            RequestBodyPostEmptyObjectResponse res = sdk.requestBodies().requestBodyPostEmptyObject()
                .request(req)
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                        | [org.openapis.openapi.models.operations.RequestBodyPostEmptyObjectRequestBody](../../models/operations/RequestBodyPostEmptyObjectRequestBody.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostEmptyObjectResponse>](../../models/operations/RequestBodyPostEmptyObjectResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostFormDeep

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

            DeepObject req = DeepObject.builder()
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
                .build();

            RequestBodyPostFormDeepResponse res = sdk.requestBodies().requestBodyPostFormDeep()
                .request(req)
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

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `request`                                                                          | [org.openapis.openapi.models.shared.DeepObject](../../models/shared/DeepObject.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostFormDeepResponse>](../../models/operations/RequestBodyPostFormDeepResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostFormMapPrimitive

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

            java.util.Map<String, String> req = java.util.Map.ofEntries(
                entry("key1", "value1"),
                entry("key2", "value2"),
                entry("key3", "value3"));

            RequestBodyPostFormMapPrimitiveResponse res = sdk.requestBodies().requestBodyPostFormMapPrimitive()
                .request(req)
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

| Parameter                                          | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `request`                                          | [java.util.Map<String, String>](../../models//.md) | :heavy_check_mark:                                 | The request object to use for the request.         |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostFormMapPrimitiveResponse>](../../models/operations/RequestBodyPostFormMapPrimitiveResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostFormSimple

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

            RequestBodyPostFormSimpleResponse res = sdk.requestBodies().requestBodyPostFormSimple()
                .request(req)
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

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `request`                                                                              | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md) | :heavy_check_mark:                                                                     | The request object to use for the request.                                             |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostFormSimpleResponse>](../../models/operations/RequestBodyPostFormSimpleResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostJsonDataTypesArrayBigInt

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

            java.util.List<BigInteger> req = java.util.List.of(
                new BigInteger("1"));

            RequestBodyPostJsonDataTypesArrayBigIntResponse res = sdk.requestBodies().requestBodyPostJsonDataTypesArrayBigInt()
                .request(req)
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                       | Type                                            | Required                                        | Description                                     |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| `request`                                       | [java.util.List<BigInteger>](../../models//.md) | :heavy_check_mark:                              | The request object to use for the request.      |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesArrayBigIntResponse>](../../models/operations/RequestBodyPostJsonDataTypesArrayBigIntResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostJsonDataTypesArrayDate

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

            java.util.List<LocalDate> req = java.util.List.of(
                LocalDate.parse("2020-01-01"));

            RequestBodyPostJsonDataTypesArrayDateResponse res = sdk.requestBodies().requestBodyPostJsonDataTypesArrayDate()
                .request(req)
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                      | Type                                           | Required                                       | Description                                    |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| `request`                                      | [java.util.List<LocalDate>](../../models//.md) | :heavy_check_mark:                             | The request object to use for the request.     |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesArrayDateResponse>](../../models/operations/RequestBodyPostJsonDataTypesArrayDateResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostJsonDataTypesArrayDecimalStr

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

            java.util.List<BigDecimal> req = java.util.List.of(
                new BigDecimal("3.141592653589793438462643383279"));

            RequestBodyPostJsonDataTypesArrayDecimalStrResponse res = sdk.requestBodies().requestBodyPostJsonDataTypesArrayDecimalStr()
                .request(req)
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                       | Type                                            | Required                                        | Description                                     |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| `request`                                       | [java.util.List<BigDecimal>](../../models//.md) | :heavy_check_mark:                              | The request object to use for the request.      |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesArrayDecimalStrResponse>](../../models/operations/RequestBodyPostJsonDataTypesArrayDecimalStrResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostJsonDataTypesBigInt

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

            BigInteger req = new BigInteger("1");

            RequestBodyPostJsonDataTypesBigIntResponse res = sdk.requestBodies().requestBodyPostJsonDataTypesBigInt()
                .request(req)
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [BigInteger](../../models//.md)            | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesBigIntResponse>](../../models/operations/RequestBodyPostJsonDataTypesBigIntResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostJsonDataTypesBigIntStr

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

            BigInteger req = new BigInteger("1");

            RequestBodyPostJsonDataTypesBigIntStrResponse res = sdk.requestBodies().requestBodyPostJsonDataTypesBigIntStr()
                .request(req)
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [BigInteger](../../models//.md)            | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesBigIntStrResponse>](../../models/operations/RequestBodyPostJsonDataTypesBigIntStrResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostJsonDataTypesBoolean

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

            boolean req = true;

            RequestBodyPostJsonDataTypesBooleanResponse res = sdk.requestBodies().requestBodyPostJsonDataTypesBoolean()
                .request(req)
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [boolean](../../models//.md)               | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesBooleanResponse>](../../models/operations/RequestBodyPostJsonDataTypesBooleanResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostJsonDataTypesComplexNumberArrays

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

            ComplexNumberArrays req = ComplexNumberArrays.builder()
                .build();

            RequestBodyPostJsonDataTypesComplexNumberArraysResponse res = sdk.requestBodies().requestBodyPostJsonDataTypesComplexNumberArrays()
                .request(req)
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

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `request`                                                                                            | [org.openapis.openapi.models.shared.ComplexNumberArrays](../../models/shared/ComplexNumberArrays.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesComplexNumberArraysResponse>](../../models/operations/RequestBodyPostJsonDataTypesComplexNumberArraysResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostJsonDataTypesComplexNumberMaps

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

            ComplexNumberMaps req = ComplexNumberMaps.builder()
                .build();

            RequestBodyPostJsonDataTypesComplexNumberMapsResponse res = sdk.requestBodies().requestBodyPostJsonDataTypesComplexNumberMaps()
                .request(req)
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

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `request`                                                                                        | [org.openapis.openapi.models.shared.ComplexNumberMaps](../../models/shared/ComplexNumberMaps.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesComplexNumberMapsResponse>](../../models/operations/RequestBodyPostJsonDataTypesComplexNumberMapsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostJsonDataTypesDate

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

            LocalDate req = LocalDate.parse("2020-01-01");

            RequestBodyPostJsonDataTypesDateResponse res = sdk.requestBodies().requestBodyPostJsonDataTypesDate()
                .request(req)
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [LocalDate](../../models//.md)             | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesDateResponse>](../../models/operations/RequestBodyPostJsonDataTypesDateResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostJsonDataTypesDateTime

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

            OffsetDateTime req = OffsetDateTime.parse("2020-01-01T00:00:00.001Z");

            RequestBodyPostJsonDataTypesDateTimeResponse res = sdk.requestBodies().requestBodyPostJsonDataTypesDateTime()
                .request(req)
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [OffsetDateTime](../../models//.md)        | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesDateTimeResponse>](../../models/operations/RequestBodyPostJsonDataTypesDateTimeResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostJsonDataTypesDecimal

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

            BigDecimal req = new BigDecimal("1.1");

            RequestBodyPostJsonDataTypesDecimalResponse res = sdk.requestBodies().requestBodyPostJsonDataTypesDecimal()
                .request(req)
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [BigDecimal](../../models//.md)            | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesDecimalResponse>](../../models/operations/RequestBodyPostJsonDataTypesDecimalResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostJsonDataTypesDecimalStr

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

            BigDecimal req = new BigDecimal("1.1");

            RequestBodyPostJsonDataTypesDecimalStrResponse res = sdk.requestBodies().requestBodyPostJsonDataTypesDecimalStr()
                .request(req)
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [BigDecimal](../../models//.md)            | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesDecimalStrResponse>](../../models/operations/RequestBodyPostJsonDataTypesDecimalStrResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostJsonDataTypesFloat32

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

            double req = 1.1d;

            RequestBodyPostJsonDataTypesFloat32Response res = sdk.requestBodies().requestBodyPostJsonDataTypesFloat32()
                .request(req)
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [double](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesFloat32Response>](../../models/operations/RequestBodyPostJsonDataTypesFloat32Response.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostJsonDataTypesInt32

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

            int req = 1;

            RequestBodyPostJsonDataTypesInt32Response res = sdk.requestBodies().requestBodyPostJsonDataTypesInt32()
                .request(req)
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [int](../../models//.md)                   | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesInt32Response>](../../models/operations/RequestBodyPostJsonDataTypesInt32Response.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostJsonDataTypesInteger

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

            long req = 1L;

            RequestBodyPostJsonDataTypesIntegerResponse res = sdk.requestBodies().requestBodyPostJsonDataTypesInteger()
                .request(req)
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [long](../../models//.md)                  | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesIntegerResponse>](../../models/operations/RequestBodyPostJsonDataTypesIntegerResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostJsonDataTypesMapBigIntStr

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

            java.util.Map<String, BigInteger> req = java.util.Map.ofEntries(
                entry("test", new BigInteger("1")));

            RequestBodyPostJsonDataTypesMapBigIntStrResponse res = sdk.requestBodies().requestBodyPostJsonDataTypesMapBigIntStr()
                .request(req)
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                              | Type                                                   | Required                                               | Description                                            |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `request`                                              | [java.util.Map<String, BigInteger>](../../models//.md) | :heavy_check_mark:                                     | The request object to use for the request.             |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesMapBigIntStrResponse>](../../models/operations/RequestBodyPostJsonDataTypesMapBigIntStrResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostJsonDataTypesMapDateTime

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

            java.util.Map<String, OffsetDateTime> req = java.util.Map.ofEntries(
                entry("test", OffsetDateTime.parse("2020-01-01T00:00:00.001Z")));

            RequestBodyPostJsonDataTypesMapDateTimeResponse res = sdk.requestBodies().requestBodyPostJsonDataTypesMapDateTime()
                .request(req)
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `request`                                                  | [java.util.Map<String, OffsetDateTime>](../../models//.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesMapDateTimeResponse>](../../models/operations/RequestBodyPostJsonDataTypesMapDateTimeResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostJsonDataTypesMapDecimal

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

            java.util.Map<String, BigDecimal> req = java.util.Map.ofEntries(
                entry("test", new BigDecimal("3.141592653589793")));

            RequestBodyPostJsonDataTypesMapDecimalResponse res = sdk.requestBodies().requestBodyPostJsonDataTypesMapDecimal()
                .request(req)
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                              | Type                                                   | Required                                               | Description                                            |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `request`                                              | [java.util.Map<String, BigDecimal>](../../models//.md) | :heavy_check_mark:                                     | The request object to use for the request.             |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesMapDecimalResponse>](../../models/operations/RequestBodyPostJsonDataTypesMapDecimalResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostJsonDataTypesNumber

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

            double req = 1.1d;

            RequestBodyPostJsonDataTypesNumberResponse res = sdk.requestBodies().requestBodyPostJsonDataTypesNumber()
                .request(req)
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [double](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesNumberResponse>](../../models/operations/RequestBodyPostJsonDataTypesNumberResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostJsonDataTypesString

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

            String req = "test";

            RequestBodyPostJsonDataTypesStringResponse res = sdk.requestBodies().requestBodyPostJsonDataTypesString()
                .request(req)
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesStringResponse>](../../models/operations/RequestBodyPostJsonDataTypesStringResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostMultipleContentTypesComponentFiltered

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

            RequestBodyPostMultipleContentTypesComponentFilteredResponse res = sdk.requestBodies().requestBodyPostMultipleContentTypesComponentFiltered()
                .request(req)
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

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `request`                                                                              | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md) | :heavy_check_mark:                                                                     | The request object to use for the request.                                             |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesComponentFilteredResponse>](../../models/operations/RequestBodyPostMultipleContentTypesComponentFilteredResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostMultipleContentTypesInlineFiltered

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

            RequestBodyPostMultipleContentTypesInlineFilteredRequestBody req = RequestBodyPostMultipleContentTypesInlineFilteredRequestBody.builder()
                .bool(true)
                .num(1.1d)
                .str("test")
                .build();

            RequestBodyPostMultipleContentTypesInlineFilteredResponse res = sdk.requestBodies().requestBodyPostMultipleContentTypesInlineFiltered()
                .request(req)
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

| Parameter                                                                                                                                                                                      | Type                                                                                                                                                                                           | Required                                                                                                                                                                                       | Description                                                                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                                      | [org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesInlineFilteredRequestBody](../../models/operations/RequestBodyPostMultipleContentTypesInlineFilteredRequestBody.md) | :heavy_check_mark:                                                                                                                                                                             | The request object to use for the request.                                                                                                                                                     |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesInlineFilteredResponse>](../../models/operations/RequestBodyPostMultipleContentTypesInlineFilteredResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostMultipleContentTypesSplitParamForm

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

            RequestBodyPostMultipleContentTypesSplitParamFormResponse res = sdk.requestBodies().requestBodyPostMultipleContentTypesSplitParamForm()
                .requestBody(RequestBodyPostMultipleContentTypesSplitParamFormRequestBody.builder()
                    .bool3(false)
                    .num3(8693.24d)
                    .str3("<value>")
                    .build())
                .paramStr("<value>")
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

| Parameter                                                                                                                                                                                      | Type                                                                                                                                                                                           | Required                                                                                                                                                                                       | Description                                                                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                                                                                                  | [org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamFormRequestBody](../../models/operations/RequestBodyPostMultipleContentTypesSplitParamFormRequestBody.md) | :heavy_check_mark:                                                                                                                                                                             | N/A                                                                                                                                                                                            |
| `paramStr`                                                                                                                                                                                     | *String*                                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                                             | N/A                                                                                                                                                                                            |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamFormResponse>](../../models/operations/RequestBodyPostMultipleContentTypesSplitParamFormResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostMultipleContentTypesSplitParamJson

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

            RequestBodyPostMultipleContentTypesSplitParamJsonResponse res = sdk.requestBodies().requestBodyPostMultipleContentTypesSplitParamJson()
                .requestBody(RequestBodyPostMultipleContentTypesSplitParamJsonRequestBody.builder()
                    .bool(false)
                    .num(9771.91d)
                    .str("<value>")
                    .build())
                .paramStr("<value>")
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

| Parameter                                                                                                                                                                                      | Type                                                                                                                                                                                           | Required                                                                                                                                                                                       | Description                                                                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                                                                                                  | [org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamJsonRequestBody](../../models/operations/RequestBodyPostMultipleContentTypesSplitParamJsonRequestBody.md) | :heavy_check_mark:                                                                                                                                                                             | N/A                                                                                                                                                                                            |
| `paramStr`                                                                                                                                                                                     | *String*                                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                                             | N/A                                                                                                                                                                                            |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamJsonResponse>](../../models/operations/RequestBodyPostMultipleContentTypesSplitParamJsonResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostMultipleContentTypesSplitParamMultipart

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

            RequestBodyPostMultipleContentTypesSplitParamMultipartResponse res = sdk.requestBodies().requestBodyPostMultipleContentTypesSplitParamMultipart()
                .requestBody(RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody.builder()
                    .bool2(false)
                    .num2(7000.76d)
                    .str2("<value>")
                    .build())
                .paramStr("<value>")
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

| Parameter                                                                                                                                                                                                | Type                                                                                                                                                                                                     | Required                                                                                                                                                                                                 | Description                                                                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                                                                                                            | [org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody](../../models/operations/RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody.md) | :heavy_check_mark:                                                                                                                                                                                       | N/A                                                                                                                                                                                                      |
| `paramStr`                                                                                                                                                                                               | *String*                                                                                                                                                                                                 | :heavy_check_mark:                                                                                                                                                                                       | N/A                                                                                                                                                                                                      |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamMultipartResponse>](../../models/operations/RequestBodyPostMultipleContentTypesSplitParamMultipartResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostMultipleContentTypesSplitForm

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

            RequestBodyPostMultipleContentTypesSplitFormRequestBody req = RequestBodyPostMultipleContentTypesSplitFormRequestBody.builder()
                .bool3(false)
                .num3(7842.07d)
                .str3("<value>")
                .build();

            RequestBodyPostMultipleContentTypesSplitFormResponse res = sdk.requestBodies().requestBodyPostMultipleContentTypesSplitForm()
                .request(req)
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

| Parameter                                                                                                                                                                            | Type                                                                                                                                                                                 | Required                                                                                                                                                                             | Description                                                                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                            | [org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitFormRequestBody](../../models/operations/RequestBodyPostMultipleContentTypesSplitFormRequestBody.md) | :heavy_check_mark:                                                                                                                                                                   | The request object to use for the request.                                                                                                                                           |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitFormResponse>](../../models/operations/RequestBodyPostMultipleContentTypesSplitFormResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostMultipleContentTypesSplitJson

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

            RequestBodyPostMultipleContentTypesSplitJsonRequestBody req = RequestBodyPostMultipleContentTypesSplitJsonRequestBody.builder()
                .bool(false)
                .num(2445.56d)
                .str("<value>")
                .build();

            RequestBodyPostMultipleContentTypesSplitJsonResponse res = sdk.requestBodies().requestBodyPostMultipleContentTypesSplitJson()
                .request(req)
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

| Parameter                                                                                                                                                                            | Type                                                                                                                                                                                 | Required                                                                                                                                                                             | Description                                                                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                            | [org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitJsonRequestBody](../../models/operations/RequestBodyPostMultipleContentTypesSplitJsonRequestBody.md) | :heavy_check_mark:                                                                                                                                                                   | The request object to use for the request.                                                                                                                                           |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitJsonResponse>](../../models/operations/RequestBodyPostMultipleContentTypesSplitJsonResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostMultipleContentTypesSplitMultipart

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

            RequestBodyPostMultipleContentTypesSplitMultipartRequestBody req = RequestBodyPostMultipleContentTypesSplitMultipartRequestBody.builder()
                .bool2(false)
                .num2(2079.2d)
                .str2("<value>")
                .build();

            RequestBodyPostMultipleContentTypesSplitMultipartResponse res = sdk.requestBodies().requestBodyPostMultipleContentTypesSplitMultipart()
                .request(req)
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

| Parameter                                                                                                                                                                                      | Type                                                                                                                                                                                           | Required                                                                                                                                                                                       | Description                                                                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                                      | [org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitMultipartRequestBody](../../models/operations/RequestBodyPostMultipleContentTypesSplitMultipartRequestBody.md) | :heavy_check_mark:                                                                                                                                                                             | The request object to use for the request.                                                                                                                                                     |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitMultipartResponse>](../../models/operations/RequestBodyPostMultipleContentTypesSplitMultipartResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostNotNullableNotRequiredStringBody

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

            RequestBodyPostNotNullableNotRequiredStringBodyResponse res = sdk.requestBodies().requestBodyPostNotNullableNotRequiredStringBody()
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostNotNullableNotRequiredStringBodyResponse>](../../models/operations/RequestBodyPostNotNullableNotRequiredStringBodyResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostNullArray

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

            java.util.List<String> req = java.util.List.of(
                "value1",
                "value2",
                "value3");

            RequestBodyPostNullArrayResponse res = sdk.requestBodies().requestBodyPostNullArray()
                .request(req)
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                   | Type                                        | Required                                    | Description                                 |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| `request`                                   | [java.util.List<String>](../../models//.md) | :heavy_check_mark:                          | The request object to use for the request.  |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostNullArrayResponse>](../../models/operations/RequestBodyPostNullArrayResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostNullDictionary

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

            java.util.Map<String, String> req = java.util.Map.ofEntries(
                entry("key1", "value1"),
                entry("key2", "value2"),
                entry("key3", "value3"));

            RequestBodyPostNullDictionaryResponse res = sdk.requestBodies().requestBodyPostNullDictionary()
                .request(req)
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                          | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `request`                                          | [java.util.Map<String, String>](../../models//.md) | :heavy_check_mark:                                 | The request object to use for the request.         |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostNullDictionaryResponse>](../../models/operations/RequestBodyPostNullDictionaryResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostNullableNotRequiredStringBody

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

            RequestBodyPostNullableNotRequiredStringBodyResponse res = sdk.requestBodies().requestBodyPostNullableNotRequiredStringBody()
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostNullableNotRequiredStringBodyResponse>](../../models/operations/RequestBodyPostNullableNotRequiredStringBodyResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPostNullableRequiredStringBody

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

            RequestBodyPostNullableRequiredStringBodyResponse res = sdk.requestBodies().requestBodyPostNullableRequiredStringBody()
                .call();

            if (res.object().isPresent()) {
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

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPostNullableRequiredStringBodyResponse>](../../models/operations/RequestBodyPostNullableRequiredStringBodyResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPutBytes

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

            byte[] req = "0x5DbFFb1Ff9".getBytes();

            RequestBodyPutBytesResponse res = sdk.requestBodies().requestBodyPutBytes()
                .request(req)
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

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [byte[]](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPutBytesResponse>](../../models/operations/RequestBodyPutBytesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPutBytesWithParams

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

            RequestBodyPutBytesWithParamsResponse res = sdk.requestBodies().requestBodyPutBytesWithParams()
                .requestBody("0xC1B9cA4eb5".getBytes())
                .queryStringParam("<value>")
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
| `requestBody`      | *byte[]*           | :heavy_check_mark: | N/A                |
| `queryStringParam` | *String*           | :heavy_check_mark: | N/A                |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPutBytesWithParamsResponse>](../../models/operations/RequestBodyPutBytesWithParamsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPutMultipartDeep

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

            DeepObject req = DeepObject.builder()
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
                .build();

            RequestBodyPutMultipartDeepResponse res = sdk.requestBodies().requestBodyPutMultipartDeep()
                .request(req)
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

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `request`                                                                          | [org.openapis.openapi.models.shared.DeepObject](../../models/shared/DeepObject.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPutMultipartDeepResponse>](../../models/operations/RequestBodyPutMultipartDeepResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPutMultipartDifferentFileName

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

            RequestBodyPutMultipartDifferentFileNameRequestBody req = RequestBodyPutMultipartDifferentFileNameRequestBody.builder()
                .build();

            RequestBodyPutMultipartDifferentFileNameResponse res = sdk.requestBodies().requestBodyPutMultipartDifferentFileName()
                .request(req)
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

| Parameter                                                                                                                                                                    | Type                                                                                                                                                                         | Required                                                                                                                                                                     | Description                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                    | [org.openapis.openapi.models.operations.RequestBodyPutMultipartDifferentFileNameRequestBody](../../models/operations/RequestBodyPutMultipartDifferentFileNameRequestBody.md) | :heavy_check_mark:                                                                                                                                                           | The request object to use for the request.                                                                                                                                   |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPutMultipartDifferentFileNameResponse>](../../models/operations/RequestBodyPutMultipartDifferentFileNameResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPutMultipartFile

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

            RequestBodyPutMultipartFileRequestBody req = RequestBodyPutMultipartFileRequestBody.builder()
                .build();

            RequestBodyPutMultipartFileResponse res = sdk.requestBodies().requestBodyPutMultipartFile()
                .request(req)
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

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [org.openapis.openapi.models.operations.RequestBodyPutMultipartFileRequestBody](../../models/operations/RequestBodyPutMultipartFileRequestBody.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPutMultipartFileResponse>](../../models/operations/RequestBodyPutMultipartFileResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPutMultipartOptionalRequestBody

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

            RequestBodyPutMultipartOptionalRequestBodyRequestBody req = RequestBodyPutMultipartOptionalRequestBodyRequestBody.builder()
                .build();

            RequestBodyPutMultipartOptionalRequestBodyResponse res = sdk.requestBodies().requestBodyPutMultipartOptionalRequestBody()
                .request(req)
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

| Parameter                                                                                                                                                                        | Type                                                                                                                                                                             | Required                                                                                                                                                                         | Description                                                                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                        | [org.openapis.openapi.models.operations.RequestBodyPutMultipartOptionalRequestBodyRequestBody](../../models/operations/RequestBodyPutMultipartOptionalRequestBodyRequestBody.md) | :heavy_check_mark:                                                                                                                                                               | The request object to use for the request.                                                                                                                                       |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPutMultipartOptionalRequestBodyResponse>](../../models/operations/RequestBodyPutMultipartOptionalRequestBodyResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPutMultipartSimple

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

            RequestBodyPutMultipartSimpleResponse res = sdk.requestBodies().requestBodyPutMultipartSimple()
                .request(req)
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

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `request`                                                                              | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md) | :heavy_check_mark:                                                                     | The request object to use for the request.                                             |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPutMultipartSimpleResponse>](../../models/operations/RequestBodyPutMultipartSimpleResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPutString

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

            String req = "Hello World";

            RequestBodyPutStringResponse res = sdk.requestBodies().requestBodyPutString()
                .request(req)
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

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPutStringResponse>](../../models/operations/RequestBodyPutStringResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyPutStringWithParams

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

            RequestBodyPutStringWithParamsResponse res = sdk.requestBodies().requestBodyPutStringWithParams()
                .requestBody("Hello world")
                .queryStringParam("test param")
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
| `requestBody`      | *String*           | :heavy_check_mark: | N/A                | Hello world        |
| `queryStringParam` | *String*           | :heavy_check_mark: | N/A                | test param         |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyPutStringWithParamsResponse>](../../models/operations/RequestBodyPutStringWithParamsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyReadAndWrite

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

            ReadWriteObject req = ReadWriteObject.builder()
                .num1(1L)
                .num2(2L)
                .num3(4L)
                .build();

            RequestBodyReadAndWriteResponse res = sdk.requestBodies().requestBodyReadAndWrite()
                .request(req)
                .call();

            if (res.readWriteObject().isPresent()) {
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

| Parameter                                                                                    | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `request`                                                                                    | [org.openapis.openapi.models.shared.ReadWriteObject](../../models/shared/ReadWriteObject.md) | :heavy_check_mark:                                                                           | The request object to use for the request.                                                   |
| `serverURL`                                                                                  | *String*                                                                                     | :heavy_minus_sign:                                                                           | An optional server URL to use.                                                               |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyReadAndWriteResponse>](../../models/operations/RequestBodyReadAndWriteResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyReadOnlyInput

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

            ReadOnlyObjectInput req = ReadOnlyObjectInput.builder()
                .build();

            RequestBodyReadOnlyInputResponse res = sdk.requestBodies().requestBodyReadOnlyInput()
                .request(req)
                .call();

            if (res.readOnlyObject().isPresent()) {
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

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `request`                                                                                            | [org.openapis.openapi.models.shared.ReadOnlyObjectInput](../../models/shared/ReadOnlyObjectInput.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |
| `serverURL`                                                                                          | *String*                                                                                             | :heavy_minus_sign:                                                                                   | An optional server URL to use.                                                                       |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyReadOnlyInputResponse>](../../models/operations/RequestBodyReadOnlyInputResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyReadOnlyUnion

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

            WeaklyTypedOneOfReadOnlyObjectInput req = WeaklyTypedOneOfReadOnlyObjectInput.of(SimpleObject.builder()
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
                    .build());

            RequestBodyReadOnlyUnionResponse res = sdk.requestBodies().requestBodyReadOnlyUnion()
                .request(req)
                .call();

            if (res.weaklyTypedOneOfReadOnlyObject().isPresent()) {
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

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [org.openapis.openapi.models.shared.WeaklyTypedOneOfReadOnlyObjectInput](../../models/shared/WeaklyTypedOneOfReadOnlyObjectInput.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |
| `serverURL`                                                                                                                          | *String*                                                                                                                             | :heavy_minus_sign:                                                                                                                   | An optional server URL to use.                                                                                                       |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyReadOnlyUnionResponse>](../../models/operations/RequestBodyReadOnlyUnionResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyReadWriteOnlyUnion

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

            WeaklyTypedOneOfReadWriteObject req = WeaklyTypedOneOfReadWriteObject.of(ReadWriteObject.builder()
                    .num1(1L)
                    .num2(2L)
                    .num3(4L)
                    .build());

            RequestBodyReadWriteOnlyUnionResponse res = sdk.requestBodies().requestBodyReadWriteOnlyUnion()
                .request(req)
                .call();

            if (res.weaklyTypedOneOfReadWriteObject().isPresent()) {
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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [org.openapis.openapi.models.shared.WeaklyTypedOneOfReadWriteObject](../../models/shared/WeaklyTypedOneOfReadWriteObject.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `serverURL`                                                                                                                  | *String*                                                                                                                     | :heavy_minus_sign:                                                                                                           | An optional server URL to use.                                                                                               |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyReadWriteOnlyUnionResponse>](../../models/operations/RequestBodyReadWriteOnlyUnionResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyWriteOnly

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

            WriteOnlyObject req = WriteOnlyObject.builder()
                .bool(true)
                .num(1d)
                .string("hello")
                .build();

            RequestBodyWriteOnlyResponse res = sdk.requestBodies().requestBodyWriteOnly()
                .request(req)
                .call();

            if (res.readOnlyObject().isPresent()) {
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

| Parameter                                                                                    | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `request`                                                                                    | [org.openapis.openapi.models.shared.WriteOnlyObject](../../models/shared/WriteOnlyObject.md) | :heavy_check_mark:                                                                           | The request object to use for the request.                                                   |
| `serverURL`                                                                                  | *String*                                                                                     | :heavy_minus_sign:                                                                           | An optional server URL to use.                                                               |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyWriteOnlyResponse>](../../models/operations/RequestBodyWriteOnlyResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyWriteOnlyOutput

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

            WriteOnlyObject req = WriteOnlyObject.builder()
                .bool(true)
                .num(1d)
                .string("hello")
                .build();

            RequestBodyWriteOnlyOutputResponse res = sdk.requestBodies().requestBodyWriteOnlyOutput()
                .request(req)
                .call();

            if (res.writeOnlyObject().isPresent()) {
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

| Parameter                                                                                    | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `request`                                                                                    | [org.openapis.openapi.models.shared.WriteOnlyObject](../../models/shared/WriteOnlyObject.md) | :heavy_check_mark:                                                                           | The request object to use for the request.                                                   |
| `serverURL`                                                                                  | *String*                                                                                     | :heavy_minus_sign:                                                                           | An optional server URL to use.                                                               |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyWriteOnlyOutputResponse>](../../models/operations/RequestBodyWriteOnlyOutputResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## requestBodyWriteOnlyUnion

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

            WeaklyTypedOneOfWriteOnlyObject req = WeaklyTypedOneOfWriteOnlyObject.of(WriteOnlyObject.builder()
                    .bool(true)
                    .num(1d)
                    .string("hello")
                    .build());

            RequestBodyWriteOnlyUnionResponse res = sdk.requestBodies().requestBodyWriteOnlyUnion()
                .request(req)
                .call();

            if (res.weaklyTypedOneOfWriteOnlyObject().isPresent()) {
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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [org.openapis.openapi.models.shared.WeaklyTypedOneOfWriteOnlyObject](../../models/shared/WeaklyTypedOneOfWriteOnlyObject.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `serverURL`                                                                                                                  | *String*                                                                                                                     | :heavy_minus_sign:                                                                                                           | An optional server URL to use.                                                                                               |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.RequestBodyWriteOnlyUnionResponse>](../../models/operations/RequestBodyWriteOnlyUnionResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
