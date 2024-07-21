# TaggedError1


## Fields

| Field                                                                                 | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `error`                                                                               | *str*                                                                                 | :heavy_check_mark:                                                                    | N/A                                                                                   |
| `tag`                                                                                 | [errors.Tag](../../models/errors/tag.md)                                              | :heavy_check_mark:                                                                    | N/A                                                                                   |
| `raw_response`                                                                        | [requests.Response](https://requests.readthedocs.io/en/latest/api/#requests.Response) | :heavy_minus_sign:                                                                    | Raw HTTP response; suitable for custom response parsing                               |