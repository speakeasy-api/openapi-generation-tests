# RequestBodyPostApplicationJsonDeepCamelCaseRes

OK

## Example Usage

```typescript
import { RequestBodyPostApplicationJsonDeepCamelCaseRes } from "openapi/sdk/models/operations";
import { IntEnumVal } from "openapi/sdk/models/shared";
import { RFCDate } from "openapi/sdk/types";

let value: RequestBodyPostApplicationJsonDeepCamelCaseRes = {
    json: {
        anyVal: {
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
        arrVal: [
            {
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
            {
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
        ],
        boolVal: true,
        intVal: 1,
        mapVal: {
            key: {
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
        numVal: 1.1,
        objVal: {
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
        strVal: "test",
    },
};
```

## Fields

| Field                                                                           | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `json`                                                                          | [shared.DeepObjectCamelCase](../../../sdk/models/shared/deepobjectcamelcase.md) | :heavy_minus_sign:                                                              | N/A                                                                             |