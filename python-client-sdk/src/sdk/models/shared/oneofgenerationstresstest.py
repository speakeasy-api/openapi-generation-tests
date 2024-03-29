"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
from dataclasses_json import Undefined, dataclass_json
from enum import Enum
from sdk import utils
from typing import Any, Optional, Union

class Two(str, Enum):
    LATEST = 'latest'


@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class OneOfGenerationStressTest:
    any: Any = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('any') }})
    nullable_any: Optional[Any] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('nullableAny') }})
    one_of_from_array_of_types: Optional[Union[str, int]] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('oneOfFromArrayOfTypes') }})
    one_of_same_type: Optional[Union[str, Two]] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('oneOfSameType') }})
    

