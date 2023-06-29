"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
import requests as requests_http
from dataclasses_json import Undefined, dataclass_json
from sdk import utils
from typing import Optional

RETRIES_GET_SERVERS = [
	"http://localhost:35456",
]



@dataclasses.dataclass
class RetriesGetRequest:
    request_id: str = dataclasses.field(metadata={'query_param': { 'field_name': 'request-id', 'style': 'form', 'explode': True }})
    num_retries: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'num-retries', 'style': 'form', 'explode': True }})
    



@dataclass_json(undefined=Undefined.EXCLUDE)

@dataclasses.dataclass
class RetriesGetRetries:
    r"""OK"""
    retries: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('retries') }})
    




@dataclasses.dataclass
class RetriesGetResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    raw_response: Optional[requests_http.Response] = dataclasses.field(default=None)
    retries: Optional[RetriesGetRetries] = dataclasses.field(default=None)
    r"""OK"""
    
