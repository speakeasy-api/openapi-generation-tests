# Color

## Example Usage

```typescript
import { Color } from "openapi/sdk/models/shared";

let value: Color = "green";
```

## Values

This is an open enum. Unrecognized values will be captured as the `Unrecognized<string>` branded type.

```typescript
"red" | "green" | "blue" | "return" | "class" | "int" | Unrecognized<string>
```