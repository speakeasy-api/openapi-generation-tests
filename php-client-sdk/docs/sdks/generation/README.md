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

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenHeaderParam('<value>')
    ->setGlobalHiddenPathParam('<value>')
    ->setGlobalHiddenQueryParam('hello')
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

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenHeaderParam('<value>')
    ->setGlobalHiddenPathParam('<value>')
    ->setGlobalHiddenQueryParam('hello')
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

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenHeaderParam('<value>')
    ->setGlobalHiddenPathParam('<value>')
    ->setGlobalHiddenQueryParam('hello')
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

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenHeaderParam('<value>')
    ->setGlobalHiddenPathParam('<value>')
    ->setGlobalHiddenQueryParam('hello')
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

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenHeaderParam('<value>')
    ->setGlobalHiddenPathParam('<value>')
    ->setGlobalHiddenQueryParam('hello')
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

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenHeaderParam('<value>')
    ->setGlobalHiddenPathParam('<value>')
    ->setGlobalHiddenQueryParam('hello')
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

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenHeaderParam('<value>')
    ->setGlobalHiddenPathParam('<value>')
    ->setGlobalHiddenQueryParam('hello')
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

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenHeaderParam('<value>')
    ->setGlobalHiddenPathParam('<value>')
    ->setGlobalHiddenQueryParam('hello')
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

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenHeaderParam('<value>')
    ->setGlobalHiddenPathParam('<value>')
    ->setGlobalHiddenQueryParam('hello')
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

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenHeaderParam('<value>')
    ->setGlobalHiddenPathParam('<value>')
    ->setGlobalHiddenQueryParam('hello')
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

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenHeaderParam('<value>')
    ->setGlobalHiddenPathParam('<value>')
    ->setGlobalHiddenQueryParam('hello')
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

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenHeaderParam('<value>')
    ->setGlobalHiddenPathParam('<value>')
    ->setGlobalHiddenQueryParam('hello')
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

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenHeaderParam('<value>')
    ->setGlobalHiddenPathParam('<value>')
    ->setGlobalHiddenQueryParam('hello')
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

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenHeaderParam('<value>')
    ->setGlobalHiddenPathParam('<value>')
    ->setGlobalHiddenQueryParam('hello')
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

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenHeaderParam('<value>')
    ->setGlobalHiddenPathParam('<value>')
    ->setGlobalHiddenQueryParam('hello')
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

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenHeaderParam('<value>')
    ->setGlobalHiddenPathParam('<value>')
    ->setGlobalHiddenQueryParam('hello')
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

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenHeaderParam('<value>')
    ->setGlobalHiddenPathParam('<value>')
    ->setGlobalHiddenQueryParam('hello')
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

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenHeaderParam('<value>')
    ->setGlobalHiddenPathParam('<value>')
    ->setGlobalHiddenQueryParam('hello')
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

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenHeaderParam('<value>')
    ->setGlobalHiddenPathParam('<value>')
    ->setGlobalHiddenQueryParam('hello')
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

require 'vendor/autoload.php';

use \OpenAPI\OpenAPI;
use \OpenAPI\OpenAPI\Models\Shared;
use \OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenHeaderParam('<value>')
    ->setGlobalHiddenPathParam('<value>')
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
    $request->requestBody->fakerFormattedStrings->ipv6Format = 'e4ce:421f:36a9:c057:a71b:b73a:c9ee:2348';
    $request->requestBody->fakerFormattedStrings->jsonFormat = '{key: 86008, key1: null, key2: "<value>"}';
    $request->requestBody->fakerFormattedStrings->macFormat = '76:c3:16:4a:25:8b';
    $request->requestBody->fakerFormattedStrings->passwordFormat = 'zMy5BUDIKpiCb6e';
    $request->requestBody->fakerFormattedStrings->phoneFormat = '(917) 974-0191 x1803';
    $request->requestBody->fakerFormattedStrings->timezoneFormat = 'Europe/Berlin';
    $request->requestBody->fakerFormattedStrings->unknownFormat = '<value>';
    $request->requestBody->fakerFormattedStrings->urlFormat = 'https://spectacular-footage.biz';
    $request->requestBody->fakerFormattedStrings->uuidFormat = 'd63717a3-4244-42b8-aff3-2e0f62de2e2d';
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
    $request->requestBody->fakerStrings->comment = 'Carbonite web goalkeeper gloves are ergonomically designed to give easy fit';
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
    $request->requestBody->simpleObject->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.001Z');
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
    $request->float64StringParameter = '<value>';
    $request->floatParameter = 5429.24;
    $request->int64Parameter = 101970;
    $request->int64StringParameter = '<value>';
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

