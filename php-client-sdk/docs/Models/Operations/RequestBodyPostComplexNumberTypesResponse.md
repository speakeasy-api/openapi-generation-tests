# RequestBodyPostComplexNumberTypesResponse


## Fields

| Field                                                                                                                                                         | Type                                                                                                                                                          | Required                                                                                                                                                      | Description                                                                                                                                                   |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `contentType`                                                                                                                                                 | *string*                                                                                                                                                      | :heavy_check_mark:                                                                                                                                            | HTTP response content type for this operation                                                                                                                 |
| `statusCode`                                                                                                                                                  | *int*                                                                                                                                                         | :heavy_check_mark:                                                                                                                                            | HTTP response status code for this operation                                                                                                                  |
| `rawResponse`                                                                                                                                                 | [\Psr\Http\Message\ResponseInterface](https://www.php-fig.org/psr/psr-7/#33-psrhttpmessageresponseinterface)                                                  | :heavy_minus_sign:                                                                                                                                            | Raw HTTP response; suitable for custom response parsing                                                                                                       |
| `object`                                                                                                                                                      | [?\OpenAPI\OpenAPI\Models\Operations\RequestBodyPostComplexNumberTypesResponseBody](../../Models/Operations/RequestBodyPostComplexNumberTypesResponseBody.md) | :heavy_minus_sign:                                                                                                                                            | OK                                                                                                                                                            |