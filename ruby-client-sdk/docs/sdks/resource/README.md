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
      content="officia".encode(),
      file="dignissimos",
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
      8989.61,
      3591.11,
      1855.18,
      7088.98,
    ],
    array_of_string=.new[
      "cupiditate",
      "minima",
      "placeat",
    ],
    chocolates=.new[
      Shared::ExampleResourceChocolates.new(
        description="neque",
      ),
      Shared::ExampleResourceChocolates.new(
        description="in",
      ),
    ],
    created_at=DateTime.iso8601('2021-09-13T18:43:27.876Z'),
    enum_number=Shared::ExampleResourceEnumNumber::ONE,
    enum_str=Shared::ExampleResourceEnumStr::TWO,
    id="4efb0b34-896c-43ca-9acf-be2fd5707577",
    map_of_integer=.new{
      "dolores": 621169,
      "veritatis": 498180,
      "voluptate": 866789,
    },
    map_of_string=.new{
      "similique": "optio",
      "ex": "quaerat",
      "commodi": "officiis",
      "placeat": "quidem",
    },
    name="Constance Effertz V",
    updated_at=DateTime.iso8601('2022-06-01T14:00:05.540Z'),
    vehicle=Shared::ExampleCar.new(
      created_at=DateTime.iso8601('2022-10-05T07:29:39.358Z'),
      make="earum",
      model="veniam",
      name="Mr. Todd Reilly",
      type=Shared::ExampleCarType::CAR,
      updated_at=DateTime.iso8601('2022-11-20T11:30:36.362Z'),
      year=4973.57,
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
    resource_id="maiores",
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
    resource_id="veritatis",
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
    resource_id="quasi",
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

