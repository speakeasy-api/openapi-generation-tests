# DeprecatedObjectInSchemaGetResponse


## Fields

| Field                                                                                                                                            | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `content_type`                                                                                                                                   | *String*                                                                                                                                         | :heavy_check_mark:                                                                                                                               | N/A                                                                                                                                              |
| `status_code`                                                                                                                                    | *Integer*                                                                                                                                        | :heavy_check_mark:                                                                                                                               | N/A                                                                                                                                              |
| `raw_response`                                                                                                                                   | [Faraday::Response](https://www.rubydoc.info/gems/faraday/Faraday/Response)                                                                      | :heavy_minus_sign:                                                                                                                               | N/A                                                                                                                                              |
| `deprecated_object_in_schema_get_200_application_json_object`                                                                                    | [T.nilable(Operations::DeprecatedObjectInSchemaGet200ApplicationJSON)](../../models/operations/deprecatedobjectinschemaget200applicationjson.md) | :heavy_minus_sign:                                                                                                                               | A successful response that contains a deprecatedObject sent in the request body                                                                  |