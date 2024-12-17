# RequestBodies
(*RequestBodies*)

## Overview

Endpoints for testing request bodies.

### Available Operations

* [NullEnumPost](#nullenumpost)
* [NullableObjectPost](#nullableobjectpost)
* [NullableOptionalFieldsPost](#nullableoptionalfieldspost)
* [NullableRequiredEmptyObjectPost](#nullablerequiredemptyobjectpost)
* [NullableRequiredPropertyPost](#nullablerequiredpropertypost)
* [NullableRequiredSharedObjectPost](#nullablerequiredsharedobjectpost)
* [RequestBodyDeprecatedRequestBodyRefPost](#requestbodydeprecatedrequestbodyrefpost)
* [RequestBodyGetInferredOptionalRequestWrapper](#requestbodygetinferredoptionalrequestwrapper)
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
* [RequestBodyPostApplicationJSONArrayOfUnions](#requestbodypostapplicationjsonarrayofunions)
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
* [RequestBodyPostEmptyBodyRetainedWithAllOptionalFields](#requestbodypostemptybodyretainedwithalloptionalfields)
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
* [RequestBodyPostJSONDataTypesComplexNumberArrays](#requestbodypostjsondatatypescomplexnumberarrays)
* [RequestBodyPostJSONDataTypesComplexNumberMaps](#requestbodypostjsondatatypescomplexnumbermaps)
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
* [RequestBodyPostMultipleContentTypesComponentFilteredDefaultTest](#requestbodypostmultiplecontenttypescomponentfiltereddefaulttest)
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
* [RequestBodyPutMultipartFileRef](#requestbodyputmultipartfileref)
* [RequestBodyPutMultipartOptionalRequestBody](#requestbodyputmultipartoptionalrequestbody)
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

## NullEnumPost

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.NullEnumPost(ctx, shared.ObjectWithNullEnums{})
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
| `request`                                                                    | [shared.ObjectWithNullEnums](../../pkg/models/shared/objectwithnullenums.md) | :heavy_check_mark:                                                           | The request object to use for the request.                                   |
| `opts`                                                                       | [][operations.Option](../../pkg/models/operations/option.md)                 | :heavy_minus_sign:                                                           | The options for this request.                                                |

### Response

**[*operations.NullEnumPostResponse](../../pkg/models/operations/nullenumpostresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## NullableObjectPost

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.NullableObjectPost(ctx, nil)
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                          | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `ctx`                                                              | [context.Context](https://pkg.go.dev/context#Context)              | :heavy_check_mark:                                                 | The context to use for the request.                                |
| `request`                                                          | [shared.NullableObject](../../pkg/models/shared/nullableobject.md) | :heavy_check_mark:                                                 | The request object to use for the request.                         |
| `opts`                                                             | [][operations.Option](../../pkg/models/operations/option.md)       | :heavy_minus_sign:                                                 | The options for this request.                                      |

### Response

**[*operations.NullableObjectPostResponse](../../pkg/models/operations/nullableobjectpostresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## NullableOptionalFieldsPost

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.NullableOptionalFieldsPost(ctx, operations.NullableOptionalFieldsPostRequestBody{
        NullableRequired: openapi.String("<value>"),
    })
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                                    | [context.Context](https://pkg.go.dev/context#Context)                                                                    | :heavy_check_mark:                                                                                                       | The context to use for the request.                                                                                      |
| `request`                                                                                                                | [operations.NullableOptionalFieldsPostRequestBody](../../pkg/models/operations/nullableoptionalfieldspostrequestbody.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `opts`                                                                                                                   | [][operations.Option](../../pkg/models/operations/option.md)                                                             | :heavy_minus_sign:                                                                                                       | The options for this request.                                                                                            |

### Response

**[*operations.NullableOptionalFieldsPostResponse](../../pkg/models/operations/nullableoptionalfieldspostresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## NullableRequiredEmptyObjectPost

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.NullableRequiredEmptyObjectPost(ctx, operations.NullableRequiredEmptyObjectPostRequestBody{
        NullableRequiredObj: &operations.NullableRequiredObj{},
        RequiredObj: operations.RequiredObj{},
    })
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                              | [context.Context](https://pkg.go.dev/context#Context)                                                                              | :heavy_check_mark:                                                                                                                 | The context to use for the request.                                                                                                |
| `request`                                                                                                                          | [operations.NullableRequiredEmptyObjectPostRequestBody](../../pkg/models/operations/nullablerequiredemptyobjectpostrequestbody.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |
| `opts`                                                                                                                             | [][operations.Option](../../pkg/models/operations/option.md)                                                                       | :heavy_minus_sign:                                                                                                                 | The options for this request.                                                                                                      |

### Response

**[*operations.NullableRequiredEmptyObjectPostResponse](../../pkg/models/operations/nullablerequiredemptyobjectpostresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## NullableRequiredPropertyPost

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"math/big"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/operations"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.NullableRequiredPropertyPost(ctx, operations.NullableRequiredPropertyPostRequestBody{
        NullableRequiredArray: []float64{
            502.67,
        },
        NullableRequiredBigIntStr: big.NewInt(50266),
        NullableRequiredDateTime: types.MustNewTimeFromString("2024-07-13T08:11:28.024Z"),
        NullableRequiredDecimalStr: types.MustNewDecimalFromString("8839.33"),
        NullableRequiredEnum: operations.NullableRequiredEnumFirst.ToPointer(),
        NullableRequiredInt: openapi.Int64(783710),
    })
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                        | [context.Context](https://pkg.go.dev/context#Context)                                                                        | :heavy_check_mark:                                                                                                           | The context to use for the request.                                                                                          |
| `request`                                                                                                                    | [operations.NullableRequiredPropertyPostRequestBody](../../pkg/models/operations/nullablerequiredpropertypostrequestbody.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `opts`                                                                                                                       | [][operations.Option](../../pkg/models/operations/option.md)                                                                 | :heavy_minus_sign:                                                                                                           | The options for this request.                                                                                                |

### Response

**[*operations.NullableRequiredPropertyPostResponse](../../pkg/models/operations/nullablerequiredpropertypostresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## NullableRequiredSharedObjectPost

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.NullableRequiredSharedObjectPost(ctx, operations.NullableRequiredSharedObjectPostRequestBody{
        NullableRequiredObj: nil,
    })
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                                                | [context.Context](https://pkg.go.dev/context#Context)                                                                                | :heavy_check_mark:                                                                                                                   | The context to use for the request.                                                                                                  |
| `request`                                                                                                                            | [operations.NullableRequiredSharedObjectPostRequestBody](../../pkg/models/operations/nullablerequiredsharedobjectpostrequestbody.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |
| `opts`                                                                                                                               | [][operations.Option](../../pkg/models/operations/option.md)                                                                         | :heavy_minus_sign:                                                                                                                   | The options for this request.                                                                                                        |

### Response

**[*operations.NullableRequiredSharedObjectPostResponse](../../pkg/models/operations/nullablerequiredsharedobjectpostresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyDeprecatedRequestBodyRefPost

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyDeprecatedRequestBodyRefPost(ctx, shared.DeprecatedObjectWithExample{
        Str: openapi.String("testvalue"),
    })
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                    | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `ctx`                                                                                        | [context.Context](https://pkg.go.dev/context#Context)                                        | :heavy_check_mark:                                                                           | The context to use for the request.                                                          |
| `request`                                                                                    | [shared.DeprecatedObjectWithExample](../../pkg/models/shared/deprecatedobjectwithexample.md) | :heavy_check_mark:                                                                           | The request object to use for the request.                                                   |
| `opts`                                                                                       | [][operations.Option](../../pkg/models/operations/option.md)                                 | :heavy_minus_sign:                                                                           | The options for this request.                                                                |

### Response

**[*operations.RequestBodyDeprecatedRequestBodyRefPostResponse](../../pkg/models/operations/requestbodydeprecatedrequestbodyrefpostresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyGetInferredOptionalRequestWrapper

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyGetInferredOptionalRequestWrapper(ctx, operations.RequestBodyGetInferredOptionalRequestWrapperRequest{})
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                                                | [context.Context](https://pkg.go.dev/context#Context)                                                                                                | :heavy_check_mark:                                                                                                                                   | The context to use for the request.                                                                                                                  |
| `request`                                                                                                                                            | [operations.RequestBodyGetInferredOptionalRequestWrapperRequest](../../pkg/models/operations/requestbodygetinferredoptionalrequestwrapperrequest.md) | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |
| `opts`                                                                                                                                               | [][operations.Option](../../pkg/models/operations/option.md)                                                                                         | :heavy_minus_sign:                                                                                                                                   | The options for this request.                                                                                                                        |

### Response

**[*operations.RequestBodyGetInferredOptionalRequestWrapperResponse](../../pkg/models/operations/requestbodygetinferredoptionalrequestwrapperresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostApplicationJSONArray

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"math/big"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArray(ctx, []shared.SimpleObject{
        shared.SimpleObject{
            Any: "any",
            Bigint: big.NewInt(8821239038968084),
            BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
            Bool: true,
            BoolOpt: openapi.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
            Decimal: types.MustNewDecimalFromString("3.141592653589793"),
            DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
            Enum: shared.EnumOne,
            Float32: 1.1,
            Float64Str: openapi.Float64(1.1),
            Int: 1,
            Int32: 1,
            Int32Enum: shared.Int32EnumFiftyFive,
            Int64Str: openapi.Int64(100),
            IntEnum: shared.IntEnumSecond,
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
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
            Decimal: types.MustNewDecimalFromString("3.141592653589793"),
            DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
            Enum: shared.EnumOne,
            Float32: 1.1,
            Float64Str: openapi.Float64(1.1),
            Int: 1,
            Int32: 1,
            Int32Enum: shared.Int32EnumFiftyFive,
            Int64Str: openapi.Int64(100),
            IntEnum: shared.IntEnumSecond,
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
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
            Decimal: types.MustNewDecimalFromString("3.141592653589793"),
            DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
            Enum: shared.EnumOne,
            Float32: 1.1,
            Float64Str: openapi.Float64(1.1),
            Int: 1,
            Int32: 1,
            Int32Enum: shared.Int32EnumFiftyFive,
            Int64Str: openapi.Int64(100),
            IntEnum: shared.IntEnumSecond,
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

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [[]shared.SimpleObject](../../.md)                           | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostApplicationJSONArrayResponse](../../pkg/models/operations/requestbodypostapplicationjsonarrayresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostApplicationJSONArrayCamelCase

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayCamelCase(ctx, []shared.SimpleObjectCamelCase{
        shared.SimpleObjectCamelCase{
            AnyVal: "any example",
            BoolOptVal: openapi.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
            EnumVal: shared.EnumOne,
            Float32Val: 2.2222222,
            Int32EnumVal: shared.Int32EnumValSixtyNine,
            Int32Val: 1,
            IntEnumVal: shared.IntEnumValThird,
            IntOptNullVal: openapi.Int64(999999),
            IntVal: 999999,
            NumOptNullVal: openapi.Float64(1.1),
            NumVal: 1.1,
            StrOptVal: openapi.String("optional example"),
            StrVal: "example",
        },
        shared.SimpleObjectCamelCase{
            AnyVal: "any example",
            BoolOptVal: openapi.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
            EnumVal: shared.EnumOne,
            Float32Val: 2.2222222,
            Int32EnumVal: shared.Int32EnumValSixtyNine,
            Int32Val: 1,
            IntEnumVal: shared.IntEnumValThird,
            IntOptNullVal: openapi.Int64(999999),
            IntVal: 999999,
            NumOptNullVal: openapi.Float64(1.1),
            NumVal: 1.1,
            StrOptVal: openapi.String("optional example"),
            StrVal: "example",
        },
        shared.SimpleObjectCamelCase{
            AnyVal: "any example",
            BoolOptVal: openapi.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
            EnumVal: shared.EnumOne,
            Float32Val: 2.2222222,
            Int32EnumVal: shared.Int32EnumValSixtyNine,
            Int32Val: 1,
            IntEnumVal: shared.IntEnumValThird,
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
| `request`                                                    | [[]shared.SimpleObjectCamelCase](../../.md)                  | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostApplicationJSONArrayCamelCaseResponse](../../pkg/models/operations/requestbodypostapplicationjsonarraycamelcaseresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostApplicationJSONArrayObj

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"math/big"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayObj(ctx, []shared.SimpleObject{
        shared.SimpleObject{
            Any: "any",
            Bigint: big.NewInt(8821239038968084),
            BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
            Bool: true,
            BoolOpt: openapi.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
            Decimal: types.MustNewDecimalFromString("3.141592653589793"),
            DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
            Enum: shared.EnumOne,
            Float32: 1.1,
            Float64Str: openapi.Float64(1.1),
            Int: 1,
            Int32: 1,
            Int32Enum: shared.Int32EnumFiftyFive,
            Int64Str: openapi.Int64(100),
            IntEnum: shared.IntEnumSecond,
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
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
            Decimal: types.MustNewDecimalFromString("3.141592653589793"),
            DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
            Enum: shared.EnumOne,
            Float32: 1.1,
            Float64Str: openapi.Float64(1.1),
            Int: 1,
            Int32: 1,
            Int32Enum: shared.Int32EnumFiftyFive,
            Int64Str: openapi.Int64(100),
            IntEnum: shared.IntEnumSecond,
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

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [[]shared.SimpleObject](../../.md)                           | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostApplicationJSONArrayObjResponse](../../pkg/models/operations/requestbodypostapplicationjsonarrayobjresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostApplicationJSONArrayObjCamelCase

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayObjCamelCase(ctx, []shared.SimpleObjectCamelCase{
        shared.SimpleObjectCamelCase{
            AnyVal: "any example",
            BoolOptVal: openapi.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
            EnumVal: shared.EnumOne,
            Float32Val: 2.2222222,
            Int32EnumVal: shared.Int32EnumValSixtyNine,
            Int32Val: 1,
            IntEnumVal: shared.IntEnumValThird,
            IntOptNullVal: openapi.Int64(999999),
            IntVal: 999999,
            NumOptNullVal: openapi.Float64(1.1),
            NumVal: 1.1,
            StrOptVal: openapi.String("optional example"),
            StrVal: "example",
        },
        shared.SimpleObjectCamelCase{
            AnyVal: "any example",
            BoolOptVal: openapi.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
            EnumVal: shared.EnumOne,
            Float32Val: 2.2222222,
            Int32EnumVal: shared.Int32EnumValSixtyNine,
            Int32Val: 1,
            IntEnumVal: shared.IntEnumValThird,
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

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [[]shared.SimpleObjectCamelCase](../../.md)                  | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostApplicationJSONArrayObjCamelCaseResponse](../../pkg/models/operations/requestbodypostapplicationjsonarrayobjcamelcaseresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostApplicationJSONArrayOfArray

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"math/big"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfArray(ctx, [][]shared.SimpleObject{
        []shared.SimpleObject{
            shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Float64Str: openapi.Float64(1.1),
                Int: 1,
                Int32: 1,
                Int32Enum: shared.Int32EnumFiftyFive,
                Int64Str: openapi.Int64(100),
                IntEnum: shared.IntEnumSecond,
                Num: 1.1,
                Str: "test",
                StrOpt: openapi.String("testOptional"),
            },
        },
        []shared.SimpleObject{
            shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Float64Str: openapi.Float64(1.1),
                Int: 1,
                Int32: 1,
                Int32Enum: shared.Int32EnumFiftyFive,
                Int64Str: openapi.Int64(100),
                IntEnum: shared.IntEnumSecond,
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

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [[][]shared.SimpleObject](../../.md)                         | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostApplicationJSONArrayOfArrayResponse](../../pkg/models/operations/requestbodypostapplicationjsonarrayofarrayresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostApplicationJSONArrayOfArrayCamelCase

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfArrayCamelCase(ctx, [][]shared.SimpleObjectCamelCase{
        []shared.SimpleObjectCamelCase{
            shared.SimpleObjectCamelCase{
                AnyVal: "any example",
                BoolOptVal: openapi.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                EnumVal: shared.EnumOne,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.Int32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.IntEnumValThird,
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

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [[][]shared.SimpleObjectCamelCase](../../.md)                | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostApplicationJSONArrayOfArrayCamelCaseResponse](../../pkg/models/operations/requestbodypostapplicationjsonarrayofarraycamelcaseresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostApplicationJSONArrayOfArrayOfPrimitive

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfArrayOfPrimitive(ctx, [][]string{
        []string{
            "foo",
            "bar",
        },
        []string{
            "buzz",
            "bazz",
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
| `request`                                                    | [[][]string](../../.md)                                      | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostApplicationJSONArrayOfArrayOfPrimitiveResponse](../../pkg/models/operations/requestbodypostapplicationjsonarrayofarrayofprimitiveresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostApplicationJSONArrayOfMap

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"math/big"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfMap(ctx, []map[string]shared.SimpleObject{
        map[string]shared.SimpleObject{
            "mapElem1": shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Float64Str: openapi.Float64(1.1),
                Int: 1,
                Int32: 1,
                Int32Enum: shared.Int32EnumFiftyFive,
                Int64Str: openapi.Int64(100),
                IntEnum: shared.IntEnumSecond,
                Num: 1.1,
                Str: "test",
                StrOpt: openapi.String("testOptional"),
            },
            "mapElem2": shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Float64Str: openapi.Float64(1.1),
                Int: 1,
                Int32: 1,
                Int32Enum: shared.Int32EnumFiftyFive,
                Int64Str: openapi.Int64(100),
                IntEnum: shared.IntEnumSecond,
                Num: 1.1,
                Str: "test",
                StrOpt: openapi.String("testOptional"),
            },
        },
        map[string]shared.SimpleObject{
            "mapElem1": shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Float64Str: openapi.Float64(1.1),
                Int: 1,
                Int32: 1,
                Int32Enum: shared.Int32EnumFiftyFive,
                Int64Str: openapi.Int64(100),
                IntEnum: shared.IntEnumSecond,
                Num: 1.1,
                Str: "test",
                StrOpt: openapi.String("testOptional"),
            },
            "mapElem2": shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Float64Str: openapi.Float64(1.1),
                Int: 1,
                Int32: 1,
                Int32Enum: shared.Int32EnumFiftyFive,
                Int64Str: openapi.Int64(100),
                IntEnum: shared.IntEnumSecond,
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

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [[]map[string]shared.SimpleObject](../../.md)                | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostApplicationJSONArrayOfMapResponse](../../pkg/models/operations/requestbodypostapplicationjsonarrayofmapresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostApplicationJSONArrayOfMapCamelCase

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfMapCamelCase(ctx, []map[string]shared.SimpleObjectCamelCase{
        map[string]shared.SimpleObjectCamelCase{
            "mapElem1": shared.SimpleObjectCamelCase{
                AnyVal: "any example",
                BoolOptVal: openapi.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                EnumVal: shared.EnumOne,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.Int32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.IntEnumValThird,
                IntOptNullVal: openapi.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: openapi.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: openapi.String("optional example"),
                StrVal: "example",
            },
            "mapElem2": shared.SimpleObjectCamelCase{
                AnyVal: "any example",
                BoolOptVal: openapi.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                EnumVal: shared.EnumOne,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.Int32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.IntEnumValThird,
                IntOptNullVal: openapi.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: openapi.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: openapi.String("optional example"),
                StrVal: "example",
            },
        },
        map[string]shared.SimpleObjectCamelCase{
            "mapElem1": shared.SimpleObjectCamelCase{
                AnyVal: "any example",
                BoolOptVal: openapi.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                EnumVal: shared.EnumOne,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.Int32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.IntEnumValThird,
                IntOptNullVal: openapi.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: openapi.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: openapi.String("optional example"),
                StrVal: "example",
            },
            "mapElem2": shared.SimpleObjectCamelCase{
                AnyVal: "any example",
                BoolOptVal: openapi.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                EnumVal: shared.EnumOne,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.Int32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.IntEnumValThird,
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

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [[]map[string]shared.SimpleObjectCamelCase](../../.md)       | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostApplicationJSONArrayOfMapCamelCaseResponse](../../pkg/models/operations/requestbodypostapplicationjsonarrayofmapcamelcaseresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostApplicationJSONArrayOfPrimitive

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfPrimitive(ctx, []string{
        "hello",
        "world",
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
| `request`                                                    | [[]string](../../.md)                                        | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostApplicationJSONArrayOfPrimitiveResponse](../../pkg/models/operations/requestbodypostapplicationjsonarrayofprimitiveresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostApplicationJSONArrayOfUnions

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/models/operations"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfUnions(ctx, operations.RequestBodyPostApplicationJSONArrayOfUnionsRequestBody{
        Dates: []types.Date{
            types.MustDateFromString("2022-10-04"),
        },
        Unions: []shared.TypedObjectOneOf{
            shared.CreateTypedObjectOneOfTypedObject1(
                shared.TypedObject1{
                    Type: shared.TypedObject1TypeObj1,
                    Value: "<value>",
                },
            ),
        },
    })
    if err != nil {
        log.Fatal(err)
    }
    if res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                  | Type                                                                                                                                                       | Required                                                                                                                                                   | Description                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                                                      | [context.Context](https://pkg.go.dev/context#Context)                                                                                                      | :heavy_check_mark:                                                                                                                                         | The context to use for the request.                                                                                                                        |
| `request`                                                                                                                                                  | [operations.RequestBodyPostApplicationJSONArrayOfUnionsRequestBody](../../pkg/models/operations/requestbodypostapplicationjsonarrayofunionsrequestbody.md) | :heavy_check_mark:                                                                                                                                         | The request object to use for the request.                                                                                                                 |
| `opts`                                                                                                                                                     | [][operations.Option](../../pkg/models/operations/option.md)                                                                                               | :heavy_minus_sign:                                                                                                                                         | The options for this request.                                                                                                                              |

### Response

**[*operations.RequestBodyPostApplicationJSONArrayOfUnionsResponse](../../pkg/models/operations/requestbodypostapplicationjsonarrayofunionsresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostApplicationJSONDeep

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"math/big"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostApplicationJSONDeep(ctx, shared.DeepObject{
        Any: shared.CreateAnySimpleObject(
            shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Float64Str: openapi.Float64(1.1),
                Int: 1,
                Int32: 1,
                Int32Enum: shared.Int32EnumFiftyFive,
                Int64Str: openapi.Int64(100),
                IntEnum: shared.IntEnumSecond,
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
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Float64Str: openapi.Float64(1.1),
                Int: 1,
                Int32: 1,
                Int32Enum: shared.Int32EnumFiftyFive,
                Int64Str: openapi.Int64(100),
                IntEnum: shared.IntEnumSecond,
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
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Float64Str: openapi.Float64(1.1),
                Int: 1,
                Int32: 1,
                Int32Enum: shared.Int32EnumFiftyFive,
                Int64Str: openapi.Int64(100),
                IntEnum: shared.IntEnumSecond,
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
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Float64Str: openapi.Float64(1.1),
                Int: 1,
                Int32: 1,
                Int32Enum: shared.Int32EnumFiftyFive,
                Int64Str: openapi.Int64(100),
                IntEnum: shared.IntEnumSecond,
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
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Float64Str: openapi.Float64(1.1),
                Int: 1,
                Int32: 1,
                Int32Enum: shared.Int32EnumFiftyFive,
                Int64Str: openapi.Int64(100),
                IntEnum: shared.IntEnumSecond,
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
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
            Decimal: types.MustNewDecimalFromString("3.141592653589793"),
            DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
            Enum: shared.EnumOne,
            Float32: 1.1,
            Float64Str: openapi.Float64(1.1),
            Int: 1,
            Int32: 1,
            Int32Enum: shared.Int32EnumFiftyFive,
            Int64Str: openapi.Int64(100),
            IntEnum: shared.IntEnumSecond,
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

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [shared.DeepObject](../../pkg/models/shared/deepobject.md)   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostApplicationJSONDeepResponse](../../pkg/models/operations/requestbodypostapplicationjsondeepresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostApplicationJSONDeepCamelCase

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostApplicationJSONDeepCamelCase(ctx, shared.DeepObjectCamelCase{
        AnyVal: shared.CreateAnyValSimpleObjectCamelCase(
            shared.SimpleObjectCamelCase{
                AnyVal: "any example",
                BoolOptVal: openapi.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                EnumVal: shared.EnumOne,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.Int32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.IntEnumValThird,
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
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                EnumVal: shared.EnumOne,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.Int32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.IntEnumValThird,
                IntOptNullVal: openapi.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: openapi.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: openapi.String("optional example"),
                StrVal: "example",
            },
            shared.SimpleObjectCamelCase{
                AnyVal: "any example",
                BoolOptVal: openapi.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                EnumVal: shared.EnumOne,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.Int32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.IntEnumValThird,
                IntOptNullVal: openapi.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: openapi.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: openapi.String("optional example"),
                StrVal: "example",
            },
        },
        BoolVal: true,
        IntVal: 1,
        MapVal: map[string]shared.SimpleObjectCamelCase{
            "key": shared.SimpleObjectCamelCase{
                AnyVal: "any example",
                BoolOptVal: openapi.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                EnumVal: shared.EnumOne,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.Int32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.IntEnumValThird,
                IntOptNullVal: openapi.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: openapi.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: openapi.String("optional example"),
                StrVal: "example",
            },
        },
        NumVal: 1.1,
        ObjVal: shared.SimpleObjectCamelCase{
            AnyVal: "any example",
            BoolOptVal: openapi.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
            EnumVal: shared.EnumOne,
            Float32Val: 2.2222222,
            Int32EnumVal: shared.Int32EnumValSixtyNine,
            Int32Val: 1,
            IntEnumVal: shared.IntEnumValThird,
            IntOptNullVal: openapi.Int64(999999),
            IntVal: 999999,
            NumOptNullVal: openapi.Float64(1.1),
            NumVal: 1.1,
            StrOptVal: openapi.String("optional example"),
            StrVal: "example",
        },
        StrVal: "test",
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
| `request`                                                                    | [shared.DeepObjectCamelCase](../../pkg/models/shared/deepobjectcamelcase.md) | :heavy_check_mark:                                                           | The request object to use for the request.                                   |
| `opts`                                                                       | [][operations.Option](../../pkg/models/operations/option.md)                 | :heavy_minus_sign:                                                           | The options for this request.                                                |

### Response

**[*operations.RequestBodyPostApplicationJSONDeepCamelCaseResponse](../../pkg/models/operations/requestbodypostapplicationjsondeepcamelcaseresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostApplicationJSONMap

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"math/big"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMap(ctx, map[string]shared.SimpleObject{
        "mapElem1": shared.SimpleObject{
            Any: "any",
            Bigint: big.NewInt(8821239038968084),
            BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
            Bool: true,
            BoolOpt: openapi.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
            Decimal: types.MustNewDecimalFromString("3.141592653589793"),
            DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
            Enum: shared.EnumOne,
            Float32: 1.1,
            Float64Str: openapi.Float64(1.1),
            Int: 1,
            Int32: 1,
            Int32Enum: shared.Int32EnumFiftyFive,
            Int64Str: openapi.Int64(100),
            IntEnum: shared.IntEnumSecond,
            Num: 1.1,
            Str: "test",
            StrOpt: openapi.String("testOptional"),
        },
        "mapElem2": shared.SimpleObject{
            Any: "any",
            Bigint: big.NewInt(8821239038968084),
            BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
            Bool: true,
            BoolOpt: openapi.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
            Decimal: types.MustNewDecimalFromString("3.141592653589793"),
            DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
            Enum: shared.EnumOne,
            Float32: 1.1,
            Float64Str: openapi.Float64(1.1),
            Int: 1,
            Int32: 1,
            Int32Enum: shared.Int32EnumFiftyFive,
            Int64Str: openapi.Int64(100),
            IntEnum: shared.IntEnumSecond,
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

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [map[string]shared.SimpleObject](../../.md)                  | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostApplicationJSONMapResponse](../../pkg/models/operations/requestbodypostapplicationjsonmapresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostApplicationJSONMapCamelCase

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapCamelCase(ctx, map[string]shared.SimpleObjectCamelCase{
        "mapElem1": shared.SimpleObjectCamelCase{
            AnyVal: "any example",
            BoolOptVal: openapi.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
            EnumVal: shared.EnumOne,
            Float32Val: 2.2222222,
            Int32EnumVal: shared.Int32EnumValSixtyNine,
            Int32Val: 1,
            IntEnumVal: shared.IntEnumValThird,
            IntOptNullVal: openapi.Int64(999999),
            IntVal: 999999,
            NumOptNullVal: openapi.Float64(1.1),
            NumVal: 1.1,
            StrOptVal: openapi.String("optional example"),
            StrVal: "example",
        },
        "mapElem2": shared.SimpleObjectCamelCase{
            AnyVal: "any example",
            BoolOptVal: openapi.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
            EnumVal: shared.EnumOne,
            Float32Val: 2.2222222,
            Int32EnumVal: shared.Int32EnumValSixtyNine,
            Int32Val: 1,
            IntEnumVal: shared.IntEnumValThird,
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
| `request`                                                    | [map[string]shared.SimpleObjectCamelCase](../../.md)         | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostApplicationJSONMapCamelCaseResponse](../../pkg/models/operations/requestbodypostapplicationjsonmapcamelcaseresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostApplicationJSONMapObj

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"math/big"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapObj(ctx, map[string]shared.SimpleObject{
        "mapElem1": shared.SimpleObject{
            Any: "any",
            Bigint: big.NewInt(8821239038968084),
            BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
            Bool: true,
            BoolOpt: openapi.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
            Decimal: types.MustNewDecimalFromString("3.141592653589793"),
            DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
            Enum: shared.EnumOne,
            Float32: 1.1,
            Float64Str: openapi.Float64(1.1),
            Int: 1,
            Int32: 1,
            Int32Enum: shared.Int32EnumFiftyFive,
            Int64Str: openapi.Int64(100),
            IntEnum: shared.IntEnumSecond,
            Num: 1.1,
            Str: "test",
            StrOpt: openapi.String("testOptional"),
        },
        "mapElem2": shared.SimpleObject{
            Any: "any",
            Bigint: big.NewInt(8821239038968084),
            BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
            Bool: true,
            BoolOpt: openapi.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
            Decimal: types.MustNewDecimalFromString("3.141592653589793"),
            DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
            Enum: shared.EnumOne,
            Float32: 1.1,
            Float64Str: openapi.Float64(1.1),
            Int: 1,
            Int32: 1,
            Int32Enum: shared.Int32EnumFiftyFive,
            Int64Str: openapi.Int64(100),
            IntEnum: shared.IntEnumSecond,
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

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [map[string]shared.SimpleObject](../../.md)                  | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostApplicationJSONMapObjResponse](../../pkg/models/operations/requestbodypostapplicationjsonmapobjresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostApplicationJSONMapObjCamelCase

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapObjCamelCase(ctx, map[string]shared.SimpleObjectCamelCase{
        "mapElem1": shared.SimpleObjectCamelCase{
            AnyVal: "any example",
            BoolOptVal: openapi.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
            EnumVal: shared.EnumOne,
            Float32Val: 2.2222222,
            Int32EnumVal: shared.Int32EnumValSixtyNine,
            Int32Val: 1,
            IntEnumVal: shared.IntEnumValThird,
            IntOptNullVal: openapi.Int64(999999),
            IntVal: 999999,
            NumOptNullVal: openapi.Float64(1.1),
            NumVal: 1.1,
            StrOptVal: openapi.String("optional example"),
            StrVal: "example",
        },
        "mapElem2": shared.SimpleObjectCamelCase{
            AnyVal: "any example",
            BoolOptVal: openapi.Bool(true),
            BoolVal: true,
            DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
            DateVal: types.MustDateFromString("2020-01-01"),
            EnumVal: shared.EnumOne,
            Float32Val: 2.2222222,
            Int32EnumVal: shared.Int32EnumValSixtyNine,
            Int32Val: 1,
            IntEnumVal: shared.IntEnumValThird,
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
| `request`                                                    | [map[string]shared.SimpleObjectCamelCase](../../.md)         | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostApplicationJSONMapObjCamelCaseResponse](../../pkg/models/operations/requestbodypostapplicationjsonmapobjcamelcaseresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostApplicationJSONMapOfArray

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"math/big"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfArray(ctx, map[string][]shared.SimpleObject{
        "mapElem1": []shared.SimpleObject{
            shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Float64Str: openapi.Float64(1.1),
                Int: 1,
                Int32: 1,
                Int32Enum: shared.Int32EnumFiftyFive,
                Int64Str: openapi.Int64(100),
                IntEnum: shared.IntEnumSecond,
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
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Float64Str: openapi.Float64(1.1),
                Int: 1,
                Int32: 1,
                Int32Enum: shared.Int32EnumFiftyFive,
                Int64Str: openapi.Int64(100),
                IntEnum: shared.IntEnumSecond,
                Num: 1.1,
                Str: "test",
                StrOpt: openapi.String("testOptional"),
            },
        },
        "mapElem2": []shared.SimpleObject{
            shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Float64Str: openapi.Float64(1.1),
                Int: 1,
                Int32: 1,
                Int32Enum: shared.Int32EnumFiftyFive,
                Int64Str: openapi.Int64(100),
                IntEnum: shared.IntEnumSecond,
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
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Float64Str: openapi.Float64(1.1),
                Int: 1,
                Int32: 1,
                Int32Enum: shared.Int32EnumFiftyFive,
                Int64Str: openapi.Int64(100),
                IntEnum: shared.IntEnumSecond,
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

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [map[string][]shared.SimpleObject](../../.md)                | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostApplicationJSONMapOfArrayResponse](../../pkg/models/operations/requestbodypostapplicationjsonmapofarrayresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostApplicationJSONMapOfArrayCamelCase

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfArrayCamelCase(ctx, map[string][]shared.SimpleObjectCamelCase{
        "mapElem1": []shared.SimpleObjectCamelCase{
            shared.SimpleObjectCamelCase{
                AnyVal: "any example",
                BoolOptVal: openapi.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                EnumVal: shared.EnumOne,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.Int32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.IntEnumValThird,
                IntOptNullVal: openapi.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: openapi.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: openapi.String("optional example"),
                StrVal: "example",
            },
            shared.SimpleObjectCamelCase{
                AnyVal: "any example",
                BoolOptVal: openapi.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                EnumVal: shared.EnumOne,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.Int32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.IntEnumValThird,
                IntOptNullVal: openapi.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: openapi.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: openapi.String("optional example"),
                StrVal: "example",
            },
        },
        "mapElem2": []shared.SimpleObjectCamelCase{
            shared.SimpleObjectCamelCase{
                AnyVal: "any example",
                BoolOptVal: openapi.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                EnumVal: shared.EnumOne,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.Int32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.IntEnumValThird,
                IntOptNullVal: openapi.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: openapi.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: openapi.String("optional example"),
                StrVal: "example",
            },
            shared.SimpleObjectCamelCase{
                AnyVal: "any example",
                BoolOptVal: openapi.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                EnumVal: shared.EnumOne,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.Int32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.IntEnumValThird,
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

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [map[string][]shared.SimpleObjectCamelCase](../../.md)       | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostApplicationJSONMapOfArrayCamelCaseResponse](../../pkg/models/operations/requestbodypostapplicationjsonmapofarraycamelcaseresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostApplicationJSONMapOfMap

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"math/big"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfMap(ctx, map[string]map[string]shared.SimpleObject{
        "mapElem1": map[string]shared.SimpleObject{
            "subMapElem1": shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Float64Str: openapi.Float64(1.1),
                Int: 1,
                Int32: 1,
                Int32Enum: shared.Int32EnumFiftyFive,
                Int64Str: openapi.Int64(100),
                IntEnum: shared.IntEnumSecond,
                Num: 1.1,
                Str: "test",
                StrOpt: openapi.String("testOptional"),
            },
            "subMapElem2": shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Float64Str: openapi.Float64(1.1),
                Int: 1,
                Int32: 1,
                Int32Enum: shared.Int32EnumFiftyFive,
                Int64Str: openapi.Int64(100),
                IntEnum: shared.IntEnumSecond,
                Num: 1.1,
                Str: "test",
                StrOpt: openapi.String("testOptional"),
            },
        },
        "mapElem2": map[string]shared.SimpleObject{
            "subMapElem1": shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Float64Str: openapi.Float64(1.1),
                Int: 1,
                Int32: 1,
                Int32Enum: shared.Int32EnumFiftyFive,
                Int64Str: openapi.Int64(100),
                IntEnum: shared.IntEnumSecond,
                Num: 1.1,
                Str: "test",
                StrOpt: openapi.String("testOptional"),
            },
            "subMapElem2": shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Float64Str: openapi.Float64(1.1),
                Int: 1,
                Int32: 1,
                Int32Enum: shared.Int32EnumFiftyFive,
                Int64Str: openapi.Int64(100),
                IntEnum: shared.IntEnumSecond,
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

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [map[string]map[string]shared.SimpleObject](../../.md)       | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostApplicationJSONMapOfMapResponse](../../pkg/models/operations/requestbodypostapplicationjsonmapofmapresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostApplicationJSONMapOfMapCamelCase

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfMapCamelCase(ctx, map[string]map[string]shared.SimpleObjectCamelCase{
        "mapElem1": map[string]shared.SimpleObjectCamelCase{
            "subMapElem1": shared.SimpleObjectCamelCase{
                AnyVal: "any example",
                BoolOptVal: openapi.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                EnumVal: shared.EnumOne,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.Int32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.IntEnumValThird,
                IntOptNullVal: openapi.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: openapi.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: openapi.String("optional example"),
                StrVal: "example",
            },
            "subMapElem2": shared.SimpleObjectCamelCase{
                AnyVal: "any example",
                BoolOptVal: openapi.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                EnumVal: shared.EnumOne,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.Int32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.IntEnumValThird,
                IntOptNullVal: openapi.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: openapi.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: openapi.String("optional example"),
                StrVal: "example",
            },
        },
        "mapElem2": map[string]shared.SimpleObjectCamelCase{
            "subMapElem1": shared.SimpleObjectCamelCase{
                AnyVal: "any example",
                BoolOptVal: openapi.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                EnumVal: shared.EnumOne,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.Int32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.IntEnumValThird,
                IntOptNullVal: openapi.Int64(999999),
                IntVal: 999999,
                NumOptNullVal: openapi.Float64(1.1),
                NumVal: 1.1,
                StrOptVal: openapi.String("optional example"),
                StrVal: "example",
            },
            "subMapElem2": shared.SimpleObjectCamelCase{
                AnyVal: "any example",
                BoolOptVal: openapi.Bool(true),
                BoolVal: true,
                DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                DateVal: types.MustDateFromString("2020-01-01"),
                EnumVal: shared.EnumOne,
                Float32Val: 2.2222222,
                Int32EnumVal: shared.Int32EnumValSixtyNine,
                Int32Val: 1,
                IntEnumVal: shared.IntEnumValThird,
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

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `ctx`                                                           | [context.Context](https://pkg.go.dev/context#Context)           | :heavy_check_mark:                                              | The context to use for the request.                             |
| `request`                                                       | [map[string]map[string]shared.SimpleObjectCamelCase](../../.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |
| `opts`                                                          | [][operations.Option](../../pkg/models/operations/option.md)    | :heavy_minus_sign:                                              | The options for this request.                                   |

### Response

**[*operations.RequestBodyPostApplicationJSONMapOfMapCamelCaseResponse](../../pkg/models/operations/requestbodypostapplicationjsonmapofmapcamelcaseresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostApplicationJSONMapOfMapOfPrimitive

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfMapOfPrimitive(ctx, map[string]map[string]string{
        "mapElem1": map[string]string{
            "subMapElem1": "foo",
            "subMapElem2": "bar",
        },
        "mapElem2": map[string]string{
            "subMapElem1": "buzz",
            "subMapElem2": "bazz",
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
| `request`                                                    | [map[string]map[string]string](../../.md)                    | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostApplicationJSONMapOfMapOfPrimitiveResponse](../../pkg/models/operations/requestbodypostapplicationjsonmapofmapofprimitiveresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostApplicationJSONMapOfPrimitive

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfPrimitive(ctx, map[string]string{
        "mapElem1": "hello",
        "mapElem2": "world",
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
| `request`                                                    | [map[string]string](../../.md)                               | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostApplicationJSONMapOfPrimitiveResponse](../../pkg/models/operations/requestbodypostapplicationjsonmapofprimitiveresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostApplicationJSONMultipleJSONFiltered

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"math/big"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMultipleJSONFiltered(ctx, shared.SimpleObject{
        Any: "any",
        Bigint: big.NewInt(8821239038968084),
        BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
        Bool: true,
        BoolOpt: openapi.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
        Decimal: types.MustNewDecimalFromString("3.141592653589793"),
        DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
        Enum: shared.EnumOne,
        Float32: 1.1,
        Float64Str: openapi.Float64(1.1),
        Int: 1,
        Int32: 1,
        Int32Enum: shared.Int32EnumFiftyFive,
        Int64Str: openapi.Int64(100),
        IntEnum: shared.IntEnumSecond,
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

| Parameter                                                      | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `ctx`                                                          | [context.Context](https://pkg.go.dev/context#Context)          | :heavy_check_mark:                                             | The context to use for the request.                            |
| `request`                                                      | [shared.SimpleObject](../../pkg/models/shared/simpleobject.md) | :heavy_check_mark:                                             | The request object to use for the request.                     |
| `opts`                                                         | [][operations.Option](../../pkg/models/operations/option.md)   | :heavy_minus_sign:                                             | The options for this request.                                  |

### Response

**[*operations.RequestBodyPostApplicationJSONMultipleJSONFilteredResponse](../../pkg/models/operations/requestbodypostapplicationjsonmultiplejsonfilteredresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostApplicationJSONSimple

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"math/big"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostApplicationJSONSimple(ctx, shared.SimpleObject{
        Any: "any",
        Bigint: big.NewInt(8821239038968084),
        BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
        Bool: true,
        BoolOpt: openapi.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
        Decimal: types.MustNewDecimalFromString("3.141592653589793"),
        DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
        Enum: shared.EnumOne,
        Float32: 1.1,
        Float64Str: openapi.Float64(1.1),
        Int: 1,
        Int32: 1,
        Int32Enum: shared.Int32EnumFiftyFive,
        Int64Str: openapi.Int64(100),
        IntEnum: shared.IntEnumSecond,
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

| Parameter                                                      | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `ctx`                                                          | [context.Context](https://pkg.go.dev/context#Context)          | :heavy_check_mark:                                             | The context to use for the request.                            |
| `request`                                                      | [shared.SimpleObject](../../pkg/models/shared/simpleobject.md) | :heavy_check_mark:                                             | The request object to use for the request.                     |
| `opts`                                                         | [][operations.Option](../../pkg/models/operations/option.md)   | :heavy_minus_sign:                                             | The options for this request.                                  |

### Response

**[*operations.RequestBodyPostApplicationJSONSimpleResponse](../../pkg/models/operations/requestbodypostapplicationjsonsimpleresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostApplicationJSONSimpleCamelCase

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostApplicationJSONSimpleCamelCase(ctx, shared.SimpleObjectCamelCase{
        AnyVal: "any example",
        BoolOptVal: openapi.Bool(true),
        BoolVal: true,
        DateTimeVal: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
        DateVal: types.MustDateFromString("2020-01-01"),
        EnumVal: shared.EnumOne,
        Float32Val: 2.2222222,
        Int32EnumVal: shared.Int32EnumValSixtyNine,
        Int32Val: 1,
        IntEnumVal: shared.IntEnumValThird,
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

| Parameter                                                                        | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `ctx`                                                                            | [context.Context](https://pkg.go.dev/context#Context)                            | :heavy_check_mark:                                                               | The context to use for the request.                                              |
| `request`                                                                        | [shared.SimpleObjectCamelCase](../../pkg/models/shared/simpleobjectcamelcase.md) | :heavy_check_mark:                                                               | The request object to use for the request.                                       |
| `opts`                                                                           | [][operations.Option](../../pkg/models/operations/option.md)                     | :heavy_minus_sign:                                                               | The options for this request.                                                    |

### Response

**[*operations.RequestBodyPostApplicationJSONSimpleCamelCaseResponse](../../pkg/models/operations/requestbodypostapplicationjsonsimplecamelcaseresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostComplexNumberTypes

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"math/big"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/models/operations"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostComplexNumberTypes(ctx, operations.RequestBodyPostComplexNumberTypesRequest{
        ComplexNumberTypes: shared.ComplexNumberTypes{
            Bigint: big.NewInt(8821239038968084),
            BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
            Decimal: types.MustNewDecimalFromString("3.141592653589793"),
            DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
        },
        PathBigInt: big.NewInt(8821239038968084),
        PathBigIntStr: types.MustNewBigIntFromString("9223372036854775808"),
        PathDecimal: types.MustNewDecimalFromString("3.141592653589793"),
        PathDecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
        QueryBigInt: big.NewInt(8821239038968084),
        QueryBigIntStr: types.MustNewBigIntFromString("9223372036854775808"),
        QueryDecimal: types.MustNewDecimalFromString("3.141592653589793"),
        QueryDecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
    })
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                                          | [context.Context](https://pkg.go.dev/context#Context)                                                                          | :heavy_check_mark:                                                                                                             | The context to use for the request.                                                                                            |
| `request`                                                                                                                      | [operations.RequestBodyPostComplexNumberTypesRequest](../../pkg/models/operations/requestbodypostcomplexnumbertypesrequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `opts`                                                                                                                         | [][operations.Option](../../pkg/models/operations/option.md)                                                                   | :heavy_minus_sign:                                                                                                             | The options for this request.                                                                                                  |

### Response

**[*operations.RequestBodyPostComplexNumberTypesResponse](../../pkg/models/operations/requestbodypostcomplexnumbertypesresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostDefaultsAndConsts

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostDefaultsAndConsts(ctx, shared.DefaultsAndConsts{
        NormalField: "test",
    })
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `ctx`                                                                    | [context.Context](https://pkg.go.dev/context#Context)                    | :heavy_check_mark:                                                       | The context to use for the request.                                      |
| `request`                                                                | [shared.DefaultsAndConsts](../../pkg/models/shared/defaultsandconsts.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |
| `opts`                                                                   | [][operations.Option](../../pkg/models/operations/option.md)             | :heavy_minus_sign:                                                       | The options for this request.                                            |

### Response

**[*operations.RequestBodyPostDefaultsAndConstsResponse](../../pkg/models/operations/requestbodypostdefaultsandconstsresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostEmptyBodyRetainedWithAllOptionalFields

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostEmptyBodyRetainedWithAllOptionalFields(ctx, nil)
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                                                                                          | [context.Context](https://pkg.go.dev/context#Context)                                                                                                                          | :heavy_check_mark:                                                                                                                                                             | The context to use for the request.                                                                                                                                            |
| `request`                                                                                                                                                                      | [operations.RequestBodyPostEmptyBodyRetainedWithAllOptionalFieldsRequestBody](../../pkg/models/operations/requestbodypostemptybodyretainedwithalloptionalfieldsrequestbody.md) | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `opts`                                                                                                                                                                         | [][operations.Option](../../pkg/models/operations/option.md)                                                                                                                   | :heavy_minus_sign:                                                                                                                                                             | The options for this request.                                                                                                                                                  |

### Response

**[*operations.RequestBodyPostEmptyBodyRetainedWithAllOptionalFieldsResponse](../../pkg/models/operations/requestbodypostemptybodyretainedwithalloptionalfieldsresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostEmptyObject

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostEmptyObject(ctx, operations.RequestBodyPostEmptyObjectRequestBody{})
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                                    | [context.Context](https://pkg.go.dev/context#Context)                                                                    | :heavy_check_mark:                                                                                                       | The context to use for the request.                                                                                      |
| `request`                                                                                                                | [operations.RequestBodyPostEmptyObjectRequestBody](../../pkg/models/operations/requestbodypostemptyobjectrequestbody.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `opts`                                                                                                                   | [][operations.Option](../../pkg/models/operations/option.md)                                                             | :heavy_minus_sign:                                                                                                       | The options for this request.                                                                                            |

### Response

**[*operations.RequestBodyPostEmptyObjectResponse](../../pkg/models/operations/requestbodypostemptyobjectresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostFormDeep

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"math/big"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostFormDeep(ctx, shared.DeepObject{
        Any: shared.CreateAnySimpleObject(
            shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Float64Str: openapi.Float64(1.1),
                Int: 1,
                Int32: 1,
                Int32Enum: shared.Int32EnumFiftyFive,
                Int64Str: openapi.Int64(100),
                IntEnum: shared.IntEnumSecond,
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
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Float64Str: openapi.Float64(1.1),
                Int: 1,
                Int32: 1,
                Int32Enum: shared.Int32EnumFiftyFive,
                Int64Str: openapi.Int64(100),
                IntEnum: shared.IntEnumSecond,
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
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Float64Str: openapi.Float64(1.1),
                Int: 1,
                Int32: 1,
                Int32Enum: shared.Int32EnumFiftyFive,
                Int64Str: openapi.Int64(100),
                IntEnum: shared.IntEnumSecond,
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
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Float64Str: openapi.Float64(1.1),
                Int: 1,
                Int32: 1,
                Int32Enum: shared.Int32EnumFiftyFive,
                Int64Str: openapi.Int64(100),
                IntEnum: shared.IntEnumSecond,
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
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Float64Str: openapi.Float64(1.1),
                Int: 1,
                Int32: 1,
                Int32Enum: shared.Int32EnumFiftyFive,
                Int64Str: openapi.Int64(100),
                IntEnum: shared.IntEnumSecond,
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
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
            Decimal: types.MustNewDecimalFromString("3.141592653589793"),
            DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
            Enum: shared.EnumOne,
            Float32: 1.1,
            Float64Str: openapi.Float64(1.1),
            Int: 1,
            Int32: 1,
            Int32Enum: shared.Int32EnumFiftyFive,
            Int64Str: openapi.Int64(100),
            IntEnum: shared.IntEnumSecond,
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

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [shared.DeepObject](../../pkg/models/shared/deepobject.md)   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostFormDeepResponse](../../pkg/models/operations/requestbodypostformdeepresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostFormMapPrimitive

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostFormMapPrimitive(ctx, map[string]string{
        "key1": "value1",
        "key2": "value2",
        "key3": "value3",
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
| `request`                                                    | [map[string]string](../../.md)                               | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostFormMapPrimitiveResponse](../../pkg/models/operations/requestbodypostformmapprimitiveresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostFormSimple

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"math/big"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostFormSimple(ctx, shared.SimpleObject{
        Any: "any",
        Bigint: big.NewInt(8821239038968084),
        BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
        Bool: true,
        BoolOpt: openapi.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
        Decimal: types.MustNewDecimalFromString("3.141592653589793"),
        DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
        Enum: shared.EnumOne,
        Float32: 1.1,
        Float64Str: openapi.Float64(1.1),
        Int: 1,
        Int32: 1,
        Int32Enum: shared.Int32EnumFiftyFive,
        Int64Str: openapi.Int64(100),
        IntEnum: shared.IntEnumSecond,
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

| Parameter                                                      | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `ctx`                                                          | [context.Context](https://pkg.go.dev/context#Context)          | :heavy_check_mark:                                             | The context to use for the request.                            |
| `request`                                                      | [shared.SimpleObject](../../pkg/models/shared/simpleobject.md) | :heavy_check_mark:                                             | The request object to use for the request.                     |
| `opts`                                                         | [][operations.Option](../../pkg/models/operations/option.md)   | :heavy_minus_sign:                                             | The options for this request.                                  |

### Response

**[*operations.RequestBodyPostFormSimpleResponse](../../pkg/models/operations/requestbodypostformsimpleresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostJSONDataTypesArrayBigInt

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"math/big"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesArrayBigInt(ctx, []*big.Int{
        big.NewInt(1),
    })
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [[]*big.Int](../../.md)                                      | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostJSONDataTypesArrayBigIntResponse](../../pkg/models/operations/requestbodypostjsondatatypesarraybigintresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostJSONDataTypesArrayDate

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesArrayDate(ctx, []types.Date{
        types.MustDateFromString("2020-01-01"),
    })
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [[]types.Date](../../.md)                                    | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostJSONDataTypesArrayDateResponse](../../pkg/models/operations/requestbodypostjsondatatypesarraydateresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostJSONDataTypesArrayDecimalStr

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"github.com/ericlagergren/decimal"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesArrayDecimalStr(ctx, []*decimal.Big{
        types.MustNewDecimalFromString("3.141592653589793438462643383279"),
    })
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [[]*decimal.Big](../../.md)                                  | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostJSONDataTypesArrayDecimalStrResponse](../../pkg/models/operations/requestbodypostjsondatatypesarraydecimalstrresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostJSONDataTypesBigInt

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"math/big"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesBigInt(ctx, big.NewInt(1))
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [*big.Int](../../.md)                                        | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostJSONDataTypesBigIntResponse](../../pkg/models/operations/requestbodypostjsondatatypesbigintresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostJSONDataTypesBigIntStr

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesBigIntStr(ctx, types.MustNewBigIntFromString("1"))
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [*big.Int](../../.md)                                        | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostJSONDataTypesBigIntStrResponse](../../pkg/models/operations/requestbodypostjsondatatypesbigintstrresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostJSONDataTypesBoolean

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesBoolean(ctx, true)
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [bool](../../.md)                                            | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostJSONDataTypesBooleanResponse](../../pkg/models/operations/requestbodypostjsondatatypesbooleanresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostJSONDataTypesComplexNumberArrays

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesComplexNumberArrays(ctx, shared.ComplexNumberArrays{})
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
| `request`                                                                    | [shared.ComplexNumberArrays](../../pkg/models/shared/complexnumberarrays.md) | :heavy_check_mark:                                                           | The request object to use for the request.                                   |
| `opts`                                                                       | [][operations.Option](../../pkg/models/operations/option.md)                 | :heavy_minus_sign:                                                           | The options for this request.                                                |

### Response

**[*operations.RequestBodyPostJSONDataTypesComplexNumberArraysResponse](../../pkg/models/operations/requestbodypostjsondatatypescomplexnumberarraysresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostJSONDataTypesComplexNumberMaps

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesComplexNumberMaps(ctx, shared.ComplexNumberMaps{})
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
| `request`                                                                | [shared.ComplexNumberMaps](../../pkg/models/shared/complexnumbermaps.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |
| `opts`                                                                   | [][operations.Option](../../pkg/models/operations/option.md)             | :heavy_minus_sign:                                                       | The options for this request.                                            |

### Response

**[*operations.RequestBodyPostJSONDataTypesComplexNumberMapsResponse](../../pkg/models/operations/requestbodypostjsondatatypescomplexnumbermapsresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostJSONDataTypesDate

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesDate(ctx, types.MustDateFromString("2020-01-01"))
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [types.Date](../../.md)                                      | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostJSONDataTypesDateResponse](../../pkg/models/operations/requestbodypostjsondatatypesdateresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostJSONDataTypesDateTime

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesDateTime(ctx, types.MustTimeFromString("2020-01-01T00:00:00.001Z"))
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [time.Time](../../.md)                                       | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostJSONDataTypesDateTimeResponse](../../pkg/models/operations/requestbodypostjsondatatypesdatetimeresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostJSONDataTypesDecimal

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesDecimal(ctx, types.MustNewDecimalFromString("1.1"))
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [*decimal.Big](../../.md)                                    | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostJSONDataTypesDecimalResponse](../../pkg/models/operations/requestbodypostjsondatatypesdecimalresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostJSONDataTypesDecimalStr

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesDecimalStr(ctx, types.MustNewDecimalFromString("1.1"))
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [*decimal.Big](../../.md)                                    | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostJSONDataTypesDecimalStrResponse](../../pkg/models/operations/requestbodypostjsondatatypesdecimalstrresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostJSONDataTypesFloat32

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesFloat32(ctx, 1.1)
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [float64](../../.md)                                         | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostJSONDataTypesFloat32Response](../../pkg/models/operations/requestbodypostjsondatatypesfloat32response.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostJSONDataTypesInt32

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesInt32(ctx, 1)
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [int](../../.md)                                             | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostJSONDataTypesInt32Response](../../pkg/models/operations/requestbodypostjsondatatypesint32response.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostJSONDataTypesInteger

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesInteger(ctx, 1)
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [int64](../../.md)                                           | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostJSONDataTypesIntegerResponse](../../pkg/models/operations/requestbodypostjsondatatypesintegerresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostJSONDataTypesMapBigIntStr

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"math/big"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesMapBigIntStr(ctx, map[string]*big.Int{
        "test": types.MustNewBigIntFromString("1"),
    })
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [map[string]*big.Int](../../.md)                             | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostJSONDataTypesMapBigIntStrResponse](../../pkg/models/operations/requestbodypostjsondatatypesmapbigintstrresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostJSONDataTypesMapDateTime

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"time"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesMapDateTime(ctx, map[string]time.Time{
        "test": types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
    })
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [map[string]time.Time](../../.md)                            | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostJSONDataTypesMapDateTimeResponse](../../pkg/models/operations/requestbodypostjsondatatypesmapdatetimeresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostJSONDataTypesMapDecimal

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"github.com/ericlagergren/decimal"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesMapDecimal(ctx, map[string]*decimal.Big{
        "test": types.MustNewDecimalFromString("3.141592653589793"),
    })
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [map[string]*decimal.Big](../../.md)                         | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostJSONDataTypesMapDecimalResponse](../../pkg/models/operations/requestbodypostjsondatatypesmapdecimalresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostJSONDataTypesNumber

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesNumber(ctx, 1.1)
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [float64](../../.md)                                         | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostJSONDataTypesNumberResponse](../../pkg/models/operations/requestbodypostjsondatatypesnumberresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostJSONDataTypesString

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesString(ctx, "test")
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [string](../../.md)                                          | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostJSONDataTypesStringResponse](../../pkg/models/operations/requestbodypostjsondatatypesstringresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostMultipleContentTypesComponentFiltered

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"math/big"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesComponentFiltered(ctx, shared.SimpleObject{
        Any: "any",
        Bigint: big.NewInt(8821239038968084),
        BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
        Bool: true,
        BoolOpt: openapi.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
        Decimal: types.MustNewDecimalFromString("3.141592653589793"),
        DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
        Enum: shared.EnumOne,
        Float32: 1.1,
        Float64Str: openapi.Float64(1.1),
        Int: 1,
        Int32: 1,
        Int32Enum: shared.Int32EnumFiftyFive,
        Int64Str: openapi.Int64(100),
        IntEnum: shared.IntEnumSecond,
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

| Parameter                                                      | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `ctx`                                                          | [context.Context](https://pkg.go.dev/context#Context)          | :heavy_check_mark:                                             | The context to use for the request.                            |
| `request`                                                      | [shared.SimpleObject](../../pkg/models/shared/simpleobject.md) | :heavy_check_mark:                                             | The request object to use for the request.                     |
| `opts`                                                         | [][operations.Option](../../pkg/models/operations/option.md)   | :heavy_minus_sign:                                             | The options for this request.                                  |

### Response

**[*operations.RequestBodyPostMultipleContentTypesComponentFilteredResponse](../../pkg/models/operations/requestbodypostmultiplecontenttypescomponentfilteredresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostMultipleContentTypesComponentFilteredDefaultTest

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"math/big"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesComponentFilteredDefaultTest(ctx, shared.SimpleObject{
        Any: "any",
        Bigint: big.NewInt(8821239038968084),
        BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
        Bool: true,
        BoolOpt: openapi.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
        Decimal: types.MustNewDecimalFromString("3.141592653589793"),
        DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
        Enum: shared.EnumOne,
        Float32: 1.1,
        Float64Str: openapi.Float64(1.1),
        Int: 1,
        Int32: 1,
        Int32Enum: shared.Int32EnumFiftyFive,
        Int64Str: openapi.Int64(100),
        IntEnum: shared.IntEnumSecond,
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

| Parameter                                                      | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `ctx`                                                          | [context.Context](https://pkg.go.dev/context#Context)          | :heavy_check_mark:                                             | The context to use for the request.                            |
| `request`                                                      | [shared.SimpleObject](../../pkg/models/shared/simpleobject.md) | :heavy_check_mark:                                             | The request object to use for the request.                     |
| `opts`                                                         | [][operations.Option](../../pkg/models/operations/option.md)   | :heavy_minus_sign:                                             | The options for this request.                                  |

### Response

**[*operations.RequestBodyPostMultipleContentTypesComponentFilteredDefaultTestResponse](../../pkg/models/operations/requestbodypostmultiplecontenttypescomponentfiltereddefaulttestresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostMultipleContentTypesInlineFiltered

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesInlineFiltered(ctx, operations.RequestBodyPostMultipleContentTypesInlineFilteredRequestBody{
        Bool: true,
        Num: 1.1,
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

| Parameter                                                                                                                                                              | Type                                                                                                                                                                   | Required                                                                                                                                                               | Description                                                                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                                                                  | [context.Context](https://pkg.go.dev/context#Context)                                                                                                                  | :heavy_check_mark:                                                                                                                                                     | The context to use for the request.                                                                                                                                    |
| `request`                                                                                                                                                              | [operations.RequestBodyPostMultipleContentTypesInlineFilteredRequestBody](../../pkg/models/operations/requestbodypostmultiplecontenttypesinlinefilteredrequestbody.md) | :heavy_check_mark:                                                                                                                                                     | The request object to use for the request.                                                                                                                             |
| `opts`                                                                                                                                                                 | [][operations.Option](../../pkg/models/operations/option.md)                                                                                                           | :heavy_minus_sign:                                                                                                                                                     | The options for this request.                                                                                                                                          |

### Response

**[*operations.RequestBodyPostMultipleContentTypesInlineFilteredResponse](../../pkg/models/operations/requestbodypostmultiplecontenttypesinlinefilteredresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostMultipleContentTypesSplitParamForm

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitParamForm(ctx, operations.RequestBodyPostMultipleContentTypesSplitParamFormRequestBody{
        Bool3: false,
        Num3: 3466.17,
        Str3: "<value>",
    }, "<value>")
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
| `requestBody`                                                                                                                                                          | [operations.RequestBodyPostMultipleContentTypesSplitParamFormRequestBody](../../pkg/models/operations/requestbodypostmultiplecontenttypessplitparamformrequestbody.md) | :heavy_check_mark:                                                                                                                                                     | N/A                                                                                                                                                                    |
| `paramStr`                                                                                                                                                             | *string*                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                     | N/A                                                                                                                                                                    |
| `opts`                                                                                                                                                                 | [][operations.Option](../../pkg/models/operations/option.md)                                                                                                           | :heavy_minus_sign:                                                                                                                                                     | The options for this request.                                                                                                                                          |

### Response

**[*operations.RequestBodyPostMultipleContentTypesSplitParamFormResponse](../../pkg/models/operations/requestbodypostmultiplecontenttypessplitparamformresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostMultipleContentTypesSplitParamJSON

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitParamJSON(ctx, operations.RequestBodyPostMultipleContentTypesSplitParamJSONRequestBody{
        Bool: false,
        Num: 961.40,
        Str: "<value>",
    }, "<value>")
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
| `requestBody`                                                                                                                                                          | [operations.RequestBodyPostMultipleContentTypesSplitParamJSONRequestBody](../../pkg/models/operations/requestbodypostmultiplecontenttypessplitparamjsonrequestbody.md) | :heavy_check_mark:                                                                                                                                                     | N/A                                                                                                                                                                    |
| `paramStr`                                                                                                                                                             | *string*                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                     | N/A                                                                                                                                                                    |
| `opts`                                                                                                                                                                 | [][operations.Option](../../pkg/models/operations/option.md)                                                                                                           | :heavy_minus_sign:                                                                                                                                                     | The options for this request.                                                                                                                                          |

### Response

**[*operations.RequestBodyPostMultipleContentTypesSplitParamJSONResponse](../../pkg/models/operations/requestbodypostmultiplecontenttypessplitparamjsonresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostMultipleContentTypesSplitParamMultipart

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitParamMultipart(ctx, operations.RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody{
        Bool2: false,
        Num2: 2154.07,
        Str2: "<value>",
    }, "<value>")
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                        | Type                                                                                                                                                                             | Required                                                                                                                                                                         | Description                                                                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                                                                            | [context.Context](https://pkg.go.dev/context#Context)                                                                                                                            | :heavy_check_mark:                                                                                                                                                               | The context to use for the request.                                                                                                                                              |
| `requestBody`                                                                                                                                                                    | [operations.RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody](../../pkg/models/operations/requestbodypostmultiplecontenttypessplitparammultipartrequestbody.md) | :heavy_check_mark:                                                                                                                                                               | N/A                                                                                                                                                                              |
| `paramStr`                                                                                                                                                                       | *string*                                                                                                                                                                         | :heavy_check_mark:                                                                                                                                                               | N/A                                                                                                                                                                              |
| `opts`                                                                                                                                                                           | [][operations.Option](../../pkg/models/operations/option.md)                                                                                                                     | :heavy_minus_sign:                                                                                                                                                               | The options for this request.                                                                                                                                                    |

### Response

**[*operations.RequestBodyPostMultipleContentTypesSplitParamMultipartResponse](../../pkg/models/operations/requestbodypostmultiplecontenttypessplitparammultipartresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostMultipleContentTypesSplitForm

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitForm(ctx, operations.RequestBodyPostMultipleContentTypesSplitFormRequestBody{
        Bool3: false,
        Num3: 8565.79,
        Str3: "<value>",
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
| `request`                                                                                                                                                    | [operations.RequestBodyPostMultipleContentTypesSplitFormRequestBody](../../pkg/models/operations/requestbodypostmultiplecontenttypessplitformrequestbody.md) | :heavy_check_mark:                                                                                                                                           | The request object to use for the request.                                                                                                                   |
| `opts`                                                                                                                                                       | [][operations.Option](../../pkg/models/operations/option.md)                                                                                                 | :heavy_minus_sign:                                                                                                                                           | The options for this request.                                                                                                                                |

### Response

**[*operations.RequestBodyPostMultipleContentTypesSplitFormResponse](../../pkg/models/operations/requestbodypostmultiplecontenttypessplitformresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostMultipleContentTypesSplitJSON

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitJSON(ctx, operations.RequestBodyPostMultipleContentTypesSplitJSONRequestBody{
        Bool: false,
        Num: 9968.15,
        Str: "<value>",
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
| `request`                                                                                                                                                    | [operations.RequestBodyPostMultipleContentTypesSplitJSONRequestBody](../../pkg/models/operations/requestbodypostmultiplecontenttypessplitjsonrequestbody.md) | :heavy_check_mark:                                                                                                                                           | The request object to use for the request.                                                                                                                   |
| `opts`                                                                                                                                                       | [][operations.Option](../../pkg/models/operations/option.md)                                                                                                 | :heavy_minus_sign:                                                                                                                                           | The options for this request.                                                                                                                                |

### Response

**[*operations.RequestBodyPostMultipleContentTypesSplitJSONResponse](../../pkg/models/operations/requestbodypostmultiplecontenttypessplitjsonresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostMultipleContentTypesSplitMultipart

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitMultipart(ctx, operations.RequestBodyPostMultipleContentTypesSplitMultipartRequestBody{
        Bool2: false,
        Num2: 1739.29,
        Str2: "<value>",
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

| Parameter                                                                                                                                                              | Type                                                                                                                                                                   | Required                                                                                                                                                               | Description                                                                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                                                                  | [context.Context](https://pkg.go.dev/context#Context)                                                                                                                  | :heavy_check_mark:                                                                                                                                                     | The context to use for the request.                                                                                                                                    |
| `request`                                                                                                                                                              | [operations.RequestBodyPostMultipleContentTypesSplitMultipartRequestBody](../../pkg/models/operations/requestbodypostmultiplecontenttypessplitmultipartrequestbody.md) | :heavy_check_mark:                                                                                                                                                     | The request object to use for the request.                                                                                                                             |
| `opts`                                                                                                                                                                 | [][operations.Option](../../pkg/models/operations/option.md)                                                                                                           | :heavy_minus_sign:                                                                                                                                                     | The options for this request.                                                                                                                                          |

### Response

**[*operations.RequestBodyPostMultipleContentTypesSplitMultipartResponse](../../pkg/models/operations/requestbodypostmultiplecontenttypessplitmultipartresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostNotNullableNotRequiredStringBody

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostNotNullableNotRequiredStringBody(ctx, nil)
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [string](../../.md)                                          | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostNotNullableNotRequiredStringBodyResponse](../../pkg/models/operations/requestbodypostnotnullablenotrequiredstringbodyresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostNullArray

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostNullArray(ctx, nil)
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [[]string](../../.md)                                        | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostNullArrayResponse](../../pkg/models/operations/requestbodypostnullarrayresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostNullDictionary

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostNullDictionary(ctx, nil)
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [map[string]string](../../.md)                               | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostNullDictionaryResponse](../../pkg/models/operations/requestbodypostnulldictionaryresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostNullableNotRequiredStringBody

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostNullableNotRequiredStringBody(ctx, nil)
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [string](../../.md)                                          | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostNullableNotRequiredStringBodyResponse](../../pkg/models/operations/requestbodypostnullablenotrequiredstringbodyresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPostNullableRequiredStringBody

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPostNullableRequiredStringBody(ctx, nil)
    if err != nil {
        log.Fatal(err)
    }
    if res.Object != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [string](../../.md)                                          | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPostNullableRequiredStringBodyResponse](../../pkg/models/operations/requestbodypostnullablerequiredstringbodyresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPutBytes

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"os"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    request, fileErr := os.Open("example.file")
    if fileErr != nil {
        panic(fileErr)
    }


    res, err := s.RequestBodies.RequestBodyPutBytes(ctx, request)
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
| `request`                                                    | [any](../../.md)                                             | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPutBytesResponse](../../pkg/models/operations/requestbodyputbytesresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPutBytesWithParams

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"os"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    requestBody, fileErr := os.Open("example.file")
    if fileErr != nil {
        panic(fileErr)
    }


    res, err := s.RequestBodies.RequestBodyPutBytesWithParams(ctx, requestBody, "<value>")
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
| `requestBody`                                                | *any*                                                        | :heavy_check_mark:                                           | N/A                                                          |
| `queryStringParam`                                           | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPutBytesWithParamsResponse](../../pkg/models/operations/requestbodyputbyteswithparamsresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPutMultipartDeep

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"math/big"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPutMultipartDeep(ctx, shared.DeepObject{
        Any: shared.CreateAnySimpleObject(
            shared.SimpleObject{
                Any: "any",
                Bigint: big.NewInt(8821239038968084),
                BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
                Bool: true,
                BoolOpt: openapi.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Float64Str: openapi.Float64(1.1),
                Int: 1,
                Int32: 1,
                Int32Enum: shared.Int32EnumFiftyFive,
                Int64Str: openapi.Int64(100),
                IntEnum: shared.IntEnumSecond,
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
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Float64Str: openapi.Float64(1.1),
                Int: 1,
                Int32: 1,
                Int32Enum: shared.Int32EnumFiftyFive,
                Int64Str: openapi.Int64(100),
                IntEnum: shared.IntEnumSecond,
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
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Float64Str: openapi.Float64(1.1),
                Int: 1,
                Int32: 1,
                Int32Enum: shared.Int32EnumFiftyFive,
                Int64Str: openapi.Int64(100),
                IntEnum: shared.IntEnumSecond,
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
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Float64Str: openapi.Float64(1.1),
                Int: 1,
                Int32: 1,
                Int32Enum: shared.Int32EnumFiftyFive,
                Int64Str: openapi.Int64(100),
                IntEnum: shared.IntEnumSecond,
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
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
                Decimal: types.MustNewDecimalFromString("3.141592653589793"),
                DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
                Enum: shared.EnumOne,
                Float32: 1.1,
                Float64Str: openapi.Float64(1.1),
                Int: 1,
                Int32: 1,
                Int32Enum: shared.Int32EnumFiftyFive,
                Int64Str: openapi.Int64(100),
                IntEnum: shared.IntEnumSecond,
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
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
            Decimal: types.MustNewDecimalFromString("3.141592653589793"),
            DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
            Enum: shared.EnumOne,
            Float32: 1.1,
            Float64Str: openapi.Float64(1.1),
            Int: 1,
            Int32: 1,
            Int32Enum: shared.Int32EnumFiftyFive,
            Int64Str: openapi.Int64(100),
            IntEnum: shared.IntEnumSecond,
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

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `request`                                                    | [shared.DeepObject](../../pkg/models/shared/deepobject.md)   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPutMultipartDeepResponse](../../pkg/models/operations/requestbodyputmultipartdeepresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPutMultipartDifferentFileName

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"os"
	"openapi/v2/pkg/models/operations"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    content, fileErr := os.Open("example.file")
    if fileErr != nil {
        panic(fileErr)
    }


    res, err := s.RequestBodies.RequestBodyPutMultipartDifferentFileName(ctx, operations.RequestBodyPutMultipartDifferentFileNameRequestBody{})
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                                                | [context.Context](https://pkg.go.dev/context#Context)                                                                                                | :heavy_check_mark:                                                                                                                                   | The context to use for the request.                                                                                                                  |
| `request`                                                                                                                                            | [operations.RequestBodyPutMultipartDifferentFileNameRequestBody](../../pkg/models/operations/requestbodyputmultipartdifferentfilenamerequestbody.md) | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |
| `opts`                                                                                                                                               | [][operations.Option](../../pkg/models/operations/option.md)                                                                                         | :heavy_minus_sign:                                                                                                                                   | The options for this request.                                                                                                                        |

### Response

**[*operations.RequestBodyPutMultipartDifferentFileNameResponse](../../pkg/models/operations/requestbodyputmultipartdifferentfilenameresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPutMultipartFile

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"os"
	"openapi/v2/pkg/models/operations"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    content, fileErr := os.Open("example.file")
    if fileErr != nil {
        panic(fileErr)
    }


    res, err := s.RequestBodies.RequestBodyPutMultipartFile(ctx, operations.RequestBodyPutMultipartFileRequestBody{})
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                      | [context.Context](https://pkg.go.dev/context#Context)                                                                      | :heavy_check_mark:                                                                                                         | The context to use for the request.                                                                                        |
| `request`                                                                                                                  | [operations.RequestBodyPutMultipartFileRequestBody](../../pkg/models/operations/requestbodyputmultipartfilerequestbody.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `opts`                                                                                                                     | [][operations.Option](../../pkg/models/operations/option.md)                                                               | :heavy_minus_sign:                                                                                                         | The options for this request.                                                                                              |

### Response

**[*operations.RequestBodyPutMultipartFileResponse](../../pkg/models/operations/requestbodyputmultipartfileresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPutMultipartFileRef

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"os"
	"openapi/v2/pkg/models/operations"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    content, fileErr := os.Open("example.file")
    if fileErr != nil {
        panic(fileErr)
    }


    res, err := s.RequestBodies.RequestBodyPutMultipartFileRef(ctx, operations.RequestBodyPutMultipartFileRefRequestBody{})
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                            | [context.Context](https://pkg.go.dev/context#Context)                                                                            | :heavy_check_mark:                                                                                                               | The context to use for the request.                                                                                              |
| `request`                                                                                                                        | [operations.RequestBodyPutMultipartFileRefRequestBody](../../pkg/models/operations/requestbodyputmultipartfilerefrequestbody.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `opts`                                                                                                                           | [][operations.Option](../../pkg/models/operations/option.md)                                                                     | :heavy_minus_sign:                                                                                                               | The options for this request.                                                                                                    |

### Response

**[*operations.RequestBodyPutMultipartFileRefResponse](../../pkg/models/operations/requestbodyputmultipartfilerefresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPutMultipartOptionalRequestBody

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"os"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    content, fileErr := os.Open("example.file")
    if fileErr != nil {
        panic(fileErr)
    }


    res, err := s.RequestBodies.RequestBodyPutMultipartOptionalRequestBody(ctx, nil)
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
| `request`                                                                                                                                                | [operations.RequestBodyPutMultipartOptionalRequestBodyRequestBody](../../pkg/models/operations/requestbodyputmultipartoptionalrequestbodyrequestbody.md) | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |
| `opts`                                                                                                                                                   | [][operations.Option](../../pkg/models/operations/option.md)                                                                                             | :heavy_minus_sign:                                                                                                                                       | The options for this request.                                                                                                                            |

### Response

**[*operations.RequestBodyPutMultipartOptionalRequestBodyResponse](../../pkg/models/operations/requestbodyputmultipartoptionalrequestbodyresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPutMultipartSimple

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"math/big"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPutMultipartSimple(ctx, shared.SimpleObject{
        Any: "any",
        Bigint: big.NewInt(8821239038968084),
        BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
        Bool: true,
        BoolOpt: openapi.Bool(true),
        Date: types.MustDateFromString("2020-01-01"),
        DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
        Decimal: types.MustNewDecimalFromString("3.141592653589793"),
        DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
        Enum: shared.EnumOne,
        Float32: 1.1,
        Float64Str: openapi.Float64(1.1),
        Int: 1,
        Int32: 1,
        Int32Enum: shared.Int32EnumFiftyFive,
        Int64Str: openapi.Int64(100),
        IntEnum: shared.IntEnumSecond,
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

| Parameter                                                      | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `ctx`                                                          | [context.Context](https://pkg.go.dev/context#Context)          | :heavy_check_mark:                                             | The context to use for the request.                            |
| `request`                                                      | [shared.SimpleObject](../../pkg/models/shared/simpleobject.md) | :heavy_check_mark:                                             | The request object to use for the request.                     |
| `opts`                                                         | [][operations.Option](../../pkg/models/operations/option.md)   | :heavy_minus_sign:                                             | The options for this request.                                  |

### Response

**[*operations.RequestBodyPutMultipartSimpleResponse](../../pkg/models/operations/requestbodyputmultipartsimpleresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPutString

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPutString(ctx, "Hello World")
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
| `request`                                                    | [string](../../.md)                                          | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |

### Response

**[*operations.RequestBodyPutStringResponse](../../pkg/models/operations/requestbodyputstringresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyPutStringWithParams

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyPutStringWithParams(ctx, "Hello world", "test param")
    if err != nil {
        log.Fatal(err)
    }
    if res.Res != nil {
        // handle response
    }
}
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |                                                              |
| `requestBody`                                                | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          | Hello world                                                  |
| `queryStringParam`                                           | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          | test param                                                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |                                                              |

### Response

**[*operations.RequestBodyPutStringWithParamsResponse](../../pkg/models/operations/requestbodyputstringwithparamsresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyReadAndWrite

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyReadAndWrite(ctx, shared.ReadWriteObject{
        Num1: 1,
        Num2: 2,
        Num3: 4,
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

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `ctx`                                                                | [context.Context](https://pkg.go.dev/context#Context)                | :heavy_check_mark:                                                   | The context to use for the request.                                  |
| `request`                                                            | [shared.ReadWriteObject](../../pkg/models/shared/readwriteobject.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |
| `opts`                                                               | [][operations.Option](../../pkg/models/operations/option.md)         | :heavy_minus_sign:                                                   | The options for this request.                                        |

### Response

**[*operations.RequestBodyReadAndWriteResponse](../../pkg/models/operations/requestbodyreadandwriteresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyReadOnlyInput

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

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

| Parameter                                                                    | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `ctx`                                                                        | [context.Context](https://pkg.go.dev/context#Context)                        | :heavy_check_mark:                                                           | The context to use for the request.                                          |
| `request`                                                                    | [shared.ReadOnlyObjectInput](../../pkg/models/shared/readonlyobjectinput.md) | :heavy_check_mark:                                                           | The request object to use for the request.                                   |
| `opts`                                                                       | [][operations.Option](../../pkg/models/operations/option.md)                 | :heavy_minus_sign:                                                           | The options for this request.                                                |

### Response

**[*operations.RequestBodyReadOnlyInputResponse](../../pkg/models/operations/requestbodyreadonlyinputresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyReadOnlyUnion

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"math/big"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyReadOnlyUnion(ctx, shared.CreateWeaklyTypedOneOfReadOnlyObjectInputSimpleObject(
        shared.SimpleObject{
            Any: "any",
            Bigint: big.NewInt(8821239038968084),
            BigintStr: types.MustNewBigIntFromString("9223372036854775808"),
            Bool: true,
            BoolOpt: openapi.Bool(true),
            Date: types.MustDateFromString("2020-01-01"),
            DateTime: types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
            Decimal: types.MustNewDecimalFromString("3.141592653589793"),
            DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
            Enum: shared.EnumOne,
            Float32: 1.1,
            Float64Str: openapi.Float64(1.1),
            Int: 1,
            Int32: 1,
            Int32Enum: shared.Int32EnumFiftyFive,
            Int64Str: openapi.Int64(100),
            IntEnum: shared.IntEnumSecond,
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

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `ctx`                                                                                                        | [context.Context](https://pkg.go.dev/context#Context)                                                        | :heavy_check_mark:                                                                                           | The context to use for the request.                                                                          |
| `request`                                                                                                    | [shared.WeaklyTypedOneOfReadOnlyObjectInput](../../pkg/models/shared/weaklytypedoneofreadonlyobjectinput.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |
| `opts`                                                                                                       | [][operations.Option](../../pkg/models/operations/option.md)                                                 | :heavy_minus_sign:                                                                                           | The options for this request.                                                                                |

### Response

**[*operations.RequestBodyReadOnlyUnionResponse](../../pkg/models/operations/requestbodyreadonlyunionresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyReadWriteOnlyUnion

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyReadWriteOnlyUnion(ctx, shared.CreateWeaklyTypedOneOfReadWriteObjectReadWriteObject(
        shared.ReadWriteObject{
            Num1: 1,
            Num2: 2,
            Num3: 4,
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

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                | [context.Context](https://pkg.go.dev/context#Context)                                                | :heavy_check_mark:                                                                                   | The context to use for the request.                                                                  |
| `request`                                                                                            | [shared.WeaklyTypedOneOfReadWriteObject](../../pkg/models/shared/weaklytypedoneofreadwriteobject.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |
| `opts`                                                                                               | [][operations.Option](../../pkg/models/operations/option.md)                                         | :heavy_minus_sign:                                                                                   | The options for this request.                                                                        |

### Response

**[*operations.RequestBodyReadWriteOnlyUnionResponse](../../pkg/models/operations/requestbodyreadwriteonlyunionresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyWriteOnly

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyWriteOnly(ctx, shared.WriteOnlyObject{
        Bool: true,
        Num: 1,
        String: "hello",
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

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `ctx`                                                                | [context.Context](https://pkg.go.dev/context#Context)                | :heavy_check_mark:                                                   | The context to use for the request.                                  |
| `request`                                                            | [shared.WriteOnlyObject](../../pkg/models/shared/writeonlyobject.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |
| `opts`                                                               | [][operations.Option](../../pkg/models/operations/option.md)         | :heavy_minus_sign:                                                   | The options for this request.                                        |

### Response

**[*operations.RequestBodyWriteOnlyResponse](../../pkg/models/operations/requestbodywriteonlyresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyWriteOnlyOutput

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyWriteOnlyOutput(ctx, shared.WriteOnlyObject{
        Bool: true,
        Num: 1,
        String: "hello",
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

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `ctx`                                                                | [context.Context](https://pkg.go.dev/context#Context)                | :heavy_check_mark:                                                   | The context to use for the request.                                  |
| `request`                                                            | [shared.WriteOnlyObject](../../pkg/models/shared/writeonlyobject.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |
| `opts`                                                               | [][operations.Option](../../pkg/models/operations/option.md)         | :heavy_minus_sign:                                                   | The options for this request.                                        |

### Response

**[*operations.RequestBodyWriteOnlyOutputResponse](../../pkg/models/operations/requestbodywriteonlyoutputresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |

## RequestBodyWriteOnlyUnion

### Example Usage

```go
package main

import(
	"context"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"log"
)

func main() {
    ctx := context.Background()
    
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    res, err := s.RequestBodies.RequestBodyWriteOnlyUnion(ctx, shared.CreateWeaklyTypedOneOfWriteOnlyObjectWriteOnlyObject(
        shared.WriteOnlyObject{
            Bool: true,
            Num: 1,
            String: "hello",
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

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                | [context.Context](https://pkg.go.dev/context#Context)                                                | :heavy_check_mark:                                                                                   | The context to use for the request.                                                                  |
| `request`                                                                                            | [shared.WeaklyTypedOneOfWriteOnlyObject](../../pkg/models/shared/weaklytypedoneofwriteonlyobject.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |
| `opts`                                                                                               | [][operations.Option](../../pkg/models/operations/option.md)                                         | :heavy_minus_sign:                                                                                   | The options for this request.                                                                        |

### Response

**[*operations.RequestBodyWriteOnlyUnionResponse](../../pkg/models/operations/requestbodywriteonlyunionresponse.md), error**

### Errors

| Error Type         | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4XX, 5XX           | \*/\*              |