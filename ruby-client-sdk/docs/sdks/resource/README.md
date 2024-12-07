# Resource
(*resource*)

## Overview

### Available Operations

* [create_file](#create_file)
* [create_resource](#create_resource)
* [delete_resource](#delete_resource)
* [get_array_data_source](#get_array_data_source)
* [get_resource](#get_resource)
* [update_resource](#update_resource)

## create_file

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


req = ::OpenApiSDK::Operations::CreateFileRequestBody.new()
    
res = s.resource.create_file(req)

if ! res.file_resource.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [::OpenApiSDK::Operations::CreateFileRequestBody](../../models/operations/createfilerequestbody.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[T.nilable(::OpenApiSDK::Operations::CreateFileResponse)](../../models/operations/createfileresponse.md)**



## create_resource

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


req = ::OpenApiSDK::Shared::ExampleResource.new(
  chocolates: [
    ::OpenApiSDK::Shared::Chocolates.new(
      description: "athwart polarisation abaft bog",
    ),
  ],
  id: "<id>",
  name: "<value>",
  vehicle: "<value>",
)
    
res = s.resource.create_resource(req)

if ! res.example_resource.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [::OpenApiSDK::Shared::ExampleResource](../../models/shared/exampleresource.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[T.nilable(::OpenApiSDK::Operations::CreateResourceResponse)](../../models/operations/createresourceresponse.md)**



## delete_resource

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

    
res = s.resource.delete_resource(resource_id="<id>")

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `resource_id`      | *::String*         | :heavy_check_mark: | N/A                |

### Response

**[T.nilable(::OpenApiSDK::Operations::DeleteResourceResponse)](../../models/operations/deleteresourceresponse.md)**



## get_array_data_source

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

    
res = s.resource.get_array_data_source(filter="<value>")

if ! res.array_data_source.nil?
  # handle response
end

```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `filter`           | *::String*         | :heavy_check_mark: | N/A                |

### Response

**[T.nilable(::OpenApiSDK::Operations::GetArrayDataSourceResponse)](../../models/operations/getarraydatasourceresponse.md)**



## get_resource

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

    
res = s.resource.get_resource(resource_id="<id>")

if ! res.example_resource.nil?
  # handle response
end

```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `resource_id`      | *::String*         | :heavy_check_mark: | N/A                |

### Response

**[T.nilable(::OpenApiSDK::Operations::GetResourceResponse)](../../models/operations/getresourceresponse.md)**



## update_resource

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

    
res = s.resource.update_resource(augment="<value>", resource_id="<id>")

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `augment`          | *::String*         | :heavy_check_mark: | N/A                |
| `resource_id`      | *::String*         | :heavy_check_mark: | N/A                |

### Response

**[T.nilable(::OpenApiSDK::Operations::UpdateResourceResponse)](../../models/operations/updateresourceresponse.md)**

