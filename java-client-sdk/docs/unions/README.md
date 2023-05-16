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

            org.openapis.openapi.models.. req = 284000L            

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

            org.openapis.openapi.models.. req = 2384.13            

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

            org.openapis.openapi.models.. req = new DeepObjectWithType("at",                 new org.openapis.openapi.models.shared.SimpleObject[]{{
                                add(new SimpleObject("beatae", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.SIXTY_NINE, SimpleObjectIntEnumEnum.Second, 1.1, "example") {{
                                    any = "eos";
                                    bigint = 958741L;
                                    bigintStr = "eum";
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
                                }}),
                                add(new SimpleObject("earum", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.SIXTY_NINE, SimpleObjectIntEnumEnum.Third, 1.1, "example") {{
                                    any = "earum";
                                    bigint = 745398L;
                                    bigintStr = "hic";
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
                                add(new SimpleObject("fugit", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnumEnum.Third, 1.1, "example") {{
                                    any = "debitis";
                                    bigint = 399802L;
                                    bigintStr = "porro";
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
                                }}),
                                add(new SimpleObject("quasi", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.FIFTY_FIVE, SimpleObjectIntEnumEnum.Second, 1.1, "example") {{
                                    any = "ratione";
                                    bigint = 656762L;
                                    bigintStr = "necessitatibus";
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
                            }}, false, 619183L,                 new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                                put("suscipit", new SimpleObject("necessitatibus", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.FIFTY_FIVE, SimpleObjectIntEnumEnum.First, 1.1, "example") {{
                                    any = "adipisci";
                                    bigint = 96562L;
                                    bigintStr = "magni";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    enum_ = EnumEnum.TWO;
                                    float32 = 2.2222222;
                                    int_ = 999999L;
                                    int32 = 1;
                                    int32Enum = SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE;
                                    intEnum = SimpleObjectIntEnumEnum.Third;
                                    intOptNull = 999999L;
                                    num = 1.1;
                                    numOptNull = 1.1;
                                    str = "example";
                                    strOpt = "optional example";
                                }});
                                put("nihil", new SimpleObject("maiores", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnumEnum.Second, 1.1, "example") {{
                                    any = "molestiae";
                                    bigint = 115834L;
                                    bigintStr = "iusto";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    enum_ = EnumEnum.TWO;
                                    float32 = 2.2222222;
                                    int_ = 999999L;
                                    int32 = 1;
                                    int32Enum = SimpleObjectInt32EnumEnum.SIXTY_NINE;
                                    intEnum = SimpleObjectIntEnumEnum.Second;
                                    intOptNull = 999999L;
                                    num = 1.1;
                                    numOptNull = 1.1;
                                    str = "example";
                                    strOpt = "optional example";
                                }});
                                put("architecto", new SimpleObject("esse", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.SIXTY_NINE, SimpleObjectIntEnumEnum.First, 1.1, "example") {{
                                    any = "fugiat";
                                    bigint = 39650L;
                                    bigintStr = "dicta";
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
                            }}, 3998.12,                 new SimpleObject("ipsa", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnumEnum.First, 1.1, "example") {{
                                bigint = 344718L;
                                bigintStr = "fugiat";
                                boolOpt = true;
                                intOptNull = 999999L;
                                numOptNull = 1.1;
                                strOpt = "optional example";
                            }};, "expedita") {{
                any = "eum";
                arr = new org.openapis.openapi.models.shared.SimpleObject[]{{
                    add(new SimpleObject("reiciendis", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.SIXTY_NINE, SimpleObjectIntEnumEnum.First, 1.1, "example") {{
                        any = "recusandae";
                        bigint = 456520L;
                        bigintStr = "provident";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        enum_ = EnumEnum.TWO;
                        float32 = 2.2222222;
                        int_ = 999999L;
                        int32 = 1;
                        int32Enum = SimpleObjectInt32EnumEnum.SIXTY_NINE;
                        intEnum = SimpleObjectIntEnumEnum.Second;
                        intOptNull = 999999L;
                        num = 1.1;
                        numOptNull = 1.1;
                        str = "example";
                        strOpt = "optional example";
                    }}),
                    add(new SimpleObject("provident", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnumEnum.Second, 1.1, "example") {{
                        any = "ullam";
                        bigint = 96804L;
                        bigintStr = "animi";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        enum_ = EnumEnum.TWO;
                        float32 = 2.2222222;
                        int_ = 999999L;
                        int32 = 1;
                        int32Enum = SimpleObjectInt32EnumEnum.SIXTY_NINE;
                        intEnum = SimpleObjectIntEnumEnum.Second;
                        intOptNull = 999999L;
                        num = 1.1;
                        numOptNull = 1.1;
                        str = "example";
                        strOpt = "optional example";
                    }}),
                }};
                bool = false;
                int_ = 402767L;
                map = new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                    put("accusantium", new SimpleObject("earum", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.SIXTY_NINE, SimpleObjectIntEnumEnum.Third, 1.1, "example") {{
                        any = "repellat";
                        bigint = 984632L;
                        bigintStr = "ullam";
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
                    }});
                    put("placeat", new SimpleObject("cumque", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.FIFTY_FIVE, SimpleObjectIntEnumEnum.Third, 1.1, "example") {{
                        any = "modi";
                        bigint = 976226L;
                        bigintStr = "molestias";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        enum_ = EnumEnum.TWO;
                        float32 = 2.2222222;
                        int_ = 999999L;
                        int32 = 1;
                        int32Enum = SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE;
                        intEnum = SimpleObjectIntEnumEnum.Third;
                        intOptNull = 999999L;
                        num = 1.1;
                        numOptNull = 1.1;
                        str = "example";
                        strOpt = "optional example";
                    }});
                }};
                num = 2722.29;
                obj = new SimpleObject("perferendis", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.FIFTY_FIVE, SimpleObjectIntEnumEnum.First, 1.1, "example") {{
                    any = "quis";
                    bigint = 82057L;
                    bigintStr = "fugit";
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
                }};
                str = "eum";
                type = "eius";
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

            org.openapis.openapi.models.. req = new TypedObject2(TypedObject2TypeEnum.OBJ2, "suscipit") {{
                type = TypedObject2TypeEnum.OBJ2;
                value = "officia";
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

            org.openapis.openapi.models.. req = new SimpleObject("ab", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.SIXTY_NINE, SimpleObjectIntEnumEnum.Third, 1.1, "example") {{
                any = "perferendis";
                bigint = 431760L;
                bigintStr = "voluptas";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                enum_ = EnumEnum.TWO;
                float32 = 2.2222222;
                int_ = 999999L;
                int32 = 1;
                int32Enum = SimpleObjectInt32EnumEnum.SIXTY_NINE;
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
