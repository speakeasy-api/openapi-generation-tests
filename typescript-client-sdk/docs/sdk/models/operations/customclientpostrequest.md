# CustomClientPostRequest

## Example Usage

```typescript
import { CustomClientPostRequest } from "openapi/sdk/models/operations";
import { IntEnum } from "openapi/sdk/models/shared";
import { Decimal, RFCDate } from "openapi/sdk/types";

let value: CustomClientPostRequest = {
    headerParam: "headerValue",
    pathParam: "pathValue",
    queryStringParam: "queryValue",
    simpleObject: {
        bool: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.001Z"),
        enum: "one",
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: 55,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        any: "any",
        bigint: BigInt("8821239038968084"),
        bigintStr: BigInt("9223372036854775808"),
        boolOpt: true,
        decimal: new Decimal("3.141592653589793"),
        decimalStr: new Decimal("3.14159265358979344719667586"),
        float64Str: 1.1,
        int64Str: 100,
        strOpt: "testOptional",
    },
};
```

## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       | Example                                                           |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `headerParam`                                                     | *string*                                                          | :heavy_check_mark:                                                | N/A                                                               | headerValue                                                       |
| `pathParam`                                                       | *string*                                                          | :heavy_check_mark:                                                | N/A                                                               | pathValue                                                         |
| `queryStringParam`                                                | *string*                                                          | :heavy_check_mark:                                                | N/A                                                               | queryValue                                                        |
| `simpleObject`                                                    | [shared.SimpleObject](../../../sdk/models/shared/simpleobject.md) | :heavy_minus_sign:                                                | N/A                                                               |                                                                   |