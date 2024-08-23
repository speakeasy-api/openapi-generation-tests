# UsageExamplePostRequest

## Example Usage

```typescript
import { UsageExamplePostRequest } from "openapi/sdk/models/operations";
import { IntEnum } from "openapi/sdk/models/shared";
import { Decimal, RFCDate } from "openapi/sdk/types";

let value: UsageExamplePostRequest = {
    requestBody: {
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
    },
    bigintParameter: BigInt("715190"),
    bigintStrParameter: BigInt("844266"),
    boolParameter: false,
    dateParameter: new RFCDate("2023-10-23"),
    dateTimeDefaultParameter: new Date("2024-07-29T07:24:05.705Z"),
    dateTimeParameter: new Date("2023-08-21T04:36:25.552Z"),
    decimalParameter: new Decimal("8472.52"),
    decimalStrParameter: new Decimal("4236.55"),
    doubleParameter: 6235.64,
    enumParameter: "value2",
    falseyNumberParameter: 0,
    float32Parameter: 3843.82,
    float64StringParameter: 4375.87,
    floatParameter: 2975.34,
    int64Parameter: 891773,
    int64StringParameter: 56713,
    intParameter: 963663,
    optEnumParameter: "value3",
    strParameter: "example 1",
};
```

## Fields

| Field                                                                                                   | Type                                                                                                    | Required                                                                                                | Description                                                                                             | Example                                                                                                 |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                           | [operations.UsageExamplePostRequestBody](../../../sdk/models/operations/usageexamplepostrequestbody.md) | :heavy_minus_sign:                                                                                      | A request body that contains fields with different formats for testing example generation               |                                                                                                         |
| `bigintParameter`                                                                                       | *BigInt*                                                                                                | :heavy_check_mark:                                                                                      | An bigint parameter                                                                                     |                                                                                                         |
| `bigintParameterOptional`                                                                               | *BigInt*                                                                                                | :heavy_minus_sign:                                                                                      | An bigint parameter                                                                                     |                                                                                                         |
| `bigintStrParameter`                                                                                    | *BigInt*                                                                                                | :heavy_check_mark:                                                                                      | An bigint parameter                                                                                     |                                                                                                         |
| `bigintStrParameterOptional`                                                                            | *BigInt*                                                                                                | :heavy_minus_sign:                                                                                      | An bigint parameter                                                                                     |                                                                                                         |
| `boolParameter`                                                                                         | *boolean*                                                                                               | :heavy_check_mark:                                                                                      | A boolean parameter                                                                                     |                                                                                                         |
| `dateParameter`                                                                                         | [RFCDate](../../../types/rfcdate.md)                                                                    | :heavy_check_mark:                                                                                      | A date parameter                                                                                        |                                                                                                         |
| `dateTimeDefaultParameter`                                                                              | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)           | :heavy_check_mark:                                                                                      | A date time parameter with a default value                                                              |                                                                                                         |
| `dateTimeParameter`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)           | :heavy_check_mark:                                                                                      | A date time parameter                                                                                   |                                                                                                         |
| `decimalParameter`                                                                                      | *Decimal*                                                                                               | :heavy_check_mark:                                                                                      | A decimal parameter                                                                                     |                                                                                                         |
| `decimalParameterOptional`                                                                              | *Decimal*                                                                                               | :heavy_minus_sign:                                                                                      | A decimal parameter                                                                                     |                                                                                                         |
| `decimalStrParameter`                                                                                   | *Decimal*                                                                                               | :heavy_check_mark:                                                                                      | A decimal parameter                                                                                     |                                                                                                         |
| `decimalStrParameterOptional`                                                                           | *Decimal*                                                                                               | :heavy_minus_sign:                                                                                      | A decimal parameter                                                                                     |                                                                                                         |
| `doubleParameter`                                                                                       | *number*                                                                                                | :heavy_check_mark:                                                                                      | A double parameter                                                                                      |                                                                                                         |
| `enumParameter`                                                                                         | [operations.EnumParameter](../../../sdk/models/operations/enumparameter.md)                             | :heavy_check_mark:                                                                                      | An enum parameter                                                                                       |                                                                                                         |
| `falseyNumberParameter`                                                                                 | *number*                                                                                                | :heavy_check_mark:                                                                                      | A number parameter that contains a falsey example value                                                 | 0                                                                                                       |
| `float32Parameter`                                                                                      | *number*                                                                                                | :heavy_check_mark:                                                                                      | A float32 parameter                                                                                     |                                                                                                         |
| `float64StringParameter`                                                                                | *number*                                                                                                | :heavy_check_mark:                                                                                      | A float64 parameter                                                                                     |                                                                                                         |
| `floatParameter`                                                                                        | *number*                                                                                                | :heavy_check_mark:                                                                                      | A float parameter                                                                                       |                                                                                                         |
| `int64Parameter`                                                                                        | *number*                                                                                                | :heavy_check_mark:                                                                                      | An int64 parameter                                                                                      |                                                                                                         |
| `int64StringParameter`                                                                                  | *number*                                                                                                | :heavy_check_mark:                                                                                      | An int64 parameter                                                                                      |                                                                                                         |
| `intParameter`                                                                                          | *number*                                                                                                | :heavy_check_mark:                                                                                      | An integer parameter                                                                                    |                                                                                                         |
| `optEnumParameter`                                                                                      | [operations.OptEnumParameter](../../../sdk/models/operations/optenumparameter.md)                       | :heavy_minus_sign:                                                                                      | An enum parameter                                                                                       | value3                                                                                                  |
| `strParameter`                                                                                          | *string*                                                                                                | :heavy_check_mark:                                                                                      | A string parameter                                                                                      | example 1                                                                                               |