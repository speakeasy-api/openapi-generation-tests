"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
import requests as requests_http
from dataclasses_json import Undefined, dataclass_json
from sdk import utils
from typing import Dict, Optional


@dataclasses.dataclass
class SampleFile:
    content: bytes = dataclasses.field(metadata={'multipart_form': { 'content': True }})
    file_name: str = dataclasses.field(metadata={'multipart_form': { 'field_name': 'sampleFile' }})
    



@dataclasses.dataclass
class RequestBodyPutMultipartOptionalRequestBodyRequestBody:
    sample_field: Optional[str] = dataclasses.field(default=None, metadata={'multipart_form': { 'field_name': 'sampleField' }})
    sample_file: Optional[SampleFile] = dataclasses.field(default=None, metadata={'multipart_form': { 'file': True }})
    



@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class RequestBodyPutMultipartOptionalRequestBodyForm:
    sample_field: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('sampleField'), 'exclude': lambda f: f is None }})
    



@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class RequestBodyPutMultipartOptionalRequestBodyRes:
    r"""OK"""
    files: Dict[str, str] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('files') }})
    form: Optional[RequestBodyPutMultipartOptionalRequestBodyForm] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('form'), 'exclude': lambda f: f is None }})
    



@dataclasses.dataclass
class RequestBodyPutMultipartOptionalRequestBodyResponse:
    content_type: str = dataclasses.field()
    r"""HTTP response content type for this operation"""
    status_code: int = dataclasses.field()
    r"""HTTP response status code for this operation"""
    raw_response: requests_http.Response = dataclasses.field()
    r"""Raw HTTP response; suitable for custom response parsing"""
    res: Optional[RequestBodyPutMultipartOptionalRequestBodyRes] = dataclasses.field(default=None)
    r"""OK"""
    
