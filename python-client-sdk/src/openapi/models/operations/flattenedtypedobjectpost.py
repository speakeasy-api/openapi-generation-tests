"""Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT."""

from __future__ import annotations
from openapi.models.shared import flattenedtypedobject1 as shared_flattenedtypedobject1
from openapi.types import BaseModel
import pydantic
from typing import TypedDict
from typing_extensions import Annotated


class FlattenedTypedObjectPostResTypedDict(TypedDict):
    r"""OK"""
    
    json_: shared_flattenedtypedobject1.FlattenedTypedObject1TypedDict
    

class FlattenedTypedObjectPostRes(BaseModel):
    r"""OK"""
    
    json_: Annotated[shared_flattenedtypedobject1.FlattenedTypedObject1, pydantic.Field(alias="json")]
    