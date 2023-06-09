"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
import requests as requests_http
from ..shared import deepobject as shared_deepobject
from ..shared import simpleobject as shared_simpleobject
from dataclasses_json import Undefined, dataclass_json
from sdk import utils
from typing import Optional



@dataclasses.dataclass
class JSONQueryParamsObjectRequest:
    deep_obj_param: shared_deepobject.DeepObject = dataclasses.field(metadata={'query_param': { 'field_name': 'deepObjParam', 'serialization': 'json' }})
    simple_obj_param: shared_simpleobject.SimpleObject = dataclasses.field(metadata={'query_param': { 'field_name': 'simpleObjParam', 'serialization': 'json' }})
    r"""A simple object that uses all our supported primitive types and enums and has optional properties."""
    



@dataclass_json(undefined=Undefined.EXCLUDE)

@dataclasses.dataclass
class JSONQueryParamsObjectResArgs:
    deep_obj_param: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('deepObjParam') }})
    simple_obj_param: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('simpleObjParam') }})
    



@dataclass_json(undefined=Undefined.EXCLUDE)

@dataclasses.dataclass
class JSONQueryParamsObjectRes:
    r"""OK"""
    args: JSONQueryParamsObjectResArgs = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('args') }})
    url: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('url') }})
    




@dataclasses.dataclass
class JSONQueryParamsObjectResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    raw_response: Optional[requests_http.Response] = dataclasses.field(default=None)
    res: Optional[JSONQueryParamsObjectRes] = dataclasses.field(default=None)
    r"""OK"""
    

