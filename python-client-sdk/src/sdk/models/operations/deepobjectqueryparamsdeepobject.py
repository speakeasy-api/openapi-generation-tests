"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
import requests as requests_http
from ...models.shared import deepobjectqueryparams as shared_deepobjectqueryparams
from dataclasses_json import Undefined, dataclass_json
from sdk import utils
from typing import List, Optional


@dataclasses.dataclass
class DeepObjectQueryParamsDeepObjectRequest:
    deep_obj: shared_deepobjectqueryparams.DeepObjectQueryParams = dataclasses.field(metadata={'query_param': { 'field_name': 'deepObj', 'style': 'deepObject', 'explode': True }})
    r"""deepObject style query parameter serialization is undefined for arrays or nested objects by the specification:
       https://github.com/OAI/OpenAPI-Specification/issues/1706
    This schema covers the intended implementation cases rather than the fully complex deepObject schema.
    """
    



@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class DeepObjectQueryParamsDeepObjectArgs:
    deep_obj_arr: List[str] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('deepObj[arr]') }})
    deep_obj_bool: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('deepObj[bool]') }})
    deep_obj_int: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('deepObj[int]') }})
    deep_obj_map_testkey1: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('deepObj[map][testkey1]') }})
    deep_obj_map_testkey2: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('deepObj[map][testkey2]') }})
    deep_obj_num: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('deepObj[num]') }})
    deep_obj_obj_any: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('deepObj[obj][any]') }})
    deep_obj_obj_bigint_str: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('deepObj[obj][bigintStr]') }})
    deep_obj_obj_bigint: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('deepObj[obj][bigint]') }})
    deep_obj_obj_bool_opt: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('deepObj[obj][boolOpt]') }})
    deep_obj_obj_bool: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('deepObj[obj][bool]') }})
    deep_obj_obj_date_time: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('deepObj[obj][dateTime]') }})
    deep_obj_obj_date: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('deepObj[obj][date]') }})
    deep_obj_obj_decimal_str: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('deepObj[obj][decimalStr]') }})
    deep_obj_obj_decimal: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('deepObj[obj][decimal]') }})
    deep_obj_obj_enum: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('deepObj[obj][enum]') }})
    deep_obj_obj_float32: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('deepObj[obj][float32]') }})
    deep_obj_obj_int32_enum: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('deepObj[obj][int32Enum]') }})
    deep_obj_obj_int32: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('deepObj[obj][int32]') }})
    deep_obj_obj_int_enum: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('deepObj[obj][intEnum]') }})
    deep_obj_obj_int: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('deepObj[obj][int]') }})
    deep_obj_obj_num: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('deepObj[obj][num]') }})
    deep_obj_obj_str_opt: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('deepObj[obj][strOpt]') }})
    deep_obj_obj_str: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('deepObj[obj][str]') }})
    deep_obj_str: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('deepObj[str]') }})
    deep_obj_obj_float64_str: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('deepObj[obj][float64Str]'), 'exclude': lambda f: f is None }})
    deep_obj_obj_int64_str: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('deepObj[obj][int64Str]'), 'exclude': lambda f: f is None }})
    



@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class DeepObjectQueryParamsDeepObjectRes:
    r"""OK"""
    args: DeepObjectQueryParamsDeepObjectArgs = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('args') }})
    url: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('url') }})
    



@dataclasses.dataclass
class DeepObjectQueryParamsDeepObjectResponse:
    content_type: str = dataclasses.field()
    r"""HTTP response content type for this operation"""
    status_code: int = dataclasses.field()
    r"""HTTP response status code for this operation"""
    raw_response: requests_http.Response = dataclasses.field()
    r"""Raw HTTP response; suitable for custom response parsing"""
    res: Optional[DeepObjectQueryParamsDeepObjectRes] = dataclasses.field(default=None)
    r"""OK"""
    
