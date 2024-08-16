# Headers

## Example Usage

```typescript
import { Headers } from "openapi/sdk/models/operations";

let value: Headers = {
    clientLevelHeader: "added by client",
    idempotencyKey: "some-key",
};
```

## Fields

| Field               | Type                | Required            | Description         | Example             |
| ------------------- | ------------------- | ------------------- | ------------------- | ------------------- |
| `clientLevelHeader` | *string*            | :heavy_minus_sign:  | N/A                 | added by client     |
| `idempotencyKey`    | *string*            | :heavy_minus_sign:  | N/A                 | some-key            |