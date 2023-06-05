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
                put("tenetur", "amet");
                put("tempore", "accusamus");
                put("numquam", "enim");
                put("dolorem", "sapiente");
            }}, new java.util.HashMap<String, String[]>() {{
                put("nihil", new String[]{{
                    add("expedita"),
                }});
                put("neque", new String[]{{
                    add("vel"),
                }});
                put("libero", new String[]{{
                    add("deserunt"),
                    add("quam"),
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

            DeepObjectQueryParamsObjectResponse res = sdk.parameters.deepObjectQueryParamsObject(new SimpleObject("pariatur", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.First, 1.1, "example") {{
                any = "ipsum";
                bigint = 277628L;
                bigintStr = "qui";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                enum_ = Enum.TWO;
                float32 = 2.2222222;
                int_ = 999999L;
                int32 = 1;
                int32Enum = SimpleObjectInt32Enum.SIXTY_NINE;
                intEnum = SimpleObjectIntEnum.Third;
                intOptNull = 999999L;
                num = 1.1;
                numOptNull = 1.1;
                str = "example";
                strOpt = "optional example";
            }}, new DeepObjectQueryParamsObjectObjArrParam() {{
                arr = new String[]{{
                    add("totam"),
                    add("incidunt"),
                    add("aspernatur"),
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
                add("distinctio"),
            }}, new Long[]{{
                add(396060L),
                add(463150L),
                add(565421L),
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
                put("qui", "neque");
                put("fugit", "magni");
                put("odio", "sunt");
                put("ullam", "nam");
            }}, new java.util.HashMap<String, Long>() {{
                put("voluptatem", 765326L);
                put("soluta", 748664L);
                put("et", 903720L);
                put("ipsum", 83422L);
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

            FormQueryParamsObjectResponse res = sdk.parameters.formQueryParamsObject(new SimpleObject("delectus", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.First, 1.1, "example") {{
                any = "nobis";
                bigint = 552193L;
                bigintStr = "tempore";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                enum_ = Enum.TWO;
                float32 = 2.2222222;
                int_ = 999999L;
                int32 = 1;
                int32Enum = SimpleObjectInt32Enum.SIXTY_NINE;
                intEnum = SimpleObjectIntEnum.First;
                intOptNull = 999999L;
                num = 1.1;
                numOptNull = 1.1;
                str = "example";
                strOpt = "optional example";
            }}, new SimpleObject("aut", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1, "example") {{
                any = "labore";
                bigint = 240829L;
                bigintStr = "dolorum";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                enum_ = Enum.TWO;
                float32 = 2.2222222;
                int_ = 999999L;
                int32 = 1;
                int32Enum = SimpleObjectInt32Enum.FIFTY_FIVE;
                intEnum = SimpleObjectIntEnum.First;
                intOptNull = 999999L;
                num = 1.1;
                numOptNull = 1.1;
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

            FormQueryParamsPrimitiveResponse res = sdk.parameters.formQueryParamsPrimitive(false, 9240L, 6699.17, "repellendus");

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

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

            FormQueryParamsRefParamObjectResponse res = sdk.parameters.formQueryParamsRefParamObject(new RefQueryParamObj(false, 703495L, 5864.1, "qui") {{
                bool = false;
                int_ = 785153L;
                num = 9843.3;
                str = "ut";
            }}, new RefQueryParamObjExploded(false, 580447L, 9774.96, "quisquam") {{
                bool = false;
                int_ = 63955L;
                num = 5123.93;
                str = "odio";
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
                add("omnis"),
                add("quis"),
                add("ipsum"),
                add("delectus"),
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
                put("consectetur", "vero");
                put("tenetur", "dignissimos");
            }}, new java.util.HashMap<String, String>() {{
                put("distinctio", "quod");
                put("odio", "similique");
                put("facilis", "vero");
                put("ducimus", "dolore");
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

            HeaderParamsObjectResponse res = sdk.parameters.headerParamsObject(new SimpleObject("aut", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1, "example") {{
                any = "quibusdam";
                bigint = 848944L;
                bigintStr = "sequi";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                enum_ = Enum.TWO;
                float32 = 2.2222222;
                int_ = 999999L;
                int32 = 1;
                int32Enum = SimpleObjectInt32Enum.SIXTY_NINE;
                intEnum = SimpleObjectIntEnum.Third;
                intOptNull = 999999L;
                num = 1.1;
                numOptNull = 1.1;
                str = "example";
                strOpt = "optional example";
            }}, new SimpleObject("iusto", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1, "example") {{
                any = "nulla";
                bigint = 148141L;
                bigintStr = "porro";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                enum_ = Enum.TWO;
                float32 = 2.2222222;
                int_ = 999999L;
                int32 = 1;
                int32Enum = SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE;
                intEnum = SimpleObjectIntEnum.Third;
                intOptNull = 999999L;
                num = 1.1;
                numOptNull = 1.1;
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

            HeaderParamsPrimitiveResponse res = sdk.parameters.headerParamsPrimitive(false, 4048L, 6394.73, "tempora");

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

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

            JsonQueryParamsObjectResponse res = sdk.parameters.jsonQueryParamsObject(new DeepObject(                new SimpleObject("reprehenderit", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Third, 1.1, "example") {{
                                any = "eius";
                                bigint = 458515L;
                                bigintStr = "esse";
                                bool = true;
                                boolOpt = true;
                                date = LocalDate.parse("2020-01-01");
                                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                enum_ = Enum.TWO;
                                float32 = 2.2222222;
                                int_ = 999999L;
                                int32 = 1;
                                int32Enum = SimpleObjectInt32Enum.SIXTY_NINE;
                                intEnum = SimpleObjectIntEnum.Third;
                                intOptNull = 999999L;
                                num = 1.1;
                                numOptNull = 1.1;
                                str = "example";
                                strOpt = "optional example";
                            }},                 new org.openapis.openapi.models.shared.SimpleObject[]{{
                                add(new SimpleObject("quisquam", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.First, 1.1, "example") {{
                                    any = "eum";
                                    bigint = 379927L;
                                    bigintStr = "assumenda";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    enum_ = Enum.TWO;
                                    float32 = 2.2222222;
                                    int_ = 999999L;
                                    int32 = 1;
                                    int32Enum = SimpleObjectInt32Enum.FIFTY_FIVE;
                                    intEnum = SimpleObjectIntEnum.Second;
                                    intOptNull = 999999L;
                                    num = 1.1;
                                    numOptNull = 1.1;
                                    str = "example";
                                    strOpt = "optional example";
                                }}),
                                add(new SimpleObject("quo", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.First, 1.1, "example") {{
                                    any = "id";
                                    bigint = 696997L;
                                    bigintStr = "neque";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    enum_ = Enum.TWO;
                                    float32 = 2.2222222;
                                    int_ = 999999L;
                                    int32 = 1;
                                    int32Enum = SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE;
                                    intEnum = SimpleObjectIntEnum.Third;
                                    intOptNull = 999999L;
                                    num = 1.1;
                                    numOptNull = 1.1;
                                    str = "example";
                                    strOpt = "optional example";
                                }}),
                            }}, false, 178367L,                 new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                                put("ab", new SimpleObject("aspernatur", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Third, 1.1, "example") {{
                                    any = "cupiditate";
                                    bigint = 9688L;
                                    bigintStr = "tempora";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    enum_ = Enum.TWO;
                                    float32 = 2.2222222;
                                    int_ = 999999L;
                                    int32 = 1;
                                    int32Enum = SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE;
                                    intEnum = SimpleObjectIntEnum.Second;
                                    intOptNull = 999999L;
                                    num = 1.1;
                                    numOptNull = 1.1;
                                    str = "example";
                                    strOpt = "optional example";
                                }});
                                put("esse", new SimpleObject("inventore", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1, "example") {{
                                    any = "recusandae";
                                    bigint = 44612L;
                                    bigintStr = "distinctio";
                                    bool = true;
                                    boolOpt = true;
                                    date = LocalDate.parse("2020-01-01");
                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                    enum_ = Enum.TWO;
                                    float32 = 2.2222222;
                                    int_ = 999999L;
                                    int32 = 1;
                                    int32Enum = SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE;
                                    intEnum = SimpleObjectIntEnum.Second;
                                    intOptNull = 999999L;
                                    num = 1.1;
                                    numOptNull = 1.1;
                                    str = "example";
                                    strOpt = "optional example";
                                }});
                            }}, 8827.1,                 new SimpleObject("aliquam", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1, "example") {{
                                bigint = 414567L;
                                bigintStr = "sapiente";
                                boolOpt = true;
                                intOptNull = 999999L;
                                numOptNull = 1.1;
                                strOpt = "optional example";
                            }};, "dolores") {{
                any = new SimpleObject("ratione", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1, "example") {{
                    any = "ea";
                    bigint = 136900L;
                    bigintStr = "vel";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    enum_ = Enum.TWO;
                    float32 = 2.2222222;
                    int_ = 999999L;
                    int32 = 1;
                    int32Enum = SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE;
                    intEnum = SimpleObjectIntEnum.First;
                    intOptNull = 999999L;
                    num = 1.1;
                    numOptNull = 1.1;
                    str = "example";
                    strOpt = "optional example";
                }};
                arr = new org.openapis.openapi.models.shared.SimpleObject[]{{
                    add(new SimpleObject("excepturi", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1, "example") {{
                        any = "dolor";
                        bigint = 980700L;
                        bigintStr = "quasi";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        enum_ = Enum.TWO;
                        float32 = 2.2222222;
                        int_ = 999999L;
                        int32 = 1;
                        int32Enum = SimpleObjectInt32Enum.SIXTY_NINE;
                        intEnum = SimpleObjectIntEnum.Third;
                        intOptNull = 999999L;
                        num = 1.1;
                        numOptNull = 1.1;
                        str = "example";
                        strOpt = "optional example";
                    }}),
                }};
                bool = false;
                int_ = 960835L;
                map = new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                    put("saepe", new SimpleObject("inventore", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1, "example") {{
                        any = "ea";
                        bigint = 774048L;
                        bigintStr = "corporis";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        enum_ = Enum.TWO;
                        float32 = 2.2222222;
                        int_ = 999999L;
                        int32 = 1;
                        int32Enum = SimpleObjectInt32Enum.FIFTY_FIVE;
                        intEnum = SimpleObjectIntEnum.Second;
                        intOptNull = 999999L;
                        num = 1.1;
                        numOptNull = 1.1;
                        str = "example";
                        strOpt = "optional example";
                    }});
                    put("quo", new SimpleObject("a", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.First, 1.1, "example") {{
                        any = "consectetur";
                        bigint = 926213L;
                        bigintStr = "aspernatur";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        enum_ = Enum.TWO;
                        float32 = 2.2222222;
                        int_ = 999999L;
                        int32 = 1;
                        int32Enum = SimpleObjectInt32Enum.FIFTY_FIVE;
                        intEnum = SimpleObjectIntEnum.First;
                        intOptNull = 999999L;
                        num = 1.1;
                        numOptNull = 1.1;
                        str = "example";
                        strOpt = "optional example";
                    }});
                    put("aut", new SimpleObject("inventore", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.First, 1.1, "example") {{
                        any = "deleniti";
                        bigint = 770581L;
                        bigintStr = "aliquam";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        enum_ = Enum.TWO;
                        float32 = 2.2222222;
                        int_ = 999999L;
                        int32 = 1;
                        int32Enum = SimpleObjectInt32Enum.FIFTY_FIVE;
                        intEnum = SimpleObjectIntEnum.Third;
                        intOptNull = 999999L;
                        num = 1.1;
                        numOptNull = 1.1;
                        str = "example";
                        strOpt = "optional example";
                    }});
                    put("dolorum", new SimpleObject("nobis", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1, "example") {{
                        any = "laborum";
                        bigint = 810424L;
                        bigintStr = "velit";
                        bool = true;
                        boolOpt = true;
                        date = LocalDate.parse("2020-01-01");
                        dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                        enum_ = Enum.TWO;
                        float32 = 2.2222222;
                        int_ = 999999L;
                        int32 = 1;
                        int32Enum = SimpleObjectInt32Enum.SIXTY_NINE;
                        intEnum = SimpleObjectIntEnum.Second;
                        intOptNull = 999999L;
                        num = 1.1;
                        numOptNull = 1.1;
                        str = "example";
                        strOpt = "optional example";
                    }});
                }};
                num = 8605.52;
                obj = new SimpleObject("explicabo", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.First, 1.1, "example") {{
                    any = "voluptas";
                    bigint = 727044L;
                    bigintStr = "quasi";
                    bool = true;
                    boolOpt = true;
                    date = LocalDate.parse("2020-01-01");
                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                    enum_ = Enum.TWO;
                    float32 = 2.2222222;
                    int_ = 999999L;
                    int32 = 1;
                    int32Enum = SimpleObjectInt32Enum.FIFTY_FIVE;
                    intEnum = SimpleObjectIntEnum.First;
                    intOptNull = 999999L;
                    num = 1.1;
                    numOptNull = 1.1;
                    str = "example";
                    strOpt = "optional example";
                }};
                str = "molestiae";
                type = "magnam";
            }}, new SimpleObject("quas", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.First, 1.1, "example") {{
                any = "deserunt";
                bigint = 475289L;
                bigintStr = "accusantium";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                enum_ = Enum.TWO;
                float32 = 2.2222222;
                int_ = 999999L;
                int32 = 1;
                int32Enum = SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE;
                intEnum = SimpleObjectIntEnum.Second;
                intOptNull = 999999L;
                num = 1.1;
                numOptNull = 1.1;
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

            MixedQueryParamsResponse res = sdk.parameters.mixedQueryParams(new SimpleObject("atque", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.First, 1.1, "example") {{
                any = "deleniti";
                bigint = 143829L;
                bigintStr = "fuga";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                enum_ = Enum.TWO;
                float32 = 2.2222222;
                int_ = 999999L;
                int32 = 1;
                int32Enum = SimpleObjectInt32Enum.SIXTY_NINE;
                intEnum = SimpleObjectIntEnum.First;
                intOptNull = 999999L;
                num = 1.1;
                numOptNull = 1.1;
                str = "example";
                strOpt = "optional example";
            }}, new SimpleObject("explicabo", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1, "example") {{
                any = "nisi";
                bigint = 147014L;
                bigintStr = "sapiente";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                enum_ = Enum.TWO;
                float32 = 2.2222222;
                int_ = 999999L;
                int32 = 1;
                int32Enum = SimpleObjectInt32Enum.FIFTY_FIVE;
                intEnum = SimpleObjectIntEnum.First;
                intOptNull = 999999L;
                num = 1.1;
                numOptNull = 1.1;
                str = "example";
                strOpt = "optional example";
            }}, new SimpleObject("veritatis", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Third, 1.1, "example") {{
                any = "atque";
                bigint = 92260L;
                bigintStr = "esse";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                enum_ = Enum.TWO;
                float32 = 2.2222222;
                int_ = 999999L;
                int32 = 1;
                int32Enum = SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE;
                intEnum = SimpleObjectIntEnum.Third;
                intOptNull = 999999L;
                num = 1.1;
                numOptNull = 1.1;
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

            PathParameterJsonResponse res = sdk.parameters.pathParameterJson(new SimpleObject("vel", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1, "example") {{
                any = "nam";
                bigint = 877131L;
                bigintStr = "aliquid";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                enum_ = Enum.TWO;
                float32 = 2.2222222;
                int_ = 999999L;
                int32 = 1;
                int32Enum = SimpleObjectInt32Enum.FIFTY_FIVE;
                intEnum = SimpleObjectIntEnum.Third;
                intOptNull = 999999L;
                num = 1.1;
                numOptNull = 1.1;
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
                add("occaecati"),
                add("minima"),
                add("distinctio"),
            }}, new Long[]{{
                add(27069L),
                add(636061L),
                add(731398L),
                add(240020L),
            }}, new java.util.HashMap<String, String>() {{
                put("consequuntur", "consequatur");
                put("minus", "quaerat");
                put("sapiente", "consectetur");
                put("esse", "blanditiis");
            }}, new SimpleObject("quasi", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1, "example") {{
                any = "provident";
                bigint = 953722L;
                bigintStr = "nulla";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                enum_ = Enum.TWO;
                float32 = 2.2222222;
                int_ = 999999L;
                int32 = 1;
                int32Enum = SimpleObjectInt32Enum.SIXTY_NINE;
                intEnum = SimpleObjectIntEnum.Second;
                intOptNull = 999999L;
                num = 1.1;
                numOptNull = 1.1;
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
                add("pariatur"),
                add("possimus"),
                add("quia"),
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
                put("asperiores", "facere");
                put("veritatis", "consequuntur");
                put("quasi", "similique");
                put("culpa", "aliquid");
            }}, new java.util.HashMap<String, Long>() {{
                put("quae", 936747L);
                put("vel", 447378L);
                put("eius", 727697L);
                put("illum", 742238L);
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

            SimplePathParameterObjectsResponse res = sdk.parameters.simplePathParameterObjects(new SimpleObject("reprehenderit", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32Enum.SIXTY_NINE, SimpleObjectIntEnum.Second, 1.1, "example") {{
                any = "accusantium";
                bigint = 306986L;
                bigintStr = "sapiente";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                enum_ = Enum.TWO;
                float32 = 2.2222222;
                int_ = 999999L;
                int32 = 1;
                int32Enum = SimpleObjectInt32Enum.FIFTY_FIVE;
                intEnum = SimpleObjectIntEnum.Second;
                intOptNull = 999999L;
                num = 1.1;
                numOptNull = 1.1;
                str = "example";
                strOpt = "optional example";
            }}, new SimpleObject("deleniti", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Third, 1.1, "example") {{
                any = "aut";
                bigint = 531849L;
                bigintStr = "qui";
                bool = true;
                boolOpt = true;
                date = LocalDate.parse("2020-01-01");
                dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                enum_ = Enum.TWO;
                float32 = 2.2222222;
                int_ = 999999L;
                int32 = 1;
                int32Enum = SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE;
                intEnum = SimpleObjectIntEnum.Second;
                intOptNull = 999999L;
                num = 1.1;
                numOptNull = 1.1;
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

            SimplePathParameterPrimitivesResponse res = sdk.parameters.simplePathParameterPrimitives(false, 99615L, 6091.78, "tenetur");

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
