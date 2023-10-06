<!-- Start SDK Example Usage -->


```typescript
import { SDK } from "openapi";
import { GetGlobalNameOverrideResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.generation.globalNameOverridden().then((res: GetGlobalNameOverrideResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```


## Second
Do this second
```typescript
import { SDK } from "openapi";
import {
  UsageExamplePostEnumParameter,
  UsageExamplePostOptEnumParameter,
  UsageExamplePostResponse,
  UsageExamplePostSecurity,
} from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const operationSecurity: UsageExamplePostSecurity = {
  password: "YOUR_PASSWORD",
  username: "YOUR_USERNAME",
};

sdk.generation.usageExamplePost({
  requestBody: {
    fakerFormattedStrings: {
      addressFormat: "48525 Maude Fall",
      directoryFormat: "/etc/defaults",
      domainFormat: "next-conflict.name",
      emailFormat: "Fermin_Koelpin@gmail.com",
      filenameFormat: "northeast.wav",
      filepathFormat: "/lib/pizza_integrated.hbs",
      imageFormat: "https://loremflickr.com/640/480",
      ipv4Format: "75.42.25.241",
      ipv6Format: "36a9:c057:a71b:b73a:c9ee:2348:d76c:3164",
      jsonFormat: "{plane: 14910, fringe: null, lightning: \"Roentgenium UTF8\"}",
      macFormat: "13:58:66:7d:ac:95",
      passwordFormat: "b6eWzdveK0sHokC",
      phoneFormat: "832-504-6221 x221",
      timezoneFormat: "Asia/Krasnoyarsk",
      unknownFormat: "Principal at",
      urlFormat: "http://understated-balcony.org",
      uuidFormat: "62de2e2d-47a9-4bf1-80f7-53b9b364b6b4",
      zipcodeFormat: "25687-7266",
    },
    fakerStrings: {
      city: "Port Carli",
      iban: "TN8700576009897281100717",
      id: "<ID>",
      iPv4: "141.21.132.133",
      iPv6: "308b:b979:0237:4ea8:ee39:8480:0301:1d98",
      account: "81966519",
      address: "418 Maybelle Brooks",
      amount: "27.55",
      avatar: "https://loremflickr.com/640/480",
      color: "turquoise",
      comment: "The slim & simple Maple Gaming Keyboard from Dev Byte comes with a sleek body and 7- Color RGB LED Back-lighting for smart functionality",
      company: "Murazik, Kozey and Hirthe",
      country: "Equatorial Guinea",
      countryCode: "LU",
      currency: "Congolese Franc",
      datatype: "bigint",
      default: "Dalasi",
      description: "Up-sized explicit frame",
      directory: "/home",
      domainName: "warmhearted-buying.biz",
      emailAddr: "Beulah.Franecki24@gmail.com",
      extension: "pdf",
      filename: "recovery.pdf",
      filepath: "/usr/share/powerfully.less",
      filetype: "application",
      firstName: "Geovany",
      fullName: "Roy Gottlieb",
      gender: "Cis",
      job: "International Metrics Administrator",
      json: "{trachoma: 6397, nick: null, android: \"Plastic Recumbent\"}",
      key: "<key>",
      lastName: "Kshlerin",
      latitude: "65.3520",
      locale: "zh_CN",
      longitude: "16.8742",
      mac: "fd:b6:ff:35:99:05",
      manufacturer: "Mazda",
      material: "Frozen",
      middleName: "Emerson",
      model: "Mustang",
      password: "71wIwgEZJMTCRYg",
      phone: "1-466-307-0476",
      pin: "0584",
      postalCode: "07886",
      price: "452.00",
      product: "Small Steel Salad",
      sex: "female",
      street: "Christy Dam",
      timezone: "America/Regina",
      unit: "sievert",
      url: "http://repentant-haunt.name",
      username: "Heather_Mills48",
      uuid: "29e9f1c7-ed92-481f-955b-6ca1625b4c3a",
    },
    simpleObject: {
      any: "wireless",
      bigint: 8821239038968084,
      bigintStr: "9223372036854775808",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00.000000001Z"),
      decimal: 3.141592653589793,
      decimalStr: "3.14159265358979344719667586",
      enum: Enum.One,
      float32: 1.1,
      int: 1,
      int32: 1,
      int32Enum: SimpleObjectInt32Enum.FiftyFive,
      intEnum: SimpleObjectIntEnum.Third,
      intOptNull: 51222,
      num: 1.1,
      numOptNull: 598.05,
      str: "test",
      strOpt: "testOptional",
    },
  },
  bigintParameter: 284159,
  bigintParameterOptional: 322202,
  bigintStrParameter: "Automotive",
  bigintStrParameterOptional: "focus Country",
  boolParameter: false,
  dateParameter: new RFCDate("2022-01-13"),
  dateTimeParameter: new Date("2021-04-10T10:50:46.754Z"),
  decimalParameter: 8924.18,
  decimalParameterOptional: 5705.14,
  decimalStrParameter: "navigating",
  decimalStrParameterOptional: "Rap matrix South",
  doubleParameter: 7223.13,
  enumParameter: UsageExamplePostEnumParameter.Value2,
  falseyNumberParameter: 0,
  float32Parameter: 8430.91,
  floatParameter: 3767.71,
  int64Parameter: 733506,
  intParameter: 892942,
  optEnumParameter: UsageExamplePostOptEnumParameter.Value3,
  strParameter: "example 2",
}, operationSecurity).then((res: UsageExamplePostResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```
<!-- End SDK Example Usage -->