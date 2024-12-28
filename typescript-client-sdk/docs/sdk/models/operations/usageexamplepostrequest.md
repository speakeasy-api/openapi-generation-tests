# UsageExamplePostRequest

## Example Usage

```typescript
import { UsageExamplePostRequest } from "openapi/sdk/models/operations";
import { IntEnum } from "openapi/sdk/models/shared";
import { Decimal, RFCDate } from "openapi/sdk/types";

let value: UsageExamplePostRequest = {
  requestBody: {
    fakerCamelCasePropertyNameStrings: {
      city: "North Arvid",
      iban: "TL170010271005790467533",
      id: "<id>",
      iPv4: "66.126.174.70",
      iPv6: "b231:f03d:1dff:b6ce:b5d8:057c:a97d:ef8f",
    },
    fakerFormattedStrings: {
      addressFormat: "722 Theresa Forks",
      dateFormat: new RFCDate("2023-05-12"),
      datetimeFormat: new Date("2023-06-26T09:04:00.715Z"),
      directoryFormat: "/usr/libexec",
      domainFormat: "tepid-chapel.info",
      emailFormat: "Rebecca.Crist@hotmail.com",
      filenameFormat: "example.file",
      filepathFormat: "/etc/defaults/dilate_uh_huh.bmp",
      imageFormat: "https://picsum.photos/seed/mChS6dboK/3817/1408",
      ipv4Format: "134.124.0.108",
      ipv6Format: "14e4:cb3d:2aeb:ae16:f932:bada:98bd:a0fe",
      jsonFormat: "{key: 6399216587535302, key1: null, key2: \"<value>\"}",
      macFormat: "27:25:ee:45:9f:24",
      passwordFormat: "sOv2SKJBwffWklA",
      phoneFormat: "718-544-5648 x64483",
      timezoneFormat: "America/Chihuahua",
      unknownFormat: "<value>",
      urlFormat: "https://ugly-tool.com/",
      uuidFormat: "521e0f1d-955c-45a8-87e8-db0c3e0517d4",
      zipcodeFormat: "81207",
    },
    fakerKebobCasePropertyNameStrings: {
      postalCode: "37378",
    },
    fakerPascalCasePropertyNameStrings: {
      account: "29121345",
      address: "926 Jadyn Gateway",
      amount: "316.50",
      avatar: "https://loremflickr.com/1930/2919?lock=7918889432006140",
      city: "Dareshire",
      color: "olive",
      comment:
        "The slim & simple Maple Gaming Keyboard from Dev Byte comes with a sleek body and 7- Color RGB LED Back-lighting for smart functionality",
      company: "Leuschke - Greenfelder",
      continent: "Asia",
      country: "Mongolia",
      countryCode: "UA",
      createdAt: "1729203938922",
      currency: "Rwanda Franc",
      currencyCode: "MOP",
      currencyISO: "VUV",
      datatype: "geometry",
      default: "<value>",
      description:
        "merge mozzarella alliance airbrush oil yet following off wisely",
      directory: "/Library",
      domain: "afraid-jazz.biz",
      domainName: "superb-department.biz",
      email: "Micheal.Purdy0@hotmail.com",
      emailAddr: "Arnulfo_Wintheiser15@yahoo.com",
      emailAddress: "Dudley26@hotmail.com",
      expiredAt: "1723975236201",
      expires: "<value>",
      expiresAt: "1751765234097",
      extension: "png",
      filename: "example.file",
      filepath: "/usr/libexec/lieu.odt",
      filetype: "video",
      firstName: "Nicola",
      fullName: "Joe Auer V",
      gender: "Male to female transgender woman",
      host: "french-travel.biz",
      hostName: "surprised-widow.net",
      httpStatus: "300",
      iban: "KZ91243459OZ6Z109693",
      id: "<id>",
      ip: "284f:286b:7f0d:55bf:6c2d:a39d:20c9:be68",
      ipAddr: "150.251.178.99",
      ipAddress: "241.34.184.236",
      ipv4: "170.108.50.94",
      ipv6: "feed:be68:8ce6:086e:dce7:cb2b:0bb1:db33",
      job: "Forward Intranet Strategist",
      json: "{key: 8847301447562569, key1: null, key2: \"<value>\"}",
      key: "<key>",
      lastName: "Carter-Wehner",
      latitude: "-45.9775",
      locale: "zh",
      longitude: "92.6664",
      mac: "39:21:15:06:a6:11",
      manufacturer: "Dodge",
      material: "Cotton",
      middleName: "Shiloh",
      model: "Aventador",
      password: "mXWQCkUFYHkbx9i",
      phone: "699.838.6407 x577",
      pin: "7385",
      postalCode: "60129",
      price: "140.69",
      product: "Gorgeous Fresh Towels",
      sex: "male",
      statusCode: "200",
      street: "Riverside Drive",
      timezone: "America/Argentina/Rio_Gallegos",
      unit: "katal",
      updatedAt: "1735267398865",
      uri: "https://free-hubris.net",
      url: "https://warm-omelet.com",
      username: "Shaylee.Rath39",
      uuid: "dbefcf90-05dd-4f10-ae48-f6a6c83448bf",
    },
    fakerSnakeCasePropertyNameStrings: {
      countryCode: "SC",
      createdAt: "1709136392622",
      expiredAt: "1715605577369",
      updatedAt: "1735294488998",
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
  bigintParameter: BigInt("686380"),
  bigintStrParameter: BigInt("295892"),
  boolParameter: false,
  dateParameter: new RFCDate("2022-11-29"),
  dateTimeDefaultParameter: new Date("2023-01-26T01:18:29.965Z"),
  dateTimeParameter: new Date("2024-06-07T02:11:09.431Z"),
  decimalParameter: new Decimal("5775.90"),
  decimalStrParameter: new Decimal("752.77"),
  doubleParameter: 782.46,
  enumParameter: "value2",
  falseyNumberParameter: 0,
  float32Parameter: 7665.91,
  float64StringParameter: 6886.83,
  floatParameter: 7079.82,
  int64Parameter: 767210,
  int64StringParameter: 287153,
  intParameter: 548256,
  optEnumParameter: "value3",
  strParameter: "example 2",
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