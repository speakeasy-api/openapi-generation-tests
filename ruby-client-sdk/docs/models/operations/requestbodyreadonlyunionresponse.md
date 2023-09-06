# RequestBodyReadOnlyUnionResponse


## Fields

| Field                                                                       | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `content_type`                                                              | *String*                                                                    | :heavy_check_mark:                                                          | N/A                                                                         |
| `status_code`                                                               | *Integer*                                                                   | :heavy_check_mark:                                                          | N/A                                                                         |
| `raw_response`                                                              | [Faraday::Response](https://www.rubydoc.info/gems/faraday/Faraday/Response) | :heavy_minus_sign:                                                          | N/A                                                                         |
| `weakly_typed_one_of_read_only_object`                                      | *T.nilable(Object)*                                                         | :heavy_minus_sign:                                                          | OK                                                                          |