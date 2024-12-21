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
        createdAt: "<value>",
        currency: "Baht",
        currencyCode: "PAB",
        currencyISO: "SBD",
        datatype: "varchar",
        default: "<value>",
        description: "secondary punctually carp",
        directory: "/var/yp",
        domain: "front-seafood.biz",
        domainName: "worse-heating.biz",
        email: "Dell.Reichel10@yahoo.com",
        emailAddr: "Coralie_Aufderhar@gmail.com",
        emailAddress: "Janelle54@hotmail.com",
        expiredAt: "<value>",
        expires: "<value>",
        expiresAt: "<value>",
        extension: "wav",
        filename: "example.file",
        filepath: "/usr/lib/meh_rubbery.spx",
        filetype: "video",
        firstName: "Virgil",
        fullName: "Celia Lockman",
        gender: "Intersex",
        host: "neighboring-backbone.org",
        hostName: "fantastic-swim.net",
        httpStatus: "206",
        iban: "SK4700200863715636017876",
        id: "<id>",
        ip: "6070:9eea:ee8f:b94b:bdb6:a7b2:863a:c3b0",
        ipAddr: "a56f:c6c2:9330:cbeb:47ed:5aa7:4ccc:e6aa",
        ipAddress: "171.109.23.85",
        ipv4: "63.149.162.195",
        ipv6: "beae:91db:bbbe:a1eb:c170:8625:cbde:29fa",
        job: "Direct Operations Specialist",
        json: "{key: 5315518856826349, key1: null, key2: \"<value>\"}",
        key: "<key>",
        lastName: "Block",
        latitude: "-26.8203",
        locale: "zh",
        longitude: "-51.1636",
        mac: "6b:f7:74:51:67:41",
        manufacturer: "Land Rover",
        material: "Concrete",
        middleName: "Gray",
        model: "Challenger",
        password: "sjTUYDUJQfNKef2",
        phone: "378-421-8104 x788",
        pin: "5500",
        postalCode: "13074-5402",
        price: "700.26",
        product: "Incredible Steel Mouse",
        sex: "male",
        statusCode: "103",
        street: "Eusebio Curve",
        timezone: "Asia/Kabul",
        unit: "steradian",
        updatedAt: "<value>",
        uri: "https://willing-e-mail.info",
        url: "https://whirlwind-insolence.name",
        username: "Hettie44",
        uuid: "fc2e2cb0-e33c-4afd-9729-b4c83a9a6345",
      },
      fakerSnakeCasePropertyNameStrings: {
        countryCode: "BE",
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
    bigintParameter: BigInt("926271"),
    bigintStrParameter: BigInt("868017"),
    boolParameter: true,
    dateParameter: new RFCDate("2024-09-08"),
    dateTimeDefaultParameter: new Date("2022-12-21T07:31:47.893Z"),
    dateTimeParameter: new Date("2022-01-23T05:00:29.642Z"),
    decimalParameter: new Decimal("1210.26"),
    decimalStrParameter: new Decimal("9218.79"),
    doubleParameter: 1526.55,
    enumParameter: "value2",
    falseyNumberParameter: 0,
    float32Parameter: 5574.60,
    float64StringParameter: 9350.14,
    floatParameter: 1207.65,
    int64Parameter: 921028,
    int64StringParameter: 341377,
    intParameter: 466225,
    optEnumParameter: "value3",
    strParameter: "example 1",
  });

  // Handle the result
  console.log(result);
}

run();

```
<!-- End SDK Example Usage [usage] -->