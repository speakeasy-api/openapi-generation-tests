"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
import requests as requests_http
from ...models.shared import simpleobjectcamelcase as shared_simpleobjectcamelcase
from typing import Dict, Optional

REQUEST_BODY_POST_APPLICATION_JSON_MAP_CAMEL_CASE_SERVERS = [
	"http://localhost:35456",
]


@dataclasses.dataclass
class RequestBodyPostApplicationJSONMapCamelCaseResponse:
    content_type: str = dataclasses.field()
    r"""HTTP response content type for this operation"""
    status_code: int = dataclasses.field()
    r"""HTTP response status code for this operation"""
    raw_response: Optional[requests_http.Response] = dataclasses.field(default=None)
    r"""Raw HTTP response; suitable for custom response parsing"""
    res: Optional[Dict[str, shared_simpleobjectcamelcase.SimpleObjectCamelCase]] = dataclasses.field(default=None)
    r"""OK"""
    

