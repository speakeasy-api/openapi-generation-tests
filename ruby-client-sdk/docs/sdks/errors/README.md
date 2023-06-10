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
require_relative openapi


s = OpenApiSDK::SDK.new

    
res = s.errors.connection_error_get()

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[T.nilable(Operations::ConnectionErrorGetResponse)](../../models/operations/connectionerrorgetresponse.md)**


## status_get

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::StatusGetRequest.new(
  path_params=Operations::StatusGetRequest.new(
    status_code=50370,
  ),
)
    
res = s.errors.status_get(req)

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `status_code`      | *Integer*          | :heavy_check_mark: | N/A                |


### Response

**[T.nilable(Operations::StatusGetResponse)](../../models/operations/statusgetresponse.md)**


## status_post_retries

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::StatusPostRetriesRequest.new(
  path_params=Operations::StatusPostRetriesRequest.new(
    status_code=577229,
    simple_object=Shared::SimpleObject.new(
      any="rerum",
      bigint=237893,
      bigint_str="asperiores",
      bool=true,
      bool_opt=true,
      date=Date.parse("2020-01-01"),
      date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
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
  ),
  simple_object=Shared::SimpleObject.new(
    any="iste",
    bigint=679091,
    bigint_str="deleniti",
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
)
    
res = s.errors.status_post_retries(req)

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                                                              | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `status_code`                                                          | *Integer*                                                              | :heavy_check_mark:                                                     | N/A                                                                    |
| `simple_object`                                                        | [T.nilable(Shared::SimpleObject)](../../models/shared/simpleobject.md) | :heavy_minus_sign:                                                     | N/A                                                                    |


### Response

**[T.nilable(Operations::StatusPostRetriesResponse)](../../models/operations/statuspostretriesresponse.md)**

