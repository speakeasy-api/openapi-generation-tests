# openapi

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Gradle

```groovy
implementation 'org.openapis.openapi:openapi:2.1.2'
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example 1

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GetGlobalNameOverrideResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.SimpleObject req = new SimpleObject(
                "any",
                true,
                LocalDate.parse("2020-01-01"),
                OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                Enum.ONE,
                1.1f,
                1L,
                1,
                Int32Enum.FIFTY_FIVE,
                IntEnum.Second,
                1.1d,
                "test"){{
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                boolOpt = true;
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                intOptNull = 697039L;
                numOptNull = 6448.77d;
                strOpt = "testOptional";

            }};

            org.openapis.openapi.models.operations.GetGlobalNameOverrideResponse res = sdk.generation.globalNameOverridden(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 2

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ConnectionErrorGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.ConnectionErrorGetResponse res = sdk.errors.connectionErrorGet();

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 3

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.StatusGetErrorRequest;
import org.openapis.openapi.models.operations.StatusGetErrorResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.StatusGetErrorResponse res = sdk.errors.statusGetError(458364L);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 4

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.StatusGetXSpeakeasyErrorsRequest;
import org.openapis.openapi.models.operations.StatusGetXSpeakeasyErrorsResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.StatusGetXSpeakeasyErrorsResponse res = sdk.errors.statusGetXSpeakeasyErrors(385913L);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 5

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.FlattenedTypedObjectPostResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            Object req = "string";

            org.openapis.openapi.models.operations.FlattenedTypedObjectPostResponse res = sdk.unions.flattenedTypedObjectPost(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 6

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.MixedTypeOneOfPostResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            Object req = "string";

            org.openapis.openapi.models.operations.MixedTypeOneOfPostResponse res = sdk.unions.mixedTypeOneOfPost(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 7

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.NullableOneOfRefInObjectPostResponse;
import org.openapis.openapi.models.shared.NullableOneOfRefInObject;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.Type;
import org.openapis.openapi.models.shared.TypedObject1;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.NullableOneOfRefInObject req = new NullableOneOfRefInObject(
                new TypedObject1(
                    Type.OBJ1,
                    "string"),
                "string",
                "string");

            org.openapis.openapi.models.operations.NullableOneOfRefInObjectPostResponse res = sdk.unions.nullableOneOfRefInObjectPost(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 8

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.NullableOneOfSchemaPostResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            Object req = "string";

            org.openapis.openapi.models.operations.NullableOneOfSchemaPostResponse res = sdk.unions.nullableOneOfSchemaPost(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 9

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
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.NullableOneOfTypeInObject req = new NullableOneOfTypeInObject(
                false,
                "string",
                false);

            org.openapis.openapi.models.operations.NullableOneOfTypeInObjectPostResponse res = sdk.unions.nullableOneOfTypeInObjectPost(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 10

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.NullableTypedObjectPostResponse;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.Type;
import org.openapis.openapi.models.shared.TypedObject1;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.TypedObject1 req = new TypedObject1(
                Type.OBJ1,
                "string");

            org.openapis.openapi.models.operations.NullableTypedObjectPostResponse res = sdk.unions.nullableTypedObjectPost(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 11

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PrimitiveTypeOneOfPostResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            Object req = "string";

            org.openapis.openapi.models.operations.PrimitiveTypeOneOfPostResponse res = sdk.unions.primitiveTypeOneOfPost(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 12

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.StronglyTypedOneOfPostResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            Object req = "string";

            org.openapis.openapi.models.operations.StronglyTypedOneOfPostResponse res = sdk.unions.stronglyTypedOneOfPost(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 13

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.TypedObjectNullableOneOfPostResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            Object req = "string";

            org.openapis.openapi.models.operations.TypedObjectNullableOneOfPostResponse res = sdk.unions.typedObjectNullableOneOfPost(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 14

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.TypedObjectOneOfPostResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            Object req = "string";

            org.openapis.openapi.models.operations.TypedObjectOneOfPostResponse res = sdk.unions.typedObjectOneOfPost(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 15

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.UnionBigIntDecimalResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            Object req = "string";

            org.openapis.openapi.models.operations.UnionBigIntDecimalResponse res = sdk.unions.unionBigIntDecimal(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 16

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.UnionDateNullResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            LocalDate req = LocalDate.parse("2022-11-25");

            org.openapis.openapi.models.operations.UnionDateNullResponse res = sdk.unions.unionDateNull(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 17

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.UnionDateTimeBigIntResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            Object req = "string";

            org.openapis.openapi.models.operations.UnionDateTimeBigIntResponse res = sdk.unions.unionDateTimeBigInt(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 18

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.UnionDateTimeNullResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            OffsetDateTime req = OffsetDateTime.parse("2022-04-12T19:39:53.907Z");

            org.openapis.openapi.models.operations.UnionDateTimeNullResponse res = sdk.unions.unionDateTimeNull(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 19

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.WeaklyTypedOneOfPostResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            Object req = "string";

            org.openapis.openapi.models.operations.WeaklyTypedOneOfPostResponse res = sdk.unions.weaklyTypedOneOfPost(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 20

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ComponentBodyAndParamConflictRequest;
import org.openapis.openapi.models.operations.ComponentBodyAndParamConflictResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.ComponentBodyAndParamConflictResponse res = sdk.flattening.componentBodyAndParamConflict(new SimpleObject(
            "any",
            true,
            LocalDate.parse("2020-01-01"),
            OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
            Enum.ONE,
            1.1f,
            1L,
            1,
            Int32Enum.FIFTY_FIVE,
            IntEnum.Second,
            1.1d,
            "test"){{
                any = "any";
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                enum_ = Enum.ONE;
                float32 = 1.1f;
                int_ = 1L;
                int32 = 1;
                int32Enum = Int32Enum.FIFTY_FIVE;
                intEnum = IntEnum.Second;
                num = 1.1d;
                str = "test";
                strOpt = "testOptional";
            }}, "string");

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 21

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ComponentBodyAndParamNoConflictRequest;
import org.openapis.openapi.models.operations.ComponentBodyAndParamNoConflictResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.ComponentBodyAndParamNoConflictResponse res = sdk.flattening.componentBodyAndParamNoConflict("string", new SimpleObject(
            "any",
            true,
            LocalDate.parse("2020-01-01"),
            OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
            Enum.ONE,
            1.1f,
            1L,
            1,
            Int32Enum.FIFTY_FIVE,
            IntEnum.Second,
            1.1d,
            "test"){{
                any = "any";
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                enum_ = Enum.ONE;
                float32 = 1.1f;
                int_ = 1L;
                int32 = 1;
                int32Enum = Int32Enum.FIFTY_FIVE;
                intEnum = IntEnum.Second;
                num = 1.1d;
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

### Example 22

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ConflictingParamsRequest;
import org.openapis.openapi.models.operations.ConflictingParamsResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.ConflictingParamsResponse res = sdk.flattening.conflictingParams("string", "string");

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 23

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.InlineBodyAndParamConflictRequest;
import org.openapis.openapi.models.operations.InlineBodyAndParamConflictRequestBody;
import org.openapis.openapi.models.operations.InlineBodyAndParamConflictResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.InlineBodyAndParamConflictResponse res = sdk.flattening.inlineBodyAndParamConflict(new InlineBodyAndParamConflictRequestBody(
            "string"){{
                str = "string";
            }}, "string");

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 24

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.InlineBodyAndParamNoConflictRequest;
import org.openapis.openapi.models.operations.InlineBodyAndParamNoConflictRequestBody;
import org.openapis.openapi.models.operations.InlineBodyAndParamNoConflictResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.InlineBodyAndParamNoConflictResponse res = sdk.flattening.inlineBodyAndParamNoConflict(new InlineBodyAndParamNoConflictRequestBody(
            "string"){{
                bodyStr = "string";
            }}, "string");

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 25

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GlobalPathParameterGetRequest;
import org.openapis.openapi.models.operations.GlobalPathParameterGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.GlobalPathParameterGetResponse res = sdk.globals.globalPathParameterGet(719830L);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 26

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GlobalsQueryParameterGetRequest;
import org.openapis.openapi.models.operations.GlobalsQueryParameterGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.GlobalsQueryParameterGetResponse res = sdk.globals.globalsQueryParameterGet("string");

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 27

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
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.DeepObjectQueryParamsMapResponse res = sdk.parameters.deepObjectQueryParamsMap(new java.util.HashMap<String, String>(
            ){{
                put("test", "value");
                put("test2", "value2");
            }}, new java.util.HashMap<String, String[]>(
            ){{
                put("test", new String[]{{
                    add("test"),
                    add("test2"),
                }});
                put("test2", new String[]{{
                    add("test3"),
                    add("test4"),
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

### Example 28

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.DeepObjectQueryParamsObjectRequest;
import org.openapis.openapi.models.operations.DeepObjectQueryParamsObjectResponse;
import org.openapis.openapi.models.operations.ObjArrParam;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.DeepObjectQueryParamsObjectResponse res = sdk.parameters.deepObjectQueryParamsObject(new SimpleObject(
            "any",
            true,
            LocalDate.parse("2020-01-01"),
            OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
            Enum.ONE,
            1.1f,
            1L,
            1,
            Int32Enum.FIFTY_FIVE,
            IntEnum.Second,
            1.1d,
            "test"){{
                any = "any";
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                enum_ = Enum.ONE;
                float32 = 1.1f;
                int_ = 1L;
                int32 = 1;
                int32Enum = Int32Enum.FIFTY_FIVE;
                intEnum = IntEnum.Second;
                num = 1.1d;
                str = "test";
                strOpt = "testOptional";
            }}, new ObjArrParam(
            ){{
                arr = new String[]{{
                    add("test"),
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

### Example 29

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
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.DuplicateParamResponse res = sdk.parameters.duplicateParam("string");

            if (res.duplicateParamResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 30

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
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.FormQueryParamsArrayResponse res = sdk.parameters.formQueryParamsArray(new String[]{{
                add("test"),
                add("test2"),
            }}, new Long[]{{
                add(1L),
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

### Example 31

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.FormQueryParamsCamelObjectRequest;
import org.openapis.openapi.models.operations.FormQueryParamsCamelObjectResponse;
import org.openapis.openapi.models.operations.ObjParam;
import org.openapis.openapi.models.operations.ObjParamExploded;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.FormQueryParamsCamelObjectResponse res = sdk.parameters.formQueryParamsCamelObject(new ObjParamExploded(
            ){{
                itemCount = "10";
                searchTerm = "foo";
            }}, new ObjParam(
            ){{
                encodedCount = "11";
                encodedTerm = "bar";
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

### Example 32

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
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.FormQueryParamsMapResponse res = sdk.parameters.formQueryParamsMap(new java.util.HashMap<String, String>(
            ){{
                put("test", "value");
                put("test2", "value2");
            }}, new java.util.HashMap<String, Long>(
            ){{
                put("test", 1L);
                put("test2", 2L);
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

### Example 33

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.FormQueryParamsObjectRequest;
import org.openapis.openapi.models.operations.FormQueryParamsObjectResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.FormQueryParamsObjectResponse res = sdk.parameters.formQueryParamsObject(new SimpleObject(
            "any",
            true,
            LocalDate.parse("2020-01-01"),
            OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
            Enum.ONE,
            1.1f,
            1L,
            1,
            Int32Enum.FIFTY_FIVE,
            IntEnum.Second,
            1.1d,
            "test"){{
                any = "any";
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                enum_ = Enum.ONE;
                float32 = 1.1f;
                int_ = 1L;
                int32 = 1;
                int32Enum = Int32Enum.FIFTY_FIVE;
                intEnum = IntEnum.Second;
                num = 1.1d;
                str = "test";
                strOpt = "testOptional";
            }}, new SimpleObject(
            "any",
            true,
            LocalDate.parse("2020-01-01"),
            OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
            Enum.ONE,
            1.1f,
            1L,
            1,
            Int32Enum.FIFTY_FIVE,
            IntEnum.Second,
            1.1d,
            "test"){{
                any = "any";
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                enum_ = Enum.ONE;
                float32 = 1.1f;
                int_ = 1L;
                int32 = 1;
                int32Enum = Int32Enum.FIFTY_FIVE;
                intEnum = IntEnum.Second;
                num = 1.1d;
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

### Example 34

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
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.FormQueryParamsPrimitiveResponse res = sdk.parameters.formQueryParamsPrimitive(true, 1L, 1.1d, "test");

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 35

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
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.FormQueryParamsRefParamObjectResponse res = sdk.parameters.formQueryParamsRefParamObject(new RefQueryParamObj(
            true,
            1L,
            1.1d,
            "test"){{
                bool = true;
                int_ = 1L;
                num = 1.1d;
                str = "test";
            }}, new RefQueryParamObjExploded(
            true,
            1L,
            1.1d,
            "test"){{
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

### Example 36

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
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.HeaderParamsArrayResponse res = sdk.parameters.headerParamsArray(new String[]{{
                add("test1"),
                add("test2"),
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

### Example 37

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
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.HeaderParamsMapResponse res = sdk.parameters.headerParamsMap(new java.util.HashMap<String, String>(
            ){{
                put("key1", "value1");
                put("key2", "value2");
            }}, new java.util.HashMap<String, String>(
            ){{
                put("test1", "val1");
                put("test2", "val2");
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

### Example 38

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.HeaderParamsObjectRequest;
import org.openapis.openapi.models.operations.HeaderParamsObjectResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.HeaderParamsObjectResponse res = sdk.parameters.headerParamsObject(new SimpleObject(
            "any",
            true,
            LocalDate.parse("2020-01-01"),
            OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
            Enum.ONE,
            1.1f,
            1L,
            1,
            Int32Enum.FIFTY_FIVE,
            IntEnum.Second,
            1.1d,
            "test"){{
                any = "any";
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                enum_ = Enum.ONE;
                float32 = 1.1f;
                int_ = 1L;
                int32 = 1;
                int32Enum = Int32Enum.FIFTY_FIVE;
                intEnum = IntEnum.Second;
                num = 1.1d;
                str = "test";
                strOpt = "testOptional";
            }}, new SimpleObject(
            "any",
            true,
            LocalDate.parse("2020-01-01"),
            OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
            Enum.ONE,
            1.1f,
            1L,
            1,
            Int32Enum.FIFTY_FIVE,
            IntEnum.Second,
            1.1d,
            "test"){{
                any = "any";
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                enum_ = Enum.ONE;
                float32 = 1.1f;
                int_ = 1L;
                int32 = 1;
                int32Enum = Int32Enum.FIFTY_FIVE;
                intEnum = IntEnum.Second;
                num = 1.1d;
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

### Example 39

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
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.HeaderParamsPrimitiveResponse res = sdk.parameters.headerParamsPrimitive(true, 1L, 1.1d, "test");

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 40

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.JsonQueryParamsObjectRequest;
import org.openapis.openapi.models.operations.JsonQueryParamsObjectResponse;
import org.openapis.openapi.models.shared.DeepObject;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.JsonQueryParamsObjectResponse res = sdk.parameters.jsonQueryParamsObject(new DeepObject(
            "anyOf[0]",
            new org.openapis.openapi.models.shared.SimpleObject[]{{
                add(new SimpleObject(
                "any",
                true,
                LocalDate.parse("2020-01-01"),
                OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                Enum.ONE,
                1.1f,
                1L,
                1,
                Int32Enum.FIFTY_FIVE,
                IntEnum.Second,
                1.1d,
                "test"){{
                    any = "any";
                    bigint = 8821239038968084L;
                    bigintStr = "9223372036854775808";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                    decimal = 3.141592653589793d;
                    decimalStr = "3.14159265358979344719667586";
                    enum_ = Enum.ONE;
                    float32 = 1.1f;
                    int_ = 1L;
                    int32 = 1;
                    int32Enum = Int32Enum.FIFTY_FIVE;
                    intEnum = IntEnum.Second;
                    num = 1.1d;
                    str = "test";
                    strOpt = "testOptional";
                }}),
                add(new SimpleObject(
                "any",
                true,
                LocalDate.parse("2020-01-01"),
                OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                Enum.ONE,
                1.1f,
                1L,
                1,
                Int32Enum.FIFTY_FIVE,
                IntEnum.Second,
                1.1d,
                "test"){{
                    any = "any";
                    bigint = 8821239038968084L;
                    bigintStr = "9223372036854775808";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                    decimal = 3.141592653589793d;
                    decimalStr = "3.14159265358979344719667586";
                    enum_ = Enum.ONE;
                    float32 = 1.1f;
                    int_ = 1L;
                    int32 = 1;
                    int32Enum = Int32Enum.FIFTY_FIVE;
                    intEnum = IntEnum.Second;
                    num = 1.1d;
                    str = "test";
                    strOpt = "testOptional";
                }}),
            }},
            true,
            1L,
            new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>(
            ){{
                put("key", new SimpleObject(
                "any",
                true,
                LocalDate.parse("2020-01-01"),
                OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                Enum.ONE,
                1.1f,
                1L,
                1,
                Int32Enum.FIFTY_FIVE,
                IntEnum.Second,
                1.1d,
                "test"){{
                    any = "any";
                    bigint = 8821239038968084L;
                    bigintStr = "9223372036854775808";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                    decimal = 3.141592653589793d;
                    decimalStr = "3.14159265358979344719667586";
                    enum_ = Enum.ONE;
                    float32 = 1.1f;
                    int_ = 1L;
                    int32 = 1;
                    int32Enum = Int32Enum.FIFTY_FIVE;
                    intEnum = IntEnum.Second;
                    num = 1.1d;
                    str = "test";
                    strOpt = "testOptional";
                }});
                put("key2", new SimpleObject(
                "any",
                true,
                LocalDate.parse("2020-01-01"),
                OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                Enum.ONE,
                1.1f,
                1L,
                1,
                Int32Enum.FIFTY_FIVE,
                IntEnum.Second,
                1.1d,
                "test"){{
                    any = "any";
                    bigint = 8821239038968084L;
                    bigintStr = "9223372036854775808";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                    decimal = 3.141592653589793d;
                    decimalStr = "3.14159265358979344719667586";
                    enum_ = Enum.ONE;
                    float32 = 1.1f;
                    int_ = 1L;
                    int32 = 1;
                    int32Enum = Int32Enum.FIFTY_FIVE;
                    intEnum = IntEnum.Second;
                    num = 1.1d;
                    str = "test";
                    strOpt = "testOptional";
                }});
            }},
            1.1d,
            new SimpleObject(
            "any",
            true,
            LocalDate.parse("2020-01-01"),
            OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
            Enum.ONE,
            1.1f,
            1L,
            1,
            Int32Enum.FIFTY_FIVE,
            IntEnum.Second,
            1.1d,
            "test"){{
            bigint = 8821239038968084L;
            bigintStr = "9223372036854775808";
            boolOpt = true;
            decimal = 3.141592653589793d;
            decimalStr = "3.14159265358979344719667586";
            intOptNull = 801553L;
            numOptNull = 9688.05d;
            strOpt = "testOptional";

            }},
            "test"){{
                any = "anyOf[0]";
                arr = new org.openapis.openapi.models.shared.SimpleObject[]{{
                    add(new SimpleObject(
                    "any",
                    true,
                    LocalDate.parse("2020-01-01"),
                    OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                    Enum.ONE,
                    1.1f,
                    1L,
                    1,
                    Int32Enum.FIFTY_FIVE,
                    IntEnum.Second,
                    1.1d,
                    "test"){{
                        any = "any";
                        bigint = 8821239038968084L;
                        bigintStr = "9223372036854775808";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                        decimal = 3.141592653589793d;
                        decimalStr = "3.14159265358979344719667586";
                        enum_ = Enum.ONE;
                        float32 = 1.1f;
                        int_ = 1L;
                        int32 = 1;
                        int32Enum = Int32Enum.FIFTY_FIVE;
                        intEnum = IntEnum.Second;
                        num = 1.1d;
                        str = "test";
                        strOpt = "testOptional";
                    }}),
                    add(new SimpleObject(
                    "any",
                    true,
                    LocalDate.parse("2020-01-01"),
                    OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                    Enum.ONE,
                    1.1f,
                    1L,
                    1,
                    Int32Enum.FIFTY_FIVE,
                    IntEnum.Second,
                    1.1d,
                    "test"){{
                        any = "any";
                        bigint = 8821239038968084L;
                        bigintStr = "9223372036854775808";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                        decimal = 3.141592653589793d;
                        decimalStr = "3.14159265358979344719667586";
                        enum_ = Enum.ONE;
                        float32 = 1.1f;
                        int_ = 1L;
                        int32 = 1;
                        int32Enum = Int32Enum.FIFTY_FIVE;
                        intEnum = IntEnum.Second;
                        num = 1.1d;
                        str = "test";
                        strOpt = "testOptional";
                    }}),
                }};
                bool = true;
                int_ = 1L;
                map = new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>(
                ){{
                    put("key", new SimpleObject(
                    "any",
                    true,
                    LocalDate.parse("2020-01-01"),
                    OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                    Enum.ONE,
                    1.1f,
                    1L,
                    1,
                    Int32Enum.FIFTY_FIVE,
                    IntEnum.Second,
                    1.1d,
                    "test"){{
                        any = "any";
                        bigint = 8821239038968084L;
                        bigintStr = "9223372036854775808";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                        decimal = 3.141592653589793d;
                        decimalStr = "3.14159265358979344719667586";
                        enum_ = Enum.ONE;
                        float32 = 1.1f;
                        int_ = 1L;
                        int32 = 1;
                        int32Enum = Int32Enum.FIFTY_FIVE;
                        intEnum = IntEnum.Second;
                        num = 1.1d;
                        str = "test";
                        strOpt = "testOptional";
                    }});
                    put("key2", new SimpleObject(
                    "any",
                    true,
                    LocalDate.parse("2020-01-01"),
                    OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                    Enum.ONE,
                    1.1f,
                    1L,
                    1,
                    Int32Enum.FIFTY_FIVE,
                    IntEnum.Second,
                    1.1d,
                    "test"){{
                        any = "any";
                        bigint = 8821239038968084L;
                        bigintStr = "9223372036854775808";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                        decimal = 3.141592653589793d;
                        decimalStr = "3.14159265358979344719667586";
                        enum_ = Enum.ONE;
                        float32 = 1.1f;
                        int_ = 1L;
                        int32 = 1;
                        int32Enum = Int32Enum.FIFTY_FIVE;
                        intEnum = IntEnum.Second;
                        num = 1.1d;
                        str = "test";
                        strOpt = "testOptional";
                    }});
                }};
                num = 1.1d;
                obj = new SimpleObject(
                "any",
                true,
                LocalDate.parse("2020-01-01"),
                OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                Enum.ONE,
                1.1f,
                1L,
                1,
                Int32Enum.FIFTY_FIVE,
                IntEnum.Second,
                1.1d,
                "test"){{
                    any = "any";
                    bigint = 8821239038968084L;
                    bigintStr = "9223372036854775808";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                    decimal = 3.141592653589793d;
                    decimalStr = "3.14159265358979344719667586";
                    enum_ = Enum.ONE;
                    float32 = 1.1f;
                    int_ = 1L;
                    int32 = 1;
                    int32Enum = Int32Enum.FIFTY_FIVE;
                    intEnum = IntEnum.Second;
                    num = 1.1d;
                    str = "test";
                    strOpt = "testOptional";
                }};
                str = "test";
            }}, new SimpleObject(
            "any",
            true,
            LocalDate.parse("2020-01-01"),
            OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
            Enum.ONE,
            1.1f,
            1L,
            1,
            Int32Enum.FIFTY_FIVE,
            IntEnum.Second,
            1.1d,
            "test"){{
                any = "any";
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                enum_ = Enum.ONE;
                float32 = 1.1f;
                int_ = 1L;
                int32 = 1;
                int32Enum = Int32Enum.FIFTY_FIVE;
                intEnum = IntEnum.Second;
                num = 1.1d;
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

### Example 41

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
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.MixedParametersCamelCaseResponse res = sdk.parameters.mixedParametersCamelCase("headerValue", "pathValue", "queryValue");

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 42

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
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.MixedParametersPrimitivesResponse res = sdk.parameters.mixedParametersPrimitives("headerValue", "pathValue", "queryValue");

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 43

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.MixedQueryParamsRequest;
import org.openapis.openapi.models.operations.MixedQueryParamsResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.MixedQueryParamsResponse res = sdk.parameters.mixedQueryParams(new SimpleObject(
            "any",
            true,
            LocalDate.parse("2020-01-01"),
            OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
            Enum.ONE,
            1.1f,
            1L,
            1,
            Int32Enum.FIFTY_FIVE,
            IntEnum.Second,
            1.1d,
            "test"){{
                any = "any";
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                enum_ = Enum.ONE;
                float32 = 1.1f;
                int_ = 1L;
                int32 = 1;
                int32Enum = Int32Enum.FIFTY_FIVE;
                intEnum = IntEnum.Second;
                num = 1.1d;
                str = "test";
                strOpt = "testOptional";
            }}, new SimpleObject(
            "any",
            true,
            LocalDate.parse("2020-01-01"),
            OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
            Enum.ONE,
            1.1f,
            1L,
            1,
            Int32Enum.FIFTY_FIVE,
            IntEnum.Second,
            1.1d,
            "test"){{
                any = "any";
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                enum_ = Enum.ONE;
                float32 = 1.1f;
                int_ = 1L;
                int32 = 1;
                int32Enum = Int32Enum.FIFTY_FIVE;
                intEnum = IntEnum.Second;
                num = 1.1d;
                str = "test";
                strOpt = "testOptional";
            }}, new SimpleObject(
            "any",
            true,
            LocalDate.parse("2020-01-01"),
            OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
            Enum.ONE,
            1.1f,
            1L,
            1,
            Int32Enum.FIFTY_FIVE,
            IntEnum.Second,
            1.1d,
            "test"){{
                any = "any";
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                enum_ = Enum.ONE;
                float32 = 1.1f;
                int_ = 1L;
                int32 = 1;
                int32Enum = Int32Enum.FIFTY_FIVE;
                intEnum = IntEnum.Second;
                num = 1.1d;
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

### Example 44

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PathParameterJsonRequest;
import org.openapis.openapi.models.operations.PathParameterJsonResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.PathParameterJsonResponse res = sdk.parameters.pathParameterJson(new SimpleObject(
            "any",
            true,
            LocalDate.parse("2020-01-01"),
            OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
            Enum.ONE,
            1.1f,
            1L,
            1,
            Int32Enum.FIFTY_FIVE,
            IntEnum.Second,
            1.1d,
            "test"){{
                any = "any";
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                enum_ = Enum.ONE;
                float32 = 1.1f;
                int_ = 1L;
                int32 = 1;
                int32Enum = Int32Enum.FIFTY_FIVE;
                intEnum = IntEnum.Second;
                num = 1.1d;
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

### Example 45

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PipeDelimitedQueryParamsArrayRequest;
import org.openapis.openapi.models.operations.PipeDelimitedQueryParamsArrayResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.PipeDelimitedQueryParamsArrayResponse res = sdk.parameters.pipeDelimitedQueryParamsArray(new String[]{{
                add("test"),
                add("test2"),
            }}, new Long[]{{
                add(1L),
                add(2L),
            }}, new java.util.HashMap<String, String>(
            ){{
                put("key1", "val1");
                put("key2", "val2");
            }}, new SimpleObject(
            "any",
            true,
            LocalDate.parse("2020-01-01"),
            OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
            Enum.ONE,
            1.1f,
            1L,
            1,
            Int32Enum.FIFTY_FIVE,
            IntEnum.Second,
            1.1d,
            "test"){{
                any = "any";
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                enum_ = Enum.ONE;
                float32 = 1.1f;
                int_ = 1L;
                int32 = 1;
                int32Enum = Int32Enum.FIFTY_FIVE;
                intEnum = IntEnum.Second;
                num = 1.1d;
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

### Example 46

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
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.SimplePathParameterArraysResponse res = sdk.parameters.simplePathParameterArrays(new String[]{{
                add("test"),
                add("test2"),
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

### Example 47

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
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.SimplePathParameterMapsResponse res = sdk.parameters.simplePathParameterMaps(new java.util.HashMap<String, String>(
            ){{
                put("test", "value");
                put("test2", "value2");
            }}, new java.util.HashMap<String, Long>(
            ){{
                put("test", 1L);
                put("test2", 2L);
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

### Example 48

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.SimplePathParameterObjectsRequest;
import org.openapis.openapi.models.operations.SimplePathParameterObjectsResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.SimplePathParameterObjectsResponse res = sdk.parameters.simplePathParameterObjects(new SimpleObject(
            "any",
            true,
            LocalDate.parse("2020-01-01"),
            OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
            Enum.ONE,
            1.1f,
            1L,
            1,
            Int32Enum.FIFTY_FIVE,
            IntEnum.Second,
            1.1d,
            "test"){{
                any = "any";
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                enum_ = Enum.ONE;
                float32 = 1.1f;
                int_ = 1L;
                int32 = 1;
                int32Enum = Int32Enum.FIFTY_FIVE;
                intEnum = IntEnum.Second;
                num = 1.1d;
                str = "test";
                strOpt = "testOptional";
            }}, new SimpleObject(
            "any",
            true,
            LocalDate.parse("2020-01-01"),
            OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
            Enum.ONE,
            1.1f,
            1L,
            1,
            Int32Enum.FIFTY_FIVE,
            IntEnum.Second,
            1.1d,
            "test"){{
                any = "any";
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                enum_ = Enum.ONE;
                float32 = 1.1f;
                int_ = 1L;
                int32 = 1;
                int32Enum = Int32Enum.FIFTY_FIVE;
                intEnum = IntEnum.Second;
                num = 1.1d;
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

### Example 49

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
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.SimplePathParameterPrimitivesResponse res = sdk.parameters.simplePathParameterPrimitives(true, 1L, 1.1d, "test");

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 50

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.NestFirstGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.NestFirstGetResponse res = sdk.nest.first.get();

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 51

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.NestedGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.NestedGetResponse res = sdk.nested.get();

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 52

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.NestedFirstGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.NestedFirstGetResponse res = sdk.nested.first.get();

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 53

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.NestedSecondGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.NestedSecondGetResponse res = sdk.nested.second.get();

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 54

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.NullableObjectPostResponse;
import org.openapis.openapi.models.shared.NullableObject;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.NullableObject req = new NullableObject(
                302382L){{
                optional = "string";

            }};

            org.openapis.openapi.models.operations.NullableObjectPostResponse res = sdk.requestBodies.nullableObjectPost(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 55

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.NullableOptionalObj;
import org.openapis.openapi.models.operations.NullableRequiredEmptyObjectPostRequestBody;
import org.openapis.openapi.models.operations.NullableRequiredEmptyObjectPostResponse;
import org.openapis.openapi.models.operations.NullableRequiredObj;
import org.openapis.openapi.models.operations.RequiredObj;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.NullableRequiredEmptyObjectPostRequestBody req = new NullableRequiredEmptyObjectPostRequestBody(
                new NullableRequiredObj(
),
                new RequiredObj(
)){{
                nullableOptionalObj = new NullableOptionalObj(
);

            }};

            org.openapis.openapi.models.operations.NullableRequiredEmptyObjectPostResponse res = sdk.requestBodies.nullableRequiredEmptyObjectPost(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 56

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.NullableRequiredEnum;
import org.openapis.openapi.models.operations.NullableRequiredPropertyPostRequestBody;
import org.openapis.openapi.models.operations.NullableRequiredPropertyPostResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.NullableRequiredPropertyPostRequestBody req = new NullableRequiredPropertyPostRequestBody(
                new Double[]{{
                    add(2355.17d),
                }},
                NullableRequiredEnum.SECOND,
                50266L){{
                nullableOptionalInt = 282026L;

            }};

            org.openapis.openapi.models.operations.NullableRequiredPropertyPostResponse res = sdk.requestBodies.nullableRequiredPropertyPost(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 57

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.NullableRequiredSharedObjectPostRequestBody;
import org.openapis.openapi.models.operations.NullableRequiredSharedObjectPostResponse;
import org.openapis.openapi.models.shared.NullableObject;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.NullableRequiredSharedObjectPostRequestBody req = new NullableRequiredSharedObjectPostRequestBody(
                new NullableObject(
                    86533L){{
                    optional = "string";

                }}){{
                nullableOptionalObj = new NullableObject(
                    964394L){{
                    optional = "string";

                }};

            }};

            org.openapis.openapi.models.operations.NullableRequiredSharedObjectPostResponse res = sdk.requestBodies.nullableRequiredSharedObjectPost(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 58

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.SimpleObject[] req = new org.openapis.openapi.models.shared.SimpleObject[]{{
                add(new SimpleObject(
                "any",
                true,
                LocalDate.parse("2020-01-01"),
                OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                Enum.ONE,
                1.1f,
                1L,
                1,
                Int32Enum.FIFTY_FIVE,
                IntEnum.Second,
                1.1d,
                "test"){{
                    any = "any";
                    bigint = 8821239038968084L;
                    bigintStr = "9223372036854775808";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                    decimal = 3.141592653589793d;
                    decimalStr = "3.14159265358979344719667586";
                    enum_ = Enum.ONE;
                    float32 = 1.1f;
                    int_ = 1L;
                    int32 = 1;
                    int32Enum = Int32Enum.FIFTY_FIVE;
                    intEnum = IntEnum.Second;
                    num = 1.1d;
                    str = "test";
                    strOpt = "testOptional";
                }}),
            }};

            org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayResponse res = sdk.requestBodies.requestBodyPostApplicationJsonArray(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 59

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayCamelCaseResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32EnumVal;
import org.openapis.openapi.models.shared.IntEnumVal;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObjectCamelCase;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.SimpleObjectCamelCase[] req = new org.openapis.openapi.models.shared.SimpleObjectCamelCase[]{{
                add(new SimpleObjectCamelCase(
                "any example",
                true,
                OffsetDateTime.parse("2020-01-01T00:00:00Z"),
                LocalDate.parse("2020-01-01"),
                Enum.ONE,
                2.2222222f,
                Int32EnumVal.SIXTY_NINE,
                1,
                IntEnumVal.Third,
                999999L,
                1.1d,
                "example"){{
                    anyVal = "any example";
                    boolOptVal = true;
                    boolVal = true;
                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    dateVal = LocalDate.parse("2020-01-01");
                    enumVal = Enum.ONE;
                    float32Val = 2.2222222f;
                    int32EnumVal = Int32EnumVal.SIXTY_NINE;
                    int32Val = 1;
                    intEnumVal = IntEnumVal.Third;
                    intOptNullVal = 999999L;
                    intVal = 999999L;
                    numOptNullVal = 1.1d;
                    numVal = 1.1d;
                    strOptVal = "optional example";
                    strVal = "example";
                }}),
            }};

            org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayCamelCaseResponse res = sdk.requestBodies.requestBodyPostApplicationJsonArrayCamelCase(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 60

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayObjResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.SimpleObject[] req = new org.openapis.openapi.models.shared.SimpleObject[]{{
                add(new SimpleObject(
                "any",
                true,
                LocalDate.parse("2020-01-01"),
                OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                Enum.ONE,
                1.1f,
                1L,
                1,
                Int32Enum.FIFTY_FIVE,
                IntEnum.Second,
                1.1d,
                "test"){{
                    any = "any";
                    bigint = 8821239038968084L;
                    bigintStr = "9223372036854775808";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                    decimal = 3.141592653589793d;
                    decimalStr = "3.14159265358979344719667586";
                    enum_ = Enum.ONE;
                    float32 = 1.1f;
                    int_ = 1L;
                    int32 = 1;
                    int32Enum = Int32Enum.FIFTY_FIVE;
                    intEnum = IntEnum.Second;
                    num = 1.1d;
                    str = "test";
                    strOpt = "testOptional";
                }}),
            }};

            org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayObjResponse res = sdk.requestBodies.requestBodyPostApplicationJsonArrayObj(req);

            if (res.arrObjValue != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 61

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayObjCamelCaseResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32EnumVal;
import org.openapis.openapi.models.shared.IntEnumVal;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObjectCamelCase;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.SimpleObjectCamelCase[] req = new org.openapis.openapi.models.shared.SimpleObjectCamelCase[]{{
                add(new SimpleObjectCamelCase(
                "any example",
                true,
                OffsetDateTime.parse("2020-01-01T00:00:00Z"),
                LocalDate.parse("2020-01-01"),
                Enum.ONE,
                2.2222222f,
                Int32EnumVal.SIXTY_NINE,
                1,
                IntEnumVal.Third,
                999999L,
                1.1d,
                "example"){{
                    anyVal = "any example";
                    boolOptVal = true;
                    boolVal = true;
                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    dateVal = LocalDate.parse("2020-01-01");
                    enumVal = Enum.ONE;
                    float32Val = 2.2222222f;
                    int32EnumVal = Int32EnumVal.SIXTY_NINE;
                    int32Val = 1;
                    intEnumVal = IntEnumVal.Third;
                    intOptNullVal = 999999L;
                    intVal = 999999L;
                    numOptNullVal = 1.1d;
                    numVal = 1.1d;
                    strOptVal = "optional example";
                    strVal = "example";
                }}),
            }};

            org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayObjCamelCaseResponse res = sdk.requestBodies.requestBodyPostApplicationJsonArrayObjCamelCase(req);

            if (res.arrObjValueCamelCase != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 62

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayOfArrayResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.SimpleObject[][] req = new org.openapis.openapi.models.shared.SimpleObject[][]{{
                add(new org.openapis.openapi.models.shared.SimpleObject[]{{
                    add(new SimpleObject(
                    "any",
                    true,
                    LocalDate.parse("2020-01-01"),
                    OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                    Enum.ONE,
                    1.1f,
                    1L,
                    1,
                    Int32Enum.FIFTY_FIVE,
                    IntEnum.Second,
                    1.1d,
                    "test"){{
                        any = "any";
                        bigint = 8821239038968084L;
                        bigintStr = "9223372036854775808";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                        decimal = 3.141592653589793d;
                        decimalStr = "3.14159265358979344719667586";
                        enum_ = Enum.ONE;
                        float32 = 1.1f;
                        int_ = 1L;
                        int32 = 1;
                        int32Enum = Int32Enum.FIFTY_FIVE;
                        intEnum = IntEnum.Second;
                        num = 1.1d;
                        str = "test";
                        strOpt = "testOptional";
                    }}),
                }}),
            }};

            org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayOfArrayResponse res = sdk.requestBodies.requestBodyPostApplicationJsonArrayOfArray(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 63

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayOfArrayCamelCaseResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32EnumVal;
import org.openapis.openapi.models.shared.IntEnumVal;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObjectCamelCase;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.SimpleObjectCamelCase[][] req = new org.openapis.openapi.models.shared.SimpleObjectCamelCase[][]{{
                add(new org.openapis.openapi.models.shared.SimpleObjectCamelCase[]{{
                    add(new SimpleObjectCamelCase(
                    "any example",
                    true,
                    OffsetDateTime.parse("2020-01-01T00:00:00Z"),
                    LocalDate.parse("2020-01-01"),
                    Enum.ONE,
                    2.2222222f,
                    Int32EnumVal.SIXTY_NINE,
                    1,
                    IntEnumVal.Third,
                    999999L,
                    1.1d,
                    "example"){{
                        anyVal = "any example";
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.ONE;
                        float32Val = 2.2222222f;
                        int32EnumVal = Int32EnumVal.SIXTY_NINE;
                        int32Val = 1;
                        intEnumVal = IntEnumVal.Third;
                        intOptNullVal = 999999L;
                        intVal = 999999L;
                        numOptNullVal = 1.1d;
                        numVal = 1.1d;
                        strOptVal = "optional example";
                        strVal = "example";
                    }}),
                }}),
            }};

            org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayOfArrayCamelCaseResponse res = sdk.requestBodies.requestBodyPostApplicationJsonArrayOfArrayCamelCase(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 64

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            String[][] req = new String[][]{{
                add(new String[]{{
                    add("string"),
                }}),
            }};

            org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse res = sdk.requestBodies.requestBodyPostApplicationJsonArrayOfArrayOfPrimitive(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 65

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayOfMapResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            java.util.Map<String, org.openapis.openapi.models.shared.SimpleObject>[] req = new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>[]{{
                add(new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>(
                ){{
                    put("key", new SimpleObject(
                    "any",
                    true,
                    LocalDate.parse("2020-01-01"),
                    OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                    Enum.ONE,
                    1.1f,
                    1L,
                    1,
                    Int32Enum.FIFTY_FIVE,
                    IntEnum.Second,
                    1.1d,
                    "test"){{
                        any = "any";
                        bigint = 8821239038968084L;
                        bigintStr = "9223372036854775808";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                        decimal = 3.141592653589793d;
                        decimalStr = "3.14159265358979344719667586";
                        enum_ = Enum.ONE;
                        float32 = 1.1f;
                        int_ = 1L;
                        int32 = 1;
                        int32Enum = Int32Enum.FIFTY_FIVE;
                        intEnum = IntEnum.Second;
                        num = 1.1d;
                        str = "test";
                        strOpt = "testOptional";
                    }});
                }}),
            }};

            org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayOfMapResponse res = sdk.requestBodies.requestBodyPostApplicationJsonArrayOfMap(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 66

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayOfMapCamelCaseResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32EnumVal;
import org.openapis.openapi.models.shared.IntEnumVal;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObjectCamelCase;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            java.util.Map<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>[] req = new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>[]{{
                add(new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>(
                ){{
                    put("key", new SimpleObjectCamelCase(
                    "any example",
                    true,
                    OffsetDateTime.parse("2020-01-01T00:00:00Z"),
                    LocalDate.parse("2020-01-01"),
                    Enum.ONE,
                    2.2222222f,
                    Int32EnumVal.SIXTY_NINE,
                    1,
                    IntEnumVal.Third,
                    999999L,
                    1.1d,
                    "example"){{
                        anyVal = "any example";
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.ONE;
                        float32Val = 2.2222222f;
                        int32EnumVal = Int32EnumVal.SIXTY_NINE;
                        int32Val = 1;
                        intEnumVal = IntEnumVal.Third;
                        intOptNullVal = 999999L;
                        intVal = 999999L;
                        numOptNullVal = 1.1d;
                        numVal = 1.1d;
                        strOptVal = "optional example";
                        strVal = "example";
                    }});
                }}),
            }};

            org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayOfMapCamelCaseResponse res = sdk.requestBodies.requestBodyPostApplicationJsonArrayOfMapCamelCase(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 67

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayOfPrimitiveResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            String[] req = new String[]{{
                add("string"),
            }};

            org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonArrayOfPrimitiveResponse res = sdk.requestBodies.requestBodyPostApplicationJsonArrayOfPrimitive(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 68

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonDeepResponse;
import org.openapis.openapi.models.shared.DeepObject;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.DeepObject req = new DeepObject(
                "anyOf[0]",
                new org.openapis.openapi.models.shared.SimpleObject[]{{
                    add(new SimpleObject(
                    "any",
                    true,
                    LocalDate.parse("2020-01-01"),
                    OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                    Enum.ONE,
                    1.1f,
                    1L,
                    1,
                    Int32Enum.FIFTY_FIVE,
                    IntEnum.Second,
                    1.1d,
                    "test"){{
                        any = "any";
                        bigint = 8821239038968084L;
                        bigintStr = "9223372036854775808";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                        decimal = 3.141592653589793d;
                        decimalStr = "3.14159265358979344719667586";
                        enum_ = Enum.ONE;
                        float32 = 1.1f;
                        int_ = 1L;
                        int32 = 1;
                        int32Enum = Int32Enum.FIFTY_FIVE;
                        intEnum = IntEnum.Second;
                        num = 1.1d;
                        str = "test";
                        strOpt = "testOptional";
                    }}),
                    add(new SimpleObject(
                    "any",
                    true,
                    LocalDate.parse("2020-01-01"),
                    OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                    Enum.ONE,
                    1.1f,
                    1L,
                    1,
                    Int32Enum.FIFTY_FIVE,
                    IntEnum.Second,
                    1.1d,
                    "test"){{
                        any = "any";
                        bigint = 8821239038968084L;
                        bigintStr = "9223372036854775808";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                        decimal = 3.141592653589793d;
                        decimalStr = "3.14159265358979344719667586";
                        enum_ = Enum.ONE;
                        float32 = 1.1f;
                        int_ = 1L;
                        int32 = 1;
                        int32Enum = Int32Enum.FIFTY_FIVE;
                        intEnum = IntEnum.Second;
                        num = 1.1d;
                        str = "test";
                        strOpt = "testOptional";
                    }}),
                }},
                true,
                1L,
                new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>(
                ){{
                    put("key", new SimpleObject(
                    "any",
                    true,
                    LocalDate.parse("2020-01-01"),
                    OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                    Enum.ONE,
                    1.1f,
                    1L,
                    1,
                    Int32Enum.FIFTY_FIVE,
                    IntEnum.Second,
                    1.1d,
                    "test"){{
                        any = "any";
                        bigint = 8821239038968084L;
                        bigintStr = "9223372036854775808";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                        decimal = 3.141592653589793d;
                        decimalStr = "3.14159265358979344719667586";
                        enum_ = Enum.ONE;
                        float32 = 1.1f;
                        int_ = 1L;
                        int32 = 1;
                        int32Enum = Int32Enum.FIFTY_FIVE;
                        intEnum = IntEnum.Second;
                        num = 1.1d;
                        str = "test";
                        strOpt = "testOptional";
                    }});
                    put("key2", new SimpleObject(
                    "any",
                    true,
                    LocalDate.parse("2020-01-01"),
                    OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                    Enum.ONE,
                    1.1f,
                    1L,
                    1,
                    Int32Enum.FIFTY_FIVE,
                    IntEnum.Second,
                    1.1d,
                    "test"){{
                        any = "any";
                        bigint = 8821239038968084L;
                        bigintStr = "9223372036854775808";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                        decimal = 3.141592653589793d;
                        decimalStr = "3.14159265358979344719667586";
                        enum_ = Enum.ONE;
                        float32 = 1.1f;
                        int_ = 1L;
                        int32 = 1;
                        int32Enum = Int32Enum.FIFTY_FIVE;
                        intEnum = IntEnum.Second;
                        num = 1.1d;
                        str = "test";
                        strOpt = "testOptional";
                    }});
                }},
                1.1d,
                new SimpleObject(
                    "any",
                    true,
                    LocalDate.parse("2020-01-01"),
                    OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                    Enum.ONE,
                    1.1f,
                    1L,
                    1,
                    Int32Enum.FIFTY_FIVE,
                    IntEnum.Second,
                    1.1d,
                    "test"){{
                    bigint = 8821239038968084L;
                    bigintStr = "9223372036854775808";
                    boolOpt = true;
                    decimal = 3.141592653589793d;
                    decimalStr = "3.14159265358979344719667586";
                    intOptNull = 949502L;
                    numOptNull = 5521.28d;
                    strOpt = "testOptional";

                }},
                "test"){{
                type = "string";

            }};

            org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonDeepResponse res = sdk.requestBodies.requestBodyPostApplicationJsonDeep(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 69

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonDeepCamelCaseResponse;
import org.openapis.openapi.models.shared.DeepObjectCamelCase;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32EnumVal;
import org.openapis.openapi.models.shared.IntEnumVal;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObjectCamelCase;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.DeepObjectCamelCase req = new DeepObjectCamelCase(
                "string",
                new org.openapis.openapi.models.shared.SimpleObjectCamelCase[]{{
                    add(new SimpleObjectCamelCase(
                    "any example",
                    true,
                    OffsetDateTime.parse("2020-01-01T00:00:00Z"),
                    LocalDate.parse("2020-01-01"),
                    Enum.ONE,
                    2.2222222f,
                    Int32EnumVal.SIXTY_NINE,
                    1,
                    IntEnumVal.Third,
                    999999L,
                    1.1d,
                    "example"){{
                        anyVal = "any example";
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.ONE;
                        float32Val = 2.2222222f;
                        int32EnumVal = Int32EnumVal.SIXTY_NINE;
                        int32Val = 1;
                        intEnumVal = IntEnumVal.Third;
                        intOptNullVal = 999999L;
                        intVal = 999999L;
                        numOptNullVal = 1.1d;
                        numVal = 1.1d;
                        strOptVal = "optional example";
                        strVal = "example";
                    }}),
                }},
                false,
                66469L,
                new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>(
                ){{
                    put("key", new SimpleObjectCamelCase(
                    "any example",
                    true,
                    OffsetDateTime.parse("2020-01-01T00:00:00Z"),
                    LocalDate.parse("2020-01-01"),
                    Enum.ONE,
                    2.2222222f,
                    Int32EnumVal.SIXTY_NINE,
                    1,
                    IntEnumVal.Third,
                    999999L,
                    1.1d,
                    "example"){{
                        anyVal = "any example";
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.ONE;
                        float32Val = 2.2222222f;
                        int32EnumVal = Int32EnumVal.SIXTY_NINE;
                        int32Val = 1;
                        intEnumVal = IntEnumVal.Third;
                        intOptNullVal = 999999L;
                        intVal = 999999L;
                        numOptNullVal = 1.1d;
                        numVal = 1.1d;
                        strOptVal = "optional example";
                        strVal = "example";
                    }});
                }},
                9629.09d,
                new SimpleObjectCamelCase(
                    "any example",
                    true,
                    OffsetDateTime.parse("2020-01-01T00:00:00Z"),
                    LocalDate.parse("2020-01-01"),
                    Enum.ONE,
                    2.2222222f,
                    Int32EnumVal.SIXTY_NINE,
                    1,
                    IntEnumVal.Third,
                    999999L,
                    1.1d,
                    "example"){{
                    bigintStrVal = "string";
                    bigintVal = 206440L;
                    boolOptVal = true;
                    decimalVal = 4241.4d;
                    intOptNullVal = 999999L;
                    numOptNullVal = 1.1d;
                    strOptVal = "optional example";

                }},
                "string"){{
                type = "string";

            }};

            org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonDeepCamelCaseResponse res = sdk.requestBodies.requestBodyPostApplicationJsonDeepCamelCase(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 70

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            java.util.Map<String, org.openapis.openapi.models.shared.SimpleObject> req = new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>(
            ){{
                put("key", new SimpleObject(
                "any",
                true,
                LocalDate.parse("2020-01-01"),
                OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                Enum.ONE,
                1.1f,
                1L,
                1,
                Int32Enum.FIFTY_FIVE,
                IntEnum.Second,
                1.1d,
                "test"){{
                    any = "any";
                    bigint = 8821239038968084L;
                    bigintStr = "9223372036854775808";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                    decimal = 3.141592653589793d;
                    decimalStr = "3.14159265358979344719667586";
                    enum_ = Enum.ONE;
                    float32 = 1.1f;
                    int_ = 1L;
                    int32 = 1;
                    int32Enum = Int32Enum.FIFTY_FIVE;
                    intEnum = IntEnum.Second;
                    num = 1.1d;
                    str = "test";
                    strOpt = "testOptional";
                }});
            }};

            org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapResponse res = sdk.requestBodies.requestBodyPostApplicationJsonMap(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 71

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapCamelCaseResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32EnumVal;
import org.openapis.openapi.models.shared.IntEnumVal;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObjectCamelCase;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            java.util.Map<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase> req = new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>(
            ){{
                put("key", new SimpleObjectCamelCase(
                "any example",
                true,
                OffsetDateTime.parse("2020-01-01T00:00:00Z"),
                LocalDate.parse("2020-01-01"),
                Enum.ONE,
                2.2222222f,
                Int32EnumVal.SIXTY_NINE,
                1,
                IntEnumVal.Third,
                999999L,
                1.1d,
                "example"){{
                    anyVal = "any example";
                    boolOptVal = true;
                    boolVal = true;
                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    dateVal = LocalDate.parse("2020-01-01");
                    enumVal = Enum.ONE;
                    float32Val = 2.2222222f;
                    int32EnumVal = Int32EnumVal.SIXTY_NINE;
                    int32Val = 1;
                    intEnumVal = IntEnumVal.Third;
                    intOptNullVal = 999999L;
                    intVal = 999999L;
                    numOptNullVal = 1.1d;
                    numVal = 1.1d;
                    strOptVal = "optional example";
                    strVal = "example";
                }});
            }};

            org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapCamelCaseResponse res = sdk.requestBodies.requestBodyPostApplicationJsonMapCamelCase(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 72

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapObjResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            java.util.Map<String, org.openapis.openapi.models.shared.SimpleObject> req = new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>(
            ){{
                put("key", new SimpleObject(
                "any",
                true,
                LocalDate.parse("2020-01-01"),
                OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                Enum.ONE,
                1.1f,
                1L,
                1,
                Int32Enum.FIFTY_FIVE,
                IntEnum.Second,
                1.1d,
                "test"){{
                    any = "any";
                    bigint = 8821239038968084L;
                    bigintStr = "9223372036854775808";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                    decimal = 3.141592653589793d;
                    decimalStr = "3.14159265358979344719667586";
                    enum_ = Enum.ONE;
                    float32 = 1.1f;
                    int_ = 1L;
                    int32 = 1;
                    int32Enum = Int32Enum.FIFTY_FIVE;
                    intEnum = IntEnum.Second;
                    num = 1.1d;
                    str = "test";
                    strOpt = "testOptional";
                }});
            }};

            org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapObjResponse res = sdk.requestBodies.requestBodyPostApplicationJsonMapObj(req);

            if (res.mapObjValue != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 73

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapObjCamelCaseResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32EnumVal;
import org.openapis.openapi.models.shared.IntEnumVal;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObjectCamelCase;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            java.util.Map<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase> req = new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>(
            ){{
                put("key", new SimpleObjectCamelCase(
                "any example",
                true,
                OffsetDateTime.parse("2020-01-01T00:00:00Z"),
                LocalDate.parse("2020-01-01"),
                Enum.ONE,
                2.2222222f,
                Int32EnumVal.SIXTY_NINE,
                1,
                IntEnumVal.Third,
                999999L,
                1.1d,
                "example"){{
                    anyVal = "any example";
                    boolOptVal = true;
                    boolVal = true;
                    dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    dateVal = LocalDate.parse("2020-01-01");
                    enumVal = Enum.ONE;
                    float32Val = 2.2222222f;
                    int32EnumVal = Int32EnumVal.SIXTY_NINE;
                    int32Val = 1;
                    intEnumVal = IntEnumVal.Third;
                    intOptNullVal = 999999L;
                    intVal = 999999L;
                    numOptNullVal = 1.1d;
                    numVal = 1.1d;
                    strOptVal = "optional example";
                    strVal = "example";
                }});
            }};

            org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapObjCamelCaseResponse res = sdk.requestBodies.requestBodyPostApplicationJsonMapObjCamelCase(req);

            if (res.mapObjValueCamelCase != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 74

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapOfArrayResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            java.util.Map<String, org.openapis.openapi.models.shared.SimpleObject[]> req = new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject[]>(
            ){{
                put("key", new org.openapis.openapi.models.shared.SimpleObject[]{{
                    add(new SimpleObject(
                    "any",
                    true,
                    LocalDate.parse("2020-01-01"),
                    OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                    Enum.ONE,
                    1.1f,
                    1L,
                    1,
                    Int32Enum.FIFTY_FIVE,
                    IntEnum.Second,
                    1.1d,
                    "test"){{
                        any = "any";
                        bigint = 8821239038968084L;
                        bigintStr = "9223372036854775808";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                        decimal = 3.141592653589793d;
                        decimalStr = "3.14159265358979344719667586";
                        enum_ = Enum.ONE;
                        float32 = 1.1f;
                        int_ = 1L;
                        int32 = 1;
                        int32Enum = Int32Enum.FIFTY_FIVE;
                        intEnum = IntEnum.Second;
                        num = 1.1d;
                        str = "test";
                        strOpt = "testOptional";
                    }}),
                }});
            }};

            org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapOfArrayResponse res = sdk.requestBodies.requestBodyPostApplicationJsonMapOfArray(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 75

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapOfArrayCamelCaseResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32EnumVal;
import org.openapis.openapi.models.shared.IntEnumVal;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObjectCamelCase;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            java.util.Map<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase[]> req = new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase[]>(
            ){{
                put("key", new org.openapis.openapi.models.shared.SimpleObjectCamelCase[]{{
                    add(new SimpleObjectCamelCase(
                    "any example",
                    true,
                    OffsetDateTime.parse("2020-01-01T00:00:00Z"),
                    LocalDate.parse("2020-01-01"),
                    Enum.ONE,
                    2.2222222f,
                    Int32EnumVal.SIXTY_NINE,
                    1,
                    IntEnumVal.Third,
                    999999L,
                    1.1d,
                    "example"){{
                        anyVal = "any example";
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.ONE;
                        float32Val = 2.2222222f;
                        int32EnumVal = Int32EnumVal.SIXTY_NINE;
                        int32Val = 1;
                        intEnumVal = IntEnumVal.Third;
                        intOptNullVal = 999999L;
                        intVal = 999999L;
                        numOptNullVal = 1.1d;
                        numVal = 1.1d;
                        strOptVal = "optional example";
                        strVal = "example";
                    }}),
                }});
            }};

            org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapOfArrayCamelCaseResponse res = sdk.requestBodies.requestBodyPostApplicationJsonMapOfArrayCamelCase(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 76

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapOfMapResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            java.util.Map<String, java.util.Map<String, org.openapis.openapi.models.shared.SimpleObject>> req = new java.util.HashMap<String, java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>>(
            ){{
                put("key", new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>(
                ){{
                    put("key", new SimpleObject(
                    "any",
                    true,
                    LocalDate.parse("2020-01-01"),
                    OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                    Enum.ONE,
                    1.1f,
                    1L,
                    1,
                    Int32Enum.FIFTY_FIVE,
                    IntEnum.Second,
                    1.1d,
                    "test"){{
                        any = "any";
                        bigint = 8821239038968084L;
                        bigintStr = "9223372036854775808";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                        decimal = 3.141592653589793d;
                        decimalStr = "3.14159265358979344719667586";
                        enum_ = Enum.ONE;
                        float32 = 1.1f;
                        int_ = 1L;
                        int32 = 1;
                        int32Enum = Int32Enum.FIFTY_FIVE;
                        intEnum = IntEnum.Second;
                        num = 1.1d;
                        str = "test";
                        strOpt = "testOptional";
                    }});
                }});
            }};

            org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapOfMapResponse res = sdk.requestBodies.requestBodyPostApplicationJsonMapOfMap(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 77

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapOfMapCamelCaseResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32EnumVal;
import org.openapis.openapi.models.shared.IntEnumVal;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObjectCamelCase;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            java.util.Map<String, java.util.Map<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>> req = new java.util.HashMap<String, java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>>(
            ){{
                put("key", new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObjectCamelCase>(
                ){{
                    put("key", new SimpleObjectCamelCase(
                    "any example",
                    true,
                    OffsetDateTime.parse("2020-01-01T00:00:00Z"),
                    LocalDate.parse("2020-01-01"),
                    Enum.ONE,
                    2.2222222f,
                    Int32EnumVal.SIXTY_NINE,
                    1,
                    IntEnumVal.Third,
                    999999L,
                    1.1d,
                    "example"){{
                        anyVal = "any example";
                        boolOptVal = true;
                        boolVal = true;
                        dateTimeVal = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        dateVal = LocalDate.parse("2020-01-01");
                        enumVal = Enum.ONE;
                        float32Val = 2.2222222f;
                        int32EnumVal = Int32EnumVal.SIXTY_NINE;
                        int32Val = 1;
                        intEnumVal = IntEnumVal.Third;
                        intOptNullVal = 999999L;
                        intVal = 999999L;
                        numOptNullVal = 1.1d;
                        numVal = 1.1d;
                        strOptVal = "optional example";
                        strVal = "example";
                    }});
                }});
            }};

            org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapOfMapCamelCaseResponse res = sdk.requestBodies.requestBodyPostApplicationJsonMapOfMapCamelCase(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 78

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapOfMapOfPrimitiveResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            java.util.Map<String, java.util.Map<String, String>> req = new java.util.HashMap<String, java.util.HashMap<String, String>>(
            ){{
                put("key", new java.util.HashMap<String, String>(
                ){{
                    put("key", "string");
                }});
            }};

            org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapOfMapOfPrimitiveResponse res = sdk.requestBodies.requestBodyPostApplicationJsonMapOfMapOfPrimitive(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 79

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapOfPrimitiveResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            java.util.Map<String, String> req = new java.util.HashMap<String, String>(
            ){{
                put("key", "string");
            }};

            org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMapOfPrimitiveResponse res = sdk.requestBodies.requestBodyPostApplicationJsonMapOfPrimitive(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 80

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMultipleJsonFilteredResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.SimpleObject req = new SimpleObject(
                "any",
                true,
                LocalDate.parse("2020-01-01"),
                OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                Enum.ONE,
                1.1f,
                1L,
                1,
                Int32Enum.FIFTY_FIVE,
                IntEnum.Second,
                1.1d,
                "test"){{
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                boolOpt = true;
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                intOptNull = 543193L;
                numOptNull = 1244.08d;
                strOpt = "testOptional";

            }};

            org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonMultipleJsonFilteredResponse res = sdk.requestBodies.requestBodyPostApplicationJsonMultipleJsonFiltered(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 81

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonSimpleResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.SimpleObject req = new SimpleObject(
                "any",
                true,
                LocalDate.parse("2020-01-01"),
                OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                Enum.ONE,
                1.1f,
                1L,
                1,
                Int32Enum.FIFTY_FIVE,
                IntEnum.Second,
                1.1d,
                "test"){{
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                boolOpt = true;
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                intOptNull = 30389L;
                numOptNull = 3765.71d;
                strOpt = "testOptional";

            }};

            org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonSimpleResponse res = sdk.requestBodies.requestBodyPostApplicationJsonSimple(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 82

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonSimpleCamelCaseResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32EnumVal;
import org.openapis.openapi.models.shared.IntEnumVal;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObjectCamelCase;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.SimpleObjectCamelCase req = new SimpleObjectCamelCase(
                "any example",
                true,
                OffsetDateTime.parse("2020-01-01T00:00:00Z"),
                LocalDate.parse("2020-01-01"),
                Enum.ONE,
                2.2222222f,
                Int32EnumVal.SIXTY_NINE,
                1,
                IntEnumVal.Third,
                999999L,
                1.1d,
                "example"){{
                bigintStrVal = "string";
                bigintVal = 281697L;
                boolOptVal = true;
                decimalVal = 9976.38d;
                intOptNullVal = 999999L;
                numOptNullVal = 1.1d;
                strOptVal = "optional example";

            }};

            org.openapis.openapi.models.operations.RequestBodyPostApplicationJsonSimpleCamelCaseResponse res = sdk.requestBodies.requestBodyPostApplicationJsonSimpleCamelCase(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 83

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostComplexNumberTypesRequest;
import org.openapis.openapi.models.operations.RequestBodyPostComplexNumberTypesResponse;
import org.openapis.openapi.models.shared.ComplexNumberTypes;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.RequestBodyPostComplexNumberTypesRequest req = new RequestBodyPostComplexNumberTypesRequest(
                new ComplexNumberTypes(
                    765757L,
                    "string",
                    9344.87d,
                    "string"),
                250514L,
                "string",
                6831.11d,
                "string",
                500580L,
                "string",
                7419.03d,
                "string");

            org.openapis.openapi.models.operations.RequestBodyPostComplexNumberTypesResponse res = sdk.requestBodies.requestBodyPostComplexNumberTypes(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 84

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostDefaultsAndConstsResponse;
import org.openapis.openapi.models.shared.ConstEnumInt;
import org.openapis.openapi.models.shared.ConstEnumStr;
import org.openapis.openapi.models.shared.DefaultEnumInt;
import org.openapis.openapi.models.shared.DefaultEnumStr;
import org.openapis.openapi.models.shared.DefaultsAndConsts;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.DefaultsAndConsts req = new DefaultsAndConsts(
                559205L,
                "string",
                false,
                LocalDate.parse("2021-09-13"),
                OffsetDateTime.parse("2022-12-15T04:16:08.794Z"),
                9160.69d,
                "string",
                ConstEnumInt.ONE,
                ConstEnumStr.THREE,
                299545L,
                4612.63d,
                "string",
                "string",
                "string"){{
                defaultBigInt = 450379L;
                defaultBigIntStr = "string";
                defaultBool = false;
                defaultDate = LocalDate.parse("2023-04-28");
                defaultDateTime = OffsetDateTime.parse("2021-10-01T11:08:55.738Z");
                defaultDecimal = 4585.94d;
                defaultDecimalStr = "string";
                defaultEnumInt = DefaultEnumInt.TWO;
                defaultEnumStr = DefaultEnumStr.ONE;
                defaultInt = 788517L;
                defaultNum = 639.73d;
                defaultStr = "string";
                defaultStrNullable = "string";
                defaultStrOptional = "string";

            }};

            org.openapis.openapi.models.operations.RequestBodyPostDefaultsAndConstsResponse res = sdk.requestBodies.requestBodyPostDefaultsAndConsts(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 85

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.Empty;
import org.openapis.openapi.models.operations.EmptyWithEmptyProperties;
import org.openapis.openapi.models.operations.RequestBodyPostEmptyObjectRequestBody;
import org.openapis.openapi.models.operations.RequestBodyPostEmptyObjectResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.RequestBodyPostEmptyObjectRequestBody req = new RequestBodyPostEmptyObjectRequestBody(
){{
                empty = new Empty(
);
                emptyWithEmptyProperties = new EmptyWithEmptyProperties(
);

            }};

            org.openapis.openapi.models.operations.RequestBodyPostEmptyObjectResponse res = sdk.requestBodies.requestBodyPostEmptyObject(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 86

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostFormDeepResponse;
import org.openapis.openapi.models.shared.DeepObject;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.DeepObject req = new DeepObject(
                "anyOf[0]",
                new org.openapis.openapi.models.shared.SimpleObject[]{{
                    add(new SimpleObject(
                    "any",
                    true,
                    LocalDate.parse("2020-01-01"),
                    OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                    Enum.ONE,
                    1.1f,
                    1L,
                    1,
                    Int32Enum.FIFTY_FIVE,
                    IntEnum.Second,
                    1.1d,
                    "test"){{
                        any = "any";
                        bigint = 8821239038968084L;
                        bigintStr = "9223372036854775808";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                        decimal = 3.141592653589793d;
                        decimalStr = "3.14159265358979344719667586";
                        enum_ = Enum.ONE;
                        float32 = 1.1f;
                        int_ = 1L;
                        int32 = 1;
                        int32Enum = Int32Enum.FIFTY_FIVE;
                        intEnum = IntEnum.Second;
                        num = 1.1d;
                        str = "test";
                        strOpt = "testOptional";
                    }}),
                    add(new SimpleObject(
                    "any",
                    true,
                    LocalDate.parse("2020-01-01"),
                    OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                    Enum.ONE,
                    1.1f,
                    1L,
                    1,
                    Int32Enum.FIFTY_FIVE,
                    IntEnum.Second,
                    1.1d,
                    "test"){{
                        any = "any";
                        bigint = 8821239038968084L;
                        bigintStr = "9223372036854775808";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                        decimal = 3.141592653589793d;
                        decimalStr = "3.14159265358979344719667586";
                        enum_ = Enum.ONE;
                        float32 = 1.1f;
                        int_ = 1L;
                        int32 = 1;
                        int32Enum = Int32Enum.FIFTY_FIVE;
                        intEnum = IntEnum.Second;
                        num = 1.1d;
                        str = "test";
                        strOpt = "testOptional";
                    }}),
                }},
                true,
                1L,
                new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>(
                ){{
                    put("key", new SimpleObject(
                    "any",
                    true,
                    LocalDate.parse("2020-01-01"),
                    OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                    Enum.ONE,
                    1.1f,
                    1L,
                    1,
                    Int32Enum.FIFTY_FIVE,
                    IntEnum.Second,
                    1.1d,
                    "test"){{
                        any = "any";
                        bigint = 8821239038968084L;
                        bigintStr = "9223372036854775808";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                        decimal = 3.141592653589793d;
                        decimalStr = "3.14159265358979344719667586";
                        enum_ = Enum.ONE;
                        float32 = 1.1f;
                        int_ = 1L;
                        int32 = 1;
                        int32Enum = Int32Enum.FIFTY_FIVE;
                        intEnum = IntEnum.Second;
                        num = 1.1d;
                        str = "test";
                        strOpt = "testOptional";
                    }});
                    put("key2", new SimpleObject(
                    "any",
                    true,
                    LocalDate.parse("2020-01-01"),
                    OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                    Enum.ONE,
                    1.1f,
                    1L,
                    1,
                    Int32Enum.FIFTY_FIVE,
                    IntEnum.Second,
                    1.1d,
                    "test"){{
                        any = "any";
                        bigint = 8821239038968084L;
                        bigintStr = "9223372036854775808";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                        decimal = 3.141592653589793d;
                        decimalStr = "3.14159265358979344719667586";
                        enum_ = Enum.ONE;
                        float32 = 1.1f;
                        int_ = 1L;
                        int32 = 1;
                        int32Enum = Int32Enum.FIFTY_FIVE;
                        intEnum = IntEnum.Second;
                        num = 1.1d;
                        str = "test";
                        strOpt = "testOptional";
                    }});
                }},
                1.1d,
                new SimpleObject(
                    "any",
                    true,
                    LocalDate.parse("2020-01-01"),
                    OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                    Enum.ONE,
                    1.1f,
                    1L,
                    1,
                    Int32Enum.FIFTY_FIVE,
                    IntEnum.Second,
                    1.1d,
                    "test"){{
                    bigint = 8821239038968084L;
                    bigintStr = "9223372036854775808";
                    boolOpt = true;
                    decimal = 3.141592653589793d;
                    decimalStr = "3.14159265358979344719667586";
                    intOptNull = 919389L;
                    numOptNull = 467.92d;
                    strOpt = "testOptional";

                }},
                "test"){{
                type = "string";

            }};

            org.openapis.openapi.models.operations.RequestBodyPostFormDeepResponse res = sdk.requestBodies.requestBodyPostFormDeep(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 87

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostFormMapPrimitiveResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            java.util.Map<String, String> req = new java.util.HashMap<String, String>(
            ){{
                put("key", "string");
            }};

            org.openapis.openapi.models.operations.RequestBodyPostFormMapPrimitiveResponse res = sdk.requestBodies.requestBodyPostFormMapPrimitive(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 88

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostFormSimpleResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.SimpleObject req = new SimpleObject(
                "any",
                true,
                LocalDate.parse("2020-01-01"),
                OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                Enum.ONE,
                1.1f,
                1L,
                1,
                Int32Enum.FIFTY_FIVE,
                IntEnum.Second,
                1.1d,
                "test"){{
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                boolOpt = true;
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                intOptNull = 654105L;
                numOptNull = 2933.88d;
                strOpt = "testOptional";

            }};

            org.openapis.openapi.models.operations.RequestBodyPostFormSimpleResponse res = sdk.requestBodies.requestBodyPostFormSimple(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 89

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesArrayBigIntResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            Long[] req = new Long[]{{
                add(564849L),
            }};

            org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesArrayBigIntResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesArrayBigInt(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 90

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesArrayDateResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            LocalDate[] req = new LocalDate[]{{
                add(LocalDate.parse("2022-03-22")),
            }};

            org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesArrayDateResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesArrayDate(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 91

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesArrayDecimalStrResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            String[] req = new String[]{{
                add("string"),
            }};

            org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesArrayDecimalStrResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesArrayDecimalStr(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 92

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesBigIntResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            Long req = 687617L;

            org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesBigIntResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesBigInt(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 93

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesBigIntStrResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            String req = "string";

            org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesBigIntStrResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesBigIntStr(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 94

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesBooleanResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            Boolean req = false;

            org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesBooleanResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesBoolean(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 95

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesDateResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            LocalDate req = LocalDate.parse("2022-03-04");

            org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesDateResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesDate(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 96

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesDateTimeResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            OffsetDateTime req = OffsetDateTime.parse("2023-03-04T01:33:15.031Z");

            org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesDateTimeResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesDateTime(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 97

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesDecimalResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            Double req = 1107.81d;

            org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesDecimalResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesDecimal(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 98

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesDecimalStrResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            String req = "string";

            org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesDecimalStrResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesDecimalStr(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 99

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesFloat32Response;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            Double req = 4464.34d;

            org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesFloat32Response res = sdk.requestBodies.requestBodyPostJsonDataTypesFloat32(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 100

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesInt32Response;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            Integer req = 22155;

            org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesInt32Response res = sdk.requestBodies.requestBodyPostJsonDataTypesInt32(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 101

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesIntegerResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            Long req = 273673L;

            org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesIntegerResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesInteger(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 102

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesMapBigIntStrResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            java.util.Map<String, String> req = new java.util.HashMap<String, String>(
            ){{
                put("key", "string");
            }};

            org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesMapBigIntStrResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesMapBigIntStr(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 103

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesMapDateTimeResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            java.util.Map<String, OffsetDateTime> req = new java.util.HashMap<String, OffsetDateTime>(
            ){{
                put("key", OffsetDateTime.parse("2022-09-03T18:52:14.477Z"));
            }};

            org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesMapDateTimeResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesMapDateTime(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 104

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesMapDecimalResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            java.util.Map<String, Double> req = new java.util.HashMap<String, Double>(
            ){{
                put("key", 3472.82d);
            }};

            org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesMapDecimalResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesMapDecimal(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 105

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesNumberResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            Double req = 2193.66d;

            org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesNumberResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesNumber(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 106

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesStringResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            String req = "string";

            org.openapis.openapi.models.operations.RequestBodyPostJsonDataTypesStringResponse res = sdk.requestBodies.requestBodyPostJsonDataTypesString(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 107

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesComponentFilteredResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.SimpleObject req = new SimpleObject(
                "any",
                true,
                LocalDate.parse("2020-01-01"),
                OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                Enum.ONE,
                1.1f,
                1L,
                1,
                Int32Enum.FIFTY_FIVE,
                IntEnum.Second,
                1.1d,
                "test"){{
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                boolOpt = true;
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                intOptNull = 239797L;
                numOptNull = 9512.65d;
                strOpt = "testOptional";

            }};

            org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesComponentFilteredResponse res = sdk.requestBodies.requestBodyPostMultipleContentTypesComponentFiltered(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 108

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesInlineFilteredRequestBody;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesInlineFilteredResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesInlineFilteredRequestBody req = new RequestBodyPostMultipleContentTypesInlineFilteredRequestBody(
                false,
                3558.41d,
                "string");

            org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesInlineFilteredResponse res = sdk.requestBodies.requestBodyPostMultipleContentTypesInlineFiltered(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 109

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamFormRequest;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamFormRequestBody;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamFormResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamFormResponse res = sdk.requestBodies.requestBodyPostMultipleContentTypesSplitParamForm(new RequestBodyPostMultipleContentTypesSplitParamFormRequestBody(
            false,
            1802.67d,
            "string"){{
                bool3 = false;
                num3 = 8693.24d;
                str3 = "string";
            }}, "string");

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 110

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamJsonRequest;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamJsonRequestBody;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamJsonResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamJsonResponse res = sdk.requestBodies.requestBodyPostMultipleContentTypesSplitParamJson(new RequestBodyPostMultipleContentTypesSplitParamJsonRequestBody(
            false,
            5784.1d,
            "string"){{
                bool = false;
                num = 9771.91d;
                str = "string";
            }}, "string");

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 111

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamMultipartRequest;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamMultipartResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitParamMultipartResponse res = sdk.requestBodies.requestBodyPostMultipleContentTypesSplitParamMultipart(new RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody(
            false,
            6115.78d,
            "string"){{
                bool2 = false;
                num2 = 7000.76d;
                str2 = "string";
            }}, "string");

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 112

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitFormRequestBody;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitFormResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitFormRequestBody req = new RequestBodyPostMultipleContentTypesSplitFormRequestBody(
                false,
                7842.07d,
                "string");

            org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitFormResponse res = sdk.requestBodies.requestBodyPostMultipleContentTypesSplitForm(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 113

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitJsonRequestBody;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitJsonResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitJsonRequestBody req = new RequestBodyPostMultipleContentTypesSplitJsonRequestBody(
                false,
                2445.56d,
                "string");

            org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitJsonResponse res = sdk.requestBodies.requestBodyPostMultipleContentTypesSplitJson(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 114

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitMultipartRequestBody;
import org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitMultipartResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitMultipartRequestBody req = new RequestBodyPostMultipleContentTypesSplitMultipartRequestBody(
                false,
                2079.2d,
                "string");

            org.openapis.openapi.models.operations.RequestBodyPostMultipleContentTypesSplitMultipartResponse res = sdk.requestBodies.requestBodyPostMultipleContentTypesSplitMultipart(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 115

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostNotNullableNotRequiredStringBodyResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            String req = "string";

            org.openapis.openapi.models.operations.RequestBodyPostNotNullableNotRequiredStringBodyResponse res = sdk.requestBodies.requestBodyPostNotNullableNotRequiredStringBody(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 116

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostNullArrayResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            String[] req = new String[]{{
                add("string"),
            }};

            org.openapis.openapi.models.operations.RequestBodyPostNullArrayResponse res = sdk.requestBodies.requestBodyPostNullArray(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 117

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostNullDictionaryResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            java.util.Map<String, String> req = new java.util.HashMap<String, String>(
            ){{
                put("key", "string");
            }};

            org.openapis.openapi.models.operations.RequestBodyPostNullDictionaryResponse res = sdk.requestBodies.requestBodyPostNullDictionary(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 118

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostNullableNotRequiredStringBodyResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            String req = "string";

            org.openapis.openapi.models.operations.RequestBodyPostNullableNotRequiredStringBodyResponse res = sdk.requestBodies.requestBodyPostNullableNotRequiredStringBody(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 119

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPostNullableRequiredStringBodyResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            String req = "string";

            org.openapis.openapi.models.operations.RequestBodyPostNullableRequiredStringBodyResponse res = sdk.requestBodies.requestBodyPostNullableRequiredStringBody(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 120

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPutBytesResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            byte[] req = "0x5DbFFb1Ff9".getBytes();

            org.openapis.openapi.models.operations.RequestBodyPutBytesResponse res = sdk.requestBodies.requestBodyPutBytes(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 121

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
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.RequestBodyPutBytesWithParamsResponse res = sdk.requestBodies.requestBodyPutBytesWithParams("0xC1B9cA4eb5".getBytes(), "string");

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 122

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPutMultipartDeepResponse;
import org.openapis.openapi.models.shared.DeepObject;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.DeepObject req = new DeepObject(
                "anyOf[0]",
                new org.openapis.openapi.models.shared.SimpleObject[]{{
                    add(new SimpleObject(
                    "any",
                    true,
                    LocalDate.parse("2020-01-01"),
                    OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                    Enum.ONE,
                    1.1f,
                    1L,
                    1,
                    Int32Enum.FIFTY_FIVE,
                    IntEnum.Second,
                    1.1d,
                    "test"){{
                        any = "any";
                        bigint = 8821239038968084L;
                        bigintStr = "9223372036854775808";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                        decimal = 3.141592653589793d;
                        decimalStr = "3.14159265358979344719667586";
                        enum_ = Enum.ONE;
                        float32 = 1.1f;
                        int_ = 1L;
                        int32 = 1;
                        int32Enum = Int32Enum.FIFTY_FIVE;
                        intEnum = IntEnum.Second;
                        num = 1.1d;
                        str = "test";
                        strOpt = "testOptional";
                    }}),
                    add(new SimpleObject(
                    "any",
                    true,
                    LocalDate.parse("2020-01-01"),
                    OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                    Enum.ONE,
                    1.1f,
                    1L,
                    1,
                    Int32Enum.FIFTY_FIVE,
                    IntEnum.Second,
                    1.1d,
                    "test"){{
                        any = "any";
                        bigint = 8821239038968084L;
                        bigintStr = "9223372036854775808";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                        decimal = 3.141592653589793d;
                        decimalStr = "3.14159265358979344719667586";
                        enum_ = Enum.ONE;
                        float32 = 1.1f;
                        int_ = 1L;
                        int32 = 1;
                        int32Enum = Int32Enum.FIFTY_FIVE;
                        intEnum = IntEnum.Second;
                        num = 1.1d;
                        str = "test";
                        strOpt = "testOptional";
                    }}),
                }},
                true,
                1L,
                new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>(
                ){{
                    put("key", new SimpleObject(
                    "any",
                    true,
                    LocalDate.parse("2020-01-01"),
                    OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                    Enum.ONE,
                    1.1f,
                    1L,
                    1,
                    Int32Enum.FIFTY_FIVE,
                    IntEnum.Second,
                    1.1d,
                    "test"){{
                        any = "any";
                        bigint = 8821239038968084L;
                        bigintStr = "9223372036854775808";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                        decimal = 3.141592653589793d;
                        decimalStr = "3.14159265358979344719667586";
                        enum_ = Enum.ONE;
                        float32 = 1.1f;
                        int_ = 1L;
                        int32 = 1;
                        int32Enum = Int32Enum.FIFTY_FIVE;
                        intEnum = IntEnum.Second;
                        num = 1.1d;
                        str = "test";
                        strOpt = "testOptional";
                    }});
                    put("key2", new SimpleObject(
                    "any",
                    true,
                    LocalDate.parse("2020-01-01"),
                    OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                    Enum.ONE,
                    1.1f,
                    1L,
                    1,
                    Int32Enum.FIFTY_FIVE,
                    IntEnum.Second,
                    1.1d,
                    "test"){{
                        any = "any";
                        bigint = 8821239038968084L;
                        bigintStr = "9223372036854775808";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                        decimal = 3.141592653589793d;
                        decimalStr = "3.14159265358979344719667586";
                        enum_ = Enum.ONE;
                        float32 = 1.1f;
                        int_ = 1L;
                        int32 = 1;
                        int32Enum = Int32Enum.FIFTY_FIVE;
                        intEnum = IntEnum.Second;
                        num = 1.1d;
                        str = "test";
                        strOpt = "testOptional";
                    }});
                }},
                1.1d,
                new SimpleObject(
                    "any",
                    true,
                    LocalDate.parse("2020-01-01"),
                    OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                    Enum.ONE,
                    1.1f,
                    1L,
                    1,
                    Int32Enum.FIFTY_FIVE,
                    IntEnum.Second,
                    1.1d,
                    "test"){{
                    bigint = 8821239038968084L;
                    bigintStr = "9223372036854775808";
                    boolOpt = true;
                    decimal = 3.141592653589793d;
                    decimalStr = "3.14159265358979344719667586";
                    intOptNull = 827095L;
                    numOptNull = 2043.79d;
                    strOpt = "testOptional";

                }},
                "test"){{
                type = "string";

            }};

            org.openapis.openapi.models.operations.RequestBodyPutMultipartDeepResponse res = sdk.requestBodies.requestBodyPutMultipartDeep(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 123

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.DifferentFileName;
import org.openapis.openapi.models.operations.RequestBodyPutMultipartDifferentFileNameRequestBody;
import org.openapis.openapi.models.operations.RequestBodyPutMultipartDifferentFileNameResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.RequestBodyPutMultipartDifferentFileNameRequestBody req = new RequestBodyPutMultipartDifferentFileNameRequestBody(
){{
                differentFileName = new DifferentFileName(
                    "0xdF19d43dd2".getBytes(),
                    "string");

            }};

            org.openapis.openapi.models.operations.RequestBodyPutMultipartDifferentFileNameResponse res = sdk.requestBodies.requestBodyPutMultipartDifferentFileName(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 124

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.File;
import org.openapis.openapi.models.operations.RequestBodyPutMultipartFileRequestBody;
import org.openapis.openapi.models.operations.RequestBodyPutMultipartFileResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.RequestBodyPutMultipartFileRequestBody req = new RequestBodyPutMultipartFileRequestBody(
){{
                file = new File(
                    "0xa9f2Ee38c3".getBytes(),
                    "string");

            }};

            org.openapis.openapi.models.operations.RequestBodyPutMultipartFileResponse res = sdk.requestBodies.requestBodyPutMultipartFile(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 125

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPutMultipartSimpleResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.SimpleObject req = new SimpleObject(
                "any",
                true,
                LocalDate.parse("2020-01-01"),
                OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                Enum.ONE,
                1.1f,
                1L,
                1,
                Int32Enum.FIFTY_FIVE,
                IntEnum.Second,
                1.1d,
                "test"){{
                bigint = 8821239038968084L;
                bigintStr = "9223372036854775808";
                boolOpt = true;
                decimal = 3.141592653589793d;
                decimalStr = "3.14159265358979344719667586";
                intOptNull = 298848L;
                numOptNull = 9034.69d;
                strOpt = "testOptional";

            }};

            org.openapis.openapi.models.operations.RequestBodyPutMultipartSimpleResponse res = sdk.requestBodies.requestBodyPutMultipartSimple(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 126

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyPutStringResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            String req = "string";

            org.openapis.openapi.models.operations.RequestBodyPutStringResponse res = sdk.requestBodies.requestBodyPutString(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 127

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
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.RequestBodyPutStringWithParamsResponse res = sdk.requestBodies.requestBodyPutStringWithParams("string", "string");

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 128

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyReadAndWriteResponse;
import org.openapis.openapi.models.shared.ReadWriteObject;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.ReadWriteObject req = new ReadWriteObject(
                797612L,
                89374L,
                459345L);

            org.openapis.openapi.models.operations.RequestBodyReadAndWriteResponse res = sdk.requestBodies.requestBodyReadAndWrite(req);

            if (res.readWriteObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 129

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
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.ReadOnlyObjectInput req = new ReadOnlyObjectInput(
);

            org.openapis.openapi.models.operations.RequestBodyReadOnlyInputResponse res = sdk.requestBodies.requestBodyReadOnlyInput(req);

            if (res.readOnlyObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 130

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyReadOnlyUnionResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            Object req = "string";

            org.openapis.openapi.models.operations.RequestBodyReadOnlyUnionResponse res = sdk.requestBodies.requestBodyReadOnlyUnion(req);

            if (res.weaklyTypedOneOfReadOnlyObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 131

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyReadWriteOnlyUnionResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            Object req = "string";

            org.openapis.openapi.models.operations.RequestBodyReadWriteOnlyUnionResponse res = sdk.requestBodies.requestBodyReadWriteOnlyUnion(req);

            if (res.weaklyTypedOneOfReadWriteObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 132

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
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.WriteOnlyObject req = new WriteOnlyObject(
                false,
                3888.42d,
                "string");

            org.openapis.openapi.models.operations.RequestBodyWriteOnlyResponse res = sdk.requestBodies.requestBodyWriteOnly(req);

            if (res.readOnlyObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 133

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
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.WriteOnlyObject req = new WriteOnlyObject(
                false,
                3867.69d,
                "string");

            org.openapis.openapi.models.operations.RequestBodyWriteOnlyOutputResponse res = sdk.requestBodies.requestBodyWriteOnlyOutput(req);

            if (res.writeOnlyObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 134

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RequestBodyWriteOnlyUnionResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            Object req = "string";

            org.openapis.openapi.models.operations.RequestBodyWriteOnlyUnionResponse res = sdk.requestBodies.requestBodyWriteOnlyUnion(req);

            if (res.weaklyTypedOneOfWriteOnlyObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 135

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyAdditionalPropertiesComplexNumbersPostResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            java.util.Map<String, String> req = new java.util.HashMap<String, String>(
            ){{
                put("key", "string");
            }};

            org.openapis.openapi.models.operations.ResponseBodyAdditionalPropertiesComplexNumbersPostResponse res = sdk.responseBodies.responseBodyAdditionalPropertiesComplexNumbersPost(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 136

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyAdditionalPropertiesDatePostResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            java.util.Map<String, LocalDate> req = new java.util.HashMap<String, LocalDate>(
            ){{
                put("key", LocalDate.parse("2021-03-16"));
            }};

            org.openapis.openapi.models.operations.ResponseBodyAdditionalPropertiesDatePostResponse res = sdk.responseBodies.responseBodyAdditionalPropertiesDatePost(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 137

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyAdditionalPropertiesObjectPostResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            java.util.Map<String, org.openapis.openapi.models.shared.SimpleObject> req = new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>(
            ){{
                put("key", new SimpleObject(
                "any",
                true,
                LocalDate.parse("2020-01-01"),
                OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                Enum.ONE,
                1.1f,
                1L,
                1,
                Int32Enum.FIFTY_FIVE,
                IntEnum.Second,
                1.1d,
                "test"){{
                    any = "any";
                    bigint = 8821239038968084L;
                    bigintStr = "9223372036854775808";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00.000001Z");
                    decimal = 3.141592653589793d;
                    decimalStr = "3.14159265358979344719667586";
                    enum_ = Enum.ONE;
                    float32 = 1.1f;
                    int_ = 1L;
                    int32 = 1;
                    int32Enum = Int32Enum.FIFTY_FIVE;
                    intEnum = IntEnum.Second;
                    num = 1.1d;
                    str = "test";
                    strOpt = "testOptional";
                }});
            }};

            org.openapis.openapi.models.operations.ResponseBodyAdditionalPropertiesObjectPostResponse res = sdk.responseBodies.responseBodyAdditionalPropertiesObjectPost(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 138

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyAdditionalPropertiesPostResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            java.util.Map<String, String> req = new java.util.HashMap<String, String>(
            ){{
                put("key", "string");
            }};

            org.openapis.openapi.models.operations.ResponseBodyAdditionalPropertiesPostResponse res = sdk.responseBodies.responseBodyAdditionalPropertiesPost(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 139

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyBytesGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.ResponseBodyBytesGetResponse res = sdk.responseBodies.responseBodyBytesGet();

            if (res.bytes != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 140

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
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.ResponseBodyEmptyWithHeadersResponse res = sdk.responseBodies.responseBodyEmptyWithHeaders(1751.8d, "string");

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 141

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyOptionalGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.ResponseBodyOptionalGetResponse res = sdk.responseBodies.responseBodyOptionalGet();

            if (res.typedObject1 != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 142

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyReadOnlyResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.ResponseBodyReadOnlyResponse res = sdk.responseBodies.responseBodyReadOnly();

            if (res.readOnlyObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 143

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyStringGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.ResponseBodyStringGetResponse res = sdk.responseBodies.responseBodyStringGet();

            if (res.html != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 144

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ResponseBodyXmlGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.ResponseBodyXmlGetResponse res = sdk.responseBodies.responseBodyXmlGet();

            if (res.xml != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 145

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
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.ObjWithZeroValueComplexTypePtrs req = new ObjWithZeroValueComplexTypePtrs(
){{
                bigint = 438531L;
                bigintStr = "string";
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                decimal = 4843.38d;

            }};

            org.openapis.openapi.models.operations.ResponseBodyZeroValueComplexTypePtrsPostResponse res = sdk.responseBodies.responseBodyZeroValueComplexTypePtrsPost(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 146

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.SelectGlobalServerResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.SelectGlobalServerResponse res = sdk.servers.selectGlobalServer();

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 147

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.SelectServerWithIDResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.SelectServerWithIDResponse res = sdk.servers.selectServerWithID();

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 148

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ServerWithProtocolTemplateResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.ServerWithProtocolTemplateResponse res = sdk.servers.serverWithProtocolTemplate();

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 149

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ServerWithTemplatesResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.ServerWithTemplatesResponse res = sdk.servers.serverWithTemplates();

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 150

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ServerWithTemplatesGlobalResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.ServerWithTemplatesGlobalResponse res = sdk.servers.serverWithTemplatesGlobal();

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 151

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ServersByIDWithTemplatesResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.ServersByIDWithTemplatesResponse res = sdk.servers.serversByIDWithTemplates();

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 152

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.TelemetrySpeakeasyUserAgentGetRequest;
import org.openapis.openapi.models.operations.TelemetrySpeakeasyUserAgentGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.TelemetrySpeakeasyUserAgentGetResponse res = sdk.telemetry.telemetrySpeakeasyUserAgentGet("string");

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 153

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.TelemetryUserAgentGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.TelemetryUserAgentGetResponse res = sdk.telemetry.telemetryUserAgentGet();

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 154

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ApiKeyAuthGlobalNewResponse;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.BasicAuth;
import org.openapis.openapi.models.shared.HeaderAuth;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.AuthServiceRequestBody req = new AuthServiceRequestBody(
){{
                basicAuth = new BasicAuth(
                    "string",
                    "string");
                headerAuth = new org.openapis.openapi.models.shared.HeaderAuth[]{{
                    add(new HeaderAuth(
                    "string",
                    "string"){{
                        expectedValue = "string";
                        headerName = "string";
                    }}),
                }};

            }};

            org.openapis.openapi.models.operations.ApiKeyAuthGlobalNewResponse res = sdk.authNew.apiKeyAuthGlobalNew(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 155

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.AuthGlobalResponse;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.BasicAuth;
import org.openapis.openapi.models.shared.HeaderAuth;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.AuthServiceRequestBody req = new AuthServiceRequestBody(
){{
                basicAuth = new BasicAuth(
                    "string",
                    "string");
                headerAuth = new org.openapis.openapi.models.shared.HeaderAuth[]{{
                    add(new HeaderAuth(
                    "string",
                    "string"){{
                        expectedValue = "string";
                        headerName = "string";
                    }}),
                }};

            }};

            org.openapis.openapi.models.operations.AuthGlobalResponse res = sdk.authNew.authGlobal(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 156

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.BasicAuthNewResponse;
import org.openapis.openapi.models.operations.BasicAuthNewSecurity;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.BasicAuth;
import org.openapis.openapi.models.shared.HeaderAuth;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.AuthServiceRequestBody req = new AuthServiceRequestBody(
){{
                basicAuth = new BasicAuth(
                    "string",
                    "string");
                headerAuth = new org.openapis.openapi.models.shared.HeaderAuth[]{{
                    add(new HeaderAuth(
                    "string",
                    "string"){{
                        expectedValue = "string";
                        headerName = "string";
                    }}),
                }};

            }};

            org.openapis.openapi.models.operations.BasicAuthNewResponse res = sdk.authNew.basicAuthNew(req, new BasicAuthNewSecurity(
            "YOUR_PASSWORD",
            "YOUR_USERNAME"){{
                password = "YOUR_PASSWORD";
                username = "YOUR_USERNAME";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 157

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.MultipleMixedOptionsAuthResponse;
import org.openapis.openapi.models.operations.MultipleMixedOptionsAuthSecurity;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.BasicAuth;
import org.openapis.openapi.models.shared.HeaderAuth;
import org.openapis.openapi.models.shared.SchemeBasicAuth;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.AuthServiceRequestBody req = new AuthServiceRequestBody(
){{
                basicAuth = new BasicAuth(
                    "string",
                    "string");
                headerAuth = new org.openapis.openapi.models.shared.HeaderAuth[]{{
                    add(new HeaderAuth(
                    "string",
                    "string"){{
                        expectedValue = "string";
                        headerName = "string";
                    }}),
                }};

            }};

            org.openapis.openapi.models.operations.MultipleMixedOptionsAuthResponse res = sdk.authNew.multipleMixedOptionsAuth(req, new MultipleMixedOptionsAuthSecurity(
            ){{
                apiKeyAuthNew = "Token <YOUR_API_KEY>";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 158

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.MultipleMixedSchemeAuthResponse;
import org.openapis.openapi.models.operations.MultipleMixedSchemeAuthSecurity;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.BasicAuth;
import org.openapis.openapi.models.shared.HeaderAuth;
import org.openapis.openapi.models.shared.SchemeBasicAuth;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.AuthServiceRequestBody req = new AuthServiceRequestBody(
){{
                basicAuth = new BasicAuth(
                    "string",
                    "string");
                headerAuth = new org.openapis.openapi.models.shared.HeaderAuth[]{{
                    add(new HeaderAuth(
                    "string",
                    "string"){{
                        expectedValue = "string";
                        headerName = "string";
                    }}),
                }};

            }};

            org.openapis.openapi.models.operations.MultipleMixedSchemeAuthResponse res = sdk.authNew.multipleMixedSchemeAuth(req, new MultipleMixedSchemeAuthSecurity(
            "Token <YOUR_API_KEY>",
            new SchemeBasicAuth(
            "YOUR_PASSWORD",
            "YOUR_USERNAME")){{
                apiKeyAuthNew = "Token <YOUR_API_KEY>";
                basicAuth = new SchemeBasicAuth(
                "YOUR_PASSWORD",
                "YOUR_USERNAME"){{
                    password = "YOUR_PASSWORD";
                    username = "YOUR_USERNAME";
                }};
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 159

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.MultipleOptionsWithMixedSchemesAuthResponse;
import org.openapis.openapi.models.operations.MultipleOptionsWithMixedSchemesAuthSecurity;
import org.openapis.openapi.models.operations.MultipleOptionsWithMixedSchemesAuthSecurityOption1;
import org.openapis.openapi.models.operations.MultipleOptionsWithMixedSchemesAuthSecurityOption2;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.BasicAuth;
import org.openapis.openapi.models.shared.HeaderAuth;
import org.openapis.openapi.models.shared.SchemeBasicAuth;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.AuthServiceRequestBody req = new AuthServiceRequestBody(
){{
                basicAuth = new BasicAuth(
                    "string",
                    "string");
                headerAuth = new org.openapis.openapi.models.shared.HeaderAuth[]{{
                    add(new HeaderAuth(
                    "string",
                    "string"){{
                        expectedValue = "string";
                        headerName = "string";
                    }}),
                }};

            }};

            org.openapis.openapi.models.operations.MultipleOptionsWithMixedSchemesAuthResponse res = sdk.authNew.multipleOptionsWithMixedSchemesAuth(req, new MultipleOptionsWithMixedSchemesAuthSecurity(
            ){{
                option1 = new MultipleOptionsWithMixedSchemesAuthSecurityOption1(
                "Token <YOUR_API_KEY>",
                "Bearer YOUR_OAUTH2_TOKEN"){{
                    apiKeyAuthNew = "Token <YOUR_API_KEY>";
                    oauth2 = "Bearer YOUR_OAUTH2_TOKEN";
                }};
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 160

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.MultipleOptionsWithSimpleSchemesAuthResponse;
import org.openapis.openapi.models.operations.MultipleOptionsWithSimpleSchemesAuthSecurity;
import org.openapis.openapi.models.operations.MultipleOptionsWithSimpleSchemesAuthSecurityOption1;
import org.openapis.openapi.models.operations.MultipleOptionsWithSimpleSchemesAuthSecurityOption2;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.BasicAuth;
import org.openapis.openapi.models.shared.HeaderAuth;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.AuthServiceRequestBody req = new AuthServiceRequestBody(
){{
                basicAuth = new BasicAuth(
                    "string",
                    "string");
                headerAuth = new org.openapis.openapi.models.shared.HeaderAuth[]{{
                    add(new HeaderAuth(
                    "string",
                    "string"){{
                        expectedValue = "string";
                        headerName = "string";
                    }}),
                }};

            }};

            org.openapis.openapi.models.operations.MultipleOptionsWithSimpleSchemesAuthResponse res = sdk.authNew.multipleOptionsWithSimpleSchemesAuth(req, new MultipleOptionsWithSimpleSchemesAuthSecurity(
            ){{
                option1 = new MultipleOptionsWithSimpleSchemesAuthSecurityOption1(
                "Token <YOUR_API_KEY>",
                "Bearer YOUR_OAUTH2_TOKEN"){{
                    apiKeyAuthNew = "Token <YOUR_API_KEY>";
                    oauth2 = "Bearer YOUR_OAUTH2_TOKEN";
                }};
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 161

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.MultipleSimpleOptionsAuthResponse;
import org.openapis.openapi.models.operations.MultipleSimpleOptionsAuthSecurity;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.BasicAuth;
import org.openapis.openapi.models.shared.HeaderAuth;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.AuthServiceRequestBody req = new AuthServiceRequestBody(
){{
                basicAuth = new BasicAuth(
                    "string",
                    "string");
                headerAuth = new org.openapis.openapi.models.shared.HeaderAuth[]{{
                    add(new HeaderAuth(
                    "string",
                    "string"){{
                        expectedValue = "string";
                        headerName = "string";
                    }}),
                }};

            }};

            org.openapis.openapi.models.operations.MultipleSimpleOptionsAuthResponse res = sdk.authNew.multipleSimpleOptionsAuth(req, new MultipleSimpleOptionsAuthSecurity(
            ){{
                apiKeyAuthNew = "Token <YOUR_API_KEY>";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 162

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.MultipleSimpleSchemeAuthResponse;
import org.openapis.openapi.models.operations.MultipleSimpleSchemeAuthSecurity;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.BasicAuth;
import org.openapis.openapi.models.shared.HeaderAuth;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.AuthServiceRequestBody req = new AuthServiceRequestBody(
){{
                basicAuth = new BasicAuth(
                    "string",
                    "string");
                headerAuth = new org.openapis.openapi.models.shared.HeaderAuth[]{{
                    add(new HeaderAuth(
                    "string",
                    "string"){{
                        expectedValue = "string";
                        headerName = "string";
                    }}),
                }};

            }};

            org.openapis.openapi.models.operations.MultipleSimpleSchemeAuthResponse res = sdk.authNew.multipleSimpleSchemeAuth(req, new MultipleSimpleSchemeAuthSecurity(
            "Token <YOUR_API_KEY>",
            "Bearer YOUR_OAUTH2_TOKEN"){{
                apiKeyAuthNew = "Token <YOUR_API_KEY>";
                oauth2 = "Bearer YOUR_OAUTH2_TOKEN";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 163

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.Oauth2AuthNewResponse;
import org.openapis.openapi.models.operations.Oauth2AuthNewSecurity;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.BasicAuth;
import org.openapis.openapi.models.shared.HeaderAuth;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.AuthServiceRequestBody req = new AuthServiceRequestBody(
){{
                basicAuth = new BasicAuth(
                    "string",
                    "string");
                headerAuth = new org.openapis.openapi.models.shared.HeaderAuth[]{{
                    add(new HeaderAuth(
                    "string",
                    "string"){{
                        expectedValue = "string";
                        headerName = "string";
                    }}),
                }};

            }};

            org.openapis.openapi.models.operations.Oauth2AuthNewResponse res = sdk.authNew.oauth2AuthNew(req, new Oauth2AuthNewSecurity(
            "Bearer YOUR_OAUTH2_TOKEN"){{
                oauth2 = "Bearer YOUR_OAUTH2_TOKEN";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 164

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.OpenIdConnectAuthNewResponse;
import org.openapis.openapi.models.operations.OpenIdConnectAuthNewSecurity;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.BasicAuth;
import org.openapis.openapi.models.shared.HeaderAuth;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.AuthServiceRequestBody req = new AuthServiceRequestBody(
){{
                basicAuth = new BasicAuth(
                    "string",
                    "string");
                headerAuth = new org.openapis.openapi.models.shared.HeaderAuth[]{{
                    add(new HeaderAuth(
                    "string",
                    "string"){{
                        expectedValue = "string";
                        headerName = "string";
                    }}),
                }};

            }};

            org.openapis.openapi.models.operations.OpenIdConnectAuthNewResponse res = sdk.authNew.openIdConnectAuthNew(req, new OpenIdConnectAuthNewSecurity(
            "Bearer YOUR_OPENID_TOKEN"){{
                openIdConnect = "Bearer YOUR_OPENID_TOKEN";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 165

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ApiKeyAuthResponse;
import org.openapis.openapi.models.operations.ApiKeyAuthSecurity;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.ApiKeyAuthResponse res = sdk.auth.apiKeyAuth(new ApiKeyAuthSecurity(
            "Token YOUR_API_KEY"){{
                apiKeyAuth = "Token YOUR_API_KEY";
            }});

            if (res.token != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 166

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ApiKeyAuthGlobalResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.ApiKeyAuthGlobalResponse res = sdk.auth.apiKeyAuthGlobal();

            if (res.token != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 167

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.BasicAuthRequest;
import org.openapis.openapi.models.operations.BasicAuthResponse;
import org.openapis.openapi.models.operations.BasicAuthSecurity;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.BasicAuthResponse res = sdk.auth.basicAuth(new BasicAuthSecurity(
            "YOUR_PASSWORD",
            "YOUR_USERNAME"){{
                password = "YOUR_PASSWORD";
                username = "YOUR_USERNAME";
            }}, "string", "string");

            if (res.user != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 168

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.BearerAuthResponse;
import org.openapis.openapi.models.operations.BearerAuthSecurity;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.BearerAuthResponse res = sdk.auth.bearerAuth(new BearerAuthSecurity(
            "YOUR_JWT"){{
                bearerAuth = "YOUR_JWT";
            }});

            if (res.token != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 169

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GlobalBearerAuthResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.GlobalBearerAuthResponse res = sdk.auth.globalBearerAuth();

            if (res.token != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 170

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.Oauth2AuthResponse;
import org.openapis.openapi.models.operations.Oauth2AuthSecurity;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.Oauth2AuthResponse res = sdk.auth.oauth2Auth(new Oauth2AuthSecurity(
            "Bearer YOUR_OAUTH2_TOKEN"){{
                oauth2 = "Bearer YOUR_OAUTH2_TOKEN";
            }});

            if (res.token != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 171

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.Oauth2OverrideRequest;
import org.openapis.openapi.models.operations.Oauth2OverrideResponse;
import org.openapis.openapi.models.operations.Oauth2OverrideSecurity;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.Oauth2OverrideResponse res = sdk.auth.oauth2Override(new Oauth2OverrideSecurity(
            "Bearer YOUR_OAUTH2_TOKEN"){{
                oauth2 = "Bearer YOUR_OAUTH2_TOKEN";
            }});

            if (res.token != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 172

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.OpenIdConnectAuthResponse;
import org.openapis.openapi.models.operations.OpenIdConnectAuthSecurity;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.OpenIdConnectAuthResponse res = sdk.auth.openIdConnectAuth(new OpenIdConnectAuthSecurity(
            "Bearer YOUR_OPENID_TOKEN"){{
                openIdConnect = "Bearer YOUR_OPENID_TOKEN";
            }});

            if (res.token != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 173

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GetDocumentationPerLanguageRequest;
import org.openapis.openapi.models.operations.GetDocumentationPerLanguageResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.GetDocumentationPerLanguageResponse res = sdk.documentation.getDocumentationPerLanguage("string");

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 174

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.CreateFileFile;
import org.openapis.openapi.models.operations.CreateFileRequestBody;
import org.openapis.openapi.models.operations.CreateFileResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.CreateFileRequestBody req = new CreateFileRequestBody(
){{
                file = new CreateFileFile(
                    "0xf10df1a3b9".getBytes(),
                    "string");

            }};

            org.openapis.openapi.models.operations.CreateFileResponse res = sdk.resource.createFile(req);

            if (res.fileResource != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 175

```java
package hello.world;

import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.CreateResourceResponse;
import org.openapis.openapi.models.shared.Chocolates;
import org.openapis.openapi.models.shared.EnumNumber;
import org.openapis.openapi.models.shared.EnumStr;
import org.openapis.openapi.models.shared.ExampleResource;
import org.openapis.openapi.models.shared.InlineObject;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.ExampleResource req = new ExampleResource(
                new org.openapis.openapi.models.shared.Chocolates[]{{
                    add(new Chocolates(
                    "string"){{
                        description = "Digitized optimal archive";
                    }}),
                }},
                "string",
                "string",
                "string"){{
                arrayOfNumber = new Double[]{{
                    add(1124.19d),
                }};
                arrayOfString = new String[]{{
                    add("string"),
                }};
                createdAt = OffsetDateTime.parse("2021-10-25T14:40:21.269Z");
                enumNumber = EnumNumber.THREE;
                enumStr = EnumStr.TWO;
                inlineObject = new InlineObject(
){{
                    inlineName = "string";

                }};
                mapOfInteger = new java.util.HashMap<String, Long>(
                ){{
                    put("key", 125983L);
                }};
                mapOfString = new java.util.HashMap<String, String>(
                ){{
                    put("key", "string");
                }};
                namePrefix = "string";
                updatedAt = OffsetDateTime.parse("2021-07-09T15:40:32.497Z");

            }};

            org.openapis.openapi.models.operations.CreateResourceResponse res = sdk.resource.createResource(req);

            if (res.exampleResource != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 176

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.DeleteResourceRequest;
import org.openapis.openapi.models.operations.DeleteResourceResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.DeleteResourceResponse res = sdk.resource.deleteResource("string");

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 177

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GetResourceRequest;
import org.openapis.openapi.models.operations.GetResourceResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.GetResourceResponse res = sdk.resource.getResource("string");

            if (res.exampleResource != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 178

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.UpdateResourceRequest;
import org.openapis.openapi.models.operations.UpdateResourceResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.UpdateResourceResponse res = sdk.resource.updateResource("string");

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 179

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GroupFirstGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.GroupFirstGetResponse res = sdk.first.get();

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 180

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GroupSecondGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.GroupSecondGetResponse res = sdk.second.get();

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 181

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PaginationCursorBodyRequestBody;
import org.openapis.openapi.models.operations.PaginationCursorBodyResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.PaginationCursorBodyRequestBody req = new PaginationCursorBodyRequestBody(
                868337L);

            org.openapis.openapi.models.operations.PaginationCursorBodyResponse res = sdk.pagination.paginationCursorBody(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 182

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PaginationCursorParamsRequest;
import org.openapis.openapi.models.operations.PaginationCursorParamsResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.PaginationCursorParamsResponse res = sdk.pagination.paginationCursorParams(24812L);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 183

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PaginationLimitOffsetOffsetBodyResponse;
import org.openapis.openapi.models.shared.LimitOffsetConfig;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.LimitOffsetConfig req = new LimitOffsetConfig(
){{
                limit = 189971L;
                offset = 995974L;
                page = 329413L;

            }};

            org.openapis.openapi.models.operations.PaginationLimitOffsetOffsetBodyResponse res = sdk.pagination.paginationLimitOffsetOffsetBody(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 184

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PaginationLimitOffsetOffsetParamsRequest;
import org.openapis.openapi.models.operations.PaginationLimitOffsetOffsetParamsResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.PaginationLimitOffsetOffsetParamsResponse res = sdk.pagination.paginationLimitOffsetOffsetParams(661976L, 600173L);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 185

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PaginationLimitOffsetPageBodyResponse;
import org.openapis.openapi.models.shared.LimitOffsetConfig;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.LimitOffsetConfig req = new LimitOffsetConfig(
){{
                limit = 479052L;
                offset = 716379L;
                page = 911806L;

            }};

            org.openapis.openapi.models.operations.PaginationLimitOffsetPageBodyResponse res = sdk.pagination.paginationLimitOffsetPageBody(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 186

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PaginationLimitOffsetPageParamsRequest;
import org.openapis.openapi.models.operations.PaginationLimitOffsetPageParamsResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.PaginationLimitOffsetPageParamsResponse res = sdk.pagination.paginationLimitOffsetPageParams(1177L);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Example 187

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.RetriesGetRequest;
import org.openapis.openapi.models.operations.RetriesGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.RetriesGetResponse res = sdk.retries.retriesGet("string", 75342L);

            if (res.retries != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Second

Do this second

```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.EnumParameter;
import org.openapis.openapi.models.operations.OptEnumParameter;
import org.openapis.openapi.models.operations.UsageExamplePostRequest;
import org.openapis.openapi.models.operations.UsageExamplePostRequestBody;
import org.openapis.openapi.models.operations.UsageExamplePostResponse;
import org.openapis.openapi.models.operations.UsageExamplePostSecurity;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.FakerFormattedStrings;
import org.openapis.openapi.models.shared.FakerStrings;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.UsageExamplePostRequest req = new UsageExamplePostRequest(
                168827L,
                "string",
                false,
                LocalDate.parse("2022-05-05"),
                OffsetDateTime.parse("2023-06-11T00:39:45.412Z"),
                OffsetDateTime.parse("2022-07-22T13:16:48.221Z"),
                2679.33d,
                "string",
                5223.72d,
                EnumParameter.VALUE1,
                0d,
                6946.59f,
                2286.22d,
                102975L,
                566999,
                "example 1"){{
                requestBody = new UsageExamplePostRequestBody(
){{
                    fakerFormattedStrings = new FakerFormattedStrings(
){{
                        addressFormat = "2344 Aufderhar Corner";
                        directoryFormat = "/etc/defaults";
                        domainFormat = "fatal-cutting.name";
                        emailFormat = "Roberta.Kemmer77@gmail.com";
                        filenameFormat = "strategic_southwest_shirt.mp4v";
                        filepathFormat = "/usr/local/bin/target.z4";
                        imageFormat = "https://loremflickr.com/640/480";
                        ipv4Format = "116.31.181.178";
                        ipv6Format = "73ac:9ee2:348d:76c3:164a:258b:e7e1:3586";
                        jsonFormat = "{key: 42822, key1: null, key2: \"string\"}";
                        macFormat = "7d:ac:95:a0:15:23";
                        passwordFormat = "eWzdveK0sHokC9n";
                        phoneFormat = "1-340-562-2122 x175";
                        timezoneFormat = "Asia/Yekaterinburg";
                        unknownFormat = "string";
                        urlFormat = "https://wilted-cytoplasm.biz";
                        uuidFormat = "e0f62de2-e2d4-47a9-bf10-0f753b9b364b";
                        zipcodeFormat = "73625";

                    }};
                    fakerStrings = new FakerStrings(
){{
                        city = "Schuppecester";
                        iban = "NO0300631256004";
                        id = "<ID>";
                        iPv4 = "251.251.208.201";
                        iPv6 = "ffbd:3ad7:2b20:8b2c:8188:308b:b979:0237";
                        account = "29659826";
                        address = "2500 Ambrose Circles";
                        amount = "89.73";
                        avatar = "https://loremflickr.com/640/480";
                        color = "fuchsia";
                        comment = "Carbonite web goalkeeper gloves are ergonomically designed to give easy fit";
                        company = "Sipes - Buckridge";
                        country = "Turkey";
                        countryCode = "NF";
                        currency = "Pakistan Rupee";
                        datatype = "real";
                        default_ = "string";
                        description = "Customizable zero administration open system";
                        directory = "/opt/sbin";
                        domainName = "deep-stallion.info";
                        emailAddr = "Alejandrin.Barrows@hotmail.com";
                        extension = "m1v";
                        filename = "panel_deposit.png";
                        filepath = "/media/executive_automotive_northeast.distz";
                        filetype = "video";
                        firstName = "Dejuan";
                        fullName = "Mrs. Jose Franey";
                        gender = "Trans female";
                        job = "Direct Accountability Liaison";
                        json = "{key: 88901, key1: null, key2: \"string\"}";
                        key = "<key>";
                        lastName = "Metz";
                        latitude = "68.2232";
                        locale = "uk";
                        longitude = "-42.1384";
                        mac = "a2:42:a1:bf:6e:19";
                        manufacturer = "Aston Martin";
                        material = "Concrete";
                        middleName = "Finley";
                        model = "Escalade";
                        password = "_QiNrTzqbDz8AXY";
                        phone = "469-402-6116";
                        pin = "9497";
                        postalCode = "64696";
                        price = "25.00";
                        product = "Recycled Granite Pants";
                        sex = "male";
                        street = "Lura Wells";
                        timezone = "Africa/Nairobi";
                        unit = "degree Celsius";
                        url = "https://crooked-dulcimer.name";
                        username = "Mable76";
                        uuid = "16b919d6-51cd-4e97-81e2-5221b7b6969f";

                    }};
                    simpleObject = new SimpleObject(
                        "any",
                        true,
                        LocalDate.parse("2020-01-01"),
                        OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"),
                        Enum.ONE,
                        1.1f,
                        1L,
                        1,
                        Int32Enum.FIFTY_FIVE,
                        IntEnum.Second,
                        1.1d,
                        "test"){{
                        bigint = 8821239038968084L;
                        bigintStr = "9223372036854775808";
                        boolOpt = true;
                        decimal = 3.141592653589793d;
                        decimalStr = "3.14159265358979344719667586";
                        intOptNull = 809796L;
                        numOptNull = 4812.91d;
                        strOpt = "testOptional";

                    }};

                }};
                bigintParameterOptional = 165468L;
                bigintStrParameterOptional = "string";
                decimalParameterOptional = 5944.32d;
                decimalStrParameterOptional = "string";
                optEnumParameter = OptEnumParameter.VALUE3;

            }};

            org.openapis.openapi.models.operations.UsageExamplePostResponse res = sdk.generation.usageExamplePost(req, new UsageExamplePostSecurity(
            "YOUR_PASSWORD",
            "YOUR_USERNAME"){{
                password = "YOUR_PASSWORD";
                username = "YOUR_USERNAME";
            }});

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

### [SDK](docs/sdks/sdk/README.md)

* [putAnythingIgnoredGeneration](docs/sdks/sdk/README.md#putanythingignoredgeneration)
* [responseBodyJsonGet](docs/sdks/sdk/README.md#responsebodyjsonget)

### [generation](docs/sdks/generation/README.md)

* [anchorTypesGet](docs/sdks/generation/README.md#anchortypesget)
* [arrayCircularReferenceGet](docs/sdks/generation/README.md#arraycircularreferenceget)
* [circularReferenceGet](docs/sdks/generation/README.md#circularreferenceget)
* [dateParamWithDefault](docs/sdks/generation/README.md#dateparamwithdefault)
* [dateTimeParamWithDefault](docs/sdks/generation/README.md#datetimeparamwithdefault)
* [decimalParamWithDefault](docs/sdks/generation/README.md#decimalparamwithdefault)
* [deprecatedFieldInSchemaPost](docs/sdks/generation/README.md#deprecatedfieldinschemapost)
* [deprecatedObjectInSchemaGet](docs/sdks/generation/README.md#deprecatedobjectinschemaget)
* [~~deprecatedOperationNoCommentsGet~~](docs/sdks/generation/README.md#deprecatedoperationnocommentsget) - :warning: **Deprecated**
* [~~deprecatedOperationWithCommentsGet~~](docs/sdks/generation/README.md#deprecatedoperationwithcommentsget) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** Use `simplePathParameterObjects` instead.
* [emptyObjectGet](docs/sdks/generation/README.md#emptyobjectget)
* [emptyResponseObjectWithCommentGet](docs/sdks/generation/README.md#emptyresponseobjectwithcommentget)
* [globalNameOverridden](docs/sdks/generation/README.md#globalnameoverridden)
* [ignoredGenerationGet](docs/sdks/generation/README.md#ignoredgenerationget)
* [ignoresPost](docs/sdks/generation/README.md#ignorespost)
* [nameOverride](docs/sdks/generation/README.md#nameoverride)
* [objectCircularReferenceGet](docs/sdks/generation/README.md#objectcircularreferenceget)
* [oneOfCircularReferenceGet](docs/sdks/generation/README.md#oneofcircularreferenceget)
* [typedParameterGenerationGet](docs/sdks/generation/README.md#typedparametergenerationget)
* [usageExamplePost](docs/sdks/generation/README.md#usageexamplepost) - An operation used for testing usage examples

### [errors](docs/sdks/errors/README.md)

* [connectionErrorGet](docs/sdks/errors/README.md#connectionerrorget)
* [statusGetError](docs/sdks/errors/README.md#statusgeterror)
* [statusGetXSpeakeasyErrors](docs/sdks/errors/README.md#statusgetxspeakeasyerrors)

### [unions](docs/sdks/unions/README.md)

* [flattenedTypedObjectPost](docs/sdks/unions/README.md#flattenedtypedobjectpost)
* [mixedTypeOneOfPost](docs/sdks/unions/README.md#mixedtypeoneofpost)
* [nullableOneOfRefInObjectPost](docs/sdks/unions/README.md#nullableoneofrefinobjectpost)
* [nullableOneOfSchemaPost](docs/sdks/unions/README.md#nullableoneofschemapost)
* [nullableOneOfTypeInObjectPost](docs/sdks/unions/README.md#nullableoneoftypeinobjectpost)
* [nullableTypedObjectPost](docs/sdks/unions/README.md#nullabletypedobjectpost)
* [primitiveTypeOneOfPost](docs/sdks/unions/README.md#primitivetypeoneofpost)
* [stronglyTypedOneOfPost](docs/sdks/unions/README.md#stronglytypedoneofpost)
* [typedObjectNullableOneOfPost](docs/sdks/unions/README.md#typedobjectnullableoneofpost)
* [typedObjectOneOfPost](docs/sdks/unions/README.md#typedobjectoneofpost)
* [unionBigIntDecimal](docs/sdks/unions/README.md#unionbigintdecimal)
* [unionDateNull](docs/sdks/unions/README.md#uniondatenull)
* [unionDateTimeBigInt](docs/sdks/unions/README.md#uniondatetimebigint)
* [unionDateTimeNull](docs/sdks/unions/README.md#uniondatetimenull)
* [weaklyTypedOneOfPost](docs/sdks/unions/README.md#weaklytypedoneofpost)

### [flattening](docs/sdks/flattening/README.md)

* [componentBodyAndParamConflict](docs/sdks/flattening/README.md#componentbodyandparamconflict)
* [componentBodyAndParamNoConflict](docs/sdks/flattening/README.md#componentbodyandparamnoconflict)
* [conflictingParams](docs/sdks/flattening/README.md#conflictingparams)
* [inlineBodyAndParamConflict](docs/sdks/flattening/README.md#inlinebodyandparamconflict)
* [inlineBodyAndParamNoConflict](docs/sdks/flattening/README.md#inlinebodyandparamnoconflict)

### [globals](docs/sdks/globals/README.md)

* [globalPathParameterGet](docs/sdks/globals/README.md#globalpathparameterget)
* [globalsQueryParameterGet](docs/sdks/globals/README.md#globalsqueryparameterget)

### [parameters](docs/sdks/parameters/README.md)

* [deepObjectQueryParamsMap](docs/sdks/parameters/README.md#deepobjectqueryparamsmap)
* [deepObjectQueryParamsObject](docs/sdks/parameters/README.md#deepobjectqueryparamsobject)
* [duplicateParam](docs/sdks/parameters/README.md#duplicateparam)
* [formQueryParamsArray](docs/sdks/parameters/README.md#formqueryparamsarray)
* [formQueryParamsCamelObject](docs/sdks/parameters/README.md#formqueryparamscamelobject)
* [formQueryParamsMap](docs/sdks/parameters/README.md#formqueryparamsmap)
* [formQueryParamsObject](docs/sdks/parameters/README.md#formqueryparamsobject)
* [formQueryParamsPrimitive](docs/sdks/parameters/README.md#formqueryparamsprimitive)
* [formQueryParamsRefParamObject](docs/sdks/parameters/README.md#formqueryparamsrefparamobject)
* [headerParamsArray](docs/sdks/parameters/README.md#headerparamsarray)
* [headerParamsMap](docs/sdks/parameters/README.md#headerparamsmap)
* [headerParamsObject](docs/sdks/parameters/README.md#headerparamsobject)
* [headerParamsPrimitive](docs/sdks/parameters/README.md#headerparamsprimitive)
* [jsonQueryParamsObject](docs/sdks/parameters/README.md#jsonqueryparamsobject)
* [mixedParametersCamelCase](docs/sdks/parameters/README.md#mixedparameterscamelcase)
* [mixedParametersPrimitives](docs/sdks/parameters/README.md#mixedparametersprimitives)
* [mixedQueryParams](docs/sdks/parameters/README.md#mixedqueryparams)
* [pathParameterJson](docs/sdks/parameters/README.md#pathparameterjson)
* [pipeDelimitedQueryParamsArray](docs/sdks/parameters/README.md#pipedelimitedqueryparamsarray)
* [simplePathParameterArrays](docs/sdks/parameters/README.md#simplepathparameterarrays)
* [simplePathParameterMaps](docs/sdks/parameters/README.md#simplepathparametermaps)
* [simplePathParameterObjects](docs/sdks/parameters/README.md#simplepathparameterobjects)
* [simplePathParameterPrimitives](docs/sdks/parameters/README.md#simplepathparameterprimitives)


### [nest.first](docs/sdks/sdkfirst/README.md)

* [get](docs/sdks/sdkfirst/README.md#get)

### [nested](docs/sdks/nested/README.md)

* [get](docs/sdks/nested/README.md#get)

### [nested.first](docs/sdks/sdknestedfirst/README.md)

* [get](docs/sdks/sdknestedfirst/README.md#get)

### [nested.second](docs/sdks/sdksecond/README.md)

* [get](docs/sdks/sdksecond/README.md#get)

### [requestBodies](docs/sdks/requestbodies/README.md)

* [nullableObjectPost](docs/sdks/requestbodies/README.md#nullableobjectpost)
* [nullableRequiredEmptyObjectPost](docs/sdks/requestbodies/README.md#nullablerequiredemptyobjectpost)
* [nullableRequiredPropertyPost](docs/sdks/requestbodies/README.md#nullablerequiredpropertypost)
* [nullableRequiredSharedObjectPost](docs/sdks/requestbodies/README.md#nullablerequiredsharedobjectpost)
* [requestBodyPostApplicationJsonArray](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarray)
* [requestBodyPostApplicationJsonArrayCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarraycamelcase)
* [requestBodyPostApplicationJsonArrayObj](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayobj)
* [requestBodyPostApplicationJsonArrayObjCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayobjcamelcase)
* [requestBodyPostApplicationJsonArrayOfArray](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofarray)
* [requestBodyPostApplicationJsonArrayOfArrayCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofarraycamelcase)
* [requestBodyPostApplicationJsonArrayOfArrayOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofarrayofprimitive)
* [requestBodyPostApplicationJsonArrayOfMap](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofmap)
* [requestBodyPostApplicationJsonArrayOfMapCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofmapcamelcase)
* [requestBodyPostApplicationJsonArrayOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofprimitive)
* [requestBodyPostApplicationJsonDeep](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsondeep)
* [requestBodyPostApplicationJsonDeepCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsondeepcamelcase)
* [requestBodyPostApplicationJsonMap](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmap)
* [requestBodyPostApplicationJsonMapCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapcamelcase)
* [requestBodyPostApplicationJsonMapObj](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapobj)
* [requestBodyPostApplicationJsonMapObjCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapobjcamelcase)
* [requestBodyPostApplicationJsonMapOfArray](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofarray)
* [requestBodyPostApplicationJsonMapOfArrayCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofarraycamelcase)
* [requestBodyPostApplicationJsonMapOfMap](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofmap)
* [requestBodyPostApplicationJsonMapOfMapCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofmapcamelcase)
* [requestBodyPostApplicationJsonMapOfMapOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofmapofprimitive)
* [requestBodyPostApplicationJsonMapOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofprimitive)
* [requestBodyPostApplicationJsonMultipleJsonFiltered](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmultiplejsonfiltered)
* [requestBodyPostApplicationJsonSimple](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonsimple)
* [requestBodyPostApplicationJsonSimpleCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonsimplecamelcase)
* [requestBodyPostComplexNumberTypes](docs/sdks/requestbodies/README.md#requestbodypostcomplexnumbertypes)
* [requestBodyPostDefaultsAndConsts](docs/sdks/requestbodies/README.md#requestbodypostdefaultsandconsts)
* [requestBodyPostEmptyObject](docs/sdks/requestbodies/README.md#requestbodypostemptyobject)
* [requestBodyPostFormDeep](docs/sdks/requestbodies/README.md#requestbodypostformdeep)
* [requestBodyPostFormMapPrimitive](docs/sdks/requestbodies/README.md#requestbodypostformmapprimitive)
* [requestBodyPostFormSimple](docs/sdks/requestbodies/README.md#requestbodypostformsimple)
* [requestBodyPostJsonDataTypesArrayBigInt](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesarraybigint)
* [requestBodyPostJsonDataTypesArrayDate](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesarraydate)
* [requestBodyPostJsonDataTypesArrayDecimalStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesarraydecimalstr)
* [requestBodyPostJsonDataTypesBigInt](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesbigint)
* [requestBodyPostJsonDataTypesBigIntStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesbigintstr)
* [requestBodyPostJsonDataTypesBoolean](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesboolean)
* [requestBodyPostJsonDataTypesDate](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdate)
* [requestBodyPostJsonDataTypesDateTime](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdatetime)
* [requestBodyPostJsonDataTypesDecimal](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdecimal)
* [requestBodyPostJsonDataTypesDecimalStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdecimalstr)
* [requestBodyPostJsonDataTypesFloat32](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesfloat32)
* [requestBodyPostJsonDataTypesInt32](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesint32)
* [requestBodyPostJsonDataTypesInteger](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesinteger)
* [requestBodyPostJsonDataTypesMapBigIntStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesmapbigintstr)
* [requestBodyPostJsonDataTypesMapDateTime](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesmapdatetime)
* [requestBodyPostJsonDataTypesMapDecimal](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesmapdecimal)
* [requestBodyPostJsonDataTypesNumber](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesnumber)
* [requestBodyPostJsonDataTypesString](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesstring)
* [requestBodyPostMultipleContentTypesComponentFiltered](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypescomponentfiltered)
* [requestBodyPostMultipleContentTypesInlineFiltered](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypesinlinefiltered)
* [requestBodyPostMultipleContentTypesSplitParamForm](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparamform)
* [requestBodyPostMultipleContentTypesSplitParamJson](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparamjson)
* [requestBodyPostMultipleContentTypesSplitParamMultipart](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparammultipart)
* [requestBodyPostMultipleContentTypesSplitForm](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitform)
* [requestBodyPostMultipleContentTypesSplitJson](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitjson)
* [requestBodyPostMultipleContentTypesSplitMultipart](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitmultipart)
* [requestBodyPostNotNullableNotRequiredStringBody](docs/sdks/requestbodies/README.md#requestbodypostnotnullablenotrequiredstringbody)
* [requestBodyPostNullArray](docs/sdks/requestbodies/README.md#requestbodypostnullarray)
* [requestBodyPostNullDictionary](docs/sdks/requestbodies/README.md#requestbodypostnulldictionary)
* [requestBodyPostNullableNotRequiredStringBody](docs/sdks/requestbodies/README.md#requestbodypostnullablenotrequiredstringbody)
* [requestBodyPostNullableRequiredStringBody](docs/sdks/requestbodies/README.md#requestbodypostnullablerequiredstringbody)
* [requestBodyPutBytes](docs/sdks/requestbodies/README.md#requestbodyputbytes)
* [requestBodyPutBytesWithParams](docs/sdks/requestbodies/README.md#requestbodyputbyteswithparams)
* [requestBodyPutMultipartDeep](docs/sdks/requestbodies/README.md#requestbodyputmultipartdeep)
* [requestBodyPutMultipartDifferentFileName](docs/sdks/requestbodies/README.md#requestbodyputmultipartdifferentfilename)
* [requestBodyPutMultipartFile](docs/sdks/requestbodies/README.md#requestbodyputmultipartfile)
* [requestBodyPutMultipartSimple](docs/sdks/requestbodies/README.md#requestbodyputmultipartsimple)
* [requestBodyPutString](docs/sdks/requestbodies/README.md#requestbodyputstring)
* [requestBodyPutStringWithParams](docs/sdks/requestbodies/README.md#requestbodyputstringwithparams)
* [requestBodyReadAndWrite](docs/sdks/requestbodies/README.md#requestbodyreadandwrite)
* [requestBodyReadOnlyInput](docs/sdks/requestbodies/README.md#requestbodyreadonlyinput)
* [requestBodyReadOnlyUnion](docs/sdks/requestbodies/README.md#requestbodyreadonlyunion)
* [requestBodyReadWriteOnlyUnion](docs/sdks/requestbodies/README.md#requestbodyreadwriteonlyunion)
* [requestBodyWriteOnly](docs/sdks/requestbodies/README.md#requestbodywriteonly)
* [requestBodyWriteOnlyOutput](docs/sdks/requestbodies/README.md#requestbodywriteonlyoutput)
* [requestBodyWriteOnlyUnion](docs/sdks/requestbodies/README.md#requestbodywriteonlyunion)

### [responseBodies](docs/sdks/responsebodies/README.md)

* [responseBodyAdditionalPropertiesComplexNumbersPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiescomplexnumberspost)
* [responseBodyAdditionalPropertiesDatePost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiesdatepost)
* [responseBodyAdditionalPropertiesObjectPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiesobjectpost)
* [responseBodyAdditionalPropertiesPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiespost)
* [responseBodyBytesGet](docs/sdks/responsebodies/README.md#responsebodybytesget)
* [responseBodyEmptyWithHeaders](docs/sdks/responsebodies/README.md#responsebodyemptywithheaders)
* [responseBodyOptionalGet](docs/sdks/responsebodies/README.md#responsebodyoptionalget)
* [responseBodyReadOnly](docs/sdks/responsebodies/README.md#responsebodyreadonly)
* [responseBodyStringGet](docs/sdks/responsebodies/README.md#responsebodystringget)
* [responseBodyXmlGet](docs/sdks/responsebodies/README.md#responsebodyxmlget)
* [responseBodyZeroValueComplexTypePtrsPost](docs/sdks/responsebodies/README.md#responsebodyzerovaluecomplextypeptrspost)

### [servers](docs/sdks/servers/README.md)

* [selectGlobalServer](docs/sdks/servers/README.md#selectglobalserver)
* [selectServerWithID](docs/sdks/servers/README.md#selectserverwithid) - Select a server by ID.
* [serverWithProtocolTemplate](docs/sdks/servers/README.md#serverwithprotocoltemplate)
* [serverWithTemplates](docs/sdks/servers/README.md#serverwithtemplates)
* [serverWithTemplatesGlobal](docs/sdks/servers/README.md#serverwithtemplatesglobal)
* [serversByIDWithTemplates](docs/sdks/servers/README.md#serversbyidwithtemplates)

### [telemetry](docs/sdks/telemetry/README.md)

* [telemetrySpeakeasyUserAgentGet](docs/sdks/telemetry/README.md#telemetryspeakeasyuseragentget)
* [telemetryUserAgentGet](docs/sdks/telemetry/README.md#telemetryuseragentget)

### [authNew](docs/sdks/authnew/README.md)

* [apiKeyAuthGlobalNew](docs/sdks/authnew/README.md#apikeyauthglobalnew)
* [authGlobal](docs/sdks/authnew/README.md#authglobal)
* [basicAuthNew](docs/sdks/authnew/README.md#basicauthnew)
* [multipleMixedOptionsAuth](docs/sdks/authnew/README.md#multiplemixedoptionsauth)
* [multipleMixedSchemeAuth](docs/sdks/authnew/README.md#multiplemixedschemeauth)
* [multipleOptionsWithMixedSchemesAuth](docs/sdks/authnew/README.md#multipleoptionswithmixedschemesauth)
* [multipleOptionsWithSimpleSchemesAuth](docs/sdks/authnew/README.md#multipleoptionswithsimpleschemesauth)
* [multipleSimpleOptionsAuth](docs/sdks/authnew/README.md#multiplesimpleoptionsauth)
* [multipleSimpleSchemeAuth](docs/sdks/authnew/README.md#multiplesimpleschemeauth)
* [oauth2AuthNew](docs/sdks/authnew/README.md#oauth2authnew)
* [openIdConnectAuthNew](docs/sdks/authnew/README.md#openidconnectauthnew)

### [auth](docs/sdks/auth/README.md)

* [apiKeyAuth](docs/sdks/auth/README.md#apikeyauth)
* [apiKeyAuthGlobal](docs/sdks/auth/README.md#apikeyauthglobal)
* [basicAuth](docs/sdks/auth/README.md#basicauth)
* [bearerAuth](docs/sdks/auth/README.md#bearerauth)
* [globalBearerAuth](docs/sdks/auth/README.md#globalbearerauth)
* [oauth2Auth](docs/sdks/auth/README.md#oauth2auth)
* [oauth2Override](docs/sdks/auth/README.md#oauth2override)
* [openIdConnectAuth](docs/sdks/auth/README.md#openidconnectauth)

### [documentation](docs/sdks/documentation/README.md)

* [getDocumentationPerLanguage](docs/sdks/documentation/README.md#getdocumentationperlanguage) - Gets documentation for some language, I guess.

### [resource](docs/sdks/resource/README.md)

* [createFile](docs/sdks/resource/README.md#createfile)
* [createResource](docs/sdks/resource/README.md#createresource)
* [deleteResource](docs/sdks/resource/README.md#deleteresource)
* [getResource](docs/sdks/resource/README.md#getresource)
* [updateResource](docs/sdks/resource/README.md#updateresource)

### [first](docs/sdks/first/README.md)

* [get](docs/sdks/first/README.md#get)

### [second](docs/sdks/second/README.md)

* [get](docs/sdks/second/README.md#get)

### [pagination](docs/sdks/pagination/README.md)

* [paginationCursorBody](docs/sdks/pagination/README.md#paginationcursorbody)
* [paginationCursorParams](docs/sdks/pagination/README.md#paginationcursorparams)
* [paginationLimitOffsetOffsetBody](docs/sdks/pagination/README.md#paginationlimitoffsetoffsetbody)
* [paginationLimitOffsetOffsetParams](docs/sdks/pagination/README.md#paginationlimitoffsetoffsetparams)
* [paginationLimitOffsetPageBody](docs/sdks/pagination/README.md#paginationlimitoffsetpagebody)
* [paginationLimitOffsetPageParams](docs/sdks/pagination/README.md#paginationlimitoffsetpageparams)

### [retries](docs/sdks/retries/README.md)

* [retriesGet](docs/sdks/retries/README.md#retriesget)
<!-- End Available Resources and Operations [operations] -->





<!-- Start Global Parameters [global-parameters] -->
## Global Parameters

Certain parameters are configured globally. These parameters must be set on the SDK client instance itself during initialization. When configured as an option during SDK initialization, These global values will be used as defaults on the operations that use them. When such operations are called, there is a place in each to override the global value, if needed.

For example, you can set `globalPathParam` to `100L` at SDK initialization and then you do not have to pass the same value on calls to operations like `globalPathParameterGet`. But if you want to do so you may, which will locally override the global setting. See the example code below for a demonstration.


### Available Globals

The following global parameters are available. The required parameters must be set when you initialize the SDK client.

| Name | Type | Required | Description |
| ---- | ---- |:--------:| ----------- |
| globalPathParam | Long | ✔️ | The globalPathParam parameter. |
| globalQueryParam | String | ✔️ | The globalQueryParam parameter. |


### Example

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GlobalPathParameterGetRequest;
import org.openapis.openapi.models.operations.GlobalPathParameterGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.GlobalPathParameterGetResponse res = sdk.globals.globalPathParameterGet(719830L);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End Global Parameters [global-parameters] -->

<!-- Start Server Selection [server] -->
## Server Selection

## Server Selection

### Select Server by Index

You can override the default server globally using the `setServerIndex` option when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| # | Server | Variables |
| - | ------ | --------- |
| 0 | `http://localhost:35123` | None |
| 1 | `http://broken` | None |
| 2 | `http://{hostname}:{port}` | `0` (default is `localhost`), `1` (default is `35123`) |
| 3 | `http://localhost:35123/anything/{something}` | `0` (default is `something`) |
| 4 | `{protocol}://{hostname}:{port}` | `0` (default is `localhost`), `1` (default is `35123`), `2` (default is `http`) |



#### Variables

Some of the server options above contain variables. If you want to set the values of those variables, the following options are provided for doing so:
 * `setZero String`
 * `setOne String`
 * `setTwo ServerSomething`
 * `setThree String`

### Override Server URL Per-Client

The default server can also be overridden globally using the `setServerURL` option when initializing the SDK client instance. For example:


### Override Server URL Per-Operation

The server URL can also be overridden on a per-operation basis, provided a server list was specified for the operation. For example:
```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ConnectionErrorGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                ){{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.operations.ConnectionErrorGetResponse res = sdk.errors.connectionErrorGet(serverUrl="http://somebrokenapi.broken");

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End Server Selection [server] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->



### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage 
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally 
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. 
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
