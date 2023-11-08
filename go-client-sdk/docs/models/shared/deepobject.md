# DeepObject


## Fields

| Field                                                                                                                                                             | Type                                                                                                                                                              | Required                                                                                                                                                          | Description                                                                                                                                                       | Example                                                                                                                                                           |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `Any`                                                                                                                                                             | [shared.Any](../../models/shared/any.md)                                                                                                                          | :heavy_check_mark:                                                                                                                                                | N/A                                                                                                                                                               | anyOf[0]                                                                                                                                                          |
| `Arr`                                                                                                                                                             | [][shared.SimpleObject](../../models/shared/simpleobject.md)                                                                                                      | :heavy_check_mark:                                                                                                                                                | N/A                                                                                                                                                               | ...,...                                                                                                                                                           |
| `Bool`                                                                                                                                                            | *bool*                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                | N/A                                                                                                                                                               | true                                                                                                                                                              |
| `Int`                                                                                                                                                             | *int64*                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                | N/A                                                                                                                                                               | 1                                                                                                                                                                 |
| `Map`                                                                                                                                                             | map[string][shared.SimpleObject](../../models/shared/simpleobject.md)                                                                                             | :heavy_check_mark:                                                                                                                                                | N/A                                                                                                                                                               | [object Object]                                                                                                                                                   |
| `Num`                                                                                                                                                             | *float64*                                                                                                                                                         | :heavy_check_mark:                                                                                                                                                | N/A                                                                                                                                                               | 1.1                                                                                                                                                               |
| `Obj`                                                                                                                                                             | [shared.SimpleObject](../../models/shared/simpleobject.md)                                                                                                        | :heavy_check_mark:                                                                                                                                                | A simple object that uses all our supported primitive types and enums and has optional properties.<br/><br/>[A link to the external docs.](https://docs.speakeasyapi.dev) |                                                                                                                                                                   |
| `Str`                                                                                                                                                             | *string*                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                | N/A                                                                                                                                                               | test                                                                                                                                                              |
| `Type`                                                                                                                                                            | **string*                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                | N/A                                                                                                                                                               |                                                                                                                                                                   |