# Resource

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
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Resource.CreateFile(ctx, operations.CreateFileRequestBody{
        File: &operations.CreateFileRequestBodyFile{
            Content: []byte("quod"),
            File: "labore",
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
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
    res, err := s.Resource.CreateResource(ctx, shared.ExampleResource{
        ArrayOfNumber: []float64{
            704.47,
        },
        ArrayOfString: []string{
            "adipisci",
        },
        Chocolates: []shared.ExampleResourceChocolates{
            shared.ExampleResourceChocolates{
                Description: "fuga",
            },
        },
        CreatedAt: types.MustTimeFromString("2022-03-29T01:37:24.454Z"),
        EnumNumber: shared.ExampleResourceEnumNumberOne.ToPointer(),
        EnumStr: shared.ExampleResourceEnumStrTwo.ToPointer(),
        ID: "ae8d6786-4dbb-4675-bd5e-60b375ed4f6f",
        MapOfInteger: map[string]int64{
            "quidem": 904949,
        },
        MapOfString: map[string]string{
            "necessitatibus": "dolore",
        },
        Name: "Ollie Flatley",
        UpdatedAt: types.MustTimeFromString("2022-07-06T07:53:53.511Z"),
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
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    resourceID := "a"

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
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    resourceID := "debitis"

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
    s := sdk.New(
        sdk.WithSecurity(shared.Security{
            APIKeyAuth: sdk.String("Token YOUR_API_KEY"),
        }),
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    resourceID := "consectetur"

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

