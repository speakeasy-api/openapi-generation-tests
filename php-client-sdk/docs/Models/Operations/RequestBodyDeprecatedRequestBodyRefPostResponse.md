# RequestBodyDeprecatedRequestBodyRefPostResponse


## Fields

| Field                                                                                                                                             | Type                                                                                                                                              | Required                                                                                                                                          | Description                                                                                                                                       | Example                                                                                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- |
| `contentType`                                                                                                                                     | *string*                                                                                                                                          | :heavy_check_mark:                                                                                                                                | HTTP response content type for this operation                                                                                                     |                                                                                                                                                   |
| `statusCode`                                                                                                                                      | *int*                                                                                                                                             | :heavy_check_mark:                                                                                                                                | HTTP response status code for this operation                                                                                                      |                                                                                                                                                   |
| `rawResponse`                                                                                                                                     | [\Psr\Http\Message\ResponseInterface](https://www.php-fig.org/psr/psr-7/#33-psrhttpmessageresponseinterface)                                      | :heavy_check_mark:                                                                                                                                | Raw HTTP response; suitable for custom response parsing                                                                                           |                                                                                                                                                   |
| `object`                                                                                                                                          | [?Operations\RequestBodyDeprecatedRequestBodyRefPostResponseBody](../../Models/Operations/RequestBodyDeprecatedRequestBodyRefPostResponseBody.md) | :heavy_minus_sign:                                                                                                                                | OK                                                                                                                                                | {<br/>"json": {<br/>"str": "testvalue"<br/>}<br/>}                                                                                                |