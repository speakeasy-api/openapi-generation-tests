"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
import requests as requests_http
from ...models.shared import deepobjectsmaller as shared_deepobjectsmaller
from ...models.shared import simpleobject as shared_simpleobject
from dataclasses_json import Undefined, dataclass_json
from sdk import utils
from typing import Optional


@dataclasses.dataclass
class JSONQueryParamsObjectSmallerRequest:
    deep_obj_param: shared_deepobjectsmaller.DeepObjectSmaller = dataclasses.field(metadata={'query_param': { 'field_name': 'deepObjParam', 'serialization': 'json' }})
    simple_obj_param: shared_simpleobject.SimpleObject = dataclasses.field(metadata={'query_param': { 'field_name': 'simpleObjParam', 'serialization': 'json' }})
    r"""A simple object that uses all our supported primitive types and enums and has optional properties."""
    



@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class JSONQueryParamsObjectSmallerArgs:
    deep_obj_param: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('deepObjParam') }})
    simple_obj_param: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('simpleObjParam') }})
    



@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class JSONQueryParamsObjectSmallerRes:
    r"""OK"""
    args: JSONQueryParamsObjectSmallerArgs = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('args') }})
    url: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('url') }})
    



@dataclasses.dataclass
class JSONQueryParamsObjectSmallerResponse:
    content_type: str = dataclasses.field()
    r"""HTTP response content type for this operation"""
    status_code: int = dataclasses.field()
    r"""HTTP response status code for this operation"""
    raw_response: requests_http.Response = dataclasses.field()
    r"""Raw HTTP response; suitable for custom response parsing"""
    res: Optional[JSONQueryParamsObjectSmallerRes] = dataclasses.field(default=None)
    r"""OK"""
    
