<!-- Start SDK Example Usage [usage] -->
```python
# Synchronous Example
import dateutil.parser
from decimal import Decimal
from openapi import SDK
from openapi.models import shared

with SDK(
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
) as sdk:

    res = sdk.generation.global_name_overridden(request={
        "any": "any",
        "bool_": True,
        "date_": dateutil.parser.parse("2020-01-01").date(),
        "date_time": dateutil.parser.isoparse("2020-01-01T00:00:00.001Z"),
        "enum": shared.EnumT.ONE,
        "float32": 1.1,
        "int_": 1,
        "int32": 1,
        "int32_enum": shared.Int32Enum.FIFTY_FIVE,
        "int_enum": shared.IntEnum.SECOND,
        "num": 1.1,
        "str_": "test",
        "bigint": 8821239038968084,
        "bigint_str": 9223372036854775808,
        "bool_opt": True,
        "decimal": Decimal("3.141592653589793"),
        "decimal_str": Decimal("3.14159265358979344719667586"),
        "float64_str": 1.1,
        "int64_str": 100,
        "str_opt": "testOptional",
    })

    assert res is not None

    # Handle response
    print(res)
```

</br>

The same SDK client can also be used to make asychronous requests by importing asyncio.
```python
# Asynchronous Example
import asyncio
import dateutil.parser
from decimal import Decimal
from openapi import SDK
from openapi.models import shared

async def main():
    async with SDK(
        global_header_param=True,
        global_hidden_query_param="hello",
        global_path_param=100,
        global_query_param="some example global query param",
    ) as sdk:

        res = await sdk.generation.global_name_overridden_async(request={
            "any": "any",
            "bool_": True,
            "date_": dateutil.parser.parse("2020-01-01").date(),
            "date_time": dateutil.parser.isoparse("2020-01-01T00:00:00.001Z"),
            "enum": shared.EnumT.ONE,
            "float32": 1.1,
            "int_": 1,
            "int32": 1,
            "int32_enum": shared.Int32Enum.FIFTY_FIVE,
            "int_enum": shared.IntEnum.SECOND,
            "num": 1.1,
            "str_": "test",
            "bigint": 8821239038968084,
            "bigint_str": 9223372036854775808,
            "bool_opt": True,
            "decimal": Decimal("3.141592653589793"),
            "decimal_str": Decimal("3.14159265358979344719667586"),
            "float64_str": 1.1,
            "int64_str": 100,
            "str_opt": "testOptional",
        })

        assert res is not None

        # Handle response
        print(res)

asyncio.run(main())
```

```python
# Synchronous Example
from openapi import SDK

with SDK(
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
) as sdk:

    res = sdk.servers.select_global_server()

    # Handle response
    print(res)
```

</br>

The same SDK client can also be used to make asychronous requests by importing asyncio.
```python
# Asynchronous Example
import asyncio
from openapi import SDK

async def main():
    async with SDK(
        global_header_param=True,
        global_hidden_query_param="hello",
        global_path_param=100,
        global_query_param="some example global query param",
    ) as sdk:

        res = await sdk.servers.select_global_server_async()

        # Handle response
        print(res)

asyncio.run(main())
```

### Second

Do this second

```python
# Synchronous Example
import dateutil.parser
from decimal import Decimal
from openapi import SDK
from openapi.models import operations, shared

with SDK(
    global_header_param=True,
    global_hidden_query_param="hello",
    global_path_param=100,
    global_query_param="some example global query param",
) as sdk:

    res = sdk.generation.usage_example_post(security=operations.UsageExamplePostSecurity(
        password="YOUR_PASSWORD",
        username="YOUR_USERNAME",
    ), request={
        "bigint_parameter": 926271,
        "bigint_str_parameter": 868017,
        "bool_parameter": True,
        "date_parameter": dateutil.parser.parse("2024-09-08").date(),
        "date_time_default_parameter": dateutil.parser.isoparse("2022-12-21T07:31:47.893Z"),
        "date_time_parameter": dateutil.parser.isoparse("2022-01-23T05:00:29.642Z"),
        "decimal_parameter": Decimal("1210.26"),
        "decimal_str_parameter": Decimal("9218.79"),
        "double_parameter": 1526.55,
        "enum_parameter": operations.EnumParameter.VALUE2,
        "falsey_number_parameter": 0,
        "float32_parameter": 5574.60,
        "float64_string_parameter": 9350.14,
        "float_parameter": 1207.65,
        "int64_parameter": 921028,
        "int64_string_parameter": 341377,
        "int_parameter": 466225,
        "str_parameter": "example 1",
        "request_body": {
            "faker_camel_case_property_name_strings": {
                "city": "Port Domenicboro",
                "iban": "TL115340030031304452481",
                "id": "<id>",
                "i_pv4": "78.38.131.239",
                "i_pv6": "e4c9:ca70:74d2:c3d9:33d6:c7c4:1e56:3bf5",
            },
            "faker_formatted_strings": {
                "address_format": "919 Vicarage Lane",
                "date_format": dateutil.parser.parse("2023-05-22").date(),
                "datetime_format": dateutil.parser.isoparse("2023-10-31T03:05:14.934Z"),
                "directory_format": "/var/spool",
                "domain_format": "aggravating-vanadyl.biz",
                "email_format": "Mateo_Rice@hotmail.com",
                "filename_format": "example.file",
                "filepath_format": "/usr/obj/boo_magnificent_and.jpeg",
                "image_format": "https://loremflickr.com/2371/2464?lock=4205364297848786",
                "ipv4_format": "234.138.226.158",
                "ipv6_format": "5141:db2e:df9c:f06d:8b99:e7e4:2c56:addd",
                "json_format": "{key: 3449297471398524, key1: null, key2: \"<value>\"}",
                "mac_format": "22:1f:e9:45:8a:7f",
                "password_format": "zbz8X7IgZMC4iGZ",
                "phone_format": "(508) 609-3176 x5681",
                "timezone_format": "Pacific/Efate",
                "unknown_format": "<value>",
                "url_format": "https://stark-trick.name",
                "uuid_format": "8f5bc12b-caad-4053-9859-5e369841bdb9",
                "zipcode_format": "59560",
            },
            "faker_kebob_case_property_name_strings": {
                "postal_code": "10760-9151",
            },
            "faker_pascal_case_property_name_strings": {
                "account": "82091084",
                "address": "14760 Gerhold Prairie",
                "amount": "707.58",
                "avatar": "https://picsum.photos/seed/MQvsb2J6/1388/3681",
                "city": "Fayborough",
                "color": "turquoise",
                "comment": "The Football Is Good For Training And Recreational Purposes",
                "company": "Gusikowski Group",
                "continent": "Africa",
                "country": "Japan",
                "country_code": "AG",
                "created_at": "<value>",
                "currency": "Baht",
                "currency_code": "PAB",
                "currency_iso": "SBD",
                "datatype": "varchar",
                "default": "<value>",
                "description": "secondary punctually carp",
                "directory": "/var/yp",
                "domain": "front-seafood.biz",
                "domain_name": "worse-heating.biz",
                "email": "Dell.Reichel10@yahoo.com",
                "email_addr": "Coralie_Aufderhar@gmail.com",
                "email_address": "Janelle54@hotmail.com",
                "expired_at": "<value>",
                "expires": "<value>",
                "expires_at": "<value>",
                "extension": "wav",
                "filename": "example.file",
                "filepath": "/usr/lib/meh_rubbery.spx",
                "filetype": "video",
                "first_name": "Virgil",
                "full_name": "Celia Lockman",
                "gender": "Intersex",
                "host": "neighboring-backbone.org",
                "host_name": "fantastic-swim.net",
                "http_status": "206",
                "iban": "SK4700200863715636017876",
                "id": "<id>",
                "ip": "6070:9eea:ee8f:b94b:bdb6:a7b2:863a:c3b0",
                "ip_addr": "a56f:c6c2:9330:cbeb:47ed:5aa7:4ccc:e6aa",
                "ip_address": "171.109.23.85",
                "ipv4": "63.149.162.195",
                "ipv6": "beae:91db:bbbe:a1eb:c170:8625:cbde:29fa",
                "job": "Direct Operations Specialist",
                "json_": "{key: 5315518856826349, key1: null, key2: \"<value>\"}",
                "key": "<key>",
                "last_name": "Block",
                "latitude": "-26.8203",
                "locale": "zh",
                "longitude": "-51.1636",
                "mac": "6b:f7:74:51:67:41",
                "manufacturer": "Land Rover",
                "material": "Concrete",
                "middle_name": "Gray",
                "model": "Challenger",
                "password": "sjTUYDUJQfNKef2",
                "phone": "378-421-8104 x788",
                "pin": "5500",
                "postal_code": "13074-5402",
                "price": "700.26",
                "product": "Incredible Steel Mouse",
                "sex": "male",
                "status_code": "103",
                "street": "Eusebio Curve",
                "timezone": "Asia/Kabul",
                "unit": "steradian",
                "updated_at": "<value>",
                "uri": "https://willing-e-mail.info",
                "url": "https://whirlwind-insolence.name",
                "username": "Hettie44",
                "uuid": "fc2e2cb0-e33c-4afd-9729-b4c83a9a6345",
            },
            "faker_snake_case_property_name_strings": {
                "country_code": "BE",
                "created_at": "<value>",
                "expired_at": "<value>",
                "updated_at": "<value>",
            },
            "simple_object": {
                "any": "any",
                "bool_": True,
                "date_": dateutil.parser.parse("2020-01-01").date(),
                "date_time": dateutil.parser.isoparse("2020-01-01T00:00:00.001Z"),
                "enum": shared.EnumT.ONE,
                "float32": 1.1,
                "int_": 1,
                "int32": 1,
                "int32_enum": shared.Int32Enum.FIFTY_FIVE,
                "int_enum": shared.IntEnum.SECOND,
                "num": 1.1,
                "str_": "test",
                "bigint": 8821239038968084,
                "bigint_str": 9223372036854775808,
                "bool_opt": True,
                "decimal": Decimal("3.141592653589793"),
                "decimal_str": Decimal("3.14159265358979344719667586"),
                "float64_str": 1.1,
                "int64_str": 100,
                "str_opt": "testOptional",
            },
        },
        "opt_enum_parameter": operations.OptEnumParameter.VALUE3,
    })

    assert res is not None

    # Handle response
    print(res)
```

</br>

The same SDK client can also be used to make asychronous requests by importing asyncio.
```python
# Asynchronous Example
import asyncio
import dateutil.parser
from decimal import Decimal
from openapi import SDK
from openapi.models import operations, shared

async def main():
    async with SDK(
        global_header_param=True,
        global_hidden_query_param="hello",
        global_path_param=100,
        global_query_param="some example global query param",
    ) as sdk:

        res = await sdk.generation.usage_example_post_async(security=operations.UsageExamplePostSecurity(
            password="YOUR_PASSWORD",
            username="YOUR_USERNAME",
        ), request={
            "bigint_parameter": 926271,
            "bigint_str_parameter": 868017,
            "bool_parameter": True,
            "date_parameter": dateutil.parser.parse("2024-09-08").date(),
            "date_time_default_parameter": dateutil.parser.isoparse("2022-12-21T07:31:47.893Z"),
            "date_time_parameter": dateutil.parser.isoparse("2022-01-23T05:00:29.642Z"),
            "decimal_parameter": Decimal("1210.26"),
            "decimal_str_parameter": Decimal("9218.79"),
            "double_parameter": 1526.55,
            "enum_parameter": operations.EnumParameter.VALUE2,
            "falsey_number_parameter": 0,
            "float32_parameter": 5574.60,
            "float64_string_parameter": 9350.14,
            "float_parameter": 1207.65,
            "int64_parameter": 921028,
            "int64_string_parameter": 341377,
            "int_parameter": 466225,
            "str_parameter": "example 1",
            "request_body": {
                "faker_camel_case_property_name_strings": {
                    "city": "Port Domenicboro",
                    "iban": "TL115340030031304452481",
                    "id": "<id>",
                    "i_pv4": "78.38.131.239",
                    "i_pv6": "e4c9:ca70:74d2:c3d9:33d6:c7c4:1e56:3bf5",
                },
                "faker_formatted_strings": {
                    "address_format": "919 Vicarage Lane",
                    "date_format": dateutil.parser.parse("2023-05-22").date(),
                    "datetime_format": dateutil.parser.isoparse("2023-10-31T03:05:14.934Z"),
                    "directory_format": "/var/spool",
                    "domain_format": "aggravating-vanadyl.biz",
                    "email_format": "Mateo_Rice@hotmail.com",
                    "filename_format": "example.file",
                    "filepath_format": "/usr/obj/boo_magnificent_and.jpeg",
                    "image_format": "https://loremflickr.com/2371/2464?lock=4205364297848786",
                    "ipv4_format": "234.138.226.158",
                    "ipv6_format": "5141:db2e:df9c:f06d:8b99:e7e4:2c56:addd",
                    "json_format": "{key: 3449297471398524, key1: null, key2: \"<value>\"}",
                    "mac_format": "22:1f:e9:45:8a:7f",
                    "password_format": "zbz8X7IgZMC4iGZ",
                    "phone_format": "(508) 609-3176 x5681",
                    "timezone_format": "Pacific/Efate",
                    "unknown_format": "<value>",
                    "url_format": "https://stark-trick.name",
                    "uuid_format": "8f5bc12b-caad-4053-9859-5e369841bdb9",
                    "zipcode_format": "59560",
                },
                "faker_kebob_case_property_name_strings": {
                    "postal_code": "10760-9151",
                },
                "faker_pascal_case_property_name_strings": {
                    "account": "82091084",
                    "address": "14760 Gerhold Prairie",
                    "amount": "707.58",
                    "avatar": "https://picsum.photos/seed/MQvsb2J6/1388/3681",
                    "city": "Fayborough",
                    "color": "turquoise",
                    "comment": "The Football Is Good For Training And Recreational Purposes",
                    "company": "Gusikowski Group",
                    "continent": "Africa",
                    "country": "Japan",
                    "country_code": "AG",
                    "created_at": "<value>",
                    "currency": "Baht",
                    "currency_code": "PAB",
                    "currency_iso": "SBD",
                    "datatype": "varchar",
                    "default": "<value>",
                    "description": "secondary punctually carp",
                    "directory": "/var/yp",
                    "domain": "front-seafood.biz",
                    "domain_name": "worse-heating.biz",
                    "email": "Dell.Reichel10@yahoo.com",
                    "email_addr": "Coralie_Aufderhar@gmail.com",
                    "email_address": "Janelle54@hotmail.com",
                    "expired_at": "<value>",
                    "expires": "<value>",
                    "expires_at": "<value>",
                    "extension": "wav",
                    "filename": "example.file",
                    "filepath": "/usr/lib/meh_rubbery.spx",
                    "filetype": "video",
                    "first_name": "Virgil",
                    "full_name": "Celia Lockman",
                    "gender": "Intersex",
                    "host": "neighboring-backbone.org",
                    "host_name": "fantastic-swim.net",
                    "http_status": "206",
                    "iban": "SK4700200863715636017876",
                    "id": "<id>",
                    "ip": "6070:9eea:ee8f:b94b:bdb6:a7b2:863a:c3b0",
                    "ip_addr": "a56f:c6c2:9330:cbeb:47ed:5aa7:4ccc:e6aa",
                    "ip_address": "171.109.23.85",
                    "ipv4": "63.149.162.195",
                    "ipv6": "beae:91db:bbbe:a1eb:c170:8625:cbde:29fa",
                    "job": "Direct Operations Specialist",
                    "json_": "{key: 5315518856826349, key1: null, key2: \"<value>\"}",
                    "key": "<key>",
                    "last_name": "Block",
                    "latitude": "-26.8203",
                    "locale": "zh",
                    "longitude": "-51.1636",
                    "mac": "6b:f7:74:51:67:41",
                    "manufacturer": "Land Rover",
                    "material": "Concrete",
                    "middle_name": "Gray",
                    "model": "Challenger",
                    "password": "sjTUYDUJQfNKef2",
                    "phone": "378-421-8104 x788",
                    "pin": "5500",
                    "postal_code": "13074-5402",
                    "price": "700.26",
                    "product": "Incredible Steel Mouse",
                    "sex": "male",
                    "status_code": "103",
                    "street": "Eusebio Curve",
                    "timezone": "Asia/Kabul",
                    "unit": "steradian",
                    "updated_at": "<value>",
                    "uri": "https://willing-e-mail.info",
                    "url": "https://whirlwind-insolence.name",
                    "username": "Hettie44",
                    "uuid": "fc2e2cb0-e33c-4afd-9729-b4c83a9a6345",
                },
                "faker_snake_case_property_name_strings": {
                    "country_code": "BE",
                    "created_at": "<value>",
                    "expired_at": "<value>",
                    "updated_at": "<value>",
                },
                "simple_object": {
                    "any": "any",
                    "bool_": True,
                    "date_": dateutil.parser.parse("2020-01-01").date(),
                    "date_time": dateutil.parser.isoparse("2020-01-01T00:00:00.001Z"),
                    "enum": shared.EnumT.ONE,
                    "float32": 1.1,
                    "int_": 1,
                    "int32": 1,
                    "int32_enum": shared.Int32Enum.FIFTY_FIVE,
                    "int_enum": shared.IntEnum.SECOND,
                    "num": 1.1,
                    "str_": "test",
                    "bigint": 8821239038968084,
                    "bigint_str": 9223372036854775808,
                    "bool_opt": True,
                    "decimal": Decimal("3.141592653589793"),
                    "decimal_str": Decimal("3.14159265358979344719667586"),
                    "float64_str": 1.1,
                    "int64_str": 100,
                    "str_opt": "testOptional",
                },
            },
            "opt_enum_parameter": operations.OptEnumParameter.VALUE3,
        })

        assert res is not None

        # Handle response
        print(res)

asyncio.run(main())
```
<!-- End SDK Example Usage [usage] -->