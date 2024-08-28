# Pagination
(*Pagination*)

## Overview

Endpoints for testing the pagination extension

### Available Operations

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
    globalQueryParam: "some example global query param");

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
    globalQueryParam: "some example global query param");

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
    globalQueryParam: "some example global query param");

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
    globalQueryParam: "some example global query param");

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
    globalQueryParam: "some example global query param");

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
    globalQueryParam: "some example global query param");

var res = await sdk.Pagination.PaginationLimitOffsetOffsetParamsAsync(
    limit: 661976,
    offset: 600173);


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
    globalQueryParam: "some example global query param");

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
    globalQueryParam: "some example global query param");

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
    globalQueryParam: "some example global query param");

var res = await sdk.Pagination.PaginationURLParamsAsync(
    attempts: 778920,
    isReferencePath: "<value>");

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
    globalQueryParam: "some example global query param");

var res = await sdk.Pagination.PaginationWithRetriesAsync(
    cursor: "<value>",
    faultSettings: "{\"error_code\": 503, \"error_count\": 3}",
    requestId: "paginationWithRetries");


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
