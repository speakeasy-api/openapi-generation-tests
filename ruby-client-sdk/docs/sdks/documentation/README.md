# Documentation
(*documentation*)

## Overview

Testing for documentation extensions and tooling.

### Available Operations

* [get_documentation_per_language](#get_documentation_per_language) - Gets documentation for some language, I guess.

## get_documentation_per_language

Gets documentation for some language, I guess.

### Example Usage

```ruby
require 'openapi'


s = ::OpenApiSDK::SDK.new(
      global_header_param: true,
      global_hidden_query_param: "hello",
      global_path_param: 100,
      global_query_param: "some example global query param",
    )
s.config_security(
  ::OpenApiSDK::Shared::Security.new(
    api_key_auth: "Token YOUR_API_KEY",
  )
)

    
res = s.documentation.get_documentation_per_language(language="<value>")

if res.status_code == 200
  # handle response
end

```

### Parameters

| Parameter                                 | Type                                      | Required                                  | Description                               |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| `language`                                | *::String*                                | :heavy_check_mark:                        | The language parameter for this endpoint. |

### Response

**[T.nilable(::OpenApiSDK::Operations::GetDocumentationPerLanguageResponse)](../../models/operations/getdocumentationperlanguageresponse.md)**

