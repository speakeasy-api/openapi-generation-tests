
//------------------------------------------------------------------------------
// <auto-generated>
// This code was generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
//
// Changes to this file may cause incorrect behavior and will be lost when
// the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
using System.Net.Http;
using System.Threading.Tasks;
using System.Collections.Generic;
using Xunit;
using Openapi;
using Openapi.Utils;
using NodaTime;
using FluentAssertions;
using System;
using Openapi.Models.Shared;

public class UnionsShould
{
    [Fact]
    public async Task StronglyTypedOneOfPost_Basic()
    {
        CommonHelpers.RecordTest("unions-strongly-typed-one-of-post-basic");
        var s = new Openapi.SDK();

        var obj = new Openapi.Models.Shared.SimpleObjectWithType
        {
            Str = "test",
            Bool = true,
            Int = 1,
            Int32 = 1,
            IntEnum = Openapi.Models.Shared.SimpleObjectWithTypeIntEnum.Two,
            Int32Enum = Openapi.Models.Shared.SimpleObjectWithTypeInt32Enum.FiftyFive,
            Num = 1.1,
            Float32 = 1.1f,
            Enum = Openapi.Models.Shared.Enum.One,
            Any = "any",
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = DateTime.Parse("2020-01-01T00:00:00.0000001Z").ToUniversalTime(),
            BoolOpt = true,
            StrOpt = "testOptional",
            IntOptNull = null,
            NumOptNull = null
        };

        var req = Openapi.Models.Shared.StronglyTypedOneOfObject.CreateSimpleObjectWithType(obj);

        var res = await s.Unions.StronglyTypedOneOfPostAsync(req);
        Assert.Equal(200, res.StatusCode);
        Assert.Equal(Openapi.Models.Shared.StronglyTypedOneOfObjectType.SimpleObjectWithType, res.Res.Json.Type.ToString());
        res.Res.Json.SimpleObjectWithType.Should().BeEquivalentTo(obj);
    }

    [Fact]
    public async Task StronglyTypedOneOfPostWithNonStandardDiscriminatorName()
    {
        CommonHelpers.RecordTest("unions-strongly-typed-one-of-post-with-non-standard-discriminator-name");
        var s = new Openapi.SDK();

        var obj = new Openapi.Models.Shared.SimpleObjectWithNonStandardTypeName
        {
            Str = "test",
            Bool = true,
            Int = 1,
            Int32 = 1,
            IntEnum = Openapi.Models.Shared.SimpleObjectWithNonStandardTypeNameIntEnum.Two,
            Int32Enum = Openapi.Models.Shared.SimpleObjectWithNonStandardTypeNameInt32Enum.FiftyFive,
            Num = 1.1,
            Float32 = 1.1f,
            Enum = Openapi.Models.Shared.Enum.One,
            Any = "any",
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = DateTime.Parse("2020-01-01T00:00:00.0000001Z").ToUniversalTime(),
            BoolOpt = true,
            StrOpt = "testOptional",
            IntOptNull = null,
            NumOptNull = null
        };

        var req = Openapi.Models.Shared.StronglyTypedOneOfObjectWithNonStandardDiscriminatorName.CreateSimpleObjectWithNonStandardTypeName(obj);

        var res = await s.Unions.StronglyTypedOneOfPostWithNonStandardDiscriminatorNameAsync(req);
        Assert.Equal(200, res.StatusCode);
        Assert.Equal(Openapi.Models.Shared.StronglyTypedOneOfObjectWithNonStandardDiscriminatorNameType.SimpleObjectWithNonStandardTypeName, res.Res.Json.Type.ToString());
        res.Res.Json.SimpleObjectWithNonStandardTypeName.Should().BeEquivalentTo(obj);
    }

    [Fact]
    public async Task StronglyTypedOneOfPost_Deep()
    {
        CommonHelpers.RecordTest("unions-strongly-typed-one-of-post-deep");
        var s = new Openapi.SDK();

        var obj = new Openapi.Models.Shared.DeepObjectWithType
        {
            Any = Openapi.Models.Shared.DeepObjectWithTypeAny.CreateSimpleObject(Helpers.CreateSimpleObject()),
            Arr = new List<Openapi.Models.Shared.SimpleObject>
            {
                Helpers.CreateSimpleObject(),
                Helpers.CreateSimpleObject()
            },
            Bool = true,
            Int = 1,
            Map = new Dictionary<string, Openapi.Models.Shared.SimpleObject>
            {
                { "key", Helpers.CreateSimpleObject() }
            },
            Num = 1.1,
            Obj = Helpers.CreateSimpleObject(),
            Str = "test",
            Type = "deepObjectWithType"
        };

        var req = Openapi.Models.Shared.StronglyTypedOneOfObject.CreateDeepObjectWithType(obj);

        var res = await s.Unions.StronglyTypedOneOfPostAsync(req);
        Assert.Equal(200, res.StatusCode);
        Assert.Equal(Openapi.Models.Shared.StronglyTypedOneOfObjectType.DeepObjectWithType, res.Res.Json.Type.ToString());
        res.Res.Json.DeepObjectWithType.Should().BeEquivalentTo(obj);
    }

    [Fact]
    public async Task WeaklyTypedOneOfPost_Basic()
    {
        CommonHelpers.RecordTest("unions-weakly-typed-one-of-post-basic");
        var s = new Openapi.SDK();

        var obj = Helpers.CreateSimpleObject();

        var req = Openapi.Models.Shared.WeaklyTypedOneOfObject.CreateSimpleObject(obj);

        var res = await s.Unions.WeaklyTypedOneOfPostAsync(req);
        Assert.Equal(200, res.StatusCode);
        Assert.Equal(Openapi.Models.Shared.WeaklyTypedOneOfObjectType.SimpleObject, res.Res.Json.Type.ToString());
        res.Res.Json.SimpleObject.Should().BeEquivalentTo(obj);
    }


    [Fact]
    public async Task WeaklyTypedOneOfPost_Deep()
    {
        CommonHelpers.RecordTest("unions-weakly-typed-one-of-post-deep");
        var s = new Openapi.SDK();

        var obj = Helpers.CreateDeepObject();

        var req = Openapi.Models.Shared.WeaklyTypedOneOfObject.CreateDeepObject(obj);

        var res = await s.Unions.WeaklyTypedOneOfPostAsync(req);
        Assert.Equal(200, res.StatusCode);
        Assert.Equal(Openapi.Models.Shared.WeaklyTypedOneOfObjectType.DeepObject, res.Res.Json.Type.ToString());
        res.Res.Json.DeepObject.Should().BeEquivalentTo(obj);
    }


    [Fact]
    public async Task TypedObjectOneOfPost_Obj1()
    {
        CommonHelpers.RecordTest("unions-typed-object-one-of-post-obj1");
        var s = new Openapi.SDK();

        var obj = new Openapi.Models.Shared.TypedObject1
        {
            Type = Openapi.Models.Shared.TypedObject1Type.Obj1
        };

        var req = Openapi.Models.Shared.TypedObjectOneOf.CreateTypedObject1(obj);

        var res = await s.Unions.TypedObjectOneOfPostAsync(req);
        Assert.Equal(200, res.StatusCode);
        Assert.Equal(Openapi.Models.Shared.TypedObjectOneOfType.TypedObject1, res.Res.Json.Type.ToString());
        res.Res.Json.TypedObject1.Should().BeEquivalentTo(obj);
    
    }

    [Fact]
    public async Task TypedObjectOneOfPost_Obj2()
    {
        CommonHelpers.RecordTest("unions-typed-object-one-of-post-obj2");
        var s = new Openapi.SDK();

        var obj = new Openapi.Models.Shared.TypedObject2
        {
            Type = Openapi.Models.Shared.TypedObject2Type.Obj2
        };

        var req = Openapi.Models.Shared.TypedObjectOneOf.CreateTypedObject2(obj);

        var res = await s.Unions.TypedObjectOneOfPostAsync(req);

        Assert.Equal(200, res.StatusCode);
        Assert.Equal(Openapi.Models.Shared.TypedObjectOneOfType.TypedObject2, res.Res.Json.Type.ToString());
        res.Res.Json.TypedObject2.Should().BeEquivalentTo(obj);
    }

    [Fact]
    public async Task TypedObjectOneOfPost_Obj3()
    {
        CommonHelpers.RecordTest("unions-typed-object-one-of-post-obj3");
        var s = new Openapi.SDK();

        var obj = new Openapi.Models.Shared.TypedObject3
        {
            Type = Openapi.Models.Shared.TypedObject3Type.Obj3
        };

        var req = Openapi.Models.Shared.TypedObjectOneOf.CreateTypedObject3(obj);

        var res = await s.Unions.TypedObjectOneOfPostAsync(req);

        Assert.Equal(200, res.StatusCode);
        Assert.Equal(Openapi.Models.Shared.TypedObjectOneOfType.TypedObject3, res.Res.Json.Type.ToString());
        res.Res.Json.TypedObject3.Should().BeEquivalentTo(obj);

    }

    [Fact]
    public void TypedObjectOneOfPost_Null()
    {
        CommonHelpers.RecordTest("unions-typed-object-one-of-post-null");
        /// This is a no-op in C# because the type system prevents creating a null Union type.
        Assert.True(true);
    }

    [Fact]
    public async Task TypedObjectNullableOneOfPost_Obj1()
    {
        CommonHelpers.RecordTest("unions-typed-object-nullable-one-of-post-obj1");
        var s = new Openapi.SDK();

        var obj = new Openapi.Models.Shared.TypedObject1
        {
            Type = Openapi.Models.Shared.TypedObject1Type.Obj1
        };

        var req = Openapi.Models.Shared.TypedObjectNullableOneOf.CreateTypedObject1(obj);

        var res = await s.Unions.TypedObjectNullableOneOfPostAsync(req);
        Assert.Equal(200, res.StatusCode);
        Assert.Equal(Openapi.Models.Shared.TypedObjectOneOfType.TypedObject1, res.Res.Json.Type.ToString());
        res.Res.Json.TypedObject1.Should().BeEquivalentTo(obj);
    }

    [Fact]
    public async Task TypedObjectNullableOneOfPost_Obj2()
    {
        CommonHelpers.RecordTest("unions-typed-object-nullable-one-of-post-obj2");
        var s = new Openapi.SDK();

        var obj = new Openapi.Models.Shared.TypedObject2
        {
            Type = Openapi.Models.Shared.TypedObject2Type.Obj2
        };

        var req = Openapi.Models.Shared.TypedObjectNullableOneOf.CreateTypedObject2(obj);

        var res = await s.Unions.TypedObjectNullableOneOfPostAsync(req);
        Assert.Equal(200, res.StatusCode);
        Assert.Equal(Openapi.Models.Shared.TypedObjectOneOfType.TypedObject2, res.Res.Json.Type.ToString());
        res.Res.Json.TypedObject2.Should().BeEquivalentTo(obj);
    }

    [Fact]
    public async Task TypedObjectNullableOneOfPost_Null()
    {
        CommonHelpers.RecordTest("unions-typed-object-nullable-one-of-post-null");
        var s = new Openapi.SDK();

        var req = Openapi.Models.Shared.TypedObjectNullableOneOf.CreateNull();

        var res = await s.Unions.TypedObjectNullableOneOfPostAsync(req);
        Assert.Equal(200, res.StatusCode);
        Assert.Null(res.Res.Json);
    }

    [Fact]
    public async Task FlattenedTypedObject_Obj1()
    {
        CommonHelpers.RecordTest("unions-flattened-typed-object-post-obj1");
        var s = new Openapi.SDK();

        var obj = FlattenedTypedObject1.CreateTypedObject1(new Openapi.Models.Shared.TypedObject1
        {
            Value = "one",
            Type = Openapi.Models.Shared.TypedObject1Type.Obj1
        });

        var res = await s.Unions.FlattenedTypedObjectPostAsync(obj);
        Assert.Equal(200, res.StatusCode);
        res.Res.Json.Should().BeEquivalentTo(obj);
    }

    [Fact]
    public async Task NullableTypedObjectPost_Obj1()
    {
        CommonHelpers.RecordTest("unions-nullable-typed-object-post-obj1");
        var s = new Openapi.SDK();

        var obj = new Openapi.Models.Shared.TypedObject1
        {
            Value = "one",
            Type = Openapi.Models.Shared.TypedObject1Type.Obj1
        };

        var res = await s.Unions.NullableTypedObjectPostAsync(obj);
        Assert.Equal(200, res.StatusCode);
        res.Res.Json.Should().BeEquivalentTo(obj);
    }

    [Fact]
    public async Task NullableTypedObjectPost_Null()
    {
        CommonHelpers.RecordTest("unions-nullable-typed-object-post-null");
        var s = new Openapi.SDK();

        var res = await s.Unions.NullableTypedObjectPostAsync(null);
        Assert.Equal(200, res.StatusCode);
        Assert.Null(res.Res.Json);
    }

    [Fact]
    public async Task NullableOneOfSchemaPost_Obj1()
    {
        CommonHelpers.RecordTest("unions-nullable-oneof-schema-post-obj1");
        var s = new Openapi.SDK();

        var obj = new Openapi.Models.Shared.TypedObject1
        {
            Value = "one",
            Type = Openapi.Models.Shared.TypedObject1Type.Obj1
        };

        var req = Openapi.Models.Operations.NullableOneOfSchemaPostRequestBody.CreateTypedObject1(obj);

        var res = await s.Unions.NullableOneOfSchemaPostAsync(req);
        Assert.Equal(200, res.StatusCode);
        Assert.Equal(Openapi.Models.Operations.NullableOneOfSchemaPostJsonType.TypedObject1, res.Res.Json.Type.ToString());
        res.Res.Json.TypedObject1.Should().BeEquivalentTo(obj);
    }

    [Fact]
    public async Task NullableOneOfSchemaPost_Obj2()
    {
        CommonHelpers.RecordTest("unions-nullable-oneof-schema-post-obj2");
        var s = new Openapi.SDK();

        var obj = new Openapi.Models.Shared.TypedObject2
        {
            Value = "two",
            Type = Openapi.Models.Shared.TypedObject2Type.Obj2
        };

        var req = Openapi.Models.Operations.NullableOneOfSchemaPostRequestBody.CreateTypedObject2(obj);

        var res = await s.Unions.NullableOneOfSchemaPostAsync(req);
        Assert.Equal(200, res.StatusCode);
        Assert.Equal(Openapi.Models.Operations.NullableOneOfSchemaPostJsonType.TypedObject2, res.Res.Json.Type.ToString());
        res.Res.Json.TypedObject2.Should().BeEquivalentTo(obj);
    }
    [Fact]
    public async Task NullableOneOfSchemaPost_Null()
    {
        CommonHelpers.RecordTest("unions-nullable-oneof-schema-post-null");
        var s = new Openapi.SDK();

        var res = await s.Unions.NullableOneOfSchemaPostAsync(null);
        Assert.Equal(200, res.StatusCode);
        Assert.Null(res.Res.Json);
    }

    [Fact]
    public async Task NullableOneOfTypeInObject()
    {
        CommonHelpers.RecordTest("unions-nullable-oneof-type-in-object-post");

        var tests = new CommonHelpers.TestTableEntry[] {
            new CommonHelpers.TestTableEntry
            {
                name = "Non-nullable field set only",
                arg = new Openapi.Models.Shared.NullableOneOfTypeInObject
                {
                    OneOfOne = true
                },
                want = "{\"NullableOneOfOne\":null,\"NullableOneOfTwo\":null,\"OneOfOne\":true}"
            },
            new CommonHelpers.TestTableEntry
            {
                name = "Nullable fields set to null",
                arg = new Openapi.Models.Shared.NullableOneOfTypeInObject
                {
                    NullableOneOfOne = null,
                    NullableOneOfTwo = null,
                    OneOfOne = true
                },
                want = "{\"NullableOneOfOne\":null,\"NullableOneOfTwo\":null,\"OneOfOne\":true}"
            },
            new CommonHelpers.TestTableEntry
            {
                name = "All fields set to non-null values",
                arg = new Openapi.Models.Shared.NullableOneOfTypeInObject
                {
                    NullableOneOfOne = true,
                    NullableOneOfTwo =NullableOneOfTypeInObjectNullableOneOfTwo.CreateInteger(2),
                    OneOfOne = true
                },
                want = "{\"NullableOneOfOne\":true,\"NullableOneOfTwo\":2,\"OneOfOne\":true}"
            }
        };

        var s = new Openapi.SDK();
        foreach (var test in tests)
        {
            var req = test.arg;
            var serializedBody = RequestBodySerializer.Serialize(req, "Request", "json", false, false);

            var res = await s.Unions.NullableOneOfTypeInObjectPostAsync((Openapi.Models.Shared.NullableOneOfTypeInObject)req);
            Assert.Equal(200, res.StatusCode);
            res.Res.Json.Should().BeEquivalentTo(req);
        }
    }


    [Fact]
    public async Task NullableOneOfRefInObject()
    {
        CommonHelpers.RecordTest("unions-nullable-oneof-ref-in-object-post");

        var tests = new CommonHelpers.TestTableEntry[] {
            new CommonHelpers.TestTableEntry
            {
                name = "Non-nullable field set only",
                arg = new Openapi.Models.Shared.NullableOneOfRefInObject
                {
                    OneOfOne = Openapi.Models.Shared.OneOfOne.CreateTypedObject1(new TypedObject1
                        {
                            Value = "one",
                            Type = Openapi.Models.Shared.TypedObject1Type.Obj1
                        }
                    )
                },
                want = "{\"NullableOneOfOne\":null,\"NullableOneOfTwo\":null,\"OneOfOne\":{\"type\":\"obj1\",\"value\":\"one\"}}"
            },
            new CommonHelpers.TestTableEntry
            {
                name = "Nullable fields set to null",
                arg = new Openapi.Models.Shared.NullableOneOfRefInObject
                {
                    NullableOneOfOne = null,
                    NullableOneOfTwo = null,
                    OneOfOne = Openapi.Models.Shared.OneOfOne.CreateTypedObject1(new TypedObject1
                        {
                            Value = "one",
                            Type = Openapi.Models.Shared.TypedObject1Type.Obj1
                        }
                    )
                },
                want = "{\"NullableOneOfOne\":null,\"NullableOneOfTwo\":null,\"OneOfOne\":{\"type\":\"obj1\",\"value\":\"one\"}}"
            },
            new CommonHelpers.TestTableEntry
            {
                name = "All fields set to non-null values",
                arg = new Openapi.Models.Shared.NullableOneOfRefInObject
                {
                    NullableOneOfOne = new Openapi.Models.Shared.TypedObject1
                    {
                        Value = "one",
                        Type = Openapi.Models.Shared.TypedObject1Type.Obj1
                    },
                    NullableOneOfTwo = Openapi.Models.Shared.NullableOneOfTwo.CreateTypedObject2(new Openapi.Models.Shared.TypedObject2
                        {
                            Value = "two",
                            Type = Openapi.Models.Shared.TypedObject2Type.Obj2
                        }
                    ),
                    OneOfOne = Openapi.Models.Shared.OneOfOne.CreateTypedObject1(new TypedObject1
                        {
                            Value="",
                            Type = Openapi.Models.Shared.TypedObject1Type.Obj1
                        }
                    )
                },
                want = "{\"NullableOneOfOne\":{\"type\":\"obj1\",\"value\":\"one\"},\"NullableOneOfTwo\":{\"type\":\"obj2\",\"value\":\"two\"},\"OneOfOne\":{\"type\":\"obj1\",\"value\":\"\"}}",
            }
        };
        var s = new Openapi.SDK();
        foreach (var test in tests)
        {
            NullableOneOfRefInObject req = (NullableOneOfRefInObject)test.arg;
            var serializedBody = RequestBodySerializer.Serialize(req, "Request", "json", true, false);
            var json = await serializedBody.ReadAsStringAsync();
            Assert.Equal(test.want, json);
            var res = await s.Unions.NullableOneOfRefInObjectPostAsync(req);
            Assert.Equal(200, res.StatusCode);
            res.Res.Json.Should().BeEquivalentTo(req);
        }
    }

    [Fact]
    public async Task PrimitiveTypeOneOfPost_String()
    {
        CommonHelpers.RecordTest("unions-primitive-type-one-of-post-string");
        var s = new Openapi.SDK();

        var req = Openapi.Models.Operations.PrimitiveTypeOneOfPostRequestBody.CreateStr("test");

        var res = await s.Unions.PrimitiveTypeOneOfPostAsync(req);
        
        Assert.Equal(200, res.StatusCode);
        Assert.Equal(Openapi.Models.Operations.PrimitiveTypeOneOfPostJsonType.Str, res.Res.Json.Type.ToString());
        Assert.Equal("test", res.Res.Json.Str);
    }

    [Fact]
    public async Task PrimitiveTypeOneOfPost_Integer()
    {
        CommonHelpers.RecordTest("unions-primitive-type-one-of-post-integer");
        var s = new Openapi.SDK();

        var req = Openapi.Models.Operations.PrimitiveTypeOneOfPostRequestBody.CreateInteger(111);

        var res = await s.Unions.PrimitiveTypeOneOfPostAsync(req);
        Assert.Equal(200, res.StatusCode);
        Assert.Equal(Openapi.Models.Operations.PrimitiveTypeOneOfPostJsonType.Integer, res.Res.Json.Type.ToString());
        Assert.Equal(111, res.Res.Json.Integer);
    }

    [Fact]
    public async Task PrimitiveTypeOneOfPost_Number()
    {
        CommonHelpers.RecordTest("unions-primitive-type-one-of-post-number");
        var s = new Openapi.SDK();

        var req = Openapi.Models.Operations.PrimitiveTypeOneOfPostRequestBody.CreateNumber(22.2);

        var res = await s.Unions.PrimitiveTypeOneOfPostAsync(req);
        Assert.Equal(200, res.StatusCode);
        Assert.Equal(Openapi.Models.Operations.PrimitiveTypeOneOfPostJsonType.Number, res.Res.Json.Type.ToString());
        Assert.Equal(22.2, res.Res.Json.Number);
    }

    [Fact]
    public async Task PrimitiveTypeOneOfPost_Boolean()
    {
        CommonHelpers.RecordTest("unions-primitive-type-one-of-post-boolean");
        var s = new Openapi.SDK();

        var req = Openapi.Models.Operations.PrimitiveTypeOneOfPostRequestBody.CreateBoolean(true);

        var res = await s.Unions.PrimitiveTypeOneOfPostAsync(req);
        Assert.Equal(200, res.StatusCode);
        Assert.Equal(Openapi.Models.Operations.PrimitiveTypeOneOfPostJsonType.Boolean, res.Res.Json.Type.ToString());
        Assert.Equal(true, res.Res.Json.Boolean);
    }

    [Fact]
    public async Task MixedTypeOneOfPost_String()
    {
        CommonHelpers.RecordTest("unions-mixed-type-one-of-post-string");
        var s = new Openapi.SDK();

        var req = Openapi.Models.Operations.MixedTypeOneOfPostRequestBody.CreateStr("test");

        var res = await s.Unions.MixedTypeOneOfPostAsync(req);
        Assert.Equal(200, res.StatusCode);
        Assert.Equal(Openapi.Models.Operations.MixedTypeOneOfPostJsonType.Str, res.Res.Json.Type.ToString());
        Assert.Equal("test", res.Res.Json.Str);
    }

    [Fact]
    public async Task MixedTypeOneOfPost_Integer()
    {
        CommonHelpers.RecordTest("unions-mixed-type-one-of-post-integer");
        var s = new Openapi.SDK();

        var req = Openapi.Models.Operations.MixedTypeOneOfPostRequestBody.CreateInteger(111);

        var res = await s.Unions.MixedTypeOneOfPostAsync(req);
        Assert.Equal(200, res.StatusCode);
        Assert.Equal(Openapi.Models.Operations.MixedTypeOneOfPostJsonType.Integer, res.Res.Json.Type.ToString());
        Assert.Equal(111, res.Res.Json.Integer);
    }

    [Fact]
    public async Task MixedTypeOneOfPost_Object()
    {
        CommonHelpers.RecordTest("unions-mixed-type-one-of-post-object");
        var s = new Openapi.SDK();

        var obj = Helpers.CreateSimpleObject();

        var req = Openapi.Models.Operations.MixedTypeOneOfPostRequestBody.CreateSimpleObject(obj);

        var res = await s.Unions.MixedTypeOneOfPostAsync(req);
        Assert.Equal(200, res.StatusCode);
        Assert.Equal(Openapi.Models.Operations.MixedTypeOneOfPostJsonType.SimpleObject, res.Res.Json.Type.ToString());
        res.Res.Json.SimpleObject.Should().BeEquivalentTo(obj);
    }

    [Fact]
    public async Task DateNullUnion()
    {
        CommonHelpers.RecordTest("unions-date-null");
        var s = new Openapi.SDK();

        var date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01"));

        var res = await s.Unions.UnionDateNullAsync(date);
        Assert.Equal(200, res.StatusCode);
        Assert.Equal(date, res.Res.Json);
    }

    [Fact]
    public async Task DateTimeNullUnion()
    {
        CommonHelpers.RecordTest("unions-datetime-null");
        var s = new Openapi.SDK();

        var dateTime = System.DateTime.Parse("2020-01-01T00:00:00Z").ToUniversalTime();

        var res = await s.Unions.UnionDateTimeNullAsync(dateTime);
        Assert.Equal(200, res.StatusCode);
        Assert.Equal(dateTime, res.Res.Json);
    }

    [Fact]
    public async Task DateTimeBigintUnion()
    {
        CommonHelpers.RecordTest("unions-datetime-bigint");
        var s = new Openapi.SDK();

        var res = await s.Unions.UnionDateTimeBigIntAsync(Openapi.Models.Operations.UnionDateTimeBigIntRequestBody.CreateDateTime(System.DateTime.Parse("2020-01-01T00:00:00Z").ToUniversalTime()));
        Assert.Equal(200, res.StatusCode);
        Assert.Equal(Openapi.Models.Operations.UnionDateTimeBigIntRequestBodyType.DateTime, res.Res.Json.Type.ToString());
        Assert.Equal(System.DateTime.Parse("2020-01-01T00:00:00Z").ToUniversalTime(), res.Res.Json.DateTime);

        var nextRes = await s.Unions.UnionDateTimeBigIntAsync(Openapi.Models.Operations.UnionDateTimeBigIntRequestBody.CreateBigint(9007199254740991));
        Assert.Equal(200, res.StatusCode);
        Assert.Equal(Openapi.Models.Operations.UnionDateTimeBigIntRequestBodyType.Bigint, nextRes.Res.Json.Type);
        Assert.Equal(9007199254740991, nextRes.Res.Json.Bigint);
    }

    [Fact]
    public async Task UnionBigIntDecimal()
    {
        CommonHelpers.RecordTest("unions-bigint-decimal");
        var s = new Openapi.SDK();

        var res = await s.Unions.UnionBigIntDecimalAsync(Openapi.Models.Operations.UnionBigIntDecimalRequestBody.CreateDecimal(3.141592653589793M));
        Assert.Equal(200, res.StatusCode);
        Assert.Equal(Openapi.Models.Operations.UnionBigIntDecimalRequestBodyType.Decimal, res.Res.Json.Type);
        Assert.Equal(3.141592653589793M, res.Res.Json.Decimal);

        var nextRes = await s.Unions.UnionBigIntDecimalAsync(Openapi.Models.Operations.UnionBigIntDecimalRequestBody.CreateBigint(9007199254740991));
        Assert.Equal(200, res.StatusCode);
        Assert.Equal(Openapi.Models.Operations.UnionBigIntDecimalRequestBodyType.Bigint, nextRes.Res.Json.Type);
        Assert.Equal(9007199254740991, nextRes.Res.Json.Bigint);
    
    }
}