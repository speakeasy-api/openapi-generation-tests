"""Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT."""

from openapi import SDK
from .common_helpers import *


def test_global_security_flattening():
    record_test("auth-global-security-flattening")

    s = SDK(api_key_auth="Bearer testToken")
    assert s is not None

    res = s.auth.api_key_auth_global()
    assert res is not None
    assert res.status_code == 200


def test_global_security_flattening_callback():
    record_test("auth-global-security-flattening-callback")

    s = SDK(api_key_auth=lambda: "Bearer testToken")
    assert s is not None

    res = s.auth.api_key_auth_global()
    assert res is not None
    assert res.status_code == 200