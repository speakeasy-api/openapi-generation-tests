# SDKSecond
(*Nested.Second*)

### Available Operations

* [Get](#get)

## Get

### Example Usage

```go
package main

import(
	"openapi/v2/pkg/models/shared"
	openapi "openapi/v2"
	"context"
	"log"
	"net/http"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Nested.Second.Get(ctx)
    if err != nil {
        log.Fatal(err)
    }

    if res.StatusCode == http.StatusOK {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |


### Response

**[*operations.NestedSecondGetResponse](../../pkg/models/operations/nestedsecondgetresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |
