# DateParamWithDefaultRequest

## Example Usage

```typescript
import { DateParamWithDefaultRequest } from "openapi/sdk/models/operations";
import { RFCDate } from "openapi/sdk/types";

let value: DateParamWithDefaultRequest = {
  dateInput: new RFCDate("2023-10-13"),
};
```

## Fields

| Field                                 | Type                                  | Required                              | Description                           |
| ------------------------------------- | ------------------------------------- | ------------------------------------- | ------------------------------------- |
| `dateInput`                           | [RFCDate](../../../types/rfcdate.md)  | :heavy_check_mark:                    | A date parameter with a default value |