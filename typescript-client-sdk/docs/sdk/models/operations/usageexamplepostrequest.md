# UsageExamplePostRequest

## Example Usage

```typescript
import { UsageExamplePostRequest } from "openapi/sdk/models/operations";
import { IntEnum } from "openapi/sdk/models/shared";
import { Decimal, RFCDate } from "openapi/sdk/types";

let value: UsageExamplePostRequest = {
  requestBody: {
    fakerCamelCasePropertyNameStrings: {
      city: "Nathanialhaven",
      iban: "TN8731680500800298004637",
      id: "<id>",
      iPv4: "163.102.110.157",
      iPv6: "1cef:b288:70a2:dfdf:2d0b:8b84:0bc8:4114",
    },
    fakerFormattedStrings: {
      addressFormat: "30081 Rutherford Lakes",
      dateFormat: new RFCDate("2022-06-18"),
      datetimeFormat: new Date("2022-08-07T18:10:36.920Z"),
      directoryFormat: "/opt/sbin",
      domainFormat: "motionless-following.net",
      emailFormat: "Timmothy87@hotmail.com",
      filenameFormat: "example.file",
      filepathFormat: "/var/yp/over_after_lady.xlt",
      imageFormat: "https://picsum.photos/seed/Sn0fjR/2198/3723",
      ipv4Format: "117.113.86.225",
      ipv6Format: "ef8f:be54:3e69:abc3:9cb2:3619:2c5d:2fe8",
      jsonFormat: "{key: 2181350852526698, key1: null, key2: \"<value>\"}",
      macFormat: "47:0a:66:cb:f5:ec",
      passwordFormat: "Bt52GgSOI4y5rm0",
      phoneFormat: "(276) 849-0274 x1184",
      timezoneFormat: "Europe/Zurich",
      unknownFormat: "<value>",
      urlFormat: "https://incomparable-gazebo.name",
      uuidFormat: "eb0beb27-25ee-4459-af24-d7e2855765eb",
      zipcodeFormat: "57737",
    },
    fakerKebobCasePropertyNameStrings: {
      postalCode: "18444-5648",
    },
    fakerPascalCasePropertyNameStrings: {
      account: "64483208",
      address: "231 Stella Cape",
      amount: "980.49",
      avatar: "https://picsum.photos/seed/lKjEwuT/386/3454",
      city: "Reynacester",
      color: "black",
      comment:
        "The automobile layout consists of a front-engine design, with transaxle-type transmissions mounted at the rear of the engine and four wheel drive",
      company: "Turner - Baumbach",
      continent: "Asia",
      country: "Bermuda",
      countryCode: "KM",
      createdAt: "<value>",
      currency: "Baht",
      currencyCode: "GEL",
      currencyISO: "BZD",
      datatype: "decimal",
      default: "<value>",
      description: "mmm gently electric mmm zen strange earnest boo legitimize",
      directory: "/usr/bin",
      domain: "ashamed-sweatshop.name",
      domainName: "amused-declaration.org",
      email: "Benton.Koch@yahoo.com",
      emailAddr: "Lafayette63@gmail.com",
      emailAddress: "Rosetta_Denesik@hotmail.com",
      expiredAt: "<value>",
      expires: "<value>",
      expiresAt: "<value>",
      extension: "pdf",
      filename: "example.file",
      filepath: "/var/mail/coagulate_stir_fry_wherever.pdf",
      filetype: "audio",
      firstName: "Paula",
      fullName: "Willard Johnston",
      gender: "Agender",
      host: "merry-blight.com",
      hostName: "wicked-stranger.com",
      httpStatus: "103",
      iban: "FI9001065318093081",
      id: "<id>",
      ip: "0fdc:6e5c:fbb1:a949:7395:b0db:ccf2:dffd",
      ipAddr: "149.0.50.244",
      ipAddress: "163.71.242.186",
      ipv4: "84.202.27.100",
      ipv6: "4f28:6b7f:0d55:bf6c:2da3:9d20:c9be:68ac",
      job: "Principal Quality Coordinator",
      json: "{key: 2375808108821358, key1: null, key2: \"<value>\"}",
      key: "<key>",
      lastName: "Collins",
      latitude: "39.6479",
      locale: "no",
      longitude: "59.2796",
      mac: "63:5b:ae:dd:e4:56",
      manufacturer: "Lamborghini",
      material: "Rubber",
      middleName: "Drew",
      model: "2",
      password: "Fzur_AUnmnmP1jV",
      phone: "991.924.7251 x11304",
      pin: "6400",
      postalCode: "19185",
      price: "569.75",
      product: "Handcrafted Soft Mouse",
      sex: "female",
      statusCode: "506",
      street: "Haylie Shore",
      timezone: "Asia/Yerevan",
      unit: "henry",
      updatedAt: "<value>",
      uri: "https://smart-in-joke.name/",
      url: "https://wordy-straw.info",
      username: "Shirley.Keeling",
      uuid: "cbc4c87a-014f-4250-a55f-d60da2f1d46c",
    },
    fakerSnakeCasePropertyNameStrings: {
      countryCode: "UY",
      createdAt: "<value>",
      expiredAt: "<value>",
      updatedAt: "<value>",
    },
    simpleObject: {
      bool: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00.001Z"),
      enum: "one",
      float32: 1.1,
      int: 1,
      int32: 1,
      int32Enum: 55,
      intEnum: IntEnum.Second,
      num: 1.1,
      str: "test",
      any: "any",
      bigint: BigInt("8821239038968084"),
      bigintStr: BigInt("9223372036854775808"),
      boolOpt: true,
      decimal: new Decimal("3.141592653589793"),
      decimalStr: new Decimal("3.14159265358979344719667586"),
      float64Str: 1.1,
      int64Str: 100,
      strOpt: "testOptional",
    },
  },
  bigintParameter: BigInt("621140"),
  bigintStrParameter: BigInt("97810"),
  boolParameter: false,
  dateParameter: new RFCDate("2024-08-27"),
  dateTimeDefaultParameter: new Date("2024-04-22T23:52:00.946Z"),
  dateTimeParameter: new Date("2024-02-20T05:02:25.225Z"),
  decimalParameter: new Decimal("537.34"),
  decimalStrParameter: new Decimal("3962.23"),
  doubleParameter: 1674.36,
  enumParameter: "value3",
  falseyNumberParameter: 0,
  float32Parameter: 7005.29,
  float64StringParameter: 8830.78,
  floatParameter: 9665.75,
  int64Parameter: 774748,
  int64StringParameter: 994234,
  intParameter: 614770,
  optEnumParameter: "value3",
  strParameter: "example 1",
};
```

## Fields

| Field                                                                                                   | Type                                                                                                    | Required                                                                                                | Description                                                                                             | Example                                                                                                 |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                           | [operations.UsageExamplePostRequestBody](../../../sdk/models/operations/usageexamplepostrequestbody.md) | :heavy_minus_sign:                                                                                      | A request body that contains fields with different formats for testing example generation               |                                                                                                         |
| `bigintParameter`                                                                                       | *BigInt*                                                                                                | :heavy_check_mark:                                                                                      | An bigint parameter                                                                                     |                                                                                                         |
| `bigintParameterOptional`                                                                               | *BigInt*                                                                                                | :heavy_minus_sign:                                                                                      | An bigint parameter                                                                                     |                                                                                                         |
| `bigintStrParameter`                                                                                    | *BigInt*                                                                                                | :heavy_check_mark:                                                                                      | An bigint parameter                                                                                     |                                                                                                         |
| `bigintStrParameterOptional`                                                                            | *BigInt*                                                                                                | :heavy_minus_sign:                                                                                      | An bigint parameter                                                                                     |                                                                                                         |
| `boolParameter`                                                                                         | *boolean*                                                                                               | :heavy_check_mark:                                                                                      | A boolean parameter                                                                                     |                                                                                                         |
| `dateParameter`                                                                                         | [RFCDate](../../../types/rfcdate.md)                                                                    | :heavy_check_mark:                                                                                      | A date parameter                                                                                        |                                                                                                         |
| `dateTimeDefaultParameter`                                                                              | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)           | :heavy_check_mark:                                                                                      | A date time parameter with a default value                                                              |                                                                                                         |
| `dateTimeParameter`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)           | :heavy_check_mark:                                                                                      | A date time parameter                                                                                   |                                                                                                         |
| `decimalParameter`                                                                                      | *Decimal*                                                                                               | :heavy_check_mark:                                                                                      | A decimal parameter                                                                                     |                                                                                                         |
| `decimalParameterOptional`                                                                              | *Decimal*                                                                                               | :heavy_minus_sign:                                                                                      | A decimal parameter                                                                                     |                                                                                                         |
| `decimalStrParameter`                                                                                   | *Decimal*                                                                                               | :heavy_check_mark:                                                                                      | A decimal parameter                                                                                     |                                                                                                         |
| `decimalStrParameterOptional`                                                                           | *Decimal*                                                                                               | :heavy_minus_sign:                                                                                      | A decimal parameter                                                                                     |                                                                                                         |
| `doubleParameter`                                                                                       | *number*                                                                                                | :heavy_check_mark:                                                                                      | A double parameter                                                                                      |                                                                                                         |
| `enumParameter`                                                                                         | [operations.EnumParameter](../../../sdk/models/operations/enumparameter.md)                             | :heavy_check_mark:                                                                                      | An enum parameter                                                                                       |                                                                                                         |
| `falseyNumberParameter`                                                                                 | *number*                                                                                                | :heavy_check_mark:                                                                                      | A number parameter that contains a falsey example value                                                 | 0                                                                                                       |
| `float32Parameter`                                                                                      | *number*                                                                                                | :heavy_check_mark:                                                                                      | A float32 parameter                                                                                     |                                                                                                         |
| `float64StringParameter`                                                                                | *number*                                                                                                | :heavy_check_mark:                                                                                      | A float64 parameter                                                                                     |                                                                                                         |
| `floatParameter`                                                                                        | *number*                                                                                                | :heavy_check_mark:                                                                                      | A float parameter                                                                                       |                                                                                                         |
| `int64Parameter`                                                                                        | *number*                                                                                                | :heavy_check_mark:                                                                                      | An int64 parameter                                                                                      |                                                                                                         |
| `int64StringParameter`                                                                                  | *number*                                                                                                | :heavy_check_mark:                                                                                      | An int64 parameter                                                                                      |                                                                                                         |
| `intParameter`                                                                                          | *number*                                                                                                | :heavy_check_mark:                                                                                      | An integer parameter                                                                                    |                                                                                                         |
| `optEnumParameter`                                                                                      | [operations.OptEnumParameter](../../../sdk/models/operations/optenumparameter.md)                       | :heavy_minus_sign:                                                                                      | An enum parameter                                                                                       | value3                                                                                                  |
| `strParameter`                                                                                          | *string*                                                                                                | :heavy_check_mark:                                                                                      | A string parameter                                                                                      | example 1                                                                                               |