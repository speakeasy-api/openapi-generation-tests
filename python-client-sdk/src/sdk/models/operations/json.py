"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
import requests as requests_http
from ...models.shared import jsonevent as shared_jsonevent
from typing import Generator, Optional

JSON_SERVERS = [
	"http://localhost:35456",
]


@dataclasses.dataclass
class JSONResponse:
    content_type: str = dataclasses.field()
    r"""HTTP response content type for this operation"""
    status_code: int = dataclasses.field()
    r"""HTTP response status code for this operation"""
    raw_response: requests_http.Response = dataclasses.field()
    r"""Raw HTTP response; suitable for custom response parsing"""
    json_event: Optional[Generator[shared_jsonevent.JSONEvent]] = dataclasses.field(default=None)
    r"""Ok"""
    
