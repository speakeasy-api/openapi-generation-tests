"""Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT."""

from __future__ import annotations
from openapi.types import BaseModel, Nullable, OptionalNullable, UNSET_SENTINEL
import pydantic
from pydantic import model_serializer
from typing import Final, TypedDict
from typing_extensions import Annotated


class ObjectWithNullEnumsTypedDict(TypedDict):
    pass
    

class ObjectWithNullEnums(BaseModel):
    NULL_ENUM: Annotated[Final[Nullable[str]], pydantic.Field(alias="nullEnum")] = None # type: ignore
    OPT_NULL_ENUM: Annotated[Final[OptionalNullable[str]], pydantic.Field(alias="optNullEnum")] = None # type: ignore
    
    @model_serializer(mode="wrap")
    def serialize_model(self, handler):
        optional_fields = ["optNullEnum"]
        nullable_fields = ["nullEnum", "optNullEnum"]
        null_default_fields = []

        serialized = handler(self)

        m = {}

        for n, f in self.model_fields.items():
            k = f.alias or n
            val = serialized.get(k)
            serialized.pop(k, None)

            optional_nullable = k in optional_fields and k in nullable_fields
            is_set = (self.__pydantic_fields_set__.intersection({n}) or k in null_default_fields) # pylint: disable=no-member

            if val is not None and val != UNSET_SENTINEL:
                m[k] = val
            elif val != UNSET_SENTINEL and (
                not k in optional_fields or (optional_nullable and is_set)
            ):
                m[k] = val
        
        return m
        