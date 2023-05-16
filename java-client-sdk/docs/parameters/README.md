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

            DeepObjectQueryParamsMapRequest req = new DeepObjectQueryParamsMapRequest(                new java.util.HashMap<String, String>() {{
                                put("accusamus", "ad");
                                put("saepe", "suscipit");
                                put("deserunt", "provident");
                                put("minima", "repellendus");
                            }}) {{
                mapArrParam = new java.util.HashMap<String, String[]>() {{
                    put("similique", new String[]{{
                        add("at"),
                    }});
                    put("quaerat", new String[]{{
                        add("vel"),
                        add("quod"),
                    }});
                    put("officiis", new String[]{{
                        add("dolorum"),
                    }});
                }};
            }};            

            DeepObjectQueryParamsMapResponse res = sdk.parameters.deepObjectQueryParamsMap(req);

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

            DeepObjectQueryParamsObjectRequest req = new DeepObjectQueryParamsObjectRequest(                new SimpleObject("a", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.SIXTY_NINE, SimpleObjectIntEnumEnum.Third, 1.1, "example") {{
                                bigint = 483409L;
                                bigintStr = "ipsum";
                                boolOpt = true;
                                intOptNull = 999999L;
                                numOptNull = 1.1;
                                strOpt = "optional example";
                            }};) {{
                objArrParam = new DeepObjectQueryParamsObjectObjArrParam() {{
                    arr = new String[]{{
                        add("tenetur"),
                        add("amet"),
                        add("tempore"),
                        add("accusamus"),
                    }};
                }};;
            }};            

            DeepObjectQueryParamsObjectResponse res = sdk.parameters.deepObjectQueryParamsObject(req);

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

            FormQueryParamsArrayRequest req = new FormQueryParamsArrayRequest() {{
                arrParam = new String[]{{
                    add("enim"),
                    add("dolorem"),
                }};
                arrParamExploded = new Long[]{{
                    add(518201L),
                    add(471752L),
                    add(25662L),
                    add(711584L),
                }};
            }};            

            FormQueryParamsArrayResponse res = sdk.parameters.formQueryParamsArray(req);

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

            FormQueryParamsMapRequest req = new FormQueryParamsMapRequest() {{
                mapParam = new java.util.HashMap<String, String>() {{
                    put("sed", "vel");
                }};
                mapParamExploded = new java.util.HashMap<String, Long>() {{
                    put("voluptas", 646265L);
                    put("quam", 214880L);
                    put("incidunt", 186458L);
                }};
            }};            

            FormQueryParamsMapResponse res = sdk.parameters.formQueryParamsMap(req);

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

            FormQueryParamsObjectRequest req = new FormQueryParamsObjectRequest(                new SimpleObject("cupiditate", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnumEnum.Third, 1.1, "example") {{
                                bigint = 747080L;
                                bigintStr = "dicta";
                                boolOpt = true;
                                intOptNull = 999999L;
                                numOptNull = 1.1;
                                strOpt = "optional example";
                            }};) {{
                objParam = new SimpleObject("laborum", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.SIXTY_NINE, SimpleObjectIntEnumEnum.First, 1.1, "example") {{
                    bigint = 132068L;
                    bigintStr = "dolores";
                    boolOpt = true;
                    intOptNull = 999999L;
                    numOptNull = 1.1;
                    strOpt = "optional example";
                }};;
            }};            

            FormQueryParamsObjectResponse res = sdk.parameters.formQueryParamsObject(req);

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

            FormQueryParamsPrimitiveRequest req = new FormQueryParamsPrimitiveRequest(false, 716860L, 7044.74, "aliquid");            

            FormQueryParamsPrimitiveResponse res = sdk.parameters.formQueryParamsPrimitive(req);

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

            FormQueryParamsRefParamObjectRequest req = new FormQueryParamsRefParamObjectRequest() {{
                refObjParam = new RefQueryParamObj(false, 463150L, 5654.21, "temporibus");;
                refObjParamExploded = new RefQueryParamObjExploded(false, 183280L, 2048.65, "fugit");;
            }};            

            FormQueryParamsRefParamObjectResponse res = sdk.parameters.formQueryParamsRefParamObject(req);

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

            HeaderParamsArrayRequest req = new HeaderParamsArrayRequest(                new String[]{{
                                add("odio"),
                            }});            

            HeaderParamsArrayResponse res = sdk.parameters.headerParamsArray(req);

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

            HeaderParamsMapRequest req = new HeaderParamsMapRequest(                new java.util.HashMap<String, String>() {{
                                put("ullam", "nam");
                            }},                 new java.util.HashMap<String, String>() {{
                                put("voluptatem", "cumque");
                                put("soluta", "nobis");
                                put("et", "saepe");
                                put("ipsum", "veritatis");
                            }});            

            HeaderParamsMapResponse res = sdk.parameters.headerParamsMap(req);

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

            HeaderParamsObjectRequest req = new HeaderParamsObjectRequest(                new SimpleObject("nobis", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.SIXTY_NINE, SimpleObjectIntEnumEnum.Third, 1.1, "example") {{
                                bigint = 584476L;
                                bigintStr = "aperiam";
                                boolOpt = true;
                                intOptNull = 999999L;
                                numOptNull = 1.1;
                                strOpt = "optional example";
                            }};,                 new SimpleObject("delectus", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.FIFTY_FIVE, SimpleObjectIntEnumEnum.First, 1.1, "example") {{
                                bigint = 286915L;
                                bigintStr = "adipisci";
                                boolOpt = true;
                                intOptNull = 999999L;
                                numOptNull = 1.1;
                                strOpt = "optional example";
                            }};);            

            HeaderParamsObjectResponse res = sdk.parameters.headerParamsObject(req);

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

            HeaderParamsPrimitiveRequest req = new HeaderParamsPrimitiveRequest(false, 677263L, 1002.94, "quae");            

            HeaderParamsPrimitiveResponse res = sdk.parameters.headerParamsPrimitive(req);

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

            JsonQueryParamsObjectRequest req = new JsonQueryParamsObjectRequest(                new DeepObject(                new SimpleObject("porro", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnumEnum.First, 1.1, "example") {{
                                                any = "quas";
                                                bigint = 929530L;
                                                bigintStr = "consequatur";
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
                                            }},                 new org.openapis.openapi.models.shared.SimpleObject[]{{
                                                add(new SimpleObject("occaecati", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnumEnum.Third, 1.1, "example") {{
                                                    any = "cupiditate";
                                                    bigint = 181631L;
                                                    bigintStr = "quae";
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
                                                add(new SimpleObject("voluptate", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.FIFTY_FIVE, SimpleObjectIntEnumEnum.Third, 1.1, "example") {{
                                                    any = "vero";
                                                    bigint = 606476L;
                                                    bigintStr = "quis";
                                                    bool = true;
                                                    boolOpt = true;
                                                    date = LocalDate.parse("2020-01-01");
                                                    dateTime = OffsetDateTime.parse("2020-01-01T00:00:00Z");
                                                    enum_ = EnumEnum.TWO;
                                                    float32 = 2.2222222;
                                                    int_ = 999999L;
                                                    int32 = 1;
                                                    int32Enum = SimpleObjectInt32EnumEnum.FIFTY_FIVE;
                                                    intEnum = SimpleObjectIntEnumEnum.Third;
                                                    intOptNull = 999999L;
                                                    num = 1.1;
                                                    numOptNull = 1.1;
                                                    str = "example";
                                                    strOpt = "optional example";
                                                }}),
                                                add(new SimpleObject("odio", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.SIXTY_NINE, SimpleObjectIntEnumEnum.Third, 1.1, "example") {{
                                                    any = "tenetur";
                                                    bigint = 492268L;
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
                                                    intEnum = SimpleObjectIntEnumEnum.Third;
                                                    intOptNull = 999999L;
                                                    num = 1.1;
                                                    numOptNull = 1.1;
                                                    str = "example";
                                                    strOpt = "optional example";
                                                }}),
                                            }}, false, 874288L,                 new java.util.HashMap<String, org.openapis.openapi.models.shared.SimpleObject>() {{
                                                put("dolore", new SimpleObject("aut", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnumEnum.Second, 1.1, "example") {{
                                                    any = "quibusdam";
                                                    bigint = 848944L;
                                                    bigintStr = "sequi";
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
                                                put("nulla", new SimpleObject("eligendi", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.SIXTY_NINE, SimpleObjectIntEnumEnum.First, 1.1, "example") {{
                                                    any = "fugit";
                                                    bigint = 780427L;
                                                    bigintStr = "maiores";
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
                                                }});
                                            }}, 6394.73,                 new SimpleObject("tempora", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.SIXTY_NINE, SimpleObjectIntEnumEnum.Second, 1.1, "example") {{
                                                bigint = 136900L;
                                                bigintStr = "vel";
                                                boolOpt = true;
                                                intOptNull = 999999L;
                                                numOptNull = 1.1;
                                                strOpt = "optional example";
                                            }};, "possimus") {{
                                type = "magnam";
                            }};,                 new SimpleObject("ratione", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.SIXTY_NINE, SimpleObjectIntEnumEnum.Second, 1.1, "example") {{
                                bigint = 120657L;
                                bigintStr = "dolor";
                                boolOpt = true;
                                intOptNull = 999999L;
                                numOptNull = 1.1;
                                strOpt = "optional example";
                            }};);            

            JsonQueryParamsObjectResponse res = sdk.parameters.jsonQueryParamsObject(req);

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

            MixedQueryParamsRequest req = new MixedQueryParamsRequest(                new SimpleObject("maiores", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.FIFTY_FIVE, SimpleObjectIntEnumEnum.Second, 1.1, "example") {{
                                bigint = 862192L;
                                bigintStr = "excepturi";
                                boolOpt = true;
                                intOptNull = 999999L;
                                numOptNull = 1.1;
                                strOpt = "optional example";
                            }};,                 new SimpleObject("voluptatibus", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.SIXTY_NINE, SimpleObjectIntEnumEnum.Third, 1.1, "example") {{
                                bigint = 788873L;
                                bigintStr = "saepe";
                                boolOpt = true;
                                intOptNull = 999999L;
                                numOptNull = 1.1;
                                strOpt = "optional example";
                            }};,                 new SimpleObject("ea", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnumEnum.Second, 1.1, "example") {{
                                bigint = 333145L;
                                bigintStr = "aliquid";
                                boolOpt = true;
                                intOptNull = 999999L;
                                numOptNull = 1.1;
                                strOpt = "optional example";
                            }};);            

            MixedQueryParamsResponse res = sdk.parameters.mixedQueryParams(req);

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

            PathParameterJsonRequest req = new PathParameterJsonRequest(                new SimpleObject("inventore", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.FIFTY_FIVE, SimpleObjectIntEnumEnum.Second, 1.1, "example") {{
                                bigint = 775220L;
                                bigintStr = "consectetur";
                                boolOpt = true;
                                intOptNull = 999999L;
                                numOptNull = 1.1;
                                strOpt = "optional example";
                            }};);            

            PathParameterJsonResponse res = sdk.parameters.pathParameterJson(req);

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

            PipeDelimitedQueryParamsArrayRequest req = new PipeDelimitedQueryParamsArrayRequest() {{
                arrParam = new String[]{{
                    add("aspernatur"),
                    add("minima"),
                    add("eaque"),
                    add("a"),
                }};
                arrParamExploded = new Long[]{{
                    add(13948L),
                    add(11427L),
                    add(533466L),
                }};
                mapParam = new java.util.HashMap<String, String>() {{
                    put("aliquam", "fugit");
                    put("accusamus", "inventore");
                    put("non", "et");
                    put("dolorum", "laborum");
                }};
                objParam = new SimpleObject("placeat", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.FIFTY_FIVE, SimpleObjectIntEnumEnum.Second, 1.1, "example") {{
                    bigint = 420539L;
                    bigintStr = "nobis";
                    boolOpt = true;
                    intOptNull = 999999L;
                    numOptNull = 1.1;
                    strOpt = "optional example";
                }};;
            }};            

            PipeDelimitedQueryParamsArrayResponse res = sdk.parameters.pipeDelimitedQueryParamsArray(req);

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

            SimplePathParameterArraysRequest req = new SimplePathParameterArraysRequest(                new String[]{{
                                add("assumenda"),
                                add("nulla"),
                                add("voluptas"),
                            }});            

            SimplePathParameterArraysResponse res = sdk.parameters.simplePathParameterArrays(req);

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

            SimplePathParameterMapsRequest req = new SimplePathParameterMapsRequest(                new java.util.HashMap<String, String>() {{
                                put("quasi", "tempora");
                                put("numquam", "explicabo");
                                put("provident", "ipsa");
                            }},                 new java.util.HashMap<String, Long>() {{
                                put("magnam", 487935L);
                                put("eius", 458515L);
                            }});            

            SimplePathParameterMapsResponse res = sdk.parameters.simplePathParameterMaps(req);

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

            SimplePathParameterObjectsRequest req = new SimplePathParameterObjectsRequest(                new SimpleObject("esse", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.SIXTY_NINE, SimpleObjectIntEnumEnum.Third, 1.1, "example") {{
                                bigint = 442015L;
                                bigintStr = "quidem";
                                boolOpt = true;
                                intOptNull = 999999L;
                                numOptNull = 1.1;
                                strOpt = "optional example";
                            }};,                 new SimpleObject("fugiat", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.FIFTY_FIVE, SimpleObjectIntEnumEnum.Second, 1.1, "example") {{
                                bigint = 379927L;
                                bigintStr = "assumenda";
                                boolOpt = true;
                                intOptNull = 999999L;
                                numOptNull = 1.1;
                                strOpt = "optional example";
                            }};);            

            SimplePathParameterObjectsResponse res = sdk.parameters.simplePathParameterObjects(req);

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

            SimplePathParameterPrimitivesRequest req = new SimplePathParameterPrimitivesRequest(false, 181151L, 5093.42, "quisquam");            

            SimplePathParameterPrimitivesResponse res = sdk.parameters.simplePathParameterPrimitives(req);

            if (res.res != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
