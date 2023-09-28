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
from decimal import Decimal
from sdk.models import operations, shared

s = sdk.SDK(
    global_path_param=100,
    global_query_param='some example global query param',
)

req = operations.UsageExamplePostRequest(
    request_body=operations.UsageExamplePostRequestBody(
        faker_formatted_strings=shared.FakerFormattedStrings(
            address_format='5786 Little Streets',
            directory_format='vel',
            domain_format='error',
            email_format='Gerda89@yahoo.com',
            filename_format='ipsa',
            filepath_format='delectus',
            image_format='tempora',
            ipv4_format='98.122.202.207',
            ipv6_format='8796:ed15:1a05:dfc2:ddf7:cc78:ca1b:a928',
            json_format='{"foo":"gQ*GM92ieK","bar":56843,"bike":1878,"a":61763,"b":61209,"name":61693,"prop":94374}',
            mac_format='saepe',
            password_format='fuga',
            phone_format='464.960.0966 x612',
            timezone_format='corporis',
            unknown_format='explicabo',
            url_format='nobis',
            uuid_format='5955907a-ff1a-43a2-ba94-67739251aa52',
            zipcode_format='19368-0068',
        ),
        faker_strings=shared.FakerStrings(
            city='Boyerworth',
            iban='voluptatibus',
            id='e78f097b-0074-4f15-871b-5e6e13b99d48',
            i_pv4='133.234.24.235',
            i_pv6='91e4:50ad:2abd:4426:9802:d502:a94b:b4f6',
            account='non',
            address='535 Marquardt Pine',
            amount='dolor',
            avatar='debitis',
            color='a',
            comment='dolorum',
            company='Kirlin - Stamm',
            country='Virgin Islands, U.S.',
            country_code='PF',
            currency='dicta',
            datatype='magnam',
            default='cumque',
            description='facere',
            directory='ea',
            domain_name='aliquid',
            email_addr='laborum',
            extension='accusamus',
            filename='non',
            filepath='occaecati',
            filetype='enim',
            first_name='Shannon',
            full_name='delectus',
            gender='male',
            job='provident',
            json='{"foo":"^ORy6\\EHZY","bar":1919,"bike":30157,"a":"^;;DZfHr-*","b":9237,"name":"AWTV$]{]>I","prop":89654}',
            key='odit',
            last_name='Hilll',
            latitude='quasi',
            locale='iure',
            longitude='doloribus',
            mac='debitis',
            manufacturer='eius',
            material='maxime',
            middle_name='deleniti',
            model='facilis',
            password='in',
            phone='(293) 749-8198',
            pin='accusantium',
            postal_code='56117',
            price='illum',
            product='pariatur',
            sex='male',
            street='5140 Willow Radial',
            timezone='ipsam',
            unit='voluptate',
            url='autem',
            username='Mireya.Beatty97',
            uuid='0d30c5fb-b258-4705-b202-c73d5fe9b90c',
        ),
        simple_object=shared.SimpleObject(
            any='consequuntur',
            bigint=500026,
            bigint_str=621479,
            bool=True,
            bool_opt=True,
            date_=dateutil.parser.parse('2020-01-01').date(),
            date_time=dateutil.parser.isoparse('2020-01-01T00:00:00.000Z'),
            decimal=Decimal('503.7'),
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
    ),
    bigint_parameter=237893,
    bigint_parameter_optional=992397,
    bigint_str_parameter=934214,
    bigint_str_parameter_optional=267262,
    bool_parameter=False,
    date_parameter=dateutil.parser.parse('2021-08-23').date(),
    date_time_parameter=dateutil.parser.isoparse('2021-04-10T01:47:20.724Z'),
    decimal_parameter=Decimal('5899.1'),
    decimal_parameter_optional=Decimal('7508.44'),
    decimal_str_parameter=Decimal('7301.22'),
    decimal_str_parameter_optional=Decimal('9644.9'),
    double_parameter=3119.45,
    enum_parameter=operations.UsageExamplePostEnumParameter.VALUE2,
    falsey_number_parameter=0,
    float32_parameter=3982.21,
    float_parameter=2123.9,
    int64_parameter=209843,
    int_parameter=222443,
    opt_enum_parameter=operations.UsageExamplePostOptEnumParameter.VALUE3,
    str_parameter='example 1',
)

res = s.generation.usage_example_post(req, operations.UsageExamplePostSecurity(
    password="YOUR_PASSWORD",
    username="YOUR_USERNAME",
))

if res.usage_example_post_200_application_json_object is not None:
    # handle response
```
<!-- End SDK Example Usage -->