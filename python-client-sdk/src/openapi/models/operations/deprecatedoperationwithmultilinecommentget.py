"""Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT."""

from __future__ import annotations
from openapi.types import BaseModel
from openapi.utils import FieldMetadata, QueryParamMetadata
import pydantic
from typing import Optional
from typing_extensions import Annotated, NotRequired, TypedDict


class DeprecatedOperationWithMultilineCommentGetRequestTypedDict(TypedDict):
    deprecated_parameter: NotRequired[str]
    r"""This is a string parameter"""
    new_parameter: NotRequired[str]
    r"""This is a string parameter"""


class DeprecatedOperationWithMultilineCommentGetRequest(BaseModel):
    deprecated_parameter: Annotated[
        Optional[str],
        pydantic.Field(
            deprecated="""warning: ** DEPRECATED ** - This parameter is deprecated.
Its deprecation message has newlines.
. Use new_parameter instead.""",
            alias="deprecatedParameter",
        ),
        FieldMetadata(query=QueryParamMetadata(style="form", explode=True)),
    ] = None
    r"""This is a string parameter"""

    new_parameter: Annotated[
        Optional[str],
        pydantic.Field(alias="newParameter"),
        FieldMetadata(query=QueryParamMetadata(style="form", explode=True)),
    ] = None
    r"""This is a string parameter"""