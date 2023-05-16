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
  request="aliquid",
)
    
res = s.unions::mixed_type_one_of_post(req)

if ! res.res.nil?
    # handle response

```

## primitive_type_one_of_post

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request="laborum",
)
    
res = s.unions::primitive_type_one_of_post(req)

if ! res.res.nil?
    # handle response

```

## strongly_typed_one_of_post

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request=Shared::SimpleObjectWithType(
    any="nostrum",
    bigint=856756,
    bigint_str="expedita",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
    enum=Shared::EnumEnum::TWO,
    float32=2.2222222,
    int=999999,
    int32=1,
    int32_enum=Shared::SimpleObjectWithTypeInt32EnumEnum::SIXTY_NINE,
    int_enum=Shared::SimpleObjectWithTypeIntEnumEnum::SECOND,
    int_opt_null=999999,
    num=1.1,
    num_opt_null=1.1,
    str_="example",
    str_opt="optional example",
    type="suscipit",
  ),
)
    
res = s.unions::strongly_typed_one_of_post(req)

if ! res.res.nil?
    # handle response

```

## typed_object_one_of_post

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request=Shared::TypedObject2(
    type=Shared::TypedObject2TypeEnum::OBJ2,
    value="perferendis",
  ),
)
    
res = s.unions::typed_object_one_of_post(req)

if ! res.res.nil?
    # handle response

```

## weakly_typed_one_of_post

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request=Shared::SimpleObject(
    any="voluptas",
    bigint=614528,
    bigint_str="id",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
    enum=Shared::EnumEnum::TWO,
    float32=2.2222222,
    int=999999,
    int32=1,
    int32_enum=Shared::SimpleObjectInt32EnumEnum::FIFTY_FIVE,
    int_enum=Shared::SimpleObjectIntEnumEnum::SECOND,
    int_opt_null=999999,
    num=1.1,
    num_opt_null=1.1,
    str_="example",
    str_opt="optional example",
  ),
)
    
res = s.unions::weakly_typed_one_of_post(req)

if ! res.res.nil?
    # handle response

```
