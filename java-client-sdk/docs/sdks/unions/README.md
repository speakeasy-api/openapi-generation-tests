# Unions

## Overview

Endpoints for testing union types.

### Available Operations

* [flattenedTypedObjectPost](#flattenedtypedobjectpost)
* [mixedTypeOneOfPost](#mixedtypeoneofpost)
* [nullableOneOfRefInObjectPost](#nullableoneofrefinobjectpost)
* [nullableOneOfSchemaPost](#nullableoneofschemapost)
* [nullableOneOfTypeInObjectPost](#nullableoneoftypeinobjectpost)
* [nullableTypedObjectPost](#nullabletypedobjectpost)
* [primitiveTypeOneOfPost](#primitivetypeoneofpost)
* [stronglyTypedOneOfPost](#stronglytypedoneofpost)
* [typedObjectNullableOneOfPost](#typedobjectnullableoneofpost)
* [typedObjectOneOfPost](#typedobjectoneofpost)
* [weaklyTypedOneOfPost](#weaklytypedoneofpost)

## flattenedTypedObjectPost

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.FlattenedTypedObjectPostResponse;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.TypedObject1;
import org.openapis.openapi.models.shared.TypedObject1Type;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.TypedObject1 req = new TypedObject1(TypedObject1Type.OBJ1, "dolorem");            

            FlattenedTypedObjectPostResponse res = sdk.unions.flattenedTypedObjectPost(req);

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
| `request`                                                                              | [org.openapis.openapi.models.shared.TypedObject1](../../models/shared/TypedObject1.md) | :heavy_check_mark:                                                                     | The request object to use for the request.                                             |


### Response

**[org.openapis.openapi.models.operations.FlattenedTypedObjectPostResponse](../../models/operations/FlattenedTypedObjectPostResponse.md)**


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

            org.openapis.openapi.models.. req = "cumque"            

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


## nullableOneOfRefInObjectPost

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.NullableOneOfRefInObjectPostResponse;
import org.openapis.openapi.models.shared.NullableOneOfRefInObject;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.TypedObject1;
import org.openapis.openapi.models.shared.TypedObject1Type;
import org.openapis.openapi.models.shared.TypedObject2;
import org.openapis.openapi.models.shared.TypedObject2Type;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.NullableOneOfRefInObject req = new NullableOneOfRefInObject(                new TypedObject1(TypedObject1Type.OBJ1, "fuga");,                 new TypedObject1(TypedObject1Type.OBJ1, "necessitatibus") {{
                                type = TypedObject1Type.OBJ1;
                                value = "animi";
                            }},                 new TypedObject1(TypedObject1Type.OBJ1, "nulla"););            

            NullableOneOfRefInObjectPostResponse res = sdk.unions.nullableOneOfRefInObjectPost(req);

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
| `request`                                                                                                      | [org.openapis.openapi.models.shared.NullableOneOfRefInObject](../../models/shared/NullableOneOfRefInObject.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[org.openapis.openapi.models.operations.NullableOneOfRefInObjectPostResponse](../../models/operations/NullableOneOfRefInObjectPostResponse.md)**


## nullableOneOfSchemaPost

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.NullableOneOfSchemaPostResponse;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.TypedObject1;
import org.openapis.openapi.models.shared.TypedObject1Type;
import org.openapis.openapi.models.shared.TypedObject2;
import org.openapis.openapi.models.shared.TypedObject2Type;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.. req = new TypedObject1(TypedObject1Type.OBJ1, "et") {{
                type = TypedObject1Type.OBJ1;
                value = "quasi";
            }}            

            NullableOneOfSchemaPostResponse res = sdk.unions.nullableOneOfSchemaPost(req);

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

**[org.openapis.openapi.models.operations.NullableOneOfSchemaPostResponse](../../models/operations/NullableOneOfSchemaPostResponse.md)**


## nullableOneOfTypeInObjectPost

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.NullableOneOfTypeInObjectPostResponse;
import org.openapis.openapi.models.shared.NullableOneOfTypeInObject;
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

            org.openapis.openapi.models.shared.NullableOneOfTypeInObject req = new NullableOneOfTypeInObject(false, false, false);            

            NullableOneOfTypeInObjectPostResponse res = sdk.unions.nullableOneOfTypeInObjectPost(req);

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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [org.openapis.openapi.models.shared.NullableOneOfTypeInObject](../../models/shared/NullableOneOfTypeInObject.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[org.openapis.openapi.models.operations.NullableOneOfTypeInObjectPostResponse](../../models/operations/NullableOneOfTypeInObjectPostResponse.md)**


## nullableTypedObjectPost

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.NullableTypedObjectPostResponse;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.TypedObject1;
import org.openapis.openapi.models.shared.TypedObject1Type;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.TypedObject1 req = new TypedObject1(TypedObject1Type.OBJ1, "natus");            

            NullableTypedObjectPostResponse res = sdk.unions.nullableTypedObjectPost(req);

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
| `request`                                                                              | [org.openapis.openapi.models.shared.TypedObject1](../../models/shared/TypedObject1.md) | :heavy_check_mark:                                                                     | The request object to use for the request.                                             |


### Response

**[org.openapis.openapi.models.operations.NullableTypedObjectPostResponse](../../models/operations/NullableTypedObjectPostResponse.md)**


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

            org.openapis.openapi.models.. req = 3824.4d            

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

            org.openapis.openapi.models.. req = new SimpleObjectWithType("nihil", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectWithTypeInt32Enum.SIXTY_NINE, SimpleObjectWithTypeIntEnum.First, 1.1d, "example", "iusto") {{
                any = "quasi";
                bigint = 169025L;
                bigintStr = "doloribus";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                decimal = 8595.81d;
                enum_ = Enum.TWO;
                float32 = 2.2222222f;
                int_ = 999999L;
                int32 = 1;
                int32Enum = SimpleObjectWithTypeInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE;
                intEnum = SimpleObjectWithTypeIntEnum.First;
                intOptNull = 999999L;
                num = 1.1d;
                numOptNull = 1.1d;
                str = "example";
                strOpt = "optional example";
                type = "tempora";
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


## typedObjectNullableOneOfPost

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.TypedObjectNullableOneOfPostResponse;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.TypedObject1;
import org.openapis.openapi.models.shared.TypedObject1Type;
import org.openapis.openapi.models.shared.TypedObject2;
import org.openapis.openapi.models.shared.TypedObject2Type;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.. req = new TypedObject1(TypedObject1Type.OBJ1, "maiores") {{
                type = TypedObject1Type.OBJ1;
                value = "praesentium";
            }}            

            TypedObjectNullableOneOfPostResponse res = sdk.unions.typedObjectNullableOneOfPost(req);

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

**[org.openapis.openapi.models.operations.TypedObjectNullableOneOfPostResponse](../../models/operations/TypedObjectNullableOneOfPostResponse.md)**


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

            org.openapis.openapi.models.. req = new TypedObject3(TypedObject3Type.OBJ3, "architecto") {{
                type = TypedObject3Type.OBJ3;
                value = "vel";
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

            org.openapis.openapi.models.. req = new DeepObject("cum",                 new org.openapis.openapi.models.shared.SimpleObject[]{{
                                add(new SimpleObject("est", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                                    any = "aliquid";
                                    bigint = 109784L;
                                    bigintStr = "voluptatum";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    decimal = 6063.08d;
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
                                }}),
                            }}, false, 959143L,                 new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                                put("officiis", new SimpleObject("deleniti", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                                    any = "architecto";
                                    bigint = 682119L;
                                    bigintStr = "pariatur";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    decimal = 8913.15d;
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
                            }}, 9583.08d,                 new SimpleObject("rem", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1d, "example") {{
                                bigint = 992074L;
                                bigintStr = "ratione";
                                boolOpt = true;
                                decimal = 3552.25d;
                                intOptNull = 999999L;
                                numOptNull = 1.1d;
                                strOpt = "optional example";
                            }};, "perferendis") {{
                any = new SimpleObject("aliquid", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                    any = "dicta";
                    bigint = 483706L;
                    bigintStr = "tempora";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    decimal = 4582.59d;
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
                arr = new org.openapis.openapi.models.shared.SimpleObject[]{{
                    add(new SimpleObject("suscipit", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                        any = "sunt";
                        bigint = 344718L;
                        bigintStr = "fugiat";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 7137.67d;
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
                int_ = 431760L;
                map = new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                    put("voluptas", new SimpleObject("mollitia", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                        any = "iste";
                        bigint = 661607L;
                        bigintStr = "ab";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        decimal = 6253.58d;
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
                }};
                num = 3240.83d;
                obj = new SimpleObject("ex", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.First, 1.1d, "example") {{
                    any = "deleniti";
                    bigint = 316220L;
                    bigintStr = "vitae";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    decimal = 8333.16d;
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
                }};
                str = "expedita";
                type = "voluptatem";
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

