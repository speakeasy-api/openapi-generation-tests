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

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.pagination.paginationCursorBody({
    cursor: 868337,
  });

  if (res.statusCode == 200) {
    do {
      // handle items

      res = res.next();
    } while (res);
  }
}

run();
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [operations.PaginationCursorBodyRequestBody](../../sdk/models/operations/paginationcursorbodyrequestbody.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |
| `serverURL`                                                                                                  | *string*                                                                                                     | :heavy_minus_sign:                                                                                           | An optional server URL to use.                                                                               |
| `config`                                                                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                 | :heavy_minus_sign:                                                                                           | Available config options for making requests.                                                                |


### Response

**Promise<[operations.PaginationCursorBodyResponse](../../sdk/models/operations/paginationcursorbodyresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## paginationCursorParams

### Example Usage

```typescript
import { SDK } from "openapi";
import { PaginationCursorParamsRequest } from "openapi/dist/sdk/models/operations";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const cursor: number = 24812;

  const res = await sdk.pagination.paginationCursorParams(cursor);

  if (res.statusCode == 200) {
    do {
      // handle items

      res = res.next();
    } while (res);
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `cursor`                                                     | *number*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.PaginationCursorParamsResponse](../../sdk/models/operations/paginationcursorparamsresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## paginationLimitOffsetOffsetBody

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.pagination.paginationLimitOffsetOffsetBody({});

  if (res.statusCode == 200) {
    do {
      // handle items

      res = res.next();
    } while (res);
  }
}

run();
```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `request`                                                                | [shared.LimitOffsetConfig](../../sdk/models/shared/limitoffsetconfig.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |
| `serverURL`                                                              | *string*                                                                 | :heavy_minus_sign:                                                       | An optional server URL to use.                                           |
| `config`                                                                 | [AxiosRequestConfig](https://axios-http.com/docs/req_config)             | :heavy_minus_sign:                                                       | Available config options for making requests.                            |


### Response

**Promise<[operations.PaginationLimitOffsetOffsetBodyResponse](../../sdk/models/operations/paginationlimitoffsetoffsetbodyresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## paginationLimitOffsetOffsetParams

### Example Usage

```typescript
import { SDK } from "openapi";
import { PaginationLimitOffsetOffsetParamsRequest } from "openapi/dist/sdk/models/operations";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const limit: number = 661976;
const offset: number = 600173;

  const res = await sdk.pagination.paginationLimitOffsetOffsetParams(limit, offset);

  if (res.statusCode == 200) {
    do {
      // handle items

      res = res.next();
    } while (res);
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `limit`                                                      | *number*                                                     | :heavy_minus_sign:                                           | N/A                                                          |
| `offset`                                                     | *number*                                                     | :heavy_minus_sign:                                           | N/A                                                          |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.PaginationLimitOffsetOffsetParamsResponse](../../sdk/models/operations/paginationlimitoffsetoffsetparamsresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## paginationLimitOffsetPageBody

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.pagination.paginationLimitOffsetPageBody({});

  if (res.statusCode == 200) {
    do {
      // handle items

      res = res.next();
    } while (res);
  }
}

run();
```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `request`                                                                | [shared.LimitOffsetConfig](../../sdk/models/shared/limitoffsetconfig.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |
| `serverURL`                                                              | *string*                                                                 | :heavy_minus_sign:                                                       | An optional server URL to use.                                           |
| `config`                                                                 | [AxiosRequestConfig](https://axios-http.com/docs/req_config)             | :heavy_minus_sign:                                                       | Available config options for making requests.                            |


### Response

**Promise<[operations.PaginationLimitOffsetPageBodyResponse](../../sdk/models/operations/paginationlimitoffsetpagebodyresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## paginationLimitOffsetPageParams

### Example Usage

```typescript
import { SDK } from "openapi";
import { PaginationLimitOffsetPageParamsRequest } from "openapi/dist/sdk/models/operations";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const page: number = 1177;

  const res = await sdk.pagination.paginationLimitOffsetPageParams(page);

  if (res.statusCode == 200) {
    do {
      // handle items

      res = res.next();
    } while (res);
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `page`                                                       | *number*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.PaginationLimitOffsetPageParamsResponse](../../sdk/models/operations/paginationlimitoffsetpageparamsresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |
