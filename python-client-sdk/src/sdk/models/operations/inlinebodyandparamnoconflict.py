"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
import requests as requests_http
from dataclasses_json import Undefined, dataclass_json
from sdk import utils
from typing import Dict, Optional


@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class InlineBodyAndParamNoConflictRequestBody:
    body_str: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('bodyStr') }})
    



@dataclasses.dataclass
class InlineBodyAndParamNoConflictRequest:
    param_str: str = dataclasses.field(metadata={'query_param': { 'field_name': 'paramStr', 'style': 'form', 'explode': True }})
    request_body: InlineBodyAndParamNoConflictRequestBody = dataclasses.field(metadata={'request': { 'media_type': 'application/json' }})
    



@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class InlineBodyAndParamNoConflictJSON:
    body_str: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('bodyStr') }})
    



@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class InlineBodyAndParamNoConflictRes:
    r"""OK"""
    args: Dict[str, str] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('args') }})
    json: InlineBodyAndParamNoConflictJSON = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('json') }})
    



@dataclasses.dataclass
class InlineBodyAndParamNoConflictResponse:
    content_type: str = dataclasses.field()
    r"""HTTP response content type for this operation"""
    status_code: int = dataclasses.field()
    r"""HTTP response status code for this operation"""
    raw_response: Optional[requests_http.Response] = dataclasses.field(default=None)
    r"""Raw HTTP response; suitable for custom response parsing"""
    res: Optional[InlineBodyAndParamNoConflictRes] = dataclasses.field(default=None)
    r"""OK"""
    

