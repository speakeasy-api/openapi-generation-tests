# response_bodies

## Overview

Endpoints for testing response bodies.

### Available Operations

* [response_body_bytes_get](#response_body_bytes_get)
* [response_body_string_get](#response_body_string_get)
* [response_body_xml_get](#response_body_xml_get)

## response_body_bytes_get

### Example Usage

```python
import sdk


s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.response_bodies.response_body_bytes_get()

if res.bytes is not None:
    # handle response
```

## response_body_string_get

### Example Usage

```python
import sdk


s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.response_bodies.response_body_string_get()

if res.html is not None:
    # handle response
```

## response_body_xml_get

### Example Usage

```python
import sdk


s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.response_bodies.response_body_xml_get()

if res.xml is not None:
    # handle response
```
