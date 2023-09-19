# Unions

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

   
req = Shared::TypedObject1.new(
  request=Shared::TypedObject1.new(
    type=Shared::TypedObject1Type::OBJ1,
    value="odio",
  ),
)
    
res = s.unions.flattened_typed_object_post(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [Shared::TypedObject1](../../models/shared/typedobject1.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |


### Response

**[T.nilable(Operations::FlattenedTypedObjectPostResponse)](../../models/operations/flattenedtypedobjectpostresponse.md)**


## mixed_type_one_of_post

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request="esse",
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
      value="ex",
    ),
    nullable_one_of_two=Shared::TypedObject1.new(
      type=Shared::TypedObject1Type::OBJ1,
      value="aliquid",
    ),
    one_of_one=Shared::TypedObject1.new(
      type=Shared::TypedObject1Type::OBJ1,
      value="ipsa",
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
    value="sunt",
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
    nullable_one_of_two=false,
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
    value="fugiat",
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
  request=3996.67,
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
    any=Shared::SimpleObject.new(
      any="aliquid",
      bigint=21973,
      bigint_str="eum",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=3747.53,
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
    arr=.new[
      Shared::SimpleObject.new(
        any="ab",
        bigint=625358,
        bigint_str="possimus",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        decimal=9139.92,
        enum=Shared::Enum::TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=Shared::SimpleObjectInt32Enum::SIXTY_NINE,
        int_enum=Shared::SimpleObjectIntEnum::THIRD,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_="example",
        str_opt="optional example",
      ),
    ],
    bool=false,
    int=726343,
    map=.new{
      "ad": Shared::SimpleObject.new(
        any="deleniti",
        bigint=316220,
        bigint_str="vitae",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        decimal=8333.16,
        enum=Shared::Enum::TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=Shared::SimpleObjectInt32Enum::SIXTY_NINE,
        int_enum=Shared::SimpleObjectIntEnum::THIRD,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_="example",
        str_opt="optional example",
      ),
    },
    num=4053.73,
    obj=Shared::SimpleObject.new(
      any="ut",
      bigint=321043,
      bigint_str="expedita",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=299.5,
      enum=Shared::Enum::TWO,
      float32=2.2222222,
      int=999999,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32Enum::SIXTY_NINE,
      int_enum=Shared::SimpleObjectIntEnum::THIRD,
      int_opt_null=999999,
      num=1.1,
      num_opt_null=1.1,
      str_="example",
      str_opt="optional example",
    ),
    str_="aliquid",
    type="beatae",
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
    value="omnis",
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
  request=Shared::TypedObject1.new(
    type=Shared::TypedObject1Type::OBJ1,
    value="rerum",
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
  request=Shared::DeepObject.new(
    any="voluptatem",
    arr=.new[
      Shared::SimpleObject.new(
        any="sapiente",
        bigint=889288,
        bigint_str="architecto",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        decimal=6821.19,
        enum=Shared::Enum::TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=Shared::SimpleObjectInt32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
        int_enum=Shared::SimpleObjectIntEnum::THIRD,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_="example",
        str_opt="optional example",
      ),
    ],
    bool=false,
    int=29190,
    map=.new{
      "alias": Shared::SimpleObject.new(
        any="deleniti",
        bigint=937219,
        bigint_str="ex",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        decimal=9583.08,
        enum=Shared::Enum::TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=Shared::SimpleObjectInt32Enum::SIXTY_NINE,
        int_enum=Shared::SimpleObjectIntEnum::THIRD,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_="example",
        str_opt="optional example",
      ),
    },
    num=3651,
    obj=Shared::SimpleObject.new(
      any="asperiores",
      bigint=190567,
      bigint_str="ullam",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=191.22,
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
    str_="impedit",
    type="quibusdam",
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

