# openapi

<!-- Start SDK Installation -->
## SDK Installation

```bash
go get github.com/speakeasy-api/openapi-generation-tests/go-client-sdk
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->


```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/shared"
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
    res, err := s.Generation.GlobalNameOverridden(ctx)
    if err != nil {
        log.Fatal(err)
    }

    if res.GetGlobalNameOverride200ApplicationJSONObject != nil {
        // handle response
    }
}
```


## Second
Do this second
```go
package main

import(
	"context"
	"log"
	"openapi"
	"openapi/pkg/models/operations"
	"openapi/pkg/models/shared"
	"math/big"
	"openapi/pkg/types"
)

func main() {
    s := sdk.New(
        sdk.WithGlobalPathParam(100),
        sdk.WithGlobalQueryParam("some example global query param"),
    )
    operationSecurity := operations.UsageExamplePostSecurity{
            Password: "YOUR_PASSWORD",
            Username: "YOUR_USERNAME",
        }

    ctx := context.Background()
    res, err := s.Generation.UsageExamplePost(ctx, operations.UsageExamplePostRequest{
        RequestBody: &operations.UsageExamplePostRequestBody{
            Email: sdk.String("Larue_Rau85@yahoo.com"),
            FormatEmail: sdk.String("Roselyn_Kassulke@yahoo.com"),
            FormatURI: sdk.String("http://innocent-effect.org"),
            FormatUUID: sdk.String("0f467cc8-796e-4d15-9a05-dfc2ddf7cc78"),
            Hostname: sdk.String("soulful-poppy.com"),
            Ipv4: sdk.String("184.163.148.36"),
            Ipv6: sdk.String("8fc8:1674:2cb7:3920:5929:396f:ea75:96eb"),
            SimpleObject: &shared.SimpleObject{
                Any: "architecto",
                Bigint: big.NewInt(60225),
                BigintStr: types.MustBigIntFromString("969810"),
                Bool: true,
                BoolOpt: sdk.Bool(true),
                Date: types.MustDateFromString("2020-01-01"),
                DateTime: types.MustTimeFromString("2020-01-01T00:00:00Z"),
                Enum: shared.EnumTwo,
                Float32: 2.2222222,
                Int: 999999,
                Int32: 1,
                Int32Enum: shared.SimpleObjectInt32EnumOneHundredAndEightyOne,
                IntEnum: shared.SimpleObjectIntEnumSecond,
                IntOptNull: sdk.Int64(999999),
                Num: 1.1,
                NumOptNull: sdk.Float64(1.1),
                Str: "example",
                StrOpt: sdk.String("optional example"),
            },
            Unknown: sdk.String("laborum"),
            URI: sdk.String("http://doting-footage.com"),
            UUID: sdk.String("c5955907-aff1-4a3a-afa9-467739251aa5"),
        },
        BoolParameter: false,
        DateParameter: types.MustDateFromString("2020-01-01"),
        DateTimeParameter: types.MustTimeFromString("2020-01-01T00:00:00Z"),
        DoubleParameter: 2.2222222,
        EnumParameter: operations.UsageExamplePostEnumParameterValue3,
        FalseyNumberParameter: 0,
        Float32Parameter: 1.1,
        FloatParameter: 1.1,
        Int64Parameter: 111111,
        IntParameter: 1,
        OptEnumParameter: operations.UsageExamplePostOptEnumParameterValue3.ToPointer(),
        StrParameter: "example 1",
    }, operationSecurity)
    if err != nil {
        log.Fatal(err)
    }

    if res.UsageExamplePost200ApplicationJSONObject != nil {
        // handle response
    }
}
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## Available Resources and Operations

### [SDK](docs/sdks/sdk/README.md)

* [PutAnythingIgnoredGeneration](docs/sdks/sdk/README.md#putanythingignoredgeneration)
* [ResponseBodyJSONGet](docs/sdks/sdk/README.md#responsebodyjsonget)

### [Auth](docs/sdks/auth/README.md)

* [APIKeyAuth](docs/sdks/auth/README.md#apikeyauth)
* [APIKeyAuthGlobal](docs/sdks/auth/README.md#apikeyauthglobal)
* [BasicAuth](docs/sdks/auth/README.md#basicauth)
* [BearerAuth](docs/sdks/auth/README.md#bearerauth)
* [Oauth2Auth](docs/sdks/auth/README.md#oauth2auth)
* [OpenIDConnectAuth](docs/sdks/auth/README.md#openidconnectauth)

### [AuthNew](docs/sdks/authnew/README.md)

* [APIKeyAuthGlobalNew](docs/sdks/authnew/README.md#apikeyauthglobalnew)
* [BasicAuthNew](docs/sdks/authnew/README.md#basicauthnew)
* [MultipleMixedOptionsAuth](docs/sdks/authnew/README.md#multiplemixedoptionsauth)
* [MultipleMixedSchemeAuth](docs/sdks/authnew/README.md#multiplemixedschemeauth)
* [MultipleOptionsWithMixedSchemesAuth](docs/sdks/authnew/README.md#multipleoptionswithmixedschemesauth)
* [MultipleOptionsWithSimpleSchemesAuth](docs/sdks/authnew/README.md#multipleoptionswithsimpleschemesauth)
* [MultipleSimpleOptionsAuth](docs/sdks/authnew/README.md#multiplesimpleoptionsauth)
* [MultipleSimpleSchemeAuth](docs/sdks/authnew/README.md#multiplesimpleschemeauth)
* [Oauth2AuthNew](docs/sdks/authnew/README.md#oauth2authnew)
* [OpenIDConnectAuthNew](docs/sdks/authnew/README.md#openidconnectauthnew)

### [Errors](docs/sdks/errors/README.md)

* [ConnectionErrorGet](docs/sdks/errors/README.md#connectionerrorget)
* [StatusGetError](docs/sdks/errors/README.md#statusgeterror)
* [StatusGetXSpeakeasyErrors](docs/sdks/errors/README.md#statusgetxspeakeasyerrors)

### [First](docs/sdks/first/README.md)

* [Get](docs/sdks/first/README.md#get)

### [Flattening](docs/sdks/flattening/README.md)

* [ComponentBodyAndParamConflict](docs/sdks/flattening/README.md#componentbodyandparamconflict)
* [ComponentBodyAndParamNoConflict](docs/sdks/flattening/README.md#componentbodyandparamnoconflict)
* [ConflictingParams](docs/sdks/flattening/README.md#conflictingparams)
* [InlineBodyAndParamConflict](docs/sdks/flattening/README.md#inlinebodyandparamconflict)
* [InlineBodyAndParamNoConflict](docs/sdks/flattening/README.md#inlinebodyandparamnoconflict)

### [Generation](docs/sdks/generation/README.md)

* [AnchorTypesGet](docs/sdks/generation/README.md#anchortypesget)
* [CircularReferenceGet](docs/sdks/generation/README.md#circularreferenceget)
* [DeprecatedFieldInSchemaPost](docs/sdks/generation/README.md#deprecatedfieldinschemapost)
* [DeprecatedObjectInSchemaGet](docs/sdks/generation/README.md#deprecatedobjectinschemaget)
* [~~DeprecatedOperationNoCommentsGet~~](docs/sdks/generation/README.md#deprecatedoperationnocommentsget) - :warning: **Deprecated**
* [~~DeprecatedOperationWithCommentsGet~~](docs/sdks/generation/README.md#deprecatedoperationwithcommentsget) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** Use `SimplePathParameterObjects` instead.
* [EmptyObjectGet](docs/sdks/generation/README.md#emptyobjectget)
* [EmptyResponseObjectWithCommentGet](docs/sdks/generation/README.md#emptyresponseobjectwithcommentget)
* [GlobalNameOverridden](docs/sdks/generation/README.md#globalnameoverridden)
* [IgnoredGenerationGet](docs/sdks/generation/README.md#ignoredgenerationget)
* [IgnoresPost](docs/sdks/generation/README.md#ignorespost)
* [NameOverride](docs/sdks/generation/README.md#nameoverride)
* [TypedParameterGenerationGet](docs/sdks/generation/README.md#typedparametergenerationget)
* [UsageExamplePost](docs/sdks/generation/README.md#usageexamplepost) - An operation used for testing usage examples

### [Globals](docs/sdks/globals/README.md)

* [GlobalPathParameterGet](docs/sdks/globals/README.md#globalpathparameterget)
* [GlobalsQueryParameterGet](docs/sdks/globals/README.md#globalsqueryparameterget)

### [Nested](docs/sdks/nested/README.md)

* [Get](docs/sdks/nested/README.md#get)

### [First](docs/sdks/nestedfirst/README.md)

* [Get](docs/sdks/nestedfirst/README.md#get)

### [Second](docs/sdks/nestedsecond/README.md)

* [Get](docs/sdks/nestedsecond/README.md#get)

### [Pagination](docs/sdks/pagination/README.md)

* [PaginationCursorBody](docs/sdks/pagination/README.md#paginationcursorbody)
* [PaginationCursorParams](docs/sdks/pagination/README.md#paginationcursorparams)
* [PaginationLimitOffsetOffsetBody](docs/sdks/pagination/README.md#paginationlimitoffsetoffsetbody)
* [PaginationLimitOffsetOffsetParams](docs/sdks/pagination/README.md#paginationlimitoffsetoffsetparams)
* [PaginationLimitOffsetPageBody](docs/sdks/pagination/README.md#paginationlimitoffsetpagebody)
* [PaginationLimitOffsetPageParams](docs/sdks/pagination/README.md#paginationlimitoffsetpageparams)

### [Parameters](docs/sdks/parameters/README.md)

* [DeepObjectQueryParamsMap](docs/sdks/parameters/README.md#deepobjectqueryparamsmap)
* [DeepObjectQueryParamsObject](docs/sdks/parameters/README.md#deepobjectqueryparamsobject)
* [DuplicateParam](docs/sdks/parameters/README.md#duplicateparam)
* [FormQueryParamsArray](docs/sdks/parameters/README.md#formqueryparamsarray)
* [FormQueryParamsMap](docs/sdks/parameters/README.md#formqueryparamsmap)
* [FormQueryParamsObject](docs/sdks/parameters/README.md#formqueryparamsobject)
* [FormQueryParamsPrimitive](docs/sdks/parameters/README.md#formqueryparamsprimitive)
* [FormQueryParamsRefParamObject](docs/sdks/parameters/README.md#formqueryparamsrefparamobject)
* [HeaderParamsArray](docs/sdks/parameters/README.md#headerparamsarray)
* [HeaderParamsMap](docs/sdks/parameters/README.md#headerparamsmap)
* [HeaderParamsObject](docs/sdks/parameters/README.md#headerparamsobject)
* [HeaderParamsPrimitive](docs/sdks/parameters/README.md#headerparamsprimitive)
* [JSONQueryParamsObject](docs/sdks/parameters/README.md#jsonqueryparamsobject)
* [MixedParametersCamelCase](docs/sdks/parameters/README.md#mixedparameterscamelcase)
* [MixedParametersPrimitives](docs/sdks/parameters/README.md#mixedparametersprimitives)
* [MixedQueryParams](docs/sdks/parameters/README.md#mixedqueryparams)
* [PathParameterJSON](docs/sdks/parameters/README.md#pathparameterjson)
* [PipeDelimitedQueryParamsArray](docs/sdks/parameters/README.md#pipedelimitedqueryparamsarray)
* [SimplePathParameterArrays](docs/sdks/parameters/README.md#simplepathparameterarrays)
* [SimplePathParameterMaps](docs/sdks/parameters/README.md#simplepathparametermaps)
* [SimplePathParameterObjects](docs/sdks/parameters/README.md#simplepathparameterobjects)
* [SimplePathParameterPrimitives](docs/sdks/parameters/README.md#simplepathparameterprimitives)

### [RequestBodies](docs/sdks/requestbodies/README.md)

* [RequestBodyPostApplicationJSONArray](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarray)
* [RequestBodyPostApplicationJSONArrayCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarraycamelcase)
* [RequestBodyPostApplicationJSONArrayObj](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayobj)
* [RequestBodyPostApplicationJSONArrayObjCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayobjcamelcase)
* [RequestBodyPostApplicationJSONArrayOfArray](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofarray)
* [RequestBodyPostApplicationJSONArrayOfArrayCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofarraycamelcase)
* [RequestBodyPostApplicationJSONArrayOfArrayOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofarrayofprimitive)
* [RequestBodyPostApplicationJSONArrayOfMap](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofmap)
* [RequestBodyPostApplicationJSONArrayOfMapCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofmapcamelcase)
* [RequestBodyPostApplicationJSONArrayOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofprimitive)
* [RequestBodyPostApplicationJSONDeep](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsondeep)
* [RequestBodyPostApplicationJSONDeepCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsondeepcamelcase)
* [RequestBodyPostApplicationJSONMap](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmap)
* [RequestBodyPostApplicationJSONMapCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapcamelcase)
* [RequestBodyPostApplicationJSONMapObj](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapobj)
* [RequestBodyPostApplicationJSONMapObjCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapobjcamelcase)
* [RequestBodyPostApplicationJSONMapOfArray](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofarray)
* [RequestBodyPostApplicationJSONMapOfArrayCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofarraycamelcase)
* [RequestBodyPostApplicationJSONMapOfMap](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofmap)
* [RequestBodyPostApplicationJSONMapOfMapCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofmapcamelcase)
* [RequestBodyPostApplicationJSONMapOfMapOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofmapofprimitive)
* [RequestBodyPostApplicationJSONMapOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofprimitive)
* [RequestBodyPostApplicationJSONMultipleJSONFiltered](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmultiplejsonfiltered)
* [RequestBodyPostApplicationJSONSimple](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonsimple)
* [RequestBodyPostApplicationJSONSimpleCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonsimplecamelcase)
* [RequestBodyPostEmptyObject](docs/sdks/requestbodies/README.md#requestbodypostemptyobject)
* [RequestBodyPostFormDeep](docs/sdks/requestbodies/README.md#requestbodypostformdeep)
* [RequestBodyPostFormMapPrimitive](docs/sdks/requestbodies/README.md#requestbodypostformmapprimitive)
* [RequestBodyPostFormSimple](docs/sdks/requestbodies/README.md#requestbodypostformsimple)
* [RequestBodyPostMultipleContentTypesComponentFiltered](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypescomponentfiltered)
* [RequestBodyPostMultipleContentTypesInlineFiltered](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypesinlinefiltered)
* [RequestBodyPostMultipleContentTypesSplitParamForm](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparamform)
* [RequestBodyPostMultipleContentTypesSplitParamJSON](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparamjson)
* [RequestBodyPostMultipleContentTypesSplitParamMultipart](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparammultipart)
* [RequestBodyPostMultipleContentTypesSplitForm](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitform)
* [RequestBodyPostMultipleContentTypesSplitJSON](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitjson)
* [RequestBodyPostMultipleContentTypesSplitMultipart](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitmultipart)
* [RequestBodyPutBytes](docs/sdks/requestbodies/README.md#requestbodyputbytes)
* [RequestBodyPutBytesWithParams](docs/sdks/requestbodies/README.md#requestbodyputbyteswithparams)
* [RequestBodyPutMultipartDeep](docs/sdks/requestbodies/README.md#requestbodyputmultipartdeep)
* [RequestBodyPutMultipartFile](docs/sdks/requestbodies/README.md#requestbodyputmultipartfile)
* [RequestBodyPutMultipartSimple](docs/sdks/requestbodies/README.md#requestbodyputmultipartsimple)
* [RequestBodyPutString](docs/sdks/requestbodies/README.md#requestbodyputstring)
* [RequestBodyPutStringWithParams](docs/sdks/requestbodies/README.md#requestbodyputstringwithparams)
* [RequestBodyReadAndWrite](docs/sdks/requestbodies/README.md#requestbodyreadandwrite)
* [RequestBodyReadOnlyInput](docs/sdks/requestbodies/README.md#requestbodyreadonlyinput)
* [RequestBodyWriteOnly](docs/sdks/requestbodies/README.md#requestbodywriteonly)
* [RequestBodyWriteOnlyOutput](docs/sdks/requestbodies/README.md#requestbodywriteonlyoutput)

### [Resource](docs/sdks/resource/README.md)

* [CreateFile](docs/sdks/resource/README.md#createfile)
* [CreateResource](docs/sdks/resource/README.md#createresource)
* [DeleteResource](docs/sdks/resource/README.md#deleteresource)
* [GetResource](docs/sdks/resource/README.md#getresource)
* [UpdateResource](docs/sdks/resource/README.md#updateresource)

### [ResponseBodies](docs/sdks/responsebodies/README.md)

* [ResponseBodyBytesGet](docs/sdks/responsebodies/README.md#responsebodybytesget)
* [ResponseBodyEmptyWithHeaders](docs/sdks/responsebodies/README.md#responsebodyemptywithheaders)
* [ResponseBodyOptionalGet](docs/sdks/responsebodies/README.md#responsebodyoptionalget)
* [ResponseBodyReadOnly](docs/sdks/responsebodies/README.md#responsebodyreadonly)
* [ResponseBodyStringGet](docs/sdks/responsebodies/README.md#responsebodystringget)
* [ResponseBodyXMLGet](docs/sdks/responsebodies/README.md#responsebodyxmlget)

### [Retries](docs/sdks/retries/README.md)

* [RetriesGet](docs/sdks/retries/README.md#retriesget)

### [Second](docs/sdks/second/README.md)

* [Get](docs/sdks/second/README.md#get)

### [Servers](docs/sdks/servers/README.md)

* [SelectGlobalServer](docs/sdks/servers/README.md#selectglobalserver)
* [SelectServerWithID](docs/sdks/servers/README.md#selectserverwithid) - Select a server by ID.
* [ServerWithProtocolTemplate](docs/sdks/servers/README.md#serverwithprotocoltemplate)
* [ServerWithTemplates](docs/sdks/servers/README.md#serverwithtemplates)
* [ServerWithTemplatesGlobal](docs/sdks/servers/README.md#serverwithtemplatesglobal)
* [ServersByIDWithTemplates](docs/sdks/servers/README.md#serversbyidwithtemplates)

### [Telemetry](docs/sdks/telemetry/README.md)

* [TelemetrySpeakeasyUserAgentGet](docs/sdks/telemetry/README.md#telemetryspeakeasyuseragentget)
* [TelemetryUserAgentGet](docs/sdks/telemetry/README.md#telemetryuseragentget)

### [Unions](docs/sdks/unions/README.md)

* [MixedTypeOneOfPost](docs/sdks/unions/README.md#mixedtypeoneofpost)
* [PrimitiveTypeOneOfPost](docs/sdks/unions/README.md#primitivetypeoneofpost)
* [StronglyTypedOneOfPost](docs/sdks/unions/README.md#stronglytypedoneofpost)
* [TypedObjectOneOfPost](docs/sdks/unions/README.md#typedobjectoneofpost)
* [WeaklyTypedOneOfPost](docs/sdks/unions/README.md#weaklytypedoneofpost)
<!-- End SDK Available Operations -->

### Maturity

This SDK is in beta and therefore, we recommend pinning usage to a specific package version.
This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated and maintained programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
