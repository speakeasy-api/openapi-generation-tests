"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
from dataclasses_json import Undefined, dataclass_json
from sdk import utils
from typing import List, Optional


@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class Slides:
    title: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('title') }})
    type: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('type') }})
    items: Optional[List[str]] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('items'), 'exclude': lambda f: f is None }})
    



@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class Slideshow:
    author: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('author') }})
    date_: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('date') }})
    slides: List[Slides] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('slides') }})
    title: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('title') }})
    



@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class HTTPBinSimpleJSONObject:
    slideshow: Slideshow = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('slideshow') }})
    
