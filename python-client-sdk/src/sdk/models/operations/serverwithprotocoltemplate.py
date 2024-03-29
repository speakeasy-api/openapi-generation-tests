"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
import requests as requests_http
from typing import Optional

SERVER_WITH_PROTOCOL_TEMPLATE_SERVER_MAIN = "main"

SERVER_WITH_PROTOCOL_TEMPLATE_SERVERS = {
	SERVER_WITH_PROTOCOL_TEMPLATE_SERVER_MAIN: "{protocol}://{hostname}:{port}",
}


@dataclasses.dataclass
class ServerWithProtocolTemplateResponse:
    content_type: str = dataclasses.field()
    r"""HTTP response content type for this operation"""
    status_code: int = dataclasses.field()
    r"""HTTP response status code for this operation"""
    raw_response: Optional[requests_http.Response] = dataclasses.field(default=None)
    r"""Raw HTTP response; suitable for custom response parsing"""
    

