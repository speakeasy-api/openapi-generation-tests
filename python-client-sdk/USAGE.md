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

if res.get_global_name_override_200_application_json_object is not None:
    # handle response
```


## Second
Do this second
```python
import sdk
import dateutil.parser
from sdk.models import operations, shared

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.UsageExamplePostRequest(
    request_body=operations.UsageExamplePostRequestBody(
        email='Larue_Rau85@yahoo.com',
        format_email='Roselyn_Kassulke@yahoo.com',
        format_uri='http://innocent-effect.org',
        format_uuid='0f467cc8-796e-4d15-9a05-dfc2ddf7cc78',
        hostname='soulful-poppy.com',
        ipv4='184.163.148.36',
        ipv6='8fc8:1674:2cb7:3920:5929:396f:ea75:96eb',
        simple_object=shared.SimpleObject(
            any='architecto',
            bigint=60225,
            bigint_str='reiciendis',
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
            decimal=6667.67,
            enum=shared.EnumT.TWO,
            float32=2.2222222,
            int=999999,
            int32=1,
            int32_enum=shared.SimpleObjectInt32Enum.SIXTY_NINE,
            int_enum=shared.SimpleObjectIntEnum.THIRD,
            int_opt_null=999999,
            num=1.1,
            num_opt_null=1.1,
            str_='example',
            str_opt='optional example',
        ),
        unknown='dolores',
        uri='http://growing-cappelletti.net',
        uuid='5955907a-ff1a-43a2-ba94-67739251aa52',
    ),
    bigint_parameter=111111,
    bigint_parameter_optional=111111,
    bigint_str_parameter='111111',
    bigint_str_parameter_optional='111111',
    bool_parameter=False,
    date_parameter=dateutil.parser.parse('2020-01-01').date(),
    date_time_parameter=dateutil.parser.isoparse('2020-01-01T00:00:00Z'),
    decimal_parameter=1.1,
    decimal_parameter_optional=1.1,
    decimal_str_parameter='1.1',
    decimal_str_parameter_optional='1.1',
    double_parameter=2.2222222,
    enum_parameter=operations.UsageExamplePostEnumParameter.VALUE3,
    falsey_number_parameter=0,
    float32_parameter=1.1,
    float_parameter=1.1,
    int64_parameter=111111,
    int_parameter=1,
    opt_enum_parameter=operations.UsageExamplePostOptEnumParameter.VALUE3,
    str_parameter='example 3',
)

res = s.generation.usage_example_post(req, operations.UsageExamplePostSecurity(
    password="YOUR_PASSWORD",
    username="YOUR_USERNAME",
))

if res.usage_example_post_200_application_json_object is not None:
    # handle response
```
<!-- End SDK Example Usage -->