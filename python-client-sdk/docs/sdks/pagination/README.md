# Pagination
(*pagination*)

## Overview

Endpoints for testing the pagination extension

### Available Operations

* [pagination_ambiguous_input](#pagination_ambiguous_input) - This is a paginated operation where there is both a query parameter and
request body field called "cursor". This ambiguity is used to test that
the generator only updates the appropriate field in the pagination code
"next()" function.

* [pagination_body_flattened_optional_security](#pagination_body_flattened_optional_security)
* [pagination_body_flattened_with_security](#pagination_body_flattened_with_security)
* [pagination_body_wrapped_request](#pagination_body_wrapped_request) - This operation has a request wrapper type that encapsulates the
parameters and request body. The pagination inputs are meant to go in
the request body and we want to test that the generator correctly
generates the next() function call preserving everything from the
original request and interpolating the next pagination inputs.

* [pagination_cursor_body](#pagination_cursor_body)
* [pagination_cursor_non_numeric](#pagination_cursor_non_numeric)
* [pagination_cursor_params](#pagination_cursor_params)
* [pagination_limit_offset_deep_outputs_page_body](#pagination_limit_offset_deep_outputs_page_body)
* [pagination_limit_offset_offset_body](#pagination_limit_offset_offset_body)
* [pagination_limit_offset_offset_params](#pagination_limit_offset_offset_params)
* [pagination_limit_offset_page_body](#pagination_limit_offset_page_body)
* [pagination_limit_offset_page_params](#pagination_limit_offset_page_params)
* [pagination_url_params](#pagination_url_params)
* [pagination_with_retries](#pagination_with_retries)
* [pagination_wrapped_optional_body](#pagination_wrapped_optional_body)

## pagination_ambiguous_input

This is a paginated operation where there is both a query parameter and
request body field called "cursor". This ambiguity is used to test that
the generator only updates the appropriate field in the pagination code
"next()" function.


### Example Usage

```python
from openapi import SDK

with SDK(
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
) as sdk:

    res = sdk.pagination.pagination_ambiguous_input(request_body={
        "cursor": 872862,
    })

    if res is not None:
        while True:
            # handle items

            res = res.next()
            if res is None:
                break

```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request_body`                                                                                                   | [operations.PaginationAmbiguousInputRequestBody](../../models/operations/paginationambiguousinputrequestbody.md) | :heavy_check_mark:                                                                                               | N/A                                                                                                              |
| `cursor`                                                                                                         | *Optional[int]*                                                                                                  | :heavy_minus_sign:                                                                                               | N/A                                                                                                              |
| `retries`                                                                                                        | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)                                                 | :heavy_minus_sign:                                                                                               | Configuration to override the default retry behavior of the client.                                              |
| `server_url`                                                                                                     | *Optional[str]*                                                                                                  | :heavy_minus_sign:                                                                                               | An optional server URL to use.                                                                                   |

### Response

**[operations.PaginationAmbiguousInputResponse](../../models/operations/paginationambiguousinputresponse.md)**

### Errors

| Error Type      | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4XX, 5XX        | \*/\*           |

## pagination_body_flattened_optional_security

### Example Usage

```python
from openapi import SDK

with SDK(
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
) as sdk:

    res = sdk.pagination.pagination_body_flattened_optional_security(limit=252090, offset=434461)

    if res is not None:
        while True:
            # handle items

            res = res.next()
            if res is None:
                break

```

### Parameters

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `limit`                                                                                                                                            | *int*                                                                                                                                              | :heavy_check_mark:                                                                                                                                 | N/A                                                                                                                                                |
| `offset`                                                                                                                                           | *int*                                                                                                                                              | :heavy_check_mark:                                                                                                                                 | N/A                                                                                                                                                |
| `security`                                                                                                                                         | [Optional[operations.PaginationBodyFlattenedOptionalSecuritySecurity]](../../models/operations/paginationbodyflattenedoptionalsecuritysecurity.md) | :heavy_minus_sign:                                                                                                                                 | N/A                                                                                                                                                |
| `retries`                                                                                                                                          | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)                                                                                   | :heavy_minus_sign:                                                                                                                                 | Configuration to override the default retry behavior of the client.                                                                                |
| `server_url`                                                                                                                                       | *Optional[str]*                                                                                                                                    | :heavy_minus_sign:                                                                                                                                 | An optional server URL to use.                                                                                                                     |

### Response

**[operations.PaginationBodyFlattenedOptionalSecurityResponse](../../models/operations/paginationbodyflattenedoptionalsecurityresponse.md)**

### Errors

| Error Type      | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4XX, 5XX        | \*/\*           |

## pagination_body_flattened_with_security

### Example Usage

```python
from openapi import SDK
from openapi.models import operations

with SDK(
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
) as sdk:

    res = sdk.pagination.pagination_body_flattened_with_security(security=operations.PaginationBodyFlattenedWithSecuritySecurity(
        pagination_auth="Token <YOUR_API_KEY>",
    ), limit=296062, offset=592542)

    if res is not None:
        while True:
            # handle items

            res = res.next()
            if res is None:
                break

```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                       | [operations.PaginationBodyFlattenedWithSecuritySecurity](../../models/operations/paginationbodyflattenedwithsecuritysecurity.md) | :heavy_check_mark:                                                                                                               | N/A                                                                                                                              |
| `limit`                                                                                                                          | *int*                                                                                                                            | :heavy_check_mark:                                                                                                               | N/A                                                                                                                              |
| `offset`                                                                                                                         | *int*                                                                                                                            | :heavy_check_mark:                                                                                                               | N/A                                                                                                                              |
| `retries`                                                                                                                        | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)                                                                 | :heavy_minus_sign:                                                                                                               | Configuration to override the default retry behavior of the client.                                                              |
| `server_url`                                                                                                                     | *Optional[str]*                                                                                                                  | :heavy_minus_sign:                                                                                                               | An optional server URL to use.                                                                                                   |

### Response

**[operations.PaginationBodyFlattenedWithSecurityResponse](../../models/operations/paginationbodyflattenedwithsecurityresponse.md)**

### Errors

| Error Type      | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4XX, 5XX        | \*/\*           |

## pagination_body_wrapped_request

This operation has a request wrapper type that encapsulates the
parameters and request body. The pagination inputs are meant to go in
the request body and we want to test that the generator correctly
generates the next() function call preserving everything from the
original request and interpolating the next pagination inputs.


### Example Usage

```python
from openapi import SDK

with SDK(
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
) as sdk:

    res = sdk.pagination.pagination_body_wrapped_request(request={
        "limit_offset_config": {},
    })

    if res is not None:
        while True:
            # handle items

            res = res.next()
            if res is None:
                break

```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [operations.PaginationBodyWrappedRequestRequest](../../models/operations/paginationbodywrappedrequestrequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |
| `retries`                                                                                                        | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)                                                 | :heavy_minus_sign:                                                                                               | Configuration to override the default retry behavior of the client.                                              |
| `server_url`                                                                                                     | *Optional[str]*                                                                                                  | :heavy_minus_sign:                                                                                               | An optional server URL to use.                                                                                   |

### Response

**[operations.PaginationBodyWrappedRequestResponse](../../models/operations/paginationbodywrappedrequestresponse.md)**

### Errors

| Error Type      | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4XX, 5XX        | \*/\*           |

## pagination_cursor_body

### Example Usage

```python
from openapi import SDK

with SDK(
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
) as sdk:

    res = sdk.pagination.pagination_cursor_body(request={
        "cursor": 868337,
    })

    if res is not None:
        while True:
            # handle items

            res = res.next()
            if res is None:
                break

```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                | [operations.PaginationCursorBodyRequestBody](../../models/operations/paginationcursorbodyrequestbody.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |
| `retries`                                                                                                | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)                                         | :heavy_minus_sign:                                                                                       | Configuration to override the default retry behavior of the client.                                      |
| `server_url`                                                                                             | *Optional[str]*                                                                                          | :heavy_minus_sign:                                                                                       | An optional server URL to use.                                                                           |

### Response

**[operations.PaginationCursorBodyResponse](../../models/operations/paginationcursorbodyresponse.md)**

### Errors

| Error Type      | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4XX, 5XX        | \*/\*           |

## pagination_cursor_non_numeric

### Example Usage

```python
from openapi import SDK

with SDK(
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
) as sdk:

    res = sdk.pagination.pagination_cursor_non_numeric()

    if res is not None:
        while True:
            # handle items

            res = res.next()
            if res is None:
                break

```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `cursor`                                                             | *Optional[str]*                                                      | :heavy_minus_sign:                                                   | The page token used to request a specific page of the search results |
| `retries`                                                            | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)     | :heavy_minus_sign:                                                   | Configuration to override the default retry behavior of the client.  |
| `server_url`                                                         | *Optional[str]*                                                      | :heavy_minus_sign:                                                   | An optional server URL to use.                                       |

### Response

**[operations.PaginationCursorNonNumericResponse](../../models/operations/paginationcursornonnumericresponse.md)**

### Errors

| Error Type      | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4XX, 5XX        | \*/\*           |

## pagination_cursor_params

### Example Usage

```python
from openapi import SDK

with SDK(
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
) as sdk:

    res = sdk.pagination.pagination_cursor_params(cursor=24812)

    if res is not None:
        while True:
            # handle items

            res = res.next()
            if res is None:
                break

```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `cursor`                                                            | *int*                                                               | :heavy_check_mark:                                                  | N/A                                                                 |
| `retries`                                                           | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)    | :heavy_minus_sign:                                                  | Configuration to override the default retry behavior of the client. |
| `server_url`                                                        | *Optional[str]*                                                     | :heavy_minus_sign:                                                  | An optional server URL to use.                                      |

### Response

**[operations.PaginationCursorParamsResponse](../../models/operations/paginationcursorparamsresponse.md)**

### Errors

| Error Type      | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4XX, 5XX        | \*/\*           |

## pagination_limit_offset_deep_outputs_page_body

### Example Usage

```python
from openapi import SDK

with SDK(
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
) as sdk:

    res = sdk.pagination.pagination_limit_offset_deep_outputs_page_body()

    if res is not None:
        while True:
            # handle items

            res = res.next()
            if res is None:
                break

```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `request`                                                            | [shared.LimitOffsetConfig](../../models/shared/limitoffsetconfig.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |
| `retries`                                                            | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)     | :heavy_minus_sign:                                                   | Configuration to override the default retry behavior of the client.  |
| `server_url`                                                         | *Optional[str]*                                                      | :heavy_minus_sign:                                                   | An optional server URL to use.                                       |

### Response

**[operations.PaginationLimitOffsetDeepOutputsPageBodyResponse](../../models/operations/paginationlimitoffsetdeepoutputspagebodyresponse.md)**

### Errors

| Error Type      | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4XX, 5XX        | \*/\*           |

## pagination_limit_offset_offset_body

### Example Usage

```python
from openapi import SDK

with SDK(
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
) as sdk:

    res = sdk.pagination.pagination_limit_offset_offset_body()

    if res is not None:
        while True:
            # handle items

            res = res.next()
            if res is None:
                break

```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `request`                                                            | [shared.LimitOffsetConfig](../../models/shared/limitoffsetconfig.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |
| `retries`                                                            | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)     | :heavy_minus_sign:                                                   | Configuration to override the default retry behavior of the client.  |
| `server_url`                                                         | *Optional[str]*                                                      | :heavy_minus_sign:                                                   | An optional server URL to use.                                       |

### Response

**[operations.PaginationLimitOffsetOffsetBodyResponse](../../models/operations/paginationlimitoffsetoffsetbodyresponse.md)**

### Errors

| Error Type      | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4XX, 5XX        | \*/\*           |

## pagination_limit_offset_offset_params

### Example Usage

```python
from openapi import SDK

with SDK(
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
) as sdk:

    res = sdk.pagination.pagination_limit_offset_offset_params()

    if res is not None:
        while True:
            # handle items

            res = res.next()
            if res is None:
                break

```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `limit`                                                             | *Optional[int]*                                                     | :heavy_minus_sign:                                                  | N/A                                                                 |
| `offset`                                                            | *Optional[int]*                                                     | :heavy_minus_sign:                                                  | N/A                                                                 |
| `retries`                                                           | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)    | :heavy_minus_sign:                                                  | Configuration to override the default retry behavior of the client. |
| `server_url`                                                        | *Optional[str]*                                                     | :heavy_minus_sign:                                                  | An optional server URL to use.                                      |

### Response

**[operations.PaginationLimitOffsetOffsetParamsResponse](../../models/operations/paginationlimitoffsetoffsetparamsresponse.md)**

### Errors

| Error Type      | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4XX, 5XX        | \*/\*           |

## pagination_limit_offset_page_body

### Example Usage

```python
from openapi import SDK

with SDK(
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
) as sdk:

    res = sdk.pagination.pagination_limit_offset_page_body()

    if res is not None:
        while True:
            # handle items

            res = res.next()
            if res is None:
                break

```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `request`                                                            | [shared.LimitOffsetConfig](../../models/shared/limitoffsetconfig.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |
| `retries`                                                            | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)     | :heavy_minus_sign:                                                   | Configuration to override the default retry behavior of the client.  |
| `server_url`                                                         | *Optional[str]*                                                      | :heavy_minus_sign:                                                   | An optional server URL to use.                                       |

### Response

**[operations.PaginationLimitOffsetPageBodyResponse](../../models/operations/paginationlimitoffsetpagebodyresponse.md)**

### Errors

| Error Type      | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4XX, 5XX        | \*/\*           |

## pagination_limit_offset_page_params

### Example Usage

```python
from openapi import SDK

with SDK(
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
) as sdk:

    res = sdk.pagination.pagination_limit_offset_page_params(page=1177)

    if res is not None:
        while True:
            # handle items

            res = res.next()
            if res is None:
                break

```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `page`                                                              | *int*                                                               | :heavy_check_mark:                                                  | N/A                                                                 |
| `retries`                                                           | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)    | :heavy_minus_sign:                                                  | Configuration to override the default retry behavior of the client. |
| `server_url`                                                        | *Optional[str]*                                                     | :heavy_minus_sign:                                                  | An optional server URL to use.                                      |

### Response

**[operations.PaginationLimitOffsetPageParamsResponse](../../models/operations/paginationlimitoffsetpageparamsresponse.md)**

### Errors

| Error Type      | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4XX, 5XX        | \*/\*           |

## pagination_url_params

### Example Usage

```python
from openapi import SDK

with SDK(
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
) as sdk:

    res = sdk.pagination.pagination_url_params(attempts=778920)

    if res is not None:
        while True:
            # handle items

            res = res.next()
            if res is None:
                break

```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `attempts`                                                          | *int*                                                               | :heavy_check_mark:                                                  | N/A                                                                 |
| `is_reference_path`                                                 | *Optional[str]*                                                     | :heavy_minus_sign:                                                  | N/A                                                                 |
| `retries`                                                           | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)    | :heavy_minus_sign:                                                  | Configuration to override the default retry behavior of the client. |
| `server_url`                                                        | *Optional[str]*                                                     | :heavy_minus_sign:                                                  | An optional server URL to use.                                      |

### Response

**[operations.PaginationURLParamsResponse](../../models/operations/paginationurlparamsresponse.md)**

### Errors

| Error Type      | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4XX, 5XX        | \*/\*           |

## pagination_with_retries

### Example Usage

```python
from openapi import SDK

with SDK(
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
) as sdk:

    res = sdk.pagination.pagination_with_retries()

    if res is not None:
        while True:
            # handle items

            res = res.next()
            if res is None:
                break

```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `cursor`                                                             | *Optional[str]*                                                      | :heavy_minus_sign:                                                   | The page token used to request a specific page of the search results |
| `fault_settings`                                                     | *Optional[str]*                                                      | :heavy_minus_sign:                                                   | N/A                                                                  |
| `request_id`                                                         | *Optional[str]*                                                      | :heavy_minus_sign:                                                   | N/A                                                                  |
| `retries`                                                            | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)     | :heavy_minus_sign:                                                   | Configuration to override the default retry behavior of the client.  |
| `server_url`                                                         | *Optional[str]*                                                      | :heavy_minus_sign:                                                   | An optional server URL to use.                                       |

### Response

**[operations.PaginationWithRetriesResponse](../../models/operations/paginationwithretriesresponse.md)**

### Errors

| Error Type      | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4XX, 5XX        | \*/\*           |

## pagination_wrapped_optional_body

### Example Usage

```python
from openapi import SDK

with SDK(
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
) as sdk:

    res = sdk.pagination.pagination_wrapped_optional_body()

    if res is not None:
        while True:
            # handle items

            res = res.next()
            if res is None:
                break

```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [operations.PaginationWrappedOptionalBodyRequest](../../models/operations/paginationwrappedoptionalbodyrequest.md)   | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `security`                                                                                                           | [operations.PaginationWrappedOptionalBodySecurity](../../models/operations/paginationwrappedoptionalbodysecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |
| `retries`                                                                                                            | [Optional[utils.RetryConfig]](../../models/utils/retryconfig.md)                                                     | :heavy_minus_sign:                                                                                                   | Configuration to override the default retry behavior of the client.                                                  |
| `server_url`                                                                                                         | *Optional[str]*                                                                                                      | :heavy_minus_sign:                                                                                                   | An optional server URL to use.                                                                                       |

### Response

**[operations.PaginationWrappedOptionalBodyResponse](../../models/operations/paginationwrappedoptionalbodyresponse.md)**

### Errors

| Error Type      | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4XX, 5XX        | \*/\*           |