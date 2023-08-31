# DeprecatedObjectInSchemaGetResponse


## Fields

| Field                                                                                                                      | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `ContentType`                                                                                                              | *string*                                                                                                                   | :heavy_check_mark:                                                                                                         | N/A                                                                                                                        |
| `StatusCode`                                                                                                               | *int*                                                                                                                      | :heavy_check_mark:                                                                                                         | N/A                                                                                                                        |
| `RawResponse`                                                                                                              | [*http.Response](https://pkg.go.dev/net/http#Response)                                                                     | :heavy_minus_sign:                                                                                                         | N/A                                                                                                                        |
| `DeprecatedObjectInSchemaGet200ApplicationJSONObject`                                                                      | [*DeprecatedObjectInSchemaGet200ApplicationJSON](../../models/operations/deprecatedobjectinschemaget200applicationjson.md) | :heavy_minus_sign:                                                                                                         | A successful response that contains a deprecatedObject sent in the request body                                            |