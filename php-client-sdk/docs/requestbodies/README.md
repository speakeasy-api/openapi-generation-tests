# requestBodies

## Overview

Endpoints for testing request bodies.

### Available Operations

* [requestBodyPostApplicationJsonArray](#requestbodypostapplicationjsonarray)
* [requestBodyPostApplicationJsonArrayObj](#requestbodypostapplicationjsonarrayobj)
* [requestBodyPostApplicationJsonArrayOfArray](#requestbodypostapplicationjsonarrayofarray)
* [requestBodyPostApplicationJsonArrayOfArrayOfPrimitive](#requestbodypostapplicationjsonarrayofarrayofprimitive)
* [requestBodyPostApplicationJsonArrayOfMap](#requestbodypostapplicationjsonarrayofmap)
* [requestBodyPostApplicationJsonArrayOfPrimitive](#requestbodypostapplicationjsonarrayofprimitive)
* [requestBodyPostApplicationJsonDeep](#requestbodypostapplicationjsondeep)
* [requestBodyPostApplicationJsonMap](#requestbodypostapplicationjsonmap)
* [requestBodyPostApplicationJsonMapObj](#requestbodypostapplicationjsonmapobj)
* [requestBodyPostApplicationJsonMapOfArray](#requestbodypostapplicationjsonmapofarray)
* [requestBodyPostApplicationJsonMapOfMap](#requestbodypostapplicationjsonmapofmap)
* [requestBodyPostApplicationJsonMapOfMapOfPrimitive](#requestbodypostapplicationjsonmapofmapofprimitive)
* [requestBodyPostApplicationJsonMapOfPrimitive](#requestbodypostapplicationjsonmapofprimitive)
* [requestBodyPostApplicationJsonMultipleJsonFiltered](#requestbodypostapplicationjsonmultiplejsonfiltered)
* [requestBodyPostApplicationJsonSimple](#requestbodypostapplicationjsonsimple)
* [requestBodyPostFormDeep](#requestbodypostformdeep)
* [requestBodyPostFormMapPrimitive](#requestbodypostformmapprimitive)
* [requestBodyPostFormSimple](#requestbodypostformsimple)
* [requestBodyPostMultipleContentTypesComponentFiltered](#requestbodypostmultiplecontenttypescomponentfiltered)
* [requestBodyPostMultipleContentTypesInlineFiltered](#requestbodypostmultiplecontenttypesinlinefiltered)
* [requestBodyPostMultipleContentTypesSplitParamForm](#requestbodypostmultiplecontenttypessplitparamform)
* [requestBodyPostMultipleContentTypesSplitParamJson](#requestbodypostmultiplecontenttypessplitparamjson)
* [requestBodyPostMultipleContentTypesSplitParamMultipart](#requestbodypostmultiplecontenttypessplitparammultipart)
* [requestBodyPostMultipleContentTypesSplitForm](#requestbodypostmultiplecontenttypessplitform)
* [requestBodyPostMultipleContentTypesSplitJson](#requestbodypostmultiplecontenttypessplitjson)
* [requestBodyPostMultipleContentTypesSplitMultipart](#requestbodypostmultiplecontenttypessplitmultipart)
* [requestBodyPutBytes](#requestbodyputbytes)
* [requestBodyPutMultipartDeep](#requestbodyputmultipartdeep)
* [requestBodyPutMultipartFile](#requestbodyputmultipartfile)
* [requestBodyPutMultipartSimple](#requestbodyputmultipartsimple)
* [requestBodyPutString](#requestbodyputstring)

## requestBodyPostApplicationJsonArray

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnumEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = [
        new SimpleObject(),
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArray($request);

    if ($response->simpleObjects !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## requestBodyPostApplicationJsonArrayObj

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnumEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = [
        new SimpleObject(),
        new SimpleObject(),
        new SimpleObject(),
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayObj($request);

    if ($response->arrObjValue !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## requestBodyPostApplicationJsonArrayOfArray

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnumEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = [
        [
            new SimpleObject(),
            new SimpleObject(),
            new SimpleObject(),
        ],
        [
            new SimpleObject(),
            new SimpleObject(),
            new SimpleObject(),
            new SimpleObject(),
        ],
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfArray($request);

    if ($response->arrs !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## requestBodyPostApplicationJsonArrayOfArrayOfPrimitive

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
    $request = [
        [
            'omnis',
            'quis',
            'ipsum',
            'delectus',
        ],
        [
            'consectetur',
            'vero',
        ],
        [
            'dignissimos',
            'hic',
            'distinctio',
            'quod',
        ],
        [
            'similique',
            'facilis',
        ],
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfArrayOfPrimitive($request);

    if ($response->arrs !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## requestBodyPostApplicationJsonArrayOfMap

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnumEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = [
        [
            'dolore' => new SimpleObject(),
            'quibusdam' => new SimpleObject(),
        ],
        [
            'sequi' => new SimpleObject(),
            'natus' => new SimpleObject(),
            'impedit' => new SimpleObject(),
            'aut' => new SimpleObject(),
        ],
        [
            'exercitationem' => new SimpleObject(),
            'nulla' => new SimpleObject(),
            'fugit' => new SimpleObject(),
            'porro' => new SimpleObject(),
        ],
        [
            'doloribus' => new SimpleObject(),
            'iusto' => new SimpleObject(),
            'eligendi' => new SimpleObject(),
            'ducimus' => new SimpleObject(),
        ],
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfMap($request);

    if ($response->maps !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## requestBodyPostApplicationJsonArrayOfPrimitive

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
    $request = [
        'officia',
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfPrimitive($request);

    if ($response->strings !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## requestBodyPostApplicationJsonDeep

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\DeepObject;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnumEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = new DeepObject();
    $request->any = new SimpleObject();
    $request->any->any = 'ipsam';
    $request->any->bigint = 410492;
    $request->any->bigintStr = 'aspernatur';
    $request->any->bool = true;
    $request->any->boolOpt = true;
    $request->any->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->any->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->any->enum = EnumEnum::TWO;
    $request->any->float32 = 2.2222222;
    $request->any->int = 999999;
    $request->any->int32 = 1;
    $request->any->int32Enum = SimpleObjectInt32EnumEnum::SIXTY_NINE;
    $request->any->intEnum = SimpleObjectIntEnumEnum::Third;
    $request->any->intOptNull = 999999;
    $request->any->num = 1.1;
    $request->any->numOptNull = 1.1;
    $request->any->str = 'example';
    $request->any->strOpt = 'optional example';
    $request->arr = [
        new SimpleObject(),
        new SimpleObject(),
    ];
    $request->bool = false;
    $request->int = 189848;
    $request->map = [
        'laudantium' => new SimpleObject(),
        'dicta' => new SimpleObject(),
    ];
    $request->num = 2243.17;
    $request->obj = new SimpleObject();
    $request->obj->any = 'maiores';
    $request->obj->bigint = 97844;
    $request->obj->bigintStr = 'ex';
    $request->obj->bool = true;
    $request->obj->boolOpt = true;
    $request->obj->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->obj->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->obj->enum = EnumEnum::TWO;
    $request->obj->float32 = 2.2222222;
    $request->obj->int = 999999;
    $request->obj->int32 = 1;
    $request->obj->int32Enum = SimpleObjectInt32EnumEnum::ONE_HUNDRED_AND_EIGHTY_ONE;
    $request->obj->intEnum = SimpleObjectIntEnumEnum::Second;
    $request->obj->intOptNull = 999999;
    $request->obj->num = 1.1;
    $request->obj->numOptNull = 1.1;
    $request->obj->str = 'example';
    $request->obj->strOpt = 'optional example';
    $request->str = 'voluptatibus';
    $request->type = 'nostrum';

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonDeep($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## requestBodyPostApplicationJsonMap

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnumEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = [
        'quisquam' => new SimpleObject(),
        'saepe' => new SimpleObject(),
        'ea' => new SimpleObject(),
        'impedit' => new SimpleObject(),
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMap($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## requestBodyPostApplicationJsonMapObj

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnumEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = [
        'veniam' => new SimpleObject(),
        'aliquid' => new SimpleObject(),
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapObj($request);

    if ($response->mapObjValue !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## requestBodyPostApplicationJsonMapOfArray

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnumEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = [
        'magnam' => [
            new SimpleObject(),
            new SimpleObject(),
        ],
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfArray($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## requestBodyPostApplicationJsonMapOfMap

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnumEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = [
        'consectetur' => [
            'aspernatur' => new SimpleObject(),
            'minima' => new SimpleObject(),
            'eaque' => new SimpleObject(),
            'a' => new SimpleObject(),
        ],
        'libero' => [
            'aut' => new SimpleObject(),
        ],
        'deleniti' => [
            'aliquam' => new SimpleObject(),
            'fugit' => new SimpleObject(),
            'accusamus' => new SimpleObject(),
            'inventore' => new SimpleObject(),
        ],
        'non' => [
            'dolorum' => new SimpleObject(),
        ],
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfMap($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## requestBodyPostApplicationJsonMapOfMapOfPrimitive

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
    $request = [
        'placeat' => [
            'eum' => 'autem',
        ],
        'nobis' => [
            'assumenda' => 'nulla',
            'voluptas' => 'libero',
            'quasi' => 'tempora',
        ],
        'numquam' => [
            'provident' => 'ipsa',
        ],
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfMapOfPrimitive($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## requestBodyPostApplicationJsonMapOfPrimitive

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
    $request = [
        'magnam' => 'odio',
        'eius' => 'esse',
    ]

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfPrimitive($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## requestBodyPostApplicationJsonMultipleJsonFiltered

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnumEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = new SimpleObject();
    $request->any = 'esse';
    $request->bigint = 524593;
    $request->bigintStr = 'fuga';
    $request->bool = true;
    $request->boolOpt = true;
    $request->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->enum = EnumEnum::TWO;
    $request->float32 = 2.2222222;
    $request->int = 999999;
    $request->int32 = 1;
    $request->int32Enum = SimpleObjectInt32EnumEnum::SIXTY_NINE;
    $request->intEnum = SimpleObjectIntEnumEnum::Third;
    $request->intOptNull = 999999;
    $request->num = 1.1;
    $request->numOptNull = 1.1;
    $request->str = 'example';
    $request->strOpt = 'optional example';

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonMultipleJsonFiltered($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## requestBodyPostApplicationJsonSimple

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnumEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = new SimpleObject();
    $request->any = 'fugiat';
    $request->bigint = 283519;
    $request->bigintStr = 'eum';
    $request->bool = true;
    $request->boolOpt = true;
    $request->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->enum = EnumEnum::TWO;
    $request->float32 = 2.2222222;
    $request->int = 999999;
    $request->int32 = 1;
    $request->int32Enum = SimpleObjectInt32EnumEnum::SIXTY_NINE;
    $request->intEnum = SimpleObjectIntEnumEnum::Third;
    $request->intOptNull = 999999;
    $request->num = 1.1;
    $request->numOptNull = 1.1;
    $request->str = 'example';
    $request->strOpt = 'optional example';

    $response = $sdk->requestBodies->requestBodyPostApplicationJsonSimple($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## requestBodyPostFormDeep

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\DeepObject;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnumEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = new DeepObject();
    $request->any = new SimpleObject();
    $request->any->any = 'praesentium';
    $request->any->bigint = 788546;
    $request->any->bigintStr = 'veritatis';
    $request->any->bool = true;
    $request->any->boolOpt = true;
    $request->any->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->any->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->any->enum = EnumEnum::TWO;
    $request->any->float32 = 2.2222222;
    $request->any->int = 999999;
    $request->any->int32 = 1;
    $request->any->int32Enum = SimpleObjectInt32EnumEnum::FIFTY_FIVE;
    $request->any->intEnum = SimpleObjectIntEnumEnum::Second;
    $request->any->intOptNull = 999999;
    $request->any->num = 1.1;
    $request->any->numOptNull = 1.1;
    $request->any->str = 'example';
    $request->any->strOpt = 'optional example';
    $request->arr = [
        new SimpleObject(),
        new SimpleObject(),
        new SimpleObject(),
    ];
    $request->bool = false;
    $request->int = 206594;
    $request->map = [
        'illum' => new SimpleObject(),
        'quo' => new SimpleObject(),
        'fuga' => new SimpleObject(),
        'eius' => new SimpleObject(),
    ];
    $request->num = 1783.67;
    $request->obj = new SimpleObject();
    $request->obj->any = 'voluptas';
    $request->obj->bigint = 69859;
    $request->obj->bigintStr = 'cupiditate';
    $request->obj->bool = true;
    $request->obj->boolOpt = true;
    $request->obj->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->obj->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->obj->enum = EnumEnum::TWO;
    $request->obj->float32 = 2.2222222;
    $request->obj->int = 999999;
    $request->obj->int32 = 1;
    $request->obj->int32Enum = SimpleObjectInt32EnumEnum::FIFTY_FIVE;
    $request->obj->intEnum = SimpleObjectIntEnumEnum::First;
    $request->obj->intOptNull = 999999;
    $request->obj->num = 1.1;
    $request->obj->numOptNull = 1.1;
    $request->obj->str = 'example';
    $request->obj->strOpt = 'optional example';
    $request->str = 'debitis';
    $request->type = 'ipsam';

    $response = $sdk->requestBodies->requestBodyPostFormDeep($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## requestBodyPostFormMapPrimitive

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
    $request = [
        'sequi' => 'quo',
    ]

    $response = $sdk->requestBodies->requestBodyPostFormMapPrimitive($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## requestBodyPostFormSimple

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnumEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = new SimpleObject();
    $request->any = 'esse';
    $request->bigint = 925164;
    $request->bigintStr = 'aperiam';
    $request->bool = true;
    $request->boolOpt = true;
    $request->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->enum = EnumEnum::TWO;
    $request->float32 = 2.2222222;
    $request->int = 999999;
    $request->int32 = 1;
    $request->int32Enum = SimpleObjectInt32EnumEnum::ONE_HUNDRED_AND_EIGHTY_ONE;
    $request->intEnum = SimpleObjectIntEnumEnum::Third;
    $request->intOptNull = 999999;
    $request->num = 1.1;
    $request->numOptNull = 1.1;
    $request->str = 'example';
    $request->strOpt = 'optional example';

    $response = $sdk->requestBodies->requestBodyPostFormSimple($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## requestBodyPostMultipleContentTypesComponentFiltered

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnumEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = new SimpleObject();
    $request->any = 'dignissimos';
    $request->bigint = 76956;
    $request->bigintStr = 'nihil';
    $request->bool = true;
    $request->boolOpt = true;
    $request->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->enum = EnumEnum::TWO;
    $request->float32 = 2.2222222;
    $request->int = 999999;
    $request->int32 = 1;
    $request->int32Enum = SimpleObjectInt32EnumEnum::SIXTY_NINE;
    $request->intEnum = SimpleObjectIntEnumEnum::Third;
    $request->intOptNull = 999999;
    $request->num = 1.1;
    $request->numOptNull = 1.1;
    $request->str = 'example';
    $request->strOpt = 'optional example';

    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesComponentFiltered($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## requestBodyPostMultipleContentTypesInlineFiltered

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON;

$sdk = SDK::builder()
    ->build();

try {
    $request = new RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON();
    $request->bool = false;
    $request->num = 3068.1;
    $request->str = 'odio';

    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesInlineFiltered($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## requestBodyPostMultipleContentTypesSplitParamForm

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitParamFormRequest;
use \OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded;

$sdk = SDK::builder()
    ->build();

try {
    $request = new RequestBodyPostMultipleContentTypesSplitParamFormRequest();
    $request->requestBody = new RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded();
    $request->requestBody->bool3 = false;
    $request->requestBody->num3 = 5775.43;
    $request->requestBody->str3 = 'commodi';
    $request->paramStr = 'sapiente';

    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitParamForm($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## requestBodyPostMultipleContentTypesSplitParamJson

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitParamJsonRequest;
use \OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitParamApplicationJSON;

$sdk = SDK::builder()
    ->build();

try {
    $request = new RequestBodyPostMultipleContentTypesSplitParamJsonRequest();
    $request->requestBody = new RequestBodyPostMultipleContentTypesSplitParamApplicationJSON();
    $request->requestBody->bool = false;
    $request->requestBody->num = 1741.12;
    $request->requestBody->str = 'deserunt';
    $request->paramStr = 'molestiae';

    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitParamJson($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## requestBodyPostMultipleContentTypesSplitParamMultipart

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitParamMultipartRequest;
use \OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitParamMultipartFormData;

$sdk = SDK::builder()
    ->build();

try {
    $request = new RequestBodyPostMultipleContentTypesSplitParamMultipartRequest();
    $request->requestBody = new RequestBodyPostMultipleContentTypesSplitParamMultipartFormData();
    $request->requestBody->bool2 = false;
    $request->requestBody->num2 = 353.62;
    $request->requestBody->str2 = 'porro';
    $request->paramStr = 'eum';

    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitParamMultipart($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## requestBodyPostMultipleContentTypesSplitForm

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded;

$sdk = SDK::builder()
    ->build();

try {
    $request = new RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded();
    $request->bool3 = false;
    $request->num3 = 5564.29;
    $request->str3 = 'praesentium';

    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitForm($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## requestBodyPostMultipleContentTypesSplitJson

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitApplicationJSON;

$sdk = SDK::builder()
    ->build();

try {
    $request = new RequestBodyPostMultipleContentTypesSplitApplicationJSON();
    $request->bool = false;
    $request->num = 1598.67;
    $request->str = 'deleniti';

    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitJson($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## requestBodyPostMultipleContentTypesSplitMultipart

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitMultipartFormData;

$sdk = SDK::builder()
    ->build();

try {
    $request = new RequestBodyPostMultipleContentTypesSplitMultipartFormData();
    $request->bool2 = false;
    $request->num2 = 1438.29;
    $request->str2 = 'fuga';

    $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitMultipart($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## requestBodyPutBytes

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
'mollitia'

    $response = $sdk->requestBodies->requestBodyPutBytes($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## requestBodyPutMultipartDeep

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\DeepObject;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnumEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = new DeepObject();
    $request->any = new SimpleObject();
    $request->any->any = 'atque';
    $request->any->bigint = 128860;
    $request->any->bigintStr = 'minima';
    $request->any->bool = true;
    $request->any->boolOpt = true;
    $request->any->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->any->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->any->enum = EnumEnum::TWO;
    $request->any->float32 = 2.2222222;
    $request->any->int = 999999;
    $request->any->int32 = 1;
    $request->any->int32Enum = SimpleObjectInt32EnumEnum::SIXTY_NINE;
    $request->any->intEnum = SimpleObjectIntEnumEnum::First;
    $request->any->intOptNull = 999999;
    $request->any->num = 1.1;
    $request->any->numOptNull = 1.1;
    $request->any->str = 'example';
    $request->any->strOpt = 'optional example';
    $request->arr = [
        new SimpleObject(),
        new SimpleObject(),
        new SimpleObject(),
        new SimpleObject(),
    ];
    $request->bool = false;
    $request->int = 159870;
    $request->map = [
        'explicabo' => new SimpleObject(),
    ];
    $request->num = 9039.84;
    $request->obj = new SimpleObject();
    $request->obj->any = 'occaecati';
    $request->obj->bigint = 543806;
    $request->obj->bigintStr = 'et';
    $request->obj->bool = true;
    $request->obj->boolOpt = true;
    $request->obj->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->obj->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->obj->enum = EnumEnum::TWO;
    $request->obj->float32 = 2.2222222;
    $request->obj->int = 999999;
    $request->obj->int32 = 1;
    $request->obj->int32Enum = SimpleObjectInt32EnumEnum::SIXTY_NINE;
    $request->obj->intEnum = SimpleObjectIntEnumEnum::Third;
    $request->obj->intOptNull = 999999;
    $request->obj->num = 1.1;
    $request->obj->numOptNull = 1.1;
    $request->obj->str = 'example';
    $request->obj->strOpt = 'optional example';
    $request->str = 'accusamus';
    $request->type = 'veritatis';

    $response = $sdk->requestBodies->requestBodyPutMultipartDeep($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## requestBodyPutMultipartFile

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Operations\RequestBodyPutMultipartFileRequestBody;
use \OpenAPI\OpenAPI\Models\Operations\RequestBodyPutMultipartFileRequestBodyFile;

$sdk = SDK::builder()
    ->build();

try {
    $request = new RequestBodyPutMultipartFileRequestBody();
    $request->file = new RequestBodyPutMultipartFileRequestBodyFile();
    $request->file->content = 'esse';
    $request->file->file = 'quod';

    $response = $sdk->requestBodies->requestBodyPutMultipartFile($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## requestBodyPutMultipartSimple

### Example Usage

```php
<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use \OpenAPI\OpenAPI\SDK;
use \OpenAPI\OpenAPI\Models\Shared\Security;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObject;
use \OpenAPI\OpenAPI\Models\Shared\EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectInt32EnumEnum;
use \OpenAPI\OpenAPI\Models\Shared\SimpleObjectIntEnumEnum;

$sdk = SDK::builder()
    ->build();

try {
    $request = new SimpleObject();
    $request->any = 'nam';
    $request->bigint = 877131;
    $request->bigintStr = 'aliquid';
    $request->bool = true;
    $request->boolOpt = true;
    $request->date = DateTime::createFromFormat('Y-m-d', '2020-01-01');
    $request->dateTime = DateTime::createFromFormat('Y-m-d\TH:i:sP', '2020-01-01T00:00:00Z');
    $request->enum = EnumEnum::TWO;
    $request->float32 = 2.2222222;
    $request->int = 999999;
    $request->int32 = 1;
    $request->int32Enum = SimpleObjectInt32EnumEnum::FIFTY_FIVE;
    $request->intEnum = SimpleObjectIntEnumEnum::Third;
    $request->intOptNull = 999999;
    $request->num = 1.1;
    $request->numOptNull = 1.1;
    $request->str = 'example';
    $request->strOpt = 'optional example';

    $response = $sdk->requestBodies->requestBodyPutMultipartSimple($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## requestBodyPutString

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
'vel'

    $response = $sdk->requestBodies->requestBodyPutString($request);

    if ($response->res !== null) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```
