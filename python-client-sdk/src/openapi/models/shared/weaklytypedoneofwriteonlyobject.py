"""Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT."""

from __future__ import annotations
from .simpleobject import SimpleObject, SimpleObjectTypedDict
from .writeonlyobject import WriteOnlyObject, WriteOnlyObjectTypedDict
from typing import Union


WeaklyTypedOneOfWriteOnlyObjectTypedDict = Union[
    WriteOnlyObjectTypedDict, SimpleObjectTypedDict
]


WeaklyTypedOneOfWriteOnlyObject = Union[WriteOnlyObject, SimpleObject]