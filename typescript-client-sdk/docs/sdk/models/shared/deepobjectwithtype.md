# DeepObjectWithType


## Fields

| Field                                                                                                                                                             | Type                                                                                                                                                              | Required                                                                                                                                                          | Description                                                                                                                                                       | Example                                                                                                                                                           |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `any`                                                                                                                                                             | *shared.DeepObjectWithTypeAny*                                                                                                                                    | :heavy_check_mark:                                                                                                                                                | N/A                                                                                                                                                               | anyOf[0]                                                                                                                                                          |
| `arr`                                                                                                                                                             | [shared.SimpleObject](../../../sdk/models/shared/simpleobject.md)[]                                                                                               | :heavy_check_mark:                                                                                                                                                | N/A                                                                                                                                                               | ["...","..."]                                                                                                                                                     |
| `bool`                                                                                                                                                            | *boolean*                                                                                                                                                         | :heavy_check_mark:                                                                                                                                                | N/A                                                                                                                                                               | true                                                                                                                                                              |
| `int`                                                                                                                                                             | *number*                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                | N/A                                                                                                                                                               | 1                                                                                                                                                                 |
| `map`                                                                                                                                                             | Record<string, [shared.SimpleObject](../../../sdk/models/shared/simpleobject.md)>                                                                                 | :heavy_check_mark:                                                                                                                                                | N/A                                                                                                                                                               | {"key":"...","key2":"..."}                                                                                                                                        |
| `num`                                                                                                                                                             | *number*                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                | N/A                                                                                                                                                               | 1.1                                                                                                                                                               |
| `obj`                                                                                                                                                             | [shared.SimpleObject](../../../sdk/models/shared/simpleobject.md)                                                                                                 | :heavy_check_mark:                                                                                                                                                | A simple object that uses all our supported primitive types and enums and has optional properties.<br/><br/>[A link to the external docs.](https://docs.speakeasyapi.dev) |                                                                                                                                                                   |
| `str`                                                                                                                                                             | *string*                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                | N/A                                                                                                                                                               | test                                                                                                                                                              |
| `type`                                                                                                                                                            | *string*                                                                                                                                                          | :heavy_minus_sign:                                                                                                                                                | N/A                                                                                                                                                               |                                                                                                                                                                   |