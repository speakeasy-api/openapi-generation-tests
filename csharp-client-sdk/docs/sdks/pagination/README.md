# Pagination
(*Pagination*)

## Overview

Endpoints for testing the pagination extension

### Available Operations

* [PaginationAmbiguousInput](#paginationambiguousinput) - This is a paginated operation where there is both a query parameter and
request body field called "cursor". This ambiguity is used to test that
the generator only updates the appropriate field in the pagination code
"next()" function.

* [PaginationBodyFlattenedOptionalSecurity](#paginationbodyflattenedoptionalsecurity)
* [PaginationBodyFlattenedWithSecurity](#paginationbodyflattenedwithsecurity)
* [PaginationBodyWrappedRequest](#paginationbodywrappedrequest) - This operation has a request wrapper type that encapsulates the
parameters and request body. The pagination inputs are meant to go in
the request body and we want to test that the generator correctly
generates the next() function call preserving everything from the
original request and interpolating the next pagination inputs.

* [PaginationCursorBody](#paginationcursorbody)
* [PaginationCursorNonNumeric](#paginationcursornonnumeric)
* [PaginationCursorParams](#paginationcursorparams)
* [PaginationLimitOffsetDeepOutputsPageBody](#paginationlimitoffsetdeepoutputspagebody)
* [PaginationLimitOffsetOffsetBody](#paginationlimitoffsetoffsetbody)
* [PaginationLimitOffsetOffsetParams](#paginationlimitoffsetoffsetparams)
* [PaginationLimitOffsetPageBody](#paginationlimitoffsetpagebody)
* [PaginationLimitOffsetPageParams](#paginationlimitoffsetpageparams)
* [PaginationURLParams](#paginationurlparams)
* [PaginationWithRetries](#paginationwithretries)
* [PaginationWrappedOptionalBody](#paginationwrappedoptionalbody)

## PaginationAmbiguousInput

This is a paginated operation where there is both a query parameter and
request body field called "cursor". This ambiguity is used to test that
the generator only updates the appropriate field in the pagination code
"next()" function.


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

var res = await sdk.Pagination.PaginationAmbiguousInputAsync(
    requestBody: new PaginationAmbiguousInputRequestBody() {
        Cursor = 872862,
    },
    cursor: 126289
);

while(true)
{
    // handle items

    res = await res.Next();
    if (res == null)
    {
        break;
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `RequestBody`                                                                                         | [PaginationAmbiguousInputRequestBody](../../Models/Operations/PaginationAmbiguousInputRequestBody.md) | :heavy_check_mark:                                                                                    | N/A                                                                                                   |
| `Cursor`                                                                                              | *long*                                                                                                | :heavy_minus_sign:                                                                                    | N/A                                                                                                   |
| `serverURL`                                                                                           | *string*                                                                                              | :heavy_minus_sign:                                                                                    | An optional server URL to use.                                                                        |

### Response

**[PaginationAmbiguousInputResponse](../../Models/Operations/PaginationAmbiguousInputResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## PaginationBodyFlattenedOptionalSecurity

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Pagination.PaginationBodyFlattenedOptionalSecurityAsync(
    security: new PaginationBodyFlattenedOptionalSecuritySecurity() {
        PaginationAuth = "Token <YOUR_API_KEY>",
    },
    limit: 252090,
    offset: 434461
);

while(true)
{
    // handle items

    res = await res.Next();
    if (res == null)
    {
        break;
    }
}
```

### Parameters

| Parameter                                                                                                                                               | Type                                                                                                                                                    | Required                                                                                                                                                | Description                                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                              | [Openapi.Models.Operations.PaginationBodyFlattenedOptionalSecuritySecurity](../../Models/Operations/PaginationBodyFlattenedOptionalSecuritySecurity.md) | :heavy_check_mark:                                                                                                                                      | The security requirements to use for the request.                                                                                                       |
| `Limit`                                                                                                                                                 | *long*                                                                                                                                                  | :heavy_check_mark:                                                                                                                                      | N/A                                                                                                                                                     |
| `Offset`                                                                                                                                                | *long*                                                                                                                                                  | :heavy_check_mark:                                                                                                                                      | N/A                                                                                                                                                     |
| `serverURL`                                                                                                                                             | *string*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                      | An optional server URL to use.                                                                                                                          |

### Response

**[PaginationBodyFlattenedOptionalSecurityResponse](../../Models/Operations/PaginationBodyFlattenedOptionalSecurityResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## PaginationBodyFlattenedWithSecurity

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Pagination.PaginationBodyFlattenedWithSecurityAsync(
    security: new PaginationBodyFlattenedWithSecuritySecurity() {
        PaginationAuth = "Token <YOUR_API_KEY>",
    },
    limit: 296062,
    offset: 592542
);

while(true)
{
    // handle items

    res = await res.Next();
    if (res == null)
    {
        break;
    }
}
```

### Parameters

| Parameter                                                                                                                                       | Type                                                                                                                                            | Required                                                                                                                                        | Description                                                                                                                                     |
| ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                      | [Openapi.Models.Operations.PaginationBodyFlattenedWithSecuritySecurity](../../Models/Operations/PaginationBodyFlattenedWithSecuritySecurity.md) | :heavy_check_mark:                                                                                                                              | The security requirements to use for the request.                                                                                               |
| `Limit`                                                                                                                                         | *long*                                                                                                                                          | :heavy_check_mark:                                                                                                                              | N/A                                                                                                                                             |
| `Offset`                                                                                                                                        | *long*                                                                                                                                          | :heavy_check_mark:                                                                                                                              | N/A                                                                                                                                             |
| `serverURL`                                                                                                                                     | *string*                                                                                                                                        | :heavy_minus_sign:                                                                                                                              | An optional server URL to use.                                                                                                                  |

### Response

**[PaginationBodyFlattenedWithSecurityResponse](../../Models/Operations/PaginationBodyFlattenedWithSecurityResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## PaginationBodyWrappedRequest

This operation has a request wrapper type that encapsulates the
parameters and request body. The pagination inputs are meant to go in
the request body and we want to test that the generator correctly
generates the next() function call preserving everything from the
original request and interpolating the next pagination inputs.


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

PaginationBodyWrappedRequestRequest req = new PaginationBodyWrappedRequestRequest() {
    LimitOffsetConfig = new LimitOffsetConfig() {},
};

var res = await sdk.Pagination.PaginationBodyWrappedRequestAsync(req);

while(true)
{
    // handle items

    res = await res.Next();
    if (res == null)
    {
        break;
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [PaginationBodyWrappedRequestRequest](../../Models/Operations/PaginationBodyWrappedRequestRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |
| `serverURL`                                                                                           | *string*                                                                                              | :heavy_minus_sign:                                                                                    | An optional server URL to use.                                                                        |

### Response

**[PaginationBodyWrappedRequestResponse](../../Models/Operations/PaginationBodyWrappedRequestResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## PaginationCursorBody

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

PaginationCursorBodyRequestBody req = new PaginationCursorBodyRequestBody() {
    Cursor = 868337,
};

var res = await sdk.Pagination.PaginationCursorBodyAsync(req);

while(true)
{
    // handle items

    res = await res.Next();
    if (res == null)
    {
        break;
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [PaginationCursorBodyRequestBody](../../Models/Operations/PaginationCursorBodyRequestBody.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |
| `serverURL`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | An optional server URL to use.                                                                |

### Response

**[PaginationCursorBodyResponse](../../Models/Operations/PaginationCursorBodyResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## PaginationCursorNonNumeric

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

var res = await sdk.Pagination.PaginationCursorNonNumericAsync(cursor: "<value>");

while(true)
{
    // handle items

    res = await res.Next();
    if (res == null)
    {
        break;
    }
}
```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `Cursor`                                                             | *string*                                                             | :heavy_minus_sign:                                                   | The page token used to request a specific page of the search results |
| `serverURL`                                                          | *string*                                                             | :heavy_minus_sign:                                                   | An optional server URL to use.                                       |

### Response

**[PaginationCursorNonNumericResponse](../../Models/Operations/PaginationCursorNonNumericResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## PaginationCursorParams

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

var res = await sdk.Pagination.PaginationCursorParamsAsync(cursor: 24812);

while(true)
{
    // handle items

    res = await res.Next();
    if (res == null)
    {
        break;
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `Cursor`                       | *long*                         | :heavy_check_mark:             | N/A                            |
| `serverURL`                    | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[PaginationCursorParamsResponse](../../Models/Operations/PaginationCursorParamsResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## PaginationLimitOffsetDeepOutputsPageBody

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

LimitOffsetConfig req = new LimitOffsetConfig() {};

var res = await sdk.Pagination.PaginationLimitOffsetDeepOutputsPageBodyAsync(req);

while(true)
{
    // handle items

    res = await res.Next();
    if (res == null)
    {
        break;
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [LimitOffsetConfig](../../Models/Shared/LimitOffsetConfig.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |
| `serverURL`                                                   | *string*                                                      | :heavy_minus_sign:                                            | An optional server URL to use.                                |

### Response

**[PaginationLimitOffsetDeepOutputsPageBodyResponse](../../Models/Operations/PaginationLimitOffsetDeepOutputsPageBodyResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## PaginationLimitOffsetOffsetBody

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

LimitOffsetConfig req = new LimitOffsetConfig() {};

var res = await sdk.Pagination.PaginationLimitOffsetOffsetBodyAsync(req);

while(true)
{
    // handle items

    res = await res.Next();
    if (res == null)
    {
        break;
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [LimitOffsetConfig](../../Models/Shared/LimitOffsetConfig.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |
| `serverURL`                                                   | *string*                                                      | :heavy_minus_sign:                                            | An optional server URL to use.                                |

### Response

**[PaginationLimitOffsetOffsetBodyResponse](../../Models/Operations/PaginationLimitOffsetOffsetBodyResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## PaginationLimitOffsetOffsetParams

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

var res = await sdk.Pagination.PaginationLimitOffsetOffsetParamsAsync(
    limit: 661976,
    offset: 63499
);

while(true)
{
    // handle items

    res = await res.Next();
    if (res == null)
    {
        break;
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `Limit`                        | *long*                         | :heavy_minus_sign:             | N/A                            |
| `Offset`                       | *long*                         | :heavy_minus_sign:             | N/A                            |
| `serverURL`                    | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[PaginationLimitOffsetOffsetParamsResponse](../../Models/Operations/PaginationLimitOffsetOffsetParamsResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## PaginationLimitOffsetPageBody

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

LimitOffsetConfig req = new LimitOffsetConfig() {};

var res = await sdk.Pagination.PaginationLimitOffsetPageBodyAsync(req);

while(true)
{
    // handle items

    res = await res.Next();
    if (res == null)
    {
        break;
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [LimitOffsetConfig](../../Models/Shared/LimitOffsetConfig.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |
| `serverURL`                                                   | *string*                                                      | :heavy_minus_sign:                                            | An optional server URL to use.                                |

### Response

**[PaginationLimitOffsetPageBodyResponse](../../Models/Operations/PaginationLimitOffsetPageBodyResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## PaginationLimitOffsetPageParams

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

var res = await sdk.Pagination.PaginationLimitOffsetPageParamsAsync(page: 1177);

while(true)
{
    // handle items

    res = await res.Next();
    if (res == null)
    {
        break;
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `Page`                         | *long*                         | :heavy_check_mark:             | N/A                            |
| `serverURL`                    | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[PaginationLimitOffsetPageParamsResponse](../../Models/Operations/PaginationLimitOffsetPageParamsResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## PaginationURLParams

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

var res = await sdk.Pagination.PaginationURLParamsAsync(
    attempts: 778920,
    isReferencePath: "<value>"
);

// handle response
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `Attempts`                     | *long*                         | :heavy_check_mark:             | N/A                            |
| `IsReferencePath`              | *string*                       | :heavy_minus_sign:             | N/A                            |
| `serverURL`                    | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[PaginationURLParamsResponse](../../Models/Operations/PaginationURLParamsResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## PaginationWithRetries

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

var res = await sdk.Pagination.PaginationWithRetriesAsync(
    cursor: "<value>",
    faultSettings: "{\"error_code\": 503, \"error_count\": 3}",
    requestId: "paginationWithRetries"
);

while(true)
{
    // handle items

    res = await res.Next();
    if (res == null)
    {
        break;
    }
}
```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `Cursor`                                                             | *string*                                                             | :heavy_minus_sign:                                                   | The page token used to request a specific page of the search results |
| `FaultSettings`                                                      | *string*                                                             | :heavy_minus_sign:                                                   | N/A                                                                  |
| `RequestId`                                                          | *string*                                                             | :heavy_minus_sign:                                                   | N/A                                                                  |
| `serverURL`                                                          | *string*                                                             | :heavy_minus_sign:                                                   | An optional server URL to use.                                       |

### Response

**[PaginationWithRetriesResponse](../../Models/Operations/PaginationWithRetriesResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |


## PaginationWrappedOptionalBody

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

PaginationWrappedOptionalBodyRequest req = new PaginationWrappedOptionalBodyRequest() {};

var res = await sdk.Pagination.PaginationWrappedOptionalBodyAsync(
    security: new PaginationWrappedOptionalBodySecurity() {
        PaginationAuth = "Token <YOUR_API_KEY>",
    },
    req
);

while(true)
{
    // handle items

    res = await res.Next();
    if (res == null)
    {
        break;
    }
}
```

### Parameters

| Parameter                                                                                                                           | Type                                                                                                                                | Required                                                                                                                            | Description                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                           | [PaginationWrappedOptionalBodyRequest](../../Models/Operations/PaginationWrappedOptionalBodyRequest.md)                             | :heavy_check_mark:                                                                                                                  | The request object to use for the request.                                                                                          |
| `security`                                                                                                                          | [Openapi.Models.Operations.PaginationWrappedOptionalBodySecurity](../../Models/Operations/PaginationWrappedOptionalBodySecurity.md) | :heavy_check_mark:                                                                                                                  | The security requirements to use for the request.                                                                                   |
| `serverURL`                                                                                                                         | *string*                                                                                                                            | :heavy_minus_sign:                                                                                                                  | An optional server URL to use.                                                                                                      |

### Response

**[PaginationWrappedOptionalBodyResponse](../../Models/Operations/PaginationWrappedOptionalBodyResponse.md)**

### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| Openapi.Models.Errors.SDKException | 4xx-5xx                            | */*                                |
