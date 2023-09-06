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
    content: "ab".encode(),
    file: "adipisci",
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
    6835.73,
  ],
  arrayOfString: [
    "id",
  ],
  chocolates: [
    {
      description: "suscipit",
    },
  ],
  createdAt: new Date("2022-05-14T14:45:53.115Z"),
  enumNumber: ExampleResourceEnumNumber.Two,
  enumStr: ExampleResourceEnumStr.Three,
  id: "8d67864d-bb67-45fd-9e60-b375ed4f6fbe",
  mapOfInteger: {
    "necessitatibus": 296556,
  },
  mapOfString: {
    "sunt": "asperiores",
  },
  name: "Ms. Ethel Farrell",
  updatedAt: new Date("2022-04-20T09:42:55.692Z"),
  vehicle: {
    createdAt: new Date("2022-03-25T18:38:24.627Z"),
    length: 583.56,
    name: "Randolph Bruen",
    type: ExampleBoatType.Boat,
    updatedAt: new Date("2022-11-13T12:32:25.289Z"),
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
const resourceId: string = "voluptas";

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
const resourceId: string = "voluptas";

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
const resourceId: string = "voluptas";

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

