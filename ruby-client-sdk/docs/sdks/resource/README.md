# Resource
(*resource*)

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
      content="suscipit".encode(),
      file="harum",
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
      4965.78,
    ],
    array_of_string=.new[
      "doloremque",
    ],
    chocolates=.new[
      Shared::ExampleResourceChocolates.new(
        description="perferendis",
      ),
    ],
    created_at=DateTime.iso8601('2022-01-14T08:32:33.785Z'),
    enum_number=Shared::ExampleResourceEnumNumber::TWO,
    enum_str=Shared::ExampleResourceEnumStr::TWO,
    id="56143f5a-6c98-4b55-9540-80d40bcacc6c",
    map_of_integer=.new{
      "soluta": 856568,
    },
    map_of_string=.new{
      "laboriosam": "nam",
    },
    name="Shawna Feil",
    updated_at=DateTime.iso8601('2022-12-10T18:30:11.566Z'),
    vehicle=Shared::ExampleCar.new(
      created_at=DateTime.iso8601('2022-12-19T11:49:13.655Z'),
      make="magnam",
      model="repellat",
      name="Benjamin Kautzer",
      type=Shared::ExampleCarType::CAR,
      updated_at=DateTime.iso8601('2022-07-28T08:20:43.554Z'),
      year=3730.54,
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
    resource_id="nostrum",
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
    resource_id="sequi",
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
    resource_id="voluptatum",
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

