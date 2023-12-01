<!-- Start SDK Example Usage [usage] -->
```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.generation.globalNameOverridden({
        any: "any",
        bigint: 8821239038968084,
        bigintStr: "9223372036854775808",
        bool: true,
        boolOpt: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.000001Z"),
        decimal: 3.141592653589793,
        decimalStr: "3.14159265358979344719667586",
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        strOpt: "testOptional",
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.errors.connectionErrorGet();

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { StatusGetErrorRequest } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const statusCode: number = 458364;

    const res = await sdk.errors.statusGetError(statusCode);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { StatusGetXSpeakeasyErrorsRequest } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const statusCode: number = 385913;

    const res = await sdk.errors.statusGetXSpeakeasyErrors(statusCode);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.unions.flattenedTypedObjectPost("string");

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.unions.mixedTypeOneOfPost("string");

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { TypeT } from "openapi/dist/sdk/models/shared";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.unions.nullableOneOfRefInObjectPost({
        nullableOneOfOne: {
            type: TypeT.Obj1,
            value: "string",
        },
        nullableOneOfTwo: "string",
        oneOfOne: "string",
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.unions.nullableOneOfSchemaPost("string");

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.unions.nullableOneOfTypeInObjectPost({
        nullableOneOfOne: false,
        nullableOneOfTwo: "string",
        oneOfOne: false,
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { TypeT } from "openapi/dist/sdk/models/shared";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.unions.nullableTypedObjectPost({
        type: TypeT.Obj1,
        value: "string",
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.unions.primitiveTypeOneOfPost("string");

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.unions.stronglyTypedOneOfPost("string");

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.unions.typedObjectNullableOneOfPost("string");

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.unions.typedObjectOneOfPost("string");

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.unions.unionBigIntDecimal("string");

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.unions.unionDateNull(new RFCDate("2022-11-25"));

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.unions.unionDateTimeBigInt("string");

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.unions.unionDateTimeNull(new Date("2022-04-12T19:39:53.907Z"));

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.unions.weaklyTypedOneOfPost("string");

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { ComponentBodyAndParamConflictRequest } from "openapi/dist/sdk/models/operations";
import { Enum, Int32Enum, IntEnum, SimpleObject } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const simpleObject: SimpleObject = {
        any: "any",
        bigint: 8821239038968084,
        bigintStr: "9223372036854775808",
        bool: true,
        boolOpt: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.000001Z"),
        decimal: 3.141592653589793,
        decimalStr: "3.14159265358979344719667586",
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        strOpt: "testOptional",
    };
    const str: string = "string";

    const res = await sdk.flattening.componentBodyAndParamConflict(simpleObject, str);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { ComponentBodyAndParamNoConflictRequest } from "openapi/dist/sdk/models/operations";
import { Enum, Int32Enum, IntEnum, SimpleObject } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const paramStr: string = "string";
    const simpleObject: SimpleObject = {
        any: "any",
        bigint: 8821239038968084,
        bigintStr: "9223372036854775808",
        bool: true,
        boolOpt: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.000001Z"),
        decimal: 3.141592653589793,
        decimalStr: "3.14159265358979344719667586",
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        strOpt: "testOptional",
    };

    const res = await sdk.flattening.componentBodyAndParamNoConflict(paramStr, simpleObject);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { ConflictingParamsRequest } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const strPathParameter: string = "string";
    const strQueryParameter: string = "string";

    const res = await sdk.flattening.conflictingParams(strPathParameter, strQueryParameter);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import {
    InlineBodyAndParamConflictRequest,
    InlineBodyAndParamConflictRequestBody,
} from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const requestBody: InlineBodyAndParamConflictRequestBody = {
        str: "string",
    };
    const str: string = "string";

    const res = await sdk.flattening.inlineBodyAndParamConflict(requestBody, str);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import {
    InlineBodyAndParamNoConflictRequest,
    InlineBodyAndParamNoConflictRequestBody,
} from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const requestBody: InlineBodyAndParamNoConflictRequestBody = {
        bodyStr: "string",
    };
    const paramStr: string = "string";

    const res = await sdk.flattening.inlineBodyAndParamNoConflict(requestBody, paramStr);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { GlobalPathParameterGetRequest } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const globalPathParam: number = 719830;

    const res = await sdk.globals.globalPathParameterGet(globalPathParam);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { GlobalsQueryParameterGetRequest } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const globalQueryParam: string = "string";

    const res = await sdk.globals.globalsQueryParameterGet(globalQueryParam);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { DeepObjectQueryParamsMapRequest } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const mapParam: Record<string, string> = {
        test: "value",
        test2: "value2",
    };
    const mapArrParam: Record<string, string[]> = {
        test: ["test", "test2"],
        test2: ["test3", "test4"],
    };

    const res = await sdk.parameters.deepObjectQueryParamsMap(mapParam, mapArrParam);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import {
    DeepObjectQueryParamsObjectRequest,
    ObjArrParam,
} from "openapi/dist/sdk/models/operations";
import { Enum, Int32Enum, IntEnum, SimpleObject } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const objParam: SimpleObject = {
        any: "any",
        bigint: 8821239038968084,
        bigintStr: "9223372036854775808",
        bool: true,
        boolOpt: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.000001Z"),
        decimal: 3.141592653589793,
        decimalStr: "3.14159265358979344719667586",
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        strOpt: "testOptional",
    };
    const objArrParam: ObjArrParam = {
        arr: ["test", "test2"],
    };

    const res = await sdk.parameters.deepObjectQueryParamsObject(objParam, objArrParam);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { DuplicateParamRequest } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const duplicateParamRequest: string = "string";

    const res = await sdk.parameters.duplicateParam(duplicateParamRequest);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { FormQueryParamsArrayRequest } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const arrParam: string[] = ["test", "test2"];
    const arrParamExploded: number[] = [1, 2];

    const res = await sdk.parameters.formQueryParamsArray(arrParam, arrParamExploded);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import {
    FormQueryParamsCamelObjectRequest,
    ObjParam,
    ObjParamExploded,
} from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const objParamExploded: ObjParamExploded = {
        itemCount: "10",
        searchTerm: "foo",
    };
    const objParam: ObjParam = {
        encodedCount: "11",
        encodedTerm: "bar",
    };

    const res = await sdk.parameters.formQueryParamsCamelObject(objParamExploded, objParam);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { FormQueryParamsMapRequest } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const mapParam: Record<string, string> = {
        test: "value",
        test2: "value2",
    };
    const mapParamExploded: Record<string, number> = {
        test: 1,
        test2: 2,
    };

    const res = await sdk.parameters.formQueryParamsMap(mapParam, mapParamExploded);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { FormQueryParamsObjectRequest } from "openapi/dist/sdk/models/operations";
import { Enum, Int32Enum, IntEnum, SimpleObject } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const objParamExploded: SimpleObject = {
        any: "any",
        bigint: 8821239038968084,
        bigintStr: "9223372036854775808",
        bool: true,
        boolOpt: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.000001Z"),
        decimal: 3.141592653589793,
        decimalStr: "3.14159265358979344719667586",
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        strOpt: "testOptional",
    };
    const objParam: SimpleObject = {
        any: "any",
        bigint: 8821239038968084,
        bigintStr: "9223372036854775808",
        bool: true,
        boolOpt: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.000001Z"),
        decimal: 3.141592653589793,
        decimalStr: "3.14159265358979344719667586",
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        strOpt: "testOptional",
    };

    const res = await sdk.parameters.formQueryParamsObject(objParamExploded, objParam);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { FormQueryParamsPrimitiveRequest } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const boolParam: boolean = true;
    const intParam: number = 1;
    const numParam: number = 1.1;
    const strParam: string = "test";

    const res = await sdk.parameters.formQueryParamsPrimitive(
        boolParam,
        intParam,
        numParam,
        strParam
    );

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { FormQueryParamsRefParamObjectRequest } from "openapi/dist/sdk/models/operations";
import { RefQueryParamObj, RefQueryParamObjExploded } from "openapi/dist/sdk/models/shared";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const refObjParam: RefQueryParamObj = {
        bool: true,
        int: 1,
        num: 1.1,
        str: "test",
    };
    const refObjParamExploded: RefQueryParamObjExploded = {
        bool: true,
        int: 1,
        num: 1.1,
        str: "test",
    };

    const res = await sdk.parameters.formQueryParamsRefParamObject(
        refObjParam,
        refObjParamExploded
    );

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { HeaderParamsArrayRequest } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const xHeaderArray: string[] = ["test1", "test2"];

    const res = await sdk.parameters.headerParamsArray(xHeaderArray);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { HeaderParamsMapRequest } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const xHeaderMap: Record<string, string> = {
        key1: "value1",
        key2: "value2",
    };
    const xHeaderMapExplode: Record<string, string> = {
        test1: "val1",
        test2: "val2",
    };

    const res = await sdk.parameters.headerParamsMap(xHeaderMap, xHeaderMapExplode);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { HeaderParamsObjectRequest } from "openapi/dist/sdk/models/operations";
import { Enum, Int32Enum, IntEnum, SimpleObject } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const xHeaderObj: SimpleObject = {
        any: "any",
        bigint: 8821239038968084,
        bigintStr: "9223372036854775808",
        bool: true,
        boolOpt: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.000001Z"),
        decimal: 3.141592653589793,
        decimalStr: "3.14159265358979344719667586",
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        strOpt: "testOptional",
    };
    const xHeaderObjExplode: SimpleObject = {
        any: "any",
        bigint: 8821239038968084,
        bigintStr: "9223372036854775808",
        bool: true,
        boolOpt: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.000001Z"),
        decimal: 3.141592653589793,
        decimalStr: "3.14159265358979344719667586",
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        strOpt: "testOptional",
    };

    const res = await sdk.parameters.headerParamsObject(xHeaderObj, xHeaderObjExplode);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { HeaderParamsPrimitiveRequest } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const xHeaderBoolean: boolean = true;
    const xHeaderInteger: number = 1;
    const xHeaderNumber: number = 1.1;
    const xHeaderString: string = "test";

    const res = await sdk.parameters.headerParamsPrimitive(
        xHeaderBoolean,
        xHeaderInteger,
        xHeaderNumber,
        xHeaderString
    );

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { JsonQueryParamsObjectRequest } from "openapi/dist/sdk/models/operations";
import { DeepObject, Enum, Int32Enum, IntEnum, SimpleObject } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const deepObjParam: DeepObject = {
        any: "anyOf[0]",
        arr: [
            {
                any: "any",
                bigint: 8821239038968084,
                bigintStr: "9223372036854775808",
                bool: true,
                boolOpt: true,
                date: new RFCDate("2020-01-01"),
                dateTime: new Date("2020-01-01T00:00:00.000001Z"),
                decimal: 3.141592653589793,
                decimalStr: "3.14159265358979344719667586",
                enum: Enum.One,
                float32: 1.1,
                int: 1,
                int32: 1,
                int32Enum: Int32Enum.FiftyFive,
                intEnum: IntEnum.Second,
                num: 1.1,
                str: "test",
                strOpt: "testOptional",
            },
            {
                any: "any",
                bigint: 8821239038968084,
                bigintStr: "9223372036854775808",
                bool: true,
                boolOpt: true,
                date: new RFCDate("2020-01-01"),
                dateTime: new Date("2020-01-01T00:00:00.000001Z"),
                decimal: 3.141592653589793,
                decimalStr: "3.14159265358979344719667586",
                enum: Enum.One,
                float32: 1.1,
                int: 1,
                int32: 1,
                int32Enum: Int32Enum.FiftyFive,
                intEnum: IntEnum.Second,
                num: 1.1,
                str: "test",
                strOpt: "testOptional",
            },
        ],
        bool: true,
        int: 1,
        map: {
            key: {
                any: "any",
                bigint: 8821239038968084,
                bigintStr: "9223372036854775808",
                bool: true,
                boolOpt: true,
                date: new RFCDate("2020-01-01"),
                dateTime: new Date("2020-01-01T00:00:00.000001Z"),
                decimal: 3.141592653589793,
                decimalStr: "3.14159265358979344719667586",
                enum: Enum.One,
                float32: 1.1,
                int: 1,
                int32: 1,
                int32Enum: Int32Enum.FiftyFive,
                intEnum: IntEnum.Second,
                num: 1.1,
                str: "test",
                strOpt: "testOptional",
            },
            key2: {
                any: "any",
                bigint: 8821239038968084,
                bigintStr: "9223372036854775808",
                bool: true,
                boolOpt: true,
                date: new RFCDate("2020-01-01"),
                dateTime: new Date("2020-01-01T00:00:00.000001Z"),
                decimal: 3.141592653589793,
                decimalStr: "3.14159265358979344719667586",
                enum: Enum.One,
                float32: 1.1,
                int: 1,
                int32: 1,
                int32Enum: Int32Enum.FiftyFive,
                intEnum: IntEnum.Second,
                num: 1.1,
                str: "test",
                strOpt: "testOptional",
            },
        },
        num: 1.1,
        obj: {
            any: "any",
            bigint: 8821239038968084,
            bigintStr: "9223372036854775808",
            bool: true,
            boolOpt: true,
            date: new RFCDate("2020-01-01"),
            dateTime: new Date("2020-01-01T00:00:00.000001Z"),
            decimal: 3.141592653589793,
            decimalStr: "3.14159265358979344719667586",
            enum: Enum.One,
            float32: 1.1,
            int: 1,
            int32: 1,
            int32Enum: Int32Enum.FiftyFive,
            intEnum: IntEnum.Second,
            num: 1.1,
            str: "test",
            strOpt: "testOptional",
        },
        str: "test",
    };
    const simpleObjParam: SimpleObject = {
        any: "any",
        bigint: 8821239038968084,
        bigintStr: "9223372036854775808",
        bool: true,
        boolOpt: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.000001Z"),
        decimal: 3.141592653589793,
        decimalStr: "3.14159265358979344719667586",
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        strOpt: "testOptional",
    };

    const res = await sdk.parameters.jsonQueryParamsObject(deepObjParam, simpleObjParam);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { MixedParametersCamelCaseRequest } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const headerParam: string = "headerValue";
    const pathParam: string = "pathValue";
    const queryStringParam: string = "queryValue";

    const res = await sdk.parameters.mixedParametersCamelCase(
        headerParam,
        pathParam,
        queryStringParam
    );

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { MixedParametersPrimitivesRequest } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const headerParam: string = "headerValue";
    const pathParam: string = "pathValue";
    const queryStringParam: string = "queryValue";

    const res = await sdk.parameters.mixedParametersPrimitives(
        headerParam,
        pathParam,
        queryStringParam
    );

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { MixedQueryParamsRequest } from "openapi/dist/sdk/models/operations";
import { Enum, Int32Enum, IntEnum, SimpleObject } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const deepObjectParam: SimpleObject = {
        any: "any",
        bigint: 8821239038968084,
        bigintStr: "9223372036854775808",
        bool: true,
        boolOpt: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.000001Z"),
        decimal: 3.141592653589793,
        decimalStr: "3.14159265358979344719667586",
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        strOpt: "testOptional",
    };
    const formParam: SimpleObject = {
        any: "any",
        bigint: 8821239038968084,
        bigintStr: "9223372036854775808",
        bool: true,
        boolOpt: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.000001Z"),
        decimal: 3.141592653589793,
        decimalStr: "3.14159265358979344719667586",
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        strOpt: "testOptional",
    };
    const jsonParam: SimpleObject = {
        any: "any",
        bigint: 8821239038968084,
        bigintStr: "9223372036854775808",
        bool: true,
        boolOpt: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.000001Z"),
        decimal: 3.141592653589793,
        decimalStr: "3.14159265358979344719667586",
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        strOpt: "testOptional",
    };

    const res = await sdk.parameters.mixedQueryParams(deepObjectParam, formParam, jsonParam);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { PathParameterJsonRequest } from "openapi/dist/sdk/models/operations";
import { Enum, Int32Enum, IntEnum, SimpleObject } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const jsonObj: SimpleObject = {
        any: "any",
        bigint: 8821239038968084,
        bigintStr: "9223372036854775808",
        bool: true,
        boolOpt: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.000001Z"),
        decimal: 3.141592653589793,
        decimalStr: "3.14159265358979344719667586",
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        strOpt: "testOptional",
    };

    const res = await sdk.parameters.pathParameterJson(jsonObj);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { PipeDelimitedQueryParamsArrayRequest } from "openapi/dist/sdk/models/operations";
import { Enum, Int32Enum, IntEnum, SimpleObject } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const arrParam: string[] = ["test", "test2"];
    const arrParamExploded: number[] = [1, 2];
    const mapParam: Record<string, string> = {
        key1: "val1",
        key2: "val2",
    };
    const objParam: SimpleObject = {
        any: "any",
        bigint: 8821239038968084,
        bigintStr: "9223372036854775808",
        bool: true,
        boolOpt: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.000001Z"),
        decimal: 3.141592653589793,
        decimalStr: "3.14159265358979344719667586",
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        strOpt: "testOptional",
    };

    const res = await sdk.parameters.pipeDelimitedQueryParamsArray(
        arrParam,
        arrParamExploded,
        mapParam,
        objParam
    );

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { SimplePathParameterArraysRequest } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const arrParam: string[] = ["test", "test2"];

    const res = await sdk.parameters.simplePathParameterArrays(arrParam);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { SimplePathParameterMapsRequest } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const mapParam: Record<string, string> = {
        test: "value",
        test2: "value2",
    };
    const mapParamExploded: Record<string, number> = {
        test: 1,
        test2: 2,
    };

    const res = await sdk.parameters.simplePathParameterMaps(mapParam, mapParamExploded);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { SimplePathParameterObjectsRequest } from "openapi/dist/sdk/models/operations";
import { Enum, Int32Enum, IntEnum, SimpleObject } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const objParam: SimpleObject = {
        any: "any",
        bigint: 8821239038968084,
        bigintStr: "9223372036854775808",
        bool: true,
        boolOpt: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.000001Z"),
        decimal: 3.141592653589793,
        decimalStr: "3.14159265358979344719667586",
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        strOpt: "testOptional",
    };
    const objParamExploded: SimpleObject = {
        any: "any",
        bigint: 8821239038968084,
        bigintStr: "9223372036854775808",
        bool: true,
        boolOpt: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.000001Z"),
        decimal: 3.141592653589793,
        decimalStr: "3.14159265358979344719667586",
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        strOpt: "testOptional",
    };

    const res = await sdk.parameters.simplePathParameterObjects(objParam, objParamExploded);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { SimplePathParameterPrimitivesRequest } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const boolParam: boolean = true;
    const intParam: number = 1;
    const numParam: number = 1.1;
    const strParam: string = "test";

    const res = await sdk.parameters.simplePathParameterPrimitives(
        boolParam,
        intParam,
        numParam,
        strParam
    );

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.nest.first.get();

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.nested.get();

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.nested.first.get();

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.nested.second.get();

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.nullableObjectPost({
        required: 302382,
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.nullableRequiredEmptyObjectPost({
        nullableOptionalObj: {},
        nullableRequiredObj: {},
        requiredObj: {},
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { NullableRequiredEnum } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.nullableRequiredPropertyPost({
        nullableRequiredArray: [2355.17],
        nullableRequiredEnum: NullableRequiredEnum.Second,
        nullableRequiredInt: 50266,
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.nullableRequiredSharedObjectPost({
        nullableOptionalObj: {
            required: 86533,
        },
        nullableRequiredObj: {
            required: 964394,
        },
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostApplicationJsonArray([
        {
            any: "any",
            bigint: 8821239038968084,
            bigintStr: "9223372036854775808",
            bool: true,
            boolOpt: true,
            date: new RFCDate("2020-01-01"),
            dateTime: new Date("2020-01-01T00:00:00.000001Z"),
            decimal: 3.141592653589793,
            decimalStr: "3.14159265358979344719667586",
            enum: Enum.One,
            float32: 1.1,
            int: 1,
            int32: 1,
            int32Enum: Int32Enum.FiftyFive,
            intEnum: IntEnum.Second,
            num: 1.1,
            str: "test",
            strOpt: "testOptional",
        },
    ]);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { Enum, Int32EnumVal, IntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostApplicationJsonArrayCamelCase([
        {
            anyVal: "any example",
            boolOptVal: true,
            boolVal: true,
            dateTimeVal: new Date("2020-01-01T00:00:00Z"),
            dateVal: new RFCDate("2020-01-01"),
            enumVal: Enum.One,
            float32Val: 2.2222222,
            int32EnumVal: Int32EnumVal.SixtyNine,
            int32Val: 1,
            intEnumVal: IntEnumVal.Third,
            intOptNullVal: 999999,
            intVal: 999999,
            numOptNullVal: 1.1,
            numVal: 1.1,
            strOptVal: "optional example",
            strVal: "example",
        },
    ]);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostApplicationJsonArrayObj([
        {
            any: "any",
            bigint: 8821239038968084,
            bigintStr: "9223372036854775808",
            bool: true,
            boolOpt: true,
            date: new RFCDate("2020-01-01"),
            dateTime: new Date("2020-01-01T00:00:00.000001Z"),
            decimal: 3.141592653589793,
            decimalStr: "3.14159265358979344719667586",
            enum: Enum.One,
            float32: 1.1,
            int: 1,
            int32: 1,
            int32Enum: Int32Enum.FiftyFive,
            intEnum: IntEnum.Second,
            num: 1.1,
            str: "test",
            strOpt: "testOptional",
        },
    ]);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { Enum, Int32EnumVal, IntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostApplicationJsonArrayObjCamelCase([
        {
            anyVal: "any example",
            boolOptVal: true,
            boolVal: true,
            dateTimeVal: new Date("2020-01-01T00:00:00Z"),
            dateVal: new RFCDate("2020-01-01"),
            enumVal: Enum.One,
            float32Val: 2.2222222,
            int32EnumVal: Int32EnumVal.SixtyNine,
            int32Val: 1,
            intEnumVal: IntEnumVal.Third,
            intOptNullVal: 999999,
            intVal: 999999,
            numOptNullVal: 1.1,
            numVal: 1.1,
            strOptVal: "optional example",
            strVal: "example",
        },
    ]);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostApplicationJsonArrayOfArray([
        [
            {
                any: "any",
                bigint: 8821239038968084,
                bigintStr: "9223372036854775808",
                bool: true,
                boolOpt: true,
                date: new RFCDate("2020-01-01"),
                dateTime: new Date("2020-01-01T00:00:00.000001Z"),
                decimal: 3.141592653589793,
                decimalStr: "3.14159265358979344719667586",
                enum: Enum.One,
                float32: 1.1,
                int: 1,
                int32: 1,
                int32Enum: Int32Enum.FiftyFive,
                intEnum: IntEnum.Second,
                num: 1.1,
                str: "test",
                strOpt: "testOptional",
            },
        ],
    ]);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { Enum, Int32EnumVal, IntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostApplicationJsonArrayOfArrayCamelCase([
        [
            {
                anyVal: "any example",
                boolOptVal: true,
                boolVal: true,
                dateTimeVal: new Date("2020-01-01T00:00:00Z"),
                dateVal: new RFCDate("2020-01-01"),
                enumVal: Enum.One,
                float32Val: 2.2222222,
                int32EnumVal: Int32EnumVal.SixtyNine,
                int32Val: 1,
                intEnumVal: IntEnumVal.Third,
                intOptNullVal: 999999,
                intVal: 999999,
                numOptNullVal: 1.1,
                numVal: 1.1,
                strOptVal: "optional example",
                strVal: "example",
            },
        ],
    ]);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostApplicationJsonArrayOfArrayOfPrimitive([
        ["string"],
    ]);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostApplicationJsonArrayOfMap([
        {
            key: {
                any: "any",
                bigint: 8821239038968084,
                bigintStr: "9223372036854775808",
                bool: true,
                boolOpt: true,
                date: new RFCDate("2020-01-01"),
                dateTime: new Date("2020-01-01T00:00:00.000001Z"),
                decimal: 3.141592653589793,
                decimalStr: "3.14159265358979344719667586",
                enum: Enum.One,
                float32: 1.1,
                int: 1,
                int32: 1,
                int32Enum: Int32Enum.FiftyFive,
                intEnum: IntEnum.Second,
                num: 1.1,
                str: "test",
                strOpt: "testOptional",
            },
        },
    ]);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { Enum, Int32EnumVal, IntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostApplicationJsonArrayOfMapCamelCase([
        {
            key: {
                anyVal: "any example",
                boolOptVal: true,
                boolVal: true,
                dateTimeVal: new Date("2020-01-01T00:00:00Z"),
                dateVal: new RFCDate("2020-01-01"),
                enumVal: Enum.One,
                float32Val: 2.2222222,
                int32EnumVal: Int32EnumVal.SixtyNine,
                int32Val: 1,
                intEnumVal: IntEnumVal.Third,
                intOptNullVal: 999999,
                intVal: 999999,
                numOptNullVal: 1.1,
                numVal: 1.1,
                strOptVal: "optional example",
                strVal: "example",
            },
        },
    ]);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostApplicationJsonArrayOfPrimitive(["string"]);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostApplicationJsonDeep({
        any: "anyOf[0]",
        arr: [
            {
                any: "any",
                bigint: 8821239038968084,
                bigintStr: "9223372036854775808",
                bool: true,
                boolOpt: true,
                date: new RFCDate("2020-01-01"),
                dateTime: new Date("2020-01-01T00:00:00.000001Z"),
                decimal: 3.141592653589793,
                decimalStr: "3.14159265358979344719667586",
                enum: Enum.One,
                float32: 1.1,
                int: 1,
                int32: 1,
                int32Enum: Int32Enum.FiftyFive,
                intEnum: IntEnum.Second,
                num: 1.1,
                str: "test",
                strOpt: "testOptional",
            },
            {
                any: "any",
                bigint: 8821239038968084,
                bigintStr: "9223372036854775808",
                bool: true,
                boolOpt: true,
                date: new RFCDate("2020-01-01"),
                dateTime: new Date("2020-01-01T00:00:00.000001Z"),
                decimal: 3.141592653589793,
                decimalStr: "3.14159265358979344719667586",
                enum: Enum.One,
                float32: 1.1,
                int: 1,
                int32: 1,
                int32Enum: Int32Enum.FiftyFive,
                intEnum: IntEnum.Second,
                num: 1.1,
                str: "test",
                strOpt: "testOptional",
            },
        ],
        bool: true,
        int: 1,
        map: {
            key: {
                any: "any",
                bigint: 8821239038968084,
                bigintStr: "9223372036854775808",
                bool: true,
                boolOpt: true,
                date: new RFCDate("2020-01-01"),
                dateTime: new Date("2020-01-01T00:00:00.000001Z"),
                decimal: 3.141592653589793,
                decimalStr: "3.14159265358979344719667586",
                enum: Enum.One,
                float32: 1.1,
                int: 1,
                int32: 1,
                int32Enum: Int32Enum.FiftyFive,
                intEnum: IntEnum.Second,
                num: 1.1,
                str: "test",
                strOpt: "testOptional",
            },
            key2: {
                any: "any",
                bigint: 8821239038968084,
                bigintStr: "9223372036854775808",
                bool: true,
                boolOpt: true,
                date: new RFCDate("2020-01-01"),
                dateTime: new Date("2020-01-01T00:00:00.000001Z"),
                decimal: 3.141592653589793,
                decimalStr: "3.14159265358979344719667586",
                enum: Enum.One,
                float32: 1.1,
                int: 1,
                int32: 1,
                int32Enum: Int32Enum.FiftyFive,
                intEnum: IntEnum.Second,
                num: 1.1,
                str: "test",
                strOpt: "testOptional",
            },
        },
        num: 1.1,
        obj: {
            any: "any",
            bigint: 8821239038968084,
            bigintStr: "9223372036854775808",
            bool: true,
            boolOpt: true,
            date: new RFCDate("2020-01-01"),
            dateTime: new Date("2020-01-01T00:00:00.000001Z"),
            decimal: 3.141592653589793,
            decimalStr: "3.14159265358979344719667586",
            enum: Enum.One,
            float32: 1.1,
            int: 1,
            int32: 1,
            int32Enum: Int32Enum.FiftyFive,
            intEnum: IntEnum.Second,
            num: 1.1,
            str: "test",
            strOpt: "testOptional",
        },
        str: "test",
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { Enum, Int32EnumVal, IntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostApplicationJsonDeepCamelCase({
        anyVal: "string",
        arrVal: [
            {
                anyVal: "any example",
                boolOptVal: true,
                boolVal: true,
                dateTimeVal: new Date("2020-01-01T00:00:00Z"),
                dateVal: new RFCDate("2020-01-01"),
                enumVal: Enum.One,
                float32Val: 2.2222222,
                int32EnumVal: Int32EnumVal.SixtyNine,
                int32Val: 1,
                intEnumVal: IntEnumVal.Third,
                intOptNullVal: 999999,
                intVal: 999999,
                numOptNullVal: 1.1,
                numVal: 1.1,
                strOptVal: "optional example",
                strVal: "example",
            },
        ],
        boolVal: false,
        intVal: 66469,
        mapVal: {
            key: {
                anyVal: "any example",
                boolOptVal: true,
                boolVal: true,
                dateTimeVal: new Date("2020-01-01T00:00:00Z"),
                dateVal: new RFCDate("2020-01-01"),
                enumVal: Enum.One,
                float32Val: 2.2222222,
                int32EnumVal: Int32EnumVal.SixtyNine,
                int32Val: 1,
                intEnumVal: IntEnumVal.Third,
                intOptNullVal: 999999,
                intVal: 999999,
                numOptNullVal: 1.1,
                numVal: 1.1,
                strOptVal: "optional example",
                strVal: "example",
            },
        },
        numVal: 9629.09,
        objVal: {
            anyVal: "any example",
            boolOptVal: true,
            boolVal: true,
            dateTimeVal: new Date("2020-01-01T00:00:00Z"),
            dateVal: new RFCDate("2020-01-01"),
            enumVal: Enum.One,
            float32Val: 2.2222222,
            int32EnumVal: Int32EnumVal.SixtyNine,
            int32Val: 1,
            intEnumVal: IntEnumVal.Third,
            intOptNullVal: 999999,
            intVal: 999999,
            numOptNullVal: 1.1,
            numVal: 1.1,
            strOptVal: "optional example",
            strVal: "example",
        },
        strVal: "string",
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostApplicationJsonMap({
        key: {
            any: "any",
            bigint: 8821239038968084,
            bigintStr: "9223372036854775808",
            bool: true,
            boolOpt: true,
            date: new RFCDate("2020-01-01"),
            dateTime: new Date("2020-01-01T00:00:00.000001Z"),
            decimal: 3.141592653589793,
            decimalStr: "3.14159265358979344719667586",
            enum: Enum.One,
            float32: 1.1,
            int: 1,
            int32: 1,
            int32Enum: Int32Enum.FiftyFive,
            intEnum: IntEnum.Second,
            num: 1.1,
            str: "test",
            strOpt: "testOptional",
        },
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { Enum, Int32EnumVal, IntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostApplicationJsonMapCamelCase({
        key: {
            anyVal: "any example",
            boolOptVal: true,
            boolVal: true,
            dateTimeVal: new Date("2020-01-01T00:00:00Z"),
            dateVal: new RFCDate("2020-01-01"),
            enumVal: Enum.One,
            float32Val: 2.2222222,
            int32EnumVal: Int32EnumVal.SixtyNine,
            int32Val: 1,
            intEnumVal: IntEnumVal.Third,
            intOptNullVal: 999999,
            intVal: 999999,
            numOptNullVal: 1.1,
            numVal: 1.1,
            strOptVal: "optional example",
            strVal: "example",
        },
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostApplicationJsonMapObj({
        key: {
            any: "any",
            bigint: 8821239038968084,
            bigintStr: "9223372036854775808",
            bool: true,
            boolOpt: true,
            date: new RFCDate("2020-01-01"),
            dateTime: new Date("2020-01-01T00:00:00.000001Z"),
            decimal: 3.141592653589793,
            decimalStr: "3.14159265358979344719667586",
            enum: Enum.One,
            float32: 1.1,
            int: 1,
            int32: 1,
            int32Enum: Int32Enum.FiftyFive,
            intEnum: IntEnum.Second,
            num: 1.1,
            str: "test",
            strOpt: "testOptional",
        },
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { Enum, Int32EnumVal, IntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostApplicationJsonMapObjCamelCase({
        key: {
            anyVal: "any example",
            boolOptVal: true,
            boolVal: true,
            dateTimeVal: new Date("2020-01-01T00:00:00Z"),
            dateVal: new RFCDate("2020-01-01"),
            enumVal: Enum.One,
            float32Val: 2.2222222,
            int32EnumVal: Int32EnumVal.SixtyNine,
            int32Val: 1,
            intEnumVal: IntEnumVal.Third,
            intOptNullVal: 999999,
            intVal: 999999,
            numOptNullVal: 1.1,
            numVal: 1.1,
            strOptVal: "optional example",
            strVal: "example",
        },
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostApplicationJsonMapOfArray({
        key: [
            {
                any: "any",
                bigint: 8821239038968084,
                bigintStr: "9223372036854775808",
                bool: true,
                boolOpt: true,
                date: new RFCDate("2020-01-01"),
                dateTime: new Date("2020-01-01T00:00:00.000001Z"),
                decimal: 3.141592653589793,
                decimalStr: "3.14159265358979344719667586",
                enum: Enum.One,
                float32: 1.1,
                int: 1,
                int32: 1,
                int32Enum: Int32Enum.FiftyFive,
                intEnum: IntEnum.Second,
                num: 1.1,
                str: "test",
                strOpt: "testOptional",
            },
        ],
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { Enum, Int32EnumVal, IntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostApplicationJsonMapOfArrayCamelCase({
        key: [
            {
                anyVal: "any example",
                boolOptVal: true,
                boolVal: true,
                dateTimeVal: new Date("2020-01-01T00:00:00Z"),
                dateVal: new RFCDate("2020-01-01"),
                enumVal: Enum.One,
                float32Val: 2.2222222,
                int32EnumVal: Int32EnumVal.SixtyNine,
                int32Val: 1,
                intEnumVal: IntEnumVal.Third,
                intOptNullVal: 999999,
                intVal: 999999,
                numOptNullVal: 1.1,
                numVal: 1.1,
                strOptVal: "optional example",
                strVal: "example",
            },
        ],
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostApplicationJsonMapOfMap({
        key: {
            key: {
                any: "any",
                bigint: 8821239038968084,
                bigintStr: "9223372036854775808",
                bool: true,
                boolOpt: true,
                date: new RFCDate("2020-01-01"),
                dateTime: new Date("2020-01-01T00:00:00.000001Z"),
                decimal: 3.141592653589793,
                decimalStr: "3.14159265358979344719667586",
                enum: Enum.One,
                float32: 1.1,
                int: 1,
                int32: 1,
                int32Enum: Int32Enum.FiftyFive,
                intEnum: IntEnum.Second,
                num: 1.1,
                str: "test",
                strOpt: "testOptional",
            },
        },
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { Enum, Int32EnumVal, IntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostApplicationJsonMapOfMapCamelCase({
        key: {
            key: {
                anyVal: "any example",
                boolOptVal: true,
                boolVal: true,
                dateTimeVal: new Date("2020-01-01T00:00:00Z"),
                dateVal: new RFCDate("2020-01-01"),
                enumVal: Enum.One,
                float32Val: 2.2222222,
                int32EnumVal: Int32EnumVal.SixtyNine,
                int32Val: 1,
                intEnumVal: IntEnumVal.Third,
                intOptNullVal: 999999,
                intVal: 999999,
                numOptNullVal: 1.1,
                numVal: 1.1,
                strOptVal: "optional example",
                strVal: "example",
            },
        },
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostApplicationJsonMapOfMapOfPrimitive({
        key: {
            key: "string",
        },
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostApplicationJsonMapOfPrimitive({
        key: "string",
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostApplicationJsonMultipleJsonFiltered({
        any: "any",
        bigint: 8821239038968084,
        bigintStr: "9223372036854775808",
        bool: true,
        boolOpt: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.000001Z"),
        decimal: 3.141592653589793,
        decimalStr: "3.14159265358979344719667586",
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        strOpt: "testOptional",
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostApplicationJsonSimple({
        any: "any",
        bigint: 8821239038968084,
        bigintStr: "9223372036854775808",
        bool: true,
        boolOpt: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.000001Z"),
        decimal: 3.141592653589793,
        decimalStr: "3.14159265358979344719667586",
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        strOpt: "testOptional",
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { Enum, Int32EnumVal, IntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostApplicationJsonSimpleCamelCase({
        anyVal: "any example",
        boolOptVal: true,
        boolVal: true,
        dateTimeVal: new Date("2020-01-01T00:00:00Z"),
        dateVal: new RFCDate("2020-01-01"),
        enumVal: Enum.One,
        float32Val: 2.2222222,
        int32EnumVal: Int32EnumVal.SixtyNine,
        int32Val: 1,
        intEnumVal: IntEnumVal.Third,
        intOptNullVal: 999999,
        intVal: 999999,
        numOptNullVal: 1.1,
        numVal: 1.1,
        strOptVal: "optional example",
        strVal: "example",
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostComplexNumberTypes({
        complexNumberTypes: {
            bigint: 765757,
            bigintStr: "string",
            decimal: 9344.87,
            decimalStr: "string",
        },
        pathBigInt: 250514,
        pathBigIntStr: "string",
        pathDecimal: 6831.11,
        pathDecimalStr: "string",
        queryBigInt: 500580,
        queryBigIntStr: "string",
        queryDecimal: 7419.03,
        queryDecimalStr: "string",
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import {
    ConstEnumInt,
    ConstEnumStr,
    DefaultEnumInt,
    DefaultEnumStr,
} from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostDefaultsAndConsts({
        normalField: "string",
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostEmptyObject({
        empty: {},
        emptyWithEmptyProperties: {},
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostFormDeep({
        any: "anyOf[0]",
        arr: [
            {
                any: "any",
                bigint: 8821239038968084,
                bigintStr: "9223372036854775808",
                bool: true,
                boolOpt: true,
                date: new RFCDate("2020-01-01"),
                dateTime: new Date("2020-01-01T00:00:00.000001Z"),
                decimal: 3.141592653589793,
                decimalStr: "3.14159265358979344719667586",
                enum: Enum.One,
                float32: 1.1,
                int: 1,
                int32: 1,
                int32Enum: Int32Enum.FiftyFive,
                intEnum: IntEnum.Second,
                num: 1.1,
                str: "test",
                strOpt: "testOptional",
            },
            {
                any: "any",
                bigint: 8821239038968084,
                bigintStr: "9223372036854775808",
                bool: true,
                boolOpt: true,
                date: new RFCDate("2020-01-01"),
                dateTime: new Date("2020-01-01T00:00:00.000001Z"),
                decimal: 3.141592653589793,
                decimalStr: "3.14159265358979344719667586",
                enum: Enum.One,
                float32: 1.1,
                int: 1,
                int32: 1,
                int32Enum: Int32Enum.FiftyFive,
                intEnum: IntEnum.Second,
                num: 1.1,
                str: "test",
                strOpt: "testOptional",
            },
        ],
        bool: true,
        int: 1,
        map: {
            key: {
                any: "any",
                bigint: 8821239038968084,
                bigintStr: "9223372036854775808",
                bool: true,
                boolOpt: true,
                date: new RFCDate("2020-01-01"),
                dateTime: new Date("2020-01-01T00:00:00.000001Z"),
                decimal: 3.141592653589793,
                decimalStr: "3.14159265358979344719667586",
                enum: Enum.One,
                float32: 1.1,
                int: 1,
                int32: 1,
                int32Enum: Int32Enum.FiftyFive,
                intEnum: IntEnum.Second,
                num: 1.1,
                str: "test",
                strOpt: "testOptional",
            },
            key2: {
                any: "any",
                bigint: 8821239038968084,
                bigintStr: "9223372036854775808",
                bool: true,
                boolOpt: true,
                date: new RFCDate("2020-01-01"),
                dateTime: new Date("2020-01-01T00:00:00.000001Z"),
                decimal: 3.141592653589793,
                decimalStr: "3.14159265358979344719667586",
                enum: Enum.One,
                float32: 1.1,
                int: 1,
                int32: 1,
                int32Enum: Int32Enum.FiftyFive,
                intEnum: IntEnum.Second,
                num: 1.1,
                str: "test",
                strOpt: "testOptional",
            },
        },
        num: 1.1,
        obj: {
            any: "any",
            bigint: 8821239038968084,
            bigintStr: "9223372036854775808",
            bool: true,
            boolOpt: true,
            date: new RFCDate("2020-01-01"),
            dateTime: new Date("2020-01-01T00:00:00.000001Z"),
            decimal: 3.141592653589793,
            decimalStr: "3.14159265358979344719667586",
            enum: Enum.One,
            float32: 1.1,
            int: 1,
            int32: 1,
            int32Enum: Int32Enum.FiftyFive,
            intEnum: IntEnum.Second,
            num: 1.1,
            str: "test",
            strOpt: "testOptional",
        },
        str: "test",
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostFormMapPrimitive({
        key: "string",
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostFormSimple({
        any: "any",
        bigint: 8821239038968084,
        bigintStr: "9223372036854775808",
        bool: true,
        boolOpt: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.000001Z"),
        decimal: 3.141592653589793,
        decimalStr: "3.14159265358979344719667586",
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        strOpt: "testOptional",
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostJsonDataTypesArrayBigInt([564849]);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostJsonDataTypesArrayDate([
        new RFCDate("2022-03-22"),
    ]);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostJsonDataTypesArrayDecimalStr(["string"]);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostJsonDataTypesBigInt(687617);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostJsonDataTypesBigIntStr("string");

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostJsonDataTypesBoolean(false);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostJsonDataTypesDate(new RFCDate("2022-03-04"));

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostJsonDataTypesDateTime(
        new Date("2023-03-04T01:33:15.031Z")
    );

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostJsonDataTypesDecimal(1107.81);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostJsonDataTypesDecimalStr("string");

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostJsonDataTypesFloat32(4464.34);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostJsonDataTypesInt32(22155);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostJsonDataTypesInteger(273673);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostJsonDataTypesMapBigIntStr({
        key: "string",
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostJsonDataTypesMapDateTime({
        key: new Date("2022-09-03T18:52:14.477Z"),
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostJsonDataTypesMapDecimal({
        key: 3472.82,
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostJsonDataTypesNumber(2193.66);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostJsonDataTypesString("string");

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostMultipleContentTypesComponentFiltered({
        any: "any",
        bigint: 8821239038968084,
        bigintStr: "9223372036854775808",
        bool: true,
        boolOpt: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.000001Z"),
        decimal: 3.141592653589793,
        decimalStr: "3.14159265358979344719667586",
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        strOpt: "testOptional",
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostMultipleContentTypesInlineFiltered({
        bool: false,
        num: 3558.41,
        str: "string",
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import {
    RequestBodyPostMultipleContentTypesSplitParamFormRequest,
    RequestBodyPostMultipleContentTypesSplitParamFormRequestBody,
} from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const requestBody: RequestBodyPostMultipleContentTypesSplitParamFormRequestBody = {
        bool3: false,
        num3: 8693.24,
        str3: "string",
    };
    const paramStr: string = "string";

    const res = await sdk.requestBodies.requestBodyPostMultipleContentTypesSplitParamForm(
        requestBody,
        paramStr
    );

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import {
    RequestBodyPostMultipleContentTypesSplitParamJsonRequest,
    RequestBodyPostMultipleContentTypesSplitParamJsonRequestBody,
} from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const requestBody: RequestBodyPostMultipleContentTypesSplitParamJsonRequestBody = {
        bool: false,
        num: 9771.91,
        str: "string",
    };
    const paramStr: string = "string";

    const res = await sdk.requestBodies.requestBodyPostMultipleContentTypesSplitParamJson(
        requestBody,
        paramStr
    );

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import {
    RequestBodyPostMultipleContentTypesSplitParamMultipartRequest,
    RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody,
} from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const requestBody: RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody = {
        bool2: false,
        num2: 7000.76,
        str2: "string",
    };
    const paramStr: string = "string";

    const res = await sdk.requestBodies.requestBodyPostMultipleContentTypesSplitParamMultipart(
        requestBody,
        paramStr
    );

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostMultipleContentTypesSplitForm({
        bool3: false,
        num3: 7842.07,
        str3: "string",
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostMultipleContentTypesSplitJson({
        bool: false,
        num: 2445.56,
        str: "string",
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostMultipleContentTypesSplitMultipart({
        bool2: false,
        num2: 2079.2,
        str2: "string",
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostNotNullableNotRequiredStringBody("string");

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostNullArray(["string"]);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostNullDictionary({
        key: "string",
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostNullableNotRequiredStringBody("string");

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPostNullableRequiredStringBody("string");

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPutBytes(
        new TextEncoder().encode("0x5DbFFb1Ff9")
    );

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { RequestBodyPutBytesWithParamsRequest } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const requestBody: Uint8Array = new TextEncoder().encode("0xC1B9cA4eb5");
    const queryStringParam: string = "string";

    const res = await sdk.requestBodies.requestBodyPutBytesWithParams(
        requestBody,
        queryStringParam
    );

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPutMultipartDeep({
        any: "anyOf[0]",
        arr: [
            {
                any: "any",
                bigint: 8821239038968084,
                bigintStr: "9223372036854775808",
                bool: true,
                boolOpt: true,
                date: new RFCDate("2020-01-01"),
                dateTime: new Date("2020-01-01T00:00:00.000001Z"),
                decimal: 3.141592653589793,
                decimalStr: "3.14159265358979344719667586",
                enum: Enum.One,
                float32: 1.1,
                int: 1,
                int32: 1,
                int32Enum: Int32Enum.FiftyFive,
                intEnum: IntEnum.Second,
                num: 1.1,
                str: "test",
                strOpt: "testOptional",
            },
            {
                any: "any",
                bigint: 8821239038968084,
                bigintStr: "9223372036854775808",
                bool: true,
                boolOpt: true,
                date: new RFCDate("2020-01-01"),
                dateTime: new Date("2020-01-01T00:00:00.000001Z"),
                decimal: 3.141592653589793,
                decimalStr: "3.14159265358979344719667586",
                enum: Enum.One,
                float32: 1.1,
                int: 1,
                int32: 1,
                int32Enum: Int32Enum.FiftyFive,
                intEnum: IntEnum.Second,
                num: 1.1,
                str: "test",
                strOpt: "testOptional",
            },
        ],
        bool: true,
        int: 1,
        map: {
            key: {
                any: "any",
                bigint: 8821239038968084,
                bigintStr: "9223372036854775808",
                bool: true,
                boolOpt: true,
                date: new RFCDate("2020-01-01"),
                dateTime: new Date("2020-01-01T00:00:00.000001Z"),
                decimal: 3.141592653589793,
                decimalStr: "3.14159265358979344719667586",
                enum: Enum.One,
                float32: 1.1,
                int: 1,
                int32: 1,
                int32Enum: Int32Enum.FiftyFive,
                intEnum: IntEnum.Second,
                num: 1.1,
                str: "test",
                strOpt: "testOptional",
            },
            key2: {
                any: "any",
                bigint: 8821239038968084,
                bigintStr: "9223372036854775808",
                bool: true,
                boolOpt: true,
                date: new RFCDate("2020-01-01"),
                dateTime: new Date("2020-01-01T00:00:00.000001Z"),
                decimal: 3.141592653589793,
                decimalStr: "3.14159265358979344719667586",
                enum: Enum.One,
                float32: 1.1,
                int: 1,
                int32: 1,
                int32Enum: Int32Enum.FiftyFive,
                intEnum: IntEnum.Second,
                num: 1.1,
                str: "test",
                strOpt: "testOptional",
            },
        },
        num: 1.1,
        obj: {
            any: "any",
            bigint: 8821239038968084,
            bigintStr: "9223372036854775808",
            bool: true,
            boolOpt: true,
            date: new RFCDate("2020-01-01"),
            dateTime: new Date("2020-01-01T00:00:00.000001Z"),
            decimal: 3.141592653589793,
            decimalStr: "3.14159265358979344719667586",
            enum: Enum.One,
            float32: 1.1,
            int: 1,
            int32: 1,
            int32Enum: Int32Enum.FiftyFive,
            intEnum: IntEnum.Second,
            num: 1.1,
            str: "test",
            strOpt: "testOptional",
        },
        str: "test",
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPutMultipartDifferentFileName({
        differentFileName: {
            content: new TextEncoder().encode("0xdF19d43dd2"),
            fileName: "west_tunisian.pdf",
        },
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPutMultipartFile({
        file: {
            content: new TextEncoder().encode("0xa9f2Ee38c3"),
            fileName: "bandwidth_sedan.pdf",
        },
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPutMultipartSimple({
        any: "any",
        bigint: 8821239038968084,
        bigintStr: "9223372036854775808",
        bool: true,
        boolOpt: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.000001Z"),
        decimal: 3.141592653589793,
        decimalStr: "3.14159265358979344719667586",
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        strOpt: "testOptional",
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyPutString("string");

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { RequestBodyPutStringWithParamsRequest } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const requestBody: string = "string";
    const queryStringParam: string = "string";

    const res = await sdk.requestBodies.requestBodyPutStringWithParams(
        requestBody,
        queryStringParam
    );

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyReadAndWrite({
        num1: 797612,
        num2: 89374,
        num3: 459345,
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyReadOnlyInput({});

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyReadOnlyUnion("string");

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyReadWriteOnlyUnion("string");

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyWriteOnly({
        bool: false,
        num: 3888.42,
        string: "string",
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyWriteOnlyOutput({
        bool: false,
        num: 3867.69,
        string: "string",
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.requestBodies.requestBodyWriteOnlyUnion("string");

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.responseBodies.responseBodyAdditionalPropertiesAnyPost({
        key: "string",
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.responseBodies.responseBodyAdditionalPropertiesComplexNumbersPost({
        key: "string",
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.responseBodies.responseBodyAdditionalPropertiesDatePost({
        key: new RFCDate("2021-03-16"),
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.responseBodies.responseBodyAdditionalPropertiesObjectPost({
        key: {
            any: "any",
            bigint: 8821239038968084,
            bigintStr: "9223372036854775808",
            bool: true,
            boolOpt: true,
            date: new RFCDate("2020-01-01"),
            dateTime: new Date("2020-01-01T00:00:00.000001Z"),
            decimal: 3.141592653589793,
            decimalStr: "3.14159265358979344719667586",
            enum: Enum.One,
            float32: 1.1,
            int: 1,
            int32: 1,
            int32Enum: Int32Enum.FiftyFive,
            intEnum: IntEnum.Second,
            num: 1.1,
            str: "test",
            strOpt: "testOptional",
        },
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.responseBodies.responseBodyAdditionalPropertiesPost({
        key: "string",
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.responseBodies.responseBodyBytesGet();

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { ResponseBodyEmptyWithHeadersRequest } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const xNumberHeader: number = 1751.8;
    const xStringHeader: string = "string";

    const res = await sdk.responseBodies.responseBodyEmptyWithHeaders(xNumberHeader, xStringHeader);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.responseBodies.responseBodyOptionalGet();

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.responseBodies.responseBodyReadOnly();

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.responseBodies.responseBodyStringGet();

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.responseBodies.responseBodyXmlGet();

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.responseBodies.responseBodyZeroValueComplexTypePtrsPost({
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00Z"),
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.servers.selectGlobalServer();

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.servers.selectServerWithID();

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.servers.serverWithProtocolTemplate();

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.servers.serverWithTemplates();

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.servers.serverWithTemplatesGlobal();

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.servers.serversByIDWithTemplates();

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { TelemetrySpeakeasyUserAgentGetRequest } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const userAgent: string = "string";

    const res = await sdk.telemetry.telemetrySpeakeasyUserAgentGet(userAgent);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.telemetry.telemetryUserAgentGet();

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.authNew.apiKeyAuthGlobalNew({
        basicAuth: {
            password: "owsGgP4_AhRPMSJ",
            username: "Devonte_Bins",
        },
        headerAuth: [
            {
                expectedValue: "string",
                headerName: "string",
            },
        ],
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.authNew.authGlobal({
        basicAuth: {
            password: "xvJcf9GiJNr7T2x",
            username: "Cory33",
        },
        headerAuth: [
            {
                expectedValue: "string",
                headerName: "string",
            },
        ],
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { BasicAuthNewSecurity } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const operationSecurity: BasicAuthNewSecurity = {
        password: "YOUR_PASSWORD",
        username: "YOUR_USERNAME",
    };

    const res = await sdk.authNew.basicAuthNew(
        {
            basicAuth: {
                password: "Z2OStPksFyrcGeu",
                username: "Ashton.Steuber27",
            },
            headerAuth: [
                {
                    expectedValue: "string",
                    headerName: "string",
                },
            ],
        },
        operationSecurity
    );

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { MultipleMixedOptionsAuthSecurity } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const operationSecurity: MultipleMixedOptionsAuthSecurity = {
        apiKeyAuthNew: "Token <YOUR_API_KEY>",
    };

    const res = await sdk.authNew.multipleMixedOptionsAuth(
        {
            basicAuth: {
                password: "Iq1JSzG1wqLDz4v",
                username: "Ismael.Emmerich",
            },
            headerAuth: [
                {
                    expectedValue: "string",
                    headerName: "string",
                },
            ],
        },
        operationSecurity
    );

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { MultipleMixedSchemeAuthSecurity } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const operationSecurity: MultipleMixedSchemeAuthSecurity = {
        apiKeyAuthNew: "Token <YOUR_API_KEY>",
        basicAuth: {
            password: "YOUR_PASSWORD",
            username: "YOUR_USERNAME",
        },
    };

    const res = await sdk.authNew.multipleMixedSchemeAuth(
        {
            basicAuth: {
                password: "OcWVV5608IiaWJQ",
                username: "Kameron42",
            },
            headerAuth: [
                {
                    expectedValue: "string",
                    headerName: "string",
                },
            ],
        },
        operationSecurity
    );

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { MultipleOptionsWithMixedSchemesAuthSecurity } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const operationSecurity: MultipleOptionsWithMixedSchemesAuthSecurity = {
        option1: {
            apiKeyAuthNew: "Token <YOUR_API_KEY>",
            oauth2: "Bearer YOUR_OAUTH2_TOKEN",
        },
    };

    const res = await sdk.authNew.multipleOptionsWithMixedSchemesAuth(
        {
            basicAuth: {
                password: "fpwNE90MyqKIrXk",
                username: "Caroline_Walsh",
            },
            headerAuth: [
                {
                    expectedValue: "string",
                    headerName: "string",
                },
            ],
        },
        operationSecurity
    );

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { MultipleOptionsWithSimpleSchemesAuthSecurity } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const operationSecurity: MultipleOptionsWithSimpleSchemesAuthSecurity = {
        option1: {
            apiKeyAuthNew: "Token <YOUR_API_KEY>",
            oauth2: "Bearer YOUR_OAUTH2_TOKEN",
        },
    };

    const res = await sdk.authNew.multipleOptionsWithSimpleSchemesAuth(
        {
            basicAuth: {
                password: "pibxDTiJSijK04Y",
                username: "Selena76",
            },
            headerAuth: [
                {
                    expectedValue: "string",
                    headerName: "string",
                },
            ],
        },
        operationSecurity
    );

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { MultipleSimpleOptionsAuthSecurity } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const operationSecurity: MultipleSimpleOptionsAuthSecurity = {
        apiKeyAuthNew: "Token <YOUR_API_KEY>",
    };

    const res = await sdk.authNew.multipleSimpleOptionsAuth(
        {
            basicAuth: {
                password: "pzdKQgSGZSrUGNs",
                username: "Eryn51",
            },
            headerAuth: [
                {
                    expectedValue: "string",
                    headerName: "string",
                },
            ],
        },
        operationSecurity
    );

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { MultipleSimpleSchemeAuthSecurity } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const operationSecurity: MultipleSimpleSchemeAuthSecurity = {
        apiKeyAuthNew: "Token <YOUR_API_KEY>",
        oauth2: "Bearer YOUR_OAUTH2_TOKEN",
    };

    const res = await sdk.authNew.multipleSimpleSchemeAuth(
        {
            basicAuth: {
                password: "UrAsw466AAaYtr1",
                username: "Kenya.Baumbach",
            },
            headerAuth: [
                {
                    expectedValue: "string",
                    headerName: "string",
                },
            ],
        },
        operationSecurity
    );

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { Oauth2AuthNewSecurity } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const operationSecurity: Oauth2AuthNewSecurity = {
        oauth2: "Bearer YOUR_OAUTH2_TOKEN",
    };

    const res = await sdk.authNew.oauth2AuthNew(
        {
            basicAuth: {
                password: "V02sHy2onRTMRgS",
                username: "Polly.Aufderhar78",
            },
            headerAuth: [
                {
                    expectedValue: "string",
                    headerName: "string",
                },
            ],
        },
        operationSecurity
    );

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { OpenIdConnectAuthNewSecurity } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const operationSecurity: OpenIdConnectAuthNewSecurity = {
        openIdConnect: "Bearer YOUR_OPENID_TOKEN",
    };

    const res = await sdk.authNew.openIdConnectAuthNew(
        {
            basicAuth: {
                password: "1_B3hNdr8HC3AeS",
                username: "Floy_Heller",
            },
            headerAuth: [
                {
                    expectedValue: "string",
                    headerName: "string",
                },
            ],
        },
        operationSecurity
    );

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { ApiKeyAuthSecurity } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const operationSecurity: ApiKeyAuthSecurity = {
        apiKeyAuth: "Token YOUR_API_KEY",
    };

    const res = await sdk.auth.apiKeyAuth(operationSecurity);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.auth.apiKeyAuthGlobal();

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { BasicAuthRequest, BasicAuthSecurity } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const passwd: string = "string";
    const user: string = "string";
    const operationSecurity: BasicAuthSecurity = {
        password: "YOUR_PASSWORD",
        username: "YOUR_USERNAME",
    };

    const res = await sdk.auth.basicAuth(operationSecurity, passwd, user);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { BearerAuthSecurity } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const operationSecurity: BearerAuthSecurity = {
        bearerAuth: "YOUR_JWT",
    };

    const res = await sdk.auth.bearerAuth(operationSecurity);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.auth.globalBearerAuth();

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { Oauth2AuthSecurity } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const operationSecurity: Oauth2AuthSecurity = {
        oauth2: "Bearer YOUR_OAUTH2_TOKEN",
    };

    const res = await sdk.auth.oauth2Auth(operationSecurity);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { Oauth2OverrideRequest, Oauth2OverrideSecurity } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const operationSecurity: Oauth2OverrideSecurity = {
        oauth2: "Bearer YOUR_OAUTH2_TOKEN",
    };

    const res = await sdk.auth.oauth2Override(operationSecurity);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { OpenIdConnectAuthSecurity } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const operationSecurity: OpenIdConnectAuthSecurity = {
        openIdConnect: "Bearer YOUR_OPENID_TOKEN",
    };

    const res = await sdk.auth.openIdConnectAuth(operationSecurity);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { GetDocumentationPerLanguageRequest } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const language: string = "string";

    const res = await sdk.documentation.getDocumentationPerLanguage(language);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.resource.createFile({
        file: {
            content: new TextEncoder().encode("0xf10df1a3b9"),
            fileName: "rap_national.mp4v",
        },
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { EnumNumber, EnumStr } from "openapi/dist/sdk/models/shared";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.resource.createResource({
        arrayOfNumber: [1867.47],
        arrayOfString: ["string"],
        chocolates: [
            {
                description: "Re-engineered asynchronous array",
            },
        ],
        id: "<ID>",
        inlineObject: {},
        mapOfInteger: {
            key: 271791,
        },
        mapOfString: {
            key: "string",
        },
        name: "string",
        vehicle: "string",
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { DeleteResourceRequest } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const resourceId: string = "string";

    const res = await sdk.resource.deleteResource(resourceId);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { GetResourceRequest } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const resourceId: string = "string";

    const res = await sdk.resource.getResource(resourceId);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { UpdateResourceRequest } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const resourceId: string = "string";

    const res = await sdk.resource.updateResource(resourceId);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.first.get();

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.second.get();

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.pagination.paginationCursorBody({
        cursor: 868337,
    });

    if (res.statusCode == 200) {
        do {
            // handle items

            res = res.next();
        } while (res);
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { PaginationCursorParamsRequest } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const cursor: number = 24812;

    const res = await sdk.pagination.paginationCursorParams(cursor);

    if (res.statusCode == 200) {
        do {
            // handle items

            res = res.next();
        } while (res);
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.pagination.paginationLimitOffsetOffsetBody({});

    if (res.statusCode == 200) {
        do {
            // handle items

            res = res.next();
        } while (res);
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { PaginationLimitOffsetOffsetParamsRequest } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const limit: number = 661976;
    const offset: number = 600173;

    const res = await sdk.pagination.paginationLimitOffsetOffsetParams(limit, offset);

    if (res.statusCode == 200) {
        do {
            // handle items

            res = res.next();
        } while (res);
    }
}

run();

```

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.pagination.paginationLimitOffsetPageBody({});

    if (res.statusCode == 200) {
        do {
            // handle items

            res = res.next();
        } while (res);
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { PaginationLimitOffsetPageParamsRequest } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const page: number = 1177;

    const res = await sdk.pagination.paginationLimitOffsetPageParams(page);

    if (res.statusCode == 200) {
        do {
            // handle items

            res = res.next();
        } while (res);
    }
}

run();

```

```typescript
import { SDK } from "openapi";
import { RetriesGetRequest } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const requestId: string = "string";
    const numRetries: number = 75342;

    const res = await sdk.retries.retriesGet(requestId, numRetries);

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

### Second

Do this second

```typescript
import { SDK } from "openapi";
import {
    EnumParameter,
    OptEnumParameter,
    UsageExamplePostSecurity,
} from "openapi/dist/sdk/models/operations";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
    const sdk = new SDK({
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const operationSecurity: UsageExamplePostSecurity = {
        password: "YOUR_PASSWORD",
        username: "YOUR_USERNAME",
    };

    const res = await sdk.generation.usageExamplePost(
        {
            requestBody: {
                fakerFormattedStrings: {},
                fakerStrings: {},
                simpleObject: {
                    any: "any",
                    bigint: 8821239038968084,
                    bigintStr: "9223372036854775808",
                    bool: true,
                    boolOpt: true,
                    date: new RFCDate("2020-01-01"),
                    dateTime: new Date("2020-01-01T00:00:00.000001Z"),
                    decimal: 3.141592653589793,
                    decimalStr: "3.14159265358979344719667586",
                    enum: Enum.One,
                    float32: 1.1,
                    int: 1,
                    int32: 1,
                    int32Enum: Int32Enum.FiftyFive,
                    intEnum: IntEnum.Second,
                    num: 1.1,
                    str: "test",
                    strOpt: "testOptional",
                },
            },
            bigintParameter: 168827,
            bigintStrParameter: "string",
            boolParameter: false,
            dateParameter: new RFCDate("2022-05-05"),
            dateTimeDefaultParameter: new Date("2023-06-11T00:39:45.412Z"),
            dateTimeParameter: new Date("2022-07-22T13:16:48.221Z"),
            decimalParameter: 2679.33,
            decimalStrParameter: "string",
            doubleParameter: 5223.72,
            enumParameter: EnumParameter.Value1,
            falseyNumberParameter: 0,
            float32Parameter: 6946.59,
            floatParameter: 2286.22,
            int64Parameter: 102975,
            intParameter: 566999,
            optEnumParameter: OptEnumParameter.Value3,
            strParameter: "example 1",
        },
        operationSecurity
    );

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```
<!-- End SDK Example Usage [usage] -->