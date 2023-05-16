# SDK

## Overview

Some test description.
About our test document.

Speakeasy Docs
<https://speakeasyapi.dev/docs/home>
### Available Operations

* [putAnythingIgnoredGeneration](#putanythingignoredgeneration)
* [responseBodyJsonGet](#responsebodyjsonget)

## putAnythingIgnoredGeneration

### Example Usage

```typescript
import { SDK } from "openapi";
import { PutAnythingIgnoredGenerationResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.sdk.putAnythingIgnoredGeneration("odit").then((res: PutAnythingIgnoredGenerationResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## responseBodyJsonGet

### Example Usage

```typescript
import { SDK } from "openapi";
import { ResponseBodyJsonGetResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.sdk.responseBodyJsonGet().then((res: ResponseBodyJsonGetResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```
