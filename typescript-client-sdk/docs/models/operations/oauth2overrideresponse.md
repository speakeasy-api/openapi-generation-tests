# Oauth2OverrideResponse


## Fields

| Field                                                                 | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `contentType`                                                         | *string*                                                              | :heavy_check_mark:                                                    | N/A                                                                   |
| `statusCode`                                                          | *number*                                                              | :heavy_check_mark:                                                    | N/A                                                                   |
| `rawResponse`                                                         | [AxiosResponse](https://axios-http.com/docs/res_schema)               | :heavy_minus_sign:                                                    | N/A                                                                   |
| `token`                                                               | [Oauth2OverrideToken](../../models/operations/oauth2overridetoken.md) | :heavy_minus_sign:                                                    | Successful authentication.                                            |