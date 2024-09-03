# ChatCompletionEvent

Represents a chat completion event which contains printable content

## Example Usage

```typescript
import { ChatCompletionEvent } from "openapi/sdk/models/shared";

let value: ChatCompletionEvent = {
    data: {
        content: "<value>",
    },
};
```

## Fields

| Field                                             | Type                                              | Required                                          | Description                                       |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| `data`                                            | [shared.Data](../../../sdk/models/shared/data.md) | :heavy_check_mark:                                | N/A                                               |