# SimpleObjectWithType

A simple object that uses all our supported primitive types and enums and has optional properties.

A link to the external docs.
<https://docs.speakeasyapi.dev>


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               | Example                                                                                   |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `any`                                                                                     | *Object*                                                                                  | :heavy_check_mark:                                                                        | An any property.                                                                          |                                                                                           |
| `bigint`                                                                                  | *Long*                                                                                    | :heavy_minus_sign:                                                                        | N/A                                                                                       |                                                                                           |
| `bigintStr`                                                                               | *String*                                                                                  | :heavy_minus_sign:                                                                        | N/A                                                                                       |                                                                                           |
| `bool`                                                                                    | *Boolean*                                                                                 | :heavy_check_mark:                                                                        | A boolean property.                                                                       | true                                                                                      |
| `boolOpt`                                                                                 | *Boolean*                                                                                 | :heavy_minus_sign:                                                                        | An optional boolean property.                                                             | true                                                                                      |
| `date`                                                                                    | [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html)           | :heavy_check_mark:                                                                        | A date property.                                                                          | 2020-01-01                                                                                |
| `dateTime`                                                                                | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_check_mark:                                                                        | A date-time property.                                                                     | 2020-01-01T00:00:00Z                                                                      |
| `enum_`                                                                                   | [Enum](../../models/shared/Enum.md)                                                       | :heavy_check_mark:                                                                        | An string based enum                                                                      | two                                                                                       |
| `float32`                                                                                 | *Double*                                                                                  | :heavy_check_mark:                                                                        | A float32 property.                                                                       | 2.2222222                                                                                 |
| `int_`                                                                                    | *Long*                                                                                    | :heavy_check_mark:                                                                        | An integer property.                                                                      | 999999                                                                                    |
| `int32`                                                                                   | *Integer*                                                                                 | :heavy_check_mark:                                                                        | An int32 property.                                                                        | 1                                                                                         |
| `int32Enum`                                                                               | [SimpleObjectWithTypeInt32Enum](../../models/shared/SimpleObjectWithTypeInt32Enum.md)     | :heavy_check_mark:                                                                        | An int32 enum property.                                                                   | 69                                                                                        |
| `intEnum`                                                                                 | [SimpleObjectWithTypeIntEnum](../../models/shared/SimpleObjectWithTypeIntEnum.md)         | :heavy_check_mark:                                                                        | An integer enum property.                                                                 | 3                                                                                         |
| `intOptNull`                                                                              | *Long*                                                                                    | :heavy_minus_sign:                                                                        | An optional integer property will be null for tests.                                      | 999999                                                                                    |
| `num`                                                                                     | *Double*                                                                                  | :heavy_check_mark:                                                                        | A number property.                                                                        | 1.1                                                                                       |
| `numOptNull`                                                                              | *Double*                                                                                  | :heavy_minus_sign:                                                                        | An optional number property will be null for tests.                                       | 1.1                                                                                       |
| `str`                                                                                     | *String*                                                                                  | :heavy_check_mark:                                                                        | A string property.                                                                        | example                                                                                   |
| `strOpt`                                                                                  | *String*                                                                                  | :heavy_minus_sign:                                                                        | An optional string property.                                                              | optional example                                                                          |
| `type`                                                                                    | *String*                                                                                  | :heavy_check_mark:                                                                        | N/A                                                                                       |                                                                                           |