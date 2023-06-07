# telemetry

## Overview

Endpoints for testing telemetry.

### Available Operations

* [telemetry_speakeasy_user_agent_get](#telemetry_speakeasy_user_agent_get)
* [telemetry_user_agent_get](#telemetry_user_agent_get)

## telemetry_speakeasy_user_agent_get

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::TelemetrySpeakeasyUserAgentGetRequest(
  headers=Operations::TelemetrySpeakeasyUserAgentGetRequest(
    user_agent="expedita",
  ),
)
    
res = s.telemetry::telemetry_speakeasy_user_agent_get(req)

if ! res.res.nil?
  # handle response
end

```

## telemetry_user_agent_get

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

    
res = s.telemetry::telemetry_user_agent_get()

if ! res.res.nil?
  # handle response
end

```
