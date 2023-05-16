# responseBodies

## Overview

Endpoints for testing response bodies.

### Available Operations

* [responseBodyBytesGet](#responsebodybytesget)
* [responseBodyStringGet](#responsebodystringget)
* [responseBodyXmlGet](#responsebodyxmlget)

## responseBodyBytesGet

### Example Usage

```typescript
import { SDK } from "openapi";
import { ResponseBodyBytesGetResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.responseBodies.responseBodyBytesGet().then((res: ResponseBodyBytesGetResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## responseBodyStringGet

### Example Usage

```typescript
import { SDK } from "openapi";
import { ResponseBodyStringGetResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.responseBodies.responseBodyStringGet().then((res: ResponseBodyStringGetResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## responseBodyXmlGet

### Example Usage

```typescript
import { SDK } from "openapi";
import { ResponseBodyXmlGetResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.responseBodies.responseBodyXmlGet().then((res: ResponseBodyXmlGetResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```
