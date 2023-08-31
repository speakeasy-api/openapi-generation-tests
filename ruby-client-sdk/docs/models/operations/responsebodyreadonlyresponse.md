# ResponseBodyReadOnlyResponse


## Fields

| Field                                                                       | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `content_type`                                                              | *String*                                                                    | :heavy_check_mark:                                                          | N/A                                                                         |
| `status_code`                                                               | *Integer*                                                                   | :heavy_check_mark:                                                          | N/A                                                                         |
| `raw_response`                                                              | [Faraday::Response](https://www.rubydoc.info/gems/faraday/Faraday/Response) | :heavy_minus_sign:                                                          | N/A                                                                         |
| `read_only_object`                                                          | [T.nilable(Shared::ReadOnlyObject)](../../models/shared/readonlyobject.md)  | :heavy_minus_sign:                                                          | OK                                                                          |