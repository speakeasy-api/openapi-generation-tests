"""Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT."""

from __future__ import annotations
from openapi.types import BaseModel
import pydantic
from typing import Optional
from typing_extensions import Annotated, NotRequired, TypedDict, deprecated


@deprecated(
    "warning: ** DEPRECATED ** - This will be removed in a future release, please migrate away from it as soon as possible."
)
class DeprecatedObjectWithExampleTypedDict(TypedDict):
    str_: NotRequired[str]


@deprecated(
    "warning: ** DEPRECATED ** - This will be removed in a future release, please migrate away from it as soon as possible."
)
class DeprecatedObjectWithExample(BaseModel):
    str_: Annotated[Optional[str], pydantic.Field(alias="str")] = None