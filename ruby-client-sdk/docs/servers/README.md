# servers

## Overview

Endpoints for testing servers.

### Available Operations

* [select_global_server](#select_global_server)
* [select_server_with_id](#select_server_with_id) - Select a server by ID.
* [server_with_templates](#server_with_templates)
* [server_with_templates_global](#server_with_templates_global)
* [servers_by_id_with_templates](#servers_by_id_with_templates)

## select_global_server

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

    
res = s.servers::select_global_server()

if res.status == 200
  # handle response
end

```

## select_server_with_id

Select a server by ID.

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

    
res = s.servers::select_server_with_id()

if res.status == 200
  # handle response
end

```

## server_with_templates

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

    
res = s.servers::server_with_templates()

if res.status == 200
  # handle response
end

```

## server_with_templates_global

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

    
res = s.servers::server_with_templates_global()

if res.status == 200
  # handle response
end

```

## servers_by_id_with_templates

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

    
res = s.servers::servers_by_id_with_templates()

if res.status == 200
  # handle response
end

```
