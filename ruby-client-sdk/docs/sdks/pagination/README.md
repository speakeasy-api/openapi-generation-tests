# Pagination

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

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.pagination.pagination_ambiguous_input(request_body=::OpenApiSDK::Operations::PaginationAmbiguousInputRequestBody.new(
  cursor: 872862,
), cursor=126289)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `request_body`                                                                                                                  | [::OpenApiSDK::Operations::PaginationAmbiguousInputRequestBody](../../models/operations/paginationambiguousinputrequestbody.md) | :heavy_check_mark:                                                                                                              | N/A                                                                                                                             |
| `cursor`                                                                                                                        | *::Integer*                                                                                                                     | :heavy_minus_sign:                                                                                                              | N/A                                                                                                                             |
| `server_url`                                                                                                                    | *String*                                                                                                                        | :heavy_minus_sign:                                                                                                              | An optional server URL to use.                                                                                                  |

### Response

**[T.nilable(::OpenApiSDK::Operations::PaginationAmbiguousInputResponse)](../../models/operations/paginationambiguousinputresponse.md)**



## pagination_body_flattened_optional_security

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )

    
res = s.pagination.pagination_body_flattened_optional_security(::OpenApiSDK::Operations::PaginationBodyFlattenedOptionalSecuritySecurity.new(
    pagination_auth: "Token <YOUR_API_KEY>",
  ), limit=252090, offset=434461)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                                               | Type                                                                                                                                                    | Required                                                                                                                                                | Description                                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                              | [::OpenApiSDK::Operations::PaginationBodyFlattenedOptionalSecuritySecurity](../../models/operations/paginationbodyflattenedoptionalsecuritysecurity.md) | :heavy_check_mark:                                                                                                                                      | The security requirements to use for the request.                                                                                                       |
| `limit`                                                                                                                                                 | *::Integer*                                                                                                                                             | :heavy_check_mark:                                                                                                                                      | N/A                                                                                                                                                     |
| `offset`                                                                                                                                                | *::Integer*                                                                                                                                             | :heavy_check_mark:                                                                                                                                      | N/A                                                                                                                                                     |
| `server_url`                                                                                                                                            | *String*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                      | An optional server URL to use.                                                                                                                          |

### Response

**[T.nilable(::OpenApiSDK::Operations::PaginationBodyFlattenedOptionalSecurityResponse)](../../models/operations/paginationbodyflattenedoptionalsecurityresponse.md)**



## pagination_body_flattened_with_security

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )

    
res = s.pagination.pagination_body_flattened_with_security(::OpenApiSDK::Operations::PaginationBodyFlattenedWithSecuritySecurity.new(
    pagination_auth: "Token <YOUR_API_KEY>",
  ), limit=296062, offset=592542)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                                       | Type                                                                                                                                            | Required                                                                                                                                        | Description                                                                                                                                     |
| ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                      | [::OpenApiSDK::Operations::PaginationBodyFlattenedWithSecuritySecurity](../../models/operations/paginationbodyflattenedwithsecuritysecurity.md) | :heavy_check_mark:                                                                                                                              | The security requirements to use for the request.                                                                                               |
| `limit`                                                                                                                                         | *::Integer*                                                                                                                                     | :heavy_check_mark:                                                                                                                              | N/A                                                                                                                                             |
| `offset`                                                                                                                                        | *::Integer*                                                                                                                                     | :heavy_check_mark:                                                                                                                              | N/A                                                                                                                                             |
| `server_url`                                                                                                                                    | *String*                                                                                                                                        | :heavy_minus_sign:                                                                                                                              | An optional server URL to use.                                                                                                                  |

### Response

**[T.nilable(::OpenApiSDK::Operations::PaginationBodyFlattenedWithSecurityResponse)](../../models/operations/paginationbodyflattenedwithsecurityresponse.md)**



## pagination_body_wrapped_request

This operation has a request wrapper type that encapsulates the
parameters and request body. The pagination inputs are meant to go in
the request body and we want to test that the generator correctly
generates the next() function call preserving everything from the
original request and interpolating the next pagination inputs.


### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Operations::PaginationBodyWrappedRequestRequest.new(
  limit_offset_config: ::OpenApiSDK::Shared::LimitOffsetConfig.new(),
)
    
res = s.pagination.pagination_body_wrapped_request(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                       | [::OpenApiSDK::Operations::PaginationBodyWrappedRequestRequest](../../models/operations/paginationbodywrappedrequestrequest.md) | :heavy_check_mark:                                                                                                              | The request object to use for the request.                                                                                      |
| `server_url`                                                                                                                    | *String*                                                                                                                        | :heavy_minus_sign:                                                                                                              | An optional server URL to use.                                                                                                  |

### Response

**[T.nilable(::OpenApiSDK::Operations::PaginationBodyWrappedRequestResponse)](../../models/operations/paginationbodywrappedrequestresponse.md)**



## pagination_cursor_body

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Operations::PaginationCursorBodyRequestBody.new(
  cursor: 868337,
)
    
res = s.pagination.pagination_cursor_body(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [::OpenApiSDK::Operations::PaginationCursorBodyRequestBody](../../models/operations/paginationcursorbodyrequestbody.md) | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |
| `server_url`                                                                                                            | *String*                                                                                                                | :heavy_minus_sign:                                                                                                      | An optional server URL to use.                                                                                          |

### Response

**[T.nilable(::OpenApiSDK::Operations::PaginationCursorBodyResponse)](../../models/operations/paginationcursorbodyresponse.md)**



## pagination_cursor_non_numeric

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.pagination.pagination_cursor_non_numeric(cursor="<value>")

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `cursor`                                                             | *::String*                                                           | :heavy_minus_sign:                                                   | The page token used to request a specific page of the search results |
| `server_url`                                                         | *String*                                                             | :heavy_minus_sign:                                                   | An optional server URL to use.                                       |

### Response

**[T.nilable(::OpenApiSDK::Operations::PaginationCursorNonNumericResponse)](../../models/operations/paginationcursornonnumericresponse.md)**



## pagination_cursor_params

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.pagination.pagination_cursor_params(cursor=24812)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `cursor`                       | *::Integer*                    | :heavy_check_mark:             | N/A                            |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[T.nilable(::OpenApiSDK::Operations::PaginationCursorParamsResponse)](../../models/operations/paginationcursorparamsresponse.md)**



## pagination_limit_offset_deep_outputs_page_body

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Shared::LimitOffsetConfig.new()
    
res = s.pagination.pagination_limit_offset_deep_outputs_page_body(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [::OpenApiSDK::Shared::LimitOffsetConfig](../../models/shared/limitoffsetconfig.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |
| `server_url`                                                                        | *String*                                                                            | :heavy_minus_sign:                                                                  | An optional server URL to use.                                                      |

### Response

**[T.nilable(::OpenApiSDK::Operations::PaginationLimitOffsetDeepOutputsPageBodyResponse)](../../models/operations/paginationlimitoffsetdeepoutputspagebodyresponse.md)**



## pagination_limit_offset_offset_body

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Shared::LimitOffsetConfig.new()
    
res = s.pagination.pagination_limit_offset_offset_body(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [::OpenApiSDK::Shared::LimitOffsetConfig](../../models/shared/limitoffsetconfig.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |
| `server_url`                                                                        | *String*                                                                            | :heavy_minus_sign:                                                                  | An optional server URL to use.                                                      |

### Response

**[T.nilable(::OpenApiSDK::Operations::PaginationLimitOffsetOffsetBodyResponse)](../../models/operations/paginationlimitoffsetoffsetbodyresponse.md)**



## pagination_limit_offset_offset_params

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.pagination.pagination_limit_offset_offset_params(limit=661976, offset=63499)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `limit`                        | *::Integer*                    | :heavy_minus_sign:             | N/A                            |
| `offset`                       | *::Integer*                    | :heavy_minus_sign:             | N/A                            |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[T.nilable(::OpenApiSDK::Operations::PaginationLimitOffsetOffsetParamsResponse)](../../models/operations/paginationlimitoffsetoffsetparamsresponse.md)**



## pagination_limit_offset_page_body

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)


req = ::OpenApiSDK::Shared::LimitOffsetConfig.new()
    
res = s.pagination.pagination_limit_offset_page_body(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [::OpenApiSDK::Shared::LimitOffsetConfig](../../models/shared/limitoffsetconfig.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |
| `server_url`                                                                        | *String*                                                                            | :heavy_minus_sign:                                                                  | An optional server URL to use.                                                      |

### Response

**[T.nilable(::OpenApiSDK::Operations::PaginationLimitOffsetPageBodyResponse)](../../models/operations/paginationlimitoffsetpagebodyresponse.md)**



## pagination_limit_offset_page_params

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.pagination.pagination_limit_offset_page_params(page=1177)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `page`                         | *::Integer*                    | :heavy_check_mark:             | N/A                            |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[T.nilable(::OpenApiSDK::Operations::PaginationLimitOffsetPageParamsResponse)](../../models/operations/paginationlimitoffsetpageparamsresponse.md)**



## pagination_url_params

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.pagination.pagination_url_params(attempts=778920, is_reference_path="<value>")

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `attempts`                     | *::Integer*                    | :heavy_check_mark:             | N/A                            |
| `is_reference_path`            | *::String*                     | :heavy_minus_sign:             | N/A                            |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[T.nilable(::OpenApiSDK::Operations::PaginationURLParamsResponse)](../../models/operations/paginationurlparamsresponse.md)**



## pagination_with_retries

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.pagination.pagination_with_retries(cursor="<value>", fault_settings="<value>", request_id="<id>")

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `cursor`                                                             | *::String*                                                           | :heavy_minus_sign:                                                   | The page token used to request a specific page of the search results |
| `fault_settings`                                                     | *::String*                                                           | :heavy_minus_sign:                                                   | N/A                                                                  |
| `request_id`                                                         | *::String*                                                           | :heavy_minus_sign:                                                   | N/A                                                                  |
| `server_url`                                                         | *String*                                                             | :heavy_minus_sign:                                                   | An optional server URL to use.                                       |

### Response

**[T.nilable(::OpenApiSDK::Operations::PaginationWithRetriesResponse)](../../models/operations/paginationwithretriesresponse.md)**



## pagination_wrapped_optional_body

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )


req = ::OpenApiSDK::Operations::PaginationWrappedOptionalBodyRequest.new()
    
res = s.pagination.pagination_wrapped_optional_body(req, ::OpenApiSDK::Operations::PaginationWrappedOptionalBodySecurity.new(
    pagination_auth: "Token <YOUR_API_KEY>",
  ))

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                           | Type                                                                                                                                | Required                                                                                                                            | Description                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                           | [::OpenApiSDK::Operations::PaginationWrappedOptionalBodyRequest](../../models/operations/paginationwrappedoptionalbodyrequest.md)   | :heavy_check_mark:                                                                                                                  | The request object to use for the request.                                                                                          |
| `security`                                                                                                                          | [::OpenApiSDK::Operations::PaginationWrappedOptionalBodySecurity](../../models/operations/paginationwrappedoptionalbodysecurity.md) | :heavy_check_mark:                                                                                                                  | The security requirements to use for the request.                                                                                   |
| `server_url`                                                                                                                        | *String*                                                                                                                            | :heavy_minus_sign:                                                                                                                  | An optional server URL to use.                                                                                                      |

### Response

**[T.nilable(::OpenApiSDK::Operations::PaginationWrappedOptionalBodyResponse)](../../models/operations/paginationwrappedoptionalbodyresponse.md)**

