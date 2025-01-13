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

To add the [NuGet](https://www.nuget.org/) package to a .NET project:
```bash
dotnet add package Openapi
```

### Locally

To add a reference to a local instance of the SDK in a .NET project:
```bash
dotnet add reference Openapi/Openapi.csproj
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example 1

```csharp
using NodaTime;
using Openapi;
using Openapi.Models.Shared;
using System;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

SimpleObject req = new SimpleObject() {
    Any = "any",
    Bool = true,
    Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
    DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
    Enum = Openapi.Models.Shared.Enum.One,
    Float32 = 1.1F,
    Int = 1,
    Int32 = 1,
    Int32Enum = Int32Enum.FiftyFive,
    IntEnum = IntEnum.Second,
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
    globalQueryParam: "some example global query param"
);

var res = await sdk.Servers.SelectGlobalServerAsync();

// handle response
```

### Second

Do this second

```csharp
using NodaTime;
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;
using System;

var sdk = new SDK(
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

UsageExamplePostRequest req = new UsageExamplePostRequest() {
    BigintParameter = 168827,
    BigintStrParameter = 813724,
    BoolParameter = false,
    DateParameter = LocalDate.FromDateTime(System.DateTime.Parse("2023-10-21")),
    DateTimeDefaultParameter = System.DateTime.Parse("2023-11-16T02:05:07.748Z"),
    DateTimeParameter = System.DateTime.Parse("2023-09-08T13:40:52.532Z"),
    DecimalParameter = 5669.99M,
    DecimalStrParameter = 5696.63M,
    DoubleParameter = 3527.78D,
    EnumParameter = EnumParameter.Value2,
    FalseyNumberParameter = 0D,
    Float32Parameter = 200.82F,
    Float64StringParameter = "<value>",
    FloatParameter = 1062.86D,
    Int64Parameter = 234682,
    Int64StringParameter = "<value>",
    IntParameter = 215216,
    StrParameter = "example 2",
    RequestBody = new UsageExamplePostRequestBody() {
        FakerCamelCasePropertyNameStrings = new FakerCamelCasePropertyNameStrings() {
            City = "Fort Cassandra",
            Iban = "TR115005745241192470211411",
            Id = "<id>",
            IPv4 = "221.80.210.91",
            IPv6 = "c41e:563b:f5df:3eec:ade0:f7ff:8aae:bcff",
        },
        FakerFormattedStrings = new FakerFormattedStrings() {
            AddressFormat = "2256 Jackie Way",
            DateFormat = LocalDate.FromDateTime(System.DateTime.Parse("2025-05-13")),
            DatetimeFormat = System.DateTime.Parse("2025-11-24T05:08:23.961Z"),
            DirectoryFormat = "/usr/obj",
            DomainFormat = "prudent-kettledrum.net",
            EmailFormat = "Monserrat4@gmail.com",
            FilenameFormat = "example.file",
            FilepathFormat = "/srv/far_off_though.mp2",
            ImageFormat = "https://picsum.photos/seed/1jCnxsrVm/3900/1676",
            Ipv4Format = "241.49.29.216",
            Ipv6Format = "56ad:dd82:32fe:d68b:eafe:fe5c:0e75:3e9a",
            JsonFormat = "{key: 5416874389095425, key1: null, key2: \"<value>\"}",
            MacFormat = "aa:75:4f:92:a3:c6",
            PasswordFormat = "ZYIrZwC2gbXZm0x",
            PhoneFormat = "895.693.7701 x78668",
            TimezoneFormat = "Africa/Juba",
            UnknownFormat = "<value>",
            UrlFormat = "https://devoted-lady.info/",
            UuidFormat = "95e36984-1bdb-4972-b8f8-91d21ba1e292",
            ZipcodeFormat = "09108",
        },
        FakerKebobCasePropertyNameStrings = new FakerKebobCasePropertyNameStrings() {
            PostalCode = "00476",
        },
        FakerPascalCasePropertyNameStrings = new FakerPascalCasePropertyNameStrings() {
            Account = "05267398",
            Address = "8854 Alta Road",
            Amount = "101.02",
            Avatar = "https://loremflickr.com/2780/914?lock=8012325154053812",
            City = "Maggioboro",
            Color = "fuchsia",
            Comment = "Andy shoes are designed to keeping in mind durability as well as trends, the most stylish range of shoes & sandals",
            Company = "Anderson and Sons",
            Continent = "Europe",
            Country = "Russian Federation",
            CountryCode = "YE",
            CreatedAt = "1707821186066",
            Currency = "Hong Kong Dollar",
            CurrencyCode = "ISK",
            CurrencyISO = "SSP",
            Datatype = "point",
            Default = "<value>",
            Description = "without vice um granny straw",
            Directory = "/var/spool",
            Domain = "informal-rawhide.info",
            DomainName = "zany-drive.biz",
            Email = "Kamryn_Harris-Rice@yahoo.com",
            EmailAddr = "Mackenzie.Homenick43@gmail.com",
            EmailAddress = "Jodie_Sawayn64@hotmail.com",
            ExpiredAt = "1735723229125",
            Expires = "<value>",
            ExpiresAt = "1750318401081",
            Extension = "mp4",
            Filename = "example.file",
            Filepath = "/root/what_enlist.dmg",
            Filetype = "text",
            FirstName = "Rick",
            FullName = "Jim Raynor",
            Gender = "Trans male",
            Host = "nice-version.net",
            HostName = "incomparable-expansion.biz",
            HttpStatus = "403",
            Iban = "PT82007863030094674087035",
            Id = "<id>",
            Ip = "95.76.43.117",
            IpAddr = "3b0a:a56f:c6c2:9330:cbeb:47ed:5aa7:4ccc",
            IpAddress = "6aa0:e917:5cea:beae:91db:bbbe:a1eb:c170",
            Ipv4 = "93.70.29.69",
            Ipv6 = "cbde:29fa:2b6c:517a:79fe:aa67:2895:1c28",
            Job = "Future Accountability Consultant",
            Json = "{key: 4839465338338305, key1: null, key2: \"<value>\"}",
            Key = "<key>",
            LastName = "Luettgen",
            Latitude = "16.1719",
            Locale = "sv",
            Longitude = "167.6076",
            Mac = "58:68:b7:7b:b2:42",
            Manufacturer = "Polestar",
            Material = "Steel",
            MiddleName = "Emerson",
            Model = "Civic",
            Password = "0sOktqRR3ChOYIc",
            Phone = "948.650.8331 x5779",
            Pin = "2379",
            PostalCode = "54207",
            Price = "447.26",
            Product = "Rustic Cotton Towels",
            Sex = "female",
            StatusCode = "507",
            Street = "Sydnee Falls",
            Timezone = "America/Cancun",
            Unit = "steradian",
            UpdatedAt = "1736781714295",
            Uri = "https://tricky-hydrant.biz",
            Url = "https://selfish-epic.net",
            Username = "Katlyn_OHara",
            Uuid = "34551a37-e5ee-4d18-a1e2-0e05958b9b2d",
        },
        FakerSnakeCasePropertyNameStrings = new FakerSnakeCasePropertyNameStrings() {
            CountryCode = "NC",
            CreatedAt = "1722373954858",
            ExpiredAt = "1736377979301",
            UpdatedAt = "1736746772587",
        },
        SimpleObject = new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            Enum = Openapi.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Int32Enum.FiftyFive,
            IntEnum = IntEnum.Second,
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
    OptEnumParameter = OptEnumParameter.Value3,
};

var res = await sdk.Generation.UsageExamplePostAsync(
    security: new UsageExamplePostSecurity() {
        Password = "YOUR_PASSWORD",
        Username = "YOUR_USERNAME",
    },
    request: req
);

// handle response
```
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

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

### [AuthNew](docs/sdks/authnew/README.md)

* [AuthGlobal](docs/sdks/authnew/README.md#authglobal)
* [BasicAuthNew](docs/sdks/authnew/README.md#basicauthnew)
* [CustomSchemeAppId](docs/sdks/authnew/README.md#customschemeappid)
* [MultipleMixedOptionsAuth](docs/sdks/authnew/README.md#multiplemixedoptionsauth)
* [MultipleMixedSchemeAuth](docs/sdks/authnew/README.md#multiplemixedschemeauth)
* [MultipleOptionsWithMixedSchemesAuth](docs/sdks/authnew/README.md#multipleoptionswithmixedschemesauth)
* [MultipleOptionsWithSimpleSchemesAuth](docs/sdks/authnew/README.md#multipleoptionswithsimpleschemesauth)
* [MultipleSimpleOptionsAuth](docs/sdks/authnew/README.md#multiplesimpleoptionsauth)
* [MultipleSimpleSchemeAuth](docs/sdks/authnew/README.md#multiplesimpleschemeauth)
* [Oauth2AuthNew](docs/sdks/authnew/README.md#oauth2authnew)
* [OpenIdConnectAuthNew](docs/sdks/authnew/README.md#openidconnectauthnew)

### [CustomClient](docs/sdks/customclient/README.md)

* [CustomClientPost](docs/sdks/customclient/README.md#customclientpost)

### [Documentation](docs/sdks/documentation/README.md)

* [GetDocumentationPerLanguage](docs/sdks/documentation/README.md#getdocumentationperlanguage) - Gets documentation for some language, I guess.

### [Errors](docs/sdks/errors/README.md)

* [ConnectionErrorGet](docs/sdks/errors/README.md#connectionerrorget)
* [ErrorUnionDiscriminatedPost](docs/sdks/errors/README.md#erroruniondiscriminatedpost)
* [ErrorUnionPost](docs/sdks/errors/README.md#errorunionpost)
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
* [RequiredBodyAllOptional](docs/sdks/flattening/README.md#requiredbodyalloptional)

### [Generation](docs/sdks/generation/README.md)

* [AnchorTypesGet](docs/sdks/generation/README.md#anchortypesget)
* [ArrayCircularReferenceGet](docs/sdks/generation/README.md#arraycircularreferenceget)
* [CircularReferenceGet](docs/sdks/generation/README.md#circularreferenceget)
* [CircularReferenceOneDegree](docs/sdks/generation/README.md#circularreferenceonedegree) - A reference cycle that spans three models separated by one degree
* [DateParamWithDefault](docs/sdks/generation/README.md#dateparamwithdefault)
* [DateTimeParamWithDefault](docs/sdks/generation/README.md#datetimeparamwithdefault)
* [DecimalParamWithDefault](docs/sdks/generation/README.md#decimalparamwithdefault)
* [DeprecatedFieldInSchemaPost](docs/sdks/generation/README.md#deprecatedfieldinschemapost)
* [DeprecatedObjectInSchemaGet](docs/sdks/generation/README.md#deprecatedobjectinschemaget)
* [~~DeprecatedOperationNoCommentsGet~~](docs/sdks/generation/README.md#deprecatedoperationnocommentsget) - :warning: **Deprecated**
* [~~DeprecatedOperationWithCommentsGet~~](docs/sdks/generation/README.md#deprecatedoperationwithcommentsget) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** Use [SimplePathParameterObjects](docs/sdks/parameters/README.md#simplepathparameterobjects) instead.
* [~~DeprecatedOperationWithMultilineCommentGet~~](docs/sdks/generation/README.md#deprecatedoperationwithmultilinecommentget) - This is an endpoint setup to test deprecation with multiline comments :warning: **Deprecated** Use [SimplePathParameterObjects](docs/sdks/parameters/README.md#simplepathparameterobjects) instead.
* [EmptyObjectGet](docs/sdks/generation/README.md#emptyobjectget)
* [EmptyResponseObjectWithCommentGet](docs/sdks/generation/README.md#emptyresponseobjectwithcommentget)
* [GlobalNameOverridden](docs/sdks/generation/README.md#globalnameoverridden)
* [IgnoredGenerationGet](docs/sdks/generation/README.md#ignoredgenerationget)
* [IgnoresPost](docs/sdks/generation/README.md#ignorespost)
* [NameOverride](docs/sdks/generation/README.md#nameoverride)
* [ObjectCircularReferenceGet](docs/sdks/generation/README.md#objectcircularreferenceget)
* [OneOfCircularReferenceGet](docs/sdks/generation/README.md#oneofcircularreferenceget)
* [ReactHookCombinedOptions](docs/sdks/generation/README.md#reacthookcombinedoptions)
* [ReactHookDisabled](docs/sdks/generation/README.md#reacthookdisabled)
* [ReactHookGetAsMutation](docs/sdks/generation/README.md#reacthookgetasmutation)
* [ReactHookPostAsQuery](docs/sdks/generation/README.md#reacthookpostasquery)
* [ReactHookRenamed](docs/sdks/generation/README.md#reacthookrenamed)
* [TypedParameterGenerationGet](docs/sdks/generation/README.md#typedparametergenerationget)
* [UsageExamplePost](docs/sdks/generation/README.md#usageexamplepost) - An operation used for testing usage examples

### [Globals](docs/sdks/globals/README.md)

* [GlobalPathParameterGet](docs/sdks/globals/README.md#globalpathparameterget)
* [GlobalsHeaderGet](docs/sdks/globals/README.md#globalsheaderget)
* [GlobalsHiddenPost](docs/sdks/globals/README.md#globalshiddenpost)
* [GlobalsOptionalHiddenPathParameterOperationRequired](docs/sdks/globals/README.md#globalsoptionalhiddenpathparameteroperationrequired) - This operation requires a globally optional hidden path parameter. A
failing test with 404 likely indicates that the path parameter value is
not being templated into the client (.../hidden//...).

* [GlobalsOptionalHiddenPathParameterPathRequired](docs/sdks/globals/README.md#globalsoptionalhiddenpathparameterpathrequired) - This path requires a globally optional hidden path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the client (.../hidden//...).

* [GlobalsOptionalPathParameterOperationRequired](docs/sdks/globals/README.md#globalsoptionalpathparameteroperationrequired) - This operation requires a globally optional path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the operation request (.../globals//...).

* [GlobalsOptionalPathParameterPathRequired](docs/sdks/globals/README.md#globalsoptionalpathparameterpathrequired) - This path requires a globally optional path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the operation request (.../globals//...).

* [GlobalsQueryParameterGet](docs/sdks/globals/README.md#globalsqueryparameterget)

### [Health](docs/sdks/health/README.md)

* [Check](docs/sdks/health/README.md#check)

### [Hooks](docs/sdks/hooks/README.md)

* [AuthorizationHeaderModification](docs/sdks/hooks/README.md#authorizationheadermodification)
* [TestHooks](docs/sdks/hooks/README.md#testhooks)
* [TestHooksAfterResponse](docs/sdks/hooks/README.md#testhooksafterresponse)
* [TestHooksBeforeCreateRequestPaths](docs/sdks/hooks/README.md#testhooksbeforecreaterequestpaths)
* [TestHooksError](docs/sdks/hooks/README.md#testhookserror)

### [Methods](docs/sdks/methods/README.md)

* [MethodDelete](docs/sdks/methods/README.md#methoddelete)
* [MethodGet](docs/sdks/methods/README.md#methodget)
* [MethodHead](docs/sdks/methods/README.md#methodhead)
* [MethodOptions](docs/sdks/methods/README.md#methodoptions)
* [MethodPatch](docs/sdks/methods/README.md#methodpatch)
* [MethodPost](docs/sdks/methods/README.md#methodpost)
* [MethodPut](docs/sdks/methods/README.md#methodput)
* [MethodTrace](docs/sdks/methods/README.md#methodtrace)

### [Nest](docs/sdks/nest/README.md)


#### [Nest.First](docs/sdks/sdkfirst/README.md)

* [Get](docs/sdks/sdkfirst/README.md#get)

### [Nested](docs/sdks/nested/README.md)

* [Get](docs/sdks/nested/README.md#get)

#### [Nested.First](docs/sdks/sdknestedfirst/README.md)

* [Get](docs/sdks/sdknestedfirst/README.md#get)

#### [Nested.Second](docs/sdks/sdksecond/README.md)

* [Get](docs/sdks/sdksecond/README.md#get)

### [OpenEnums](docs/sdks/openenums/README.md)

* [OpenEnumsPostUnrecognized](docs/sdks/openenums/README.md#openenumspostunrecognized)

### [Pagination](docs/sdks/pagination/README.md)

* [PaginationAmbiguousInput](docs/sdks/pagination/README.md#paginationambiguousinput) - This is a paginated operation where there is both a query parameter and
request body field called "cursor". This ambiguity is used to test that
the generator only updates the appropriate field in the pagination code
"next()" function.

* [PaginationBodyFlattenedOptionalSecurity](docs/sdks/pagination/README.md#paginationbodyflattenedoptionalsecurity)
* [PaginationBodyFlattenedWithSecurity](docs/sdks/pagination/README.md#paginationbodyflattenedwithsecurity)
* [PaginationBodyWrappedRequest](docs/sdks/pagination/README.md#paginationbodywrappedrequest) - This operation has a request wrapper type that encapsulates the
parameters and request body. The pagination inputs are meant to go in
the request body and we want to test that the generator correctly
generates the next() function call preserving everything from the
original request and interpolating the next pagination inputs.

* [PaginationCursorBody](docs/sdks/pagination/README.md#paginationcursorbody)
* [PaginationCursorNonNumeric](docs/sdks/pagination/README.md#paginationcursornonnumeric)
* [PaginationCursorParams](docs/sdks/pagination/README.md#paginationcursorparams)
* [PaginationEncapsulatedParameter](docs/sdks/pagination/README.md#paginationencapsulatedparameter) - This is a paginated operation where the input is a query parameter
but the number of arguments exceeds maxMethodParams so it ends up
being encapsulated into a request object.

* [PaginationLimitOffsetDeepOutputsPageBody](docs/sdks/pagination/README.md#paginationlimitoffsetdeepoutputspagebody)
* [PaginationLimitOffsetDefaultOffsetBody](docs/sdks/pagination/README.md#paginationlimitoffsetdefaultoffsetbody)
* [PaginationLimitOffsetDefaultOffsetParams](docs/sdks/pagination/README.md#paginationlimitoffsetdefaultoffsetparams)
* [PaginationLimitOffsetOffsetBody](docs/sdks/pagination/README.md#paginationlimitoffsetoffsetbody)
* [PaginationLimitOffsetOffsetParams](docs/sdks/pagination/README.md#paginationlimitoffsetoffsetparams)
* [PaginationLimitOffsetOptionalPageParams](docs/sdks/pagination/README.md#paginationlimitoffsetoptionalpageparams)
* [PaginationLimitOffsetPageBody](docs/sdks/pagination/README.md#paginationlimitoffsetpagebody)
* [PaginationLimitOffsetPageParams](docs/sdks/pagination/README.md#paginationlimitoffsetpageparams)
* [PaginationURLParams](docs/sdks/pagination/README.md#paginationurlparams)
* [PaginationWithRetries](docs/sdks/pagination/README.md#paginationwithretries)
* [PaginationWrappedOptionalBody](docs/sdks/pagination/README.md#paginationwrappedoptionalbody)

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
* [HeaderParamsNil](docs/sdks/parameters/README.md#headerparamsnil)
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

### [RequestBodies](docs/sdks/requestbodies/README.md)

* [NullEnumPost](docs/sdks/requestbodies/README.md#nullenumpost)
* [NullableObjectPost](docs/sdks/requestbodies/README.md#nullableobjectpost)
* [NullableOptionalFieldsPost](docs/sdks/requestbodies/README.md#nullableoptionalfieldspost)
* [NullableRequiredEmptyObjectPost](docs/sdks/requestbodies/README.md#nullablerequiredemptyobjectpost)
* [NullableRequiredPropertyPost](docs/sdks/requestbodies/README.md#nullablerequiredpropertypost)
* [NullableRequiredSharedObjectPost](docs/sdks/requestbodies/README.md#nullablerequiredsharedobjectpost)
* [RequestBodyDeprecatedRequestBodyRefPost](docs/sdks/requestbodies/README.md#requestbodydeprecatedrequestbodyrefpost)
* [RequestBodyGetInferredOptionalRequestWrapper](docs/sdks/requestbodies/README.md#requestbodygetinferredoptionalrequestwrapper)
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
* [RequestBodyPostEmptyBodyRetainedWithAllOptionalFields](docs/sdks/requestbodies/README.md#requestbodypostemptybodyretainedwithalloptionalfields)
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
* [RequestBodyPostWildcard](docs/sdks/requestbodies/README.md#requestbodypostwildcard)
* [RequestBodyPutBytes](docs/sdks/requestbodies/README.md#requestbodyputbytes)
* [RequestBodyPutBytesWithParams](docs/sdks/requestbodies/README.md#requestbodyputbyteswithparams)
* [RequestBodyPutMultipartDeep](docs/sdks/requestbodies/README.md#requestbodyputmultipartdeep)
* [RequestBodyPutMultipartDifferentFileName](docs/sdks/requestbodies/README.md#requestbodyputmultipartdifferentfilename)
* [RequestBodyPutMultipartFile](docs/sdks/requestbodies/README.md#requestbodyputmultipartfile)
* [RequestBodyPutMultipartFileRef](docs/sdks/requestbodies/README.md#requestbodyputmultipartfileref)
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

### [Resource](docs/sdks/resource/README.md)

* [CreateFile](docs/sdks/resource/README.md#createfile)
* [CreateResource](docs/sdks/resource/README.md#createresource)
* [DeleteResource](docs/sdks/resource/README.md#deleteresource)
* [GetArrayDataSource](docs/sdks/resource/README.md#getarraydatasource)
* [GetResource](docs/sdks/resource/README.md#getresource)
* [UpdateResource](docs/sdks/resource/README.md#updateresource)

### [ResponseBodies](docs/sdks/responsebodies/README.md)

* [FlattenedEnvelopePaginationResponse](docs/sdks/responsebodies/README.md#flattenedenvelopepaginationresponse)
* [FlattenedEnvelopeResponse](docs/sdks/responsebodies/README.md#flattenedenveloperesponse)
* [FlattenedEnvelopeUnionResponse](docs/sdks/responsebodies/README.md#flattenedenvelopeunionresponse)
* [FlattenedUnionResponse](docs/sdks/responsebodies/README.md#flattenedunionresponse)
* [OverriddenFieldNamesPost](docs/sdks/responsebodies/README.md#overriddenfieldnamespost)
* [ResponseBodies2xxJSONObjectAllOptionalProperties](docs/sdks/responsebodies/README.md#responsebodies2xxjsonobjectalloptionalproperties)
* [ResponseBodyAdditionalPropertiesAnyPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiesanypost)
* [ResponseBodyAdditionalPropertiesComplexNumbersPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiescomplexnumberspost)
* [ResponseBodyAdditionalPropertiesDatePost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiesdatepost)
* [ResponseBodyAdditionalPropertiesObjectPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiesobjectpost)
* [ResponseBodyAdditionalPropertiesPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiespost)
* [ResponseBodyBytesGet](docs/sdks/responsebodies/README.md#responsebodybytesget)
* [ResponseBodyDecimalStr](docs/sdks/responsebodies/README.md#responsebodydecimalstr)
* [ResponseBodyEmptyWithHeaders](docs/sdks/responsebodies/README.md#responsebodyemptywithheaders)
* [ResponseBodyMissing2xxOr3xxGet](docs/sdks/responsebodies/README.md#responsebodymissing2xxor3xxget)
* [ResponseBodyMultilineStringPost](docs/sdks/responsebodies/README.md#responsebodymultilinestringpost)
* [ResponseBodyOptionalGet](docs/sdks/responsebodies/README.md#responsebodyoptionalget)
* [ResponseBodyReadOnly](docs/sdks/responsebodies/README.md#responsebodyreadonly)
* [ResponseBodyStringGet](docs/sdks/responsebodies/README.md#responsebodystringget)
* [ResponseBodyXmlGet](docs/sdks/responsebodies/README.md#responsebodyxmlget)

### [Retries](docs/sdks/retries/README.md)

* [RetriesAfter](docs/sdks/retries/README.md#retriesafter)
* [RetriesConnectErrorGet](docs/sdks/retries/README.md#retriesconnecterrorget) - A request to a non-valid port to test connection errors
* [RetriesFlatEmptyResponsePost](docs/sdks/retries/README.md#retriesflatemptyresponsepost)
* [RetriesGet](docs/sdks/retries/README.md#retriesget)
* [RetriesPost](docs/sdks/retries/README.md#retriespost)

### [SDK](docs/sdks/sdk/README.md)

* [AmbiguousQueryParam](docs/sdks/sdk/README.md#ambiguousqueryparam) - Tests conflict with C# System namespace
* [AuthenticatedRequest](docs/sdks/sdk/README.md#authenticatedrequest)
* [ConflictingEnum](docs/sdks/sdk/README.md#conflictingenum) - Test potential namespace conflicts with java.lang.Object
* [IgnoredGenerationPut](docs/sdks/sdk/README.md#ignoredgenerationput)
* [MultilineExample](docs/sdks/sdk/README.md#multilineexample)
* [PostAdditionalPropertiesWithNullableFields](docs/sdks/sdk/README.md#postadditionalpropertieswithnullablefields)
* [ResponseBodyJsonGet](docs/sdks/sdk/README.md#responsebodyjsonget)

### [Second](docs/sdks/second/README.md)

* [Get](docs/sdks/second/README.md#get)

### [Servers](docs/sdks/servers/README.md)

* [SelectGlobalServer](docs/sdks/servers/README.md#selectglobalserver)
* [SelectServerWithID](docs/sdks/servers/README.md#selectserverwithid) - Select a server by ID.
* [ServerWithProtocolTemplate](docs/sdks/servers/README.md#serverwithprotocoltemplate)
* [ServerWithTemplates](docs/sdks/servers/README.md#serverwithtemplates)
* [ServerWithTemplatesGlobal](docs/sdks/servers/README.md#serverwithtemplatesglobal)
* [ServersByIDWithTemplates](docs/sdks/servers/README.md#serversbyidwithtemplates)
* [ServersOverrideGlobalServerURL](docs/sdks/servers/README.md#serversoverrideglobalserverurl)
* [ServersOverrideOperationServerURL](docs/sdks/servers/README.md#serversoverrideoperationserverurl)

### [StatusCode](docs/sdks/statuscode/README.md)

* [StatusCode2XX](docs/sdks/statuscode/README.md#statuscode2xx)
* [StatusCode4XX](docs/sdks/statuscode/README.md#statuscode4xx)
* [StatusCode5XX](docs/sdks/statuscode/README.md#statuscode5xx)
* [StatusCodeDefault](docs/sdks/statuscode/README.md#statuscodedefault)

### [Telemetry](docs/sdks/telemetry/README.md)

* [TelemetrySpeakeasyUserAgentGet](docs/sdks/telemetry/README.md#telemetryspeakeasyuseragentget)
* [TelemetryUserAgentGet](docs/sdks/telemetry/README.md#telemetryuseragentget)

### [Unions](docs/sdks/unions/README.md)

* [ArrayOfDiscriminatedUnions](docs/sdks/unions/README.md#arrayofdiscriminatedunions)
* [ArrayOfDiscriminatedUnionsMap](docs/sdks/unions/README.md#arrayofdiscriminatedunionsmap)
* [CollectionOneOfPost](docs/sdks/unions/README.md#collectiononeofpost)
* [ConstDiscriminatedOneOf](docs/sdks/unions/README.md#constdiscriminatedoneof)
* [DiscriminatedOneMultipleMemberships](docs/sdks/unions/README.md#discriminatedonemultiplememberships)
* [DiscriminatedOneMultipleMembershipsHasWheels](docs/sdks/unions/README.md#discriminatedonemultiplemembershipshaswheels)
* [FlattenedTypedObjectPost](docs/sdks/unions/README.md#flattenedtypedobjectpost)
* [InfectedWithAny](docs/sdks/unions/README.md#infectedwithany)
* [MixedTypeOneOfPost](docs/sdks/unions/README.md#mixedtypeoneofpost)
* [MixedUnionTypes](docs/sdks/unions/README.md#mixeduniontypes)
* [MultiMatchAnyOf](docs/sdks/unions/README.md#multimatchanyof)
* [NestedArrayOfDiscriminatedUnions](docs/sdks/unions/README.md#nestedarrayofdiscriminatedunions)
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
* [UnionMapOptional](docs/sdks/unions/README.md#unionmapoptional)
* [UnionNestedEnumsForm](docs/sdks/unions/README.md#unionnestedenumsform)
* [UnionNestedEnumsMultipart](docs/sdks/unions/README.md#unionnestedenumsmultipart)
* [UnionOfArraysPost](docs/sdks/unions/README.md#unionofarrayspost)
* [WeaklyTypedOneOfNullEnumPost](docs/sdks/unions/README.md#weaklytypedoneofnullenumpost)
* [WeaklyTypedOneOfPost](docs/sdks/unions/README.md#weaklytypedoneofpost)

</details>
<!-- End Available Resources and Operations [operations] -->

<!-- Start Global Parameters [global-parameters] -->
## Global Parameters

Certain parameters are configured globally. These parameters may be set on the SDK client instance itself during initialization. When configured as an option during SDK initialization, These global values will be used as defaults on the operations that use them. When such operations are called, there is a place in each to override the global value, if needed.

For example, you can set `globalHeaderParam` to `true` at SDK initialization and then you do not have to pass the same value on calls to operations like `GlobalPathParameterGet`. But if you want to do so you may, which will locally override the global setting. See the example code below for a demonstration.


### Available Globals

The following global parameters are available.

| Name                          | Type   | Description                                                                                                                                                                                                              |
| ----------------------------- | ------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| globalHeaderParam             | bool   | The GlobalHeaderParam parameter.                                                                                                                                                                                         |
| globalHiddenHeaderParam       | string | The GlobalHiddenHeaderParam parameter.                                                                                                                                                                                   |
| globalHiddenPathParam         | string | The GlobalHiddenPathParam parameter.                                                                                                                                                                                     |
| globalHiddenQueryParam        | string | The GlobalHiddenQueryParam parameter.                                                                                                                                                                                    |
| globalOptionalHiddenPathParam | string | An optional and hidden global path parameter. Some paths and operations<br/>will override it to required: true, especially for verifying test<br/>generation where the value should be templated in the SDK client.<br/> |
| globalOptionalPathParam       | string | An optional global path parameter. Some paths and operations will<br/>override it to required: true, especially for verifying test generation<br/>where the value should be templated in the operation request.<br/>     |
| globalPathParam               | long   | The GlobalPathParam parameter.                                                                                                                                                                                           |
| globalQueryParam              | string | The GlobalQueryParam parameter.                                                                                                                                                                                          |

### Example

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
    globalQueryParam: "some example global query param"
);

var res = await sdk.Globals.GlobalPathParameterGetAsync(globalPathParam: 100);

// handle response
```
<!-- End Global Parameters [global-parameters] -->

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
