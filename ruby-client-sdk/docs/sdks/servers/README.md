# servers

## Overview

Endpoints for testing servers.

### Available Operations

* [select_global_server](#select_global_server)
* [select_server_with_id](#select_server_with_id) - Select a server by ID.
* [server_with_protocol_template](#server_with_protocol_template)
* [server_with_templates](#server_with_templates)
* [server_with_templates_global](#server_with_templates_global)
* [servers_by_id_with_templates](#servers_by_id_with_templates)

## select_global_server

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

    
res = s.servers.select_global_server()

if res.status == 200
  # handle response
end

```


### Response

**[T.nilable(Operations::SelectGlobalServerResponse)](../../models/operations/selectglobalserverresponse.md)**


## select_server_with_id

Select a server by ID.

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

    
res = s.servers.select_server_with_id()

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[T.nilable(Operations::SelectServerWithIDResponse)](../../models/operations/selectserverwithidresponse.md)**


## server_with_protocol_template

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

    
res = s.servers.server_with_protocol_template()

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[T.nilable(Operations::ServerWithProtocolTemplateResponse)](../../models/operations/serverwithprotocoltemplateresponse.md)**


## server_with_templates

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

    
res = s.servers.server_with_templates()

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[T.nilable(Operations::ServerWithTemplatesResponse)](../../models/operations/serverwithtemplatesresponse.md)**


## server_with_templates_global

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

    
res = s.servers.server_with_templates_global()

if res.status == 200
  # handle response
end

```


### Response

**[T.nilable(Operations::ServerWithTemplatesGlobalResponse)](../../models/operations/serverwithtemplatesglobalresponse.md)**


## servers_by_id_with_templates

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

    
res = s.servers.servers_by_id_with_templates()

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[T.nilable(Operations::ServersByIDWithTemplatesResponse)](../../models/operations/serversbyidwithtemplatesresponse.md)**

