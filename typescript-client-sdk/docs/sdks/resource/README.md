# resource

### Available Operations

* [createFile](#createfile)
* [createResource](#createresource)
* [deleteResource](#deleteresource)
* [getResource](#getresource)
* [updateResource](#updateresource)

## createFile

### Example Usage

```typescript
import { SDK } from "openapi";
import { CreateFileResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.resource.createFile({
  file: {
    content: "minima".encode(),
    file: "beatae",
  },
}).then((res: CreateFileResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `request`                                                                            | [operations.CreateFileRequestBody](../../models/operations/createfilerequestbody.md) | :heavy_check_mark:                                                                   | The request object to use for the request.                                           |
| `config`                                                                             | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                         | :heavy_minus_sign:                                                                   | Available config options for making requests.                                        |


### Response

**Promise<[operations.CreateFileResponse](../../models/operations/createfileresponse.md)>**


## createResource

### Example Usage

```typescript
import { SDK } from "openapi";
import { CreateResourceResponse } from "openapi/dist/sdk/models/operations";
import {
  ExampleBoatType,
  ExampleCarType,
  ExampleResourceEnumNumber,
  ExampleResourceEnumStr,
} from "openapi/dist/sdk/models/shared";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.resource.createResource({
  arrayOfNumber: [
    5896.95,
    9364.69,
    7453.98,
  ],
  arrayOfString: [
    "illum",
    "eaque",
    "earum",
    "perspiciatis",
  ],
  chocolates: [
    {
      description: "debitis",
    },
    {
      description: "aliquid",
    },
    {
      description: "porro",
    },
    {
      description: "suscipit",
    },
  ],
  createdAt: new Date("2022-11-08T01:11:44.885Z"),
  enumNumber: ExampleResourceEnumNumber.Three,
  enumStr: ExampleResourceEnumStr.Three,
  id: "3aed0117-9963-412f-9e04-771778ff61d0",
  mapOfInteger: {
    "odio": 271252,
  },
  mapOfString: {
    "ex": "consectetur",
    "aliquid": "ipsa",
  },
  name: "Ralph Hegmann",
  updatedAt: new Date("2022-05-12T16:43:21.506Z"),
  vehicle: {
    createdAt: new Date("2022-12-23T23:30:38.445Z"),
    length: 4317.6,
    name: "Miss Cora Olson",
    type: ExampleBoatType.Boat,
    updatedAt: new Date("2021-01-15T12:05:30.894Z"),
  },
}).then((res: CreateResourceResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                        | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `request`                                                        | [shared.ExampleResource](../../models/shared/exampleresource.md) | :heavy_check_mark:                                               | The request object to use for the request.                       |
| `config`                                                         | [AxiosRequestConfig](https://axios-http.com/docs/req_config)     | :heavy_minus_sign:                                               | Available config options for making requests.                    |


### Response

**Promise<[operations.CreateResourceResponse](../../models/operations/createresourceresponse.md)>**


## deleteResource

### Example Usage

```typescript
import { SDK } from "openapi";
import { DeleteResourceRequest, DeleteResourceResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const resourceId: string = "laborum";

sdk.resource.deleteResource(resourceId).then((res: DeleteResourceResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `resourceId`                                                 | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.DeleteResourceResponse](../../models/operations/deleteresourceresponse.md)>**


## getResource

### Example Usage

```typescript
import { SDK } from "openapi";
import { GetResourceRequest, GetResourceResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const resourceId: string = "libero";

sdk.resource.getResource(resourceId).then((res: GetResourceResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `resourceId`                                                 | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.GetResourceResponse](../../models/operations/getresourceresponse.md)>**


## updateResource

### Example Usage

```typescript
import { SDK } from "openapi";
import { UpdateResourceRequest, UpdateResourceResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const resourceId: string = "ad";

sdk.resource.updateResource(resourceId).then((res: UpdateResourceResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `resourceId`                                                 | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.UpdateResourceResponse](../../models/operations/updateresourceresponse.md)>**

