# Globals


## Overview

Endpoints for testing global parameters.

### Available Operations

* [global_path_parameter_get](#global_path_parameter_get)
* [globals_query_parameter_get](#globals_query_parameter_get)

## global_path_parameter_get

### Example Usage

```ruby
require_relative openapi


s = ::OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)

    
res = s.globals.global_path_parameter_get(global_path_param=719830)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter           | Type                | Required            | Description         |
| ------------------- | ------------------- | ------------------- | ------------------- |
| `global_path_param` | *Integer*           | :heavy_minus_sign:  | N/A                 |


### Response

**[T.nilable(Operations::GlobalPathParameterGetResponse)](../../models/operations/globalpathparametergetresponse.md)**


## globals_query_parameter_get

### Example Usage

```ruby
require_relative openapi


s = ::OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)

    
res = s.globals.globals_query_parameter_get(global_query_param="string")

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter            | Type                 | Required             | Description          |
| -------------------- | -------------------- | -------------------- | -------------------- |
| `global_query_param` | *String*             | :heavy_minus_sign:   | N/A                  |


### Response

**[T.nilable(Operations::GlobalsQueryParameterGetResponse)](../../models/operations/globalsqueryparametergetresponse.md)**

