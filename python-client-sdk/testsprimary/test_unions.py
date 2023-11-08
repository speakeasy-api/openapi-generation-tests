"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from datetime import datetime
from decimal import Decimal

import pytest
from sdk import SDK
from sdk.utils import utils

from .common_helpers import *
from .helpers import *


def test_strongly_typed_one_of_post_basic():
    record_test('unions-strongly-typed-one-of-post-basic')

    s = SDK()
    assert s is not None

    obj = create_simple_object_with_type()

    res = s.unions.strongly_typed_one_of_post(request=obj)
    assert res is not None
    assert res.status_code == 200
    assert res.res is not None
    compare_simple_object_with_type(res.res.json, obj)


def test_strongly_typed_one_of_post_deep():
    record_test("unions-strongly-typed-one-of-post-deep")
    s = SDK()
    assert s is not None

    obj = create_deep_object_with_type()

    res = s.unions.strongly_typed_one_of_post(request=obj)
    assert res is not None
    assert res.status_code == 200
    assert res.res is not None
    compare_deep_object_with_type(res.res.json, obj)


def test_weakly_typed_one_of_post_basic():
    record_test("unions-weakly-typed-one-of-post-basic")
    s = SDK()
    assert s is not None

    obj = create_simple_object()

    res = s.unions.weakly_typed_one_of_post(request=obj)
    assert res is not None
    assert res.status_code == 200
    assert type(res.res.json) == shared.SimpleObject


def test_weakly_typed_one_of_post_deep():
    record_test("unions-weakly-typed-one-of-post-deep")
    s = SDK()
    assert s is not None

    obj = create_deep_object()

    res = s.unions.weakly_typed_one_of_post(request=obj)
    assert res is not None
    assert res.status_code == 200
    assert type(res.res.json) == shared.DeepObject


def test_typed_object_one_of_post_obj1():
    record_test("unions-typed-object-one-of-post-obj1")
    s = SDK()
    assert s is not None

    obj = shared.TypedObject1(value="obj1", type=shared.TypedObject1Type.OBJ1)

    res = s.unions.typed_object_one_of_post(request=obj)
    assert res is not None
    assert res.status_code == 200
    assert type(res.res.json) == shared.TypedObject1
    assert res.res.json.value == "obj1"


def test_typed_object_one_of_post_obj2():
    record_test("unions-typed-object-one-of-post-obj2")
    s = SDK()
    assert s is not None

    obj = shared.TypedObject2(value="obj2", type=shared.TypedObject2Type.OBJ2)

    res = s.unions.typed_object_one_of_post(request=obj)
    assert res is not None
    assert res.status_code == 200
    assert type(res.res.json) == shared.TypedObject2
    assert res.res.json.value == "obj2"


def test_typed_object_one_of_post_obj3():
    record_test("unions-typed-object-one-of-post-obj3")
    s = SDK()
    assert s is not None

    obj = shared.TypedObject3(value="obj3", type=shared.TypedObject3Type.OBJ3)

    res = s.unions.typed_object_one_of_post(request=obj)
    assert res is not None
    assert res.status_code == 200
    assert type(res.res.json) == shared.TypedObject3
    assert res.res.json.value == "obj3"

# TODO
# def test_typed_object_one_of_post_null():
#     record_test("unions-typed-object-one-of-post-null")

#     s = SDK()

# 	res = s.unions.typed_object_one_of_post(request=None)
# 	require.Error(t, err)
# 	assert.Equal(t, err.Error(), "error serializing request body: json: error calling MarshalJSON for type shared.TypedObjectOneOf: could not marshal union type: all fields are null")


def test_typed_object_nullable_one_of_post_obj1():
    record_test("unions-typed-object-nullable-one-of-post-obj1")

    s = SDK()

    obj = shared.TypedObject1(value="one", type=shared.TypedObject1Type.OBJ1)

    res = s.unions.typed_object_nullable_one_of_post(request=obj)
    assert res is not None
    assert res.status_code == 200
    assert type(res.res.json) == shared.TypedObject1
    assert res.res.json.value == "one"


def test_typed_object_nullable_one_of_post_obj2():
    record_test("unions-typed-object-nullable-one-of-post-obj2")

    s = SDK()

    obj = shared.TypedObject2(value="two", type=shared.TypedObject2Type.OBJ2)

    res = s.unions.typed_object_nullable_one_of_post(request=obj)
    assert res is not None
    assert res.status_code == 200
    assert type(res.res.json) == shared.TypedObject2
    assert res.res.json.value == "two"


def test_typed_object_nullable_one_of_post_null():
    record_test("unions-typed-object-nullable-one-of-post-null")

    s = SDK()

    res = s.unions.typed_object_nullable_one_of_post(None)
    assert res is not None
    assert res.status_code == 200
    assert res.res.json is None


def test_flattened_typed_object_post_obj1():
    record_test("unions-flattened-typed-object-post-obj1")

    s = SDK()

    obj = shared.TypedObject1(value="one", type=shared.TypedObject1Type.OBJ1)

    res = s.unions.flattened_typed_object_post(request=obj)
    assert res is not None
    assert res.status_code == 200
    assert res.res.json.value == "one"


def test_unions_nullable_typed_object_post_obj1():
    record_test("unions-nullable-typed-object-post-obj1")

    s = SDK()

    obj = shared.TypedObject1(value="one", type=shared.TypedObject1Type.OBJ1)

    res = s.unions.nullable_typed_object_post(request=obj)
    assert res is not None
    assert res.status_code == 200
    assert res.res.json.value == "one"


def test_unions_nullable_typed_object_post_null():
    record_test("unions-nullable-typed-object-post-null")

    s = SDK()

    res = s.unions.nullable_typed_object_post(request=None)
    assert res is not None
    assert res.status_code == 200
    assert res.res.json is None


def test_nullable_one_of_schema_post_obj1():
    record_test("unions-nullable-oneof-schema-post-obj1")

    s = SDK()

    obj = shared.TypedObject1(value="one", type=shared.TypedObject1Type.OBJ1)

    res = s.unions.nullable_one_of_schema_post(request=obj)
    assert res is not None
    assert res.status_code == 200
    assert res.res.json.value == "one"


def test_nullable_one_of_schema_post_obj2():
    record_test("unions-nullable-oneof-schema-post-obj2")

    s = SDK()

    obj = shared.TypedObject2(value="two", type=shared.TypedObject2Type.OBJ2)

    res = s.unions.nullable_one_of_schema_post(request=obj)
    assert res is not None
    assert res.status_code == 200
    assert res.res.json.value == "two"


def test_nullable_one_of_schema_post_null():
    record_test("unions-nullable-oneof-schema-post-null")

    s = SDK()

    res = s.unions.nullable_one_of_schema_post(request=None)
    assert res is not None
    assert res.status_code == 200
    assert res.res.json is None


class MicroMock(object):
    def __init__(self, **kwargs):
        self.__dict__.update(kwargs)


def test_nullable_one_of_type_in_object_post():
    record_test("unions-nullable-oneof-type-in-object-post")
    tests = [
        MicroMock(
            name="Nullable fields set to null",
            obj=shared.NullableOneOfTypeInObject(
                nullable_one_of_one=None, nullable_one_of_two=None, one_of_one=True),
            want_json='{"NullableOneOfOne": null, "NullableOneOfTwo": null, "OneOfOne": true}',
        ),
        MicroMock(
            name="All fields set to non-null values",
            obj=shared.NullableOneOfTypeInObject(
                nullable_one_of_one=True, nullable_one_of_two=2, one_of_one=True),
            want_json='{"NullableOneOfOne": true, "NullableOneOfTwo": 2, "OneOfOne": true}',
        ),
    ]

    s = SDK()
    for tt in tests:
        _, req, _ = utils.serialize_request_body(
            tt.obj, "Request", False, False, "json")
        assert req is not None
        assert req == tt.want_json
        res = s.unions.nullable_one_of_type_in_object_post(tt.obj)
        assert res is not None
        assert res.status_code == 200
        assert res.res.json == tt.obj


############################################################
# The following test is disabled because python currently
# does not support discrimination on const enum fields.
############################################################
# def test_nullable_one_of_ref_in_object_post():
#     record_test("unions-nullable-oneof-ref-in-object-post")

#     tests = [
#         MicroMock(
#             name="Nullable fields set to null",
#             obj=shared.NullableOneOfRefInObject(
#                 nullable_one_of_one=None, nullable_one_of_two=None, one_of_one=shared.TypedObject1(value="one")),
#             want_json='{"NullableOneOfOne": null, "NullableOneOfTwo": null, "OneOfOne": {"value": "one", "type": "obj1"}}',
#         ),
#         MicroMock(
#             name="All fields set to non-null values",
#             obj=shared.NullableOneOfRefInObject(nullable_one_of_one=shared.TypedObject1(
#                 value="one"), nullable_one_of_two=shared.TypedObject2(value="two"), one_of_one=shared.TypedObject1("")),
#             want_json='{"NullableOneOfOne": {"value": "one", "type": "obj1"}, "NullableOneOfTwo": {"value": "two", "type": "obj2"}, "OneOfOne": {"value": "", "type": "obj1"}}',
#         ),
#     ]

#     s = SDK()
#     for tt in tests:
#         _, req, _ = utils.serialize_request_body(
#             tt.obj, "Request", False, False, "json")
#         assert req is not None
#         assert req == tt.want_json
#         res = s.unions.nullable_one_of_ref_in_object_post(tt.obj)
#         assert res is not None
#         assert res.status_code == 200
#         assert res.res.json == tt.obj


def test_primitive_type_one_of_post_string():
    record_test("unions-primitive-type-one-of-post-string")
    s = SDK()
    assert s is not None

    res = s.unions.primitive_type_one_of_post(request="test")
    assert res is not None
    assert res.status_code == 200
    assert res.res.json == "test"


def test_primitive_type_one_of_post_integer():
    record_test("unions-primitive-type-one-of-post-integer")
    s = SDK()
    assert s is not None

    res = s.unions.primitive_type_one_of_post(request=1)
    assert res is not None
    assert res.status_code == 200
    assert res.res.json == 1


def test_primitive_type_one_of_post_number():
    record_test("unions-primitive-type-one-of-post-number")
    s = SDK()
    assert s is not None

    res = s.unions.primitive_type_one_of_post(request=1.1)
    assert res is not None
    assert res.status_code == 200
    assert res.res.json == 1.1


def test_primitive_type_one_of_post_boolean():
    record_test("unions-primitive-type-one-of-post-boolean")
    s = SDK()
    assert s is not None

    res = s.unions.primitive_type_one_of_post(request=True)
    assert res is not None
    assert res.status_code == 200
    assert res.res.json == True


def test_mixed_type_one_of_post_string():
    record_test("unions-mixed-type-one-of-post-string")
    s = SDK()
    assert s is not None

    res = s.unions.mixed_type_one_of_post(request="str")
    assert res is not None
    assert res.status_code == 200
    assert res.res.json == "str"


def test_mixed_type_one_of_post_integer():
    record_test("unions-mixed-type-one-of-post-integer")
    s = SDK()
    assert s is not None

    res = s.unions.mixed_type_one_of_post(request=1)
    assert res is not None
    assert res.status_code == 200
    assert res.res.json == 1


def test_mixed_type_one_of_post_object():
    record_test("unions-mixed-type-one-of-post-object")
    s = SDK()
    assert s is not None

    obj = create_simple_object()

    res = s.unions.mixed_type_one_of_post(request=obj)
    assert res is not None
    assert res.status_code == 200
    compare_simple_object(res.res.json, obj)


def test_date_null_union():
    record_test("unions-date-null")
    s = SDK()
    assert s is not None

    res = s.unions.union_date_null(request=datetime.now().date())
    assert res is not None
    assert res.status_code == 200
    assert type(res.res.json) == date


def test_date_time_null_union():
    record_test("unions-datetime-null")
    s = SDK()
    assert s is not None

    res = s.unions.union_date_time_null(request=datetime.now())
    assert res is not None
    assert res.status_code == 200
    assert type(res.res.json) == datetime


def test_date_time_bigint_union():
    record_test("unions-datetime-bigint")
    s = SDK()
    assert s is not None

    res = s.unions.union_date_time_big_int(request=datetime.now())
    assert res is not None
    assert res.status_code == 200
    assert type(res.res.json) == datetime

    res = s.unions.union_date_time_big_int(request=9007199254740991)
    assert res is not None
    assert res.status_code == 200
    assert type(res.res.json) == int


def test_bigint_decimal_union():
    record_test("unions-bigint-decimal")
    s = SDK()
    assert s is not None

    res = s.unions.union_big_int_decimal(request=3.141592653589793)
    assert res is not None
    assert res.status_code == 200
    assert type(res.res.json) == Decimal

    res = s.unions.union_big_int_decimal(request=9007199254740991)
    assert res is not None
    assert res.status_code == 200
    assert type(res.res.json) == int