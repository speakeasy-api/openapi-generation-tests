"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
from dataclasses_json import Undefined, dataclass_json
from sdk import utils
from typing import Final, Optional


@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class ObjectWithNullEnums:
    UNSET='__SPEAKEASY_UNSET__'
    NULL_ENUM: Final[Optional[str]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('nullEnum') }})
    OPT_NULL_ENUM: Final[Optional[str]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('optNullEnum'), 'exclude': lambda f: f is ObjectWithNullEnums.UNSET }})
    
