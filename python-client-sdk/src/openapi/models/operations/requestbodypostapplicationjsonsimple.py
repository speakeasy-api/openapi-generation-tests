"""Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT."""

from __future__ import annotations
from openapi.models.shared import simpleobject as shared_simpleobject
from openapi.types import BaseModel
import pydantic
from typing import TypedDict
from typing_extensions import Annotated


class RequestBodyPostApplicationJSONSimpleResTypedDict(TypedDict):
    r"""OK"""
    
    json_: shared_simpleobject.SimpleObjectTypedDict
    r"""A simple object that uses all our supported primitive types and enums and has optional properties.
    https://speakeasy.com/docs - A link to the external docs.
    """
    

class RequestBodyPostApplicationJSONSimpleRes(BaseModel):
    r"""OK"""
    
    json_: Annotated[shared_simpleobject.SimpleObject, pydantic.Field(alias="json")]
    r"""A simple object that uses all our supported primitive types and enums and has optional properties.
    https://speakeasy.com/docs - A link to the external docs.
    """
    