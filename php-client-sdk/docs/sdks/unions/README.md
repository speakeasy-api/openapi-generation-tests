# Unions
(*unions*)

## Overview

Endpoints for testing union types.

### Available Operations

* [flattenedTypedObjectPost](#flattenedtypedobjectpost)
* [mixedTypeOneOfPost](#mixedtypeoneofpost)
* [nullableOneOfRefInObjectPost](#nullableoneofrefinobjectpost)
* [nullableOneOfSchemaPost](#nullableoneofschemapost)
* [nullableOneOfTypeInObjectPost](#nullableoneoftypeinobjectpost)
* [nullableTypedObjectPost](#nullabletypedobjectpost)
* [primitiveTypeOneOfPost](#primitivetypeoneofpost)
* [stronglyTypedOneOfPost](#stronglytypedoneofpost)
* [typedObjectNullableOneOfPost](#typedobjectnullableoneofpost)
* [typedObjectOneOfPost](#typedobjectoneofpost)
* [weaklyTypedOneOfPost](#weaklytypedoneofpost)

## flattenedTypedObjectPost

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\TypedObject1;
use \OpenAPI\OpenAPI\Models\Shared\TypedObject1Type;

$sdk = SDK::builder()
    ->build();

try {
    $request = new TypedObject1();
    $request->type = TypedObject1Type::Obj1;
    $request->value = 'magnam';

    $response = $sdk->unions->flattenedTypedObjectPost($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `$request`                                                                         | [\OpenAPI\OpenAPI\Models\Shared\TypedObject1](../../models/shared/TypedObject1.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\FlattenedTypedObjectPostResponse](../../models/operations/FlattenedTypedObjectPostResponse.md)**


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
    $request = new SimpleObject();
    $request->any = 'maiores';
    $request->bigint = 731744;
    $request->bigintStr = 'aperiam';
    $request->bool = true;
    $request->boolOpt = true;
    $request->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00.000Z');
    $request->decimal = 7275.47;
    $request->enum = Enum::Two;
    $request->float32 = 2.2222222;
    $request->int = 999999;
    $request->int32 = 1;
    $request->int32Enum = SimpleObjectInt32Enum::FiftyFive;
    $request->intEnum = SimpleObjectIntEnum::First;
    $request->intOptNull = 999999;
    $request->num = 1.1;
    $request->numOptNull = 1.1;
    $request->str = 'example';
    $request->strOpt = 'optional example';

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


## nullableOneOfRefInObjectPost

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\NullableOneOfRefInObject;
use \OpenAPI\OpenAPI\Models\Shared\TypedObject1;
use \OpenAPI\OpenAPI\Models\Shared\TypedObject1Type;

$sdk = SDK::builder()
    ->build();

try {
    $request = new NullableOneOfRefInObject();
    $request->nullableOneOfOne = new TypedObject1();
    $request->nullableOneOfOne->type = TypedObject1Type::Obj1;
    $request->nullableOneOfOne->value = 'totam';
    $request->nullableOneOfTwo = new TypedObject2();
    $request->nullableOneOfTwo->type = TypedObject2Type::Obj2;
    $request->nullableOneOfTwo->value = 'voluptas';
    $request->oneOfOne = new TypedObject1();
    $request->oneOfOne->type = TypedObject1Type::Obj1;
    $request->oneOfOne->value = 'quo';

    $response = $sdk->unions->nullableOneOfRefInObjectPost($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `$request`                                                                                                 | [\OpenAPI\OpenAPI\Models\Shared\NullableOneOfRefInObject](../../models/shared/NullableOneOfRefInObject.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\NullableOneOfRefInObjectPostResponse](../../models/operations/NullableOneOfRefInObjectPostResponse.md)**


## nullableOneOfSchemaPost

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
    $request = new TypedObject1();
    $request->type = TypedObject1Type::Obj1;
    $request->value = 'minus';

    $response = $sdk->unions->nullableOneOfSchemaPost($request);

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

**[?\OpenAPI\OpenAPI\Models\Operations\NullableOneOfSchemaPostResponse](../../models/operations/NullableOneOfSchemaPostResponse.md)**


## nullableOneOfTypeInObjectPost

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\NullableOneOfTypeInObject;

$sdk = SDK::builder()
    ->build();

try {
    $request = new NullableOneOfTypeInObject();
    $request->nullableOneOfOne = false;
    $request->nullableOneOfTwo = 344530;
    $request->oneOfOne = false;

    $response = $sdk->unions->nullableOneOfTypeInObjectPost($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `$request`                                                                                                   | [\OpenAPI\OpenAPI\Models\Shared\NullableOneOfTypeInObject](../../models/shared/NullableOneOfTypeInObject.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\NullableOneOfTypeInObjectPostResponse](../../models/operations/NullableOneOfTypeInObjectPostResponse.md)**


## nullableTypedObjectPost

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\TypedObject1;
use \OpenAPI\OpenAPI\Models\Shared\TypedObject1Type;

$sdk = SDK::builder()
    ->build();

try {
    $request = new TypedObject1();
    $request->type = TypedObject1Type::Obj1;
    $request->value = 'est';

    $response = $sdk->unions->nullableTypedObjectPost($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

### Parameters

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `$request`                                                                         | [\OpenAPI\OpenAPI\Models\Shared\TypedObject1](../../models/shared/TypedObject1.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |


### Response

**[?\OpenAPI\OpenAPI\Models\Operations\NullableTypedObjectPostResponse](../../models/operations/NullableTypedObjectPostResponse.md)**


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
false

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
    $request = new DeepObjectWithType();
    $request->any = 'vero';
    $request->arr = [
        new SimpleObject(),
    ];
    $request->bool = false;
    $request->int = 141506;
    $request->map = [
        'repellat' => new SimpleObject(),
    ];
    $request->num = 8659.46;
    $request->obj = new SimpleObject();
    $request->obj->any = 'nemo';
    $request->obj->bigint = 441321;
    $request->obj->bigintStr = 'aperiam';
    $request->obj->bool = true;
    $request->obj->boolOpt = true;
    $request->obj->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->obj->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00.000Z');
    $request->obj->decimal = 4864.1;
    $request->obj->enum = Enum::Two;
    $request->obj->float32 = 2.2222222;
    $request->obj->int = 999999;
    $request->obj->int32 = 1;
    $request->obj->int32Enum = SimpleObjectInt32Enum::FiftyFive;
    $request->obj->intEnum = SimpleObjectIntEnum::Second;
    $request->obj->intOptNull = 999999;
    $request->obj->num = 1.1;
    $request->obj->numOptNull = 1.1;
    $request->obj->str = 'example';
    $request->obj->strOpt = 'optional example';
    $request->str = 'ducimus';
    $request->type = 'excepturi';

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


## typedObjectNullableOneOfPost

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
    $request = new TypedObject1();
    $request->type = TypedObject1Type::Obj1;
    $request->value = 'error';

    $response = $sdk->unions->typedObjectNullableOneOfPost($request);

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

**[?\OpenAPI\OpenAPI\Models\Operations\TypedObjectNullableOneOfPostResponse](../../models/operations/TypedObjectNullableOneOfPostResponse.md)**


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
    $request = new TypedObject1();
    $request->type = TypedObject1Type::Obj1;
    $request->value = 'ducimus';

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
    $request->any = 'pariatur';
    $request->bigint = 932666;
    $request->bigintStr = 'similique';
    $request->bool = true;
    $request->boolOpt = true;
    $request->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00.000Z');
    $request->decimal = 7631.65;
    $request->enum = Enum::Two;
    $request->float32 = 2.2222222;
    $request->int = 999999;
    $request->int32 = 1;
    $request->int32Enum = SimpleObjectInt32Enum::SixtyNine;
    $request->intEnum = SimpleObjectIntEnum::First;
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

