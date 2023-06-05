# servers

## Overview

Endpoints for testing servers.

### Available Operations

* [selectGlobalServer](#selectglobalserver)
* [selectServerWithID](#selectserverwithid) - Select a server by ID.
* [serverWithTemplates](#serverwithtemplates)
* [serverWithTemplatesGlobal](#serverwithtemplatesglobal)
* [serversByIDWithTemplates](#serversbyidwithtemplates)

## selectGlobalServer

### Example Usage

```typescript
import { SDK } from "openapi";
import { SelectGlobalServerResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.servers.selectGlobalServer().then((res: SelectGlobalServerResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## selectServerWithID

Select a server by ID.

### Example Usage

```typescript
import { SDK } from "openapi";
import { SelectServerWithIDResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.servers.selectServerWithID().then((res: SelectServerWithIDResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## serverWithTemplates

### Example Usage

```typescript
import { SDK } from "openapi";
import { ServerWithTemplatesResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.servers.serverWithTemplates().then((res: ServerWithTemplatesResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## serverWithTemplatesGlobal

### Example Usage

```typescript
import { SDK } from "openapi";
import { ServerWithTemplatesGlobalResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.servers.serverWithTemplatesGlobal().then((res: ServerWithTemplatesGlobalResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## serversByIDWithTemplates

### Example Usage

```typescript
import { SDK } from "openapi";
import { ServersByIDWithTemplatesResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.servers.serversByIDWithTemplates().then((res: ServersByIDWithTemplatesResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```
