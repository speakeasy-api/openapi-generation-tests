"""Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT."""

from openapi import SDK
from openapi.models.operations import *

from .common_helpers import *


def test_headers_override_request_headers():
    record_test("headers-override-request-headers")

    s = SDK()

    assert s is not None

    res = s.methods.method_get(
        http_headers={
            "x-inject-header-1": "foo",
            "x-inject-header-2": "bar",
        }
    )

    assert res.http_meta is not None

    assert res.http_meta.response is not None
    assert res.http_meta.response.status_code == 200
    assert res.object is not None
    assert res.object == MethodGetResponseBody(
        status="OK",
    )

    assert res.http_meta.request is not None
    assert res.http_meta.request.headers.get("x-inject-header-1") == "foo"
    assert res.http_meta.request.headers.get("x-inject-header-2") == "bar"