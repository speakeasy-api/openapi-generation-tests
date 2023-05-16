# auth

## Overview

Endpoints for testing authentication.

### Available Operations

* [api_key_auth](#api_key_auth)
* [api_key_auth_global](#api_key_auth_global)
* [basic_auth](#basic_auth)
* [bearer_auth](#bearer_auth)
* [oauth2_auth](#oauth2_auth)
* [open_id_connect_auth](#open_id_connect_auth)

## api_key_auth

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

    
res = s.auth::api_key_auth()

if ! res.token.nil?
    # handle response

```

## api_key_auth_global

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

    
res = s.auth::api_key_auth_global()

if ! res.token.nil?
    # handle response

```

## basic_auth

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::BasicAuthRequest(
  security=Operations::BasicAuthSecurity(
    password="YOUR_PASSWORD",
    username="YOUR_USERNAME",
  ),
  path_params=Operations::BasicAuthRequest(
    passwd="nihil",
    user="magnam",
  ),
)
    
res = s.auth::basic_auth(req)

if ! res.user.nil?
    # handle response

```

## bearer_auth

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

    
res = s.auth::bearer_auth()

if ! res.token.nil?
    # handle response

```

## oauth2_auth

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

    
res = s.auth::oauth2_auth()

if ! res.token.nil?
    # handle response

```

## open_id_connect_auth

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

    
res = s.auth::open_id_connect_auth()

if ! res.token.nil?
    # handle response

```
