# MixedParametersCamelCaseRes

OK

## Example Usage

```typescript
import { MixedParametersCamelCaseRes } from "openapi/sdk/models/operations";

let value: MixedParametersCamelCaseRes = {
    args: {
        queryStringParam: "queryValue",
    },
    headers: {
        headerParam: "headerValue",
    },
    url: "http://localhost:35123/anything/mixedParams/path/pathValue/camelcase?query_string_param=queryValue",
};
```

## Fields

| Field                                                                                                           | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     | Example                                                                                                         |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `args`                                                                                                          | [operations.MixedParametersCamelCaseArgs](../../../sdk/models/operations/mixedparameterscamelcaseargs.md)       | :heavy_check_mark:                                                                                              | N/A                                                                                                             |                                                                                                                 |
| `headers`                                                                                                       | [operations.MixedParametersCamelCaseHeaders](../../../sdk/models/operations/mixedparameterscamelcaseheaders.md) | :heavy_check_mark:                                                                                              | N/A                                                                                                             |                                                                                                                 |
| `url`                                                                                                           | *string*                                                                                                        | :heavy_check_mark:                                                                                              | N/A                                                                                                             | http://localhost:35123/anything/mixedParams/path/pathValue/camelcase?query_string_param=queryValue              |