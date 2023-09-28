# Pagination
(*pagination*)

## Overview

Endpoints for testing the pagination extension

### Available Operations

* [pagination_cursor_body](#pagination_cursor_body)
* [pagination_cursor_params](#pagination_cursor_params)
* [pagination_limit_offset_offset_body](#pagination_limit_offset_offset_body)
* [pagination_limit_offset_offset_params](#pagination_limit_offset_offset_params)
* [pagination_limit_offset_page_body](#pagination_limit_offset_page_body)
* [pagination_limit_offset_page_params](#pagination_limit_offset_page_params)

## pagination_cursor_body

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::PaginationCursorBodyRequestBody.new(
  request=Operations::PaginationCursorBodyRequestBody.new(
    cursor=459875,
  ),
)
    
res = s.pagination.pagination_cursor_body(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [Operations::PaginationCursorBodyRequestBody](../../models/operations/paginationcursorbodyrequestbody.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |
| `server_url`                                                                                              | *String*                                                                                                  | :heavy_minus_sign:                                                                                        | An optional server URL to use.                                                                            |


### Response

**[T.nilable(Operations::PaginationCursorBodyResponse)](../../models/operations/paginationcursorbodyresponse.md)**


## pagination_cursor_params

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::PaginationCursorParamsRequest.new(
  query_params=Operations::PaginationCursorParamsRequest.new(
    cursor=500021,
  ),
)
    
res = s.pagination.pagination_cursor_params(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `cursor`                       | *Integer*                      | :heavy_check_mark:             | N/A                            |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[T.nilable(Operations::PaginationCursorParamsResponse)](../../models/operations/paginationcursorparamsresponse.md)**


## pagination_limit_offset_offset_body

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::LimitOffsetConfig.new(
  request=Shared::LimitOffsetConfig.new(
    limit=573610,
    offset=996541,
    page=955047,
  ),
)
    
res = s.pagination.pagination_limit_offset_offset_body(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [Shared::LimitOffsetConfig](../../models/shared/limitoffsetconfig.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |
| `server_url`                                                          | *String*                                                              | :heavy_minus_sign:                                                    | An optional server URL to use.                                        |


### Response

**[T.nilable(Operations::PaginationLimitOffsetOffsetBodyResponse)](../../models/operations/paginationlimitoffsetoffsetbodyresponse.md)**


## pagination_limit_offset_offset_params

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::PaginationLimitOffsetOffsetParamsRequest.new(
  query_params=Operations::PaginationLimitOffsetOffsetParamsRequest.new(
    limit=658604,
    offset=979287,
  ),
)
    
res = s.pagination.pagination_limit_offset_offset_params(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `limit`                        | *T.nilable(Integer)*           | :heavy_minus_sign:             | N/A                            |
| `offset`                       | *T.nilable(Integer)*           | :heavy_minus_sign:             | N/A                            |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[T.nilable(Operations::PaginationLimitOffsetOffsetParamsResponse)](../../models/operations/paginationlimitoffsetoffsetparamsresponse.md)**


## pagination_limit_offset_page_body

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Shared::LimitOffsetConfig.new(
  request=Shared::LimitOffsetConfig.new(
    limit=930429,
    offset=861591,
    page=643419,
  ),
)
    
res = s.pagination.pagination_limit_offset_page_body(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [Shared::LimitOffsetConfig](../../models/shared/limitoffsetconfig.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |
| `server_url`                                                          | *String*                                                              | :heavy_minus_sign:                                                    | An optional server URL to use.                                        |


### Response

**[T.nilable(Operations::PaginationLimitOffsetPageBodyResponse)](../../models/operations/paginationlimitoffsetpagebodyresponse.md)**


## pagination_limit_offset_page_params

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new

   
req = Operations::PaginationLimitOffsetPageParamsRequest.new(
  query_params=Operations::PaginationLimitOffsetPageParamsRequest.new(
    page=359097,
  ),
)
    
res = s.pagination.pagination_limit_offset_page_params(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `page`                         | *Integer*                      | :heavy_check_mark:             | N/A                            |
| `server_url`                   | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[T.nilable(Operations::PaginationLimitOffsetPageParamsResponse)](../../models/operations/paginationlimitoffsetpageparamsresponse.md)**

