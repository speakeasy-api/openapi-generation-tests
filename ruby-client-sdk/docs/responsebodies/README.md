# response_bodies

## Overview

Endpoints for testing response bodies.

### Available Operations

* [response_body_bytes_get](#response_body_bytes_get)
* [response_body_string_get](#response_body_string_get)
* [response_body_xml_get](#response_body_xml_get)

## response_body_bytes_get

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

    
res = s.response_bodies::response_body_bytes_get()

if ! res.bytes.nil?
  # handle response
end

```

## response_body_string_get

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

    
res = s.response_bodies::response_body_string_get()

if ! res.html.nil?
  # handle response
end

```

## response_body_xml_get

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

    
res = s.response_bodies::response_body_xml_get()

if ! res.xml.nil?
  # handle response
end

```
