# MapObjValueCamelCase

## Example Usage

```typescript
import { IntEnumVal, MapObjValueCamelCase } from "openapi/sdk/models/shared";
import { RFCDate } from "openapi/sdk/types";

let value: MapObjValueCamelCase = {
  json: {
    "mapElem1": {
      anyVal: "any example",
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00.001Z"),
      dateVal: new RFCDate("2020-01-01"),
      enumVal: "one",
      float32Val: 2.2222222,
      int32EnumVal: 69,
      int32Val: 1,
      intEnumVal: IntEnumVal.Third,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
    "mapElem2": {
      anyVal: "any example",
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00.001Z"),
      dateVal: new RFCDate("2020-01-01"),
      enumVal: "one",
      float32Val: 2.2222222,
      int32EnumVal: 69,
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
};
```

## Fields

| Field                                                                                               | Type                                                                                                | Required                                                                                            | Description                                                                                         | Example                                                                                             |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `json`                                                                                              | Record<string, [shared.SimpleObjectCamelCase](../../../sdk/models/shared/simpleobjectcamelcase.md)> | :heavy_minus_sign:                                                                                  | N/A                                                                                                 | {<br/>"mapElem1": "...",<br/>"mapElem2": "..."<br/>}                                                |
| `required`                                                                                          | *any*                                                                                               | :heavy_minus_sign:                                                                                  | N/A                                                                                                 |                                                                                                     |