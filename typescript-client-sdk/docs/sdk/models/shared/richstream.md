# RichStream

## Example Usage

```typescript
import { RichStream } from "openapi/sdk/models/shared";

let value: RichStream = {
  data: {
    completion: "<value>",
    stopReason: "max_tokens",
  },
  id: "<id>",
};
```

## Supported Types

### `shared.RichCompletionEvent`

```typescript
const value: shared.RichCompletionEvent = /* values here */
```

### `shared.HeartbeatEvent`

```typescript
const value: shared.HeartbeatEvent = /* values here */
```

