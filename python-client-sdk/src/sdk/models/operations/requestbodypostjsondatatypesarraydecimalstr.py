"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
import requests as requests_http
from dataclasses_json import Undefined, dataclass_json
from decimal import Decimal
from sdk import utils
from typing import Optional


@dataclass_json(undefined=Undefined.EXCLUDE)

@dataclasses.dataclass
class RequestBodyPostJSONDataTypesArrayDecimalStr200ApplicationJSON:
    r"""OK"""
    json: list[Decimal] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('json') }})
    




@dataclasses.dataclass
class RequestBodyPostJSONDataTypesArrayDecimalStrResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    raw_response: Optional[requests_http.Response] = dataclasses.field(default=None)
    request_body_post_json_data_types_array_decimal_str_200_application_json_object: Optional[RequestBodyPostJSONDataTypesArrayDecimalStr200ApplicationJSON] = dataclasses.field(default=None)
    r"""OK"""
    
