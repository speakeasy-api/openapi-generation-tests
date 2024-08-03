# openapi/openapi

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Composer

```bash
composer require "openapi/openapi"
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example 1

```php
<?php

declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Shared\SimpleObject();
    $request->any = 'any';
    $request->bigint = 8821239038968084;
    $request->bigintStr = '9223372036854775808';
    $request->bool = true;
    $request->boolOpt = true;
    $request->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.001Z');
    $request->decimal = 3.141592653589793;
    $request->decimalStr = '3.14159265358979344719667586';
    $request->enum = Shared\Enum::One;
    $request->float32 = 1.1;
    $request->float64Str = '1.1';
    $request->int = 1;
    $request->int32 = 1;
    $request->int32Enum = Shared\Int32Enum::OneHundredAndEightyOne;
    $request->int64Str = '100';
    $request->intEnum = Shared\IntEnum::Second;
    $request->intOptNull = 930591;
    $request->num = 1.1;
    $request->numOptNull = 5244.22;
    $request->str = 'test';
    $request->strOpt = 'testOptional';

    $response = $sdk->generation->globalNameOverridden($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}

```

### Example 2

```php
<?php

declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->servers->selectGlobalServer();

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}

```

### Second

Do this second

```php
<?php

declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
    $request = new Operations\UsageExamplePostRequest();
    $request->requestBody = new Operations\UsageExamplePostRequestBody();
    $request->requestBody->fakerFormattedStrings = new Shared\FakerFormattedStrings();
    $request->requestBody->fakerFormattedStrings->addressFormat = '48525 Maude Fall';
    $request->requestBody->fakerFormattedStrings->directoryFormat = '/etc/defaults';
    $request->requestBody->fakerFormattedStrings->domainFormat = 'next-conflict.name';
    $request->requestBody->fakerFormattedStrings->emailFormat = 'Fermin_Koelpin@gmail.com';
    $request->requestBody->fakerFormattedStrings->filenameFormat = 'your_file_here';
    $request->requestBody->fakerFormattedStrings->filepathFormat = '/bin/northwest.mlp';
    $request->requestBody->fakerFormattedStrings->imageFormat = 'https://loremflickr.com/640/480';
    $request->requestBody->fakerFormattedStrings->ipv4Format = '152.55.213.110';
    $request->requestBody->fakerFormattedStrings->ipv6Format =
        'e4ce:421f:36a9:c057:a71b:b73a:c9ee:2348';
    $request->requestBody->fakerFormattedStrings->jsonFormat =
        '{key: 86008, key1: null, key2: "<value>"}';
    $request->requestBody->fakerFormattedStrings->macFormat = '76:c3:16:4a:25:8b';
    $request->requestBody->fakerFormattedStrings->passwordFormat = 'zMy5BUDIKpiCb6e';
    $request->requestBody->fakerFormattedStrings->phoneFormat = '(917) 974-0191 x1803';
    $request->requestBody->fakerFormattedStrings->timezoneFormat = 'Europe/Berlin';
    $request->requestBody->fakerFormattedStrings->unknownFormat = '<value>';
    $request->requestBody->fakerFormattedStrings->urlFormat = 'https://spectacular-footage.biz';
    $request->requestBody->fakerFormattedStrings->uuidFormat =
        'd63717a3-4244-42b8-aff3-2e0f62de2e2d';
    $request->requestBody->fakerFormattedStrings->zipcodeFormat = '46679';
    $request->requestBody->fakerStrings = new Shared\FakerStrings();
    $request->requestBody->fakerStrings->city = 'North Amanishire';
    $request->requestBody->fakerStrings->iban = 'JO74IFSP2274326726700356009879';
    $request->requestBody->fakerStrings->id = '<id>';
    $request->requestBody->fakerStrings->iPv4 = '247.188.210.52';
    $request->requestBody->fakerStrings->iPv6 = 'ad72:b208:b2c8:1883:08bb:9790:2374:ea8e';
    $request->requestBody->fakerStrings->account = '82652500';
    $request->requestBody->fakerStrings->address = '00086 Sipes Corners';
    $request->requestBody->fakerStrings->amount = '913.36';
    $request->requestBody->fakerStrings->avatar = 'https://loremflickr.com/640/480';
    $request->requestBody->fakerStrings->color = 'olive';
    $request->requestBody->fakerStrings->comment =
        'Carbonite web goalkeeper gloves are ergonomically designed to give easy fit';
    $request->requestBody->fakerStrings->company = 'Considine - Wolf';
    $request->requestBody->fakerStrings->country = 'Paraguay';
    $request->requestBody->fakerStrings->countryCode = 'IN';
    $request->requestBody->fakerStrings->currency = 'Colombian Peso';
    $request->requestBody->fakerStrings->datatype = 'enum';
    $request->requestBody->fakerStrings->default = '<value>';
    $request->requestBody->fakerStrings->description = 'Multi-lateral neutral adapter';
    $request->requestBody->fakerStrings->directory = '/bin';
    $request->requestBody->fakerStrings->domainName = 'juvenile-equivalent.org';
    $request->requestBody->fakerStrings->emailAddr = 'Jany53@yahoo.com';
    $request->requestBody->fakerStrings->extension = 'mp2a';
    $request->requestBody->fakerStrings->filename = 'your_file_here';
    $request->requestBody->fakerStrings->filepath = '/Applications/ubiquitous_executive.pkpass';
    $request->requestBody->fakerStrings->filetype = 'application';
    $request->requestBody->fakerStrings->firstName = 'Blaise';
    $request->requestBody->fakerStrings->fullName = 'Stephanie Carroll';
    $request->requestBody->fakerStrings->gender = 'Cis female';
    $request->requestBody->fakerStrings->job = 'Future Solutions Specialist';
    $request->requestBody->fakerStrings->json = '{key: 95274, key1: null, key2: "<value>"}';
    $request->requestBody->fakerStrings->key = '<key>';
    $request->requestBody->fakerStrings->lastName = 'Renner';
    $request->requestBody->fakerStrings->latitude = '-71.5944';
    $request->requestBody->fakerStrings->locale = 'sv';
    $request->requestBody->fakerStrings->longitude = '-131.8166';
    $request->requestBody->fakerStrings->mac = 'e9:ee:6a:24:2a:1b';
    $request->requestBody->fakerStrings->manufacturer = 'Volvo';
    $request->requestBody->fakerStrings->material = 'Plastic';
    $request->requestBody->fakerStrings->middleName = 'Sawyer';
    $request->requestBody->fakerStrings->model = 'Mustang';
    $request->requestBody->fakerStrings->password = 'YAC_QiNrTzqbDz8';
    $request->requestBody->fakerStrings->phone = '(650) 469-3026 x116';
    $request->requestBody->fakerStrings->pin = '9497';
    $request->requestBody->fakerStrings->postalCode = '64696';
    $request->requestBody->fakerStrings->price = '25.00';
    $request->requestBody->fakerStrings->product = 'Recycled Granite Pants';
    $request->requestBody->fakerStrings->sex = 'male';
    $request->requestBody->fakerStrings->street = 'Lura Wells';
    $request->requestBody->fakerStrings->timezone = 'Africa/Nairobi';
    $request->requestBody->fakerStrings->unit = 'degree Celsius';
    $request->requestBody->fakerStrings->url = 'https://crooked-dulcimer.name';
    $request->requestBody->fakerStrings->username = 'Mable76';
    $request->requestBody->fakerStrings->uuid = '16b919d6-51cd-4e97-81e2-5221b7b6969f';
    $request->requestBody->simpleObject = new Shared\SimpleObject();
    $request->requestBody->simpleObject->any = 'any';
    $request->requestBody->simpleObject->bigint = 8821239038968084;
    $request->requestBody->simpleObject->bigintStr = '9223372036854775808';
    $request->requestBody->simpleObject->bool = true;
    $request->requestBody->simpleObject->boolOpt = true;
    $request->requestBody->simpleObject->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->requestBody->simpleObject->dateTime = DateTime::createFromFormat(
        'Y-m-d\TH:i:s+',
        '2020-01-01T00:00:00.001Z',
    );
    $request->requestBody->simpleObject->decimal = 3.141592653589793;
    $request->requestBody->simpleObject->decimalStr = '3.14159265358979344719667586';
    $request->requestBody->simpleObject->enum = Shared\Enum::One;
    $request->requestBody->simpleObject->float32 = 1.1;
    $request->requestBody->simpleObject->float64Str = '1.1';
    $request->requestBody->simpleObject->int = 1;
    $request->requestBody->simpleObject->int32 = 1;
    $request->requestBody->simpleObject->int32Enum = Shared\Int32Enum::OneHundredAndEightyOne;
    $request->requestBody->simpleObject->int64Str = '100';
    $request->requestBody->simpleObject->intEnum = Shared\IntEnum::Second;
    $request->requestBody->simpleObject->intOptNull = 165468;
    $request->requestBody->simpleObject->num = 1.1;
    $request->requestBody->simpleObject->numOptNull = 5944.32;
    $request->requestBody->simpleObject->str = 'test';
    $request->requestBody->simpleObject->strOpt = 'testOptional';
    $request->bigintParameter = 924793;
    $request->bigintParameterOptional = 583481;
    $request->bigintStrParameter = '<value>';
    $request->bigintStrParameterOptional = '<value>';
    $request->boolParameter = false;
    $request->dateParameter = DateTime::createFromFormat('Y-m-d', '2024-12-21');
    $request->dateTimeDefaultParameter = DateTime::createFromFormat(
        'Y-m-d\TH:i:s+',
        '2022-03-16T03:03:06.071Z',
    );
    $request->dateTimeParameter = DateTime::createFromFormat(
        'Y-m-d\TH:i:s+',
        '2024-05-24T02:10:19.731Z',
    );
    $request->decimalParameter = 4713.96;
    $request->decimalParameterOptional = 9349.54;
    $request->decimalStrParameter = '<value>';
    $request->decimalStrParameterOptional = '<value>';
    $request->doubleParameter = 8700.78;
    $request->enumParameter = Operations\EnumParameter::Value2;
    $request->falseyNumberParameter = 0;
    $request->float32Parameter = 1341.86;
    $request->float64StringParameter = '<value>';
    $request->floatParameter = 5429.24;
    $request->int64Parameter = 101970;
    $request->int64StringParameter = '<value>';
    $request->intParameter = 938852;
    $request->optEnumParameter = Operations\OptEnumParameter::Value3;
    $request->strParameter = 'example 3';

    $requestSecurity = new Operations\UsageExamplePostSecurity();
    $requestSecurity->password = 'YOUR_PASSWORD';
    $requestSecurity->username = 'YOUR_USERNAME';

    $response = $sdk->generation->usageExamplePost($request, $requestSecurity);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}

```
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

### [SDK](docs/sdks/sdk/README.md)

* [authenticatedRequest](docs/sdks/sdk/README.md#authenticatedrequest)
* [conflictingEnum](docs/sdks/sdk/README.md#conflictingenum) - Test potential namespace conflicts with java.lang.Object
* [ignoredGenerationPut](docs/sdks/sdk/README.md#ignoredgenerationput)
* [responseBodyJsonGet](docs/sdks/sdk/README.md#responsebodyjsonget)

### [Generation](docs/sdks/generation/README.md)

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

### [Unions](docs/sdks/unions/README.md)

* [collectionOneOfPost](docs/sdks/unions/README.md#collectiononeofpost)
* [constDiscriminatedOneOf](docs/sdks/unions/README.md#constdiscriminatedoneof)
* [discriminatedOneMultipleMemberships](docs/sdks/unions/README.md#discriminatedonemultiplememberships)
* [discriminatedOneMultipleMembershipsHasWheels](docs/sdks/unions/README.md#discriminatedonemultiplemembershipshaswheels)
* [flattenedTypedObjectPost](docs/sdks/unions/README.md#flattenedtypedobjectpost)
* [infectedWithAny](docs/sdks/unions/README.md#infectedwithany)
* [mixedTypeOneOfPost](docs/sdks/unions/README.md#mixedtypeoneofpost)
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
* [weaklyTypedOneOfNullEnumPost](docs/sdks/unions/README.md#weaklytypedoneofnullenumpost)
* [weaklyTypedOneOfPost](docs/sdks/unions/README.md#weaklytypedoneofpost)

### [Errors](docs/sdks/errors/README.md)

* [connectionErrorGet](docs/sdks/errors/README.md#connectionerrorget)
* [errorUnionDiscriminatedPost](docs/sdks/errors/README.md#erroruniondiscriminatedpost)
* [errorUnionPost](docs/sdks/errors/README.md#errorunionpost)
* [statusGetError](docs/sdks/errors/README.md#statusgeterror)
* [statusGetXSpeakeasyErrors](docs/sdks/errors/README.md#statusgetxspeakeasyerrors)

### [CustomClient](docs/sdks/customclient/README.md)

* [customClientPost](docs/sdks/customclient/README.md#customclientpost)

### [ResponseBodies](docs/sdks/responsebodies/README.md)

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
* [responseBodyOptionalGet](docs/sdks/responsebodies/README.md#responsebodyoptionalget)
* [responseBodyReadOnly](docs/sdks/responsebodies/README.md#responsebodyreadonly)
* [responseBodyStringGet](docs/sdks/responsebodies/README.md#responsebodystringget)
* [responseBodyXmlGet](docs/sdks/responsebodies/README.md#responsebodyxmlget)

### [Flattening](docs/sdks/flattening/README.md)

* [componentBodyAndParamConflict](docs/sdks/flattening/README.md#componentbodyandparamconflict)
* [componentBodyAndParamNoConflict](docs/sdks/flattening/README.md#componentbodyandparamnoconflict)
* [conflictingParams](docs/sdks/flattening/README.md#conflictingparams)
* [inlineBodyAndParamConflict](docs/sdks/flattening/README.md#inlinebodyandparamconflict)
* [inlineBodyAndParamNoConflict](docs/sdks/flattening/README.md#inlinebodyandparamnoconflict)

### [Globals](docs/sdks/globals/README.md)

* [globalPathParameterGet](docs/sdks/globals/README.md#globalpathparameterget)
* [globalsHeaderGet](docs/sdks/globals/README.md#globalsheaderget)
* [globalsHiddenPost](docs/sdks/globals/README.md#globalshiddenpost)
* [globalsQueryParameterGet](docs/sdks/globals/README.md#globalsqueryparameterget)

### [Parameters](docs/sdks/parameters/README.md)

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

### [Hooks](docs/sdks/hooks/README.md)

* [authorizationHeaderModification](docs/sdks/hooks/README.md#authorizationheadermodification)
* [testHooks](docs/sdks/hooks/README.md#testhooks)
* [testHooksAfterResponse](docs/sdks/hooks/README.md#testhooksafterresponse)
* [testHooksBeforeCreateRequestPaths](docs/sdks/hooks/README.md#testhooksbeforecreaterequestpaths)
* [testHooksError](docs/sdks/hooks/README.md#testhookserror)

### [NestFirst](docs/sdks/nestfirst/README.md)

* [get](docs/sdks/nestfirst/README.md#get)

### [Nested](docs/sdks/nested/README.md)

* [get](docs/sdks/nested/README.md#get)

### [NestedFirst](docs/sdks/nestedfirst/README.md)

* [get](docs/sdks/nestedfirst/README.md#get)

### [NestedSecond](docs/sdks/nestedsecond/README.md)

* [get](docs/sdks/nestedsecond/README.md#get)

### [Auth](docs/sdks/auth/README.md)

* [apiKeyAuth](docs/sdks/auth/README.md#apikeyauth)
* [apiKeyAuthGlobal](docs/sdks/auth/README.md#apikeyauthglobal)
* [basicAuth](docs/sdks/auth/README.md#basicauth)
* [bearerAuth](docs/sdks/auth/README.md#bearerauth)
* [globalBearerAuth](docs/sdks/auth/README.md#globalbearerauth)
* [noAuth](docs/sdks/auth/README.md#noauth)
* [oauth2Auth](docs/sdks/auth/README.md#oauth2auth)
* [oauth2Override](docs/sdks/auth/README.md#oauth2override)
* [openIdConnectAuth](docs/sdks/auth/README.md#openidconnectauth)

### [OpenEnums](docs/sdks/openenums/README.md)

* [openEnumsPostUnrecognized](docs/sdks/openenums/README.md#openenumspostunrecognized)

### [RequestBodies](docs/sdks/requestbodies/README.md)

* [nullEnumPost](docs/sdks/requestbodies/README.md#nullenumpost)
* [nullableObjectPost](docs/sdks/requestbodies/README.md#nullableobjectpost)
* [nullableOptionalFieldsPost](docs/sdks/requestbodies/README.md#nullableoptionalfieldspost)
* [nullableRequiredEmptyObjectPost](docs/sdks/requestbodies/README.md#nullablerequiredemptyobjectpost)
* [nullableRequiredPropertyPost](docs/sdks/requestbodies/README.md#nullablerequiredpropertypost)
* [nullableRequiredSharedObjectPost](docs/sdks/requestbodies/README.md#nullablerequiredsharedobjectpost)
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

### [Servers](docs/sdks/servers/README.md)

* [selectGlobalServer](docs/sdks/servers/README.md#selectglobalserver)
* [selectServerWithID](docs/sdks/servers/README.md#selectserverwithid) - Select a server by ID.
* [serverWithProtocolTemplate](docs/sdks/servers/README.md#serverwithprotocoltemplate)
* [serverWithTemplates](docs/sdks/servers/README.md#serverwithtemplates)
* [serverWithTemplatesGlobal](docs/sdks/servers/README.md#serverwithtemplatesglobal)
* [serversByIDWithTemplates](docs/sdks/servers/README.md#serversbyidwithtemplates)

### [Telemetry](docs/sdks/telemetry/README.md)

* [telemetrySpeakeasyUserAgentGet](docs/sdks/telemetry/README.md#telemetryspeakeasyuseragentget)
* [telemetryUserAgentGet](docs/sdks/telemetry/README.md#telemetryuseragentget)

### [AuthNew](docs/sdks/authnew/README.md)

* [authGlobal](docs/sdks/authnew/README.md#authglobal)
* [basicAuthNew](docs/sdks/authnew/README.md#basicauthnew)
* [multipleMixedOptionsAuth](docs/sdks/authnew/README.md#multiplemixedoptionsauth)
* [multipleMixedSchemeAuth](docs/sdks/authnew/README.md#multiplemixedschemeauth)
* [multipleOptionsWithMixedSchemesAuth](docs/sdks/authnew/README.md#multipleoptionswithmixedschemesauth)
* [multipleOptionsWithSimpleSchemesAuth](docs/sdks/authnew/README.md#multipleoptionswithsimpleschemesauth)
* [multipleSimpleOptionsAuth](docs/sdks/authnew/README.md#multiplesimpleoptionsauth)
* [multipleSimpleSchemeAuth](docs/sdks/authnew/README.md#multiplesimpleschemeauth)
* [oauth2AuthNew](docs/sdks/authnew/README.md#oauth2authnew)
* [openIdConnectAuthNew](docs/sdks/authnew/README.md#openidconnectauthnew)

### [Resource](docs/sdks/resource/README.md)

* [createFile](docs/sdks/resource/README.md#createfile)
* [createResource](docs/sdks/resource/README.md#createresource)
* [deleteResource](docs/sdks/resource/README.md#deleteresource)
* [getArrayDataSource](docs/sdks/resource/README.md#getarraydatasource)
* [getResource](docs/sdks/resource/README.md#getresource)
* [updateResource](docs/sdks/resource/README.md#updateresource)

### [Documentation](docs/sdks/documentation/README.md)

* [getDocumentationPerLanguage](docs/sdks/documentation/README.md#getdocumentationperlanguage) - Gets documentation for some language, I guess.

### [First](docs/sdks/first/README.md)

* [get](docs/sdks/first/README.md#get)

### [Second](docs/sdks/second/README.md)

* [get](docs/sdks/second/README.md#get)

### [Pagination](docs/sdks/pagination/README.md)

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

### [Retries](docs/sdks/retries/README.md)

* [retriesAfter](docs/sdks/retries/README.md#retriesafter)
* [retriesConnectErrorGet](docs/sdks/retries/README.md#retriesconnecterrorget) - A request to a non-valid port to test connection errors
* [retriesFlatEmptyResponsePost](docs/sdks/retries/README.md#retriesflatemptyresponsepost)
* [retriesGet](docs/sdks/retries/README.md#retriesget)
* [retriesPost](docs/sdks/retries/README.md#retriespost)
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
<?php

declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->globals->globalPathParameterGet(100);

    if ($response->res !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}

```
<!-- End Global Parameters [global-parameters] -->

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
 * `something: ServerSomething`
 * `protocol: string`

### Override Server URL Per-Client

The default server can also be overridden globally by passing a URL to the `server_url: str` optional parameter when initializing the SDK client instance. For example:


### Override Server URL Per-Operation

The server URL can also be overridden on a per-operation basis, provided a server list was specified for the operation. For example:
```php
<?php

declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->errors->connectionErrorGet('http://somebrokenapi.broken');

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
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
