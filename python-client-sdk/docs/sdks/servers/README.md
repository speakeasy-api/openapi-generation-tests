# servers

## Overview

Endpoints for testing servers.

### Available Operations

* [select_global_server](#select_global_server)
* [select_server_with_id](#select_server_with_id) - Select a server by ID.
* [server_with_templates](#server_with_templates)
* [server_with_templates_global](#server_with_templates_global)
* [servers_by_id_with_templates](#servers_by_id_with_templates)

## select_global_server

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.servers.select_global_server()

if res.status_code == 200:
    # handle response
```


### Response

**[operations.SelectGlobalServerResponse](../../models/operations/selectglobalserverresponse.md)**


## select_server_with_id

Select a server by ID.

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.servers.select_server_with_id()

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `server_url`                   | *Optional[str]*                | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[operations.SelectServerWithIDResponse](../../models/operations/selectserverwithidresponse.md)**


## server_with_templates

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.servers.server_with_templates()

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `server_url`                   | *Optional[str]*                | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[operations.ServerWithTemplatesResponse](../../models/operations/serverwithtemplatesresponse.md)**


## server_with_templates_global

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.servers.server_with_templates_global()

if res.status_code == 200:
    # handle response
```


### Response

**[operations.ServerWithTemplatesGlobalResponse](../../models/operations/serverwithtemplatesglobalresponse.md)**


## servers_by_id_with_templates

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.servers.servers_by_id_with_templates()

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `server_url`                   | *Optional[str]*                | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[operations.ServersByIDWithTemplatesResponse](../../models/operations/serversbyidwithtemplatesresponse.md)**

