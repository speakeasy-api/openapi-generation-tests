# Slideshow

## Example Usage

```typescript
import { Slideshow } from "openapi/sdk/models/shared";

let value: Slideshow = {
  author: "<value>",
  date: "2024-08-04",
  slides: [
    {
      title: "<value>",
      type: "<value>",
    },
  ],
  title: "<value>",
};
```

## Fields

| Field                                                   | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `author`                                                | *string*                                                | :heavy_check_mark:                                      | N/A                                                     |
| `date`                                                  | *string*                                                | :heavy_check_mark:                                      | N/A                                                     |
| `slides`                                                | [shared.Slides](../../../sdk/models/shared/slides.md)[] | :heavy_check_mark:                                      | N/A                                                     |
| `title`                                                 | *string*                                                | :heavy_check_mark:                                      | N/A                                                     |