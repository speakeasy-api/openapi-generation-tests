"""Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT."""

from __future__ import annotations
from openapi.types import BaseModel
import pydantic
from typing import Final, Literal, TypedDict
from typing_extensions import Annotated


class CarTypedDict(TypedDict):
    vehicle_type: Literal["car"]
    wheels_type: Literal["four"]


class Car(BaseModel):
    # fmt: off
    VEHICLE_TYPE: Annotated[Final[str], pydantic.Field(alias="vehicleType")] = "car" # type: ignore
    # fmt: on

    # fmt: off
    WHEELS_TYPE: Annotated[Final[str], pydantic.Field(alias="wheelsType")] = "four" # type: ignore
    # fmt: on