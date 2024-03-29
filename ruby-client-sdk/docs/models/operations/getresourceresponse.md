# GetResourceResponse


## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `content_type`                                                               | *String*                                                                     | :heavy_check_mark:                                                           | HTTP response content type for this operation                                |
| `example_resource`                                                           | [T.nilable(Shared::ExampleResource)](../../models/shared/exampleresource.md) | :heavy_minus_sign:                                                           | OK                                                                           |
| `status_code`                                                                | *Integer*                                                                    | :heavy_check_mark:                                                           | HTTP response status code for this operation                                 |
| `raw_response`                                                               | [Faraday::Response](https://www.rubydoc.info/gems/faraday/Faraday/Response)  | :heavy_minus_sign:                                                           | Raw HTTP response; suitable for custom response parsing                      |