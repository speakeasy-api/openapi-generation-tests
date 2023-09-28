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
                put("consequuntur", "ipsa");
            }}, new java.util.HashMap<String, String[]>() {{
                put("quas", new String[]{{
                    add("eveniet"),
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

            DeepObjectQueryParamsObjectResponse res = sdk.parameters.deepObjectQueryParamsObject(new SimpleObject("nesciunt", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                any = "impedit";
                bigint = 884952L;
                bigintStr = "esse";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                decimal = 8972.77d;
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
            }}, new DeepObjectQueryParamsObjectObjArrParam() {{
                arr = new String[]{{
                    add("vel"),
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

            DuplicateParamResponse res = sdk.parameters.duplicateParam("voluptatum");

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
                add("magnam"),
            }}, new Long[]{{
                add(349440L),
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
                put("ab", "porro");
            }}, new java.util.HashMap<String, Long>() {{
                put("autem", 751022L);
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

            FormQueryParamsObjectResponse res = sdk.parameters.formQueryParamsObject(new SimpleObject("quasi", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                any = "laboriosam";
                bigint = 927212L;
                bigintStr = "consequuntur";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                decimal = 289.52d;
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
            }}, new SimpleObject("optio", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                any = "vero";
                bigint = 667593L;
                bigintStr = "harum";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                decimal = 1927.18d;
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

            FormQueryParamsPrimitiveResponse res = sdk.parameters.formQueryParamsPrimitive(false, 455898L, 5010.63d, "officia");

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

            FormQueryParamsRefParamObjectResponse res = sdk.parameters.formQueryParamsRefParamObject(new RefQueryParamObj(false, 551079L, 2609.04d, "aspernatur") {{
                bool = false;
                int_ = 376389L;
                num = 2540.25d;
                str = "nemo";
            }}, new RefQueryParamObjExploded(false, 514054L, 2773.4d, "quasi") {{
                bool = false;
                int_ = 495970L;
                num = 2005.16d;
                str = "fuga";
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
                add("rem"),
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
                put("fugiat", "dicta");
            }}, new java.util.HashMap<String, String>() {{
                put("nisi", "consequuntur");
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

            HeaderParamsObjectResponse res = sdk.parameters.headerParamsObject(new SimpleObject("omnis", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                any = "consectetur";
                bigint = 46806L;
                bigintStr = "cupiditate";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                decimal = 9707.32d;
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
            }}, new SimpleObject("distinctio", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                any = "iste";
                bigint = 170099L;
                bigintStr = "inventore";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                decimal = 6863.62d;
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

            HeaderParamsPrimitiveResponse res = sdk.parameters.headerParamsPrimitive(false, 328379L, 5076.36d, "maxime");

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

            JsonQueryParamsObjectResponse res = sdk.parameters.jsonQueryParamsObject(new DeepObject(                new SimpleObject("nam", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                                any = "atque";
                                bigint = 216457L;
                                bigintStr = "impedit";
                                bool = true;
                                boolOpt = true;
                                date = LocalDate.parse("2020-01-01");
                                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                                decimal = 1660.47d;
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
                                add(new SimpleObject("quibusdam", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                                    any = "voluptate";
                                    bigint = 194023L;
                                    bigintStr = "dignissimos";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                                    decimal = 2055.66d;
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
                            }}, false, 974990L,                 new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                                put("vel", new SimpleObject("voluptatibus", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                                    any = "magnam";
                                    bigint = 842855L;
                                    bigintStr = "inventore";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                                    decimal = 8180.34d;
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
                            }}, 3041.98d,                 new SimpleObject("velit", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                                bigint = 424663L;
                                bigintStr = "ea";
                                boolOpt = true;
                                decimal = 1076.17d;
                                intOptNull = 999999L;
                                numOptNull = 1.1d;
                                strOpt = "optional example";
                            }};, "vero") {{
                any = new SimpleObject("earum", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                    any = "temporibus";
                    bigint = 549501L;
                    bigintStr = "commodi";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                    decimal = 9308.19d;
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
                }};
                arr = new org.openapis.openapi.models.shared.SimpleObject[]{{
                    add(new SimpleObject("non", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                        any = "vero";
                        bigint = 32901L;
                        bigintStr = "ipsam";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                        decimal = 4259.46d;
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
                }};
                bool = false;
                int_ = 575213L;
                map = new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                    put("nulla", new SimpleObject("sint", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                        any = "deserunt";
                        bigint = 458503L;
                        bigintStr = "nemo";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                        decimal = 4445.87d;
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
                }};
                num = 9450.27d;
                obj = new SimpleObject("quae", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                    any = "necessitatibus";
                    bigint = 991891L;
                    bigintStr = "ex";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                    decimal = 3767.41d;
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
                }};
                str = "laborum";
                type = "consectetur";
            }}, new SimpleObject("dicta", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                any = "excepturi";
                bigint = 431994L;
                bigintStr = "velit";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                decimal = 2840.86d;
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

            MixedParametersCamelCaseResponse res = sdk.parameters.mixedParametersCamelCase("iste", "itaque", "alias");

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
| `headerParam`      | *String*           | :heavy_check_mark: | N/A                |
| `pathParam`        | *String*           | :heavy_check_mark: | N/A                |
| `queryStringParam` | *String*           | :heavy_check_mark: | N/A                |


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

            MixedParametersPrimitivesResponse res = sdk.parameters.mixedParametersPrimitives("nisi", "itaque", "velit");

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
| `headerParam`      | *String*           | :heavy_check_mark: | N/A                |
| `pathParam`        | *String*           | :heavy_check_mark: | N/A                |
| `queryStringParam` | *String*           | :heavy_check_mark: | N/A                |


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

            MixedQueryParamsResponse res = sdk.parameters.mixedQueryParams(new SimpleObject("consequatur", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                any = "laborum";
                bigint = 250398L;
                bigintStr = "dolor";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                decimal = 4833.94d;
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
            }}, new SimpleObject("expedita", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                any = "ea";
                bigint = 693153L;
                bigintStr = "voluptas";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                decimal = 7051.48d;
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
            }}, new SimpleObject("ipsam", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                any = "voluptate";
                bigint = 351936L;
                bigintStr = "unde";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                decimal = 8975.43d;
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

            PathParameterJsonResponse res = sdk.parameters.pathParameterJson(new SimpleObject("vitae", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                any = "error";
                bigint = 456885L;
                bigintStr = "labore";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                decimal = 850.66d;
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
                add("ad"),
            }}, new Long[]{{
                add(183033L),
            }}, new java.util.HashMap<String, String>() {{
                put("iste", "ex");
            }}, new SimpleObject("fugit", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                any = "nemo";
                bigint = 745233L;
                bigintStr = "libero";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
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
                add("vel"),
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
                put("quae", "quae");
            }}, new java.util.HashMap<String, Long>() {{
                put("modi", 208253L);
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

            SimplePathParameterObjectsResponse res = sdk.parameters.simplePathParameterObjects(new SimpleObject("distinctio", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                any = "exercitationem";
                bigint = 932394L;
                bigintStr = "et";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                decimal = 2153.98d;
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
            }}, new SimpleObject("libero", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                any = "quia";
                bigint = 342137L;
                bigintStr = "omnis";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000Z");
                decimal = 7272.5d;
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

            SimplePathParameterPrimitivesResponse res = sdk.parameters.simplePathParameterPrimitives(false, 1L, 5546.03d, "placeat");

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
| `boolParam`        | *Boolean*          | :heavy_check_mark: | N/A                |                    |
| `intParam`         | *Long*             | :heavy_check_mark: | N/A                | 1                  |
| `numParam`         | *Double*           | :heavy_check_mark: | N/A                |                    |
| `strParam`         | *String*           | :heavy_check_mark: | N/A                |                    |


### Response

**[org.openapis.openapi.models.operations.SimplePathParameterPrimitivesResponse](../../models/operations/SimplePathParameterPrimitivesResponse.md)**

