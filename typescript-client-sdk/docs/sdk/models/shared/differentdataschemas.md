# DifferentDataSchemas

Represents an event with different schemas for the data property

## Example Usage

```typescript
import { DifferentDataSchemas } from "openapi/sdk/models/shared";

let value: DifferentDataSchemas = {
    data: {
        url: "https://rotten-noir.com",
    },
    event: "url",
    id: "<id>",
};
```

## Fields

| Field                                               | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `data`                                              | *shared.DifferentDataSchemasData*                   | :heavy_check_mark:                                  | N/A                                                 |
| `event`                                             | [shared.Event](../../../sdk/models/shared/event.md) | :heavy_check_mark:                                  | N/A                                                 |
| `id`                                                | *string*                                            | :heavy_check_mark:                                  | N/A                                                 |