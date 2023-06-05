# pagination

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
  cursor: 311796,
}).then((res: PaginationCursorBodyResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## paginationCursorParams

### Example Usage

```typescript
import { SDK } from "openapi";
import { PaginationCursorParamsResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.pagination.paginationCursorParams(881005).then((res: PaginationCursorParamsResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

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
  limit: 696344,
  offset: 976405,
  page: 377752,
}).then((res: PaginationLimitOffsetOffsetBodyResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## paginationLimitOffsetOffsetParams

### Example Usage

```typescript
import { SDK } from "openapi";
import { PaginationLimitOffsetOffsetParamsResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.pagination.paginationLimitOffsetOffsetParams(617658, 179603).then((res: PaginationLimitOffsetOffsetParamsResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

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
  limit: 542499,
  offset: 24678,
  page: 854614,
}).then((res: PaginationLimitOffsetPageBodyResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## paginationLimitOffsetPageParams

### Example Usage

```typescript
import { SDK } from "openapi";
import { PaginationLimitOffsetPageParamsResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.pagination.paginationLimitOffsetPageParams(67249).then((res: PaginationLimitOffsetPageParamsResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```
