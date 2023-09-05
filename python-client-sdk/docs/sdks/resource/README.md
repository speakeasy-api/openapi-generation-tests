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
        content='eum'.encode(),
        file='vel',
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
        3016.92,
        3494.4,
        704.1,
    ],
    array_of_string=[
        'autem',
        'nobis',
        'laboriosam',
        'recusandae',
    ],
    chocolates=[
        shared.ExampleResourceChocolates(
            description='voluptatem',
        ),
    ],
    created_at=dateutil.parser.isoparse('2022-02-08T01:44:39.255Z'),
    enum_number=shared.ExampleResourceEnumNumber.ONE,
    enum_str=shared.ExampleResourceEnumStr.TWO,
    id='deab3fec-9578-4a64-9842-73a8418d1623',
    map_of_integer={
        "cupiditate": 970732,
    },
    map_of_string={
        "alias": 'omnis',
        "eos": 'occaecati',
        "iste": 'magni',
    },
    name='Fannie Tillman',
    updated_at=dateutil.parser.isoparse('2021-01-25T12:50:51.842Z'),
    vehicle=shared.ExampleBoat(
        created_at=dateutil.parser.isoparse('2021-05-25T00:50:01.296Z'),
        length=3004.03,
        name='Byron Johns',
        type=shared.ExampleBoatType.BOAT,
        updated_at=dateutil.parser.isoparse('2021-02-16T06:28:05.594Z'),
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


res = s.resource.delete_resource(resource_id='modi')

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


res = s.resource.get_resource(resource_id='nam')

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


res = s.resource.update_resource(resource_id='vero')

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `resource_id`      | *str*              | :heavy_check_mark: | N/A                |


### Response

**[operations.UpdateResourceResponse](../../models/operations/updateresourceresponse.md)**

