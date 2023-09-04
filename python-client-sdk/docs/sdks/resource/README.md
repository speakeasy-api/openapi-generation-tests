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
        content='nulla'.encode(),
        file='deserunt',
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
        3644.63,
        4445.87,
    ],
    array_of_string=[
        'quis',
        'sint',
        'accusamus',
    ],
    chocolates=[
        shared.ExampleResourceChocolates(
            description='hic',
        ),
        shared.ExampleResourceChocolates(
            description='necessitatibus',
        ),
        shared.ExampleResourceChocolates(
            description='asperiores',
        ),
        shared.ExampleResourceChocolates(
            description='ex',
        ),
    ],
    created_at=dateutil.parser.isoparse('2022-02-08T04:46:36.382Z'),
    enum_number=shared.ExampleResourceEnumNumber.THREE,
    enum_str=shared.ExampleResourceEnumStr.ONE,
    id='caa3383c-2beb-4477-b73c-8d72f64d1db1',
    map_of_integer={
        "quia": 782090,
        "aliquam": 247045,
        "illo": 36561,
        "vel": 406922,
    },
    map_of_string={
        "vero": 'excepturi',
    },
    name='Sheila Graham',
    updated_at=dateutil.parser.isoparse('2022-03-25T02:57:12.529Z'),
    vehicle=shared.ExampleCar(
        created_at=dateutil.parser.isoparse('2021-02-19T05:31:39.522Z'),
        make='alias',
        model='nisi',
        name='Jacob Pacocha',
        type=shared.ExampleCarType.CAR,
        updated_at=dateutil.parser.isoparse('2022-12-22T23:09:45.932Z'),
        year=399.92,
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


res = s.resource.delete_resource(resource_id='consequatur')

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


res = s.resource.get_resource(resource_id='officia')

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


res = s.resource.update_resource(resource_id='recusandae')

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `resource_id`      | *str*              | :heavy_check_mark: | N/A                |


### Response

**[operations.UpdateResourceResponse](../../models/operations/updateresourceresponse.md)**

