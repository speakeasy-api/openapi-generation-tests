# unions

## Overview

Endpoints for testing union types.

### Available Operations

* [mixedTypeOneOfPost](#mixedtypeoneofpost)
* [primitiveTypeOneOfPost](#primitivetypeoneofpost)
* [stronglyTypedOneOfPost](#stronglytypedoneofpost)
* [typedObjectOneOfPost](#typedobjectoneofpost)
* [weaklyTypedOneOfPost](#weaklytypedoneofpost)

## mixedTypeOneOfPost

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
'saepe'

    $response = $sdk->unions->mixedTypeOneOfPost($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [mixed](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\MixedTypeOneOfPostResponse](../../models/operations/MixedTypeOneOfPostResponse.md)**


## primitiveTypeOneOfPost

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
5438.06

    $response = $sdk->unions->primitiveTypeOneOfPost($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [mixed](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\PrimitiveTypeOneOfPostResponse](../../models/operations/PrimitiveTypeOneOfPostResponse.md)**


## stronglyTypedOneOfPost

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
    $request = new SimpleObjectWithType();
    $request->any = 'esse';
    $request->bigint = 910545;
    $request->bigintStr = 'accusamus';
    $request->bool = true;
    $request->boolOpt = true;
    $request->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->enum = Enum::Two;
    $request->float32 = 2.2222222;
    $request->int = 999999;
    $request->int32 = 1;
    $request->int32Enum = SimpleObjectWithTypeInt32Enum::FiftyFive;
    $request->intEnum = SimpleObjectWithTypeIntEnum::Second;
    $request->intOptNull = 999999;
    $request->num = 1.1;
    $request->numOptNull = 1.1;
    $request->str = 'example';
    $request->strOpt = 'optional example';
    $request->type = 'quod';

    $response = $sdk->unions->stronglyTypedOneOfPost($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [mixed](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\StronglyTypedOneOfPostResponse](../../models/operations/StronglyTypedOneOfPostResponse.md)**


## typedObjectOneOfPost

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
    $request = new TypedObject3();
    $request->type = TypedObject3Type::Obj3;
    $request->value = 'vero';

    $response = $sdk->unions->typedObjectOneOfPost($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [mixed](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\TypedObjectOneOfPostResponse](../../models/operations/TypedObjectOneOfPostResponse.md)**


## weaklyTypedOneOfPost

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
    $request = new SimpleObject();
    $request->any = 'quasi';
    $request->bigint = 904045;
    $request->bigintStr = 'vel';
    $request->bool = true;
    $request->boolOpt = true;
    $request->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->enum = Enum::Two;
    $request->float32 = 2.2222222;
    $request->int = 999999;
    $request->int32 = 1;
    $request->int32Enum = SimpleObjectInt32Enum::OneHundredAndEightyOne;
    $request->intEnum = SimpleObjectIntEnum::Second;
    $request->intOptNull = 999999;
    $request->num = 1.1;
    $request->numOptNull = 1.1;
    $request->str = 'example';
    $request->strOpt = 'optional example';

    $response = $sdk->unions->weaklyTypedOneOfPost($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `$request`                                 | [mixed](../../models//.md)                 | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\WeaklyTypedOneOfPostResponse](../../models/operations/WeaklyTypedOneOfPostResponse.md)**

