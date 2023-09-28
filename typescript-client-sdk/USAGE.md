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
      addressFormat: "5786 Little Streets",
      directoryFormat: "vel",
      domainFormat: "error",
      emailFormat: "Gerda89@yahoo.com",
      filenameFormat: "ipsa",
      filepathFormat: "delectus",
      imageFormat: "tempora",
      ipv4Format: "98.122.202.207",
      ipv6Format: "8796:ed15:1a05:dfc2:ddf7:cc78:ca1b:a928",
      jsonFormat: "{"foo":"gQ*GM92ieK","bar":56843,"bike":1878,"a":61763,"b":61209,"name":61693,"prop":94374}",
      macFormat: "saepe",
      passwordFormat: "fuga",
      phoneFormat: "464.960.0966 x612",
      timezoneFormat: "corporis",
      unknownFormat: "explicabo",
      urlFormat: "nobis",
      uuidFormat: "5955907a-ff1a-43a2-ba94-67739251aa52",
      zipcodeFormat: "19368-0068",
    },
    fakerStrings: {
      city: "Boyerworth",
      iban: "voluptatibus",
      id: "e78f097b-0074-4f15-871b-5e6e13b99d48",
      iPv4: "133.234.24.235",
      iPv6: "91e4:50ad:2abd:4426:9802:d502:a94b:b4f6",
      account: "non",
      address: "535 Marquardt Pine",
      amount: "dolor",
      avatar: "debitis",
      color: "a",
      comment: "dolorum",
      company: "Kirlin - Stamm",
      country: "Virgin Islands, U.S.",
      countryCode: "PF",
      currency: "dicta",
      datatype: "magnam",
      default: "cumque",
      description: "facere",
      directory: "ea",
      domainName: "aliquid",
      emailAddr: "laborum",
      extension: "accusamus",
      filename: "non",
      filepath: "occaecati",
      filetype: "enim",
      firstName: "Shannon",
      fullName: "delectus",
      gender: "male",
      job: "provident",
      json: "{"foo":"^ORy6\\EHZY","bar":1919,"bike":30157,"a":"^;;DZfHr-*","b":9237,"name":"AWTV$]{]>I","prop":89654}",
      key: "odit",
      lastName: "Hilll",
      latitude: "quasi",
      locale: "iure",
      longitude: "doloribus",
      mac: "debitis",
      manufacturer: "eius",
      material: "maxime",
      middleName: "deleniti",
      model: "facilis",
      password: "in",
      phone: "(293) 749-8198",
      pin: "accusantium",
      postalCode: "56117",
      price: "illum",
      product: "pariatur",
      sex: "male",
      street: "5140 Willow Radial",
      timezone: "ipsam",
      unit: "voluptate",
      url: "autem",
      username: "Mireya.Beatty97",
      uuid: "0d30c5fb-b258-4705-b202-c73d5fe9b90c",
    },
    simpleObject: {
      any: "consequuntur",
      bigint: 500026,
      bigintStr: "error",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00.000Z"),
      decimal: 503.7,
      enum: Enum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32Enum.SixtyNine,
      intEnum: SimpleObjectIntEnum.Third,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
  },
  bigintParameter: 237893,
  bigintParameterOptional: 992397,
  bigintStrParameter: "earum",
  bigintStrParameterOptional: "modi",
  boolParameter: false,
  dateParameter: new RFCDate("2021-08-23"),
  dateTimeParameter: new Date("2021-04-10T01:47:20.724Z"),
  decimalParameter: 5899.1,
  decimalParameterOptional: 7508.44,
  decimalStrParameter: "libero",
  decimalStrParameterOptional: "delectus",
  doubleParameter: 3119.45,
  enumParameter: UsageExamplePostEnumParameter.Value2,
  falseyNumberParameter: 0,
  float32Parameter: 3982.21,
  floatParameter: 2123.9,
  int64Parameter: 209843,
  intParameter: 222443,
  optEnumParameter: UsageExamplePostOptEnumParameter.Value3,
  strParameter: "example 1",
}, operationSecurity).then((res: UsageExamplePostResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```
<!-- End SDK Example Usage -->