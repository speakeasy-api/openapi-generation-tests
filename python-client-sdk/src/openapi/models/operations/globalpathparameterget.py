"""Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT."""

from __future__ import annotations
from openapi.types import BaseModel
from openapi.utils import FieldMetadata, PathParamMetadata
import pydantic
from typing import Optional, TypedDict
from typing_extensions import Annotated, NotRequired


class GlobalPathParameterGetGlobalsTypedDict(TypedDict):
    global_path_param: NotRequired[int]
    

class GlobalPathParameterGetGlobals(BaseModel):
    global_path_param: Annotated[Optional[int], pydantic.Field(alias="globalPathParam"), FieldMetadata(path=PathParamMetadata(style="simple", explode=False))] = None
    

class GlobalPathParameterGetRequestTypedDict(TypedDict):
    global_path_param: NotRequired[int]
    

class GlobalPathParameterGetRequest(BaseModel):
    global_path_param: Annotated[Optional[int], pydantic.Field(alias="globalPathParam"), FieldMetadata(path=PathParamMetadata(style="simple", explode=False))] = None
    

class GlobalPathParameterGetResTypedDict(TypedDict):
    r"""OK"""
    
    url: str
    

class GlobalPathParameterGetRes(BaseModel):
    r"""OK"""
    
    url: str
    