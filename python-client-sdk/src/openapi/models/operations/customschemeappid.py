"""Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT."""

from __future__ import annotations
from openapi.types import BaseModel
from openapi.utils import FieldMetadata, SecurityMetadata
import pydantic
from typing import TypedDict
from typing_extensions import Annotated

CUSTOM_SCHEME_APP_ID_SERVERS = [
	"http://localhost:35456",
]


class CustomSchemeAppIDSecurityTypedDict(TypedDict):
    app_id: str
    secret: str
    

class CustomSchemeAppIDSecurity(BaseModel):
    app_id: Annotated[str, pydantic.Field(alias="appId"), FieldMetadata(security=SecurityMetadata(scheme=True, scheme_type="http", sub_type="custom", field_name="appId"))]
    secret: Annotated[str, FieldMetadata(security=SecurityMetadata(scheme=True, scheme_type="http", sub_type="custom", field_name="secret"))]
    