"""Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT."""

from __future__ import annotations
from openapi.models.shared import deepobject as shared_deepobject
from openapi.types import BaseModel
import pydantic
from typing import Optional, TypedDict
from typing_extensions import Annotated, NotRequired


class RequestBodyPostApplicationJSONDeepResTypedDict(TypedDict):
    r"""OK"""
    
    json_: NotRequired[shared_deepobject.DeepObjectTypedDict]
    

class RequestBodyPostApplicationJSONDeepRes(BaseModel):
    r"""OK"""
    
    json_: Annotated[Optional[shared_deepobject.DeepObject], pydantic.Field(alias="json")] = None
    