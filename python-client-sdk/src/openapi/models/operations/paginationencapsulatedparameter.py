"""Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT."""

from __future__ import annotations
from openapi.types import BaseModel
from openapi.utils import FieldMetadata, HeaderMetadata, QueryParamMetadata
import pydantic
from typing import Callable, List, Optional
from typing_extensions import Annotated, NotRequired, TypedDict

PAGINATION_ENCAPSULATED_PARAMETER_SERVERS = [
    "http://localhost:35456",
]


class PaginationEncapsulatedParameterRequestTypedDict(TypedDict):
    cursor: NotRequired[int]
    header_param: NotRequired[str]


class PaginationEncapsulatedParameterRequest(BaseModel):
    cursor: Annotated[
        Optional[int],
        FieldMetadata(query=QueryParamMetadata(style="form", explode=True)),
    ] = None

    header_param: Annotated[
        Optional[str],
        pydantic.Field(alias="headerParam"),
        FieldMetadata(header=HeaderMetadata(style="simple", explode=False)),
    ] = None


class PaginationEncapsulatedParameterResTypedDict(TypedDict):
    r"""OK"""

    num_pages: int
    result_array: List[int]
    next: NotRequired[str]


class PaginationEncapsulatedParameterRes(BaseModel):
    r"""OK"""

    num_pages: Annotated[int, pydantic.Field(alias="numPages")]

    result_array: Annotated[List[int], pydantic.Field(alias="resultArray")]

    next: Optional[str] = None


class PaginationEncapsulatedParameterResponseTypedDict(TypedDict):
    result: PaginationEncapsulatedParameterResTypedDict


class PaginationEncapsulatedParameterResponse(BaseModel):
    next: Callable[[], Optional[PaginationEncapsulatedParameterResponse]]

    result: PaginationEncapsulatedParameterRes