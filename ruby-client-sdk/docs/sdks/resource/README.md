# Resource

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
      content="praesentium".encode(),
      file="maxime",
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
      3004.03,
    ],
    array_of_string=.new[
      "temporibus",
    ],
    chocolates=.new[
      Shared::ExampleResourceChocolates.new(
        description="quos",
      ),
    ],
    created_at=DateTime.iso8601('2022-01-26T06:01:40.776Z'),
    enum_number=Shared::ExampleResourceEnumNumber::TWO,
    enum_str=Shared::ExampleResourceEnumStr::TWO,
    id="e4be0560-13f5-49da-b57a-59ecfef66ef1",
    map_of_integer=.new{
      "minus": 685478,
    },
    map_of_string=.new{
      "laborum": "consectetur",
    },
    name="Leah Emmerich",
    updated_at=DateTime.iso8601('2021-02-26T09:18:15.106Z'),
    vehicle=Shared::ExampleCar.new(
      created_at=DateTime.iso8601('2022-07-08T17:52:09.255Z'),
      make="voluptate",
      model="sequi",
      name="Gladys Satterfield",
      type=Shared::ExampleCarType::CAR,
      updated_at=DateTime.iso8601('2022-11-11T05:43:22.650Z'),
      year=9749.9,
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
    resource_id="vel",
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
    resource_id="magnam",
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
    resource_id="quibusdam",
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

