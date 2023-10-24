# PaginationSDK
(*Pagination*)

## Overview

Endpoints for testing the pagination extension

### Available Operations

* [PaginationCursorBody](#paginationcursorbody)
* [PaginationCursorParams](#paginationcursorparams)
* [PaginationLimitOffsetOffsetBody](#paginationlimitoffsetoffsetbody)
* [PaginationLimitOffsetOffsetParams](#paginationlimitoffsetoffsetparams)
* [PaginationLimitOffsetPageBody](#paginationlimitoffsetpagebody)
* [PaginationLimitOffsetPageParams](#paginationlimitoffsetpageparams)

## PaginationCursorBody

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using SDK.Models.Operations;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Pagination.PaginationCursorBodyAsync(new PaginationCursorBodyRequestBody() {
    Cursor = 868337,
});

// handle response
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [PaginationCursorBodyRequestBody](../../models/operations/PaginationCursorBodyRequestBody.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |
| `serverURL`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | An optional server URL to use.                                                                |


### Response

**[PaginationCursorBodyResponse](../../models/operations/PaginationCursorBodyResponse.md)**


## PaginationCursorParams

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using SDK.Models.Operations;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Pagination.PaginationCursorParamsAsync(24812);

// handle response
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `Cursor`                       | *long*                         | :heavy_check_mark:             | N/A                            |
| `serverURL`                    | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[PaginationCursorParamsResponse](../../models/operations/PaginationCursorParamsResponse.md)**


## PaginationLimitOffsetOffsetBody

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Pagination.PaginationLimitOffsetOffsetBodyAsync(new LimitOffsetConfig() {});

// handle response
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [LimitOffsetConfig](../../models/shared/LimitOffsetConfig.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |
| `serverURL`                                                   | *string*                                                      | :heavy_minus_sign:                                            | An optional server URL to use.                                |


### Response

**[PaginationLimitOffsetOffsetBodyResponse](../../models/operations/PaginationLimitOffsetOffsetBodyResponse.md)**


## PaginationLimitOffsetOffsetParams

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using SDK.Models.Operations;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Pagination.PaginationLimitOffsetOffsetParamsAsync(661976, 600173);

// handle response
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `Limit`                        | *long*                         | :heavy_minus_sign:             | N/A                            |
| `Offset`                       | *long*                         | :heavy_minus_sign:             | N/A                            |
| `serverURL`                    | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[PaginationLimitOffsetOffsetParamsResponse](../../models/operations/PaginationLimitOffsetOffsetParamsResponse.md)**


## PaginationLimitOffsetPageBody

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Pagination.PaginationLimitOffsetPageBodyAsync(new LimitOffsetConfig() {});

// handle response
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [LimitOffsetConfig](../../models/shared/LimitOffsetConfig.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |
| `serverURL`                                                   | *string*                                                      | :heavy_minus_sign:                                            | An optional server URL to use.                                |


### Response

**[PaginationLimitOffsetPageBodyResponse](../../models/operations/PaginationLimitOffsetPageBodyResponse.md)**


## PaginationLimitOffsetPageParams

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using SDK.Models.Operations;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Pagination.PaginationLimitOffsetPageParamsAsync(1177);

// handle response
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `Page`                         | *long*                         | :heavy_check_mark:             | N/A                            |
| `serverURL`                    | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[PaginationLimitOffsetPageParamsResponse](../../models/operations/PaginationLimitOffsetPageParamsResponse.md)**

