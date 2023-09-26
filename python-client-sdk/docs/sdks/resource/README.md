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

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.CreateFileRequestBody(
    file=operations.CreateFileRequestBodyFile(
        content='nostrum'.encode(),
        file='saepe',
    ),
)

res = s.resource.create_file(req)

if res.file_resource is not None:
    # handle response
```

### Parameters

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `request`                                                                            | [operations.CreateFileRequestBody](../../models/operations/createfilerequestbody.md) | :heavy_check_mark:                                                                   | The request object to use for the request.                                           |


### Response

**[operations.CreateFileResponse](../../models/operations/createfileresponse.md)**


## create_resource

### Example Usage

```python
import sdk
import dateutil.parser
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.ExampleResource(
    array_of_number=[
        6222.31,
    ],
    array_of_string=[
        'consequatur',
    ],
    chocolates=[
        shared.ExampleResourceChocolates(
            description='incidunt',
        ),
    ],
    created_at=dateutil.parser.isoparse('2022-05-16T07:46:15.799Z'),
    enum_number=shared.ExampleResourceEnumNumber.THREE,
    enum_str=shared.ExampleResourceEnumStr.ONE,
    id='194b8abf-603a-479f-9dfe-0ab7da8a50ce',
    map_of_integer={
        "quasi": 542457,
    },
    map_of_string={
        "reprehenderit": 'asperiores',
    },
    name='Sam Powlowski IV',
    updated_at=dateutil.parser.isoparse('2022-03-05T05:01:11.294Z'),
    vehicle=shared.ExampleBoat(
        created_at=dateutil.parser.isoparse('2021-10-02T23:52:38.012Z'),
        length=8872.65,
        name='Tomas Mosciski',
        type=shared.ExampleBoatType.BOAT,
        updated_at=dateutil.parser.isoparse('2022-01-08T02:07:04.894Z'),
    ),
)

res = s.resource.create_resource(req)

if res.example_resource is not None:
    # handle response
```

### Parameters

| Parameter                                                        | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `request`                                                        | [shared.ExampleResource](../../models/shared/exampleresource.md) | :heavy_check_mark:                                               | The request object to use for the request.                       |


### Response

**[operations.CreateResourceResponse](../../models/operations/createresourceresponse.md)**


## delete_resource

### Example Usage

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.resource.delete_resource(resource_id='corrupti')

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `resource_id`      | *str*              | :heavy_check_mark: | N/A                |


### Response

**[operations.DeleteResourceResponse](../../models/operations/deleteresourceresponse.md)**


## get_resource

### Example Usage

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.resource.get_resource(resource_id='at')

if res.example_resource is not None:
    # handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `resource_id`      | *str*              | :heavy_check_mark: | N/A                |


### Response

**[operations.GetResourceResponse](../../models/operations/getresourceresponse.md)**


## update_resource

### Example Usage

```python
import sdk
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.resource.update_resource(resource_id='error')

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `resource_id`      | *str*              | :heavy_check_mark: | N/A                |


### Response

**[operations.UpdateResourceResponse](../../models/operations/updateresourceresponse.md)**

