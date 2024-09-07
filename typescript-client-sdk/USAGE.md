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
            bigintParameter: BigInt("522372"),
            bigintStrParameter: BigInt("291137"),
            boolParameter: true,
            dateParameter: new RFCDate("2022-10-17"),
            dateTimeDefaultParameter: new Date("2023-05-20T05:14:32.183Z"),
            dateTimeParameter: new Date("2023-01-22T15:28:28.876Z"),
            decimalParameter: new Decimal("1029.75"),
            decimalStrParameter: new Decimal("5669.99"),
            doubleParameter: 1952.32,
            enumParameter: "value2",
            falseyNumberParameter: 0,
            float32Parameter: 2286.22,
            float64StringParameter: 2679.33,
            floatParameter: 6946.59,
            int64Parameter: 813724,
            int64StringParameter: 518314,
            intParameter: 446729,
            optEnumParameter: "value3",
            strParameter: "example 1",
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