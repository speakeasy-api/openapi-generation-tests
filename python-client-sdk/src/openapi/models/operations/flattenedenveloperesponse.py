"""Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT."""

from __future__ import annotations
from openapi.types import BaseModel
from typing import Dict, List, TypedDict


class FlattenedEnvelopeResponseResponseBodyTypedDict(TypedDict):
    r"""OK"""
    
    message: str
    

class FlattenedEnvelopeResponseResponseBody(BaseModel):
    r"""OK"""
    
    message: str
    

class FlattenedEnvelopeResponseResponseTypedDict(TypedDict):
    headers: Dict[str, List[str]]
    result: FlattenedEnvelopeResponseResponseBodyTypedDict
    

class FlattenedEnvelopeResponseResponse(BaseModel):
    headers: Dict[str, List[str]]
    result: FlattenedEnvelopeResponseResponseBody
    