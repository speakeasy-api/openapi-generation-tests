"""Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT."""

from __future__ import annotations
from openapi.types import BaseModel
import pydantic
from typing import TypedDict
from typing_extensions import Annotated


class RequestBodyPutMultipartDeepFormTypedDict(TypedDict):
    arr: str
    bool_: str
    int_: str
    map: str
    num: str
    obj: str
    str_: str
    

class RequestBodyPutMultipartDeepForm(BaseModel):
    arr: str
    bool_: Annotated[str, pydantic.Field(alias="bool")]
    int_: Annotated[str, pydantic.Field(alias="int")]
    map: str
    num: str
    obj: str
    str_: Annotated[str, pydantic.Field(alias="str")]
    

class RequestBodyPutMultipartDeepResTypedDict(TypedDict):
    r"""OK"""
    
    form: RequestBodyPutMultipartDeepFormTypedDict
    

class RequestBodyPutMultipartDeepRes(BaseModel):
    r"""OK"""
    
    form: RequestBodyPutMultipartDeepForm
    