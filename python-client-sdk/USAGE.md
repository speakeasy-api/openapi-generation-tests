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

    if res is not None:
        # handle response
        pass
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

        if res is not None:
            # handle response
            pass

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

    if res is not None:
        # handle response
        pass
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

        if res is not None:
            # handle response
            pass

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
        "bigint_parameter": 569663,
        "bigint_str_parameter": 352778,
        "bool_parameter": True,
        "date_parameter": dateutil.parser.parse("2022-11-22").date(),
        "date_time_default_parameter": dateutil.parser.isoparse("2022-07-01T07:46:46.050Z"),
        "date_time_parameter": dateutil.parser.isoparse("2024-10-20T01:22:27.683Z"),
        "decimal_parameter": Decimal("1062.86"),
        "decimal_str_parameter": Decimal("2346.83"),
        "double_parameter": 2152.17,
        "enum_parameter": operations.EnumParameter.VALUE3,
        "falsey_number_parameter": 0,
        "float32_parameter": 200.82,
        "float64_string_parameter": 5669.99,
        "float_parameter": 4819.51,
        "int64_parameter": 291137,
        "int64_string_parameter": 228622,
        "int_parameter": 267933,
        "str_parameter": "example 3",
        "request_body": {
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

    if res is not None:
        # handle response
        pass
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
            "bigint_parameter": 569663,
            "bigint_str_parameter": 352778,
            "bool_parameter": True,
            "date_parameter": dateutil.parser.parse("2022-11-22").date(),
            "date_time_default_parameter": dateutil.parser.isoparse("2022-07-01T07:46:46.050Z"),
            "date_time_parameter": dateutil.parser.isoparse("2024-10-20T01:22:27.683Z"),
            "decimal_parameter": Decimal("1062.86"),
            "decimal_str_parameter": Decimal("2346.83"),
            "double_parameter": 2152.17,
            "enum_parameter": operations.EnumParameter.VALUE3,
            "falsey_number_parameter": 0,
            "float32_parameter": 200.82,
            "float64_string_parameter": 5669.99,
            "float_parameter": 4819.51,
            "int64_parameter": 291137,
            "int64_string_parameter": 228622,
            "int_parameter": 267933,
            "str_parameter": "example 3",
            "request_body": {
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

        if res is not None:
            # handle response
            pass

asyncio.run(main())
```
<!-- End SDK Example Usage [usage] -->