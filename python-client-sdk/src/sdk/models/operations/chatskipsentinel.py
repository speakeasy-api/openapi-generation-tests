"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
import requests as requests_http
from ...models.shared import chatcompletionevent as shared_chatcompletionevent
from dataclasses_json import Undefined, dataclass_json
from sdk import utils
from typing import Generator, Optional

CHAT_SKIP_SENTINEL_SERVERS = [
	"http://localhost:35456",
]


@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class ChatSkipSentinelRequestBody:
    prompt: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('prompt') }})
    stream: Optional[bool] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('stream'), 'exclude': lambda f: f is None }})
    



@dataclasses.dataclass
class ChatSkipSentinelResponse:
    content_type: str = dataclasses.field()
    r"""HTTP response content type for this operation"""
    status_code: int = dataclasses.field()
    r"""HTTP response status code for this operation"""
    raw_response: requests_http.Response = dataclasses.field()
    r"""Raw HTTP response; suitable for custom response parsing"""
    chat_completion_event: Optional[Generator[shared_chatcompletionevent.ChatCompletionEvent, None, None]] = dataclasses.field(default=None)
    r"""Ok"""
    
