# RichCompletionEventData

## Example Usage

```typescript
import { RichCompletionEventData } from "openapi/sdk/models/shared";

let value: RichCompletionEventData = {
  completion: "<value>",
  stopReason: "max_tokens",
};
```

## Fields

| Field                                                         | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `completion`                                                  | *string*                                                      | :heavy_check_mark:                                            | N/A                                                           |
| `model`                                                       | *string*                                                      | :heavy_minus_sign:                                            | N/A                                                           |
| `stopReason`                                                  | [shared.StopReason](../../../sdk/models/shared/stopreason.md) | :heavy_check_mark:                                            | N/A                                                           |