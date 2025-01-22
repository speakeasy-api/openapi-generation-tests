# Globals
(*globals*)

## Overview

Endpoints for testing global parameters.

### Available Operations

* [global_path_parameter_get](#global_path_parameter_get)
* [globals_header_get](#globals_header_get)
* [globals_hidden_post](#globals_hidden_post)
* [globals_optional_hidden_path_parameter_operation_required](#globals_optional_hidden_path_parameter_operation_required) - This operation requires a globally optional hidden path parameter. A
failing test with 404 likely indicates that the path parameter value is
not being templated into the client (.../hidden//...).

* [globals_optional_hidden_path_parameter_path_required](#globals_optional_hidden_path_parameter_path_required) - This path requires a globally optional hidden path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the client (.../hidden//...).

* [globals_optional_path_parameter_operation_required](#globals_optional_path_parameter_operation_required) - This operation requires a globally optional path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the operation request (.../globals//...).

* [globals_optional_path_parameter_path_required](#globals_optional_path_parameter_path_required) - This path requires a globally optional path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the operation request (.../globals//...).

* [globals_query_parameter_get](#globals_query_parameter_get)

## global_path_parameter_get

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

    
res = s.globals.global_path_parameter_get(global_path_param=100)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter              | Type                   | Required               | Description            | Example                |
| ---------------------- | ---------------------- | ---------------------- | ---------------------- | ---------------------- |
| `global_path_param`    | *T.nilable(::Integer)* | :heavy_minus_sign:     | N/A                    | 100                    |

### Response

**[T.nilable(::OpenApiSDK::Operations::GlobalPathParameterGetResponse)](../../models/operations/globalpathparametergetresponse.md)**



## globals_header_get

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

    
res = s.globals.globals_header_get(global_header_param=true)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter               | Type                    | Required                | Description             | Example                 |
| ----------------------- | ----------------------- | ----------------------- | ----------------------- | ----------------------- |
| `global_header_param`   | *T.nilable(T::Boolean)* | :heavy_minus_sign:      | N/A                     | true                    |

### Response

**[T.nilable(::OpenApiSDK::Operations::GlobalsHeaderGetResponse)](../../models/operations/globalsheadergetresponse.md)**



## globals_hidden_post

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


req = ::OpenApiSDK::Operations::GlobalsHiddenPostRequest.new(
  request_body: ::OpenApiSDK::Operations::GlobalsHiddenPostRequestBody.new(
    other: 37,
    test: "friend",
  ),
  global_hidden_header_param: "<value>",
  global_hidden_path_param: "<value>",
  global_hidden_query_param: "hello",
)
    
res = s.globals.globals_hidden_post(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [::OpenApiSDK::Operations::GlobalsHiddenPostRequest](../../models/operations/globalshiddenpostrequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[T.nilable(::OpenApiSDK::Operations::GlobalsHiddenPostResponse)](../../models/operations/globalshiddenpostresponse.md)**



## globals_optional_hidden_path_parameter_operation_required

This operation requires a globally optional hidden path parameter. A
failing test with 404 likely indicates that the path parameter value is
not being templated into the client (.../hidden//...).


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

    
res = s.globals.globals_optional_hidden_path_parameter_operation_required(global_optional_hidden_path_param="<value>")

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `global_optional_hidden_path_param`                                                         | *T.nilable(::String)*                                                                       | :heavy_minus_sign:                                                                          | Overrides the optional hidden global path parameter to be required<br/>at the operation level.<br/> |

### Response

**[T.nilable(::OpenApiSDK::Operations::GlobalsOptionalHiddenPathParameterOperationRequiredResponse)](../../models/operations/globalsoptionalhiddenpathparameteroperationrequiredresponse.md)**



## globals_optional_hidden_path_parameter_path_required

This path requires a globally optional hidden path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the client (.../hidden//...).


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

    
res = s.globals.globals_optional_hidden_path_parameter_path_required(global_optional_hidden_path_param="<value>")

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `global_optional_hidden_path_param`                                                    | *T.nilable(::String)*                                                                  | :heavy_minus_sign:                                                                     | Overrides the optional hidden global path parameter to be required at<br/>the path level.<br/> |

### Response

**[T.nilable(::OpenApiSDK::Operations::GlobalsOptionalHiddenPathParameterPathRequiredResponse)](../../models/operations/globalsoptionalhiddenpathparameterpathrequiredresponse.md)**



## globals_optional_path_parameter_operation_required

This operation requires a globally optional path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the operation request (.../globals//...).


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

    
res = s.globals.globals_optional_path_parameter_operation_required(global_optional_path_param="<value>")

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `global_optional_path_param`                                                         | *T.nilable(::String)*                                                                | :heavy_minus_sign:                                                                   | Overrides the optional global path parameter to be required at the<br/>operation level.<br/> |

### Response

**[T.nilable(::OpenApiSDK::Operations::GlobalsOptionalPathParameterOperationRequiredResponse)](../../models/operations/globalsoptionalpathparameteroperationrequiredresponse.md)**



## globals_optional_path_parameter_path_required

This path requires a globally optional path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the operation request (.../globals//...).


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

    
res = s.globals.globals_optional_path_parameter_path_required(global_optional_path_param="<value>")

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `global_optional_path_param`                                                    | *T.nilable(::String)*                                                           | :heavy_minus_sign:                                                              | Overrides the optional global path parameter to be required at the<br/>path level.<br/> |

### Response

**[T.nilable(::OpenApiSDK::Operations::GlobalsOptionalPathParameterPathRequiredResponse)](../../models/operations/globalsoptionalpathparameterpathrequiredresponse.md)**



## globals_query_parameter_get

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

    
res = s.globals.globals_query_parameter_get(global_query_param="some example global query param")

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                       | Type                            | Required                        | Description                     | Example                         |
| ------------------------------- | ------------------------------- | ------------------------------- | ------------------------------- | ------------------------------- |
| `global_query_param`            | *T.nilable(::String)*           | :heavy_minus_sign:              | N/A                             | some example global query param |

### Response

**[T.nilable(::OpenApiSDK::Operations::GlobalsQueryParameterGetResponse)](../../models/operations/globalsqueryparametergetresponse.md)**

