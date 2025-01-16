# Generation
(*Generation*)

## Overview

Endpoints for purely testing valid generation behavior.

### Available Operations

* [AnchorTypesGet](#anchortypesget)
* [ArrayCircularReferenceGet](#arraycircularreferenceget)
* [CircularReferenceGet](#circularreferenceget)
* [CircularReferenceOneDegree](#circularreferenceonedegree) - A reference cycle that spans three models separated by one degree
* [DateParamWithDefault](#dateparamwithdefault)
* [DateTimeParamWithDefault](#datetimeparamwithdefault)
* [DecimalParamWithDefault](#decimalparamwithdefault)
* [DeprecatedFieldInSchemaPost](#deprecatedfieldinschemapost)
* [DeprecatedObjectInSchemaGet](#deprecatedobjectinschemaget)
* [~~DeprecatedOperationNoCommentsGet~~](#deprecatedoperationnocommentsget) - :warning: **Deprecated**
* [~~DeprecatedOperationWithCommentsGet~~](#deprecatedoperationwithcommentsget) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** Use [SimplePathParameterObjects](docs/sdks/parameters/README.md#simplepathparameterobjects) instead.
* [~~DeprecatedOperationWithMultilineCommentGet~~](#deprecatedoperationwithmultilinecommentget) - This is an endpoint setup to test deprecation with multiline comments :warning: **Deprecated** Use [SimplePathParameterObjects](docs/sdks/parameters/README.md#simplepathparameterobjects) instead.
* [EmptyObjectGet](#emptyobjectget)
* [EmptyResponseObjectWithCommentGet](#emptyresponseobjectwithcommentget)
* [GlobalNameOverridden](#globalnameoverridden)
* [IgnoredGenerationGet](#ignoredgenerationget)
* [IgnoresPost](#ignorespost)
* [NameOverride](#nameoverride)
* [ObjectCircularReferenceGet](#objectcircularreferenceget)
* [OneOfCircularReferenceGet](#oneofcircularreferenceget)
* [ReactHookCombinedOptions](#reacthookcombinedoptions)
* [ReactHookDisabled](#reacthookdisabled)
* [ReactHookGetAsMutation](#reacthookgetasmutation)
* [ReactHookPostAsQuery](#reacthookpostasquery)
* [ReactHookRenamed](#reacthookrenamed)
* [TypedParameterGenerationGet](#typedparametergenerationget)
* [UsageExamplePost](#usageexamplepost) - An operation used for testing usage examples

## AnchorTypesGet

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Generation.AnchorTypesGetAsync();

// handle response
```

### Response

**[AnchorTypesGetResponse](../../Models/Operations/AnchorTypesGetResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## ArrayCircularReferenceGet

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Generation.ArrayCircularReferenceGetAsync();

// handle response
```

### Response

**[ArrayCircularReferenceGetResponse](../../Models/Operations/ArrayCircularReferenceGetResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## CircularReferenceGet

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Generation.CircularReferenceGetAsync();

// handle response
```

### Response

**[CircularReferenceGetResponse](../../Models/Operations/CircularReferenceGetResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## CircularReferenceOneDegree

A reference cycle that spans three models separated by one degree

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

FigmaComponentNode req = new FigmaComponentNode() {};

var res = await sdk.Generation.CircularReferenceOneDegreeAsync(req);

// handle response
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [FigmaComponentNode](../../Models/Shared/FigmaComponentNode.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[CircularReferenceOneDegreeResponse](../../Models/Operations/CircularReferenceOneDegreeResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## DateParamWithDefault

### Example Usage

```csharp
using NodaTime;
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Generation.DateParamWithDefaultAsync(dateInput: LocalDate.FromDateTime(System.DateTime.Parse("2023-10-13")));

// handle response
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `DateInput`                                                         | [LocalDate](https://nodatime.org/3.1.x/api/NodaTime.LocalDate.html) | :heavy_check_mark:                                                  | A date parameter with a default value                               |

### Response

**[DateParamWithDefaultResponse](../../Models/Operations/DateParamWithDefaultResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## DateTimeParamWithDefault

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Generation.DateTimeParamWithDefaultAsync(dateTimeInput: System.DateTime.Parse("2023-10-13T12:42:42.999+00:00"));

// handle response
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `DateTimeInput`                                                                       | [DateTime](https://learn.microsoft.com/en-us/dotnet/api/system.datetime?view=net-5.0) | :heavy_check_mark:                                                                    | A date time parameter with a default value                                            |

### Response

**[DateTimeParamWithDefaultResponse](../../Models/Operations/DateTimeParamWithDefaultResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## DecimalParamWithDefault

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Generation.DecimalParamWithDefaultAsync(decimalInput: 903275809834567300000M);

// handle response
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `DecimalInput`                           | *decimal*                                | :heavy_check_mark:                       | A decimal parameter with a default value |

### Response

**[DecimalParamWithDefaultResponse](../../Models/Operations/DecimalParamWithDefaultResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## DeprecatedFieldInSchemaPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

DeprecatedFieldInObject req = new DeprecatedFieldInObject() {};

var res = await sdk.Generation.DeprecatedFieldInSchemaPostAsync(req);

// handle response
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [DeprecatedFieldInObject](../../Models/Shared/DeprecatedFieldInObject.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[DeprecatedFieldInSchemaPostResponse](../../Models/Operations/DeprecatedFieldInSchemaPostResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## DeprecatedObjectInSchemaGet

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Generation.DeprecatedObjectInSchemaGetAsync();

// handle response
```

### Response

**[DeprecatedObjectInSchemaGetResponse](../../Models/Operations/DeprecatedObjectInSchemaGetResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## ~~DeprecatedOperationNoCommentsGet~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Generation.DeprecatedOperationNoCommentsGetAsync(deprecatedParameter: "<value>");

// handle response
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `DeprecatedParameter`                                                                                                   | *string*                                                                                                                | :heavy_minus_sign:                                                                                                      | : warning: ** DEPRECATED **: This will be removed in a future release, please migrate away from it as soon as possible. |

### Response

**[DeprecatedOperationNoCommentsGetResponse](../../Models/Operations/DeprecatedOperationNoCommentsGetResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## ~~DeprecatedOperationWithCommentsGet~~

This is an endpoint setup to test deprecation with comments

> :warning: **DEPRECATED**: This operation is deprecated. Use `SimplePathParameterObjects` instead.

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Generation.DeprecatedOperationWithCommentsGetAsync(
    deprecatedParameter: "<value>",
    newParameter: "<value>"
);

// handle response
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `DeprecatedParameter`                                                                                            | *string*                                                                                                         | :heavy_minus_sign:                                                                                               | : warning: ** DEPRECATED **: This parameter is deprecated. Use NewParameter instead.<br/><br/>This is a string parameter |
| `NewParameter`                                                                                                   | *string*                                                                                                         | :heavy_minus_sign:                                                                                               | This is a string parameter                                                                                       |

### Response

**[DeprecatedOperationWithCommentsGetResponse](../../Models/Operations/DeprecatedOperationWithCommentsGetResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## ~~DeprecatedOperationWithMultilineCommentGet~~

This is an endpoint setup to test deprecation with multiline comments

> :warning: **DEPRECATED**: This operation is deprecated.
Its deprecation message has newlines.
. Use `SimplePathParameterObjects` instead.

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Generation.DeprecatedOperationWithMultilineCommentGetAsync(
    deprecatedParameter: "<value>",
    newParameter: "<value>"
);

// handle response
```

### Parameters

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `DeprecatedParameter`                                                                                                                                    | *string*                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                       | : warning: ** DEPRECATED **: This parameter is deprecated.<br/>Its deprecation message has newlines.<br/>. Use NewParameter instead.<br/><br/>This is a string parameter |
| `NewParameter`                                                                                                                                           | *string*                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                       | This is a string parameter                                                                                                                               |

### Response

**[DeprecatedOperationWithMultilineCommentGetResponse](../../Models/Operations/DeprecatedOperationWithMultilineCommentGetResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## EmptyObjectGet

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Generation.EmptyObjectGetAsync(emptyObject: new EmptyObjectParam() {});

// handle response
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `EmptyObject`                                               | [EmptyObjectParam](../../Models/Shared/EmptyObjectParam.md) | :heavy_check_mark:                                          | N/A                                                         |

### Response

**[EmptyObjectGetResponse](../../Models/Operations/EmptyObjectGetResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## EmptyResponseObjectWithCommentGet

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Generation.EmptyResponseObjectWithCommentGetAsync();

// handle response
```

### Response

**[EmptyResponseObjectWithCommentGetResponse](../../Models/Operations/EmptyResponseObjectWithCommentGetResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## GlobalNameOverridden

### Example Usage

```csharp
using NodaTime;
using Openapi;
using Openapi.Models.Shared;
using System;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

SimpleObject req = new SimpleObject() {
    Any = "any",
    Bool = true,
    Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
    DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
    Enum = Openapi.Models.Shared.Enum.One,
    Float32 = 1.1F,
    Int = 1,
    Int32 = 1,
    Int32Enum = Int32Enum.FiftyFive,
    IntEnum = IntEnum.Second,
    Num = 1.1D,
    Str = "test",
    Bigint = 8821239038968084,
    BigintStr = 9223372036854775808,
    BoolOpt = true,
    Decimal = 3.141592653589793M,
    DecimalStr = 3.14159265358979344719667586M,
    Float64Str = "1.1",
    Int64Str = "100",
    StrOpt = "testOptional",
};

var res = await sdk.Generation.GlobalNameOverriddenAsync(req);

// handle response
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `request`                                           | [SimpleObject](../../Models/Shared/SimpleObject.md) | :heavy_check_mark:                                  | The request object to use for the request.          |

### Response

**[GetGlobalNameOverrideResponse](../../Models/Operations/GetGlobalNameOverrideResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## IgnoredGenerationGet

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Generation.IgnoredGenerationGetAsync();

// handle response
```

### Response

**[IgnoredGenerationGetResponse](../../Models/Operations/IgnoredGenerationGetResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## IgnoresPost

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Generation.IgnoresPostAsync(
    requestBody: new IgnoresPostRequestBody() {},
    testParam: "<value>"
);

// handle response
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `RequestBody`                                                               | [IgnoresPostRequestBody](../../Models/Operations/IgnoresPostRequestBody.md) | :heavy_check_mark:                                                          | N/A                                                                         |
| `TestParam`                                                                 | *string*                                                                    | :heavy_minus_sign:                                                          | N/A                                                                         |

### Response

**[IgnoresPostResponse](../../Models/Operations/IgnoresPostResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## NameOverride

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Generation.NameOverrideAsync(
    testEnumQueryParam: EnumNameOverride.Value3,
    testQueryParam: "example"
);

// handle response
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     | Example                                                         |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `TestEnumQueryParam`                                            | [EnumNameOverride](../../Models/Operations/EnumNameOverride.md) | :heavy_check_mark:                                              | An enum type                                                    | value3                                                          |
| `TestQueryParam`                                                | *string*                                                        | :heavy_check_mark:                                              | N/A                                                             | example                                                         |

### Response

**[NameOverrideGetResponse](../../Models/Operations/NameOverrideGetResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## ObjectCircularReferenceGet

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Generation.ObjectCircularReferenceGetAsync();

// handle response
```

### Response

**[ObjectCircularReferenceGetResponse](../../Models/Operations/ObjectCircularReferenceGetResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## OneOfCircularReferenceGet

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Generation.OneOfCircularReferenceGetAsync();

// handle response
```

### Response

**[OneOfCircularReferenceGetResponse](../../Models/Operations/OneOfCircularReferenceGetResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## ReactHookCombinedOptions

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

ReactHookCombinedOptionsResponse? res = await sdk.Generation.ReactHookCombinedOptionsAsync(page: 122236);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `Page`             | *long*             | :heavy_check_mark: | N/A                |

### Response

**[ReactHookCombinedOptionsResponse](../../Models/Operations/ReactHookCombinedOptionsResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## ReactHookDisabled

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Generation.ReactHookDisabledAsync();

// handle response
```

### Response

**[ReactHookDisabledResponse](../../Models/Operations/ReactHookDisabledResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## ReactHookGetAsMutation

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Generation.ReactHookGetAsMutationAsync();

// handle response
```

### Response

**[ReactHookGetAsMutationResponse](../../Models/Operations/ReactHookGetAsMutationResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## ReactHookPostAsQuery

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Generation.ReactHookPostAsQueryAsync();

// handle response
```

### Response

**[ReactHookPostAsQueryResponse](../../Models/Operations/ReactHookPostAsQueryResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## ReactHookRenamed

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Generation.ReactHookRenamedAsync();

// handle response
```

### Response

**[ReactHookRenamedResponse](../../Models/Operations/ReactHookRenamedResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## TypedParameterGenerationGet

### Example Usage

```csharp
using NodaTime;
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Generation.TypedParameterGenerationGetAsync(
    bigint: 879275,
    date: LocalDate.FromDateTime(System.DateTime.Parse("2024-01-02")),
    decimalP: 8948.31M,
    obj: new Obj() {
        Bool = false,
        Num = 6735.52D,
        Str = "<value>",
    }
);

// handle response
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `Bigint`                                                            | *BigInteger*                                                        | :heavy_minus_sign:                                                  | N/A                                                                 |
| `Date`                                                              | [LocalDate](https://nodatime.org/3.1.x/api/NodaTime.LocalDate.html) | :heavy_minus_sign:                                                  | N/A                                                                 |
| `Decimal`                                                           | *decimal*                                                           | :heavy_minus_sign:                                                  | N/A                                                                 |
| `Obj`                                                               | [Obj](../../Models/Operations/Obj.md)                               | :heavy_minus_sign:                                                  | N/A                                                                 |

### Response

**[TypedParameterGenerationGetResponse](../../Models/Operations/TypedParameterGenerationGetResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## UsageExamplePost

An operation used for testing usage examples that includes a large array of parameters and input types to ensure that all are handled correctly

Usage example docs
<https://docs.example.com>

### Example Usage

```csharp
using NodaTime;
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;
using System;

var sdk = new SDK(
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

UsageExamplePostRequest req = new UsageExamplePostRequest() {
    BigintParameter = 168827,
    BigintStrParameter = 813724,
    BoolParameter = false,
    DateParameter = LocalDate.FromDateTime(System.DateTime.Parse("2023-10-21")),
    DateTimeDefaultParameter = System.DateTime.Parse("2023-11-16T02:05:07.748Z"),
    DateTimeParameter = System.DateTime.Parse("2023-09-08T13:40:52.532Z"),
    DecimalParameter = 5669.99M,
    DecimalStrParameter = 5696.63M,
    DoubleParameter = 3527.78D,
    EnumParameter = EnumParameter.Value2,
    FalseyNumberParameter = 0D,
    Float32Parameter = 200.81F,
    Float64StringParameter = "<value>",
    FloatParameter = 1062.86D,
    Int64Parameter = 234682,
    Int64StringParameter = "<value>",
    IntParameter = 215216,
    StrParameter = "example 2",
    RequestBody = new UsageExamplePostRequestBody() {
        FakerCamelCasePropertyNameStrings = new FakerCamelCasePropertyNameStrings() {
            City = "Fort Cassandra",
            Iban = "TR115005745241192470211411",
            Id = "<id>",
            IPv4 = "221.80.210.91",
            IPv6 = "c41e:563b:f5df:3eec:ade0:f7ff:8aae:bcff",
        },
        FakerFormattedStrings = new FakerFormattedStrings() {
            AddressFormat = "2256 Jackie Way",
            DateFormat = LocalDate.FromDateTime(System.DateTime.Parse("2025-05-13")),
            DatetimeFormat = System.DateTime.Parse("2025-11-24T05:08:23.961Z"),
            DirectoryFormat = "/usr/obj",
            DomainFormat = "prudent-kettledrum.net",
            EmailFormat = "Monserrat4@gmail.com",
            FilenameFormat = "example.file",
            FilepathFormat = "/srv/far_off_though.mp2",
            ImageFormat = "https://picsum.photos/seed/1jCnxsrVm/3900/1676",
            Ipv4Format = "241.49.29.216",
            Ipv6Format = "56ad:dd82:32fe:d68b:eafe:fe5c:0e75:3e9a",
            JsonFormat = "{key: 5416874389095425, key1: null, key2: \"<value>\"}",
            MacFormat = "aa:75:4f:92:a3:c6",
            PasswordFormat = "ZYIrZwC2gbXZm0x",
            PhoneFormat = "895.693.7701 x78668",
            TimezoneFormat = "Africa/Juba",
            UnknownFormat = "<value>",
            UrlFormat = "https://devoted-lady.info/",
            UuidFormat = "95e36984-1bdb-4972-b8f8-91d21ba1e292",
            ZipcodeFormat = "09108",
        },
        FakerKebobCasePropertyNameStrings = new FakerKebobCasePropertyNameStrings() {
            PostalCode = "00476",
        },
        FakerPascalCasePropertyNameStrings = new FakerPascalCasePropertyNameStrings() {
            Account = "05267398",
            Address = "8854 Alta Road",
            Amount = "101.02",
            Avatar = "https://loremflickr.com/2780/914?lock=8012325154053812",
            City = "Maggioboro",
            Color = "fuchsia",
            Comment = "Andy shoes are designed to keeping in mind durability as well as trends, the most stylish range of shoes & sandals",
            Company = "Anderson and Sons",
            Continent = "Europe",
            Country = "Russian Federation",
            CountryCode = "YE",
            CreatedAt = "1707997551121",
            Currency = "Hong Kong Dollar",
            CurrencyCode = "ISK",
            CurrencyISO = "SSP",
            Datatype = "point",
            Default = "<value>",
            Description = "without vice um granny straw",
            Directory = "/var/spool",
            Domain = "informal-rawhide.info",
            DomainName = "zany-drive.biz",
            Email = "Kamryn_Harris-Rice@yahoo.com",
            EmailAddr = "Mackenzie.Homenick43@gmail.com",
            EmailAddress = "Jodie_Sawayn64@hotmail.com",
            ExpiredAt = "1735899594168",
            Expires = "<value>",
            ExpiresAt = "1750494766124",
            Extension = "mp4",
            Filename = "example.file",
            Filepath = "/root/what_enlist.dmg",
            Filetype = "text",
            FirstName = "Rick",
            FullName = "Jim Raynor",
            Gender = "Trans male",
            Host = "nice-version.net",
            HostName = "incomparable-expansion.biz",
            HttpStatus = "403",
            Iban = "PT82007863030094674087035",
            Id = "<id>",
            Ip = "95.76.43.117",
            IpAddr = "3b0a:a56f:c6c2:9330:cbeb:47ed:5aa7:4ccc",
            IpAddress = "6aa0:e917:5cea:beae:91db:bbbe:a1eb:c170",
            Ipv4 = "93.70.29.69",
            Ipv6 = "cbde:29fa:2b6c:517a:79fe:aa67:2895:1c28",
            Job = "Future Accountability Consultant",
            Json = "{key: 4839465338338305, key1: null, key2: \"<value>\"}",
            Key = "<key>",
            LastName = "Luettgen",
            Latitude = "16.1719",
            Locale = "sv",
            Longitude = "167.6076",
            Mac = "58:68:b7:7b:b2:42",
            Manufacturer = "Polestar",
            Material = "Steel",
            MiddleName = "Emerson",
            Model = "Civic",
            Password = "0sOktqRR3ChOYIc",
            Phone = "948.650.8331 x5779",
            Pin = "2379",
            PostalCode = "54207",
            Price = "447.26",
            Product = "Rustic Cotton Towels",
            Sex = "female",
            StatusCode = "507",
            Street = "Sydnee Falls",
            Timezone = "America/Cancun",
            Unit = "steradian",
            UpdatedAt = "1736958079336",
            Uri = "https://tricky-hydrant.biz",
            Url = "https://selfish-epic.net",
            Username = "Katlyn_OHara",
            Uuid = "34551a37-e5ee-4d18-a1e2-0e05958b9b2d",
        },
        FakerSnakeCasePropertyNameStrings = new FakerSnakeCasePropertyNameStrings() {
            CountryCode = "NC",
            CreatedAt = "1722550319899",
            ExpiredAt = "1736554344342",
            UpdatedAt = "1736923137628",
        },
        SimpleObject = new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            Enum = Openapi.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Int32Enum.FiftyFive,
            IntEnum = IntEnum.Second,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            Float64Str = "1.1",
            Int64Str = "100",
            StrOpt = "testOptional",
        },
    },
    OptEnumParameter = OptEnumParameter.Value3,
};

var res = await sdk.Generation.UsageExamplePostAsync(
    security: new UsageExamplePostSecurity() {
        Password = "YOUR_PASSWORD",
        Username = "YOUR_USERNAME",
    },
    request: req
);

// handle response
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [UsageExamplePostRequest](../../Models/Operations/UsageExamplePostRequest.md)                             | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |
| `security`                                                                                                | [Openapi.Models.Operations.UsageExamplePostSecurity](../../Models/Operations/UsageExamplePostSecurity.md) | :heavy_check_mark:                                                                                        | The security requirements to use for the request.                                                         |

### Response

**[UsageExamplePostResponse](../../Models/Operations/UsageExamplePostResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |