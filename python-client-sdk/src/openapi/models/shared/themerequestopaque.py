"""Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT."""

from __future__ import annotations
from openapi.types import BaseModel
import pydantic
from typing import Optional, TypedDict
from typing_extensions import Annotated, NotRequired


class ThemeRequestOpaqueTypedDict(TypedDict):
    color: NotRequired[str]
    hero_width: NotRequired[int]
    icon: NotRequired[str]


class ThemeRequestOpaque(BaseModel):
    color: Optional[str] = None

    hero_width: Annotated[Optional[int], pydantic.Field(alias="heroWidth")] = None

    icon: Optional[str] = None