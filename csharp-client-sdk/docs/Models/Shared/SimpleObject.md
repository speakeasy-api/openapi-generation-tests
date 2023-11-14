# SimpleObject

A simple object that uses all our supported primitive types and enums and has optional properties.

A link to the external docs.
<https://docs.speakeasyapi.dev>


## Fields

| Field                                                                                 | Type                                                                                  | Required                                                                              | Description                                                                           | Example                                                                               |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `Any`                                                                                 | *object*                                                                              | :heavy_check_mark:                                                                    | An any property.                                                                      | any                                                                                   |
| `Bool`                                                                                | *bool*                                                                                | :heavy_check_mark:                                                                    | A boolean property.                                                                   | true                                                                                  |
| `Date`                                                                                | [LocalDate](https://nodatime.org/3.1.x/api/NodaTime.LocalDate.html)                   | :heavy_check_mark:                                                                    | A date property.                                                                      | 2020-01-01                                                                            |
| `DateTime`                                                                            | [DateTime](https://learn.microsoft.com/en-us/dotnet/api/system.datetime?view=net-5.0) | :heavy_check_mark:                                                                    | A date-time property.                                                                 | 2020-01-01T00:00:00.000000001Z                                                        |
| `Enum`                                                                                | [Enum](../../Models/Shared/Enum.md)                                                   | :heavy_check_mark:                                                                    | A string based enum                                                                   | one                                                                                   |
| `Float32`                                                                             | *float*                                                                               | :heavy_check_mark:                                                                    | A float32 property.                                                                   | 1.1                                                                                   |
| `Int`                                                                                 | *long*                                                                                | :heavy_check_mark:                                                                    | An integer property.                                                                  | 1                                                                                     |
| `Int32`                                                                               | *int*                                                                                 | :heavy_check_mark:                                                                    | An int32 property.                                                                    | 1                                                                                     |
| `Int32Enum`                                                                           | [Int32Enum](../../Models/Shared/Int32Enum.md)                                         | :heavy_check_mark:                                                                    | An int32 enum property.                                                               | 55                                                                                    |
| `IntEnum`                                                                             | [IntEnum](../../Models/Shared/IntEnum.md)                                             | :heavy_check_mark:                                                                    | An integer enum property.                                                             | 2                                                                                     |
| `Num`                                                                                 | *double*                                                                              | :heavy_check_mark:                                                                    | A number property.                                                                    | 1.1                                                                                   |
| `Str`                                                                                 | *string*                                                                              | :heavy_check_mark:                                                                    | A string property.                                                                    | test                                                                                  |
| `Bigint`                                                                              | *BigInteger*                                                                          | :heavy_minus_sign:                                                                    | N/A                                                                                   | 8821239038968084                                                                      |
| `BigintStr`                                                                           | *BigInteger*                                                                          | :heavy_minus_sign:                                                                    | N/A                                                                                   | 9223372036854775808                                                                   |
| `BoolOpt`                                                                             | *bool*                                                                                | :heavy_minus_sign:                                                                    | An optional boolean property.                                                         | true                                                                                  |
| `Decimal`                                                                             | *decimal*                                                                             | :heavy_minus_sign:                                                                    | N/A                                                                                   | 3.141592653589793                                                                     |
| `DecimalStr`                                                                          | *decimal*                                                                             | :heavy_minus_sign:                                                                    | N/A                                                                                   | 3.14159265358979344719667586                                                          |
| `IntOptNull`                                                                          | *long*                                                                                | :heavy_minus_sign:                                                                    | An optional integer property will be null for tests.                                  |                                                                                       |
| `NumOptNull`                                                                          | *double*                                                                              | :heavy_minus_sign:                                                                    | An optional number property will be null for tests.                                   |                                                                                       |
| `StrOpt`                                                                              | *string*                                                                              | :heavy_minus_sign:                                                                    | An optional string property.                                                          | testOptional                                                                          |