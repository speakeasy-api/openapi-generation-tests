# RequestBodyPostApplicationJsonArrayOfUnionsRequestBody

## Example Usage

```typescript
import { RequestBodyPostApplicationJsonArrayOfUnionsRequestBody } from "openapi/sdk/models/operations";
import { RFCDate } from "openapi/sdk/types";

let value: RequestBodyPostApplicationJsonArrayOfUnionsRequestBody = {
  dates: [
    new RFCDate("2023-05-29"),
  ],
  unions: [
    {
      type: "obj2",
      value: "<value>",
    },
  ],
};
```

## Fields

| Field                                  | Type                                   | Required                               | Description                            |
| -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- |
| `dates`                                | [RFCDate](../../../types/rfcdate.md)[] | :heavy_check_mark:                     | N/A                                    |
| `unions`                               | *shared.TypedObjectOneOf*[]            | :heavy_check_mark:                     | N/A                                    |