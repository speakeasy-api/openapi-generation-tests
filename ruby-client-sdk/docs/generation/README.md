# generation

## Overview

Endpoints for purely testing valid generation behavior.

### Available Operations

* [anchor_types_get](#anchor_types_get)
* [circular_reference_get](#circular_reference_get)
* [~~deprecated_no_comments_get~~](#deprecated_no_comments_get) - :warning: **Deprecated**
* [~~deprecated_with_comments_get~~](#deprecated_with_comments_get) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated**
* [global_name_overridden](#global_name_overridden)
* [ignored_generation_get](#ignored_generation_get)
* [ignores_post](#ignores_post)
* [name_override](#name_override)
* [usage_example_post](#usage_example_post) - An operation used for testing usage examples

## anchor_types_get

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

    
res = s.generation::anchor_types_get()

if ! res.type_from_anchor.nil?
    # handle response

```

## circular_reference_get

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

    
res = s.generation::circular_reference_get()

if ! res.valid_circular_reference_object.nil?
    # handle response

```

## ~~deprecated_no_comments_get~~

> :warning: **DEPRECATED**: this method will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::DeprecatedNoCommentsGetRequest(
  query_params=Operations::DeprecatedNoCommentsGetRequest(
    deprecated_parameter="atque",
  ),
)
    
res = s.generation::deprecated_no_comments_get(req)

if res.status == 200:
    # handle response

```

## ~~deprecated_with_comments_get~~

This is an endpoint setup to test deprecation with comments

> :warning: **DEPRECATED**: this method will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::DeprecatedWithCommentsGetRequest(
  query_params=Operations::DeprecatedWithCommentsGetRequest(
    deprecated_parameter="sit",
  ),
)
    
res = s.generation::deprecated_with_comments_get(req)

if res.status == 200:
    # handle response

```

## global_name_overridden

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

    
res = s.generation::global_name_overridden()

if ! res.get_global_name_override_200_application_json_object.nil?
    # handle response

```

## ignored_generation_get

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

    
res = s.generation::ignored_generation_get()

if ! res.ignored_generation_get_200_application_json_object.nil?
    # handle response

```

## ignores_post

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::IgnoresPostRequest(
  query_params=Operations::IgnoresPostRequest(
    request_body=Operations::IgnoresPostApplicationJSON(
      callback_url="https://best-respite.net",
      test_prop="iusto",
    ),
    test_param="voluptate",
  ),
  request_body=Operations::IgnoresPostApplicationJSON(
    callback_url="https://miserable-octave.org",
    test_prop="distinctio",
  ),
)
    
res = s.generation::ignores_post(req)

if ! res.http_bin_simple_json_object.nil?
    # handle response

```

## name_override

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::NameOverrideGetRequest(
  query_params=Operations::NameOverrideGetRequest(
    test_query_param="example",
  ),
)
    
res = s.generation::name_override(req)

if ! res.overriden_response.nil?
    # handle response

```

## usage_example_post

An operation used for testing usage examples that includes a large array of parameters and input types to ensure that all are handled correctly

Usage example docs
<https://docs.example.com>

### Example Usage

```ruby
require_relative sdk


s = sdk::SDK.new

   
req = Operations::Operations::UsageExamplePostRequest(
  security=Operations::UsageExamplePostSecurity(
    password="YOUR_PASSWORD",
    username="YOUR_USERNAME",
  ),
  query_params=Operations::UsageExamplePostRequest(
    request_body=Operations::UsageExamplePostRequestBody(
      email="Janessa_Emmerich@hotmail.com",
      format_email="Diamond22@hotmail.com",
      format_uri="https://uncomfortable-evocation.org",
      format_uuid="6a95d8a0-d446-4ce2-af7a-73cf3be453f8",
      hostname="knowing-amenity.net",
      ipv4="53.39.108.186",
      ipv6="5a73:429c:db1a:8422:bb67:9d23:2271:5bf0",
      simple_object=Shared::SimpleObject(
        any="cumque",
        bigint=746994,
        bigint_str="nobis",
        bool=true,
        bool_opt=true,
        date=Date.parse("2020-01-01"),
        date_time=DateTime.iso8601('2020-01-01T00:00:00Z'),
        enum=Shared::Enum::TWO,
        float32=2.2222222,
        int=999999,
        int32=1,
        int32_enum=Shared::SimpleObjectInt32Enum::FIFTY_FIVE,
        int_enum=Shared::SimpleObjectIntEnum::THIRD,
        int_opt_null=999999,
        num=1.1,
        num_opt_null=1.1,
        str_="example",
        str_opt="optional example",
      ),
      unknown="ipsum",
      uri="http://shrill-medium.net",
      uuid="90f3443a-1108-4e0a-9cf4-b921879fce95",
    ),
    bool_parameter=false,
    date_parameter=Date.parse("2020-01-01"),
    date_time_parameter=DateTime.iso8601('2020-01-01T00:00:00Z'),
    double_parameter=2.2222222,
    enum_parameter=Operations::UsageExamplePostEnumParameter::VALUE3,
    float_parameter=1.1,
    int64_parameter=111111,
    int_parameter=1,
    opt_enum_parameter=Operations::UsageExamplePostOptEnumParameter::VALUE3,
    str_parameter="example",
  ),
  request_body=Operations::UsageExamplePostRequestBody(
    email="Vida87@gmail.com",
    format_email="Jeramie_Weissnat48@hotmail.com",
    format_uri="https://rubbery-surname.info",
    format_uuid="4dd39c0f-5d2c-4ff7-870a-45626d436813",
    hostname="wordy-bother.info",
    ipv4="220.145.249.87",
    ipv6="fce6:c556:146c:3e25:0fb0:08c4:2e14:1aac",
    simple_object=Shared::SimpleObject(
      any="velit",
      bigint=432148,
      bigint_str="autem",
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
    unknown="assumenda",
    uri="https://heavenly-receipt.com",
    uuid="44290747-4778-4a7b-9466-d28c10ab3cdc",
  ),
)
    
res = s.generation::usage_example_post(req)

if ! res.usage_example_post_200_application_json_object.nil?
    # handle response

```
