# SDKFirst
(*Nest.First*)

### Available Operations

* [Get](#get)

## Get

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Nest.First.GetAsync();

// handle response
```


### Response

**[NestFirstGetResponse](../../Models/Operations/NestFirstGetResponse.md)**

