# SDK

## Overview

Some test description.
About our test document.

Speakeasy Docs
<https://speakeasyapi.dev/docs/home>
### Available Operations

* [put_anything_ignored_generation](#put_anything_ignored_generation)
* [response_body_json_get](#response_body_json_get)

## put_anything_ignored_generation

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::::(
  request="perferendis",
)
    
res = s.sdk::put_anything_ignored_generation(req)

if ! res.put_anything_ignored_generation_200_application_json_object.nil?
    # handle response

```

## response_body_json_get

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

    
res = s.sdk::response_body_json_get()

if ! res.http_bin_simple_json_object.nil?
    # handle response

```
