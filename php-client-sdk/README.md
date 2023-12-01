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
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
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
    $request->strOpt = 'testOptional';

    $response = $sdk->generation->globalNameOverridden($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 2

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->errors->connectionErrorGet();

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 3

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->errors->statusGetError(458364);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 4

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->errors->statusGetXSpeakeasyErrors(385913);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 5

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    'string';

    $response = $sdk->unions->flattenedTypedObjectPost($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 6

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    'string';

    $response = $sdk->unions->mixedTypeOneOfPost($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 7

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Shared\NullableOneOfRefInObject();
    $request->nullableOneOfOne = new Shared\TypedObject1();
    $request->nullableOneOfOne->type = Shared\Type::Obj1;
    $request->nullableOneOfOne->value = 'string';
    $request->nullableOneOfTwo = 'string';
    $request->oneOfOne = 'string';

    $response = $sdk->unions->nullableOneOfRefInObjectPost($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 8

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    'string';

    $response = $sdk->unions->nullableOneOfSchemaPost($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 9

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Shared\NullableOneOfTypeInObject();
    $request->nullableOneOfOne = false;
    $request->nullableOneOfTwo = 'string';
    $request->oneOfOne = false;

    $response = $sdk->unions->nullableOneOfTypeInObjectPost($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 10

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Shared\TypedObject1();
    $request->type = Shared\Type::Obj1;
    $request->value = 'string';

    $response = $sdk->unions->nullableTypedObjectPost($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 11

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    'string';

    $response = $sdk->unions->primitiveTypeOneOfPost($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 12

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    'string';

    $response = $sdk->unions->stronglyTypedOneOfPost($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 13

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    'string';

    $response = $sdk->unions->typedObjectNullableOneOfPost($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 14

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    'string';

    $response = $sdk->unions->typedObjectOneOfPost($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 15

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    'string';

    $response = $sdk->unions->unionBigIntDecimal($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 16

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    DateTime::createFromFormat('Y-m-d', '2022-11-25');

    $response = $sdk->unions->unionDateNull($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 17

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    'string';

    $response = $sdk->unions->unionDateTimeBigInt($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 18

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    DateTime::createFromFormat('Y-m-d\TH:i:s+', '2022-04-12T19:39:53.907Z');

    $response = $sdk->unions->unionDateTimeNull($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 19

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    'string';

    $response = $sdk->unions->weaklyTypedOneOfPost($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 20

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $simpleObject = new Shared\SimpleObject();
    $simpleObject->any = 'any';
    $simpleObject->bigint = 8821239038968084;
    $simpleObject->bigintStr = '9223372036854775808';
    $simpleObject->bool = true;
    $simpleObject->boolOpt = true;
    $simpleObject->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $simpleObject->dateTime = DateTime::createFromFormat(
        'Y-m-d\TH:i:s+',
        '2020-01-01T00:00:00.000001Z',
    );
    $simpleObject->decimal = 3.141592653589793;
    $simpleObject->decimalStr = '3.14159265358979344719667586';
    $simpleObject->enum = Shared\Enum::One;
    $simpleObject->float32 = 1.1;
    $simpleObject->int = 1;
    $simpleObject->int32 = 1;
    $simpleObject->int32Enum = Shared\Int32Enum::OneHundredAndEightyOne;
    $simpleObject->intEnum = Shared\IntEnum::Second;
    $simpleObject->intOptNull = 843322;
    $simpleObject->num = 1.1;
    $simpleObject->numOptNull = 7126.06;
    $simpleObject->str = 'test';
    $simpleObject->strOpt = 'testOptional';

    $response = $sdk->flattening->componentBodyAndParamConflict($simpleObject, 'string');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 21

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $simpleObject = new Shared\SimpleObject();
    $simpleObject->any = 'any';
    $simpleObject->bigint = 8821239038968084;
    $simpleObject->bigintStr = '9223372036854775808';
    $simpleObject->bool = true;
    $simpleObject->boolOpt = true;
    $simpleObject->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $simpleObject->dateTime = DateTime::createFromFormat(
        'Y-m-d\TH:i:s+',
        '2020-01-01T00:00:00.000001Z',
    );
    $simpleObject->decimal = 3.141592653589793;
    $simpleObject->decimalStr = '3.14159265358979344719667586';
    $simpleObject->enum = Shared\Enum::One;
    $simpleObject->float32 = 1.1;
    $simpleObject->int = 1;
    $simpleObject->int32 = 1;
    $simpleObject->int32Enum = Shared\Int32Enum::OneHundredAndEightyOne;
    $simpleObject->intEnum = Shared\IntEnum::Third;
    $simpleObject->intOptNull = 758827;
    $simpleObject->num = 1.1;
    $simpleObject->numOptNull = 1702.8;
    $simpleObject->str = 'test';
    $simpleObject->strOpt = 'testOptional';

    $response = $sdk->flattening->componentBodyAndParamNoConflict('string', $simpleObject);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 22

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->flattening->conflictingParams('string', 'string');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 23

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $requestBody = new Operations\InlineBodyAndParamConflictRequestBody();
    $requestBody->str = 'string';

    $response = $sdk->flattening->inlineBodyAndParamConflict($requestBody, 'string');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 24

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $requestBody = new Operations\InlineBodyAndParamNoConflictRequestBody();
    $requestBody->bodyStr = 'string';

    $response = $sdk->flattening->inlineBodyAndParamNoConflict($requestBody, 'string');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 25

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->globals->globalPathParameterGet(719830);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 26

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->globals->globalsQueryParameterGet('string');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 27

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->parameters->deepObjectQueryParamsMap(
        [
            'compress' => 'string',
        ],
        [
            'of' => ['string'],
        ],
    );

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 28

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $objParam = new Shared\SimpleObject();
    $objParam->any = 'any';
    $objParam->bigint = 8821239038968084;
    $objParam->bigintStr = '9223372036854775808';
    $objParam->bool = true;
    $objParam->boolOpt = true;
    $objParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $objParam->dateTime = DateTime::createFromFormat(
        'Y-m-d\TH:i:s+',
        '2020-01-01T00:00:00.000001Z',
    );
    $objParam->decimal = 3.141592653589793;
    $objParam->decimalStr = '3.14159265358979344719667586';
    $objParam->enum = Shared\Enum::One;
    $objParam->float32 = 1.1;
    $objParam->int = 1;
    $objParam->int32 = 1;
    $objParam->int32Enum = Shared\Int32Enum::SixtyNine;
    $objParam->intEnum = Shared\IntEnum::Second;
    $objParam->intOptNull = 303001;
    $objParam->num = 1.1;
    $objParam->numOptNull = 5571.55;
    $objParam->str = 'test';
    $objParam->strOpt = 'testOptional';

    $objArrParam = new Operations\ObjArrParam();
    $objArrParam->arr = ['test'];

    $response = $sdk->parameters->deepObjectQueryParamsObject($objParam, $objArrParam);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 29

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->parameters->duplicateParam('string');

    if ($response->duplicateParamResponse !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 30

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->parameters->formQueryParamsArray(['test'], [2]);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 31

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $objParamExploded = new Operations\ObjParamExploded();
    $objParamExploded->itemCount = '10';
    $objParamExploded->searchTerm = 'foo';

    $objParam = new Operations\ObjParam();
    $objParam->encodedCount = '11';
    $objParam->encodedTerm = 'bar';

    $response = $sdk->parameters->formQueryParamsCamelObject($objParamExploded, $objParam);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 32

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->parameters->formQueryParamsMap(
        [
            'male' => 'string',
        ],
        [
            'Reggae' => 355695,
        ],
    );

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 33

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $objParamExploded = new Shared\SimpleObject();
    $objParamExploded->any = 'any';
    $objParamExploded->bigint = 8821239038968084;
    $objParamExploded->bigintStr = '9223372036854775808';
    $objParamExploded->bool = true;
    $objParamExploded->boolOpt = true;
    $objParamExploded->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $objParamExploded->dateTime = DateTime::createFromFormat(
        'Y-m-d\TH:i:s+',
        '2020-01-01T00:00:00.000001Z',
    );
    $objParamExploded->decimal = 3.141592653589793;
    $objParamExploded->decimalStr = '3.14159265358979344719667586';
    $objParamExploded->enum = Shared\Enum::One;
    $objParamExploded->float32 = 1.1;
    $objParamExploded->int = 1;
    $objParamExploded->int32 = 1;
    $objParamExploded->int32Enum = Shared\Int32Enum::OneHundredAndEightyOne;
    $objParamExploded->intEnum = Shared\IntEnum::Second;
    $objParamExploded->intOptNull = 645228;
    $objParamExploded->num = 1.1;
    $objParamExploded->numOptNull = 7602.31;
    $objParamExploded->str = 'test';
    $objParamExploded->strOpt = 'testOptional';

    $objParam = new Shared\SimpleObject();
    $objParam->any = 'any';
    $objParam->bigint = 8821239038968084;
    $objParam->bigintStr = '9223372036854775808';
    $objParam->bool = true;
    $objParam->boolOpt = true;
    $objParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $objParam->dateTime = DateTime::createFromFormat(
        'Y-m-d\TH:i:s+',
        '2020-01-01T00:00:00.000001Z',
    );
    $objParam->decimal = 3.141592653589793;
    $objParam->decimalStr = '3.14159265358979344719667586';
    $objParam->enum = Shared\Enum::One;
    $objParam->float32 = 1.1;
    $objParam->int = 1;
    $objParam->int32 = 1;
    $objParam->int32Enum = Shared\Int32Enum::SixtyNine;
    $objParam->intEnum = Shared\IntEnum::First;
    $objParam->intOptNull = 973554;
    $objParam->num = 1.1;
    $objParam->numOptNull = 873.54;
    $objParam->str = 'test';
    $objParam->strOpt = 'testOptional';

    $response = $sdk->parameters->formQueryParamsObject($objParamExploded, $objParam);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 34

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->parameters->formQueryParamsPrimitive(true, 1, 1.1, 'test');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 35

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $refObjParam = new Shared\RefQueryParamObj();
    $refObjParam->bool = true;
    $refObjParam->int = 1;
    $refObjParam->num = 1.1;
    $refObjParam->str = 'test';

    $refObjParamExploded = new Shared\RefQueryParamObjExploded();
    $refObjParamExploded->bool = true;
    $refObjParamExploded->int = 1;
    $refObjParamExploded->num = 1.1;
    $refObjParamExploded->str = 'test';

    $response = $sdk->parameters->formQueryParamsRefParamObject($refObjParam, $refObjParamExploded);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 36

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->parameters->headerParamsArray(['test1']);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 37

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->parameters->headerParamsMap(
        [
            'Ball' => 'string',
        ],
        [
            'Account' => 'string',
        ],
    );

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 38

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $xHeaderObj = new Shared\SimpleObject();
    $xHeaderObj->any = 'any';
    $xHeaderObj->bigint = 8821239038968084;
    $xHeaderObj->bigintStr = '9223372036854775808';
    $xHeaderObj->bool = true;
    $xHeaderObj->boolOpt = true;
    $xHeaderObj->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $xHeaderObj->dateTime = DateTime::createFromFormat(
        'Y-m-d\TH:i:s+',
        '2020-01-01T00:00:00.000001Z',
    );
    $xHeaderObj->decimal = 3.141592653589793;
    $xHeaderObj->decimalStr = '3.14159265358979344719667586';
    $xHeaderObj->enum = Shared\Enum::One;
    $xHeaderObj->float32 = 1.1;
    $xHeaderObj->int = 1;
    $xHeaderObj->int32 = 1;
    $xHeaderObj->int32Enum = Shared\Int32Enum::SixtyNine;
    $xHeaderObj->intEnum = Shared\IntEnum::Third;
    $xHeaderObj->intOptNull = 590416;
    $xHeaderObj->num = 1.1;
    $xHeaderObj->numOptNull = 144.68;
    $xHeaderObj->str = 'test';
    $xHeaderObj->strOpt = 'testOptional';

    $xHeaderObjExplode = new Shared\SimpleObject();
    $xHeaderObjExplode->any = 'any';
    $xHeaderObjExplode->bigint = 8821239038968084;
    $xHeaderObjExplode->bigintStr = '9223372036854775808';
    $xHeaderObjExplode->bool = true;
    $xHeaderObjExplode->boolOpt = true;
    $xHeaderObjExplode->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $xHeaderObjExplode->dateTime = DateTime::createFromFormat(
        'Y-m-d\TH:i:s+',
        '2020-01-01T00:00:00.000001Z',
    );
    $xHeaderObjExplode->decimal = 3.141592653589793;
    $xHeaderObjExplode->decimalStr = '3.14159265358979344719667586';
    $xHeaderObjExplode->enum = Shared\Enum::One;
    $xHeaderObjExplode->float32 = 1.1;
    $xHeaderObjExplode->int = 1;
    $xHeaderObjExplode->int32 = 1;
    $xHeaderObjExplode->int32Enum = Shared\Int32Enum::FiftyFive;
    $xHeaderObjExplode->intEnum = Shared\IntEnum::Second;
    $xHeaderObjExplode->intOptNull = 54344;
    $xHeaderObjExplode->num = 1.1;
    $xHeaderObjExplode->numOptNull = 6940.18;
    $xHeaderObjExplode->str = 'test';
    $xHeaderObjExplode->strOpt = 'testOptional';

    $response = $sdk->parameters->headerParamsObject($xHeaderObj, $xHeaderObjExplode);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 39

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->parameters->headerParamsPrimitive(true, 1, 1.1, 'test');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 40

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $deepObjParam = new Shared\DeepObject();
    $deepObjParam->any = 'anyOf[0]';
    $deepObjParam->arr = [new Shared\SimpleObject()];
    $deepObjParam->bool = true;
    $deepObjParam->int = 1;
    $deepObjParam->map = [
        'Hybrid' => new Shared\SimpleObject(),
    ];
    $deepObjParam->num = 1.1;
    $deepObjParam->obj = new Shared\SimpleObject();
    $deepObjParam->obj->any = 'any';
    $deepObjParam->obj->bigint = 8821239038968084;
    $deepObjParam->obj->bigintStr = '9223372036854775808';
    $deepObjParam->obj->bool = true;
    $deepObjParam->obj->boolOpt = true;
    $deepObjParam->obj->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $deepObjParam->obj->dateTime = DateTime::createFromFormat(
        'Y-m-d\TH:i:s+',
        '2020-01-01T00:00:00.000001Z',
    );
    $deepObjParam->obj->decimal = 3.141592653589793;
    $deepObjParam->obj->decimalStr = '3.14159265358979344719667586';
    $deepObjParam->obj->enum = Shared\Enum::One;
    $deepObjParam->obj->float32 = 1.1;
    $deepObjParam->obj->int = 1;
    $deepObjParam->obj->int32 = 1;
    $deepObjParam->obj->int32Enum = Shared\Int32Enum::OneHundredAndEightyOne;
    $deepObjParam->obj->intEnum = Shared\IntEnum::Third;
    $deepObjParam->obj->intOptNull = 980270;
    $deepObjParam->obj->num = 1.1;
    $deepObjParam->obj->numOptNull = 2047.13;
    $deepObjParam->obj->str = 'test';
    $deepObjParam->obj->strOpt = 'testOptional';
    $deepObjParam->str = 'test';
    $deepObjParam->type = 'string';

    $simpleObjParam = new Shared\SimpleObject();
    $simpleObjParam->any = 'any';
    $simpleObjParam->bigint = 8821239038968084;
    $simpleObjParam->bigintStr = '9223372036854775808';
    $simpleObjParam->bool = true;
    $simpleObjParam->boolOpt = true;
    $simpleObjParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $simpleObjParam->dateTime = DateTime::createFromFormat(
        'Y-m-d\TH:i:s+',
        '2020-01-01T00:00:00.000001Z',
    );
    $simpleObjParam->decimal = 3.141592653589793;
    $simpleObjParam->decimalStr = '3.14159265358979344719667586';
    $simpleObjParam->enum = Shared\Enum::One;
    $simpleObjParam->float32 = 1.1;
    $simpleObjParam->int = 1;
    $simpleObjParam->int32 = 1;
    $simpleObjParam->int32Enum = Shared\Int32Enum::FiftyFive;
    $simpleObjParam->intEnum = Shared\IntEnum::First;
    $simpleObjParam->intOptNull = 835122;
    $simpleObjParam->num = 1.1;
    $simpleObjParam->numOptNull = 9111.59;
    $simpleObjParam->str = 'test';
    $simpleObjParam->strOpt = 'testOptional';

    $response = $sdk->parameters->jsonQueryParamsObject($deepObjParam, $simpleObjParam);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 41

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->parameters->mixedParametersCamelCase(
        'headerValue',
        'pathValue',
        'queryValue',
    );

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 42

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->parameters->mixedParametersPrimitives(
        'headerValue',
        'pathValue',
        'queryValue',
    );

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 43

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $deepObjectParam = new Shared\SimpleObject();
    $deepObjectParam->any = 'any';
    $deepObjectParam->bigint = 8821239038968084;
    $deepObjectParam->bigintStr = '9223372036854775808';
    $deepObjectParam->bool = true;
    $deepObjectParam->boolOpt = true;
    $deepObjectParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $deepObjectParam->dateTime = DateTime::createFromFormat(
        'Y-m-d\TH:i:s+',
        '2020-01-01T00:00:00.000001Z',
    );
    $deepObjectParam->decimal = 3.141592653589793;
    $deepObjectParam->decimalStr = '3.14159265358979344719667586';
    $deepObjectParam->enum = Shared\Enum::One;
    $deepObjectParam->float32 = 1.1;
    $deepObjectParam->int = 1;
    $deepObjectParam->int32 = 1;
    $deepObjectParam->int32Enum = Shared\Int32Enum::OneHundredAndEightyOne;
    $deepObjectParam->intEnum = Shared\IntEnum::Second;
    $deepObjectParam->intOptNull = 89281;
    $deepObjectParam->num = 1.1;
    $deepObjectParam->numOptNull = 2132.48;
    $deepObjectParam->str = 'test';
    $deepObjectParam->strOpt = 'testOptional';

    $formParam = new Shared\SimpleObject();
    $formParam->any = 'any';
    $formParam->bigint = 8821239038968084;
    $formParam->bigintStr = '9223372036854775808';
    $formParam->bool = true;
    $formParam->boolOpt = true;
    $formParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $formParam->dateTime = DateTime::createFromFormat(
        'Y-m-d\TH:i:s+',
        '2020-01-01T00:00:00.000001Z',
    );
    $formParam->decimal = 3.141592653589793;
    $formParam->decimalStr = '3.14159265358979344719667586';
    $formParam->enum = Shared\Enum::One;
    $formParam->float32 = 1.1;
    $formParam->int = 1;
    $formParam->int32 = 1;
    $formParam->int32Enum = Shared\Int32Enum::FiftyFive;
    $formParam->intEnum = Shared\IntEnum::Second;
    $formParam->intOptNull = 218100;
    $formParam->num = 1.1;
    $formParam->numOptNull = 75.58;
    $formParam->str = 'test';
    $formParam->strOpt = 'testOptional';

    $jsonParam = new Shared\SimpleObject();
    $jsonParam->any = 'any';
    $jsonParam->bigint = 8821239038968084;
    $jsonParam->bigintStr = '9223372036854775808';
    $jsonParam->bool = true;
    $jsonParam->boolOpt = true;
    $jsonParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $jsonParam->dateTime = DateTime::createFromFormat(
        'Y-m-d\TH:i:s+',
        '2020-01-01T00:00:00.000001Z',
    );
    $jsonParam->decimal = 3.141592653589793;
    $jsonParam->decimalStr = '3.14159265358979344719667586';
    $jsonParam->enum = Shared\Enum::One;
    $jsonParam->float32 = 1.1;
    $jsonParam->int = 1;
    $jsonParam->int32 = 1;
    $jsonParam->int32Enum = Shared\Int32Enum::FiftyFive;
    $jsonParam->intEnum = Shared\IntEnum::Third;
    $jsonParam->intOptNull = 387493;
    $jsonParam->num = 1.1;
    $jsonParam->numOptNull = 5641.93;
    $jsonParam->str = 'test';
    $jsonParam->strOpt = 'testOptional';

    $response = $sdk->parameters->mixedQueryParams($deepObjectParam, $formParam, $jsonParam);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 44

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $jsonObj = new Shared\SimpleObject();
    $jsonObj->any = 'any';
    $jsonObj->bigint = 8821239038968084;
    $jsonObj->bigintStr = '9223372036854775808';
    $jsonObj->bool = true;
    $jsonObj->boolOpt = true;
    $jsonObj->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $jsonObj->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000001Z');
    $jsonObj->decimal = 3.141592653589793;
    $jsonObj->decimalStr = '3.14159265358979344719667586';
    $jsonObj->enum = Shared\Enum::One;
    $jsonObj->float32 = 1.1;
    $jsonObj->int = 1;
    $jsonObj->int32 = 1;
    $jsonObj->int32Enum = Shared\Int32Enum::SixtyNine;
    $jsonObj->intEnum = Shared\IntEnum::Second;
    $jsonObj->intOptNull = 355762;
    $jsonObj->num = 1.1;
    $jsonObj->numOptNull = 5955.49;
    $jsonObj->str = 'test';
    $jsonObj->strOpt = 'testOptional';

    $response = $sdk->parameters->pathParameterJson($jsonObj);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 45

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $objParam = new Shared\SimpleObject();
    $objParam->any = 'any';
    $objParam->bigint = 8821239038968084;
    $objParam->bigintStr = '9223372036854775808';
    $objParam->bool = true;
    $objParam->boolOpt = true;
    $objParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $objParam->dateTime = DateTime::createFromFormat(
        'Y-m-d\TH:i:s+',
        '2020-01-01T00:00:00.000001Z',
    );
    $objParam->decimal = 3.141592653589793;
    $objParam->decimalStr = '3.14159265358979344719667586';
    $objParam->enum = Shared\Enum::One;
    $objParam->float32 = 1.1;
    $objParam->int = 1;
    $objParam->int32 = 1;
    $objParam->int32Enum = Shared\Int32Enum::SixtyNine;
    $objParam->intEnum = Shared\IntEnum::First;
    $objParam->intOptNull = 110513;
    $objParam->num = 1.1;
    $objParam->numOptNull = 1666.19;
    $objParam->str = 'test';
    $objParam->strOpt = 'testOptional';

    $response = $sdk->parameters->pipeDelimitedQueryParamsArray(
        ['test2'],
        [2],
        [
            'blue' => 'string',
        ],
        $objParam,
    );

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 46

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->parameters->simplePathParameterArrays(['test']);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 47

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->parameters->simplePathParameterMaps(
        [
            'weber' => 'string',
        ],
        [
            'Sausages' => 157687,
        ],
    );

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 48

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $objParam = new Shared\SimpleObject();
    $objParam->any = 'any';
    $objParam->bigint = 8821239038968084;
    $objParam->bigintStr = '9223372036854775808';
    $objParam->bool = true;
    $objParam->boolOpt = true;
    $objParam->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $objParam->dateTime = DateTime::createFromFormat(
        'Y-m-d\TH:i:s+',
        '2020-01-01T00:00:00.000001Z',
    );
    $objParam->decimal = 3.141592653589793;
    $objParam->decimalStr = '3.14159265358979344719667586';
    $objParam->enum = Shared\Enum::One;
    $objParam->float32 = 1.1;
    $objParam->int = 1;
    $objParam->int32 = 1;
    $objParam->int32Enum = Shared\Int32Enum::FiftyFive;
    $objParam->intEnum = Shared\IntEnum::Third;
    $objParam->intOptNull = 384918;
    $objParam->num = 1.1;
    $objParam->numOptNull = 9559.93;
    $objParam->str = 'test';
    $objParam->strOpt = 'testOptional';

    $objParamExploded = new Shared\SimpleObject();
    $objParamExploded->any = 'any';
    $objParamExploded->bigint = 8821239038968084;
    $objParamExploded->bigintStr = '9223372036854775808';
    $objParamExploded->bool = true;
    $objParamExploded->boolOpt = true;
    $objParamExploded->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $objParamExploded->dateTime = DateTime::createFromFormat(
        'Y-m-d\TH:i:s+',
        '2020-01-01T00:00:00.000001Z',
    );
    $objParamExploded->decimal = 3.141592653589793;
    $objParamExploded->decimalStr = '3.14159265358979344719667586';
    $objParamExploded->enum = Shared\Enum::One;
    $objParamExploded->float32 = 1.1;
    $objParamExploded->int = 1;
    $objParamExploded->int32 = 1;
    $objParamExploded->int32Enum = Shared\Int32Enum::OneHundredAndEightyOne;
    $objParamExploded->intEnum = Shared\IntEnum::Second;
    $objParamExploded->intOptNull = 678638;
    $objParamExploded->num = 1.1;
    $objParamExploded->numOptNull = 5865.54;
    $objParamExploded->str = 'test';
    $objParamExploded->strOpt = 'testOptional';

    $response = $sdk->parameters->simplePathParameterObjects($objParam, $objParamExploded);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 49

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->parameters->simplePathParameterPrimitives(true, 1, 1.1, 'test');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 50

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->nestFirst->get();

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 51

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->nested->get();

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 52

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->nestedFirst->get();

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 53

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->nestedSecond->get();

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 54

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Shared\NullableObject();
    $request->optional = 'string';
    $request->required = 302382;

    $response = $sdk->requestBodies->nullableObjectPost($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 55

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Operations\NullableRequiredEmptyObjectPostRequestBody();
    $request->nullableOptionalObj = new Operations\NullableOptionalObj();
    $request->nullableRequiredObj = new Operations\NullableRequiredObj();
    $request->requiredObj = new Operations\RequiredObj();

    $response = $sdk->requestBodies->nullableRequiredEmptyObjectPost($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 56

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Operations\NullableRequiredPropertyPostRequestBody();
    $request->nullableOptionalInt = 235517;
    $request->nullableRequiredArray = [6917.41];
    $request->nullableRequiredEnum = Operations\NullableRequiredEnum::First;
    $request->nullableRequiredInt = 282026;

    $response = $sdk->requestBodies->nullableRequiredPropertyPost($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 57

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Operations\NullableRequiredSharedObjectPostRequestBody();
    $request->nullableOptionalObj = new Shared\NullableObject();
    $request->nullableOptionalObj->optional = 'string';
    $request->nullableOptionalObj->required = 86533;
    $request->nullableRequiredObj = new Shared\NullableObject();
    $request->nullableRequiredObj->optional = 'string';
    $request->nullableRequiredObj->required = 964394;

    $response = $sdk->requestBodies->nullableRequiredSharedObjectPost($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 58

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = [new Shared\SimpleObject()];

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArray($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 59

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = [new Shared\SimpleObjectCamelCase()];

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayCamelCase($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 60

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = [new Shared\SimpleObject()];

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayObj($request);

    if ($response->arrObjValue !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 61

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = [new Shared\SimpleObjectCamelCase()];

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayObjCamelCase($request);

    if ($response->arrObjValueCamelCase !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 62

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = [[new Shared\SimpleObject()]];

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfArray($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 63

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = [[new Shared\SimpleObjectCamelCase()]];

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfArrayCamelCase($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 64

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = [['string']];

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfArrayOfPrimitive(
        $request,
    );

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 65

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = [
        [
            'Southeast' => new Shared\SimpleObject(),
        ],
    ];

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfMap($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 66

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = [
        [
            'culpa' => new Shared\SimpleObjectCamelCase(),
        ],
    ];

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfMapCamelCase($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 67

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = ['string'];

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfPrimitive($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 68

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Shared\DeepObject();
    $request->any = 'anyOf[0]';
    $request->arr = [new Shared\SimpleObject()];
    $request->bool = true;
    $request->int = 1;
    $request->map = [
        'medium' => new Shared\SimpleObject(),
    ];
    $request->num = 1.1;
    $request->obj = new Shared\SimpleObject();
    $request->obj->any = 'any';
    $request->obj->bigint = 8821239038968084;
    $request->obj->bigintStr = '9223372036854775808';
    $request->obj->bool = true;
    $request->obj->boolOpt = true;
    $request->obj->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->obj->dateTime = DateTime::createFromFormat(
        'Y-m-d\TH:i:s+',
        '2020-01-01T00:00:00.000001Z',
    );
    $request->obj->decimal = 3.141592653589793;
    $request->obj->decimalStr = '3.14159265358979344719667586';
    $request->obj->enum = Shared\Enum::One;
    $request->obj->float32 = 1.1;
    $request->obj->int = 1;
    $request->obj->int32 = 1;
    $request->obj->int32Enum = Shared\Int32Enum::FiftyFive;
    $request->obj->intEnum = Shared\IntEnum::Third;
    $request->obj->intOptNull = 817678;
    $request->obj->num = 1.1;
    $request->obj->numOptNull = 2099.66;
    $request->obj->str = 'test';
    $request->obj->strOpt = 'testOptional';
    $request->str = 'test';
    $request->type = 'string';

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonDeep($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 69

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Shared\DeepObjectCamelCase();
    $request->anyVal = 'string';
    $request->arrVal = [new Shared\SimpleObjectCamelCase()];
    $request->boolVal = false;
    $request->intVal = 66469;
    $request->mapVal = [
        'as' => new Shared\SimpleObjectCamelCase(),
    ];
    $request->numVal = 4241.4;
    $request->objVal = new Shared\SimpleObjectCamelCase();
    $request->objVal->anyVal = 'any example';
    $request->objVal->bigintStrVal = 'string';
    $request->objVal->bigintVal = 942092;
    $request->objVal->boolOptVal = true;
    $request->objVal->boolVal = true;
    $request->objVal->dateTimeVal = DateTime::createFromFormat(
        'Y-m-d\TH:i:s+',
        '2020-01-01T00:00:00Z',
    );
    $request->objVal->dateVal = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->objVal->decimalVal = 1379.45;
    $request->objVal->enumVal = Shared\Enum::One;
    $request->objVal->float32Val = 2.2222222;
    $request->objVal->int32EnumVal = Shared\Int32EnumVal::OneHundredAndEightyOne;
    $request->objVal->int32Val = 1;
    $request->objVal->intEnumVal = Shared\IntEnumVal::First;
    $request->objVal->intOptNullVal = 999999;
    $request->objVal->intVal = 999999;
    $request->objVal->numOptNullVal = 1.1;
    $request->objVal->numVal = 1.1;
    $request->objVal->strOptVal = 'optional example';
    $request->objVal->strVal = 'example';
    $request->strVal = 'string';
    $request->type = 'string';

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonDeepCamelCase($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 70

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = [
        'Bentley' => new Shared\SimpleObject(),
    ];

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMap($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 71

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = [
        'archive' => new Shared\SimpleObjectCamelCase(),
    ];

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapCamelCase($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 72

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = [
        'larder' => new Shared\SimpleObject(),
    ];

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapObj($request);

    if ($response->mapObjValue !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 73

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = [
        'female' => new Shared\SimpleObjectCamelCase(),
    ];

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapObjCamelCase($request);

    if ($response->mapObjValueCamelCase !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 74

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = [
        'Loan' => [new Shared\SimpleObject()],
    ];

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfArray($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 75

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = [
        'nonstop' => [new Shared\SimpleObjectCamelCase()],
    ];

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfArrayCamelCase($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 76

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = [
        'Senior' => [
            'vice' => new Shared\SimpleObject(),
        ],
    ];

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfMap($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 77

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = [
        'Home' => [
            'plum' => new Shared\SimpleObjectCamelCase(),
        ],
    ];

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfMapCamelCase($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 78

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = [
        'turquoise' => [
            'collaboration' => 'string',
        ],
    ];

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfMapOfPrimitive($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 79

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = [
        'equally' => 'string',
    ];

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfPrimitive($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 80

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
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
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000001Z');
    $request->decimal = 3.141592653589793;
    $request->decimalStr = '3.14159265358979344719667586';
    $request->enum = Shared\Enum::One;
    $request->float32 = 1.1;
    $request->int = 1;
    $request->int32 = 1;
    $request->int32Enum = Shared\Int32Enum::SixtyNine;
    $request->intEnum = Shared\IntEnum::First;
    $request->intOptNull = 680661;
    $request->num = 1.1;
    $request->numOptNull = 8809.47;
    $request->str = 'test';
    $request->strOpt = 'testOptional';

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMultipleJsonFiltered($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 81

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
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
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000001Z');
    $request->decimal = 3.141592653589793;
    $request->decimalStr = '3.14159265358979344719667586';
    $request->enum = Shared\Enum::One;
    $request->float32 = 1.1;
    $request->int = 1;
    $request->int32 = 1;
    $request->int32Enum = Shared\Int32Enum::FiftyFive;
    $request->intEnum = Shared\IntEnum::Second;
    $request->intOptNull = 387512;
    $request->num = 1.1;
    $request->numOptNull = 7875.71;
    $request->str = 'test';
    $request->strOpt = 'testOptional';

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonSimple($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 82

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Shared\SimpleObjectCamelCase();
    $request->anyVal = 'any example';
    $request->bigintStrVal = 'string';
    $request->bigintVal = 281697;
    $request->boolOptVal = true;
    $request->boolVal = true;
    $request->dateTimeVal = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00Z');
    $request->dateVal = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->decimalVal = 9976.38;
    $request->enumVal = Shared\Enum::One;
    $request->float32Val = 2.2222222;
    $request->int32EnumVal = Shared\Int32EnumVal::SixtyNine;
    $request->int32Val = 1;
    $request->intEnumVal = Shared\IntEnumVal::Second;
    $request->intOptNullVal = 999999;
    $request->intVal = 999999;
    $request->numOptNullVal = 1.1;
    $request->numVal = 1.1;
    $request->strOptVal = 'optional example';
    $request->strVal = 'example';

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonSimpleCamelCase($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 83

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Operations\RequestBodyPostComplexNumberTypesRequest();
    $request->complexNumberTypes = new Shared\ComplexNumberTypes();
    $request->complexNumberTypes->bigint = 765757;
    $request->complexNumberTypes->bigintStr = 'string';
    $request->complexNumberTypes->decimal = 9344.87;
    $request->complexNumberTypes->decimalStr = 'string';
    $request->pathBigInt = 250514;
    $request->pathBigIntStr = 'string';
    $request->pathDecimal = 6831.11;
    $request->pathDecimalStr = 'string';
    $request->queryBigInt = 500580;
    $request->queryBigIntStr = 'string';
    $request->queryDecimal = 7419.03;
    $request->queryDecimalStr = 'string';

    $response = $sdk->requestBodies->requestBodyPostComplexNumberTypes($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 84

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Shared\DefaultsAndConsts();
    $request->constBigInt = 559205;
    $request->constBigIntStr = 'string';
    $request->constBool = false;
    $request->constDate = DateTime::createFromFormat('Y-m-d', '2021-09-13');
    $request->constDateTime = DateTime::createFromFormat(
        'Y-m-d\TH:i:s+',
        '2022-12-15T04:16:08.794Z',
    );
    $request->constDecimal = 9160.69;
    $request->constDecimalStr = 'string';
    $request->constEnumInt = Shared\ConstEnumInt::One;
    $request->constEnumStr = Shared\ConstEnumStr::Three;
    $request->constInt = 299545;
    $request->constNum = 4612.63;
    $request->constStr = 'string';
    $request->constStrNull = 'string';
    $request->defaultBigInt = 450379;
    $request->defaultBigIntStr = 'string';
    $request->defaultBool = false;
    $request->defaultDate = DateTime::createFromFormat('Y-m-d', '2023-04-28');
    $request->defaultDateTime = DateTime::createFromFormat(
        'Y-m-d\TH:i:s+',
        '2021-10-01T11:08:55.738Z',
    );
    $request->defaultDecimal = 4585.94;
    $request->defaultDecimalStr = 'string';
    $request->defaultEnumInt = Shared\DefaultEnumInt::Two;
    $request->defaultEnumStr = Shared\DefaultEnumStr::One;
    $request->defaultInt = 788517;
    $request->defaultNum = 639.73;
    $request->defaultStr = 'string';
    $request->defaultStrNullable = 'string';
    $request->defaultStrOptional = 'string';
    $request->normalField = 'string';

    $response = $sdk->requestBodies->requestBodyPostDefaultsAndConsts($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 85

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Operations\RequestBodyPostEmptyObjectRequestBody();
    $request->empty = new Operations\EmptyT();
    $request->emptyWithEmptyProperties = new Operations\EmptyWithEmptyProperties();

    $response = $sdk->requestBodies->requestBodyPostEmptyObject($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 86

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Shared\DeepObject();
    $request->any = 'anyOf[0]';
    $request->arr = [new Shared\SimpleObject()];
    $request->bool = true;
    $request->int = 1;
    $request->map = [
        'and' => new Shared\SimpleObject(),
    ];
    $request->num = 1.1;
    $request->obj = new Shared\SimpleObject();
    $request->obj->any = 'any';
    $request->obj->bigint = 8821239038968084;
    $request->obj->bigintStr = '9223372036854775808';
    $request->obj->bool = true;
    $request->obj->boolOpt = true;
    $request->obj->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->obj->dateTime = DateTime::createFromFormat(
        'Y-m-d\TH:i:s+',
        '2020-01-01T00:00:00.000001Z',
    );
    $request->obj->decimal = 3.141592653589793;
    $request->obj->decimalStr = '3.14159265358979344719667586';
    $request->obj->enum = Shared\Enum::One;
    $request->obj->float32 = 1.1;
    $request->obj->int = 1;
    $request->obj->int32 = 1;
    $request->obj->int32Enum = Shared\Int32Enum::FiftyFive;
    $request->obj->intEnum = Shared\IntEnum::Third;
    $request->obj->intOptNull = 769249;
    $request->obj->num = 1.1;
    $request->obj->numOptNull = 482.42;
    $request->obj->str = 'test';
    $request->obj->strOpt = 'testOptional';
    $request->str = 'test';
    $request->type = 'string';

    $response = $sdk->requestBodies->requestBodyPostFormDeep($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 87

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = [
        'complexity' => 'string',
    ];

    $response = $sdk->requestBodies->requestBodyPostFormMapPrimitive($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 88

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
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
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000001Z');
    $request->decimal = 3.141592653589793;
    $request->decimalStr = '3.14159265358979344719667586';
    $request->enum = Shared\Enum::One;
    $request->float32 = 1.1;
    $request->int = 1;
    $request->int32 = 1;
    $request->int32Enum = Shared\Int32Enum::SixtyNine;
    $request->intEnum = Shared\IntEnum::First;
    $request->intOptNull = 5565;
    $request->num = 1.1;
    $request->numOptNull = 8893.53;
    $request->str = 'test';
    $request->strOpt = 'testOptional';

    $response = $sdk->requestBodies->requestBodyPostFormSimple($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 89

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = [564849];

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesArrayBigInt($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 90

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = [DateTime::createFromFormat('Y-m-d', '2022-03-22')];

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesArrayDate($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 91

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = ['string'];

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesArrayDecimalStr($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 92

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    687617;

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesBigInt($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 93

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    'string';

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesBigIntStr($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 94

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    false;

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesBoolean($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 95

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    DateTime::createFromFormat('Y-m-d', '2022-03-04');

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesDate($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 96

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    DateTime::createFromFormat('Y-m-d\TH:i:s+', '2023-03-04T01:33:15.031Z');

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesDateTime($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 97

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    1107.81;

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesDecimal($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 98

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    'string';

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesDecimalStr($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 99

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    4464.34;

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesFloat32($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 100

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    22155;

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesInt32($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 101

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    273673;

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesInteger($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 102

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = [
        'Nepal' => 'string',
    ];

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesMapBigIntStr($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 103

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = [
        'quantify' => DateTime::createFromFormat('Y-m-d\TH:i:s+', '2022-02-12T21:23:09.538Z'),
    ];

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesMapDateTime($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 104

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = [
        'Inverse' => 9134.24,
    ];

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesMapDecimal($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 105

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    2193.66;

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesNumber($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 106

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    'string';

    $response = $sdk->requestBodies->requestBodyPostJsonDataTypesString($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 107

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
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
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000001Z');
    $request->decimal = 3.141592653589793;
    $request->decimalStr = '3.14159265358979344719667586';
    $request->enum = Shared\Enum::One;
    $request->float32 = 1.1;
    $request->int = 1;
    $request->int32 = 1;
    $request->int32Enum = Shared\Int32Enum::FiftyFive;
    $request->intEnum = Shared\IntEnum::Third;
    $request->intOptNull = 587803;
    $request->num = 1.1;
    $request->numOptNull = 9724.14;
    $request->str = 'test';
    $request->strOpt = 'testOptional';

    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesComponentFiltered($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 108

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Operations\RequestBodyPostMultipleContentTypesInlineFilteredRequestBody();
    $request->bool = false;
    $request->num = 3558.41;
    $request->str = 'string';

    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesInlineFiltered($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 109

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $requestBody = new Operations\RequestBodyPostMultipleContentTypesSplitParamFormRequestBody();
    $requestBody->bool3 = false;
    $requestBody->num3 = 8693.24;
    $requestBody->str3 = 'string';

    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitParamForm(
        $requestBody,
        'string',
    );

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 110

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $requestBody = new Operations\RequestBodyPostMultipleContentTypesSplitParamJsonRequestBody();
    $requestBody->bool = false;
    $requestBody->num = 9771.91;
    $requestBody->str = 'string';

    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitParamJson(
        $requestBody,
        'string',
    );

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 111

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $requestBody = new Operations\RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody();
    $requestBody->bool2 = false;
    $requestBody->num2 = 7000.76;
    $requestBody->str2 = 'string';

    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitParamMultipart(
        $requestBody,
        'string',
    );

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 112

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Operations\RequestBodyPostMultipleContentTypesSplitFormRequestBody();
    $request->bool3 = false;
    $request->num3 = 7842.07;
    $request->str3 = 'string';

    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitForm($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 113

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Operations\RequestBodyPostMultipleContentTypesSplitJsonRequestBody();
    $request->bool = false;
    $request->num = 2445.56;
    $request->str = 'string';

    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitJson($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 114

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Operations\RequestBodyPostMultipleContentTypesSplitMultipartRequestBody();
    $request->bool2 = false;
    $request->num2 = 2079.2;
    $request->str2 = 'string';

    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitMultipart($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 115

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    'string';

    $response = $sdk->requestBodies->requestBodyPostNotNullableNotRequiredStringBody($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 116

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = ['string'];

    $response = $sdk->requestBodies->requestBodyPostNullArray($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 117

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = [
        'Intersex' => 'string',
    ];

    $response = $sdk->requestBodies->requestBodyPostNullDictionary($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 118

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    'string';

    $response = $sdk->requestBodies->requestBodyPostNullableNotRequiredStringBody($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 119

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    'string';

    $response = $sdk->requestBodies->requestBodyPostNullableRequiredStringBody($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 120

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    '0x5DbFFb1Ff9';

    $response = $sdk->requestBodies->requestBodyPutBytes($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 121

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->requestBodies->requestBodyPutBytesWithParams('0xC1B9cA4eb5', 'string');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 122

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Shared\DeepObject();
    $request->any = 'anyOf[0]';
    $request->arr = [new Shared\SimpleObject()];
    $request->bool = true;
    $request->int = 1;
    $request->map = [
        'Chevrolet' => new Shared\SimpleObject(),
    ];
    $request->num = 1.1;
    $request->obj = new Shared\SimpleObject();
    $request->obj->any = 'any';
    $request->obj->bigint = 8821239038968084;
    $request->obj->bigintStr = '9223372036854775808';
    $request->obj->bool = true;
    $request->obj->boolOpt = true;
    $request->obj->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->obj->dateTime = DateTime::createFromFormat(
        'Y-m-d\TH:i:s+',
        '2020-01-01T00:00:00.000001Z',
    );
    $request->obj->decimal = 3.141592653589793;
    $request->obj->decimalStr = '3.14159265358979344719667586';
    $request->obj->enum = Shared\Enum::One;
    $request->obj->float32 = 1.1;
    $request->obj->int = 1;
    $request->obj->int32 = 1;
    $request->obj->int32Enum = Shared\Int32Enum::OneHundredAndEightyOne;
    $request->obj->intEnum = Shared\IntEnum::Second;
    $request->obj->intOptNull = 731372;
    $request->obj->num = 1.1;
    $request->obj->numOptNull = 8739.03;
    $request->obj->str = 'test';
    $request->obj->strOpt = 'testOptional';
    $request->str = 'test';
    $request->type = 'string';

    $response = $sdk->requestBodies->requestBodyPutMultipartDeep($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 123

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Operations\RequestBodyPutMultipartDifferentFileNameRequestBody();
    $request->differentFileName = new Operations\DifferentFileName();
    $request->differentFileName->content = '0xdF19d43dd2';
    $request->differentFileName->fileName = 'west_tunisian.pdf';

    $response = $sdk->requestBodies->requestBodyPutMultipartDifferentFileName($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 124

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Operations\RequestBodyPutMultipartFileRequestBody();
    $request->file = new Operations\File();
    $request->file->content = '0xa9f2Ee38c3';
    $request->file->fileName = 'bandwidth_sedan.pdf';

    $response = $sdk->requestBodies->requestBodyPutMultipartFile($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 125

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
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
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00.000001Z');
    $request->decimal = 3.141592653589793;
    $request->decimalStr = '3.14159265358979344719667586';
    $request->enum = Shared\Enum::One;
    $request->float32 = 1.1;
    $request->int = 1;
    $request->int32 = 1;
    $request->int32Enum = Shared\Int32Enum::FiftyFive;
    $request->intEnum = Shared\IntEnum::Third;
    $request->intOptNull = 544005;
    $request->num = 1.1;
    $request->numOptNull = 7648.28;
    $request->str = 'test';
    $request->strOpt = 'testOptional';

    $response = $sdk->requestBodies->requestBodyPutMultipartSimple($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 126

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    'string';

    $response = $sdk->requestBodies->requestBodyPutString($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 127

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->requestBodies->requestBodyPutStringWithParams('string', 'string');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 128

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Shared\ReadWriteObject();
    $request->num1 = 797612;
    $request->num2 = 89374;
    $request->num3 = 459345;

    $response = $sdk->requestBodies->requestBodyReadAndWrite($request);

    if ($response->readWriteObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 129

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Shared\ReadOnlyObjectInput();

    $response = $sdk->requestBodies->requestBodyReadOnlyInput($request);

    if ($response->readOnlyObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 130

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    'string';

    $response = $sdk->requestBodies->requestBodyReadOnlyUnion($request);

    if ($response->weaklyTypedOneOfReadOnlyObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 131

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    'string';

    $response = $sdk->requestBodies->requestBodyReadWriteOnlyUnion($request);

    if ($response->weaklyTypedOneOfReadWriteObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 132

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Shared\WriteOnlyObject();
    $request->bool = false;
    $request->num = 3888.42;
    $request->string = 'string';

    $response = $sdk->requestBodies->requestBodyWriteOnly($request);

    if ($response->readOnlyObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 133

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Shared\WriteOnlyObject();
    $request->bool = false;
    $request->num = 3867.69;
    $request->string = 'string';

    $response = $sdk->requestBodies->requestBodyWriteOnlyOutput($request);

    if ($response->writeOnlyObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 134

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    'string';

    $response = $sdk->requestBodies->requestBodyWriteOnlyUnion($request);

    if ($response->weaklyTypedOneOfWriteOnlyObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 135

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = [
        'ASCII' => 'string',
    ];

    $response = $sdk->responseBodies->responseBodyAdditionalPropertiesComplexNumbersPost($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 136

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = [
        'Bedfordshire' => DateTime::createFromFormat('Y-m-d', '2021-04-22'),
    ];

    $response = $sdk->responseBodies->responseBodyAdditionalPropertiesDatePost($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 137

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = [
        'variant' => new Shared\SimpleObject(),
    ];

    $response = $sdk->responseBodies->responseBodyAdditionalPropertiesObjectPost($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 138

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = [
        'Ergonomic' => 'string',
    ];

    $response = $sdk->responseBodies->responseBodyAdditionalPropertiesPost($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 139

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->responseBodies->responseBodyBytesGet();

    if ($response->bytes !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 140

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->responseBodies->responseBodyEmptyWithHeaders(1751.8, 'string');

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 141

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->responseBodies->responseBodyOptionalGet();

    if ($response->typedObject1 !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 142

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->responseBodies->responseBodyReadOnly();

    if ($response->readOnlyObject !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 143

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->responseBodies->responseBodyStringGet();

    if ($response->html !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 144

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->responseBodies->responseBodyXmlGet();

    if ($response->xml !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 145

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Shared\ObjWithZeroValueComplexTypePtrs();
    $request->bigint = 438531;
    $request->bigintStr = 'string';
    $request->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2020-01-01T00:00:00Z');
    $request->decimal = 4843.38;

    $response = $sdk->responseBodies->responseBodyZeroValueComplexTypePtrsPost($request);

    if ($response->object !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 146

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->servers->selectGlobalServer();

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 147

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->servers->selectServerWithID();

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 148

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->servers->serverWithProtocolTemplate();

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 149

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->servers->serverWithTemplates();

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 150

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->servers->serverWithTemplatesGlobal();

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 151

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->servers->serversByIDWithTemplates();

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 152

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->telemetry->telemetrySpeakeasyUserAgentGet('string');

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 153

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->telemetry->telemetryUserAgentGet();

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 154

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Shared\AuthServiceRequestBody();
    $request->basicAuth = new Shared\BasicAuth();
    $request->basicAuth->password = 'owsGgP4_AhRPMSJ';
    $request->basicAuth->username = 'Devonte_Bins';
    $request->headerAuth = [new Shared\HeaderAuth()];

    $response = $sdk->authNew->apiKeyAuthGlobalNew($request);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 155

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Shared\AuthServiceRequestBody();
    $request->basicAuth = new Shared\BasicAuth();
    $request->basicAuth->password = 'xvJcf9GiJNr7T2x';
    $request->basicAuth->username = 'Cory33';
    $request->headerAuth = [new Shared\HeaderAuth()];

    $response = $sdk->authNew->authGlobal($request);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 156

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
    $request = new Shared\AuthServiceRequestBody();
    $request->basicAuth = new Shared\BasicAuth();
    $request->basicAuth->password = 'Z2OStPksFyrcGeu';
    $request->basicAuth->username = 'Ashton.Steuber27';
    $request->headerAuth = [new Shared\HeaderAuth()];

    $requestSecurity = new Operations\BasicAuthNewSecurity();
    $requestSecurity->password = 'YOUR_PASSWORD';
    $requestSecurity->username = 'YOUR_USERNAME';

    $response = $sdk->authNew->basicAuthNew($request, $requestSecurity);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 157

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
    $request = new Shared\AuthServiceRequestBody();
    $request->basicAuth = new Shared\BasicAuth();
    $request->basicAuth->password = 'Iq1JSzG1wqLDz4v';
    $request->basicAuth->username = 'Ismael.Emmerich';
    $request->headerAuth = [new Shared\HeaderAuth()];

    $requestSecurity = new Operations\MultipleMixedOptionsAuthSecurity();
    $requestSecurity->apiKeyAuthNew = 'Token <YOUR_API_KEY>';

    $response = $sdk->authNew->multipleMixedOptionsAuth($request, $requestSecurity);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 158

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
    $request = new Shared\AuthServiceRequestBody();
    $request->basicAuth = new Shared\BasicAuth();
    $request->basicAuth->password = 'OcWVV5608IiaWJQ';
    $request->basicAuth->username = 'Kameron42';
    $request->headerAuth = [new Shared\HeaderAuth()];

    $requestSecurity = new Operations\MultipleMixedSchemeAuthSecurity();
    $requestSecurity->apiKeyAuthNew = 'Token <YOUR_API_KEY>';
    $requestSecurity->basicAuth->password = 'YOUR_PASSWORD';
    $requestSecurity->basicAuth->username = 'YOUR_USERNAME';

    $response = $sdk->authNew->multipleMixedSchemeAuth($request, $requestSecurity);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 159

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
    $request = new Shared\AuthServiceRequestBody();
    $request->basicAuth = new Shared\BasicAuth();
    $request->basicAuth->password = 'fpwNE90MyqKIrXk';
    $request->basicAuth->username = 'Caroline_Walsh';
    $request->headerAuth = [new Shared\HeaderAuth()];

    $requestSecurity = new Operations\MultipleOptionsWithMixedSchemesAuthSecurity();
    $requestSecurity->option1 = new Operations\MultipleOptionsWithMixedSchemesAuthSecurityOption1();
    $requestSecurity->option1->apiKeyAuthNew = 'Token <YOUR_API_KEY>';
    $requestSecurity->option1->oauth2 = 'Bearer YOUR_OAUTH2_TOKEN';

    $response = $sdk->authNew->multipleOptionsWithMixedSchemesAuth($request, $requestSecurity);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 160

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
    $request = new Shared\AuthServiceRequestBody();
    $request->basicAuth = new Shared\BasicAuth();
    $request->basicAuth->password = 'pibxDTiJSijK04Y';
    $request->basicAuth->username = 'Selena76';
    $request->headerAuth = [new Shared\HeaderAuth()];

    $requestSecurity = new Operations\MultipleOptionsWithSimpleSchemesAuthSecurity();
    $requestSecurity->option1 = new Operations\MultipleOptionsWithSimpleSchemesAuthSecurityOption1();
    $requestSecurity->option1->apiKeyAuthNew = 'Token <YOUR_API_KEY>';
    $requestSecurity->option1->oauth2 = 'Bearer YOUR_OAUTH2_TOKEN';

    $response = $sdk->authNew->multipleOptionsWithSimpleSchemesAuth($request, $requestSecurity);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 161

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
    $request = new Shared\AuthServiceRequestBody();
    $request->basicAuth = new Shared\BasicAuth();
    $request->basicAuth->password = 'pzdKQgSGZSrUGNs';
    $request->basicAuth->username = 'Eryn51';
    $request->headerAuth = [new Shared\HeaderAuth()];

    $requestSecurity = new Operations\MultipleSimpleOptionsAuthSecurity();
    $requestSecurity->apiKeyAuthNew = 'Token <YOUR_API_KEY>';

    $response = $sdk->authNew->multipleSimpleOptionsAuth($request, $requestSecurity);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 162

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
    $request = new Shared\AuthServiceRequestBody();
    $request->basicAuth = new Shared\BasicAuth();
    $request->basicAuth->password = 'UrAsw466AAaYtr1';
    $request->basicAuth->username = 'Kenya.Baumbach';
    $request->headerAuth = [new Shared\HeaderAuth()];

    $requestSecurity = new Operations\MultipleSimpleSchemeAuthSecurity();
    $requestSecurity->apiKeyAuthNew = 'Token <YOUR_API_KEY>';
    $requestSecurity->oauth2 = 'Bearer YOUR_OAUTH2_TOKEN';

    $response = $sdk->authNew->multipleSimpleSchemeAuth($request, $requestSecurity);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 163

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
    $request = new Shared\AuthServiceRequestBody();
    $request->basicAuth = new Shared\BasicAuth();
    $request->basicAuth->password = 'V02sHy2onRTMRgS';
    $request->basicAuth->username = 'Polly.Aufderhar78';
    $request->headerAuth = [new Shared\HeaderAuth()];

    $requestSecurity = new Operations\Oauth2AuthNewSecurity();
    $requestSecurity->oauth2 = 'Bearer YOUR_OAUTH2_TOKEN';

    $response = $sdk->authNew->oauth2AuthNew($request, $requestSecurity);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 164

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
    $request = new Shared\AuthServiceRequestBody();
    $request->basicAuth = new Shared\BasicAuth();
    $request->basicAuth->password = '1_B3hNdr8HC3AeS';
    $request->basicAuth->username = 'Floy_Heller';
    $request->headerAuth = [new Shared\HeaderAuth()];

    $requestSecurity = new Operations\OpenIdConnectAuthNewSecurity();
    $requestSecurity->openIdConnect = 'Bearer YOUR_OPENID_TOKEN';

    $response = $sdk->authNew->openIdConnectAuthNew($request, $requestSecurity);

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 165

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
    $requestSecurity = new Operations\ApiKeyAuthSecurity();
    $requestSecurity->apiKeyAuth = 'Token YOUR_API_KEY';

    $response = $sdk->auth->apiKeyAuth($requestSecurity);

    if ($response->token !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 166

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->auth->apiKeyAuthGlobal();

    if ($response->token !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 167

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
    $requestSecurity = new Operations\BasicAuthSecurity();
    $requestSecurity->password = 'YOUR_PASSWORD';
    $requestSecurity->username = 'YOUR_USERNAME';

    $response = $sdk->auth->basicAuth($requestSecurity, 'string', 'string');

    if ($response->user !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 168

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
    $requestSecurity = new Operations\BearerAuthSecurity();
    $requestSecurity->bearerAuth = 'YOUR_JWT';

    $response = $sdk->auth->bearerAuth($requestSecurity);

    if ($response->token !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 169

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->auth->globalBearerAuth();

    if ($response->token !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 170

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
    $requestSecurity = new Operations\Oauth2AuthSecurity();
    $requestSecurity->oauth2 = 'Bearer YOUR_OAUTH2_TOKEN';

    $response = $sdk->auth->oauth2Auth($requestSecurity);

    if ($response->token !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 171

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
    $requestSecurity = new Operations\Oauth2OverrideSecurity();
    $requestSecurity->oauth2 = 'Bearer YOUR_OAUTH2_TOKEN';

    $response = $sdk->auth->oauth2Override($requestSecurity);

    if ($response->token !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 172

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->build();

try {
    $requestSecurity = new Operations\OpenIdConnectAuthSecurity();
    $requestSecurity->openIdConnect = 'Bearer YOUR_OPENID_TOKEN';

    $response = $sdk->auth->openIdConnectAuth($requestSecurity);

    if ($response->token !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 173

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->documentation->getDocumentationPerLanguage('string');

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 174

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Operations\CreateFileRequestBody();
    $request->file = new Operations\CreateFileFile();
    $request->file->content = '0xf10df1a3b9';
    $request->file->fileName = 'rap_national.mp4v';

    $response = $sdk->resource->createFile($request);

    if ($response->fileResource !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 175

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Shared\ExampleResource();
    $request->arrayOfNumber = [1867.47];
    $request->arrayOfString = ['string'];
    $request->chocolates = [new Shared\Chocolates()];
    $request->createdAt = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2023-03-21T05:07:13.653Z');
    $request->enumNumber = Shared\EnumNumber::One;
    $request->enumStr = Shared\EnumStr::One;
    $request->id = '<ID>';
    $request->inlineObject = new Shared\InlineObject();
    $request->inlineObject->inlineName = 'string';
    $request->mapOfInteger = [
        'Unbranded' => 967142,
    ];
    $request->mapOfString = [
        'Elmo' => 'string',
    ];
    $request->name = 'string';
    $request->namePrefix = 'string';
    $request->updatedAt = DateTime::createFromFormat('Y-m-d\TH:i:s+', '2022-06-22T17:48:04.355Z');
    $request->vehicle = 'string';

    $response = $sdk->resource->createResource($request);

    if ($response->exampleResource !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 176

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->resource->deleteResource('string');

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 177

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->resource->getResource('string');

    if ($response->exampleResource !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 178

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->resource->updateResource('string');

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 179

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->first->get();

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 180

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->second->get();

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 181

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Operations\PaginationCursorBodyRequestBody();
    $request->cursor = 868337;

    $response = $sdk->pagination->paginationCursorBody($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 182

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->pagination->paginationCursorParams(24812);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 183

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Shared\LimitOffsetConfig();
    $request->limit = 189971;
    $request->offset = 995974;
    $request->page = 329413;

    $response = $sdk->pagination->paginationLimitOffsetOffsetBody($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 184

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->pagination->paginationLimitOffsetOffsetParams(661976, 600173);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 185

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $request = new Shared\LimitOffsetConfig();
    $request->limit = 479052;
    $request->offset = 716379;
    $request->page = 911806;

    $response = $sdk->pagination->paginationLimitOffsetPageBody($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 186

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->pagination->paginationLimitOffsetPageParams(1177);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Example 187

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->retries->retriesGet('string', 75342);

    if ($response->retries !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}

```

### Second

Do this second

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

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
    $request->requestBody->fakerFormattedStrings->ipv6Format =
        '36a9:c057:a71b:b73a:c9ee:2348:d76c:3164';
    $request->requestBody->fakerFormattedStrings->jsonFormat =
        '{key: 66681, key1: null, key2: "string"}';
    $request->requestBody->fakerFormattedStrings->macFormat = '25:8b:e7:e1:35:86';
    $request->requestBody->fakerFormattedStrings->passwordFormat = 'IKpiCb6eWzdveK0';
    $request->requestBody->fakerFormattedStrings->phoneFormat = '1-803-587-3283';
    $request->requestBody->fakerFormattedStrings->timezoneFormat = 'America/Argentina/Buenos_Aires';
    $request->requestBody->fakerFormattedStrings->unknownFormat = 'string';
    $request->requestBody->fakerFormattedStrings->urlFormat = 'http://beneficial-inconvenience.net';
    $request->requestBody->fakerFormattedStrings->uuidFormat =
        '342442b8-aff3-42e0-b62d-e2e2d47a9bf1';
    $request->requestBody->fakerFormattedStrings->zipcodeFormat = '09432';
    $request->requestBody->fakerStrings = new Shared\FakerStrings();
    $request->requestBody->fakerStrings->city = 'McLaughlinchester';
    $request->requestBody->fakerStrings->iban = 'TL232743267267003560099';
    $request->requestBody->fakerStrings->id = '<ID>';
    $request->requestBody->fakerStrings->iPv4 = '208.201.244.247';
    $request->requestBody->fakerStrings->iPv6 = 'bd3a:d72b:208b:2c81:8830:8bb9:7902:374e';
    $request->requestBody->fakerStrings->account = '65982652';
    $request->requestBody->fakerStrings->address = '0010 Assunta Throughway';
    $request->requestBody->fakerStrings->amount = '616.94';
    $request->requestBody->fakerStrings->avatar = 'https://loremflickr.com/640/480';
    $request->requestBody->fakerStrings->color = 'tan';
    $request->requestBody->fakerStrings->comment =
        'New range of formal shirts are designed keeping you in mind. With fits and styling that will make you stand apart';
    $request->requestBody->fakerStrings->company = 'Volkman LLC';
    $request->requestBody->fakerStrings->country = 'Nicaragua';
    $request->requestBody->fakerStrings->countryCode = 'MO';
    $request->requestBody->fakerStrings->currency = 'Canadian Dollar';
    $request->requestBody->fakerStrings->datatype = 'point';
    $request->requestBody->fakerStrings->default = 'string';
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
    $request->requestBody->fakerStrings->json = '{key: 95274, key1: null, key2: "string"}';
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
        '2020-01-01T00:00:00.000001Z',
    );
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
    $request->bigintStrParameter = 'string';
    $request->bigintStrParameterOptional = 'string';
    $request->boolParameter = false;
    $request->dateParameter = DateTime::createFromFormat('Y-m-d', '2023-12-21');
    $request->dateTimeDefaultParameter = DateTime::createFromFormat(
        'Y-m-d\TH:i:s+',
        '2021-03-16T01:25:42.471Z',
    );
    $request->dateTimeParameter = DateTime::createFromFormat(
        'Y-m-d\TH:i:s+',
        '2023-05-24T07:01:53.326Z',
    );
    $request->decimalParameter = 4713.96;
    $request->decimalParameterOptional = 9349.54;
    $request->decimalStrParameter = 'string';
    $request->decimalStrParameterOptional = 'string';
    $request->doubleParameter = 8700.78;
    $request->enumParameter = Operations\EnumParameter::Value2;
    $request->falseyNumberParameter = 0;
    $request->float32Parameter = 1341.86;
    $request->floatParameter = 5429.24;
    $request->int64Parameter = 101970;
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
} catch (Exception $e) {
    // handle exception
}

```
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

### [SDK](docs/sdks/sdk/README.md)

* [putAnythingIgnoredGeneration](docs/sdks/sdk/README.md#putanythingignoredgeneration)
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

### [Errors](docs/sdks/errors/README.md)

* [connectionErrorGet](docs/sdks/errors/README.md#connectionerrorget)
* [statusGetError](docs/sdks/errors/README.md#statusgeterror)
* [statusGetXSpeakeasyErrors](docs/sdks/errors/README.md#statusgetxspeakeasyerrors)

### [Unions](docs/sdks/unions/README.md)

* [flattenedTypedObjectPost](docs/sdks/unions/README.md#flattenedtypedobjectpost)
* [mixedTypeOneOfPost](docs/sdks/unions/README.md#mixedtypeoneofpost)
* [nullableOneOfRefInObjectPost](docs/sdks/unions/README.md#nullableoneofrefinobjectpost)
* [nullableOneOfSchemaPost](docs/sdks/unions/README.md#nullableoneofschemapost)
* [nullableOneOfTypeInObjectPost](docs/sdks/unions/README.md#nullableoneoftypeinobjectpost)
* [nullableTypedObjectPost](docs/sdks/unions/README.md#nullabletypedobjectpost)
* [primitiveTypeOneOfPost](docs/sdks/unions/README.md#primitivetypeoneofpost)
* [stronglyTypedOneOfPost](docs/sdks/unions/README.md#stronglytypedoneofpost)
* [typedObjectNullableOneOfPost](docs/sdks/unions/README.md#typedobjectnullableoneofpost)
* [typedObjectOneOfPost](docs/sdks/unions/README.md#typedobjectoneofpost)
* [unionBigIntDecimal](docs/sdks/unions/README.md#unionbigintdecimal)
* [unionDateNull](docs/sdks/unions/README.md#uniondatenull)
* [unionDateTimeBigInt](docs/sdks/unions/README.md#uniondatetimebigint)
* [unionDateTimeNull](docs/sdks/unions/README.md#uniondatetimenull)
* [weaklyTypedOneOfPost](docs/sdks/unions/README.md#weaklytypedoneofpost)

### [Flattening](docs/sdks/flattening/README.md)

* [componentBodyAndParamConflict](docs/sdks/flattening/README.md#componentbodyandparamconflict)
* [componentBodyAndParamNoConflict](docs/sdks/flattening/README.md#componentbodyandparamnoconflict)
* [conflictingParams](docs/sdks/flattening/README.md#conflictingparams)
* [inlineBodyAndParamConflict](docs/sdks/flattening/README.md#inlinebodyandparamconflict)
* [inlineBodyAndParamNoConflict](docs/sdks/flattening/README.md#inlinebodyandparamnoconflict)

### [Globals](docs/sdks/globals/README.md)

* [globalPathParameterGet](docs/sdks/globals/README.md#globalpathparameterget)
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
* [mixedParametersCamelCase](docs/sdks/parameters/README.md#mixedparameterscamelcase)
* [mixedParametersPrimitives](docs/sdks/parameters/README.md#mixedparametersprimitives)
* [mixedQueryParams](docs/sdks/parameters/README.md#mixedqueryparams)
* [pathParameterJson](docs/sdks/parameters/README.md#pathparameterjson)
* [pipeDelimitedQueryParamsArray](docs/sdks/parameters/README.md#pipedelimitedqueryparamsarray)
* [simplePathParameterArrays](docs/sdks/parameters/README.md#simplepathparameterarrays)
* [simplePathParameterMaps](docs/sdks/parameters/README.md#simplepathparametermaps)
* [simplePathParameterObjects](docs/sdks/parameters/README.md#simplepathparameterobjects)
* [simplePathParameterPrimitives](docs/sdks/parameters/README.md#simplepathparameterprimitives)

### [NestFirst](docs/sdks/nestfirst/README.md)

* [get](docs/sdks/nestfirst/README.md#get)

### [Nested](docs/sdks/nested/README.md)

* [get](docs/sdks/nested/README.md#get)

### [NestedFirst](docs/sdks/nestedfirst/README.md)

* [get](docs/sdks/nestedfirst/README.md#get)

### [NestedSecond](docs/sdks/nestedsecond/README.md)

* [get](docs/sdks/nestedsecond/README.md#get)

### [RequestBodies](docs/sdks/requestbodies/README.md)

* [nullableObjectPost](docs/sdks/requestbodies/README.md#nullableobjectpost)
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

### [ResponseBodies](docs/sdks/responsebodies/README.md)

* [responseBodyAdditionalPropertiesComplexNumbersPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiescomplexnumberspost)
* [responseBodyAdditionalPropertiesDatePost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiesdatepost)
* [responseBodyAdditionalPropertiesObjectPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiesobjectpost)
* [responseBodyAdditionalPropertiesPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiespost)
* [responseBodyBytesGet](docs/sdks/responsebodies/README.md#responsebodybytesget)
* [responseBodyEmptyWithHeaders](docs/sdks/responsebodies/README.md#responsebodyemptywithheaders)
* [responseBodyOptionalGet](docs/sdks/responsebodies/README.md#responsebodyoptionalget)
* [responseBodyReadOnly](docs/sdks/responsebodies/README.md#responsebodyreadonly)
* [responseBodyStringGet](docs/sdks/responsebodies/README.md#responsebodystringget)
* [responseBodyXmlGet](docs/sdks/responsebodies/README.md#responsebodyxmlget)
* [responseBodyZeroValueComplexTypePtrsPost](docs/sdks/responsebodies/README.md#responsebodyzerovaluecomplextypeptrspost)

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

* [apiKeyAuthGlobalNew](docs/sdks/authnew/README.md#apikeyauthglobalnew)
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

### [Auth](docs/sdks/auth/README.md)

* [apiKeyAuth](docs/sdks/auth/README.md#apikeyauth)
* [apiKeyAuthGlobal](docs/sdks/auth/README.md#apikeyauthglobal)
* [basicAuth](docs/sdks/auth/README.md#basicauth)
* [bearerAuth](docs/sdks/auth/README.md#bearerauth)
* [globalBearerAuth](docs/sdks/auth/README.md#globalbearerauth)
* [oauth2Auth](docs/sdks/auth/README.md#oauth2auth)
* [oauth2Override](docs/sdks/auth/README.md#oauth2override)
* [openIdConnectAuth](docs/sdks/auth/README.md#openidconnectauth)

### [Documentation](docs/sdks/documentation/README.md)

* [getDocumentationPerLanguage](docs/sdks/documentation/README.md#getdocumentationperlanguage) - Gets documentation for some language, I guess.

### [Resource](docs/sdks/resource/README.md)

* [createFile](docs/sdks/resource/README.md#createfile)
* [createResource](docs/sdks/resource/README.md#createresource)
* [deleteResource](docs/sdks/resource/README.md#deleteresource)
* [getResource](docs/sdks/resource/README.md#getresource)
* [updateResource](docs/sdks/resource/README.md#updateresource)

### [First](docs/sdks/first/README.md)

* [get](docs/sdks/first/README.md#get)

### [Second](docs/sdks/second/README.md)

* [get](docs/sdks/second/README.md#get)

### [Pagination](docs/sdks/pagination/README.md)

* [paginationCursorBody](docs/sdks/pagination/README.md#paginationcursorbody)
* [paginationCursorParams](docs/sdks/pagination/README.md#paginationcursorparams)
* [paginationLimitOffsetOffsetBody](docs/sdks/pagination/README.md#paginationlimitoffsetoffsetbody)
* [paginationLimitOffsetOffsetParams](docs/sdks/pagination/README.md#paginationlimitoffsetoffsetparams)
* [paginationLimitOffsetPageBody](docs/sdks/pagination/README.md#paginationlimitoffsetpagebody)
* [paginationLimitOffsetPageParams](docs/sdks/pagination/README.md#paginationlimitoffsetpageparams)

### [Retries](docs/sdks/retries/README.md)

* [retriesGet](docs/sdks/retries/README.md#retriesget)
<!-- End Available Resources and Operations [operations] -->





<!-- Start Global Parameters [global-parameters] -->
## Global Parameters

Certain parameters are configured globally. These parameters must be set on the SDK client instance itself during initialization. When configured as an option during SDK initialization, These global values will be used as defaults on the operations that use them. When such operations are called, there is a place in each to override the global value, if needed.

For example, you can set `globalPathParam` to `100` at SDK initialization and then you do not have to pass the same value on calls to operations like `globalPathParameterGet`. But if you want to do so you may, which will locally override the global setting. See the example code below for a demonstration.


### Available Globals

The following global parameters are available. The required parameters must be set when you initialize the SDK client.

| Name | Type | Required | Description |
| ---- | ---- |:--------:| ----------- |
| globalPathParam | int | ✔️ | The globalPathParam parameter. |
| globalQueryParam | string | ✔️ | The globalQueryParam parameter. |


### Example

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;
use OpenAPI\OpenAPI\Models\Operations;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->globals->globalPathParameterGet(719830);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
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
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI;
use OpenAPI\OpenAPI\Models\Shared;

$security = new Shared\Security();
$security->apiKeyAuth = 'Token YOUR_API_KEY';

$sdk = OpenAPI\SDK::builder()
    ->setGlobalPathParam(100)
    ->setGlobalQueryParam('some example global query param')
    ->setSecurity($security)
    ->build();

try {
    $response = $sdk->errors->connectionErrorGet('http://somebrokenapi.broken');

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
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
