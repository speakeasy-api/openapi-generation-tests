# RequestBodyPutMultipartSimpleRes

OK

## Example Usage

```typescript
import { RequestBodyPutMultipartSimpleRes } from "openapi/sdk/models/operations";

let value: RequestBodyPutMultipartSimpleRes = {
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

| Field                                                                                                                     | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `form`                                                                                                                    | [operations.RequestBodyPutMultipartSimpleForm](../../../sdk/models/operations/requestbodyputmultipartsimpleform.md)       | :heavy_check_mark:                                                                                                        | N/A                                                                                                                       |
| `headers`                                                                                                                 | [operations.RequestBodyPutMultipartSimpleHeaders](../../../sdk/models/operations/requestbodyputmultipartsimpleheaders.md) | :heavy_check_mark:                                                                                                        | N/A                                                                                                                       |