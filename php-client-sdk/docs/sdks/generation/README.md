# Generation
(*generation*)

## Overview

Endpoints for purely testing valid generation behavior.

### Available Operations

* [anchorTypesGet](#anchortypesget)
* [arrayCircularReferenceGet](#arraycircularreferenceget)
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
* [objectCircularReferenceGet](#objectcircularreferenceget)
* [oneOfCircularReferenceGet](#oneofcircularreferenceget)
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


## arrayCircularReferenceGet

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
    $response = $sdk->generation->arrayCircularReferenceGet();

    if ($response->arrayCircularReferenceObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\ArrayCircularReferenceGetResponse](../../models/operations/ArrayCircularReferenceGetResponse.md)**


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
    $request->deprecatedField = 'Bike Avon';
    $request->newField = 'Rubber Santa';

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


    $response = $sdk->generation->deprecatedOperationNoCommentsGet('Account');

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


    $response = $sdk->generation->deprecatedOperationWithCommentsGet('Account', 'actuating');

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
    $requestBody->callbackUrl = 'http://diligent-activist.biz';
    $requestBody->testProp = 'solid Branding Maserati';

    $response = $sdk->generation->ignoresPost($requestBody, 'Maserati');

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


## objectCircularReferenceGet

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
    $response = $sdk->generation->objectCircularReferenceGet();

    if ($response->objectCircularReferenceObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\ObjectCircularReferenceGetResponse](../../models/operations/ObjectCircularReferenceGetResponse.md)**


## oneOfCircularReferenceGet

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
    $response = $sdk->generation->oneOfCircularReferenceGet();

    if ($response->oneOfCircularReferenceObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\OneOfCircularReferenceGetResponse](../../models/operations/OneOfCircularReferenceGetResponse.md)**


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
    $obj->num = 8792.75;
    $obj->str = 'innocently Orchestrator program';

    $response = $sdk->generation->typedParameterGenerationGet(302424, DateTime::createFromFormat('Y-m-d', '2021-10-23'), 1913.6, $obj);

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
    $request->requestBody->fakerFormattedStrings->addressFormat = '48525 Maude Fall';
    $request->requestBody->fakerFormattedStrings->directoryFormat = '/etc/defaults';
    $request->requestBody->fakerFormattedStrings->domainFormat = 'next-conflict.name';
    $request->requestBody->fakerFormattedStrings->emailFormat = 'Fermin_Koelpin@gmail.com';
    $request->requestBody->fakerFormattedStrings->filenameFormat = 'northeast.wav';
    $request->requestBody->fakerFormattedStrings->filepathFormat = '/lib/pizza_integrated.hbs';
    $request->requestBody->fakerFormattedStrings->imageFormat = 'https://loremflickr.com/640/480';
    $request->requestBody->fakerFormattedStrings->ipv4Format = '75.42.25.241';
    $request->requestBody->fakerFormattedStrings->ipv6Format = '36a9:c057:a71b:b73a:c9ee:2348:d76c:3164';
    $request->requestBody->fakerFormattedStrings->jsonFormat = '{plane: 14910, fringe: null, lightning: "Roentgenium UTF8"}';
    $request->requestBody->fakerFormattedStrings->macFormat = '13:58:66:7d:ac:95';
    $request->requestBody->fakerFormattedStrings->passwordFormat = 'b6eWzdveK0sHokC';
    $request->requestBody->fakerFormattedStrings->phoneFormat = '832-504-6221 x221';
    $request->requestBody->fakerFormattedStrings->timezoneFormat = 'Asia/Krasnoyarsk';
    $request->requestBody->fakerFormattedStrings->unknownFormat = 'Principal at';
    $request->requestBody->fakerFormattedStrings->urlFormat = 'http://understated-balcony.org';
    $request->requestBody->fakerFormattedStrings->uuidFormat = '62de2e2d-47a9-4bf1-80f7-53b9b364b6b4';
    $request->requestBody->fakerFormattedStrings->zipcodeFormat = '25687-7266';
    $request->requestBody->fakerStrings = new FakerStrings();
    $request->requestBody->fakerStrings->city = 'Port Carli';
    $request->requestBody->fakerStrings->iban = 'TN8700576009897281100717';
    $request->requestBody->fakerStrings->id = '<ID>';
    $request->requestBody->fakerStrings->iPv4 = '141.21.132.133';
    $request->requestBody->fakerStrings->iPv6 = '308b:b979:0237:4ea8:ee39:8480:0301:1d98';
    $request->requestBody->fakerStrings->account = '81966519';
    $request->requestBody->fakerStrings->address = '418 Maybelle Brooks';
    $request->requestBody->fakerStrings->amount = '27.55';
    $request->requestBody->fakerStrings->avatar = 'https://loremflickr.com/640/480';
    $request->requestBody->fakerStrings->color = 'turquoise';
    $request->requestBody->fakerStrings->comment = 'The slim & simple Maple Gaming Keyboard from Dev Byte comes with a sleek body and 7- Color RGB LED Back-lighting for smart functionality';
    $request->requestBody->fakerStrings->company = 'Murazik, Kozey and Hirthe';
    $request->requestBody->fakerStrings->country = 'Equatorial Guinea';
    $request->requestBody->fakerStrings->countryCode = 'LU';
    $request->requestBody->fakerStrings->currency = 'Congolese Franc';
    $request->requestBody->fakerStrings->datatype = 'bigint';
    $request->requestBody->fakerStrings->default = 'Dalasi';
    $request->requestBody->fakerStrings->description = 'Up-sized explicit frame';
    $request->requestBody->fakerStrings->directory = '/home';
    $request->requestBody->fakerStrings->domainName = 'warmhearted-buying.biz';
    $request->requestBody->fakerStrings->emailAddr = 'Beulah.Franecki24@gmail.com';
    $request->requestBody->fakerStrings->extension = 'pdf';
    $request->requestBody->fakerStrings->filename = 'recovery.pdf';
    $request->requestBody->fakerStrings->filepath = '/usr/share/powerfully.less';
    $request->requestBody->fakerStrings->filetype = 'application';
    $request->requestBody->fakerStrings->firstName = 'Geovany';
    $request->requestBody->fakerStrings->fullName = 'Roy Gottlieb';
    $request->requestBody->fakerStrings->gender = 'Cis';
    $request->requestBody->fakerStrings->job = 'International Metrics Administrator';
    $request->requestBody->fakerStrings->json = '{trachoma: 6397, nick: null, android: "Plastic Recumbent"}';
    $request->requestBody->fakerStrings->key = '<key>';
    $request->requestBody->fakerStrings->lastName = 'Kshlerin';
    $request->requestBody->fakerStrings->latitude = '65.3520';
    $request->requestBody->fakerStrings->locale = 'zh_CN';
    $request->requestBody->fakerStrings->longitude = '16.8742';
    $request->requestBody->fakerStrings->mac = 'fd:b6:ff:35:99:05';
    $request->requestBody->fakerStrings->manufacturer = 'Mazda';
    $request->requestBody->fakerStrings->material = 'Frozen';
    $request->requestBody->fakerStrings->middleName = 'Emerson';
    $request->requestBody->fakerStrings->model = 'Mustang';
    $request->requestBody->fakerStrings->password = '71wIwgEZJMTCRYg';
    $request->requestBody->fakerStrings->phone = '1-466-307-0476';
    $request->requestBody->fakerStrings->pin = '0584';
    $request->requestBody->fakerStrings->postalCode = '07886';
    $request->requestBody->fakerStrings->price = '452.00';
    $request->requestBody->fakerStrings->product = 'Small Steel Salad';
    $request->requestBody->fakerStrings->sex = 'female';
    $request->requestBody->fakerStrings->street = 'Christy Dam';
    $request->requestBody->fakerStrings->timezone = 'America/Regina';
    $request->requestBody->fakerStrings->unit = 'sievert';
    $request->requestBody->fakerStrings->url = 'http://repentant-haunt.name';
    $request->requestBody->fakerStrings->username = 'Heather_Mills48';
    $request->requestBody->fakerStrings->uuid = '29e9f1c7-ed92-481f-955b-6ca1625b4c3a';
    $request->requestBody->simpleObject = new SimpleObject();
    $request->requestBody->simpleObject->any = 'wireless';
    $request->requestBody->simpleObject->bigint = 151132;
    $request->requestBody->simpleObject->bigintStr = 'Azerbaijan granular green';
    $request->requestBody->simpleObject->bool = true;
    $request->requestBody->simpleObject->boolOpt = true;
    $request->requestBody->simpleObject->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->requestBody->simpleObject->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000Z');
    $request->requestBody->simpleObject->decimal = 5070.32;
    $request->requestBody->simpleObject->enum = Enum::Two;
    $request->requestBody->simpleObject->float32 = 2.2222222;
    $request->requestBody->simpleObject->int = 999999;
    $request->requestBody->simpleObject->int32 = 1;
    $request->requestBody->simpleObject->int32Enum = SimpleObjectInt32Enum::SixtyNine;
    $request->requestBody->simpleObject->intEnum = SimpleObjectIntEnum::Second;
    $request->requestBody->simpleObject->intOptNull = 999999;
    $request->requestBody->simpleObject->num = 1.1;
    $request->requestBody->simpleObject->numOptNull = 1.1;
    $request->requestBody->simpleObject->str = 'example';
    $request->requestBody->simpleObject->strOpt = 'optional example';
    $request->bigintParameter = 351575;
    $request->bigintParameterOptional = 589897;
    $request->bigintStrParameter = 'Compatible partially';
    $request->bigintStrParameterOptional = 'navigating';
    $request->boolParameter = false;
    $request->dateParameter = DateTime::createFromFormat('Y-m-d', '2023-01-09');
    $request->dateTimeParameter = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2022-10-13T13:41:39.213Z');
    $request->decimalParameter = 9788.14;
    $request->decimalParameterOptional = 5376.2;
    $request->decimalStrParameter = 'South Erbium Pickup';
    $request->decimalStrParameterOptional = 'laudantium online Alabama';
    $request->doubleParameter = 5072.07;
    $request->enumParameter = UsageExamplePostEnumParameter::Value1;
    $request->falseyNumberParameter = 0;
    $request->float32Parameter = 9726.72;
    $request->floatParameter = 9185.57;
    $request->int64Parameter = 536301;
    $request->intParameter = 491608;
    $request->optEnumParameter = UsageExamplePostOptEnumParameter::Value3;
    $request->strParameter = 'example 2';

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

