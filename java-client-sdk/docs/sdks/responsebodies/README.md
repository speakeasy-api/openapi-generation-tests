# ResponseBodies
(*responseBodies*)

## Overview

Endpoints for testing response bodies.

### Available Operations

* [responseBodyAdditionalPropertiesComplexNumbersPost](#responsebodyadditionalpropertiescomplexnumberspost)
* [responseBodyAdditionalPropertiesDatePost](#responsebodyadditionalpropertiesdatepost)
* [responseBodyAdditionalPropertiesObjectPost](#responsebodyadditionalpropertiesobjectpost)
* [responseBodyAdditionalPropertiesPost](#responsebodyadditionalpropertiespost)
* [responseBodyBytesGet](#responsebodybytesget)
* [responseBodyEmptyWithHeaders](#responsebodyemptywithheaders)
* [responseBodyOptionalGet](#responsebodyoptionalget)
* [responseBodyReadOnly](#responsebodyreadonly)
* [responseBodyStringGet](#responsebodystringget)
* [responseBodyXmlGet](#responsebodyxmlget)
* [responseBodyZeroValueComplexTypePtrsPost](#responsebodyzerovaluecomplextypeptrspost)

## responseBodyAdditionalPropertiesComplexNumbersPost

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyAdditionalPropertiesComplexNumbersPostResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.. req =             new java.util.HashMap<String, String>(){{
                put("key", "string");
            }};            

            ResponseBodyAdditionalPropertiesComplexNumbersPostResponse res = sdk.responseBodies.responseBodyAdditionalPropertiesComplexNumbersPost(req);

            if (res.responseBodyAdditionalPropertiesComplexNumbersPost200ApplicationJSONObject != null) {
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

**[org.openapis.openapi.models.operations.ResponseBodyAdditionalPropertiesComplexNumbersPostResponse](../../models/operations/ResponseBodyAdditionalPropertiesComplexNumbersPostResponse.md)**


## responseBodyAdditionalPropertiesDatePost

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyAdditionalPropertiesDatePostResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.. req =             new java.util.HashMap<String, LocalDate>(){{
                put("key", LocalDate.parse("2021-03-16"));
            }};            

            ResponseBodyAdditionalPropertiesDatePostResponse res = sdk.responseBodies.responseBodyAdditionalPropertiesDatePost(req);

            if (res.responseBodyAdditionalPropertiesDatePost200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `request`                                             | [java.util.Map<String, LocalDate>](../../models//.md) | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[org.openapis.openapi.models.operations.ResponseBodyAdditionalPropertiesDatePostResponse](../../models/operations/ResponseBodyAdditionalPropertiesDatePostResponse.md)**


## responseBodyAdditionalPropertiesObjectPost

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyAdditionalPropertiesObjectPostResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;
import org.openapis.openapi.models.shared.SimpleObjectInt32Enum;
import org.openapis.openapi.models.shared.SimpleObjectIntEnum;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.. req =             new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>(){{
                put("key", new SimpleObject("any", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z"), Enum.ONE, 1.1f, 1L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "test"){{
                    any = "any";
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
                    num = 1.1d;
                    str = "test";
                    strOpt = "testOptional";
                }});
            }};            

            ResponseBodyAdditionalPropertiesObjectPostResponse res = sdk.responseBodies.responseBodyAdditionalPropertiesObjectPost(req);

            if (res.responseBodyAdditionalPropertiesObjectPost200ApplicationJSONObject != null) {
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

**[org.openapis.openapi.models.operations.ResponseBodyAdditionalPropertiesObjectPostResponse](../../models/operations/ResponseBodyAdditionalPropertiesObjectPostResponse.md)**


## responseBodyAdditionalPropertiesPost

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyAdditionalPropertiesPostResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.. req =             new java.util.HashMap<String, String>(){{
                put("key", "string");
            }};            

            ResponseBodyAdditionalPropertiesPostResponse res = sdk.responseBodies.responseBodyAdditionalPropertiesPost(req);

            if (res.responseBodyAdditionalPropertiesPost200ApplicationJSONObject != null) {
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

**[org.openapis.openapi.models.operations.ResponseBodyAdditionalPropertiesPostResponse](../../models/operations/ResponseBodyAdditionalPropertiesPostResponse.md)**


## responseBodyBytesGet

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyBytesGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            ResponseBodyBytesGetResponse res = sdk.responseBodies.responseBodyBytesGet();

            if (res.bytes != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[org.openapis.openapi.models.operations.ResponseBodyBytesGetResponse](../../models/operations/ResponseBodyBytesGetResponse.md)**


## responseBodyEmptyWithHeaders

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyEmptyWithHeadersRequest;
import org.openapis.openapi.models.operations.ResponseBodyEmptyWithHeadersResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            ResponseBodyEmptyWithHeadersResponse res = sdk.responseBodies.responseBodyEmptyWithHeaders(1751.8d, "string");

            if (res.statusCode == 200) {
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
| `xNumberHeader`    | *Double*           | :heavy_check_mark: | N/A                |
| `xStringHeader`    | *String*           | :heavy_check_mark: | N/A                |


### Response

**[org.openapis.openapi.models.operations.ResponseBodyEmptyWithHeadersResponse](../../models/operations/ResponseBodyEmptyWithHeadersResponse.md)**


## responseBodyOptionalGet

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyOptionalGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            ResponseBodyOptionalGetResponse res = sdk.responseBodies.responseBodyOptionalGet();

            if (res.typedObject1 != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[org.openapis.openapi.models.operations.ResponseBodyOptionalGetResponse](../../models/operations/ResponseBodyOptionalGetResponse.md)**


## responseBodyReadOnly

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyReadOnlyResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            ResponseBodyReadOnlyResponse res = sdk.responseBodies.responseBodyReadOnly();

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

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[org.openapis.openapi.models.operations.ResponseBodyReadOnlyResponse](../../models/operations/ResponseBodyReadOnlyResponse.md)**


## responseBodyStringGet

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyStringGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            ResponseBodyStringGetResponse res = sdk.responseBodies.responseBodyStringGet();

            if (res.html != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[org.openapis.openapi.models.operations.ResponseBodyStringGetResponse](../../models/operations/ResponseBodyStringGetResponse.md)**


## responseBodyXmlGet

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyXmlGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            ResponseBodyXmlGetResponse res = sdk.responseBodies.responseBodyXmlGet();

            if (res.xml != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[org.openapis.openapi.models.operations.ResponseBodyXmlGetResponse](../../models/operations/ResponseBodyXmlGetResponse.md)**


## responseBodyZeroValueComplexTypePtrsPost

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyZeroValueComplexTypePtrsPostResponse;
import org.openapis.openapi.models.shared.ObjWithZeroValueComplexTypePtrs;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.ObjWithZeroValueComplexTypePtrs req = new ObjWithZeroValueComplexTypePtrs(){{
                bigint = 438531L;
                bigintStr = "string";
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                decimal = 4843.38d;
            }};            

            ResponseBodyZeroValueComplexTypePtrsPostResponse res = sdk.responseBodies.responseBodyZeroValueComplexTypePtrsPost(req);

            if (res.responseBodyZeroValueComplexTypePtrsPost200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [org.openapis.openapi.models.shared.ObjWithZeroValueComplexTypePtrs](../../models/shared/ObjWithZeroValueComplexTypePtrs.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[org.openapis.openapi.models.operations.ResponseBodyZeroValueComplexTypePtrsPostResponse](../../models/operations/ResponseBodyZeroValueComplexTypePtrsPostResponse.md)**

