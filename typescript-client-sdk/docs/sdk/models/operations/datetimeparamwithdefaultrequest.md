# DateTimeParamWithDefaultRequest

## Example Usage

```typescript
import { DateTimeParamWithDefaultRequest } from "openapi/sdk/models/operations";

let value: DateTimeParamWithDefaultRequest = {
  dateTimeInput: new Date("2023-10-13T12:42:42.999+00:00"),
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `dateTimeInput`                                                                               | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_check_mark:                                                                            | A date time parameter with a default value                                                    |