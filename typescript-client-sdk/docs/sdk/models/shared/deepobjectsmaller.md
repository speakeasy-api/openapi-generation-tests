# DeepObjectSmaller

## Example Usage

```typescript
import { DeepObjectSmaller, IntEnum } from "openapi/sdk/models/shared";
import { Decimal, RFCDate } from "openapi/sdk/types";

let value: DeepObjectSmaller = {
    any: {
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
    arr: [
        {
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
        {
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
    ],
    bool: true,
    int: 1,
    map: {
        key: {
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
    },
    num: 1.1,
    obj: {
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
    str: "test",
};
```

## Fields

| Field                                                                                                                                                          | Type                                                                                                                                                           | Required                                                                                                                                                       | Description                                                                                                                                                    | Example                                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `any`                                                                                                                                                          | *shared.DeepObjectSmallerAny*                                                                                                                                  | :heavy_check_mark:                                                                                                                                             | N/A                                                                                                                                                            | anyOf[0]                                                                                                                                                       |
| `arr`                                                                                                                                                          | [shared.SimpleObject](../../../sdk/models/shared/simpleobject.md)[]                                                                                            | :heavy_check_mark:                                                                                                                                             | N/A                                                                                                                                                            | [<br/>"...",<br/>"..."<br/>]                                                                                                                                   |
| `bool`                                                                                                                                                         | *boolean*                                                                                                                                                      | :heavy_check_mark:                                                                                                                                             | N/A                                                                                                                                                            | true                                                                                                                                                           |
| `int`                                                                                                                                                          | *number*                                                                                                                                                       | :heavy_check_mark:                                                                                                                                             | N/A                                                                                                                                                            | 1                                                                                                                                                              |
| `map`                                                                                                                                                          | Record<string, [shared.SimpleObject](../../../sdk/models/shared/simpleobject.md)>                                                                              | :heavy_check_mark:                                                                                                                                             | N/A                                                                                                                                                            | {<br/>"key": "..."<br/>}                                                                                                                                       |
| `num`                                                                                                                                                          | *number*                                                                                                                                                       | :heavy_check_mark:                                                                                                                                             | N/A                                                                                                                                                            | 1.1                                                                                                                                                            |
| `obj`                                                                                                                                                          | [shared.SimpleObject](../../../sdk/models/shared/simpleobject.md)                                                                                              | :heavy_check_mark:                                                                                                                                             | A simple object that uses all our supported primitive types and enums and has optional properties.<br/><br/>[A link to the external docs.](https://speakeasy.com/docs) |                                                                                                                                                                |
| `str`                                                                                                                                                          | *string*                                                                                                                                                       | :heavy_check_mark:                                                                                                                                             | N/A                                                                                                                                                            | test                                                                                                                                                           |
| `type`                                                                                                                                                         | *string*                                                                                                                                                       | :heavy_minus_sign:                                                                                                                                             | N/A                                                                                                                                                            |                                                                                                                                                                |