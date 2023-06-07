# globals

## Overview

Endpoints for testing global parameters.

### Available Operations

* [global_path_parameter_get](#global_path_parameter_get)
* [globals_query_parameter_get](#globals_query_parameter_get)

## global_path_parameter_get

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::GlobalPathParameterGetRequest(
  path_params=Operations::GlobalPathParameterGetRequest(),
)
    
res = s.globals::global_path_parameter_get(req)

if ! res.res.nil?
  # handle response
end

```

## globals_query_parameter_get

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::GlobalsQueryParameterGetRequest(
  query_params=Operations::GlobalsQueryParameterGetRequest(),
)
    
res = s.globals::globals_query_parameter_get(req)

if ! res.res.nil?
  # handle response
end

```
