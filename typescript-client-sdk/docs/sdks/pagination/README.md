# Pagination
(*pagination*)

## Overview

Endpoints for testing the pagination extension

### Available Operations

* [paginationCursorBody](#paginationcursorbody)
* [paginationCursorParams](#paginationcursorparams)
* [paginationLimitOffsetOffsetBody](#paginationlimitoffsetoffsetbody)
* [paginationLimitOffsetOffsetParams](#paginationlimitoffsetoffsetparams)
* [paginationLimitOffsetPageBody](#paginationlimitoffsetpagebody)
* [paginationLimitOffsetPageParams](#paginationlimitoffsetpageparams)

## paginationCursorBody

### Example Usage

```typescript
import { SDK } from "openapi";
import { PaginationCursorBodyResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.pagination.paginationCursorBody({
  cursor: 656762,
}).then((res: PaginationCursorBodyResponse) => {
  if (res.statusCode == 200) {
    do {
      // handle items

      res = res.next();
    } while (res);
  }
});
```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                | [operations.PaginationCursorBodyRequestBody](../../models/operations/paginationcursorbodyrequestbody.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |
| `serverURL`                                                                                              | *string*                                                                                                 | :heavy_minus_sign:                                                                                       | An optional server URL to use.                                                                           |
| `config`                                                                                                 | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                             | :heavy_minus_sign:                                                                                       | Available config options for making requests.                                                            |


### Response

**Promise<[operations.PaginationCursorBodyResponse](../../models/operations/paginationcursorbodyresponse.md)>**


## paginationCursorParams

### Example Usage

```typescript
import { SDK } from "openapi";
import { PaginationCursorParamsRequest, PaginationCursorParamsResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const cursor: number = 898760;

sdk.pagination.paginationCursorParams(cursor).then((res: PaginationCursorParamsResponse) => {
  if (res.statusCode == 200) {
    do {
      // handle items

      res = res.next();
    } while (res);
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `cursor`                                                     | *number*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.PaginationCursorParamsResponse](../../models/operations/paginationcursorparamsresponse.md)>**


## paginationLimitOffsetOffsetBody

### Example Usage

```typescript
import { SDK } from "openapi";
import { PaginationLimitOffsetOffsetBodyResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.pagination.paginationLimitOffsetOffsetBody({
  limit: 862063,
  offset: 8931,
  page: 97258,
}).then((res: PaginationLimitOffsetOffsetBodyResponse) => {
  if (res.statusCode == 200) {
    do {
      // handle items

      res = res.next();
    } while (res);
  }
});
```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `request`                                                            | [shared.LimitOffsetConfig](../../models/shared/limitoffsetconfig.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |
| `serverURL`                                                          | *string*                                                             | :heavy_minus_sign:                                                   | An optional server URL to use.                                       |
| `config`                                                             | [AxiosRequestConfig](https://axios-http.com/docs/req_config)         | :heavy_minus_sign:                                                   | Available config options for making requests.                        |


### Response

**Promise<[operations.PaginationLimitOffsetOffsetBodyResponse](../../models/operations/paginationlimitoffsetoffsetbodyresponse.md)>**


## paginationLimitOffsetOffsetParams

### Example Usage

```typescript
import { SDK } from "openapi";
import {
  PaginationLimitOffsetOffsetParamsRequest,
  PaginationLimitOffsetOffsetParamsResponse,
} from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const limit: number = 90233;
const offset: number = 497777;

sdk.pagination.paginationLimitOffsetOffsetParams(limit, offset).then((res: PaginationLimitOffsetOffsetParamsResponse) => {
  if (res.statusCode == 200) {
    do {
      // handle items

      res = res.next();
    } while (res);
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `limit`                                                      | *number*                                                     | :heavy_minus_sign:                                           | N/A                                                          |
| `offset`                                                     | *number*                                                     | :heavy_minus_sign:                                           | N/A                                                          |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.PaginationLimitOffsetOffsetParamsResponse](../../models/operations/paginationlimitoffsetoffsetparamsresponse.md)>**


## paginationLimitOffsetPageBody

### Example Usage

```typescript
import { SDK } from "openapi";
import { PaginationLimitOffsetPageBodyResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.pagination.paginationLimitOffsetPageBody({
  limit: 619183,
  offset: 581082,
  page: 382440,
}).then((res: PaginationLimitOffsetPageBodyResponse) => {
  if (res.statusCode == 200) {
    do {
      // handle items

      res = res.next();
    } while (res);
  }
});
```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `request`                                                            | [shared.LimitOffsetConfig](../../models/shared/limitoffsetconfig.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |
| `serverURL`                                                          | *string*                                                             | :heavy_minus_sign:                                                   | An optional server URL to use.                                       |
| `config`                                                             | [AxiosRequestConfig](https://axios-http.com/docs/req_config)         | :heavy_minus_sign:                                                   | Available config options for making requests.                        |


### Response

**Promise<[operations.PaginationLimitOffsetPageBodyResponse](../../models/operations/paginationlimitoffsetpagebodyresponse.md)>**


## paginationLimitOffsetPageParams

### Example Usage

```typescript
import { SDK } from "openapi";
import { PaginationLimitOffsetPageParamsRequest, PaginationLimitOffsetPageParamsResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const page: number = 241557;

sdk.pagination.paginationLimitOffsetPageParams(page).then((res: PaginationLimitOffsetPageParamsResponse) => {
  if (res.statusCode == 200) {
    do {
      // handle items

      res = res.next();
    } while (res);
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `page`                                                       | *number*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.PaginationLimitOffsetPageParamsResponse](../../models/operations/paginationlimitoffsetpageparamsresponse.md)>**

