# openapi

<!-- Start SDK Installation [installation] -->
## SDK Installation

To add the SDK as a dependency to your project:
```bash
go get github.com/speakeasy-api/openapi-generation-tests/go-client-sdk
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example 1

```go
package main

import (
	"context"
	"log"
	"math/big"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types"
)

func main() {
	ctx := context.Background()

	s := openapi.New(
		openapi.WithGlobalHeaderParam(true),
		openapi.WithGlobalHiddenQueryParam("hello"),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	res, err := s.Generation.GlobalNameOverridden(ctx, &shared.SimpleObject{
		Any:        "any",
		Bigint:     big.NewInt(8821239038968084),
		BigintStr:  types.MustNewBigIntFromString("9223372036854775808"),
		Bool:       true,
		BoolOpt:    openapi.Bool(true),
		Date:       types.MustDateFromString("2020-01-01"),
		DateTime:   types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
		Decimal:    types.MustNewDecimalFromString("3.141592653589793"),
		DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
		Enum:       shared.EnumOne,
		Float32:    1.1,
		Float64Str: openapi.Float64(1.1),
		Int:        1,
		Int32:      1,
		Int32Enum:  shared.Int32EnumFiftyFive,
		Int64Str:   openapi.Int64(100),
		IntEnum:    shared.IntEnumSecond,
		Num:        1.1,
		Str:        "test",
		StrOpt:     openapi.String("testOptional"),
	})
	if err != nil {
		log.Fatal(err)
	}
	if res.Object != nil {
		// handle response
	}
}

```

### Example 2

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
)

func main() {
	ctx := context.Background()

	s := openapi.New(
		openapi.WithGlobalHeaderParam(true),
		openapi.WithGlobalHiddenQueryParam("hello"),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	res, err := s.Servers.SelectGlobalServer(ctx)
	if err != nil {
		log.Fatal(err)
	}
	if res != nil {
		// handle response
	}
}

```

### Second

Do this second

```go
package main

import (
	"context"
	"log"
	"math/big"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"openapi/v2/pkg/models/shared"
	"openapi/v2/pkg/types"
)

func main() {
	ctx := context.Background()

	s := openapi.New(
		openapi.WithGlobalHeaderParam(true),
		openapi.WithGlobalHiddenQueryParam("hello"),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	res, err := s.Generation.UsageExamplePost(ctx, operations.UsageExamplePostRequest{
		RequestBody: &operations.UsageExamplePostRequestBody{
			FakerCamelCasePropertyNameStrings: shared.FakerCamelCasePropertyNameStrings{
				City: "Port Domenicboro",
				Iban: "TL115340030031304452481",
				ID:   "<id>",
				IPv4: "78.38.131.239",
				IPv6: "e4c9:ca70:74d2:c3d9:33d6:c7c4:1e56:3bf5",
			},
			FakerFormattedStrings: shared.FakerFormattedStrings{
				AddressFormat:   "919 Vicarage Lane",
				DateFormat:      types.MustDateFromString("2024-05-21"),
				DatetimeFormat:  types.MustTimeFromString("2024-10-30T03:05:14.934Z"),
				DirectoryFormat: "/var/spool",
				DomainFormat:    "aggravating-vanadyl.biz",
				EmailFormat:     "Mateo_Rice@hotmail.com",
				FilenameFormat:  "example.file",
				FilepathFormat:  "/usr/obj/boo_magnificent_and.jpeg",
				ImageFormat:     "https://loremflickr.com/2371/2464?lock=4205364297848786",
				Ipv4Format:      "234.138.226.158",
				Ipv6Format:      "5141:db2e:df9c:f06d:8b99:e7e4:2c56:addd",
				JSONFormat:      "{key: 3449297471398524, key1: null, key2: \"<value>\"}",
				MacFormat:       "22:1f:e9:45:8a:7f",
				PasswordFormat:  "zbz8X7IgZMC4iGZ",
				PhoneFormat:     "(508) 609-3176 x5681",
				TimezoneFormat:  "Pacific/Efate",
				UnknownFormat:   "<value>",
				URLFormat:       "https://stark-trick.name",
				UUIDFormat:      "8f5bc12b-caad-4053-9859-5e369841bdb9",
				ZipcodeFormat:   "59560",
			},
			FakerKebobCasePropertyNameStrings: shared.FakerKebobCasePropertyNameStrings{
				PostalCode: "10760-9151",
			},
			FakerPascalCasePropertyNameStrings: shared.FakerPascalCasePropertyNameStrings{
				Account:      "82091084",
				Address:      "14760 Gerhold Prairie",
				Amount:       "707.58",
				Avatar:       "https://picsum.photos/seed/MQvsb2J6/1388/3681",
				City:         "Fayborough",
				Color:        "turquoise",
				Comment:      "The Football Is Good For Training And Recreational Purposes",
				Company:      "Gusikowski Group",
				Continent:    "Africa",
				Country:      "Japan",
				CountryCode:  "AG",
				CreatedAt:    "1731867501850",
				Currency:     "Balboa",
				CurrencyCode: "SBD",
				CurrencyISO:  "NAD",
				Datatype:     "binary",
				Default:      "<value>",
				Description:  "jittery furthermore yet mystify euphonium",
				Directory:    "/home/user",
				Domain:       "educated-aftermath.org",
				DomainName:   "whole-help.net",
				Email:        "Zoe54@yahoo.com",
				EmailAddr:    "Murphy.Heller@gmail.com",
				EmailAddress: "Georgette.Kessler@yahoo.com",
				ExpiredAt:    "1726429049298",
				Expires:      "<value>",
				ExpiresAt:    "1762273998034",
				Extension:    "mp4v",
				Filename:     "example.file",
				Filepath:     "/etc/ppp/ugh_octave_scorn.htm",
				Filetype:     "text",
				FirstName:    "Elmira",
				FullName:     "Beulah Rohan",
				Gender:       "Two-spirit person",
				Host:         "rotating-handful.biz",
				HostName:     "glass-newsstand.com",
				HTTPStatus:   "401",
				Iban:         "GT248U7009M6748Q231241072O84",
				ID:           "<id>",
				IP:           "35.8.149.202",
				IPAddr:       "b47e:d5aa:74cc:ce6a:a0e9:175c:eabe:ae91",
				IPAddress:    "bbbb:ea1e:bc17:0862:5cbd:e29f:a2b6:c517",
				Ipv4:         "127.91.106.177",
				Ipv6:         "eaa6:7289:51c2:85db:b6cc:ef8c:9baa:9fa4",
				Job:          "Product Research Producer",
				JSON:         "{key: 7725687944244536, key1: null, key2: \"<value>\"}",
				Key:          "<key>",
				LastName:     "Greenfelder",
				Latitude:     "-60.0189",
				Locale:       "fi",
				Longitude:    "-128.0093",
				Mac:          "17:ce:d8:80:0a:35",
				Manufacturer: "Aston Martin",
				Material:     "Soft",
				MiddleName:   "Jules",
				Model:        "Impala",
				Password:     "IcbvHqTVqA1XkfF",
				Phone:        "945.520.7469 x8191",
				Pin:          "8709",
				PostalCode:   "17698",
				Price:        "443.65",
				Product:      "Recycled Fresh Shirt",
				Sex:          "male",
				StatusCode:   "206",
				Street:       "Nader Hollow",
				Timezone:     "America/Creston",
				Unit:         "radian",
				UpdatedAt:    "1737533095477",
				URI:          "https://blushing-pinstripe.biz/",
				URL:          "https://utilized-flight.org/",
				Username:     "Tierra12",
				UUID:         "20e05958-b9b2-4d8a-98f4-f055ce98595b",
			},
			FakerSnakeCasePropertyNameStrings: shared.FakerSnakeCasePropertyNameStrings{
				CountryCode: "FJ",
				CreatedAt:   "1732582274983",
				ExpiredAt:   "1723060351438",
				UpdatedAt:   "1737505998694",
			},
			SimpleObject: shared.SimpleObject{
				Any:        "any",
				Bigint:     big.NewInt(8821239038968084),
				BigintStr:  types.MustNewBigIntFromString("9223372036854775808"),
				Bool:       true,
				BoolOpt:    openapi.Bool(true),
				Date:       types.MustDateFromString("2020-01-01"),
				DateTime:   types.MustTimeFromString("2020-01-01T00:00:00.001Z"),
				Decimal:    types.MustNewDecimalFromString("3.141592653589793"),
				DecimalStr: types.MustNewDecimalFromString("3.14159265358979344719667586"),
				Enum:       shared.EnumOne,
				Float32:    1.1,
				Float64Str: openapi.Float64(1.1),
				Int:        1,
				Int32:      1,
				Int32Enum:  shared.Int32EnumFiftyFive,
				Int64Str:   openapi.Int64(100),
				IntEnum:    shared.IntEnumSecond,
				Num:        1.1,
				Str:        "test",
				StrOpt:     openapi.String("testOptional"),
			},
		},
		BigintParameter:          big.NewInt(334104),
		BigintStrParameter:       big.NewInt(901453),
		BoolParameter:            true,
		DateParameter:            types.MustDateFromString("2023-10-04"),
		DateTimeDefaultParameter: types.MustTimeFromString("2024-04-18T03:54:57.502Z"),
		DateTimeParameter:        types.MustTimeFromString("2023-10-08T06:44:22.550Z"),
		DecimalParameter:         types.MustNewDecimalFromString("7032.71"),
		DecimalStrParameter:      types.MustNewDecimalFromString("4081.24"),
		DoubleParameter:          5709.34,
		EnumParameter:            operations.EnumParameterValue1,
		FalseyNumberParameter:    0,
		Float32Parameter:         4418.76,
		Float64StringParameter:   7133.33,
		FloatParameter:           9223.59,
		Int64Parameter:           901974,
		Int64StringParameter:     321498,
		IntParameter:             300411,
		OptEnumParameter:         operations.OptEnumParameterValue3.ToPointer(),
		StrParameter:             "example 1",
	}, operations.UsageExamplePostSecurity{
		Password: "YOUR_PASSWORD",
		Username: "YOUR_USERNAME",
	})
	if err != nil {
		log.Fatal(err)
	}
	if res.Object != nil {
		// handle response
	}
}

```
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [Auth](docs/sdks/auth/README.md)

* [APIKeyAuth](docs/sdks/auth/README.md#apikeyauth)
* [APIKeyAuthGlobal](docs/sdks/auth/README.md#apikeyauthglobal)
* [BasicAuth](docs/sdks/auth/README.md#basicauth)
* [BearerAuth](docs/sdks/auth/README.md#bearerauth)
* [GlobalBearerAuth](docs/sdks/auth/README.md#globalbearerauth)
* [NoAuth](docs/sdks/auth/README.md#noauth)
* [Oauth2Auth](docs/sdks/auth/README.md#oauth2auth)
* [Oauth2Override](docs/sdks/auth/README.md#oauth2override)
* [OpenIDConnectAuth](docs/sdks/auth/README.md#openidconnectauth)

### [AuthNew](docs/sdks/authnew/README.md)

* [AuthGlobal](docs/sdks/authnew/README.md#authglobal)
* [BasicAuthNew](docs/sdks/authnew/README.md#basicauthnew)
* [CustomSchemeAppID](docs/sdks/authnew/README.md#customschemeappid)
* [MultipleMixedOptionsAuth](docs/sdks/authnew/README.md#multiplemixedoptionsauth)
* [MultipleMixedSchemeAuth](docs/sdks/authnew/README.md#multiplemixedschemeauth)
* [MultipleOptionsWithMixedSchemesAuth](docs/sdks/authnew/README.md#multipleoptionswithmixedschemesauth)
* [MultipleOptionsWithSimpleSchemesAuth](docs/sdks/authnew/README.md#multipleoptionswithsimpleschemesauth)
* [MultipleSimpleOptionsAuth](docs/sdks/authnew/README.md#multiplesimpleoptionsauth)
* [MultipleSimpleSchemeAuth](docs/sdks/authnew/README.md#multiplesimpleschemeauth)
* [Oauth2AuthNew](docs/sdks/authnew/README.md#oauth2authnew)
* [OpenIDConnectAuthNew](docs/sdks/authnew/README.md#openidconnectauthnew)

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

### [Eventstreams](docs/sdks/eventstreams/README.md)

* [Chat](docs/sdks/eventstreams/README.md#chat)
* [ChatSkipSentinel](docs/sdks/eventstreams/README.md#chatskipsentinel)
* [DifferentDataSchemas](docs/sdks/eventstreams/README.md#differentdataschemas)
* [JSON](docs/sdks/eventstreams/README.md#json)
* [Multiline](docs/sdks/eventstreams/README.md#multiline)
* [Rich](docs/sdks/eventstreams/README.md#rich)
* [Text](docs/sdks/eventstreams/README.md#text)

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

* [DeepObjectQueryParamsDeepObject](docs/sdks/parameters/README.md#deepobjectqueryparamsdeepobject)
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
* [JSONQueryParamsObject](docs/sdks/parameters/README.md#jsonqueryparamsobject)
* [JSONQueryParamsObjectSmaller](docs/sdks/parameters/README.md#jsonqueryparamsobjectsmaller)
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

* [NullEnumPost](docs/sdks/requestbodies/README.md#nullenumpost)
* [NullableObjectPost](docs/sdks/requestbodies/README.md#nullableobjectpost)
* [NullableOptionalFieldsPost](docs/sdks/requestbodies/README.md#nullableoptionalfieldspost)
* [NullableRequiredEmptyObjectPost](docs/sdks/requestbodies/README.md#nullablerequiredemptyobjectpost)
* [NullableRequiredPropertyPost](docs/sdks/requestbodies/README.md#nullablerequiredpropertypost)
* [NullableRequiredSharedObjectPost](docs/sdks/requestbodies/README.md#nullablerequiredsharedobjectpost)
* [RequestBodyDeprecatedRequestBodyRefPost](docs/sdks/requestbodies/README.md#requestbodydeprecatedrequestbodyrefpost)
* [RequestBodyGetInferredOptionalRequestWrapper](docs/sdks/requestbodies/README.md#requestbodygetinferredoptionalrequestwrapper)
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
* [RequestBodyPostApplicationJSONArrayOfUnions](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofunions)
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
* [RequestBodyPostComplexNumberTypes](docs/sdks/requestbodies/README.md#requestbodypostcomplexnumbertypes)
* [RequestBodyPostDefaultsAndConsts](docs/sdks/requestbodies/README.md#requestbodypostdefaultsandconsts)
* [RequestBodyPostEmptyBodyRetainedWithAllOptionalFields](docs/sdks/requestbodies/README.md#requestbodypostemptybodyretainedwithalloptionalfields)
* [RequestBodyPostEmptyObject](docs/sdks/requestbodies/README.md#requestbodypostemptyobject)
* [RequestBodyPostFormDeep](docs/sdks/requestbodies/README.md#requestbodypostformdeep)
* [RequestBodyPostFormMapPrimitive](docs/sdks/requestbodies/README.md#requestbodypostformmapprimitive)
* [RequestBodyPostFormSimple](docs/sdks/requestbodies/README.md#requestbodypostformsimple)
* [RequestBodyPostJSONDataTypesArrayBigInt](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesarraybigint)
* [RequestBodyPostJSONDataTypesArrayDate](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesarraydate)
* [RequestBodyPostJSONDataTypesArrayDecimalStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesarraydecimalstr)
* [RequestBodyPostJSONDataTypesBigInt](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesbigint)
* [RequestBodyPostJSONDataTypesBigIntStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesbigintstr)
* [RequestBodyPostJSONDataTypesBoolean](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesboolean)
* [RequestBodyPostJSONDataTypesComplexNumberArrays](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypescomplexnumberarrays)
* [RequestBodyPostJSONDataTypesComplexNumberMaps](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypescomplexnumbermaps)
* [RequestBodyPostJSONDataTypesDate](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdate)
* [RequestBodyPostJSONDataTypesDateTime](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdatetime)
* [RequestBodyPostJSONDataTypesDecimal](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdecimal)
* [RequestBodyPostJSONDataTypesDecimalStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdecimalstr)
* [RequestBodyPostJSONDataTypesFloat32](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesfloat32)
* [RequestBodyPostJSONDataTypesInt32](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesint32)
* [RequestBodyPostJSONDataTypesInteger](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesinteger)
* [RequestBodyPostJSONDataTypesMapBigIntStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesmapbigintstr)
* [RequestBodyPostJSONDataTypesMapDateTime](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesmapdatetime)
* [RequestBodyPostJSONDataTypesMapDecimal](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesmapdecimal)
* [RequestBodyPostJSONDataTypesNumber](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesnumber)
* [RequestBodyPostJSONDataTypesString](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesstring)
* [RequestBodyPostMultipleContentTypesComponentFiltered](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypescomponentfiltered)
* [RequestBodyPostMultipleContentTypesComponentFilteredDefaultTest](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypescomponentfiltereddefaulttest)
* [RequestBodyPostMultipleContentTypesInlineFiltered](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypesinlinefiltered)
* [RequestBodyPostMultipleContentTypesSplitParamForm](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparamform)
* [RequestBodyPostMultipleContentTypesSplitParamJSON](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparamjson)
* [RequestBodyPostMultipleContentTypesSplitParamMultipart](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparammultipart)
* [RequestBodyPostMultipleContentTypesSplitForm](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitform)
* [RequestBodyPostMultipleContentTypesSplitJSON](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitjson)
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
* [ResponseBodyXMLGet](docs/sdks/responsebodies/README.md#responsebodyxmlget)

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
* [ResponseBodyJSONGet](docs/sdks/sdk/README.md#responsebodyjsonget)

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





<!-- Start Pagination [pagination] -->
## Pagination

Some of the endpoints in this SDK support pagination. To use pagination, you make your SDK calls as usual, but the
returned response object will have a `Next` method that can be called to pull down the next group of results. If the
return value of `Next` is `nil`, then there are no more pages to be fetched.

Here's an example of one such pagination call:
```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
)

func main() {
	ctx := context.Background()

	s := openapi.New(
		openapi.WithGlobalHeaderParam(true),
		openapi.WithGlobalHiddenQueryParam("hello"),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	res, err := s.Generation.ReactHookCombinedOptions(ctx, 122236)
	if err != nil {
		log.Fatal(err)
	}
	if res.Object != nil {
		for {
			// handle items

			res, err = res.Next()

			if err != nil {
				// handle error
			}

			if res == nil {
				break
			}
		}
	}
}

```
<!-- End Pagination [pagination] -->



<!-- Start Go Types -->
# Special Types

This SDK defines the following custom types to assist with marshalling and unmarshalling data.

## Date

`types.Date` is a wrapper around time.Time that allows for JSON marshaling a date string formatted as "2006-01-02".

### Usage

```go
d1 := types.NewDate(time.Now()) // returns *types.Date

d2 := types.DateFromTime(time.Now()) // returns types.Date

d3, err := types.NewDateFromString("2019-01-01") // returns *types.Date, error

d4, err := types.DateFromString("2019-01-01") // returns types.Date, error

d5 := types.MustNewDateFromString("2019-01-01") // returns *types.Date and panics on error

d6 := types.MustDateFromString("2019-01-01") // returns types.Date and panics on error
```
<!-- End Go Types -->



<!-- Start Global Parameters [global-parameters] -->
## Global Parameters

Certain parameters are configured globally. These parameters may be set on the SDK client instance itself during initialization. When configured as an option during SDK initialization, These global values will be used as defaults on the operations that use them. When such operations are called, there is a place in each to override the global value, if needed.

For example, you can set `globalHeaderParam` to `true` at SDK initialization and then you do not have to pass the same value on calls to operations like `GlobalPathParameterGet`. But if you want to do so you may, which will locally override the global setting. See the example code below for a demonstration.


### Available Globals

The following global parameters are available.

| Name                          | Type   | Description                                                                                                                                                                                                              |
| ----------------------------- | ------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| GlobalHeaderParam             | bool   | The GlobalHeaderParam parameter.                                                                                                                                                                                         |
| GlobalHiddenHeaderParam       | string | The GlobalHiddenHeaderParam parameter.                                                                                                                                                                                   |
| GlobalHiddenPathParam         | string | The GlobalHiddenPathParam parameter.                                                                                                                                                                                     |
| GlobalHiddenQueryParam        | string | The GlobalHiddenQueryParam parameter.                                                                                                                                                                                    |
| GlobalOptionalHiddenPathParam | string | An optional and hidden global path parameter. Some paths and operations<br/>will override it to required: true, especially for verifying test<br/>generation where the value should be templated in the SDK client.<br/> |
| GlobalOptionalPathParam       | string | An optional global path parameter. Some paths and operations will<br/>override it to required: true, especially for verifying test generation<br/>where the value should be templated in the operation request.<br/>     |
| GlobalPathParam               | int64  | The GlobalPathParam parameter.                                                                                                                                                                                           |
| GlobalQueryParam              | string | The GlobalQueryParam parameter.                                                                                                                                                                                          |

### Example

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
)

func main() {
	ctx := context.Background()

	s := openapi.New(
		openapi.WithGlobalHeaderParam(true),
		openapi.WithGlobalHiddenQueryParam("hello"),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	res, err := s.Globals.GlobalPathParameterGet(ctx, openapi.Int64(100))
	if err != nil {
		log.Fatal(err)
	}
	if res.Res != nil {
		// handle response
	}
}

```
<!-- End Global Parameters [global-parameters] -->



<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or an error, they will never return both.

By Default, an API error will return `sdkerrors.SDKError`. When custom error responses are specified for an operation, the SDK may also return their associated error. You can refer to respective *Errors* tables in SDK docs for more details on possible error types for each operation.

For example, the `ErrorUnionDiscriminatedPost` function may return the following errors:

| Error Type                                        | Status Code | Content Type     |
| ------------------------------------------------- | ----------- | ---------------- |
| sdkerrors.ErrorUnionDiscriminatedPostResponseBody | 4XX         | application/json |
| sdkerrors.SDKError                                | 5XX         | \*/\*            |

### Example

```go
package main

import (
	"context"
	"errors"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"openapi/v2/pkg/models/sdkerrors"
)

func main() {
	ctx := context.Background()

	s := openapi.New(
		openapi.WithGlobalHeaderParam(true),
		openapi.WithGlobalHiddenQueryParam("hello"),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	res, err := s.Errors.ErrorUnionDiscriminatedPost(ctx, operations.CreateErrorUnionDiscriminatedPostRequestBodyTaggedError2RequestBody(
		operations.TaggedError2RequestBody{
			Tag: "<value>",
			TaggedError2Message: operations.TaggedError2Message{
				Message: "<value>",
			},
		},
	))
	if err != nil {

		var e *sdkerrors.ErrorUnionDiscriminatedPostResponseBody
		if errors.As(err, &e) {
			// handle error
			log.Fatal(e.Error())
		}

		var e *sdkerrors.SDKError
		if errors.As(err, &e) {
			// handle error
			log.Fatal(e.Error())
		}
	}
}

```
<!-- End Error Handling [errors] -->



<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally using the `WithServerIndex(serverIndex int)` option when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| #   | Server                                        | Variables                                                 | Default values                           |
| --- | --------------------------------------------- | --------------------------------------------------------- | ---------------------------------------- |
| 0   | `http://localhost:35123`                      |                                                           |                                          |
| 1   | `http://broken`                               |                                                           |                                          |
| 2   | `http://{hostname}:{port}`                    | `hostname string`<br/>`port string`                       | `"localhost"`<br/>`"35123"`              |
| 3   | `http://localhost:35123/anything/{something}` | `something ServerSomething`                               | `"something"`                            |
| 4   | `{protocol}://{hostname}:{port}`              | `hostname string`<br/>`port string`<br/>`protocol string` | `"localhost"`<br/>`"35123"`<br/>`"http"` |

If the selected server has variables, you may override their default values using their associated option(s):
 * `WithHostname(hostname string)`
 * `WithPort(port string)`
 * `WithSomething(something ServerSomething)`
 * `WithProtocol(protocol string)`

#### Example

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
)

func main() {
	ctx := context.Background()

	s := openapi.New(
		openapi.WithServerIndex(4),
		openapi.WithGlobalHeaderParam(true),
		openapi.WithGlobalHiddenQueryParam("hello"),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	res, err := s.AmbiguousQueryParam(ctx, operations.ConsoleThree)
	if err != nil {
		log.Fatal(err)
	}
	if res != nil {
		// handle response
	}
}

```

### Override Server URL Per-Client

The default server can also be overridden globally using the `WithServerURL(serverURL string)` option when initializing the SDK client instance. For example:
```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
)

func main() {
	ctx := context.Background()

	s := openapi.New(
		openapi.WithServerURL("http://localhost:35123"),
		openapi.WithGlobalHeaderParam(true),
		openapi.WithGlobalHiddenQueryParam("hello"),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	res, err := s.AmbiguousQueryParam(ctx, operations.ConsoleThree)
	if err != nil {
		log.Fatal(err)
	}
	if res != nil {
		// handle response
	}
}

```

### Override Server URL Per-Operation

The server URL can also be overridden on a per-operation basis, provided a server list was specified for the operation. For example:
```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
)

func main() {
	ctx := context.Background()

	s := openapi.New(
		openapi.WithGlobalHeaderParam(true),
		openapi.WithGlobalHiddenQueryParam("hello"),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	res, err := s.Errors.ConnectionErrorGet(ctx, operations.WithServerURL("http://somebrokenapi.broken"))
	if err != nil {
		log.Fatal(err)
	}
	if res != nil {
		// handle response
	}
}

```
<!-- End Server Selection [server] -->



<!-- Start Custom HTTP Client [http-client] -->
## Custom HTTP Client

The Go SDK makes API calls that wrap an internal HTTP client. The requirements for the HTTP client are very simple. It must match this interface:

```go
type HTTPClient interface {
	Do(req *http.Request) (*http.Response, error)
}
```

The built-in `net/http` client satisfies this interface and a default client based on the built-in is provided by default. To replace this default with a client of your own, you can implement this interface yourself or provide your own client configured as desired. Here's a simple example, which adds a client with a 30 second timeout.

```go
import (
	"net/http"
	"time"
	"github.com/myorg/your-go-sdk"
)

var (
	httpClient = &http.Client{Timeout: 30 * time.Second}
	sdkClient  = sdk.New(sdk.WithClient(httpClient))
)
```

This can be a convenient way to configure timeouts, cookies, proxies, custom headers, and other low-level configuration.
<!-- End Custom HTTP Client [http-client] -->



<!-- Start Retries [retries] -->
## Retries

Some of the endpoints in this SDK support retries. If you use the SDK without any configuration, it will fall back to the default retry strategy provided by the API. However, the default retry strategy can be overridden on a per-operation basis, or across the entire SDK.

To change the default retry strategy for a single API call, simply provide a `retry.Config` object to the call by using the `WithRetries` option:
```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"openapi/v2/pkg/retry"
	"pkg/models/operations"
)

func main() {
	ctx := context.Background()

	s := openapi.New(
		openapi.WithGlobalHeaderParam(true),
		openapi.WithGlobalHiddenQueryParam("hello"),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	res, err := s.AmbiguousQueryParam(ctx, operations.ConsoleThree, operations.WithRetries(
		retry.Config{
			Strategy: "backoff",
			Backoff: &retry.BackoffStrategy{
				InitialInterval: 1,
				MaxInterval:     50,
				Exponent:        1.1,
				MaxElapsedTime:  100,
			},
			RetryConnectionErrors: false,
		}))
	if err != nil {
		log.Fatal(err)
	}
	if res != nil {
		// handle response
	}
}

```

If you'd like to override the default retry strategy for all operations that support retries, you can use the `WithRetryConfig` option at SDK initialization:
```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"openapi/v2/pkg/retry"
)

func main() {
	ctx := context.Background()

	s := openapi.New(
		openapi.WithRetryConfig(
			retry.Config{
				Strategy: "backoff",
				Backoff: &retry.BackoffStrategy{
					InitialInterval: 1,
					MaxInterval:     50,
					Exponent:        1.1,
					MaxElapsedTime:  100,
				},
				RetryConnectionErrors: false,
			}),
		openapi.WithGlobalHeaderParam(true),
		openapi.WithGlobalHiddenQueryParam("hello"),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	res, err := s.AmbiguousQueryParam(ctx, operations.ConsoleThree)
	if err != nil {
		log.Fatal(err)
	}
	if res != nil {
		// handle response
	}
}

```
<!-- End Retries [retries] -->



<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security schemes globally:

| Name         | Type   | Scheme       |
| ------------ | ------ | ------------ |
| `APIKeyAuth` | apiKey | API key      |
| `Oauth2`     | oauth2 | OAuth2 token |

You can set the security parameters through the `WithSecurity` option when initializing the SDK client instance. The selected scheme will be used by default to authenticate with the API for all operations that support it. For example:
```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
	"openapi/v2/pkg/models/shared"
)

func main() {
	ctx := context.Background()

	s := openapi.New(
		openapi.WithSecurity(shared.Security{
			APIKeyAuth: openapi.String("Token YOUR_API_KEY"),
		}),
		openapi.WithGlobalHeaderParam(true),
		openapi.WithGlobalHiddenQueryParam("hello"),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	res, err := s.AmbiguousQueryParam(ctx, operations.ConsoleThree)
	if err != nil {
		log.Fatal(err)
	}
	if res != nil {
		// handle response
	}
}

```

### Per-Operation Security Schemes

Some operations in this SDK require the security scheme to be specified at the request level. For example:
```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
)

func main() {
	ctx := context.Background()

	s := openapi.New(
		openapi.WithGlobalHeaderParam(true),
		openapi.WithGlobalHiddenQueryParam("hello"),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	res, err := s.AuthenticatedRequest(ctx, operations.AuthenticatedRequestSecurity{
		ClientCredentials: "<YOUR_CLIENT_CREDENTIALS_HERE>",
	}, nil)
	if err != nil {
		log.Fatal(err)
	}
	if res != nil {
		// handle response
	}
}

```
<!-- End Authentication [security] -->

<!-- Start Summary [summary] -->
## Summary

Speakeasy's Uber Test Spec: Contains a wide array of different operation types and schema to try and cover enough ground to ensure good coverage of our support of OpenAPI

Some test description.
About our test document.

For more information about the API: [Speakeasy Docs](https://speakeasy.com/docs)
<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents
<!-- $toc-max-depth=2 -->
* [openapi](#openapi)
  * [SDK Installation](#sdk-installation)
  * [SDK Example Usage](#sdk-example-usage)
  * [Available Resources and Operations](#available-resources-and-operations)
  * [Pagination](#pagination)
* [Special Types](#special-types)
  * [Date](#date)
  * [Global Parameters](#global-parameters)
  * [Error Handling](#error-handling)
  * [Server Selection](#server-selection)
  * [Custom HTTP Client](#custom-http-client)
  * [Retries](#retries)
  * [Authentication](#authentication)
  * [Server-sent event streaming](#server-sent-event-streaming)
  * [Special Types](#special-types-1)

<!-- End Table of Contents [toc] -->

<!-- Start Server-sent event streaming [eventstream] -->
## Server-sent event streaming

[Server-sent events][mdn-sse] are used to stream content from certain
operations. These operations will expose the stream as an iterable that
can be consumed using a simple `for` loop. The loop will
terminate when the server no longer has any events to send and closes the
underlying connection.

```go
package main

import (
	"context"
	"log"
	openapi "openapi/v2"
	"openapi/v2/pkg/models/operations"
)

func main() {
	ctx := context.Background()

	s := openapi.New(
		openapi.WithGlobalHeaderParam(true),
		openapi.WithGlobalHiddenQueryParam("hello"),
		openapi.WithGlobalPathParam(100),
		openapi.WithGlobalQueryParam("some example global query param"),
	)

	res, err := s.Eventstreams.Chat(ctx, operations.ChatRequestBody{
		Prompt: "<value>",
	})
	if err != nil {
		log.Fatal(err)
	}
	if res.ChatCompletionResult != nil {
		defer res.ChatCompletionStream.Close()

		for res.ChatCompletionStream.Next() {
			event := res.ChatCompletionStream.Value()
			log.Print(event)
			// Handle the event
		}
	}
}

```

[mdn-sse]: https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events
<!-- End Server-sent event streaming [eventstream] -->

<!-- Start Special Types [types] -->
## Special Types

This SDK defines the following custom types to assist with marshalling and unmarshalling data.

### Date

`types.Date` is a wrapper around time.Time that allows for JSON marshaling a date string formatted as "2006-01-02".

#### Usage

```go
d1 := types.NewDate(time.Now()) // returns *types.Date

d2 := types.DateFromTime(time.Now()) // returns types.Date

d3, err := types.NewDateFromString("2019-01-01") // returns *types.Date, error

d4, err := types.DateFromString("2019-01-01") // returns types.Date, error

d5 := types.MustNewDateFromString("2019-01-01") // returns *types.Date and panics on error

d6 := types.MustDateFromString("2019-01-01") // returns types.Date and panics on error
```
<!-- End Special Types [types] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->



### Maturity

This SDK is in beta and therefore, we recommend pinning usage to a specific package version.
This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated and maintained programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
