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
      content="doloremque".encode(),
      file="perferendis",
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
      5144.8,
    ],
    array_of_string=.new[
      "iusto",
    ],
    chocolates=.new[
      Shared::ExampleResourceChocolates.new(
        description="corrupti",
      ),
    ],
    created_at=DateTime.iso8601('2022-08-29T20:43:02.137Z'),
    enum_number=Shared::ExampleResourceEnumNumber::TWO,
    enum_str=Shared::ExampleResourceEnumStr::ONE,
    id="43f5a6c9-8b55-4554-880d-40bcacc6cbd6",
    map_of_integer=.new{
      "nam": 315387,
    },
    map_of_string=.new{
      "maiores": "consectetur",
    },
    name="Ms. Wilbert McGlynn",
    updated_at=DateTime.iso8601('2022-09-13T00:04:52.333Z'),
    vehicle=Shared::ExampleCar.new(
      created_at=DateTime.iso8601('2022-09-26T22:47:17.791Z'),
      make="vel",
      model="cum",
      name="Rufus Conroy",
      type=Shared::ExampleCarType::CAR,
      updated_at=DateTime.iso8601('2022-06-21T19:14:32.478Z'),
      year=987.59,
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
    resource_id="error",
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
    resource_id="nobis",
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
    resource_id="tempora",
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

