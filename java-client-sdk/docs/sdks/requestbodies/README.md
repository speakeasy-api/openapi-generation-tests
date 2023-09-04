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
                add(new SimpleObject("labore", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                    any = "totam";
                    bigint = 853940L;
                    bigintStr = "vel";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    decimal = 4976.78d;
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
                add(new SimpleObject("nemo", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                    any = "cum";
                    bigint = 414857L;
                    bigintStr = "in";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    decimal = 3605.45d;
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
                add(new SimpleObject("facere", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                    any = "aperiam";
                    bigint = 738683L;
                    bigintStr = "consectetur";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    decimal = 4490.83d;
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
                add(new SimpleObject("sunt", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                    any = "suscipit";
                    bigint = 968972L;
                    bigintStr = "quidem";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    decimal = 9049.49d;
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
                add(new SimpleObjectCamelCase("corporis", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                    anyVal = "amet";
                    bigintStrVal = "beatae";
                    bigintVal = 489509L;
                    boolOptVal = true;
                    boolVal = true;
                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    dateVal = LocalDate.parse("2020-01-01");
                    decimalVal = 9509.53d;
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
                add(new SimpleObject("aspernatur", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                    any = "voluptates";
                    bigint = 730709L;
                    bigintStr = "vitae";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    decimal = 8817.21d;
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
                add(new SimpleObjectCamelCase("blanditiis", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                    anyVal = "minima";
                    bigintStrVal = "nobis";
                    bigintVal = 680116L;
                    boolOptVal = true;
                    boolVal = true;
                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    dateVal = LocalDate.parse("2020-01-01");
                    decimalVal = 2378.07d;
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
                add(new SimpleObjectCamelCase("blanditiis", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                    anyVal = "aliquam";
                    bigintStrVal = "officiis";
                    bigintVal = 839189L;
                    boolOptVal = true;
                    boolVal = true;
                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    dateVal = LocalDate.parse("2020-01-01");
                    decimalVal = 3518.7d;
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
                    add(new SimpleObject("sit", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                        any = "corrupti";
                        bigint = 867290L;
                        bigintStr = "totam";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 9402.1d;
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
                    add(new SimpleObject("ab", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                        any = "reiciendis";
                        bigint = 131852L;
                        bigintStr = "asperiores";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 7079.18d;
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
                    add(new SimpleObject("voluptas", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                        any = "laborum";
                        bigint = 152354L;
                        bigintStr = "in";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 4174.86d;
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
                    add(new SimpleObjectCamelCase("incidunt", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                        anyVal = "debitis";
                        bigintStrVal = "illo";
                        bigintVal = 967795L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 193d;
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
                    add(new SimpleObjectCamelCase("voluptatibus", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                        anyVal = "eius";
                        bigintStrVal = "necessitatibus";
                        bigintVal = 215529L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 4067.33d;
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
                    add(new SimpleObjectCamelCase("praesentium", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                        anyVal = "voluptate";
                        bigintStrVal = "reiciendis";
                        bigintVal = 401713L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 254.97d;
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
                    add(new SimpleObjectCamelCase("error", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                        anyVal = "incidunt";
                        bigintStrVal = "ipsam";
                        bigintVal = 894864L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 5249.7d;
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
                }}),
                add(new org.openapis.openapi.models.shared.SimpleObjectCamelCase[]{{
                    add(new SimpleObjectCamelCase("veniam", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                        anyVal = "reiciendis";
                        bigintStrVal = "nulla";
                        bigintVal = 168576L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 486.9d;
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
                    add(new SimpleObjectCamelCase("dolorum", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                        anyVal = "beatae";
                        bigintStrVal = "laudantium";
                        bigintVal = 348476L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 5106.29d;
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
                    add(new SimpleObjectCamelCase("officia", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                        anyVal = "hic";
                        bigintStrVal = "expedita";
                        bigintVal = 892863L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 2049.23d;
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
                    add(new SimpleObjectCamelCase("voluptatem", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                        anyVal = "accusamus";
                        bigintStrVal = "tempora";
                        bigintVal = 543678L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 1482.68d;
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
                add(new String[]{{
                    add("sit"),
                    add("voluptatum"),
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
                    put("corporis", new SimpleObject("nostrum", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                        any = "et";
                        bigint = 502710L;
                        bigintStr = "ex";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 1536.27d;
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
                    put("consequatur", new SimpleObject("occaecati", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                        any = "incidunt";
                        bigint = 968865L;
                        bigintStr = "dolorem";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 6908.94d;
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
                    put("atque", new SimpleObject("deserunt", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                        any = "laborum";
                        bigint = 724148L;
                        bigintStr = "tenetur";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 3888.67d;
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
                    put("reiciendis", new SimpleObject("quidem", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                        any = "provident";
                        bigint = 833819L;
                        bigintStr = "delectus";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 9147.91d;
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
                    }});
                }}),
                add(new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                    put("praesentium", new SimpleObject("atque", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                        any = "mollitia";
                        bigint = 333965L;
                        bigintStr = "voluptatem";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 7908.4d;
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
                    put("totam", new SimpleObject("assumenda", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                        any = "suscipit";
                        bigint = 693957L;
                        bigintStr = "maxime";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 908.85d;
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
                    put("error", new SimpleObject("ex", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                        any = "officiis";
                        bigint = 886961L;
                        bigintStr = "accusamus";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 6188.26d;
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
                }}),
                add(new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                    put("error", new SimpleObject("recusandae", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                        any = "blanditiis";
                        bigint = 379356L;
                        bigintStr = "repudiandae";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 5421.29d;
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
                    put("labore", new SimpleObject("dolores", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                        any = "reiciendis";
                        bigint = 42976L;
                        bigintStr = "repudiandae";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 1160.98d;
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
                    put("velit", new SimpleObject("officiis", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                        any = "a";
                        bigint = 562783L;
                        bigintStr = "magnam";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 9063.55d;
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
                    put("adipisci", new SimpleObject("reprehenderit", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                        any = "eveniet";
                        bigint = 580887L;
                        bigintStr = "consequuntur";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 1458.7d;
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
                    put("eveniet", new SimpleObjectCamelCase("quae", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                        anyVal = "non";
                        bigintStrVal = "vero";
                        bigintVal = 39615L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 4341.56d;
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
                    put("qui", new SimpleObjectCamelCase("voluptatum", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                        anyVal = "cum";
                        bigintStrVal = "iure";
                        bigintVal = 898063L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 1875.52d;
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
                    put("ad", new SimpleObjectCamelCase("voluptas", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                        anyVal = "repellat";
                        bigintStrVal = "alias";
                        bigintVal = 362189L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 5973.03d;
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
                add(new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>() {{
                    put("dolores", new SimpleObjectCamelCase("recusandae", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                        anyVal = "id";
                        bigintStrVal = "minima";
                        bigintVal = 293144L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 6803.49d;
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
                    put("molestiae", new SimpleObjectCamelCase("eum", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                        anyVal = "ex";
                        bigintStrVal = "ut";
                        bigintVal = 633062L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 2384.13d;
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
                    put("esse", new SimpleObjectCamelCase("ullam", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                        anyVal = "provident";
                        bigintStrVal = "quis";
                        bigintVal = 431785L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 9704.94d;
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
                    put("nostrum", new SimpleObjectCamelCase("accusantium", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                        anyVal = "mollitia";
                        bigintStrVal = "provident";
                        bigintVal = 821719L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 6591.77d;
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
                add("in"),
                add("nam"),
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

            org.openapis.openapi.models.shared.DeepObject req = new DeepObject("officia",                 new org.openapis.openapi.models.shared.SimpleObject[]{{
                                add(new SimpleObject("cumque", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                                    any = "placeat";
                                    bigint = 266697L;
                                    bigintStr = "voluptatibus";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    decimal = 5640.64d;
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
                                add(new SimpleObject("perferendis", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                                    any = "tempora";
                                    bigint = 335498L;
                                    bigintStr = "inventore";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    decimal = 1476.85d;
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
                                add(new SimpleObject("sapiente", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                                    any = "eum";
                                    bigint = 260628L;
                                    bigintStr = "rem";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    decimal = 8710.83d;
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
                            }}, false, 325118L,                 new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                                put("cupiditate", new SimpleObject("earum", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                                    any = "provident";
                                    bigint = 936469L;
                                    bigintStr = "soluta";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    decimal = 9407.82d;
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
                            }}, 8918.01d,                 new SimpleObject("aliquid", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                                bigint = 211534L;
                                bigintStr = "fugit";
                                boolOpt = true;
                                decimal = 7649.95d;
                                intOptNull = 999999L;
                                numOptNull = 1.1d;
                                strOpt = "optional example";
                            }};, "fuga") {{
                type = "ratione";
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

            org.openapis.openapi.models.shared.DeepObjectCamelCase req = new DeepObjectCamelCase("necessitatibus",                 new org.openapis.openapi.models.shared.SimpleObjectCamelCase[]{{
                                add(new SimpleObjectCamelCase("suscipit", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                                    anyVal = "consequatur";
                                    bigintStrVal = "quasi";
                                    bigintVal = 90233L;
                                    boolOptVal = true;
                                    boolVal = true;
                                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    dateVal = LocalDate.parse("2020-01-01");
                                    decimalVal = 4977.77d;
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
                                add(new SimpleObjectCamelCase("nihil", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                                    anyVal = "magni";
                                    bigintStrVal = "doloribus";
                                    bigintVal = 859581L;
                                    boolOptVal = true;
                                    boolVal = true;
                                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    dateVal = LocalDate.parse("2020-01-01");
                                    decimalVal = 8965.82d;
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
                                }}),
                                add(new SimpleObjectCamelCase("architecto", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                                    anyVal = "iusto";
                                    bigintStrVal = "esse";
                                    bigintVal = 508390L;
                                    boolOptVal = true;
                                    boolVal = true;
                                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    dateVal = LocalDate.parse("2020-01-01");
                                    decimalVal = 9799.63d;
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
                                add(new SimpleObjectCamelCase("aliquid", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                                    anyVal = "dicta";
                                    bigintStrVal = "odio";
                                    bigintVal = 271252L;
                                    boolOptVal = true;
                                    boolVal = true;
                                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    dateVal = LocalDate.parse("2020-01-01");
                                    decimalVal = 4582.59d;
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
                            }}, false, 123844L,                 new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>() {{
                                put("fugiat", new SimpleObjectCamelCase("eum", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                                    anyVal = "expedita";
                                    bigintStrVal = "aliquid";
                                    bigintVal = 639187L;
                                    boolOptVal = true;
                                    boolVal = true;
                                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    dateVal = LocalDate.parse("2020-01-01");
                                    decimalVal = 3813.97d;
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
                                put("id", new SimpleObjectCamelCase("libero", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                                    anyVal = "ab";
                                    bigintStrVal = "error";
                                    bigintVal = 822407L;
                                    boolOptVal = true;
                                    boolVal = true;
                                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    dateVal = LocalDate.parse("2020-01-01");
                                    decimalVal = 9139.92d;
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
                                }});
                            }}, 3162.2d,                 new SimpleObjectCamelCase("vitae", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                                bigintStrVal = "quo";
                                bigintVal = 405373L;
                                boolOptVal = true;
                                decimalVal = 2811.53d;
                                intOptNullVal = 999999L;
                                numOptNullVal = 1.1d;
                                strOptVal = "optional example";
                            }};, "ad") {{
                type = "expedita";
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
                put("molestias", new SimpleObject("rerum", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                    any = "cum";
                    bigint = 399660L;
                    bigintStr = "beatae";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    decimal = 5308.6d;
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
                put("sapiente", new SimpleObjectCamelCase("alias", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                    anyVal = "officiis";
                    bigintStrVal = "architecto";
                    bigintVal = 682119L;
                    boolOptVal = true;
                    boolVal = true;
                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    dateVal = LocalDate.parse("2020-01-01");
                    decimalVal = 8671.68d;
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
                put("sapiente", new SimpleObject("perferendis", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                    any = "rem";
                    bigint = 796320L;
                    bigintStr = "nemo";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    decimal = 9920.74d;
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
                put("impedit", new SimpleObject("inventore", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                    any = "quibusdam";
                    bigint = 720528L;
                    bigintStr = "ipsam";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    decimal = 6334.15d;
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
                put("dolor", new SimpleObjectCamelCase("laudantium", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                    anyVal = "consequatur";
                    bigintStrVal = "architecto";
                    bigintVal = 24944L;
                    boolOptVal = true;
                    boolVal = true;
                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    dateVal = LocalDate.parse("2020-01-01");
                    decimalVal = 2650.39d;
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
                put("fugiat", new SimpleObjectCamelCase("officiis", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                    anyVal = "ipsam";
                    bigintStrVal = "consequuntur";
                    bigintVal = 55107L;
                    boolOptVal = true;
                    boolVal = true;
                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    dateVal = LocalDate.parse("2020-01-01");
                    decimalVal = 5596.82d;
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
                put("veniam", new org.openapis.openapi.models.shared.SimpleObject[]{{
                    add(new SimpleObject("ab", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                        any = "expedita";
                        bigint = 432984L;
                        bigintStr = "vel";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 5282.34d;
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
                put("laboriosam", new org.openapis.openapi.models.shared.SimpleObjectCamelCase[]{{
                    add(new SimpleObjectCamelCase("at", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                        anyVal = "consequuntur";
                        bigintStrVal = "voluptatem";
                        bigintVal = 350207L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 8956.92d;
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
                    }}),
                    add(new SimpleObjectCamelCase("nemo", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Second, 999999L, 1.1d, "example") {{
                        anyVal = "harum";
                        bigintStrVal = "sequi";
                        bigintVal = 987349L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 9180.92d;
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
                    add(new SimpleObjectCamelCase("aspernatur", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                        anyVal = "officia";
                        bigintStrVal = "voluptas";
                        bigintVal = 254025L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 3649.12d;
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
                    add(new SimpleObjectCamelCase("dicta", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                        anyVal = "fuga";
                        bigintStrVal = "laudantium";
                        bigintVal = 277340L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 974.93d;
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
                }});
                put("consectetur", new org.openapis.openapi.models.shared.SimpleObjectCamelCase[]{{
                    add(new SimpleObjectCamelCase("occaecati", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                        anyVal = "cupiditate";
                        bigintStrVal = "reiciendis";
                        bigintVal = 746837L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 38.6d;
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
                }});
                put("inventore", new org.openapis.openapi.models.shared.SimpleObjectCamelCase[]{{
                    add(new SimpleObjectCamelCase("praesentium", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                        anyVal = "accusamus";
                        bigintStrVal = "voluptatibus";
                        bigintVal = 719620L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 6085.93d;
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
                    add(new SimpleObjectCamelCase("earum", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                        anyVal = "temporibus";
                        bigintStrVal = "quos";
                        bigintVal = 415280L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 9308.19d;
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
                    add(new SimpleObjectCamelCase("non", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.First, 999999L, 1.1d, "example") {{
                        anyVal = "vero";
                        bigintStrVal = "voluptatem";
                        bigintVal = 371919L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 4259.46d;
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
                    }}),
                }});
                put("sint", new org.openapis.openapi.models.shared.SimpleObjectCamelCase[]{{
                    add(new SimpleObjectCamelCase("sint", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                        anyVal = "deserunt";
                        bigintStrVal = "esse";
                        bigintVal = 364463L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 4445.87d;
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
                    add(new SimpleObjectCamelCase("delectus", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                        anyVal = "hic";
                        bigintStrVal = "necessitatibus";
                        bigintVal = 991891L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 4043.06d;
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
                    add(new SimpleObjectCamelCase("impedit", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                        anyVal = "fuga";
                        bigintStrVal = "laborum";
                        bigintVal = 231070L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 2448.89d;
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
                    add(new SimpleObjectCamelCase("dignissimos", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.FIFTY_FIVE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                        anyVal = "repudiandae";
                        bigintStrVal = "nam";
                        bigintVal = 294076L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 4828.92d;
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
                put("quibusdam", new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                    put("odit", new SimpleObject("libero", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                        any = "voluptatibus";
                        bigint = 426904L;
                        bigintStr = "magnam";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 8428.55d;
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
                    }});
                    put("quia", new SimpleObject("ea", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                        any = "porro";
                        bigint = 304198L;
                        bigintStr = "velit";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 753.59d;
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
                }});
                put("excepturi", new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                    put("velit", new SimpleObject("iste", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                        any = "ut";
                        bigint = 596433L;
                        bigintStr = "earum";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 1175.25d;
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
                    put("nisi", new SimpleObject("sit", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                        any = "itaque";
                        bigint = 242178L;
                        bigintStr = "laborum";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 2503.98d;
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
                }});
                put("officia", new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                    put("ea", new SimpleObject("deleniti", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                        any = "quidem";
                        bigint = 377406L;
                        bigintStr = "facilis";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 8093.65d;
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
                    put("ullam", new SimpleObject("est", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                        any = "unde";
                        bigint = 897543L;
                        bigintStr = "animi";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 7699.67d;
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
                    put("labore", new SimpleObject("ad", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                        any = "veritatis";
                        bigint = 874400L;
                        bigintStr = "consectetur";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 1124.27d;
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
                    put("ex", new SimpleObject("fugit", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                        any = "nemo";
                        bigint = 745233L;
                        bigintStr = "libero";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 5269.07d;
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
                put("quae", new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>() {{
                    put("modi", new SimpleObjectCamelCase("nulla", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                        anyVal = "neque";
                        bigintStrVal = "exercitationem";
                        bigintVal = 932394L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 882.48d;
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
                }});
                put("quia", new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>() {{
                    put("nostrum", new SimpleObjectCamelCase("officia", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.SIXTY_NINE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                        anyVal = "omnis";
                        bigintStrVal = "libero";
                        bigintVal = 115661L;
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        decimalVal = 6633.18d;
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
                put("iusto", new java.util.HashMap<String, String>() {{
                    put("voluptates", "inventore");
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
                put("totam", "dolore");
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

            org.openapis.openapi.models.shared.SimpleObject req = new SimpleObject("eligendi", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                bigint = 418109L;
                bigintStr = "esse";
                boolOpt = true;
                decimal = 1729.51d;
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

            org.openapis.openapi.models.shared.SimpleObject req = new SimpleObject("assumenda", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                bigint = 817339L;
                bigintStr = "corrupti";
                boolOpt = true;
                decimal = 4731.43d;
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

            org.openapis.openapi.models.shared.SimpleObjectCamelCase req = new SimpleObjectCamelCase("provident", true, OffsetDateTime.parse("2020-01-01T00:00:00Z"), LocalDate.parse("2020-01-01"), Enum.TWO, 2.2222222f, SimpleObjectCamelCaseInt32EnumVal.ONE_HUNDRED_AND_EIGHTY_ONE, 1, SimpleObjectCamelCaseIntEnumVal.Third, 999999L, 1.1d, "example") {{
                bigintStrVal = "tempore";
                bigintVal = 575078L;
                boolOptVal = true;
                decimalVal = 4097.26d;
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

            org.openapis.openapi.models.shared.DeepObject req = new DeepObject(                new SimpleObject("cum", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                                any = "ipsam";
                                bigint = 702952L;
                                bigintStr = "laudantium";
                                bool = true;
                                boolOpt = true;
                                date = LocalDate.parse("2020-01-01");
                                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                decimal = 3572.07d;
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
                            }},                 new org.openapis.openapi.models.shared.SimpleObject[]{{
                                add(new SimpleObject("eos", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                                    any = "quidem";
                                    bigint = 684126L;
                                    bigintStr = "repudiandae";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    decimal = 340.7d;
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
                            }}, false, 510128L,                 new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                                put("explicabo", new SimpleObject("ut", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                                    any = "corporis";
                                    bigint = 621473L;
                                    bigintStr = "earum";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    decimal = 2393.37d;
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
                            }}, 1062.55d,                 new SimpleObject("unde", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                                bigint = 585593L;
                                bigintStr = "fugit";
                                boolOpt = true;
                                decimal = 2536.25d;
                                intOptNull = 999999L;
                                numOptNull = 1.1d;
                                strOpt = "optional example";
                            }};, "numquam") {{
                type = "nesciunt";
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
                put("officia", "dignissimos");
                put("optio", "necessitatibus");
                put("corporis", "qui");
                put("expedita", "voluptatum");
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

            org.openapis.openapi.models.shared.SimpleObject req = new SimpleObject("cupiditate", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                bigint = 316542L;
                bigintStr = "neque";
                boolOpt = true;
                decimal = 4468.77d;
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

            org.openapis.openapi.models.shared.SimpleObject req = new SimpleObject("minus", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                bigint = 357347L;
                bigintStr = "magnam";
                boolOpt = true;
                decimal = 9149.71d;
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

            RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON req = new RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON(false, 9781.73d, "tempore");            

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

            RequestBodyPostMultipleContentTypesSplitParamFormResponse res = sdk.requestBodies.requestBodyPostMultipleContentTypesSplitParamForm(new RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded(false, 1897.53d, "labore") {{
                bool3 = false;
                num3 = 460.13d;
                str3 = "libero";
            }}, "totam");

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

            RequestBodyPostMultipleContentTypesSplitParamJsonResponse res = sdk.requestBodies.requestBodyPostMultipleContentTypesSplitParamJson(new RequestBodyPostMultipleContentTypesSplitParamApplicationJSON(false, 7791.8d, "velit") {{
                bool = false;
                num = 5777.09d;
                str = "voluptas";
            }}, "minus");

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

            RequestBodyPostMultipleContentTypesSplitParamMultipartResponse res = sdk.requestBodies.requestBodyPostMultipleContentTypesSplitParamMultipart(new RequestBodyPostMultipleContentTypesSplitParamMultipartFormData(false, 6692.37d, "impedit") {{
                bool2 = false;
                num2 = 6845.53d;
                str2 = "nostrum";
            }}, "delectus");

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

            RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded req = new RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded(false, 7358.94d, "vero");            

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

            RequestBodyPostMultipleContentTypesSplitApplicationJSON req = new RequestBodyPostMultipleContentTypesSplitApplicationJSON(false, 1415.06d, "repellat");            

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

            RequestBodyPostMultipleContentTypesSplitMultipartFormData req = new RequestBodyPostMultipleContentTypesSplitMultipartFormData(false, 8659.46d, "nemo");            

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
                add("aperiam"),
                add("odio"),
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
                put("in", "ducimus");
                put("excepturi", "dolores");
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

            org.openapis.openapi.models.. req = "error".getBytes()            

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

            RequestBodyPutBytesWithParamsResponse res = sdk.requestBodies.requestBodyPutBytesWithParams("veritatis".getBytes(), "ducimus");

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

            org.openapis.openapi.models.shared.DeepObject req = new DeepObject(                new SimpleObject("commodi", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                                any = "pariatur";
                                bigint = 932666L;
                                bigintStr = "similique";
                                bool = true;
                                boolOpt = true;
                                date = LocalDate.parse("2020-01-01");
                                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                decimal = 7631.65d;
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
                            }},                 new org.openapis.openapi.models.shared.SimpleObject[]{{
                                add(new SimpleObject("vero", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                                    any = "exercitationem";
                                    bigint = 463344L;
                                    bigintStr = "dolorem";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    decimal = 2646.19d;
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
                                add(new SimpleObject("nam", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                                    any = "cum";
                                    bigint = 120120L;
                                    bigintStr = "earum";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    decimal = 3344.74d;
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
                                add(new SimpleObject("quasi", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                                    any = "necessitatibus";
                                    bigint = 748224L;
                                    bigintStr = "ipsa";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    decimal = 4973.57d;
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
                            }}, false, 729448L,                 new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                                put("occaecati", new SimpleObject("enim", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                                    any = "nemo";
                                    bigint = 306382L;
                                    bigintStr = "nostrum";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    decimal = 9887.49d;
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
                                put("quas", new SimpleObject("quos", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                                    any = "totam";
                                    bigint = 564667L;
                                    bigintStr = "odio";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    decimal = 511.7d;
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
                                put("tempore", new SimpleObject("ipsum", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                                    any = "libero";
                                    bigint = 244032L;
                                    bigintStr = "doloremque";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    decimal = 9639.76d;
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
                            }}, 6444.2d,                 new SimpleObject("doloremque", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                                bigint = 727481L;
                                bigintStr = "architecto";
                                boolOpt = true;
                                decimal = 5845.93d;
                                intOptNull = 999999L;
                                numOptNull = 1.1d;
                                strOpt = "optional example";
                            }};, "molestiae") {{
                type = "eligendi";
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
                file = new RequestBodyPutMultipartFileRequestBodyFile("possimus".getBytes(), "non");;
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

            org.openapis.openapi.models.shared.SimpleObject req = new SimpleObject("magnam", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                bigint = 993002L;
                bigintStr = "veniam";
                boolOpt = true;
                decimal = 1645.32d;
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

            org.openapis.openapi.models.. req = "facere"            

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

            RequestBodyPutStringWithParamsResponse res = sdk.requestBodies.requestBodyPutStringWithParams("laudantium", "odit");

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

            org.openapis.openapi.models.shared.ReadWriteObjectInput req = new ReadWriteObjectInput(863477L, 227362L, 347698L);            

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

            org.openapis.openapi.models.shared.WriteOnlyObject req = new WriteOnlyObject(false, 688.52d, "velit");            

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

            org.openapis.openapi.models.shared.WriteOnlyObject req = new WriteOnlyObject(false, 7057.1d, "tempore");            

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

