# RequestBodyPostFormSimpleRes

OK

## Example Usage

```typescript
import { RequestBodyPostFormSimpleRes } from "openapi/sdk/models/operations";

let value: RequestBodyPostFormSimpleRes = {
    form: {
        any: "any",
        bigint: "8821239038968084",
        bigintStr: "9223372036854775808",
        bool: "true",
        boolOpt: "true",
        date: "2020-01-01",
        dateTime: "2020-01-01T00:00:00.001Z",
        decimal: "3.141592653589793",
        decimalStr: "3.14159265358979344719667586",
        enum: "one",
        float32: "1.1",
        int: "1",
        int32: "1",
        int32Enum: "55",
        intEnum: "2",
        num: "1.1",
        str: "test",
        strOpt: "testOptional",
    },
    headers: {
        contentType: "<value>",
    },
};
```

## Fields

| Field                                                                                                             | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `form`                                                                                                            | [operations.RequestBodyPostFormSimpleForm](../../../sdk/models/operations/requestbodypostformsimpleform.md)       | :heavy_check_mark:                                                                                                | N/A                                                                                                               |
| `headers`                                                                                                         | [operations.RequestBodyPostFormSimpleHeaders](../../../sdk/models/operations/requestbodypostformsimpleheaders.md) | :heavy_check_mark:                                                                                                | N/A                                                                                                               |