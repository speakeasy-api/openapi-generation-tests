# globals

## Overview

Endpoints for testing global parameters.

### Available Operations

* [globalPathParameterGet](#globalpathparameterget)
* [globalsQueryParameterGet](#globalsqueryparameterget)

## globalPathParameterGet

### Example Usage

```typescript
import { SDK } from "openapi";
import { GlobalPathParameterGetResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.globals.globalPathParameterGet(434417).then((res: GlobalPathParameterGetResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## globalsQueryParameterGet

### Example Usage

```typescript
import { SDK } from "openapi";
import { GlobalsQueryParameterGetResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.globals.globalsQueryParameterGet("odio").then((res: GlobalsQueryParameterGetResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```
