"""Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT."""

from __future__ import annotations
from openapi.types import BaseModel
import pydantic
from typing import Final, Literal, Optional, TypedDict
from typing_extensions import Annotated, NotRequired


class HeartbeatEventTypedDict(TypedDict):
    r"""Represents a single heartbeat event"""

    data: str
    event: Literal["heartbeat"]
    retry: NotRequired[int]


class HeartbeatEvent(BaseModel):
    r"""Represents a single heartbeat event"""

    data: str

    # fmt: off
    EVENT: Annotated[Final[str], pydantic.Field(alias="event")] = "heartbeat" # type: ignore
    # fmt: on

    retry: Optional[int] = None