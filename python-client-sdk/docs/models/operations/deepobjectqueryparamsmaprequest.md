# DeepObjectQueryParamsMapRequest


## Fields

| Field                                                          | Type                                                           | Required                                                       | Description                                                    | Example                                                        |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `map_param`                                                    | Dict[str, *str*]                                               | :heavy_check_mark:                                             | N/A                                                            | {<br/>"test": "value",<br/>"test2": "value2"<br/>}             |
| `map_arr_param`                                                | Dict[str, List[*str*]]                                         | :heavy_minus_sign:                                             | N/A                                                            | {<br/>"test": [<br/>"test",<br/>"test2"<br/>],<br/>"test2": [<br/>"test3",<br/>"test4"<br/>]<br/>} |