# request_bodies

## Overview

Endpoints for testing request bodies.

### Available Operations

* [request_body_post_application_json_array](#request_body_post_application_json_array)
* [request_body_post_application_json_array_obj](#request_body_post_application_json_array_obj)
* [request_body_post_application_json_array_of_array](#request_body_post_application_json_array_of_array)
* [request_body_post_application_json_array_of_array_of_primitive](#request_body_post_application_json_array_of_array_of_primitive)
* [request_body_post_application_json_array_of_map](#request_body_post_application_json_array_of_map)
* [request_body_post_application_json_array_of_primitive](#request_body_post_application_json_array_of_primitive)
* [request_body_post_application_json_deep](#request_body_post_application_json_deep)
* [request_body_post_application_json_map](#request_body_post_application_json_map)
* [request_body_post_application_json_map_obj](#request_body_post_application_json_map_obj)
* [request_body_post_application_json_map_of_array](#request_body_post_application_json_map_of_array)
* [request_body_post_application_json_map_of_map](#request_body_post_application_json_map_of_map)
* [request_body_post_application_json_map_of_map_of_primitive](#request_body_post_application_json_map_of_map_of_primitive)
* [request_body_post_application_json_map_of_primitive](#request_body_post_application_json_map_of_primitive)
* [request_body_post_application_json_multiple_json_filtered](#request_body_post_application_json_multiple_json_filtered)
* [request_body_post_application_json_simple](#request_body_post_application_json_simple)
* [request_body_post_form_deep](#request_body_post_form_deep)
* [request_body_post_form_map_primitive](#request_body_post_form_map_primitive)
* [request_body_post_form_simple](#request_body_post_form_simple)
* [request_body_post_multiple_content_types_component_filtered](#request_body_post_multiple_content_types_component_filtered)
* [request_body_post_multiple_content_types_inline_filtered](#request_body_post_multiple_content_types_inline_filtered)
* [request_body_post_multiple_content_types_split_param_form](#request_body_post_multiple_content_types_split_param_form)
* [request_body_post_multiple_content_types_split_param_json](#request_body_post_multiple_content_types_split_param_json)
* [request_body_post_multiple_content_types_split_param_multipart](#request_body_post_multiple_content_types_split_param_multipart)
* [request_body_post_multiple_content_types_split_form](#request_body_post_multiple_content_types_split_form)
* [request_body_post_multiple_content_types_split_json](#request_body_post_multiple_content_types_split_json)
* [request_body_post_multiple_content_types_split_multipart](#request_body_post_multiple_content_types_split_multipart)
* [request_body_put_bytes](#request_body_put_bytes)
* [request_body_put_multipart_deep](#request_body_put_multipart_deep)
* [request_body_put_multipart_file](#request_body_put_multipart_file)
* [request_body_put_multipart_simple](#request_body_put_multipart_simple)
* [request_body_put_string](#request_body_put_string)

## request_body_post_application_json_array

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

req = [
    shared.SimpleObject(
        any='libero',
        bigint=13948,
        bigint_str='aut',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        enum=shared.EnumEnum.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32EnumEnum.SIXTY_NINE,
        int_enum=shared.SimpleObjectIntEnumEnum.THIRD,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
    shared.SimpleObject(
        any='aliquam',
        bigint=146946,
        bigint_str='accusamus',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        enum=shared.EnumEnum.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32EnumEnum.FIFTY_FIVE,
        int_enum=shared.SimpleObjectIntEnumEnum.FIRST,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
    shared.SimpleObject(
        any='et',
        bigint=677412,
        bigint_str='laborum',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        enum=shared.EnumEnum.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE,
        int_enum=shared.SimpleObjectIntEnumEnum.FIRST,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
    shared.SimpleObject(
        any='eum',
        bigint=420539,
        bigint_str='nobis',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        enum=shared.EnumEnum.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32EnumEnum.SIXTY_NINE,
        int_enum=shared.SimpleObjectIntEnumEnum.THIRD,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
]

res = s.request_bodies.request_body_post_application_json_array(req)

if res.simple_objects is not None:
    # handle response
```

## request_body_post_application_json_array_obj

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

req = [
    shared.SimpleObject(
        any='voluptas',
        bigint=727044,
        bigint_str='quasi',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        enum=shared.EnumEnum.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32EnumEnum.FIFTY_FIVE,
        int_enum=shared.SimpleObjectIntEnumEnum.FIRST,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
    shared.SimpleObject(
        any='explicabo',
        bigint=591935,
        bigint_str='ipsa',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        enum=shared.EnumEnum.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32EnumEnum.SIXTY_NINE,
        int_enum=shared.SimpleObjectIntEnumEnum.FIRST,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
    shared.SimpleObject(
        any='odio',
        bigint=262118,
        bigint_str='esse',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        enum=shared.EnumEnum.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32EnumEnum.SIXTY_NINE,
        int_enum=shared.SimpleObjectIntEnumEnum.SECOND,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
    shared.SimpleObject(
        any='fuga',
        bigint=442015,
        bigint_str='quidem',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        enum=shared.EnumEnum.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE,
        int_enum=shared.SimpleObjectIntEnumEnum.FIRST,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
]

res = s.request_bodies.request_body_post_application_json_array_obj(req)

if res.arr_obj_value is not None:
    # handle response
```

## request_body_post_application_json_array_of_array

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

req = [
    [
        shared.SimpleObject(
            any='assumenda',
            bigint=181151,
            bigint_str='praesentium',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE,
            int_enum=shared.SimpleObjectIntEnumEnum.FIRST,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
        shared.SimpleObject(
            any='ipsa',
            bigint=660040,
            bigint_str='quidem',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.FIFTY_FIVE,
            int_enum=shared.SimpleObjectIntEnumEnum.THIRD,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
    ],
    [
        shared.SimpleObject(
            any='quo',
            bigint=681359,
            bigint_str='eius',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.FIFTY_FIVE,
            int_enum=shared.SimpleObjectIntEnumEnum.SECOND,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
        shared.SimpleObject(
            any='ab',
            bigint=587600,
            bigint_str='consequatur',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.FIFTY_FIVE,
            int_enum=shared.SimpleObjectIntEnumEnum.THIRD,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
        shared.SimpleObject(
            any='ipsam',
            bigint=133465,
            bigint_str='sequi',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE,
            int_enum=shared.SimpleObjectIntEnumEnum.SECOND,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
        shared.SimpleObject(
            any='recusandae',
            bigint=44612,
            bigint_str='distinctio',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE,
            int_enum=shared.SimpleObjectIntEnumEnum.SECOND,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
    ],
]

res = s.request_bodies.request_body_post_application_json_array_of_array(req)

if res.arrs is not None:
    # handle response
```

## request_body_post_application_json_array_of_array_of_primitive

### Example Usage

```python
import sdk


s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = [
    [
        'totam',
        'accusamus',
    ],
]

res = s.request_bodies.request_body_post_application_json_array_of_array_of_primitive(req)

if res.arrs is not None:
    # handle response
```

## request_body_post_application_json_array_of_map

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

req = [
    {
        "occaecati": shared.SimpleObject(
            any='commodi',
            bigint=959434,
            bigint_str='dolores',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.SIXTY_NINE,
            int_enum=shared.SimpleObjectIntEnumEnum.SECOND,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
        "accusantium": shared.SimpleObject(
            any='porro',
            bigint=430402,
            bigint_str='quas',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.SIXTY_NINE,
            int_enum=shared.SimpleObjectIntEnumEnum.FIRST,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
    },
    {
        "fugit": shared.SimpleObject(
            any='fuga',
            bigint=649463,
            bigint_str='incidunt',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.SIXTY_NINE,
            int_enum=shared.SimpleObjectIntEnumEnum.FIRST,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
        "minima": shared.SimpleObject(
            any='nisi',
            bigint=147014,
            bigint_str='sapiente',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.FIFTY_FIVE,
            int_enum=shared.SimpleObjectIntEnumEnum.FIRST,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
        "explicabo": shared.SimpleObject(
            any='saepe',
            bigint=578922,
            bigint_str='atque',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.FIFTY_FIVE,
            int_enum=shared.SimpleObjectIntEnumEnum.SECOND,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
    },
]

res = s.request_bodies.request_body_post_application_json_array_of_map(req)

if res.maps is not None:
    # handle response
```

## request_body_post_application_json_array_of_primitive

### Example Usage

```python
import sdk


s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = [
    'accusamus',
    'veritatis',
    'esse',
    'quod',
]

res = s.request_bodies.request_body_post_application_json_array_of_primitive(req)

if res.strings is not None:
    # handle response
```

## request_body_post_application_json_deep

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

req = shared.DeepObject(
    any='vero',
    arr=[
        shared.SimpleObject(
            any='quasi',
            bigint=904045,
            bigint_str='vel',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE,
            int_enum=shared.SimpleObjectIntEnumEnum.SECOND,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
        shared.SimpleObject(
            any='rerum',
            bigint=580197,
            bigint_str='minima',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE,
            int_enum=shared.SimpleObjectIntEnumEnum.THIRD,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
    ],
    bool=False,
    int=27069,
    map={
        "tempore": shared.SimpleObject(
            any='adipisci',
            bigint=766964,
            bigint_str='consequuntur',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.FIFTY_FIVE,
            int_enum=shared.SimpleObjectIntEnumEnum.THIRD,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
        "quaerat": shared.SimpleObject(
            any='sapiente',
            bigint=232865,
            bigint_str='esse',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.SIXTY_NINE,
            int_enum=shared.SimpleObjectIntEnumEnum.SECOND,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
        "a": shared.SimpleObject(
            any='nulla',
            bigint=557811,
            bigint_str='esse',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.FIFTY_FIVE,
            int_enum=shared.SimpleObjectIntEnumEnum.THIRD,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
    },
    num=6216.79,
    obj=shared.SimpleObject(
        any='sint',
        bigint=863023,
        bigint_str='possimus',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        enum=shared.EnumEnum.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32EnumEnum.FIFTY_FIVE,
        int_enum=shared.SimpleObjectIntEnumEnum.THIRD,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
    str_='asperiores',
    type='facere',
)

res = s.request_bodies.request_body_post_application_json_deep(req)

if res.res is not None:
    # handle response
```

## request_body_post_application_json_map

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

req = {
    "consequuntur": shared.SimpleObject(
        any='quasi',
        bigint=628899,
        bigint_str='culpa',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        enum=shared.EnumEnum.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32EnumEnum.SIXTY_NINE,
        int_enum=shared.SimpleObjectIntEnumEnum.THIRD,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
}

res = s.request_bodies.request_body_post_application_json_map(req)

if res.res is not None:
    # handle response
```

## request_body_post_application_json_map_obj

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

req = {
    "earum": shared.SimpleObject(
        any='vel',
        bigint=447378,
        bigint_str='eius',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        enum=shared.EnumEnum.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE,
        int_enum=shared.SimpleObjectIntEnumEnum.THIRD,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
}

res = s.request_bodies.request_body_post_application_json_map_obj(req)

if res.map_obj_value is not None:
    # handle response
```

## request_body_post_application_json_map_of_array

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

req = {
    "accusantium": [
        shared.SimpleObject(
            any='sapiente',
            bigint=119771,
            bigint_str='ullam',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.SIXTY_NINE,
            int_enum=shared.SimpleObjectIntEnumEnum.SECOND,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
        shared.SimpleObject(
            any='nisi',
            bigint=16328,
            bigint_str='voluptatum',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.FIFTY_FIVE,
            int_enum=shared.SimpleObjectIntEnumEnum.THIRD,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
    ],
    "ex": [
        shared.SimpleObject(
            any='itaque',
            bigint=680270,
            bigint_str='architecto',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.SIXTY_NINE,
            int_enum=shared.SimpleObjectIntEnumEnum.THIRD,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
        shared.SimpleObject(
            any='quasi',
            bigint=869489,
            bigint_str='et',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.SIXTY_NINE,
            int_enum=shared.SimpleObjectIntEnumEnum.FIRST,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
        shared.SimpleObject(
            any='minima',
            bigint=86532,
            bigint_str='consectetur',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.FIFTY_FIVE,
            int_enum=shared.SimpleObjectIntEnumEnum.SECOND,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
    ],
    "temporibus": [
        shared.SimpleObject(
            any='rem',
            bigint=15606,
            bigint_str='laudantium',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.SIXTY_NINE,
            int_enum=shared.SimpleObjectIntEnumEnum.SECOND,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
    ],
}

res = s.request_bodies.request_body_post_application_json_map_of_array(req)

if res.res is not None:
    # handle response
```

## request_body_post_application_json_map_of_map

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

req = {
    "corrupti": {
        "voluptatem": shared.SimpleObject(
            any='dolor',
            bigint=580152,
            bigint_str='numquam',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE,
            int_enum=shared.SimpleObjectIntEnumEnum.FIRST,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
        "voluptas": shared.SimpleObject(
            any='aut',
            bigint=491025,
            bigint_str='dicta',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE,
            int_enum=shared.SimpleObjectIntEnumEnum.SECOND,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
    },
}

res = s.request_bodies.request_body_post_application_json_map_of_map(req)

if res.res is not None:
    # handle response
```

## request_body_post_application_json_map_of_map_of_primitive

### Example Usage

```python
import sdk


s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = {
    "voluptatibus": {
        "asperiores": 'aperiam',
        "ea": 'quaerat',
    },
}

res = s.request_bodies.request_body_post_application_json_map_of_map_of_primitive(req)

if res.res is not None:
    # handle response
```

## request_body_post_application_json_map_of_primitive

### Example Usage

```python
import sdk


s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = {
    "repellendus": 'officia',
}

res = s.request_bodies.request_body_post_application_json_map_of_primitive(req)

if res.res is not None:
    # handle response
```

## request_body_post_application_json_multiple_json_filtered

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

req = shared.SimpleObject(
    any='maxime',
    bigint=490305,
    bigint_str='officia',
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
    enum=shared.EnumEnum.TWO,
    float32=2.2222222,
    int=999999,
    int32=1,
    int32_enum=shared.SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE,
    int_enum=shared.SimpleObjectIntEnumEnum.SECOND,
    int_opt_null=999999,
    num=1.1,
    num_opt_null=1.1,
    str_='example',
    str_opt='optional example',
)

res = s.request_bodies.request_body_post_application_json_multiple_json_filtered(req)

if res.res is not None:
    # handle response
```

## request_body_post_application_json_simple

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

req = shared.SimpleObject(
    any='quae',
    bigint=312753,
    bigint_str='porro',
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
    enum=shared.EnumEnum.TWO,
    float32=2.2222222,
    int=999999,
    int32=1,
    int32_enum=shared.SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE,
    int_enum=shared.SimpleObjectIntEnumEnum.FIRST,
    int_opt_null=999999,
    num=1.1,
    num_opt_null=1.1,
    str_='example',
    str_opt='optional example',
)

res = s.request_bodies.request_body_post_application_json_simple(req)

if res.res is not None:
    # handle response
```

## request_body_post_form_deep

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

req = shared.DeepObject(
    any=shared.SimpleObject(
        any='adipisci',
        bigint=683573,
        bigint_str='id',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        enum=shared.EnumEnum.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32EnumEnum.SIXTY_NINE,
        int_enum=shared.SimpleObjectIntEnumEnum.FIRST,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
    arr=[
        shared.SimpleObject(
            any='est',
            bigint=926880,
            bigint_str='totam',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE,
            int_enum=shared.SimpleObjectIntEnumEnum.SECOND,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
        shared.SimpleObject(
            any='ducimus',
            bigint=554688,
            bigint_str='vel',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.FIFTY_FIVE,
            int_enum=shared.SimpleObjectIntEnumEnum.THIRD,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
        shared.SimpleObject(
            any='facilis',
            bigint=738227,
            bigint_str='commodi',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.SIXTY_NINE,
            int_enum=shared.SimpleObjectIntEnumEnum.SECOND,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
    ],
    bool=False,
    int=968904,
    map={
        "nemo": shared.SimpleObject(
            any='recusandae',
            bigint=397533,
            bigint_str='aperiam',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE,
            int_enum=shared.SimpleObjectIntEnumEnum.FIRST,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
        "in": shared.SimpleObject(
            any='exercitationem',
            bigint=937285,
            bigint_str='facere',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.FIFTY_FIVE,
            int_enum=shared.SimpleObjectIntEnumEnum.THIRD,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
        "suscipit": shared.SimpleObject(
            any='reiciendis',
            bigint=697142,
            bigint_str='saepe',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE,
            int_enum=shared.SimpleObjectIntEnumEnum.FIRST,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
        "sunt": shared.SimpleObject(
            any='asperiores',
            bigint=241545,
            bigint_str='non',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.FIFTY_FIVE,
            int_enum=shared.SimpleObjectIntEnumEnum.FIRST,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
    },
    num=4895.09,
    obj=shared.SimpleObject(
        any='a',
        bigint=891523,
        bigint_str='consectetur',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        enum=shared.EnumEnum.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32EnumEnum.SIXTY_NINE,
        int_enum=shared.SimpleObjectIntEnumEnum.THIRD,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
    str_='laboriosam',
    type='ipsa',
)

res = s.request_bodies.request_body_post_form_deep(req)

if res.res is not None:
    # handle response
```

## request_body_post_form_map_primitive

### Example Usage

```python
import sdk


s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = {
    "libero": 'vitae',
    "accusamus": 'similique',
    "tempora": 'aspernatur',
    "voluptas": 'voluptas',
}

res = s.request_bodies.request_body_post_form_map_primitive(req)

if res.res is not None:
    # handle response
```

## request_body_post_form_simple

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

req = shared.SimpleObject(
    any='voluptas',
    bigint=324405,
    bigint_str='nobis',
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
    enum=shared.EnumEnum.TWO,
    float32=2.2222222,
    int=999999,
    int32=1,
    int32_enum=shared.SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE,
    int_enum=shared.SimpleObjectIntEnumEnum.FIRST,
    int_opt_null=999999,
    num=1.1,
    num_opt_null=1.1,
    str_='example',
    str_opt='optional example',
)

res = s.request_bodies.request_body_post_form_simple(req)

if res.res is not None:
    # handle response
```

## request_body_post_multiple_content_types_component_filtered

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

req = shared.SimpleObject(
    any='minus',
    bigint=171853,
    bigint_str='blanditiis',
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
    enum=shared.EnumEnum.TWO,
    float32=2.2222222,
    int=999999,
    int32=1,
    int32_enum=shared.SimpleObjectInt32EnumEnum.SIXTY_NINE,
    int_enum=shared.SimpleObjectIntEnumEnum.FIRST,
    int_opt_null=999999,
    num=1.1,
    num_opt_null=1.1,
    str_='example',
    str_opt='optional example',
)

res = s.request_bodies.request_body_post_multiple_content_types_component_filtered(req)

if res.res is not None:
    # handle response
```

## request_body_post_multiple_content_types_inline_filtered

### Example Usage

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON(
    bool=False,
    num=3044.68,
    str_='officiis',
)

res = s.request_bodies.request_body_post_multiple_content_types_inline_filtered(req)

if res.res is not None:
    # handle response
```

## request_body_post_multiple_content_types_split_param_form

### Example Usage

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.RequestBodyPostMultipleContentTypesSplitParamFormRequest(
    request_body=operations.RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded(
        bool3=False,
        num3=8391.89,
        str3='ullam',
    ),
    param_str='adipisci',
)

res = s.request_bodies.request_body_post_multiple_content_types_split_param_form(req)

if res.res is not None:
    # handle response
```

## request_body_post_multiple_content_types_split_param_json

### Example Usage

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.RequestBodyPostMultipleContentTypesSplitParamJSONRequest(
    request_body=operations.RequestBodyPostMultipleContentTypesSplitParamApplicationJSON(
        bool=False,
        num=7383.91,
        str_='blanditiis',
    ),
    param_str='quas',
)

res = s.request_bodies.request_body_post_multiple_content_types_split_param_json(req)

if res.res is not None:
    # handle response
```

## request_body_post_multiple_content_types_split_param_multipart

### Example Usage

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.RequestBodyPostMultipleContentTypesSplitParamMultipartRequest(
    request_body=operations.RequestBodyPostMultipleContentTypesSplitParamMultipartFormData(
        bool2=False,
        num2=9425.84,
        str2='nesciunt',
    ),
    param_str='culpa',
)

res = s.request_bodies.request_body_post_multiple_content_types_split_param_multipart(req)

if res.res is not None:
    # handle response
```

## request_body_post_multiple_content_types_split_form

### Example Usage

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded(
    bool3=False,
    num3=5485.19,
    str3='pariatur',
)

res = s.request_bodies.request_body_post_multiple_content_types_split_form(req)

if res.res is not None:
    # handle response
```

## request_body_post_multiple_content_types_split_json

### Example Usage

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.RequestBodyPostMultipleContentTypesSplitApplicationJSON(
    bool=False,
    num=5196.43,
    str_='hic',
)

res = s.request_bodies.request_body_post_multiple_content_types_split_json(req)

if res.res is not None:
    # handle response
```

## request_body_post_multiple_content_types_split_multipart

### Example Usage

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.RequestBodyPostMultipleContentTypesSplitMultipartFormData(
    bool2=False,
    num2=3487.83,
    str2='nobis',
)

res = s.request_bodies.request_body_post_multiple_content_types_split_multipart(req)

if res.res is not None:
    # handle response
```

## request_body_put_bytes

### Example Usage

```python
import sdk


s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = 'sit'.encode()

res = s.request_bodies.request_body_put_bytes(req)

if res.res is not None:
    # handle response
```

## request_body_put_multipart_deep

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

req = shared.DeepObject(
    any='sed',
    arr=[
        shared.SimpleObject(
            any='explicabo',
            bigint=994401,
            bigint_str='facilis',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.SIXTY_NINE,
            int_enum=shared.SimpleObjectIntEnumEnum.THIRD,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
        shared.SimpleObject(
            any='ab',
            bigint=611749,
            bigint_str='dolore',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE,
            int_enum=shared.SimpleObjectIntEnumEnum.FIRST,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
        shared.SimpleObject(
            any='in',
            bigint=417486,
            bigint_str='quidem',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.FIFTY_FIVE,
            int_enum=shared.SimpleObjectIntEnumEnum.SECOND,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
        shared.SimpleObject(
            any='unde',
            bigint=100032,
            bigint_str='suscipit',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE,
            int_enum=shared.SimpleObjectIntEnumEnum.THIRD,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
    ],
    bool=False,
    int=72434,
    map={
        "perferendis": shared.SimpleObject(
            any='corrupti',
            bigint=979574,
            bigint_str='incidunt',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.FIFTY_FIVE,
            int_enum=shared.SimpleObjectIntEnumEnum.SECOND,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
        "eius": shared.SimpleObject(
            any='necessitatibus',
            bigint=215529,
            bigint_str='ea',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.SIXTY_NINE,
            int_enum=shared.SimpleObjectIntEnumEnum.SECOND,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
        "voluptatibus": shared.SimpleObject(
            any='tempora',
            bigint=273009,
            bigint_str='voluptate',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE,
            int_enum=shared.SimpleObjectIntEnumEnum.SECOND,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
        "sit": shared.SimpleObject(
            any='non',
            bigint=888044,
            bigint_str='praesentium',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            enum=shared.EnumEnum.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32EnumEnum.ONE_HUNDRED_AND_EIGHTY_ONE,
            int_enum=shared.SimpleObjectIntEnumEnum.FIRST,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
    },
    num=2777.73,
    obj=shared.SimpleObject(
        any='ipsam',
        bigint=894864,
        bigint_str='rem',
        bool=True,
        bool_opt=True,
        date_=dateutil.parser.parse('2020-01-01').date(),
        date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
        enum=shared.EnumEnum.TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=shared.SimpleObjectInt32EnumEnum.FIFTY_FIVE,
        int_enum=shared.SimpleObjectIntEnumEnum.THIRD,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_='example',
        str_opt='optional example',
    ),
    str_='error',
    type='veniam',
)

res = s.request_bodies.request_body_put_multipart_deep(req)

if res.res is not None:
    # handle response
```

## request_body_put_multipart_file

### Example Usage

```python
import sdk
from sdk.models import operations

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.RequestBodyPutMultipartFileRequestBody(
    file=operations.RequestBodyPutMultipartFileRequestBodyFile(
        content='minima'.encode(),
        file='recusandae',
    ),
)

res = s.request_bodies.request_body_put_multipart_file(req)

if res.res is not None:
    # handle response
```

## request_body_put_multipart_simple

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

req = shared.SimpleObject(
    any='reiciendis',
    bigint=862319,
    bigint_str='magni',
    bool=True,
    bool_opt=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
    enum=shared.EnumEnum.TWO,
    float32=2.2222222,
    int=999999,
    int32=1,
    int32_enum=shared.SimpleObjectInt32EnumEnum.FIFTY_FIVE,
    int_enum=shared.SimpleObjectIntEnumEnum.THIRD,
    int_opt_null=999999,
    num=1.1,
    num_opt_null=1.1,
    str_='example',
    str_opt='optional example',
)

res = s.request_bodies.request_body_put_multipart_simple(req)

if res.res is not None:
    # handle response
```

## request_body_put_string

### Example Usage

```python
import sdk


s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = 'numquam'

res = s.request_bodies.request_body_put_string(req)

if res.res is not None:
    # handle response
```
