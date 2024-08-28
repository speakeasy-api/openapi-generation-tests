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
<!-- Start SDK Installation [installation] -->
## SDK Installation

### NuGet

```bash
dotnet add package Openapi
```

### Locally

```bash
dotnet add reference path/to/Openapi.csproj
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example 1

```csharp
using Openapi;
using Openapi.Models.Shared;
using NodaTime;
using System.Numerics;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

SimpleObject req = new SimpleObject() {
    Any = "any",
    Bool = true,
    Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
    DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
    Enum = Openapi.Models.Shared.Enum.One,
    Float32 = 1.1F,
    Int = 1,
    Int32 = 1,
    Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
    IntEnum = Openapi.Models.Shared.IntEnum.Second,
    Num = 1.1D,
    Str = "test",
    Bigint = 8821239038968084,
    BigintStr = 9223372036854775808,
    BoolOpt = true,
    Decimal = 3.141592653589793M,
    DecimalStr = 3.14159265358979344719667586M,
    Float64Str = "1.1",
    Int64Str = "100",
    StrOpt = "testOptional",
};

var res = await sdk.Generation.GlobalNameOverriddenAsync(req);

// handle response
```

### Example 2

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Servers.SelectGlobalServerAsync();

// handle response
```

### Second

Do this second

```csharp
using Openapi;
using Openapi.Models.Operations;
using System.Numerics;
using NodaTime;
using Openapi.Models.Shared;

var sdk = new SDK(
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

UsageExamplePostRequest req = new UsageExamplePostRequest() {
    BigintParameter = 168827,
    BigintStrParameter = 446729,
    BoolParameter = false,
    DateParameter = LocalDate.FromDateTime(System.DateTime.Parse("2024-06-10")),
    DateTimeDefaultParameter = System.DateTime.Parse("2023-07-23T01:43:10.512Z"),
    DateTimeParameter = System.DateTime.Parse("2022-10-21T15:42:48.223Z"),
    DecimalParameter = 5223.72M,
    DecimalStrParameter = 2911.37M,
    DoubleParameter = 6946.59D,
    EnumParameter = Openapi.Models.Operations.EnumParameter.Value1,
    FalseyNumberParameter = 0D,
    Float32Parameter = 1029.75F,
    Float64StringParameter = "<value>",
    FloatParameter = 5669.99D,
    Int64Parameter = 195232,
    Int64StringParameter = "<value>",
    IntParameter = 569663,
    StrParameter = "example 1",
    RequestBody = new UsageExamplePostRequestBody() {
        SimpleObject = new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            Enum = Openapi.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Openapi.Models.Shared.Int32Enum.FiftyFive,
            IntEnum = Openapi.Models.Shared.IntEnum.Second,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            Float64Str = "1.1",
            Int64Str = "100",
            StrOpt = "testOptional",
        },
    },
    OptEnumParameter = Openapi.Models.Operations.OptEnumParameter.Value3,
};

var res = await sdk.Generation.UsageExamplePostAsync(
    security: new UsageExamplePostSecurity() {
        Password = "YOUR_PASSWORD",
        Username = "YOUR_USERNAME",
    },
    req);

// handle response
```
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

### [SDK](docs/sdks/sdk/README.md)

* [AmbiguousQueryParam](docs/sdks/sdk/README.md#ambiguousqueryparam) - Tests conflict with C# System namespace
* [AuthenticatedRequest](docs/sdks/sdk/README.md#authenticatedrequest)
* [ConflictingEnum](docs/sdks/sdk/README.md#conflictingenum) - Test potential namespace conflicts with java.lang.Object
* [IgnoredGenerationPut](docs/sdks/sdk/README.md#ignoredgenerationput)
* [MultilineExample](docs/sdks/sdk/README.md#multilineexample)
* [ResponseBodyJsonGet](docs/sdks/sdk/README.md#responsebodyjsonget)

### [Generation](docs/sdks/generation/README.md)

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

### [Unions](docs/sdks/unions/README.md)

* [CollectionOneOfPost](docs/sdks/unions/README.md#collectiononeofpost)
* [ConstDiscriminatedOneOf](docs/sdks/unions/README.md#constdiscriminatedoneof)
* [DiscriminatedOneMultipleMemberships](docs/sdks/unions/README.md#discriminatedonemultiplememberships)
* [DiscriminatedOneMultipleMembershipsHasWheels](docs/sdks/unions/README.md#discriminatedonemultiplemembershipshaswheels)
* [FlattenedTypedObjectPost](docs/sdks/unions/README.md#flattenedtypedobjectpost)
* [InfectedWithAny](docs/sdks/unions/README.md#infectedwithany)
* [MixedTypeOneOfPost](docs/sdks/unions/README.md#mixedtypeoneofpost)
* [MultiMatchAnyOf](docs/sdks/unions/README.md#multimatchanyof)
* [NullableOneOfRefInObjectPost](docs/sdks/unions/README.md#nullableoneofrefinobjectpost)
* [NullableOneOfSchemaPost](docs/sdks/unions/README.md#nullableoneofschemapost)
* [NullableOneOfTypeInObjectPost](docs/sdks/unions/README.md#nullableoneoftypeinobjectpost)
* [NullableTypedObjectPost](docs/sdks/unions/README.md#nullabletypedobjectpost)
* [OneOfOverlappingObjects](docs/sdks/unions/README.md#oneofoverlappingobjects)
* [PrimitiveTypeOneOfPost](docs/sdks/unions/README.md#primitivetypeoneofpost)
* [StronglyTypedOneOfDiscriminatedPost](docs/sdks/unions/README.md#stronglytypedoneofdiscriminatedpost)
* [StronglyTypedOneOfPost](docs/sdks/unions/README.md#stronglytypedoneofpost)
* [StronglyTypedOneOfPostWithNonStandardDiscriminatorName](docs/sdks/unions/README.md#stronglytypedoneofpostwithnonstandarddiscriminatorname)
* [TypedObjectNullableOneOfPost](docs/sdks/unions/README.md#typedobjectnullableoneofpost)
* [TypedObjectOneOfPost](docs/sdks/unions/README.md#typedobjectoneofpost)
* [UnionBigIntStrDecimal](docs/sdks/unions/README.md#unionbigintstrdecimal)
* [UnionDateNull](docs/sdks/unions/README.md#uniondatenull)
* [UnionDateTimeBigInt](docs/sdks/unions/README.md#uniondatetimebigint)
* [UnionDateTimeNull](docs/sdks/unions/README.md#uniondatetimenull)
* [UnionMap](docs/sdks/unions/README.md#unionmap)
* [UnionNestedEnumsForm](docs/sdks/unions/README.md#unionnestedenumsform)
* [UnionNestedEnumsMultipart](docs/sdks/unions/README.md#unionnestedenumsmultipart)
* [WeaklyTypedOneOfNullEnumPost](docs/sdks/unions/README.md#weaklytypedoneofnullenumpost)
* [WeaklyTypedOneOfPost](docs/sdks/unions/README.md#weaklytypedoneofpost)

### [Errors](docs/sdks/errors/README.md)

* [ConnectionErrorGet](docs/sdks/errors/README.md#connectionerrorget)
* [ErrorUnionDiscriminatedPost](docs/sdks/errors/README.md#erroruniondiscriminatedpost)
* [ErrorUnionPost](docs/sdks/errors/README.md#errorunionpost)
* [StatusGetError](docs/sdks/errors/README.md#statusgeterror)
* [StatusGetXSpeakeasyErrors](docs/sdks/errors/README.md#statusgetxspeakeasyerrors)

### [CustomClient](docs/sdks/customclient/README.md)

* [CustomClientPost](docs/sdks/customclient/README.md#customclientpost)

### [ResponseBodies](docs/sdks/responsebodies/README.md)

* [FlattenedEnvelopePaginationResponse](docs/sdks/responsebodies/README.md#flattenedenvelopepaginationresponse)
* [FlattenedEnvelopeResponse](docs/sdks/responsebodies/README.md#flattenedenveloperesponse)
* [FlattenedEnvelopeUnionResponse](docs/sdks/responsebodies/README.md#flattenedenvelopeunionresponse)
* [FlattenedUnionResponse](docs/sdks/responsebodies/README.md#flattenedunionresponse)
* [OverriddenFieldNamesPost](docs/sdks/responsebodies/README.md#overriddenfieldnamespost)
* [ResponseBodyAdditionalPropertiesAnyPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiesanypost)
* [ResponseBodyAdditionalPropertiesComplexNumbersPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiescomplexnumberspost)
* [ResponseBodyAdditionalPropertiesDatePost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiesdatepost)
* [ResponseBodyAdditionalPropertiesObjectPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiesobjectpost)
* [ResponseBodyAdditionalPropertiesPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiespost)
* [ResponseBodyBytesGet](docs/sdks/responsebodies/README.md#responsebodybytesget)
* [ResponseBodyDecimalStr](docs/sdks/responsebodies/README.md#responsebodydecimalstr)
* [ResponseBodyEmptyWithHeaders](docs/sdks/responsebodies/README.md#responsebodyemptywithheaders)
* [ResponseBodyMissing2xxOr3xxGet](docs/sdks/responsebodies/README.md#responsebodymissing2xxor3xxget)
* [ResponseBodyOptionalGet](docs/sdks/responsebodies/README.md#responsebodyoptionalget)
* [ResponseBodyReadOnly](docs/sdks/responsebodies/README.md#responsebodyreadonly)
* [ResponseBodyStringGet](docs/sdks/responsebodies/README.md#responsebodystringget)
* [ResponseBodyXmlGet](docs/sdks/responsebodies/README.md#responsebodyxmlget)

### [Flattening](docs/sdks/flattening/README.md)

* [ComponentBodyAndParamConflict](docs/sdks/flattening/README.md#componentbodyandparamconflict)
* [ComponentBodyAndParamNoConflict](docs/sdks/flattening/README.md#componentbodyandparamnoconflict)
* [ConflictingParams](docs/sdks/flattening/README.md#conflictingparams)
* [InlineBodyAndParamConflict](docs/sdks/flattening/README.md#inlinebodyandparamconflict)
* [InlineBodyAndParamNoConflict](docs/sdks/flattening/README.md#inlinebodyandparamnoconflict)

### [Globals](docs/sdks/globals/README.md)

* [GlobalPathParameterGet](docs/sdks/globals/README.md#globalpathparameterget)
* [GlobalsHeaderGet](docs/sdks/globals/README.md#globalsheaderget)
* [GlobalsHiddenPost](docs/sdks/globals/README.md#globalshiddenpost)
* [GlobalsQueryParameterGet](docs/sdks/globals/README.md#globalsqueryparameterget)

### [Parameters](docs/sdks/parameters/README.md)

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
* [JsonQueryParamsObjectSmaller](docs/sdks/parameters/README.md#jsonqueryparamsobjectsmaller)
* [MixedParametersCamelCase](docs/sdks/parameters/README.md#mixedparameterscamelcase)
* [MixedParametersPrimitives](docs/sdks/parameters/README.md#mixedparametersprimitives)
* [MixedQueryParams](docs/sdks/parameters/README.md#mixedqueryparams)
* [PathParameterJson](docs/sdks/parameters/README.md#pathparameterjson)
* [PipeDelimitedQueryParamsArray](docs/sdks/parameters/README.md#pipedelimitedqueryparamsarray)
* [SimplePathParameterArrays](docs/sdks/parameters/README.md#simplepathparameterarrays)
* [SimplePathParameterMaps](docs/sdks/parameters/README.md#simplepathparametermaps)
* [SimplePathParameterObjects](docs/sdks/parameters/README.md#simplepathparameterobjects)
* [SimplePathParameterPrimitives](docs/sdks/parameters/README.md#simplepathparameterprimitives)

### [Hooks](docs/sdks/hooks/README.md)

* [AuthorizationHeaderModification](docs/sdks/hooks/README.md#authorizationheadermodification)
* [TestHooks](docs/sdks/hooks/README.md#testhooks)
* [TestHooksAfterResponse](docs/sdks/hooks/README.md#testhooksafterresponse)
* [TestHooksBeforeCreateRequestPaths](docs/sdks/hooks/README.md#testhooksbeforecreaterequestpaths)
* [TestHooksError](docs/sdks/hooks/README.md#testhookserror)


### [Nest.First](docs/sdks/sdkfirst/README.md)

* [Get](docs/sdks/sdkfirst/README.md#get)

### [Nested](docs/sdks/nested/README.md)

* [Get](docs/sdks/nested/README.md#get)

### [Nested.First](docs/sdks/sdknestedfirst/README.md)

* [Get](docs/sdks/sdknestedfirst/README.md#get)

### [Nested.Second](docs/sdks/sdksecond/README.md)

* [Get](docs/sdks/sdksecond/README.md#get)

### [Auth](docs/sdks/auth/README.md)

* [ApiKeyAuth](docs/sdks/auth/README.md#apikeyauth)
* [ApiKeyAuthGlobal](docs/sdks/auth/README.md#apikeyauthglobal)
* [BasicAuth](docs/sdks/auth/README.md#basicauth)
* [BearerAuth](docs/sdks/auth/README.md#bearerauth)
* [GlobalBearerAuth](docs/sdks/auth/README.md#globalbearerauth)
* [NoAuth](docs/sdks/auth/README.md#noauth)
* [Oauth2Auth](docs/sdks/auth/README.md#oauth2auth)
* [Oauth2Override](docs/sdks/auth/README.md#oauth2override)
* [OpenIdConnectAuth](docs/sdks/auth/README.md#openidconnectauth)

### [OpenEnums](docs/sdks/openenums/README.md)

* [OpenEnumsPostUnrecognized](docs/sdks/openenums/README.md#openenumspostunrecognized)

### [RequestBodies](docs/sdks/requestbodies/README.md)

* [NullEnumPost](docs/sdks/requestbodies/README.md#nullenumpost)
* [NullableObjectPost](docs/sdks/requestbodies/README.md#nullableobjectpost)
* [NullableOptionalFieldsPost](docs/sdks/requestbodies/README.md#nullableoptionalfieldspost)
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
* [RequestBodyPostApplicationJsonArrayOfUnions](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofunions)
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
* [RequestBodyPostJsonDataTypesComplexNumberArrays](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypescomplexnumberarrays)
* [RequestBodyPostJsonDataTypesComplexNumberMaps](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypescomplexnumbermaps)
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
* [RequestBodyPostMultipleContentTypesComponentFilteredDefaultTest](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypescomponentfiltereddefaulttest)
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
* [RequestBodyPutMultipartOptionalRequestBody](docs/sdks/requestbodies/README.md#requestbodyputmultipartoptionalrequestbody)
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

### [AuthNew](docs/sdks/authnew/README.md)

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

### [Resource](docs/sdks/resource/README.md)

* [CreateFile](docs/sdks/resource/README.md#createfile)
* [CreateResource](docs/sdks/resource/README.md#createresource)
* [DeleteResource](docs/sdks/resource/README.md#deleteresource)
* [GetArrayDataSource](docs/sdks/resource/README.md#getarraydatasource)
* [GetResource](docs/sdks/resource/README.md#getresource)
* [UpdateResource](docs/sdks/resource/README.md#updateresource)

### [Documentation](docs/sdks/documentation/README.md)

* [GetDocumentationPerLanguage](docs/sdks/documentation/README.md#getdocumentationperlanguage) - Gets documentation for some language, I guess.

### [First](docs/sdks/first/README.md)

* [Get](docs/sdks/first/README.md#get)

### [Second](docs/sdks/second/README.md)

* [Get](docs/sdks/second/README.md#get)

### [Pagination](docs/sdks/pagination/README.md)

* [PaginationCursorBody](docs/sdks/pagination/README.md#paginationcursorbody)
* [PaginationCursorNonNumeric](docs/sdks/pagination/README.md#paginationcursornonnumeric)
* [PaginationCursorParams](docs/sdks/pagination/README.md#paginationcursorparams)
* [PaginationLimitOffsetDeepOutputsPageBody](docs/sdks/pagination/README.md#paginationlimitoffsetdeepoutputspagebody)
* [PaginationLimitOffsetOffsetBody](docs/sdks/pagination/README.md#paginationlimitoffsetoffsetbody)
* [PaginationLimitOffsetOffsetParams](docs/sdks/pagination/README.md#paginationlimitoffsetoffsetparams)
* [PaginationLimitOffsetPageBody](docs/sdks/pagination/README.md#paginationlimitoffsetpagebody)
* [PaginationLimitOffsetPageParams](docs/sdks/pagination/README.md#paginationlimitoffsetpageparams)
* [PaginationURLParams](docs/sdks/pagination/README.md#paginationurlparams)
* [PaginationWithRetries](docs/sdks/pagination/README.md#paginationwithretries)

### [Retries](docs/sdks/retries/README.md)

* [RetriesAfter](docs/sdks/retries/README.md#retriesafter)
* [RetriesConnectErrorGet](docs/sdks/retries/README.md#retriesconnecterrorget) - A request to a non-valid port to test connection errors
* [RetriesFlatEmptyResponsePost](docs/sdks/retries/README.md#retriesflatemptyresponsepost)
* [RetriesGet](docs/sdks/retries/README.md#retriesget)
* [RetriesPost](docs/sdks/retries/README.md#retriespost)
<!-- End Available Resources and Operations [operations] -->

<!-- Start Global Parameters [global-parameters] -->
## Global Parameters

## Global Parameters

Certain parameters are configured globally. These parameters may be set on the SDK client instance itself during initialization. When configured as an option during SDK initialization, These global values will be used as defaults on the operations that use them. When such operations are called, there is a place in each to override the global value, if needed.

For example, you can set `globalHeaderParam` to `true` at SDK initialization and then you do not have to pass the same value on calls to operations like `GlobalPathParameterGet`. But if you want to do so you may, which will locally override the global setting. See the example code below for a demonstration.


### Available Globals

The following global parameters are available.

| Name | Type | Required | Description |
| ---- | ---- |:--------:| ----------- |
| globalHeaderParam | bool |  | The GlobalHeaderParam parameter. |
| globalHiddenHeaderParam | string |  | The GlobalHiddenHeaderParam parameter. |
| globalHiddenPathParam | string |  | The GlobalHiddenPathParam parameter. |
| globalHiddenQueryParam | string |  | The GlobalHiddenQueryParam parameter. |
| globalPathParam | long |  | The GlobalPathParam parameter. |
| globalQueryParam | string |  | The GlobalQueryParam parameter. |


### Example

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Globals.GlobalPathParameterGetAsync(globalPathParam: 100);

// handle response
```
<!-- End Global Parameters [global-parameters] -->

<!-- Start Pagination [pagination] -->
## Pagination

Some of the endpoints in this SDK support pagination. To use pagination, you make your SDK calls as usual, but the
returned response object will have a `Next` method that can be called to pull down the next group of results. If the
return value of `Next` is `null`, then there are no more pages to be fetched.

Here's an example of one such pagination call:
```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.ResponseBodies.FlattenedEnvelopePaginationResponseAsync(cursor: "<value>");


while(true)
{
    // handle items

    res = await res.Next();
    if (res == null)
    {
        break;
    }
}
```
<!-- End Pagination [pagination] -->

<!-- Start Retries [retries] -->
## Retries

Some of the endpoints in this SDK support retries. If you use the SDK without any configuration, it will fall back to the default retry strategy provided by the API. However, the default retry strategy can be overridden on a per-operation basis, or across the entire SDK.

To change the default retry strategy for a single API call, simply pass a `RetryConfig` to the call:
```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Pagination.PaginationWithRetriesAsync(
    cursor: "<value>",
    faultSettings: "{\"error_code\": 503, \"error_count\": 3}",
    requestId: "paginationWithRetries",
    retryConfig: new RetryConfig(
        strategy: RetryConfig.RetryStrategy.BACKOFF,
        backoff: new BackoffStrategy(
            initialIntervalMs: 1L,
            maxIntervalMs: 50L,
            maxElapsedTimeMs: 100L,
            exponent: 1.1
        ),
        retryConnectionErrors: false
));


while(true)
{
    // handle items

    res = await res.Next();
    if (res == null)
    {
        break;
    }
}
```

If you'd like to override the default retry strategy for all operations that support retries, you can use the `RetryConfig` optional parameter when intitializing the SDK:
```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    retryConfig: new RetryConfig(
        strategy: RetryConfig.RetryStrategy.BACKOFF,
        backoff: new BackoffStrategy(
            initialIntervalMs: 1L,
            maxIntervalMs: 50L,
            maxElapsedTimeMs: 100L,
            exponent: 1.1
        ),
        retryConnectionErrors: false
),
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Pagination.PaginationWithRetriesAsync(
    cursor: "<value>",
    faultSettings: "{\"error_code\": 503, \"error_count\": 3}",
    requestId: "paginationWithRetries");


while(true)
{
    // handle items

    res = await res.Next();
    if (res == null)
    {
        break;
    }
}
```
<!-- End Retries [retries] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations.  All operations return a response object or thow an exception.  If Error objects are specified in your OpenAPI Spec, the SDK will raise the appropriate type.

| Error Object                                                  | Status Code                                                   | Content Type                                                  |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| Openapi.Models.Errors.ErrorUnionDiscriminatedPostResponseBody | 4XX                                                           | application/json                                              |
| Openapi.Models.Errors.SDKException                            | 4xx-5xx                                                       | */*                                                           |

### Example

```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;
using System;
using Openapi.Models.Errors;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

ErrorUnionDiscriminatedPostRequestBody req = ErrorUnionDiscriminatedPostRequestBody.CreateTaggedError2RequestBody(
    new TaggedError2RequestBody() {
        Tag = "<value>",
        TaggedError2Message = new TaggedError2Message() {
            Message = "<value>",
        },
    },
);

try
{
    var res = await sdk.Errors.ErrorUnionDiscriminatedPostAsync(req);
    // handle response
}
catch (Exception ex)
{
    if (ex is ErrorUnionDiscriminatedPostResponseBody)
    {
        // handle exception
    }
    else if (ex is Openapi.Models.Errors.SDKException)
    {
        // handle exception
    }
}

```
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally by passing a server index to the `serverIndex: number` optional parameter when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| # | Server | Variables |
| - | ------ | --------- |
| 0 | `http://localhost:35123` | None |
| 1 | `http://broken` | None |
| 2 | `http://{hostname}:{port}` | `hostname` (default is `localhost`), `port` (default is `35123`) |
| 3 | `http://localhost:35123/anything/{something}` | `something` (default is `something`) |
| 4 | `{protocol}://{hostname}:{port}` | `hostname` (default is `localhost`), `port` (default is `35123`), `protocol` (default is `http`) |



#### Variables

Some of the server options above contain variables. If you want to set the values of those variables, the following options are provided for doing so:
 * `hostname: string`
 * `port: string`
 * `something: ServerSomething`
 * `protocol: string`

### Override Server URL Per-Client

The default server can also be overridden globally by passing a URL to the `serverUrl: str` optional parameter when initializing the SDK client instance. For example:


### Override Server URL Per-Operation

The server URL can also be overridden on a per-operation basis, provided a server list was specified for the operation. For example:
```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.Errors.ConnectionErrorGetAsync(serverUrl: "http://somebrokenapi.broken");

// handle response
```
<!-- End Server Selection [server] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security schemes globally:

| Name         | Type         | Scheme       |
| ------------ | ------------ | ------------ |
| `ApiKeyAuth` | apiKey       | API key      |
| `Oauth2`     | oauth2       | OAuth2 token |

You can set the security parameters through the `security` optional parameter when initializing the SDK client instance. The selected scheme will be used by default to authenticate with the API for all operations that support it. For example:
```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

var res = await sdk.AmbiguousQueryParamAsync(console: Openapi.Models.Operations.Console.Three);

// handle response
```

### Per-Operation Security Schemes

Some operations in this SDK require the security scheme to be specified at the request level. For example:
```csharp
using Openapi;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param");

AuthenticatedRequestRequestBody req = new AuthenticatedRequestRequestBody() {};

var res = await sdk.AuthenticatedRequestAsync(
    security: new AuthenticatedRequestSecurity() {
        ClientCredentials = "<YOUR_CLIENT_CREDENTIALS_HERE>",
    },
    req);

// handle response
```
<!-- End Authentication [security] -->

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
