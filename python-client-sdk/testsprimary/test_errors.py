"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

import pytest
import requests
from sdk import SDK
from sdk.models import errors

from .common_helpers import *
from .helpers import *


def test_status_get_error_default_error_codes():
    record_test('errors-status-get-error-default-error-codes')

    s = SDK()
    assert s is not None

    with pytest.raises(errors.SDKError, match="API error occurred: Status 400") as exc_info_400:
        res = s.errors.status_get_error(status_code=400)

    assert exc_info_400.value.status_code == 400
    assert exc_info_400.value.raw_response.status_code == 400

    with pytest.raises(errors.SDKError, match="API error occurred: Status 500") as exc_info_500:
        res = s.errors.status_get_error(status_code=500)

    assert exc_info_500.value.status_code == 500
    assert exc_info_500.value.raw_response.status_code == 500


def test_status_get_error_300_non_error():
    record_test('errors-status-get-error-300-non-error')

    s = SDK()
    assert s is not None

    res = s.errors.status_get_error(status_code=300)
    assert res.status_code == 300


def test_status_get_x_speakeasy_errors():
    record_test('errors-status-get-error-x-speakeasy-errors')

    s = SDK()
    assert s is not None

    with pytest.raises(errors.SDKError, match='API error occurred: Status 400\n{"message":"an error occurred","code":"400","type":"internal"}\n') as exc_info_400:
        s.errors.status_get_x_speakeasy_errors(status_code=400)

    assert exc_info_400.value.status_code == 400
    assert exc_info_400.value.raw_response.status_code == 400

    with pytest.raises(errors.SDKError, match='API error occurred: Status 401\n{"message":"an error occurred","code":"401","type":"internal"}\n') as exc_info_401:
        s.errors.status_get_x_speakeasy_errors(status_code=401)

    assert exc_info_401.value.status_code == 401
    assert exc_info_401.value.raw_response.status_code == 401

    with pytest.raises(errors.SDKError, match='API error occurred: Status 402\n{"message":"an error occurred","code":"402","type":"internal"}\n') as exc_info_402:
        s.errors.status_get_x_speakeasy_errors(status_code=402)

    assert exc_info_402.value.status_code == 402
    assert exc_info_402.value.raw_response.status_code == 402

    with pytest.raises(errors.Error, match='an error occurred') as exc_info_500:
        s.errors.status_get_x_speakeasy_errors(status_code=500)

    assert exc_info_500.value.code == "500"

    with pytest.raises(errors.StatusGetXSpeakeasyErrorsResponseBody, match='{"code": "501", "message": "an error occurred", "type": "internal"}') as exc_info_501:
        s.errors.status_get_x_speakeasy_errors(status_code=501)

    assert exc_info_501.value.code == "501"
    assert exc_info_501.value.raw_response.status_code == 501


def test_connection_error_get():
    record_test('errors-connection-error')

    s = SDK()
    assert s is not None

    with pytest.raises(requests.exceptions.ConnectionError, match='Failed to resolve \'somebrokenapi.broken\'') as exc_info:
        s.errors.connection_error_get()