# ObjWithObjAdditionalProperties

## Example Usage

```typescript
import { IntEnum, ObjWithObjAdditionalProperties } from "openapi/sdk/models/shared";
import { Decimal, RFCDate } from "openapi/sdk/types";

let value: ObjWithObjAdditionalProperties = {
  additionalProperties: [
    232234,
  ],
  datetime: new Date("2022-05-26T04:57:17.080Z"),
  additionalPropertiesT: {
    "key": {
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
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `additionalProperties`                                                                        | *number*[]                                                                                    | :heavy_check_mark:                                                                            | N/A                                                                                           |
| `additionalPropertiesT`                                                                       | Record<string, [shared.SimpleObject](../../../sdk/models/shared/simpleobject.md)>             | :heavy_minus_sign:                                                                            | N/A                                                                                           |
| `datetime`                                                                                    | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_check_mark:                                                                            | N/A                                                                                           |