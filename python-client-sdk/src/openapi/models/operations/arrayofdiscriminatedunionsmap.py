"""Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT."""

from __future__ import annotations
from openapi.models.shared import (
    arrayofdiscriminatedunionsmap as shared_arrayofdiscriminatedunionsmap,
)
from openapi.types import BaseModel
import pydantic
from typing_extensions import Annotated, TypedDict


class ArrayOfDiscriminatedUnionsMapResTypedDict(TypedDict):
    r"""OK"""

    json_: shared_arrayofdiscriminatedunionsmap.ArrayOfDiscriminatedUnionsMapTypedDict


class ArrayOfDiscriminatedUnionsMapRes(BaseModel):
    r"""OK"""

    json_: Annotated[
        shared_arrayofdiscriminatedunionsmap.ArrayOfDiscriminatedUnionsMap,
        pydantic.Field(alias="json"),
    ]