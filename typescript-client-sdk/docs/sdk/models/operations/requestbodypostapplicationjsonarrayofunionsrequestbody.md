# RequestBodyPostApplicationJsonArrayOfUnionsRequestBody

## Example Usage

```typescript
import { RequestBodyPostApplicationJsonArrayOfUnionsRequestBody } from "openapi/sdk/models/operations";
import { RFCDate } from "openapi/sdk/types";

let value: RequestBodyPostApplicationJsonArrayOfUnionsRequestBody = {
  dates: [
    new RFCDate("2025-11-07"),
  ],
  unions: [
    {
      type: "obj3",
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