# Generation
(*generation*)

## Overview

Endpoints for purely testing valid generation behavior.

### Available Operations

* [anchorTypesGet](#anchortypesget)
* [arrayCircularReferenceGet](#arraycircularreferenceget)
* [circularReferenceGet](#circularreferenceget)
* [dateParamWithDefault](#dateparamwithdefault)
* [dateTimeParamWithDefault](#datetimeparamwithdefault)
* [decimalParamWithDefault](#decimalparamwithdefault)
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

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
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

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
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

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
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


## dateParamWithDefault

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\DateParamWithDefaultRequest;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {


    $response = $sdk->generation->dateParamWithDefault(DateTime::createFromFormat('Y-m-d', '2021-11-30'));

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `dateInput`                                                   | [\DateTime](https://www.php.net/manual/en/class.datetime.php) | :heavy_check_mark:                                            | A date parameter with a default value                         |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\DateParamWithDefaultResponse](../../models/operations/DateParamWithDefaultResponse.md)**


## dateTimeParamWithDefault

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\DateTimeParamWithDefaultRequest;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {


    $response = $sdk->generation->dateTimeParamWithDefault(DateTime::createFromFormat('Y-m-d\TH:i:s+', '2023-02-09T21:53:21.077Z'));

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `dateTimeInput`                                               | [\DateTime](https://www.php.net/manual/en/class.datetime.php) | :heavy_check_mark:                                            | A date time parameter with a default value                    |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\DateTimeParamWithDefaultResponse](../../models/operations/DateTimeParamWithDefaultResponse.md)**


## decimalParamWithDefault

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\DecimalParamWithDefaultRequest;

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {


    $response = $sdk->generation->decimalParamWithDefault(4060.06);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `decimalInput`                           | *float*                                  | :heavy_check_mark:                       | A decimal parameter with a default value |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\DecimalParamWithDefaultResponse](../../models/operations/DecimalParamWithDefaultResponse.md)**


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

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {
    $request = new DeprecatedFieldInObject();
    $request->deprecatedField = 'Savings';
    $request->newField = 'Avon';

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

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
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

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
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
| `deprecatedParameter`                                                                                                   | *string*                                                                                                                | :heavy_minus_sign:                                                                                                      | : warning: ** DEPRECATED **: This will be removed in a future release, please migrate away from it as soon as possible. |


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

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
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
| `deprecatedParameter`                                                                                            | *string*                                                                                                         | :heavy_minus_sign:                                                                                               | : warning: ** DEPRECATED **: This parameter is deprecated. Use newParameter instead.<br/><br/>This is a string parameter |
| `newParameter`                                                                                                   | *string*                                                                                                         | :heavy_minus_sign:                                                                                               | This is a string parameter                                                                                       |


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

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
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

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
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

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
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

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
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

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {
    $requestBody = new IgnoresPostApplicationJSON();
    $requestBody->callbackUrl = 'http://diligent-activist.biz';
    $requestBody->testProp = 'volt';

    $response = $sdk->generation->ignoresPost($requestBody, 'ceiling');

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
| `testParam`                                                                                                            | *string*                                                                                                               | :heavy_minus_sign:                                                                                                     | N/A                                                                                                                    |


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

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
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

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
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

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
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

$security = new Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = SDK::builder()
    ->setSecurity($security)
    ->build();

try {
    $obj = new TypedParameterGenerationGetObj();
    $obj->bool = false;
    $obj->num = 8792.75;
    $obj->str = 'beyond';

    $response = $sdk->generation->typedParameterGenerationGet(477806, DateTime::createFromFormat('Y-m-d', '2023-09-07'), 3488.83, $obj);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `bigint`                                                                                                                       | *int*                                                                                                                          | :heavy_minus_sign:                                                                                                             | N/A                                                                                                                            |
| `date`                                                                                                                         | [\DateTime](https://www.php.net/manual/en/class.datetime.php)                                                                  | :heavy_minus_sign:                                                                                                             | N/A                                                                                                                            |
| `decimal`                                                                                                                      | *float*                                                                                                                        | :heavy_minus_sign:                                                                                                             | N/A                                                                                                                            |
| `obj`                                                                                                                          | [\OpenAPI\OpenAPI\Models\Operations\TypedParameterGenerationGetObj](../../models/operations/TypedParameterGenerationGetObj.md) | :heavy_minus_sign:                                                                                                             | N/A                                                                                                                            |


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
    $request->requestBody->fakerFormattedStrings->jsonFormat = '{plane: 14910, fringe: null, lightning: "Roentgenium"}';
    $request->requestBody->fakerFormattedStrings->macFormat = '7e:13:58:66:7d:ac';
    $request->requestBody->fakerFormattedStrings->passwordFormat = 'Cb6eWzdveK0sHok';
    $request->requestBody->fakerFormattedStrings->phoneFormat = '(483) 340-4622 x122';
    $request->requestBody->fakerFormattedStrings->timezoneFormat = 'America/Bogota';
    $request->requestBody->fakerFormattedStrings->unknownFormat = 'ohm';
    $request->requestBody->fakerFormattedStrings->urlFormat = 'https://wrong-waterfall.biz';
    $request->requestBody->fakerFormattedStrings->uuidFormat = '2e0f62de-2e2d-447a-9bf1-00f753b9b364';
    $request->requestBody->fakerFormattedStrings->zipcodeFormat = '47362-5687';
    $request->requestBody->fakerStrings = new FakerStrings();
    $request->requestBody->fakerStrings->city = 'Dooleychester';
    $request->requestBody->fakerStrings->iban = 'MT77KUEY0057604ZUZ86M7077050756';
    $request->requestBody->fakerStrings->id = '<ID>';
    $request->requestBody->fakerStrings->iPv4 = '4.40.62.119';
    $request->requestBody->fakerStrings->iPv6 = '4ea8:ee39:8480:0301:1d98:d1ea:a92f:b62d';
    $request->requestBody->fakerStrings->account = '47004386';
    $request->requestBody->fakerStrings->address = '3251 Adriel Knoll';
    $request->requestBody->fakerStrings->amount = '298.18';
    $request->requestBody->fakerStrings->avatar = 'https://loremflickr.com/640/480';
    $request->requestBody->fakerStrings->color = 'azure';
    $request->requestBody->fakerStrings->comment = 'The Apollotech B340 is an affordable wireless mouse with reliable connectivity, 12 months battery life and modern design';
    $request->requestBody->fakerStrings->company = 'Dickinson - Weissnat';
    $request->requestBody->fakerStrings->country = 'Brazil';
    $request->requestBody->fakerStrings->countryCode = 'CO';
    $request->requestBody->fakerStrings->currency = 'Bulgarian Lev';
    $request->requestBody->fakerStrings->datatype = 'text';
    $request->requestBody->fakerStrings->default = 'Fresh';
    $request->requestBody->fakerStrings->description = 'Balanced dedicated ability';
    $request->requestBody->fakerStrings->directory = '/net';
    $request->requestBody->fakerStrings->domainName = 'weepy-recovery.com';
    $request->requestBody->fakerStrings->emailAddr = 'Brett_Towne@hotmail.com';
    $request->requestBody->fakerStrings->extension = 'htm';
    $request->requestBody->fakerStrings->filename = 'indiana_ramp.png';
    $request->requestBody->fakerStrings->filepath = '/var/log/rock.gslides';
    $request->requestBody->fakerStrings->filetype = 'audio';
    $request->requestBody->fakerStrings->firstName = 'Frederic';
    $request->requestBody->fakerStrings->fullName = 'Max Runte IV';
    $request->requestBody->fakerStrings->gender = 'Transexual woman';
    $request->requestBody->fakerStrings->job = 'Principal Infrastructure Representative';
    $request->requestBody->fakerStrings->json = '{statement: 68965, garbage: null, typhoon: "athwart"}';
    $request->requestBody->fakerStrings->key = '<key>';
    $request->requestBody->fakerStrings->lastName = 'Hegmann';
    $request->requestBody->fakerStrings->latitude = '15.1955';
    $request->requestBody->fakerStrings->locale = 'it';
    $request->requestBody->fakerStrings->longitude = '-177.1763';
    $request->requestBody->fakerStrings->mac = '5a:e5:03:a2:2a:e6';
    $request->requestBody->fakerStrings->manufacturer = 'Toyota';
    $request->requestBody->fakerStrings->material = 'Metal';
    $request->requestBody->fakerStrings->middleName = 'Greer';
    $request->requestBody->fakerStrings->model = 'Camry';
    $request->requestBody->fakerStrings->password = 'JMTCRYg4iGgZYqI';
    $request->requestBody->fakerStrings->phone = '(278) 964-0091 x311';
    $request->requestBody->fakerStrings->pin = '0746';
    $request->requestBody->fakerStrings->postalCode = '54698';
    $request->requestBody->fakerStrings->price = '482.00';
    $request->requestBody->fakerStrings->product = 'Rustic Rubber Sausages';
    $request->requestBody->fakerStrings->sex = 'male';
    $request->requestBody->fakerStrings->street = 'Bergstrom Spring';
    $request->requestBody->fakerStrings->timezone = 'Europe/Helsinki';
    $request->requestBody->fakerStrings->unit = 'lux';
    $request->requestBody->fakerStrings->url = 'https://oily-carter.name';
    $request->requestBody->fakerStrings->username = 'Bart.Weimann35';
    $request->requestBody->fakerStrings->uuid = 'b6ca1625-b4c3-4a7a-ad00-4523e8655955';
    $request->requestBody->simpleObject = new SimpleObject();
    $request->requestBody->simpleObject->any = 'any';
    $request->requestBody->simpleObject->bigint = 8821239038968084;
    $request->requestBody->simpleObject->bigintStr = '9223372036854775808';
    $request->requestBody->simpleObject->bool = true;
    $request->requestBody->simpleObject->boolOpt = true;
    $request->requestBody->simpleObject->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->requestBody->simpleObject->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000000001Z');
    $request->requestBody->simpleObject->decimal = 3.141592653589793;
    $request->requestBody->simpleObject->decimalStr = '3.14159265358979344719667586';
    $request->requestBody->simpleObject->enum = Enum::One;
    $request->requestBody->simpleObject->float32 = 1.1;
    $request->requestBody->simpleObject->int = 1;
    $request->requestBody->simpleObject->int32 = 1;
    $request->requestBody->simpleObject->int32Enum = SimpleObjectInt32Enum::FiftyFive;
    $request->requestBody->simpleObject->intEnum = SimpleObjectIntEnum::Third;
    $request->requestBody->simpleObject->intOptNull = 570514;
    $request->requestBody->simpleObject->num = 1.1;
    $request->requestBody->simpleObject->numOptNull = 2212.33;
    $request->requestBody->simpleObject->str = 'test';
    $request->requestBody->simpleObject->strOpt = 'testOptional';
    $request->bigintParameter = 509152;
    $request->bigintParameterOptional = 424381;
    $request->bigintStrParameter = 'Designer';
    $request->bigintStrParameterOptional = 'South';
    $request->boolParameter = false;
    $request->dateParameter = DateTime::createFromFormat('Y-m-d', '2023-03-02');
    $request->dateTimeDefaultParameter = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2022-09-15T23:11:22.583Z');
    $request->dateTimeParameter = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2023-07-13T04:24:57.190Z');
    $request->decimalParameter = 3767.71;
    $request->decimalParameterOptional = 7335.06;
    $request->decimalStrParameter = 'painfully';
    $request->decimalStrParameterOptional = 'indexing';
    $request->doubleParameter = 4605.71;
    $request->enumParameter = UsageExamplePostEnumParameter::Value1;
    $request->falseyNumberParameter = 0;
    $request->float32Parameter = 53.92;
    $request->floatParameter = 5072.07;
    $request->int64Parameter = 205671;
    $request->intParameter = 972672;
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

