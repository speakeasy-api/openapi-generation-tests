"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
from dataclasses_json import Undefined, dataclass_json
from sdk import utils
from typing import Final


@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class TaggedObject3:
    phone: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('phone') }})
    TAG: Final[str] = dataclasses.field(default='tag3', metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('tag') }})
    
