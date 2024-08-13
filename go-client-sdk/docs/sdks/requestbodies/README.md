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
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := shared.ObjectWithNullEnums{}
    ctx := context.Background()
    res, err := s.RequestBodies.NullEnumPost(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## NullableObjectPost

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request *shared.NullableObject = nil
    ctx := context.Background()
    res, err := s.RequestBodies.NullableObjectPost(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## NullableOptionalFieldsPost

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := operations.NullableOptionalFieldsPostRequestBody{
        NullableRequired: openapi.String("<value>"),
    }
    ctx := context.Background()
    res, err := s.RequestBodies.NullableOptionalFieldsPost(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## NullableRequiredEmptyObjectPost

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := operations.NullableRequiredEmptyObjectPostRequestBody{
        NullableRequiredObj: &operations.NullableRequiredObj{},
        RequiredObj: operations.RequiredObj{},
    }
    ctx := context.Background()
    res, err := s.RequestBodies.NullableRequiredEmptyObjectPost(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## NullableRequiredPropertyPost

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"math/big"
	"openapi/v2/pkg/types"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := operations.NullableRequiredPropertyPostRequestBody{
        NullableRequiredArray: []float64{
            2355.17,
        },
        NullableRequiredBigIntStr: big.NewInt(691741),
        NullableRequiredDateTime: types.MustNewTimeFromString("2022-02-25T02:12:38.668Z"),
        NullableRequiredDecimalStr: types.MustNewDecimalFromString("2820.26"),
        NullableRequiredEnum: operations.NullableRequiredEnumNull.ToPointer(),
        NullableRequiredInt: openapi.Int64(592748),
    }
    ctx := context.Background()
    res, err := s.RequestBodies.NullableRequiredPropertyPost(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## NullableRequiredSharedObjectPost

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := operations.NullableRequiredSharedObjectPostRequestBody{
        NullableRequiredObj: nil,
    }
    ctx := context.Background()
    res, err := s.RequestBodies.NullableRequiredSharedObjectPost(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostApplicationJSONArray

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"math/big"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := []shared.SimpleObject{
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
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArray(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostApplicationJSONArrayCamelCase

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := []shared.SimpleObjectCamelCase{
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
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayCamelCase(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostApplicationJSONArrayObj

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"math/big"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := []shared.SimpleObject{
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
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayObj(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostApplicationJSONArrayObjCamelCase

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := []shared.SimpleObjectCamelCase{
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
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayObjCamelCase(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostApplicationJSONArrayOfArray

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"math/big"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := [][]shared.SimpleObject{
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
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfArray(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostApplicationJSONArrayOfArrayCamelCase

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := [][]shared.SimpleObjectCamelCase{
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
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfArrayCamelCase(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostApplicationJSONArrayOfArrayOfPrimitive

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := [][]string{
        []string{
            "foo",
            "bar",
        },
        []string{
            "buzz",
            "bazz",
        },
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfArrayOfPrimitive(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostApplicationJSONArrayOfMap

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"math/big"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := []map[string]shared.SimpleObject{
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
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfMap(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostApplicationJSONArrayOfMapCamelCase

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := []map[string]shared.SimpleObjectCamelCase{
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
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfMapCamelCase(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostApplicationJSONArrayOfPrimitive

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := []string{
        "hello",
        "world",
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONArrayOfPrimitive(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostApplicationJSONDeep

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"math/big"
	"openapi/v2/pkg/types"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := shared.DeepObject{
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
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONDeep(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostApplicationJSONDeepCamelCase

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := shared.DeepObjectCamelCase{
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
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONDeepCamelCase(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostApplicationJSONMap

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"math/big"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := map[string]shared.SimpleObject{
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
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMap(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostApplicationJSONMapCamelCase

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := map[string]shared.SimpleObjectCamelCase{
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
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapCamelCase(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostApplicationJSONMapObj

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"math/big"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := map[string]shared.SimpleObject{
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
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapObj(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostApplicationJSONMapObjCamelCase

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := map[string]shared.SimpleObjectCamelCase{
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
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapObjCamelCase(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostApplicationJSONMapOfArray

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"math/big"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := map[string][]shared.SimpleObject{
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
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfArray(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostApplicationJSONMapOfArrayCamelCase

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := map[string][]shared.SimpleObjectCamelCase{
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
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfArrayCamelCase(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostApplicationJSONMapOfMap

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"math/big"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := map[string]map[string]shared.SimpleObject{
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
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfMap(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostApplicationJSONMapOfMapCamelCase

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := map[string]map[string]shared.SimpleObjectCamelCase{
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
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfMapCamelCase(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostApplicationJSONMapOfMapOfPrimitive

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := map[string]map[string]string{
        "mapElem1": map[string]string{
            "subMapElem1": "foo",
            "subMapElem2": "bar",
        },
        "mapElem2": map[string]string{
            "subMapElem1": "buzz",
            "subMapElem2": "bazz",
        },
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfMapOfPrimitive(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostApplicationJSONMapOfPrimitive

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := map[string]string{
        "mapElem1": "hello",
        "mapElem2": "world",
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMapOfPrimitive(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostApplicationJSONMultipleJSONFiltered

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"math/big"
	"openapi/v2/pkg/types"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := shared.SimpleObject{
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
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONMultipleJSONFiltered(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostApplicationJSONSimple

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"math/big"
	"openapi/v2/pkg/types"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := shared.SimpleObject{
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
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONSimple(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostApplicationJSONSimpleCamelCase

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := shared.SimpleObjectCamelCase{
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
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostApplicationJSONSimpleCamelCase(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostComplexNumberTypes

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"math/big"
	"openapi/v2/pkg/types"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := operations.RequestBodyPostComplexNumberTypesRequest{
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
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostComplexNumberTypes(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostDefaultsAndConsts

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := shared.DefaultsAndConsts{
        NormalField: "test",
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostDefaultsAndConsts(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostEmptyObject

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := operations.RequestBodyPostEmptyObjectRequestBody{}
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostEmptyObject(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostFormDeep

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"math/big"
	"openapi/v2/pkg/types"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := shared.DeepObject{
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
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostFormDeep(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostFormMapPrimitive

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := map[string]string{
        "key1": "value1",
        "key2": "value2",
        "key3": "value3",
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostFormMapPrimitive(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostFormSimple

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"math/big"
	"openapi/v2/pkg/types"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := shared.SimpleObject{
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
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostFormSimple(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostJSONDataTypesArrayBigInt

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"math/big"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := []*big.Int{
        big.NewInt(1),
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesArrayBigInt(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostJSONDataTypesArrayDate

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := []types.Date{
        types.MustDateFromString("2020-01-01"),
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesArrayDate(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostJSONDataTypesArrayDecimalStr

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"github.com/ericlagergren/decimal"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := []*decimal.Big{
        types.MustNewDecimalFromString("3.141592653589793438462643383279"),
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesArrayDecimalStr(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostJSONDataTypesBigInt

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"math/big"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request *big.Int = big.NewInt(1)
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesBigInt(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostJSONDataTypesBigIntStr

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"math/big"
	"openapi/v2/pkg/types"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request *big.Int = types.MustNewBigIntFromString("1")
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesBigIntStr(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostJSONDataTypesBoolean

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request bool = true
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesBoolean(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostJSONDataTypesComplexNumberArrays

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := shared.ComplexNumberArrays{}
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesComplexNumberArrays(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostJSONDataTypesComplexNumberMaps

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := shared.ComplexNumberMaps{}
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesComplexNumberMaps(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostJSONDataTypesDate

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request types.Date = types.MustDateFromString("2020-01-01")
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesDate(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostJSONDataTypesDateTime

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"time"
	"openapi/v2/pkg/types"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request time.Time = types.MustTimeFromString("2020-01-01T00:00:00.001Z")
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesDateTime(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostJSONDataTypesDecimal

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"github.com/ericlagergren/decimal"
	"openapi/v2/pkg/types"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request *decimal.Big = types.MustNewDecimalFromString("1.1")
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesDecimal(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostJSONDataTypesDecimalStr

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"github.com/ericlagergren/decimal"
	"openapi/v2/pkg/types"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request *decimal.Big = types.MustNewDecimalFromString("1.1")
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesDecimalStr(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostJSONDataTypesFloat32

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request float64 = 1.1
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesFloat32(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostJSONDataTypesInt32

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request int = 1
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesInt32(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostJSONDataTypesInteger

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request int64 = 1
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesInteger(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostJSONDataTypesMapBigIntStr

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"math/big"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := map[string]*big.Int{
        "test": types.MustNewBigIntFromString("1"),
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesMapBigIntStr(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostJSONDataTypesMapDateTime

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"time"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := map[string]time.Time{
        "test": types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesMapDateTime(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostJSONDataTypesMapDecimal

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/types"
	"github.com/ericlagergren/decimal"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := map[string]*decimal.Big{
        "test": types.MustNewDecimalFromString("3.141592653589793"),
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesMapDecimal(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostJSONDataTypesNumber

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request float64 = 1.1
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesNumber(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostJSONDataTypesString

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request string = "test"
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostJSONDataTypesString(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostMultipleContentTypesComponentFiltered

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"math/big"
	"openapi/v2/pkg/types"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := shared.SimpleObject{
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
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesComponentFiltered(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostMultipleContentTypesComponentFilteredDefaultTest

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"math/big"
	"openapi/v2/pkg/types"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := shared.SimpleObject{
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
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesComponentFilteredDefaultTest(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostMultipleContentTypesInlineFiltered

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := operations.RequestBodyPostMultipleContentTypesInlineFilteredRequestBody{
        Bool: true,
        Num: 1.1,
        Str: "test",
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesInlineFiltered(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostMultipleContentTypesSplitParamForm

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    requestBody := operations.RequestBodyPostMultipleContentTypesSplitParamFormRequestBody{
        Bool3: false,
        Num3: 8693.24,
        Str3: "<value>",
    }

    var paramStr string = "<value>"
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

| Parameter                                                                                                                                                              | Type                                                                                                                                                                   | Required                                                                                                                                                               | Description                                                                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                                                                  | [context.Context](https://pkg.go.dev/context#Context)                                                                                                                  | :heavy_check_mark:                                                                                                                                                     | The context to use for the request.                                                                                                                                    |
| `requestBody`                                                                                                                                                          | [operations.RequestBodyPostMultipleContentTypesSplitParamFormRequestBody](../../pkg/models/operations/requestbodypostmultiplecontenttypessplitparamformrequestbody.md) | :heavy_check_mark:                                                                                                                                                     | N/A                                                                                                                                                                    |
| `paramStr`                                                                                                                                                             | *string*                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                     | N/A                                                                                                                                                                    |
| `opts`                                                                                                                                                                 | [][operations.Option](../../pkg/models/operations/option.md)                                                                                                           | :heavy_minus_sign:                                                                                                                                                     | The options for this request.                                                                                                                                          |


### Response

**[*operations.RequestBodyPostMultipleContentTypesSplitParamFormResponse](../../pkg/models/operations/requestbodypostmultiplecontenttypessplitparamformresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostMultipleContentTypesSplitParamJSON

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    requestBody := operations.RequestBodyPostMultipleContentTypesSplitParamJSONRequestBody{
        Bool: false,
        Num: 9771.91,
        Str: "<value>",
    }

    var paramStr string = "<value>"
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

| Parameter                                                                                                                                                              | Type                                                                                                                                                                   | Required                                                                                                                                                               | Description                                                                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                                                                  | [context.Context](https://pkg.go.dev/context#Context)                                                                                                                  | :heavy_check_mark:                                                                                                                                                     | The context to use for the request.                                                                                                                                    |
| `requestBody`                                                                                                                                                          | [operations.RequestBodyPostMultipleContentTypesSplitParamJSONRequestBody](../../pkg/models/operations/requestbodypostmultiplecontenttypessplitparamjsonrequestbody.md) | :heavy_check_mark:                                                                                                                                                     | N/A                                                                                                                                                                    |
| `paramStr`                                                                                                                                                             | *string*                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                     | N/A                                                                                                                                                                    |
| `opts`                                                                                                                                                                 | [][operations.Option](../../pkg/models/operations/option.md)                                                                                                           | :heavy_minus_sign:                                                                                                                                                     | The options for this request.                                                                                                                                          |


### Response

**[*operations.RequestBodyPostMultipleContentTypesSplitParamJSONResponse](../../pkg/models/operations/requestbodypostmultiplecontenttypessplitparamjsonresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostMultipleContentTypesSplitParamMultipart

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    requestBody := operations.RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody{
        Bool2: false,
        Num2: 7000.76,
        Str2: "<value>",
    }

    var paramStr string = "<value>"
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

| Parameter                                                                                                                                                                        | Type                                                                                                                                                                             | Required                                                                                                                                                                         | Description                                                                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `ctx`                                                                                                                                                                            | [context.Context](https://pkg.go.dev/context#Context)                                                                                                                            | :heavy_check_mark:                                                                                                                                                               | The context to use for the request.                                                                                                                                              |
| `requestBody`                                                                                                                                                                    | [operations.RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody](../../pkg/models/operations/requestbodypostmultiplecontenttypessplitparammultipartrequestbody.md) | :heavy_check_mark:                                                                                                                                                               | N/A                                                                                                                                                                              |
| `paramStr`                                                                                                                                                                       | *string*                                                                                                                                                                         | :heavy_check_mark:                                                                                                                                                               | N/A                                                                                                                                                                              |
| `opts`                                                                                                                                                                           | [][operations.Option](../../pkg/models/operations/option.md)                                                                                                                     | :heavy_minus_sign:                                                                                                                                                               | The options for this request.                                                                                                                                                    |


### Response

**[*operations.RequestBodyPostMultipleContentTypesSplitParamMultipartResponse](../../pkg/models/operations/requestbodypostmultiplecontenttypessplitparammultipartresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostMultipleContentTypesSplitForm

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := operations.RequestBodyPostMultipleContentTypesSplitFormRequestBody{
        Bool3: false,
        Num3: 7842.07,
        Str3: "<value>",
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitForm(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostMultipleContentTypesSplitJSON

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := operations.RequestBodyPostMultipleContentTypesSplitJSONRequestBody{
        Bool: false,
        Num: 2445.56,
        Str: "<value>",
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitJSON(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostMultipleContentTypesSplitMultipart

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := operations.RequestBodyPostMultipleContentTypesSplitMultipartRequestBody{
        Bool2: false,
        Num2: 2079.2,
        Str2: "<value>",
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostMultipleContentTypesSplitMultipart(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostNotNullableNotRequiredStringBody

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostNullArray

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request []string = nil
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostNullArray(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostNullDictionary

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request map[string]string = nil
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostNullDictionary(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostNullableNotRequiredStringBody

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request *string = nil
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostNullableNotRequiredStringBody(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPostNullableRequiredStringBody

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request *string = nil
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPostNullableRequiredStringBody(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPutBytes

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request []byte = []byte("0x5DbFFb1Ff9")
    ctx := context.Background()
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
| `request`                                                    | [[]byte](../../.md)                                          | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |


### Response

**[*operations.RequestBodyPutBytesResponse](../../pkg/models/operations/requestbodyputbytesresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPutBytesWithParams

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var requestBody []byte = []byte("0xC1B9cA4eb5")

    var queryStringParam string = "<value>"
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

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |
| `requestBody`                                                | *[]byte*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `queryStringParam`                                           | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |


### Response

**[*operations.RequestBodyPutBytesWithParamsResponse](../../pkg/models/operations/requestbodyputbyteswithparamsresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPutMultipartDeep

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"math/big"
	"openapi/v2/pkg/types"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := shared.DeepObject{
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
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPutMultipartDeep(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPutMultipartDifferentFileName

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := operations.RequestBodyPutMultipartDifferentFileNameRequestBody{}
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPutMultipartDifferentFileName(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPutMultipartFile

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := operations.RequestBodyPutMultipartFileRequestBody{}
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPutMultipartFile(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPutMultipartOptionalRequestBody

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )

    ctx := context.Background()
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPutMultipartSimple

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"math/big"
	"openapi/v2/pkg/types"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := shared.SimpleObject{
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
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPutMultipartSimple(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPutString

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request string = "Hello World"
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyPutString(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyPutStringWithParams

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var requestBody string = "Hello world"

    var queryStringParam string = "test param"
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

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `ctx`                                                        | [context.Context](https://pkg.go.dev/context#Context)        | :heavy_check_mark:                                           | The context to use for the request.                          |                                                              |
| `requestBody`                                                | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          | Hello world                                                  |
| `queryStringParam`                                           | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          | test param                                                   |
| `opts`                                                       | [][operations.Option](../../pkg/models/operations/option.md) | :heavy_minus_sign:                                           | The options for this request.                                |                                                              |


### Response

**[*operations.RequestBodyPutStringWithParamsResponse](../../pkg/models/operations/requestbodyputstringwithparamsresponse.md), error**
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyReadAndWrite

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := shared.ReadWriteObject{
        Num1: 1,
        Num2: 2,
        Num3: 4,
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyReadAndWrite(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyReadOnlyInput

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := shared.ReadOnlyObjectInput{}
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyReadOnlyInput(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyReadOnlyUnion

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"math/big"
	"openapi/v2/pkg/types"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request shared.WeaklyTypedOneOfReadOnlyObjectInput = shared.CreateWeaklyTypedOneOfReadOnlyObjectInputSimpleObject(
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
    )
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyReadOnlyUnion(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyReadWriteOnlyUnion

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request shared.WeaklyTypedOneOfReadWriteObject = shared.CreateWeaklyTypedOneOfReadWriteObjectReadWriteObject(
            shared.ReadWriteObject{
                Num1: 1,
                Num2: 2,
                Num3: 4,
            },
    )
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyReadWriteOnlyUnion(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyWriteOnly

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := shared.WriteOnlyObject{
        Bool: true,
        Num: 1,
        String: "hello",
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyWriteOnly(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyWriteOnlyOutput

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    request := shared.WriteOnlyObject{
        Bool: true,
        Num: 1,
        String: "hello",
    }
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyWriteOnlyOutput(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |

## RequestBodyWriteOnlyUnion

### Example Usage

```go
package main

import(
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"context"
	"log"
)

func main() {
    s := openapi.New(
        openapi.WithGlobalHeaderParam(true),
        openapi.WithGlobalHiddenQueryParam("hello"),
        openapi.WithGlobalPathParam(100),
        openapi.WithGlobalQueryParam("some example global query param"),
    )
    var request shared.WeaklyTypedOneOfWriteOnlyObject = shared.CreateWeaklyTypedOneOfWriteOnlyObjectWriteOnlyObject(
            shared.WriteOnlyObject{
                Bool: true,
                Num: 1,
                String: "hello",
            },
    )
    ctx := context.Background()
    res, err := s.RequestBodies.RequestBodyWriteOnlyUnion(ctx, request)
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
| Error Object       | Status Code        | Content Type       |
| ------------------ | ------------------ | ------------------ |
| sdkerrors.SDKError | 4xx-5xx            | */*                |
