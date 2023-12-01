# openapi

<!-- Start SDK Installation [installation] -->
## SDK Installation

### NPM

```bash
npm add https://gitpkg.now.sh/speakeasy-api/openapi-generation-tests/typescript-client-sdk
```

### Yarn

```bash
yarn add https://gitpkg.now.sh/speakeasy-api/openapi-generation-tests/typescript-client-sdk
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example 1

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

### Example 2

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

### Example 3

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

### Example 4

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

### Example 5

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

### Example 6

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

### Example 7

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

### Example 8

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

### Example 9

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

### Example 10

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

### Example 11

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

### Example 12

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

### Example 13

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

### Example 14

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

### Example 15

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

### Example 16

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

### Example 17

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

### Example 18

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

### Example 19

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

### Example 20

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

### Example 21

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

### Example 22

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

### Example 23

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

### Example 24

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

### Example 25

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

### Example 26

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

### Example 27

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

### Example 28

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

### Example 29

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

### Example 30

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

### Example 31

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

### Example 32

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

### Example 33

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

### Example 34

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

### Example 35

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

### Example 36

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

### Example 37

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

### Example 38

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

### Example 39

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

### Example 40

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

### Example 41

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

### Example 42

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

### Example 43

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

### Example 44

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

### Example 45

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

### Example 46

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

### Example 47

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

### Example 48

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

### Example 49

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

### Example 50

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

### Example 51

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

### Example 52

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

### Example 53

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

### Example 54

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

### Example 55

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

### Example 56

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

### Example 57

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

### Example 58

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

### Example 59

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

### Example 60

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

### Example 61

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

### Example 62

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

### Example 63

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

### Example 64

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

### Example 65

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

### Example 66

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

### Example 67

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

### Example 68

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

### Example 69

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

### Example 70

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

### Example 71

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

### Example 72

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

### Example 73

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

### Example 74

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

### Example 75

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

### Example 76

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

### Example 77

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

### Example 78

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

### Example 79

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

### Example 80

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

### Example 81

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

### Example 82

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

### Example 83

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

### Example 84

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

### Example 85

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

### Example 86

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

### Example 87

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

### Example 88

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

### Example 89

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

### Example 90

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

### Example 91

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

### Example 92

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

### Example 93

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

### Example 94

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

### Example 95

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

### Example 96

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

### Example 97

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

### Example 98

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

### Example 99

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

### Example 100

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

### Example 101

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

### Example 102

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

### Example 103

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

### Example 104

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

### Example 105

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

### Example 106

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

### Example 107

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

### Example 108

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

### Example 109

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

### Example 110

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

### Example 111

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

### Example 112

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

### Example 113

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

### Example 114

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

### Example 115

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

### Example 116

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

### Example 117

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

### Example 118

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

### Example 119

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

### Example 120

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

### Example 121

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

### Example 122

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

### Example 123

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

### Example 124

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

### Example 125

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

### Example 126

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

### Example 127

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

### Example 128

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

### Example 129

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

### Example 130

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

### Example 131

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

### Example 132

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

### Example 133

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

### Example 134

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

### Example 135

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

### Example 136

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

### Example 137

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

### Example 138

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

### Example 139

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

### Example 140

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

### Example 141

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

### Example 142

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

### Example 143

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

### Example 144

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

### Example 145

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

### Example 146

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

### Example 147

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

### Example 148

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

### Example 149

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

### Example 150

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

### Example 151

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

### Example 152

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

### Example 153

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

### Example 154

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

### Example 155

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

### Example 156

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

### Example 157

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

### Example 158

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

### Example 159

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

### Example 160

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

### Example 161

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

### Example 162

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

### Example 163

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

### Example 164

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

### Example 165

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

### Example 166

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

### Example 167

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

### Example 168

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

### Example 169

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

### Example 170

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

### Example 171

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

### Example 172

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

### Example 173

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

### Example 174

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

### Example 175

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

### Example 176

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

### Example 177

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

### Example 178

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

### Example 179

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

### Example 180

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

### Example 181

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

### Example 182

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

### Example 183

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

### Example 184

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

### Example 185

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

### Example 186

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

### Example 187

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

### Example 188

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

* [responseBodyAdditionalPropertiesAnyPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiesanypost)
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





<!-- Start Pagination [pagination] -->
## Pagination

Some of the endpoints in this SDK support pagination. To use pagination, you make your SDK calls as usual, but the
returned response object will have a `next` method that can be called to pull down the next group of results. If the
return value of `next` is `null`, then there are no more pages to be fetched.

Here's an example of one such pagination call:
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
<!-- End Pagination [pagination] -->



<!-- Start Global Parameters [global-parameters] -->
## Global Parameters

Certain parameters are configured globally. These parameters must be set on the SDK client instance itself during initialization. When configured as an option during SDK initialization, These global values will be used as defaults on the operations that use them. When such operations are called, there is a place in each to override the global value, if needed.

For example, you can set `globalPathParam` to `100` at SDK initialization and then you do not have to pass the same value on calls to operations like `globalPathParameterGet`. But if you want to do so you may, which will locally override the global setting. See the example code below for a demonstration.


### Available Globals

The following global parameters are available. The required parameters must be set when you initialize the SDK client.

| Name | Type | Required | Description |
| ---- | ---- |:--------:| ----------- |
| globalPathParam | number | ✔️ | The globalPathParam parameter. |
| globalQueryParam | string | ✔️ | The globalQueryParam parameter. |


### Example

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
<!-- End Global Parameters [global-parameters] -->



<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations.  All operations return a response object or throw an error.  If Error objects are specified in your OpenAPI Spec, the SDK will throw the appropriate Error type.

| Error Object                                 | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| errors.ErrorT                                | 500                                          | application/json                             |
| errors.StatusGetXSpeakeasyErrorsResponseBody | 501                                          | application/json                             |
| errors.SDKError                              | 400-600                                      | */*                                          |

Example

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

    let res;
    try {
        res = await sdk.errors.statusGetXSpeakeasyErrors(statusCode);
    } catch (err) {
        if (err instanceof errors.ErrorT) {
            console.error(err); // handle exception
            throw err;
        } else if (err instanceof errors.StatusGetXSpeakeasyErrorsResponseBody) {
            console.error(err); // handle exception
            throw err;
        } else if (err instanceof errors.SDKError) {
            console.error(err); // handle exception
            throw err;
        }
    }

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```
<!-- End Error Handling [errors] -->



<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally by passing a server index to the `serverIdx: number` optional parameter when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| # | Server | Variables |
| - | ------ | --------- |
| 0 | `http://localhost:35123` | None |
| 1 | `http://broken` | None |
| 2 | `http://{hostname}:{port}` | `hostname` (default is `localhost`), `port` (default is `35123`) |
| 3 | `http://localhost:35123/anything/{something}` | `something` (default is `something`) |
| 4 | `{protocol}://{hostname}:{port}` | `hostname` (default is `localhost`), `port` (default is `35123`), `protocol` (default is `http`) |

#### Example

```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        serverIdx: 4,
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.putAnythingIgnoredGeneration("string");

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

#### Variables

Some of the server options above contain variables. If you want to set the values of those variables, the following optional parameters are available when initializing the SDK client instance:
 * `hostname: string`
 * `port: string`
 * `something: models.ServerSomething`
 * `protocol: string`

### Override Server URL Per-Client

The default server can also be overridden globally by passing a URL to the `serverURL: str` optional parameter when initializing the SDK client instance. For example:
```typescript
import { SDK } from "openapi";

async function run() {
    const sdk = new SDK({
        serverURL: "http://localhost:35123",
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.putAnythingIgnoredGeneration("string");

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

### Override Server URL Per-Operation

The server URL can also be overridden on a per-operation basis, provided a server list was specified for the operation. For example:
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

    const res = await sdk.errors.connectionErrorGet("http://somebrokenapi.broken");

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```
<!-- End Server Selection [server] -->



<!-- Start Custom HTTP Client [http-client] -->
## Custom HTTP Client

The Typescript SDK makes API calls using the [axios](https://axios-http.com/docs/intro) HTTP library.  In order to provide a convenient way to configure timeouts, cookies, proxies, custom headers, and other low-level configuration, you can initialize the SDK client with a custom `AxiosInstance` object.

For example, you could specify a header for every request that your sdk makes as follows:

```typescript
import { openapi } from "SDK";
import axios from "axios";

const httpClient = axios.create({
    headers: {'x-custom-header': 'someValue'}
})

const sdk = new SDK({defaultClient: httpClient});
```
<!-- End Custom HTTP Client [http-client] -->



<!-- Start Retries [retries] -->
## Retries

Some of the endpoints in this SDK support retries.  If you use the SDK without any configuration, it will fall back to the default retry strategy provided by the API.  However, the default retry strategy can be overridden on a per-operation basis, or across the entire SDK.

To change the default retry strategy for a single API call, simply provide a retryConfig object to the call:
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

    const res = await sdk.retries.retriesGet(requestId, numRetries, {
        strategy: "backoff",
        backoff: {
            initialInterval: 1,
            maxInterval: 50,
            exponent: 1.1,
            maxElapsedTime: 100,
        },
        retryConnectionErrors: false,
    });

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

If you'd like to override the default retry strategy for all operations that support retries, you can provide a retryConfig at SDK initialization:
```typescript
import { SDK } from "openapi";
import { RetriesGetRequest } from "openapi/dist/sdk/models/operations";

async function run() {
    const sdk = new SDK({
        retry_config: {
            strategy: "backoff",
            backoff: {
                initialInterval: 1,
                maxInterval: 50,
                exponent: 1.1,
                maxElapsedTime: 100,
            },
            retryConnectionErrors: false,
        },
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
<!-- End Retries [retries] -->



<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security schemes globally:

| Name            | Type            | Scheme          |
| --------------- | --------------- | --------------- |
| `apiKeyAuth`    | apiKey          | API key         |
| `apiKeyAuthNew` | apiKey          | API key         |
| `oauth2`        | oauth2          | OAuth2 token    |

You can set the security parameters through the `security` optional parameter when initializing the SDK client instance. The selected scheme will be used by default to authenticate with the API for all operations that support it. For example:
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

    const res = await sdk.putAnythingIgnoredGeneration("string");

    if (res.statusCode == 200) {
        // handle response
    }
}

run();

```

### Per-Operation Security Schemes

Some operations in this SDK require the security scheme to be specified at the request level. For example:
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
<!-- End Authentication [security] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->



### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)

