# Unions
(*unions*)

## Overview

Endpoints for testing union types.

### Available Operations

* [array_of_discriminated_unions](#array_of_discriminated_unions)
* [array_of_discriminated_unions_map](#array_of_discriminated_unions_map)
* [collection_one_of_post](#collection_one_of_post)
* [const_discriminated_one_of](#const_discriminated_one_of)
* [discriminated_one_multiple_memberships](#discriminated_one_multiple_memberships)
* [discriminated_one_multiple_memberships_has_wheels](#discriminated_one_multiple_memberships_has_wheels)
* [flattened_typed_object_post](#flattened_typed_object_post)
* [infected_with_any](#infected_with_any)
* [mixed_type_one_of_post](#mixed_type_one_of_post)
* [mixed_union_types](#mixed_union_types)
* [multi_match_any_of](#multi_match_any_of)
* [nested_array_of_discriminated_unions](#nested_array_of_discriminated_unions)
* [nullable_one_of_ref_in_object_post](#nullable_one_of_ref_in_object_post)
* [nullable_one_of_schema_post](#nullable_one_of_schema_post)
* [nullable_one_of_type_in_object_post](#nullable_one_of_type_in_object_post)
* [nullable_typed_object_post](#nullable_typed_object_post)
* [one_of_overlapping_objects](#one_of_overlapping_objects)
* [primitive_type_one_of_post](#primitive_type_one_of_post)
* [strongly_typed_one_of_discriminated_post](#strongly_typed_one_of_discriminated_post)
* [strongly_typed_one_of_post](#strongly_typed_one_of_post)
* [strongly_typed_one_of_post_with_non_standard_discriminator_name](#strongly_typed_one_of_post_with_non_standard_discriminator_name)
* [typed_object_nullable_one_of_post](#typed_object_nullable_one_of_post)
* [typed_object_one_of_post](#typed_object_one_of_post)
* [union_big_int_str_decimal](#union_big_int_str_decimal)
* [union_date_null](#union_date_null)
* [union_date_time_big_int](#union_date_time_big_int)
* [union_date_time_null](#union_date_time_null)
* [union_map](#union_map)
* [union_map_optional](#union_map_optional)
* [union_nested_enums_form](#union_nested_enums_form)
* [union_nested_enums_multipart](#union_nested_enums_multipart)
* [union_of_arrays_post](#union_of_arrays_post)
* [weakly_typed_one_of_null_enum_post](#weakly_typed_one_of_null_enum_post)
* [weakly_typed_one_of_post](#weakly_typed_one_of_post)

## array_of_discriminated_unions

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


req = [
  "<value>",
]
    
res = s.unions.array_of_discriminated_unions(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [T::Array[::Object]](../../models//.md)    | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[T.nilable(::OpenApiSDK::Operations::ArrayOfDiscriminatedUnionsResponse)](../../models/operations/arrayofdiscriminatedunionsresponse.md)**



## array_of_discriminated_unions_map

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


req = ::OpenApiSDK::Shared::ArrayOfDiscriminatedUnionsMap.new(
  array_map: {
    "key": [
      "<value>",
    ],
  },
)
    
res = s.unions.array_of_discriminated_unions_map(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [::OpenApiSDK::Shared::ArrayOfDiscriminatedUnionsMap](../../models/shared/arrayofdiscriminatedunionsmap.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[T.nilable(::OpenApiSDK::Operations::ArrayOfDiscriminatedUnionsMapResponse)](../../models/operations/arrayofdiscriminatedunionsmapresponse.md)**



## collection_one_of_post

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


req = "<value>"
    
res = s.unions.collection_one_of_post(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Object](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[T.nilable(::OpenApiSDK::Operations::CollectionOneOfPostResponse)](../../models/operations/collectiononeofpostresponse.md)**



## const_discriminated_one_of

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


req = "<value>"
    
res = s.unions.const_discriminated_one_of(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Object](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[T.nilable(::OpenApiSDK::Operations::ConstDiscriminatedOneOfResponse)](../../models/operations/constdiscriminatedoneofresponse.md)**



## discriminated_one_multiple_memberships

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


req = "<value>"
    
res = s.unions.discriminated_one_multiple_memberships(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Object](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[T.nilable(::OpenApiSDK::Operations::DiscriminatedOneMultipleMembershipsResponse)](../../models/operations/discriminatedonemultiplemembershipsresponse.md)**



## discriminated_one_multiple_memberships_has_wheels

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


req = "<value>"
    
res = s.unions.discriminated_one_multiple_memberships_has_wheels(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Object](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[T.nilable(::OpenApiSDK::Operations::DiscriminatedOneMultipleMembershipsHasWheelsResponse)](../../models/operations/discriminatedonemultiplemembershipshaswheelsresponse.md)**



## flattened_typed_object_post

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


req = "<value>"
    
res = s.unions.flattened_typed_object_post(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Object](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[T.nilable(::OpenApiSDK::Operations::FlattenedTypedObjectPostResponse)](../../models/operations/flattenedtypedobjectpostresponse.md)**



## infected_with_any

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


req = ::OpenApiSDK::Shared::InfectedWithAny.new(
  data: "<value>",
)
    
res = s.unions.infected_with_any(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [::OpenApiSDK::Shared::InfectedWithAny](../../models/shared/infectedwithany.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[T.nilable(::OpenApiSDK::Operations::InfectedWithAnyResponse)](../../models/operations/infectedwithanyresponse.md)**



## mixed_type_one_of_post

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


req = "<value>"
    
res = s.unions.mixed_type_one_of_post(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Object](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[T.nilable(::OpenApiSDK::Operations::MixedTypeOneOfPostResponse)](../../models/operations/mixedtypeoneofpostresponse.md)**



## mixed_union_types

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


req = "<value>"
    
res = s.unions.mixed_union_types(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Object](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[T.nilable(::OpenApiSDK::Operations::MixedUnionTypesResponse)](../../models/operations/mixeduniontypesresponse.md)**



## multi_match_any_of

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


req = "<value>"
    
res = s.unions.multi_match_any_of(req)

if ! res.any_of_multi_match.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Object](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[T.nilable(::OpenApiSDK::Operations::MultiMatchAnyOfResponse)](../../models/operations/multimatchanyofresponse.md)**



## nested_array_of_discriminated_unions

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


req = ::OpenApiSDK::Shared::NestedArrayOfDiscriminatedUnions.new(
  nested_array: [
    [
      "<value>",
    ],
  ],
)
    
res = s.unions.nested_array_of_discriminated_unions(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [::OpenApiSDK::Shared::NestedArrayOfDiscriminatedUnions](../../models/shared/nestedarrayofdiscriminatedunions.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |

### Response

**[T.nilable(::OpenApiSDK::Operations::NestedArrayOfDiscriminatedUnionsResponse)](../../models/operations/nestedarrayofdiscriminatedunionsresponse.md)**



## nullable_one_of_ref_in_object_post

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


req = ::OpenApiSDK::Shared::NullableOneOfRefInObject.new(
  nullable_one_of_one: ::OpenApiSDK::Shared::TypedObject1.new(
    type: ::OpenApiSDK::Shared::TypedObject1Type::OBJ1,
    value: "<value>",
  ),
  nullable_one_of_two: "<value>",
  one_of_one: "<value>",
)
    
res = s.unions.nullable_one_of_ref_in_object_post(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [::OpenApiSDK::Shared::NullableOneOfRefInObject](../../models/shared/nullableoneofrefinobject.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[T.nilable(::OpenApiSDK::Operations::NullableOneOfRefInObjectPostResponse)](../../models/operations/nullableoneofrefinobjectpostresponse.md)**



## nullable_one_of_schema_post

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


req = "<value>"
    
res = s.unions.nullable_one_of_schema_post(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Object](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[T.nilable(::OpenApiSDK::Operations::NullableOneOfSchemaPostResponse)](../../models/operations/nullableoneofschemapostresponse.md)**



## nullable_one_of_type_in_object_post

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


req = ::OpenApiSDK::Shared::NullableOneOfTypeInObject.new(
  nullable_one_of_one: false,
  nullable_one_of_two: "<value>",
  one_of_one: false,
)
    
res = s.unions.nullable_one_of_type_in_object_post(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [::OpenApiSDK::Shared::NullableOneOfTypeInObject](../../models/shared/nullableoneoftypeinobject.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[T.nilable(::OpenApiSDK::Operations::NullableOneOfTypeInObjectPostResponse)](../../models/operations/nullableoneoftypeinobjectpostresponse.md)**



## nullable_typed_object_post

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


req = ::OpenApiSDK::Shared::TypedObject1.new(
  type: ::OpenApiSDK::Shared::TypedObject1Type::OBJ1,
  value: "<value>",
)
    
res = s.unions.nullable_typed_object_post(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [::OpenApiSDK::Shared::TypedObject1](../../models/shared/typedobject1.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[T.nilable(::OpenApiSDK::Operations::NullableTypedObjectPostResponse)](../../models/operations/nullabletypedobjectpostresponse.md)**



## one_of_overlapping_objects

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


req = ::OpenApiSDK::Operations::OneOfOverlappingObjectsRequestBody.new(
  field1: "<value>",
)
    
res = s.unions.one_of_overlapping_objects(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [::OpenApiSDK::Operations::OneOfOverlappingObjectsRequestBody](../../models/operations/oneofoverlappingobjectsrequestbody.md) | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |

### Response

**[T.nilable(::OpenApiSDK::Operations::OneOfOverlappingObjectsResponse)](../../models/operations/oneofoverlappingobjectsresponse.md)**



## primitive_type_one_of_post

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


req = "<value>"
    
res = s.unions.primitive_type_one_of_post(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Object](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[T.nilable(::OpenApiSDK::Operations::PrimitiveTypeOneOfPostResponse)](../../models/operations/primitivetypeoneofpostresponse.md)**



## strongly_typed_one_of_discriminated_post

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


req = "<value>"
    
res = s.unions.strongly_typed_one_of_discriminated_post(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Object](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[T.nilable(::OpenApiSDK::Operations::StronglyTypedOneOfDiscriminatedPostResponse)](../../models/operations/stronglytypedoneofdiscriminatedpostresponse.md)**



## strongly_typed_one_of_post

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


req = "<value>"
    
res = s.unions.strongly_typed_one_of_post(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Object](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[T.nilable(::OpenApiSDK::Operations::StronglyTypedOneOfPostResponse)](../../models/operations/stronglytypedoneofpostresponse.md)**



## strongly_typed_one_of_post_with_non_standard_discriminator_name

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


req = "<value>"
    
res = s.unions.strongly_typed_one_of_post_with_non_standard_discriminator_name(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Object](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[T.nilable(::OpenApiSDK::Operations::StronglyTypedOneOfPostWithNonStandardDiscriminatorNameResponse)](../../models/operations/stronglytypedoneofpostwithnonstandarddiscriminatornameresponse.md)**



## typed_object_nullable_one_of_post

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


req = "<value>"
    
res = s.unions.typed_object_nullable_one_of_post(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Object](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[T.nilable(::OpenApiSDK::Operations::TypedObjectNullableOneOfPostResponse)](../../models/operations/typedobjectnullableoneofpostresponse.md)**



## typed_object_one_of_post

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


req = "<value>"
    
res = s.unions.typed_object_one_of_post(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Object](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[T.nilable(::OpenApiSDK::Operations::TypedObjectOneOfPostResponse)](../../models/operations/typedobjectoneofpostresponse.md)**



## union_big_int_str_decimal

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


req = "<value>"
    
res = s.unions.union_big_int_str_decimal(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Object](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[T.nilable(::OpenApiSDK::Operations::UnionBigIntStrDecimalResponse)](../../models/operations/unionbigintstrdecimalresponse.md)**



## union_date_null

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


req = Date.parse("2024-11-25")
    
res = s.unions.union_date_null(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Date](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[T.nilable(::OpenApiSDK::Operations::UnionDateNullResponse)](../../models/operations/uniondatenullresponse.md)**



## union_date_time_big_int

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


req = "<value>"
    
res = s.unions.union_date_time_big_int(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Object](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[T.nilable(::OpenApiSDK::Operations::UnionDateTimeBigIntResponse)](../../models/operations/uniondatetimebigintresponse.md)**



## union_date_time_null

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


req = DateTime.iso8601('2024-04-12T05:53:48.181Z')
    
res = s.unions.union_date_time_null(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::DateTime](../../models//.md)            | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[T.nilable(::OpenApiSDK::Operations::UnionDateTimeNullResponse)](../../models/operations/uniondatetimenullresponse.md)**



## union_map

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


req = ::OpenApiSDK::Operations::UnionMapRequestBody.new(
  input: {
    "key": "<value>",
  },
)
    
res = s.unions.union_map(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [::OpenApiSDK::Operations::UnionMapRequestBody](../../models/operations/unionmaprequestbody.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[T.nilable(::OpenApiSDK::Operations::UnionMapResponse)](../../models/operations/unionmapresponse.md)**



## union_map_optional

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


req = ::OpenApiSDK::Operations::UnionMapOptionalRequestBody.new()
    
res = s.unions.union_map_optional(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [::OpenApiSDK::Operations::UnionMapOptionalRequestBody](../../models/operations/unionmapoptionalrequestbody.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |

### Response

**[T.nilable(::OpenApiSDK::Operations::UnionMapOptionalResponse)](../../models/operations/unionmapoptionalresponse.md)**



## union_nested_enums_form

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


req = "<value>"
    
res = s.unions.union_nested_enums_form(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Object](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[T.nilable(::OpenApiSDK::Operations::UnionNestedEnumsFormResponse)](../../models/operations/unionnestedenumsformresponse.md)**



## union_nested_enums_multipart

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


req = ::OpenApiSDK::Operations::UnionNestedEnumsMultipartRequestBody.new(
  enums: "<value>",
)
    
res = s.unions.union_nested_enums_multipart(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                                                                                         | Type                                                                                                                              | Required                                                                                                                          | Description                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                         | [::OpenApiSDK::Operations::UnionNestedEnumsMultipartRequestBody](../../models/operations/unionnestedenumsmultipartrequestbody.md) | :heavy_check_mark:                                                                                                                | The request object to use for the request.                                                                                        |

### Response

**[T.nilable(::OpenApiSDK::Operations::UnionNestedEnumsMultipartResponse)](../../models/operations/unionnestedenumsmultipartresponse.md)**



## union_of_arrays_post

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


req = [
  ::OpenApiSDK::Shared::UnionOfArrays.new(
    foo: "<value>",
  ),
]
    
res = s.unions.union_of_arrays_post(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                                          | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `request`                                                          | [T::Array[::OpenApiSDK::Shared::UnionOfArrays]](../../models//.md) | :heavy_check_mark:                                                 | The request object to use for the request.                         |

### Response

**[T.nilable(::OpenApiSDK::Operations::UnionOfArraysPostResponse)](../../models/operations/unionofarrayspostresponse.md)**



## weakly_typed_one_of_null_enum_post

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


req = "<value>"
    
res = s.unions.weakly_typed_one_of_null_enum_post(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Object](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[T.nilable(::OpenApiSDK::Operations::WeaklyTypedOneOfNullEnumPostResponse)](../../models/operations/weaklytypedoneofnullenumpostresponse.md)**



## weakly_typed_one_of_post

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


req = "<value>"
    
res = s.unions.weakly_typed_one_of_post(req)

if ! res.res.nil?
  # handle response
end

```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [::Object](../../models//.md)              | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[T.nilable(::OpenApiSDK::Operations::WeaklyTypedOneOfPostResponse)](../../models/operations/weaklytypedoneofpostresponse.md)**

