"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
import requests as requests_http
from ..shared import typedobject1 as shared_typedobject1
from dataclasses_json import Undefined, dataclass_json
from sdk import utils
from typing import Optional


@dataclass_json(undefined=Undefined.EXCLUDE)

@dataclasses.dataclass
class FlattenedTypedObjectPostRes:
    r"""OK"""
    json: shared_typedobject1.TypedObject1 = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('json') }})
    




@dataclasses.dataclass
class FlattenedTypedObjectPostResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    raw_response: Optional[requests_http.Response] = dataclasses.field(default=None)
    res: Optional[FlattenedTypedObjectPostRes] = dataclasses.field(default=None)
    r"""OK"""
    
