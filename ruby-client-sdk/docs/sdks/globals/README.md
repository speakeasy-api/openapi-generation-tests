# Globals
(*globals*)

## Overview

Endpoints for testing global parameters.

### Available Operations

* [global_path_parameter_get](#global_path_parameter_get)
* [globals_query_parameter_get](#globals_query_parameter_get)

## global_path_parameter_get

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::GlobalPathParameterGetRequest.new(
  path_params=Operations::GlobalPathParameterGetRequest.new(),
)
    
res = s.globals.global_path_parameter_get(req)

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


s = OpenApiSDK::SDK.new
s.config_security(
  security=Shared::Security.new(
    api_key_auth=.foo"Token YOUR_API_KEY",
  )
)

   
req = Operations::GlobalsQueryParameterGetRequest.new(
  query_params=Operations::GlobalsQueryParameterGetRequest.new(),
)
    
res = s.globals.globals_query_parameter_get(req)

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

