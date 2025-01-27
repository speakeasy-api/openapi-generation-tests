# Methods
(*methods*)

## Overview

Endpoints for testing HTTP methods.

### Available Operations

* [method_delete](#method_delete)
* [method_get](#method_get)
* [method_head](#method_head)
* [method_options](#method_options)
* [method_patch](#method_patch)
* [method_post](#method_post)
* [method_put](#method_put)
* [method_trace](#method_trace)

## method_delete

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


req = ::OpenApiSDK::Operations::MethodDeleteRequestBody.new(
  id: "test123",
)
    
res = s.methods.method_delete(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [::OpenApiSDK::Operations::MethodDeleteRequestBody](../../models/operations/methoddeleterequestbody.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |
| `server_url`                                                                                            | *String*                                                                                                | :heavy_minus_sign:                                                                                      | An optional server URL to use.                                                                          |

### Response

**[T.nilable(::OpenApiSDK::Operations::MethodDeleteResponse)](../../models/operations/methoddeleteresponse.md)**



## method_get

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

    
res = s.methods.method_get()

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[T.nilable(::OpenApiSDK::Operations::MethodGetResponse)](../../models/operations/methodgetresponse.md)**



## method_head

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

    
res = s.methods.method_head()

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[T.nilable(::OpenApiSDK::Operations::MethodHeadResponse)](../../models/operations/methodheadresponse.md)**



## method_options

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

    
res = s.methods.method_options()

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[T.nilable(::OpenApiSDK::Operations::MethodOptionsResponse)](../../models/operations/methodoptionsresponse.md)**



## method_patch

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


req = ::OpenApiSDK::Operations::MethodPatchRequestBody.new(
  id: "test123",
)
    
res = s.methods.method_patch(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [::OpenApiSDK::Operations::MethodPatchRequestBody](../../models/operations/methodpatchrequestbody.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |
| `server_url`                                                                                          | *String*                                                                                              | :heavy_minus_sign:                                                                                    | An optional server URL to use.                                                                        |

### Response

**[T.nilable(::OpenApiSDK::Operations::MethodPatchResponse)](../../models/operations/methodpatchresponse.md)**



## method_post

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


req = ::OpenApiSDK::Operations::MethodPostRequestBody.new(
  id: "test123",
)
    
res = s.methods.method_post(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [::OpenApiSDK::Operations::MethodPostRequestBody](../../models/operations/methodpostrequestbody.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |
| `server_url`                                                                                        | *String*                                                                                            | :heavy_minus_sign:                                                                                  | An optional server URL to use.                                                                      |

### Response

**[T.nilable(::OpenApiSDK::Operations::MethodPostResponse)](../../models/operations/methodpostresponse.md)**



## method_put

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


req = ::OpenApiSDK::Operations::MethodPutRequestBody.new(
  id: "test123",
)
    
res = s.methods.method_put(req)

if ! res.object.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [::OpenApiSDK::Operations::MethodPutRequestBody](../../models/operations/methodputrequestbody.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |
| `server_url`                                                                                      | *String*                                                                                          | :heavy_minus_sign:                                                                                | An optional server URL to use.                                                                    |

### Response

**[T.nilable(::OpenApiSDK::Operations::MethodPutResponse)](../../models/operations/methodputresponse.md)**



## method_trace

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

    
res = s.methods.method_trace()

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[T.nilable(::OpenApiSDK::Operations::MethodTraceResponse)](../../models/operations/methodtraceresponse.md)**

