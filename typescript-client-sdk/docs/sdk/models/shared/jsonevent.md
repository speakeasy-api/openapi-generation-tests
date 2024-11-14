# JsonEvent

Represents a single event in a json stream

## Example Usage

```typescript
import { JsonEvent } from "openapi/sdk/models/shared";

let value: JsonEvent = {
  data: {
    content: "<value>",
  },
};
```

## Fields

| Field                                                               | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `data`                                                              | [shared.JsonEventData](../../../sdk/models/shared/jsoneventdata.md) | :heavy_check_mark:                                                  | N/A                                                                 |