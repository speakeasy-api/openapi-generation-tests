"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
from dataclasses_json import Undefined, dataclass_json
from sdk import utils
from typing import List, Optional


@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class BasicAuth:
    password: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('password') }})
    username: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('username') }})
    



@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class HeaderAuth:
    expected_value: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('expectedValue') }})
    header_name: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('headerName') }})
    



@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class AuthServiceRequestBody:
    basic_auth: Optional[BasicAuth] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('basicAuth'), 'exclude': lambda f: f is None }})
    header_auth: Optional[List[HeaderAuth]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('headerAuth'), 'exclude': lambda f: f is None }})
    

