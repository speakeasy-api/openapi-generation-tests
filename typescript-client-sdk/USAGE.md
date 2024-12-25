<!-- Start SDK Example Usage [usage] -->
```typescript
import { SDK } from "openapi";
import { IntEnum } from "openapi/sdk/models/shared";
import { Decimal, RFCDate } from "openapi/sdk/types";

const sdk = new SDK({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.generation.globalNameOverridden({
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
  });

  // Handle the result
  console.log(result);
}

run();

```

```typescript
import { SDK } from "openapi";

const sdk = new SDK({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.servers.selectGlobalServer();

  // Handle the result
  console.log(result);
}

run();

```

### Second

Do this second

```typescript
import { SDK } from "openapi";
import { IntEnum } from "openapi/sdk/models/shared";
import { Decimal, RFCDate } from "openapi/sdk/types";

const sdk = new SDK({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.generation.usageExamplePost({
    password: "YOUR_PASSWORD",
    username: "YOUR_USERNAME",
  }, {
    requestBody: {
      fakerCamelCasePropertyNameStrings: {
        city: "Port Domenicboro",
        iban: "TL115340030031304452481",
        id: "<id>",
        iPv4: "78.38.131.239",
        iPv6: "e4c9:ca70:74d2:c3d9:33d6:c7c4:1e56:3bf5",
      },
      fakerFormattedStrings: {
        addressFormat: "919 Vicarage Lane",
        dateFormat: new RFCDate("2023-05-22"),
        datetimeFormat: new Date("2023-10-31T03:05:14.934Z"),
        directoryFormat: "/var/spool",
        domainFormat: "aggravating-vanadyl.biz",
        emailFormat: "Mateo_Rice@hotmail.com",
        filenameFormat: "example.file",
        filepathFormat: "/usr/obj/boo_magnificent_and.jpeg",
        imageFormat: "https://loremflickr.com/2371/2464?lock=4205364297848786",
        ipv4Format: "234.138.226.158",
        ipv6Format: "5141:db2e:df9c:f06d:8b99:e7e4:2c56:addd",
        jsonFormat: "{key: 3449297471398524, key1: null, key2: \"<value>\"}",
        macFormat: "22:1f:e9:45:8a:7f",
        passwordFormat: "zbz8X7IgZMC4iGZ",
        phoneFormat: "(508) 609-3176 x5681",
        timezoneFormat: "Pacific/Efate",
        unknownFormat: "<value>",
        urlFormat: "https://stark-trick.name",
        uuidFormat: "8f5bc12b-caad-4053-9859-5e369841bdb9",
        zipcodeFormat: "59560",
      },
      fakerKebobCasePropertyNameStrings: {
        postalCode: "10760-9151",
      },
      fakerPascalCasePropertyNameStrings: {
        account: "82091084",
        address: "14760 Gerhold Prairie",
        amount: "707.58",
        avatar: "https://picsum.photos/seed/MQvsb2J6/1388/3681",
        city: "Fayborough",
        color: "turquoise",
        comment: "The Football Is Good For Training And Recreational Purposes",
        company: "Gusikowski Group",
        continent: "Africa",
        country: "Japan",
        countryCode: "AG",
        createdAt: "1729361786106",
        currency: "Balboa",
        currencyCode: "SBD",
        currencyISO: "NAD",
        datatype: "binary",
        default: "<value>",
        description: "jittery furthermore yet mystify euphonium",
        directory: "/home/user",
        domain: "educated-aftermath.org",
        domainName: "whole-help.net",
        email: "Zoe54@yahoo.com",
        emailAddr: "Murphy.Heller@gmail.com",
        emailAddress: "Georgette.Kessler@yahoo.com",
        expiredAt: "1723923333556",
        expires: "<value>",
        expiresAt: "1759768282292",
        extension: "mp4v",
        filename: "example.file",
        filepath: "/etc/ppp/ugh_octave_scorn.htm",
        filetype: "text",
        firstName: "Elmira",
        fullName: "Beulah Rohan",
        gender: "Two-spirit person",
        host: "rotating-handful.biz",
        hostName: "glass-newsstand.com",
        httpStatus: "401",
        iban: "GT248U7009M6748Q231241072O84",
        id: "<id>",
        ip: "35.8.149.202",
        ipAddr: "b47e:d5aa:74cc:ce6a:a0e9:175c:eabe:ae91",
        ipAddress: "bbbb:ea1e:bc17:0862:5cbd:e29f:a2b6:c517",
        ipv4: "127.91.106.177",
        ipv6: "eaa6:7289:51c2:85db:b6cc:ef8c:9baa:9fa4",
        job: "Product Research Producer",
        json: "{key: 7725687944244536, key1: null, key2: \"<value>\"}",
        key: "<key>",
        lastName: "Greenfelder",
        latitude: "-60.0189",
        locale: "fi",
        longitude: "-128.0093",
        mac: "17:ce:d8:80:0a:35",
        manufacturer: "Aston Martin",
        material: "Soft",
        middleName: "Jules",
        model: "Impala",
        password: "IcbvHqTVqA1XkfF",
        phone: "945.520.7469 x8191",
        pin: "8709",
        postalCode: "17698",
        price: "443.65",
        product: "Recycled Fresh Shirt",
        sex: "male",
        statusCode: "206",
        street: "Nader Hollow",
        timezone: "America/Creston",
        unit: "radian",
        updatedAt: "1735027379742",
        uri: "https://blushing-pinstripe.biz/",
        url: "https://utilized-flight.org/",
        username: "Tierra12",
        uuid: "20e05958-b9b2-4d8a-98f4-f055ce98595b",
      },
      fakerSnakeCasePropertyNameStrings: {
        countryCode: "FJ",
        createdAt: "1730076559248",
        expiredAt: "1720554635703",
        updatedAt: "1735000282960",
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
    bigintParameter: BigInt("334104"),
    bigintStrParameter: BigInt("901453"),
    boolParameter: true,
    dateParameter: new RFCDate("2022-10-04"),
    dateTimeDefaultParameter: new Date("2023-04-19T03:54:57.502Z"),
    dateTimeParameter: new Date("2022-10-08T06:44:22.550Z"),
    decimalParameter: new Decimal("7032.71"),
    decimalStrParameter: new Decimal("4081.24"),
    doubleParameter: 5709.34,
    enumParameter: "value1",
    falseyNumberParameter: 0,
    float32Parameter: 4418.76,
    float64StringParameter: 7133.33,
    floatParameter: 9223.59,
    int64Parameter: 901974,
    int64StringParameter: 321498,
    intParameter: 300411,
    optEnumParameter: "value3",
    strParameter: "example 1",
  });

  // Handle the result
  console.log(result);
}

run();

```
<!-- End SDK Example Usage [usage] -->