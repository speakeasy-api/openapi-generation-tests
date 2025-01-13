# openapi

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

JDK 11 or later is required.

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'org.openapis:openapi:2.2.0'
```

Maven:
```xml
<dependency>
    <groupId>org.openapis</groupId>
    <artifactId>openapi</artifactId>
    <version>2.2.0</version>
</dependency>
```

### How to build
After cloning the git repository to your file system you can build the SDK artifact from source to the `build` directory by running `./gradlew build` on *nix systems or `gradlew.bat` on Windows systems.

If you wish to build from source and publish the SDK artifact to your local Maven repository (on your filesystem) then use the following command (after cloning the git repo locally):

On *nix:
```bash
./gradlew publishToMavenLocal -Pskip.signing
```
On Windows:
```bash
gradlew.bat publishToMavenLocal -Pskip.signing
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example 1

```java
package hello.world;

import java.lang.Exception;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GetGlobalNameOverrideResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        SimpleObject req = SimpleObject.builder()
                .any("any")
                .bool(true)
                .date(LocalDate.parse("2020-01-01"))
                .dateTime(OffsetDateTime.parse("2020-01-01T00:00:00.001Z"))
                .enum_(Enum.ONE)
                .float32(1.1f)
                .int_(1L)
                .int32(1)
                .int32Enum(Int32Enum.FIFTY_FIVE)
                .intEnum(IntEnum.Second)
                .num(1.1d)
                .str("test")
                .bigint(new BigInteger("8821239038968084"))
                .bigintStr(new BigInteger("9223372036854775808"))
                .boolOpt(true)
                .decimal(new BigDecimal("3.141592653589793"))
                .decimalStr(new BigDecimal("3.14159265358979344719667586"))
                .float64Str("1.1")
                .int64Str("100")
                .strOpt("testOptional")
                .build();

        GetGlobalNameOverrideResponse res = sdk.generation().globalNameOverridden()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Example 2

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.SelectGlobalServerResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        SelectGlobalServerResponse res = sdk.servers().selectGlobalServer()
                .call();

        // handle response
    }
}
```

### Second

Do this second

```java
package hello.world;

import java.lang.Exception;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.EnumParameter;
import org.openapis.openapi.models.operations.OptEnumParameter;
import org.openapis.openapi.models.operations.UsageExamplePostRequest;
import org.openapis.openapi.models.operations.UsageExamplePostRequestBody;
import org.openapis.openapi.models.operations.UsageExamplePostResponse;
import org.openapis.openapi.models.operations.UsageExamplePostSecurity;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.FakerCamelCasePropertyNameStrings;
import org.openapis.openapi.models.shared.FakerFormattedStrings;
import org.openapis.openapi.models.shared.FakerKebobCasePropertyNameStrings;
import org.openapis.openapi.models.shared.FakerPascalCasePropertyNameStrings;
import org.openapis.openapi.models.shared.FakerSnakeCasePropertyNameStrings;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        UsageExamplePostRequest req = UsageExamplePostRequest.builder()
                .bigintParameter(new BigInteger("321498"))
                .bigintStrParameter(new BigInteger("713333"))
                .boolParameter(true)
                .dateParameter(LocalDate.parse("2024-09-17"))
                .dateTimeDefaultParameter(OffsetDateTime.parse("2023-10-04T08:37:24.631Z"))
                .dateTimeParameter(OffsetDateTime.parse("2024-01-02T00:16:41.967Z"))
                .decimalParameter(new BigDecimal("9223.59"))
                .decimalStrParameter(new BigDecimal("4418.76"))
                .doubleParameter(7032.71d)
                .enumParameter(EnumParameter.VALUE1)
                .falseyNumberParameter(0d)
                .float32Parameter(9014.53f)
                .float64StringParameter("<value>")
                .floatParameter(3341.04d)
                .int64Parameter(901974L)
                .int64StringParameter("<value>")
                .intParameter(300411)
                .strParameter("example 1")
                .requestBody(UsageExamplePostRequestBody.builder()
                    .fakerCamelCasePropertyNameStrings(FakerCamelCasePropertyNameStrings.builder()
                        .city("Port Domenicboro")
                        .iban("TL115340030031304452481")
                        .id("<id>")
                        .iPv4("78.38.131.239")
                        .iPv6("e4c9:ca70:74d2:c3d9:33d6:c7c4:1e56:3bf5")
                        .build())
                    .fakerFormattedStrings(FakerFormattedStrings.builder()
                        .addressFormat("919 Vicarage Lane")
                        .dateFormat(LocalDate.parse("2024-05-21"))
                        .datetimeFormat(OffsetDateTime.parse("2024-10-30T03:05:14.934Z"))
                        .directoryFormat("/var/spool")
                        .domainFormat("aggravating-vanadyl.biz")
                        .emailFormat("Mateo_Rice@hotmail.com")
                        .filenameFormat("example.file")
                        .filepathFormat("/usr/obj/boo_magnificent_and.jpeg")
                        .imageFormat("https://loremflickr.com/2371/2464?lock=4205364297848786")
                        .ipv4Format("234.138.226.158")
                        .ipv6Format("5141:db2e:df9c:f06d:8b99:e7e4:2c56:addd")
                        .jsonFormat("{key: 3449297471398524, key1: null, key2: \"<value>\"}")
                        .macFormat("22:1f:e9:45:8a:7f")
                        .passwordFormat("zbz8X7IgZMC4iGZ")
                        .phoneFormat("(508) 609-3176 x5681")
                        .timezoneFormat("Pacific/Efate")
                        .unknownFormat("<value>")
                        .urlFormat("https://stark-trick.name")
                        .uuidFormat("8f5bc12b-caad-4053-9859-5e369841bdb9")
                        .zipcodeFormat("59560")
                        .build())
                    .fakerKebobCasePropertyNameStrings(FakerKebobCasePropertyNameStrings.builder()
                        .postalCode("10760-9151")
                        .build())
                    .fakerPascalCasePropertyNameStrings(FakerPascalCasePropertyNameStrings.builder()
                        .account("82091084")
                        .address("14760 Gerhold Prairie")
                        .amount("707.58")
                        .avatar("https://picsum.photos/seed/MQvsb2J6/1388/3681")
                        .city("Fayborough")
                        .color("turquoise")
                        .comment("The Football Is Good For Training And Recreational Purposes")
                        .company("Gusikowski Group")
                        .continent("Africa")
                        .country("Japan")
                        .countryCode("AG")
                        .createdAt("1731086071666")
                        .currency("Balboa")
                        .currencyCode("SBD")
                        .currencyISO("NAD")
                        .datatype("binary")
                        .default_("<value>")
                        .description("jittery furthermore yet mystify euphonium")
                        .directory("/home/user")
                        .domain("educated-aftermath.org")
                        .domainName("whole-help.net")
                        .email("Zoe54@yahoo.com")
                        .emailAddr("Murphy.Heller@gmail.com")
                        .emailAddress("Georgette.Kessler@yahoo.com")
                        .expiredAt("1725647619119")
                        .expires("<value>")
                        .expiresAt("1761492567855")
                        .extension("mp4v")
                        .filename("example.file")
                        .filepath("/etc/ppp/ugh_octave_scorn.htm")
                        .filetype("text")
                        .firstName("Elmira")
                        .fullName("Beulah Rohan")
                        .gender("Two-spirit person")
                        .host("rotating-handful.biz")
                        .hostName("glass-newsstand.com")
                        .httpStatus("401")
                        .iban("GT248U7009M6748Q231241072O84")
                        .id("<id>")
                        .ip("35.8.149.202")
                        .ipAddr("b47e:d5aa:74cc:ce6a:a0e9:175c:eabe:ae91")
                        .ipAddress("bbbb:ea1e:bc17:0862:5cbd:e29f:a2b6:c517")
                        .ipv4("127.91.106.177")
                        .ipv6("eaa6:7289:51c2:85db:b6cc:ef8c:9baa:9fa4")
                        .job("Product Research Producer")
                        .json("{key: 7725687944244536, key1: null, key2: \"<value>\"}")
                        .key("<key>")
                        .lastName("Greenfelder")
                        .latitude("-60.0189")
                        .locale("fi")
                        .longitude("-128.0093")
                        .mac("17:ce:d8:80:0a:35")
                        .manufacturer("Aston Martin")
                        .material("Soft")
                        .middleName("Jules")
                        .model("Impala")
                        .password("IcbvHqTVqA1XkfF")
                        .phone("945.520.7469 x8191")
                        .pin("8709")
                        .postalCode("17698")
                        .price("443.65")
                        .product("Recycled Fresh Shirt")
                        .sex("male")
                        .statusCode("206")
                        .street("Nader Hollow")
                        .timezone("America/Creston")
                        .unit("radian")
                        .updatedAt("1736751665305")
                        .uri("https://blushing-pinstripe.biz/")
                        .url("https://utilized-flight.org/")
                        .username("Tierra12")
                        .uuid("20e05958-b9b2-4d8a-98f4-f055ce98595b")
                        .build())
                    .fakerSnakeCasePropertyNameStrings(FakerSnakeCasePropertyNameStrings.builder()
                        .countryCode("FJ")
                        .createdAt("1731800844811")
                        .expiredAt("1722278921266")
                        .updatedAt("1736724568522")
                        .build())
                    .simpleObject(SimpleObject.builder()
                        .any("any")
                        .bool(true)
                        .date(LocalDate.parse("2020-01-01"))
                        .dateTime(OffsetDateTime.parse("2020-01-01T00:00:00.001Z"))
                        .enum_(Enum.ONE)
                        .float32(1.1f)
                        .int_(1L)
                        .int32(1)
                        .int32Enum(Int32Enum.FIFTY_FIVE)
                        .intEnum(IntEnum.Second)
                        .num(1.1d)
                        .str("test")
                        .bigint(new BigInteger("8821239038968084"))
                        .bigintStr(new BigInteger("9223372036854775808"))
                        .boolOpt(true)
                        .decimal(new BigDecimal("3.141592653589793"))
                        .decimalStr(new BigDecimal("3.14159265358979344719667586"))
                        .float64Str("1.1")
                        .int64Str("100")
                        .strOpt("testOptional")
                        .build())
                    .build())
                .optEnumParameter(OptEnumParameter.VALUE3)
                .build();

        UsageExamplePostResponse res = sdk.generation().usageExamplePost()
                .request(req)
                .security(UsageExamplePostSecurity.builder()
                    .password("YOUR_PASSWORD")
                    .username("YOUR_USERNAME")
                    .build())
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [auth()](docs/sdks/auth/README.md)

* [apiKeyAuth](docs/sdks/auth/README.md#apikeyauth)
* [apiKeyAuthGlobal](docs/sdks/auth/README.md#apikeyauthglobal)
* [basicAuth](docs/sdks/auth/README.md#basicauth)
* [bearerAuth](docs/sdks/auth/README.md#bearerauth)
* [globalBearerAuth](docs/sdks/auth/README.md#globalbearerauth)
* [noAuth](docs/sdks/auth/README.md#noauth)
* [oauth2Auth](docs/sdks/auth/README.md#oauth2auth)
* [oauth2Override](docs/sdks/auth/README.md#oauth2override)
* [openIdConnectAuth](docs/sdks/auth/README.md#openidconnectauth)

### [authNew()](docs/sdks/authnew/README.md)

* [authGlobal](docs/sdks/authnew/README.md#authglobal)
* [basicAuthNew](docs/sdks/authnew/README.md#basicauthnew)
* [customSchemeAppId](docs/sdks/authnew/README.md#customschemeappid)
* [multipleMixedOptionsAuth](docs/sdks/authnew/README.md#multiplemixedoptionsauth)
* [multipleMixedSchemeAuth](docs/sdks/authnew/README.md#multiplemixedschemeauth)
* [multipleOptionsWithMixedSchemesAuth](docs/sdks/authnew/README.md#multipleoptionswithmixedschemesauth)
* [multipleOptionsWithSimpleSchemesAuth](docs/sdks/authnew/README.md#multipleoptionswithsimpleschemesauth)
* [multipleSimpleOptionsAuth](docs/sdks/authnew/README.md#multiplesimpleoptionsauth)
* [multipleSimpleSchemeAuth](docs/sdks/authnew/README.md#multiplesimpleschemeauth)
* [oauth2AuthNew](docs/sdks/authnew/README.md#oauth2authnew)
* [openIdConnectAuthNew](docs/sdks/authnew/README.md#openidconnectauthnew)

### [customClient()](docs/sdks/customclient/README.md)

* [customClientPost](docs/sdks/customclient/README.md#customclientpost)

### [documentation()](docs/sdks/documentation/README.md)

* [getDocumentationPerLanguage](docs/sdks/documentation/README.md#getdocumentationperlanguage) - Gets documentation for some language, I guess.

### [errors()](docs/sdks/errors/README.md)

* [connectionErrorGet](docs/sdks/errors/README.md#connectionerrorget)
* [statusGetError](docs/sdks/errors/README.md#statusgeterror)
* [statusGetXSpeakeasyErrors](docs/sdks/errors/README.md#statusgetxspeakeasyerrors)

### [eventstreams()](docs/sdks/eventstreams/README.md)

* [chat](docs/sdks/eventstreams/README.md#chat)
* [chatSkipSentinel](docs/sdks/eventstreams/README.md#chatskipsentinel)
* [differentDataSchemas](docs/sdks/eventstreams/README.md#differentdataschemas)
* [json](docs/sdks/eventstreams/README.md#json)
* [multiline](docs/sdks/eventstreams/README.md#multiline)
* [rich](docs/sdks/eventstreams/README.md#rich)
* [text](docs/sdks/eventstreams/README.md#text)

### [first()](docs/sdks/first/README.md)

* [get](docs/sdks/first/README.md#get)

### [flattening()](docs/sdks/flattening/README.md)

* [componentBodyAndParamConflict](docs/sdks/flattening/README.md#componentbodyandparamconflict)
* [componentBodyAndParamNoConflict](docs/sdks/flattening/README.md#componentbodyandparamnoconflict)
* [conflictingParams](docs/sdks/flattening/README.md#conflictingparams)
* [inlineBodyAndParamConflict](docs/sdks/flattening/README.md#inlinebodyandparamconflict)
* [inlineBodyAndParamNoConflict](docs/sdks/flattening/README.md#inlinebodyandparamnoconflict)
* [requiredBodyAllOptional](docs/sdks/flattening/README.md#requiredbodyalloptional)

### [generation()](docs/sdks/generation/README.md)

* [anchorTypesGet](docs/sdks/generation/README.md#anchortypesget)
* [arrayCircularReferenceGet](docs/sdks/generation/README.md#arraycircularreferenceget)
* [circularReferenceGet](docs/sdks/generation/README.md#circularreferenceget)
* [circularReferenceOneDegree](docs/sdks/generation/README.md#circularreferenceonedegree) - A reference cycle that spans three models separated by one degree
* [dateParamWithDefault](docs/sdks/generation/README.md#dateparamwithdefault)
* [dateTimeParamWithDefault](docs/sdks/generation/README.md#datetimeparamwithdefault)
* [decimalParamWithDefault](docs/sdks/generation/README.md#decimalparamwithdefault)
* [deprecatedFieldInSchemaPost](docs/sdks/generation/README.md#deprecatedfieldinschemapost)
* [deprecatedObjectInSchemaGet](docs/sdks/generation/README.md#deprecatedobjectinschemaget)
* [~~deprecatedOperationNoCommentsGet~~](docs/sdks/generation/README.md#deprecatedoperationnocommentsget) - :warning: **Deprecated**
* [~~deprecatedOperationWithCommentsGet~~](docs/sdks/generation/README.md#deprecatedoperationwithcommentsget) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** Use [simplePathParameterObjects](docs/sdks/parameters/README.md#simplepathparameterobjects) instead.
* [~~deprecatedOperationWithMultilineCommentGet~~](docs/sdks/generation/README.md#deprecatedoperationwithmultilinecommentget) - This is an endpoint setup to test deprecation with multiline comments :warning: **Deprecated** Use [simplePathParameterObjects](docs/sdks/parameters/README.md#simplepathparameterobjects) instead.
* [emptyObjectGet](docs/sdks/generation/README.md#emptyobjectget)
* [emptyResponseObjectWithCommentGet](docs/sdks/generation/README.md#emptyresponseobjectwithcommentget)
* [globalNameOverridden](docs/sdks/generation/README.md#globalnameoverridden)
* [ignoredGenerationGet](docs/sdks/generation/README.md#ignoredgenerationget)
* [ignoresPost](docs/sdks/generation/README.md#ignorespost)
* [nameOverride](docs/sdks/generation/README.md#nameoverride)
* [objectCircularReferenceGet](docs/sdks/generation/README.md#objectcircularreferenceget)
* [oneOfCircularReferenceGet](docs/sdks/generation/README.md#oneofcircularreferenceget)
* [reactHookCombinedOptions](docs/sdks/generation/README.md#reacthookcombinedoptions)
* [reactHookDisabled](docs/sdks/generation/README.md#reacthookdisabled)
* [reactHookGetAsMutation](docs/sdks/generation/README.md#reacthookgetasmutation)
* [reactHookPostAsQuery](docs/sdks/generation/README.md#reacthookpostasquery)
* [reactHookRenamed](docs/sdks/generation/README.md#reacthookrenamed)
* [typedParameterGenerationGet](docs/sdks/generation/README.md#typedparametergenerationget)
* [usageExamplePost](docs/sdks/generation/README.md#usageexamplepost) - An operation used for testing usage examples

### [globals()](docs/sdks/globals/README.md)

* [globalPathParameterGet](docs/sdks/globals/README.md#globalpathparameterget)
* [globalsHeaderGet](docs/sdks/globals/README.md#globalsheaderget)
* [globalsHiddenPost](docs/sdks/globals/README.md#globalshiddenpost)
* [globalsOptionalHiddenPathParameterOperationRequired](docs/sdks/globals/README.md#globalsoptionalhiddenpathparameteroperationrequired) - This operation requires a globally optional hidden path parameter. A
failing test with 404 likely indicates that the path parameter value is
not being templated into the client (.../hidden//...).

* [globalsOptionalHiddenPathParameterPathRequired](docs/sdks/globals/README.md#globalsoptionalhiddenpathparameterpathrequired) - This path requires a globally optional hidden path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the client (.../hidden//...).

* [globalsOptionalPathParameterOperationRequired](docs/sdks/globals/README.md#globalsoptionalpathparameteroperationrequired) - This operation requires a globally optional path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the operation request (.../globals//...).

* [globalsOptionalPathParameterPathRequired](docs/sdks/globals/README.md#globalsoptionalpathparameterpathrequired) - This path requires a globally optional path parameter. A failing
test with 404 likely indicates that the path parameter value is not
being templated into the operation request (.../globals//...).

* [globalsQueryParameterGet](docs/sdks/globals/README.md#globalsqueryparameterget)

### [health()](docs/sdks/health/README.md)

* [check](docs/sdks/health/README.md#check)

### [hooks()](docs/sdks/hooks/README.md)

* [authorizationHeaderModification](docs/sdks/hooks/README.md#authorizationheadermodification)
* [testHooks](docs/sdks/hooks/README.md#testhooks)
* [testHooksAfterResponse](docs/sdks/hooks/README.md#testhooksafterresponse)
* [testHooksBeforeCreateRequestPaths](docs/sdks/hooks/README.md#testhooksbeforecreaterequestpaths)
* [testHooksError](docs/sdks/hooks/README.md#testhookserror)

### [methods()](docs/sdks/methods/README.md)

* [methodDelete](docs/sdks/methods/README.md#methoddelete)
* [methodGet](docs/sdks/methods/README.md#methodget)
* [methodHead](docs/sdks/methods/README.md#methodhead)
* [methodOptions](docs/sdks/methods/README.md#methodoptions)
* [methodPatch](docs/sdks/methods/README.md#methodpatch)
* [methodPost](docs/sdks/methods/README.md#methodpost)
* [methodPut](docs/sdks/methods/README.md#methodput)
* [methodTrace](docs/sdks/methods/README.md#methodtrace)

### [nest()](docs/sdks/nest/README.md)


#### [nest().first()](docs/sdks/sdkfirst/README.md)

* [get](docs/sdks/sdkfirst/README.md#get)

### [nested()](docs/sdks/nested/README.md)

* [get](docs/sdks/nested/README.md#get)

#### [nested().first()](docs/sdks/sdknestedfirst/README.md)

* [get](docs/sdks/sdknestedfirst/README.md#get)

#### [nested().second()](docs/sdks/sdksecond/README.md)

* [get](docs/sdks/sdksecond/README.md#get)

### [openEnums()](docs/sdks/openenums/README.md)

* [openEnumsPostUnrecognized](docs/sdks/openenums/README.md#openenumspostunrecognized)

### [pagination()](docs/sdks/pagination/README.md)

* [paginationAmbiguousInput](docs/sdks/pagination/README.md#paginationambiguousinput) - This is a paginated operation where there is both a query parameter and
request body field called "cursor". This ambiguity is used to test that
the generator only updates the appropriate field in the pagination code
"next()" function.

* [paginationBodyFlattenedOptionalSecurity](docs/sdks/pagination/README.md#paginationbodyflattenedoptionalsecurity)
* [paginationBodyFlattenedWithSecurity](docs/sdks/pagination/README.md#paginationbodyflattenedwithsecurity)
* [paginationBodyWrappedRequest](docs/sdks/pagination/README.md#paginationbodywrappedrequest) - This operation has a request wrapper type that encapsulates the
parameters and request body. The pagination inputs are meant to go in
the request body and we want to test that the generator correctly
generates the next() function call preserving everything from the
original request and interpolating the next pagination inputs.

* [paginationCursorBody](docs/sdks/pagination/README.md#paginationcursorbody)
* [paginationCursorNonNumeric](docs/sdks/pagination/README.md#paginationcursornonnumeric)
* [paginationCursorParams](docs/sdks/pagination/README.md#paginationcursorparams)
* [paginationEncapsulatedParameter](docs/sdks/pagination/README.md#paginationencapsulatedparameter) - This is a paginated operation where the input is a query parameter
but the number of arguments exceeds maxMethodParams so it ends up
being encapsulated into a request object.

* [paginationLimitOffsetDeepOutputsPageBody](docs/sdks/pagination/README.md#paginationlimitoffsetdeepoutputspagebody)
* [paginationLimitOffsetDefaultOffsetBody](docs/sdks/pagination/README.md#paginationlimitoffsetdefaultoffsetbody)
* [paginationLimitOffsetDefaultOffsetParams](docs/sdks/pagination/README.md#paginationlimitoffsetdefaultoffsetparams)
* [paginationLimitOffsetOffsetBody](docs/sdks/pagination/README.md#paginationlimitoffsetoffsetbody)
* [paginationLimitOffsetOffsetParams](docs/sdks/pagination/README.md#paginationlimitoffsetoffsetparams)
* [paginationLimitOffsetOptionalPageParams](docs/sdks/pagination/README.md#paginationlimitoffsetoptionalpageparams)
* [paginationLimitOffsetPageBody](docs/sdks/pagination/README.md#paginationlimitoffsetpagebody)
* [paginationLimitOffsetPageParams](docs/sdks/pagination/README.md#paginationlimitoffsetpageparams)
* [paginationURLParams](docs/sdks/pagination/README.md#paginationurlparams)
* [paginationWithRetries](docs/sdks/pagination/README.md#paginationwithretries)
* [paginationWrappedOptionalBody](docs/sdks/pagination/README.md#paginationwrappedoptionalbody)

### [parameters()](docs/sdks/parameters/README.md)

* [deepObjectQueryParamsMap](docs/sdks/parameters/README.md#deepobjectqueryparamsmap)
* [deepObjectQueryParamsObject](docs/sdks/parameters/README.md#deepobjectqueryparamsobject)
* [duplicateParam](docs/sdks/parameters/README.md#duplicateparam)
* [formQueryParamsArray](docs/sdks/parameters/README.md#formqueryparamsarray)
* [formQueryParamsCamelObject](docs/sdks/parameters/README.md#formqueryparamscamelobject)
* [formQueryParamsMap](docs/sdks/parameters/README.md#formqueryparamsmap)
* [formQueryParamsObject](docs/sdks/parameters/README.md#formqueryparamsobject)
* [formQueryParamsPrimitive](docs/sdks/parameters/README.md#formqueryparamsprimitive)
* [formQueryParamsRefParamObject](docs/sdks/parameters/README.md#formqueryparamsrefparamobject)
* [headerParamsArray](docs/sdks/parameters/README.md#headerparamsarray)
* [headerParamsMap](docs/sdks/parameters/README.md#headerparamsmap)
* [headerParamsNil](docs/sdks/parameters/README.md#headerparamsnil)
* [headerParamsObject](docs/sdks/parameters/README.md#headerparamsobject)
* [headerParamsPrimitive](docs/sdks/parameters/README.md#headerparamsprimitive)
* [jsonQueryParamsObject](docs/sdks/parameters/README.md#jsonqueryparamsobject)
* [jsonQueryParamsObjectSmaller](docs/sdks/parameters/README.md#jsonqueryparamsobjectsmaller)
* [mixedParametersCamelCase](docs/sdks/parameters/README.md#mixedparameterscamelcase)
* [mixedParametersPrimitives](docs/sdks/parameters/README.md#mixedparametersprimitives)
* [mixedQueryParams](docs/sdks/parameters/README.md#mixedqueryparams)
* [pathEncoding](docs/sdks/parameters/README.md#pathencoding)
* [pathParameterJson](docs/sdks/parameters/README.md#pathparameterjson)
* [pipeDelimitedQueryParamsArray](docs/sdks/parameters/README.md#pipedelimitedqueryparamsarray)
* [queryEncoding](docs/sdks/parameters/README.md#queryencoding)
* [simplePathParameterArrays](docs/sdks/parameters/README.md#simplepathparameterarrays)
* [simplePathParameterMaps](docs/sdks/parameters/README.md#simplepathparametermaps)
* [simplePathParameterObjects](docs/sdks/parameters/README.md#simplepathparameterobjects)
* [simplePathParameterPrimitives](docs/sdks/parameters/README.md#simplepathparameterprimitives)

### [requestBodies()](docs/sdks/requestbodies/README.md)

* [nullEnumPost](docs/sdks/requestbodies/README.md#nullenumpost)
* [nullableObjectPost](docs/sdks/requestbodies/README.md#nullableobjectpost)
* [nullableOptionalFieldsPost](docs/sdks/requestbodies/README.md#nullableoptionalfieldspost)
* [nullableRequiredEmptyObjectPost](docs/sdks/requestbodies/README.md#nullablerequiredemptyobjectpost)
* [nullableRequiredPropertyPost](docs/sdks/requestbodies/README.md#nullablerequiredpropertypost)
* [nullableRequiredSharedObjectPost](docs/sdks/requestbodies/README.md#nullablerequiredsharedobjectpost)
* [requestBodyDeprecatedRequestBodyRefPost](docs/sdks/requestbodies/README.md#requestbodydeprecatedrequestbodyrefpost)
* [requestBodyGetInferredOptionalRequestWrapper](docs/sdks/requestbodies/README.md#requestbodygetinferredoptionalrequestwrapper)
* [requestBodyPostApplicationJsonArray](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarray)
* [requestBodyPostApplicationJsonArrayCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarraycamelcase)
* [requestBodyPostApplicationJsonArrayObj](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayobj)
* [requestBodyPostApplicationJsonArrayObjCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayobjcamelcase)
* [requestBodyPostApplicationJsonArrayOfArray](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofarray)
* [requestBodyPostApplicationJsonArrayOfArrayCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofarraycamelcase)
* [requestBodyPostApplicationJsonArrayOfArrayOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofarrayofprimitive)
* [requestBodyPostApplicationJsonArrayOfMap](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofmap)
* [requestBodyPostApplicationJsonArrayOfMapCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofmapcamelcase)
* [requestBodyPostApplicationJsonArrayOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofprimitive)
* [requestBodyPostApplicationJsonArrayOfUnions](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonarrayofunions)
* [requestBodyPostApplicationJsonDeep](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsondeep)
* [requestBodyPostApplicationJsonDeepCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsondeepcamelcase)
* [requestBodyPostApplicationJsonMap](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmap)
* [requestBodyPostApplicationJsonMapCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapcamelcase)
* [requestBodyPostApplicationJsonMapObj](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapobj)
* [requestBodyPostApplicationJsonMapObjCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapobjcamelcase)
* [requestBodyPostApplicationJsonMapOfArray](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofarray)
* [requestBodyPostApplicationJsonMapOfArrayCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofarraycamelcase)
* [requestBodyPostApplicationJsonMapOfMap](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofmap)
* [requestBodyPostApplicationJsonMapOfMapCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofmapcamelcase)
* [requestBodyPostApplicationJsonMapOfMapOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofmapofprimitive)
* [requestBodyPostApplicationJsonMapOfPrimitive](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmapofprimitive)
* [requestBodyPostApplicationJsonMultipleJsonFiltered](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonmultiplejsonfiltered)
* [requestBodyPostApplicationJsonSimple](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonsimple)
* [requestBodyPostApplicationJsonSimpleCamelCase](docs/sdks/requestbodies/README.md#requestbodypostapplicationjsonsimplecamelcase)
* [requestBodyPostComplexNumberTypes](docs/sdks/requestbodies/README.md#requestbodypostcomplexnumbertypes)
* [requestBodyPostDefaultsAndConsts](docs/sdks/requestbodies/README.md#requestbodypostdefaultsandconsts)
* [requestBodyPostEmptyBodyRetainedWithAllOptionalFields](docs/sdks/requestbodies/README.md#requestbodypostemptybodyretainedwithalloptionalfields)
* [requestBodyPostEmptyObject](docs/sdks/requestbodies/README.md#requestbodypostemptyobject)
* [requestBodyPostFormDeep](docs/sdks/requestbodies/README.md#requestbodypostformdeep)
* [requestBodyPostFormMapPrimitive](docs/sdks/requestbodies/README.md#requestbodypostformmapprimitive)
* [requestBodyPostFormSimple](docs/sdks/requestbodies/README.md#requestbodypostformsimple)
* [requestBodyPostJsonDataTypesArrayBigInt](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesarraybigint)
* [requestBodyPostJsonDataTypesArrayDate](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesarraydate)
* [requestBodyPostJsonDataTypesArrayDecimalStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesarraydecimalstr)
* [requestBodyPostJsonDataTypesBigInt](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesbigint)
* [requestBodyPostJsonDataTypesBigIntStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesbigintstr)
* [requestBodyPostJsonDataTypesBoolean](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesboolean)
* [requestBodyPostJsonDataTypesComplexNumberArrays](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypescomplexnumberarrays)
* [requestBodyPostJsonDataTypesComplexNumberMaps](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypescomplexnumbermaps)
* [requestBodyPostJsonDataTypesDate](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdate)
* [requestBodyPostJsonDataTypesDateTime](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdatetime)
* [requestBodyPostJsonDataTypesDecimal](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdecimal)
* [requestBodyPostJsonDataTypesDecimalStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesdecimalstr)
* [requestBodyPostJsonDataTypesFloat32](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesfloat32)
* [requestBodyPostJsonDataTypesInt32](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesint32)
* [requestBodyPostJsonDataTypesInteger](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesinteger)
* [requestBodyPostJsonDataTypesMapBigIntStr](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesmapbigintstr)
* [requestBodyPostJsonDataTypesMapDateTime](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesmapdatetime)
* [requestBodyPostJsonDataTypesMapDecimal](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesmapdecimal)
* [requestBodyPostJsonDataTypesNumber](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesnumber)
* [requestBodyPostJsonDataTypesString](docs/sdks/requestbodies/README.md#requestbodypostjsondatatypesstring)
* [requestBodyPostMultipleContentTypesComponentFiltered](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypescomponentfiltered)
* [requestBodyPostMultipleContentTypesComponentFilteredDefaultTest](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypescomponentfiltereddefaulttest)
* [requestBodyPostMultipleContentTypesInlineFiltered](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypesinlinefiltered)
* [requestBodyPostMultipleContentTypesSplitParamForm](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparamform)
* [requestBodyPostMultipleContentTypesSplitParamJson](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparamjson)
* [requestBodyPostMultipleContentTypesSplitParamMultipart](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparammultipart)
* [requestBodyPostMultipleContentTypesSplitForm](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitform)
* [requestBodyPostMultipleContentTypesSplitJson](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitjson)
* [requestBodyPostMultipleContentTypesSplitMultipart](docs/sdks/requestbodies/README.md#requestbodypostmultiplecontenttypessplitmultipart)
* [requestBodyPostNotNullableNotRequiredStringBody](docs/sdks/requestbodies/README.md#requestbodypostnotnullablenotrequiredstringbody)
* [requestBodyPostNullArray](docs/sdks/requestbodies/README.md#requestbodypostnullarray)
* [requestBodyPostNullDictionary](docs/sdks/requestbodies/README.md#requestbodypostnulldictionary)
* [requestBodyPostNullableNotRequiredStringBody](docs/sdks/requestbodies/README.md#requestbodypostnullablenotrequiredstringbody)
* [requestBodyPostNullableRequiredStringBody](docs/sdks/requestbodies/README.md#requestbodypostnullablerequiredstringbody)
* [requestBodyPostWildcard](docs/sdks/requestbodies/README.md#requestbodypostwildcard)
* [requestBodyPutBytes](docs/sdks/requestbodies/README.md#requestbodyputbytes)
* [requestBodyPutBytesWithParams](docs/sdks/requestbodies/README.md#requestbodyputbyteswithparams)
* [requestBodyPutMultipartDeep](docs/sdks/requestbodies/README.md#requestbodyputmultipartdeep)
* [requestBodyPutMultipartDifferentFileName](docs/sdks/requestbodies/README.md#requestbodyputmultipartdifferentfilename)
* [requestBodyPutMultipartFile](docs/sdks/requestbodies/README.md#requestbodyputmultipartfile)
* [requestBodyPutMultipartFileRef](docs/sdks/requestbodies/README.md#requestbodyputmultipartfileref)
* [requestBodyPutMultipartOptionalRequestBody](docs/sdks/requestbodies/README.md#requestbodyputmultipartoptionalrequestbody)
* [requestBodyPutMultipartSimple](docs/sdks/requestbodies/README.md#requestbodyputmultipartsimple)
* [requestBodyPutString](docs/sdks/requestbodies/README.md#requestbodyputstring)
* [requestBodyPutStringWithParams](docs/sdks/requestbodies/README.md#requestbodyputstringwithparams)
* [requestBodyReadAndWrite](docs/sdks/requestbodies/README.md#requestbodyreadandwrite)
* [requestBodyReadOnlyInput](docs/sdks/requestbodies/README.md#requestbodyreadonlyinput)
* [requestBodyReadOnlyUnion](docs/sdks/requestbodies/README.md#requestbodyreadonlyunion)
* [requestBodyReadWriteOnlyUnion](docs/sdks/requestbodies/README.md#requestbodyreadwriteonlyunion)
* [requestBodyWriteOnly](docs/sdks/requestbodies/README.md#requestbodywriteonly)
* [requestBodyWriteOnlyOutput](docs/sdks/requestbodies/README.md#requestbodywriteonlyoutput)
* [requestBodyWriteOnlyUnion](docs/sdks/requestbodies/README.md#requestbodywriteonlyunion)

### [resource()](docs/sdks/resource/README.md)

* [createFile](docs/sdks/resource/README.md#createfile)
* [createResource](docs/sdks/resource/README.md#createresource)
* [deleteResource](docs/sdks/resource/README.md#deleteresource)
* [getArrayDataSource](docs/sdks/resource/README.md#getarraydatasource)
* [getResource](docs/sdks/resource/README.md#getresource)
* [updateResource](docs/sdks/resource/README.md#updateresource)

### [responseBodies()](docs/sdks/responsebodies/README.md)

* [flattenedEnvelopePaginationResponse](docs/sdks/responsebodies/README.md#flattenedenvelopepaginationresponse)
* [flattenedEnvelopeResponse](docs/sdks/responsebodies/README.md#flattenedenveloperesponse)
* [flattenedEnvelopeUnionResponse](docs/sdks/responsebodies/README.md#flattenedenvelopeunionresponse)
* [flattenedUnionResponse](docs/sdks/responsebodies/README.md#flattenedunionresponse)
* [overriddenFieldNamesPost](docs/sdks/responsebodies/README.md#overriddenfieldnamespost)
* [responseBodies2xxJSONObjectAllOptionalProperties](docs/sdks/responsebodies/README.md#responsebodies2xxjsonobjectalloptionalproperties)
* [responseBodyAdditionalPropertiesAnyPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiesanypost)
* [responseBodyAdditionalPropertiesComplexNumbersPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiescomplexnumberspost)
* [responseBodyAdditionalPropertiesDatePost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiesdatepost)
* [responseBodyAdditionalPropertiesObjectPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiesobjectpost)
* [responseBodyAdditionalPropertiesPost](docs/sdks/responsebodies/README.md#responsebodyadditionalpropertiespost)
* [responseBodyBytesGet](docs/sdks/responsebodies/README.md#responsebodybytesget)
* [responseBodyDecimalStr](docs/sdks/responsebodies/README.md#responsebodydecimalstr)
* [responseBodyEmptyWithHeaders](docs/sdks/responsebodies/README.md#responsebodyemptywithheaders)
* [responseBodyMissing2xxOr3xxGet](docs/sdks/responsebodies/README.md#responsebodymissing2xxor3xxget)
* [responseBodyMultilineStringPost](docs/sdks/responsebodies/README.md#responsebodymultilinestringpost)
* [responseBodyOptionalGet](docs/sdks/responsebodies/README.md#responsebodyoptionalget)
* [responseBodyReadOnly](docs/sdks/responsebodies/README.md#responsebodyreadonly)
* [responseBodyStringGet](docs/sdks/responsebodies/README.md#responsebodystringget)
* [responseBodyXmlGet](docs/sdks/responsebodies/README.md#responsebodyxmlget)

### [retries()](docs/sdks/retries/README.md)

* [retriesAfter](docs/sdks/retries/README.md#retriesafter)
* [retriesConnectErrorGet](docs/sdks/retries/README.md#retriesconnecterrorget) - A request to a non-valid port to test connection errors
* [retriesFlatEmptyResponsePost](docs/sdks/retries/README.md#retriesflatemptyresponsepost)
* [retriesGet](docs/sdks/retries/README.md#retriesget)
* [retriesPost](docs/sdks/retries/README.md#retriespost)

### [SDK](docs/sdks/sdk/README.md)

* [ambiguousQueryParam](docs/sdks/sdk/README.md#ambiguousqueryparam) - Tests conflict with C# System namespace
* [authenticatedRequest](docs/sdks/sdk/README.md#authenticatedrequest)
* [conflictingEnum](docs/sdks/sdk/README.md#conflictingenum) - Test potential namespace conflicts with java.lang.Object
* [ignoredGenerationPut](docs/sdks/sdk/README.md#ignoredgenerationput)
* [multilineExample](docs/sdks/sdk/README.md#multilineexample)
* [postAdditionalPropertiesWithNullableFields](docs/sdks/sdk/README.md#postadditionalpropertieswithnullablefields)
* [responseBodyJsonGet](docs/sdks/sdk/README.md#responsebodyjsonget)

### [second()](docs/sdks/second/README.md)

* [get](docs/sdks/second/README.md#get)

### [servers()](docs/sdks/servers/README.md)

* [selectGlobalServer](docs/sdks/servers/README.md#selectglobalserver)
* [selectServerWithID](docs/sdks/servers/README.md#selectserverwithid) - Select a server by ID.
* [serverWithProtocolTemplate](docs/sdks/servers/README.md#serverwithprotocoltemplate)
* [serverWithTemplates](docs/sdks/servers/README.md#serverwithtemplates)
* [serverWithTemplatesGlobal](docs/sdks/servers/README.md#serverwithtemplatesglobal)
* [serversByIDWithTemplates](docs/sdks/servers/README.md#serversbyidwithtemplates)
* [serversOverrideGlobalServerURL](docs/sdks/servers/README.md#serversoverrideglobalserverurl)
* [serversOverrideOperationServerURL](docs/sdks/servers/README.md#serversoverrideoperationserverurl)

### [statusCode()](docs/sdks/statuscode/README.md)

* [statusCode2XX](docs/sdks/statuscode/README.md#statuscode2xx)
* [statusCode4XX](docs/sdks/statuscode/README.md#statuscode4xx)
* [statusCode5XX](docs/sdks/statuscode/README.md#statuscode5xx)
* [statusCodeDefault](docs/sdks/statuscode/README.md#statuscodedefault)

### [telemetry()](docs/sdks/telemetry/README.md)

* [telemetrySpeakeasyUserAgentGet](docs/sdks/telemetry/README.md#telemetryspeakeasyuseragentget)
* [telemetryUserAgentGet](docs/sdks/telemetry/README.md#telemetryuseragentget)

### [unions()](docs/sdks/unions/README.md)

* [arrayOfDiscriminatedUnions](docs/sdks/unions/README.md#arrayofdiscriminatedunions)
* [arrayOfDiscriminatedUnionsMap](docs/sdks/unions/README.md#arrayofdiscriminatedunionsmap)
* [collectionOneOfPost](docs/sdks/unions/README.md#collectiononeofpost)
* [constDiscriminatedOneOf](docs/sdks/unions/README.md#constdiscriminatedoneof)
* [discriminatedOneMultipleMemberships](docs/sdks/unions/README.md#discriminatedonemultiplememberships)
* [discriminatedOneMultipleMembershipsHasWheels](docs/sdks/unions/README.md#discriminatedonemultiplemembershipshaswheels)
* [flattenedTypedObjectPost](docs/sdks/unions/README.md#flattenedtypedobjectpost)
* [infectedWithAny](docs/sdks/unions/README.md#infectedwithany)
* [mixedTypeOneOfPost](docs/sdks/unions/README.md#mixedtypeoneofpost)
* [mixedUnionTypes](docs/sdks/unions/README.md#mixeduniontypes)
* [multiMatchAnyOf](docs/sdks/unions/README.md#multimatchanyof)
* [nestedArrayOfDiscriminatedUnions](docs/sdks/unions/README.md#nestedarrayofdiscriminatedunions)
* [nullableOneOfRefInObjectPost](docs/sdks/unions/README.md#nullableoneofrefinobjectpost)
* [nullableOneOfSchemaPost](docs/sdks/unions/README.md#nullableoneofschemapost)
* [nullableOneOfTypeInObjectPost](docs/sdks/unions/README.md#nullableoneoftypeinobjectpost)
* [nullableTypedObjectPost](docs/sdks/unions/README.md#nullabletypedobjectpost)
* [oneOfOverlappingObjects](docs/sdks/unions/README.md#oneofoverlappingobjects)
* [primitiveTypeOneOfPost](docs/sdks/unions/README.md#primitivetypeoneofpost)
* [stronglyTypedOneOfDiscriminatedPost](docs/sdks/unions/README.md#stronglytypedoneofdiscriminatedpost)
* [stronglyTypedOneOfPost](docs/sdks/unions/README.md#stronglytypedoneofpost)
* [stronglyTypedOneOfPostWithNonStandardDiscriminatorName](docs/sdks/unions/README.md#stronglytypedoneofpostwithnonstandarddiscriminatorname)
* [typedObjectNullableOneOfPost](docs/sdks/unions/README.md#typedobjectnullableoneofpost)
* [typedObjectOneOfPost](docs/sdks/unions/README.md#typedobjectoneofpost)
* [unionBigIntStrDecimal](docs/sdks/unions/README.md#unionbigintstrdecimal)
* [unionDateNull](docs/sdks/unions/README.md#uniondatenull)
* [unionDateTimeBigInt](docs/sdks/unions/README.md#uniondatetimebigint)
* [unionDateTimeNull](docs/sdks/unions/README.md#uniondatetimenull)
* [unionMap](docs/sdks/unions/README.md#unionmap)
* [unionMapOptional](docs/sdks/unions/README.md#unionmapoptional)
* [unionNestedEnumsForm](docs/sdks/unions/README.md#unionnestedenumsform)
* [unionNestedEnumsMultipart](docs/sdks/unions/README.md#unionnestedenumsmultipart)
* [unionOfArraysPost](docs/sdks/unions/README.md#unionofarrayspost)
* [weaklyTypedOneOfNullEnumPost](docs/sdks/unions/README.md#weaklytypedoneofnullenumpost)
* [weaklyTypedOneOfPost](docs/sdks/unions/README.md#weaklytypedoneofpost)

</details>
<!-- End Available Resources and Operations [operations] -->





<!-- Start Global Parameters [global-parameters] -->
## Global Parameters

Certain parameters are configured globally. These parameters may be set on the SDK client instance itself during initialization. When configured as an option during SDK initialization, These global values will be used as defaults on the operations that use them. When such operations are called, there is a place in each to override the global value, if needed.

For example, you can set `globalHeaderParam` to `true` at SDK initialization and then you do not have to pass the same value on calls to operations like `globalPathParameterGet`. But if you want to do so you may, which will locally override the global setting. See the example code below for a demonstration.


### Available Globals

The following global parameters are available.

| Name                          | Type             | Description                                                                                                                                                                                                              |
| ----------------------------- | ---------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| globalHeaderParam             | boolean          | The globalHeaderParam parameter.                                                                                                                                                                                         |
| globalHiddenHeaderParam       | java.lang.String | The globalHiddenHeaderParam parameter.                                                                                                                                                                                   |
| globalHiddenPathParam         | java.lang.String | The globalHiddenPathParam parameter.                                                                                                                                                                                     |
| globalHiddenQueryParam        | java.lang.String | The globalHiddenQueryParam parameter.                                                                                                                                                                                    |
| globalOptionalHiddenPathParam | java.lang.String | An optional and hidden global path parameter. Some paths and operations<br/>will override it to required: true, especially for verifying test<br/>generation where the value should be templated in the SDK client.<br/> |
| globalOptionalPathParam       | java.lang.String | An optional global path parameter. Some paths and operations will<br/>override it to required: true, especially for verifying test generation<br/>where the value should be templated in the operation request.<br/>     |
| globalPathParam               | long             | The globalPathParam parameter.                                                                                                                                                                                           |
| globalQueryParam              | java.lang.String | The globalQueryParam parameter.                                                                                                                                                                                          |

### Example

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GlobalPathParameterGetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        GlobalPathParameterGetResponse res = sdk.globals().globalPathParameterGet()
                .globalPathParam(100L)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Global Parameters [global-parameters] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->



### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage 
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally 
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. 
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
