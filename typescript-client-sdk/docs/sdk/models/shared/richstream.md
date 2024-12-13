# RichStream


## Supported Types

### `shared.RichCompletionEvent`

```typescript
const value: shared.RichCompletionEvent = {
  data: {
    completion: "<value>",
    stopReason: "max_tokens",
  },
  id: "<id>",
};
```

### `shared.HeartbeatEvent`

```typescript
const value: shared.HeartbeatEvent = {
  data: "<value>",
};
```

