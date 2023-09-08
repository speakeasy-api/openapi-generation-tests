# resource

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
        content='corporis'.encode(),
        file='reiciendis',
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
        8286.57,
    ],
    array_of_string=[
        'nemo',
    ],
    chocolates=[
        shared.ExampleResourceChocolates(
            description='recusandae',
        ),
    ],
    created_at=dateutil.parser.isoparse('2022-12-15T04:58:32.488Z'),
    enum_number=shared.ExampleResourceEnumNumber.THREE,
    enum_str=shared.ExampleResourceEnumStr.ONE,
    id='75ed4f6f-bee4-41f3-b317-fe35b60eb1ea',
    map_of_integer={
        "tempora": 132815,
    },
    map_of_string={
        "voluptas": 'voluptas',
    },
    name='Cathy Rohan',
    updated_at=dateutil.parser.isoparse('2022-06-26T19:42:01.136Z'),
    vehicle=shared.ExampleCar(
        created_at=dateutil.parser.isoparse('2022-09-14T20:54:59.386Z'),
        make='aliquam',
        model='officiis',
        name='Dustin Ferry',
        type=shared.ExampleCarType.CAR,
        updated_at=dateutil.parser.isoparse('2021-02-11T21:56:06.958Z'),
        year=2015.17,
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


res = s.resource.delete_resource(resource_id='culpa')

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


res = s.resource.get_resource(resource_id='corrupti')

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


res = s.resource.update_resource(resource_id='pariatur')

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `resource_id`      | *str*              | :heavy_check_mark: | N/A                |


### Response

**[operations.UpdateResourceResponse](../../models/operations/updateresourceresponse.md)**

