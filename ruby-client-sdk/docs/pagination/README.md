# pagination

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
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::PaginationCursorBodyRequestBody(
  request=Operations::PaginationCursorBodyRequestBody(
    cursor=259422,
  ),
)
    
res = s.pagination::pagination_cursor_body(req)

if ! res.res.nil?
  # handle response
end

```

## pagination_cursor_params

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::PaginationCursorParamsRequest(
  query_params=Operations::PaginationCursorParamsRequest(
    cursor=178367,
  ),
)
    
res = s.pagination::pagination_cursor_params(req)

if ! res.res.nil?
  # handle response
end

```

## pagination_limit_offset_offset_body

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Shared::LimitOffsetConfig(
  request=Shared::LimitOffsetConfig(
    limit=373813,
    offset=69859,
    page=587600,
  ),
)
    
res = s.pagination::pagination_limit_offset_offset_body(req)

if ! res.res.nil?
  # handle response
end

```

## pagination_limit_offset_offset_params

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::PaginationLimitOffsetOffsetParamsRequest(
  query_params=Operations::PaginationLimitOffsetOffsetParamsRequest(
    limit=9688,
    offset=272822,
  ),
)
    
res = s.pagination::pagination_limit_offset_offset_params(req)

if ! res.res.nil?
  # handle response
end

```

## pagination_limit_offset_page_body

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Shared::LimitOffsetConfig(
  request=Shared::LimitOffsetConfig(
    limit=892050,
    offset=370853,
    page=133465,
  ),
)
    
res = s.pagination::pagination_limit_offset_page_body(req)

if ! res.res.nil?
  # handle response
end

```

## pagination_limit_offset_page_params

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::PaginationLimitOffsetPageParamsRequest(
  query_params=Operations::PaginationLimitOffsetPageParamsRequest(
    page=197054,
  ),
)
    
res = s.pagination::pagination_limit_offset_page_params(req)

if ! res.res.nil?
  # handle response
end

```
