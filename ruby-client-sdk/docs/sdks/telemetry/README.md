# Telemetry

## Overview

Endpoints for testing telemetry.

### Available Operations

* [telemetry_speakeasy_user_agent_get](#telemetry_speakeasy_user_agent_get)
* [telemetry_user_agent_get](#telemetry_user_agent_get)

## telemetry_speakeasy_user_agent_get

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::TelemetrySpeakeasyUserAgentGetRequest.new(
  headers=Operations::TelemetrySpeakeasyUserAgentGetRequest.new(
    user_agent="dicta",
  ),
)
    
res = s.telemetry.telemetry_speakeasy_user_agent_get(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `user_agent`       | *String*           | :heavy_check_mark: | N/A                |


### Response

**[T.nilable(Operations::TelemetrySpeakeasyUserAgentGetResponse)](../../models/operations/telemetryspeakeasyuseragentgetresponse.md)**


## telemetry_user_agent_get

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

    
res = s.telemetry.telemetry_user_agent_get()

if ! res.res.nil?
  # handle response
end

```


### Response

**[T.nilable(Operations::TelemetryUserAgentGetResponse)](../../models/operations/telemetryuseragentgetresponse.md)**

