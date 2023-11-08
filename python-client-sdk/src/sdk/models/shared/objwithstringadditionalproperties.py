"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
from dataclasses_json import Undefined, dataclass_json
from sdk import utils
from typing import Dict, Optional


@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class ObjWithStringAdditionalProperties:
    normal_field: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('normalField') }})
    additional_properties: Optional[Dict[str, str]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'exclude': lambda f: f is None }})
    
