"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
import requests as requests_http
from dataclasses_json import Undefined, dataclass_json
from sdk import utils
from typing import Callable, List, Optional

PAGINATION_LIMIT_OFFSET_PAGE_BODY_SERVERS = [
	"http://localhost:35456",
]


@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class PaginationLimitOffsetPageBodyRes:
    r"""OK"""
    num_pages: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('numPages') }})
    result_array: List[int] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('resultArray') }})
    



@dataclasses.dataclass
class PaginationLimitOffsetPageBodyResponse:
    next: Callable[[], Optional[PaginationLimitOffsetPageBodyResponse]] = dataclasses.field()
    content_type: str = dataclasses.field()
    r"""HTTP response content type for this operation"""
    status_code: int = dataclasses.field()
    r"""HTTP response status code for this operation"""
    raw_response: Optional[requests_http.Response] = dataclasses.field(default=None)
    r"""Raw HTTP response; suitable for custom response parsing"""
    res: Optional[PaginationLimitOffsetPageBodyRes] = dataclasses.field(default=None)
    r"""OK"""
    

