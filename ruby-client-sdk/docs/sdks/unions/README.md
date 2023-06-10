# unions

## Overview

Endpoints for testing union types.

### Available Operations

* [mixed_type_one_of_post](#mixed_type_one_of_post)
* [primitive_type_one_of_post](#primitive_type_one_of_post)
* [strongly_typed_one_of_post](#strongly_typed_one_of_post)
* [typed_object_one_of_post](#typed_object_one_of_post)
* [weakly_typed_one_of_post](#weakly_typed_one_of_post)

## mixed_type_one_of_post

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=639187,
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


## primitive_type_one_of_post

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=399161,
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
  request=Shared::SimpleObjectWithType.new(
    any="eum",
    bigint=374753,
    bigint_str="iste",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
    enum=Shared::Enum::TWO,
    float32=2.2222222,
    int=999999,
    int32=1,
    int32_enum=Shared::SimpleObjectWithTypeInt32Enum::SIXTY_NINE,
    int_enum=Shared::SimpleObjectWithTypeIntEnum::FIRST,
    int_opt_null=999999,
    num=1.1,
    num_opt_null=1.1,
    str_="example",
    str_opt="optional example",
    type="error",
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


## typed_object_one_of_post

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = ::.new(
  request=Shared::TypedObject3.new(
    type=Shared::TypedObject3Type::OBJ3,
    value="voluptates",
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
    any="libero",
    arr=.new[
      Shared::SimpleObject.new(
        any="deleniti",
        bigint=316220,
        bigint_str="vitae",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
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
      Shared::SimpleObject.new(
        any="quo",
        bigint=405373,
        bigint_str="ut",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        enum=Shared::Enum::TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=Shared::SimpleObjectInt32Enum::FIFTY_FIVE,
        int_enum=Shared::SimpleObjectIntEnum::THIRD,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_="example",
        str_opt="optional example",
      ),
    ],
    bool=false,
    int=29950,
    map=.new{
      "cum": Shared::SimpleObject.new(
        any="aliquid",
        bigint=109784,
        bigint_str="voluptatum",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        enum=Shared::Enum::TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=Shared::SimpleObjectInt32Enum::SIXTY_NINE,
        int_enum=Shared::SimpleObjectIntEnum::FIRST,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_="example",
        str_opt="optional example",
      ),
      "rerum": Shared::SimpleObject.new(
        any="est",
        bigint=634786,
        bigint_str="voluptatem",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
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
      "architecto": Shared::SimpleObject.new(
        any="fuga",
        bigint=867168,
        bigint_str="debitis",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        enum=Shared::Enum::TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=Shared::SimpleObjectInt32Enum::FIFTY_FIVE,
        int_enum=Shared::SimpleObjectIntEnum::FIRST,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_="example",
        str_opt="optional example",
      ),
    },
    num=5349.17,
    obj=Shared::SimpleObject.new(
      any="earum",
      bigint=404244,
      bigint_str="sapiente",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
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
    str_="nemo",
    type="asperiores",
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

