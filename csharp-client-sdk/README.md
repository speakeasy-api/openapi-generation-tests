# openapi

<div align="left">
    <a href="https://speakeasyapi.dev/"><img src="https://custom-icon-badges.demolab.com/badge/-Built%20By%20Speakeasy-212015?style=for-the-badge&logoColor=FBE331&logo=speakeasy&labelColor=545454" /></a>
    <a href="https://github.com/speakeasy-api/openapi-generation-tests.git/actions"><img src="https://img.shields.io/github/actions/workflow/status/speakeasy-api/openapi-generation-tests/speakeasy_sdk_generation.yml?style=for-the-badge" /></a>
    
</div>


## 🏗 **Welcome to your new SDK!** 🏗

It has been generated successfully based on your OpenAPI spec. However, it is not yet ready for production use. Here are some next steps:
- [ ] 🛠 Make your SDK feel handcrafted by [customizing it](https://www.speakeasyapi.dev/docs/customize-sdks)
- [ ] ♻️ Refine your SDK quickly by iterating locally with the [Speakeasy CLI](https://github.com/speakeasy-api/speakeasy)
- [ ] 🎁 Publish your SDK to package managers by [configuring automatic publishing](https://www.speakeasyapi.dev/docs/productionize-sdks/publish-sdks)
- [ ] ✨ When ready to productionize, delete this section from the README
<!-- Start SDK Installation -->
# SDK Installation

## Nuget

```bash
dotnet add package openapi
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->


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

var res = await sdk.Generation.GlobalNameOverriddenAsync();

// handle response
```


# Second
Do this second
```csharp
using SDK;
using SDK.Models.Operations;
using SDK.Models.Shared;
using NodaTime;
using System;

var sdk = new SDKSDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Generation.UsageExamplePostAsync(new UsageExamplePostSecurity() {
    Password = "YOUR_PASSWORD",
    Username = "YOUR_USERNAME",
}, new UsageExamplePostRequest() {
    BigintParameter = 168827,
    BigintStrParameter = 446729,
    BoolParameter = false,
    DateParameter = LocalDate.FromDateTime(DateTime.Parse("2023-06-11")),
    DateTimeDefaultParameter = DateTime.Parse("2022-07-22T13:16:48.221Z"),
    DateTimeParameter = DateTime.Parse("2021-10-21T09:16:58.799Z"),
    DecimalParameter = 5223.72M,
    DecimalStrParameter = 2911.37M,
    DoubleParameter = 6946.59D,
    EnumParameter = SDK.Models.Operations.UsageExamplePostEnumParameter.Value1,
    FalseyNumberParameter = 0D,
    Float32Parameter = 1029.75F,
    FloatParameter = 5669.99D,
    Int64Parameter = 195232,
    IntParameter = 569663,
    StrParameter = "example 1",
    RequestBody = new UsageExamplePostRequestBody() {
        FakerFormattedStrings = new FakerFormattedStrings() {},
        FakerStrings = new FakerStrings() {},
        SimpleObject = new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(DateTime.Parse("2020-01-01")),
            DateTime = DateTime.Parse("2020-01-01T00:00:00.000000001Z"),
            Enum = SDK.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = SDK.Models.Shared.SimpleObjectInt32Enum.FiftyFive,
            IntEnum = SDK.Models.Shared.SimpleObjectIntEnum.Two,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            StrOpt = "testOptional",
        },
    },
    OptEnumParameter = SDK.Models.Operations.UsageExamplePostOptEnumParameter.Value3,
});

// handle response
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
# Available Resources and Operations

## [SDK](docs/sdks/sdk/README.md)

* [PutAnythingIgnoredGeneration](docs/sdks/sdk/README.md#putanythingignoredgeneration)
* [ResponseBodyJsonGet](docs/sdks/sdk/README.md#responsebodyjsonget)

## [Auth](docs/sdks/auth/README.md)

* [ApiKeyAuth](docs/sdks/auth/README.md#apikeyauth)
* [ApiKeyAuthGlobal](docs/sdks/auth/README.md#apikeyauthglobal)
* [BasicAuth](docs/sdks/auth/README.md#basicauth)
* [BearerAuth](docs/sdks/auth/README.md#bearerauth)
* [GlobalBearerAuth](docs/sdks/auth/README.md#globalbearerauth)
* [Oauth2Auth](docs/sdks/auth/README.md#oauth2auth)
* [Oauth2Override](docs/sdks/auth/README.md#oauth2override)
* [OpenIdConnectAuth](docs/sdks/auth/README.md#openidconnectauth)

## [AuthNew](docs/sdks/authnew/README.md)

* [ApiKeyAuthGlobalNew](docs/sdks/authnew/README.md#apikeyauthglobalnew)
* [AuthGlobal](docs/sdks/authnew/README.md#authglobal)
* [BasicAuthNew](docs/sdks/authnew/README.md#basicauthnew)
* [MultipleMixedOptionsAuth](docs/sdks/authnew/README.md#multiplemixedoptionsauth)
* [MultipleMixedSchemeAuth](docs/sdks/authnew/README.md#multiplemixedschemeauth)
* [MultipleOptionsWithMixedSchemesAuth](docs/sdks/authnew/README.md#multipleoptionswithmixedschemesauth)
* [MultipleOptionsWithSimpleSchemesAuth](docs/sdks/authnew/README.md#multipleoptionswithsimpleschemesauth)
* [MultipleSimpleOptionsAuth](docs/sdks/authnew/README.md#multiplesimpleoptionsauth)
* [MultipleSimpleSchemeAuth](docs/sdks/authnew/README.md#multiplesimpleschemeauth)
* [Oauth2AuthNew](docs/sdks/authnew/README.md#oauth2authnew)
* [OpenIdConnectAuthNew](docs/sdks/authnew/README.md#openidconnectauthnew)

## [Documentation](docs/sdks/documentation/README.md)

* [GetDocumentationPerLanguage](docs/sdks/documentation/README.md#getdocumentationperlanguage) - Gets documentation for some language, I guess.

## [Errors](docs/sdks/errors/README.md)

* [ConnectionErrorGet](docs/sdks/errors/README.md#connectionerrorget)
* [StatusGetError](docs/sdks/errors/README.md#statusgeterror)
* [StatusGetXSpeakeasyErrors](docs/sdks/errors/README.md#statusgetxspeakeasyerrors)

## [First](docs/sdks/first/README.md)

* [Get](docs/sdks/first/README.md#get)

## [Flattening](docs/sdks/flattening/README.md)

* [ComponentBodyAndParamConflict](docs/sdks/flattening/README.md#componentbodyandparamconflict)
* [ComponentBodyAndParamNoConflict](docs/sdks/flattening/README.md#componentbodyandparamnoconflict)
* [ConflictingParams](docs/sdks/flattening/README.md#conflictingparams)
* [InlineBodyAndParamConflict](docs/sdks/flattening/README.md#inlinebodyandparamconflict)
* [InlineBodyAndParamNoConflict](docs/sdks/flattening/README.md#inlinebodyandparamnoconflict)

## [Generation](docs/sdks/generation/README.md)

* [AnchorTypesGet](docs/sdks/generation/README.md#anchortypesget)
* [ArrayCircularReferenceGet](docs/sdks/generation/README.md#arraycircularreferenceget)
* [CircularReferenceGet](docs/sdks/generation/README.md#circularreferenceget)
* [DateParamWithDefault](docs/sdks/generation/README.md#dateparamwithdefault)
* [DateTimeParamWithDefault](docs/sdks/generation/README.md#datetimeparamwithdefault)
* [DecimalParamWithDefault](docs/sdks/generation/README.md#decimalparamwithdefault)
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
* [ObjectCircularReferenceGet](docs/sdks/generation/README.md#objectcircularreferenceget)
* [OneOfCircularReferenceGet](docs/sdks/generation/README.md#oneofcircularreferenceget)
* [TypedParameterGenerationGet](docs/sdks/generation/README.md#typedparametergenerationget)
* [UsageExamplePost](docs/sdks/generation/README.md#usageexamplepost) - An operation used for testing usage examples

## [Globals](docs/sdks/globals/README.md)

* [GlobalPathParameterGet](docs/sdks/globals/README.md#globalpathparameterget)
* [GlobalsQueryParameterGet](docs/sdks/globals/README.md#globalsqueryparameterget)


## [Nest.First](docs/sdks/nestfirst/README.md)

* [Get](docs/sdks/nestfirst/README.md#get)

## [Nested](docs/sdks/nested/README.md)

* [Get](docs/sdks/nested/README.md#get)

## [Nested.First](docs/sdks/nestedfirst/README.md)

* [Get](docs/sdks/nestedfirst/README.md#get)

## [Nested.Second](docs/sdks/nestedsecond/README.md)

* [Get](docs/sdks/nestedsecond/README.md#get)

## [Pagination](docs/sdks/pagination/README.md)

* [PaginationCursorBody](docs/sdks/pagination/README.md#paginationcursorbody)
* [PaginationCursorParams](docs/sdks/pagination/README.md#paginationcursorparams)
* [PaginationLimitOffsetOffsetBody](docs/sdks/pagination/README.md#paginationlimitoffsetoffsetbody)
* [PaginationLimitOffsetOffsetParams](docs/sdks/pagination/README.md#paginationlimitoffsetoffsetparams)
* [PaginationLimitOffsetPageBody](docs/sdks/pagination/README.md#paginationlimitoffsetpagebody)
* [PaginationLimitOffsetPageParams](docs/sdks/pagination/README.md#paginationlimitoffsetpageparams)

## [Parameters](docs/sdks/parameters/README.md)

* [DeepObjectQueryParamsMap](docs/sdks/parameters/README.md#deepobjectqueryparamsmap)
* [DeepObjectQueryParamsObject](docs/sdks/parameters/README.md#deepobjectqueryparamsobject)
* [DuplicateParam](docs/sdks/parameters/README.md#duplicateparam)
* [FormQueryParamsArray](docs/sdks/parameters/README.md#formqueryparamsarray)
* [FormQueryParamsCamelObject](docs/sdks/parameters/README.md#formqueryparamscamelobject)
* [FormQueryParamsMap](docs/sdks/parameters/README.md#formqueryparamsmap)
* [FormQueryParamsObject](docs/sdks/parameters/README.md#formqueryparamsobject)
* [FormQueryParamsPrimitive](docs/sdks/parameters/README.md#formqueryparamsprimitive)
* [FormQueryParamsRefParamObject](docs/sdks/parameters/README.md#formqueryparamsrefparamobject)
* [HeaderParamsArray](docs/sdks/parameters/README.md#headerparamsarray)
* [HeaderParamsMap](docs/sdks/parameters/README.md#headerparamsmap)
* [HeaderParamsObject](docs/sdks/parameters/README.md#headerparamsobject)
* [HeaderParamsPrimitive](docs/sdks/parameters/README.md#headerparamsprimitive)
* [JsonQueryParamsObject](docs/sdks/parameters/README.md#jsonqueryparamsobject)
* [MixedParametersCamelCase](docs/sdks/parameters/README.md#mixedparameterscamelcase)
* [MixedParametersPrimitives](docs/sdks/parameters/README.md#mixedparametersprimitives)
* [MixedQueryParams](docs/sdks/parameters/README.md#mixedqueryparams)
* [PathParameterJson](docs/sdks/parameters/README.md#pathparameterjson)
* [PipeDelimitedQueryParamsArray](docs/sdks/parameters/README.md#pipedelimitedqueryparamsarray)
* [SimplePathParameterArrays](docs/sdks/parameters/README.md#simplepathparameterarrays)
* [SimplePathParameterMaps](docs/sdks/parameters/README.md#simplepathparametermaps)
* [SimplePathParameterObjects](docs/sdks/parameters/README.md#simplepathparameterobjects)
* [SimplePathParameterPrimitives](docs/sdks/parameters/README.md#simplepathparameterprimitives)

## [RequestBodies](docs/sdks/requestbodies/README.md)

* [NullableObjectPost](docs/sdks/requestbodies/README.md#nullableobjectpost)
* [NullableRequiredEmptyObjectPost](docs/sdks/requestbodies/README.md#nullablerequiredemptyobjectpost)
* [NullableRequiredPropertyPost](docs/sdks/requestbodies/README.md#nullablerequiredpropertypost)
* [NullableRequiredSharedObjectPost](docs/sdks/requestbodies/README.md#nullablerequiredsharedobjectpost)
* [RequestBodyPostApplicationJsonArray](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarray)
* [RequestBodyPostApplicationJsonArrayCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarraycamelcase)
* [RequestBodyPostApplicationJsonArrayObj](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayobj)
* [RequestBodyPostApplicationJsonArrayObjCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayobjcamelcase)
* [RequestBodyPostApplicationJsonArrayOfArray](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofarray)
* [RequestBodyPostApplicationJsonArrayOfArrayCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofarraycamelcase)
* [RequestBodyPostApplicationJsonArrayOfArrayOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofarrayofprimitive)
* [RequestBodyPostApplicationJsonArrayOfMap](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofmap)
* [RequestBodyPostApplicationJsonArrayOfMapCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofmapcamelcase)
* [RequestBodyPostApplicationJsonArrayOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofprimitive)
* [RequestBodyPostApplicationJsonDeep](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsondeep)
* [RequestBodyPostApplicationJsonDeepCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsondeepcamelcase)
* [RequestBodyPostApplicationJsonMap](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmap)
* [RequestBodyPostApplicationJsonMapCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapcamelcase)
* [RequestBodyPostApplicationJsonMapObj](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapobj)
* [RequestBodyPostApplicationJsonMapObjCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapobjcamelcase)
* [RequestBodyPostApplicationJsonMapOfArray](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofarray)
* [RequestBodyPostApplicationJsonMapOfArrayCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofarraycamelcase)
* [RequestBodyPostApplicationJsonMapOfMap](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofmap)
* [RequestBodyPostApplicationJsonMapOfMapCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofmapcamelcase)
* [RequestBodyPostApplicationJsonMapOfMapOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofmapofprimitive)
* [RequestBodyPostApplicationJsonMapOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofprimitive)
* [RequestBodyPostApplicationJsonMultipleJsonFiltered](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmultiplejsonfiltered)
* [RequestBodyPostApplicationJsonSimple](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonsimple)
* [RequestBodyPostApplicationJsonSimpleCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonsimplecamelcase)
* [RequestBodyPostComplexNumberTypes](docs/sdks/requestbodies/README.md#requestbodypostcomplexnumbertypes)
* [RequestBodyPostDefaultsAndConsts](docs/sdks/requestbodies/README.md#requestbodypostdefaultsandconsts)
* [RequestBodyPostEmptyObject](docs/sdks/requestbodies/README.md#requestbodypostemptyobject)
* [RequestBodyPostFormDeep](docs/sdks/requestbodies/README.md#requestbodypostformdeep)
* [RequestBodyPostFormMapPrimitive](docs/sdks/requestbodies/README.md#requestbodypostformmapprimitive)
* [RequestBodyPostFormSimple](docs/sdks/requestbodies/README.md#requestbodypostformsimple)
* [RequestBodyPostJsonDataTypesArrayBigInt](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesarraybigint)
* [RequestBodyPostJsonDataTypesArrayDate](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesarraydate)
* [RequestBodyPostJsonDataTypesArrayDecimalStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesarraydecimalstr)
* [RequestBodyPostJsonDataTypesBigInt](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesbigint)
* [RequestBodyPostJsonDataTypesBigIntStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesbigintstr)
* [RequestBodyPostJsonDataTypesBoolean](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesboolean)
* [RequestBodyPostJsonDataTypesDate](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdate)
* [RequestBodyPostJsonDataTypesDateTime](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdatetime)
* [RequestBodyPostJsonDataTypesDecimal](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdecimal)
* [RequestBodyPostJsonDataTypesDecimalStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdecimalstr)
* [RequestBodyPostJsonDataTypesFloat32](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesfloat32)
* [RequestBodyPostJsonDataTypesInt32](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesint32)
* [RequestBodyPostJsonDataTypesInteger](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesinteger)
* [RequestBodyPostJsonDataTypesMapBigIntStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesmapbigintstr)
* [RequestBodyPostJsonDataTypesMapDateTime](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesmapdatetime)
* [RequestBodyPostJsonDataTypesMapDecimal](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesmapdecimal)
* [RequestBodyPostJsonDataTypesNumber](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesnumber)
* [RequestBodyPostJsonDataTypesString](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesstring)
* [RequestBodyPostMultipleContentTypesComponentFiltered](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypescomponentfiltered)
* [RequestBodyPostMultipleContentTypesInlineFiltered](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypesinlinefiltered)
* [RequestBodyPostMultipleContentTypesSplitParamForm](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparamform)
* [RequestBodyPostMultipleContentTypesSplitParamJson](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparamjson)
* [RequestBodyPostMultipleContentTypesSplitParamMultipart](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparammultipart)
* [RequestBodyPostMultipleContentTypesSplitForm](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitform)
* [RequestBodyPostMultipleContentTypesSplitJson](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitjson)
* [RequestBodyPostMultipleContentTypesSplitMultipart](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitmultipart)
* [RequestBodyPostNotNullableNotRequiredStringBody](docs/sdks/requestbodies/README.md#requestbodypostnotnullablenotrequiredstringbody)
* [RequestBodyPostNullArray](docs/sdks/requestbodies/README.md#requestbodypostnullarray)
* [RequestBodyPostNullDictionary](docs/sdks/requestbodies/README.md#requestbodypostnulldictionary)
* [RequestBodyPostNullableNotRequiredStringBody](docs/sdks/requestbodies/README.md#requestbodypostnullablenotrequiredstringbody)
* [RequestBodyPostNullableRequiredStringBody](docs/sdks/requestbodies/README.md#requestbodypostnullablerequiredstringbody)
* [RequestBodyPutBytes](docs/sdks/requestbodies/README.md#requestbodyputbytes)
* [RequestBodyPutBytesWithParams](docs/sdks/requestbodies/README.md#requestbodyputbyteswithparams)
* [RequestBodyPutMultipartDeep](docs/sdks/requestbodies/README.md#requestbodyputmultipartdeep)
* [RequestBodyPutMultipartDifferentFileName](docs/sdks/requestbodies/README.md#requestbodyputmultipartdifferentfilename)
* [RequestBodyPutMultipartFile](docs/sdks/requestbodies/README.md#requestbodyputmultipartfile)
* [RequestBodyPutMultipartSimple](docs/sdks/requestbodies/README.md#requestbodyputmultipartsimple)
* [RequestBodyPutString](docs/sdks/requestbodies/README.md#requestbodyputstring)
* [RequestBodyPutStringWithParams](docs/sdks/requestbodies/README.md#requestbodyputstringwithparams)
* [RequestBodyReadAndWrite](docs/sdks/requestbodies/README.md#requestbodyreadandwrite)
* [RequestBodyReadOnlyInput](docs/sdks/requestbodies/README.md#requestbodyreadonlyinput)
* [RequestBodyReadOnlyUnion](docs/sdks/requestbodies/README.md#requestbodyreadonlyunion)
* [RequestBodyReadWriteOnlyUnion](docs/sdks/requestbodies/README.md#requestbodyreadwriteonlyunion)
* [RequestBodyWriteOnly](docs/sdks/requestbodies/README.md#requestbodywriteonly)
* [RequestBodyWriteOnlyOutput](docs/sdks/requestbodies/README.md#requestbodywriteonlyoutput)
* [RequestBodyWriteOnlyUnion](docs/sdks/requestbodies/README.md#requestbodywriteonlyunion)

## [Resource](docs/sdks/resource/README.md)

* [CreateFile](docs/sdks/resource/README.md#createfile)
* [CreateResource](docs/sdks/resource/README.md#createresource)
* [DeleteResource](docs/sdks/resource/README.md#deleteresource)
* [GetResource](docs/sdks/resource/README.md#getresource)
* [UpdateResource](docs/sdks/resource/README.md#updateresource)

## [ResponseBodies](docs/sdks/responsebodies/README.md)

* [ResponseBodyAdditionalPropertiesComplexNumbersPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiescomplexnumberspost)
* [ResponseBodyAdditionalPropertiesDatePost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiesdatepost)
* [ResponseBodyAdditionalPropertiesObjectPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiesobjectpost)
* [ResponseBodyAdditionalPropertiesPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiespost)
* [ResponseBodyBytesGet](docs/sdks/responsebodies/README.md#responsebodybytesget)
* [ResponseBodyEmptyWithHeaders](docs/sdks/responsebodies/README.md#responsebodyemptywithheaders)
* [ResponseBodyOptionalGet](docs/sdks/responsebodies/README.md#responsebodyoptionalget)
* [ResponseBodyReadOnly](docs/sdks/responsebodies/README.md#responsebodyreadonly)
* [ResponseBodyStringGet](docs/sdks/responsebodies/README.md#responsebodystringget)
* [ResponseBodyXmlGet](docs/sdks/responsebodies/README.md#responsebodyxmlget)
* [ResponseBodyZeroValueComplexTypePtrsPost](docs/sdks/responsebodies/README.md#responsebodyzerovaluecomplextypeptrspost)

## [Retries](docs/sdks/retries/README.md)

* [RetriesGet](docs/sdks/retries/README.md#retriesget)

## [Second](docs/sdks/second/README.md)

* [Get](docs/sdks/second/README.md#get)

## [Servers](docs/sdks/servers/README.md)

* [SelectGlobalServer](docs/sdks/servers/README.md#selectglobalserver)
* [SelectServerWithID](docs/sdks/servers/README.md#selectserverwithid) - Select a server by ID.
* [ServerWithProtocolTemplate](docs/sdks/servers/README.md#serverwithprotocoltemplate)
* [ServerWithTemplates](docs/sdks/servers/README.md#serverwithtemplates)
* [ServerWithTemplatesGlobal](docs/sdks/servers/README.md#serverwithtemplatesglobal)
* [ServersByIDWithTemplates](docs/sdks/servers/README.md#serversbyidwithtemplates)

## [Telemetry](docs/sdks/telemetry/README.md)

* [TelemetrySpeakeasyUserAgentGet](docs/sdks/telemetry/README.md#telemetryspeakeasyuseragentget)
* [TelemetryUserAgentGet](docs/sdks/telemetry/README.md#telemetryuseragentget)

## [Unions](docs/sdks/unions/README.md)

* [FlattenedTypedObjectPost](docs/sdks/unions/README.md#flattenedtypedobjectpost)
* [MixedTypeOneOfPost](docs/sdks/unions/README.md#mixedtypeoneofpost)
* [NullableOneOfRefInObjectPost](docs/sdks/unions/README.md#nullableoneofrefinobjectpost)
* [NullableOneOfSchemaPost](docs/sdks/unions/README.md#nullableoneofschemapost)
* [NullableOneOfTypeInObjectPost](docs/sdks/unions/README.md#nullableoneoftypeinobjectpost)
* [NullableTypedObjectPost](docs/sdks/unions/README.md#nullabletypedobjectpost)
* [PrimitiveTypeOneOfPost](docs/sdks/unions/README.md#primitivetypeoneofpost)
* [StronglyTypedOneOfPost](docs/sdks/unions/README.md#stronglytypedoneofpost)
* [TypedObjectNullableOneOfPost](docs/sdks/unions/README.md#typedobjectnullableoneofpost)
* [TypedObjectOneOfPost](docs/sdks/unions/README.md#typedobjectoneofpost)
* [UnionDateNull](docs/sdks/unions/README.md#uniondatenull)
* [UnionDateTimeNull](docs/sdks/unions/README.md#uniondatetimenull)
* [WeaklyTypedOneOfPost](docs/sdks/unions/README.md#weaklytypedoneofpost)
<!-- End SDK Available Operations -->

<!-- Start Dev Containers -->



<!-- End Dev Containers -->

<!-- Start Global Parameters -->
# Global Parameters

Certain parameters are configured globally. These parameters must be set on the SDK client instance itself during initialization. When configured as an option during SDK initialization, These global values will be used as defaults on the operations that use them. When such operations are called, there is a place in each to override the global value, if needed.

For example, you can set `globalPathParam` to `100` at SDK initialization and then you do not have to pass the same value on calls to operations like `GlobalPathParameterGet`. But if you want to do so you may, which will locally override the global setting. See the example code below for a demonstration.


## Available Globals

The following global parameters are available. The required parameters must be set when you initialize the SDK client.

| Name | Type | Required | Description |
| ---- | ---- |:--------:| ----------- |
| globalPathParam | long | ✔️ | The globalPathParam parameter. |
| globalQueryParam | string | ✔️ | The globalQueryParam parameter. |



## Example #1

```csharp
using SDK;
using SDK.Models.Shared;
using SDK.Models.Operations;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Globals.GlobalPathParameterGetAsync(719830);

// handle response
```


## Example #2

```csharp
using SDK;
using SDK.Models.Shared;
using SDK.Models.Operations;

var sdk = new SDKSDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Globals.GlobalsQueryParameterGetAsync("string");

// handle response
```

<!-- End Global Parameters -->

<!-- Placeholder for Future Speakeasy SDK Sections -->

# Development

## Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

## Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release!

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
