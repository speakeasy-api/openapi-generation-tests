"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

import requests
from sdk import SDK
from .common_helpers import record_test

def test_customclient_post():
    record_test("customclient-request-parameters-retained")

    http_client = requests.Session()
    http_client.headers.update({"x-Custom-header": "someValue"})

    s = SDK(client=http_client)
    assert s is not None

    res = s.custom_client.custom_client_post("headerValue", "pathValue", "queryValue")
    assert res is not None
    assert res.http_meta.response.status_code == 200
    assert res.res is not None
    assert res.res.url == "http://localhost:35123/anything/customClient/pathValue?queryStringParam=queryValue"
    assert res.res.args.query_string_param == "queryValue"
    assert res.res.headers["Headerparam"] == "headerValue"
    assert res.res.headers["X-Custom-Header"] == "someValue"