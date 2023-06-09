"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
import requests as requests_http
from typing import Optional

OAUTH2_AUTH_NEW_SERVERS = [
	"http://localhost:35456",
]



@dataclasses.dataclass
class Oauth2AuthNewSecurity:
    oauth2: str = dataclasses.field(metadata={'security': { 'scheme': True, 'type': 'oauth2', 'field_name': 'Authorization' }})
    




@dataclasses.dataclass
class Oauth2AuthNewResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    raw_response: Optional[requests_http.Response] = dataclasses.field(default=None)
    

