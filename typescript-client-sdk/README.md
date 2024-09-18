# openapi

<!-- Start SDK Installation [installation] -->
## SDK Installation

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
  }, {
    password: "YOUR_PASSWORD",
    username: "YOUR_USERNAME",
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

### [generation](docs/sdks/generation/README.md)

* [anchorTypesGet](docs/sdks/generation/README.md#anchortypesget)
* [arrayCircularReferenceGet](docs/sdks/generation/README.md#arraycircularreferenceget)
* [circularReferenceGet](docs/sdks/generation/README.md#circularreferenceget)
* [dateParamWithDefault](docs/sdks/generation/README.md#dateparamwithdefault)
* [dateTimeParamWithDefault](docs/sdks/generation/README.md#datetimeparamwithdefault)
* [decimalParamWithDefault](docs/sdks/generation/README.md#decimalparamwithdefault)
* [deprecatedFieldInSchemaPost](docs/sdks/generation/README.md#deprecatedfieldinschemapost)
* [deprecatedObjectInSchemaGet](docs/sdks/generation/README.md#deprecatedobjectinschemaget)
* [~~deprecatedOperationNoCommentsGet~~](docs/sdks/generation/README.md#deprecatedoperationnocommentsget) - :warning: **Deprecated**
* [~~deprecatedOperationWithCommentsGet~~](docs/sdks/generation/README.md#deprecatedoperationwithcommentsget) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** Use `simplePathParameterObjects` instead.
* [emptyObjectGet](docs/sdks/generation/README.md#emptyobjectget)
* [emptyResponseObjectWithCommentGet](docs/sdks/generation/README.md#emptyresponseobjectwithcommentget)
* [globalNameOverridden](docs/sdks/generation/README.md#globalnameoverridden)
* [ignoredGenerationGet](docs/sdks/generation/README.md#ignoredgenerationget)
* [ignoresPost](docs/sdks/generation/README.md#ignorespost)
* [nameOverride](docs/sdks/generation/README.md#nameoverride)
* [objectCircularReferenceGet](docs/sdks/generation/README.md#objectcircularreferenceget)
* [oneOfCircularReferenceGet](docs/sdks/generation/README.md#oneofcircularreferenceget)
* [typedParameterGenerationGet](docs/sdks/generation/README.md#typedparametergenerationget)
* [usageExamplePost](docs/sdks/generation/README.md#usageexamplepost) - An operation used for testing usage examples

### [globals](docs/sdks/globals/README.md)

* [globalPathParameterGet](docs/sdks/globals/README.md#globalpathparameterget)
* [globalsHeaderGet](docs/sdks/globals/README.md#globalsheaderget)
* [globalsHiddenPost](docs/sdks/globals/README.md#globalshiddenpost)
* [globalsQueryParameterGet](docs/sdks/globals/README.md#globalsqueryparameterget)

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

* [paginationCursorBody](docs/sdks/pagination/README.md#paginationcursorbody)
* [paginationCursorNonNumeric](docs/sdks/pagination/README.md#paginationcursornonnumeric)
* [paginationCursorParams](docs/sdks/pagination/README.md#paginationcursorparams)
* [paginationLimitOffsetDeepOutputsPageBody](docs/sdks/pagination/README.md#paginationlimitoffsetdeepoutputspagebody)
* [paginationLimitOffsetOffsetBody](docs/sdks/pagination/README.md#paginationlimitoffsetoffsetbody)
* [paginationLimitOffsetOffsetParams](docs/sdks/pagination/README.md#paginationlimitoffsetoffsetparams)
* [paginationLimitOffsetPageBody](docs/sdks/pagination/README.md#paginationlimitoffsetpagebody)
* [paginationLimitOffsetPageParams](docs/sdks/pagination/README.md#paginationlimitoffsetpageparams)
* [paginationURLParams](docs/sdks/pagination/README.md#paginationurlparams)
* [paginationWithRetries](docs/sdks/pagination/README.md#paginationwithretries)

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

### [telemetry](docs/sdks/telemetry/README.md)

* [telemetrySpeakeasyUserAgentGet](docs/sdks/telemetry/README.md#telemetryspeakeasyuseragentget)
* [telemetryUserAgentGet](docs/sdks/telemetry/README.md#telemetryuseragentget)

### [unions](docs/sdks/unions/README.md)

* [collectionOneOfPost](docs/sdks/unions/README.md#collectiononeofpost)
* [constDiscriminatedOneOf](docs/sdks/unions/README.md#constdiscriminatedoneof)
* [discriminatedOneMultipleMemberships](docs/sdks/unions/README.md#discriminatedonemultiplememberships)
* [discriminatedOneMultipleMembershipsHasWheels](docs/sdks/unions/README.md#discriminatedonemultiplemembershipshaswheels)
* [flattenedTypedObjectPost](docs/sdks/unions/README.md#flattenedtypedobjectpost)
* [infectedWithAny](docs/sdks/unions/README.md#infectedwithany)
* [mixedTypeOneOfPost](docs/sdks/unions/README.md#mixedtypeoneofpost)
* [mixedUnionTypes](docs/sdks/unions/README.md#mixeduniontypes)
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
  const result = await sdk.responseBodies.flattenedEnvelopePaginationResponse();

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

| Name | Type | Required | Description |
| ---- | ---- |:--------:| ----------- |
| globalHeaderParam | boolean |  | The globalHeaderParam parameter. |
| globalHiddenHeaderParam | string |  | The globalHiddenHeaderParam parameter. |
| globalHiddenPathParam | string |  | The globalHiddenPathParam parameter. |
| globalHiddenQueryParam | string |  | The globalHiddenQueryParam parameter. |
| globalPathParam | number |  | The globalPathParam parameter. |
| globalQueryParam | string |  | The globalQueryParam parameter. |


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

All SDK methods return a response object or throw an error. If Error objects are specified in your OpenAPI Spec, the SDK will throw the appropriate Error type.

| Error Object        | Status Code         | Content Type        |
| ------------------- | ------------------- | ------------------- |
| errors.TaggedError1 | 4XX                 | application/json    |
| errors.TaggedError2 | 4XX                 | application/json    |
| errors.SDKError     | 4xx-5xx             | */*                 |

Validation errors can also occur when either method arguments or data returned from the server do not match the expected format. The `SDKValidationError` that is thrown as a result will capture the raw value that failed validation in an attribute called `rawValue`. Additionally, a `pretty()` method is available on this error that can be used to log a nicely formatted string since validation errors can list many issues and the plain error string may be difficult read when debugging. 


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
      case (err instanceof SDKValidationError): {
        // Validation errors can be pretty-printed
        console.error(err.pretty());
        // Raw value may also be inspected
        console.error(err.rawValue);
        return;
      }
      case (err instanceof TaggedError1): {
        // Handle err.data$: TaggedError1Data
        return;
      }
      case (err instanceof TaggedError2): {
        // Handle err.data$: TaggedError2Data
        return;
      }
      default: {
        throw err;
      }
    }
  }
}

run();

```
<!-- End Error Handling [errors] -->



<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally by passing a server index to the `serverIdx` optional parameter when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| # | Server | Variables |
| - | ------ | --------- |
| 0 | `http://localhost:35123` | None |
| 1 | `http://broken` | None |
| 2 | `http://{hostname}:{port}` | `hostname` (default is `localhost`), `port` (default is `35123`) |
| 3 | `http://localhost:35123/anything/{something}` | `something` (default is `something`) |
| 4 | `{protocol}://{hostname}:{port}` | `hostname` (default is `localhost`), `port` (default is `35123`), `protocol` (default is `http`) |

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

#### Variables

Some of the server options above contain variables. If you want to set the values of those variables, the following optional parameters are available when initializing the SDK client instance:
 * `hostname: string`
 * `port: string`
 * `something: models.ServerSomething`
 * `protocol: string`

### Override Server URL Per-Client

The default server can also be overridden globally by passing a URL to the `serverURL` optional parameter when initializing the SDK client instance. For example:

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

| Name         | Type         | Scheme       |
| ------------ | ------------ | ------------ |
| `apiKeyAuth` | apiKey       | API key      |
| `oauth2`     | oauth2       | OAuth2 token |

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

<!-- Start Summary [summary] -->
## Summary

Speakeasy's Uber Test Spec: Contains a wide array of different operation types and schema to try and cover enough ground to ensure good coverage of our support of OpenAPI

Some test description.
About our test document.

For more information about the API: [Speakeasy Docs](https://speakeasy.com/docs)
<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents

* [SDK Installation](#sdk-installation)
* [Requirements](#requirements)
* [SDK Example Usage](#sdk-example-usage)
* [Available Resources and Operations](#available-resources-and-operations)
* [Standalone functions](#standalone-functions)
* [Global Parameters](#global-parameters)
* [Server-sent event streaming](#server-sent-event-streaming)
* [Pagination](#pagination)
* [File uploads](#file-uploads)
* [Retries](#retries)
* [Error Handling](#error-handling)
* [Server Selection](#server-selection)
* [Custom HTTP Client](#custom-http-client)
* [Authentication](#authentication)
* [Debugging](#debugging)
<!-- End Table of Contents [toc] -->

<!-- Start Requirements [requirements] -->
## Requirements

For supported JavaScript runtimes, please consult [RUNTIMES.md](RUNTIMES.md).
<!-- End Requirements [requirements] -->

<!-- Start Standalone functions [standalone-funcs] -->
## Standalone functions

All the methods listed above are available as standalone functions. These
functions are ideal for use in applications running in the browser, serverless
runtimes or other environments where application bundle size is a primary
concern. When using a bundler to build your application, all unused
functionality will be either excluded from the final bundle or tree-shaken away.

To read more about standalone functions, check [FUNCTIONS.md](./FUNCTIONS.md).

<details>

<summary>Available standalone functions</summary>

- [ambiguousQueryParam](docs/sdks/sdk/README.md#ambiguousqueryparam)
- [authApiKeyAuthGlobal](docs/sdks/auth/README.md#apikeyauthglobal)
- [authApiKeyAuth](docs/sdks/auth/README.md#apikeyauth)
- [authBasicAuth](docs/sdks/auth/README.md#basicauth)
- [authBearerAuth](docs/sdks/auth/README.md#bearerauth)
- [authGlobalBearerAuth](docs/sdks/auth/README.md#globalbearerauth)
- [authNewAuthGlobal](docs/sdks/authnew/README.md#authglobal)
- [authNewBasicAuthNew](docs/sdks/authnew/README.md#basicauthnew)
- [authNewCustomSchemeAppId](docs/sdks/authnew/README.md#customschemeappid)
- [authNewMultipleMixedOptionsAuth](docs/sdks/authnew/README.md#multiplemixedoptionsauth)
- [authNewMultipleMixedSchemeAuth](docs/sdks/authnew/README.md#multiplemixedschemeauth)
- [authNewMultipleOptionsWithMixedSchemesAuth](docs/sdks/authnew/README.md#multipleoptionswithmixedschemesauth)
- [authNewMultipleOptionsWithSimpleSchemesAuth](docs/sdks/authnew/README.md#multipleoptionswithsimpleschemesauth)
- [authNewMultipleSimpleOptionsAuth](docs/sdks/authnew/README.md#multiplesimpleoptionsauth)
- [authNewMultipleSimpleSchemeAuth](docs/sdks/authnew/README.md#multiplesimpleschemeauth)
- [authNewOauth2AuthNew](docs/sdks/authnew/README.md#oauth2authnew)
- [authNewOpenIdConnectAuthNew](docs/sdks/authnew/README.md#openidconnectauthnew)
- [authNoAuth](docs/sdks/auth/README.md#noauth)
- [authOauth2Auth](docs/sdks/auth/README.md#oauth2auth)
- [authOauth2Override](docs/sdks/auth/README.md#oauth2override)
- [authOpenIdConnectAuth](docs/sdks/auth/README.md#openidconnectauth)
- [authenticatedRequest](docs/sdks/sdk/README.md#authenticatedrequest)
- [conflictingEnum](docs/sdks/sdk/README.md#conflictingenum)
- [customClientCustomClientPost](docs/sdks/customclient/README.md#customclientpost)
- [documentationGetDocumentationPerLanguage](docs/sdks/documentation/README.md#getdocumentationperlanguage)
- [errorsConnectionErrorGet](docs/sdks/errors/README.md#connectionerrorget)
- [errorsErrorUnionDiscriminatedPost](docs/sdks/errors/README.md#erroruniondiscriminatedpost)
- [errorsErrorUnionPost](docs/sdks/errors/README.md#errorunionpost)
- [errorsStatusGetError](docs/sdks/errors/README.md#statusgeterror)
- [errorsStatusGetXSpeakeasyErrors](docs/sdks/errors/README.md#statusgetxspeakeasyerrors)
- [eventstreamsChatSkipSentinel](docs/sdks/eventstreams/README.md#chatskipsentinel)
- [eventstreamsChat](docs/sdks/eventstreams/README.md#chat)
- [eventstreamsDifferentDataSchemas](docs/sdks/eventstreams/README.md#differentdataschemas)
- [eventstreamsJson](docs/sdks/eventstreams/README.md#json)
- [eventstreamsMultiline](docs/sdks/eventstreams/README.md#multiline)
- [eventstreamsRich](docs/sdks/eventstreams/README.md#rich)
- [eventstreamsText](docs/sdks/eventstreams/README.md#text)
- [firstGet](docs/sdks/first/README.md#get)
- [flatteningComponentBodyAndParamConflict](docs/sdks/flattening/README.md#componentbodyandparamconflict)
- [flatteningComponentBodyAndParamNoConflict](docs/sdks/flattening/README.md#componentbodyandparamnoconflict)
- [flatteningConflictingParams](docs/sdks/flattening/README.md#conflictingparams)
- [flatteningInlineBodyAndParamConflict](docs/sdks/flattening/README.md#inlinebodyandparamconflict)
- [flatteningInlineBodyAndParamNoConflict](docs/sdks/flattening/README.md#inlinebodyandparamnoconflict)
- [generationAnchorTypesGet](docs/sdks/generation/README.md#anchortypesget)
- [generationArrayCircularReferenceGet](docs/sdks/generation/README.md#arraycircularreferenceget)
- [generationCircularReferenceGet](docs/sdks/generation/README.md#circularreferenceget)
- [generationDateParamWithDefault](docs/sdks/generation/README.md#dateparamwithdefault)
- [generationDateTimeParamWithDefault](docs/sdks/generation/README.md#datetimeparamwithdefault)
- [generationDecimalParamWithDefault](docs/sdks/generation/README.md#decimalparamwithdefault)
- [generationDeprecatedFieldInSchemaPost](docs/sdks/generation/README.md#deprecatedfieldinschemapost)
- [generationDeprecatedObjectInSchemaGet](docs/sdks/generation/README.md#deprecatedobjectinschemaget)
- [generationDeprecatedOperationNoCommentsGet](docs/sdks/generation/README.md#deprecatedoperationnocommentsget)
- [generationDeprecatedOperationWithCommentsGet](docs/sdks/generation/README.md#deprecatedoperationwithcommentsget)
- [generationEmptyObjectGet](docs/sdks/generation/README.md#emptyobjectget)
- [generationEmptyResponseObjectWithCommentGet](docs/sdks/generation/README.md#emptyresponseobjectwithcommentget)
- [generationGlobalNameOverridden](docs/sdks/generation/README.md#globalnameoverridden)
- [generationIgnoredGenerationGet](docs/sdks/generation/README.md#ignoredgenerationget)
- [generationIgnoresPost](docs/sdks/generation/README.md#ignorespost)
- [generationNameOverride](docs/sdks/generation/README.md#nameoverride)
- [generationObjectCircularReferenceGet](docs/sdks/generation/README.md#objectcircularreferenceget)
- [generationOneOfCircularReferenceGet](docs/sdks/generation/README.md#oneofcircularreferenceget)
- [generationTypedParameterGenerationGet](docs/sdks/generation/README.md#typedparametergenerationget)
- [generationUsageExamplePost](docs/sdks/generation/README.md#usageexamplepost)
- [globalsGlobalPathParameterGet](docs/sdks/globals/README.md#globalpathparameterget)
- [globalsGlobalsHeaderGet](docs/sdks/globals/README.md#globalsheaderget)
- [globalsGlobalsHiddenPost](docs/sdks/globals/README.md#globalshiddenpost)
- [globalsGlobalsQueryParameterGet](docs/sdks/globals/README.md#globalsqueryparameterget)
- [hooksAuthorizationHeaderModification](docs/sdks/hooks/README.md#authorizationheadermodification)
- [hooksTestHooksAfterResponse](docs/sdks/hooks/README.md#testhooksafterresponse)
- [hooksTestHooksBeforeCreateRequestPaths](docs/sdks/hooks/README.md#testhooksbeforecreaterequestpaths)
- [hooksTestHooksError](docs/sdks/hooks/README.md#testhookserror)
- [hooksTestHooks](docs/sdks/hooks/README.md#testhooks)
- [ignoredGenerationPut](docs/sdks/sdk/README.md#ignoredgenerationput)
- [methodsMethodDelete](docs/sdks/methods/README.md#methoddelete)
- [methodsMethodGet](docs/sdks/methods/README.md#methodget)
- [methodsMethodHead](docs/sdks/methods/README.md#methodhead)
- [methodsMethodOptions](docs/sdks/methods/README.md#methodoptions)
- [methodsMethodPatch](docs/sdks/methods/README.md#methodpatch)
- [methodsMethodPost](docs/sdks/methods/README.md#methodpost)
- [methodsMethodPut](docs/sdks/methods/README.md#methodput)
- [methodsMethodTrace](docs/sdks/methods/README.md#methodtrace)
- [nestFirstGet](docs/sdks/sdkfirst/README.md#get)
- [nestedFirstGet](docs/sdks/sdknestedfirst/README.md#get)
- [nestedGet](docs/sdks/nested/README.md#get)
- [nestedSecondGet](docs/sdks/sdksecond/README.md#get)
- [openEnumsOpenEnumsPostUnrecognized](docs/sdks/openenums/README.md#openenumspostunrecognized)
- [paginationPaginationCursorBody](docs/sdks/pagination/README.md#paginationcursorbody)
- [paginationPaginationCursorNonNumeric](docs/sdks/pagination/README.md#paginationcursornonnumeric)
- [paginationPaginationCursorParams](docs/sdks/pagination/README.md#paginationcursorparams)
- [paginationPaginationLimitOffsetDeepOutputsPageBody](docs/sdks/pagination/README.md#paginationlimitoffsetdeepoutputspagebody)
- [paginationPaginationLimitOffsetOffsetBody](docs/sdks/pagination/README.md#paginationlimitoffsetoffsetbody)
- [paginationPaginationLimitOffsetOffsetParams](docs/sdks/pagination/README.md#paginationlimitoffsetoffsetparams)
- [paginationPaginationLimitOffsetPageBody](docs/sdks/pagination/README.md#paginationlimitoffsetpagebody)
- [paginationPaginationLimitOffsetPageParams](docs/sdks/pagination/README.md#paginationlimitoffsetpageparams)
- [paginationPaginationURLParams](docs/sdks/pagination/README.md#paginationurlparams)
- [paginationPaginationWithRetries](docs/sdks/pagination/README.md#paginationwithretries)
- [parametersDeepObjectQueryParamsDeepObject](docs/sdks/parameters/README.md#deepobjectqueryparamsdeepobject)
- [parametersDeepObjectQueryParamsMap](docs/sdks/parameters/README.md#deepobjectqueryparamsmap)
- [parametersDeepObjectQueryParamsObject](docs/sdks/parameters/README.md#deepobjectqueryparamsobject)
- [parametersDuplicateParam](docs/sdks/parameters/README.md#duplicateparam)
- [parametersFormQueryParamsArray](docs/sdks/parameters/README.md#formqueryparamsarray)
- [parametersFormQueryParamsCamelObject](docs/sdks/parameters/README.md#formqueryparamscamelobject)
- [parametersFormQueryParamsMap](docs/sdks/parameters/README.md#formqueryparamsmap)
- [parametersFormQueryParamsObject](docs/sdks/parameters/README.md#formqueryparamsobject)
- [parametersFormQueryParamsPrimitive](docs/sdks/parameters/README.md#formqueryparamsprimitive)
- [parametersFormQueryParamsRefParamObject](docs/sdks/parameters/README.md#formqueryparamsrefparamobject)
- [parametersHeaderParamsArray](docs/sdks/parameters/README.md#headerparamsarray)
- [parametersHeaderParamsMap](docs/sdks/parameters/README.md#headerparamsmap)
- [parametersHeaderParamsObject](docs/sdks/parameters/README.md#headerparamsobject)
- [parametersHeaderParamsPrimitive](docs/sdks/parameters/README.md#headerparamsprimitive)
- [parametersJsonQueryParamsObjectSmaller](docs/sdks/parameters/README.md#jsonqueryparamsobjectsmaller)
- [parametersJsonQueryParamsObject](docs/sdks/parameters/README.md#jsonqueryparamsobject)
- [parametersMixedParametersCamelCase](docs/sdks/parameters/README.md#mixedparameterscamelcase)
- [parametersMixedParametersPrimitives](docs/sdks/parameters/README.md#mixedparametersprimitives)
- [parametersMixedQueryParams](docs/sdks/parameters/README.md#mixedqueryparams)
- [parametersPathParameterJson](docs/sdks/parameters/README.md#pathparameterjson)
- [parametersPipeDelimitedQueryParamsArray](docs/sdks/parameters/README.md#pipedelimitedqueryparamsarray)
- [parametersSimplePathParameterArrays](docs/sdks/parameters/README.md#simplepathparameterarrays)
- [parametersSimplePathParameterMaps](docs/sdks/parameters/README.md#simplepathparametermaps)
- [parametersSimplePathParameterObjects](docs/sdks/parameters/README.md#simplepathparameterobjects)
- [parametersSimplePathParameterPrimitives](docs/sdks/parameters/README.md#simplepathparameterprimitives)
- [postAdditionalPropertiesWithNullableFields](docs/sdks/sdk/README.md#postadditionalpropertieswithnullablefields)
- [requestBodiesNullEnumPost](docs/sdks/requestbodies/README.md#nullenumpost)
- [requestBodiesNullableObjectPost](docs/sdks/requestbodies/README.md#nullableobjectpost)
- [requestBodiesNullableOptionalFieldsPost](docs/sdks/requestbodies/README.md#nullableoptionalfieldspost)
- [requestBodiesNullableRequiredEmptyObjectPost](docs/sdks/requestbodies/README.md#nullablerequiredemptyobjectpost)
- [requestBodiesNullableRequiredPropertyPost](docs/sdks/requestbodies/README.md#nullablerequiredpropertypost)
- [requestBodiesNullableRequiredSharedObjectPost](docs/sdks/requestbodies/README.md#nullablerequiredsharedobjectpost)
- [requestBodiesRequestBodyDeprecatedRequestBodyRefPost](docs/sdks/requestbodies/README.md#requestbodydeprecatedrequestbodyrefpost)
- [requestBodiesRequestBodyPostApplicationJsonArrayCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarraycamelcase)
- [requestBodiesRequestBodyPostApplicationJsonArrayObjCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayobjcamelcase)
- [requestBodiesRequestBodyPostApplicationJsonArrayObj](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayobj)
- [requestBodiesRequestBodyPostApplicationJsonArrayOfArrayCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofarraycamelcase)
- [requestBodiesRequestBodyPostApplicationJsonArrayOfArrayOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofarrayofprimitive)
- [requestBodiesRequestBodyPostApplicationJsonArrayOfArray](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofarray)
- [requestBodiesRequestBodyPostApplicationJsonArrayOfMapCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofmapcamelcase)
- [requestBodiesRequestBodyPostApplicationJsonArrayOfMap](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofmap)
- [requestBodiesRequestBodyPostApplicationJsonArrayOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofprimitive)
- [requestBodiesRequestBodyPostApplicationJsonArrayOfUnions](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofunions)
- [requestBodiesRequestBodyPostApplicationJsonArray](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarray)
- [requestBodiesRequestBodyPostApplicationJsonDeepCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsondeepcamelcase)
- [requestBodiesRequestBodyPostApplicationJsonDeep](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsondeep)
- [requestBodiesRequestBodyPostApplicationJsonMapCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapcamelcase)
- [requestBodiesRequestBodyPostApplicationJsonMapObjCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapobjcamelcase)
- [requestBodiesRequestBodyPostApplicationJsonMapObj](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapobj)
- [requestBodiesRequestBodyPostApplicationJsonMapOfArrayCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofarraycamelcase)
- [requestBodiesRequestBodyPostApplicationJsonMapOfArray](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofarray)
- [requestBodiesRequestBodyPostApplicationJsonMapOfMapCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofmapcamelcase)
- [requestBodiesRequestBodyPostApplicationJsonMapOfMapOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofmapofprimitive)
- [requestBodiesRequestBodyPostApplicationJsonMapOfMap](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofmap)
- [requestBodiesRequestBodyPostApplicationJsonMapOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofprimitive)
- [requestBodiesRequestBodyPostApplicationJsonMap](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmap)
- [requestBodiesRequestBodyPostApplicationJsonMultipleJsonFiltered](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmultiplejsonfiltered)
- [requestBodiesRequestBodyPostApplicationJsonSimpleCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonsimplecamelcase)
- [requestBodiesRequestBodyPostApplicationJsonSimple](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonsimple)
- [requestBodiesRequestBodyPostComplexNumberTypes](docs/sdks/requestbodies/README.md#requestbodypostcomplexnumbertypes)
- [requestBodiesRequestBodyPostDefaultsAndConsts](docs/sdks/requestbodies/README.md#requestbodypostdefaultsandconsts)
- [requestBodiesRequestBodyPostEmptyBodyRetainedWithAllOptionalFields](docs/sdks/requestbodies/README.md#requestbodypostemptybodyretainedwithalloptionalfields)
- [requestBodiesRequestBodyPostEmptyObject](docs/sdks/requestbodies/README.md#requestbodypostemptyobject)
- [requestBodiesRequestBodyPostFormDeep](docs/sdks/requestbodies/README.md#requestbodypostformdeep)
- [requestBodiesRequestBodyPostFormMapPrimitive](docs/sdks/requestbodies/README.md#requestbodypostformmapprimitive)
- [requestBodiesRequestBodyPostFormSimple](docs/sdks/requestbodies/README.md#requestbodypostformsimple)
- [requestBodiesRequestBodyPostJsonDataTypesArrayBigInt](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesarraybigint)
- [requestBodiesRequestBodyPostJsonDataTypesArrayDate](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesarraydate)
- [requestBodiesRequestBodyPostJsonDataTypesArrayDecimalStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesarraydecimalstr)
- [requestBodiesRequestBodyPostJsonDataTypesBigIntStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesbigintstr)
- [requestBodiesRequestBodyPostJsonDataTypesBigInt](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesbigint)
- [requestBodiesRequestBodyPostJsonDataTypesBoolean](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesboolean)
- [requestBodiesRequestBodyPostJsonDataTypesComplexNumberArrays](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypescomplexnumberarrays)
- [requestBodiesRequestBodyPostJsonDataTypesComplexNumberMaps](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypescomplexnumbermaps)
- [requestBodiesRequestBodyPostJsonDataTypesDateTime](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdatetime)
- [requestBodiesRequestBodyPostJsonDataTypesDate](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdate)
- [requestBodiesRequestBodyPostJsonDataTypesDecimalStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdecimalstr)
- [requestBodiesRequestBodyPostJsonDataTypesDecimal](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdecimal)
- [requestBodiesRequestBodyPostJsonDataTypesFloat32](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesfloat32)
- [requestBodiesRequestBodyPostJsonDataTypesInt32](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesint32)
- [requestBodiesRequestBodyPostJsonDataTypesInteger](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesinteger)
- [requestBodiesRequestBodyPostJsonDataTypesMapBigIntStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesmapbigintstr)
- [requestBodiesRequestBodyPostJsonDataTypesMapDateTime](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesmapdatetime)
- [requestBodiesRequestBodyPostJsonDataTypesMapDecimal](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesmapdecimal)
- [requestBodiesRequestBodyPostJsonDataTypesNumber](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesnumber)
- [requestBodiesRequestBodyPostJsonDataTypesString](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesstring)
- [requestBodiesRequestBodyPostMultipleContentTypesComponentFilteredDefaultTest](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypescomponentfiltereddefaulttest)
- [requestBodiesRequestBodyPostMultipleContentTypesComponentFiltered](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypescomponentfiltered)
- [requestBodiesRequestBodyPostMultipleContentTypesInlineFiltered](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypesinlinefiltered)
- [requestBodiesRequestBodyPostMultipleContentTypesSplitForm](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitform)
- [requestBodiesRequestBodyPostMultipleContentTypesSplitJson](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitjson)
- [requestBodiesRequestBodyPostMultipleContentTypesSplitMultipart](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitmultipart)
- [requestBodiesRequestBodyPostMultipleContentTypesSplitParamForm](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparamform)
- [requestBodiesRequestBodyPostMultipleContentTypesSplitParamJson](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparamjson)
- [requestBodiesRequestBodyPostMultipleContentTypesSplitParamMultipart](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparammultipart)
- [requestBodiesRequestBodyPostNotNullableNotRequiredStringBody](docs/sdks/requestbodies/README.md#requestbodypostnotnullablenotrequiredstringbody)
- [requestBodiesRequestBodyPostNullArray](docs/sdks/requestbodies/README.md#requestbodypostnullarray)
- [requestBodiesRequestBodyPostNullDictionary](docs/sdks/requestbodies/README.md#requestbodypostnulldictionary)
- [requestBodiesRequestBodyPostNullableNotRequiredStringBody](docs/sdks/requestbodies/README.md#requestbodypostnullablenotrequiredstringbody)
- [requestBodiesRequestBodyPostNullableRequiredStringBody](docs/sdks/requestbodies/README.md#requestbodypostnullablerequiredstringbody)
- [requestBodiesRequestBodyPutBytesWithParams](docs/sdks/requestbodies/README.md#requestbodyputbyteswithparams)
- [requestBodiesRequestBodyPutBytes](docs/sdks/requestbodies/README.md#requestbodyputbytes)
- [requestBodiesRequestBodyPutMultipartDeep](docs/sdks/requestbodies/README.md#requestbodyputmultipartdeep)
- [requestBodiesRequestBodyPutMultipartDifferentFileName](docs/sdks/requestbodies/README.md#requestbodyputmultipartdifferentfilename)
- [requestBodiesRequestBodyPutMultipartFile](docs/sdks/requestbodies/README.md#requestbodyputmultipartfile)
- [requestBodiesRequestBodyPutMultipartOptionalRequestBody](docs/sdks/requestbodies/README.md#requestbodyputmultipartoptionalrequestbody)
- [requestBodiesRequestBodyPutMultipartSimple](docs/sdks/requestbodies/README.md#requestbodyputmultipartsimple)
- [requestBodiesRequestBodyPutStringWithParams](docs/sdks/requestbodies/README.md#requestbodyputstringwithparams)
- [requestBodiesRequestBodyPutString](docs/sdks/requestbodies/README.md#requestbodyputstring)
- [requestBodiesRequestBodyReadAndWrite](docs/sdks/requestbodies/README.md#requestbodyreadandwrite)
- [requestBodiesRequestBodyReadOnlyInput](docs/sdks/requestbodies/README.md#requestbodyreadonlyinput)
- [requestBodiesRequestBodyReadOnlyUnion](docs/sdks/requestbodies/README.md#requestbodyreadonlyunion)
- [requestBodiesRequestBodyReadWriteOnlyUnion](docs/sdks/requestbodies/README.md#requestbodyreadwriteonlyunion)
- [requestBodiesRequestBodyWriteOnlyOutput](docs/sdks/requestbodies/README.md#requestbodywriteonlyoutput)
- [requestBodiesRequestBodyWriteOnlyUnion](docs/sdks/requestbodies/README.md#requestbodywriteonlyunion)
- [requestBodiesRequestBodyWriteOnly](docs/sdks/requestbodies/README.md#requestbodywriteonly)
- [resourceCreateFile](docs/sdks/resource/README.md#createfile)
- [resourceCreateResource](docs/sdks/resource/README.md#createresource)
- [resourceDeleteResource](docs/sdks/resource/README.md#deleteresource)
- [resourceGetArrayDataSource](docs/sdks/resource/README.md#getarraydatasource)
- [resourceGetResource](docs/sdks/resource/README.md#getresource)
- [resourceUpdateResource](docs/sdks/resource/README.md#updateresource)
- [responseBodiesFlattenedEnvelopePaginationResponse](docs/sdks/responsebodies/README.md#flattenedenvelopepaginationresponse)
- [responseBodiesFlattenedEnvelopeResponse](docs/sdks/responsebodies/README.md#flattenedenveloperesponse)
- [responseBodiesFlattenedEnvelopeUnionResponse](docs/sdks/responsebodies/README.md#flattenedenvelopeunionresponse)
- [responseBodiesFlattenedUnionResponse](docs/sdks/responsebodies/README.md#flattenedunionresponse)
- [responseBodiesOverriddenFieldNamesPost](docs/sdks/responsebodies/README.md#overriddenfieldnamespost)
- [responseBodiesResponseBodyAdditionalPropertiesAnyPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiesanypost)
- [responseBodiesResponseBodyAdditionalPropertiesComplexNumbersPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiescomplexnumberspost)
- [responseBodiesResponseBodyAdditionalPropertiesDatePost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiesdatepost)
- [responseBodiesResponseBodyAdditionalPropertiesObjectPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiesobjectpost)
- [responseBodiesResponseBodyAdditionalPropertiesPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiespost)
- [responseBodiesResponseBodyBytesGet](docs/sdks/responsebodies/README.md#responsebodybytesget)
- [responseBodiesResponseBodyDecimalStr](docs/sdks/responsebodies/README.md#responsebodydecimalstr)
- [responseBodiesResponseBodyEmptyWithHeaders](docs/sdks/responsebodies/README.md#responsebodyemptywithheaders)
- [responseBodiesResponseBodyMissing2xxOr3xxGet](docs/sdks/responsebodies/README.md#responsebodymissing2xxor3xxget)
- [responseBodiesResponseBodyMultilineStringPost](docs/sdks/responsebodies/README.md#responsebodymultilinestringpost)
- [responseBodiesResponseBodyOptionalGet](docs/sdks/responsebodies/README.md#responsebodyoptionalget)
- [responseBodiesResponseBodyReadOnly](docs/sdks/responsebodies/README.md#responsebodyreadonly)
- [responseBodiesResponseBodyStringGet](docs/sdks/responsebodies/README.md#responsebodystringget)
- [responseBodiesResponseBodyXmlGet](docs/sdks/responsebodies/README.md#responsebodyxmlget)
- [responseBodyJsonGet](docs/sdks/sdk/README.md#responsebodyjsonget)
- [retriesRetriesAfter](docs/sdks/retries/README.md#retriesafter)
- [retriesRetriesConnectErrorGet](docs/sdks/retries/README.md#retriesconnecterrorget)
- [retriesRetriesFlatEmptyResponsePost](docs/sdks/retries/README.md#retriesflatemptyresponsepost)
- [retriesRetriesGet](docs/sdks/retries/README.md#retriesget)
- [retriesRetriesPost](docs/sdks/retries/README.md#retriespost)
- [secondGet](docs/sdks/second/README.md#get)
- [serversSelectGlobalServer](docs/sdks/servers/README.md#selectglobalserver)
- [serversSelectServerWithID](docs/sdks/servers/README.md#selectserverwithid)
- [serversServerWithProtocolTemplate](docs/sdks/servers/README.md#serverwithprotocoltemplate)
- [serversServerWithTemplatesGlobal](docs/sdks/servers/README.md#serverwithtemplatesglobal)
- [serversServerWithTemplates](docs/sdks/servers/README.md#serverwithtemplates)
- [serversServersByIDWithTemplates](docs/sdks/servers/README.md#serversbyidwithtemplates)
- [telemetryTelemetrySpeakeasyUserAgentGet](docs/sdks/telemetry/README.md#telemetryspeakeasyuseragentget)
- [telemetryTelemetryUserAgentGet](docs/sdks/telemetry/README.md#telemetryuseragentget)
- [unionsCollectionOneOfPost](docs/sdks/unions/README.md#collectiononeofpost)
- [unionsConstDiscriminatedOneOf](docs/sdks/unions/README.md#constdiscriminatedoneof)
- [unionsDiscriminatedOneMultipleMembershipsHasWheels](docs/sdks/unions/README.md#discriminatedonemultiplemembershipshaswheels)
- [unionsDiscriminatedOneMultipleMemberships](docs/sdks/unions/README.md#discriminatedonemultiplememberships)
- [unionsFlattenedTypedObjectPost](docs/sdks/unions/README.md#flattenedtypedobjectpost)
- [unionsInfectedWithAny](docs/sdks/unions/README.md#infectedwithany)
- [unionsMixedTypeOneOfPost](docs/sdks/unions/README.md#mixedtypeoneofpost)
- [unionsMixedUnionTypes](docs/sdks/unions/README.md#mixeduniontypes)
- [unionsNullableOneOfRefInObjectPost](docs/sdks/unions/README.md#nullableoneofrefinobjectpost)
- [unionsNullableOneOfSchemaPost](docs/sdks/unions/README.md#nullableoneofschemapost)
- [unionsNullableOneOfTypeInObjectPost](docs/sdks/unions/README.md#nullableoneoftypeinobjectpost)
- [unionsNullableTypedObjectPost](docs/sdks/unions/README.md#nullabletypedobjectpost)
- [unionsOneOfOverlappingObjects](docs/sdks/unions/README.md#oneofoverlappingobjects)
- [unionsPrimitiveTypeOneOfPost](docs/sdks/unions/README.md#primitivetypeoneofpost)
- [unionsStronglyTypedOneOfDiscriminatedPost](docs/sdks/unions/README.md#stronglytypedoneofdiscriminatedpost)
- [unionsStronglyTypedOneOfPostWithNonStandardDiscriminatorName](docs/sdks/unions/README.md#stronglytypedoneofpostwithnonstandarddiscriminatorname)
- [unionsStronglyTypedOneOfPost](docs/sdks/unions/README.md#stronglytypedoneofpost)
- [unionsTypedObjectNullableOneOfPost](docs/sdks/unions/README.md#typedobjectnullableoneofpost)
- [unionsTypedObjectOneOfPost](docs/sdks/unions/README.md#typedobjectoneofpost)
- [unionsUnionBigIntStrDecimal](docs/sdks/unions/README.md#unionbigintstrdecimal)
- [unionsUnionDateNull](docs/sdks/unions/README.md#uniondatenull)
- [unionsUnionDateTimeBigInt](docs/sdks/unions/README.md#uniondatetimebigint)
- [unionsUnionDateTimeNull](docs/sdks/unions/README.md#uniondatetimenull)
- [unionsUnionMapOptional](docs/sdks/unions/README.md#unionmapoptional)
- [unionsUnionMap](docs/sdks/unions/README.md#unionmap)
- [unionsUnionNestedEnumsForm](docs/sdks/unions/README.md#unionnestedenumsform)
- [unionsUnionNestedEnumsMultipart](docs/sdks/unions/README.md#unionnestedenumsmultipart)
- [unionsUnionOfArraysPost](docs/sdks/unions/README.md#unionofarrayspost)
- [unionsWeaklyTypedOneOfNullEnumPost](docs/sdks/unions/README.md#weaklytypedoneofnullenumpost)
- [unionsWeaklyTypedOneOfPost](docs/sdks/unions/README.md#weaklytypedoneofpost)


</details>
<!-- End Standalone functions [standalone-funcs] -->

<!-- Start Server-sent event streaming [eventstream] -->
## Server-sent event streaming

[Server-sent events][mdn-sse] are used to stream content from certain
operations. These operations will expose the stream as an async iterable that
can be consumed using a [`for await...of`][mdn-for-await-of] loop. The loop will
terminate when the server no longer has any events to send and closes the
underlying connection.

```typescript
import { SDK } from "openapi";

const sdk = new SDK({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.eventstreams.chat({
    prompt: "<value>",
  });

  for await (const event of result) {
    // Handle the event
    console.log(event);
  }
}

run();

```

[mdn-sse]: https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events
[mdn-for-await-of]: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/for-await...of
<!-- End Server-sent event streaming [eventstream] -->

<!-- Start File uploads [file-upload] -->
## File uploads

Certain SDK methods accept files as part of a multi-part request. It is possible and typically recommended to upload files as a stream rather than reading the entire contents into memory. This avoids excessive memory consumption and potentially crashing with out-of-memory errors when working with very large files. The following example demonstrates how to attach a file stream to a request.

> [!TIP]
>
> Depending on your JavaScript runtime, there are convenient utilities that return a handle to a file without reading the entire contents into memory:
>
> - **Node.js v20+:** Since v20, Node.js comes with a native `openAsBlob` function in [`node:fs`](https://nodejs.org/docs/latest-v20.x/api/fs.html#fsopenasblobpath-options).
> - **Bun:** The native [`Bun.file`](https://bun.sh/docs/api/file-io#reading-files-bun-file) function produces a file handle that can be used for streaming file uploads.
> - **Browsers:** All supported browsers return an instance to a [`File`](https://developer.mozilla.org/en-US/docs/Web/API/File) when reading the value from an `<input type="file">` element.
> - **Node.js v18:** A file stream can be created using the `fileFrom` helper from [`fetch-blob/from.js`](https://www.npmjs.com/package/fetch-blob).

```typescript
import { openAsBlob } from "node:fs";
import { SDK } from "openapi";

const sdk = new SDK({
  globalHeaderParam: true,
  globalHiddenQueryParam: "hello",
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

async function run() {
  const result = await sdk.requestBodies.requestBodyPutBytes(
    await openAsBlob("example.file"),
  );

  // Handle the result
  console.log(result);
}

run();

```
<!-- End File uploads [file-upload] -->

<!-- Start Debugging [debug] -->
## Debugging

You can setup your SDK to emit debug logs for SDK requests and responses.

You can pass a logger that matches `console`'s interface as an SDK option.

> [!WARNING]
> Beware that debug logging will reveal secrets, like API tokens in headers, in log messages printed to a console or files. It's recommended to use this feature only during local development and not in production.

```typescript
import { SDK } from "openapi";

const sdk = new SDK({ debugLogger: console });
```
<!-- End Debugging [debug] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->



### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)

