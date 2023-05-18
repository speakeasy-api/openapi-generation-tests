# telemetry

## Overview

Endpoints for testing telemetry.

### Available Operations

* [telemetrySpeakeasyUserAgentGet](#telemetryspeakeasyuseragentget)
* [telemetryUserAgentGet](#telemetryuseragentget)

## telemetrySpeakeasyUserAgentGet

### Example Usage

```typescript
import { SDK } from "openapi";
import { TelemetrySpeakeasyUserAgentGetResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.telemetry.telemetrySpeakeasyUserAgentGet("dolorum").then((res: TelemetrySpeakeasyUserAgentGetResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

## telemetryUserAgentGet

### Example Usage

```typescript
import { SDK } from "openapi";
import { TelemetryUserAgentGetResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.telemetry.telemetryUserAgentGet().then((res: TelemetryUserAgentGetResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```
