# openapi/openapi

<!-- Start SDK Installation -->
## SDK Installation

### Composer

```bash
composer require "openapi/openapi"
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->
```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\UsageExamplePostRequest;
use \OpenAPI\OpenAPI\Models\Operations\UsageExamplePostRequestBody;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32Enum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnum;
use \OpenAPI\OpenAPI\Models\Operations\UsageExamplePostEnumParameter;
use \OpenAPI\OpenAPI\Models\Operations\UsageExamplePostOptEnumParameter;
use \OpenAPI\OpenAPI\Models\Operations\UsageExamplePostSecurity;

$sdk = SDK::builder()
    ->build();

try {
    $request = new UsageExamplePostRequest();
    $request->requestBody = new UsageExamplePostRequestBody();
    $request->requestBody->email = 'Larue_Rau85@yahoo.com';
    $request->requestBody->formatEmail = 'Roselyn_Kassulke@yahoo.com';
    $request->requestBody->formatUri = 'http://innocent-effect.org';
    $request->requestBody->formatUuid = '0f467cc8-796e-4d15-9a05-dfc2ddf7cc78';
    $request->requestBody->hostname = 'soulful-poppy.com';
    $request->requestBody->ipv4 = '184.163.148.36';
    $request->requestBody->ipv6 = '8fc8:1674:2cb7:3920:5929:396f:ea75:96eb';
    $request->requestBody->simpleObject = new SimpleObject();
    $request->requestBody->simpleObject->any = 'architecto';
    $request->requestBody->simpleObject->bigint = 60225;
    $request->requestBody->simpleObject->bigintStr = 'reiciendis';
    $request->requestBody->simpleObject->bool = true;
    $request->requestBody->simpleObject->boolOpt = true;
    $request->requestBody->simpleObject->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->requestBody->simpleObject->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->requestBody->simpleObject->enum = Enum::TWO;
    $request->requestBody->simpleObject->float32 = 2.2222222;
    $request->requestBody->simpleObject->int = 999999;
    $request->requestBody->simpleObject->int32 = 1;
    $request->requestBody->simpleObject->int32Enum = SimpleObjectInt32Enum::ONE_HUNDRED_AND_EIGHTY_ONE;
    $request->requestBody->simpleObject->intEnum = SimpleObjectIntEnum::Second;
    $request->requestBody->simpleObject->intOptNull = 999999;
    $request->requestBody->simpleObject->num = 1.1;
    $request->requestBody->simpleObject->numOptNull = 1.1;
    $request->requestBody->simpleObject->str = 'example';
    $request->requestBody->simpleObject->strOpt = 'optional example';
    $request->requestBody->unknown = 'laborum';
    $request->requestBody->uri = 'http://doting-footage.com';
    $request->requestBody->uuid = 'c5955907-aff1-4a3a-afa9-467739251aa5';
    $request->boolParameter = false;
    $request->dateParameter = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTimeParameter = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->doubleParameter = 2.2222222;
    $request->enumParameter = UsageExamplePostEnumParameter::VALUE3;
    $request->floatParameter = 1.1;
    $request->int64Parameter = 111111;
    $request->intParameter = 1;
    $request->optEnumParameter = UsageExamplePostOptEnumParameter::VALUE3;
    $request->strParameter = 'example';

    $requestSecurity = new UsageExamplePostSecurity();
    $requestSecurity->password = 'YOUR_PASSWORD';
    $requestSecurity->username = 'YOUR_USERNAME';

    $response = $sdk->generation->usageExamplePost($request, $requestSecurity);

    if ($response->usageExamplePost200ApplicationJSONObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## Available Resources and Operations

### [SDK](docs/sdk/README.md)

* [putAnythingIgnoredGeneration](docs/sdk/README.md#putanythingignoredgeneration)
* [responseBodyJsonGet](docs/sdk/README.md#responsebodyjsonget)

### [auth](docs/auth/README.md)

* [apiKeyAuth](docs/auth/README.md#apikeyauth)
* [apiKeyAuthGlobal](docs/auth/README.md#apikeyauthglobal)
* [basicAuth](docs/auth/README.md#basicauth)
* [bearerAuth](docs/auth/README.md#bearerauth)
* [oauth2Auth](docs/auth/README.md#oauth2auth)
* [openIdConnectAuth](docs/auth/README.md#openidconnectauth)

### [authNew](docs/authnew/README.md)

* [apiKeyAuthGlobalNew](docs/authnew/README.md#apikeyauthglobalnew)
* [basicAuthNew](docs/authnew/README.md#basicauthnew)
* [multipleMixedOptionsAuth](docs/authnew/README.md#multiplemixedoptionsauth)
* [multipleMixedSchemeAuth](docs/authnew/README.md#multiplemixedschemeauth)
* [multipleOptionsWithMixedSchemesAuth](docs/authnew/README.md#multipleoptionswithmixedschemesauth)
* [multipleOptionsWithSimpleSchemesAuth](docs/authnew/README.md#multipleoptionswithsimpleschemesauth)
* [multipleSimpleOptionsAuth](docs/authnew/README.md#multiplesimpleoptionsauth)
* [multipleSimpleSchemeAuth](docs/authnew/README.md#multiplesimpleschemeauth)
* [oauth2AuthNew](docs/authnew/README.md#oauth2authnew)
* [openIdConnectAuthNew](docs/authnew/README.md#openidconnectauthnew)

### [errors](docs/errors/README.md)

* [connectionErrorGet](docs/errors/README.md#connectionerrorget)
* [statusGet](docs/errors/README.md#statusget)
* [statusPostRetries](docs/errors/README.md#statuspostretries)

### [flattening](docs/flattening/README.md)

* [componentBodyAndParamConflict](docs/flattening/README.md#componentbodyandparamconflict)
* [componentBodyAndParamNoConflict](docs/flattening/README.md#componentbodyandparamnoconflict)
* [conflictingParams](docs/flattening/README.md#conflictingparams)
* [inlineBodyAndParamConflict](docs/flattening/README.md#inlinebodyandparamconflict)
* [inlineBodyAndParamNoConflict](docs/flattening/README.md#inlinebodyandparamnoconflict)

### [generation](docs/generation/README.md)

* [anchorTypesGet](docs/generation/README.md#anchortypesget)
* [circularReferenceGet](docs/generation/README.md#circularreferenceget)
* [~~deprecatedNoCommentsGet~~](docs/generation/README.md#deprecatednocommentsget) - deprecatedNoCommentsGet :warning: **Deprecated**
* [~~deprecatedWithCommentsGet~~](docs/generation/README.md#deprecatedwithcommentsget) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** - Use `simplePathParameterObjects` instead.
* [globalNameOverridden](docs/generation/README.md#globalnameoverridden)
* [ignoredGenerationGet](docs/generation/README.md#ignoredgenerationget)
* [ignoresPost](docs/generation/README.md#ignorespost)
* [nameOverride](docs/generation/README.md#nameoverride)
* [usageExamplePost](docs/generation/README.md#usageexamplepost) - An operation used for testing usage examples

### [globals](docs/globals/README.md)

* [globalPathParameterGet](docs/globals/README.md#globalpathparameterget)
* [globalsQueryParameterGet](docs/globals/README.md#globalsqueryparameterget)

### [parameters](docs/parameters/README.md)

* [deepObjectQueryParamsMap](docs/parameters/README.md#deepobjectqueryparamsmap)
* [deepObjectQueryParamsObject](docs/parameters/README.md#deepobjectqueryparamsobject)
* [formQueryParamsArray](docs/parameters/README.md#formqueryparamsarray)
* [formQueryParamsMap](docs/parameters/README.md#formqueryparamsmap)
* [formQueryParamsObject](docs/parameters/README.md#formqueryparamsobject)
* [formQueryParamsPrimitive](docs/parameters/README.md#formqueryparamsprimitive)
* [formQueryParamsRefParamObject](docs/parameters/README.md#formqueryparamsrefparamobject)
* [headerParamsArray](docs/parameters/README.md#headerparamsarray)
* [headerParamsMap](docs/parameters/README.md#headerparamsmap)
* [headerParamsObject](docs/parameters/README.md#headerparamsobject)
* [headerParamsPrimitive](docs/parameters/README.md#headerparamsprimitive)
* [jsonQueryParamsObject](docs/parameters/README.md#jsonqueryparamsobject)
* [mixedQueryParams](docs/parameters/README.md#mixedqueryparams)
* [pathParameterJson](docs/parameters/README.md#pathparameterjson)
* [pipeDelimitedQueryParamsArray](docs/parameters/README.md#pipedelimitedqueryparamsarray)
* [simplePathParameterArrays](docs/parameters/README.md#simplepathparameterarrays)
* [simplePathParameterMaps](docs/parameters/README.md#simplepathparametermaps)
* [simplePathParameterObjects](docs/parameters/README.md#simplepathparameterobjects)
* [simplePathParameterPrimitives](docs/parameters/README.md#simplepathparameterprimitives)

### [requestBodies](docs/requestbodies/README.md)

* [requestBodyPostApplicationJsonArray](docs/requestbodies/README.md#requestbodypostapplicationjsonarray)
* [requestBodyPostApplicationJsonArrayObj](docs/requestbodies/README.md#requestbodypostapplicationjsonarrayobj)
* [requestBodyPostApplicationJsonArrayOfArray](docs/requestbodies/README.md#requestbodypostapplicationjsonarrayofarray)
* [requestBodyPostApplicationJsonArrayOfArrayOfPrimitive](docs/requestbodies/README.md#requestbodypostapplicationjsonarrayofarrayofprimitive)
* [requestBodyPostApplicationJsonArrayOfMap](docs/requestbodies/README.md#requestbodypostapplicationjsonarrayofmap)
* [requestBodyPostApplicationJsonArrayOfPrimitive](docs/requestbodies/README.md#requestbodypostapplicationjsonarrayofprimitive)
* [requestBodyPostApplicationJsonDeep](docs/requestbodies/README.md#requestbodypostapplicationjsondeep)
* [requestBodyPostApplicationJsonMap](docs/requestbodies/README.md#requestbodypostapplicationjsonmap)
* [requestBodyPostApplicationJsonMapObj](docs/requestbodies/README.md#requestbodypostapplicationjsonmapobj)
* [requestBodyPostApplicationJsonMapOfArray](docs/requestbodies/README.md#requestbodypostapplicationjsonmapofarray)
* [requestBodyPostApplicationJsonMapOfMap](docs/requestbodies/README.md#requestbodypostapplicationjsonmapofmap)
* [requestBodyPostApplicationJsonMapOfMapOfPrimitive](docs/requestbodies/README.md#requestbodypostapplicationjsonmapofmapofprimitive)
* [requestBodyPostApplicationJsonMapOfPrimitive](docs/requestbodies/README.md#requestbodypostapplicationjsonmapofprimitive)
* [requestBodyPostApplicationJsonMultipleJsonFiltered](docs/requestbodies/README.md#requestbodypostapplicationjsonmultiplejsonfiltered)
* [requestBodyPostApplicationJsonSimple](docs/requestbodies/README.md#requestbodypostapplicationjsonsimple)
* [requestBodyPostFormDeep](docs/requestbodies/README.md#requestbodypostformdeep)
* [requestBodyPostFormMapPrimitive](docs/requestbodies/README.md#requestbodypostformmapprimitive)
* [requestBodyPostFormSimple](docs/requestbodies/README.md#requestbodypostformsimple)
* [requestBodyPostMultipleContentTypesComponentFiltered](docs/requestbodies/README.md#requestbodypostmultiplecontenttypescomponentfiltered)
* [requestBodyPostMultipleContentTypesInlineFiltered](docs/requestbodies/README.md#requestbodypostmultiplecontenttypesinlinefiltered)
* [requestBodyPostMultipleContentTypesSplitParamForm](docs/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparamform)
* [requestBodyPostMultipleContentTypesSplitParamJson](docs/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparamjson)
* [requestBodyPostMultipleContentTypesSplitParamMultipart](docs/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparammultipart)
* [requestBodyPostMultipleContentTypesSplitForm](docs/requestbodies/README.md#requestbodypostmultiplecontenttypessplitform)
* [requestBodyPostMultipleContentTypesSplitJson](docs/requestbodies/README.md#requestbodypostmultiplecontenttypessplitjson)
* [requestBodyPostMultipleContentTypesSplitMultipart](docs/requestbodies/README.md#requestbodypostmultiplecontenttypessplitmultipart)
* [requestBodyPutBytes](docs/requestbodies/README.md#requestbodyputbytes)
* [requestBodyPutMultipartDeep](docs/requestbodies/README.md#requestbodyputmultipartdeep)
* [requestBodyPutMultipartFile](docs/requestbodies/README.md#requestbodyputmultipartfile)
* [requestBodyPutMultipartSimple](docs/requestbodies/README.md#requestbodyputmultipartsimple)
* [requestBodyPutString](docs/requestbodies/README.md#requestbodyputstring)

### [responseBodies](docs/responsebodies/README.md)

* [responseBodyBytesGet](docs/responsebodies/README.md#responsebodybytesget)
* [responseBodyStringGet](docs/responsebodies/README.md#responsebodystringget)
* [responseBodyXmlGet](docs/responsebodies/README.md#responsebodyxmlget)

### [servers](docs/servers/README.md)

* [selectGlobalServer](docs/servers/README.md#selectglobalserver)
* [selectServerWithID](docs/servers/README.md#selectserverwithid) - Select a server by ID.
* [serverWithTemplates](docs/servers/README.md#serverwithtemplates)
* [serverWithTemplatesGlobal](docs/servers/README.md#serverwithtemplatesglobal)

### [telemetry](docs/telemetry/README.md)

* [telemetrySpeakeasyUserAgentGet](docs/telemetry/README.md#telemetryspeakeasyuseragentget)
* [telemetryUserAgentGet](docs/telemetry/README.md#telemetryuseragentget)

### [unions](docs/unions/README.md)

* [mixedTypeOneOfPost](docs/unions/README.md#mixedtypeoneofpost)
* [primitiveTypeOneOfPost](docs/unions/README.md#primitivetypeoneofpost)
* [stronglyTypedOneOfPost](docs/unions/README.md#stronglytypedoneofpost)
* [typedObjectOneOfPost](docs/unions/README.md#typedobjectoneofpost)
* [weaklyTypedOneOfPost](docs/unions/README.md#weaklytypedoneofpost)
<!-- End SDK Available Operations -->

### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
