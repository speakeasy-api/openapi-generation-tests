"""Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT."""

from __future__ import annotations
from .stronglytypedoneofobject import (
    StronglyTypedOneOfObject,
    StronglyTypedOneOfObjectTypedDict,
)
from openapi.types import BaseModel
import pydantic
from typing import List
from typing_extensions import Annotated, TypedDict


class NestedArrayOfDiscriminatedUnionsTypedDict(TypedDict):
    nested_array: List[List[StronglyTypedOneOfObjectTypedDict]]


class NestedArrayOfDiscriminatedUnions(BaseModel):
    nested_array: Annotated[
        List[List[StronglyTypedOneOfObject]], pydantic.Field(alias="nestedArray")
    ]