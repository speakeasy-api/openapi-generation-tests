# RequestBodies
(*requestBodies*)

## Overview

Endpoints for testing request bodies.

### Available Operations

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
* [requestBodyPutMultipartFile](#requestbodyputmultipartfile)
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

## nullableObjectPost

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.NullableObjectPostResponse;
import org.openapis.openapi.models.shared.NullableObject;
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

            org.openapis.openapi.models.shared.NullableObject req = new NullableObject(25756L) {{
                optional = "iusto";
            }};            

            NullableObjectPostResponse res = sdk.requestBodies.nullableObjectPost(req);

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

| Parameter                                                                                  | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `request`                                                                                  | [org.openapis.openapi.models.shared.NullableObject](../../models/shared/NullableObject.md) | :heavy_check_mark:                                                                         | The request object to use for the request.                                                 |


### Response

**[org.openapis.openapi.models.operations.NullableObjectPostResponse](../../models/operations/NullableObjectPostResponse.md)**


## nullableRequiredEmptyObjectPost

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.NullableRequiredEmptyObjectPostRequestBody;
import org.openapis.openapi.models.operations.NullableRequiredEmptyObjectPostRequestBodyNullableOptionalObj;
import org.openapis.openapi.models.operations.NullableRequiredEmptyObjectPostRequestBodyNullableRequiredObj;
import org.openapis.openapi.models.operations.NullableRequiredEmptyObjectPostRequestBodyRequiredObj;
import org.openapis.openapi.models.operations.NullableRequiredEmptyObjectPostResponse;
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

            NullableRequiredEmptyObjectPostRequestBody req = new NullableRequiredEmptyObjectPostRequestBody(                new NullableRequiredEmptyObjectPostRequestBodyNullableRequiredObj();,                 new NullableRequiredEmptyObjectPostRequestBodyRequiredObj();) {{
                nullableOptionalObj = new NullableRequiredEmptyObjectPostRequestBodyNullableOptionalObj();;
            }};            

            NullableRequiredEmptyObjectPostResponse res = sdk.requestBodies.nullableRequiredEmptyObjectPost(req);

            if (res.nullableRequiredEmptyObjectPost200ApplicationJSONString != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                  | Type                                                                                                                                                       | Required                                                                                                                                                   | Description                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                  | [org.openapis.openapi.models.operations.NullableRequiredEmptyObjectPostRequestBody](../../models/operations/NullableRequiredEmptyObjectPostRequestBody.md) | :heavy_check_mark:                                                                                                                                         | The request object to use for the request.                                                                                                                 |


### Response

**[org.openapis.openapi.models.operations.NullableRequiredEmptyObjectPostResponse](../../models/operations/NullableRequiredEmptyObjectPostResponse.md)**


## nullableRequiredPropertyPost

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.NullableRequiredPropertyPostRequestBody;
import org.openapis.openapi.models.operations.NullableRequiredPropertyPostRequestBodyNullableRequiredEnum;
import org.openapis.openapi.models.operations.NullableRequiredPropertyPostResponse;
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

            NullableRequiredPropertyPostRequestBody req = new NullableRequiredPropertyPostRequestBody(                new Double[]{{
                                add(573.2d),
                            }}, NullableRequiredPropertyPostRequestBodyNullableRequiredEnum.SECOND, 80061L) {{
                nullableOptionalInt = 49348L;
            }};            

            NullableRequiredPropertyPostResponse res = sdk.requestBodies.nullableRequiredPropertyPost(req);

            if (res.nullableRequiredPropertyPost200ApplicationJSONString != null) {
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
| `request`                                                                                                                                            | [org.openapis.openapi.models.operations.NullableRequiredPropertyPostRequestBody](../../models/operations/NullableRequiredPropertyPostRequestBody.md) | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |


### Response

**[org.openapis.openapi.models.operations.NullableRequiredPropertyPostResponse](../../models/operations/NullableRequiredPropertyPostResponse.md)**


## nullableRequiredSharedObjectPost

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.NullableRequiredSharedObjectPostRequestBody;
import org.openapis.openapi.models.operations.NullableRequiredSharedObjectPostResponse;
import org.openapis.openapi.models.shared.NullableObject;
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

            NullableRequiredSharedObjectPostRequestBody req = new NullableRequiredSharedObjectPostRequestBody(                new NullableObject(517137L) {{
                                optional = "dolore";
                            }};) {{
                nullableOptionalObj = new NullableObject(755106L) {{
                    optional = "distinctio";
                }};;
            }};            

            NullableRequiredSharedObjectPostResponse res = sdk.requestBodies.nullableRequiredSharedObjectPost(req);

            if (res.nullableRequiredSharedObjectPost200ApplicationJSONString != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                    | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                    | [org.openapis.openapi.models.operations.NullableRequiredSharedObjectPostRequestBody](../../models/operations/NullableRequiredSharedObjectPostRequestBody.md) | :heavy_check_mark:                                                                                                                                           | The request object to use for the request.                                                                                                                   |


### Response

**[org.openapis.openapi.models.operations.NullableRequiredSharedObjectPostResponse](../../models/operations/NullableRequiredSharedObjectPostResponse.md)**


## requestBodyPostApplicationJsonArray

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayResponse;
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

            org.openapis.openapi.models.. req = new org.openapis.openapi.models.shared.SimpleObject[]{{
                add(new SimpleObject("est", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                    any = "voluptatem";
                    bigint = 418109L;
                    bigintStr = "esse";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                    decimal = 1729.51d;
                    enum_ = Enum.TWO;
                    float32 = 2.2222222f;
                    int_ = 999999L;
                    int32 = 1;
                    int32Enum = SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE;
                    intEnum = SimpleObjectIntEnum.First;
                    intOptNull = 999999L;
                    num = 1.1d;
                    numOptNull = 1.1d;
                    str = "example";
                    strOpt = "optional example";
                }}),
            }}            

            RequestBodyPostApplicationJsonArrayResponse res = sdk.requestBodies.requestBodyPostApplicationJsonArray(req);

            if (res.simpleObjects != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                              | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `request`                                                              | [org.openapis.openapi.models.shared.SimpleObject[]](../../models//.md) | :heavy_check_mark:                                                     | The request object to use for the request.                             |
| `serverURL`                                                            | *String*                                                               | :heavy_minus_sign:                                                     | An optional server URL to use.                                         |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayResponse](../../models/operations/RequestBodyPostApplicationJsonArrayResponse.md)**


## requestBodyPostApplicationJsonArrayCamelCase

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayCamelCaseResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObjectCamelCase;
import org.openapis.openapi.models.shared.SimpleObjectCamelCaseInt32EnumVal;
import org.openapis.openapi.models.shared.SimpleObjectCamelCaseIntEnumVal;

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

            org.openapis.openapi.models.. req = new org.openapis.openapi.models.shared.SimpleObjectCamelCase[]{{
                add(new SimpleObjectCamelCase("ea", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                    anyVal = "molestiae";
                    bigintStrVal = "provident";
                    bigintVal = 882284L;
                    boolOptVal = true;
                    boolVal = true;
                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    dateVal = LocalDate.parse("2020-01-01");
                    decimalVal = 8964.8d;
                    enumVal = Enum.TWO;
                    float32Val = 2.2222222f;
                    int32EnumVal = SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE;
                    int32Val = 1;
                    intEnumVal = SimpleObjectCamelCaseIntEnumVal.Second;
                    intOptNullVal = 999999L;
                    intVal = 999999L;
                    numOptNullVal = 1.1d;
                    numVal = 1.1d;
                    strOptVal = "optional example";
                    strVal = "example";
                }}),
            }}            

            RequestBodyPostApplicationJsonArrayCamelCaseResponse res = sdk.requestBodies.requestBodyPostApplicationJsonArrayCamelCase(req);

            if (res.simpleObjectCamelCases != null) {
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
| `request`                                                                       | [org.openapis.openapi.models.shared.SimpleObjectCamelCase[]](../../models//.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |
| `serverURL`                                                                     | *String*                                                                        | :heavy_minus_sign:                                                              | An optional server URL to use.                                                  |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayCamelCaseResponse](../../models/operations/RequestBodyPostApplicationJsonArrayCamelCaseResponse.md)**


## requestBodyPostApplicationJsonArrayObj

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayObjResponse;
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

            org.openapis.openapi.models.. req = new org.openapis.openapi.models.shared.SimpleObject[]{{
                add(new SimpleObject("at", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                    any = "rerum";
                    bigint = 515638L;
                    bigintStr = "corporis";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                    decimal = 8890.6d;
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
                }}),
            }}            

            RequestBodyPostApplicationJsonArrayObjResponse res = sdk.requestBodies.requestBodyPostApplicationJsonArrayObj(req);

            if (res.arrObjValue != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                              | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `request`                                                              | [org.openapis.openapi.models.shared.SimpleObject[]](../../models//.md) | :heavy_check_mark:                                                     | The request object to use for the request.                             |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayObjResponse](../../models/operations/RequestBodyPostApplicationJsonArrayObjResponse.md)**


## requestBodyPostApplicationJsonArrayObjCamelCase

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayObjCamelCaseResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObjectCamelCase;
import org.openapis.openapi.models.shared.SimpleObjectCamelCaseInt32EnumVal;
import org.openapis.openapi.models.shared.SimpleObjectCamelCaseIntEnumVal;

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

            org.openapis.openapi.models.. req = new org.openapis.openapi.models.shared.SimpleObjectCamelCase[]{{
                add(new SimpleObjectCamelCase("eos", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                    anyVal = "quidem";
                    bigintStrVal = "fuga";
                    bigintVal = 919508L;
                    boolOptVal = true;
                    boolVal = true;
                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    dateVal = LocalDate.parse("2020-01-01");
                    decimalVal = 340.7d;
                    enumVal = Enum.TWO;
                    float32Val = 2.2222222f;
                    int32EnumVal = SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE;
                    int32Val = 1;
                    intEnumVal = SimpleObjectCamelCaseIntEnumVal.Third;
                    intOptNullVal = 999999L;
                    intVal = 999999L;
                    numOptNullVal = 1.1d;
                    numVal = 1.1d;
                    strOptVal = "optional example";
                    strVal = "example";
                }}),
            }}            

            RequestBodyPostApplicationJsonArrayObjCamelCaseResponse res = sdk.requestBodies.requestBodyPostApplicationJsonArrayObjCamelCase(req);

            if (res.arrObjValueCamelCase != null) {
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
| `request`                                                                       | [org.openapis.openapi.models.shared.SimpleObjectCamelCase[]](../../models//.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayObjCamelCaseResponse](../../models/operations/RequestBodyPostApplicationJsonArrayObjCamelCaseResponse.md)**


## requestBodyPostApplicationJsonArrayOfArray

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayOfArrayResponse;
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

            org.openapis.openapi.models.. req = new org.openapis.openapi.models.shared.SimpleObject[][]{{
                add(new org.openapis.openapi.models.shared.SimpleObject[]{{
                    add(new SimpleObject("adipisci", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                        any = "praesentium";
                        bigint = 140316L;
                        bigintStr = "explicabo";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                        decimal = 3589.95d;
                        enum_ = Enum.TWO;
                        float32 = 2.2222222f;
                        int_ = 999999L;
                        int32 = 1;
                        int32Enum = SimpleObjectInt32Enum.SIXTY_NINE;
                        intEnum = SimpleObjectIntEnum.Third;
                        intOptNull = 999999L;
                        num = 1.1d;
                        numOptNull = 1.1d;
                        str = "example";
                        strOpt = "optional example";
                    }}),
                }}),
            }}            

            RequestBodyPostApplicationJsonArrayOfArrayResponse res = sdk.requestBodies.requestBodyPostApplicationJsonArrayOfArray(req);

            if (res.arrs != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `request`                                                                | [org.openapis.openapi.models.shared.SimpleObject[][]](../../models//.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |
| `serverURL`                                                              | *String*                                                                 | :heavy_minus_sign:                                                       | An optional server URL to use.                                           |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayOfArrayResponse](../../models/operations/RequestBodyPostApplicationJsonArrayOfArrayResponse.md)**


## requestBodyPostApplicationJsonArrayOfArrayCamelCase

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayOfArrayCamelCaseResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObjectCamelCase;
import org.openapis.openapi.models.shared.SimpleObjectCamelCaseInt32EnumVal;
import org.openapis.openapi.models.shared.SimpleObjectCamelCaseIntEnumVal;

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

            org.openapis.openapi.models.. req = new org.openapis.openapi.models.shared.SimpleObjectCamelCase[][]{{
                add(new org.openapis.openapi.models.shared.SimpleObjectCamelCase[]{{
                    add(new SimpleObjectCamelCase("delectus", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                        anyVal = "ut";
                        bigintStrVal = "quidem";
                        bigintVal = 339631L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 1062.55d;
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222f;
                        int32EnumVal = SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE;
                        int32Val = 1;
                        intEnumVal = SimpleObjectCamelCaseIntEnumVal.Second;
                        intOptNullVal = 999999L;
                        intVal = 999999L;
                        numOptNullVal = 1.1d;
                        numVal = 1.1d;
                        strOptVal = "optional example";
                        strVal = "example";
                    }}),
                }}),
            }}            

            RequestBodyPostApplicationJsonArrayOfArrayCamelCaseResponse res = sdk.requestBodies.requestBodyPostApplicationJsonArrayOfArrayCamelCase(req);

            if (res.arrs != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [org.openapis.openapi.models.shared.SimpleObjectCamelCase[][]](../../models//.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |
| `serverURL`                                                                       | *String*                                                                          | :heavy_minus_sign:                                                                | An optional server URL to use.                                                    |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayOfArrayCamelCaseResponse](../../models/operations/RequestBodyPostApplicationJsonArrayOfArrayCamelCaseResponse.md)**


## requestBodyPostApplicationJsonArrayOfArrayOfPrimitive

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse;
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

            org.openapis.openapi.models.. req = new String[][]{{
                add(new String[]{{
                    add("numquam"),
                }}),
            }}            

            RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse res = sdk.requestBodies.requestBodyPostApplicationJsonArrayOfArrayOfPrimitive(req);

            if (res.arrs != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String[][]](../../models//.md)            | :heavy_check_mark:                         | The request object to use for the request. |
| `serverURL`                                | *String*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse](../../models/operations/RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse.md)**


## requestBodyPostApplicationJsonArrayOfMap

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayOfMapResponse;
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

            org.openapis.openapi.models.. req = new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>[]{{
                add(new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                    put("numquam", new SimpleObject("corporis", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                        any = "nesciunt";
                        bigint = 873557L;
                        bigintStr = "officia";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                        decimal = 4918.92d;
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
                    }});
                }}),
            }}            

            RequestBodyPostApplicationJsonArrayOfMapResponse res = sdk.requestBodies.requestBodyPostApplicationJsonArrayOfMap(req);

            if (res.maps != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [java.util.Map<String, org.openapis.openapi.models.shared.SimpleObject>[]](../../models//.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |
| `serverURL`                                                                                   | *String*                                                                                      | :heavy_minus_sign:                                                                            | An optional server URL to use.                                                                |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayOfMapResponse](../../models/operations/RequestBodyPostApplicationJsonArrayOfMapResponse.md)**


## requestBodyPostApplicationJsonArrayOfMapCamelCase

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayOfMapCamelCaseResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObjectCamelCase;
import org.openapis.openapi.models.shared.SimpleObjectCamelCaseInt32EnumVal;
import org.openapis.openapi.models.shared.SimpleObjectCamelCaseIntEnumVal;

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

            org.openapis.openapi.models.. req = new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>[]{{
                add(new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>() {{
                    put("voluptatum", new SimpleObjectCamelCase("minus", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                        anyVal = "cupiditate";
                        bigintStrVal = "minima";
                        bigintVal = 809594L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 3165.42d;
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222f;
                        int32EnumVal = SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE;
                        int32Val = 1;
                        intEnumVal = SimpleObjectCamelCaseIntEnumVal.Second;
                        intOptNullVal = 999999L;
                        intVal = 999999L;
                        numOptNullVal = 1.1d;
                        numVal = 1.1d;
                        strOptVal = "optional example";
                        strVal = "example";
                    }});
                }}),
            }}            

            RequestBodyPostApplicationJsonArrayOfMapCamelCaseResponse res = sdk.requestBodies.requestBodyPostApplicationJsonArrayOfMapCamelCase(req);

            if (res.maps != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `request`                                                                                              | [java.util.Map<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>[]](../../models//.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |
| `serverURL`                                                                                            | *String*                                                                                               | :heavy_minus_sign:                                                                                     | An optional server URL to use.                                                                         |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayOfMapCamelCaseResponse](../../models/operations/RequestBodyPostApplicationJsonArrayOfMapCamelCaseResponse.md)**


## requestBodyPostApplicationJsonArrayOfPrimitive

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayOfPrimitiveResponse;
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

            org.openapis.openapi.models.. req = new String[]{{
                add("corporis"),
            }}            

            RequestBodyPostApplicationJsonArrayOfPrimitiveResponse res = sdk.requestBodies.requestBodyPostApplicationJsonArrayOfPrimitive(req);

            if (res.strings != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String[]](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |
| `serverURL`                                | *String*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayOfPrimitiveResponse](../../models/operations/RequestBodyPostApplicationJsonArrayOfPrimitiveResponse.md)**


## requestBodyPostApplicationJsonDeep

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonDeepResponse;
import org.openapis.openapi.models.shared.DeepObject;
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

            org.openapis.openapi.models.shared.DeepObject req = new DeepObject(                new SimpleObject("labore", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                                any = "voluptates";
                                bigint = 978173L;
                                bigintStr = "tempore";
                                bool = true;
                                boolOpt = true;
                                date = LocalDate.parse("2020-01-01");
                                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                                decimal = 460.13d;
                                enum_ = Enum.TWO;
                                float32 = 2.2222222f;
                                int_ = 999999L;
                                int32 = 1;
                                int32Enum = SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE;
                                intEnum = SimpleObjectIntEnum.First;
                                intOptNull = 999999L;
                                num = 1.1d;
                                numOptNull = 1.1d;
                                str = "example";
                                strOpt = "optional example";
                            }},                 new org.openapis.openapi.models.shared.SimpleObject[]{{
                                add(new SimpleObject("est", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                                    any = "voluptas";
                                    bigint = 779180L;
                                    bigintStr = "velit";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                                    decimal = 7955.91d;
                                    enum_ = Enum.TWO;
                                    float32 = 2.2222222f;
                                    int_ = 999999L;
                                    int32 = 1;
                                    int32Enum = SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE;
                                    intEnum = SimpleObjectIntEnum.Second;
                                    intOptNull = 999999L;
                                    num = 1.1d;
                                    numOptNull = 1.1d;
                                    str = "example";
                                    strOpt = "optional example";
                                }}),
                            }}, false, 735894L,                 new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                                put("vero", new SimpleObject("odio", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                                    any = "odit";
                                    bigint = 997437L;
                                    bigintStr = "pariatur";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                                    decimal = 3628.88d;
                                    enum_ = Enum.TWO;
                                    float32 = 2.2222222f;
                                    int_ = 999999L;
                                    int32 = 1;
                                    int32Enum = SimpleObjectInt32Enum.SIXTY_NINE;
                                    intEnum = SimpleObjectIntEnum.First;
                                    intOptNull = 999999L;
                                    num = 1.1d;
                                    numOptNull = 1.1d;
                                    str = "example";
                                    strOpt = "optional example";
                                }});
                            }}, 4969.15d,                 new SimpleObject("excepturi", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                                bigint = 85076L;
                                bigintStr = "ducimus";
                                boolOpt = true;
                                decimal = 4527.29d;
                                intOptNull = 999999L;
                                numOptNull = 1.1d;
                                strOpt = "optional example";
                            }};, "pariatur") {{
                type = "itaque";
            }};            

            RequestBodyPostApplicationJsonDeepResponse res = sdk.requestBodies.requestBodyPostApplicationJsonDeep(req);

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

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `request`                                                                          | [org.openapis.openapi.models.shared.DeepObject](../../models/shared/DeepObject.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonDeepResponse](../../models/operations/RequestBodyPostApplicationJsonDeepResponse.md)**


## requestBodyPostApplicationJsonDeepCamelCase

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonDeepCamelCaseResponse;
import org.openapis.openapi.models.shared.DeepObjectCamelCase;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObjectCamelCase;
import org.openapis.openapi.models.shared.SimpleObjectCamelCaseInt32EnumVal;
import org.openapis.openapi.models.shared.SimpleObjectCamelCaseIntEnumVal;

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

            org.openapis.openapi.models.shared.DeepObjectCamelCase req = new DeepObjectCamelCase("optio",                 new org.openapis.openapi.models.shared.SimpleObjectCamelCase[]{{
                                add(new SimpleObjectCamelCase("exercitationem", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                                    anyVal = "ex";
                                    bigintStrVal = "quaerat";
                                    bigintVal = 416692L;
                                    boolOptVal = true;
                                    boolVal = true;
                                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    dateVal = LocalDate.parse("2020-01-01");
                                    decimalVal = 8886.16d;
                                    enumVal = Enum.TWO;
                                    float32Val = 2.2222222f;
                                    int32EnumVal = SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE;
                                    int32Val = 1;
                                    intEnumVal = SimpleObjectCamelCaseIntEnumVal.Third;
                                    intOptNullVal = 999999L;
                                    intVal = 999999L;
                                    numOptNullVal = 1.1d;
                                    numVal = 1.1d;
                                    strOptVal = "optional example";
                                    strVal = "example";
                                }}),
                            }}, false, 264619L,                 new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>() {{
                                put("ipsa", new SimpleObjectCamelCase("earum", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                                    anyVal = "sint";
                                    bigintStrVal = "vero";
                                    bigintVal = 194901L;
                                    boolOptVal = true;
                                    boolVal = true;
                                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    dateVal = LocalDate.parse("2020-01-01");
                                    decimalVal = 9185.47d;
                                    enumVal = Enum.TWO;
                                    float32Val = 2.2222222f;
                                    int32EnumVal = SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE;
                                    int32Val = 1;
                                    intEnumVal = SimpleObjectCamelCaseIntEnumVal.First;
                                    intOptNullVal = 999999L;
                                    intVal = 999999L;
                                    numOptNullVal = 1.1d;
                                    numVal = 1.1d;
                                    strOptVal = "optional example";
                                    strVal = "example";
                                }});
                            }}, 1753.72d,                 new SimpleObjectCamelCase("nam", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                                bigintStrVal = "necessitatibus";
                                bigintVal = 748224L;
                                boolOptVal = true;
                                decimalVal = 568.77d;
                                intOptNullVal = 999999L;
                                numOptNullVal = 1.1d;
                                strOptVal = "optional example";
                            }};, "ducimus") {{
                type = "maiores";
            }};            

            RequestBodyPostApplicationJsonDeepCamelCaseResponse res = sdk.requestBodies.requestBodyPostApplicationJsonDeepCamelCase(req);

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

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `request`                                                                                            | [org.openapis.openapi.models.shared.DeepObjectCamelCase](../../models/shared/DeepObjectCamelCase.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonDeepCamelCaseResponse](../../models/operations/RequestBodyPostApplicationJsonDeepCamelCaseResponse.md)**


## requestBodyPostApplicationJsonMap

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapResponse;
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

            org.openapis.openapi.models.. req = new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                put("veritatis", new SimpleObject("nemo", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                    any = "quasi";
                    bigint = 386447L;
                    bigintStr = "pariatur";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                    decimal = 7294.48d;
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
            }}            

            RequestBodyPostApplicationJsonMapResponse res = sdk.requestBodies.requestBodyPostApplicationJsonMap(req);

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

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [java.util.Map<String, org.openapis.openapi.models.shared.SimpleObject>](../../models//.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |
| `serverURL`                                                                                 | *String*                                                                                    | :heavy_minus_sign:                                                                          | An optional server URL to use.                                                              |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapResponse](../../models/operations/RequestBodyPostApplicationJsonMapResponse.md)**


## requestBodyPostApplicationJsonMapCamelCase

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapCamelCaseResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObjectCamelCase;
import org.openapis.openapi.models.shared.SimpleObjectCamelCaseInt32EnumVal;
import org.openapis.openapi.models.shared.SimpleObjectCamelCaseIntEnumVal;

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

            org.openapis.openapi.models.. req = new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>() {{
                put("doloribus", new SimpleObjectCamelCase("totam", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                    anyVal = "eligendi";
                    bigintStrVal = "sint";
                    bigintVal = 314573L;
                    boolOptVal = true;
                    boolVal = true;
                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    dateVal = LocalDate.parse("2020-01-01");
                    decimalVal = 9449.5d;
                    enumVal = Enum.TWO;
                    float32Val = 2.2222222f;
                    int32EnumVal = SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE;
                    int32Val = 1;
                    intEnumVal = SimpleObjectCamelCaseIntEnumVal.Second;
                    intOptNullVal = 999999L;
                    intVal = 999999L;
                    numOptNullVal = 1.1d;
                    numVal = 1.1d;
                    strOptVal = "optional example";
                    strVal = "example";
                }});
            }}            

            RequestBodyPostApplicationJsonMapCamelCaseResponse res = sdk.requestBodies.requestBodyPostApplicationJsonMapCamelCase(req);

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

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `request`                                                                                            | [java.util.Map<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>](../../models//.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |
| `serverURL`                                                                                          | *String*                                                                                             | :heavy_minus_sign:                                                                                   | An optional server URL to use.                                                                       |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapCamelCaseResponse](../../models/operations/RequestBodyPostApplicationJsonMapCamelCaseResponse.md)**


## requestBodyPostApplicationJsonMapObj

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapObjResponse;
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

            org.openapis.openapi.models.. req = new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                put("eaque", new SimpleObject("libero", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                    any = "saepe";
                    bigint = 104078L;
                    bigintStr = "quos";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                    decimal = 6144.38d;
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
                }});
            }}            

            RequestBodyPostApplicationJsonMapObjResponse res = sdk.requestBodies.requestBodyPostApplicationJsonMapObj(req);

            if (res.mapObjValue != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [java.util.Map<String, org.openapis.openapi.models.shared.SimpleObject>](../../models//.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapObjResponse](../../models/operations/RequestBodyPostApplicationJsonMapObjResponse.md)**


## requestBodyPostApplicationJsonMapObjCamelCase

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapObjCamelCaseResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObjectCamelCase;
import org.openapis.openapi.models.shared.SimpleObjectCamelCaseInt32EnumVal;
import org.openapis.openapi.models.shared.SimpleObjectCamelCaseIntEnumVal;

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

            org.openapis.openapi.models.. req = new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>() {{
                put("delectus", new SimpleObjectCamelCase("doloremque", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                    anyVal = "impedit";
                    bigintStrVal = "cum";
                    bigintVal = 216870L;
                    boolOptVal = true;
                    boolVal = true;
                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    dateVal = LocalDate.parse("2020-01-01");
                    decimalVal = 2380.11d;
                    enumVal = Enum.TWO;
                    float32Val = 2.2222222f;
                    int32EnumVal = SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE;
                    int32Val = 1;
                    intEnumVal = SimpleObjectCamelCaseIntEnumVal.Second;
                    intOptNullVal = 999999L;
                    intVal = 999999L;
                    numOptNullVal = 1.1d;
                    numVal = 1.1d;
                    strOptVal = "optional example";
                    strVal = "example";
                }});
            }}            

            RequestBodyPostApplicationJsonMapObjCamelCaseResponse res = sdk.requestBodies.requestBodyPostApplicationJsonMapObjCamelCase(req);

            if (res.mapObjValueCamelCase != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `request`                                                                                            | [java.util.Map<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>](../../models//.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapObjCamelCaseResponse](../../models/operations/RequestBodyPostApplicationJsonMapObjCamelCaseResponse.md)**


## requestBodyPostApplicationJsonMapOfArray

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapOfArrayResponse;
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

            org.openapis.openapi.models.. req = new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject[]>() {{
                put("libero", new org.openapis.openapi.models.shared.SimpleObject[]{{
                    add(new SimpleObject("magnam", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                        any = "architecto";
                        bigint = 584593L;
                        bigintStr = "molestiae";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                        decimal = 7566.54d;
                        enum_ = Enum.TWO;
                        float32 = 2.2222222f;
                        int_ = 999999L;
                        int32 = 1;
                        int32Enum = SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE;
                        intEnum = SimpleObjectIntEnum.First;
                        intOptNull = 999999L;
                        num = 1.1d;
                        numOptNull = 1.1d;
                        str = "example";
                        strOpt = "optional example";
                    }}),
                }});
            }}            

            RequestBodyPostApplicationJsonMapOfArrayResponse res = sdk.requestBodies.requestBodyPostApplicationJsonMapOfArray(req);

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

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [java.util.Map<String, org.openapis.openapi.models.shared.SimpleObject[]>](../../models//.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |
| `serverURL`                                                                                   | *String*                                                                                      | :heavy_minus_sign:                                                                            | An optional server URL to use.                                                                |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapOfArrayResponse](../../models/operations/RequestBodyPostApplicationJsonMapOfArrayResponse.md)**


## requestBodyPostApplicationJsonMapOfArrayCamelCase

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapOfArrayCamelCaseResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObjectCamelCase;
import org.openapis.openapi.models.shared.SimpleObjectCamelCaseInt32EnumVal;
import org.openapis.openapi.models.shared.SimpleObjectCamelCaseIntEnumVal;

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

            org.openapis.openapi.models.. req = new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase[]>() {{
                put("asperiores", new org.openapis.openapi.models.shared.SimpleObjectCamelCase[]{{
                    add(new SimpleObjectCamelCase("amet", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                        anyVal = "veniam";
                        bigintStrVal = "consequuntur";
                        bigintVal = 813880L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 5129.05d;
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222f;
                        int32EnumVal = SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE;
                        int32Val = 1;
                        intEnumVal = SimpleObjectCamelCaseIntEnumVal.Third;
                        intOptNullVal = 999999L;
                        intVal = 999999L;
                        numOptNullVal = 1.1d;
                        numVal = 1.1d;
                        strOptVal = "optional example";
                        strVal = "example";
                    }}),
                }});
            }}            

            RequestBodyPostApplicationJsonMapOfArrayCamelCaseResponse res = sdk.requestBodies.requestBodyPostApplicationJsonMapOfArrayCamelCase(req);

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

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `request`                                                                                              | [java.util.Map<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase[]>](../../models//.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |
| `serverURL`                                                                                            | *String*                                                                                               | :heavy_minus_sign:                                                                                     | An optional server URL to use.                                                                         |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapOfArrayCamelCaseResponse](../../models/operations/RequestBodyPostApplicationJsonMapOfArrayCamelCaseResponse.md)**


## requestBodyPostApplicationJsonMapOfMap

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapOfMapResponse;
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

            org.openapis.openapi.models.. req = new java.util.HashMap<String, java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>>() {{
                put("velit", new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                    put("facilis", new SimpleObject("nisi", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                        any = "tempore";
                        bigint = 395233L;
                        bigintStr = "voluptatibus";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                        decimal = 3108.4d;
                        enum_ = Enum.TWO;
                        float32 = 2.2222222f;
                        int_ = 999999L;
                        int32 = 1;
                        int32Enum = SimpleObjectInt32Enum.SIXTY_NINE;
                        intEnum = SimpleObjectIntEnum.Third;
                        intOptNull = 999999L;
                        num = 1.1d;
                        numOptNull = 1.1d;
                        str = "example";
                        strOpt = "optional example";
                    }});
                }});
            }}            

            RequestBodyPostApplicationJsonMapOfMapResponse res = sdk.requestBodies.requestBodyPostApplicationJsonMapOfMap(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [java.util.Map<String, java.util.Map<String, org.openapis.openapi.models.shared.SimpleObject>>](../../models//.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |
| `serverURL`                                                                                                        | *String*                                                                                                           | :heavy_minus_sign:                                                                                                 | An optional server URL to use.                                                                                     |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapOfMapResponse](../../models/operations/RequestBodyPostApplicationJsonMapOfMapResponse.md)**


## requestBodyPostApplicationJsonMapOfMapCamelCase

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapOfMapCamelCaseResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObjectCamelCase;
import org.openapis.openapi.models.shared.SimpleObjectCamelCaseInt32EnumVal;
import org.openapis.openapi.models.shared.SimpleObjectCamelCaseIntEnumVal;

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

            org.openapis.openapi.models.. req = new java.util.HashMap<String, java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>>() {{
                put("libero", new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>() {{
                    put("minus", new SimpleObjectCamelCase("consequuntur", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                        anyVal = "facere";
                        bigintStrVal = "facilis";
                        bigintVal = 217663L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 3189.17d;
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222f;
                        int32EnumVal = SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE;
                        int32Val = 1;
                        intEnumVal = SimpleObjectCamelCaseIntEnumVal.Third;
                        intOptNullVal = 999999L;
                        intVal = 999999L;
                        numOptNullVal = 1.1d;
                        numVal = 1.1d;
                        strOptVal = "optional example";
                        strVal = "example";
                    }});
                }});
            }}            

            RequestBodyPostApplicationJsonMapOfMapCamelCaseResponse res = sdk.requestBodies.requestBodyPostApplicationJsonMapOfMapCamelCase(req);

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

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [java.util.Map<String, java.util.Map<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>>](../../models//.md) | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |
| `serverURL`                                                                                                                 | *String*                                                                                                                    | :heavy_minus_sign:                                                                                                          | An optional server URL to use.                                                                                              |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapOfMapCamelCaseResponse](../../models/operations/RequestBodyPostApplicationJsonMapOfMapCamelCaseResponse.md)**


## requestBodyPostApplicationJsonMapOfMapOfPrimitive

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapOfMapOfPrimitiveResponse;
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

            org.openapis.openapi.models.. req = new java.util.HashMap<String, java.util.HashMap<String, String>>() {{
                put("rerum", new java.util.HashMap<String, String>() {{
                    put("eos", "reprehenderit");
                }});
            }}            

            RequestBodyPostApplicationJsonMapOfMapOfPrimitiveResponse res = sdk.requestBodies.requestBodyPostApplicationJsonMapOfMapOfPrimitive(req);

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

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [java.util.Map<String, java.util.Map<String, String>>](../../models//.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |
| `serverURL`                                                               | *String*                                                                  | :heavy_minus_sign:                                                        | An optional server URL to use.                                            |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapOfMapOfPrimitiveResponse](../../models/operations/RequestBodyPostApplicationJsonMapOfMapOfPrimitiveResponse.md)**


## requestBodyPostApplicationJsonMapOfPrimitive

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapOfPrimitiveResponse;
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

            org.openapis.openapi.models.. req = new java.util.HashMap<String, String>() {{
                put("nostrum", "neque");
            }}            

            RequestBodyPostApplicationJsonMapOfPrimitiveResponse res = sdk.requestBodies.requestBodyPostApplicationJsonMapOfPrimitive(req);

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

| Parameter                                          | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `request`                                          | [java.util.Map<String, String>](../../models//.md) | :heavy_check_mark:                                 | The request object to use for the request.         |
| `serverURL`                                        | *String*                                           | :heavy_minus_sign:                                 | An optional server URL to use.                     |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapOfPrimitiveResponse](../../models/operations/RequestBodyPostApplicationJsonMapOfPrimitiveResponse.md)**


## requestBodyPostApplicationJsonMultipleJsonFiltered

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMultipleJsonFilteredResponse;
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

            org.openapis.openapi.models.shared.SimpleObject req = new SimpleObject("iusto", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                bigint = 753890L;
                bigintStr = "fugiat";
                boolOpt = true;
                decimal = 6040.78d;
                intOptNull = 999999L;
                numOptNull = 1.1d;
                strOpt = "optional example";
            }};            

            RequestBodyPostApplicationJsonMultipleJsonFilteredResponse res = sdk.requestBodies.requestBodyPostApplicationJsonMultipleJsonFiltered(req);

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
| `request`                                                                              | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md) | :heavy_check_mark:                                                                     | The request object to use for the request.                                             |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMultipleJsonFilteredResponse](../../models/operations/RequestBodyPostApplicationJsonMultipleJsonFilteredResponse.md)**


## requestBodyPostApplicationJsonSimple

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonSimpleResponse;
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

            org.openapis.openapi.models.shared.SimpleObject req = new SimpleObject("officiis", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                bigint = 118041L;
                bigintStr = "error";
                boolOpt = true;
                decimal = 7847.31d;
                intOptNull = 999999L;
                numOptNull = 1.1d;
                strOpt = "optional example";
            }};            

            RequestBodyPostApplicationJsonSimpleResponse res = sdk.requestBodies.requestBodyPostApplicationJsonSimple(req);

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
| `request`                                                                              | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md) | :heavy_check_mark:                                                                     | The request object to use for the request.                                             |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonSimpleResponse](../../models/operations/RequestBodyPostApplicationJsonSimpleResponse.md)**


## requestBodyPostApplicationJsonSimpleCamelCase

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonSimpleCamelCaseResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObjectCamelCase;
import org.openapis.openapi.models.shared.SimpleObjectCamelCaseInt32EnumVal;
import org.openapis.openapi.models.shared.SimpleObjectCamelCaseIntEnumVal;

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

            org.openapis.openapi.models.shared.SimpleObjectCamelCase req = new SimpleObjectCamelCase("vitae", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                bigintStrVal = "fugiat";
                bigintVal = 322333L;
                boolOptVal = true;
                decimalVal = 1348.18d;
                intOptNullVal = 999999L;
                numOptNullVal = 1.1d;
                strOptVal = "optional example";
            }};            

            RequestBodyPostApplicationJsonSimpleCamelCaseResponse res = sdk.requestBodies.requestBodyPostApplicationJsonSimpleCamelCase(req);

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

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                | [org.openapis.openapi.models.shared.SimpleObjectCamelCase](../../models/shared/SimpleObjectCamelCase.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonSimpleCamelCaseResponse](../../models/operations/RequestBodyPostApplicationJsonSimpleCamelCaseResponse.md)**


## requestBodyPostComplexNumberTypes

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostComplexNumberTypesRequest;
import org.openapis.openapi.models.operations.RequestBodyPostComplexNumberTypesResponse;
import org.openapis.openapi.models.shared.ComplexNumberTypes;
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

            RequestBodyPostComplexNumberTypesRequest req = new RequestBodyPostComplexNumberTypesRequest(                new ComplexNumberTypes(316501L, "delectus", 4825.84d, "dignissimos");, 729828L, "illo", 691.82d, "incidunt", 879174L, "saepe", 7348.14d, "veniam");            

            RequestBodyPostComplexNumberTypesResponse res = sdk.requestBodies.requestBodyPostComplexNumberTypes(req);

            if (res.requestBodyPostComplexNumberTypes200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                              | [org.openapis.openapi.models.operations.RequestBodyPostComplexNumberTypesRequest](../../models/operations/RequestBodyPostComplexNumberTypesRequest.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostComplexNumberTypesResponse](../../models/operations/RequestBodyPostComplexNumberTypesResponse.md)**


## requestBodyPostDefaultsAndConsts

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostDefaultsAndConstsResponse;
import org.openapis.openapi.models.shared.DefaultsAndConsts;
import org.openapis.openapi.models.shared.DefaultsAndConstsConstEnumInt;
import org.openapis.openapi.models.shared.DefaultsAndConstsConstEnumStr;
import org.openapis.openapi.models.shared.DefaultsAndConstsDefaultEnumInt;
import org.openapis.openapi.models.shared.DefaultsAndConstsDefaultEnumStr;
import org.openapis.openapi.models.shared.DefaultsAndConstsSingleEnumConstStr;
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

            org.openapis.openapi.models.shared.DefaultsAndConsts req = new DefaultsAndConsts(176499L, "reiciendis", false, LocalDate.parse("2021-09-01"), OffsetDateTime.parse("2022-04-08T01:20:58.799Z"), 9998.09d, "quisquam", DefaultsAndConstsConstEnumInt.ONE, DefaultsAndConstsConstEnumStr.TWO, 534908L, 755.66d, "labore", "assumenda", "aliquam", false, DefaultsAndConstsSingleEnumConstStr.ONE) {{
                defaultBigInt = 790463L;
                defaultBigIntStr = "provident";
                defaultBool = false;
                defaultDate = LocalDate.parse("2021-02-27");
                defaultDateTime = OffsetDateTime.parse("2022-03-13T01:53:18.865Z");
                defaultDecimal = 1363.57d;
                defaultDecimalStr = "nam";
                defaultEnumInt = DefaultsAndConstsDefaultEnumInt.THREE;
                defaultEnumStr = DefaultsAndConstsDefaultEnumStr.TWO;
                defaultInt = 590858L;
                defaultNum = 9222.99d;
                defaultStr = "rerum";
                defaultStrNullable = "dignissimos";
                defaultStrOptional = "corporis";
            }};            

            RequestBodyPostDefaultsAndConstsResponse res = sdk.requestBodies.requestBodyPostDefaultsAndConsts(req);

            if (res.requestBodyPostDefaultsAndConsts200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `request`                                                                                        | [org.openapis.openapi.models.shared.DefaultsAndConsts](../../models/shared/DefaultsAndConsts.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostDefaultsAndConstsResponse](../../models/operations/RequestBodyPostDefaultsAndConstsResponse.md)**


## requestBodyPostEmptyObject

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostEmptyObjectRequestBody;
import org.openapis.openapi.models.operations.RequestBodyPostEmptyObjectRequestBodyEmpty;
import org.openapis.openapi.models.operations.RequestBodyPostEmptyObjectRequestBodyEmptyWithEmptyProperties;
import org.openapis.openapi.models.operations.RequestBodyPostEmptyObjectResponse;
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

            RequestBodyPostEmptyObjectRequestBody req = new RequestBodyPostEmptyObjectRequestBody() {{
                empty = new RequestBodyPostEmptyObjectRequestBodyEmpty();;
                emptyWithEmptyProperties = new RequestBodyPostEmptyObjectRequestBodyEmptyWithEmptyProperties();;
            }};            

            RequestBodyPostEmptyObjectResponse res = sdk.requestBodies.requestBodyPostEmptyObject(req);

            if (res.requestBodyPostEmptyObject200ApplicationJSONObject != null) {
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
| `request`                                                                                                                                        | [org.openapis.openapi.models.operations.RequestBodyPostEmptyObjectRequestBody](../../models/operations/RequestBodyPostEmptyObjectRequestBody.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostEmptyObjectResponse](../../models/operations/RequestBodyPostEmptyObjectResponse.md)**


## requestBodyPostFormDeep

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostFormDeepResponse;
import org.openapis.openapi.models.shared.DeepObject;
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

            org.openapis.openapi.models.shared.DeepObject req = new DeepObject("similique",                 new org.openapis.openapi.models.shared.SimpleObject[]{{
                                add(new SimpleObject("aut", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                                    any = "repellendus";
                                    bigint = 434827L;
                                    bigintStr = "dolorem";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                                    decimal = 4138.01d;
                                    enum_ = Enum.TWO;
                                    float32 = 2.2222222f;
                                    int_ = 999999L;
                                    int32 = 1;
                                    int32Enum = SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE;
                                    intEnum = SimpleObjectIntEnum.Second;
                                    intOptNull = 999999L;
                                    num = 1.1d;
                                    numOptNull = 1.1d;
                                    str = "example";
                                    strOpt = "optional example";
                                }}),
                            }}, false, 60995L,                 new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                                put("amet", new SimpleObject("dicta", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                                    any = "illum";
                                    bigint = 506863L;
                                    bigintStr = "quidem";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                                    decimal = 7368.53d;
                                    enum_ = Enum.TWO;
                                    float32 = 2.2222222f;
                                    int_ = 999999L;
                                    int32 = 1;
                                    int32Enum = SimpleObjectInt32Enum.FIFTY_FIVE;
                                    intEnum = SimpleObjectIntEnum.First;
                                    intOptNull = 999999L;
                                    num = 1.1d;
                                    numOptNull = 1.1d;
                                    str = "example";
                                    strOpt = "optional example";
                                }});
                            }}, 9384.12d,                 new SimpleObject("iusto", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                                bigint = 677141L;
                                bigintStr = "necessitatibus";
                                boolOpt = true;
                                decimal = 5928.8d;
                                intOptNull = 999999L;
                                numOptNull = 1.1d;
                                strOpt = "optional example";
                            }};, "repudiandae") {{
                type = "consequatur";
            }};            

            RequestBodyPostFormDeepResponse res = sdk.requestBodies.requestBodyPostFormDeep(req);

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

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `request`                                                                          | [org.openapis.openapi.models.shared.DeepObject](../../models/shared/DeepObject.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostFormDeepResponse](../../models/operations/RequestBodyPostFormDeepResponse.md)**


## requestBodyPostFormMapPrimitive

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostFormMapPrimitiveResponse;
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

            org.openapis.openapi.models.. req = new java.util.HashMap<String, String>() {{
                put("nemo", "molestiae");
            }}            

            RequestBodyPostFormMapPrimitiveResponse res = sdk.requestBodies.requestBodyPostFormMapPrimitive(req);

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

| Parameter                                          | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `request`                                          | [java.util.Map<String, String>](../../models//.md) | :heavy_check_mark:                                 | The request object to use for the request.         |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostFormMapPrimitiveResponse](../../models/operations/RequestBodyPostFormMapPrimitiveResponse.md)**


## requestBodyPostFormSimple

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostFormSimpleResponse;
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

            org.openapis.openapi.models.shared.SimpleObject req = new SimpleObject("itaque", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                bigint = 43975L;
                bigintStr = "sint";
                boolOpt = true;
                decimal = 8795.22d;
                intOptNull = 999999L;
                numOptNull = 1.1d;
                strOpt = "optional example";
            }};            

            RequestBodyPostFormSimpleResponse res = sdk.requestBodies.requestBodyPostFormSimple(req);

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
| `request`                                                                              | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md) | :heavy_check_mark:                                                                     | The request object to use for the request.                                             |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostFormSimpleResponse](../../models/operations/RequestBodyPostFormSimpleResponse.md)**


## requestBodyPostJsonDataTypesArrayBigInt

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesArrayBigIntResponse;
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

            org.openapis.openapi.models.. req = new Long[]{{
                add(178635L),
            }}            

            RequestBodyPostJsonDataTypesArrayBigIntResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesArrayBigInt(req);

            if (res.requestBodyPostJSONDataTypesArrayBigInt200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Long[]](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesArrayBigIntResponse](../../models/operations/RequestBodyPostJsonDataTypesArrayBigIntResponse.md)**


## requestBodyPostJsonDataTypesArrayDate

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesArrayDateResponse;
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

            org.openapis.openapi.models.. req = new LocalDate[]{{
                add(LocalDate.parse("2022-10-08")),
            }}            

            RequestBodyPostJsonDataTypesArrayDateResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesArrayDate(req);

            if (res.requestBodyPostJSONDataTypesArrayDate200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [LocalDate[]](../../models//.md)           | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesArrayDateResponse](../../models/operations/RequestBodyPostJsonDataTypesArrayDateResponse.md)**


## requestBodyPostJsonDataTypesArrayDecimalStr

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesArrayDecimalStrResponse;
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

            org.openapis.openapi.models.. req = new String[]{{
                add("voluptatem"),
            }}            

            RequestBodyPostJsonDataTypesArrayDecimalStrResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesArrayDecimalStr(req);

            if (res.requestBodyPostJSONDataTypesArrayDecimalStr200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String[]](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesArrayDecimalStrResponse](../../models/operations/RequestBodyPostJsonDataTypesArrayDecimalStrResponse.md)**


## requestBodyPostJsonDataTypesBigInt

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesBigIntResponse;
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

            org.openapis.openapi.models.. req = 244376L            

            RequestBodyPostJsonDataTypesBigIntResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesBigInt(req);

            if (res.requestBodyPostJSONDataTypesBigInt200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Long](../../models//.md)                  | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesBigIntResponse](../../models/operations/RequestBodyPostJsonDataTypesBigIntResponse.md)**


## requestBodyPostJsonDataTypesBigIntStr

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesBigIntStrResponse;
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

            org.openapis.openapi.models.. req = "dolor"            

            RequestBodyPostJsonDataTypesBigIntStrResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesBigIntStr(req);

            if (res.requestBodyPostJSONDataTypesBigIntStr200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesBigIntStrResponse](../../models/operations/RequestBodyPostJsonDataTypesBigIntStrResponse.md)**


## requestBodyPostJsonDataTypesBoolean

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesBooleanResponse;
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

            org.openapis.openapi.models.. req = false            

            RequestBodyPostJsonDataTypesBooleanResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesBoolean(req);

            if (res.requestBodyPostJSONDataTypesBoolean200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Boolean](../../models//.md)               | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesBooleanResponse](../../models/operations/RequestBodyPostJsonDataTypesBooleanResponse.md)**


## requestBodyPostJsonDataTypesDate

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesDateResponse;
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

            org.openapis.openapi.models.. req = LocalDate.parse("2022-01-17")            

            RequestBodyPostJsonDataTypesDateResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesDate(req);

            if (res.requestBodyPostJSONDataTypesDate200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [LocalDate](../../models//.md)             | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesDateResponse](../../models/operations/RequestBodyPostJsonDataTypesDateResponse.md)**


## requestBodyPostJsonDataTypesDateTime

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesDateTimeResponse;
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

            org.openapis.openapi.models.. req = OffsetDateTime.parse("2022-06-02T10:52:44.468Z")            

            RequestBodyPostJsonDataTypesDateTimeResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesDateTime(req);

            if (res.requestBodyPostJSONDataTypesDateTime200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [OffsetDateTime](../../models//.md)        | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesDateTimeResponse](../../models/operations/RequestBodyPostJsonDataTypesDateTimeResponse.md)**


## requestBodyPostJsonDataTypesDecimal

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesDecimalResponse;
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

            org.openapis.openapi.models.. req = 5398.13d            

            RequestBodyPostJsonDataTypesDecimalResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesDecimal(req);

            if (res.requestBodyPostJSONDataTypesDecimal200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Double](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesDecimalResponse](../../models/operations/RequestBodyPostJsonDataTypesDecimalResponse.md)**


## requestBodyPostJsonDataTypesDecimalStr

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesDecimalStrResponse;
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

            org.openapis.openapi.models.. req = "beatae"            

            RequestBodyPostJsonDataTypesDecimalStrResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesDecimalStr(req);

            if (res.requestBodyPostJSONDataTypesDecimalStr200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesDecimalStrResponse](../../models/operations/RequestBodyPostJsonDataTypesDecimalStrResponse.md)**


## requestBodyPostJsonDataTypesFloat32

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesFloat32Response;
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

            org.openapis.openapi.models.. req = 8682.55d            

            RequestBodyPostJsonDataTypesFloat32Response res = sdk.requestBodies.requestBodyPostJsonDataTypesFloat32(req);

            if (res.requestBodyPostJSONDataTypesFloat32200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Double](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesFloat32Response](../../models/operations/RequestBodyPostJsonDataTypesFloat32Response.md)**


## requestBodyPostJsonDataTypesInt32

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesInt32Response;
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

            org.openapis.openapi.models.. req = 287544            

            RequestBodyPostJsonDataTypesInt32Response res = sdk.requestBodies.requestBodyPostJsonDataTypesInt32(req);

            if (res.requestBodyPostJSONDataTypesInt32200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Integer](../../models//.md)               | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesInt32Response](../../models/operations/RequestBodyPostJsonDataTypesInt32Response.md)**


## requestBodyPostJsonDataTypesInteger

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesIntegerResponse;
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

            org.openapis.openapi.models.. req = 794988L            

            RequestBodyPostJsonDataTypesIntegerResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesInteger(req);

            if (res.requestBodyPostJSONDataTypesInteger200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Long](../../models//.md)                  | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesIntegerResponse](../../models/operations/RequestBodyPostJsonDataTypesIntegerResponse.md)**


## requestBodyPostJsonDataTypesMapBigIntStr

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesMapBigIntStrResponse;
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

            org.openapis.openapi.models.. req = new java.util.HashMap<String, String>() {{
                put("esse", "voluptatem");
            }}            

            RequestBodyPostJsonDataTypesMapBigIntStrResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesMapBigIntStr(req);

            if (res.requestBodyPostJSONDataTypesMapBigIntStr200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                          | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `request`                                          | [java.util.Map<String, String>](../../models//.md) | :heavy_check_mark:                                 | The request object to use for the request.         |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesMapBigIntStrResponse](../../models/operations/RequestBodyPostJsonDataTypesMapBigIntStrResponse.md)**


## requestBodyPostJsonDataTypesMapDateTime

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesMapDateTimeResponse;
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

            org.openapis.openapi.models.. req = new java.util.HashMap<String, OffsetDateTime>() {{
                put("perferendis", OffsetDateTime.parse("2022-03-06T12:29:45.421Z"));
            }}            

            RequestBodyPostJsonDataTypesMapDateTimeResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesMapDateTime(req);

            if (res.requestBodyPostJSONDataTypesMapDateTime200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `request`                                                  | [java.util.Map<String, OffsetDateTime>](../../models//.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesMapDateTimeResponse](../../models/operations/RequestBodyPostJsonDataTypesMapDateTimeResponse.md)**


## requestBodyPostJsonDataTypesMapDecimal

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesMapDecimalResponse;
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

            org.openapis.openapi.models.. req = new java.util.HashMap<String, Double>() {{
                put("aperiam", 4894.59d);
            }}            

            RequestBodyPostJsonDataTypesMapDecimalResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesMapDecimal(req);

            if (res.requestBodyPostJSONDataTypesMapDecimal200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                          | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `request`                                          | [java.util.Map<String, Double>](../../models//.md) | :heavy_check_mark:                                 | The request object to use for the request.         |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesMapDecimalResponse](../../models/operations/RequestBodyPostJsonDataTypesMapDecimalResponse.md)**


## requestBodyPostJsonDataTypesNumber

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesNumberResponse;
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

            org.openapis.openapi.models.. req = 9980.26d            

            RequestBodyPostJsonDataTypesNumberResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesNumber(req);

            if (res.requestBodyPostJSONDataTypesNumber200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Double](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesNumberResponse](../../models/operations/RequestBodyPostJsonDataTypesNumberResponse.md)**


## requestBodyPostJsonDataTypesString

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesStringResponse;
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

            org.openapis.openapi.models.. req = "velit"            

            RequestBodyPostJsonDataTypesStringResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesString(req);

            if (res.requestBodyPostJSONDataTypesString200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesStringResponse](../../models/operations/RequestBodyPostJsonDataTypesStringResponse.md)**


## requestBodyPostMultipleContentTypesComponentFiltered

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesComponentFilteredResponse;
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

            org.openapis.openapi.models.shared.SimpleObject req = new SimpleObject("porro", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                bigint = 753240L;
                bigintStr = "dignissimos";
                boolOpt = true;
                decimal = 2358.34d;
                intOptNull = 999999L;
                numOptNull = 1.1d;
                strOpt = "optional example";
            }};            

            RequestBodyPostMultipleContentTypesComponentFilteredResponse res = sdk.requestBodies.requestBodyPostMultipleContentTypesComponentFiltered(req);

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
| `request`                                                                              | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md) | :heavy_check_mark:                                                                     | The request object to use for the request.                                             |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesComponentFilteredResponse](../../models/operations/RequestBodyPostMultipleContentTypesComponentFilteredResponse.md)**


## requestBodyPostMultipleContentTypesInlineFiltered

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesInlineFilteredResponse;
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

            RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON req = new RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON(false, 7441.01d, "natus");            

            RequestBodyPostMultipleContentTypesInlineFilteredResponse res = sdk.requestBodies.requestBodyPostMultipleContentTypesInlineFiltered(req);

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

| Parameter                                                                                                                                                                                              | Type                                                                                                                                                                                                   | Required                                                                                                                                                                                               | Description                                                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                                              | [org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON](../../models/operations/RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON.md) | :heavy_check_mark:                                                                                                                                                                                     | The request object to use for the request.                                                                                                                                                             |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesInlineFilteredResponse](../../models/operations/RequestBodyPostMultipleContentTypesInlineFilteredResponse.md)**


## requestBodyPostMultipleContentTypesSplitParamForm

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamFormRequest;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamFormResponse;
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

            RequestBodyPostMultipleContentTypesSplitParamFormResponse res = sdk.requestBodies.requestBodyPostMultipleContentTypesSplitParamForm(new RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded(false, 2288.57d, "tenetur") {{
                bool3 = false;
                num3 = 8398.07d;
                str3 = "officia";
            }}, "aspernatur");

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

| Parameter                                                                                                                                                                                                                  | Type                                                                                                                                                                                                                       | Required                                                                                                                                                                                                                   | Description                                                                                                                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                                                                                                                              | [org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded](../../models/operations/RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded.md) | :heavy_check_mark:                                                                                                                                                                                                         | N/A                                                                                                                                                                                                                        |
| `paramStr`                                                                                                                                                                                                                 | *String*                                                                                                                                                                                                                   | :heavy_check_mark:                                                                                                                                                                                                         | N/A                                                                                                                                                                                                                        |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamFormResponse](../../models/operations/RequestBodyPostMultipleContentTypesSplitParamFormResponse.md)**


## requestBodyPostMultipleContentTypesSplitParamJson

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamApplicationJSON;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamJsonRequest;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamJsonResponse;
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

            RequestBodyPostMultipleContentTypesSplitParamJsonResponse res = sdk.requestBodies.requestBodyPostMultipleContentTypesSplitParamJson(new RequestBodyPostMultipleContentTypesSplitParamApplicationJSON(false, 8483.46d, "laborum") {{
                bool = false;
                num = 7782.76d;
                str = "itaque";
            }}, "dignissimos");

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

| Parameter                                                                                                                                                                                      | Type                                                                                                                                                                                           | Required                                                                                                                                                                                       | Description                                                                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                                                                                                  | [org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamApplicationJSON](../../models/operations/RequestBodyPostMultipleContentTypesSplitParamApplicationJSON.md) | :heavy_check_mark:                                                                                                                                                                             | N/A                                                                                                                                                                                            |
| `paramStr`                                                                                                                                                                                     | *String*                                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                                             | N/A                                                                                                                                                                                            |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamJsonResponse](../../models/operations/RequestBodyPostMultipleContentTypesSplitParamJsonResponse.md)**


## requestBodyPostMultipleContentTypesSplitParamMultipart

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamMultipartFormData;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamMultipartRequest;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamMultipartResponse;
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

            RequestBodyPostMultipleContentTypesSplitParamMultipartResponse res = sdk.requestBodies.requestBodyPostMultipleContentTypesSplitParamMultipart(new RequestBodyPostMultipleContentTypesSplitParamMultipartFormData(false, 2323.83d, "repellat") {{
                bool2 = false;
                num2 = 8762.85d;
                str2 = "qui";
            }}, "explicabo");

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

| Parameter                                                                                                                                                                                          | Type                                                                                                                                                                                               | Required                                                                                                                                                                                           | Description                                                                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                                                                                                      | [org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamMultipartFormData](../../models/operations/RequestBodyPostMultipleContentTypesSplitParamMultipartFormData.md) | :heavy_check_mark:                                                                                                                                                                                 | N/A                                                                                                                                                                                                |
| `paramStr`                                                                                                                                                                                         | *String*                                                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                                                 | N/A                                                                                                                                                                                                |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamMultipartResponse](../../models/operations/RequestBodyPostMultipleContentTypesSplitParamMultipartResponse.md)**


## requestBodyPostMultipleContentTypesSplitForm

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitFormResponse;
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

            RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded req = new RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded(false, 1293.55d, "exercitationem");            

            RequestBodyPostMultipleContentTypesSplitFormResponse res = sdk.requestBodies.requestBodyPostMultipleContentTypesSplitForm(req);

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

| Parameter                                                                                                                                                                                                        | Type                                                                                                                                                                                                             | Required                                                                                                                                                                                                         | Description                                                                                                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                                                        | [org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded](../../models/operations/RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded.md) | :heavy_check_mark:                                                                                                                                                                                               | The request object to use for the request.                                                                                                                                                                       |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitFormResponse](../../models/operations/RequestBodyPostMultipleContentTypesSplitFormResponse.md)**


## requestBodyPostMultipleContentTypesSplitJson

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitApplicationJSON;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitJsonResponse;
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

            RequestBodyPostMultipleContentTypesSplitApplicationJSON req = new RequestBodyPostMultipleContentTypesSplitApplicationJSON(false, 4714.57d, "non");            

            RequestBodyPostMultipleContentTypesSplitJsonResponse res = sdk.requestBodies.requestBodyPostMultipleContentTypesSplitJson(req);

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

| Parameter                                                                                                                                                                            | Type                                                                                                                                                                                 | Required                                                                                                                                                                             | Description                                                                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                            | [org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitApplicationJSON](../../models/operations/RequestBodyPostMultipleContentTypesSplitApplicationJSON.md) | :heavy_check_mark:                                                                                                                                                                   | The request object to use for the request.                                                                                                                                           |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitJsonResponse](../../models/operations/RequestBodyPostMultipleContentTypesSplitJsonResponse.md)**


## requestBodyPostMultipleContentTypesSplitMultipart

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitMultipartFormData;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitMultipartResponse;
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

            RequestBodyPostMultipleContentTypesSplitMultipartFormData req = new RequestBodyPostMultipleContentTypesSplitMultipartFormData(false, 680.93d, "illo");            

            RequestBodyPostMultipleContentTypesSplitMultipartResponse res = sdk.requestBodies.requestBodyPostMultipleContentTypesSplitMultipart(req);

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

| Parameter                                                                                                                                                                                | Type                                                                                                                                                                                     | Required                                                                                                                                                                                 | Description                                                                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                                | [org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitMultipartFormData](../../models/operations/RequestBodyPostMultipleContentTypesSplitMultipartFormData.md) | :heavy_check_mark:                                                                                                                                                                       | The request object to use for the request.                                                                                                                                               |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitMultipartResponse](../../models/operations/RequestBodyPostMultipleContentTypesSplitMultipartResponse.md)**


## requestBodyPostNotNullableNotRequiredStringBody

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostNotNullableNotRequiredStringBodyResponse;
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

            org.openapis.openapi.models.. req = "hic"            

            RequestBodyPostNotNullableNotRequiredStringBodyResponse res = sdk.requestBodies.requestBodyPostNotNullableNotRequiredStringBody(req);

            if (res.requestBodyPostNotNullableNotRequiredStringBody200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostNotNullableNotRequiredStringBodyResponse](../../models/operations/RequestBodyPostNotNullableNotRequiredStringBodyResponse.md)**


## requestBodyPostNullArray

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostNullArrayResponse;
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

            org.openapis.openapi.models.. req = new String[]{{
                add("deserunt"),
            }}            

            RequestBodyPostNullArrayResponse res = sdk.requestBodies.requestBodyPostNullArray(req);

            if (res.requestBodyPostNullArray200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String[]](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostNullArrayResponse](../../models/operations/RequestBodyPostNullArrayResponse.md)**


## requestBodyPostNullDictionary

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostNullDictionaryResponse;
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

            org.openapis.openapi.models.. req = new java.util.HashMap<String, String>() {{
                put("delectus", "non");
            }}            

            RequestBodyPostNullDictionaryResponse res = sdk.requestBodies.requestBodyPostNullDictionary(req);

            if (res.requestBodyPostNullDictionary200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                          | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `request`                                          | [java.util.Map<String, String>](../../models//.md) | :heavy_check_mark:                                 | The request object to use for the request.         |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostNullDictionaryResponse](../../models/operations/RequestBodyPostNullDictionaryResponse.md)**


## requestBodyPostNullableNotRequiredStringBody

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostNullableNotRequiredStringBodyResponse;
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

            org.openapis.openapi.models.. req = "distinctio"            

            RequestBodyPostNullableNotRequiredStringBodyResponse res = sdk.requestBodies.requestBodyPostNullableNotRequiredStringBody(req);

            if (res.requestBodyPostNullableNotRequiredStringBody200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostNullableNotRequiredStringBodyResponse](../../models/operations/RequestBodyPostNullableNotRequiredStringBodyResponse.md)**


## requestBodyPostNullableRequiredStringBody

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostNullableRequiredStringBodyResponse;
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

            org.openapis.openapi.models.. req = "in"            

            RequestBodyPostNullableRequiredStringBodyResponse res = sdk.requestBodies.requestBodyPostNullableRequiredStringBody(req);

            if (res.requestBodyPostNullableRequiredStringBody200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPostNullableRequiredStringBodyResponse](../../models/operations/RequestBodyPostNullableRequiredStringBodyResponse.md)**


## requestBodyPutBytes

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPutBytesResponse;
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

            org.openapis.openapi.models.. req = "exercitationem".getBytes()            

            RequestBodyPutBytesResponse res = sdk.requestBodies.requestBodyPutBytes(req);

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

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [byte[]](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPutBytesResponse](../../models/operations/RequestBodyPutBytesResponse.md)**


## requestBodyPutBytesWithParams

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPutBytesWithParamsRequest;
import org.openapis.openapi.models.operations.RequestBodyPutBytesWithParamsResponse;
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

            RequestBodyPutBytesWithParamsResponse res = sdk.requestBodies.requestBodyPutBytesWithParams("labore".getBytes(), "numquam");

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

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `requestBody`      | *byte[]*           | :heavy_check_mark: | N/A                |
| `queryStringParam` | *String*           | :heavy_check_mark: | N/A                |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPutBytesWithParamsResponse](../../models/operations/RequestBodyPutBytesWithParamsResponse.md)**


## requestBodyPutMultipartDeep

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPutMultipartDeepResponse;
import org.openapis.openapi.models.shared.DeepObject;
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

            org.openapis.openapi.models.shared.DeepObject req = new DeepObject("modi",                 new org.openapis.openapi.models.shared.SimpleObject[]{{
                                add(new SimpleObject("deleniti", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                                    any = "in";
                                    bigint = 127294L;
                                    bigintStr = "accusamus";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                                    decimal = 5258.09d;
                                    enum_ = Enum.TWO;
                                    float32 = 2.2222222f;
                                    int_ = 999999L;
                                    int32 = 1;
                                    int32Enum = SimpleObjectInt32Enum.FIFTY_FIVE;
                                    intEnum = SimpleObjectIntEnum.First;
                                    intOptNull = 999999L;
                                    num = 1.1d;
                                    numOptNull = 1.1d;
                                    str = "example";
                                    strOpt = "optional example";
                                }}),
                            }}, false, 626707L,                 new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                                put("minima", new SimpleObject("mollitia", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                                    any = "libero";
                                    bigint = 300189L;
                                    bigintStr = "sit";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                                    decimal = 2667.88d;
                                    enum_ = Enum.TWO;
                                    float32 = 2.2222222f;
                                    int_ = 999999L;
                                    int32 = 1;
                                    int32Enum = SimpleObjectInt32Enum.SIXTY_NINE;
                                    intEnum = SimpleObjectIntEnum.First;
                                    intOptNull = 999999L;
                                    num = 1.1d;
                                    numOptNull = 1.1d;
                                    str = "example";
                                    strOpt = "optional example";
                                }});
                            }}, 3451.38d,                 new SimpleObject("molestiae", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                                bigint = 66207L;
                                bigintStr = "modi";
                                boolOpt = true;
                                decimal = 138.65d;
                                intOptNull = 999999L;
                                numOptNull = 1.1d;
                                strOpt = "optional example";
                            }};, "aut") {{
                type = "eveniet";
            }};            

            RequestBodyPutMultipartDeepResponse res = sdk.requestBodies.requestBodyPutMultipartDeep(req);

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

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `request`                                                                          | [org.openapis.openapi.models.shared.DeepObject](../../models/shared/DeepObject.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPutMultipartDeepResponse](../../models/operations/RequestBodyPutMultipartDeepResponse.md)**


## requestBodyPutMultipartFile

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPutMultipartFileRequestBody;
import org.openapis.openapi.models.operations.RequestBodyPutMultipartFileRequestBodyFile;
import org.openapis.openapi.models.operations.RequestBodyPutMultipartFileResponse;
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

            RequestBodyPutMultipartFileRequestBody req = new RequestBodyPutMultipartFileRequestBody() {{
                file = new RequestBodyPutMultipartFileRequestBodyFile("odio".getBytes(), "commodi");;
            }};            

            RequestBodyPutMultipartFileResponse res = sdk.requestBodies.requestBodyPutMultipartFile(req);

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

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [org.openapis.openapi.models.operations.RequestBodyPutMultipartFileRequestBody](../../models/operations/RequestBodyPutMultipartFileRequestBody.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPutMultipartFileResponse](../../models/operations/RequestBodyPutMultipartFileResponse.md)**


## requestBodyPutMultipartSimple

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPutMultipartSimpleResponse;
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

            org.openapis.openapi.models.shared.SimpleObject req = new SimpleObject("numquam", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                bigint = 452399L;
                bigintStr = "consectetur";
                boolOpt = true;
                decimal = 2006.37d;
                intOptNull = 999999L;
                numOptNull = 1.1d;
                strOpt = "optional example";
            }};            

            RequestBodyPutMultipartSimpleResponse res = sdk.requestBodies.requestBodyPutMultipartSimple(req);

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
| `request`                                                                              | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md) | :heavy_check_mark:                                                                     | The request object to use for the request.                                             |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPutMultipartSimpleResponse](../../models/operations/RequestBodyPutMultipartSimpleResponse.md)**


## requestBodyPutString

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPutStringResponse;
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

            org.openapis.openapi.models.. req = "quaerat"            

            RequestBodyPutStringResponse res = sdk.requestBodies.requestBodyPutString(req);

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

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPutStringResponse](../../models/operations/RequestBodyPutStringResponse.md)**


## requestBodyPutStringWithParams

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPutStringWithParamsRequest;
import org.openapis.openapi.models.operations.RequestBodyPutStringWithParamsResponse;
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

            RequestBodyPutStringWithParamsResponse res = sdk.requestBodies.requestBodyPutStringWithParams("itaque", "minus");

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

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `requestBody`      | *String*           | :heavy_check_mark: | N/A                |
| `queryStringParam` | *String*           | :heavy_check_mark: | N/A                |


### Response

**[org.openapis.openapi.models.operations.RequestBodyPutStringWithParamsResponse](../../models/operations/RequestBodyPutStringWithParamsResponse.md)**


## requestBodyReadAndWrite

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyReadAndWriteResponse;
import org.openapis.openapi.models.shared.ReadWriteObjectInput;
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

            org.openapis.openapi.models.shared.ReadWriteObjectInput req = new ReadWriteObjectInput(122662L, 715143L, 481375L);            

            RequestBodyReadAndWriteResponse res = sdk.requestBodies.requestBodyReadAndWrite(req);

            if (res.readWriteObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `request`                                                                                              | [org.openapis.openapi.models.shared.ReadWriteObjectInput](../../models/shared/ReadWriteObjectInput.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |
| `serverURL`                                                                                            | *String*                                                                                               | :heavy_minus_sign:                                                                                     | An optional server URL to use.                                                                         |


### Response

**[org.openapis.openapi.models.operations.RequestBodyReadAndWriteResponse](../../models/operations/RequestBodyReadAndWriteResponse.md)**


## requestBodyReadOnlyInput

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyReadOnlyInputResponse;
import org.openapis.openapi.models.shared.ReadOnlyObjectInput;
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

            org.openapis.openapi.models.shared.ReadOnlyObjectInput req = new ReadOnlyObjectInput();            

            RequestBodyReadOnlyInputResponse res = sdk.requestBodies.requestBodyReadOnlyInput(req);

            if (res.readOnlyObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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

**[org.openapis.openapi.models.operations.RequestBodyReadOnlyInputResponse](../../models/operations/RequestBodyReadOnlyInputResponse.md)**


## requestBodyReadOnlyUnion

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyReadOnlyUnionResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.ReadOnlyObjectInput;
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

            org.openapis.openapi.models..Input req = new ReadOnlyObjectInput() {{}}            

            RequestBodyReadOnlyUnionResponse res = sdk.requestBodies.requestBodyReadOnlyUnion(req);

            if (res.weaklyTypedOneOfReadOnlyObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Object](../../models//Input.md)           | :heavy_check_mark:                         | The request object to use for the request. |
| `serverURL`                                | *String*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[org.openapis.openapi.models.operations.RequestBodyReadOnlyUnionResponse](../../models/operations/RequestBodyReadOnlyUnionResponse.md)**


## requestBodyReadWriteOnlyUnion

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyReadWriteOnlyUnionResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.ReadWriteObjectInput;
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

            org.openapis.openapi.models..Input req = new SimpleObject("aut", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                any = "facilis";
                bigint = 229276L;
                bigintStr = "autem";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                decimal = 6854.15d;
                enum_ = Enum.TWO;
                float32 = 2.2222222f;
                int_ = 999999L;
                int32 = 1;
                int32Enum = SimpleObjectInt32Enum.FIFTY_FIVE;
                intEnum = SimpleObjectIntEnum.Second;
                intOptNull = 999999L;
                num = 1.1d;
                numOptNull = 1.1d;
                str = "example";
                strOpt = "optional example";
            }}            

            RequestBodyReadWriteOnlyUnionResponse res = sdk.requestBodies.requestBodyReadWriteOnlyUnion(req);

            if (res.weaklyTypedOneOfReadWriteObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Object](../../models//Input.md)           | :heavy_check_mark:                         | The request object to use for the request. |
| `serverURL`                                | *String*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[org.openapis.openapi.models.operations.RequestBodyReadWriteOnlyUnionResponse](../../models/operations/RequestBodyReadWriteOnlyUnionResponse.md)**


## requestBodyWriteOnly

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyWriteOnlyResponse;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.WriteOnlyObject;

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

            org.openapis.openapi.models.shared.WriteOnlyObject req = new WriteOnlyObject(false, 8322.39d, "veritatis");            

            RequestBodyWriteOnlyResponse res = sdk.requestBodies.requestBodyWriteOnly(req);

            if (res.readOnlyObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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

**[org.openapis.openapi.models.operations.RequestBodyWriteOnlyResponse](../../models/operations/RequestBodyWriteOnlyResponse.md)**


## requestBodyWriteOnlyOutput

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyWriteOnlyOutputResponse;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.WriteOnlyObject;

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

            org.openapis.openapi.models.shared.WriteOnlyObject req = new WriteOnlyObject(false, 607.78d, "eaque");            

            RequestBodyWriteOnlyOutputResponse res = sdk.requestBodies.requestBodyWriteOnlyOutput(req);

            if (res.writeOnlyObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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

**[org.openapis.openapi.models.operations.RequestBodyWriteOnlyOutputResponse](../../models/operations/RequestBodyWriteOnlyOutputResponse.md)**


## requestBodyWriteOnlyUnion

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyWriteOnlyUnionResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;
import org.openapis.openapi.models.shared.SimpleObjectInt32Enum;
import org.openapis.openapi.models.shared.SimpleObjectIntEnum;
import org.openapis.openapi.models.shared.WriteOnlyObject;

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

            org.openapis.openapi.models.. req = new WriteOnlyObject(false, 8590.03d, "officia") {{
                bool = false;
                num = 9655.17d;
                string = "mollitia";
            }}            

            RequestBodyWriteOnlyUnionResponse res = sdk.requestBodies.requestBodyWriteOnlyUnion(req);

            if (res.weaklyTypedOneOfWriteOnlyObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Object](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |
| `serverURL`                                | *String*                                   | :heavy_minus_sign:                         | An optional server URL to use.             |


### Response

**[org.openapis.openapi.models.operations.RequestBodyWriteOnlyUnionResponse](../../models/operations/RequestBodyWriteOnlyUnionResponse.md)**

