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
<!-- End SDK Example Usage -->