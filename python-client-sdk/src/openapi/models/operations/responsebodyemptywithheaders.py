"""Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT."""

from __future__ import annotations
from openapi.types import BaseModel
from openapi.utils import FieldMetadata, QueryParamMetadata
import pydantic
from typing import Dict, List, TypedDict
from typing_extensions import Annotated


class ResponseBodyEmptyWithHeadersRequestTypedDict(TypedDict):
    x_number_header: float
    x_string_header: str


class ResponseBodyEmptyWithHeadersRequest(BaseModel):
    x_number_header: Annotated[
        float,
        pydantic.Field(alias="X-Number-Header"),
        FieldMetadata(query=QueryParamMetadata(style="form", explode=True)),
    ]

    x_string_header: Annotated[
        str,
        pydantic.Field(alias="X-String-Header"),
        FieldMetadata(query=QueryParamMetadata(style="form", explode=True)),
    ]


class ResponseBodyEmptyWithHeadersResponseTypedDict(TypedDict):
    headers: Dict[str, List[str]]


class ResponseBodyEmptyWithHeadersResponse(BaseModel):
    headers: Dict[str, List[str]]