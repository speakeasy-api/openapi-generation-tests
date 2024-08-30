# SampleFile

## Example Usage

```typescript
import { SampleFile } from "openapi/sdk/models/operations";

let value: SampleFile = {
    content: new TextEncoder().encode("0xFf26AB98eD"),
    fileName: "your_file_here",
};
```

## Fields

| Field              | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `content`          | *Uint8Array*       | :heavy_check_mark: | N/A                |
| `fileName`         | *string*           | :heavy_check_mark: | N/A                |