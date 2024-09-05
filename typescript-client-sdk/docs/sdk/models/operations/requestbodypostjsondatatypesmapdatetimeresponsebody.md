# RequestBodyPostJsonDataTypesMapDateTimeResponseBody

OK

## Example Usage

```typescript
import { RequestBodyPostJsonDataTypesMapDateTimeResponseBody } from "openapi/sdk/models/operations";

let value: RequestBodyPostJsonDataTypesMapDateTimeResponseBody = {
    data: '{"test":"2020-01-01T00:00:00.001Z"}',
    json: {
        test: new Date("2020-01-01T00:00:00.001Z"),
    },
};
```

## Fields

| Field                                                                                                         | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   | Example                                                                                                       |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `data`                                                                                                        | *string*                                                                                                      | :heavy_check_mark:                                                                                            | N/A                                                                                                           | {"test":"2020-01-01T00:00:00.001Z"}                                                                           |
| `json`                                                                                                        | Record<string, [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)> | :heavy_check_mark:                                                                                            | N/A                                                                                                           | {<br/>"test": "..."<br/>}                                                                                     |