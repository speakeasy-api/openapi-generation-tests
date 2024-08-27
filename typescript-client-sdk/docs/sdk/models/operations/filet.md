# FileT

## Example Usage

```typescript
import { FileT } from "openapi/sdk/models/operations";

let value: FileT = {
    content: new TextEncoder().encode("0xDce4DEe99C"),
    fileName: "your_file_here",
};
```

## Fields

| Field              | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `content`          | *Uint8Array*       | :heavy_check_mark: | N/A                |
| `fileName`         | *string*           | :heavy_check_mark: | N/A                |