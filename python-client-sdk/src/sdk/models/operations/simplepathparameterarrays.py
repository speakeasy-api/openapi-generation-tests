"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
import requests as requests_http
from dataclasses_json import Undefined, dataclass_json
from sdk import utils
from typing import List, Optional


@dataclasses.dataclass
class SimplePathParameterArraysRequest:
    arr_param: List[str] = dataclasses.field(metadata={'path_param': { 'field_name': 'arrParam', 'style': 'simple', 'explode': False }})
    



@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class SimplePathParameterArraysRes:
    r"""OK"""
    url: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('url') }})
    



@dataclasses.dataclass
class SimplePathParameterArraysResponse:
    content_type: str = dataclasses.field()
    r"""HTTP response content type for this operation"""
    status_code: int = dataclasses.field()
    r"""HTTP response status code for this operation"""
    raw_response: Optional[requests_http.Response] = dataclasses.field(default=None)
    r"""Raw HTTP response; suitable for custom response parsing"""
    res: Optional[SimplePathParameterArraysRes] = dataclasses.field(default=None)
    r"""OK"""
    

