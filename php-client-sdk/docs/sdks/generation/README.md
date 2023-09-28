# Generation
(*generation*)

## Overview

Endpoints for purely testing valid generation behavior.

### Available Operations

* [anchorTypesGet](#anchortypesget)
* [circularReferenceGet](#circularreferenceget)
* [deprecatedFieldInSchemaPost](#deprecatedfieldinschemapost)
* [deprecatedObjectInSchemaGet](#deprecatedobjectinschemaget)
* [~~deprecatedOperationNoCommentsGet~~](#deprecatedoperationnocommentsget) - deprecatedOperationNoCommentsGet :warning: **Deprecated**
* [~~deprecatedOperationWithCommentsGet~~](#deprecatedoperationwithcommentsget) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** Use `simplePathParameterObjects` instead.
* [emptyObjectGet](#emptyobjectget)
* [emptyResponseObjectWithCommentGet](#emptyresponseobjectwithcommentget)
* [globalNameOverridden](#globalnameoverridden)
* [ignoredGenerationGet](#ignoredgenerationget)
* [ignoresPost](#ignorespost)
* [nameOverride](#nameoverride)
* [typedParameterGenerationGet](#typedparametergenerationget)
* [usageExamplePost](#usageexamplepost) - An operation used for testing usage examples

## anchorTypesGet

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;

$sdk = SDK::builder()
    ->build();

try {
    $response = $sdk->generation->anchorTypesGet();

    if ($response->typeFromAnchor !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\AnchorTypesGetResponse](../../models/operations/AnchorTypesGetResponse.md)**


## circularReferenceGet

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;

$sdk = SDK::builder()
    ->build();

try {
    $response = $sdk->generation->circularReferenceGet();

    if ($response->validCircularReferenceObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\CircularReferenceGetResponse](../../models/operations/CircularReferenceGetResponse.md)**


## deprecatedFieldInSchemaPost

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\DeprecatedFieldInObject;
use \OpenAPI\OpenAPI\Models\Shared\DeprecatedFieldInObjectDeprecatedEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = new DeprecatedFieldInObject();
    $request->deprecatedField = 'suscipit';
    $request->newField = 'velit';

    $response = $sdk->generation->deprecatedFieldInSchemaPost($request);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                               | [\OpenAPI\OpenAPI\Models\Shared\DeprecatedFieldInObject](../../models/shared/DeprecatedFieldInObject.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\DeprecatedFieldInSchemaPostResponse](../../models/operations/DeprecatedFieldInSchemaPostResponse.md)**


## deprecatedObjectInSchemaGet

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;

$sdk = SDK::builder()
    ->build();

try {
    $response = $sdk->generation->deprecatedObjectInSchemaGet();

    if ($response->deprecatedObjectInSchemaGet200ApplicationJSONObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\DeprecatedObjectInSchemaGetResponse](../../models/operations/DeprecatedObjectInSchemaGetResponse.md)**


## ~~deprecatedOperationNoCommentsGet~~

deprecatedOperationNoCommentsGet

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\DeprecatedOperationNoCommentsGetRequest;

$sdk = SDK::builder()
    ->build();

try {


    $response = $sdk->generation->deprecatedOperationNoCommentsGet('culpa');

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `deprecatedParameter`                                                                                                   | *?string*                                                                                                               | :heavy_minus_sign:                                                                                                      | : warning: ** DEPRECATED **: This will be removed in a future release, please migrate away from it as soon as possible. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\DeprecatedOperationNoCommentsGetResponse](../../models/operations/DeprecatedOperationNoCommentsGetResponse.md)**


## ~~deprecatedOperationWithCommentsGet~~

This is an endpoint setup to test deprecation with comments

> :warning: **DEPRECATED**: This operation is deprecated. Use `simplePathParameterObjects` instead.

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\DeprecatedOperationWithCommentsGetRequest;

$sdk = SDK::builder()
    ->build();

try {


    $response = $sdk->generation->deprecatedOperationWithCommentsGet('est', 'recusandae');

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `deprecatedParameter`                                                                                            | *?string*                                                                                                        | :heavy_minus_sign:                                                                                               | : warning: ** DEPRECATED **: This parameter is deprecated. Use newParameter instead.<br/><br/>This is a string parameter |
| `newParameter`                                                                                                   | *?string*                                                                                                        | :heavy_minus_sign:                                                                                               | This is a string parameter                                                                                       |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\DeprecatedOperationWithCommentsGetResponse](../../models/operations/DeprecatedOperationWithCommentsGetResponse.md)**


## emptyObjectGet

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\EmptyObjectGetRequest;
use \OpenAPI\OpenAPI\Models\Shared\EmptyObjectParam;

$sdk = SDK::builder()
    ->build();

try {
    $emptyObject = new EmptyObjectParam();

    $response = $sdk->generation->emptyObjectGet($emptyObject);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                  | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `emptyObject`                                                                              | [\OpenAPI\OpenAPI\Models\Shared\EmptyObjectParam](../../models/shared/EmptyObjectParam.md) | :heavy_check_mark:                                                                         | N/A                                                                                        |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\EmptyObjectGetResponse](../../models/operations/EmptyObjectGetResponse.md)**


## emptyResponseObjectWithCommentGet

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;

$sdk = SDK::builder()
    ->build();

try {
    $response = $sdk->generation->emptyResponseObjectWithCommentGet();

    if ($response->body !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\EmptyResponseObjectWithCommentGetResponse](../../models/operations/EmptyResponseObjectWithCommentGetResponse.md)**


## globalNameOverridden

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;

$sdk = SDK::builder()
    ->build();

try {
    $response = $sdk->generation->globalNameOverridden();

    if ($response->getGlobalNameOverride200ApplicationJSONObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\GetGlobalNameOverrideResponse](../../models/operations/GetGlobalNameOverrideResponse.md)**


## ignoredGenerationGet

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;

$sdk = SDK::builder()
    ->build();

try {
    $response = $sdk->generation->ignoredGenerationGet();

    if ($response->ignoredGenerationGet200ApplicationJSONObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\IgnoredGenerationGetResponse](../../models/operations/IgnoredGenerationGetResponse.md)**


## ignoresPost

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\IgnoresPostRequest;
use \OpenAPI\OpenAPI\Models\Operations\IgnoresPostApplicationJSON;

$sdk = SDK::builder()
    ->build();

try {
    $requestBody = new IgnoresPostApplicationJSON();
    $requestBody->callbackUrl = 'https://those-helo.info';
    $requestBody->testProp = 'quos';

    $response = $sdk->generation->ignoresPost($requestBody, 'vel');

    if ($response->httpBinSimpleJsonObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                          | [\OpenAPI\OpenAPI\Models\Operations\IgnoresPostApplicationJSON](../../models/operations/IgnoresPostApplicationJSON.md) | :heavy_check_mark:                                                                                                     | N/A                                                                                                                    |
| `testParam`                                                                                                            | *?string*                                                                                                              | :heavy_minus_sign:                                                                                                     | N/A                                                                                                                    |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\IgnoresPostResponse](../../models/operations/IgnoresPostResponse.md)**


## nameOverride

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\NameOverrideGetRequest;
use \OpenAPI\OpenAPI\Models\Operations\NameOverrideGetEnumNameOverride;

$sdk = SDK::builder()
    ->build();

try {


    $response = $sdk->generation->nameOverride(NameOverrideGetEnumNameOverride::Value3, 'example');

    if ($response->overriddenResponse !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      | Example                                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `testEnumQueryParam`                                                                                                             | [\OpenAPI\OpenAPI\Models\Operations\NameOverrideGetEnumNameOverride](../../models/operations/NameOverrideGetEnumNameOverride.md) | :heavy_check_mark:                                                                                                               | An enum type                                                                                                                     | value3                                                                                                                           |
| `testQueryParam`                                                                                                                 | *string*                                                                                                                         | :heavy_check_mark:                                                                                                               | N/A                                                                                                                              | example                                                                                                                          |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\NameOverrideGetResponse](../../models/operations/NameOverrideGetResponse.md)**


## typedParameterGenerationGet

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\TypedParameterGenerationGetRequest;
use \OpenAPI\OpenAPI\Models\Operations\TypedParameterGenerationGetObj;

$sdk = SDK::builder()
    ->build();

try {
    $obj = new TypedParameterGenerationGetObj();
    $obj->bool = false;
    $obj->num = 2870.51;
    $obj->str = 'possimus';

    $response = $sdk->generation->typedParameterGenerationGet(706575, DateTime::createFromFormat('Y-m-d', '2022-03-04'), 4471.44, $obj);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `bigint`                                                                                                                        | *?int*                                                                                                                          | :heavy_minus_sign:                                                                                                              | N/A                                                                                                                             |
| `date`                                                                                                                          | [\DateTime](https://www.php.net/manual/en/class.datetime.php)                                                                   | :heavy_minus_sign:                                                                                                              | N/A                                                                                                                             |
| `decimal`                                                                                                                       | *?float*                                                                                                                        | :heavy_minus_sign:                                                                                                              | N/A                                                                                                                             |
| `obj`                                                                                                                           | [?\OpenAPI\OpenAPI\Models\Operations\TypedParameterGenerationGetObj](../../models/operations/TypedParameterGenerationGetObj.md) | :heavy_minus_sign:                                                                                                              | N/A                                                                                                                             |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\TypedParameterGenerationGetResponse](../../models/operations/TypedParameterGenerationGetResponse.md)**


## usageExamplePost

An operation used for testing usage examples that includes a large array of parameters and input types to ensure that all are handled correctly

Usage example docs
<https://docs.example.com>

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\UsageExamplePostRequest;
use \OpenAPI\OpenAPI\Models\Operations\UsageExamplePostRequestBody;
use \OpenAPI\OpenAPI\Models\Shared\FakerFormattedStrings;
use \OpenAPI\OpenAPI\Models\Shared\FakerStrings;
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
    $request->requestBody->fakerFormattedStrings = new FakerFormattedStrings();
    $request->requestBody->fakerFormattedStrings->addressFormat = '9839 Alvis Road';
    $request->requestBody->fakerFormattedStrings->directoryFormat = 'consectetur';
    $request->requestBody->fakerFormattedStrings->domainFormat = 'in';
    $request->requestBody->fakerFormattedStrings->emailFormat = 'Tressa98@yahoo.com';
    $request->requestBody->fakerFormattedStrings->filenameFormat = 'suscipit';
    $request->requestBody->fakerFormattedStrings->filepathFormat = 'reiciendis';
    $request->requestBody->fakerFormattedStrings->imageFormat = 'quidem';
    $request->requestBody->fakerFormattedStrings->ipv4Format = '231.229.75.30';
    $request->requestBody->fakerFormattedStrings->ipv6Format = 'f333:17fe:35b6:0eb1:ea42:6555:ba3c:2874';
    $request->requestBody->fakerFormattedStrings->jsonFormat = '{"foo":88596,"bar":"A7eOTx3[Tq","bike":"xAf#b.{-}b","a":70907,"b":61174,"name":67190,"prop":44751}';
    $request->requestBody->fakerFormattedStrings->macFormat = 'commodi';
    $request->requestBody->fakerFormattedStrings->passwordFormat = 'quidem';
    $request->requestBody->fakerFormattedStrings->phoneFormat = '1-561-598-0905';
    $request->requestBody->fakerFormattedStrings->timezoneFormat = 'maiores';
    $request->requestBody->fakerFormattedStrings->unknownFormat = 'incidunt';
    $request->requestBody->fakerFormattedStrings->urlFormat = 'sed';
    $request->requestBody->fakerFormattedStrings->uuidFormat = '94e3698f-447f-4603-a8b4-45e80ca55efd';
    $request->requestBody->fakerFormattedStrings->zipcodeFormat = '09234';
    $request->requestBody->fakerStrings = new FakerStrings();
    $request->requestBody->fakerStrings->city = 'Bozeman';
    $request->requestBody->fakerStrings->iban = 'laudantium';
    $request->requestBody->fakerStrings->id = '58b6a89f-be3a-45aa-8e48-24d0ab407508';
    $request->requestBody->fakerStrings->iPv4 = '142.236.92.22';
    $request->requestBody->fakerStrings->iPv6 = '8620:65e9:04f3:b119:4b8a:bf60:3a79:f9df';
    $request->requestBody->fakerStrings->account = 'voluptates';
    $request->requestBody->fakerStrings->address = '66486 O'Connell Green';
    $request->requestBody->fakerStrings->amount = 'voluptatem';
    $request->requestBody->fakerStrings->avatar = 'quisquam';
    $request->requestBody->fakerStrings->color = 'repudiandae';
    $request->requestBody->fakerStrings->comment = 'quasi';
    $request->requestBody->fakerStrings->company = 'Kihn - Zboncak';
    $request->requestBody->fakerStrings->country = 'Macao';
    $request->requestBody->fakerStrings->countryCode = 'HM';
    $request->requestBody->fakerStrings->currency = 'quidem';
    $request->requestBody->fakerStrings->datatype = 'maxime';
    $request->requestBody->fakerStrings->default = 'et';
    $request->requestBody->fakerStrings->description = 'esse';
    $request->requestBody->fakerStrings->directory = 'amet';
    $request->requestBody->fakerStrings->domainName = 'assumenda';
    $request->requestBody->fakerStrings->emailAddr = 'ea';
    $request->requestBody->fakerStrings->extension = 'atque';
    $request->requestBody->fakerStrings->filename = 'error';
    $request->requestBody->fakerStrings->filepath = 'officiis';
    $request->requestBody->fakerStrings->filetype = 'officiis';
    $request->requestBody->fakerStrings->firstName = 'Shanelle';
    $request->requestBody->fakerStrings->fullName = 'natus';
    $request->requestBody->fakerStrings->gender = 'female';
    $request->requestBody->fakerStrings->job = 'aspernatur';
    $request->requestBody->fakerStrings->json = '{"foo":98058,"bar":"rZODvSS,v`","bike":";{$v+$*1>E","a":95214,"b":"<u/VsXJ7uW","name":14587,"prop":"@I[(Bau8r$"}';
    $request->requestBody->fakerStrings->key = 'iure';
    $request->requestBody->fakerStrings->lastName = 'Beier';
    $request->requestBody->fakerStrings->latitude = 'totam';
    $request->requestBody->fakerStrings->locale = 'quae';
    $request->requestBody->fakerStrings->longitude = 'molestiae';
    $request->requestBody->fakerStrings->mac = 'eveniet';
    $request->requestBody->fakerStrings->manufacturer = 'qui';
    $request->requestBody->fakerStrings->material = 'cum';
    $request->requestBody->fakerStrings->middleName = 'iure';
    $request->requestBody->fakerStrings->model = 'necessitatibus';
    $request->requestBody->fakerStrings->password = 'ratione';
    $request->requestBody->fakerStrings->phone = '1-755-439-0354 x6309';
    $request->requestBody->fakerStrings->pin = 'reiciendis';
    $request->requestBody->fakerStrings->postalCode = '63262';
    $request->requestBody->fakerStrings->price = 'quae';
    $request->requestBody->fakerStrings->product = 'recusandae';
    $request->requestBody->fakerStrings->sex = 'male';
    $request->requestBody->fakerStrings->street = '44262 Larkin Keys';
    $request->requestBody->fakerStrings->timezone = 'nemo';
    $request->requestBody->fakerStrings->unit = 'recusandae';
    $request->requestBody->fakerStrings->url = 'esse';
    $request->requestBody->fakerStrings->username = 'Laron_Hauck';
    $request->requestBody->fakerStrings->uuid = '9251a5a9-da66-40ff-97bf-aad4f9efc1b4';
    $request->requestBody->simpleObject = new SimpleObject();
    $request->requestBody->simpleObject->any = 'quis';
    $request->requestBody->simpleObject->bigint = 82057;
    $request->requestBody->simpleObject->bigintStr = 'fugit';
    $request->requestBody->simpleObject->bool = true;
    $request->requestBody->simpleObject->boolOpt = true;
    $request->requestBody->simpleObject->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->requestBody->simpleObject->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00.000Z');
    $request->requestBody->simpleObject->decimal = 7652.71;
    $request->requestBody->simpleObject->enum = Enum::Two;
    $request->requestBody->simpleObject->float32 = 2.2222222;
    $request->requestBody->simpleObject->int = 999999;
    $request->requestBody->simpleObject->int32 = 1;
    $request->requestBody->simpleObject->int32Enum = SimpleObjectInt32Enum::FiftyFive;
    $request->requestBody->simpleObject->intEnum = SimpleObjectIntEnum::First;
    $request->requestBody->simpleObject->intOptNull = 999999;
    $request->requestBody->simpleObject->num = 1.1;
    $request->requestBody->simpleObject->numOptNull = 1.1;
    $request->requestBody->simpleObject->str = 'example';
    $request->requestBody->simpleObject->strOpt = 'optional example';
    $request->bigintParameter = 241901;
    $request->bigintParameterOptional = 137251;
    $request->bigintStrParameter = 'eum';
    $request->bigintStrParameterOptional = 'eius';
    $request->boolParameter = false;
    $request->dateParameter = DateTime::createFromFormat('Y-m-d', '2021-04-05');
    $request->dateTimeParameter = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2022-06-18T13:06:11.480Z');
    $request->decimalParameter = 9587.41;
    $request->decimalParameterOptional = 4332.79;
    $request->decimalStrParameter = 'dicta';
    $request->decimalStrParameterOptional = 'minima';
    $request->doubleParameter = 1070.04;
    $request->enumParameter = UsageExamplePostEnumParameter::Value2;
    $request->falseyNumberParameter = 0;
    $request->float32Parameter = 5896.95;
    $request->floatParameter = 9364.69;
    $request->int64Parameter = 745398;
    $request->intParameter = 940782;
    $request->optEnumParameter = UsageExamplePostOptEnumParameter::Value3;
    $request->strParameter = 'example 3';

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

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `$request`                                                                                                         | [\OpenAPI\OpenAPI\Models\Operations\UsageExamplePostRequest](../../models/operations/UsageExamplePostRequest.md)   | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |
| `security`                                                                                                         | [\OpenAPI\OpenAPI\Models\Operations\UsageExamplePostSecurity](../../models/operations/UsageExamplePostSecurity.md) | :heavy_check_mark:                                                                                                 | The security requirements to use for the request.                                                                  |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\UsageExamplePostResponse](../../models/operations/UsageExamplePostResponse.md)**

