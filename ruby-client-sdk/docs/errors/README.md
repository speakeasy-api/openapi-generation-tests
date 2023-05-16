# errors

## Overview

Endpoints for testing error responses.

### Available Operations

* [connection_error_get](#connection_error_get)
* [status_get](#status_get)
* [status_post_retries](#status_post_retries)

## connection_error_get

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

    
res = s.errors::connection_error_get()

if res.status == 200:
    # handle response

```

## status_get

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::StatusGetRequest(
  path_params=Operations::StatusGetRequest(
    status_code=50370,
  ),
)
    
res = s.errors::status_get(req)

if res.status == 200:
    # handle response

```

## status_post_retries

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::StatusPostRetriesRequest(
  path_params=Operations::StatusPostRetriesRequest(
    simple_object=Shared::SimpleObject(
      any="occaecati",
      bigint=699098,
      bigint_str="adipisci",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
      enum=Shared::EnumEnum::TWO,
      float32=2.2222222,
      int=999999,
      int32=1,
      int32_enum=Shared::SimpleObjectInt32EnumEnum::ONE_HUNDRED_AND_EIGHTY_ONE,
      int_enum=Shared::SimpleObjectIntEnumEnum::THIRD,
      int_opt_null=999999,
      num=1.1,
      num_opt_null=1.1,
      str_="example",
      str_opt="optional example",
    ),
    status_code=267262,
  ),
  simple_object=Shared::SimpleObject(
    any="iste",
    bigint=679091,
    bigint_str="deleniti",
    bool=true,
    bool_opt=true,
    date=Date.parse("2020-01-01"),
    date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
    enum=Shared::EnumEnum::TWO,
    float32=2.2222222,
    int=999999,
    int32=1,
    int32_enum=Shared::SimpleObjectInt32EnumEnum::ONE_HUNDRED_AND_EIGHTY_ONE,
    int_enum=Shared::SimpleObjectIntEnumEnum::SECOND,
    int_opt_null=999999,
    num=1.1,
    num_opt_null=1.1,
    str_="example",
    str_opt="optional example",
  ),
)
    
res = s.errors::status_post_retries(req)

if res.status == 200:
    # handle response

```
