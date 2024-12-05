# RichCompletionEvent

Represents a single event in a completion stream

## Example Usage

```typescript
import { RichCompletionEvent } from "openapi/sdk/models/shared";

let value: RichCompletionEvent = {
  data: {
    completion: "<value>",
    stopReason: "stop_sequence",
  },
  id: "<id>",
};
```

## Fields

| Field                                                                                   | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `data`                                                                                  | [shared.RichCompletionEventData](../../../sdk/models/shared/richcompletioneventdata.md) | :heavy_check_mark:                                                                      | N/A                                                                                     |
| `event`                                                                                 | *string*                                                                                | :heavy_check_mark:                                                                      | N/A                                                                                     |
| `id`                                                                                    | *string*                                                                                | :heavy_check_mark:                                                                      | N/A                                                                                     |