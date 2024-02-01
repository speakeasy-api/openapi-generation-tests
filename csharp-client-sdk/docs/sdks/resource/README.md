# Resource
(*Resource*)

### Available Operations

* [CreateFile](#createfile)
* [CreateResource](#createresource)
* [DeleteResource](#deleteresource)
* [GetArrayDataSource](#getarraydatasource)
* [GetResource](#getresource)
* [UpdateResource](#updateresource)

## CreateFile

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

CreateFileRequestBody req = new CreateFileRequestBody() {
    File = new CreateFileFile() {
        Content = "0xf10df1a3b9 as bytes <<<>>>",
        FileName = "rap_national.mp4v",
    },
};

var res = await sdk.Resource.CreateFileAsync(req);

// handle response
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateFileRequestBody](../../Models/Operations/CreateFileRequestBody.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |


### Response

**[CreateFileResponse](../../Models/Operations/CreateFileResponse.md)**


## CreateResource

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

ExampleResource req = new ExampleResource() {
    Chocolates = new List<Chocolates>() {
        new Chocolates() {
            Description = "Digitized optimal archive",
        },
    },
    Id = "<ID>",
    Name = "string",
    Vehicle = "string",
    ArrayOfNumber = new List<double>() {
        1124.19D,
    },
    ArrayOfString = new List<string>() {
        "string",
    },
    InlineObject = new InlineObject() {},
    MapOfInteger = new Dictionary<string, long>() {
        { "key", 271791 },
    },
    MapOfString = new Dictionary<string, string>() {
        { "key", "string" },
    },
};

var res = await sdk.Resource.CreateResourceAsync(req);

// handle response
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [ExampleResource](../../Models/Shared/ExampleResource.md) | :heavy_check_mark:                                        | The request object to use for the request.                |


### Response

**[CreateResourceResponse](../../Models/Operations/CreateResourceResponse.md)**


## DeleteResource

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Resource.DeleteResourceAsync(resourceId: "string");

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `ResourceId`       | *string*           | :heavy_check_mark: | N/A                |


### Response

**[DeleteResourceResponse](../../Models/Operations/DeleteResourceResponse.md)**


## GetArrayDataSource

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Resource.GetArrayDataSourceAsync(filter: "string");

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `Filter`           | *string*           | :heavy_check_mark: | N/A                |


### Response

**[GetArrayDataSourceResponse](../../Models/Operations/GetArrayDataSourceResponse.md)**


## GetResource

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Resource.GetResourceAsync(resourceId: "string");

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `ResourceId`       | *string*           | :heavy_check_mark: | N/A                |


### Response

**[GetResourceResponse](../../Models/Operations/GetResourceResponse.md)**


## UpdateResource

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using Openapi.Models.Operations;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Resource.UpdateResourceAsync(
    augment: "string",
    resourceId: "string");

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `Augment`          | *string*           | :heavy_check_mark: | N/A                |
| `ResourceId`       | *string*           | :heavy_check_mark: | N/A                |


### Response

**[UpdateResourceResponse](../../Models/Operations/UpdateResourceResponse.md)**

