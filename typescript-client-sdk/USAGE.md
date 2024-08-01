<!-- Start SDK Example Usage [usage] -->
```typescript
import { SDK } from "openapi";
import { IntEnum } from "openapi/sdk/models/shared";
import { Decimal, RFCDate } from "openapi/sdk/types";

const sdk = new SDK({
    security: {
        apiKeyAuth: "Token YOUR_API_KEY",
    },
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
    security: {
        apiKeyAuth: "Token YOUR_API_KEY",
    },
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
    const result = await sdk.generation.usageExamplePost(
        {
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
            bigintParameter: BigInt("168827"),
            bigintStrParameter: BigInt("446729"),
            boolParameter: false,
            dateParameter: new RFCDate("2024-06-10"),
            dateTimeDefaultParameter: new Date("2023-07-23T01:43:10.512Z"),
            dateTimeParameter: new Date("2022-10-21T15:42:48.223Z"),
            decimalParameter: new Decimal("5223.72"),
            decimalStrParameter: new Decimal("2911.37"),
            doubleParameter: 6946.59,
            enumParameter: "value1",
            falseyNumberParameter: 0,
            float32Parameter: 1029.75,
            float64StringParameter: 5669.99,
            floatParameter: 1952.32,
            int64Parameter: 569663,
            int64StringParameter: 264295,
            intParameter: 352778,
            optEnumParameter: "value3",
            strParameter: "example 2",
        },
        {
            password: "YOUR_PASSWORD",
            username: "YOUR_USERNAME",
        }
    );

    // Handle the result
    console.log(result);
}

run();

```
<!-- End SDK Example Usage [usage] -->