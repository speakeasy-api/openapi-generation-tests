# Second
(*Second*)

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
    globalQueryParam: "some example global query param");

var res = await sdk.Second.GetAsync();

// handle response
```


### Response

**[GroupSecondGetResponse](../../Models/Operations/GroupSecondGetResponse.md)**

