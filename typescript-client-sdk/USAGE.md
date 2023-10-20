<!-- Start SDK Example Usage -->


```typescript
import { SDK } from "openapi";

(async () => {
    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });

    const res = await sdk.generation.globalNameOverridden();

    if (res.statusCode == 200) {
        // handle response
    }
})();

```


## Second
Do this second
```typescript
import { SDK } from "openapi";
import {
    UsageExamplePostEnumParameter,
    UsageExamplePostOptEnumParameter,
    UsageExamplePostSecurity,
} from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

(async () => {
    const sdk = new SDK({
        globalPathParam: 100,
        globalQueryParam: "some example global query param",
    });
    const operationSecurity: UsageExamplePostSecurity = {
        password: "YOUR_PASSWORD",
        username: "YOUR_USERNAME",
    };

    const res = await sdk.generation.usageExamplePost(
        {
            requestBody: {
                fakerFormattedStrings: {},
                fakerStrings: {},
                simpleObject: {
                    any: "any",
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
                    intEnum: SimpleObjectIntEnum.Second,
                    num: 1.1,
                    str: "test",
                    strOpt: "testOptional",
                },
            },
            bigintParameter: 168827,
            bigintStrParameter: "invoice",
            boolParameter: false,
            dateParameter: new RFCDate("2022-07-22"),
            dateTimeDefaultParameter: new Date("2021-10-21T09:16:58.799Z"),
            dateTimeParameter: new Date("2022-07-26T23:56:07.107Z"),
            decimalParameter: 2911.37,
            decimalStrParameter: "Manager",
            doubleParameter: 1029.75,
            enumParameter: UsageExamplePostEnumParameter.Value2,
            falseyNumberParameter: 0,
            float32Parameter: 1952.32,
            floatParameter: 5696.63,
            int64Parameter: 264295,
            intParameter: 352778,
            optEnumParameter: UsageExamplePostOptEnumParameter.Value3,
            strParameter: "example 2",
        },
        operationSecurity
    );

    if (res.statusCode == 200) {
        // handle response
    }
})();

```
<!-- End SDK Example Usage -->