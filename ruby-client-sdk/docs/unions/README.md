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
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request=639187,
)
    
res = s.unions::mixed_type_one_of_post(req)

if ! res.res.nil?
  # handle response
end

```

## primitive_type_one_of_post

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request=399161,
)
    
res = s.unions::primitive_type_one_of_post(req)

if ! res.res.nil?
  # handle response
end

```

## strongly_typed_one_of_post

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request=Shared::SimpleObjectWithType(
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
    
res = s.unions::strongly_typed_one_of_post(req)

if ! res.res.nil?
  # handle response
end

```

## typed_object_one_of_post

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request=Shared::TypedObject3(
    type=Shared::TypedObject3Type::OBJ3,
    value="voluptates",
  ),
)
    
res = s.unions::typed_object_one_of_post(req)

if ! res.res.nil?
  # handle response
end

```

## weakly_typed_one_of_post

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request=Shared::DeepObject(
    any="libero",
    arr=[
      Shared::SimpleObject(
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
      Shared::SimpleObject(
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
    map={
      "cum": Shared::SimpleObject(
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
      "rerum": Shared::SimpleObject(
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
      "architecto": Shared::SimpleObject(
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
    obj=Shared::SimpleObject(
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
    
res = s.unions::weakly_typed_one_of_post(req)

if ! res.res.nil?
  # handle response
end

```
