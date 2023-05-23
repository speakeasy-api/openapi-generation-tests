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
        FloatParameter: 1.1,
        Int64Parameter: 111111,
        IntParameter: 1,
        OptEnumParameter: operations.UsageExamplePostOptEnumParameterValue3.ToPointer(),
        StrParameter: "example",
    }, operations.UsageExamplePostSecurity{
        Password: "YOUR_PASSWORD",
        Username: "YOUR_USERNAME",
    })
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

### [SDK](docs/sdk/README.md)

* [PutAnythingIgnoredGeneration](docs/sdk/README.md#putanythingignoredgeneration)
* [ResponseBodyJSONGet](docs/sdk/README.md#responsebodyjsonget)

### [Auth](docs/auth/README.md)

* [APIKeyAuth](docs/auth/README.md#apikeyauth)
* [APIKeyAuthGlobal](docs/auth/README.md#apikeyauthglobal)
* [BasicAuth](docs/auth/README.md#basicauth)
* [BearerAuth](docs/auth/README.md#bearerauth)
* [Oauth2Auth](docs/auth/README.md#oauth2auth)
* [OpenIDConnectAuth](docs/auth/README.md#openidconnectauth)

### [AuthNew](docs/authnew/README.md)

* [APIKeyAuthGlobalNew](docs/authnew/README.md#apikeyauthglobalnew)
* [BasicAuthNew](docs/authnew/README.md#basicauthnew)
* [MultipleMixedOptionsAuth](docs/authnew/README.md#multiplemixedoptionsauth)
* [MultipleMixedSchemeAuth](docs/authnew/README.md#multiplemixedschemeauth)
* [MultipleOptionsWithMixedSchemesAuth](docs/authnew/README.md#multipleoptionswithmixedschemesauth)
* [MultipleOptionsWithSimpleSchemesAuth](docs/authnew/README.md#multipleoptionswithsimpleschemesauth)
* [MultipleSimpleOptionsAuth](docs/authnew/README.md#multiplesimpleoptionsauth)
* [MultipleSimpleSchemeAuth](docs/authnew/README.md#multiplesimpleschemeauth)
* [Oauth2AuthNew](docs/authnew/README.md#oauth2authnew)
* [OpenIDConnectAuthNew](docs/authnew/README.md#openidconnectauthnew)

### [Errors](docs/errors/README.md)

* [ConnectionErrorGet](docs/errors/README.md#connectionerrorget)
* [StatusGet](docs/errors/README.md#statusget)
* [StatusPostRetries](docs/errors/README.md#statuspostretries)

### [Flattening](docs/flattening/README.md)

* [ComponentBodyAndParamConflict](docs/flattening/README.md#componentbodyandparamconflict)
* [ComponentBodyAndParamNoConflict](docs/flattening/README.md#componentbodyandparamnoconflict)
* [ConflictingParams](docs/flattening/README.md#conflictingparams)
* [InlineBodyAndParamConflict](docs/flattening/README.md#inlinebodyandparamconflict)
* [InlineBodyAndParamNoConflict](docs/flattening/README.md#inlinebodyandparamnoconflict)

### [Generation](docs/generation/README.md)

* [AnchorTypesGet](docs/generation/README.md#anchortypesget)
* [CircularReferenceGet](docs/generation/README.md#circularreferenceget)
* [~~DeprecatedNoCommentsGet~~](docs/generation/README.md#deprecatednocommentsget) - :warning: **Deprecated**
* [~~DeprecatedWithCommentsGet~~](docs/generation/README.md#deprecatedwithcommentsget) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** - Use `SimplePathParameterObjects` instead.
* [GlobalNameOverridden](docs/generation/README.md#globalnameoverridden)
* [IgnoredGenerationGet](docs/generation/README.md#ignoredgenerationget)
* [IgnoresPost](docs/generation/README.md#ignorespost)
* [NameOverride](docs/generation/README.md#nameoverride)
* [UsageExamplePost](docs/generation/README.md#usageexamplepost) - An operation used for testing usage examples

### [Globals](docs/globals/README.md)

* [GlobalPathParameterGet](docs/globals/README.md#globalpathparameterget)
* [GlobalsQueryParameterGet](docs/globals/README.md#globalsqueryparameterget)

### [Parameters](docs/parameters/README.md)

* [DeepObjectQueryParamsMap](docs/parameters/README.md#deepobjectqueryparamsmap)
* [DeepObjectQueryParamsObject](docs/parameters/README.md#deepobjectqueryparamsobject)
* [FormQueryParamsArray](docs/parameters/README.md#formqueryparamsarray)
* [FormQueryParamsMap](docs/parameters/README.md#formqueryparamsmap)
* [FormQueryParamsObject](docs/parameters/README.md#formqueryparamsobject)
* [FormQueryParamsPrimitive](docs/parameters/README.md#formqueryparamsprimitive)
* [FormQueryParamsRefParamObject](docs/parameters/README.md#formqueryparamsrefparamobject)
* [HeaderParamsArray](docs/parameters/README.md#headerparamsarray)
* [HeaderParamsMap](docs/parameters/README.md#headerparamsmap)
* [HeaderParamsObject](docs/parameters/README.md#headerparamsobject)
* [HeaderParamsPrimitive](docs/parameters/README.md#headerparamsprimitive)
* [JSONQueryParamsObject](docs/parameters/README.md#jsonqueryparamsobject)
* [MixedQueryParams](docs/parameters/README.md#mixedqueryparams)
* [PathParameterJSON](docs/parameters/README.md#pathparameterjson)
* [PipeDelimitedQueryParamsArray](docs/parameters/README.md#pipedelimitedqueryparamsarray)
* [SimplePathParameterArrays](docs/parameters/README.md#simplepathparameterarrays)
* [SimplePathParameterMaps](docs/parameters/README.md#simplepathparametermaps)
* [SimplePathParameterObjects](docs/parameters/README.md#simplepathparameterobjects)
* [SimplePathParameterPrimitives](docs/parameters/README.md#simplepathparameterprimitives)

### [RequestBodies](docs/requestbodies/README.md)

* [RequestBodyPostApplicationJSONArray](docs/requestbodies/README.md#requestbodypostapplicationjsonarray)
* [RequestBodyPostApplicationJSONArrayObj](docs/requestbodies/README.md#requestbodypostapplicationjsonarrayobj)
* [RequestBodyPostApplicationJSONArrayOfArray](docs/requestbodies/README.md#requestbodypostapplicationjsonarrayofarray)
* [RequestBodyPostApplicationJSONArrayOfArrayOfPrimitive](docs/requestbodies/README.md#requestbodypostapplicationjsonarrayofarrayofprimitive)
* [RequestBodyPostApplicationJSONArrayOfMap](docs/requestbodies/README.md#requestbodypostapplicationjsonarrayofmap)
* [RequestBodyPostApplicationJSONArrayOfPrimitive](docs/requestbodies/README.md#requestbodypostapplicationjsonarrayofprimitive)
* [RequestBodyPostApplicationJSONDeep](docs/requestbodies/README.md#requestbodypostapplicationjsondeep)
* [RequestBodyPostApplicationJSONMap](docs/requestbodies/README.md#requestbodypostapplicationjsonmap)
* [RequestBodyPostApplicationJSONMapObj](docs/requestbodies/README.md#requestbodypostapplicationjsonmapobj)
* [RequestBodyPostApplicationJSONMapOfArray](docs/requestbodies/README.md#requestbodypostapplicationjsonmapofarray)
* [RequestBodyPostApplicationJSONMapOfMap](docs/requestbodies/README.md#requestbodypostapplicationjsonmapofmap)
* [RequestBodyPostApplicationJSONMapOfMapOfPrimitive](docs/requestbodies/README.md#requestbodypostapplicationjsonmapofmapofprimitive)
* [RequestBodyPostApplicationJSONMapOfPrimitive](docs/requestbodies/README.md#requestbodypostapplicationjsonmapofprimitive)
* [RequestBodyPostApplicationJSONMultipleJSONFiltered](docs/requestbodies/README.md#requestbodypostapplicationjsonmultiplejsonfiltered)
* [RequestBodyPostApplicationJSONSimple](docs/requestbodies/README.md#requestbodypostapplicationjsonsimple)
* [RequestBodyPostFormDeep](docs/requestbodies/README.md#requestbodypostformdeep)
* [RequestBodyPostFormMapPrimitive](docs/requestbodies/README.md#requestbodypostformmapprimitive)
* [RequestBodyPostFormSimple](docs/requestbodies/README.md#requestbodypostformsimple)
* [RequestBodyPostMultipleContentTypesComponentFiltered](docs/requestbodies/README.md#requestbodypostmultiplecontenttypescomponentfiltered)
* [RequestBodyPostMultipleContentTypesInlineFiltered](docs/requestbodies/README.md#requestbodypostmultiplecontenttypesinlinefiltered)
* [RequestBodyPostMultipleContentTypesSplitParamForm](docs/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparamform)
* [RequestBodyPostMultipleContentTypesSplitParamJSON](docs/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparamjson)
* [RequestBodyPostMultipleContentTypesSplitParamMultipart](docs/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparammultipart)
* [RequestBodyPostMultipleContentTypesSplitForm](docs/requestbodies/README.md#requestbodypostmultiplecontenttypessplitform)
* [RequestBodyPostMultipleContentTypesSplitJSON](docs/requestbodies/README.md#requestbodypostmultiplecontenttypessplitjson)
* [RequestBodyPostMultipleContentTypesSplitMultipart](docs/requestbodies/README.md#requestbodypostmultiplecontenttypessplitmultipart)
* [RequestBodyPutBytes](docs/requestbodies/README.md#requestbodyputbytes)
* [RequestBodyPutMultipartDeep](docs/requestbodies/README.md#requestbodyputmultipartdeep)
* [RequestBodyPutMultipartFile](docs/requestbodies/README.md#requestbodyputmultipartfile)
* [RequestBodyPutMultipartSimple](docs/requestbodies/README.md#requestbodyputmultipartsimple)
* [RequestBodyPutString](docs/requestbodies/README.md#requestbodyputstring)

### [ResponseBodies](docs/responsebodies/README.md)

* [ResponseBodyBytesGet](docs/responsebodies/README.md#responsebodybytesget)
* [ResponseBodyStringGet](docs/responsebodies/README.md#responsebodystringget)
* [ResponseBodyXMLGet](docs/responsebodies/README.md#responsebodyxmlget)

### [Servers](docs/servers/README.md)

* [SelectGlobalServer](docs/servers/README.md#selectglobalserver)
* [SelectServerWithID](docs/servers/README.md#selectserverwithid) - Select a server by ID.
* [ServerWithTemplates](docs/servers/README.md#serverwithtemplates)
* [ServerWithTemplatesGlobal](docs/servers/README.md#serverwithtemplatesglobal)

### [Telemetry](docs/telemetry/README.md)

* [TelemetrySpeakeasyUserAgentGet](docs/telemetry/README.md#telemetryspeakeasyuseragentget)
* [TelemetryUserAgentGet](docs/telemetry/README.md#telemetryuseragentget)

### [Unions](docs/unions/README.md)

* [MixedTypeOneOfPost](docs/unions/README.md#mixedtypeoneofpost)
* [PrimitiveTypeOneOfPost](docs/unions/README.md#primitivetypeoneofpost)
* [StronglyTypedOneOfPost](docs/unions/README.md#stronglytypedoneofpost)
* [TypedObjectOneOfPost](docs/unions/README.md#typedobjectoneofpost)
* [WeaklyTypedOneOfPost](docs/unions/README.md#weaklytypedoneofpost)
<!-- End SDK Available Operations -->

### Maturity

This SDK is in beta and therefore, we recommend pinning usage to a specific package version.
This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated and maintained programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
