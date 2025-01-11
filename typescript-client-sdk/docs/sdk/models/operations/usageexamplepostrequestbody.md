# UsageExamplePostRequestBody

A request body that contains fields with different formats for testing example generation

## Example Usage

```typescript
import { UsageExamplePostRequestBody } from "openapi/sdk/models/operations";
import { IntEnum } from "openapi/sdk/models/shared";
import { Decimal, RFCDate } from "openapi/sdk/types";

let value: UsageExamplePostRequestBody = {
  fakerCamelCasePropertyNameStrings: {
    city: "Kertzmannside",
    iban: "AE627550008877025240669",
    id: "<id>",
    iPv4: "174.92.111.178",
    iPv6: "1ee4:268c:9f24:3e5a:532e:348c:2c2f:afda",
  },
  fakerFormattedStrings: {
    addressFormat: "31213 Bergnaum Radial",
    dateFormat: new RFCDate("2024-09-12"),
    datetimeFormat: new Date("2023-10-18T20:48:18.611Z"),
    directoryFormat: "/rescue",
    domainFormat: "bulky-minister.org",
    emailFormat: "Marc.Rau@gmail.com",
    filenameFormat: "example.file",
    filepathFormat: "/bin/minus_runny_rough.jpeg",
    imageFormat: "https://picsum.photos/seed/B1iEhCq/2005/3824",
    ipv4Format: "34.76.145.151",
    ipv6Format: "cee9:d89d:bf2e:ff3d:3d2c:bc81:f9fd:fc07",
    jsonFormat: "{key: 6575170449833933, key1: null, key2: \"<value>\"}",
    macFormat: "28:03:0c:35:eb:02",
    passwordFormat: "W7ySYfF42zgO69J",
    phoneFormat: "731-206-4589 x262",
    timezoneFormat: "Africa/Bissau",
    unknownFormat: "<value>",
    urlFormat: "https://glittering-godparent.name",
    uuidFormat: "dad4c2fa-3fb4-4380-9365-749d182b6922",
    zipcodeFormat: "97790",
  },
  fakerKebobCasePropertyNameStrings: {
    postalCode: "59221-0967",
  },
  fakerPascalCasePropertyNameStrings: {
    account: "25049839",
    address: "99768 Rosina Pass",
    amount: "13.23",
    avatar: "https://picsum.photos/seed/uDm8Obv/1389/593",
    city: "North Sage",
    color: "yellow",
    comment:
      "The slim & simple Maple Gaming Keyboard from Dev Byte comes with a sleek body and 7- Color RGB LED Back-lighting for smart functionality",
    company: "Ryan, Hartmann and Bode",
    continent: "Asia",
    country: "Cyprus",
    countryCode: "BT",
    createdAt: "1706703489825",
    currency: "Rwanda Franc",
    currencyCode: "AFN",
    currencyISO: "SHP",
    datatype: "blob",
    default: "<value>",
    description: "resort duh redact",
    directory: "/usr/libexec",
    domain: "sour-disposer.info",
    domainName: "outstanding-dress.info",
    email: "Jaida.Schmidt51@gmail.com",
    emailAddr: "Vicenta.Barton@yahoo.com",
    emailAddress: "Drew18@hotmail.com",
    expiredAt: "1722168074179",
    expires: "<value>",
    expiresAt: "1750963769417",
    extension: "mpe",
    filename: "example.file",
    filepath: "/usr/include/exalted_late.mpg",
    filetype: "image",
    firstName: "Reginald",
    fullName: "Carroll Murphy",
    gender: "Cis female",
    host: "insistent-disk.org",
    hostName: "animated-velocity.info",
    httpStatus: "200",
    iban: "CZ2690830100120020069164",
    id: "<id>",
    ip: "1b65:e5eb:9c6f:97ce:157b:ffd6:f52e:5f1a",
    ipAddr: "588a:5396:c5be:ddea:fff9:1639:2d8d:fc6d",
    ipAddress: "8c5a:85b6:8ba7:ec15:927a:edf4:7edb:60f0",
    ipv4: "95.135.236.22",
    ipv6: "807d:642c:fee0:edcf:0fbb:7b29:bf15:9ddd",
    job: "Direct Metrics Facilitator",
    json: "{key: 4528106065130987, key1: null, key2: \"<value>\"}",
    key: "<key>",
    lastName: "Littel",
    latitude: "76.1951",
    locale: "da",
    longitude: "168.5832",
    mac: "e0:26:f4:2e:7e:2a",
    manufacturer: "Jaguar",
    material: "Bronze",
    middleName: "Parker",
    model: "Camry",
    password: "wgvSCMD1aZN7QCL",
    phone: "(910) 456-3937 x689",
    pin: "8763",
    postalCode: "02457",
    price: "958.79",
    product: "Modern Rubber Soap",
    sex: "male",
    statusCode: "504",
    street: "Corkery Ports",
    timezone: "Asia/Taipei",
    unit: "siemens",
    updatedAt: "1736476613286",
    uri: "https://other-desk.biz/",
    url: "https://baggy-instruction.com",
    username: "Jacques.Kassulke-Stiedemann",
    uuid: "6a5ba669-1dab-4816-9650-b19baf1d0868",
  },
  fakerSnakeCasePropertyNameStrings: {
    countryCode: "CN",
    createdAt: "1705621669970",
    expiredAt: "1721358982306",
    updatedAt: "1736541025375",
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
};
```

## Fields

| Field                                                                                                                                                          | Type                                                                                                                                                           | Required                                                                                                                                                       | Description                                                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `fakerCamelCasePropertyNameStrings`                                                                                                                            | [shared.FakerCamelCasePropertyNameStrings](../../../sdk/models/shared/fakercamelcasepropertynamestrings.md)                                                    | :heavy_check_mark:                                                                                                                                             | A set of strings with camel case fieldnames that lead to relevant examples being generated for them                                                            |
| `fakerFormattedStrings`                                                                                                                                        | [shared.FakerFormattedStrings](../../../sdk/models/shared/fakerformattedstrings.md)                                                                            | :heavy_check_mark:                                                                                                                                             | A set of strings with format values that lead to relevant examples being generated for them                                                                    |
| `fakerKebobCasePropertyNameStrings`                                                                                                                            | [shared.FakerKebobCasePropertyNameStrings](../../../sdk/models/shared/fakerkebobcasepropertynamestrings.md)                                                    | :heavy_check_mark:                                                                                                                                             | A set of strings with kebob case fieldnames that lead to relevant examples being generated for them                                                            |
| `fakerPascalCasePropertyNameStrings`                                                                                                                           | [shared.FakerPascalCasePropertyNameStrings](../../../sdk/models/shared/fakerpascalcasepropertynamestrings.md)                                                  | :heavy_check_mark:                                                                                                                                             | A set of strings with pascal case fieldnames that lead to relevant examples being generated for them                                                           |
| `fakerSnakeCasePropertyNameStrings`                                                                                                                            | [shared.FakerSnakeCasePropertyNameStrings](../../../sdk/models/shared/fakersnakecasepropertynamestrings.md)                                                    | :heavy_check_mark:                                                                                                                                             | A set of strings with snake case fieldnames that lead to relevant examples being generated for them                                                            |
| `simpleObject`                                                                                                                                                 | [shared.SimpleObject](../../../sdk/models/shared/simpleobject.md)                                                                                              | :heavy_check_mark:                                                                                                                                             | A simple object that uses all our supported primitive types and enums and has optional properties.<br/><br/>[A link to the external docs.](https://speakeasy.com/docs) |