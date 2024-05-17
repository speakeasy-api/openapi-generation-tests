<!-- Start SDK Example Usage [usage] -->
```python
import dateutil.parser
import sdk
from decimal import Decimal
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_header_param=True,
    global_hidden_header_param='<value>',
    global_hidden_path_param='<value>',
    global_hidden_query_param='hello',
    global_path_param=100,
    global_query_param='some example global query param',
)

res = s.generation.global_name_overridden(request=shared.SimpleObject(
    any='any',
    bool=True,
    date_=dateutil.parser.parse('2020-01-01').date(),
    date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.001Z'),
    enum=shared.EnumT.ONE,
    float32=1.1,
    int=1,
    int32=1,
    int32_enum=shared.Int32Enum.FIFTY_FIVE,
    int_enum=shared.IntEnum.SECOND,
    num=1.1,
    str_='test',
    bigint=8821239038968084,
    bigint_str=9223372036854775808,
    bool_opt=True,
    decimal=Decimal('3.141592653589793'),
    decimal_str=Decimal('3.14159265358979344719667586'),
    float64_str=1.1,
    int64_str=100,
    str_opt='testOptional',
))

if res.object is not None:
    # handle response
    pass

```

```python
import sdk
from sdk.models import shared

s = sdk.SDK(
    security=shared.Security(
        api_key_auth="Token YOUR_API_KEY",
    ),
    global_header_param=True,
    global_hidden_header_param='<value>',
    global_hidden_path_param='<value>',
    global_hidden_query_param='hello',
    global_path_param=100,
    global_query_param='some example global query param',
)

res = s.servers.select_global_server()

if res is not None:
    # handle response
    pass

```

### Second

Do this second

```python
import dateutil.parser
import sdk
from decimal import Decimal
from sdk.models import operations, shared

s = sdk.SDK(
    global_header_param=True,
    global_hidden_header_param='<value>',
    global_hidden_path_param='<value>',
    global_hidden_query_param='hello',
    global_path_param=100,
    global_query_param='some example global query param',
)

res = s.generation.usage_example_post(request=operations.UsageExamplePostRequest(
    bigint_parameter=168827,
    bigint_str_parameter=446729,
    bool_parameter=False,
    date_parameter=dateutil.parser.parse('2024-06-10').date(),
    date_time_default_parameter=dateutil.parser.isoparse('2023-07-23T01:43:10.512Z'),
    date_time_parameter=dateutil.parser.isoparse('2022-10-21T15:42:48.223Z'),
    decimal_parameter=Decimal('5223.72'),
    decimal_str_parameter=Decimal('2911.37'),
    double_parameter=6946.59,
    enum_parameter=operations.EnumParameter.VALUE1,
    falsey_number_parameter=0,
    float32_parameter=1029.75,
    float64_string_parameter=5669.99,
    float_parameter=1952.32,
    int64_parameter=569663,
    int64_string_parameter=264295,
    int_parameter=352778,
    str_parameter='example 2',
    request_body=operations.UsageExamplePostRequestBody(
        simple_object=shared.SimpleObject(
            any='any',
            bool=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.001Z'),
            enum=shared.EnumT.ONE,
            float32=1.1,
            int=1,
            int32=1,
            int32_enum=shared.Int32Enum.FIFTY_FIVE,
            int_enum=shared.IntEnum.SECOND,
            num=1.1,
            str_='test',
            bigint=8821239038968084,
            bigint_str=9223372036854775808,
            bool_opt=True,
            decimal=Decimal('3.141592653589793'),
            decimal_str=Decimal('3.14159265358979344719667586'),
            float64_str=1.1,
            int64_str=100,
            str_opt='testOptional',
        ),
    ),
    opt_enum_parameter=operations.OptEnumParameter.VALUE3,
), security=operations.UsageExamplePostSecurity(
    password="YOUR_PASSWORD",
    username="YOUR_USERNAME",
))

if res.object is not None:
    # handle response
    pass

```
<!-- End SDK Example Usage [usage] -->