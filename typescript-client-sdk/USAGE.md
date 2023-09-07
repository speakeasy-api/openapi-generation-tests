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
    email: "Larue_Rau85@yahoo.com",
    formatEmail: "Roselyn_Kassulke@yahoo.com",
    formatUri: "http://innocent-effect.org",
    formatUuid: "0f467cc8-796e-4d15-9a05-dfc2ddf7cc78",
    hostname: "soulful-poppy.com",
    ipv4: "184.163.148.36",
    ipv6: "8fc8:1674:2cb7:3920:5929:396f:ea75:96eb",
    simpleObject: {
      any: "architecto",
      bigint: 60225,
      bigintStr: "reiciendis",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 6667.67,
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
    unknown: "dolores",
    uri: "http://growing-cappelletti.net",
    uuid: "5955907a-ff1a-43a2-ba94-67739251aa52",
  },
  bigintParameter: 111111,
  bigintParameterOptional: 111111,
  bigintStrParameter: "111111",
  bigintStrParameterOptional: "111111",
  boolParameter: false,
  dateParameter: new RFCDate("2020-01-01"),
  dateTimeParameter: new Date("2020-01-01T00:00:00Z"),
  decimalParameter: 1.1,
  decimalParameterOptional: 1.1,
  decimalStrParameter: "1.1",
  decimalStrParameterOptional: "1.1",
  doubleParameter: 2.2222222,
  enumParameter: UsageExamplePostEnumParameter.Value3,
  falseyNumberParameter: 0,
  float32Parameter: 1.1,
  floatParameter: 1.1,
  int64Parameter: 111111,
  intParameter: 1,
  optEnumParameter: UsageExamplePostOptEnumParameter.Value3,
  strParameter: "example 3",
}, operationSecurity).then((res: UsageExamplePostResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```
<!-- End SDK Example Usage -->