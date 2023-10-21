# SecondSDK
(*Second*)

### Available Operations

* [Get](#get)

## Get

### Example Usage

```csharp
using SDK;
using SDK.Models.Shared;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Second.GetAsync();

// handle response
```


### Response

**[GroupSecondGetResponse](../../models/operations/GroupSecondGetResponse.md)**

