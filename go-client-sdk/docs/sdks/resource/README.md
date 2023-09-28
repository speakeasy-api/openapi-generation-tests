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
            Content: []byte("veniam"),
            File: "animi",
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
            1753.72,
        },
        ArrayOfString: []string{
            "nam",
        },
        Chocolates: []shared.ExampleResourceChocolates{
            shared.ExampleResourceChocolates{
                Description: "dicta",
            },
        },
        CreatedAt: types.MustTimeFromString("2022-02-06T13:10:02.431Z"),
        EnumNumber: shared.ExampleResourceEnumNumberThree.ToPointer(),
        EnumStr: shared.ExampleResourceEnumStrOne.ToPointer(),
        ID: "7f116db9-9545-4fc9-9fa8-8970e189dbb3",
        MapOfInteger: map[string]int64{
            "doloremque": 963976,
        },
        MapOfString: map[string]string{
            "impedit": "cum",
        },
        Name: "Sylvia Turner II",
        UpdatedAt: types.MustTimeFromString("2022-04-10T11:16:06.933Z"),
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
    resourceID := "architecto"

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
    resourceID := "cupiditate"

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
    resourceID := "molestiae"

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

