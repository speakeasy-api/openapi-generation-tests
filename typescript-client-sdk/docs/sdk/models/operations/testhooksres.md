# TestHooksRes

OK

## Example Usage

```typescript
import { TestHooksRes } from "openapi/sdk/models/operations";

let value: TestHooksRes = {
    args: {
        someParam: "overriddenParam",
    },
    headers: {
        clientLevelHeader: "added by client",
        idempotencyKey: "some-key",
    },
    url: "http://localhost:35123/anything/hooks?someParam=overriddenParam",
};
```

## Fields

| Field                                                                       | Type                                                                        | Required                                                                    | Description                                                                 | Example                                                                     |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `args`                                                                      | [operations.TestHooksArgs](../../../sdk/models/operations/testhooksargs.md) | :heavy_check_mark:                                                          | N/A                                                                         |                                                                             |
| `headers`                                                                   | [operations.Headers](../../../sdk/models/operations/headers.md)             | :heavy_check_mark:                                                          | N/A                                                                         |                                                                             |
| `url`                                                                       | *string*                                                                    | :heavy_check_mark:                                                          | N/A                                                                         | http://localhost:35123/anything/hooks?someParam=overriddenParam             |