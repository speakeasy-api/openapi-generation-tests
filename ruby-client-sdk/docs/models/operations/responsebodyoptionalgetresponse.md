# ResponseBodyOptionalGetResponse


## Fields

| Field                                                                       | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `content_type`                                                              | *String*                                                                    | :heavy_check_mark:                                                          | N/A                                                                         |
| `status_code`                                                               | *Integer*                                                                   | :heavy_check_mark:                                                          | N/A                                                                         |
| `raw_response`                                                              | [Faraday::Response](https://www.rubydoc.info/gems/faraday/Faraday/Response) | :heavy_minus_sign:                                                          | N/A                                                                         |
| `response_body_optional_get_200_text_plain_string`                          | *T.nilable(String)*                                                         | :heavy_minus_sign:                                                          | OK                                                                          |
| `typed_object1`                                                             | [T.nilable(Shared::TypedObject1)](../../models/shared/typedobject1.md)      | :heavy_minus_sign:                                                          | OK                                                                          |