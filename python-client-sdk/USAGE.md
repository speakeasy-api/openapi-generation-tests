<!-- Start SDK Example Usage -->
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

if res.object is not None:
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
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.UsageExamplePostRequest(
    request_body=operations.UsageExamplePostRequestBody(
        faker_formatted_strings=shared.FakerFormattedStrings(),
        faker_strings=shared.FakerStrings(),
        simple_object=shared.SimpleObject(
            any='any',
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
            int32_enum=shared.Int32Enum.FIFTY_FIVE,
            int_enum=shared.IntEnum.SECOND,
            num=1.1,
            str_='test',
            str_opt='testOptional',
        ),
    ),
    bigint_parameter=168827,
    bigint_str_parameter=446729,
    bool_parameter=False,
    date_parameter=dateutil.parser.parse('2023-06-11').date(),
    date_time_default_parameter=dateutil.parser.isoparse('2022-07-22T13:16:48.221Z'),
    date_time_parameter=dateutil.parser.isoparse('2021-10-21T09:16:58.799Z'),
    decimal_parameter=Decimal('5223.72'),
    decimal_str_parameter=Decimal('2911.37'),
    double_parameter=6946.59,
    enum_parameter=operations.EnumParameter.VALUE1,
    falsey_number_parameter=0,
    float32_parameter=1029.75,
    float_parameter=5669.99,
    int64_parameter=195232,
    int_parameter=569663,
    opt_enum_parameter=operations.OptEnumParameter.VALUE3,
    str_parameter='example 1',
)

res = s.generation.usage_example_post(req, operations.UsageExamplePostSecurity(
    password="YOUR_PASSWORD",
    username="YOUR_USERNAME",
))

if res.object is not None:
    # handle response
    pass
```
<!-- End SDK Example Usage -->