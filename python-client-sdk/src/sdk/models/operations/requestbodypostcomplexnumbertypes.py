"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
import requests as requests_http
from ..shared import complexnumbertypes as shared_complexnumbertypes
from dataclasses_json import Undefined, dataclass_json
from decimal import Decimal
from sdk import utils
from typing import Optional



@dataclasses.dataclass
class RequestBodyPostComplexNumberTypesRequest:
    complex_number_types: shared_complexnumbertypes.ComplexNumberTypes = dataclasses.field(metadata={'request': { 'media_type': 'application/json' }})
    path_big_int: int = dataclasses.field(metadata={'path_param': { 'field_name': 'pathBigInt', 'style': 'simple', 'explode': False }})
    path_big_int_str: int = dataclasses.field(metadata={'path_param': { 'field_name': 'pathBigIntStr', 'style': 'simple', 'explode': False }})
    path_decimal: Decimal = dataclasses.field(metadata={'path_param': { 'field_name': 'pathDecimal', 'style': 'simple', 'explode': False }})
    path_decimal_str: Decimal = dataclasses.field(metadata={'path_param': { 'field_name': 'pathDecimalStr', 'style': 'simple', 'explode': False }})
    query_big_int: int = dataclasses.field(metadata={'query_param': { 'field_name': 'queryBigInt', 'style': 'form', 'explode': True }})
    query_big_int_str: int = dataclasses.field(metadata={'query_param': { 'field_name': 'queryBigIntStr', 'style': 'form', 'explode': True }})
    query_decimal: Decimal = dataclasses.field(metadata={'query_param': { 'field_name': 'queryDecimal', 'style': 'form', 'explode': True }})
    query_decimal_str: Decimal = dataclasses.field(metadata={'query_param': { 'field_name': 'queryDecimalStr', 'style': 'form', 'explode': True }})
    



@dataclass_json(undefined=Undefined.EXCLUDE)

@dataclasses.dataclass
class RequestBodyPostComplexNumberTypes200ApplicationJSON:
    r"""OK"""
    json: shared_complexnumbertypes.ComplexNumberTypes = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('json') }})
    url: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('url') }})
    




@dataclasses.dataclass
class RequestBodyPostComplexNumberTypesResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    raw_response: Optional[requests_http.Response] = dataclasses.field(default=None)
    request_body_post_complex_number_types_200_application_json_object: Optional[RequestBodyPostComplexNumberTypes200ApplicationJSON] = dataclasses.field(default=None)
    r"""OK"""
    
