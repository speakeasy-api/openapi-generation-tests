"""Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT."""

from __future__ import annotations
from openapi.types import BaseModel
from openapi.utils import FieldMetadata
import pydantic
from typing import TypedDict
from typing_extensions import Annotated


class RefQueryParamObjExplodedTypedDict(TypedDict):
    bool_: bool
    int_: int
    num: float
    str_: str
    

class RefQueryParamObjExploded(BaseModel):
    bool_: Annotated[bool, pydantic.Field(alias="bool"), FieldMetadata(query=True)]
    int_: Annotated[int, pydantic.Field(alias="int"), FieldMetadata(query=True)]
    num: Annotated[float, FieldMetadata(query=True)]
    str_: Annotated[str, pydantic.Field(alias="str"), FieldMetadata(query=True)]
    