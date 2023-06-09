"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
import requests as requests_http
from dataclasses_json import Undefined, dataclass_json
from sdk import utils
from typing import Optional


@dataclass_json(undefined=Undefined.EXCLUDE)

@dataclasses.dataclass
class InlineBodyAndParamConflictRequestBody:
    str_: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('str') }})
    




@dataclasses.dataclass
class InlineBodyAndParamConflictRequest:
    request_body: InlineBodyAndParamConflictRequestBody = dataclasses.field(metadata={'request': { 'media_type': 'application/json' }})
    str_: str = dataclasses.field(metadata={'query_param': { 'field_name': 'str', 'style': 'form', 'explode': True }})
    



@dataclass_json(undefined=Undefined.EXCLUDE)

@dataclasses.dataclass
class InlineBodyAndParamConflictResJSON:
    str_: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('str') }})
    



@dataclass_json(undefined=Undefined.EXCLUDE)

@dataclasses.dataclass
class InlineBodyAndParamConflictRes:
    r"""OK"""
    args: dict[str, str] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('args') }})
    json: InlineBodyAndParamConflictResJSON = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('json') }})
    




@dataclasses.dataclass
class InlineBodyAndParamConflictResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    raw_response: Optional[requests_http.Response] = dataclasses.field(default=None)
    res: Optional[InlineBodyAndParamConflictRes] = dataclasses.field(default=None)
    r"""OK"""
    

