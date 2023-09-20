# RequestBodies

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
* [requestBodyPostNullArray](#requestbodypostnullarray)
* [requestBodyPostNullDictionary](#requestbodypostnulldictionary)
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

            org.openapis.openapi.models.shared.NullableObject req = new NullableObject(770581L) {{
                optional = "aliquam";
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
                                add(1469.46d),
                            }}, NullableRequiredPropertyPostRequestBodyNullableRequiredEnum.SECOND, 79522L) {{
                nullableOptionalInt = 250622L;
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

            NullableRequiredSharedObjectPostRequestBody req = new NullableRequiredSharedObjectPostRequestBody(                new NullableObject(89603L) {{
                                optional = "dolorum";
                            }};) {{
                nullableOptionalObj = new NullableObject(672048L) {{
                    optional = "placeat";
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
                add(new SimpleObject("nulla", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                    any = "velit";
                    bigint = 432148L;
                    bigintStr = "autem";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    decimal = 7521.35d;
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
                add(new SimpleObjectCamelCase("molestiae", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                    anyVal = "quasi";
                    bigintStrVal = "tempora";
                    bigintVal = 256139L;
                    boolOptVal = true;
                    boolVal = true;
                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    dateVal = LocalDate.parse("2020-01-01");
                    decimalVal = 1314.82d;
                    enumVal = Enum.TWO;
                    float32Val = 2.2222222f;
                    int32EnumVal = SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE;
                    int32Val = 1;
                    intEnumVal = SimpleObjectCamelCaseIntEnumVal.First;
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
                add(new SimpleObject("quidem", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                    any = "eius";
                    bigint = 458515L;
                    bigintStr = "esse";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    decimal = 5245.93d;
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
                add(new SimpleObjectCamelCase("veritatis", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                    anyVal = "eum";
                    bigintStrVal = "suscipit";
                    bigintVal = 826871L;
                    boolOptVal = true;
                    boolVal = true;
                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    dateVal = LocalDate.parse("2020-01-01");
                    decimalVal = 1811.51d;
                    enumVal = Enum.TWO;
                    float32Val = 2.2222222f;
                    int32EnumVal = SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE;
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
                    add(new SimpleObject("eius", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                        any = "quidem";
                        bigint = 206594L;
                        bigintStr = "quo";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 8472.76d;
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
                    add(new SimpleObjectCamelCase("aspernatur", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                        anyVal = "ab";
                        bigintStrVal = "cupiditate";
                        bigintVal = 9688L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 2728.22d;
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
                    add("esse"),
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
                    put("recusandae", new SimpleObject("totam", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                        any = "aperiam";
                        bigint = 715179L;
                        bigintStr = "quod";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 4908.19d;
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
                    put("odio", new SimpleObjectCamelCase("accusantium", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                        anyVal = "occaecati";
                        bigintStrVal = "commodi";
                        bigintVal = 959434L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 1741.12d;
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
                add("quas"),
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

            org.openapis.openapi.models.shared.DeepObject req = new DeepObject("consequuntur",                 new org.openapis.openapi.models.shared.SimpleObject[]{{
                                add(new SimpleObject("explicabo", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                                    any = "deleniti";
                                    bigint = 143829L;
                                    bigintStr = "fuga";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    decimal = 6494.63d;
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
                                }}),
                            }}, false, 147014L,                 new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                                put("sapiente", new SimpleObject("et", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                                    any = "consequuntur";
                                    bigint = 187131L;
                                    bigintStr = "explicabo";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    decimal = 9039.84d;
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
                            }}, 8820.42d,                 new SimpleObject("veritatis", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                                bigint = 724168L;
                                bigintStr = "vero";
                                boolOpt = true;
                                decimal = 3990.25d;
                                intOptNull = 999999L;
                                numOptNull = 1.1d;
                                strOpt = "optional example";
                            }};, "quasi") {{
                type = "saepe";
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

            org.openapis.openapi.models.shared.DeepObjectCamelCase req = new DeepObjectCamelCase(                new SimpleObjectCamelCase("eligendi", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                                anyVal = "harum";
                                bigintStrVal = "molestiae";
                                bigintVal = 699622L;
                                boolOptVal = true;
                                boolVal = true;
                                dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                dateVal = LocalDate.parse("2020-01-01");
                                decimalVal = 5801.97d;
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
                            }},                 new org.openapis.openapi.models.shared.SimpleObjectCamelCase[]{{
                                add(new SimpleObjectCamelCase("quaerat", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                                    anyVal = "tempore";
                                    bigintStrVal = "adipisci";
                                    bigintVal = 766964L;
                                    boolOptVal = true;
                                    boolVal = true;
                                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    dateVal = LocalDate.parse("2020-01-01");
                                    decimalVal = 1605.38d;
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
                            }}, false, 458139L,                 new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>() {{
                                put("blanditiis", new SimpleObjectCamelCase("a", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                                    anyVal = "provident";
                                    bigintStrVal = "a";
                                    bigintVal = 857723L;
                                    boolOptVal = true;
                                    boolVal = true;
                                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    dateVal = LocalDate.parse("2020-01-01");
                                    decimalVal = 5578.11d;
                                    enumVal = Enum.TWO;
                                    float32Val = 2.2222222f;
                                    int32EnumVal = SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE;
                                    int32Val = 1;
                                    intEnumVal = SimpleObjectCamelCaseIntEnumVal.First;
                                    intOptNullVal = 999999L;
                                    intVal = 999999L;
                                    numOptNullVal = 1.1d;
                                    numVal = 1.1d;
                                    strOptVal = "optional example";
                                    strVal = "example";
                                }});
                            }}, 8630.23d,                 new SimpleObjectCamelCase("possimus", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                                bigintStrVal = "asperiores";
                                bigintVal = 815524L;
                                boolOptVal = true;
                                decimalVal = 850.01d;
                                intOptNullVal = 999999L;
                                numOptNullVal = 1.1d;
                                strOptVal = "optional example";
                            }};, "consequuntur") {{
                type = "quasi";
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
                put("similique", new SimpleObject("in", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                    any = "culpa";
                    bigint = 398434L;
                    bigintStr = "tenetur";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    decimal = 627.13d;
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
                put("illum", new SimpleObjectCamelCase("reprehenderit", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                    anyVal = "soluta";
                    bigintStrVal = "accusantium";
                    bigintVal = 306986L;
                    boolOptVal = true;
                    boolVal = true;
                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    dateVal = LocalDate.parse("2020-01-01");
                    decimalVal = 9589.83d;
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
                put("aut", new SimpleObject("dolorum", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                    any = "voluptatum";
                    bigint = 185232L;
                    bigintStr = "quibusdam";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    decimal = 4012.59d;
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
                put("tenetur", new SimpleObjectCamelCase("veritatis", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                    anyVal = "quasi";
                    bigintStrVal = "at";
                    bigintVal = 92027L;
                    boolOptVal = true;
                    boolVal = true;
                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    dateVal = LocalDate.parse("2020-01-01");
                    decimalVal = 4541.62d;
                    enumVal = Enum.TWO;
                    float32Val = 2.2222222f;
                    int32EnumVal = SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE;
                    int32Val = 1;
                    intEnumVal = SimpleObjectCamelCaseIntEnumVal.First;
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
                put("iste", new org.openapis.openapi.models.shared.SimpleObject[]{{
                    add(new SimpleObject("mollitia", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                        any = "temporibus";
                        bigint = 33074L;
                        bigintStr = "rem";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 156.06d;
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
                put("non", new org.openapis.openapi.models.shared.SimpleObjectCamelCase[]{{
                    add(new SimpleObjectCamelCase("voluptas", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                        anyVal = "voluptatem";
                        bigintStrVal = "dolor";
                        bigintVal = 580152L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 2531.91d;
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
                put("dicta", new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                    put("maiores", new SimpleObject("ea", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                        any = "natus";
                        bigint = 244651L;
                        bigintStr = "voluptatibus";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 3743.23d;
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
                put("repellendus", new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>() {{
                    put("officia", new SimpleObjectCamelCase("quaerat", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                        anyVal = "maxime";
                        bigintStrVal = "dignissimos";
                        bigintVal = 640024L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 9894.1d;
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222f;
                        int32EnumVal = SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE;
                        int32Val = 1;
                        intEnumVal = SimpleObjectCamelCaseIntEnumVal.First;
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
                put("labore", new java.util.HashMap<String, String>() {{
                    put("ab", "adipisci");
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
                put("fuga", "id");
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

            org.openapis.openapi.models.shared.SimpleObject req = new SimpleObject("suscipit", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                bigint = 665859L;
                bigintStr = "recusandae";
                boolOpt = true;
                decimal = 5173.09d;
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

            org.openapis.openapi.models.shared.SimpleObject req = new SimpleObject("fugiat", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                bigint = 554688L;
                bigintStr = "vel";
                boolOpt = true;
                decimal = 2870.51d;
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

            org.openapis.openapi.models.shared.SimpleObjectCamelCase req = new SimpleObjectCamelCase("possimus", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                bigintStrVal = "commodi";
                bigintVal = 447144L;
                boolOptVal = true;
                decimalVal = 3605.45d;
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

            RequestBodyPostComplexNumberTypesRequest req = new RequestBodyPostComplexNumberTypesRequest(                new ComplexNumberTypes(968904L, "assumenda", 3631.61d, "recusandae");, 397533L, "aperiam", 7386.83d, "consectetur", 449083L, "exercitationem", 9372.85d, "facere");            

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

            org.openapis.openapi.models.shared.DefaultsAndConsts req = new DefaultsAndConsts(257233L, "doloribus", false, LocalDate.parse("2022-01-12"), OffsetDateTime.parse("2021-03-11T09:18:18.070Z"), 8970.71d, "dolore", DefaultsAndConstsConstEnumInt.ONE, DefaultsAndConstsConstEnumStr.THREE, 241545L, 2494.2d, "amet", "beatae", "dignissimos", false, DefaultsAndConstsSingleEnumConstStr.ONE) {{
                defaultBigInt = 950953L;
                defaultBigIntStr = "debitis";
                defaultBool = false;
                defaultDate = LocalDate.parse("2022-08-23");
                defaultDateTime = OffsetDateTime.parse("2022-03-25T18:38:24.627Z");
                defaultDecimal = 583.56d;
                defaultDecimalStr = "voluptates";
                defaultEnumInt = DefaultsAndConstsDefaultEnumInt.THREE;
                defaultEnumStr = DefaultsAndConstsDefaultEnumStr.ONE;
                defaultInt = 881721L;
                defaultNum = 6311.26d;
                defaultStr = "tempora";
                defaultStrNullable = "aspernatur";
                defaultStrOptional = "voluptas";
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

            org.openapis.openapi.models.shared.DeepObject req = new DeepObject(                new SimpleObject("dolores", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                                any = "voluptas";
                                bigint = 324405L;
                                bigintStr = "nobis";
                                bool = true;
                                boolOpt = true;
                                date = LocalDate.parse("2020-01-01");
                                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                decimal = 6801.16d;
                                enum_ = Enum.TWO;
                                float32 = 2.2222222f;
                                int_ = 999999L;
                                int32 = 1;
                                int32Enum = SimpleObjectInt32Enum.FIFTY_FIVE;
                                intEnum = SimpleObjectIntEnum.Third;
                                intOptNull = 999999L;
                                num = 1.1d;
                                numOptNull = 1.1d;
                                str = "example";
                                strOpt = "optional example";
                            }},                 new org.openapis.openapi.models.shared.SimpleObject[]{{
                                add(new SimpleObject("cum", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                                    any = "dolore";
                                    bigint = 304468L;
                                    bigintStr = "officiis";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    decimal = 8391.89d;
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
                                }}),
                            }}, false, 942584L,                 new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                                put("nesciunt", new SimpleObject("nobis", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                                    any = "culpa";
                                    bigint = 548519L;
                                    bigintStr = "pariatur";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    decimal = 5196.43d;
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
                                }});
                            }}, 1488.29d,                 new SimpleObject("reiciendis", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                                bigint = 707918L;
                                bigintStr = "voluptate";
                                boolOpt = true;
                                decimal = 7090.72d;
                                intOptNull = 999999L;
                                numOptNull = 1.1d;
                                strOpt = "optional example";
                            }};, "ab") {{
                type = "iste";
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
                put("dolore", "laborum");
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

            org.openapis.openapi.models.shared.SimpleObject req = new SimpleObject("sed", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                bigint = 696077L;
                bigintStr = "explicabo";
                boolOpt = true;
                decimal = 3783.26d;
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
                add(604118L),
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
                add(LocalDate.parse("2022-08-14")),
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
                add("sapiente"),
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

            org.openapis.openapi.models.. req = 895386L            

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

            org.openapis.openapi.models.. req = "illo"            

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

            org.openapis.openapi.models.. req = LocalDate.parse("2022-12-10")            

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

            org.openapis.openapi.models.. req = OffsetDateTime.parse("2021-01-15T21:52:35.790Z")            

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

            org.openapis.openapi.models.. req = 2748.23d            

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

            org.openapis.openapi.models.. req = "sed"            

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

            org.openapis.openapi.models.. req = 5922.31d            

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

            org.openapis.openapi.models.. req = 258702            

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

            org.openapis.openapi.models.. req = 896762L            

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
                put("ipsum", "ea");
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
                put("occaecati", OffsetDateTime.parse("2021-01-18T16:49:49.451Z"));
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
                put("tempora", 2730.09d);
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

            org.openapis.openapi.models.. req = 4554.44d            

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

            org.openapis.openapi.models.. req = "reiciendis"            

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

            org.openapis.openapi.models.shared.SimpleObject req = new SimpleObject("ex", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                bigint = 888044L;
                bigintStr = "praesentium";
                boolOpt = true;
                decimal = 7086.09d;
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

            RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON req = new RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON(false, 3103.81d, "incidunt");            

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

            RequestBodyPostMultipleContentTypesSplitParamFormResponse res = sdk.requestBodies.requestBodyPostMultipleContentTypesSplitParamForm(new RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded(false, 5249.7d, "sit") {{
                bool3 = false;
                num3 = 3730.35d;
                str3 = "debitis";
            }}, "nobis");

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

            RequestBodyPostMultipleContentTypesSplitParamJsonResponse res = sdk.requestBodies.requestBodyPostMultipleContentTypesSplitParamJson(new RequestBodyPostMultipleContentTypesSplitParamApplicationJSON(false, 3295.43d, "recusandae") {{
                bool = false;
                num = 6256.37d;
                str = "veniam";
            }}, "reiciendis");

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

            RequestBodyPostMultipleContentTypesSplitParamMultipartResponse res = sdk.requestBodies.requestBodyPostMultipleContentTypesSplitParamMultipart(new RequestBodyPostMultipleContentTypesSplitParamMultipartFormData(false, 486.9d, "saepe") {{
                bool2 = false;
                num2 = 8623.19d;
                str2 = "magni";
            }}, "numquam");

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

            RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded req = new RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded(false, 3299.35d, "in");            

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

            RequestBodyPostMultipleContentTypesSplitApplicationJSON req = new RequestBodyPostMultipleContentTypesSplitApplicationJSON(false, 8892.34d, "beatae");            

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

            RequestBodyPostMultipleContentTypesSplitMultipartFormData req = new RequestBodyPostMultipleContentTypesSplitMultipartFormData(false, 5124.52d, "exercitationem");            

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
                add("praesentium"),
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
                put("cum", "laboriosam");
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

            org.openapis.openapi.models.. req = "dolorum".getBytes()            

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

            RequestBodyPutBytesWithParamsResponse res = sdk.requestBodies.requestBodyPutBytesWithParams("voluptatum".getBytes(), "error");

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

            org.openapis.openapi.models.shared.DeepObject req = new DeepObject("expedita",                 new org.openapis.openapi.models.shared.SimpleObject[]{{
                                add(new SimpleObject("corrupti", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                                    any = "debitis";
                                    bigint = 204923L;
                                    bigintStr = "dolorum";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    decimal = 3416.98d;
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
                            }}, false, 543678L,                 new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                                put("fugit", new SimpleObject("consequatur", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                                    any = "ut";
                                    bigint = 856303L;
                                    bigintStr = "voluptatem";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    decimal = 6350.57d;
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
                                }});
                            }}, 245.27d,                 new SimpleObject("voluptatum", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                                bigint = 361151L;
                                bigintStr = "et";
                                boolOpt = true;
                                decimal = 5027.1d;
                                intOptNull = 999999L;
                                numOptNull = 1.1d;
                                strOpt = "optional example";
                            }};, "ex") {{
                type = "sed";
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
                file = new RequestBodyPutMultipartFileRequestBodyFile("sit".getBytes(), "vel");;
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

            org.openapis.openapi.models.shared.SimpleObject req = new SimpleObject("nostrum", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                bigint = 8511L;
                bigintStr = "incidunt";
                boolOpt = true;
                decimal = 9688.65d;
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

            org.openapis.openapi.models.. req = "dolorem"            

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

            RequestBodyPutStringWithParamsResponse res = sdk.requestBodies.requestBodyPutStringWithParams("harum", "dicta");

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

            org.openapis.openapi.models.shared.ReadWriteObjectInput req = new ReadWriteObjectInput(99416L, 577140L, 289776L);            

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

            org.openapis.openapi.models..Input req = new ReadWriteObjectInput(388867L, 2703L, 227084L) {{
                num1 = 671957L;
                num2 = 724148L;
                num3 = 948861L;
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

            org.openapis.openapi.models.shared.WriteOnlyObject req = new WriteOnlyObject(false, 6471.97d, "voluptate");            

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

            org.openapis.openapi.models.shared.WriteOnlyObject req = new WriteOnlyObject(false, 6003.92d, "reiciendis");            

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

            org.openapis.openapi.models.. req = new WriteOnlyObject(false, 9147.91d, "perferendis") {{
                bool = false;
                num = 8338.19d;
                string = "delectus";
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

