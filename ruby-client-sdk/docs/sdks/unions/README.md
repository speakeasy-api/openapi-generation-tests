# Unions
(*unions*)

## Overview

Endpoints for testing union types.

### Available Operations

* [flattened_typed_object_post](#flattened_typed_object_post)
* [mixed_type_one_of_post](#mixed_type_one_of_post)
* [nullable_one_of_ref_in_object_post](#nullable_one_of_ref_in_object_post)
* [nullable_one_of_schema_post](#nullable_one_of_schema_post)
* [nullable_one_of_type_in_object_post](#nullable_one_of_type_in_object_post)
* [nullable_typed_object_post](#nullable_typed_object_post)
* [primitive_type_one_of_post](#primitive_type_one_of_post)
* [strongly_typed_one_of_post](#strongly_typed_one_of_post)
* [typed_object_nullable_one_of_post](#typed_object_nullable_one_of_post)
* [typed_object_one_of_post](#typed_object_one_of_post)
* [weakly_typed_one_of_post](#weakly_typed_one_of_post)

## flattened_typed_object_post

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=Shared::TypedObject1.new(
    type=Shared::TypedObject1Type::OBJ1,
    value="farad Rustic",
  ),
)
    
res = s.unions.flattened_typed_object_post(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Object](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::FlattenedTypedObjectPostResponse)](../../models/operations/flattenedtypedobjectpostresponse.md)**


## mixed_type_one_of_post

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=618017,
)
    
res = s.unions.mixed_type_one_of_post(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Object](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::MixedTypeOneOfPostResponse)](../../models/operations/mixedtypeoneofpostresponse.md)**


## nullable_one_of_ref_in_object_post

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::NullableOneOfRefInObject.new(
  request=Shared::NullableOneOfRefInObject.new(
    nullable_one_of_one=Shared::TypedObject1.new(
      type=Shared::TypedObject1Type::OBJ1,
      value="Global Alexandria administration",
    ),
    nullable_one_of_two=Shared::TypedObject1.new(
      type=Shared::TypedObject1Type::OBJ1,
      value="nor",
    ),
    one_of_one=Shared::TypedObject1.new(
      type=Shared::TypedObject1Type::OBJ1,
      value="Berkshire after",
    ),
  ),
)
    
res = s.unions.nullable_one_of_ref_in_object_post(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [Shared::NullableOneOfRefInObject](../../models/shared/nullableoneofrefinobject.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |


### Response

**[T.nilable(Operations::NullableOneOfRefInObjectPostResponse)](../../models/operations/nullableoneofrefinobjectpostresponse.md)**


## nullable_one_of_schema_post

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=Shared::TypedObject2.new(
    type=Shared::TypedObject2Type::OBJ2,
    value="sob",
  ),
)
    
res = s.unions.nullable_one_of_schema_post(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Object](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::NullableOneOfSchemaPostResponse)](../../models/operations/nullableoneofschemapostresponse.md)**


## nullable_one_of_type_in_object_post

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::NullableOneOfTypeInObject.new(
  request=Shared::NullableOneOfTypeInObject.new(
    nullable_one_of_one=false,
    nullable_one_of_two=873677,
    one_of_one=false,
  ),
)
    
res = s.unions.nullable_one_of_type_in_object_post(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [Shared::NullableOneOfTypeInObject](../../models/shared/nullableoneoftypeinobject.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |


### Response

**[T.nilable(Operations::NullableOneOfTypeInObjectPostResponse)](../../models/operations/nullableoneoftypeinobjectpostresponse.md)**


## nullable_typed_object_post

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::TypedObject1.new(
  request=Shared::TypedObject1.new(
    type=Shared::TypedObject1Type::OBJ1,
    value="Bike",
  ),
)
    
res = s.unions.nullable_typed_object_post(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [Shared::TypedObject1](../../models/shared/typedobject1.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |


### Response

**[T.nilable(Operations::NullableTypedObjectPostResponse)](../../models/operations/nullabletypedobjectpostresponse.md)**


## primitive_type_one_of_post

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request="Sausages aha",
)
    
res = s.unions.primitive_type_one_of_post(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Object](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::PrimitiveTypeOneOfPostResponse)](../../models/operations/primitivetypeoneofpostresponse.md)**


## strongly_typed_one_of_post

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=Shared::DeepObjectWithType.new(
    any="maroon array libero",
    arr=.new[
      Shared::SimpleObject.new(
        any="oof",
        bigint=701118,
        bigint_str="port dicta",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
        decimal=1943.43,
        enum=Shared::Enum::TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=Shared::SimpleObjectInt32Enum::SIXTY_NINE,
        int_enum=Shared::SimpleObjectIntEnum::SECOND,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_="example",
        str_opt="optional example",
      ),
    ],
    bool=false,
    int=955349,
    map=.new{
      "deserunt": Shared::SimpleObject.new(
        any="Pontiac",
        bigint=825809,
        bigint_str="Music",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
        decimal=2144.81,
        enum=Shared::Enum::TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=Shared::SimpleObjectInt32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
        int_enum=Shared::SimpleObjectIntEnum::SECOND,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_="example",
        str_opt="optional example",
      ),
    },
    num=4004.44,
    obj=Shared::SimpleObject.new(
      any="Representative",
      bigint=296251,
      bigint_str="Southwest excepting",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
      decimal=7507.75,
      enum=Shared::Enum::TWO,
      float32=2.2222222,
      int=999999,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum=Shared::SimpleObjectIntEnum::SECOND,
      int_opt_null=999999,
      num=1.1,
      num_opt_null=1.1,
      str_="example",
      str_opt="optional example",
    ),
    str_="1080p withdrawal",
    type="consequuntur Shoes",
  ),
)
    
res = s.unions.strongly_typed_one_of_post(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Object](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::StronglyTypedOneOfPostResponse)](../../models/operations/stronglytypedoneofpostresponse.md)**


## typed_object_nullable_one_of_post

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=Shared::TypedObject2.new(
    type=Shared::TypedObject2Type::OBJ2,
    value="DRAM",
  ),
)
    
res = s.unions.typed_object_nullable_one_of_post(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Object](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::TypedObjectNullableOneOfPostResponse)](../../models/operations/typedobjectnullableoneofpostresponse.md)**


## typed_object_one_of_post

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=Shared::TypedObject3.new(
    type=Shared::TypedObject3Type::OBJ3,
    value="Buckinghamshire illo Automotive",
  ),
)
    
res = s.unions.typed_object_one_of_post(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Object](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::TypedObjectOneOfPostResponse)](../../models/operations/typedobjectoneofpostresponse.md)**


## weakly_typed_one_of_post

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=Shared::SimpleObject.new(
    any="set",
    bigint=764311,
    bigint_str="likewise transition helplessly",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
    decimal=3805.33,
    enum=Shared::Enum::TWO,
    float32=2.2222222,
    int=999999,
    int32=1,
    int32_enum=Shared::SimpleObjectInt32Enum::SIXTY_NINE,
    int_enum=Shared::SimpleObjectIntEnum::SECOND,
    int_opt_null=999999,
    num=1.1,
    num_opt_null=1.1,
    str_="example",
    str_opt="optional example",
  ),
)
    
res = s.unions.weakly_typed_one_of_post(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Object](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[T.nilable(Operations::WeaklyTypedOneOfPostResponse)](../../models/operations/weaklytypedoneofpostresponse.md)**

