# unions

## Overview

Endpoints for testing union types.

### Available Operations

* [mixedTypeOneOfPost](#mixedtypeoneofpost)
* [primitiveTypeOneOfPost](#primitivetypeoneofpost)
* [stronglyTypedOneOfPost](#stronglytypedoneofpost)
* [typedObjectOneOfPost](#typedobjectoneofpost)
* [weaklyTypedOneOfPost](#weaklytypedoneofpost)

## mixedTypeOneOfPost

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.MixedTypeOneOfPostResponse;
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

            org.openapis.openapi.models.. req = new SimpleObject("dicta", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                any = "error";
                bigint = 8511L;
                bigintStr = "incidunt";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                decimal = 9688.65d;
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
            }}            

            MixedTypeOneOfPostResponse res = sdk.unions.mixedTypeOneOfPost(req);

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
| `request`                                  | [Object](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[org.openapis.openapi.models.operations.MixedTypeOneOfPostResponse](../../models/operations/MixedTypeOneOfPostResponse.md)**


## primitiveTypeOneOfPost

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PrimitiveTypeOneOfPostResponse;
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

            org.openapis.openapi.models.. req = 695270L            

            PrimitiveTypeOneOfPostResponse res = sdk.unions.primitiveTypeOneOfPost(req);

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
| `request`                                  | [Object](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[org.openapis.openapi.models.operations.PrimitiveTypeOneOfPostResponse](../../models/operations/PrimitiveTypeOneOfPostResponse.md)**


## stronglyTypedOneOfPost

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.StronglyTypedOneOfPostResponse;
import org.openapis.openapi.models.shared.DeepObjectWithType;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;
import org.openapis.openapi.models.shared.SimpleObjectInt32Enum;
import org.openapis.openapi.models.shared.SimpleObjectIntEnum;
import org.openapis.openapi.models.shared.SimpleObjectWithType;
import org.openapis.openapi.models.shared.SimpleObjectWithTypeInt32Enum;
import org.openapis.openapi.models.shared.SimpleObjectWithTypeIntEnum;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.. req = new DeepObjectWithType(                new SimpleObject("officiis", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                                any = "esse";
                                bigint = 227759L;
                                bigintStr = "assumenda";
                                bool = true;
                                boolOpt = true;
                                date = LocalDate.parse("2020-01-01");
                                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                decimal = 4103.01d;
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
                            }},                 new org.openapis.openapi.models.shared.SimpleObject[]{{
                                add(new SimpleObject("at", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                                    any = "natus";
                                    bigint = 328303L;
                                    bigintStr = "aspernatur";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    decimal = 4044.25d;
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
                            }}, false, 379356L,                 new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                                put("repudiandae", new SimpleObject("labore", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                                    any = "atque";
                                    bigint = 541381L;
                                    bigintStr = "sunt";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    decimal = 9233.06d;
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
                            }}, 9197.83d,                 new SimpleObject("dicta", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                                bigint = 174772L;
                                bigintStr = "enim";
                                boolOpt = true;
                                decimal = 3891.35d;
                                intOptNull = 999999L;
                                numOptNull = 1.1d;
                                strOpt = "optional example";
                            }};, "velit") {{
                any = "nam";
                arr = new org.openapis.openapi.models.shared.SimpleObject[]{{
                    add(new SimpleObject("unde", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                        any = "tenetur";
                        bigint = 388867L;
                        bigintStr = "alias";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 2270.84d;
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
                }};
                bool = false;
                int_ = 833819L;
                map = new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                    put("delectus", new SimpleObject("fuga", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                        any = "voluptates";
                        bigint = 16871L;
                        bigintStr = "est";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 6964.83d;
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
                }};
                num = 3339.65d;
                obj = new SimpleObject("asperiores", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                    any = "voluptatem";
                    bigint = 790840L;
                    bigintStr = "repudiandae";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    decimal = 972.43d;
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
                str = "quidem";
                type = "maxime";
            }}            

            StronglyTypedOneOfPostResponse res = sdk.unions.stronglyTypedOneOfPost(req);

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
| `request`                                  | [Object](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[org.openapis.openapi.models.operations.StronglyTypedOneOfPostResponse](../../models/operations/StronglyTypedOneOfPostResponse.md)**


## typedObjectOneOfPost

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.TypedObjectOneOfPostResponse;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.TypedObject1;
import org.openapis.openapi.models.shared.TypedObject1Type;
import org.openapis.openapi.models.shared.TypedObject2;
import org.openapis.openapi.models.shared.TypedObject2Type;
import org.openapis.openapi.models.shared.TypedObject3;
import org.openapis.openapi.models.shared.TypedObject3Type;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.. req = new TypedObject3(TypedObject3Type.OBJ3, "magnam") {{
                type = TypedObject3Type.OBJ3;
                value = "molestias";
            }}            

            TypedObjectOneOfPostResponse res = sdk.unions.typedObjectOneOfPost(req);

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
| `request`                                  | [Object](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[org.openapis.openapi.models.operations.TypedObjectOneOfPostResponse](../../models/operations/TypedObjectOneOfPostResponse.md)**


## weaklyTypedOneOfPost

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.WeaklyTypedOneOfPostResponse;
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

            org.openapis.openapi.models.. req = new DeepObject(                new SimpleObject("id", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                                any = "mollitia";
                                bigint = 378245L;
                                bigintStr = "alias";
                                bool = true;
                                boolOpt = true;
                                date = LocalDate.parse("2020-01-01");
                                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                decimal = 9795.27d;
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
                                add(new SimpleObject("molestiae", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                                    any = "dolorum";
                                    bigint = 200364L;
                                    bigintStr = "quae";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    decimal = 9257.03d;
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
                            }}, false, 633062L,                 new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                                put("adipisci", new SimpleObject("provident", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                                    any = "debitis";
                                    bigint = 514513L;
                                    bigintStr = "eum";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    decimal = 3679.27d;
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
                            }}, 9704.94d,                 new SimpleObject("provident", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                                bigint = 96804L;
                                bigintStr = "animi";
                                boolOpt = true;
                                decimal = 3433.92d;
                                intOptNull = 999999L;
                                numOptNull = 1.1d;
                                strOpt = "optional example";
                            }};, "mollitia") {{
                any = new SimpleObject("occaecati", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                    any = "occaecati";
                    bigint = 886305L;
                    bigintStr = "perspiciatis";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    decimal = 4463.94d;
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
                }};
                arr = new org.openapis.openapi.models.shared.SimpleObject[]{{
                    add(new SimpleObject("quidem", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                        any = "id";
                        bigint = 335631L;
                        bigintStr = "reprehenderit";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 6255.28d;
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
                }};
                bool = false;
                int_ = 878493L;
                map = new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                    put("doloremque", new SimpleObject("qui", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                        any = "iure";
                        bigint = 59944L;
                        bigintStr = "totam";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 610.78d;
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
                }};
                num = 8980.63d;
                obj = new SimpleObject("ad", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                    any = "ratione";
                    bigint = 672582L;
                    bigintStr = "distinctio";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    decimal = 5289.4d;
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
                }};
                str = "corporis";
                type = "perspiciatis";
            }}            

            WeaklyTypedOneOfPostResponse res = sdk.unions.weaklyTypedOneOfPost(req);

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
| `request`                                  | [Object](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[org.openapis.openapi.models.operations.WeaklyTypedOneOfPostResponse](../../models/operations/WeaklyTypedOneOfPostResponse.md)**

