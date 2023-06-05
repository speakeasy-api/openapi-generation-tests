# servers

## Overview

Endpoints for testing servers.

### Available Operations

* [selectGlobalServer](#selectglobalserver)
* [selectServerWithID](#selectserverwithid) - Select a server by ID.
* [serverWithTemplates](#serverwithtemplates)
* [serverWithTemplatesGlobal](#serverwithtemplatesglobal)
* [serversByIDWithTemplates](#serversbyidwithtemplates)

## selectGlobalServer

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
    $response = $sdk->servers->selectGlobalServer();

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## selectServerWithID

Select a server by ID.

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
    $response = $sdk->servers->selectServerWithID();

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## serverWithTemplates

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
    $response = $sdk->servers->serverWithTemplates();

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## serverWithTemplatesGlobal

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
    $response = $sdk->servers->serverWithTemplatesGlobal();

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```

## serversByIDWithTemplates

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
    $response = $sdk->servers->serversByIDWithTemplates();

    if ($response->statusCode === 200) {
        // handle response
    }
} catch (Exception $e) {
    // handle exception
}
```
