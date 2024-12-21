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
    dateFormat: new RFCDate("2023-09-13"),
    datetimeFormat: new Date("2022-10-18T20:48:18.611Z"),
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
    createdAt: "<value>",
    currency: "Aruban Guilder",
    currencyCode: "RWF",
    currencyISO: "AFN",
    datatype: "smallint",
    default: "<value>",
    description: "strategy iterate and first",
    directory: "/opt/bin",
    domain: "discrete-in-joke.com",
    domainName: "steep-best-seller.name",
    email: "Kobe.Oberbrunner-Barton@gmail.com",
    emailAddr: "Drew18@hotmail.com",
    emailAddress: "Jacques39@yahoo.com",
    expiredAt: "<value>",
    expires: "<value>",
    expiresAt: "<value>",
    extension: "mpg4",
    filename: "example.file",
    filepath: "/net/near_submissive_whether.ear",
    filetype: "application",
    firstName: "Finn",
    fullName: "Margaret Jacobs Sr.",
    gender: "Two* person",
    host: "troubled-illusion.biz",
    hostName: "entire-obesity.com",
    httpStatus: "101",
    iban: "BH57GFGD19K697225573Y2",
    id: "<id>",
    ip: "208.252.248.231",
    ipAddr: "253.63.27.243",
    ipAddress: "176.14.187.225",
    ipv4: "69.97.95.191",
    ipv6: "5396:c5be:ddea:fff9:1639:2d8d:fc6d:d8c5",
    job: "District Markets Engineer",
    json: "{key: 4556439315389838, key1: null, key2: \"<value>\"}",
    key: "<key>",
    lastName: "Hintz",
    latitude: "4.4947",
    locale: "tr",
    longitude: "-59.9373",
    mac: "ed:04:71:5b:a9:b3",
    manufacturer: "Fiat",
    material: "Rubber",
    middleName: "Ryan",
    model: "Golf",
    password: "dDSxGA4WcZXcnQl",
    phone: "(556) 224-6861",
    pin: "9859",
    postalCode: "98990-1393",
    price: "161.39",
    product: "Small Concrete Pizza",
    sex: "female",
    statusCode: "102",
    street: "Aliya Cape",
    timezone: "Africa/Juba",
    unit: "henry",
    updatedAt: "<value>",
    uri: "https://unrealistic-pilot.name",
    url: "https://zany-freckle.info/",
    username: "Gene_Daniel-Harber",
    uuid: "7438575f-2159-4a6f-b5ba-dfecb521368c",
  },
  fakerSnakeCasePropertyNameStrings: {
    countryCode: "BQ",
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