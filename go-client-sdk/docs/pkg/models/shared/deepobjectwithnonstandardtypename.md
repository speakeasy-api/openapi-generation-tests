# DeepObjectWithNonStandardTypeName


## Fields

| Field                                                                                                                                                          | Type                                                                                                                                                           | Required                                                                                                                                                       | Description                                                                                                                                                    | Example                                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `Any`                                                                                                                                                          | [shared.DeepObjectWithNonStandardTypeNameAny](../../../pkg/models/shared/deepobjectwithnonstandardtypenameany.md)                                              | :heavy_check_mark:                                                                                                                                             | N/A                                                                                                                                                            | anyOf[0]                                                                                                                                                       |
| `Arr`                                                                                                                                                          | [][shared.SimpleObject](../../../pkg/models/shared/simpleobject.md)                                                                                            | :heavy_check_mark:                                                                                                                                             | N/A                                                                                                                                                            | [<br/>"...",<br/>"..."<br/>]                                                                                                                                   |
| `Bool`                                                                                                                                                         | *bool*                                                                                                                                                         | :heavy_check_mark:                                                                                                                                             | N/A                                                                                                                                                            | true                                                                                                                                                           |
| `Int`                                                                                                                                                          | *int64*                                                                                                                                                        | :heavy_check_mark:                                                                                                                                             | N/A                                                                                                                                                            | 1                                                                                                                                                              |
| `Map`                                                                                                                                                          | map[string][shared.SimpleObject](../../../pkg/models/shared/simpleobject.md)                                                                                   | :heavy_check_mark:                                                                                                                                             | N/A                                                                                                                                                            | {<br/>"key": "...",<br/>"key2": "..."<br/>}                                                                                                                    |
| `Num`                                                                                                                                                          | *float64*                                                                                                                                                      | :heavy_check_mark:                                                                                                                                             | N/A                                                                                                                                                            | 1.1                                                                                                                                                            |
| `Obj`                                                                                                                                                          | [shared.SimpleObject](../../../pkg/models/shared/simpleobject.md)                                                                                              | :heavy_check_mark:                                                                                                                                             | A simple object that uses all our supported primitive types and enums and has optional properties.<br/><br/>[A link to the external docs.](https://speakeasy.com/docs) |                                                                                                                                                                |
| `ObjType`                                                                                                                                                      | **string*                                                                                                                                                      | :heavy_minus_sign:                                                                                                                                             | N/A                                                                                                                                                            |                                                                                                                                                                |
| `Str`                                                                                                                                                          | *string*                                                                                                                                                       | :heavy_check_mark:                                                                                                                                             | N/A                                                                                                                                                            | test                                                                                                                                                           |
| `Type`                                                                                                                                                         | **string*                                                                                                                                                      | :heavy_minus_sign:                                                                                                                                             | N/A                                                                                                                                                            |                                                                                                                                                                |