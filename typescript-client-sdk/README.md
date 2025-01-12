# openapi

<!-- Start SDK Installation [installation] -->
## SDK Installation

> [!TIP]
> To finish publishing your SDK to npm and others you must [run your first generation action](https://www.speakeasy.com/docs/github-setup#step-by-step-guide).


The SDK can be installed with either [npm](https://www.npmjs.com/), [pnpm](https://pnpm.io/), [bun](https://bun.sh/) or [yarn](https://classic.yarnpkg.com/en/) package managers.

### NPM

```bash
npm add https://gitpkg.now.sh/speakeasy-api/openapi-generation-tests/typescript-client-sdk
```

### PNPM

```bash
pnpm add https://gitpkg.now.sh/speakeasy-api/openapi-generation-tests/typescript-client-sdk
```

### Bun

```bash
bun add https://gitpkg.now.sh/speakeasy-api/openapi-generation-tests/typescript-client-sdk
```

### Yarn

```bash
yarn add https://gitpkg.now.sh/speakeasy-api/openapi-generation-tests/typescript-client-sdk zod

# Note that Yarn does not install peer dependencies automatically. You will need
# to install zod as shown above.
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example 1

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

### Example 2

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
        dateFormat: new RFCDate("2024-05-21"),
        datetimeFormat: new Date("2024-10-30T03:05:14.934Z"),
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
        createdAt: "1730917105463",
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
        expiredAt: "1725478652911",
        expires: "<value>",
        expiresAt: "1761323601648",
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
        updatedAt: "1736582699091",
        uri: "https://blushing-pinstripe.biz/",
        url: "https://utilized-flight.org/",
        username: "Tierra12",
        uuid: "20e05958-b9b2-4d8a-98f4-f055ce98595b",
      },
      fakerSnakeCasePropertyNameStrings: {
        countryCode: "FJ",
        createdAt: "1731631878597",
        expiredAt: "1722109955052",
        updatedAt: "1736555602308",
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
    dateParameter: new RFCDate("2023-10-04"),
    dateTimeDefaultParameter: new Date("2024-04-18T03:54:57.502Z"),
    dateTimeParameter: new Date("2023-10-08T06:44:22.550Z"),
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

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [auth](docs/sdks/auth/README.md)

* [apiKeyAuth](docs/sdks/auth/README.md#apikeyauth)
* [apiKeyAuthGlobal](docs/sdks/auth/README.md#apikeyauthglobal)
* [basicAuth](docs/sdks/auth/README.md#basicauth)
* [bearerAuth](docs/sdks/auth/README.md#bearerauth)
* [globalBearerAuth](docs/sdks/auth/README.md#globalbearerauth)
* [noAuth](docs/sdks/auth/README.md#noauth)
* [oauth2Auth](docs/sdks/auth/README.md#oauth2auth)
* [oauth2Override](docs/sdks/auth/README.md#oauth2override)
* [openIdConnectAuth](docs/sdks/auth/README.md#openidconnectauth)

### [authNew](docs/sdks/authnew/README.md)

* [authGlobal](docs/sdks/authnew/README.md#authglobal)
* [basicAuthNew](docs/sdks/authnew/README.md#basicauthnew)
* [customSchemeAppId](docs/sdks/authnew/README.md#customschemeappid)
* [multipleMixedOptionsAuth](docs/sdks/authnew/README.md#multiplemixedoptionsauth)
* [multipleMixedSchemeAuth](docs/sdks/authnew/README.md#multiplemixedschemeauth)
* [multipleOptionsWithMixedSchemesAuth](docs/sdks/authnew/README.md#multipleoptionswithmixedschemesauth)
* [multipleOptionsWithSimpleSchemesAuth](docs/sdks/authnew/README.md#multipleoptionswithsimpleschemesauth)
* [multipleSimpleOptionsAuth](docs/sdks/authnew/README.md#multiplesimpleoptionsauth)
* [multipleSimpleSchemeAuth](docs/sdks/authnew/README.md#multiplesimpleschemeauth)
* [oauth2AuthNew](docs/sdks/authnew/README.md#oauth2authnew)
* [openIdConnectAuthNew](docs/sdks/authnew/README.md#openidconnectauthnew)

### [customClient](docs/sdks/customclient/README.md)

* [customClientPost](docs/sdks/customclient/README.md#customclientpost)

### [documentation](docs/sdks/documentation/README.md)

* [getDocumentationPerLanguage](docs/sdks/documentation/README.md#getdocumentationperlanguage) - Gets documentation for some language, I guess.

### [errors](docs/sdks/errors/README.md)

* [connectionErrorGet](docs/sdks/errors/README.md#connectionerrorget)
* [errorUnionDiscriminatedPost](docs/sdks/errors/README.md#erroruniondiscriminatedpost)
* [errorUnionPost](docs/sdks/errors/README.md#errorunionpost)
* [statusGetError](docs/sdks/errors/README.md#statusgeterror)
* [statusGetXSpeakeasyErrors](docs/sdks/errors/README.md#statusgetxspeakeasyerrors)

### [eventstreams](docs/sdks/eventstreams/README.md)

* [chat](docs/sdks/eventstreams/README.md#chat)
* [chatSkipSentinel](docs/sdks/eventstreams/README.md#chatskipsentinel)
* [differentDataSchemas](docs/sdks/eventstreams/README.md#differentdataschemas)
* [json](docs/sdks/eventstreams/README.md#json)
* [multiline](docs/sdks/eventstreams/README.md#multiline)
* [rich](docs/sdks/eventstreams/README.md#rich)
* [text](docs/sdks/eventstreams/README.md#text)

### [first](docs/sdks/first/README.md)

* [get](docs/sdks/first/README.md#get)

### [flattening](docs/sdks/flattening/README.md)

* [componentBodyAndParamConflict](docs/sdks/flattening/README.md#componentbodyandparamconflict)
* [componentBodyAndParamNoConflict](docs/sdks/flattening/README.md#componentbodyandparamnoconflict)
* [conflictingParams](docs/sdks/flattening/README.md#conflictingparams)
* [inlineBodyAndParamConflict](docs/sdks/flattening/README.md#inlinebodyandparamconflict)
* [inlineBodyAndParamNoConflict](docs/sdks/flattening/README.md#inlinebodyandparamnoconflict)
* [requiredBodyAllOptional](docs/sdks/flattening/README.md#requiredbodyalloptional)

### [generation](docs/sdks/generation/README.md)

* [anchorTypesGet](docs/sdks/generation/README.md#anchortypesget)
* [arrayCircularReferenceGet](docs/sdks/generation/README.md#arraycircularreferenceget)
* [circularReferenceGet](docs/sdks/generation/README.md#circularreferenceget)
* [circularReferenceOneDegree](docs/sdks/generation/README.md#circularreferenceonedegree) - A reference cycle that spans three models separated by one degree
* [dateParamWithDefault](docs/sdks/generation/README.md#dateparamwithdefault)
* [dateTimeParamWithDefault](docs/sdks/generation/README.md#datetimeparamwithdefault)
* [decimalParamWithDefault](docs/sdks/generation/README.md#decimalparamwithdefault)
* [deprecatedFieldInSchemaPost](docs/sdks/generation/README.md#deprecatedfieldinschemapost)
* [deprecatedObjectInSchemaGet](docs/sdks/generation/README.md#deprecatedobjectinschemaget)
* [~~deprecatedOperationNoCommentsGet~~](docs/sdks/generation/README.md#deprecatedoperationnocommentsget) - :warning: **Deprecated**
* [~~deprecatedOperationWithCommentsGet~~](docs/sdks/generation/README.md#deprecatedoperationwithcommentsget) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** Use [simplePathParameterObjects](docs/sdks/parameters/README.md#simplepathparameterobjects) instead.
* [~~deprecatedOperationWithMultilineCommentGet~~](docs/sdks/generation/README.md#deprecatedoperationwithmultilinecommentget) - This is an endpoint setup to test deprecation with multiline comments :warning: **Deprecated** Use [simplePathParameterObjects](docs/sdks/parameters/README.md#simplepathparameterobjects) instead.
* [emptyObjectGet](docs/sdks/generation/README.md#emptyobjectget)
* [emptyResponseObjectWithCommentGet](docs/sdks/generation/README.md#emptyresponseobjectwithcommentget)
* [globalNameOverridden](docs/sdks/generation/README.md#globalnameoverridden)
* [ignoredGenerationGet](docs/sdks/generation/README.md#ignoredgenerationget)
* [ignoresPost](docs/sdks/generation/README.md#ignorespost)
* [nameOverride](docs/sdks/generation/README.md#nameoverride)
* [objectCircularReferenceGet](docs/sdks/generation/README.md#objectcircularreferenceget)
* [oneOfCircularReferenceGet](docs/sdks/generation/README.md#oneofcircularreferenceget)
* [reactHookCombinedOptions](docs/sdks/generation/README.md#reacthookcombinedoptions)
* [reactHookDisabled](docs/sdks/generation/README.md#reacthookdisabled)
* [reactHookGetAsMutation](docs/sdks/generation/README.md#reacthookgetasmutation)
* [reactHookPostAsQuery](docs/sdks/generation/README.md#reacthookpostasquery)
* [reactHookRenamed](docs/sdks/generation/README.md#reacthookrenamed)
* [typedParameterGenerationGet](docs/sdks/generation/README.md#typedparametergenerationget)
* [usageExamplePost](docs/sdks/generation/README.md#usageexamplepost) - An operation used for testing usage examples

### [globals](docs/sdks/globals/README.md)

* [globalPathParameterGet](docs/sdks/globals/README.md#globalpathparameterget)
* [globalsHeaderGet](docs/sdks/globals/README.md#globalsheaderget)
* [globalsHiddenPost](docs/sdks/globals/README.md#globalshiddenpost)
* [globalsOptionalHiddenPathParameterOperationRequired](docs/sdks/globals/README.md#globalsoptionalhiddenpathparameteroperationrequired) - This operation requires a globally optional hidden path parameter. A
failing test with 404 likely indicates that the path parameter value is
not being templated into the client (.../hidden//...).

* [globalsOptionalHiddenPathParameterPathRequired](docs/sdks/globals/README.md#globalsoptionalhiddenpathparameterpathrequired) - This path requires a globally optional hidden path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the client (.../hidden//...).

* [globalsOptionalPathParameterOperationRequired](docs/sdks/globals/README.md#globalsoptionalpathparameteroperationrequired) - This operation requires a globally optional path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the operation request (.../globals//...).

* [globalsOptionalPathParameterPathRequired](docs/sdks/globals/README.md#globalsoptionalpathparameterpathrequired) - This path requires a globally optional path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the operation request (.../globals//...).

* [globalsQueryParameterGet](docs/sdks/globals/README.md#globalsqueryparameterget)

### [health](docs/sdks/health/README.md)

* [check](docs/sdks/health/README.md#check)

### [hooks](docs/sdks/hooks/README.md)

* [authorizationHeaderModification](docs/sdks/hooks/README.md#authorizationheadermodification)
* [testHooks](docs/sdks/hooks/README.md#testhooks)
* [testHooksAfterResponse](docs/sdks/hooks/README.md#testhooksafterresponse)
* [testHooksBeforeCreateRequestPaths](docs/sdks/hooks/README.md#testhooksbeforecreaterequestpaths)
* [testHooksError](docs/sdks/hooks/README.md#testhookserror)

### [methods](docs/sdks/methods/README.md)

* [methodDelete](docs/sdks/methods/README.md#methoddelete)
* [methodGet](docs/sdks/methods/README.md#methodget)
* [methodHead](docs/sdks/methods/README.md#methodhead)
* [methodOptions](docs/sdks/methods/README.md#methodoptions)
* [methodPatch](docs/sdks/methods/README.md#methodpatch)
* [methodPost](docs/sdks/methods/README.md#methodpost)
* [methodPut](docs/sdks/methods/README.md#methodput)
* [methodTrace](docs/sdks/methods/README.md#methodtrace)

### [nest](docs/sdks/nest/README.md)


#### [nest.first](docs/sdks/sdkfirst/README.md)

* [get](docs/sdks/sdkfirst/README.md#get)

### [nested](docs/sdks/nested/README.md)

* [get](docs/sdks/nested/README.md#get)

#### [nested.first](docs/sdks/sdknestedfirst/README.md)

* [get](docs/sdks/sdknestedfirst/README.md#get)

#### [nested.second](docs/sdks/sdksecond/README.md)

* [get](docs/sdks/sdksecond/README.md#get)

### [openEnums](docs/sdks/openenums/README.md)

* [openEnumsPostUnrecognized](docs/sdks/openenums/README.md#openenumspostunrecognized)

### [pagination](docs/sdks/pagination/README.md)

* [paginationAmbiguousInput](docs/sdks/pagination/README.md#paginationambiguousinput) - This is a paginated operation where there is both a query parameter and
request body field called "cursor". This ambiguity is used to test that
the generator only updates the appropriate field in the pagination code
"next()" function.

* [paginationBodyFlattenedOptionalSecurity](docs/sdks/pagination/README.md#paginationbodyflattenedoptionalsecurity)
* [paginationBodyFlattenedWithSecurity](docs/sdks/pagination/README.md#paginationbodyflattenedwithsecurity)
* [paginationBodyWrappedRequest](docs/sdks/pagination/README.md#paginationbodywrappedrequest) - This operation has a request wrapper type that encapsulates the
parameters and request body. The pagination inputs are meant to go in
the request body and we want to test that the generator correctly
generates the next() function call preserving everything from the
original request and interpolating the next pagination inputs.

* [paginationCursorBody](docs/sdks/pagination/README.md#paginationcursorbody)
* [paginationCursorNonNumeric](docs/sdks/pagination/README.md#paginationcursornonnumeric)
* [paginationCursorParams](docs/sdks/pagination/README.md#paginationcursorparams)
* [paginationEncapsulatedParameter](docs/sdks/pagination/README.md#paginationencapsulatedparameter) - This is a paginated operation where the input is a query parameter
but the number of arguments exceeds maxMethodParams so it ends up
being encapsulated into a request object.

* [paginationLimitOffsetDeepOutputsPageBody](docs/sdks/pagination/README.md#paginationlimitoffsetdeepoutputspagebody)
* [paginationLimitOffsetDefaultOffsetBody](docs/sdks/pagination/README.md#paginationlimitoffsetdefaultoffsetbody)
* [paginationLimitOffsetDefaultOffsetParams](docs/sdks/pagination/README.md#paginationlimitoffsetdefaultoffsetparams)
* [paginationLimitOffsetOffsetBody](docs/sdks/pagination/README.md#paginationlimitoffsetoffsetbody)
* [paginationLimitOffsetOffsetParams](docs/sdks/pagination/README.md#paginationlimitoffsetoffsetparams)
* [paginationLimitOffsetOptionalPageParams](docs/sdks/pagination/README.md#paginationlimitoffsetoptionalpageparams)
* [paginationLimitOffsetPageBody](docs/sdks/pagination/README.md#paginationlimitoffsetpagebody)
* [paginationLimitOffsetPageParams](docs/sdks/pagination/README.md#paginationlimitoffsetpageparams)
* [paginationURLParams](docs/sdks/pagination/README.md#paginationurlparams)
* [paginationWithRetries](docs/sdks/pagination/README.md#paginationwithretries)
* [paginationWrappedOptionalBody](docs/sdks/pagination/README.md#paginationwrappedoptionalbody)

### [parameters](docs/sdks/parameters/README.md)

* [deepObjectQueryParamsDeepObject](docs/sdks/parameters/README.md#deepobjectqueryparamsdeepobject)
* [deepObjectQueryParamsMap](docs/sdks/parameters/README.md#deepobjectqueryparamsmap)
* [deepObjectQueryParamsObject](docs/sdks/parameters/README.md#deepobjectqueryparamsobject)
* [duplicateParam](docs/sdks/parameters/README.md#duplicateparam)
* [formQueryParamsArray](docs/sdks/parameters/README.md#formqueryparamsarray)
* [formQueryParamsCamelObject](docs/sdks/parameters/README.md#formqueryparamscamelobject)
* [formQueryParamsMap](docs/sdks/parameters/README.md#formqueryparamsmap)
* [formQueryParamsObject](docs/sdks/parameters/README.md#formqueryparamsobject)
* [formQueryParamsPrimitive](docs/sdks/parameters/README.md#formqueryparamsprimitive)
* [formQueryParamsRefParamObject](docs/sdks/parameters/README.md#formqueryparamsrefparamobject)
* [headerParamsArray](docs/sdks/parameters/README.md#headerparamsarray)
* [headerParamsMap](docs/sdks/parameters/README.md#headerparamsmap)
* [headerParamsObject](docs/sdks/parameters/README.md#headerparamsobject)
* [headerParamsPrimitive](docs/sdks/parameters/README.md#headerparamsprimitive)
* [jsonQueryParamsObject](docs/sdks/parameters/README.md#jsonqueryparamsobject)
* [jsonQueryParamsObjectSmaller](docs/sdks/parameters/README.md#jsonqueryparamsobjectsmaller)
* [mixedParametersCamelCase](docs/sdks/parameters/README.md#mixedparameterscamelcase)
* [mixedParametersPrimitives](docs/sdks/parameters/README.md#mixedparametersprimitives)
* [mixedQueryParams](docs/sdks/parameters/README.md#mixedqueryparams)
* [pathParameterJson](docs/sdks/parameters/README.md#pathparameterjson)
* [pipeDelimitedQueryParamsArray](docs/sdks/parameters/README.md#pipedelimitedqueryparamsarray)
* [simplePathParameterArrays](docs/sdks/parameters/README.md#simplepathparameterarrays)
* [simplePathParameterMaps](docs/sdks/parameters/README.md#simplepathparametermaps)
* [simplePathParameterObjects](docs/sdks/parameters/README.md#simplepathparameterobjects)
* [simplePathParameterPrimitives](docs/sdks/parameters/README.md#simplepathparameterprimitives)

### [requestBodies](docs/sdks/requestbodies/README.md)

* [nullEnumPost](docs/sdks/requestbodies/README.md#nullenumpost)
* [nullableObjectPost](docs/sdks/requestbodies/README.md#nullableobjectpost)
* [nullableOptionalFieldsPost](docs/sdks/requestbodies/README.md#nullableoptionalfieldspost)
* [nullableRequiredEmptyObjectPost](docs/sdks/requestbodies/README.md#nullablerequiredemptyobjectpost)
* [nullableRequiredPropertyPost](docs/sdks/requestbodies/README.md#nullablerequiredpropertypost)
* [nullableRequiredSharedObjectPost](docs/sdks/requestbodies/README.md#nullablerequiredsharedobjectpost)
* [requestBodyDeprecatedRequestBodyRefPost](docs/sdks/requestbodies/README.md#requestbodydeprecatedrequestbodyrefpost)
* [requestBodyGetInferredOptionalRequestWrapper](docs/sdks/requestbodies/README.md#requestbodygetinferredoptionalrequestwrapper)
* [requestBodyPostApplicationJsonArray](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarray)
* [requestBodyPostApplicationJsonArrayCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarraycamelcase)
* [requestBodyPostApplicationJsonArrayObj](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayobj)
* [requestBodyPostApplicationJsonArrayObjCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayobjcamelcase)
* [requestBodyPostApplicationJsonArrayOfArray](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofarray)
* [requestBodyPostApplicationJsonArrayOfArrayCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofarraycamelcase)
* [requestBodyPostApplicationJsonArrayOfArrayOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofarrayofprimitive)
* [requestBodyPostApplicationJsonArrayOfMap](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofmap)
* [requestBodyPostApplicationJsonArrayOfMapCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofmapcamelcase)
* [requestBodyPostApplicationJsonArrayOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofprimitive)
* [requestBodyPostApplicationJsonArrayOfUnions](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofunions)
* [requestBodyPostApplicationJsonDeep](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsondeep)
* [requestBodyPostApplicationJsonDeepCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsondeepcamelcase)
* [requestBodyPostApplicationJsonMap](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmap)
* [requestBodyPostApplicationJsonMapCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapcamelcase)
* [requestBodyPostApplicationJsonMapObj](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapobj)
* [requestBodyPostApplicationJsonMapObjCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapobjcamelcase)
* [requestBodyPostApplicationJsonMapOfArray](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofarray)
* [requestBodyPostApplicationJsonMapOfArrayCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofarraycamelcase)
* [requestBodyPostApplicationJsonMapOfMap](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofmap)
* [requestBodyPostApplicationJsonMapOfMapCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofmapcamelcase)
* [requestBodyPostApplicationJsonMapOfMapOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofmapofprimitive)
* [requestBodyPostApplicationJsonMapOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofprimitive)
* [requestBodyPostApplicationJsonMultipleJsonFiltered](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmultiplejsonfiltered)
* [requestBodyPostApplicationJsonSimple](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonsimple)
* [requestBodyPostApplicationJsonSimpleCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonsimplecamelcase)
* [requestBodyPostComplexNumberTypes](docs/sdks/requestbodies/README.md#requestbodypostcomplexnumbertypes)
* [requestBodyPostDefaultsAndConsts](docs/sdks/requestbodies/README.md#requestbodypostdefaultsandconsts)
* [requestBodyPostEmptyBodyRetainedWithAllOptionalFields](docs/sdks/requestbodies/README.md#requestbodypostemptybodyretainedwithalloptionalfields)
* [requestBodyPostEmptyObject](docs/sdks/requestbodies/README.md#requestbodypostemptyobject)
* [requestBodyPostFormDeep](docs/sdks/requestbodies/README.md#requestbodypostformdeep)
* [requestBodyPostFormMapPrimitive](docs/sdks/requestbodies/README.md#requestbodypostformmapprimitive)
* [requestBodyPostFormSimple](docs/sdks/requestbodies/README.md#requestbodypostformsimple)
* [requestBodyPostJsonDataTypesArrayBigInt](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesarraybigint)
* [requestBodyPostJsonDataTypesArrayDate](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesarraydate)
* [requestBodyPostJsonDataTypesArrayDecimalStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesarraydecimalstr)
* [requestBodyPostJsonDataTypesBigInt](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesbigint)
* [requestBodyPostJsonDataTypesBigIntStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesbigintstr)
* [requestBodyPostJsonDataTypesBoolean](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesboolean)
* [requestBodyPostJsonDataTypesComplexNumberArrays](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypescomplexnumberarrays)
* [requestBodyPostJsonDataTypesComplexNumberMaps](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypescomplexnumbermaps)
* [requestBodyPostJsonDataTypesDate](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdate)
* [requestBodyPostJsonDataTypesDateTime](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdatetime)
* [requestBodyPostJsonDataTypesDecimal](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdecimal)
* [requestBodyPostJsonDataTypesDecimalStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdecimalstr)
* [requestBodyPostJsonDataTypesFloat32](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesfloat32)
* [requestBodyPostJsonDataTypesInt32](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesint32)
* [requestBodyPostJsonDataTypesInteger](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesinteger)
* [requestBodyPostJsonDataTypesMapBigIntStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesmapbigintstr)
* [requestBodyPostJsonDataTypesMapDateTime](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesmapdatetime)
* [requestBodyPostJsonDataTypesMapDecimal](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesmapdecimal)
* [requestBodyPostJsonDataTypesNumber](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesnumber)
* [requestBodyPostJsonDataTypesString](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesstring)
* [requestBodyPostMultipleContentTypesComponentFiltered](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypescomponentfiltered)
* [requestBodyPostMultipleContentTypesComponentFilteredDefaultTest](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypescomponentfiltereddefaulttest)
* [requestBodyPostMultipleContentTypesInlineFiltered](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypesinlinefiltered)
* [requestBodyPostMultipleContentTypesSplitParamForm](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparamform)
* [requestBodyPostMultipleContentTypesSplitParamJson](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparamjson)
* [requestBodyPostMultipleContentTypesSplitParamMultipart](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparammultipart)
* [requestBodyPostMultipleContentTypesSplitForm](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitform)
* [requestBodyPostMultipleContentTypesSplitJson](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitjson)
* [requestBodyPostMultipleContentTypesSplitMultipart](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitmultipart)
* [requestBodyPostNotNullableNotRequiredStringBody](docs/sdks/requestbodies/README.md#requestbodypostnotnullablenotrequiredstringbody)
* [requestBodyPostNullArray](docs/sdks/requestbodies/README.md#requestbodypostnullarray)
* [requestBodyPostNullDictionary](docs/sdks/requestbodies/README.md#requestbodypostnulldictionary)
* [requestBodyPostNullableNotRequiredStringBody](docs/sdks/requestbodies/README.md#requestbodypostnullablenotrequiredstringbody)
* [requestBodyPostNullableRequiredStringBody](docs/sdks/requestbodies/README.md#requestbodypostnullablerequiredstringbody)
* [requestBodyPutBytes](docs/sdks/requestbodies/README.md#requestbodyputbytes)
* [requestBodyPutBytesWithParams](docs/sdks/requestbodies/README.md#requestbodyputbyteswithparams)
* [requestBodyPutMultipartDeep](docs/sdks/requestbodies/README.md#requestbodyputmultipartdeep)
* [requestBodyPutMultipartDifferentFileName](docs/sdks/requestbodies/README.md#requestbodyputmultipartdifferentfilename)
* [requestBodyPutMultipartFile](docs/sdks/requestbodies/README.md#requestbodyputmultipartfile)
* [requestBodyPutMultipartFileRef](docs/sdks/requestbodies/README.md#requestbodyputmultipartfileref)
* [requestBodyPutMultipartOptionalRequestBody](docs/sdks/requestbodies/README.md#requestbodyputmultipartoptionalrequestbody)
* [requestBodyPutMultipartSimple](docs/sdks/requestbodies/README.md#requestbodyputmultipartsimple)
* [requestBodyPutString](docs/sdks/requestbodies/README.md#requestbodyputstring)
* [requestBodyPutStringWithParams](docs/sdks/requestbodies/README.md#requestbodyputstringwithparams)
* [requestBodyReadAndWrite](docs/sdks/requestbodies/README.md#requestbodyreadandwrite)
* [requestBodyReadOnlyInput](docs/sdks/requestbodies/README.md#requestbodyreadonlyinput)
* [requestBodyReadOnlyUnion](docs/sdks/requestbodies/README.md#requestbodyreadonlyunion)
* [requestBodyReadWriteOnlyUnion](docs/sdks/requestbodies/README.md#requestbodyreadwriteonlyunion)
* [requestBodyWriteOnly](docs/sdks/requestbodies/README.md#requestbodywriteonly)
* [requestBodyWriteOnlyOutput](docs/sdks/requestbodies/README.md#requestbodywriteonlyoutput)
* [requestBodyWriteOnlyUnion](docs/sdks/requestbodies/README.md#requestbodywriteonlyunion)

### [resource](docs/sdks/resource/README.md)

* [createFile](docs/sdks/resource/README.md#createfile)
* [createResource](docs/sdks/resource/README.md#createresource)
* [deleteResource](docs/sdks/resource/README.md#deleteresource)
* [getArrayDataSource](docs/sdks/resource/README.md#getarraydatasource)
* [getResource](docs/sdks/resource/README.md#getresource)
* [updateResource](docs/sdks/resource/README.md#updateresource)

### [responseBodies](docs/sdks/responsebodies/README.md)

* [flattenedEnvelopePaginationResponse](docs/sdks/responsebodies/README.md#flattenedenvelopepaginationresponse)
* [flattenedEnvelopeResponse](docs/sdks/responsebodies/README.md#flattenedenveloperesponse)
* [flattenedEnvelopeUnionResponse](docs/sdks/responsebodies/README.md#flattenedenvelopeunionresponse)
* [flattenedUnionResponse](docs/sdks/responsebodies/README.md#flattenedunionresponse)
* [overriddenFieldNamesPost](docs/sdks/responsebodies/README.md#overriddenfieldnamespost)
* [responseBodies2xxJSONObjectAllOptionalProperties](docs/sdks/responsebodies/README.md#responsebodies2xxjsonobjectalloptionalproperties)
* [responseBodyAdditionalPropertiesAnyPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiesanypost)
* [responseBodyAdditionalPropertiesComplexNumbersPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiescomplexnumberspost)
* [responseBodyAdditionalPropertiesDatePost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiesdatepost)
* [responseBodyAdditionalPropertiesObjectPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiesobjectpost)
* [responseBodyAdditionalPropertiesPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiespost)
* [responseBodyBytesGet](docs/sdks/responsebodies/README.md#responsebodybytesget)
* [responseBodyDecimalStr](docs/sdks/responsebodies/README.md#responsebodydecimalstr)
* [responseBodyEmptyWithHeaders](docs/sdks/responsebodies/README.md#responsebodyemptywithheaders)
* [responseBodyMissing2xxOr3xxGet](docs/sdks/responsebodies/README.md#responsebodymissing2xxor3xxget)
* [responseBodyMultilineStringPost](docs/sdks/responsebodies/README.md#responsebodymultilinestringpost)
* [responseBodyOptionalGet](docs/sdks/responsebodies/README.md#responsebodyoptionalget)
* [responseBodyReadOnly](docs/sdks/responsebodies/README.md#responsebodyreadonly)
* [responseBodyStringGet](docs/sdks/responsebodies/README.md#responsebodystringget)
* [responseBodyXmlGet](docs/sdks/responsebodies/README.md#responsebodyxmlget)

### [retries](docs/sdks/retries/README.md)

* [retriesAfter](docs/sdks/retries/README.md#retriesafter)
* [retriesConnectErrorGet](docs/sdks/retries/README.md#retriesconnecterrorget) - A request to a non-valid port to test connection errors
* [retriesFlatEmptyResponsePost](docs/sdks/retries/README.md#retriesflatemptyresponsepost)
* [retriesGet](docs/sdks/retries/README.md#retriesget)
* [retriesPost](docs/sdks/retries/README.md#retriespost)

### [SDK](docs/sdks/sdk/README.md)

* [ambiguousQueryParam](docs/sdks/sdk/README.md#ambiguousqueryparam) - Tests conflict with C# System namespace
* [authenticatedRequest](docs/sdks/sdk/README.md#authenticatedrequest)
* [conflictingEnum](docs/sdks/sdk/README.md#conflictingenum) - Test potential namespace conflicts with java.lang.Object
* [ignoredGenerationPut](docs/sdks/sdk/README.md#ignoredgenerationput)
* [postAdditionalPropertiesWithNullableFields](docs/sdks/sdk/README.md#postadditionalpropertieswithnullablefields)
* [responseBodyJsonGet](docs/sdks/sdk/README.md#responsebodyjsonget)

### [second](docs/sdks/second/README.md)

* [get](docs/sdks/second/README.md#get)

### [servers](docs/sdks/servers/README.md)

* [selectGlobalServer](docs/sdks/servers/README.md#selectglobalserver)
* [selectServerWithID](docs/sdks/servers/README.md#selectserverwithid) - Select a server by ID.
* [serverWithProtocolTemplate](docs/sdks/servers/README.md#serverwithprotocoltemplate)
* [serverWithTemplates](docs/sdks/servers/README.md#serverwithtemplates)
* [serverWithTemplatesGlobal](docs/sdks/servers/README.md#serverwithtemplatesglobal)
* [serversByIDWithTemplates](docs/sdks/servers/README.md#serversbyidwithtemplates)
* [serversOverrideGlobalServerURL](docs/sdks/servers/README.md#serversoverrideglobalserverurl)
* [serversOverrideOperationServerURL](docs/sdks/servers/README.md#serversoverrideoperationserverurl)

### [statusCode](docs/sdks/statuscode/README.md)

* [statusCode2XX](docs/sdks/statuscode/README.md#statuscode2xx)
* [statusCode4XX](docs/sdks/statuscode/README.md#statuscode4xx)
* [statusCode5XX](docs/sdks/statuscode/README.md#statuscode5xx)
* [statusCodeDefault](docs/sdks/statuscode/README.md#statuscodedefault)

### [telemetry](docs/sdks/telemetry/README.md)

* [telemetrySpeakeasyUserAgentGet](docs/sdks/telemetry/README.md#telemetryspeakeasyuseragentget)
* [telemetryUserAgentGet](docs/sdks/telemetry/README.md#telemetryuseragentget)

### [unions](docs/sdks/unions/README.md)

* [arrayOfDiscriminatedUnions](docs/sdks/unions/README.md#arrayofdiscriminatedunions)
* [arrayOfDiscriminatedUnionsMap](docs/sdks/unions/README.md#arrayofdiscriminatedunionsmap)
* [collectionOneOfPost](docs/sdks/unions/README.md#collectiononeofpost)
* [constDiscriminatedOneOf](docs/sdks/unions/README.md#constdiscriminatedoneof)
* [discriminatedOneMultipleMemberships](docs/sdks/unions/README.md#discriminatedonemultiplememberships)
* [discriminatedOneMultipleMembershipsHasWheels](docs/sdks/unions/README.md#discriminatedonemultiplemembershipshaswheels)
* [flattenedTypedObjectPost](docs/sdks/unions/README.md#flattenedtypedobjectpost)
* [infectedWithAny](docs/sdks/unions/README.md#infectedwithany)
* [mixedTypeOneOfPost](docs/sdks/unions/README.md#mixedtypeoneofpost)
* [mixedUnionTypes](docs/sdks/unions/README.md#mixeduniontypes)
* [nestedArrayOfDiscriminatedUnions](docs/sdks/unions/README.md#nestedarrayofdiscriminatedunions)
* [nullableOneOfRefInObjectPost](docs/sdks/unions/README.md#nullableoneofrefinobjectpost)
* [nullableOneOfSchemaPost](docs/sdks/unions/README.md#nullableoneofschemapost)
* [nullableOneOfTypeInObjectPost](docs/sdks/unions/README.md#nullableoneoftypeinobjectpost)
* [nullableTypedObjectPost](docs/sdks/unions/README.md#nullabletypedobjectpost)
* [oneOfOverlappingObjects](docs/sdks/unions/README.md#oneofoverlappingobjects)
* [primitiveTypeOneOfPost](docs/sdks/unions/README.md#primitivetypeoneofpost)
* [stronglyTypedOneOfDiscriminatedPost](docs/sdks/unions/README.md#stronglytypedoneofdiscriminatedpost)
* [stronglyTypedOneOfPost](docs/sdks/unions/README.md#stronglytypedoneofpost)
* [stronglyTypedOneOfPostWithNonStandardDiscriminatorName](docs/sdks/unions/README.md#stronglytypedoneofpostwithnonstandarddiscriminatorname)
* [typedObjectNullableOneOfPost](docs/sdks/unions/README.md#typedobjectnullableoneofpost)
* [typedObjectOneOfPost](docs/sdks/unions/README.md#typedobjectoneofpost)
* [unionBigIntStrDecimal](docs/sdks/unions/README.md#unionbigintstrdecimal)
* [unionDateNull](docs/sdks/unions/README.md#uniondatenull)
* [unionDateTimeBigInt](docs/sdks/unions/README.md#uniondatetimebigint)
* [unionDateTimeNull](docs/sdks/unions/README.md#uniondatetimenull)
* [unionMap](docs/sdks/unions/README.md#unionmap)
* [unionMapOptional](docs/sdks/unions/README.md#unionmapoptional)
* [unionNestedEnumsForm](docs/sdks/unions/README.md#unionnestedenumsform)
* [unionNestedEnumsMultipart](docs/sdks/unions/README.md#unionnestedenumsmultipart)
* [unionOfArraysPost](docs/sdks/unions/README.md#unionofarrayspost)
* [weaklyTypedOneOfNullEnumPost](docs/sdks/unions/README.md#weaklytypedoneofnullenumpost)
* [weaklyTypedOneOfPost](docs/sdks/unions/README.md#weaklytypedoneofpost)

### [webhooks](docs/sdks/webhooks/README.md)

* [sendWebhookUserCreated](docs/sdks/webhooks/README.md#sendwebhookusercreated)
* [sendWebhookUserUpdated](docs/sdks/webhooks/README.md#sendwebhookuserupdated)

</details>
<!-- End Available Resources and Operations [operations] -->





<!-- Start Pagination [pagination] -->
## Pagination

Some of the endpoints in this SDK support pagination. To use pagination, you
make your SDK calls as usual, but the returned response object will also be an
async iterable that can be consumed using the [`for await...of`][for-await-of]
syntax.

[for-await-of]: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/for-await...of

Here's an example of one such pagination call:

```typescript
import { SDK } from "openapi";

const sdk = new SDK({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.generation.reactHookCombinedOptions(122236);

  for await (const page of result) {
    // Handle the page
    console.log(page);
  }
}

run();

```
<!-- End Pagination [pagination] -->



<!-- Start Global Parameters [global-parameters] -->
## Global Parameters

Certain parameters are configured globally. These parameters may be set on the SDK client instance itself during initialization. When configured as an option during SDK initialization, These global values will be used as defaults on the operations that use them. When such operations are called, there is a place in each to override the global value, if needed.

For example, you can set `globalHeaderParam` to `true` at SDK initialization and then you do not have to pass the same value on calls to operations like `globalPathParameterGet`. But if you want to do so you may, which will locally override the global setting. See the example code below for a demonstration.


### Available Globals

The following global parameters are available.

| Name                          | Type    | Description                                                                                                                                                                                                              |
| ----------------------------- | ------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| globalHeaderParam             | boolean | The globalHeaderParam parameter.                                                                                                                                                                                         |
| globalHiddenHeaderParam       | string  | The globalHiddenHeaderParam parameter.                                                                                                                                                                                   |
| globalHiddenPathParam         | string  | The globalHiddenPathParam parameter.                                                                                                                                                                                     |
| globalHiddenQueryParam        | string  | The globalHiddenQueryParam parameter.                                                                                                                                                                                    |
| globalOptionalHiddenPathParam | string  | An optional and hidden global path parameter. Some paths and operations<br/>will override it to required: true, especially for verifying test<br/>generation where the value should be templated in the SDK client.<br/> |
| globalOptionalPathParam       | string  | An optional global path parameter. Some paths and operations will<br/>override it to required: true, especially for verifying test generation<br/>where the value should be templated in the operation request.<br/>     |
| globalPathParam               | number  | The globalPathParam parameter.                                                                                                                                                                                           |
| globalQueryParam              | string  | The globalQueryParam parameter.                                                                                                                                                                                          |

### Example

```typescript
import { SDK } from "openapi";

const sdk = new SDK({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.globals.globalPathParameterGet(100);

  // Handle the result
  console.log(result);
}

run();

```
<!-- End Global Parameters [global-parameters] -->



<!-- Start Error Handling [errors] -->
## Error Handling

Some methods specify known errors which can be thrown. All the known errors are enumerated in the `sdk/models/errors/errors.ts` module. The known errors for a method are documented under the *Errors* tables in SDK docs. For example, the `errorUnionDiscriminatedPost` method may throw the following errors:

| Error Type          | Status Code | Content Type     |
| ------------------- | ----------- | ---------------- |
| errors.TaggedError1 | 4XX         | application/json |
| errors.TaggedError2 | 4XX         | application/json |
| errors.SDKError     | 5XX         | \*/\*            |

If the method throws an error and it is not captured by the known errors, it will default to throwing a `SDKError`.

```typescript
import { SDK } from "openapi";
import {
  SDKValidationError,
  TaggedError1,
  TaggedError2,
} from "openapi/sdk/models/errors";

const sdk = new SDK({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  try {
    await sdk.errors.errorUnionDiscriminatedPost({
      tag: "<value>",
      taggedError2Message: {
        message: "<value>",
      },
    });
  } catch (err) {
    switch (true) {
      // The server response does not match the expected SDK schema
      case (err instanceof SDKValidationError): {
        // Pretty-print will provide a human-readable multi-line error message
        console.error(err.pretty());
        // Raw value may also be inspected
        console.error(err.rawValue);
        return;
      }
      // Known error
      case (err instanceof TaggedError1): {
        // Handle err.data$: TaggedError1Data
        return;
      }
      // Known error
      case (err instanceof TaggedError2): {
        // Handle err.data$: TaggedError2Data
        return;
      }
      default: {
        // Other errors such as network errors, see HTTPClientErrors for more details
        throw err;
      }
    }
  }
}

run();

```

Validation errors can also occur when either method arguments or data returned from the server do not match the expected format. The `SDKValidationError` that is thrown as a result will capture the raw value that failed validation in an attribute called `rawValue`. Additionally, a `pretty()` method is available on this error that can be used to log a nicely formatted multi-line string since validation errors can list many issues and the plain error string may be difficult read when debugging.

In some rare cases, the SDK can fail to get a response from the server or even make the request due to unexpected circumstances such as network conditions. These types of errors are captured in the `sdk/models/errors/httpclienterrors.ts` module:

| HTTP Client Error                                    | Description                                          |
| ---------------------------------------------------- | ---------------------------------------------------- |
| RequestAbortedError                                  | HTTP request was aborted by the client               |
| RequestTimeoutError                                  | HTTP request timed out due to an AbortSignal signal  |
| ConnectionError                                      | HTTP client was unable to make a request to a server |
| InvalidRequestError                                  | Any input used to create a request is invalid        |
| UnexpectedClientError                                | Unrecognised or unexpected error                     |
<!-- End Error Handling [errors] -->



<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally by passing a server index to the `serverIdx: number` optional parameter when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| #   | Server                                        | Variables                                                    | Default values                           |
| --- | --------------------------------------------- | ------------------------------------------------------------ | ---------------------------------------- |
| 0   | `http://localhost:35123`                      |                                                              |                                          |
| 1   | `http://broken`                               |                                                              |                                          |
| 2   | `http://{hostname}:{port}`                    | `hostname: string`<br/>`port: string`                        | `"localhost"`<br/>`"35123"`              |
| 3   | `http://localhost:35123/anything/{something}` | `something: models.ServerSomething`                          | `"something"`                            |
| 4   | `{protocol}://{hostname}:{port}`              | `hostname: string`<br/>`port: string`<br/>`protocol: string` | `"localhost"`<br/>`"35123"`<br/>`"http"` |

If the selected server has variables, you may override their default values through the additional parameters made available in the SDK constructor.

#### Example

```typescript
import { SDK } from "openapi";

const sdk = new SDK({
  serverIdx: 4,
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  await sdk.ambiguousQueryParam(3);
}

run();

```

### Override Server URL Per-Client

The default server can also be overridden globally by passing a URL to the `serverURL: string` optional parameter when initializing the SDK client instance. For example:
```typescript
import { SDK } from "openapi";

const sdk = new SDK({
  serverURL: "http://localhost:35123",
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  await sdk.ambiguousQueryParam(3);
}

run();

```

### Override Server URL Per-Operation

The server URL can also be overridden on a per-operation basis, provided a server list was specified for the operation. For example:
```typescript
import { SDK } from "openapi";

const sdk = new SDK({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  await sdk.errors.connectionErrorGet({
    serverURL: "http://somebrokenapi.broken",
  });
}

run();

```
<!-- End Server Selection [server] -->



<!-- Start Custom HTTP Client [http-client] -->
## Custom HTTP Client

The TypeScript SDK makes API calls using an `HTTPClient` that wraps the native
[Fetch API](https://developer.mozilla.org/en-US/docs/Web/API/Fetch_API). This
client is a thin wrapper around `fetch` and provides the ability to attach hooks
around the request lifecycle that can be used to modify the request or handle
errors and response.

The `HTTPClient` constructor takes an optional `fetcher` argument that can be
used to integrate a third-party HTTP client or when writing tests to mock out
the HTTP client and feed in fixtures.

The following example shows how to use the `"beforeRequest"` hook to to add a
custom header and a timeout to requests and how to use the `"requestError"` hook
to log errors:

```typescript
import { SDK } from "openapi";
import { HTTPClient } from "openapi/lib/http";

const httpClient = new HTTPClient({
  // fetcher takes a function that has the same signature as native `fetch`.
  fetcher: (request) => {
    return fetch(request);
  }
});

httpClient.addHook("beforeRequest", (request) => {
  const nextRequest = new Request(request, {
    signal: request.signal || AbortSignal.timeout(5000)
  });

  nextRequest.headers.set("x-custom-header", "custom value");

  return nextRequest;
});

httpClient.addHook("requestError", (error, request) => {
  console.group("Request Error");
  console.log("Reason:", `${error}`);
  console.log("Endpoint:", `${request.method} ${request.url}`);
  console.groupEnd();
});

const sdk = new SDK({ httpClient });
```
<!-- End Custom HTTP Client [http-client] -->



<!-- Start Retries [retries] -->
## Retries

Some of the endpoints in this SDK support retries.  If you use the SDK without any configuration, it will fall back to the default retry strategy provided by the API.  However, the default retry strategy can be overridden on a per-operation basis, or across the entire SDK.

To change the default retry strategy for a single API call, simply provide a retryConfig object to the call:
```typescript
import { SDK } from "openapi";

const sdk = new SDK({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  await sdk.ambiguousQueryParam(3, {
    retries: {
      strategy: "backoff",
      backoff: {
        initialInterval: 1,
        maxInterval: 50,
        exponent: 1.1,
        maxElapsedTime: 100,
      },
      retryConnectionErrors: false,
    },
  });
}

run();

```

If you'd like to override the default retry strategy for all operations that support retries, you can provide a retryConfig at SDK initialization:
```typescript
import { SDK } from "openapi";

const sdk = new SDK({
  retryConfig: {
    strategy: "backoff",
    backoff: {
      initialInterval: 1,
      maxInterval: 50,
      exponent: 1.1,
      maxElapsedTime: 100,
    },
    retryConnectionErrors: false,
  },
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  await sdk.ambiguousQueryParam(3);
}

run();

```
<!-- End Retries [retries] -->



<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security schemes globally:

| Name         | Type   | Scheme       |
| ------------ | ------ | ------------ |
| `apiKeyAuth` | apiKey | API key      |
| `oauth2`     | oauth2 | OAuth2 token |

You can set the security parameters through the `security` optional parameter when initializing the SDK client instance. The selected scheme will be used by default to authenticate with the API for all operations that support it. For example:
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
  await sdk.ambiguousQueryParam(3);
}

run();

```

### Per-Operation Security Schemes

Some operations in this SDK require the security scheme to be specified at the request level. For example:
```typescript
import { SDK } from "openapi";

const sdk = new SDK({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  await sdk.authenticatedRequest({
    clientCredentials: "<YOUR_CLIENT_CREDENTIALS_HERE>",
  });
}

run();

```
<!-- End Authentication [security] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->



### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)

