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

   
req = Shared::TypedObject1.new(
  request=Shared::TypedObject1.new(
    type=Shared::TypedObject1Type::OBJ1,
    value="eos",
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
  request="blanditiis",
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
      value="hic",
    ),
    nullable_one_of_two=Shared::TypedObject2.new(
      type=Shared::TypedObject2Type::OBJ2,
      value="asperiores",
    ),
    one_of_one=Shared::TypedObject1.new(
      type=Shared::TypedObject1Type::OBJ1,
      value="autem",
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
  request=Shared::TypedObject1.new(
    type=Shared::TypedObject1Type::OBJ1,
    value="cupiditate",
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
    nullable_one_of_two=591171,
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
    value="beatae",
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
  request="mollitia",
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
    any="quo",
    arr=.new[
      Shared::SimpleObject.new(
        any="fuga",
        bigint=733763,
        bigint_str="commodi",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
        decimal=1467.42,
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
    int=393122,
    map=.new{
      "aliquid": Shared::SimpleObject.new(
        any="provident",
        bigint=385760,
        bigint_str="accusamus",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
        decimal=682.92,
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
    },
    num=535.29,
    obj=Shared::SimpleObject.new(
      any="alias",
      bigint=181622,
      bigint_str="consequuntur",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
      decimal=1122.24,
      enum=Shared::Enum::TWO,
      float32=2.2222222,
      int=999999,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32Enum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum=Shared::SimpleObjectIntEnum::FIRST,
      int_opt_null=999999,
      num=1.1,
      num_opt_null=1.1,
      str_="example",
      str_opt="optional example",
    ),
    str_="amet",
    type="exercitationem",
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
    value="praesentium",
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
  request=Shared::TypedObject2.new(
    type=Shared::TypedObject2Type::OBJ2,
    value="similique",
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
    any="amet",
    arr=.new[
      Shared::SimpleObject.new(
        any="debitis",
        bigint=751381,
        bigint_str="asperiores",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
        decimal=8360.53,
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
    int=845365,
    map=.new{
      "sit": Shared::SimpleObject.new(
        any="quo",
        bigint=329973,
        bigint_str="aliquam",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
        decimal=5911.43,
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
    },
    num=427.63,
    obj=Shared::SimpleObject.new(
      any="ipsum",
      bigint=367,
      bigint_str="doloremque",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00.000Z'),
      decimal=2737.32,
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
    str_="atque",
    type="officia",
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

