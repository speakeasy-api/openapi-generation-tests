"""Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT."""

from __future__ import annotations
from openapi.types import BaseModel
from openapi.utils import FieldMetadata, QueryParamMetadata
import pydantic
from typing import Optional, TypedDict
from typing_extensions import Annotated, NotRequired

RETRIES_AFTER_SERVERS = [
	"http://localhost:35456",
]


class RetriesAfterRequestTypedDict(TypedDict):
    request_id: str
    num_retries: NotRequired[int]
    retry_after_val: NotRequired[int]
    

class RetriesAfterRequest(BaseModel):
    request_id: Annotated[str, pydantic.Field(alias="request-id"), FieldMetadata(query=QueryParamMetadata(style="form", explode=True))]
    num_retries: Annotated[Optional[int], pydantic.Field(alias="num-retries"), FieldMetadata(query=QueryParamMetadata(style="form", explode=True))] = None
    retry_after_val: Annotated[Optional[int], pydantic.Field(alias="retry-after-val"), FieldMetadata(query=QueryParamMetadata(style="form", explode=True))] = None
    

class RetriesAfterRetriesTypedDict(TypedDict):
    r"""OK"""
    
    retries: int
    

class RetriesAfterRetries(BaseModel):
    r"""OK"""
    
    retries: int
    