# ResponseBodyOptionalGetResponse


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `contentType`                                                     | *string*                                                          | :heavy_check_mark:                                                | HTTP response content type for this operation                     |
| `statusCode`                                                      | *number*                                                          | :heavy_check_mark:                                                | HTTP response status code for this operation                      |
| `rawResponse`                                                     | [AxiosResponse](https://axios-http.com/docs/res_schema)           | :heavy_minus_sign:                                                | Raw HTTP response; suitable for custom response parsing           |
| `res`                                                             | *string*                                                          | :heavy_minus_sign:                                                | OK                                                                |
| `typedObject1`                                                    | [shared.TypedObject1](../../../sdk/models/shared/typedobject1.md) | :heavy_minus_sign:                                                | OK                                                                |