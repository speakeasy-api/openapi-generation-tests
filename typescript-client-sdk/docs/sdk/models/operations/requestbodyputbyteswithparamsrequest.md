# RequestBodyPutBytesWithParamsRequest

## Example Usage

```typescript
import { RequestBodyPutBytesWithParamsRequest } from "openapi/sdk/models/operations";

let value: RequestBodyPutBytesWithParamsRequest = {
    requestBody: new TextEncoder().encode("0x2efC6548cc"),
    queryStringParam: "<value>",
};
```

## Fields

| Field              | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `requestBody`      | *Uint8Array*       | :heavy_check_mark: | N/A                |
| `queryStringParam` | *string*           | :heavy_check_mark: | N/A                |