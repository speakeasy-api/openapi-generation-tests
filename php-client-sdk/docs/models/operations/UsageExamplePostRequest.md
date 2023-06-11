# UsageExamplePostRequest


## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      | Example                                                                                          |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `requestBody`                                                                                    | [?UsageExamplePostRequestBody](../../models/operations/UsageExamplePostRequestBody.md)           | :heavy_minus_sign:                                                                               | A request body that contains fields with different formats for testing example generation        |                                                                                                  |
| `boolParameter`                                                                                  | *bool*                                                                                           | :heavy_check_mark:                                                                               | A boolean parameter                                                                              | false                                                                                            |
| `dateParameter`                                                                                  | [\DateTime](https://www.php.net/manual/en/class.datetime.php)                                    | :heavy_check_mark:                                                                               | A date parameter                                                                                 | 2020-01-01                                                                                       |
| `dateTimeParameter`                                                                              | [\DateTime](https://www.php.net/manual/en/class.datetime.php)                                    | :heavy_check_mark:                                                                               | A date time parameter                                                                            | 2020-01-01T00:00:00Z                                                                             |
| `doubleParameter`                                                                                | *float*                                                                                          | :heavy_check_mark:                                                                               | A double parameter                                                                               | 2.2222222                                                                                        |
| `enumParameter`                                                                                  | [UsageExamplePostEnumParameter](../../models/operations/UsageExamplePostEnumParameter.md)        | :heavy_check_mark:                                                                               | An enum parameter                                                                                | value3                                                                                           |
| `falseyNumberParameter`                                                                          | *float*                                                                                          | :heavy_check_mark:                                                                               | A number parameter that contains a falsey example value                                          | 0                                                                                                |
| `floatParameter`                                                                                 | *float*                                                                                          | :heavy_check_mark:                                                                               | A float parameter                                                                                | 1.1                                                                                              |
| `int64Parameter`                                                                                 | *int*                                                                                            | :heavy_check_mark:                                                                               | An int64 parameter                                                                               | 111111                                                                                           |
| `intParameter`                                                                                   | *int*                                                                                            | :heavy_check_mark:                                                                               | An integer parameter                                                                             | 1                                                                                                |
| `optEnumParameter`                                                                               | [?UsageExamplePostOptEnumParameter](../../models/operations/UsageExamplePostOptEnumParameter.md) | :heavy_minus_sign:                                                                               | An enum parameter                                                                                | value3                                                                                           |
| `strParameter`                                                                                   | *string*                                                                                         | :heavy_check_mark:                                                                               | A string parameter                                                                               | example 1                                                                                        |