# FormQueryParamsArrayArgs

## Example Usage

```typescript
import { FormQueryParamsArrayArgs } from "openapi/sdk/models/operations";

let value: FormQueryParamsArrayArgs = {
    arrParam: "test,test2",
    arrParamExploded: ["1", "2"],
};
```

## Fields

| Field              | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `arrParam`         | *string*           | :heavy_check_mark: | N/A                | test,test2         |
| `arrParamExploded` | *string*[]         | :heavy_check_mark: | N/A                |                    |