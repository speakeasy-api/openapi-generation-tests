# Generation


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

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $response = $sdk->generation->anchorTypesGet();

    if ($response->typeFromAnchor !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\AnchorTypesGetResponse](../../Models/Operations/AnchorTypesGetResponse.md)**


## arrayCircularReferenceGet

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $response = $sdk->generation->arrayCircularReferenceGet();

    if ($response->arrayCircularReferenceObject !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\ArrayCircularReferenceGetResponse](../../Models/Operations/ArrayCircularReferenceGetResponse.md)**


## circularReferenceGet

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $response = $sdk->generation->circularReferenceGet();

    if ($response->validCircularReferenceObject !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\CircularReferenceGetResponse](../../Models/Operations/CircularReferenceGetResponse.md)**


## dateParamWithDefault

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    

    $response = $sdk->generation->dateParamWithDefault(DateTime::createFromFormat('Y-m-d', '2022-11-30'));

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `dateInput`                                                   | [\DateTime](https://www.php.net/manual/en/class.datetime.php) | :heavy_check_mark:                                            | A date parameter with a default value                         |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\DateParamWithDefaultResponse](../../Models/Operations/DateParamWithDefaultResponse.md)**


## dateTimeParamWithDefault

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    

    $response = $sdk->generation->dateTimeParamWithDefault(DateTime::createFromFormat('Y-m-d\TH:i:s+', '2024-02-10T14:45:50.302Z'));

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `dateTimeInput`                                               | [\DateTime](https://www.php.net/manual/en/class.datetime.php) | :heavy_check_mark:                                            | A date time parameter with a default value                    |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\DateTimeParamWithDefaultResponse](../../Models/Operations/DateTimeParamWithDefaultResponse.md)**


## decimalParamWithDefault

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    

    $response = $sdk->generation->decimalParamWithDefault(4060.06);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `decimalInput`                           | *float*                                  | :heavy_check_mark:                       | A decimal parameter with a default value |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\DecimalParamWithDefaultResponse](../../Models/Operations/DecimalParamWithDefaultResponse.md)**


## deprecatedFieldInSchemaPost

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
        $request = new Shared\DeprecatedFieldInObject();
    $request->deprecatedField = '<value>';
    $request->newField = '<value>';;

    $response = $sdk->generation->deprecatedFieldInSchemaPost($request);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                               | [\OpenAPI\OpenAPI\Models\Shared\DeprecatedFieldInObject](../../Models/Shared/DeprecatedFieldInObject.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\DeprecatedFieldInSchemaPostResponse](../../Models/Operations/DeprecatedFieldInSchemaPostResponse.md)**


## deprecatedObjectInSchemaGet

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $response = $sdk->generation->deprecatedObjectInSchemaGet();

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\DeprecatedObjectInSchemaGetResponse](../../Models/Operations/DeprecatedObjectInSchemaGetResponse.md)**


## ~~deprecatedOperationNoCommentsGet~~

deprecatedOperationNoCommentsGet

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    

    $response = $sdk->generation->deprecatedOperationNoCommentsGet('<value>');

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `deprecatedParameter`                                                                                                   | *string*                                                                                                                | :heavy_minus_sign:                                                                                                      | : warning: ** DEPRECATED **: This will be removed in a future release, please migrate away from it as soon as possible. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\DeprecatedOperationNoCommentsGetResponse](../../Models/Operations/DeprecatedOperationNoCommentsGetResponse.md)**


## ~~deprecatedOperationWithCommentsGet~~

This is an endpoint setup to test deprecation with comments

> :warning: **DEPRECATED**: This operation is deprecated. Use `simplePathParameterObjects` instead.

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    

    $response = $sdk->generation->deprecatedOperationWithCommentsGet('<value>', '<value>');

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `deprecatedParameter`                                                                                            | *string*                                                                                                         | :heavy_minus_sign:                                                                                               | : warning: ** DEPRECATED **: This parameter is deprecated. Use newParameter instead.<br/><br/>This is a string parameter |
| `newParameter`                                                                                                   | *string*                                                                                                         | :heavy_minus_sign:                                                                                               | This is a string parameter                                                                                       |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\DeprecatedOperationWithCommentsGetResponse](../../Models/Operations/DeprecatedOperationWithCommentsGetResponse.md)**


## emptyObjectGet

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
        $emptyObject = new Shared\EmptyObjectParam();

    $response = $sdk->generation->emptyObjectGet($emptyObject);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                  | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `emptyObject`                                                                              | [\OpenAPI\OpenAPI\Models\Shared\EmptyObjectParam](../../Models/Shared/EmptyObjectParam.md) | :heavy_check_mark:                                                                         | N/A                                                                                        |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\EmptyObjectGetResponse](../../Models/Operations/EmptyObjectGetResponse.md)**


## emptyResponseObjectWithCommentGet

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $response = $sdk->generation->emptyResponseObjectWithCommentGet();

    if ($response->body !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\EmptyResponseObjectWithCommentGetResponse](../../Models/Operations/EmptyResponseObjectWithCommentGetResponse.md)**


## globalNameOverridden

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
        $request = new Shared\SimpleObject();
    $request->any = 'any';
    $request->bigint = 8821239038968084;
    $request->bigintStr = '9223372036854775808';
    $request->bool = true;
    $request->boolOpt = true;
    $request->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000001Z');
    $request->decimal = 3.141592653589793;
    $request->decimalStr = '3.14159265358979344719667586';
    $request->enum = Shared\Enum::One;
    $request->float32 = 1.1;
    $request->int = 1;
    $request->int32 = 1;
    $request->int32Enum = Shared\Int32Enum::OneHundredAndEightyOne;
    $request->intEnum = Shared\IntEnum::Second;
    $request->intOptNull = 930591;
    $request->num = 1.1;
    $request->numOptNull = 5244.22;
    $request->str = 'test';
    $request->strOpt = 'testOptional';;

    $response = $sdk->generation->globalNameOverridden($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `$request`                                                                         | [\OpenAPI\OpenAPI\Models\Shared\SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\GetGlobalNameOverrideResponse](../../Models/Operations/GetGlobalNameOverrideResponse.md)**


## ignoredGenerationGet

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $response = $sdk->generation->ignoredGenerationGet();

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\IgnoredGenerationGetResponse](../../Models/Operations/IgnoredGenerationGetResponse.md)**


## ignoresPost

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
        $requestBody = new Operations\IgnoresPostRequestBody();
    $requestBody->callbackUrl = 'http://diligent-activist.biz';
    $requestBody->testProp = '<value>';

    $response = $sdk->generation->ignoresPost($requestBody, '<value>');

    if ($response->httpBinSimpleJsonObject !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                  | [\OpenAPI\OpenAPI\Models\Operations\IgnoresPostRequestBody](../../Models/Operations/IgnoresPostRequestBody.md) | :heavy_check_mark:                                                                                             | N/A                                                                                                            |
| `testParam`                                                                                                    | *string*                                                                                                       | :heavy_minus_sign:                                                                                             | N/A                                                                                                            |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\IgnoresPostResponse](../../Models/Operations/IgnoresPostResponse.md)**


## nameOverride

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    

    $response = $sdk->generation->nameOverride(Operations\EnumNameOverride::Value3, 'example');

    if ($response->overriddenResponse !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        | Example                                                                                            |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `testEnumQueryParam`                                                                               | [\OpenAPI\OpenAPI\Models\Operations\EnumNameOverride](../../Models/Operations/EnumNameOverride.md) | :heavy_check_mark:                                                                                 | An enum type                                                                                       | value3                                                                                             |
| `testQueryParam`                                                                                   | *string*                                                                                           | :heavy_check_mark:                                                                                 | N/A                                                                                                | example                                                                                            |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\NameOverrideGetResponse](../../Models/Operations/NameOverrideGetResponse.md)**


## objectCircularReferenceGet

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $response = $sdk->generation->objectCircularReferenceGet();

    if ($response->objectCircularReferenceObject !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\ObjectCircularReferenceGetResponse](../../Models/Operations/ObjectCircularReferenceGetResponse.md)**


## oneOfCircularReferenceGet

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $response = $sdk->generation->oneOfCircularReferenceGet();

    if ($response->oneOfCircularReferenceObject !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\OneOfCircularReferenceGetResponse](../../Models/Operations/OneOfCircularReferenceGetResponse.md)**


## typedParameterGenerationGet

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
        $obj = new Operations\Obj();
    $obj->bool = false;
    $obj->num = 8792.75;
    $obj->str = '<value>';

    $response = $sdk->generation->typedParameterGenerationGet(960186, DateTime::createFromFormat('Y-m-d', '2023-01-02'), 4778.06, $obj);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `bigint`                                                                 | *int*                                                                    | :heavy_minus_sign:                                                       | N/A                                                                      |
| `date`                                                                   | [\DateTime](https://www.php.net/manual/en/class.datetime.php)            | :heavy_minus_sign:                                                       | N/A                                                                      |
| `decimal`                                                                | *float*                                                                  | :heavy_minus_sign:                                                       | N/A                                                                      |
| `obj`                                                                    | [\OpenAPI\OpenAPI\Models\Operations\Obj](../../Models/Operations/Obj.md) | :heavy_minus_sign:                                                       | N/A                                                                      |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\TypedParameterGenerationGetResponse](../../Models/Operations/TypedParameterGenerationGetResponse.md)**


## usageExamplePost

An operation used for testing usage examples that includes a large array of parameters and input types to ensure that all are handled correctly

Usage example docs
<https://docs.example.com>

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
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
    $request->requestBody->fakerFormattedStrings->filenameFormat = 'northeast.wav';
    $request->requestBody->fakerFormattedStrings->filepathFormat = '/lib/pizza_integrated.hbs';
    $request->requestBody->fakerFormattedStrings->imageFormat = 'https://loremflickr.com/640/480';
    $request->requestBody->fakerFormattedStrings->ipv4Format = '75.42.25.241';
    $request->requestBody->fakerFormattedStrings->ipv6Format = '36a9:c057:a71b:b73a:c9ee:2348:d76c:3164';
    $request->requestBody->fakerFormattedStrings->jsonFormat = '{key: 66681, key1: null, key2: "<value>"}';
    $request->requestBody->fakerFormattedStrings->macFormat = '25:8b:e7:e1:35:86';
    $request->requestBody->fakerFormattedStrings->passwordFormat = 'IKpiCb6eWzdveK0';
    $request->requestBody->fakerFormattedStrings->phoneFormat = '1-803-587-3283';
    $request->requestBody->fakerFormattedStrings->timezoneFormat = 'America/Argentina/Buenos_Aires';
    $request->requestBody->fakerFormattedStrings->unknownFormat = '<value>';
    $request->requestBody->fakerFormattedStrings->urlFormat = 'http://beneficial-inconvenience.net';
    $request->requestBody->fakerFormattedStrings->uuidFormat = '342442b8-aff3-42e0-b62d-e2e2d47a9bf1';
    $request->requestBody->fakerFormattedStrings->zipcodeFormat = '09432';
    $request->requestBody->fakerStrings = new Shared\FakerStrings();
    $request->requestBody->fakerStrings->city = 'McLaughlinchester';
    $request->requestBody->fakerStrings->iban = 'TL232743267267003560099';
    $request->requestBody->fakerStrings->id = '<id>';
    $request->requestBody->fakerStrings->iPv4 = '208.201.244.247';
    $request->requestBody->fakerStrings->iPv6 = 'bd3a:d72b:208b:2c81:8830:8bb9:7902:374e';
    $request->requestBody->fakerStrings->account = '65982652';
    $request->requestBody->fakerStrings->address = '0010 Assunta Throughway';
    $request->requestBody->fakerStrings->amount = '616.94';
    $request->requestBody->fakerStrings->avatar = 'https://loremflickr.com/640/480';
    $request->requestBody->fakerStrings->color = 'tan';
    $request->requestBody->fakerStrings->comment = 'New range of formal shirts are designed keeping you in mind. With fits and styling that will make you stand apart';
    $request->requestBody->fakerStrings->company = 'Volkman LLC';
    $request->requestBody->fakerStrings->country = 'Nicaragua';
    $request->requestBody->fakerStrings->countryCode = 'MO';
    $request->requestBody->fakerStrings->currency = 'Canadian Dollar';
    $request->requestBody->fakerStrings->datatype = 'point';
    $request->requestBody->fakerStrings->default = '<value>';
    $request->requestBody->fakerStrings->description = 'Quality-focused full-range circuit';
    $request->requestBody->fakerStrings->directory = '/usr/ports';
    $request->requestBody->fakerStrings->domainName = 'klutzy-prostacyclin.com';
    $request->requestBody->fakerStrings->emailAddr = 'Jalyn_Haley47@gmail.com';
    $request->requestBody->fakerStrings->extension = 'png';
    $request->requestBody->fakerStrings->filename = 'panel.jpeg';
    $request->requestBody->fakerStrings->filepath = '/opt/share/yahoo.xul';
    $request->requestBody->fakerStrings->filetype = 'video';
    $request->requestBody->fakerStrings->firstName = 'Trystan';
    $request->requestBody->fakerStrings->fullName = 'Mrs. Lillian Bode';
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
    $request->requestBody->simpleObject->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000001Z');
    $request->requestBody->simpleObject->decimal = 3.141592653589793;
    $request->requestBody->simpleObject->decimalStr = '3.14159265358979344719667586';
    $request->requestBody->simpleObject->enum = Shared\Enum::One;
    $request->requestBody->simpleObject->float32 = 1.1;
    $request->requestBody->simpleObject->int = 1;
    $request->requestBody->simpleObject->int32 = 1;
    $request->requestBody->simpleObject->int32Enum = Shared\Int32Enum::OneHundredAndEightyOne;
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
    $request->dateTimeDefaultParameter = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2022-03-16T03:03:06.071Z');
    $request->dateTimeParameter = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2024-05-24T02:10:19.731Z');
    $request->decimalParameter = 4713.96;
    $request->decimalParameterOptional = 9349.54;
    $request->decimalStrParameter = '<value>';
    $request->decimalStrParameterOptional = '<value>';
    $request->doubleParameter = 8700.78;
    $request->enumParameter = Operations\EnumParameter::Value2;
    $request->falseyNumberParameter = 0;
    $request->float32Parameter = 1341.86;
    $request->floatParameter = 5429.24;
    $request->int64Parameter = 101970;
    $request->intParameter = 938852;
    $request->optEnumParameter = Operations\OptEnumParameter::Value3;
    $request->strParameter = 'example 3';;

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

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `$request`                                                                                                         | [\OpenAPI\OpenAPI\Models\Operations\UsageExamplePostRequest](../../Models/Operations/UsageExamplePostRequest.md)   | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |
| `security`                                                                                                         | [\OpenAPI\OpenAPI\Models\Operations\UsageExamplePostSecurity](../../Models/Operations/UsageExamplePostSecurity.md) | :heavy_check_mark:                                                                                                 | The security requirements to use for the request.                                                                  |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\UsageExamplePostResponse](../../Models/Operations/UsageExamplePostResponse.md)**

