# CreateFileFile

## Example Usage

```typescript
import { CreateFileFile } from "openapi/sdk/models/operations";

let value: CreateFileFile = {
    content: new TextEncoder().encode("0xA6F95Ac8dD"),
    fileName: "your_file_here",
};
```

## Fields

| Field              | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `content`          | *Uint8Array*       | :heavy_check_mark: | N/A                |
| `fileName`         | *string*           | :heavy_check_mark: | N/A                |