"""Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT."""

from openapi import SDK

from .common_helpers import *


def test_custom_code_region_sdk_method_with_imports():
    record_test("custom-code-region-sdk-method-with-imports")

    s = SDK()

    res = s.custom_health_check()  # Note: In Python we typically use snake_case

    assert res is True


def test_custom_code_region_sub_sdk_method_with_imports():
    record_test("custom-code-region-sub-sdk-method-with-imports")

    s = SDK()

    res = s.health.custom_health_check()

    assert res is True