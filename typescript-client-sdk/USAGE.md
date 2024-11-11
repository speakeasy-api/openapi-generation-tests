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
    bigintParameter: BigInt("569663"),
    bigintStrParameter: BigInt("352778"),
    boolParameter: true,
    dateParameter: new RFCDate("2022-11-22"),
    dateTimeDefaultParameter: new Date("2022-07-01T07:46:46.050Z"),
    dateTimeParameter: new Date("2024-10-20T01:22:27.683Z"),
    decimalParameter: new Decimal("1062.86"),
    decimalStrParameter: new Decimal("2346.83"),
    doubleParameter: 2152.17,
    enumParameter: "value3",
    falseyNumberParameter: 0,
    float32Parameter: 200.82,
    float64StringParameter: 5669.99,
    floatParameter: 4819.51,
    int64Parameter: 291137,
    int64StringParameter: 228622,
    intParameter: 267933,
    optEnumParameter: "value3",
    strParameter: "example 3",
  });

  // Handle the result
  console.log(result);
}

run();

```
<!-- End SDK Example Usage [usage] -->