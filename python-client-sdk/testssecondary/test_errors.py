"""Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT."""

import pytest
from openapi import SDK
from openapi.models import errors, operations

def test_discriminated_union_of_errors_post():
    # Tests `utils.get_discriminator` for `enumFormat: enum`

    s = SDK()
    assert s is not None

    req1 = operations.TaggedError1RequestBody(tag="tag1", error="Error1")
    with pytest.raises(
        errors.ErrorUnionDiscriminatedPostResponseBody,
        match='{"error":"Error1","tag":"tag1"}',
    ) as error1:
        s.errors.error_union_discriminated_post(request=req1)
    assert error1.value.data.error == "Error1"

    req2 = operations.TaggedError2RequestBody(
        tag="tag2",
        error=operations.TaggedError2Message(message="Error2")
    )
    with pytest.raises(
        errors.ErrorUnionDiscriminatedPostResponseBody,
        match='{"error":{"message":"Error2"},"tag":"tag2"}',
    ) as error2:
        s.errors.error_union_discriminated_post(request=req2)
    assert error2.value.data.error.message == "Error2"