# RequestBodies
(*RequestBodies*)

## Overview

Endpoints for testing request bodies.

### Available Operations

* [NullableObjectPost](#nullableobjectpost)
* [NullableRequiredEmptyObjectPost](#nullablerequiredemptyobjectpost)
* [NullableRequiredPropertyPost](#nullablerequiredpropertypost)
* [NullableRequiredSharedObjectPost](#nullablerequiredsharedobjectpost)
* [RequestBodyPostApplicationJSONArray](#requestbodypostapplicationjsonarray)
* [RequestBodyPostApplicationJSONArrayCamelCase](#requestbodypostapplicationjsonarraycamelcase)
* [RequestBodyPostApplicationJSONArrayObj](#requestbodypostapplicationjsonarrayobj)
* [RequestBodyPostApplicationJSONArrayObjCamelCase](#requestbodypostapplicationjsonarrayobjcamelcase)
* [RequestBodyPostApplicationJSONArrayOfArray](#requestbodypostapplicationjsonarrayofarray)
* [RequestBodyPostApplicationJSONArrayOfArrayCamelCase](#requestbodypostapplicationjsonarrayofarraycamelcase)
* [RequestBodyPostApplicationJSONArrayOfArrayOfPrimitive](#requestbodypostapplicationjsonarrayofarrayofprimitive)
* [RequestBodyPostApplicationJSONArrayOfMap](#requestbodypostapplicationjsonarrayofmap)
* [RequestBodyPostApplicationJSONArrayOfMapCamelCase](#requestbodypostapplicationjsonarrayofmapcamelcase)
* [RequestBodyPostApplicationJSONArrayOfPrimitive](#requestbodypostapplicationjsonarrayofprimitive)
* [RequestBodyPostApplicationJSONDeep](#requestbodypostapplicationjsondeep)
* [RequestBodyPostApplicationJSONDeepCamelCase](#requestbodypostapplicationjsondeepcamelcase)
* [RequestBodyPostApplicationJSONMap](#requestbodypostapplicationjsonmap)
* [RequestBodyPostApplicationJSONMapCamelCase](#requestbodypostapplicationjsonmapcamelcase)
* [RequestBodyPostApplicationJSONMapObj](#requestbodypostapplicationjsonmapobj)
* [RequestBodyPostApplicationJSONMapObjCamelCase](#requestbodypostapplicationjsonmapobjcamelcase)
* [RequestBodyPostApplicationJSONMapOfArray](#requestbodypostapplicationjsonmapofarray)
* [RequestBodyPostApplicationJSONMapOfArrayCamelCase](#requestbodypostapplicationjsonmapofarraycamelcase)
* [RequestBodyPostApplicationJSONMapOfMap](#requestbodypostapplicationjsonmapofmap)
* [RequestBodyPostApplicationJSONMapOfMapCamelCase](#requestbodypostapplicationjsonmapofmapcamelcase)
* [RequestBodyPostApplicationJSONMapOfMapOfPrimitive](#requestbodypostapplicationjsonmapofmapofprimitive)
* [RequestBodyPostApplicationJSONMapOfPrimitive](#requestbodypostapplicationjsonmapofprimitive)
* [RequestBodyPostApplicationJSONMultipleJSONFiltered](#requestbodypostapplicationjsonmultiplejsonfiltered)
* [RequestBodyPostApplicationJSONSimple](#requestbodypostapplicationjsonsimple)
* [RequestBodyPostApplicationJSONSimpleCamelCase](#requestbodypostapplicationjsonsimplecamelcase)
* [RequestBodyPostComplexNumberTypes](#requestbodypostcomplexnumbertypes)
* [RequestBodyPostDefaultsAndConsts](#requestbodypostdefaultsandconsts)
* [RequestBodyPostEmptyObject](#requestbodypostemptyobject)
* [RequestBodyPostFormDeep](#requestbodypostformdeep)
* [RequestBodyPostFormMapPrimitive](#requestbodypostformmapprimitive)
* [RequestBodyPostFormSimple](#requestbodypostformsimple)
* [RequestBodyPostJSONDataTypesArrayBigInt](#requestbodypostjsondatatypesarraybigint)
* [RequestBodyPostJSONDataTypesArrayDate](#requestbodypostjsondatatypesarraydate)
* [RequestBodyPostJSONDataTypesArrayDecimalStr](#requestbodypostjsondatatypesarraydecimalstr)
* [RequestBodyPostJSONDataTypesBigInt](#requestbodypostjsondatatypesbigint)
* [RequestBodyPostJSONDataTypesBigIntStr](#requestbodypostjsondatatypesbigintstr)
* [RequestBodyPostJSONDataTypesBoolean](#requestbodypostjsondatatypesboolean)
* [RequestBodyPostJSONDataTypesDate](#requestbodypostjsondatatypesdate)
* [RequestBodyPostJSONDataTypesDateTime](#requestbodypostjsondatatypesdatetime)
* [RequestBodyPostJSONDataTypesDecimal](#requestbodypostjsondatatypesdecimal)
* [RequestBodyPostJSONDataTypesDecimalStr](#requestbodypostjsondatatypesdecimalstr)
* [RequestBodyPostJSONDataTypesFloat32](#requestbodypostjsondatatypesfloat32)
* [RequestBodyPostJSONDataTypesInt32](#requestbodypostjsondatatypesint32)
* [RequestBodyPostJSONDataTypesInteger](#requestbodypostjsondatatypesinteger)
* [RequestBodyPostJSONDataTypesMapBigIntStr](#requestbodypostjsondatatypesmapbigintstr)
* [RequestBodyPostJSONDataTypesMapDateTime](#requestbodypostjsondatatypesmapdatetime)
* [RequestBodyPostJSONDataTypesMapDecimal](#requestbodypostjsondatatypesmapdecimal)
* [RequestBodyPostJSONDataTypesNumber](#requestbodypostjsondatatypesnumber)
* [RequestBodyPostJSONDataTypesString](#requestbodypostjsondatatypesstring)
* [RequestBodyPostMultipleContentTypesComponentFiltered](#requestbodypostmultiplecontenttypescomponentfiltered)
* [RequestBodyPostMultipleContentTypesInlineFiltered](#requestbodypostmultiplecontenttypesinlinefiltered)
* [RequestBodyPostMultipleContentTypesSplitParamForm](#requestbodypostmultiplecontenttypessplitparamform)
* [RequestBodyPostMultipleContentTypesSplitParamJSON](#requestbodypostmultiplecontenttypessplitparamjson)
* [RequestBodyPostMultipleContentTypesSplitParamMultipart](#requestbodypostmultiplecontenttypessplitparammultipart)
* [RequestBodyPostMultipleContentTypesSplitForm](#requestbodypostmultiplecontenttypessplitform)
* [RequestBodyPostMultipleContentTypesSplitJSON](#requestbodypostmultiplecontenttypessplitjson)
* [RequestBodyPostMultipleContentTypesSplitMultipart](#requestbodypostmultiplecontenttypessplitmultipart)
* [RequestBodyPostNotNullableNotRequiredStringBody](#requestbodypostnotnullablenotrequiredstringbody)
* [RequestBodyPostNullArray](#requestbodypostnullarray)
* [RequestBodyPostNullDictionary](#requestbodypostnulldictionary)
* [RequestBodyPostNullableNotRequiredStringBody](#requestbodypostnullablenotrequiredstringbody)
* [RequestBodyPostNullableRequiredStringBody](#requestbodypostnullablerequiredstringbody)
* [RequestBodyPutBytes](#requestbodyputbytes)
* [RequestBodyPutBytesWithParams](#requestbodyputbyteswithparams)
* [RequestBodyPutMultipartDeep](#requestbodyputmultipartdeep)
* [RequestBodyPutMultipartDifferentFileName](#requestbodyputmultipartdifferentfilename)
* [RequestBodyPutMultipartFile](#requestbodyputmultipartfile)
* [RequestBodyPutMultipartSimple](#requestbodyputmultipartsimple)
* [RequestBodyPutString](#requestbodyputstring)
* [RequestBodyPutStringWithParams](#requestbodyputstringwithparams)
* [RequestBodyReadAndWrite](#requestbodyreadandwrite)
* [RequestBodyReadOnlyInput](#requestbodyreadonlyinput)
* [RequestBodyReadOnlyUnion](#requestbodyreadonlyunion)
* [RequestBodyReadWriteOnlyUnion](#requestbodyreadwriteonlyunion)
* [RequestBodyWriteOnly](#requestbodywriteonly)
* [RequestBodyWriteOnlyOutput](#requestbodywriteonlyoutput)
* [RequestBodyWriteOnlyUnion](#requestbodywriteonlyunion)

## NullableObjectPost

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.NullableObjectPost(ctx, &shared.NullableObject{
        Required: 302382,
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                      | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `ctx`                                                          | [context.Context](https://pkg.go.dev/context#Context)          | :heavy_check_mark:                                             | The context to use for the request.                            |
| `request`                                                      | [shared.NullableObject](../../models/shared/nullableobject.md) | :heavy_check_mark:                                             | The request object to use for the request.                     |


### Response

**[*operations.NullableObjectPostResponse](../../models/operations/nullableobjectpostresponse.md), error**


## NullableRequiredEmptyObjectPost

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
    res, err := s.RequestBodies.NullableRequiredEmptyObjectPost(ctx, operations.NullableRequiredEmptyObjectPostRequestBody{
        NullableOptionalObj: &operations.NullableRequiredEmptyObjectPostRequestBodyNullableOptionalObj{},
        NullableRequiredObj: &operations.NullableRequiredEmptyObjectPostRequestBodyNullableRequiredObj{},
        RequiredObj: operations.NullableRequiredEmptyObjectPostRequestBodyRequiredObj{},
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.NullableRequiredEmptyObjectPost200ApplicationJSONString != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                                          | [context.Context](https://pkg.go.dev/context#Context)                                                                          | :heavy_check_mark:                                                                                                             | The context to use for the request.                                                                                            |
| `request`                                                                                                                      | [operations.NullableRequiredEmptyObjectPostRequestBody](../../models/operations/nullablerequiredemptyobjectpostrequestbody.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[*operations.NullableRequiredEmptyObjectPostResponse](../../models/operations/nullablerequiredemptyobjectpostresponse.md), error**


## NullableRequiredPropertyPost

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
    res, err := s.RequestBodies.NullableRequiredPropertyPost(ctx, operations.NullableRequiredPropertyPostRequestBody{
        NullableRequiredArray: []float64{
            2355.17,
        },
        NullableRequiredEnum: operations.NullableRequiredPropertyPostRequestBodyNullableRequiredEnumSecond,
        NullableRequiredInt: 50266,
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.NullableRequiredPropertyPost200ApplicationJSONString != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                                    | [context.Context](https://pkg.go.dev/context#Context)                                                                    | :heavy_check_mark:                                                                                                       | The context to use for the request.                                                                                      |
| `request`                                                                                                                | [operations.NullableRequiredPropertyPostRequestBody](../../models/operations/nullablerequiredpropertypostrequestbody.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[*operations.NullableRequiredPropertyPostResponse](../../models/operations/nullablerequiredpropertypostresponse.md), error**


## NullableRequiredSharedObjectPost

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
    res, err := s.RequestBodies.NullableRequiredSharedObjectPost(ctx, operations.NullableRequiredSharedObjectPostRequestBody{
        NullableOptionalObj: &shared.NullableObject{
            Required: 86533,
        },
        NullableRequiredObj: &shared.NullableObject{
            Required: 964394,
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.NullableRequiredSharedObjectPost200ApplicationJSONString != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                            | [context.Context](https://pkg.go.dev/context#Context)                                                                            | :heavy_check_mark:                                                                                                               | The context to use for the request.                                                                                              |
| `request`                                                                                                                        | [operations.NullableRequiredSharedObjectPostRequestBody](../../models/operations/nullablerequiredsharedobjectpostrequestbody.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[*operations.NullableRequiredSharedObjectPostResponse](../../models/operations/nullablerequiredsharedobjectpostresponse.md), error**


## RequestBodyPostApplicationJSONArray

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"math/big"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArray(ctx, []shared.SimpleObject{
        shared.SimpleObject{
            Any: "any",
            Bigint: big.NewInt(8821239038968084),
            BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
            Bool: true,
            BoolOpt: openapi.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
            Decimal: types.MustNewDecimalFromString("3.141592653589793"),
            DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
            Enum: shared.EnumOne,
            Float32: 1.1,
            Int: 1,
            Int32: 1,
            Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
            IntEnum: shared.SimpleObjectIntEnumSecond,
            Num: 1.1,
            Str: "test",
            StrOpt: openapi.String("testOptional"),
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.SimpleObjects != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `ctx`                                                    | [context.Context](https://pkg.go.dev/context#Context)    | :heavy_check_mark:                                       | The context to use for the request.                      |
| `request`                                                | [[]shared.SimpleObject](../../models//.md)               | :heavy_check_mark:                                       | The request object to use for the request.               |
| `opts`                                                   | [][operations.Option](../../models/operations/option.md) | :heavy_minus_sign:                                       | The options for this request.                            |


### Response

**[*operations.RequestBodyPostApplicationJSONArrayResponse](../../models/operations/requestbodypostapplicationjsonarrayresponse.md), error**


## RequestBodyPostApplicationJSONArrayCamelCase

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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayCamelCase(ctx, []shared.SimpleObjectCamelCase{
        shared.SimpleObjectCamelCase{
            AnyVal: "any example",
            BoolOptVal: openapi.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
            EnumVal: shared.EnumOne,
            Float32Val: 2.2222222,
            Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValSixtyNine,
            Int32Val: 1,
            IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValThird,
            IntOptNullVal: openapi.Int64(999999),
            IntVal: 999999,
            NumOptNullVal: openapi.Float64(1.1),
            NumVal: 1.1,
            StrOptVal: openapi.String("optional example"),
            StrVal: "example",
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.SimpleObjectCamelCases != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `ctx`                                                    | [context.Context](https://pkg.go.dev/context#Context)    | :heavy_check_mark:                                       | The context to use for the request.                      |
| `request`                                                | [[]shared.SimpleObjectCamelCase](../../models//.md)      | :heavy_check_mark:                                       | The request object to use for the request.               |
| `opts`                                                   | [][operations.Option](../../models/operations/option.md) | :heavy_minus_sign:                                       | The options for this request.                            |


### Response

**[*operations.RequestBodyPostApplicationJSONArrayCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonarraycamelcaseresponse.md), error**


## RequestBodyPostApplicationJSONArrayObj

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"math/big"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayObj(ctx, []shared.SimpleObject{
        shared.SimpleObject{
            Any: "any",
            Bigint: big.NewInt(8821239038968084),
            BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
            Bool: true,
            BoolOpt: openapi.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
            Decimal: types.MustNewDecimalFromString("3.141592653589793"),
            DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
            Enum: shared.EnumOne,
            Float32: 1.1,
            Int: 1,
            Int32: 1,
            Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
            IntEnum: shared.SimpleObjectIntEnumSecond,
            Num: 1.1,
            Str: "test",
            StrOpt: openapi.String("testOptional"),
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.ArrObjValue != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [[]shared.SimpleObject](../../models//.md)            | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostApplicationJSONArrayObjResponse](../../models/operations/requestbodypostapplicationjsonarrayobjresponse.md), error**


## RequestBodyPostApplicationJSONArrayObjCamelCase

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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayObjCamelCase(ctx, []shared.SimpleObjectCamelCase{
        shared.SimpleObjectCamelCase{
            AnyVal: "any example",
            BoolOptVal: openapi.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
            EnumVal: shared.EnumOne,
            Float32Val: 2.2222222,
            Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValSixtyNine,
            Int32Val: 1,
            IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValThird,
            IntOptNullVal: openapi.Int64(999999),
            IntVal: 999999,
            NumOptNullVal: openapi.Float64(1.1),
            NumVal: 1.1,
            StrOptVal: openapi.String("optional example"),
            StrVal: "example",
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.ArrObjValueCamelCase != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [[]shared.SimpleObjectCamelCase](../../models//.md)   | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostApplicationJSONArrayObjCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonarrayobjcamelcaseresponse.md), error**


## RequestBodyPostApplicationJSONArrayOfArray

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"math/big"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfArray(ctx, [][]shared.SimpleObject{
        []shared.SimpleObject{
            shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Int: 1,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumSecond,
                Num: 1.1,
                Str: "test",
                StrOpt: openapi.String("testOptional"),
            },
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Arrs != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `ctx`                                                    | [context.Context](https://pkg.go.dev/context#Context)    | :heavy_check_mark:                                       | The context to use for the request.                      |
| `request`                                                | [[][]shared.SimpleObject](../../models//.md)             | :heavy_check_mark:                                       | The request object to use for the request.               |
| `opts`                                                   | [][operations.Option](../../models/operations/option.md) | :heavy_minus_sign:                                       | The options for this request.                            |


### Response

**[*operations.RequestBodyPostApplicationJSONArrayOfArrayResponse](../../models/operations/requestbodypostapplicationjsonarrayofarrayresponse.md), error**


## RequestBodyPostApplicationJSONArrayOfArrayCamelCase

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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfArrayCamelCase(ctx, [][]shared.SimpleObjectCamelCase{
        []shared.SimpleObjectCamelCase{
            shared.SimpleObjectCamelCase{
                AnyVal: "any example",
                BoolOptVal: openapi.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                EnumVal: shared.EnumOne,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValThird,
                IntOptNullVal: openapi.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: openapi.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: openapi.String("optional example"),
                StrVal: "example",
            },
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Arrs != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `ctx`                                                    | [context.Context](https://pkg.go.dev/context#Context)    | :heavy_check_mark:                                       | The context to use for the request.                      |
| `request`                                                | [[][]shared.SimpleObjectCamelCase](../../models//.md)    | :heavy_check_mark:                                       | The request object to use for the request.               |
| `opts`                                                   | [][operations.Option](../../models/operations/option.md) | :heavy_minus_sign:                                       | The options for this request.                            |


### Response

**[*operations.RequestBodyPostApplicationJSONArrayOfArrayCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonarrayofarraycamelcaseresponse.md), error**


## RequestBodyPostApplicationJSONArrayOfArrayOfPrimitive

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfArrayOfPrimitive(ctx, [][]string{
        []string{
            "string",
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Arrs != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `ctx`                                                    | [context.Context](https://pkg.go.dev/context#Context)    | :heavy_check_mark:                                       | The context to use for the request.                      |
| `request`                                                | [[][]string](../../models//.md)                          | :heavy_check_mark:                                       | The request object to use for the request.               |
| `opts`                                                   | [][operations.Option](../../models/operations/option.md) | :heavy_minus_sign:                                       | The options for this request.                            |


### Response

**[*operations.RequestBodyPostApplicationJSONArrayOfArrayOfPrimitiveResponse](../../models/operations/requestbodypostapplicationjsonarrayofarrayofprimitiveresponse.md), error**


## RequestBodyPostApplicationJSONArrayOfMap

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"math/big"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfMap(ctx, []map[string]shared.SimpleObject{
        map[string]shared.SimpleObject{
            "key": shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Int: 1,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumSecond,
                Num: 1.1,
                Str: "test",
                StrOpt: openapi.String("testOptional"),
            },
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Maps != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `ctx`                                                    | [context.Context](https://pkg.go.dev/context#Context)    | :heavy_check_mark:                                       | The context to use for the request.                      |
| `request`                                                | [[]map[string]shared.SimpleObject](../../models//.md)    | :heavy_check_mark:                                       | The request object to use for the request.               |
| `opts`                                                   | [][operations.Option](../../models/operations/option.md) | :heavy_minus_sign:                                       | The options for this request.                            |


### Response

**[*operations.RequestBodyPostApplicationJSONArrayOfMapResponse](../../models/operations/requestbodypostapplicationjsonarrayofmapresponse.md), error**


## RequestBodyPostApplicationJSONArrayOfMapCamelCase

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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfMapCamelCase(ctx, []map[string]shared.SimpleObjectCamelCase{
        map[string]shared.SimpleObjectCamelCase{
            "key": shared.SimpleObjectCamelCase{
                AnyVal: "any example",
                BoolOptVal: openapi.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                EnumVal: shared.EnumOne,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValThird,
                IntOptNullVal: openapi.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: openapi.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: openapi.String("optional example"),
                StrVal: "example",
            },
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Maps != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                      | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `ctx`                                                          | [context.Context](https://pkg.go.dev/context#Context)          | :heavy_check_mark:                                             | The context to use for the request.                            |
| `request`                                                      | [[]map[string]shared.SimpleObjectCamelCase](../../models//.md) | :heavy_check_mark:                                             | The request object to use for the request.                     |
| `opts`                                                         | [][operations.Option](../../models/operations/option.md)       | :heavy_minus_sign:                                             | The options for this request.                                  |


### Response

**[*operations.RequestBodyPostApplicationJSONArrayOfMapCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonarrayofmapcamelcaseresponse.md), error**


## RequestBodyPostApplicationJSONArrayOfPrimitive

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfPrimitive(ctx, []string{
        "string",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Strings != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `ctx`                                                    | [context.Context](https://pkg.go.dev/context#Context)    | :heavy_check_mark:                                       | The context to use for the request.                      |
| `request`                                                | [[]string](../../models//.md)                            | :heavy_check_mark:                                       | The request object to use for the request.               |
| `opts`                                                   | [][operations.Option](../../models/operations/option.md) | :heavy_minus_sign:                                       | The options for this request.                            |


### Response

**[*operations.RequestBodyPostApplicationJSONArrayOfPrimitiveResponse](../../models/operations/requestbodypostapplicationjsonarrayofprimitiveresponse.md), error**


## RequestBodyPostApplicationJSONDeep

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"math/big"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONDeep(ctx, shared.DeepObject{
        Any: shared.CreateDeepObjectAnySimpleObject(
                shared.SimpleObject{
                    Any: "any",
                    Bigint: big.NewInt(8821239038968084),
                    BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                    Bool: true,
                    BoolOpt: openapi.Bool(true),
                    Date: types.MustDateFromString("2020-01-01"),
                    DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
                    Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                    DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                    Enum: shared.EnumOne,
                    Float32: 1.1,
                    Int: 1,
                    Int32: 1,
                    Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
                    IntEnum: shared.SimpleObjectIntEnumSecond,
                    Num: 1.1,
                    Str: "test",
                    StrOpt: openapi.String("testOptional"),
                },
        ),
        Arr: []shared.SimpleObject{
            shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Int: 1,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumSecond,
                Num: 1.1,
                Str: "test",
                StrOpt: openapi.String("testOptional"),
            },
            shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Int: 1,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumSecond,
                Num: 1.1,
                Str: "test",
                StrOpt: openapi.String("testOptional"),
            },
        },
        Bool: true,
        Int: 1,
        Map: map[string]shared.SimpleObject{
            "key": shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Int: 1,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumSecond,
                Num: 1.1,
                Str: "test",
                StrOpt: openapi.String("testOptional"),
            },
            "key2": shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Int: 1,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumSecond,
                Num: 1.1,
                Str: "test",
                StrOpt: openapi.String("testOptional"),
            },
        },
        Num: 1.1,
        Obj: shared.SimpleObject{
            Any: "any",
            Bigint: big.NewInt(8821239038968084),
            BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
            Bool: true,
            BoolOpt: openapi.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
            Decimal: types.MustNewDecimalFromString("3.141592653589793"),
            DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
            Enum: shared.EnumOne,
            Float32: 1.1,
            Int: 1,
            Int32: 1,
            Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
            IntEnum: shared.SimpleObjectIntEnumSecond,
            Num: 1.1,
            Str: "test",
            StrOpt: openapi.String("testOptional"),
        },
        Str: "test",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                              | Type                                                   | Required                                               | Description                                            |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `ctx`                                                  | [context.Context](https://pkg.go.dev/context#Context)  | :heavy_check_mark:                                     | The context to use for the request.                    |
| `request`                                              | [shared.DeepObject](../../models/shared/deepobject.md) | :heavy_check_mark:                                     | The request object to use for the request.             |


### Response

**[*operations.RequestBodyPostApplicationJSONDeepResponse](../../models/operations/requestbodypostapplicationjsondeepresponse.md), error**


## RequestBodyPostApplicationJSONDeepCamelCase

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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONDeepCamelCase(ctx, shared.DeepObjectCamelCase{
        AnyVal: shared.CreateDeepObjectCamelCaseAnyValSimpleObjectCamelCase(
                shared.SimpleObjectCamelCase{
                    AnyVal: "any example",
                    BoolOptVal: openapi.Bool(true),
                    BoolVal: true,
                    DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                    DateVal: types.MustDateFromString("2020-01-01"),
                    EnumVal: shared.EnumOne,
                    Float32Val: 2.2222222,
                    Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValSixtyNine,
                    Int32Val: 1,
                    IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValThird,
                    IntOptNullVal: openapi.Int64(999999),
                    IntVal: 999999,
                    NumOptNullVal: openapi.Float64(1.1),
                    NumVal: 1.1,
                    StrOptVal: openapi.String("optional example"),
                    StrVal: "example",
                },
        ),
        ArrVal: []shared.SimpleObjectCamelCase{
            shared.SimpleObjectCamelCase{
                AnyVal: "any example",
                BoolOptVal: openapi.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                EnumVal: shared.EnumOne,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValThird,
                IntOptNullVal: openapi.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: openapi.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: openapi.String("optional example"),
                StrVal: "example",
            },
        },
        BoolVal: false,
        IntVal: 962909,
        MapVal: map[string]shared.SimpleObjectCamelCase{
            "key": shared.SimpleObjectCamelCase{
                AnyVal: "any example",
                BoolOptVal: openapi.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                EnumVal: shared.EnumOne,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValThird,
                IntOptNullVal: openapi.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: openapi.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: openapi.String("optional example"),
                StrVal: "example",
            },
        },
        NumVal: 2064.4,
        ObjVal: shared.SimpleObjectCamelCase{
            AnyVal: "any example",
            BoolOptVal: openapi.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
            EnumVal: shared.EnumOne,
            Float32Val: 2.2222222,
            Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValSixtyNine,
            Int32Val: 1,
            IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValThird,
            IntOptNullVal: openapi.Int64(999999),
            IntVal: 999999,
            NumOptNullVal: openapi.Float64(1.1),
            NumVal: 1.1,
            StrOptVal: openapi.String("optional example"),
            StrVal: "example",
        },
        StrVal: "string",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `ctx`                                                                    | [context.Context](https://pkg.go.dev/context#Context)                    | :heavy_check_mark:                                                       | The context to use for the request.                                      |
| `request`                                                                | [shared.DeepObjectCamelCase](../../models/shared/deepobjectcamelcase.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |


### Response

**[*operations.RequestBodyPostApplicationJSONDeepCamelCaseResponse](../../models/operations/requestbodypostapplicationjsondeepcamelcaseresponse.md), error**


## RequestBodyPostApplicationJSONMap

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"math/big"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMap(ctx, map[string]shared.SimpleObject{
        "key": shared.SimpleObject{
            Any: "any",
            Bigint: big.NewInt(8821239038968084),
            BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
            Bool: true,
            BoolOpt: openapi.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
            Decimal: types.MustNewDecimalFromString("3.141592653589793"),
            DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
            Enum: shared.EnumOne,
            Float32: 1.1,
            Int: 1,
            Int32: 1,
            Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
            IntEnum: shared.SimpleObjectIntEnumSecond,
            Num: 1.1,
            Str: "test",
            StrOpt: openapi.String("testOptional"),
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `ctx`                                                    | [context.Context](https://pkg.go.dev/context#Context)    | :heavy_check_mark:                                       | The context to use for the request.                      |
| `request`                                                | [map[string]shared.SimpleObject](../../models//.md)      | :heavy_check_mark:                                       | The request object to use for the request.               |
| `opts`                                                   | [][operations.Option](../../models/operations/option.md) | :heavy_minus_sign:                                       | The options for this request.                            |


### Response

**[*operations.RequestBodyPostApplicationJSONMapResponse](../../models/operations/requestbodypostapplicationjsonmapresponse.md), error**


## RequestBodyPostApplicationJSONMapCamelCase

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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapCamelCase(ctx, map[string]shared.SimpleObjectCamelCase{
        "key": shared.SimpleObjectCamelCase{
            AnyVal: "any example",
            BoolOptVal: openapi.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
            EnumVal: shared.EnumOne,
            Float32Val: 2.2222222,
            Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValSixtyNine,
            Int32Val: 1,
            IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValThird,
            IntOptNullVal: openapi.Int64(999999),
            IntVal: 999999,
            NumOptNullVal: openapi.Float64(1.1),
            NumVal: 1.1,
            StrOptVal: openapi.String("optional example"),
            StrVal: "example",
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [map[string]shared.SimpleObjectCamelCase](../../models//.md) | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../models/operations/option.md)     | :heavy_minus_sign:                                           | The options for this request.                                |


### Response

**[*operations.RequestBodyPostApplicationJSONMapCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonmapcamelcaseresponse.md), error**


## RequestBodyPostApplicationJSONMapObj

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"math/big"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapObj(ctx, map[string]shared.SimpleObject{
        "key": shared.SimpleObject{
            Any: "any",
            Bigint: big.NewInt(8821239038968084),
            BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
            Bool: true,
            BoolOpt: openapi.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
            Decimal: types.MustNewDecimalFromString("3.141592653589793"),
            DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
            Enum: shared.EnumOne,
            Float32: 1.1,
            Int: 1,
            Int32: 1,
            Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
            IntEnum: shared.SimpleObjectIntEnumSecond,
            Num: 1.1,
            Str: "test",
            StrOpt: openapi.String("testOptional"),
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.MapObjValue != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [map[string]shared.SimpleObject](../../models//.md)   | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostApplicationJSONMapObjResponse](../../models/operations/requestbodypostapplicationjsonmapobjresponse.md), error**


## RequestBodyPostApplicationJSONMapObjCamelCase

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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapObjCamelCase(ctx, map[string]shared.SimpleObjectCamelCase{
        "key": shared.SimpleObjectCamelCase{
            AnyVal: "any example",
            BoolOptVal: openapi.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
            EnumVal: shared.EnumOne,
            Float32Val: 2.2222222,
            Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValSixtyNine,
            Int32Val: 1,
            IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValThird,
            IntOptNullVal: openapi.Int64(999999),
            IntVal: 999999,
            NumOptNullVal: openapi.Float64(1.1),
            NumVal: 1.1,
            StrOptVal: openapi.String("optional example"),
            StrVal: "example",
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.MapObjValueCamelCase != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [map[string]shared.SimpleObjectCamelCase](../../models//.md) | :heavy_check_mark:                                           | The request object to use for the request.                   |


### Response

**[*operations.RequestBodyPostApplicationJSONMapObjCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonmapobjcamelcaseresponse.md), error**


## RequestBodyPostApplicationJSONMapOfArray

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"math/big"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfArray(ctx, map[string][]shared.SimpleObject{
        "key": []shared.SimpleObject{
            shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Int: 1,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumSecond,
                Num: 1.1,
                Str: "test",
                StrOpt: openapi.String("testOptional"),
            },
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `ctx`                                                    | [context.Context](https://pkg.go.dev/context#Context)    | :heavy_check_mark:                                       | The context to use for the request.                      |
| `request`                                                | [map[string][]shared.SimpleObject](../../models//.md)    | :heavy_check_mark:                                       | The request object to use for the request.               |
| `opts`                                                   | [][operations.Option](../../models/operations/option.md) | :heavy_minus_sign:                                       | The options for this request.                            |


### Response

**[*operations.RequestBodyPostApplicationJSONMapOfArrayResponse](../../models/operations/requestbodypostapplicationjsonmapofarrayresponse.md), error**


## RequestBodyPostApplicationJSONMapOfArrayCamelCase

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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfArrayCamelCase(ctx, map[string][]shared.SimpleObjectCamelCase{
        "key": []shared.SimpleObjectCamelCase{
            shared.SimpleObjectCamelCase{
                AnyVal: "any example",
                BoolOptVal: openapi.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                EnumVal: shared.EnumOne,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValThird,
                IntOptNullVal: openapi.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: openapi.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: openapi.String("optional example"),
                StrVal: "example",
            },
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                      | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `ctx`                                                          | [context.Context](https://pkg.go.dev/context#Context)          | :heavy_check_mark:                                             | The context to use for the request.                            |
| `request`                                                      | [map[string][]shared.SimpleObjectCamelCase](../../models//.md) | :heavy_check_mark:                                             | The request object to use for the request.                     |
| `opts`                                                         | [][operations.Option](../../models/operations/option.md)       | :heavy_minus_sign:                                             | The options for this request.                                  |


### Response

**[*operations.RequestBodyPostApplicationJSONMapOfArrayCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonmapofarraycamelcaseresponse.md), error**


## RequestBodyPostApplicationJSONMapOfMap

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"math/big"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfMap(ctx, map[string]map[string]shared.SimpleObject{
        "key": map[string]shared.SimpleObject{
            "key": shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Int: 1,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumSecond,
                Num: 1.1,
                Str: "test",
                StrOpt: openapi.String("testOptional"),
            },
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                      | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `ctx`                                                          | [context.Context](https://pkg.go.dev/context#Context)          | :heavy_check_mark:                                             | The context to use for the request.                            |
| `request`                                                      | [map[string]map[string]shared.SimpleObject](../../models//.md) | :heavy_check_mark:                                             | The request object to use for the request.                     |
| `opts`                                                         | [][operations.Option](../../models/operations/option.md)       | :heavy_minus_sign:                                             | The options for this request.                                  |


### Response

**[*operations.RequestBodyPostApplicationJSONMapOfMapResponse](../../models/operations/requestbodypostapplicationjsonmapofmapresponse.md), error**


## RequestBodyPostApplicationJSONMapOfMapCamelCase

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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfMapCamelCase(ctx, map[string]map[string]shared.SimpleObjectCamelCase{
        "key": map[string]shared.SimpleObjectCamelCase{
            "key": shared.SimpleObjectCamelCase{
                AnyVal: "any example",
                BoolOptVal: openapi.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                EnumVal: shared.EnumOne,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValThird,
                IntOptNullVal: openapi.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: openapi.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: openapi.String("optional example"),
                StrVal: "example",
            },
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `ctx`                                                                   | [context.Context](https://pkg.go.dev/context#Context)                   | :heavy_check_mark:                                                      | The context to use for the request.                                     |
| `request`                                                               | [map[string]map[string]shared.SimpleObjectCamelCase](../../models//.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |
| `opts`                                                                  | [][operations.Option](../../models/operations/option.md)                | :heavy_minus_sign:                                                      | The options for this request.                                           |


### Response

**[*operations.RequestBodyPostApplicationJSONMapOfMapCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonmapofmapcamelcaseresponse.md), error**


## RequestBodyPostApplicationJSONMapOfMapOfPrimitive

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfMapOfPrimitive(ctx, map[string]map[string]string{
        "key": map[string]string{
            "key": "string",
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `ctx`                                                    | [context.Context](https://pkg.go.dev/context#Context)    | :heavy_check_mark:                                       | The context to use for the request.                      |
| `request`                                                | [map[string]map[string]string](../../models//.md)        | :heavy_check_mark:                                       | The request object to use for the request.               |
| `opts`                                                   | [][operations.Option](../../models/operations/option.md) | :heavy_minus_sign:                                       | The options for this request.                            |


### Response

**[*operations.RequestBodyPostApplicationJSONMapOfMapOfPrimitiveResponse](../../models/operations/requestbodypostapplicationjsonmapofmapofprimitiveresponse.md), error**


## RequestBodyPostApplicationJSONMapOfPrimitive

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfPrimitive(ctx, map[string]string{
        "key": "string",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `ctx`                                                    | [context.Context](https://pkg.go.dev/context#Context)    | :heavy_check_mark:                                       | The context to use for the request.                      |
| `request`                                                | [map[string]string](../../models//.md)                   | :heavy_check_mark:                                       | The request object to use for the request.               |
| `opts`                                                   | [][operations.Option](../../models/operations/option.md) | :heavy_minus_sign:                                       | The options for this request.                            |


### Response

**[*operations.RequestBodyPostApplicationJSONMapOfPrimitiveResponse](../../models/operations/requestbodypostapplicationjsonmapofprimitiveresponse.md), error**


## RequestBodyPostApplicationJSONMultipleJSONFiltered

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"math/big"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMultipleJSONFiltered(ctx, shared.SimpleObject{
        Any: "any",
        Bigint: big.NewInt(8821239038968084),
        BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
        Bool: true,
        BoolOpt: openapi.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
        Decimal: types.MustNewDecimalFromString("3.141592653589793"),
        DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
        Enum: shared.EnumOne,
        Float32: 1.1,
        Int: 1,
        Int32: 1,
        Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
        IntEnum: shared.SimpleObjectIntEnumSecond,
        Num: 1.1,
        Str: "test",
        StrOpt: openapi.String("testOptional"),
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `ctx`                                                      | [context.Context](https://pkg.go.dev/context#Context)      | :heavy_check_mark:                                         | The context to use for the request.                        |
| `request`                                                  | [shared.SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |


### Response

**[*operations.RequestBodyPostApplicationJSONMultipleJSONFilteredResponse](../../models/operations/requestbodypostapplicationjsonmultiplejsonfilteredresponse.md), error**


## RequestBodyPostApplicationJSONSimple

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"math/big"
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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONSimple(ctx, shared.SimpleObject{
        Any: "any",
        Bigint: big.NewInt(8821239038968084),
        BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
        Bool: true,
        BoolOpt: openapi.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
        Decimal: types.MustNewDecimalFromString("3.141592653589793"),
        DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
        Enum: shared.EnumOne,
        Float32: 1.1,
        Int: 1,
        Int32: 1,
        Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
        IntEnum: shared.SimpleObjectIntEnumSecond,
        Num: 1.1,
        Str: "test",
        StrOpt: openapi.String("testOptional"),
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `ctx`                                                      | [context.Context](https://pkg.go.dev/context#Context)      | :heavy_check_mark:                                         | The context to use for the request.                        |
| `request`                                                  | [shared.SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |


### Response

**[*operations.RequestBodyPostApplicationJSONSimpleResponse](../../models/operations/requestbodypostapplicationjsonsimpleresponse.md), error**


## RequestBodyPostApplicationJSONSimpleCamelCase

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
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONSimpleCamelCase(ctx, shared.SimpleObjectCamelCase{
        AnyVal: "any example",
        BoolOptVal: openapi.Bool(true),
        BoolVal: true,
        DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        DateVal: types.MustDateFromString("2020-01-01"),
        EnumVal: shared.EnumOne,
        Float32Val: 2.2222222,
        Int32EnumVal: shared.SimpleObjectCamelCaseInt32EnumValSixtyNine,
        Int32Val: 1,
        IntEnumVal: shared.SimpleObjectCamelCaseIntEnumValThird,
        IntOptNullVal: openapi.Int64(999999),
        IntVal: 999999,
        NumOptNullVal: openapi.Float64(1.1),
        NumVal: 1.1,
        StrOptVal: openapi.String("optional example"),
        StrVal: "example",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                    | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `ctx`                                                                        | [context.Context](https://pkg.go.dev/context#Context)                        | :heavy_check_mark:                                                           | The context to use for the request.                                          |
| `request`                                                                    | [shared.SimpleObjectCamelCase](../../models/shared/simpleobjectcamelcase.md) | :heavy_check_mark:                                                           | The request object to use for the request.                                   |


### Response

**[*operations.RequestBodyPostApplicationJSONSimpleCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonsimplecamelcaseresponse.md), error**


## RequestBodyPostComplexNumberTypes

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"openapi/pkg/models/operations"
	"math/big"
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
    res, err := s.RequestBodies.RequestBodyPostComplexNumberTypes(ctx, operations.RequestBodyPostComplexNumberTypesRequest{
        ComplexNumberTypes: shared.ComplexNumberTypes{
            Bigint: big.NewInt(765757),
            BigintStr: big.NewInt(934487),
            Decimal: types.MustNewDecimalFromString("2505.14"),
            DecimalStr: types.MustNewDecimalFromString("6831.11"),
        },
        PathBigInt: big.NewInt(500580),
        PathBigIntStr: big.NewInt(741903),
        PathDecimal: types.MustNewDecimalFromString("8228.52"),
        PathDecimalStr: types.MustNewDecimalFromString("5491.78"),
        QueryBigInt: big.NewInt(937395),
        QueryBigIntStr: big.NewInt(178906),
        QueryDecimal: types.MustNewDecimalFromString("8260.68"),
        QueryDecimalStr: types.MustNewDecimalFromString("8253.58"),
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.RequestBodyPostComplexNumberTypes200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                      | [context.Context](https://pkg.go.dev/context#Context)                                                                      | :heavy_check_mark:                                                                                                         | The context to use for the request.                                                                                        |
| `request`                                                                                                                  | [operations.RequestBodyPostComplexNumberTypesRequest](../../models/operations/requestbodypostcomplexnumbertypesrequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[*operations.RequestBodyPostComplexNumberTypesResponse](../../models/operations/requestbodypostcomplexnumbertypesresponse.md), error**


## RequestBodyPostDefaultsAndConsts

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"math/big"
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
    res, err := s.RequestBodies.RequestBodyPostDefaultsAndConsts(ctx, shared.DefaultsAndConsts{
        ConstBigInt: big.NewInt(559205),
        ConstBigIntStr: big.NewInt(233601),
        ConstBool: false,
        ConstDate: types.MustDateFromString("2022-12-15"),
        ConstDateTime: types.MustTimeFromString("2023-10-01T02:16:56.173Z"),
        ConstDecimal: types.MustNewDecimalFromString("1120.58"),
        ConstDecimalStr: types.MustNewDecimalFromString("8445.08"),
        ConstEnumInt: shared.DefaultsAndConstsConstEnumIntOne,
        ConstEnumStr: shared.DefaultsAndConstsConstEnumStrTwo,
        ConstInt: 450379,
        ConstNum: 7742.71,
        ConstStr: "string",
        ConstStrNull: "string",
        NormalField: "string",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.RequestBodyPostDefaultsAndConsts200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `ctx`                                                                | [context.Context](https://pkg.go.dev/context#Context)                | :heavy_check_mark:                                                   | The context to use for the request.                                  |
| `request`                                                            | [shared.DefaultsAndConsts](../../models/shared/defaultsandconsts.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |


### Response

**[*operations.RequestBodyPostDefaultsAndConstsResponse](../../models/operations/requestbodypostdefaultsandconstsresponse.md), error**


## RequestBodyPostEmptyObject

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
    res, err := s.RequestBodies.RequestBodyPostEmptyObject(ctx, operations.RequestBodyPostEmptyObjectRequestBody{
        Empty: &operations.RequestBodyPostEmptyObjectRequestBodyEmpty{},
        EmptyWithEmptyProperties: &operations.RequestBodyPostEmptyObjectRequestBodyEmptyWithEmptyProperties{},
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.RequestBodyPostEmptyObject200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                | [context.Context](https://pkg.go.dev/context#Context)                                                                | :heavy_check_mark:                                                                                                   | The context to use for the request.                                                                                  |
| `request`                                                                                                            | [operations.RequestBodyPostEmptyObjectRequestBody](../../models/operations/requestbodypostemptyobjectrequestbody.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[*operations.RequestBodyPostEmptyObjectResponse](../../models/operations/requestbodypostemptyobjectresponse.md), error**


## RequestBodyPostFormDeep

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"math/big"
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
    res, err := s.RequestBodies.RequestBodyPostFormDeep(ctx, shared.DeepObject{
        Any: shared.CreateDeepObjectAnySimpleObject(
                shared.SimpleObject{
                    Any: "any",
                    Bigint: big.NewInt(8821239038968084),
                    BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                    Bool: true,
                    BoolOpt: openapi.Bool(true),
                    Date: types.MustDateFromString("2020-01-01"),
                    DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
                    Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                    DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                    Enum: shared.EnumOne,
                    Float32: 1.1,
                    Int: 1,
                    Int32: 1,
                    Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
                    IntEnum: shared.SimpleObjectIntEnumSecond,
                    Num: 1.1,
                    Str: "test",
                    StrOpt: openapi.String("testOptional"),
                },
        ),
        Arr: []shared.SimpleObject{
            shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Int: 1,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumSecond,
                Num: 1.1,
                Str: "test",
                StrOpt: openapi.String("testOptional"),
            },
            shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Int: 1,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumSecond,
                Num: 1.1,
                Str: "test",
                StrOpt: openapi.String("testOptional"),
            },
        },
        Bool: true,
        Int: 1,
        Map: map[string]shared.SimpleObject{
            "key2": shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Int: 1,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumSecond,
                Num: 1.1,
                Str: "test",
                StrOpt: openapi.String("testOptional"),
            },
            "key": shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Int: 1,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumSecond,
                Num: 1.1,
                Str: "test",
                StrOpt: openapi.String("testOptional"),
            },
        },
        Num: 1.1,
        Obj: shared.SimpleObject{
            Any: "any",
            Bigint: big.NewInt(8821239038968084),
            BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
            Bool: true,
            BoolOpt: openapi.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
            Decimal: types.MustNewDecimalFromString("3.141592653589793"),
            DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
            Enum: shared.EnumOne,
            Float32: 1.1,
            Int: 1,
            Int32: 1,
            Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
            IntEnum: shared.SimpleObjectIntEnumSecond,
            Num: 1.1,
            Str: "test",
            StrOpt: openapi.String("testOptional"),
        },
        Str: "test",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                              | Type                                                   | Required                                               | Description                                            |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `ctx`                                                  | [context.Context](https://pkg.go.dev/context#Context)  | :heavy_check_mark:                                     | The context to use for the request.                    |
| `request`                                              | [shared.DeepObject](../../models/shared/deepobject.md) | :heavy_check_mark:                                     | The request object to use for the request.             |


### Response

**[*operations.RequestBodyPostFormDeepResponse](../../models/operations/requestbodypostformdeepresponse.md), error**


## RequestBodyPostFormMapPrimitive

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostFormMapPrimitive(ctx, map[string]string{
        "key": "string",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [map[string]string](../../models//.md)                | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostFormMapPrimitiveResponse](../../models/operations/requestbodypostformmapprimitiveresponse.md), error**


## RequestBodyPostFormSimple

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"math/big"
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
    res, err := s.RequestBodies.RequestBodyPostFormSimple(ctx, shared.SimpleObject{
        Any: "any",
        Bigint: big.NewInt(8821239038968084),
        BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
        Bool: true,
        BoolOpt: openapi.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
        Decimal: types.MustNewDecimalFromString("3.141592653589793"),
        DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
        Enum: shared.EnumOne,
        Float32: 1.1,
        Int: 1,
        Int32: 1,
        Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
        IntEnum: shared.SimpleObjectIntEnumSecond,
        Num: 1.1,
        Str: "test",
        StrOpt: openapi.String("testOptional"),
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `ctx`                                                      | [context.Context](https://pkg.go.dev/context#Context)      | :heavy_check_mark:                                         | The context to use for the request.                        |
| `request`                                                  | [shared.SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |


### Response

**[*operations.RequestBodyPostFormSimpleResponse](../../models/operations/requestbodypostformsimpleresponse.md), error**


## RequestBodyPostJSONDataTypesArrayBigInt

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesArrayBigInt(ctx, []*big.Int{
        big.NewInt(564849),
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.RequestBodyPostJSONDataTypesArrayBigInt200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [[]*big.Int](../../models//.md)                       | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostJSONDataTypesArrayBigIntResponse](../../models/operations/requestbodypostjsondatatypesarraybigintresponse.md), error**


## RequestBodyPostJSONDataTypesArrayDate

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesArrayDate(ctx, []types.Date{
        types.MustDateFromString("2022-03-22"),
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.RequestBodyPostJSONDataTypesArrayDate200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [[]types.Date](../../models//.md)                     | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostJSONDataTypesArrayDateResponse](../../models/operations/requestbodypostjsondatatypesarraydateresponse.md), error**


## RequestBodyPostJSONDataTypesArrayDecimalStr

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesArrayDecimalStr(ctx, []*decimal.Big{
        types.MustNewDecimalFromString("8083.93"),
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.RequestBodyPostJSONDataTypesArrayDecimalStr200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [[]*decimal.Big](../../models//.md)                   | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostJSONDataTypesArrayDecimalStrResponse](../../models/operations/requestbodypostjsondatatypesarraydecimalstrresponse.md), error**


## RequestBodyPostJSONDataTypesBigInt

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesBigInt(ctx, big.NewInt(687617))
    if err != nil {
        log.Fatal(err)
    }

    if res.RequestBodyPostJSONDataTypesBigInt200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [*big.Int](../../models//.md)                         | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostJSONDataTypesBigIntResponse](../../models/operations/requestbodypostjsondatatypesbigintresponse.md), error**


## RequestBodyPostJSONDataTypesBigIntStr

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesBigIntStr(ctx, big.NewInt(649473))
    if err != nil {
        log.Fatal(err)
    }

    if res.RequestBodyPostJSONDataTypesBigIntStr200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [*big.Int](../../models//.md)                         | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostJSONDataTypesBigIntStrResponse](../../models/operations/requestbodypostjsondatatypesbigintstrresponse.md), error**


## RequestBodyPostJSONDataTypesBoolean

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesBoolean(ctx, false)
    if err != nil {
        log.Fatal(err)
    }

    if res.RequestBodyPostJSONDataTypesBoolean200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [bool](../../models//.md)                             | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostJSONDataTypesBooleanResponse](../../models/operations/requestbodypostjsondatatypesbooleanresponse.md), error**


## RequestBodyPostJSONDataTypesDate

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesDate(ctx, types.MustDateFromString("2022-03-04"))
    if err != nil {
        log.Fatal(err)
    }

    if res.RequestBodyPostJSONDataTypesDate200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [types.Date](../../models//.md)                       | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostJSONDataTypesDateResponse](../../models/operations/requestbodypostjsondatatypesdateresponse.md), error**


## RequestBodyPostJSONDataTypesDateTime

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesDateTime(ctx, types.MustTimeFromString("2023-03-04T01:33:15.031Z"))
    if err != nil {
        log.Fatal(err)
    }

    if res.RequestBodyPostJSONDataTypesDateTime200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [time.Time](../../models//.md)                        | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostJSONDataTypesDateTimeResponse](../../models/operations/requestbodypostjsondatatypesdatetimeresponse.md), error**


## RequestBodyPostJSONDataTypesDecimal

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesDecimal(ctx, types.MustNewDecimalFromString("1107.81"))
    if err != nil {
        log.Fatal(err)
    }

    if res.RequestBodyPostJSONDataTypesDecimal200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [*decimal.Big](../../models//.md)                     | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostJSONDataTypesDecimalResponse](../../models/operations/requestbodypostjsondatatypesdecimalresponse.md), error**


## RequestBodyPostJSONDataTypesDecimalStr

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesDecimalStr(ctx, types.MustNewDecimalFromString("5432.92"))
    if err != nil {
        log.Fatal(err)
    }

    if res.RequestBodyPostJSONDataTypesDecimalStr200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [*decimal.Big](../../models//.md)                     | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostJSONDataTypesDecimalStrResponse](../../models/operations/requestbodypostjsondatatypesdecimalstrresponse.md), error**


## RequestBodyPostJSONDataTypesFloat32

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesFloat32(ctx, 4464.34)
    if err != nil {
        log.Fatal(err)
    }

    if res.RequestBodyPostJSONDataTypesFloat32200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [float64](../../models//.md)                          | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostJSONDataTypesFloat32Response](../../models/operations/requestbodypostjsondatatypesfloat32response.md), error**


## RequestBodyPostJSONDataTypesInt32

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesInt32(ctx, 22155)
    if err != nil {
        log.Fatal(err)
    }

    if res.RequestBodyPostJSONDataTypesInt32200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [int](../../models//.md)                              | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostJSONDataTypesInt32Response](../../models/operations/requestbodypostjsondatatypesint32response.md), error**


## RequestBodyPostJSONDataTypesInteger

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesInteger(ctx, 273673)
    if err != nil {
        log.Fatal(err)
    }

    if res.RequestBodyPostJSONDataTypesInteger200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [int64](../../models//.md)                            | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostJSONDataTypesIntegerResponse](../../models/operations/requestbodypostjsondatatypesintegerresponse.md), error**


## RequestBodyPostJSONDataTypesMapBigIntStr

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesMapBigIntStr(ctx, map[string]*big.Int{
        "key": big.NewInt(42384),
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.RequestBodyPostJSONDataTypesMapBigIntStr200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [map[string]*big.Int](../../models//.md)              | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostJSONDataTypesMapBigIntStrResponse](../../models/operations/requestbodypostjsondatatypesmapbigintstrresponse.md), error**


## RequestBodyPostJSONDataTypesMapDateTime

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesMapDateTime(ctx, map[string]time.Time{
        "key": types.MustTimeFromString("2022-09-03T18:52:14.477Z"),
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.RequestBodyPostJSONDataTypesMapDateTime200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [map[string]time.Time](../../models//.md)             | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostJSONDataTypesMapDateTimeResponse](../../models/operations/requestbodypostjsondatatypesmapdatetimeresponse.md), error**


## RequestBodyPostJSONDataTypesMapDecimal

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesMapDecimal(ctx, map[string]*decimal.Big{
        "key": types.MustNewDecimalFromString("3472.82"),
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.RequestBodyPostJSONDataTypesMapDecimal200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [map[string]*decimal.Big](../../models//.md)          | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostJSONDataTypesMapDecimalResponse](../../models/operations/requestbodypostjsondatatypesmapdecimalresponse.md), error**


## RequestBodyPostJSONDataTypesNumber

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesNumber(ctx, 2193.66)
    if err != nil {
        log.Fatal(err)
    }

    if res.RequestBodyPostJSONDataTypesNumber200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [float64](../../models//.md)                          | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostJSONDataTypesNumberResponse](../../models/operations/requestbodypostjsondatatypesnumberresponse.md), error**


## RequestBodyPostJSONDataTypesString

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesString(ctx, "string")
    if err != nil {
        log.Fatal(err)
    }

    if res.RequestBodyPostJSONDataTypesString200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [string](../../models//.md)                           | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostJSONDataTypesStringResponse](../../models/operations/requestbodypostjsondatatypesstringresponse.md), error**


## RequestBodyPostMultipleContentTypesComponentFiltered

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"math/big"
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
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesComponentFiltered(ctx, shared.SimpleObject{
        Any: "any",
        Bigint: big.NewInt(8821239038968084),
        BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
        Bool: true,
        BoolOpt: openapi.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
        Decimal: types.MustNewDecimalFromString("3.141592653589793"),
        DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
        Enum: shared.EnumOne,
        Float32: 1.1,
        Int: 1,
        Int32: 1,
        Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
        IntEnum: shared.SimpleObjectIntEnumSecond,
        Num: 1.1,
        Str: "test",
        StrOpt: openapi.String("testOptional"),
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `ctx`                                                      | [context.Context](https://pkg.go.dev/context#Context)      | :heavy_check_mark:                                         | The context to use for the request.                        |
| `request`                                                  | [shared.SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |


### Response

**[*operations.RequestBodyPostMultipleContentTypesComponentFilteredResponse](../../models/operations/requestbodypostmultiplecontenttypescomponentfilteredresponse.md), error**


## RequestBodyPostMultipleContentTypesInlineFiltered

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
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesInlineFiltered(ctx, operations.RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON{
        Bool: false,
        Num: 3558.41,
        Str: "string",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                  | Type                                                                                                                                                                       | Required                                                                                                                                                                   | Description                                                                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                                                                      | [context.Context](https://pkg.go.dev/context#Context)                                                                                                                      | :heavy_check_mark:                                                                                                                                                         | The context to use for the request.                                                                                                                                        |
| `request`                                                                                                                                                                  | [operations.RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON](../../models/operations/requestbodypostmultiplecontenttypesinlinefilteredapplicationjson.md) | :heavy_check_mark:                                                                                                                                                         | The request object to use for the request.                                                                                                                                 |


### Response

**[*operations.RequestBodyPostMultipleContentTypesInlineFilteredResponse](../../models/operations/requestbodypostmultiplecontenttypesinlinefilteredresponse.md), error**


## RequestBodyPostMultipleContentTypesSplitParamForm

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


    requestBody := operations.RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded{
        Bool3: false,
        Num3: 8693.24,
        Str3: "string",
    }

    var paramStr string = "string"

    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitParamForm(ctx, requestBody, paramStr)
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                      | Type                                                                                                                                                                                           | Required                                                                                                                                                                                       | Description                                                                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                                                                                          | [context.Context](https://pkg.go.dev/context#Context)                                                                                                                                          | :heavy_check_mark:                                                                                                                                                                             | The context to use for the request.                                                                                                                                                            |
| `requestBody`                                                                                                                                                                                  | [operations.RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded](../../models/operations/requestbodypostmultiplecontenttypessplitparamapplicationxwwwformurlencoded.md) | :heavy_check_mark:                                                                                                                                                                             | N/A                                                                                                                                                                                            |
| `paramStr`                                                                                                                                                                                     | *string*                                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                                             | N/A                                                                                                                                                                                            |


### Response

**[*operations.RequestBodyPostMultipleContentTypesSplitParamFormResponse](../../models/operations/requestbodypostmultiplecontenttypessplitparamformresponse.md), error**


## RequestBodyPostMultipleContentTypesSplitParamJSON

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


    requestBody := operations.RequestBodyPostMultipleContentTypesSplitParamApplicationJSON{
        Bool: false,
        Num: 9771.91,
        Str: "string",
    }

    var paramStr string = "string"

    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitParamJSON(ctx, requestBody, paramStr)
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                                                                              | [context.Context](https://pkg.go.dev/context#Context)                                                                                                              | :heavy_check_mark:                                                                                                                                                 | The context to use for the request.                                                                                                                                |
| `requestBody`                                                                                                                                                      | [operations.RequestBodyPostMultipleContentTypesSplitParamApplicationJSON](../../models/operations/requestbodypostmultiplecontenttypessplitparamapplicationjson.md) | :heavy_check_mark:                                                                                                                                                 | N/A                                                                                                                                                                |
| `paramStr`                                                                                                                                                         | *string*                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                 | N/A                                                                                                                                                                |


### Response

**[*operations.RequestBodyPostMultipleContentTypesSplitParamJSONResponse](../../models/operations/requestbodypostmultiplecontenttypessplitparamjsonresponse.md), error**


## RequestBodyPostMultipleContentTypesSplitParamMultipart

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


    requestBody := operations.RequestBodyPostMultipleContentTypesSplitParamMultipartFormData{
        Bool2: false,
        Num2: 7000.76,
        Str2: "string",
    }

    var paramStr string = "string"

    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitParamMultipart(ctx, requestBody, paramStr)
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                              | Type                                                                                                                                                                   | Required                                                                                                                                                               | Description                                                                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                                                                  | [context.Context](https://pkg.go.dev/context#Context)                                                                                                                  | :heavy_check_mark:                                                                                                                                                     | The context to use for the request.                                                                                                                                    |
| `requestBody`                                                                                                                                                          | [operations.RequestBodyPostMultipleContentTypesSplitParamMultipartFormData](../../models/operations/requestbodypostmultiplecontenttypessplitparammultipartformdata.md) | :heavy_check_mark:                                                                                                                                                     | N/A                                                                                                                                                                    |
| `paramStr`                                                                                                                                                             | *string*                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                     | N/A                                                                                                                                                                    |


### Response

**[*operations.RequestBodyPostMultipleContentTypesSplitParamMultipartResponse](../../models/operations/requestbodypostmultiplecontenttypessplitparammultipartresponse.md), error**


## RequestBodyPostMultipleContentTypesSplitForm

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
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitForm(ctx, operations.RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded{
        Bool3: false,
        Num3: 7842.07,
        Str3: "string",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                            | Type                                                                                                                                                                                 | Required                                                                                                                                                                             | Description                                                                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                                                                                                | [context.Context](https://pkg.go.dev/context#Context)                                                                                                                                | :heavy_check_mark:                                                                                                                                                                   | The context to use for the request.                                                                                                                                                  |
| `request`                                                                                                                                                                            | [operations.RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded](../../models/operations/requestbodypostmultiplecontenttypessplitapplicationxwwwformurlencoded.md) | :heavy_check_mark:                                                                                                                                                                   | The request object to use for the request.                                                                                                                                           |


### Response

**[*operations.RequestBodyPostMultipleContentTypesSplitFormResponse](../../models/operations/requestbodypostmultiplecontenttypessplitformresponse.md), error**


## RequestBodyPostMultipleContentTypesSplitJSON

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
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitJSON(ctx, operations.RequestBodyPostMultipleContentTypesSplitApplicationJSON{
        Bool: false,
        Num: 2445.56,
        Str: "string",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                                                    | [context.Context](https://pkg.go.dev/context#Context)                                                                                                    | :heavy_check_mark:                                                                                                                                       | The context to use for the request.                                                                                                                      |
| `request`                                                                                                                                                | [operations.RequestBodyPostMultipleContentTypesSplitApplicationJSON](../../models/operations/requestbodypostmultiplecontenttypessplitapplicationjson.md) | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |


### Response

**[*operations.RequestBodyPostMultipleContentTypesSplitJSONResponse](../../models/operations/requestbodypostmultiplecontenttypessplitjsonresponse.md), error**


## RequestBodyPostMultipleContentTypesSplitMultipart

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
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitMultipart(ctx, operations.RequestBodyPostMultipleContentTypesSplitMultipartFormData{
        Bool2: false,
        Num2: 2079.2,
        Str2: "string",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                    | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                                                                        | [context.Context](https://pkg.go.dev/context#Context)                                                                                                        | :heavy_check_mark:                                                                                                                                           | The context to use for the request.                                                                                                                          |
| `request`                                                                                                                                                    | [operations.RequestBodyPostMultipleContentTypesSplitMultipartFormData](../../models/operations/requestbodypostmultiplecontenttypessplitmultipartformdata.md) | :heavy_check_mark:                                                                                                                                           | The request object to use for the request.                                                                                                                   |


### Response

**[*operations.RequestBodyPostMultipleContentTypesSplitMultipartResponse](../../models/operations/requestbodypostmultiplecontenttypessplitmultipartresponse.md), error**


## RequestBodyPostNotNullableNotRequiredStringBody

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostNotNullableNotRequiredStringBody(ctx, &"string")
    if err != nil {
        log.Fatal(err)
    }

    if res.RequestBodyPostNotNullableNotRequiredStringBody200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [string](../../models//.md)                           | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostNotNullableNotRequiredStringBodyResponse](../../models/operations/requestbodypostnotnullablenotrequiredstringbodyresponse.md), error**


## RequestBodyPostNullArray

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostNullArray(ctx, []string{
        "string",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.RequestBodyPostNullArray200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [[]string](../../models//.md)                         | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostNullArrayResponse](../../models/operations/requestbodypostnullarrayresponse.md), error**


## RequestBodyPostNullDictionary

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostNullDictionary(ctx, map[string]string{
        "key": "string",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.RequestBodyPostNullDictionary200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [map[string]string](../../models//.md)                | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostNullDictionaryResponse](../../models/operations/requestbodypostnulldictionaryresponse.md), error**


## RequestBodyPostNullableNotRequiredStringBody

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostNullableNotRequiredStringBody(ctx, &"string")
    if err != nil {
        log.Fatal(err)
    }

    if res.RequestBodyPostNullableNotRequiredStringBody200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [string](../../models//.md)                           | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostNullableNotRequiredStringBodyResponse](../../models/operations/requestbodypostnullablenotrequiredstringbodyresponse.md), error**


## RequestBodyPostNullableRequiredStringBody

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPostNullableRequiredStringBody(ctx, &"string")
    if err != nil {
        log.Fatal(err)
    }

    if res.RequestBodyPostNullableRequiredStringBody200ApplicationJSONObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [string](../../models//.md)                           | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPostNullableRequiredStringBodyResponse](../../models/operations/requestbodypostnullablerequiredstringbodyresponse.md), error**


## RequestBodyPutBytes

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPutBytes(ctx, []byte("9sS}}O%}aJ"))
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [[]byte](../../models//.md)                           | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPutBytesResponse](../../models/operations/requestbodyputbytesresponse.md), error**


## RequestBodyPutBytesWithParams

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    var requestBody []byte = []byte("o%jIWe4_P6")

    var queryStringParam string = "string"

    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPutBytesWithParams(ctx, requestBody, queryStringParam)
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `requestBody`                                         | *[]byte*                                              | :heavy_check_mark:                                    | N/A                                                   |
| `queryStringParam`                                    | *string*                                              | :heavy_check_mark:                                    | N/A                                                   |


### Response

**[*operations.RequestBodyPutBytesWithParamsResponse](../../models/operations/requestbodyputbyteswithparamsresponse.md), error**


## RequestBodyPutMultipartDeep

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"math/big"
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
    res, err := s.RequestBodies.RequestBodyPutMultipartDeep(ctx, shared.DeepObject{
        Any: shared.CreateDeepObjectAnySimpleObject(
                shared.SimpleObject{
                    Any: "any",
                    Bigint: big.NewInt(8821239038968084),
                    BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                    Bool: true,
                    BoolOpt: openapi.Bool(true),
                    Date: types.MustDateFromString("2020-01-01"),
                    DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
                    Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                    DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                    Enum: shared.EnumOne,
                    Float32: 1.1,
                    Int: 1,
                    Int32: 1,
                    Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
                    IntEnum: shared.SimpleObjectIntEnumSecond,
                    Num: 1.1,
                    Str: "test",
                    StrOpt: openapi.String("testOptional"),
                },
        ),
        Arr: []shared.SimpleObject{
            shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Int: 1,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumSecond,
                Num: 1.1,
                Str: "test",
                StrOpt: openapi.String("testOptional"),
            },
            shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Int: 1,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumSecond,
                Num: 1.1,
                Str: "test",
                StrOpt: openapi.String("testOptional"),
            },
        },
        Bool: true,
        Int: 1,
        Map: map[string]shared.SimpleObject{
            "key": shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Int: 1,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumSecond,
                Num: 1.1,
                Str: "test",
                StrOpt: openapi.String("testOptional"),
            },
            "key2": shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Int: 1,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumSecond,
                Num: 1.1,
                Str: "test",
                StrOpt: openapi.String("testOptional"),
            },
        },
        Num: 1.1,
        Obj: shared.SimpleObject{
            Any: "any",
            Bigint: big.NewInt(8821239038968084),
            BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
            Bool: true,
            BoolOpt: openapi.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
            Decimal: types.MustNewDecimalFromString("3.141592653589793"),
            DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
            Enum: shared.EnumOne,
            Float32: 1.1,
            Int: 1,
            Int32: 1,
            Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
            IntEnum: shared.SimpleObjectIntEnumSecond,
            Num: 1.1,
            Str: "test",
            StrOpt: openapi.String("testOptional"),
        },
        Str: "test",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                              | Type                                                   | Required                                               | Description                                            |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `ctx`                                                  | [context.Context](https://pkg.go.dev/context#Context)  | :heavy_check_mark:                                     | The context to use for the request.                    |
| `request`                                              | [shared.DeepObject](../../models/shared/deepobject.md) | :heavy_check_mark:                                     | The request object to use for the request.             |


### Response

**[*operations.RequestBodyPutMultipartDeepResponse](../../models/operations/requestbodyputmultipartdeepresponse.md), error**


## RequestBodyPutMultipartDifferentFileName

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
    res, err := s.RequestBodies.RequestBodyPutMultipartDifferentFileName(ctx, operations.RequestBodyPutMultipartDifferentFileNameRequestBody{
        DifferentFileName: &operations.RequestBodyPutMultipartDifferentFileNameRequestBodyDifferentFileName{
            Content: []byte("Y}'H[5/Z[,"),
            DifferentFileName: "string",
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                                                            | [context.Context](https://pkg.go.dev/context#Context)                                                                                            | :heavy_check_mark:                                                                                                                               | The context to use for the request.                                                                                                              |
| `request`                                                                                                                                        | [operations.RequestBodyPutMultipartDifferentFileNameRequestBody](../../models/operations/requestbodyputmultipartdifferentfilenamerequestbody.md) | :heavy_check_mark:                                                                                                                               | The request object to use for the request.                                                                                                       |


### Response

**[*operations.RequestBodyPutMultipartDifferentFileNameResponse](../../models/operations/requestbodyputmultipartdifferentfilenameresponse.md), error**


## RequestBodyPutMultipartFile

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
    res, err := s.RequestBodies.RequestBodyPutMultipartFile(ctx, operations.RequestBodyPutMultipartFileRequestBody{
        File: &operations.RequestBodyPutMultipartFileRequestBodyFile{
            Content: []byte("OJa,v`.FW-"),
            File: "string",
        },
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                  | [context.Context](https://pkg.go.dev/context#Context)                                                                  | :heavy_check_mark:                                                                                                     | The context to use for the request.                                                                                    |
| `request`                                                                                                              | [operations.RequestBodyPutMultipartFileRequestBody](../../models/operations/requestbodyputmultipartfilerequestbody.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[*operations.RequestBodyPutMultipartFileResponse](../../models/operations/requestbodyputmultipartfileresponse.md), error**


## RequestBodyPutMultipartSimple

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"math/big"
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
    res, err := s.RequestBodies.RequestBodyPutMultipartSimple(ctx, shared.SimpleObject{
        Any: "any",
        Bigint: big.NewInt(8821239038968084),
        BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
        Bool: true,
        BoolOpt: openapi.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
        Decimal: types.MustNewDecimalFromString("3.141592653589793"),
        DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
        Enum: shared.EnumOne,
        Float32: 1.1,
        Int: 1,
        Int32: 1,
        Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
        IntEnum: shared.SimpleObjectIntEnumSecond,
        Num: 1.1,
        Str: "test",
        StrOpt: openapi.String("testOptional"),
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                  | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `ctx`                                                      | [context.Context](https://pkg.go.dev/context#Context)      | :heavy_check_mark:                                         | The context to use for the request.                        |
| `request`                                                  | [shared.SimpleObject](../../models/shared/simpleobject.md) | :heavy_check_mark:                                         | The request object to use for the request.                 |


### Response

**[*operations.RequestBodyPutMultipartSimpleResponse](../../models/operations/requestbodyputmultipartsimpleresponse.md), error**


## RequestBodyPutString

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyPutString(ctx, "string")
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `request`                                             | [string](../../models//.md)                           | :heavy_check_mark:                                    | The request object to use for the request.            |


### Response

**[*operations.RequestBodyPutStringResponse](../../models/operations/requestbodyputstringresponse.md), error**


## RequestBodyPutStringWithParams

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
)

func main() {
    s := openapi.New(
        openapi.WithSecurity(shared.Security{
            APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
        }),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )


    var requestBody string = "string"

    var queryStringParam string = "string"

    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPutStringWithParams(ctx, requestBody, queryStringParam)
    if err != nil {
        log.Fatal(err)
    }

    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ctx`                                                 | [context.Context](https://pkg.go.dev/context#Context) | :heavy_check_mark:                                    | The context to use for the request.                   |
| `requestBody`                                         | *string*                                              | :heavy_check_mark:                                    | N/A                                                   |
| `queryStringParam`                                    | *string*                                              | :heavy_check_mark:                                    | N/A                                                   |


### Response

**[*operations.RequestBodyPutStringWithParamsResponse](../../models/operations/requestbodyputstringwithparamsresponse.md), error**


## RequestBodyReadAndWrite

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyReadAndWrite(ctx, shared.ReadWriteObjectInput{
        Num1: 797612,
        Num2: 89374,
        Num3: 459345,
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.ReadWriteObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                  | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `ctx`                                                                      | [context.Context](https://pkg.go.dev/context#Context)                      | :heavy_check_mark:                                                         | The context to use for the request.                                        |
| `request`                                                                  | [shared.ReadWriteObjectInput](../../models/shared/readwriteobjectinput.md) | :heavy_check_mark:                                                         | The request object to use for the request.                                 |
| `opts`                                                                     | [][operations.Option](../../models/operations/option.md)                   | :heavy_minus_sign:                                                         | The options for this request.                                              |


### Response

**[*operations.RequestBodyReadAndWriteResponse](../../models/operations/requestbodyreadandwriteresponse.md), error**


## RequestBodyReadOnlyInput

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyReadOnlyInput(ctx, shared.ReadOnlyObjectInput{})
    if err != nil {
        log.Fatal(err)
    }

    if res.ReadOnlyObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `ctx`                                                                    | [context.Context](https://pkg.go.dev/context#Context)                    | :heavy_check_mark:                                                       | The context to use for the request.                                      |
| `request`                                                                | [shared.ReadOnlyObjectInput](../../models/shared/readonlyobjectinput.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |
| `opts`                                                                   | [][operations.Option](../../models/operations/option.md)                 | :heavy_minus_sign:                                                       | The options for this request.                                            |


### Response

**[*operations.RequestBodyReadOnlyInputResponse](../../models/operations/requestbodyreadonlyinputresponse.md), error**


## RequestBodyReadOnlyUnion

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"math/big"
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
    res, err := s.RequestBodies.RequestBodyReadOnlyUnion(ctx, shared.CreateWeaklyTypedOneOfReadOnlyObjectInputSimpleObject(
            shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.000000001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Int: 1,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumFiftyFive,
                IntEnum: shared.SimpleObjectIntEnumSecond,
                Num: 1.1,
                Str: "test",
                StrOpt: openapi.String("testOptional"),
            },
    ))
    if err != nil {
        log.Fatal(err)
    }

    if res.WeaklyTypedOneOfReadOnlyObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                    | [context.Context](https://pkg.go.dev/context#Context)                                                    | :heavy_check_mark:                                                                                       | The context to use for the request.                                                                      |
| `request`                                                                                                | [shared.WeaklyTypedOneOfReadOnlyObjectInput](../../models/shared/weaklytypedoneofreadonlyobjectinput.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |
| `opts`                                                                                                   | [][operations.Option](../../models/operations/option.md)                                                 | :heavy_minus_sign:                                                                                       | The options for this request.                                                                            |


### Response

**[*operations.RequestBodyReadOnlyUnionResponse](../../models/operations/requestbodyreadonlyunionresponse.md), error**


## RequestBodyReadWriteOnlyUnion

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"math/big"
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
    res, err := s.RequestBodies.RequestBodyReadWriteOnlyUnion(ctx, shared.CreateWeaklyTypedOneOfReadWriteObjectInputReadWriteObjectInput(
            shared.ReadWriteObjectInput{
                Num1: 817251,
                Num2: 891192,
                Num3: 743101,
            },
    ))
    if err != nil {
        log.Fatal(err)
    }

    if res.WeaklyTypedOneOfReadWriteObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                      | [context.Context](https://pkg.go.dev/context#Context)                                                      | :heavy_check_mark:                                                                                         | The context to use for the request.                                                                        |
| `request`                                                                                                  | [shared.WeaklyTypedOneOfReadWriteObjectInput](../../models/shared/weaklytypedoneofreadwriteobjectinput.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |
| `opts`                                                                                                     | [][operations.Option](../../models/operations/option.md)                                                   | :heavy_minus_sign:                                                                                         | The options for this request.                                                                              |


### Response

**[*operations.RequestBodyReadWriteOnlyUnionResponse](../../models/operations/requestbodyreadwriteonlyunionresponse.md), error**


## RequestBodyWriteOnly

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyWriteOnly(ctx, shared.WriteOnlyObject{
        Bool: false,
        Num: 3888.42,
        String: "string",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.ReadOnlyObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                        | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `ctx`                                                            | [context.Context](https://pkg.go.dev/context#Context)            | :heavy_check_mark:                                               | The context to use for the request.                              |
| `request`                                                        | [shared.WriteOnlyObject](../../models/shared/writeonlyobject.md) | :heavy_check_mark:                                               | The request object to use for the request.                       |
| `opts`                                                           | [][operations.Option](../../models/operations/option.md)         | :heavy_minus_sign:                                               | The options for this request.                                    |


### Response

**[*operations.RequestBodyWriteOnlyResponse](../../models/operations/requestbodywriteonlyresponse.md), error**


## RequestBodyWriteOnlyOutput

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.RequestBodies.RequestBodyWriteOnlyOutput(ctx, shared.WriteOnlyObject{
        Bool: false,
        Num: 3867.69,
        String: "string",
    })
    if err != nil {
        log.Fatal(err)
    }

    if res.WriteOnlyObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                        | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `ctx`                                                            | [context.Context](https://pkg.go.dev/context#Context)            | :heavy_check_mark:                                               | The context to use for the request.                              |
| `request`                                                        | [shared.WriteOnlyObject](../../models/shared/writeonlyobject.md) | :heavy_check_mark:                                               | The request object to use for the request.                       |
| `opts`                                                           | [][operations.Option](../../models/operations/option.md)         | :heavy_minus_sign:                                               | The options for this request.                                    |


### Response

**[*operations.RequestBodyWriteOnlyOutputResponse](../../models/operations/requestbodywriteonlyoutputresponse.md), error**


## RequestBodyWriteOnlyUnion

### Example Usage

```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
	"math/big"
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
    res, err := s.RequestBodies.RequestBodyWriteOnlyUnion(ctx, shared.CreateWeaklyTypedOneOfWriteOnlyObjectWriteOnlyObject(
            shared.WriteOnlyObject{
                Bool: false,
                Num: 3823.36,
                String: "string",
            },
    ))
    if err != nil {
        log.Fatal(err)
    }

    if res.WeaklyTypedOneOfWriteOnlyObject != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                            | [context.Context](https://pkg.go.dev/context#Context)                                            | :heavy_check_mark:                                                                               | The context to use for the request.                                                              |
| `request`                                                                                        | [shared.WeaklyTypedOneOfWriteOnlyObject](../../models/shared/weaklytypedoneofwriteonlyobject.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |
| `opts`                                                                                           | [][operations.Option](../../models/operations/option.md)                                         | :heavy_minus_sign:                                                                               | The options for this request.                                                                    |


### Response

**[*operations.RequestBodyWriteOnlyUnionResponse](../../models/operations/requestbodywriteonlyunionresponse.md), error**

