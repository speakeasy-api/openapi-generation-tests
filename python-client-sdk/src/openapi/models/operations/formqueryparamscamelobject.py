"""Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT."""

from __future__ import annotations
from openapi.types import BaseModel
from openapi.utils import FieldMetadata, QueryParamMetadata
from typing import Optional, TypedDict
from typing_extensions import Annotated, NotRequired


class ObjParamTypedDict(TypedDict):
    encoded_count: NotRequired[str]
    encoded_term: NotRequired[str]


class ObjParam(BaseModel):
    encoded_count: Annotated[Optional[str], FieldMetadata(query=True)] = None

    encoded_term: Annotated[Optional[str], FieldMetadata(query=True)] = None


class ObjParamExplodedTypedDict(TypedDict):
    item_count: NotRequired[str]
    search_term: NotRequired[str]


class ObjParamExploded(BaseModel):
    item_count: Annotated[Optional[str], FieldMetadata(query=True)] = None

    search_term: Annotated[Optional[str], FieldMetadata(query=True)] = None


class FormQueryParamsCamelObjectRequestTypedDict(TypedDict):
    obj_param_exploded: ObjParamExplodedTypedDict
    obj_param: NotRequired[ObjParamTypedDict]


class FormQueryParamsCamelObjectRequest(BaseModel):
    obj_param_exploded: Annotated[
        ObjParamExploded,
        FieldMetadata(query=QueryParamMetadata(style="form", explode=True)),
    ]

    obj_param: Annotated[
        Optional[ObjParam],
        FieldMetadata(query=QueryParamMetadata(style="form", explode=False)),
    ] = None


class FormQueryParamsCamelObjectArgsTypedDict(TypedDict):
    item_count: str
    search_term: str


class FormQueryParamsCamelObjectArgs(BaseModel):
    item_count: str

    search_term: str


class FormQueryParamsCamelObjectResTypedDict(TypedDict):
    r"""OK"""

    args: FormQueryParamsCamelObjectArgsTypedDict
    url: str


class FormQueryParamsCamelObjectRes(BaseModel):
    r"""OK"""

    args: FormQueryParamsCamelObjectArgs

    url: str