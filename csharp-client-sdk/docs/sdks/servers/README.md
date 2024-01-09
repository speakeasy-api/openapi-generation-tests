# Servers
(*Servers*)

## Overview

Endpoints for testing servers.

### Available Operations

* [SelectGlobalServer](#selectglobalserver)
* [SelectServerWithID](#selectserverwithid) - Select a server by ID.
* [ServerWithProtocolTemplate](#serverwithprotocoltemplate)
* [ServerWithTemplates](#serverwithtemplates)
* [ServerWithTemplatesGlobal](#serverwithtemplatesglobal)
* [ServersByIDWithTemplates](#serversbyidwithtemplates)

## SelectGlobalServer

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Servers.SelectGlobalServerAsync();

// handle response
```


### Response

**[SelectGlobalServerResponse](../../Models/Operations/SelectGlobalServerResponse.md)**


## SelectServerWithID

Select a server by ID.

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Servers.SelectServerWithIDAsync();

// handle response
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[SelectServerWithIDResponse](../../Models/Operations/SelectServerWithIDResponse.md)**


## ServerWithProtocolTemplate

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Servers.ServerWithProtocolTemplateAsync();

// handle response
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[ServerWithProtocolTemplateResponse](../../Models/Operations/ServerWithProtocolTemplateResponse.md)**


## ServerWithTemplates

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Servers.ServerWithTemplatesAsync();

// handle response
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[ServerWithTemplatesResponse](../../Models/Operations/ServerWithTemplatesResponse.md)**


## ServerWithTemplatesGlobal

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Servers.ServerWithTemplatesGlobalAsync();

// handle response
```


### Response

**[ServerWithTemplatesGlobalResponse](../../Models/Operations/ServerWithTemplatesGlobalResponse.md)**


## ServersByIDWithTemplates

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Servers.ServersByIDWithTemplatesAsync();

// handle response
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *string*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[ServersByIDWithTemplatesResponse](../../Models/Operations/ServersByIDWithTemplatesResponse.md)**

