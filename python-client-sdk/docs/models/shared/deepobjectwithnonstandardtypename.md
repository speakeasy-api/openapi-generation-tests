# DeepObjectWithNonStandardTypeName


## Fields

| Field                                                                                                                                                             | Type                                                                                                                                                              | Required                                                                                                                                                          | Description                                                                                                                                                       | Example                                                                                                                                                           |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `any`                                                                                                                                                             | [shared.DeepObjectWithNonStandardTypeNameAny](../../models/shared/deepobjectwithnonstandardtypenameany.md)                                                        | :heavy_check_mark:                                                                                                                                                | N/A                                                                                                                                                               | anyOf[0]                                                                                                                                                          |
| `arr`                                                                                                                                                             | List[[shared.SimpleObject](../../models/shared/simpleobject.md)]                                                                                                  | :heavy_check_mark:                                                                                                                                                | N/A                                                                                                                                                               | [<br/>"...",<br/>"..."<br/>]                                                                                                                                      |
| `bool`                                                                                                                                                            | *bool*                                                                                                                                                            | :heavy_check_mark:                                                                                                                                                | N/A                                                                                                                                                               | true                                                                                                                                                              |
| `int`                                                                                                                                                             | *int*                                                                                                                                                             | :heavy_check_mark:                                                                                                                                                | N/A                                                                                                                                                               | 1                                                                                                                                                                 |
| `map`                                                                                                                                                             | Dict[str, [shared.SimpleObject](../../models/shared/simpleobject.md)]                                                                                             | :heavy_check_mark:                                                                                                                                                | N/A                                                                                                                                                               | {<br/>"key": "...",<br/>"key2": "..."<br/>}                                                                                                                       |
| `num`                                                                                                                                                             | *float*                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                | N/A                                                                                                                                                               | 1.1                                                                                                                                                               |
| `obj`                                                                                                                                                             | [shared.SimpleObject](../../models/shared/simpleobject.md)                                                                                                        | :heavy_check_mark:                                                                                                                                                | A simple object that uses all our supported primitive types and enums and has optional properties.<br/><br/>[A link to the external docs.](https://docs.speakeasyapi.dev) |                                                                                                                                                                   |
| `str_`                                                                                                                                                            | *str*                                                                                                                                                             | :heavy_check_mark:                                                                                                                                                | N/A                                                                                                                                                               | test                                                                                                                                                              |
| `obj_type`                                                                                                                                                        | *Optional[str]*                                                                                                                                                   | :heavy_minus_sign:                                                                                                                                                | N/A                                                                                                                                                               |                                                                                                                                                                   |
| `type`                                                                                                                                                            | *Optional[str]*                                                                                                                                                   | :heavy_minus_sign:                                                                                                                                                | N/A                                                                                                                                                               |                                                                                                                                                                   |