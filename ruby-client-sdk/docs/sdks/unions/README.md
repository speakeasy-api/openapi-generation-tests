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
  request=337477,
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
  request=970494,
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
      any="ullam",
      bigint=96804,
      bigint_str="animi",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=3433.92,
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
        any="possimus",
        bigint=659177,
        bigint_str="ex",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        decimal=3972.57,
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
    int=984632,
    map=.new{
      "ullam": Shared::SimpleObject.new(
        any="in",
        bigint=721407,
        bigint_str="earum",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        decimal=6375.83,
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
    num=2666.97,
    obj=Shared::SimpleObject.new(
      any="voluptatibus",
      bigint=564064,
      bigint_str="officiis",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      decimal=9569.33,
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
    str_="rerum",
    type="tempora",
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
  request=Shared::TypedObject2.new(
    type=Shared::TypedObject2Type::OBJ2,
    value="inventore",
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
    any="cumque",
    bigint=62636,
    bigint_str="perferendis",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
    decimal=2419.01,
    enum=Shared::Enum::TWO,
    float32=2.2222222,
    int=999999,
    int32=1,
    int32_enum=Shared::SimpleObjectInt32Enum::FIFTY_FIVE,
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

