"""Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT."""

from __future__ import annotations
from .anyofmultimatchmember1 import (
    AnyOfMultiMatchMember1,
    AnyOfMultiMatchMember1TypedDict,
)
from .anyofmultimatchmember2 import (
    AnyOfMultiMatchMember2,
    AnyOfMultiMatchMember2TypedDict,
)
from typing import Union
from typing_extensions import TypeAliasType


AnyOfMultiMatchTypedDict = TypeAliasType(
    "AnyOfMultiMatchTypedDict",
    Union[AnyOfMultiMatchMember1TypedDict, AnyOfMultiMatchMember2TypedDict],
)


AnyOfMultiMatch = TypeAliasType(
    "AnyOfMultiMatch", Union[AnyOfMultiMatchMember1, AnyOfMultiMatchMember2]
)