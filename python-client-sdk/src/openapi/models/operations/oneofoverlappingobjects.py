"""Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT."""

from __future__ import annotations
from openapi.models.shared import oneofoverlappingobjects as shared_oneofoverlappingobjects
from openapi.types import BaseModel
import pydantic
from typing import Optional, TypedDict
from typing_extensions import Annotated, NotRequired


class OneOfOverlappingObjectsRequestBodyTypedDict(TypedDict):
    field1: str
    field2: NotRequired[bool]
    field3: NotRequired[float]
    

class OneOfOverlappingObjectsRequestBody(BaseModel):
    field1: str
    field2: Optional[bool] = None
    field3: Optional[float] = None
    

class OneOfOverlappingObjectsResTypedDict(TypedDict):
    r"""OK"""
    
    json_: shared_oneofoverlappingobjects.OneOfOverlappingObjectsTypedDict
    

class OneOfOverlappingObjectsRes(BaseModel):
    r"""OK"""
    
    json_: Annotated[shared_oneofoverlappingobjects.OneOfOverlappingObjects, pydantic.Field(alias="json")]
    