"""Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT."""

from __future__ import annotations
from openapi.types import BaseModel
from openapi.utils import FieldMetadata, SecurityMetadata
from typing import Optional, TypedDict
from typing_extensions import Annotated, NotRequired

MULTIPLE_SIMPLE_OPTIONS_AUTH_SERVERS = [
	"http://localhost:35456",
]


class MultipleSimpleOptionsAuthSecurityTypedDict(TypedDict):
    api_key_auth_new: NotRequired[str]
    oauth2: NotRequired[str]
    

class MultipleSimpleOptionsAuthSecurity(BaseModel):
    api_key_auth_new: Annotated[Optional[str], FieldMetadata(security=SecurityMetadata(scheme=True, scheme_type="apiKey", sub_type="header", field_name="x-api-key"))] = None
    oauth2: Annotated[Optional[str], FieldMetadata(security=SecurityMetadata(scheme=True, scheme_type="oauth2", field_name="Authorization"))] = None
    