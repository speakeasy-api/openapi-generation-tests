# requestBodies

## Overview

Endpoints for testing request bodies.

### Available Operations

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
* [requestBodyPostEmptyObject](#requestbodypostemptyobject)
* [requestBodyPostFormDeep](#requestbodypostformdeep)
* [requestBodyPostFormMapPrimitive](#requestbodypostformmapprimitive)
* [requestBodyPostFormSimple](#requestbodypostformsimple)
* [requestBodyPostMultipleContentTypesComponentFiltered](#requestbodypostmultiplecontenttypescomponentfiltered)
* [requestBodyPostMultipleContentTypesInlineFiltered](#requestbodypostmultiplecontenttypesinlinefiltered)
* [requestBodyPostMultipleContentTypesSplitParamForm](#requestbodypostmultiplecontenttypessplitparamform)
* [requestBodyPostMultipleContentTypesSplitParamJson](#requestbodypostmultiplecontenttypessplitparamjson)
* [requestBodyPostMultipleContentTypesSplitParamMultipart](#requestbodypostmultiplecontenttypessplitparammultipart)
* [requestBodyPostMultipleContentTypesSplitForm](#requestbodypostmultiplecontenttypessplitform)
* [requestBodyPostMultipleContentTypesSplitJson](#requestbodypostmultiplecontenttypessplitjson)
* [requestBodyPostMultipleContentTypesSplitMultipart](#requestbodypostmultiplecontenttypessplitmultipart)
* [requestBodyPutBytes](#requestbodyputbytes)
* [requestBodyPutBytesWithParams](#requestbodyputbyteswithparams)
* [requestBodyPutMultipartDeep](#requestbodyputmultipartdeep)
* [requestBodyPutMultipartFile](#requestbodyputmultipartfile)
* [requestBodyPutMultipartSimple](#requestbodyputmultipartsimple)
* [requestBodyPutString](#requestbodyputstring)
* [requestBodyPutStringWithParams](#requestbodyputstringwithparams)
* [requestBodyReadAndWrite](#requestbodyreadandwrite)
* [requestBodyReadOnlyInput](#requestbodyreadonlyinput)
* [requestBodyWriteOnly](#requestbodywriteonly)
* [requestBodyWriteOnlyOutput](#requestbodywriteonlyoutput)

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
                add(new SimpleObject("tenetur", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                    any = "deleniti";
                    bigint = 929292L;
                    bigintStr = "dolorum";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    enum_ = Enum.TWO;
                    float32 = 2.2222222d;
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
                add(new SimpleObject("consectetur", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                    any = "et";
                    bigint = 454162L;
                    bigintStr = "ipsa";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    enum_ = Enum.TWO;
                    float32 = 2.2222222d;
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
                add(new SimpleObjectCamelCase("mollitia", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                    anyVal = "accusantium";
                    bigintStrVal = "rem";
                    bigintVal = 15606L;
                    boolOptVal = true;
                    boolVal = true;
                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    dateVal = LocalDate.parse("2020-01-01");
                    enumVal = Enum.TWO;
                    float32Val = 2.2222222d;
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
                add(new SimpleObjectCamelCase("impedit", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                    anyVal = "non";
                    bigintStrVal = "voluptatem";
                    bigintVal = 221161L;
                    boolOptVal = true;
                    boolVal = true;
                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    dateVal = LocalDate.parse("2020-01-01");
                    enumVal = Enum.TWO;
                    float32Val = 2.2222222d;
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
                add(new SimpleObjectCamelCase("velit", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                    anyVal = "aut";
                    bigintStrVal = "dignissimos";
                    bigintVal = 115484L;
                    boolOptVal = true;
                    boolVal = true;
                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    dateVal = LocalDate.parse("2020-01-01");
                    enumVal = Enum.TWO;
                    float32Val = 2.2222222d;
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
                add(new SimpleObjectCamelCase("repellendus", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                    anyVal = "asperiores";
                    bigintStrVal = "aperiam";
                    bigintVal = 409054L;
                    boolOptVal = true;
                    boolVal = true;
                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    dateVal = LocalDate.parse("2020-01-01");
                    enumVal = Enum.TWO;
                    float32Val = 2.2222222d;
                    int32EnumVal = SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE;
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
                add(new SimpleObject("porro", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                    any = "officia";
                    bigint = 989410L;
                    bigintStr = "nemo";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    enum_ = Enum.TWO;
                    float32 = 2.2222222d;
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
                add(new SimpleObject("velit", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                    any = "ab";
                    bigint = 241418L;
                    bigintStr = "fuga";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    enum_ = Enum.TWO;
                    float32 = 2.2222222d;
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
                add(new SimpleObjectCamelCase("vel", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                    anyVal = "totam";
                    bigintStrVal = "fugiat";
                    bigintVal = 424089L;
                    boolOptVal = true;
                    boolVal = true;
                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    dateVal = LocalDate.parse("2020-01-01");
                    enumVal = Enum.TWO;
                    float32Val = 2.2222222d;
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
                add(new SimpleObjectCamelCase("reiciendis", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                    anyVal = "facilis";
                    bigintStrVal = "cum";
                    bigintVal = 414857L;
                    boolOptVal = true;
                    boolVal = true;
                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    dateVal = LocalDate.parse("2020-01-01");
                    enumVal = Enum.TWO;
                    float32Val = 2.2222222d;
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
                add(new SimpleObjectCamelCase("in", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                    anyVal = "recusandae";
                    bigintStrVal = "aliquid";
                    bigintVal = 46007L;
                    boolOptVal = true;
                    boolVal = true;
                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    dateVal = LocalDate.parse("2020-01-01");
                    enumVal = Enum.TWO;
                    float32Val = 2.2222222d;
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
                add(new SimpleObjectCamelCase("quidem", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                    anyVal = "facere";
                    bigintStrVal = "numquam";
                    bigintVal = 985492L;
                    boolOptVal = true;
                    boolVal = true;
                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    dateVal = LocalDate.parse("2020-01-01");
                    enumVal = Enum.TWO;
                    float32Val = 2.2222222d;
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
                    add(new SimpleObject("dignissimos", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                        any = "asperiores";
                        bigint = 241545L;
                        bigintStr = "non";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        enum_ = Enum.TWO;
                        float32 = 2.2222222d;
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
                }}),
                add(new org.openapis.openapi.models.shared.SimpleObject[]{{
                    add(new SimpleObject("libero", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                        any = "corporis";
                        bigint = 689768L;
                        bigintStr = "laboriosam";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        enum_ = Enum.TWO;
                        float32 = 2.2222222d;
                        int_ = 999999L;
                        int32 = 1;
                        int32Enum = SimpleObjectInt32Enum.FIFTY_FIVE;
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
                    add(new SimpleObjectCamelCase("nobis", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                        anyVal = "aspernatur";
                        bigintStrVal = "voluptas";
                        bigintVal = 374244L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                    add(new SimpleObjectCamelCase("aliquam", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                        anyVal = "minus";
                        bigintStrVal = "dolores";
                        bigintVal = 503934L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                }}),
                add(new org.openapis.openapi.models.shared.SimpleObjectCamelCase[]{{
                    add(new SimpleObjectCamelCase("nesciunt", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                        anyVal = "adipisci";
                        bigintStrVal = "cum";
                        bigintVal = 502389L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                    add(new SimpleObjectCamelCase("sit", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                        anyVal = "pariatur";
                        bigintStrVal = "totam";
                        bigintVal = 940210L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                }}),
                add(new org.openapis.openapi.models.shared.SimpleObjectCamelCase[]{{
                    add(new SimpleObjectCamelCase("ab", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                        anyVal = "explicabo";
                        bigintStrVal = "asperiores";
                        bigintVal = 707918L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                    add(new SimpleObjectCamelCase("explicabo", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                        anyVal = "laborum";
                        bigintStrVal = "sed";
                        bigintVal = 447516L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                    add(new SimpleObjectCamelCase("reiciendis", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                        anyVal = "architecto";
                        bigintStrVal = "suscipit";
                        bigintVal = 960257L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                    add(new SimpleObjectCamelCase("necessitatibus", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                        anyVal = "maiores";
                        bigintStrVal = "incidunt";
                        bigintVal = 148478L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                    add("voluptatibus"),
                    add("tempora"),
                    add("tempora"),
                }}),
                add(new String[]{{
                    add("reiciendis"),
                    add("ex"),
                }}),
                add(new String[]{{
                    add("non"),
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
                    put("facilis", new SimpleObject("sit", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                        any = "quaerat";
                        bigint = 277773L;
                        bigintStr = "ipsam";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        enum_ = Enum.TWO;
                        float32 = 2.2222222d;
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
                    put("veniam", new SimpleObject("aperiam", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                        any = "minima";
                        bigint = 924159L;
                        bigintStr = "reiciendis";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        enum_ = Enum.TWO;
                        float32 = 2.2222222d;
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
                    put("veniam", new SimpleObject("praesentium", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                        any = "in";
                        bigint = 889234L;
                        bigintStr = "beatae";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        enum_ = Enum.TWO;
                        float32 = 2.2222222d;
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
                }}),
                add(new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                    put("voluptatum", new SimpleObject("dolorum", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                        any = "error";
                        bigint = 944708L;
                        bigintStr = "expedita";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        enum_ = Enum.TWO;
                        float32 = 2.2222222d;
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
                    put("dolorum", new SimpleObject("ut", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                        any = "corrupti";
                        bigint = 879235L;
                        bigintStr = "tempora";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        enum_ = Enum.TWO;
                        float32 = 2.2222222d;
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
                    put("culpa", new SimpleObject("sit", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                        any = "expedita";
                        bigint = 299643L;
                        bigintStr = "consequatur";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        enum_ = Enum.TWO;
                        float32 = 2.2222222d;
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
                }}),
                add(new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                    put("corporis", new SimpleObject("vel", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                        any = "et";
                        bigint = 502710L;
                        bigintStr = "ex";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        enum_ = Enum.TWO;
                        float32 = 2.2222222d;
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
                    put("error", new SimpleObject("dicta", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                        any = "consequatur";
                        bigint = 279068L;
                        bigintStr = "reiciendis";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        enum_ = Enum.TWO;
                        float32 = 2.2222222d;
                        int_ = 999999L;
                        int32 = 1;
                        int32Enum = SimpleObjectInt32Enum.FIFTY_FIVE;
                        intEnum = SimpleObjectIntEnum.Third;
                        intOptNull = 999999L;
                        num = 1.1d;
                        numOptNull = 1.1d;
                        str = "example";
                        strOpt = "optional example";
                    }});
                    put("labore", new SimpleObject("laboriosam", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                        any = "quidem";
                        bigint = 539074L;
                        bigintStr = "laborum";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        enum_ = Enum.TWO;
                        float32 = 2.2222222d;
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
                    put("deserunt", new SimpleObject("delectus", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                        any = "voluptate";
                        bigint = 600392L;
                        bigintStr = "reiciendis";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        enum_ = Enum.TWO;
                        float32 = 2.2222222d;
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
                }}),
                add(new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                    put("quidem", new SimpleObject("veniam", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                        any = "reprehenderit";
                        bigint = 813679L;
                        bigintStr = "fuga";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        enum_ = Enum.TWO;
                        float32 = 2.2222222d;
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
                    put("repudiandae", new SimpleObject("suscipit", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                        any = "quasi";
                        bigint = 542457L;
                        bigintStr = "reprehenderit";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        enum_ = Enum.TWO;
                        float32 = 2.2222222d;
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
                    put("et", new SimpleObject("error", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                        any = "esse";
                        bigint = 227759L;
                        bigintStr = "assumenda";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        enum_ = Enum.TWO;
                        float32 = 2.2222222d;
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
                    put("minima", new SimpleObjectCamelCase("error", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                        anyVal = "aspernatur";
                        bigintStrVal = "ex";
                        bigintVal = 980581L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
                        int32EnumVal = SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE;
                        int32Val = 1;
                        intEnumVal = SimpleObjectCamelCaseIntEnumVal.Third;
                        intOptNullVal = 999999L;
                        intVal = 999999L;
                        numOptNullVal = 1.1d;
                        numVal = 1.1d;
                        strOptVal = "optional example";
                        strVal = "example";
                    }});
                    put("repudiandae", new SimpleObjectCamelCase("repellendus", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                        anyVal = "atque";
                        bigintStrVal = "atque";
                        bigintVal = 120919L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                    put("doloremque", new SimpleObjectCamelCase("enim", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                        anyVal = "repudiandae";
                        bigintStrVal = "dicta";
                        bigintVal = 36033L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                }}),
                add(new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>() {{
                    put("molestias", new SimpleObjectCamelCase("perspiciatis", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                        anyVal = "magnam";
                        bigintStrVal = "saepe";
                        bigintVal = 160467L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
                        int32EnumVal = SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE;
                        int32Val = 1;
                        intEnumVal = SimpleObjectCamelCaseIntEnumVal.Third;
                        intOptNullVal = 999999L;
                        intVal = 999999L;
                        numOptNullVal = 1.1d;
                        numVal = 1.1d;
                        strOptVal = "optional example";
                        strVal = "example";
                    }});
                    put("eveniet", new SimpleObjectCamelCase("reprehenderit", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                        anyVal = "occaecati";
                        bigintStrVal = "consequuntur";
                        bigintVal = 145870L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                    put("corporis", new SimpleObjectCamelCase("iure", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                        anyVal = "quidem";
                        bigintStrVal = "eveniet";
                        bigintVal = 247399L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                    put("quae", new SimpleObjectCamelCase("necessitatibus", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                        anyVal = "molestiae";
                        bigintStrVal = "eveniet";
                        bigintVal = 184362L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                }}),
                add(new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>() {{
                    put("voluptatum", new SimpleObjectCamelCase("corporis", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                        anyVal = "rem";
                        bigintStrVal = "aliquam";
                        bigintVal = 320565L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                    put("mollitia", new SimpleObjectCamelCase("id", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                        anyVal = "voluptas";
                        bigintStrVal = "alias";
                        bigintVal = 979527L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                    put("dolorum", new SimpleObjectCamelCase("molestiae", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                        anyVal = "nesciunt";
                        bigintStrVal = "quae";
                        bigintVal = 925703L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                }}),
                add(new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>() {{
                    put("adipisci", new SimpleObjectCamelCase("esse", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                        anyVal = "debitis";
                        bigintStrVal = "laudantium";
                        bigintVal = 432606L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
                        int32EnumVal = SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE;
                        int32Val = 1;
                        intEnumVal = SimpleObjectCamelCaseIntEnumVal.Third;
                        intOptNullVal = 999999L;
                        intVal = 999999L;
                        numOptNullVal = 1.1d;
                        numVal = 1.1d;
                        strOptVal = "optional example";
                        strVal = "example";
                    }});
                    put("eum", new SimpleObjectCamelCase("animi", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                        anyVal = "reiciendis";
                        bigintStrVal = "provident";
                        bigintVal = 133439L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                    put("provident", new SimpleObjectCamelCase("repellat", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                        anyVal = "possimus";
                        bigintStrVal = "animi";
                        bigintVal = 402767L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                add("nam"),
                add("earum"),
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

            org.openapis.openapi.models.shared.DeepObject req = new DeepObject("laborum",                 new org.openapis.openapi.models.shared.SimpleObject[]{{
                                add(new SimpleObject("cumque", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                                    any = "modi";
                                    bigint = 976226L;
                                    bigintStr = "molestias";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    enum_ = Enum.TWO;
                                    float32 = 2.2222222d;
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
                                add(new SimpleObject("quae", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                                    any = "tempora";
                                    bigint = 335498L;
                                    bigintStr = "inventore";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    enum_ = Enum.TWO;
                                    float32 = 2.2222222d;
                                    int_ = 999999L;
                                    int32 = 1;
                                    int32Enum = SimpleObjectInt32Enum.FIFTY_FIVE;
                                    intEnum = SimpleObjectIntEnum.Third;
                                    intOptNull = 999999L;
                                    num = 1.1d;
                                    numOptNull = 1.1d;
                                    str = "example";
                                    strOpt = "optional example";
                                }}),
                                add(new SimpleObject("impedit", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                                    any = "aspernatur";
                                    bigint = 432281L;
                                    bigintStr = "eius";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    enum_ = Enum.TWO;
                                    float32 = 2.2222222d;
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
                                add(new SimpleObject("provident", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                                    any = "eum";
                                    bigint = 117320L;
                                    bigintStr = "minima";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    enum_ = Enum.TWO;
                                    float32 = 2.2222222d;
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
                            }}, false, 940782L,                 new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                                put("eaque", new SimpleObject("porro", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                                    any = "earum";
                                    bigint = 596211L;
                                    bigintStr = "maiores";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    enum_ = Enum.TWO;
                                    float32 = 2.2222222d;
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
                                put("fugit", new SimpleObject("nulla", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                                    any = "cumque";
                                    bigint = 684935L;
                                    bigintStr = "ratione";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    enum_ = Enum.TWO;
                                    float32 = 2.2222222d;
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
                                put("et", new SimpleObject("quasi", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                                    any = "ducimus";
                                    bigint = 619183L;
                                    bigintStr = "occaecati";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    enum_ = Enum.TWO;
                                    float32 = 2.2222222d;
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
                                put("nulla", new SimpleObject("dicta", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                                    any = "necessitatibus";
                                    bigint = 58534L;
                                    bigintStr = "tempora";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    enum_ = Enum.TWO;
                                    float32 = 2.2222222d;
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
                            }}, 5083.9d,                 new SimpleObject("maiores", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                                bigint = 99958L;
                                bigintStr = "fugiat";
                                boolOpt = true;
                                intOptNull = 999999L;
                                numOptNull = 1.1d;
                                strOpt = "optional example";
                            }};, "doloremque") {{
                type = "dicta";
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

            org.openapis.openapi.models.shared.DeepObjectCamelCase req = new DeepObjectCamelCase(                new SimpleObjectCamelCase("ipsa", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                                anyVal = "tempora";
                                bigintStrVal = "esse";
                                bigintVal = 403793L;
                                boolOptVal = true;
                                boolVal = true;
                                dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                dateVal = LocalDate.parse("2020-01-01");
                                enumVal = Enum.TWO;
                                float32Val = 2.2222222d;
                                int32EnumVal = SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE;
                                int32Val = 1;
                                intEnumVal = SimpleObjectCamelCaseIntEnumVal.Second;
                                intOptNullVal = 999999L;
                                intVal = 999999L;
                                numOptNullVal = 1.1d;
                                numVal = 1.1d;
                                strOptVal = "optional example";
                                strVal = "example";
                            }},                 new org.openapis.openapi.models.shared.SimpleObjectCamelCase[]{{
                                add(new SimpleObjectCamelCase("aliquid", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                                    anyVal = "fugiat";
                                    bigintStrVal = "expedita";
                                    bigintVal = 399667L;
                                    boolOptVal = true;
                                    boolVal = true;
                                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    dateVal = LocalDate.parse("2020-01-01");
                                    enumVal = Enum.TWO;
                                    float32Val = 2.2222222d;
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
                                add(new SimpleObjectCamelCase("possimus", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                                    anyVal = "voluptas";
                                    bigintStrVal = "iste";
                                    bigintVal = 661607L;
                                    boolOptVal = true;
                                    boolVal = true;
                                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    dateVal = LocalDate.parse("2020-01-01");
                                    enumVal = Enum.TWO;
                                    float32Val = 2.2222222d;
                                    int32EnumVal = SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE;
                                    int32Val = 1;
                                    intEnumVal = SimpleObjectCamelCaseIntEnumVal.Second;
                                    intOptNullVal = 999999L;
                                    intVal = 999999L;
                                    numOptNullVal = 1.1d;
                                    numVal = 1.1d;
                                    strOptVal = "optional example";
                                    strVal = "example";
                                }}),
                            }}, false, 671794L,                 new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>() {{
                                put("ad", new SimpleObjectCamelCase("quo", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                                    anyVal = "deleniti";
                                    bigintStrVal = "enim";
                                    bigintVal = 110477L;
                                    boolOptVal = true;
                                    boolVal = true;
                                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    dateVal = LocalDate.parse("2020-01-01");
                                    enumVal = Enum.TWO;
                                    float32Val = 2.2222222d;
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
                                put("ad", new SimpleObjectCamelCase("beatae", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                                    anyVal = "expedita";
                                    bigintStrVal = "voluptatem";
                                    bigintVal = 561577L;
                                    boolOptVal = true;
                                    boolVal = true;
                                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    dateVal = LocalDate.parse("2020-01-01");
                                    enumVal = Enum.TWO;
                                    float32Val = 2.2222222d;
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
                                put("veritatis", new SimpleObjectCamelCase("officiis", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                                    anyVal = "rerum";
                                    bigintStrVal = "est";
                                    bigintVal = 634786L;
                                    boolOptVal = true;
                                    boolVal = true;
                                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    dateVal = LocalDate.parse("2020-01-01");
                                    enumVal = Enum.TWO;
                                    float32Val = 2.2222222d;
                                    int32EnumVal = SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE;
                                    int32Val = 1;
                                    intEnumVal = SimpleObjectCamelCaseIntEnumVal.Third;
                                    intOptNullVal = 999999L;
                                    intVal = 999999L;
                                    numOptNullVal = 1.1d;
                                    numVal = 1.1d;
                                    strOptVal = "optional example";
                                    strVal = "example";
                                }});
                            }}, 8671.68d,                 new SimpleObjectCamelCase("debitis", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                                bigintStrVal = "deleniti";
                                bigintVal = 937219L;
                                boolOptVal = true;
                                intOptNullVal = 999999L;
                                numOptNullVal = 1.1d;
                                strOptVal = "optional example";
                            }};, "ex") {{
                type = "sapiente";
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
                put("minus", new SimpleObject("illum", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                    any = "nemo";
                    bigint = 992074L;
                    bigintStr = "ratione";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    enum_ = Enum.TWO;
                    float32 = 2.2222222d;
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
                put("quibusdam", new SimpleObject("inventore", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                    any = "nam";
                    bigint = 373216L;
                    bigintStr = "culpa";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    enum_ = Enum.TWO;
                    float32 = 2.2222222d;
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
                put("tempora", new SimpleObject("fugit", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                    any = "dolor";
                    bigint = 8689L;
                    bigintStr = "architecto";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    enum_ = Enum.TWO;
                    float32 = 2.2222222d;
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
                put("dolor", new SimpleObjectCamelCase("eveniet", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                    anyVal = "fugiat";
                    bigintStrVal = "ipsam";
                    bigintVal = 162120L;
                    boolOptVal = true;
                    boolVal = true;
                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    dateVal = LocalDate.parse("2020-01-01");
                    enumVal = Enum.TWO;
                    float32Val = 2.2222222d;
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
                put("necessitatibus", new SimpleObject("vel", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                    any = "sed";
                    bigint = 332191L;
                    bigintStr = "nesciunt";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    enum_ = Enum.TWO;
                    float32 = 2.2222222d;
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
                put("exercitationem", new SimpleObject("recusandae", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                    any = "ab";
                    bigint = 781480L;
                    bigintStr = "autem";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    enum_ = Enum.TWO;
                    float32 = 2.2222222d;
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
                put("necessitatibus", new SimpleObjectCamelCase("harum", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                    anyVal = "quasi";
                    bigintStrVal = "nisi";
                    bigintVal = 871103L;
                    boolOptVal = true;
                    boolVal = true;
                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    dateVal = LocalDate.parse("2020-01-01");
                    enumVal = Enum.TWO;
                    float32Val = 2.2222222d;
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
                put("repudiandae", new SimpleObjectCamelCase("officia", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                    anyVal = "optio";
                    bigintStrVal = "occaecati";
                    bigintVal = 364544L;
                    boolOptVal = true;
                    boolVal = true;
                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    dateVal = LocalDate.parse("2020-01-01");
                    enumVal = Enum.TWO;
                    float32Val = 2.2222222d;
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
                put("quos", new org.openapis.openapi.models.shared.SimpleObject[]{{
                    add(new SimpleObject("incidunt", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                        any = "aspernatur";
                        bigint = 495970L;
                        bigintStr = "nesciunt";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        enum_ = Enum.TWO;
                        float32 = 2.2222222d;
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
                    add(new SimpleObject("aperiam", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                        any = "fugiat";
                        bigint = 117380L;
                        bigintStr = "nisi";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        enum_ = Enum.TWO;
                        float32 = 2.2222222d;
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
                }});
                put("soluta", new org.openapis.openapi.models.shared.SimpleObject[]{{
                    add(new SimpleObject("inventore", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                        any = "omnis";
                        bigint = 178580L;
                        bigintStr = "occaecati";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        enum_ = Enum.TWO;
                        float32 = 2.2222222d;
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
                put("distinctio", new org.openapis.openapi.models.shared.SimpleObjectCamelCase[]{{
                    add(new SimpleObjectCamelCase("temporibus", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                        anyVal = "delectus";
                        bigintStrVal = "minima";
                        bigintVal = 507636L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                    add(new SimpleObjectCamelCase("nam", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                        anyVal = "itaque";
                        bigintStrVal = "commodi";
                        bigintVal = 520761L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                    add(new SimpleObjectCamelCase("maiores", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                        anyVal = "ipsam";
                        bigintStrVal = "vel";
                        bigintVal = 1383L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
                        int32EnumVal = SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE;
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
                put("nulla", new org.openapis.openapi.models.shared.SimpleObjectCamelCase[]{{
                    add(new SimpleObjectCamelCase("sint", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                        anyVal = "esse";
                        bigintStrVal = "nemo";
                        bigintVal = 444587L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                    add(new SimpleObjectCamelCase("debitis", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                        anyVal = "hic";
                        bigintStrVal = "necessitatibus";
                        bigintVal = 991891L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                    add(new SimpleObjectCamelCase("atque", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                        anyVal = "minus";
                        bigintStrVal = "fuga";
                        bigintVal = 675689L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
                        int32EnumVal = SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE;
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
                put("magni", new org.openapis.openapi.models.shared.SimpleObjectCamelCase[]{{
                    add(new SimpleObjectCamelCase("sequi", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                        anyVal = "repudiandae";
                        bigintStrVal = "nam";
                        bigintVal = 294076L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                    add(new SimpleObjectCamelCase("voluptatibus", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                        anyVal = "quo";
                        bigintStrVal = "deleniti";
                        bigintVal = 844235L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                    add(new SimpleObjectCamelCase("voluptatibus", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                        anyVal = "quibusdam";
                        bigintStrVal = "inventore";
                        bigintVal = 818034L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                put("aliquam", new org.openapis.openapi.models.shared.SimpleObjectCamelCase[]{{
                    add(new SimpleObjectCamelCase("vero", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                        anyVal = "illo";
                        bigintStrVal = "accusantium";
                        bigintVal = 424663L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                put("ut", new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                    put("earum", new SimpleObject("alias", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                        any = "dicta";
                        bigint = 772266L;
                        bigintStr = "voluptatibus";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        enum_ = Enum.TWO;
                        float32 = 2.2222222d;
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
                    put("velit", new SimpleObject("doloremque", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                        any = "laborum";
                        bigint = 250398L;
                        bigintStr = "dolor";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        enum_ = Enum.TWO;
                        float32 = 2.2222222d;
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
                    put("recusandae", new SimpleObject("perspiciatis", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                        any = "ea";
                        bigint = 693153L;
                        bigintStr = "voluptas";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        enum_ = Enum.TWO;
                        float32 = 2.2222222d;
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
                put("voluptate", new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>() {{
                    put("unde", new SimpleObjectCamelCase("est", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                        anyVal = "necessitatibus";
                        bigintStrVal = "animi";
                        bigintVal = 769967L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                    put("labore", new SimpleObjectCamelCase("dolorem", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                        anyVal = "veritatis";
                        bigintStrVal = "vero";
                        bigintVal = 233173L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                }});
                put("iste", new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>() {{
                    put("nemo", new SimpleObjectCamelCase("fugit", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                        anyVal = "soluta";
                        bigintStrVal = "libero";
                        bigintVal = 526907L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                    put("vel", new SimpleObjectCamelCase("itaque", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                        anyVal = "quae";
                        bigintStrVal = "quae";
                        bigintVal = 264333L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                }});
                put("unde", new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>() {{
                    put("distinctio", new SimpleObjectCamelCase("libero", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                        anyVal = "maxime";
                        bigintStrVal = "quia";
                        bigintVal = 159146L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                    put("libero", new SimpleObjectCamelCase("iusto", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                        anyVal = "fugiat";
                        bigintStrVal = "officia";
                        bigintVal = 554603L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                    put("inventore", new SimpleObjectCamelCase("voluptatem", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                        anyVal = "aperiam";
                        bigintStrVal = "totam";
                        bigintVal = 292888L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                    put("dolores", new SimpleObjectCamelCase("molestiae", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                        anyVal = "assumenda";
                        bigintStrVal = "beatae";
                        bigintVal = 668606L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                }});
                put("necessitatibus", new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>() {{
                    put("sint", new SimpleObjectCamelCase("corporis", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                        anyVal = "ea";
                        bigintStrVal = "autem";
                        bigintVal = 373511L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                    put("cum", new SimpleObjectCamelCase("repudiandae", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                        anyVal = "at";
                        bigintStrVal = "alias";
                        bigintVal = 156653L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                    put("officiis", new SimpleObjectCamelCase("explicabo", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                        anyVal = "eos";
                        bigintStrVal = "quibusdam";
                        bigintVal = 483518L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.TWO;
                        float32Val = 2.2222222d;
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
                put("adipisci", new java.util.HashMap<String, String>() {{
                    put("similique", "ut");
                    put("quidem", "quis");
                    put("beatae", "unde");
                    put("molestiae", "delectus");
                }});
                put("cupiditate", new java.util.HashMap<String, String>() {{
                    put("numquam", "numquam");
                }});
                put("nesciunt", new java.util.HashMap<String, String>() {{
                    put("officia", "dignissimos");
                    put("optio", "necessitatibus");
                    put("corporis", "qui");
                    put("expedita", "voluptatum");
                }});
                put("cupiditate", new java.util.HashMap<String, String>() {{
                    put("placeat", "enim");
                    put("neque", "in");
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
                put("eum", "modi");
                put("corporis", "magnam");
                put("voluptates", "maiores");
                put("tempore", "aperiam");
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

            org.openapis.openapi.models.shared.SimpleObject req = new SimpleObject("libero", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                bigint = 520875L;
                bigintStr = "occaecati";
                boolOpt = true;
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

            org.openapis.openapi.models.shared.SimpleObject req = new SimpleObject("voluptas", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                bigint = 795591L;
                bigintStr = "fuga";
                boolOpt = true;
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

            org.openapis.openapi.models.shared.SimpleObjectCamelCase req = new SimpleObjectCamelCase("nostrum", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222d, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                bigintStrVal = "delectus";
                bigintVal = 735894L;
                boolOptVal = true;
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

            org.openapis.openapi.models.shared.DeepObject req = new DeepObject("odit",                 new org.openapis.openapi.models.shared.SimpleObject[]{{
                                add(new SimpleObject("minima", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                                    any = "pariatur";
                                    bigint = 362888L;
                                    bigintStr = "reprehenderit";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    enum_ = Enum.TWO;
                                    float32 = 2.2222222d;
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
                                add(new SimpleObject("voluptate", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                                    any = "excepturi";
                                    bigint = 172195L;
                                    bigintStr = "error";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    enum_ = Enum.TWO;
                                    float32 = 2.2222222d;
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
                                add(new SimpleObject("officiis", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                                    any = "similique";
                                    bigint = 763165L;
                                    bigintStr = "ex";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    enum_ = Enum.TWO;
                                    float32 = 2.2222222d;
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
                                add(new SimpleObject("sint", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                                    any = "exercitationem";
                                    bigint = 463344L;
                                    bigintStr = "dolorem";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    enum_ = Enum.TWO;
                                    float32 = 2.2222222d;
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
                            }}, false, 918547L,                 new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                                put("dicta", new SimpleObject("dicta", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                                    any = "earum";
                                    bigint = 334474L;
                                    bigintStr = "animi";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    enum_ = Enum.TWO;
                                    float32 = 2.2222222d;
                                    int_ = 999999L;
                                    int32 = 1;
                                    int32Enum = SimpleObjectInt32Enum.FIFTY_FIVE;
                                    intEnum = SimpleObjectIntEnum.Third;
                                    intOptNull = 999999L;
                                    num = 1.1d;
                                    numOptNull = 1.1d;
                                    str = "example";
                                    strOpt = "optional example";
                                }});
                                put("nobis", new SimpleObject("laboriosam", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                                    any = "ipsa";
                                    bigint = 497357L;
                                    bigintStr = "maiores";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    enum_ = Enum.TWO;
                                    float32 = 2.2222222d;
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
                                put("excepturi", new SimpleObject("eligendi", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                                    any = "occaecati";
                                    bigint = 367917L;
                                    bigintStr = "aliquam";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    enum_ = Enum.TWO;
                                    float32 = 2.2222222d;
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
                            }}, 9449.5d,                 new SimpleObject("animi", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                                bigint = 564667L;
                                bigintStr = "odio";
                                boolOpt = true;
                                intOptNull = 999999L;
                                numOptNull = 1.1d;
                                strOpt = "optional example";
                            }};, "eaque") {{
                type = "saepe";
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
                put("quos", "iste");
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

            org.openapis.openapi.models.shared.SimpleObject req = new SimpleObject("assumenda", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                bigint = 244032L;
                bigintStr = "doloremque";
                boolOpt = true;
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

            org.openapis.openapi.models.shared.SimpleObject req = new SimpleObject("delectus", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                bigint = 216870L;
                bigintStr = "adipisci";
                boolOpt = true;
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

            RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON req = new RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON(false, 9031.5d, "deserunt");            

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

            RequestBodyPostMultipleContentTypesSplitParamFormResponse res = sdk.requestBodies.requestBodyPostMultipleContentTypesSplitParamForm(new RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded(false, 3330.72d, "libero") {{
                bool3 = false;
                num3 = 429.24d;
                str3 = "quis";
            }}, "architecto");

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

            RequestBodyPostMultipleContentTypesSplitParamJsonResponse res = sdk.requestBodies.requestBodyPostMultipleContentTypesSplitParamJson(new RequestBodyPostMultipleContentTypesSplitParamApplicationJSON(false, 7566.54d, "possimus") {{
                bool = false;
                num = 5845.93d;
                str = "molestiae";
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

            RequestBodyPostMultipleContentTypesSplitParamMultipartResponse res = sdk.requestBodies.requestBodyPostMultipleContentTypesSplitParamMultipart(new RequestBodyPostMultipleContentTypesSplitParamMultipartFormData(false, 1509.35d, "asperiores") {{
                bool2 = false;
                num2 = 2981.87d;
                str2 = "itaque";
            }}, "veniam");

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

            RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded req = new RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded(false, 1645.32d, "facere");            

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

            RequestBodyPostMultipleContentTypesSplitApplicationJSON req = new RequestBodyPostMultipleContentTypesSplitApplicationJSON(false, 5129.05d, "odit");            

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

            RequestBodyPostMultipleContentTypesSplitMultipartFormData req = new RequestBodyPostMultipleContentTypesSplitMultipartFormData(false, 8634.77d, "amet");            

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

            RequestBodyPutBytesWithParamsResponse res = sdk.requestBodies.requestBodyPutBytesWithParams("ab".getBytes(), "velit");

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

            org.openapis.openapi.models.shared.DeepObject req = new DeepObject("tempore",                 new org.openapis.openapi.models.shared.SimpleObject[]{{
                                add(new SimpleObject("quis", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                                    any = "voluptatibus";
                                    bigint = 310840L;
                                    bigintStr = "blanditiis";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    enum_ = Enum.TWO;
                                    float32 = 2.2222222d;
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
                                add(new SimpleObject("voluptatibus", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                                    any = "minus";
                                    bigint = 815200L;
                                    bigintStr = "facilis";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    enum_ = Enum.TWO;
                                    float32 = 2.2222222d;
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
                            }}, false, 891581L,                 new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                                put("rerum", new SimpleObject("est", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                                    any = "eos";
                                    bigint = 440777L;
                                    bigintStr = "nostrum";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    enum_ = Enum.TWO;
                                    float32 = 2.2222222d;
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
                                put("fugiat", new SimpleObject("error", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                                    any = "unde";
                                    bigint = 889448L;
                                    bigintStr = "ducimus";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    enum_ = Enum.TWO;
                                    float32 = 2.2222222d;
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
                            }}, 4915.91d,                 new SimpleObject("esse", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                                bigint = 134818L;
                                bigintStr = "enim";
                                boolOpt = true;
                                intOptNull = 999999L;
                                numOptNull = 1.1d;
                                strOpt = "optional example";
                            }};, "delectus") {{
                type = "iusto";
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
                file = new RequestBodyPutMultipartFileRequestBodyFile("dignissimos".getBytes(), "libero");;
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

            org.openapis.openapi.models.shared.SimpleObject req = new SimpleObject("illo", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                bigint = 879174L;
                bigintStr = "saepe";
                boolOpt = true;
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

            org.openapis.openapi.models.. req = "tempore"            

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

            RequestBodyPutStringWithParamsResponse res = sdk.requestBodies.requestBodyPutStringWithParams("veniam", "eos");

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

            org.openapis.openapi.models.shared.ReadWriteObjectInput req = new ReadWriteObjectInput(970079L, 939161L, 444121L);            

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

            org.openapis.openapi.models.shared.WriteOnlyObject req = new WriteOnlyObject(false, 5063.12d, "nemo");            

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

            org.openapis.openapi.models.shared.WriteOnlyObject req = new WriteOnlyObject(false, 9998.09d, "quisquam");            

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

