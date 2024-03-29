"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
import requests as requests_http
from ...models.shared import objwithcomplexnumbersadditionalproperties as shared_objwithcomplexnumbersadditionalproperties
from dataclasses_json import Undefined, dataclass_json
from sdk import utils
from typing import Optional


@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class ResponseBodyAdditionalPropertiesComplexNumbersPostResponseBody:
    r"""OK"""
    json: shared_objwithcomplexnumbersadditionalproperties.ObjWithComplexNumbersAdditionalProperties = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('json') }})
    



@dataclasses.dataclass
class ResponseBodyAdditionalPropertiesComplexNumbersPostResponse:
    content_type: str = dataclasses.field()
    r"""HTTP response content type for this operation"""
    status_code: int = dataclasses.field()
    r"""HTTP response status code for this operation"""
    object: Optional[ResponseBodyAdditionalPropertiesComplexNumbersPostResponseBody] = dataclasses.field(default=None)
    r"""OK"""
    raw_response: Optional[requests_http.Response] = dataclasses.field(default=None)
    r"""Raw HTTP response; suitable for custom response parsing"""
    

