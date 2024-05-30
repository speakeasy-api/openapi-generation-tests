# Hooks


## Overview

Endpoints for testing hooks

### Available Operations

* [authorization_header_modification](#authorization_header_modification)
* [test_hooks](#test_hooks)
* [test_hooks_after_response](#test_hooks_after_response)
* [test_hooks_before_create_request_paths](#test_hooks_before_create_request_paths)
* [test_hooks_error](#test_hooks_error)

## authorization_header_modification

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_header_param: "<value>",
      global_hidden_path_param: "<value>",
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.hooks.authorization_header_modification()

if ! res.token.nil?
  # handle response
end

```


### Response

**[T.nilable(::OpenApiSDK::Operations::AuthorizationHeaderModificationResponse)](../../models/operations/authorizationheadermodificationresponse.md)**


## test_hooks

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_header_param: "<value>",
      global_hidden_path_param: "<value>",
      global_hidden_query_param: "hello",
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
      global_header_param: true,
      global_hidden_header_param: "<value>",
      global_hidden_path_param: "<value>",
      global_hidden_query_param: "hello",
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


## test_hooks_before_create_request_paths

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_header_param: "<value>",
      global_hidden_path_param: "<value>",
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.hooks.test_hooks_before_create_request_paths(namespace="<value>")

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `namespace`        | *::String*         | :heavy_check_mark: | N/A                |


### Response

**[T.nilable(::OpenApiSDK::Operations::TestHooksBeforeCreateRequestPathsResponse)](../../models/operations/testhooksbeforecreaterequestpathsresponse.md)**


## test_hooks_error

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_header_param: "<value>",
      global_hidden_path_param: "<value>",
      global_hidden_query_param: "hello",
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

