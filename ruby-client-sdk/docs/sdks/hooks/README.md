# Hooks


## Overview

Endpoints for testing hooks

### Available Operations

* [test_hooks](#test_hooks)
* [test_hooks_after_response](#test_hooks_after_response)
* [test_hooks_error](#test_hooks_error)

## test_hooks

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.hooks.test_hooks(some_param="someInitialValue")

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `some_param`       | *::String*         | :heavy_check_mark: | N/A                | someInitialValue   |


### Response

**[T.nilable(::OpenApiSDK::Operations::TestHooksResponse)](../../models/operations/testhooksresponse.md)**


## test_hooks_after_response

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.hooks.test_hooks_after_response()

if res.status_code == 200
  # handle response
end

```


### Response

**[T.nilable(::OpenApiSDK::Operations::TestHooksAfterResponseResponse)](../../models/operations/testhooksafterresponseresponse.md)**


## test_hooks_error

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.hooks.test_hooks_error()

if res.status_code == 200
  # handle response
end

```


### Response

**[T.nilable(::OpenApiSDK::Operations::TestHooksErrorResponse)](../../models/operations/testhookserrorresponse.md)**
