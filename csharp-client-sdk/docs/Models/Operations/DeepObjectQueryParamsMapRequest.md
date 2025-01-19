# DeepObjectQueryParamsMapRequest


## Fields

| Field                                                          | Type                                                           | Required                                                       | Description                                                    | Example                                                        |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `MapParam`                                                     | Dictionary<String, *string*>                                   | :heavy_check_mark:                                             | N/A                                                            | {<br/>"test": "value",<br/>"test2": "value2"<br/>}             |
| `MapArrParam`                                                  | Dictionary<String, List<*string*>>                             | :heavy_minus_sign:                                             | N/A                                                            | {<br/>"test": [<br/>"test",<br/>"test2"<br/>],<br/>"test2": [<br/>"test3",<br/>"test4"<br/>]<br/>} |