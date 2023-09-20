# Resource

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
    content: "culpa".encode(),
    file: "corrupti",
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
    8672.9,
  ],
  arrayOfString: [
    "totam",
  ],
  chocolates: [
    {
      description: "hic",
    },
  ],
  createdAt: new Date("2022-04-01T23:17:58.998Z"),
  enumNumber: ExampleResourceEnumNumber.One,
  enumStr: ExampleResourceEnumStr.Three,
  id: "2f2fb7b1-94a2-476b-a691-6fe1f08f4294",
  mapOfInteger: {
    "necessitatibus": 215529,
  },
  mapOfString: {
    "ea": "occaecati",
  },
  name: "Courtney Goldner",
  updatedAt: new Date("2021-10-18T02:58:04.604Z"),
  vehicle: {
    createdAt: new Date("2022-02-10T20:44:13.580Z"),
    length: 5058.66,
    name: "Alex Gottlieb",
    type: ExampleBoatType.Boat,
    updatedAt: new Date("2022-12-12T15:19:28.678Z"),
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
const resourceId: string = "nobis";

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
const resourceId: string = "error";

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
const resourceId: string = "veniam";

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

