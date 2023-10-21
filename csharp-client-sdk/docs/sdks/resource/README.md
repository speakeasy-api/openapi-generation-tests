# ResourceSDK
(*Resource*)

### Available Operations

* [CreateFile](#createfile)
* [CreateResource](#createresource)
* [DeleteResource](#deleteresource)
* [GetResource](#getresource)
* [UpdateResource](#updateresource)

## CreateFile

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using SDK.Models.Operations;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Resource.CreateFileAsync(new CreateFileRequestBody() {
    File = new CreateFileRequestBodyFile() {
        Content = "`'$Z`(L/RH as bytes <<<>>>",
        File = "string",
    },
});

// handle response
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateFileRequestBody](../../models/operations/CreateFileRequestBody.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |


### Response

**[CreateFileResponse](../../models/operations/CreateFileResponse.md)**


## CreateResource

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using System;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Resource.CreateResourceAsync(new ExampleResource() {
    Chocolates = new List<ExampleResourceChocolates>() {
        new ExampleResourceChocolates() {
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
    MapOfInteger = new Dictionary<string, long>() {
        { "key", 271791 },
    },
    MapOfString = new Dictionary<string, string>() {
        { "key", "string" },
    },
});

// handle response
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [ExampleResource](../../models/shared/ExampleResource.md) | :heavy_check_mark:                                        | The request object to use for the request.                |


### Response

**[CreateResourceResponse](../../models/operations/CreateResourceResponse.md)**


## DeleteResource

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using SDK.Models.Operations;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Resource.DeleteResourceAsync("string");

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `ResourceId`       | *string*           | :heavy_check_mark: | N/A                |


### Response

**[DeleteResourceResponse](../../models/operations/DeleteResourceResponse.md)**


## GetResource

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using SDK.Models.Operations;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Resource.GetResourceAsync("string");

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `ResourceId`       | *string*           | :heavy_check_mark: | N/A                |


### Response

**[GetResourceResponse](../../models/operations/GetResourceResponse.md)**


## UpdateResource

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;
using SDK.Models.Operations;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Resource.UpdateResourceAsync("string");

// handle response
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `ResourceId`       | *string*           | :heavy_check_mark: | N/A                |


### Response

**[UpdateResourceResponse](../../models/operations/UpdateResourceResponse.md)**

