"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
import requests as requests_http
from typing import Optional

CONNECTION_ERROR_GET_SERVERS = [
	"http://somebrokenapi.broken",
]



@dataclasses.dataclass
class ConnectionErrorGetResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    raw_response: Optional[requests_http.Response] = dataclasses.field(default=None)
    

