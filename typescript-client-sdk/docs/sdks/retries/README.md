# retries

## Overview

Endpoints for testing retries.

### Available Operations

* [retriesGet](#retriesget)

## retriesGet

### Example Usage

```typescript
import { SDK } from "openapi";
import { RetriesGetRequest, RetriesGetResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const requestId: string = "exercitationem";
const numRetries: number = 750765;

sdk.retries.retriesGet(requestId, numRetries).then((res: RetriesGetResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `requestId`                                                         | *string*                                                            | :heavy_check_mark:                                                  | N/A                                                                 |
| `numRetries`                                                        | *number*                                                            | :heavy_minus_sign:                                                  | N/A                                                                 |
| `retries`                                                           | [utils.RetryConfig](../../models/utils/retryconfig.md)              | :heavy_minus_sign:                                                  | Configuration to override the default retry behavior of the client. |
| `serverURL`                                                         | *string*                                                            | :heavy_minus_sign:                                                  | An optional server URL to use.                                      |
| `config`                                                            | [AxiosRequestConfig](https://axios-http.com/docs/req_config)        | :heavy_minus_sign:                                                  | Available config options for making requests.                       |


### Response

**Promise<[operations.RetriesGetResponse](../../models/operations/retriesgetresponse.md)>**

