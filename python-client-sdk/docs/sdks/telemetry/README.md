# Telemetry
(*telemetry*)

## Overview

Endpoints for testing telemetry.

### Available Operations

* [telemetry_speakeasy_user_agent_get](#telemetry_speakeasy_user_agent_get)
* [telemetry_user_agent_get](#telemetry_user_agent_get)

## telemetry_speakeasy_user_agent_get

### Example Usage

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.telemetry.telemetry_speakeasy_user_agent_get(user_agent='laudantium')

if res.res is not None:
    # handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `user_agent`       | *str*              | :heavy_check_mark: | N/A                |


### Response

**[operations.TelemetrySpeakeasyUserAgentGetResponse](../../models/operations/telemetryspeakeasyuseragentgetresponse.md)**


## telemetry_user_agent_get

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


res = s.telemetry.telemetry_user_agent_get()

if res.res is not None:
    # handle response
```


### Response

**[operations.TelemetryUserAgentGetResponse](../../models/operations/telemetryuseragentgetresponse.md)**

