# auth_new

## Overview

Endpoints for testing authentication.

### Available Operations

* [api_key_auth_global_new](#api_key_auth_global_new)
* [basic_auth_new](#basic_auth_new)
* [multiple_mixed_options_auth](#multiple_mixed_options_auth)
* [multiple_mixed_scheme_auth](#multiple_mixed_scheme_auth)
* [multiple_options_with_mixed_schemes_auth](#multiple_options_with_mixed_schemes_auth)
* [multiple_options_with_simple_schemes_auth](#multiple_options_with_simple_schemes_auth)
* [multiple_simple_options_auth](#multiple_simple_options_auth)
* [multiple_simple_scheme_auth](#multiple_simple_scheme_auth)
* [oauth2_auth_new](#oauth2_auth_new)
* [open_id_connect_auth_new](#open_id_connect_auth_new)

## api_key_auth_global_new

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Shared::AuthServiceRequestBody(
  request=Shared::AuthServiceRequestBody(
    basic_auth=Shared::AuthServiceRequestBodyBasicAuth(
      password="distinctio",
      username="Maggie38",
    ),
    header_auth=[
      Shared::AuthServiceRequestBodyHeaderAuth(
        expected_value="nobis",
        header_name="eum",
      ),
      Shared::AuthServiceRequestBodyHeaderAuth(
        expected_value="vero",
        header_name="aspernatur",
      ),
      Shared::AuthServiceRequestBodyHeaderAuth(
        expected_value="architecto",
        header_name="magnam",
      ),
    ],
  ),
)
    
res = s.auth_new::api_key_auth_global_new(req)

if res.status == 200:
    # handle response

```

## basic_auth_new

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Shared::AuthServiceRequestBody(
  security=Operations::BasicAuthNewSecurity(
    password="YOUR_PASSWORD",
    username="YOUR_USERNAME",
  ),
  request=Shared::AuthServiceRequestBody(
    basic_auth=Shared::AuthServiceRequestBodyBasicAuth(
      password="et",
      username="Kevon_Hermann",
    ),
    header_auth=[
      Shared::AuthServiceRequestBodyHeaderAuth(
        expected_value="accusantium",
        header_name="mollitia",
      ),
      Shared::AuthServiceRequestBodyHeaderAuth(
        expected_value="reiciendis",
        header_name="mollitia",
      ),
      Shared::AuthServiceRequestBodyHeaderAuth(
        expected_value="ad",
        header_name="eum",
      ),
    ],
  ),
)
    
res = s.auth_new::basic_auth_new(req)

if res.status == 200:
    # handle response

```

## multiple_mixed_options_auth

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Shared::AuthServiceRequestBody(
  security=Operations::MultipleMixedOptionsAuthSecurity(
    api_key_auth_new="Token <YOUR_API_KEY>",
  ),
  request=Shared::AuthServiceRequestBody(
    basic_auth=Shared::AuthServiceRequestBodyBasicAuth(
      password="dolor",
      username="Sophie.Connelly",
    ),
    header_auth=[
      Shared::AuthServiceRequestBodyHeaderAuth(
        expected_value="doloribus",
        header_name="debitis",
      ),
      Shared::AuthServiceRequestBodyHeaderAuth(
        expected_value="eius",
        header_name="maxime",
      ),
    ],
  ),
)
    
res = s.auth_new::multiple_mixed_options_auth(req)

if res.status == 200:
    # handle response

```

## multiple_mixed_scheme_auth

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Shared::AuthServiceRequestBody(
  security=Operations::MultipleMixedSchemeAuthSecurity(
    api_key_auth_new="Token <YOUR_API_KEY>",
    basic_auth=Shared::SchemeBasicAuth(
      password="YOUR_PASSWORD",
      username="YOUR_USERNAME",
    ),
  ),
  request=Shared::AuthServiceRequestBody(
    basic_auth=Shared::AuthServiceRequestBodyBasicAuth(
      password="deleniti",
      username="Mckenna9",
    ),
    header_auth=[
      Shared::AuthServiceRequestBodyHeaderAuth(
        expected_value="ullam",
        header_name="expedita",
      ),
      Shared::AuthServiceRequestBodyHeaderAuth(
        expected_value="nihil",
        header_name="repellat",
      ),
      Shared::AuthServiceRequestBodyHeaderAuth(
        expected_value="quibusdam",
        header_name="sed",
      ),
      Shared::AuthServiceRequestBodyHeaderAuth(
        expected_value="saepe",
        header_name="pariatur",
      ),
    ],
  ),
)
    
res = s.auth_new::multiple_mixed_scheme_auth(req)

if res.status == 200:
    # handle response

```

## multiple_options_with_mixed_schemes_auth

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Shared::AuthServiceRequestBody(
  security=Operations::MultipleOptionsWithMixedSchemesAuthSecurity(
    option1=Operations::MultipleOptionsWithMixedSchemesAuthSecurityOption1(
      api_key_auth_new="Token <YOUR_API_KEY>",
      oauth2="Bearer YOUR_OAUTH2_TOKEN",
    ),
  ),
  request=Shared::AuthServiceRequestBody(
    basic_auth=Shared::AuthServiceRequestBodyBasicAuth(
      password="accusantium",
      username="Carroll.Lang",
    ),
    header_auth=[
      Shared::AuthServiceRequestBodyHeaderAuth(
        expected_value="quo",
        header_name="illum",
      ),
    ],
  ),
)
    
res = s.auth_new::multiple_options_with_mixed_schemes_auth(req)

if res.status == 200:
    # handle response

```

## multiple_options_with_simple_schemes_auth

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Shared::AuthServiceRequestBody(
  security=Operations::MultipleOptionsWithSimpleSchemesAuthSecurity(
    option1=Operations::MultipleOptionsWithSimpleSchemesAuthSecurityOption1(
      api_key_auth_new="Token <YOUR_API_KEY>",
      oauth2="Bearer YOUR_OAUTH2_TOKEN",
    ),
  ),
  request=Shared::AuthServiceRequestBody(
    basic_auth=Shared::AuthServiceRequestBodyBasicAuth(
      password="pariatur",
      username="Raegan.Jenkins",
    ),
    header_auth=[
      Shared::AuthServiceRequestBodyHeaderAuth(
        expected_value="accusantium",
        header_name="ab",
      ),
      Shared::AuthServiceRequestBodyHeaderAuth(
        expected_value="maiores",
        header_name="quidem",
      ),
    ],
  ),
)
    
res = s.auth_new::multiple_options_with_simple_schemes_auth(req)

if res.status == 200:
    # handle response

```

## multiple_simple_options_auth

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Shared::AuthServiceRequestBody(
  security=Operations::MultipleSimpleOptionsAuthSecurity(
    api_key_auth_new="Token <YOUR_API_KEY>",
  ),
  request=Shared::AuthServiceRequestBody(
    basic_auth=Shared::AuthServiceRequestBodyBasicAuth(
      password="ipsam",
      username="Jacey.Johnston86",
    ),
    header_auth=[
      Shared::AuthServiceRequestBodyHeaderAuth(
        expected_value="voluptatibus",
        header_name="perferendis",
      ),
      Shared::AuthServiceRequestBodyHeaderAuth(
        expected_value="fugiat",
        header_name="amet",
      ),
    ],
  ),
)
    
res = s.auth_new::multiple_simple_options_auth(req)

if res.status == 200:
    # handle response

```

## multiple_simple_scheme_auth

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Shared::AuthServiceRequestBody(
  security=Operations::MultipleSimpleSchemeAuthSecurity(
    api_key_auth_new="Token <YOUR_API_KEY>",
    oauth2="Bearer YOUR_OAUTH2_TOKEN",
  ),
  request=Shared::AuthServiceRequestBody(
    basic_auth=Shared::AuthServiceRequestBodyBasicAuth(
      password="aut",
      username="Norwood_Hessel74",
    ),
    header_auth=[
      Shared::AuthServiceRequestBodyHeaderAuth(
        expected_value="quis",
        header_name="totam",
      ),
    ],
  ),
)
    
res = s.auth_new::multiple_simple_scheme_auth(req)

if res.status == 200:
    # handle response

```

## oauth2_auth_new

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Shared::AuthServiceRequestBody(
  security=Operations::Oauth2AuthNewSecurity(
    oauth2="Bearer YOUR_OAUTH2_TOKEN",
  ),
  request=Shared::AuthServiceRequestBody(
    basic_auth=Shared::AuthServiceRequestBodyBasicAuth(
      password="dignissimos",
      username="Amos17",
    ),
    header_auth=[
      Shared::AuthServiceRequestBodyHeaderAuth(
        expected_value="dolores",
        header_name="minus",
      ),
    ],
  ),
)
    
res = s.auth_new::oauth2_auth_new(req)

if res.status == 200:
    # handle response

```

## open_id_connect_auth_new

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Shared::AuthServiceRequestBody(
  security=Operations::OpenIdConnectAuthNewSecurity(
    open_id_connect="Bearer YOUR_OPENID_TOKEN",
  ),
  request=Shared::AuthServiceRequestBody(
    basic_auth=Shared::AuthServiceRequestBodyBasicAuth(
      password="quam",
      username="Damon_Swift",
    ),
    header_auth=[
      Shared::AuthServiceRequestBodyHeaderAuth(
        expected_value="omnis",
        header_name="facilis",
      ),
      Shared::AuthServiceRequestBodyHeaderAuth(
        expected_value="perspiciatis",
        header_name="voluptatem",
      ),
      Shared::AuthServiceRequestBodyHeaderAuth(
        expected_value="porro",
        header_name="consequuntur",
      ),
      Shared::AuthServiceRequestBodyHeaderAuth(
        expected_value="blanditiis",
        header_name="error",
      ),
    ],
  ),
)
    
res = s.auth_new::open_id_connect_auth_new(req)

if res.status == 200:
    # handle response

```
