# ExampleResource

## Example Usage

```typescript
import { ExampleResource } from "openapi/sdk/models/shared";

let value: ExampleResource = {
    chocolates: [
        {
            description: "Synchronised contextually-based access",
        },
    ],
    id: "<id>",
    name: "<value>",
    vehicle: {
        make: "<value>",
        model: "Escalade",
        name: "<value>",
        type: "car",
        year: 9441.24,
    },
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `arrayOfNumber`                                                                               | *number*[]                                                                                    | :heavy_minus_sign:                                                                            | N/A                                                                                           |
| `arrayOfString`                                                                               | *string*[]                                                                                    | :heavy_minus_sign:                                                                            | N/A                                                                                           |
| `chocolates`                                                                                  | [shared.Chocolates](../../../sdk/models/shared/chocolates.md)[]                               | :heavy_check_mark:                                                                            | N/A                                                                                           |
| `createdAt`                                                                                   | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | N/A                                                                                           |
| `enumNumber`                                                                                  | [shared.EnumNumber](../../../sdk/models/shared/enumnumber.md)                                 | :heavy_minus_sign:                                                                            | N/A                                                                                           |
| `enumStr`                                                                                     | [shared.EnumStr](../../../sdk/models/shared/enumstr.md)                                       | :heavy_minus_sign:                                                                            | N/A                                                                                           |
| `id`                                                                                          | *string*                                                                                      | :heavy_check_mark:                                                                            | N/A                                                                                           |
| `inlineObject`                                                                                | [shared.InlineObject](../../../sdk/models/shared/inlineobject.md)                             | :heavy_minus_sign:                                                                            | N/A                                                                                           |
| `mapOfInteger`                                                                                | Record<string, *number*>                                                                      | :heavy_minus_sign:                                                                            | N/A                                                                                           |
| `mapOfString`                                                                                 | Record<string, *string*>                                                                      | :heavy_minus_sign:                                                                            | N/A                                                                                           |
| `name`                                                                                        | *string*                                                                                      | :heavy_check_mark:                                                                            | N/A                                                                                           |
| `namePrefix`                                                                                  | *string*                                                                                      | :heavy_minus_sign:                                                                            | N/A                                                                                           |
| `updatedAt`                                                                                   | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | N/A                                                                                           |
| `vehicle`                                                                                     | *shared.ExampleVehicle*                                                                       | :heavy_check_mark:                                                                            | N/A                                                                                           |