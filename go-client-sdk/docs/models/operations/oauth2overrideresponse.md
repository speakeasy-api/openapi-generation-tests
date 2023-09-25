# Oauth2OverrideResponse


## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `ContentType`                                                          | *string*                                                               | :heavy_check_mark:                                                     | HTTP response content type for this operation                          |
| `StatusCode`                                                           | *int*                                                                  | :heavy_check_mark:                                                     | HTTP response status code for this operation                           |
| `RawResponse`                                                          | [*http.Response](https://pkg.go.dev/net/http#Response)                 | :heavy_minus_sign:                                                     | Raw HTTP response; suitable for custom response parsing                |
| `Token`                                                                | [*Oauth2OverrideToken](../../models/operations/oauth2overridetoken.md) | :heavy_minus_sign:                                                     | Successful authentication.                                             |