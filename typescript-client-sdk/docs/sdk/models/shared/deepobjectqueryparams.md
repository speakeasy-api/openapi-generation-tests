# DeepObjectQueryParams

deepObject style query parameter serialization is undefined for arrays or nested objects by the specification:
   https://github.com/OAI/OpenAPI-Specification/issues/1706
This schema covers the intended implementation cases rather than the fully complex deepObject schema.


## Example Usage

```typescript
import { DeepObjectQueryParams, IntEnum } from "openapi/sdk/models/shared";
import { Decimal, RFCDate } from "openapi/sdk/types";

let value: DeepObjectQueryParams = {
  arr: [
    "test1",
    "test2",
  ],
  bool: true,
  int: 1,
  map: {
    "testkey1": "testvalue1",
    "testkey2": "testvalue2",
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
  oneof: "test",
  oneofnestedobject: {
    nested: "test",
  },
  str: "test",
};
```

## Fields

| Field                                                                                                                                                          | Type                                                                                                                                                           | Required                                                                                                                                                       | Description                                                                                                                                                    | Example                                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `arr`                                                                                                                                                          | *string*[]                                                                                                                                                     | :heavy_check_mark:                                                                                                                                             | N/A                                                                                                                                                            | [<br/>"test1",<br/>"test2"<br/>]                                                                                                                               |
| `bool`                                                                                                                                                         | *boolean*                                                                                                                                                      | :heavy_check_mark:                                                                                                                                             | N/A                                                                                                                                                            | true                                                                                                                                                           |
| `int`                                                                                                                                                          | *number*                                                                                                                                                       | :heavy_check_mark:                                                                                                                                             | N/A                                                                                                                                                            | 1                                                                                                                                                              |
| `map`                                                                                                                                                          | Record<string, *string*>                                                                                                                                       | :heavy_check_mark:                                                                                                                                             | N/A                                                                                                                                                            | {<br/>"testkey1": "testvalue1",<br/>"testkey2": "testvalue2"<br/>}                                                                                             |
| `num`                                                                                                                                                          | *number*                                                                                                                                                       | :heavy_check_mark:                                                                                                                                             | N/A                                                                                                                                                            | 1.1                                                                                                                                                            |
| `obj`                                                                                                                                                          | [shared.SimpleObject](../../../sdk/models/shared/simpleobject.md)                                                                                              | :heavy_check_mark:                                                                                                                                             | A simple object that uses all our supported primitive types and enums and has optional properties.<br/><br/>[A link to the external docs.](https://speakeasy.com/docs) |                                                                                                                                                                |
| `oneof`                                                                                                                                                        | *shared.Oneof*                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                             | N/A                                                                                                                                                            |                                                                                                                                                                |
| `oneofnestedobject`                                                                                                                                            | *shared.Oneofnestedobject*                                                                                                                                     | :heavy_minus_sign:                                                                                                                                             | N/A                                                                                                                                                            |                                                                                                                                                                |
| `str`                                                                                                                                                          | *string*                                                                                                                                                       | :heavy_check_mark:                                                                                                                                             | N/A                                                                                                                                                            | test                                                                                                                                                           |