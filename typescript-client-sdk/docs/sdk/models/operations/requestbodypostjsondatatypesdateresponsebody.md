# RequestBodyPostJsonDataTypesDateResponseBody

OK

## Example Usage

```typescript
import { RequestBodyPostJsonDataTypesDateResponseBody } from "openapi/sdk/models/operations";
import { RFCDate } from "openapi/sdk/types";

let value: RequestBodyPostJsonDataTypesDateResponseBody = {
  data: "\"2020-01-01\"",
  json: new RFCDate("2020-01-01"),
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `data`                               | *string*                             | :heavy_check_mark:                   | N/A                                  | "2020-01-01"                         |
| `json`                               | [RFCDate](../../../types/rfcdate.md) | :heavy_check_mark:                   | N/A                                  | 2020-01-01                           |