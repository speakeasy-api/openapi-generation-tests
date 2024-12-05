# StatusCode
(*status_code*)

## Overview

Endpoints for testing HTTP status codes, especially OAS-defined XX and default.

### Available Operations

* [status_code2_xx](#status_code2_xx)
* [status_code4_xx](#status_code4_xx)
* [status_code5_xx](#status_code5_xx)
* [status_code_default](#status_code_default)

## status_code2_xx

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

    
res = s.status_code.status_code2_xx()

if res.status_code == 200
  # handle response
end

```

### Response

**[T.nilable(::OpenApiSDK::Operations::StatusCode2XXResponse)](../../models/operations/statuscode2xxresponse.md)**



## status_code4_xx

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

    
res = s.status_code.status_code4_xx()

if res.status_code == 200
  # handle response
end

```

### Response

**[T.nilable(::OpenApiSDK::Operations::StatusCode4XXResponse)](../../models/operations/statuscode4xxresponse.md)**



## status_code5_xx

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

    
res = s.status_code.status_code5_xx()

if res.status_code == 200
  # handle response
end

```

### Response

**[T.nilable(::OpenApiSDK::Operations::StatusCode5XXResponse)](../../models/operations/statuscode5xxresponse.md)**



## status_code_default

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

    
res = s.status_code.status_code_default()

if res.status_code == 200
  # handle response
end

```

### Response

**[T.nilable(::OpenApiSDK::Operations::StatusCodeDefaultResponse)](../../models/operations/statuscodedefaultresponse.md)**

