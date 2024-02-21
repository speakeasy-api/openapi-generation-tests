# DeepObjectQueryParamsMapRequest


## Fields

| Field                                               | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `MapParam`                                          | map[string]*string*                                 | :heavy_check_mark:                                  | N/A                                                 | {"test":"value","test2":"value2"}                   |
| `MapArrParam`                                       | map[string][]*string*                               | :heavy_minus_sign:                                  | N/A                                                 | {"test":["test","test2"],"test2":["test3","test4"]} |