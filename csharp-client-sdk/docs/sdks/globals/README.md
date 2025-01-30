# Globals
(*Globals*)

## Overview

Endpoints for testing global parameters.

### Available Operations

* [GlobalPathParameterGet](#globalpathparameterget)
* [GlobalsHeaderGet](#globalsheaderget)
* [GlobalsHiddenPost](#globalshiddenpost)
* [GlobalsOptionalHiddenPathParameterOperationRequired](#globalsoptionalhiddenpathparameteroperationrequired) - This operation requires a globally optional hidden path parameter. A
failing test with 404 likely indicates that the path parameter value is
not being templated into the client (.../hidden//...).

* [GlobalsOptionalHiddenPathParameterPathRequired](#globalsoptionalhiddenpathparameterpathrequired) - This path requires a globally optional hidden path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the client (.../hidden//...).

* [GlobalsOptionalPathParameterOperationRequired](#globalsoptionalpathparameteroperationrequired) - This operation requires a globally optional path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the operation request (.../globals//...).

* [GlobalsOptionalPathParameterPathRequired](#globalsoptionalpathparameterpathrequired) - This path requires a globally optional path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the operation request (.../globals//...).

* [GlobalsQueryParameterGet](#globalsqueryparameterget)

## GlobalPathParameterGet

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

var res = await sdk.Globals.GlobalPathParameterGetAsync(globalPathParam: 100);

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `GlobalPathParam`  | *long*             | :heavy_minus_sign: | N/A                | 100                |

### Response

**[GlobalPathParameterGetResponse](../../Models/Operations/GlobalPathParameterGetResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## GlobalsHeaderGet

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

var res = await sdk.Globals.GlobalsHeaderGetAsync(globalHeaderParam: true);

// handle response
```

### Parameters

| Parameter           | Type                | Required            | Description         | Example             |
| ------------------- | ------------------- | ------------------- | ------------------- | ------------------- |
| `GlobalHeaderParam` | *bool*              | :heavy_minus_sign:  | N/A                 | true                |

### Response

**[GlobalsHeaderGetResponse](../../Models/Operations/GlobalsHeaderGetResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## GlobalsHiddenPost

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

GlobalsHiddenPostRequest req = new GlobalsHiddenPostRequest() {
    RequestBody = new GlobalsHiddenPostRequestBody() {
        Other = 37,
        Test = "friend",
    },
    GlobalHiddenHeaderParam = "<value>",
    GlobalHiddenPathParam = "<value>",
    GlobalHiddenQueryParam = "hello",
};

var res = await sdk.Globals.GlobalsHiddenPostAsync(req);

// handle response
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GlobalsHiddenPostRequest](../../Models/Operations/GlobalsHiddenPostRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GlobalsHiddenPostResponse](../../Models/Operations/GlobalsHiddenPostResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## GlobalsOptionalHiddenPathParameterOperationRequired

This operation requires a globally optional hidden path parameter. A
failing test with 404 likely indicates that the path parameter value is
not being templated into the client (.../hidden//...).


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

var res = await sdk.Globals.GlobalsOptionalHiddenPathParameterOperationRequiredAsync(globalOptionalHiddenPathParam: "<value>");

// handle response
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `GlobalOptionalHiddenPathParam`                                                             | *string*                                                                                    | :heavy_minus_sign:                                                                          | Overrides the optional hidden global path parameter to be required<br/>at the operation level.<br/> |

### Response

**[GlobalsOptionalHiddenPathParameterOperationRequiredResponse](../../Models/Operations/GlobalsOptionalHiddenPathParameterOperationRequiredResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## GlobalsOptionalHiddenPathParameterPathRequired

This path requires a globally optional hidden path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the client (.../hidden//...).


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

var res = await sdk.Globals.GlobalsOptionalHiddenPathParameterPathRequiredAsync(globalOptionalHiddenPathParam: "<value>");

// handle response
```

### Parameters

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `GlobalOptionalHiddenPathParam`                                                        | *string*                                                                               | :heavy_minus_sign:                                                                     | Overrides the optional hidden global path parameter to be required at<br/>the path level.<br/> |

### Response

**[GlobalsOptionalHiddenPathParameterPathRequiredResponse](../../Models/Operations/GlobalsOptionalHiddenPathParameterPathRequiredResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## GlobalsOptionalPathParameterOperationRequired

This operation requires a globally optional path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the operation request (.../globals//...).


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

var res = await sdk.Globals.GlobalsOptionalPathParameterOperationRequiredAsync(globalOptionalPathParam: "<value>");

// handle response
```

### Parameters

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `GlobalOptionalPathParam`                                                            | *string*                                                                             | :heavy_minus_sign:                                                                   | Overrides the optional global path parameter to be required at the<br/>operation level.<br/> |

### Response

**[GlobalsOptionalPathParameterOperationRequiredResponse](../../Models/Operations/GlobalsOptionalPathParameterOperationRequiredResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## GlobalsOptionalPathParameterPathRequired

This path requires a globally optional path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the operation request (.../globals//...).


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

var res = await sdk.Globals.GlobalsOptionalPathParameterPathRequiredAsync(globalOptionalPathParam: "<value>");

// handle response
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `GlobalOptionalPathParam`                                                       | *string*                                                                        | :heavy_minus_sign:                                                              | Overrides the optional global path parameter to be required at the<br/>path level.<br/> |

### Response

**[GlobalsOptionalPathParameterPathRequiredResponse](../../Models/Operations/GlobalsOptionalPathParameterPathRequiredResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |

## GlobalsQueryParameterGet

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

var res = await sdk.Globals.GlobalsQueryParameterGetAsync(globalQueryParam: "some example global query param");

// handle response
```

### Parameters

| Parameter                       | Type                            | Required                        | Description                     | Example                         |
| ------------------------------- | ------------------------------- | ------------------------------- | ------------------------------- | ------------------------------- |
| `GlobalQueryParam`              | *string*                        | :heavy_minus_sign:              | N/A                             | some example global query param |

### Response

**[GlobalsQueryParameterGetResponse](../../Models/Operations/GlobalsQueryParameterGetResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4XX, 5XX                           | \*/\*                              |