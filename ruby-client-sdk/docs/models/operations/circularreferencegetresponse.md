# CircularReferenceGetResponse


## Fields

| Field                                                                                                  | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `content_type`                                                                                         | *String*                                                                                               | :heavy_check_mark:                                                                                     | N/A                                                                                                    |
| `status_code`                                                                                          | *Integer*                                                                                              | :heavy_check_mark:                                                                                     | N/A                                                                                                    |
| `raw_response`                                                                                         | [Faraday::Response](https://www.rubydoc.info/gems/faraday/Faraday/Response)                            | :heavy_minus_sign:                                                                                     | N/A                                                                                                    |
| `valid_circular_reference_object`                                                                      | [T.nilable(Shared::ValidCircularReferenceObject)](../../models/shared/validcircularreferenceobject.md) | :heavy_minus_sign:                                                                                     | OK                                                                                                     |