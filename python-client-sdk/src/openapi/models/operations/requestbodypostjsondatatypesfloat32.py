"""Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT."""

from __future__ import annotations
from openapi.types import BaseModel
import pydantic
from typing import TypedDict
from typing_extensions import Annotated


class RequestBodyPostJSONDataTypesFloat32ResponseBodyTypedDict(TypedDict):
    r"""OK"""
    
    json_: float
    

class RequestBodyPostJSONDataTypesFloat32ResponseBody(BaseModel):
    r"""OK"""
    
    json_: Annotated[float, pydantic.Field(alias="json")]
    