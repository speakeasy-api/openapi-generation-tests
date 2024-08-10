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

**[?Operations\AnchorTypesGetResponse](../../Models/Operations/AnchorTypesGetResponse.md)**
### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

## arrayCircularReferenceGet

### Example Usage

```php
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

**[?Operations\ArrayCircularReferenceGetResponse](../../Models/Operations/ArrayCircularReferenceGetResponse.md)**
### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

## circularReferenceGet

### Example Usage

```php
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

**[?Operations\CircularReferenceGetResponse](../../Models/Operations/CircularReferenceGetResponse.md)**
### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

## dateParamWithDefault

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {

    $response = $sdk->generation->dateParamWithDefault(LocalDate::parse('2022-11-30'));

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

**[?Operations\DateParamWithDefaultResponse](../../Models/Operations/DateParamWithDefaultResponse.md)**
### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

## dateTimeParamWithDefault

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {

    $response = $sdk->generation->dateTimeParamWithDefault(Utils\Utils::parseDateTime('2024-02-10T14:45:50.302Z'));

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

**[?Operations\DateTimeParamWithDefaultResponse](../../Models/Operations/DateTimeParamWithDefaultResponse.md)**
### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

## decimalParamWithDefault

### Example Usage

```php
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

**[?Operations\DecimalParamWithDefaultResponse](../../Models/Operations/DecimalParamWithDefaultResponse.md)**
### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

## deprecatedFieldInSchemaPost

### Example Usage

```php
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
    ->setSecurity($security)->build();

try {
    $request = new Shared\DeprecatedFieldInObject(
        deprecatedField: '<value>',
        newField: '<value>',
    );
    $response = $sdk->generation->deprecatedFieldInSchemaPost($request);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                        | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `$request`                                                                       | [Shared\DeprecatedFieldInObject](../../Models/Shared/DeprecatedFieldInObject.md) | :heavy_check_mark:                                                               | The request object to use for the request.                                       |


### Response

**[?Operations\DeprecatedFieldInSchemaPostResponse](../../Models/Operations/DeprecatedFieldInSchemaPostResponse.md)**
### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

## deprecatedObjectInSchemaGet

### Example Usage

```php
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

**[?Operations\DeprecatedObjectInSchemaGetResponse](../../Models/Operations/DeprecatedObjectInSchemaGetResponse.md)**
### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

## ~~deprecatedOperationNoCommentsGet~~

deprecatedOperationNoCommentsGet

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```php
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

**[?Operations\DeprecatedOperationNoCommentsGetResponse](../../Models/Operations/DeprecatedOperationNoCommentsGetResponse.md)**
### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

## ~~deprecatedOperationWithCommentsGet~~

This is an endpoint setup to test deprecation with comments

> :warning: **DEPRECATED**: This operation is deprecated. Use `simplePathParameterObjects` instead.

### Example Usage

```php
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

**[?Operations\DeprecatedOperationWithCommentsGetResponse](../../Models/Operations/DeprecatedOperationWithCommentsGetResponse.md)**
### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

## emptyObjectGet

### Example Usage

```php
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
    ->setSecurity($security)->build();

try {
    $emptyObject = new Shared\EmptyObjectParam(

    );
    $response = $sdk->generation->emptyObjectGet($emptyObject);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                          | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `emptyObject`                                                      | [Shared\EmptyObjectParam](../../Models/Shared/EmptyObjectParam.md) | :heavy_check_mark:                                                 | N/A                                                                |


### Response

**[?Operations\EmptyObjectGetResponse](../../Models/Operations/EmptyObjectGetResponse.md)**
### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

## emptyResponseObjectWithCommentGet

### Example Usage

```php
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

**[?Operations\EmptyResponseObjectWithCommentGetResponse](../../Models/Operations/EmptyResponseObjectWithCommentGetResponse.md)**
### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

## globalNameOverridden

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Utils;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $request = new Shared\SimpleObject(
        any: 'any',
        bool: true,
        date: LocalDate::parse('2020-01-01'),
        dateTime: Utils\Utils::parseDateTime('2020-01-01T00:00:00.001Z'),
        enum: Shared\Enum::One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Shared\Int32Enum::OneHundredAndEightyOne,
        intEnum: Shared\IntEnum::Second,
        num: 1.1,
        str: 'test',
        bigint: 8821239038968084,
        bigintStr: '9223372036854775808',
        boolOpt: true,
        decimal: 3.141592653589793,
        decimalStr: '3.14159265358979344719667586',
        float64Str: '1.1',
        int64Str: '100',
        intOptNull: 930591,
        numOptNull: 5244.22,
        strOpt: 'testOptional',
    );
    $response = $sdk->generation->globalNameOverridden($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `$request`                                                 | [Shared\SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |


### Response

**[?Operations\GetGlobalNameOverrideResponse](../../Models/Operations/GetGlobalNameOverrideResponse.md)**
### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

## ignoredGenerationGet

### Example Usage

```php
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

**[?Operations\IgnoredGenerationGetResponse](../../Models/Operations/IgnoredGenerationGetResponse.md)**
### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

## ignoresPost

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $requestBody = new Operations\IgnoresPostRequestBody(
        callbackUrl: 'http://diligent-activist.biz',
        testProp: '<value>',
    );
    $response = $sdk->generation->ignoresPost($requestBody, '<value>');

    if ($response->httpBinSimpleJsonObject !== null) {
        // handle response
    }
} catch (Throwable $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `requestBody`                                                                          | [Operations\IgnoresPostRequestBody](../../Models/Operations/IgnoresPostRequestBody.md) | :heavy_check_mark:                                                                     | N/A                                                                                    |
| `testParam`                                                                            | *string*                                                                               | :heavy_minus_sign:                                                                     | N/A                                                                                    |


### Response

**[?Operations\IgnoresPostResponse](../../Models/Operations/IgnoresPostResponse.md)**
### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

## nameOverride

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
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

| Parameter                                                                  | Type                                                                       | Required                                                                   | Description                                                                | Example                                                                    |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `testEnumQueryParam`                                                       | [Operations\EnumNameOverride](../../Models/Operations/EnumNameOverride.md) | :heavy_check_mark:                                                         | An enum type                                                               | value3                                                                     |
| `testQueryParam`                                                           | *string*                                                                   | :heavy_check_mark:                                                         | N/A                                                                        | example                                                                    |


### Response

**[?Operations\NameOverrideGetResponse](../../Models/Operations/NameOverrideGetResponse.md)**
### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

## objectCircularReferenceGet

### Example Usage

```php
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

**[?Operations\ObjectCircularReferenceGetResponse](../../Models/Operations/ObjectCircularReferenceGetResponse.md)**
### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

## oneOfCircularReferenceGet

### Example Usage

```php
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

**[?Operations\OneOfCircularReferenceGetResponse](../../Models/Operations/OneOfCircularReferenceGetResponse.md)**
### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

## typedParameterGenerationGet

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Operations;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalHeaderParam(true)
    ->setGlobalHiddenQueryParam('hello')
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)->build();

try {
    $obj = new Operations\Obj(
        bool: false,
        num: 8792.75,
        str: '<value>',
    );
    $response = $sdk->generation->typedParameterGenerationGet(960186, LocalDate::parse('2023-01-02'), 4778.06, $obj);

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
| `bigint`                                                      | *int*                                                         | :heavy_minus_sign:                                            | N/A                                                           |
| `date`                                                        | [\DateTime](https://www.php.net/manual/en/class.datetime.php) | :heavy_minus_sign:                                            | N/A                                                           |
| `decimal`                                                     | *float*                                                       | :heavy_minus_sign:                                            | N/A                                                           |
| `obj`                                                         | [Operations\Obj](../../Models/Operations/Obj.md)              | :heavy_minus_sign:                                            | N/A                                                           |


### Response

**[?Operations\TypedParameterGenerationGetResponse](../../Models/Operations/TypedParameterGenerationGetResponse.md)**
### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |

## usageExamplePost

An operation used for testing usage examples that includes a large array of parameters and input types to ensure that all are handled correctly

Usage example docs
<https://docs.example.com>

### Example Usage

```php
declare(strict_types=1);

require 'vendor/autoload.php';

use Brick\DateTime\LocalDate;
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

try {
    $request = new Operations\UsageExamplePostRequest(
        bigintParameter: 168827,
        bigintStrParameter: '<value>',
        boolParameter: false,
        dateParameter: LocalDate::parse('2023-05-05'),
        dateTimeDefaultParameter: Utils\Utils::parseDateTime('2024-06-10T20:11:31.153Z'),
        dateTimeParameter: Utils\Utils::parseDateTime('2023-07-23T01:43:10.512Z'),
        decimalParameter: 2679.33,
        decimalStrParameter: '<value>',
        doubleParameter: 5223.72,
        enumParameter: Operations\EnumParameter::Value1,
        float32Parameter: 6946.59,
        float64StringParameter: '<value>',
        floatParameter: 2286.22,
        int64Parameter: 102975,
        int64StringParameter: '<value>',
        intParameter: 566999,
        strParameter: 'example 1',
        requestBody: new Operations\UsageExamplePostRequestBody(
            fakerFormattedStrings: new Shared\FakerFormattedStrings(
                addressFormat: '2344 Aufderhar Corner',
                directoryFormat: '/etc/defaults',
                domainFormat: 'fatal-cutting.name',
                emailFormat: 'Roberta.Kemmer77@gmail.com',
                filenameFormat: 'your_file_here',
                filepathFormat: '/var/mail/yellow.etx',
                imageFormat: 'https://loremflickr.com/640/480',
                ipv4Format: '53.97.173.153',
                ipv6Format: 'c057:a71b:b73a:c9ee:2348:d76c:3164:a258',
                jsonFormat: '{key: 72694, key1: null, key2: "<value>"}',
                macFormat: 'e7:e1:35:86:67:da',
                passwordFormat: 'iCb6eWzdveK0sHo',
                phoneFormat: '428-524-0462 x21221',
                timezoneFormat: 'Asia/Krasnoyarsk',
                unknownFormat: '<value>',
                urlFormat: 'https://prime-worry.org',
                uuidFormat: '32e0f62d-e2e2-4d47-a9bf-100f753b9b36',
                zipcodeFormat: '74736',
            ),
            fakerStrings: new Shared\FakerStrings(
                city: 'New Mabelle',
                iban: 'SM13S26700356404ZUZ86M70770',
                id: '<id>',
                iPv4: '132.133.61.11',
                iPv6: '8bb9:7902:374e:a8ee:3984:8003:011d:98d1',
                account: '96651964',
                address: '84700 Emelia Street',
                amount: '626.85',
                avatar: 'https://loremflickr.com/640/480',
                color: 'turquoise',
                comment: 'The Apollotech B340 is an affordable wireless mouse with reliable connectivity, 12 months battery life and modern design',
                company: 'Leuschke Inc',
                country: 'Kazakhstan',
                countryCode: 'AG',
                currency: 'Won',
                datatype: 'timestamp',
                default: '<value>',
                description: 'Up-sized explicit frame',
                directory: '/home',
                domainName: 'warmhearted-buying.biz',
                emailAddr: 'Beulah.Franecki24@gmail.com',
                extension: 'pdf',
                filename: 'your_file_here',
                filepath: '/net/aluminium_complex_powerfully.less',
                filetype: 'application',
                firstName: 'Geovany',
                fullName: 'Roy Gottlieb',
                gender: 'Cis',
                job: 'International Metrics Administrator',
                json: '{key: 91937, key1: null, key2: "<value>"}',
                key: '<key>',
                lastName: 'Bergnaum',
                latitude: '16.9358',
                locale: 'ar',
                longitude: '-80.3158',
                mac: '55:a8:ca:17:df:8f',
                manufacturer: 'Smart',
                material: 'Metal',
                middleName: 'Greer',
                model: 'Fortwo',
                password: '8AXYBy71wIwgEZJ',
                phone: '1-960-553-5269 x5671',
                pin: '2662',
                postalCode: '70476',
                price: '100.00',
                product: 'Awesome Fresh Table',
                sex: 'female',
                street: 'Penelope Terrace',
                timezone: 'Australia/Hobart',
                unit: 'degree Celsius',
                url: 'http://absolute-barbecue.org',
                username: 'Casimer17',
                uuid: '1b7b6969-fc72-49e9-b1c7-ed9281fd55b6',
            ),
            simpleObject: new Shared\SimpleObject(
                any: 'any',
                bool: true,
                date: LocalDate::parse('2020-01-01'),
                dateTime: Utils\Utils::parseDateTime('2020-01-01T00:00:00.001Z'),
                enum: Shared\Enum::One,
                float32: 1.1,
                int: 1,
                int32: 1,
                int32Enum: Shared\Int32Enum::OneHundredAndEightyOne,
                intEnum: Shared\IntEnum::Second,
                num: 1.1,
                str: 'test',
                bigint: 8821239038968084,
                bigintStr: '9223372036854775808',
                boolOpt: true,
                decimal: 3.141592653589793,
                decimalStr: '3.14159265358979344719667586',
                float64Str: '1.1',
                int64Str: '100',
                intOptNull: 69000,
                numOptNull: 4369.7,
                strOpt: 'testOptional',
            ),
        ),
        bigintParameterOptional: 125022,
        bigintStrParameterOptional: '<value>',
        decimalParameterOptional: 3232.41,
        decimalStrParameterOptional: '<value>',
        optEnumParameter: Operations\OptEnumParameter::Value3,
    );
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

| Parameter                                                                                  | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `$request`                                                                                 | [Operations\UsageExamplePostRequest](../../Models/Operations/UsageExamplePostRequest.md)   | :heavy_check_mark:                                                                         | The request object to use for the request.                                                 |
| `security`                                                                                 | [Operations\UsageExamplePostSecurity](../../Models/Operations/UsageExamplePostSecurity.md) | :heavy_check_mark:                                                                         | The security requirements to use for the request.                                          |


### Response

**[?Operations\UsageExamplePostResponse](../../Models/Operations/UsageExamplePostResponse.md)**
### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| OpenAPI\OpenAPI\Models\Errors.SDKException | 4xx-5xx                                    | */*                                        |
