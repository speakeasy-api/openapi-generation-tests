"""Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT."""

from __future__ import annotations
from .simpleobject import SimpleObject, SimpleObjectTypedDict
from openapi.types import BaseModel
import pydantic
from typing import Dict, List, Optional, TypedDict, Union
from typing_extensions import Annotated, NotRequired


class DeepObjectWithNonStandardTypeNameTypedDict(TypedDict):
    any: DeepObjectWithNonStandardTypeNameAnyTypedDict
    arr: List[SimpleObjectTypedDict]
    bool_: bool
    int_: int
    map: Dict[str, SimpleObjectTypedDict]
    num: float
    obj: SimpleObjectTypedDict
    r"""A simple object that uses all our supported primitive types and enums and has optional properties.
    https://speakeasy.com/docs - A link to the external docs.
    """
    str_: str
    obj_type: NotRequired[str]
    type: NotRequired[str]
    

class DeepObjectWithNonStandardTypeName(BaseModel):
    any: DeepObjectWithNonStandardTypeNameAny
    arr: List[SimpleObject]
    bool_: Annotated[bool, pydantic.Field(alias="bool")]
    int_: Annotated[int, pydantic.Field(alias="int")]
    map: Dict[str, SimpleObject]
    num: float
    obj: SimpleObject
    r"""A simple object that uses all our supported primitive types and enums and has optional properties.
    https://speakeasy.com/docs - A link to the external docs.
    """
    str_: Annotated[str, pydantic.Field(alias="str")]
    obj_type: Annotated[Optional[str], pydantic.Field(alias="obj.type")] = None
    type: Optional[str] = None
    

DeepObjectWithNonStandardTypeNameAnyTypedDict = Union[SimpleObjectTypedDict, str]


DeepObjectWithNonStandardTypeNameAny = Union[SimpleObject, str]
