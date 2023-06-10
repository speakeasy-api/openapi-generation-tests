# generation

## Overview

Endpoints for purely testing valid generation behavior.

### Available Operations

* [anchorTypesGet](#anchortypesget)
* [circularReferenceGet](#circularreferenceget)
* [~~deprecatedNoCommentsGet~~](#deprecatednocommentsget) - deprecatedNoCommentsGet :warning: **Deprecated**
* [~~deprecatedWithCommentsGet~~](#deprecatedwithcommentsget) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** - Use `simplePathParameterObjects` instead.
* [globalNameOverridden](#globalnameoverridden)
* [ignoredGenerationGet](#ignoredgenerationget)
* [ignoresPost](#ignorespost)
* [nameOverride](#nameoverride)
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


## ~~deprecatedNoCommentsGet~~

deprecatedNoCommentsGet

> :warning: **DEPRECATED**: this method will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\DeprecatedNoCommentsGetRequest;

$sdk = SDK::builder()
    ->build();

try {


    $response = $sdk->generation->deprecatedNoCommentsGet('debitis');

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `deprecatedParameter`                                                                                                | *?string*                                                                                                            | :heavy_minus_sign:                                                                                                   | :warning: **DEPRECATED**: this will be removed in a future release, please migrate away from it as soon as possible. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\DeprecatedNoCommentsGetResponse](../../models/operations/DeprecatedNoCommentsGetResponse.md)**


## ~~deprecatedWithCommentsGet~~

This is an endpoint setup to test deprecation with comments

> :warning: **DEPRECATED**: this method will be removed in a future release, please migrate away from it as soon as possible. Use `simplePathParameterObjects` instead.

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\DeprecatedWithCommentsGetRequest;

$sdk = SDK::builder()
    ->build();

try {


    $response = $sdk->generation->deprecatedWithCommentsGet('a', 'dolorum');

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                                                                                   | Type                                                                                                                                                                        | Required                                                                                                                                                                    | Description                                                                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `deprecatedParameter`                                                                                                                                                       | *?string*                                                                                                                                                                   | :heavy_minus_sign:                                                                                                                                                          | :warning: **DEPRECATED**: this will be removed in a future release, please migrate away from it as soon as possible.Use `newParameter` instead.<br/><br/>This is a string parameter |
| `newParameter`                                                                                                                                                              | *?string*                                                                                                                                                                   | :heavy_minus_sign:                                                                                                                                                          | This is a string parameter                                                                                                                                                  |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\DeprecatedWithCommentsGetResponse](../../models/operations/DeprecatedWithCommentsGetResponse.md)**


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
    $requestBody->callbackUrl = 'http://irritating-standardisation.org';
    $requestBody->testProp = 'rerum';

    $response = $sdk->generation->ignoresPost($requestBody, 'dicta');

    if ($response->httpBinSimpleJsonObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                           | [?\OpenAPI\OpenAPI\Models\Operations\IgnoresPostApplicationJSON](../../models/operations/IgnoresPostApplicationJSON.md) | :heavy_minus_sign:                                                                                                      | N/A                                                                                                                     |
| `testParam`                                                                                                             | *?string*                                                                                                               | :heavy_minus_sign:                                                                                                      | N/A                                                                                                                     |


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

$sdk = SDK::builder()
    ->build();

try {


    $response = $sdk->generation->nameOverride('example');

    if ($response->overriddenResponse !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `testQueryParam`   | *string*           | :heavy_check_mark: | N/A                | example            |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\NameOverrideGetResponse](../../models/operations/NameOverrideGetResponse.md)**


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
    $request->requestBody->email = 'Obie.Schulist@gmail.com';
    $request->requestBody->formatEmail = 'Shaniya.Friesen@hotmail.com';
    $request->requestBody->formatUri = 'https://white-printing.name';
    $request->requestBody->formatUuid = 'ba88f3a6-6997-4074-ba44-69b6e2141959';
    $request->requestBody->hostname = 'murky-monotheism.com';
    $request->requestBody->ipv4 = '167.248.166.82';
    $request->requestBody->ipv6 = '63e2:516f:e4c8:b711:e5b7:fd2e:d028:921c';
    $request->requestBody->simpleObject = new SimpleObject();
    $request->requestBody->simpleObject->any = 'illum';
    $request->requestBody->simpleObject->bigint = 864934;
    $request->requestBody->simpleObject->bigintStr = 'maxime';
    $request->requestBody->simpleObject->bool = true;
    $request->requestBody->simpleObject->boolOpt = true;
    $request->requestBody->simpleObject->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->requestBody->simpleObject->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
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
    $request->requestBody->unknown = 'odit';
    $request->requestBody->uri = 'http://ancient-basin.org';
    $request->requestBody->uuid = 'b576b0d5-f0d3-40c5-bbb2-587053202c73';
    $request->boolParameter = false;
    $request->dateParameter = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTimeParameter = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->doubleParameter = 2.2222222;
    $request->enumParameter = UsageExamplePostEnumParameter::Value3;
    $request->floatParameter = 1.1;
    $request->int64Parameter = 111111;
    $request->intParameter = 1;
    $request->optEnumParameter = UsageExamplePostOptEnumParameter::Value3;
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

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `$request`                                                                                                         | [\OpenAPI\OpenAPI\Models\Operations\UsageExamplePostRequest](../../models/operations/UsageExamplePostRequest.md)   | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |
| `security`                                                                                                         | [\OpenAPI\OpenAPI\Models\Operations\UsageExamplePostSecurity](../../models/operations/UsageExamplePostSecurity.md) | :heavy_check_mark:                                                                                                 | The security requirements to use for the request.                                                                  |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\UsageExamplePostResponse](../../models/operations/UsageExamplePostResponse.md)**

