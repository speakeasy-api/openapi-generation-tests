# openapi/openapi

<!-- Start SDK Installation [installation] -->
## SDK Installation

The SDK relies on [Composer](https://getcomposer.org/) to manage its dependencies.

To install the SDK and add it as a dependency to an existing `composer.json` file:
```bash
composer require "openapi/openapi"
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example 1

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use Brick\Math\BigDecimal;
use Brick\Math\BigInteger;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

$request = new Shared\SimpleObject(
    any: 'any',
    bool: true,
    date: LocalDate::parse('2020-01-01'),
    dateTime: Utils\Utils::parseDateTime('2020-01-01T00:00:00.001Z'),
    enum: Shared\Enum::One,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: Shared\Int32Enum::FiftyFive,
    intEnum: Shared\IntEnum::Second,
    num: 1.1,
    str: 'test',
    bigint: BigInteger::of('8821239038968084'),
    bigintStr: BigInteger::of('9223372036854775808'),
    boolOpt: true,
    decimal: BigDecimal::of('3.141592653589793'),
    decimalStr: BigDecimal::of('3.14159265358979344719667586'),
    float64Str: '1.1',
    int64Str: '100',
    strOpt: 'testOptional',
);

$response = $sdk->generation->globalNameOverridden(
    request: $request
);

if ($response->object !== null) {
    // handle response
}
```

### Example 2

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();



$response = $sdk->servers->selectGlobalServer(

);

if ($response->statusCode === 200) {
    // handle response
}
```

### Second

Do this second

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use Brick\Math\BigDecimal;
use Brick\Math\BigInteger;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

$request = new Operations\UsageExamplePostRequest(
    bigintParameter: BigInteger::of('168827'),
    bigintStrParameter: BigInteger::of('813724'),
    boolParameter: false,
    dateParameter: LocalDate::parse('2022-10-21'),
    dateTimeDefaultParameter: Utils\Utils::parseDateTime('2022-11-16T02:05:07.748Z'),
    dateTimeParameter: Utils\Utils::parseDateTime('2022-09-08T13:40:52.532Z'),
    decimalParameter: BigDecimal::of('5669.99'),
    decimalStrParameter: BigDecimal::of('5696.63'),
    doubleParameter: 3527.78,
    enumParameter: Operations\EnumParameter::Value2,
    falseyNumberParameter: 0,
    float32Parameter: 200.82,
    float64StringParameter: '<value>',
    floatParameter: 1062.86,
    int64Parameter: 234682,
    int64StringParameter: '<value>',
    intParameter: 215216,
    strParameter: 'example 2',
    requestBody: new Operations\UsageExamplePostRequestBody(
        simpleObject: new Shared\SimpleObject(
            any: 'any',
            bool: true,
            date: LocalDate::parse('2020-01-01'),
            dateTime: Utils\Utils::parseDateTime('2020-01-01T00:00:00.001Z'),
            enum: Shared\Enum::One,
            float32: 1.1,
            int: 1,
            int32: 1,
            int32Enum: Shared\Int32Enum::FiftyFive,
            intEnum: Shared\IntEnum::Second,
            num: 1.1,
            str: 'test',
            bigint: BigInteger::of('8821239038968084'),
            bigintStr: BigInteger::of('9223372036854775808'),
            boolOpt: true,
            decimal: BigDecimal::of('3.141592653589793'),
            decimalStr: BigDecimal::of('3.14159265358979344719667586'),
            float64Str: '1.1',
            int64Str: '100',
            strOpt: 'testOptional',
        ),
    ),
    optEnumParameter: Operations\OptEnumParameter::Value3,
);
$requestSecurity = new Operations\UsageExamplePostSecurity(
    password: 'YOUR_PASSWORD',
    username: 'YOUR_USERNAME',
);

$response = $sdk->generation->usageExamplePost(
    request: $request,
    security: $requestSecurity
);

if ($response->object !== null) {
    // handle response
}
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
* [statusGetError](docs/sdks/errors/README.md#statusgeterror)
* [statusGetXSpeakeasyErrors](docs/sdks/errors/README.md#statusgetxspeakeasyerrors)

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
* [~~deprecatedOperationNoCommentsGet~~](docs/sdks/generation/README.md#deprecatedoperationnocommentsget) - deprecatedOperationNoCommentsGet :warning: **Deprecated**
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


#### [nest->first](docs/sdks/sdkfirst/README.md)

* [get](docs/sdks/sdkfirst/README.md#get)

### [nested](docs/sdks/nested/README.md)

* [get](docs/sdks/nested/README.md#get)

#### [nested->first](docs/sdks/sdknestedfirst/README.md)

* [get](docs/sdks/sdknestedfirst/README.md#get)

#### [nested->second](docs/sdks/sdksecond/README.md)

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
* [paginationLimitOffsetDeepOutputsPageBody](docs/sdks/pagination/README.md#paginationlimitoffsetdeepoutputspagebody)
* [paginationLimitOffsetOffsetBody](docs/sdks/pagination/README.md#paginationlimitoffsetoffsetbody)
* [paginationLimitOffsetOffsetParams](docs/sdks/pagination/README.md#paginationlimitoffsetoffsetparams)
* [paginationLimitOffsetPageBody](docs/sdks/pagination/README.md#paginationlimitoffsetpagebody)
* [paginationLimitOffsetPageParams](docs/sdks/pagination/README.md#paginationlimitoffsetpageparams)
* [paginationURLParams](docs/sdks/pagination/README.md#paginationurlparams)
* [paginationWithRetries](docs/sdks/pagination/README.md#paginationwithretries)
* [paginationWrappedOptionalBody](docs/sdks/pagination/README.md#paginationwrappedoptionalbody)

### [parameters](docs/sdks/parameters/README.md)

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
* [multilineExample](docs/sdks/sdk/README.md#multilineexample)
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
* [multiMatchAnyOf](docs/sdks/unions/README.md#multimatchanyof)
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





<!-- Start Global Parameters [global-parameters] -->
## Global Parameters

Certain parameters are configured globally. These parameters may be set on the SDK client instance itself during initialization. When configured as an option during SDK initialization, These global values will be used as defaults on the operations that use them. When such operations are called, there is a place in each to override the global value, if needed.

For example, you can set `globalHeaderParam` to `true` at SDK initialization and then you do not have to pass the same value on calls to operations like `globalPathParameterGet`. But if you want to do so you may, which will locally override the global setting. See the example code below for a demonstration.


### Available Globals

The following global parameters are available.

| Name | Type | Required | Description |
| ---- | ---- |:--------:| ----------- |
| globalHeaderParam | bool |  | The globalHeaderParam parameter. |
| globalHiddenHeaderParam | string |  | The globalHiddenHeaderParam parameter. |
| globalHiddenPathParam | string |  | The globalHiddenPathParam parameter. |
| globalHiddenQueryParam | string |  | The globalHiddenQueryParam parameter. |
| globalPathParam | int |  | The globalPathParam parameter. |
| globalQueryParam | string |  | The globalQueryParam parameter. |


### Example

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();



$response = $sdk->globals->globalPathParameterGet(
    globalPathParam: 100
);

if ($response->res !== null) {
    // handle response
}
```
<!-- End Global Parameters [global-parameters] -->

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
* [SDK Example Usage](#sdk-example-usage)
* [Available Resources and Operations](#available-resources-and-operations)
* [Global Parameters](#global-parameters)
* [Error Handling](#error-handling)
* [Server Selection](#server-selection)
<!-- End Table of Contents [toc] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or throw an exception.

By default an API error will raise a `Errors\SDKException` exception, which has the following properties:

| Property       | Type                                    | Description           |
|----------------|-----------------------------------------|-----------------------|
| `$message`     | *string*                                | The error message     |
| `$statusCode`  | *int*                                   | The HTTP status code  |
| `$rawResponse` | *?\Psr\Http\Message\ResponseInterface*  | The raw HTTP response |
| `$body`        | *string*                                | The response content  |

When custom error responses are specified for an operation, the SDK may also throw their associated exception. You can refer to respective *Errors* tables in SDK docs for more details on possible exception types for each operation. For example, the `statusGetXSpeakeasyErrors` method throws the following exceptions:

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| Errors\Error                                 | 500                                          | application/json                             |
| Errors\StatusGetXSpeakeasyErrorsResponseBody | 501                                          | application/json                             |
| Errors\SDKException                          | 4XX, 5XX                                     | \*/\*                                        |

### Example

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $response = $sdk->errors->statusGetXSpeakeasyErrors(
        statusCode: 203
    );

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Errors\ErrorThrowable $e) {
    // handle $e->$container data
    throw $e;
} catch (Errors\StatusGetXSpeakeasyErrorsResponseBodyThrowable $e) {
    // handle $e->$container data
    throw $e;
} catch (Errors\SDKException $e) {
    // handle default exception
    throw $e;
}
```
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

## Server Selection

### Select Server by Index

You can override the default server globally by passing a server index to the `server_idx: int` optional parameter when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| # | Server | Variables |
| - | ------ | --------- |
| 0 | `http://localhost:35123` | None |
| 1 | `http://broken` | None |
| 2 | `http://{hostname}:{port}` | `hostname` (default is `localhost`), `port` (default is `35123`) |
| 3 | `http://localhost:35123/anything/{something}` | `something` (default is `something`) |
| 4 | `{protocol}://{hostname}:{port}` | `hostname` (default is `localhost`), `port` (default is `35123`), `protocol` (default is `http`) |



#### Variables

Some of the server options above contain variables. If you want to set the values of those variables, the following optional parameters are available when initializing the SDK client instance:
 * `hostname: string`
 * `port: string`
 * `something: OpenAPI\ServerSomething`
 * `protocol: string`

### Override Server URL Per-Client

The default server can also be overridden globally by passing a URL to the `server_url: str` optional parameter when initializing the SDK client instance. For example:


### Override Server URL Per-Operation

The server URL can also be overridden on a per-operation basis, provided a server list was specified for the operation. For example:
```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security(
    apiKeyAuth: 'Token YOUR_API_KEY',
);

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();



$response = $sdk->errors->connectionErrorGet(
    "http://somebrokenapi.broken"
);

if ($response->statusCode === 200) {
    // handle response
}
```
<!-- End Server Selection [server] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->



### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
