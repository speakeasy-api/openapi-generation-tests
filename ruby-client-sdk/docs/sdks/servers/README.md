# Servers


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

    
res = s.servers.select_global_server()

if res.status_code == 200
  # handle response
end

```


### Response

**[T.nilable(::OpenApiSDK::Operations::SelectGlobalServerResponse)](../../models/operations/selectglobalserverresponse.md)**


## select_server_with_id

Select a server by ID.

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

    
res = s.servers.select_server_with_id()

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[T.nilable(::OpenApiSDK::Operations::SelectServerWithIDResponse)](../../models/operations/selectserverwithidresponse.md)**


## server_with_protocol_template

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

    
res = s.servers.server_with_protocol_template()

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[T.nilable(::OpenApiSDK::Operations::ServerWithProtocolTemplateResponse)](../../models/operations/serverwithprotocoltemplateresponse.md)**


## server_with_templates

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

    
res = s.servers.server_with_templates()

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[T.nilable(::OpenApiSDK::Operations::ServerWithTemplatesResponse)](../../models/operations/serverwithtemplatesresponse.md)**


## server_with_templates_global

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

    
res = s.servers.server_with_templates_global()

if res.status_code == 200
  # handle response
end

```


### Response

**[T.nilable(::OpenApiSDK::Operations::ServerWithTemplatesGlobalResponse)](../../models/operations/serverwithtemplatesglobalresponse.md)**


## servers_by_id_with_templates

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

    
res = s.servers.servers_by_id_with_templates()

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[T.nilable(::OpenApiSDK::Operations::ServersByIDWithTemplatesResponse)](../../models/operations/serversbyidwithtemplatesresponse.md)**

