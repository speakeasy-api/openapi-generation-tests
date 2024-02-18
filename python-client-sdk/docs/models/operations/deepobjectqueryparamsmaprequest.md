# DeepObjectQueryParamsMapRequest


## Fields

| Field                                               | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `map_param`                                         | Dict[str, *str*]                                    | :heavy_check_mark:                                  | N/A                                                 | {"test":"value","test2":"value2"}                   |
| `map_arr_param`                                     | Dict[str, List[*str*]]                              | :heavy_minus_sign:                                  | N/A                                                 | {"test":["test","test2"],"test2":["test3","test4"]} |