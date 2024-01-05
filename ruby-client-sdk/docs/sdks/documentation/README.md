# Documentation


## Overview

Testing for documentation extensions and tooling.

### Available Operations

* [get_documentation_per_language](#get_documentation_per_language) - Gets documentation for some language, I guess.

## get_documentation_per_language

Gets documentation for some language, I guess.

### Example Usage

```ruby
require_relative openapi


s = OpenApiSDK::SDK.new(
      global_path_param=100,
      global_query_param="some example global query param",
    )
s.config_security(
  security=Shared::Security.new(
    api_key_auth="Token YOUR_API_KEY",
  )
)


req = Operations::GetDocumentationPerLanguageRequest.new(
  language="string",
)
    
res = s.documentation.get_documentation_per_language(language="string")

if res.status == 200
  # handle response
end

```

### Parameters

| Parameter                                 | Type                                      | Required                                  | Description                               |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| `language`                                | *String*                                  | :heavy_check_mark:                        | The language parameter for this endpoint. |


### Response

**[T.nilable(Operations::GetDocumentationPerLanguageResponse)](../../models/operations/getdocumentationperlanguageresponse.md)**

