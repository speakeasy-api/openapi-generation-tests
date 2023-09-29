# Resource
(*Resource*)

### Available Operations

* [CreateFile](#createfile)
* [CreateResource](#createresource)
* [DeleteResource](#deleteresource)
* [GetResource](#getresource)
* [UpdateResource](#updateresource)

## CreateFile

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"openapi/pkg/models/operations"
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
    res, err := s.Resource.CreateFile(ctx, operations.CreateFileRequestBody{
        File: &operations.CreateFileRequestBodyFile{
            Content: []byte("`'$Z`(L/RH"),
            File: "Rap National",
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.FileResource != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `ctx`                                                                                | [context.Context](https://pkg.go.dev/context#Context)                                | :heavy_check_mark:                                                                   | The context to use for the request.                                                  |
| `request`                                                                            | [operations.CreateFileRequestBody](../../models/operations/createfilerequestbody.md) | :heavy_check_mark:                                                                   | The request object to use for the request.                                           |


### Response

**[*operations.CreateFileResponse](../../models/operations/createfileresponse.md), error**


## CreateResource

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"openapi/pkg/types"
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
    res, err := s.Resource.CreateResource(ctx, shared.ExampleResource{
        ArrayOfNumber: []float64{
            1867.47,
        },
        ArrayOfString: []string{
            "Sodium",
        },
        Chocolates: []shared.ExampleResourceChocolates{
            shared.ExampleResourceChocolates{
                Description: "Cross-group didactic system engine",
            },
        },
        CreatedAt: types.MustTimeFromString("2022-04-19T19:55:28.761Z"),
        EnumNumber: shared.ExampleResourceEnumNumberOne.ToPointer(),
        EnumStr: shared.ExampleResourceEnumStrOne.ToPointer(),
        ID: "<ID>",
        MapOfInteger: map[string]int64{
            "reiciendis": 154578,
        },
        MapOfString: map[string]string{
            "quasi": "utilize",
        },
        Name: "online",
        UpdatedAt: types.MustTimeFromString("2021-12-27T00:23:19.559Z"),
        Vehicle: shared.ExampleVehicle{},
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.ExampleResource != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                        | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `ctx`                                                            | [context.Context](https://pkg.go.dev/context#Context)            | :heavy_check_mark:                                               | The context to use for the request.                              |
| `request`                                                        | [shared.ExampleResource](../../models/shared/exampleresource.md) | :heavy_check_mark:                                               | The request object to use for the request.                       |


### Response

**[*operations.CreateResourceResponse](../../models/operations/createresourceresponse.md), error**


## DeleteResource

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"openapi/pkg/models/operations"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    resourceID := "Reggae"

    ctx := context.Background()
    res, err := s.Resource.DeleteResource(ctx, resourceID)
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
| `resourceID`                                          | *string*                                              | :heavy_check_mark:                                    | N/A                                                   |


### Response

**[*operations.DeleteResourceResponse](../../models/operations/deleteresourceresponse.md), error**


## GetResource

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"openapi/pkg/models/operations"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    resourceID := "Home"

    ctx := context.Background()
    res, err := s.Resource.GetResource(ctx, resourceID)
    if err != nil {
        log.Fatal(err)
    }

    if res.ExampleResource != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `resourceID`                                          | *string*                                              | :heavy_check_mark:                                    | N/A                                                   |


### Response

**[*operations.GetResourceResponse](../../models/operations/getresourceresponse.md), error**


## UpdateResource

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"openapi/pkg/models/operations"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    resourceID := "International"

    ctx := context.Background()
    res, err := s.Resource.UpdateResource(ctx, resourceID)
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
| `resourceID`                                          | *string*                                              | :heavy_check_mark:                                    | N/A                                                   |


### Response

**[*operations.UpdateResourceResponse](../../models/operations/updateresourceresponse.md), error**

