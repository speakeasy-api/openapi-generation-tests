"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
import requests as requests_http
from ...models.shared import complexnumberarrays as shared_complexnumberarrays
from dataclasses_json import Undefined, dataclass_json
from sdk import utils
from typing import Optional


@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class RequestBodyPostJSONDataTypesComplexNumberArraysRes:
    r"""OK"""
    json: shared_complexnumberarrays.ComplexNumberArrays = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('json') }})
    



@dataclasses.dataclass
class RequestBodyPostJSONDataTypesComplexNumberArraysResponse:
    content_type: str = dataclasses.field()
    r"""HTTP response content type for this operation"""
    status_code: int = dataclasses.field()
    r"""HTTP response status code for this operation"""
    raw_response: requests_http.Response = dataclasses.field()
    r"""Raw HTTP response; suitable for custom response parsing"""
    res: Optional[RequestBodyPostJSONDataTypesComplexNumberArraysRes] = dataclasses.field(default=None)
    r"""OK"""
    
