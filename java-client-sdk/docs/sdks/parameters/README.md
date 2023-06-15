# parameters

## Overview

Endpoints for testing parameters.

### Available Operations

* [deepObjectQueryParamsMap](#deepobjectqueryparamsmap)
* [deepObjectQueryParamsObject](#deepobjectqueryparamsobject)
* [formQueryParamsArray](#formqueryparamsarray)
* [formQueryParamsMap](#formqueryparamsmap)
* [formQueryParamsObject](#formqueryparamsobject)
* [formQueryParamsPrimitive](#formqueryparamsprimitive)
* [formQueryParamsRefParamObject](#formqueryparamsrefparamobject)
* [headerParamsArray](#headerparamsarray)
* [headerParamsMap](#headerparamsmap)
* [headerParamsObject](#headerparamsobject)
* [headerParamsPrimitive](#headerparamsprimitive)
* [jsonQueryParamsObject](#jsonqueryparamsobject)
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

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.DeepObjectQueryParamsMapRequest;
import org.openapis.openapi.models.operations.DeepObjectQueryParamsMapResponse;
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

            DeepObjectQueryParamsMapResponse res = sdk.parameters.deepObjectQueryParamsMap(new java.util.HashMap<String, String>() {{
                put("tempore", "accusamus");
            }}, new java.util.HashMap<String, String[]>() {{
                put("enim", new String[]{{
                    add("sapiente"),
                }});
                put("totam", new String[]{{
                    add("sit"),
                    add("expedita"),
                }});
            }});

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

| Parameter                   | Type                        | Required                    | Description                 |
| --------------------------- | --------------------------- | --------------------------- | --------------------------- |
| `mapParam`                  | Map<String, *String*>       | :heavy_check_mark:          | N/A                         |
| `mapArrParam`               | Map<String, List<*String*>> | :heavy_minus_sign:          | N/A                         |


### Response

**[org.openapis.openapi.models.operations.DeepObjectQueryParamsMapResponse](../../models/operations/DeepObjectQueryParamsMapResponse.md)**


## deepObjectQueryParamsObject

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.DeepObjectQueryParamsObjectObjArrParam;
import org.openapis.openapi.models.operations.DeepObjectQueryParamsObjectRequest;
import org.openapis.openapi.models.operations.DeepObjectQueryParamsObjectResponse;
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

            DeepObjectQueryParamsObjectResponse res = sdk.parameters.deepObjectQueryParamsObject(new SimpleObject("deserunt", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                any = "neque";
                bigint = 153694L;
                bigintStr = "vel";
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
            }}, new DeepObjectQueryParamsObjectObjArrParam() {{
                arr = new String[]{{
                    add("qui"),
                    add("cupiditate"),
                }};
            }});

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
| `objParam`                                                                                                                                         | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md)                                                             | :heavy_check_mark:                                                                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties.                                                 |
| `objArrParam`                                                                                                                                      | [org.openapis.openapi.models.operations.DeepObjectQueryParamsObjectObjArrParam](../../models/operations/DeepObjectQueryParamsObjectObjArrParam.md) | :heavy_minus_sign:                                                                                                                                 | N/A                                                                                                                                                |


### Response

**[org.openapis.openapi.models.operations.DeepObjectQueryParamsObjectResponse](../../models/operations/DeepObjectQueryParamsObjectResponse.md)**


## formQueryParamsArray

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.FormQueryParamsArrayRequest;
import org.openapis.openapi.models.operations.FormQueryParamsArrayResponse;
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

            FormQueryParamsArrayResponse res = sdk.parameters.formQueryParamsArray(new String[]{{
                add("pariatur"),
                add("soluta"),
                add("dicta"),
                add("laborum"),
            }}, new Long[]{{
                add(276894L),
                add(132068L),
                add(174909L),
            }});

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
| `arrParam`         | List<*String*>     | :heavy_minus_sign: | N/A                |
| `arrParamExploded` | List<*Long*>       | :heavy_minus_sign: | N/A                |


### Response

**[org.openapis.openapi.models.operations.FormQueryParamsArrayResponse](../../models/operations/FormQueryParamsArrayResponse.md)**


## formQueryParamsMap

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.FormQueryParamsMapRequest;
import org.openapis.openapi.models.operations.FormQueryParamsMapResponse;
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

            FormQueryParamsMapResponse res = sdk.parameters.formQueryParamsMap(new java.util.HashMap<String, String>() {{
                put("facilis", "aliquid");
                put("quam", "molestias");
                put("temporibus", "qui");
            }}, new java.util.HashMap<String, Long>() {{
                put("fugit", 164959L);
            }});

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

| Parameter             | Type                  | Required              | Description           |
| --------------------- | --------------------- | --------------------- | --------------------- |
| `mapParam`            | Map<String, *String*> | :heavy_minus_sign:    | N/A                   |
| `mapParamExploded`    | Map<String, *Long*>   | :heavy_minus_sign:    | N/A                   |


### Response

**[org.openapis.openapi.models.operations.FormQueryParamsMapResponse](../../models/operations/FormQueryParamsMapResponse.md)**


## formQueryParamsObject

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.FormQueryParamsObjectRequest;
import org.openapis.openapi.models.operations.FormQueryParamsObjectResponse;
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

            FormQueryParamsObjectResponse res = sdk.parameters.formQueryParamsObject(new SimpleObject("voluptatem", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                any = "odio";
                bigint = 124833L;
                bigintStr = "ullam";
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
            }}, new SimpleObject("nobis", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                any = "nobis";
                bigint = 92596L;
                bigintStr = "saepe";
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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `objParamExploded`                                                                                 | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md)             | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `objParam`                                                                                         | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md)             | :heavy_minus_sign:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[org.openapis.openapi.models.operations.FormQueryParamsObjectResponse](../../models/operations/FormQueryParamsObjectResponse.md)**


## formQueryParamsPrimitive

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.FormQueryParamsPrimitiveRequest;
import org.openapis.openapi.models.operations.FormQueryParamsPrimitiveResponse;
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

            FormQueryParamsPrimitiveResponse res = sdk.parameters.formQueryParamsPrimitive(false, 584476L, 456.14d, "delectus");

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
| `boolParam`        | *Boolean*          | :heavy_check_mark: | N/A                |
| `intParam`         | *Long*             | :heavy_check_mark: | N/A                |
| `numParam`         | *Double*           | :heavy_check_mark: | N/A                |
| `strParam`         | *String*           | :heavy_check_mark: | N/A                |


### Response

**[org.openapis.openapi.models.operations.FormQueryParamsPrimitiveResponse](../../models/operations/FormQueryParamsPrimitiveResponse.md)**


## formQueryParamsRefParamObject

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.FormQueryParamsRefParamObjectRequest;
import org.openapis.openapi.models.operations.FormQueryParamsRefParamObjectResponse;
import org.openapis.openapi.models.shared.RefQueryParamObj;
import org.openapis.openapi.models.shared.RefQueryParamObjExploded;
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

            FormQueryParamsRefParamObjectResponse res = sdk.parameters.formQueryParamsRefParamObject(new RefQueryParamObj(false, 240829L, 6772.63d, "architecto") {{
                bool = false;
                int_ = 209157L;
                num = 2921.47d;
                str = "labore";
            }}, new RefQueryParamObjExploded(false, 929530L, 92.4d, "est") {{
                bool = false;
                int_ = 63038L;
                num = 164.29d;
                str = "quas";
            }});

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

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `refObjParam`                                                                                                  | [org.openapis.openapi.models.shared.RefQueryParamObj](../../models/shared/RefQueryParamObj.md)                 | :heavy_minus_sign:                                                                                             | N/A                                                                                                            |
| `refObjParamExploded`                                                                                          | [org.openapis.openapi.models.shared.RefQueryParamObjExploded](../../models/shared/RefQueryParamObjExploded.md) | :heavy_minus_sign:                                                                                             | N/A                                                                                                            |


### Response

**[org.openapis.openapi.models.operations.FormQueryParamsRefParamObjectResponse](../../models/operations/FormQueryParamsRefParamObjectResponse.md)**


## headerParamsArray

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.HeaderParamsArrayRequest;
import org.openapis.openapi.models.operations.HeaderParamsArrayResponse;
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

            HeaderParamsArrayResponse res = sdk.parameters.headerParamsArray(new String[]{{
                add("porro"),
                add("doloribus"),
                add("ut"),
                add("facilis"),
            }});

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
| `xHeaderArray`     | List<*String*>     | :heavy_check_mark: | N/A                |


### Response

**[org.openapis.openapi.models.operations.HeaderParamsArrayResponse](../../models/operations/HeaderParamsArrayResponse.md)**


## headerParamsMap

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.HeaderParamsMapRequest;
import org.openapis.openapi.models.operations.HeaderParamsMapResponse;
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

            HeaderParamsMapResponse res = sdk.parameters.headerParamsMap(new java.util.HashMap<String, String>() {{
                put("qui", "quae");
                put("laudantium", "odio");
                put("occaecati", "voluptatibus");
            }}, new java.util.HashMap<String, String>() {{
                put("vero", "omnis");
                put("quis", "ipsum");
                put("delectus", "voluptate");
                put("consectetur", "vero");
            }});

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

| Parameter             | Type                  | Required              | Description           |
| --------------------- | --------------------- | --------------------- | --------------------- |
| `xHeaderMap`          | Map<String, *String*> | :heavy_check_mark:    | N/A                   |
| `xHeaderMapExplode`   | Map<String, *String*> | :heavy_check_mark:    | N/A                   |


### Response

**[org.openapis.openapi.models.operations.HeaderParamsMapResponse](../../models/operations/HeaderParamsMapResponse.md)**


## headerParamsObject

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.HeaderParamsObjectRequest;
import org.openapis.openapi.models.operations.HeaderParamsObjectResponse;
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

            HeaderParamsObjectResponse res = sdk.parameters.headerParamsObject(new SimpleObject("odio", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                any = "tenetur";
                bigint = 492268L;
                bigintStr = "hic";
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
            }}, new SimpleObject("sequi", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                any = "vero";
                bigint = 498140L;
                bigintStr = "dolore";
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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `xHeaderObj`                                                                                       | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md)             | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `xHeaderObjExplode`                                                                                | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md)             | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[org.openapis.openapi.models.operations.HeaderParamsObjectResponse](../../models/operations/HeaderParamsObjectResponse.md)**


## headerParamsPrimitive

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.HeaderParamsPrimitiveRequest;
import org.openapis.openapi.models.operations.HeaderParamsPrimitiveResponse;
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

            HeaderParamsPrimitiveResponse res = sdk.parameters.headerParamsPrimitive(false, 13236L, 9742.59d, "exercitationem");

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
| `xHeaderBoolean`   | *Boolean*          | :heavy_check_mark: | N/A                |
| `xHeaderInteger`   | *Long*             | :heavy_check_mark: | N/A                |
| `xHeaderNumber`    | *Double*           | :heavy_check_mark: | N/A                |
| `xHeaderString`    | *String*           | :heavy_check_mark: | N/A                |


### Response

**[org.openapis.openapi.models.operations.HeaderParamsPrimitiveResponse](../../models/operations/HeaderParamsPrimitiveResponse.md)**


## jsonQueryParamsObject

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.JsonQueryParamsObjectRequest;
import org.openapis.openapi.models.operations.JsonQueryParamsObjectResponse;
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

            JsonQueryParamsObjectResponse res = sdk.parameters.jsonQueryParamsObject(new DeepObject("nulla",                 new org.openapis.openapi.models.shared.SimpleObject[]{{
                                add(new SimpleObject("provident", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                                    any = "libero";
                                    bigint = 96549L;
                                    bigintStr = "tempora";
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
                                add(new SimpleObject("rem", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                                    any = "magnam";
                                    bigint = 487935L;
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
                                    intEnum = SimpleObjectIntEnum.Second;
                                    intOptNull = 999999L;
                                    num = 1.1d;
                                    numOptNull = 1.1d;
                                    str = "example";
                                    strOpt = "optional example";
                                }}),
                            }}, false, 695626L,                 new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                                put("ut", new SimpleObject("quisquam", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                                    any = "eum";
                                    bigint = 379927L;
                                    bigintStr = "assumenda";
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
                                put("id", new SimpleObject("fuga", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                                    any = "quidem";
                                    bigint = 206594L;
                                    bigintStr = "quo";
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
                                put("voluptas", new SimpleObject("ipsam", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                                    any = "ab";
                                    bigint = 587600L;
                                    bigintStr = "consequatur";
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
                                put("quo", new SimpleObject("dignissimos", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                                    any = "esse";
                                    bigint = 925164L;
                                    bigintStr = "aperiam";
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
                            }}, 5188.35d,                 new SimpleObject("accusamus", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                                bigint = 577543L;
                                bigintStr = "commodi";
                                boolOpt = true;
                                intOptNull = 999999L;
                                numOptNull = 1.1d;
                                strOpt = "optional example";
                            }};, "sapiente") {{
                any = "fugit";
                arr = new org.openapis.openapi.models.shared.SimpleObject[]{{
                    add(new SimpleObject("alias", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                        any = "maiores";
                        bigint = 985033L;
                        bigintStr = "iusto";
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
                    add(new SimpleObject("magnam", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                        any = "ipsam";
                        bigint = 410492L;
                        bigintStr = "aspernatur";
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
                    add(new SimpleObject("ex", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                        any = "laudantium";
                        bigint = 120657L;
                        bigintStr = "dolor";
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
                    }}),
                    add(new SimpleObject("ea", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                        any = "voluptatibus";
                        bigint = 343605L;
                        bigintStr = "sapiente";
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
                }};
                bool = false;
                int_ = 333145L;
                map = new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                    put("inventore", new SimpleObject("aspernatur", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                        any = "magnam";
                        bigint = 407241L;
                        bigintStr = "quo";
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
                    put("a", new SimpleObject("aliquam", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                        any = "libero";
                        bigint = 13948L;
                        bigintStr = "aut";
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
                }};
                num = 795.22d;
                obj = new SimpleObject("velit", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                    any = "non";
                    bigint = 89603L;
                    bigintStr = "dolorum";
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
                }};
                str = "nobis";
                type = "quas";
            }}, new SimpleObject("eum", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                any = "dolores";
                bigint = 645570L;
                bigintStr = "molestiae";
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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `deepObjParam`                                                                                     | [org.openapis.openapi.models.shared.DeepObject](../../models/shared/DeepObject.md)                 | :heavy_check_mark:                                                                                 | N/A                                                                                                |
| `simpleObjParam`                                                                                   | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md)             | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[org.openapis.openapi.models.operations.JsonQueryParamsObjectResponse](../../models/operations/JsonQueryParamsObjectResponse.md)**


## mixedQueryParams

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.MixedQueryParamsRequest;
import org.openapis.openapi.models.operations.MixedQueryParamsResponse;
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

            MixedQueryParamsResponse res = sdk.parameters.mixedQueryParams(new SimpleObject("incidunt", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                any = "consequuntur";
                bigint = 536178L;
                bigintStr = "fugit";
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
            }}, new SimpleObject("ratione", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                any = "minima";
                bigint = 392676L;
                bigintStr = "fugit";
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
            }}, new SimpleObject("accusamus", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                any = "occaecati";
                bigint = 543806L;
                bigintStr = "et";
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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `deepObjectParam`                                                                                  | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md)             | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `formParam`                                                                                        | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md)             | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `jsonParam`                                                                                        | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md)             | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[org.openapis.openapi.models.operations.MixedQueryParamsResponse](../../models/operations/MixedQueryParamsResponse.md)**


## pathParameterJson

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PathParameterJsonRequest;
import org.openapis.openapi.models.operations.PathParameterJsonResponse;
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

            PathParameterJsonResponse res = sdk.parameters.pathParameterJson(new SimpleObject("saepe", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                any = "quod";
                bigint = 724168L;
                bigintStr = "vero";
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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `jsonObj`                                                                                          | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md)             | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[org.openapis.openapi.models.operations.PathParameterJsonResponse](../../models/operations/PathParameterJsonResponse.md)**


## pipeDelimitedQueryParamsArray

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PipeDelimitedQueryParamsArrayRequest;
import org.openapis.openapi.models.operations.PipeDelimitedQueryParamsArrayResponse;
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

            PipeDelimitedQueryParamsArrayResponse res = sdk.parameters.pipeDelimitedQueryParamsArray(new String[]{{
                add("rerum"),
                add("occaecati"),
            }}, new Long[]{{
                add(716244L),
                add(756779L),
            }}, new java.util.HashMap<String, String>() {{
                put("culpa", "tempore");
            }}, new SimpleObject("quaerat", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                any = "adipisci";
                bigint = 766964L;
                bigintStr = "consequuntur";
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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `arrParam`                                                                                         | List<*String*>                                                                                     | :heavy_minus_sign:                                                                                 | N/A                                                                                                |
| `arrParamExploded`                                                                                 | List<*Long*>                                                                                       | :heavy_minus_sign:                                                                                 | N/A                                                                                                |
| `mapParam`                                                                                         | Map<String, *String*>                                                                              | :heavy_minus_sign:                                                                                 | N/A                                                                                                |
| `objParam`                                                                                         | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md)             | :heavy_minus_sign:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[org.openapis.openapi.models.operations.PipeDelimitedQueryParamsArrayResponse](../../models/operations/PipeDelimitedQueryParamsArrayResponse.md)**


## simplePathParameterArrays

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.SimplePathParameterArraysRequest;
import org.openapis.openapi.models.operations.SimplePathParameterArraysResponse;
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

            SimplePathParameterArraysResponse res = sdk.parameters.simplePathParameterArrays(new String[]{{
                add("blanditiis"),
                add("provident"),
            }});

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
| `arrParam`         | List<*String*>     | :heavy_check_mark: | N/A                |


### Response

**[org.openapis.openapi.models.operations.SimplePathParameterArraysResponse](../../models/operations/SimplePathParameterArraysResponse.md)**


## simplePathParameterMaps

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.SimplePathParameterMapsRequest;
import org.openapis.openapi.models.operations.SimplePathParameterMapsResponse;
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

            SimplePathParameterMapsResponse res = sdk.parameters.simplePathParameterMaps(new java.util.HashMap<String, String>() {{
                put("nulla", "quas");
                put("esse", "quasi");
                put("a", "error");
                put("sint", "pariatur");
            }}, new java.util.HashMap<String, Long>() {{
                put("quia", 908844L);
                put("asperiores", 815524L);
                put("veritatis", 159414L);
                put("quasi", 628899L);
            }});

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

| Parameter             | Type                  | Required              | Description           |
| --------------------- | --------------------- | --------------------- | --------------------- |
| `mapParam`            | Map<String, *String*> | :heavy_check_mark:    | N/A                   |
| `mapParamExploded`    | Map<String, *Long*>   | :heavy_check_mark:    | N/A                   |


### Response

**[org.openapis.openapi.models.operations.SimplePathParameterMapsResponse](../../models/operations/SimplePathParameterMapsResponse.md)**


## simplePathParameterObjects

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.SimplePathParameterObjectsRequest;
import org.openapis.openapi.models.operations.SimplePathParameterObjectsResponse;
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

            SimplePathParameterObjectsResponse res = sdk.parameters.simplePathParameterObjects(new SimpleObject("vel", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                any = "culpa";
                bigint = 398434L;
                bigintStr = "tenetur";
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
            }}, new SimpleObject("sapiente", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222d, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                any = "libero";
                bigint = 849039L;
                bigintStr = "soluta";
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

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `objParam`                                                                                         | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md)             | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |
| `objParamExploded`                                                                                 | [org.openapis.openapi.models.shared.SimpleObject](../../models/shared/SimpleObject.md)             | :heavy_check_mark:                                                                                 | A simple object that uses all our supported primitive types and enums and has optional properties. |


### Response

**[org.openapis.openapi.models.operations.SimplePathParameterObjectsResponse](../../models/operations/SimplePathParameterObjectsResponse.md)**


## simplePathParameterPrimitives

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.SimplePathParameterPrimitivesRequest;
import org.openapis.openapi.models.operations.SimplePathParameterPrimitivesResponse;
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

            SimplePathParameterPrimitivesResponse res = sdk.parameters.simplePathParameterPrimitives(false, 443879L, 3567.07d, "nisi");

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
| `boolParam`        | *Boolean*          | :heavy_check_mark: | N/A                |
| `intParam`         | *Long*             | :heavy_check_mark: | N/A                |
| `numParam`         | *Double*           | :heavy_check_mark: | N/A                |
| `strParam`         | *String*           | :heavy_check_mark: | N/A                |


### Response

**[org.openapis.openapi.models.operations.SimplePathParameterPrimitivesResponse](../../models/operations/SimplePathParameterPrimitivesResponse.md)**

