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
        content='reiciendis'.encode(),
        file='quidem',
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
        9049.49,
    ],
    array_of_string=[
        'necessitatibus',
    ],
    chocolates=[
        shared.ExampleResourceChocolates(
            description='dolore',
        ),
    ],
    created_at=dateutil.parser.isoparse('2022-01-03T21:58:53.395Z'),
    enum_number=shared.ExampleResourceEnumNumber.ONE,
    enum_str=shared.ExampleResourceEnumStr.ONE,
    id='317fe35b-60eb-41ea-8265-55ba3c28744e',
    map_of_integer={
        "temporibus": 351870,
    },
    map_of_string={
        "adipisci": 'cum',
    },
    name='Morris Weissnat',
    updated_at=dateutil.parser.isoparse('2021-04-07T21:05:22.480Z'),
    vehicle=shared.ExampleCar(
        created_at=dateutil.parser.isoparse('2021-12-15T01:59:29.520Z'),
        make='nobis',
        model='sit',
        name='Louis Wisoky',
        type=shared.ExampleCarType.CAR,
        updated_at=dateutil.parser.isoparse('2022-02-05T04:05:02.351Z'),
        year=7090.72,
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


res = s.resource.delete_resource(resource_id='ab')

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


res = s.resource.get_resource(resource_id='iste')

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


res = s.resource.update_resource(resource_id='dolore')

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `resource_id`      | *str*              | :heavy_check_mark: | N/A                |


### Response

**[operations.UpdateResourceResponse](../../models/operations/updateresourceresponse.md)**

