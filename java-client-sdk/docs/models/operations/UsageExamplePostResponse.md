# UsageExamplePostResponse


## Fields

| Field                                                                                                                    | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `contentType`                                                                                                            | *String*                                                                                                                 | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `statusCode`                                                                                                             | *Integer*                                                                                                                | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `rawResponse`                                                                                                            | [HttpResponse<byte[]>](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpResponse.html) | :heavy_minus_sign:                                                                                                       | N/A                                                                                                                      |
| `usageExamplePost200ApplicationJSONObject`                                                                               | [UsageExamplePost200ApplicationJSON](../../models/operations/UsageExamplePost200ApplicationJSON.md)                      | :heavy_minus_sign:                                                                                                       | A successful response that contains the simpleObject sent in the request body                                            |