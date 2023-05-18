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
import org.openapis.openapi.models.shared.EnumEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;
import org.openapis.openapi.models.shared.SimpleObjectInt32EnumEnum;
import org.openapis.openapi.models.shared.SimpleObjectIntEnumEnum;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.. req = "nostrum"            

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

            org.openapis.openapi.models.. req = false            

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

## stronglyTypedOneOfPost

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.StronglyTypedOneOfPostResponse;
import org.openapis.openapi.models.shared.DeepObjectWithType;
import org.openapis.openapi.models.shared.EnumEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;
import org.openapis.openapi.models.shared.SimpleObjectInt32EnumEnum;
import org.openapis.openapi.models.shared.SimpleObjectIntEnumEnum;
import org.openapis.openapi.models.shared.SimpleObjectWithType;
import org.openapis.openapi.models.shared.SimpleObjectWithTypeInt32EnumEnum;
import org.openapis.openapi.models.shared.SimpleObjectWithTypeIntEnumEnum;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.. req = new DeepObjectWithType("architecto",                 new org.openapis.openapi.models.shared.SimpleObject[]{{
                                add(new SimpleObject("earum", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.SIXTY_NINE, SimpleObjectIntEnumEnum.Third, 1.1, "example") {{
                                    any = "pariatur";
                                    bigint = 891315L;
                                    bigintStr = "voluptatem";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    enum_ = EnumEnum.TWO;
                                    float32 = 2.2222222;
                                    int_ = 999999L;
                                    int32 = 1;
                                    int32Enum = SimpleObjectInt32EnumEnum.FIFTY_FIVE;
                                    intEnum = SimpleObjectIntEnumEnum.Second;
                                    intOptNull = 999999L;
                                    num = 1.1;
                                    numOptNull = 1.1;
                                    str = "example";
                                    strOpt = "optional example";
                                }}),
                                add(new SimpleObject("ullam", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.FIFTY_FIVE, SimpleObjectIntEnumEnum.Third, 1.1, "example") {{
                                    any = "rem";
                                    bigint = 796320L;
                                    bigintStr = "nemo";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    enum_ = EnumEnum.TWO;
                                    float32 = 2.2222222;
                                    int_ = 999999L;
                                    int32 = 1;
                                    int32Enum = SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE;
                                    intEnum = SimpleObjectIntEnumEnum.First;
                                    intOptNull = 999999L;
                                    num = 1.1;
                                    numOptNull = 1.1;
                                    str = "example";
                                    strOpt = "optional example";
                                }}),
                                add(new SimpleObject("culpa", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.FIFTY_FIVE, SimpleObjectIntEnumEnum.First, 1.1, "example") {{
                                    any = "totam";
                                    bigint = 770675L;
                                    bigintStr = "quibusdam";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    enum_ = EnumEnum.TWO;
                                    float32 = 2.2222222;
                                    int_ = 999999L;
                                    int32 = 1;
                                    int32Enum = SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE;
                                    intEnum = SimpleObjectIntEnumEnum.Second;
                                    intOptNull = 999999L;
                                    num = 1.1;
                                    numOptNull = 1.1;
                                    str = "example";
                                    strOpt = "optional example";
                                }}),
                            }}, false, 80532L,                 new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                                put("veritatis", new SimpleObject("modi", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.FIFTY_FIVE, SimpleObjectIntEnumEnum.First, 1.1, "example") {{
                                    any = "tempora";
                                    bigint = 221396L;
                                    bigintStr = "consequatur";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    enum_ = EnumEnum.TWO;
                                    float32 = 2.2222222;
                                    int_ = 999999L;
                                    int32 = 1;
                                    int32Enum = SimpleObjectInt32EnumEnum.FIFTY_FIVE;
                                    intEnum = SimpleObjectIntEnumEnum.First;
                                    intOptNull = 999999L;
                                    num = 1.1;
                                    numOptNull = 1.1;
                                    str = "example";
                                    strOpt = "optional example";
                                }});
                                put("laudantium", new SimpleObject("ipsa", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.SIXTY_NINE, SimpleObjectIntEnumEnum.Third, 1.1, "example") {{
                                    any = "quae";
                                    bigint = 222658L;
                                    bigintStr = "fugiat";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    enum_ = EnumEnum.TWO;
                                    float32 = 2.2222222;
                                    int_ = 999999L;
                                    int32 = 1;
                                    int32Enum = SimpleObjectInt32EnumEnum.SIXTY_NINE;
                                    intEnum = SimpleObjectIntEnumEnum.First;
                                    intOptNull = 999999L;
                                    num = 1.1;
                                    numOptNull = 1.1;
                                    str = "example";
                                    strOpt = "optional example";
                                }});
                                put("impedit", new SimpleObject("nesciunt", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnumEnum.Second, 1.1, "example") {{
                                    any = "officiis";
                                    bigint = 456410L;
                                    bigintStr = "necessitatibus";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    enum_ = EnumEnum.TWO;
                                    float32 = 2.2222222;
                                    int_ = 999999L;
                                    int32 = 1;
                                    int32Enum = SimpleObjectInt32EnumEnum.FIFTY_FIVE;
                                    intEnum = SimpleObjectIntEnumEnum.First;
                                    intOptNull = 999999L;
                                    num = 1.1;
                                    numOptNull = 1.1;
                                    str = "example";
                                    strOpt = "optional example";
                                }});
                            }}, 4269.43,                 new SimpleObject("voluptatum", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.FIFTY_FIVE, SimpleObjectIntEnumEnum.Second, 1.1, "example") {{
                                bigint = 70410L;
                                bigintStr = "porro";
                                boolOpt = true;
                                intOptNull = 999999L;
                                numOptNull = 1.1;
                                strOpt = "optional example";
                            }};, "autem") {{
                any = new SimpleObject("voluptas", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.SIXTY_NINE, SimpleObjectIntEnumEnum.Second, 1.1, "example") {{
                    any = "officia";
                    bigint = 381397L;
                    bigintStr = "aliquid";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    enum_ = EnumEnum.TWO;
                    float32 = 2.2222222;
                    int_ = 999999L;
                    int32 = 1;
                    int32Enum = SimpleObjectInt32EnumEnum.FIFTY_FIVE;
                    intEnum = SimpleObjectIntEnumEnum.Second;
                    intOptNull = 999999L;
                    num = 1.1;
                    numOptNull = 1.1;
                    str = "example";
                    strOpt = "optional example";
                }};
                arr = new org.openapis.openapi.models.shared.SimpleObject[]{{
                    add(new SimpleObject("libero", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.FIFTY_FIVE, SimpleObjectIntEnumEnum.Second, 1.1, "example") {{
                        any = "error";
                        bigint = 822407L;
                        bigintStr = "voluptates";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        enum_ = EnumEnum.TWO;
                        float32 = 2.2222222;
                        int_ = 999999L;
                        int32 = 1;
                        int32Enum = SimpleObjectInt32EnumEnum.SIXTY_NINE;
                        intEnum = SimpleObjectIntEnumEnum.Third;
                        intOptNull = 999999L;
                        num = 1.1;
                        numOptNull = 1.1;
                        str = "example";
                        strOpt = "optional example";
                    }}),
                }};
                bool = false;
                int_ = 316220L;
                map = new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                    put("repellendus", new SimpleObject("expedita", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.FIFTY_FIVE, SimpleObjectIntEnumEnum.Second, 1.1, "example") {{
                        any = "ex";
                        bigint = 775803L;
                        bigintStr = "ex";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        enum_ = EnumEnum.TWO;
                        float32 = 2.2222222;
                        int_ = 999999L;
                        int32 = 1;
                        int32Enum = SimpleObjectInt32EnumEnum.FIFTY_FIVE;
                        intEnum = SimpleObjectIntEnumEnum.First;
                        intOptNull = 999999L;
                        num = 1.1;
                        numOptNull = 1.1;
                        str = "example";
                        strOpt = "optional example";
                    }});
                }};
                num = 7372.54;
                obj = new SimpleObject("rerum", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.SIXTY_NINE, SimpleObjectIntEnumEnum.Second, 1.1, "example") {{
                    any = "aliquid";
                    bigint = 109784L;
                    bigintStr = "voluptatum";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    enum_ = EnumEnum.TWO;
                    float32 = 2.2222222;
                    int_ = 999999L;
                    int32 = 1;
                    int32Enum = SimpleObjectInt32EnumEnum.SIXTY_NINE;
                    intEnum = SimpleObjectIntEnumEnum.First;
                    intOptNull = 999999L;
                    num = 1.1;
                    numOptNull = 1.1;
                    str = "example";
                    strOpt = "optional example";
                }};
                str = "voluptatem";
                type = "sapiente";
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

## typedObjectOneOfPost

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.TypedObjectOneOfPostResponse;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.TypedObject1;
import org.openapis.openapi.models.shared.TypedObject1TypeEnum;
import org.openapis.openapi.models.shared.TypedObject2;
import org.openapis.openapi.models.shared.TypedObject2TypeEnum;
import org.openapis.openapi.models.shared.TypedObject3;
import org.openapis.openapi.models.shared.TypedObject3TypeEnum;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.. req = new TypedObject3(TypedObject3TypeEnum.OBJ3, "recusandae") {{
                type = TypedObject3TypeEnum.OBJ3;
                value = "laboriosam";
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

## weaklyTypedOneOfPost

### Example Usage

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.WeaklyTypedOneOfPostResponse;
import org.openapis.openapi.models.shared.DeepObject;
import org.openapis.openapi.models.shared.EnumEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;
import org.openapis.openapi.models.shared.SimpleObjectInt32EnumEnum;
import org.openapis.openapi.models.shared.SimpleObjectIntEnumEnum;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.. req = new SimpleObject("at", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnumEnum.Third, 1.1, "example") {{
                any = "voluptatem";
                bigint = 350207L;
                bigintStr = "necessitatibus";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                enum_ = EnumEnum.TWO;
                float32 = 2.2222222;
                int_ = 999999L;
                int32 = 1;
                int32Enum = SimpleObjectInt32EnumEnum.FIFTY_FIVE;
                intEnum = SimpleObjectIntEnumEnum.Second;
                intOptNull = 999999L;
                num = 1.1;
                numOptNull = 1.1;
                str = "example";
                strOpt = "optional example";
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
