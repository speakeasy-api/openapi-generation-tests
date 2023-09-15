# resource

### Available Operations

* [create_file](#create_file)
* [create_resource](#create_resource)
* [delete_resource](#delete_resource)
* [get_resource](#get_resource)
* [update_resource](#update_resource)

## create_file

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::CreateFileRequestBody.new(
  request=Operations::CreateFileRequestBody.new(
    file=Operations::CreateFileRequestBodyFile.new(
      content="aliquam".encode(),
      file="ad",
    ),
  ),
)
    
res = s.resource.create_file(req)

if ! res.file_resource.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [Operations::CreateFileRequestBody](../../models/operations/createfilerequestbody.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |


### Response

**[T.nilable(Operations::CreateFileResponse)](../../models/operations/createfileresponse.md)**


## create_resource

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::ExampleResource.new(
  request=Shared::ExampleResource.new(
    array_of_number=.new[
      9979.63,
    ],
    array_of_string=.new[
      "alias",
    ],
    chocolates=.new[
      Shared::ExampleResourceChocolates.new(
        description="corporis",
      ),
    ],
    created_at=DateTime.iso8601('2022-01-22T10:13:48.972Z'),
    enum_number=Shared::ExampleResourceEnumNumber::TWO,
    enum_str=Shared::ExampleResourceEnumStr::TWO,
    id="0ff2a54a-31e9-4476-8a3e-865e7956f925",
    map_of_integer=.new{
      "quasi": 657020,
    },
    map_of_string=.new{
      "nostrum": "mollitia",
    },
    name="Rufus Okuneva",
    updated_at=DateTime.iso8601('2022-01-01T06:19:29.377Z'),
    vehicle=Shared::ExampleCar.new(
      created_at=DateTime.iso8601('2022-07-21T10:16:07.152Z'),
      make="nam",
      model="earum",
      name="Neal Schulist",
      type=Shared::ExampleCarType::CAR,
      updated_at=DateTime.iso8601('2021-03-22T10:48:54.502Z'),
      year=9569.33,
    ),
  ),
)
    
res = s.resource.create_resource(req)

if ! res.example_resource.nil?
  # handle response
end

```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [Shared::ExampleResource](../../models/shared/exampleresource.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |


### Response

**[T.nilable(Operations::CreateResourceResponse)](../../models/operations/createresourceresponse.md)**


## delete_resource

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::DeleteResourceRequest.new(
  path_params=Operations::DeleteResourceRequest.new(
    resource_id="cumque",
  ),
)
    
res = s.resource.delete_resource(req)

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `resource_id`      | *String*           | :heavy_check_mark: | N/A                |


### Response

**[T.nilable(Operations::DeleteResourceResponse)](../../models/operations/deleteresourceresponse.md)**


## get_resource

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::GetResourceRequest.new(
  path_params=Operations::GetResourceRequest.new(
    resource_id="vitae",
  ),
)
    
res = s.resource.get_resource(req)

if ! res.example_resource.nil?
  # handle response
end

```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `resource_id`      | *String*           | :heavy_check_mark: | N/A                |


### Response

**[T.nilable(Operations::GetResourceResponse)](../../models/operations/getresourceresponse.md)**


## update_resource

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::UpdateResourceRequest.new(
  path_params=Operations::UpdateResourceRequest.new(
    resource_id="rerum",
  ),
)
    
res = s.resource.update_resource(req)

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `resource_id`      | *String*           | :heavy_check_mark: | N/A                |


### Response

**[T.nilable(Operations::UpdateResourceResponse)](../../models/operations/updateresourceresponse.md)**

