# GetGlobalNameOverrideResponse


## Fields

| Field                                                                                                          | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `ContentType`                                                                                                  | *string*                                                                                                       | :heavy_check_mark:                                                                                             | N/A                                                                                                            |
| `StatusCode`                                                                                                   | *int*                                                                                                          | :heavy_check_mark:                                                                                             | N/A                                                                                                            |
| `RawResponse`                                                                                                  | [*http.Response](https://pkg.go.dev/net/http#Response)                                                         | :heavy_minus_sign:                                                                                             | N/A                                                                                                            |
| `GetGlobalNameOverride200ApplicationJSONObject`                                                                | [*GetGlobalNameOverride200ApplicationJSON](../../models/operations/getglobalnameoverride200applicationjson.md) | :heavy_minus_sign:                                                                                             | A successful response that contains the simpleObject sent in the request body                                  |