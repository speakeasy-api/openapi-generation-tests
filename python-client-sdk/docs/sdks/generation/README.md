# Generation
(*generation*)

## Overview

Endpoints for purely testing valid generation behavior.

### Available Operations

* [anchor_types_get](#anchor_types_get)
* [array_circular_reference_get](#array_circular_reference_get)
* [circular_reference_get](#circular_reference_get)
* [deprecated_field_in_schema_post](#deprecated_field_in_schema_post)
* [deprecated_object_in_schema_get](#deprecated_object_in_schema_get)
* [~~deprecated_operation_no_comments_get~~](#deprecated_operation_no_comments_get) - :warning: **Deprecated**
* [~~deprecated_operation_with_comments_get~~](#deprecated_operation_with_comments_get) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** Use `simple_path_parameter_objects` instead.
* [empty_object_get](#empty_object_get)
* [empty_response_object_with_comment_get](#empty_response_object_with_comment_get)
* [global_name_overridden](#global_name_overridden)
* [ignored_generation_get](#ignored_generation_get)
* [ignores_post](#ignores_post)
* [name_override](#name_override)
* [object_circular_reference_get](#object_circular_reference_get)
* [one_of_circular_reference_get](#one_of_circular_reference_get)
* [typed_parameter_generation_get](#typed_parameter_generation_get)
* [usage_example_post](#usage_example_post) - An operation used for testing usage examples

## anchor_types_get

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.generation.anchor_types_get()

if res.type_from_anchor is not None:
    # handle response
```


### Response

**[operations.AnchorTypesGetResponse](../../models/operations/anchortypesgetresponse.md)**


## array_circular_reference_get

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.generation.array_circular_reference_get()

if res.array_circular_reference_object is not None:
    # handle response
```


### Response

**[operations.ArrayCircularReferenceGetResponse](../../models/operations/arraycircularreferencegetresponse.md)**


## circular_reference_get

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.generation.circular_reference_get()

if res.valid_circular_reference_object is not None:
    # handle response
```


### Response

**[operations.CircularReferenceGetResponse](../../models/operations/circularreferencegetresponse.md)**


## deprecated_field_in_schema_post

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)

req = shared.DeprecatedFieldInObject(
    deprecated_field='Bike Avon',
    new_field='Rubber Santa',
)

res = s.generation.deprecated_field_in_schema_post(req)

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter                                                                        | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `request`                                                                        | [shared.DeprecatedFieldInObject](../../models/shared/deprecatedfieldinobject.md) | :heavy_check_mark:                                                               | The request object to use for the request.                                       |


### Response

**[operations.DeprecatedFieldInSchemaPostResponse](../../models/operations/deprecatedfieldinschemapostresponse.md)**


## deprecated_object_in_schema_get

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.generation.deprecated_object_in_schema_get()

if res.deprecated_object_in_schema_get_200_application_json_object is not None:
    # handle response
```


### Response

**[operations.DeprecatedObjectInSchemaGetResponse](../../models/operations/deprecatedobjectinschemagetresponse.md)**


## ~~deprecated_operation_no_comments_get~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

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


res = s.generation.deprecated_operation_no_comments_get(deprecated_parameter='Account')

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `deprecated_parameter`                                                                                                  | *Optional[str]*                                                                                                         | :heavy_minus_sign:                                                                                                      | : warning: ** DEPRECATED **: This will be removed in a future release, please migrate away from it as soon as possible. |


### Response

**[operations.DeprecatedOperationNoCommentsGetResponse](../../models/operations/deprecatedoperationnocommentsgetresponse.md)**


## ~~deprecated_operation_with_comments_get~~

This is an endpoint setup to test deprecation with comments

> :warning: **DEPRECATED**: This operation is deprecated. Use `simple_path_parameter_objects` instead.

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


res = s.generation.deprecated_operation_with_comments_get(deprecated_parameter='Account', new_parameter='actuating')

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `deprecated_parameter`                                                                                            | *Optional[str]*                                                                                                   | :heavy_minus_sign:                                                                                                | : warning: ** DEPRECATED **: This parameter is deprecated. Use new_parameter instead.<br/><br/>This is a string parameter |
| `new_parameter`                                                                                                   | *Optional[str]*                                                                                                   | :heavy_minus_sign:                                                                                                | This is a string parameter                                                                                        |


### Response

**[operations.DeprecatedOperationWithCommentsGetResponse](../../models/operations/deprecatedoperationwithcommentsgetresponse.md)**


## empty_object_get

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


res = s.generation.empty_object_get(empty_object=shared.EmptyObjectParam())

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter                                                          | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `empty_object`                                                     | [shared.EmptyObjectParam](../../models/shared/emptyobjectparam.md) | :heavy_check_mark:                                                 | N/A                                                                |


### Response

**[operations.EmptyObjectGetResponse](../../models/operations/emptyobjectgetresponse.md)**


## empty_response_object_with_comment_get

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.generation.empty_response_object_with_comment_get()

if res.body is not None:
    # handle response
```


### Response

**[operations.EmptyResponseObjectWithCommentGetResponse](../../models/operations/emptyresponseobjectwithcommentgetresponse.md)**


## global_name_overridden

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.generation.global_name_overridden()

if res.get_global_name_override_200_application_json_object is not None:
    # handle response
```


### Response

**[operations.GetGlobalNameOverrideResponse](../../models/operations/getglobalnameoverrideresponse.md)**


## ignored_generation_get

### Example Usage

```python
import sdk
from sdk.models import callbacks, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.generation.ignored_generation_get()

if res.ignored_generation_get_200_application_json_object is not None:
    # handle response
```


### Response

**[operations.IgnoredGenerationGetResponse](../../models/operations/ignoredgenerationgetresponse.md)**


## ignores_post

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


res = s.generation.ignores_post(request_body=operations.IgnoresPostApplicationJSON(
    callback_url='http://diligent-activist.biz',
    test_prop='solid Branding Maserati',
), test_param='Maserati')

if res.http_bin_simple_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                                                                      | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `request_body`                                                                                 | [operations.IgnoresPostApplicationJSON](../../models/operations/ignorespostapplicationjson.md) | :heavy_check_mark:                                                                             | N/A                                                                                            |
| `test_param`                                                                                   | *Optional[str]*                                                                                | :heavy_minus_sign:                                                                             | N/A                                                                                            |


### Response

**[operations.IgnoresPostResponse](../../models/operations/ignorespostresponse.md)**


## name_override

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


res = s.generation.name_override(test_enum_query_param=operations.NameOverrideGetEnumNameOverride.VALUE3, test_query_param='example')

if res.overridden_response is not None:
    # handle response
```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              | Example                                                                                                  |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `test_enum_query_param`                                                                                  | [operations.NameOverrideGetEnumNameOverride](../../models/operations/nameoverridegetenumnameoverride.md) | :heavy_check_mark:                                                                                       | An enum type                                                                                             | value3                                                                                                   |
| `test_query_param`                                                                                       | *str*                                                                                                    | :heavy_check_mark:                                                                                       | N/A                                                                                                      | example                                                                                                  |


### Response

**[operations.NameOverrideGetResponse](../../models/operations/nameoverridegetresponse.md)**


## object_circular_reference_get

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.generation.object_circular_reference_get()

if res.object_circular_reference_object is not None:
    # handle response
```


### Response

**[operations.ObjectCircularReferenceGetResponse](../../models/operations/objectcircularreferencegetresponse.md)**


## one_of_circular_reference_get

### Example Usage

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.generation.one_of_circular_reference_get()

if res.one_of_circular_reference_object is not None:
    # handle response
```


### Response

**[operations.OneOfCircularReferenceGetResponse](../../models/operations/oneofcircularreferencegetresponse.md)**


## typed_parameter_generation_get

### Example Usage

```python
import sdk
import dateutil.parser
from decimal import Decimal
from sdk.models import operations, shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_path_param=100,
    global_query_param='some example global query param',
)


res = s.generation.typed_parameter_generation_get(bigint=879275, date_=dateutil.parser.parse('2023-11-18').date(), decimal=Decimal('3346.96'), obj=operations.TypedParameterGenerationGetObj(
    bool=False,
    num=4778.06,
    str_='Progressive Riyal male',
))

if res.status_code == 200:
    # handle response
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `bigint`                                                                                                         | *Optional[int]*                                                                                                  | :heavy_minus_sign:                                                                                               | N/A                                                                                                              |
| `date_`                                                                                                          | [datetime](https://docs.python.org/3/library/datetime.html#datetime-objects)                                     | :heavy_minus_sign:                                                                                               | N/A                                                                                                              |
| `decimal`                                                                                                        | *Optional[Decimal]*                                                                                              | :heavy_minus_sign:                                                                                               | N/A                                                                                                              |
| `obj`                                                                                                            | [Optional[operations.TypedParameterGenerationGetObj]](../../models/operations/typedparametergenerationgetobj.md) | :heavy_minus_sign:                                                                                               | N/A                                                                                                              |


### Response

**[operations.TypedParameterGenerationGetResponse](../../models/operations/typedparametergenerationgetresponse.md)**


## usage_example_post

An operation used for testing usage examples that includes a large array of parameters and input types to ensure that all are handled correctly

Usage example docs
<https://docs.example.com>

### Example Usage

```python
import sdk
import dateutil.parser
from decimal import Decimal
from sdk.models import operations, shared

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.UsageExamplePostRequest(
    request_body=operations.UsageExamplePostRequestBody(
        faker_formatted_strings=shared.FakerFormattedStrings(
            address_format='48525 Maude Fall',
            directory_format='/etc/defaults',
            domain_format='next-conflict.name',
            email_format='Fermin_Koelpin@gmail.com',
            filename_format='northeast.wav',
            filepath_format='/lib/pizza_integrated.hbs',
            image_format='https://loremflickr.com/640/480',
            ipv4_format='75.42.25.241',
            ipv6_format='36a9:c057:a71b:b73a:c9ee:2348:d76c:3164',
            json_format='{plane: 14910, fringe: null, lightning: "Roentgenium UTF8"}',
            mac_format='13:58:66:7d:ac:95',
            password_format='b6eWzdveK0sHokC',
            phone_format='832-504-6221 x221',
            timezone_format='Asia/Krasnoyarsk',
            unknown_format='Principal at',
            url_format='http://understated-balcony.org',
            uuid_format='62de2e2d-47a9-4bf1-80f7-53b9b364b6b4',
            zipcode_format='25687-7266',
        ),
        faker_strings=shared.FakerStrings(
            city='Port Carli',
            iban='TN8700576009897281100717',
            id='<ID>',
            i_pv4='141.21.132.133',
            i_pv6='308b:b979:0237:4ea8:ee39:8480:0301:1d98',
            account='81966519',
            address='418 Maybelle Brooks',
            amount='27.55',
            avatar='https://loremflickr.com/640/480',
            color='turquoise',
            comment='The slim & simple Maple Gaming Keyboard from Dev Byte comes with a sleek body and 7- Color RGB LED Back-lighting for smart functionality',
            company='Murazik, Kozey and Hirthe',
            country='Equatorial Guinea',
            country_code='LU',
            currency='Congolese Franc',
            datatype='bigint',
            default='Dalasi',
            description='Up-sized explicit frame',
            directory='/home',
            domain_name='warmhearted-buying.biz',
            email_addr='Beulah.Franecki24@gmail.com',
            extension='pdf',
            filename='recovery.pdf',
            filepath='/usr/share/powerfully.less',
            filetype='application',
            first_name='Geovany',
            full_name='Roy Gottlieb',
            gender='Cis',
            job='International Metrics Administrator',
            json='{trachoma: 6397, nick: null, android: "Plastic Recumbent"}',
            key='<key>',
            last_name='Kshlerin',
            latitude='65.3520',
            locale='zh_CN',
            longitude='16.8742',
            mac='fd:b6:ff:35:99:05',
            manufacturer='Mazda',
            material='Frozen',
            middle_name='Emerson',
            model='Mustang',
            password='71wIwgEZJMTCRYg',
            phone='1-466-307-0476',
            pin='0584',
            postal_code='07886',
            price='452.00',
            product='Small Steel Salad',
            sex='female',
            street='Christy Dam',
            timezone='America/Regina',
            unit='sievert',
            url='http://repentant-haunt.name',
            username='Heather_Mills48',
            uuid='29e9f1c7-ed92-481f-955b-6ca1625b4c3a',
        ),
        simple_object=shared.SimpleObject(
            any='wireless',
            bigint=8821239038968084,
            bigint_str=9223372036854775808,
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000000001Z'),
            decimal=Decimal('3.141592653589793'),
            decimal_str=Decimal('3.14159265358979344719667586'),
            enum=shared.EnumT.ONE,
            float32=1.1,
            int=1,
            int32=1,
            int32_enum=shared.SimpleObjectInt32Enum.FIFTY_FIVE,
            int_enum=shared.SimpleObjectIntEnum.THIRD,
            int_opt_null=51222,
            num=1.1,
            num_opt_null=598.05,
            str_='test',
            str_opt='testOptional',
        ),
    ),
    bigint_parameter=284159,
    bigint_parameter_optional=322202,
    bigint_str_parameter=179570,
    bigint_str_parameter_optional=189297,
    bool_parameter=False,
    date_parameter=dateutil.parser.parse('2023-10-09').date(),
    date_time_parameter=dateutil.parser.isoparse('2022-07-10T04:48:28.435Z'),
    decimal_parameter=Decimal('3812.93'),
    decimal_parameter_optional=Decimal('3439.97'),
    decimal_str_parameter=Decimal('3515.75'),
    decimal_str_parameter_optional=Decimal('5898.97'),
    double_parameter=3718.62,
    enum_parameter=operations.UsageExamplePostEnumParameter.VALUE2,
    falsey_number_parameter=0,
    float32_parameter=908.23,
    float_parameter=8924.18,
    int64_parameter=570514,
    int_parameter=221233,
    opt_enum_parameter=operations.UsageExamplePostOptEnumParameter.VALUE3,
    str_parameter='example 2',
)

res = s.generation.usage_example_post(req, operations.UsageExamplePostSecurity(
    password="YOUR_PASSWORD",
    username="YOUR_USERNAME",
))

if res.usage_example_post_200_application_json_object is not None:
    # handle response
```

### Parameters

| Parameter                                                                                  | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `request`                                                                                  | [operations.UsageExamplePostRequest](../../models/operations/usageexamplepostrequest.md)   | :heavy_check_mark:                                                                         | The request object to use for the request.                                                 |
| `security`                                                                                 | [operations.UsageExamplePostSecurity](../../models/operations/usageexamplepostsecurity.md) | :heavy_check_mark:                                                                         | The security requirements to use for the request.                                          |


### Response

**[operations.UsageExamplePostResponse](../../models/operations/usageexamplepostresponse.md)**

