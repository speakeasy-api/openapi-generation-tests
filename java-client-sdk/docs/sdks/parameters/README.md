# Parameters
(*parameters*)

## Overview

Endpoints for testing parameters.

### Available Operations

* [deepObjectQueryParamsMap](#deepobjectqueryparamsmap)
* [deepObjectQueryParamsObject](#deepobjectqueryparamsobject)
* [duplicateParam](#duplicateparam)
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
                put("quas", "Concrete");
            }}, new java.util.HashMap<String, String[]>() {{
                put("necessitatibus", new String[]{{
                    add("of"),
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

            DeepObjectQueryParamsObjectResponse res = sdk.parameters.deepObjectQueryParamsObject(new SimpleObject("Handmade", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z"), Enum.ONE, 1.1f, 1L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1d, "test") {{
                any = "Jazz";
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z");
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                enum_ = Enum.ONE;
                float32 = 1.1f;
                int_ = 1L;
                int32 = 1;
                int32Enum = SimpleObjectInt32Enum.FIFTY_FIVE;
                intEnum = SimpleObjectIntEnum.Second;
                intOptNull = 425315L;
                num = 1.1d;
                numOptNull = 1324.77d;
                str = "test";
                strOpt = "testOptional";
            }}, new DeepObjectQueryParamsObjectObjArrParam() {{
                arr = new String[]{{
                    add("test2"),
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


## duplicateParam

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.DuplicateParamRequest;
import org.openapis.openapi.models.operations.DuplicateParamResponse;
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

            DuplicateParamResponse res = sdk.parameters.duplicateParam("Parks");

            if (res.duplicateParamResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
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
                add("test"),
            }}, new Long[]{{
                add(2L),
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
                put("rerum", "provident");
            }}, new java.util.HashMap<String, Long>() {{
                put("optio", 355695L);
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

            FormQueryParamsObjectResponse res = sdk.parameters.formQueryParamsObject(new SimpleObject("Associate", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z"), Enum.ONE, 1.1f, 1L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Third, 1.1d, "test") {{
                any = "Web";
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z");
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                enum_ = Enum.ONE;
                float32 = 1.1f;
                int_ = 1L;
                int32 = 1;
                int32Enum = SimpleObjectInt32Enum.FIFTY_FIVE;
                intEnum = SimpleObjectIntEnum.Third;
                intOptNull = 87354L;
                num = 1.1d;
                numOptNull = 883.91d;
                str = "test";
                strOpt = "testOptional";
            }}, new SimpleObject("Human", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z"), Enum.ONE, 1.1f, 1L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.First, 1.1d, "test") {{
                any = "quantify";
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z");
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                enum_ = Enum.ONE;
                float32 = 1.1f;
                int_ = 1L;
                int32 = 1;
                int32Enum = SimpleObjectInt32Enum.SIXTY_NINE;
                intEnum = SimpleObjectIntEnum.Third;
                intOptNull = 511250L;
                num = 1.1d;
                numOptNull = 6249.87d;
                str = "test";
                strOpt = "testOptional";
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

            FormQueryParamsPrimitiveResponse res = sdk.parameters.formQueryParamsPrimitive(true, 1L, 1.1d, "test");

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

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `boolParam`        | *Boolean*          | :heavy_check_mark: | N/A                | true               |
| `intParam`         | *Long*             | :heavy_check_mark: | N/A                | 1                  |
| `numParam`         | *Double*           | :heavy_check_mark: | N/A                | 1.1                |
| `strParam`         | *String*           | :heavy_check_mark: | N/A                | test               |


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

            FormQueryParamsRefParamObjectResponse res = sdk.parameters.formQueryParamsRefParamObject(new RefQueryParamObj(true, 1L, 1.1d, "test") {{
                bool = true;
                int_ = 1L;
                num = 1.1d;
                str = "test";
            }}, new RefQueryParamObjExploded(true, 1L, 1.1d, "test") {{
                bool = true;
                int_ = 1L;
                num = 1.1d;
                str = "test";
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
                add("test1"),
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
                put("ipsum", "Kids");
            }}, new java.util.HashMap<String, String>() {{
                put("omnis", "sky");
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

            HeaderParamsObjectResponse res = sdk.parameters.headerParamsObject(new SimpleObject("Representative", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z"), Enum.ONE, 1.1f, 1L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.First, 1.1d, "test") {{
                any = "tolerance";
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z");
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                enum_ = Enum.ONE;
                float32 = 1.1f;
                int_ = 1L;
                int32 = 1;
                int32Enum = SimpleObjectInt32Enum.FIFTY_FIVE;
                intEnum = SimpleObjectIntEnum.First;
                intOptNull = 598385L;
                num = 1.1d;
                numOptNull = 543.44d;
                str = "test";
                strOpt = "testOptional";
            }}, new SimpleObject("programming", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z"), Enum.ONE, 1.1f, 1L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "test") {{
                any = "port";
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z");
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                enum_ = Enum.ONE;
                float32 = 1.1f;
                int_ = 1L;
                int32 = 1;
                int32Enum = SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE;
                intEnum = SimpleObjectIntEnum.First;
                intOptNull = 484677L;
                num = 1.1d;
                numOptNull = 4815.2d;
                str = "test";
                strOpt = "testOptional";
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

            HeaderParamsPrimitiveResponse res = sdk.parameters.headerParamsPrimitive(true, 1L, 1.1d, "test");

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

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `xHeaderBoolean`   | *Boolean*          | :heavy_check_mark: | N/A                | true               |
| `xHeaderInteger`   | *Long*             | :heavy_check_mark: | N/A                | 1                  |
| `xHeaderNumber`    | *Double*           | :heavy_check_mark: | N/A                | 1.1                |
| `xHeaderString`    | *String*           | :heavy_check_mark: | N/A                | test               |


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

            JsonQueryParamsObjectResponse res = sdk.parameters.jsonQueryParamsObject(new DeepObject("male",                 new org.openapis.openapi.models.shared.SimpleObject[]{{
                                add(new SimpleObject("yearly", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z"), Enum.ONE, 1.1f, 1L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "test") {{
                                    any = "bypass";
                                    bigint = 8821239038968084L;
                                    bigintStr = "9223372036854775808";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z");
                                    decimal = 3.141592653589793d;
                                    decimalStr = "3.14159265358979344719667586";
                                    enum_ = Enum.ONE;
                                    float32 = 1.1f;
                                    int_ = 1L;
                                    int32 = 1;
                                    int32Enum = SimpleObjectInt32Enum.FIFTY_FIVE;
                                    intEnum = SimpleObjectIntEnum.Third;
                                    intOptNull = 395681L;
                                    num = 1.1d;
                                    numOptNull = 6274.24d;
                                    str = "test";
                                    strOpt = "testOptional";
                                }}),
                            }}, true, 1L,                 new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                                put("sint", new SimpleObject("backing", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z"), Enum.ONE, 1.1f, 1L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1d, "test") {{
                                    any = "Soft";
                                    bigint = 8821239038968084L;
                                    bigintStr = "9223372036854775808";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z");
                                    decimal = 3.141592653589793d;
                                    decimalStr = "3.14159265358979344719667586";
                                    enum_ = Enum.ONE;
                                    float32 = 1.1f;
                                    int_ = 1L;
                                    int32 = 1;
                                    int32Enum = SimpleObjectInt32Enum.FIFTY_FIVE;
                                    intEnum = SimpleObjectIntEnum.Second;
                                    intOptNull = 826457L;
                                    num = 1.1d;
                                    numOptNull = 6625.44d;
                                    str = "test";
                                    strOpt = "testOptional";
                                }});
                            }}, 1.1d,                 new SimpleObject("redundant", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z"), Enum.ONE, 1.1f, 1L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1d, "test") {{
                                bigint = 8821239038968084L;
                                bigintStr = "9223372036854775808";
                                boolOpt = true;
                                decimal = 3.141592653589793d;
                                decimalStr = "3.14159265358979344719667586";
                                intOptNull = 708150L;
                                numOptNull = 1977.81d;
                                strOpt = "testOptional";
                            }};, "test") {{
                any = "Hybrid";
                arr = new org.openapis.openapi.models.shared.SimpleObject[]{{
                    add(new SimpleObject("Toyota", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z"), Enum.ONE, 1.1f, 1L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Third, 1.1d, "test") {{
                        any = "weber";
                        bigint = 8821239038968084L;
                        bigintStr = "9223372036854775808";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z");
                        decimal = 3.141592653589793d;
                        decimalStr = "3.14159265358979344719667586";
                        enum_ = Enum.ONE;
                        float32 = 1.1f;
                        int_ = 1L;
                        int32 = 1;
                        int32Enum = SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE;
                        intEnum = SimpleObjectIntEnum.First;
                        intOptNull = 240276L;
                        num = 1.1d;
                        numOptNull = 3309.36d;
                        str = "test";
                        strOpt = "testOptional";
                    }}),
                }};
                bool = true;
                int_ = 1L;
                map = new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                    put("commodi", new SimpleObject("hoard", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z"), Enum.ONE, 1.1f, 1L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1d, "test") {{
                        any = "Passenger";
                        bigint = 8821239038968084L;
                        bigintStr = "9223372036854775808";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z");
                        decimal = 3.141592653589793d;
                        decimalStr = "3.14159265358979344719667586";
                        enum_ = Enum.ONE;
                        float32 = 1.1f;
                        int_ = 1L;
                        int32 = 1;
                        int32Enum = SimpleObjectInt32Enum.SIXTY_NINE;
                        intEnum = SimpleObjectIntEnum.Second;
                        intOptNull = 717976L;
                        num = 1.1d;
                        numOptNull = 9665.2d;
                        str = "test";
                        strOpt = "testOptional";
                    }});
                }};
                num = 1.1d;
                obj = new SimpleObject("deposit", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z"), Enum.ONE, 1.1f, 1L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "test") {{
                    any = "aside";
                    bigint = 8821239038968084L;
                    bigintStr = "9223372036854775808";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z");
                    decimal = 3.141592653589793d;
                    decimalStr = "3.14159265358979344719667586";
                    enum_ = Enum.ONE;
                    float32 = 1.1f;
                    int_ = 1L;
                    int32 = 1;
                    int32Enum = SimpleObjectInt32Enum.FIFTY_FIVE;
                    intEnum = SimpleObjectIntEnum.Second;
                    intOptNull = 96496L;
                    num = 1.1d;
                    numOptNull = 840.63d;
                    str = "test";
                    strOpt = "testOptional";
                }};
                str = "test";
                type = "visionary Paradigm Malawi";
            }}, new SimpleObject("Account", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z"), Enum.ONE, 1.1f, 1L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.First, 1.1d, "test") {{
                any = "now";
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z");
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                enum_ = Enum.ONE;
                float32 = 1.1f;
                int_ = 1L;
                int32 = 1;
                int32Enum = SimpleObjectInt32Enum.FIFTY_FIVE;
                intEnum = SimpleObjectIntEnum.Third;
                intOptNull = 702965L;
                num = 1.1d;
                numOptNull = 6749.71d;
                str = "test";
                strOpt = "testOptional";
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


## mixedParametersCamelCase

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.MixedParametersCamelCaseRequest;
import org.openapis.openapi.models.operations.MixedParametersCamelCaseResponse;
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

            MixedParametersCamelCaseResponse res = sdk.parameters.mixedParametersCamelCase("headerValue", "pathValue", "queryValue");

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

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `headerParam`      | *String*           | :heavy_check_mark: | N/A                | headerValue        |
| `pathParam`        | *String*           | :heavy_check_mark: | N/A                | pathValue          |
| `queryStringParam` | *String*           | :heavy_check_mark: | N/A                | queryValue         |


### Response

**[org.openapis.openapi.models.operations.MixedParametersCamelCaseResponse](../../models/operations/MixedParametersCamelCaseResponse.md)**


## mixedParametersPrimitives

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.MixedParametersPrimitivesRequest;
import org.openapis.openapi.models.operations.MixedParametersPrimitivesResponse;
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

            MixedParametersPrimitivesResponse res = sdk.parameters.mixedParametersPrimitives("headerValue", "pathValue", "queryValue");

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

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `headerParam`      | *String*           | :heavy_check_mark: | N/A                | headerValue        |
| `pathParam`        | *String*           | :heavy_check_mark: | N/A                | pathValue          |
| `queryStringParam` | *String*           | :heavy_check_mark: | N/A                | queryValue         |


### Response

**[org.openapis.openapi.models.operations.MixedParametersPrimitivesResponse](../../models/operations/MixedParametersPrimitivesResponse.md)**


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

            MixedQueryParamsResponse res = sdk.parameters.mixedQueryParams(new SimpleObject("Chair", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z"), Enum.ONE, 1.1f, 1L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Third, 1.1d, "test") {{
                any = "female";
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z");
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                enum_ = Enum.ONE;
                float32 = 1.1f;
                int_ = 1L;
                int32 = 1;
                int32Enum = SimpleObjectInt32Enum.FIFTY_FIVE;
                intEnum = SimpleObjectIntEnum.First;
                intOptNull = 108812L;
                num = 1.1d;
                numOptNull = 4161.9d;
                str = "test";
                strOpt = "testOptional";
            }}, new SimpleObject("busily", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z"), Enum.ONE, 1.1f, 1L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1d, "test") {{
                any = "base";
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z");
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                enum_ = Enum.ONE;
                float32 = 1.1f;
                int_ = 1L;
                int32 = 1;
                int32Enum = SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE;
                intEnum = SimpleObjectIntEnum.First;
                intOptNull = 297570L;
                num = 1.1d;
                numOptNull = 829.18d;
                str = "test";
                strOpt = "testOptional";
            }}, new SimpleObject("apropos", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z"), Enum.ONE, 1.1f, 1L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "test") {{
                any = "Intelligent";
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z");
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                enum_ = Enum.ONE;
                float32 = 1.1f;
                int_ = 1L;
                int32 = 1;
                int32Enum = SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE;
                intEnum = SimpleObjectIntEnum.First;
                intOptNull = 183310L;
                num = 1.1d;
                numOptNull = 9590.11d;
                str = "test";
                strOpt = "testOptional";
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

            PathParameterJsonResponse res = sdk.parameters.pathParameterJson(new SimpleObject("Pop", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z"), Enum.ONE, 1.1f, 1L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1d, "test") {{
                any = "bluetooth";
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z");
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                enum_ = Enum.ONE;
                float32 = 1.1f;
                int_ = 1L;
                int32 = 1;
                int32Enum = SimpleObjectInt32Enum.SIXTY_NINE;
                intEnum = SimpleObjectIntEnum.Second;
                intOptNull = 121334L;
                num = 1.1d;
                numOptNull = 2775.09d;
                str = "test";
                strOpt = "testOptional";
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
                add("test2"),
            }}, new Long[]{{
                add(1L),
            }}, new java.util.HashMap<String, String>() {{
                put("vitae", "gold");
            }}, new SimpleObject("synergistic", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z"), Enum.ONE, 1.1f, 1L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.First, 1.1d, "test") {{
                any = "Corporate";
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z");
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                enum_ = Enum.ONE;
                float32 = 1.1f;
                int_ = 1L;
                int32 = 1;
                int32Enum = SimpleObjectInt32Enum.FIFTY_FIVE;
                intEnum = SimpleObjectIntEnum.First;
                intOptNull = 790307L;
                num = 1.1d;
                numOptNull = 4843.4d;
                str = "test";
                strOpt = "testOptional";
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
                add("test"),
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
                put("nobis", "even");
            }}, new java.util.HashMap<String, Long>() {{
                put("repudiandae", 157687L);
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

            SimplePathParameterObjectsResponse res = sdk.parameters.simplePathParameterObjects(new SimpleObject("Research", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z"), Enum.ONE, 1.1f, 1L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "test") {{
                any = "Ville";
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z");
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                enum_ = Enum.ONE;
                float32 = 1.1f;
                int_ = 1L;
                int32 = 1;
                int32Enum = SimpleObjectInt32Enum.SIXTY_NINE;
                intEnum = SimpleObjectIntEnum.Third;
                intOptNull = 586554L;
                num = 1.1d;
                numOptNull = 2558d;
                str = "test";
                strOpt = "testOptional";
            }}, new SimpleObject("Pop", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z"), Enum.ONE, 1.1f, 1L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "test") {{
                any = "repentant";
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z");
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                enum_ = Enum.ONE;
                float32 = 1.1f;
                int_ = 1L;
                int32 = 1;
                int32Enum = SimpleObjectInt32Enum.SIXTY_NINE;
                intEnum = SimpleObjectIntEnum.Third;
                intOptNull = 60882L;
                num = 1.1d;
                numOptNull = 6063.03d;
                str = "test";
                strOpt = "testOptional";
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

            SimplePathParameterPrimitivesResponse res = sdk.parameters.simplePathParameterPrimitives(true, 1L, 1.1d, "test");

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

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `boolParam`        | *Boolean*          | :heavy_check_mark: | N/A                | true               |
| `intParam`         | *Long*             | :heavy_check_mark: | N/A                | 1                  |
| `numParam`         | *Double*           | :heavy_check_mark: | N/A                | 1.1                |
| `strParam`         | *String*           | :heavy_check_mark: | N/A                | test               |


### Response

**[org.openapis.openapi.models.operations.SimplePathParameterPrimitivesResponse](../../models/operations/SimplePathParameterPrimitivesResponse.md)**

