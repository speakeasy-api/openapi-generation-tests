"""Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT."""

from __future__ import annotations
from openapi.models.shared import simpleobject as shared_simpleobject
from openapi.types import BaseModel
from openapi.utils import FieldMetadata, PathParamMetadata
import pydantic
from typing import TypedDict
from typing_extensions import Annotated


class PathParameterJSONRequestTypedDict(TypedDict):
    json_obj: shared_simpleobject.SimpleObjectTypedDict
    r"""A simple object that uses all our supported primitive types and enums and has optional properties."""


class PathParameterJSONRequest(BaseModel):
    json_obj: Annotated[
        shared_simpleobject.SimpleObject,
        pydantic.Field(alias="jsonObj"),
        FieldMetadata(path=PathParamMetadata(serialization="json")),
    ]
    r"""A simple object that uses all our supported primitive types and enums and has optional properties."""


class PathParameterJSONResTypedDict(TypedDict):
    r"""OK"""

    url: str


class PathParameterJSONRes(BaseModel):
    r"""OK"""

    url: str