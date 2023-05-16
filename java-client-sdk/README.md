# openapi

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'org.openapis.openapi:openapi:1.0.0'
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->
```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.UsageExamplePostEnumParameterEnum;
import org.openapis.openapi.models.operations.UsageExamplePostOptEnumParameterEnum;
import org.openapis.openapi.models.operations.UsageExamplePostRequest;
import org.openapis.openapi.models.operations.UsageExamplePostRequestBody;
import org.openapis.openapi.models.operations.UsageExamplePostResponse;
import org.openapis.openapi.models.operations.UsageExamplePostSecurity;
import org.openapis.openapi.models.shared.EnumEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;
import org.openapis.openapi.models.shared.SimpleObjectInt32EnumEnum;
import org.openapis.openapi.models.shared.SimpleObjectIntEnumEnum;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            UsageExamplePostRequest req = new UsageExamplePostRequest(false, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), 2.2222222, UsageExamplePostEnumParameterEnum.VALUE3, 1.1, 111111L, 1, "example") {{
                requestBody = new UsageExamplePostRequestBody() {{
                    email = "Larue_Rau85@yahoo.com";
                    formatEmail = "Roselyn_Kassulke@yahoo.com";
                    formatUri = "http://innocent-effect.org";
                    formatUuid = "0f467cc8-796e-4d15-9a05-dfc2ddf7cc78";
                    hostname = "soulful-poppy.com";
                    ipv4 = "184.163.148.36";
                    ipv6 = "8fc8:1674:2cb7:3920:5929:396f:ea75:96eb";
                    simpleObject = new SimpleObject("architecto", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), EnumEnum.TWO, 2.2222222, 999999L, 1, SimpleObjectInt32EnumEnum.FIFTY_FIVE, SimpleObjectIntEnumEnum.Third, 1.1, "example") {{
                        bigint = 666767L;
                        bigintStr = "mollitia";
                        boolOpt = true;
                        intOptNull = 999999L;
                        numOptNull = 1.1;
                        strOpt = "optional example";
                    }};;
                    unknown = "laborum";
                    uri = "http://doting-footage.com";
                    uuid = "c5955907-aff1-4a3a-afa9-467739251aa5";
                }};;
                optEnumParameter = UsageExamplePostOptEnumParameterEnum.VALUE3;
            }};            

            UsageExamplePostResponse res = sdk.generation.usageExamplePost(req, new UsageExamplePostSecurity("YOUR_PASSWORD", "YOUR_USERNAME") {{
                password = "YOUR_PASSWORD";
                username = "YOUR_USERNAME";
            }});

            if (res.usageExamplePost200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## Available Resources and Operations

### [SDK](docs/sdk/README.md)

* [putAnythingIgnoredGeneration](docs/sdk/README.md#putanythingignoredgeneration)
* [responseBodyJsonGet](docs/sdk/README.md#responsebodyjsonget)

### [auth](docs/auth/README.md)

* [apiKeyAuth](docs/auth/README.md#apikeyauth)
* [apiKeyAuthGlobal](docs/auth/README.md#apikeyauthglobal)
* [basicAuth](docs/auth/README.md#basicauth)
* [bearerAuth](docs/auth/README.md#bearerauth)
* [oauth2Auth](docs/auth/README.md#oauth2auth)
* [openIdConnectAuth](docs/auth/README.md#openidconnectauth)

### [authNew](docs/authnew/README.md)

* [apiKeyAuthGlobalNew](docs/authnew/README.md#apikeyauthglobalnew)
* [basicAuthNew](docs/authnew/README.md#basicauthnew)
* [multipleMixedOptionsAuth](docs/authnew/README.md#multiplemixedoptionsauth)
* [multipleMixedSchemeAuth](docs/authnew/README.md#multiplemixedschemeauth)
* [multipleOptionsWithMixedSchemesAuth](docs/authnew/README.md#multipleoptionswithmixedschemesauth)
* [multipleOptionsWithSimpleSchemesAuth](docs/authnew/README.md#multipleoptionswithsimpleschemesauth)
* [multipleSimpleOptionsAuth](docs/authnew/README.md#multiplesimpleoptionsauth)
* [multipleSimpleSchemeAuth](docs/authnew/README.md#multiplesimpleschemeauth)
* [oauth2AuthNew](docs/authnew/README.md#oauth2authnew)
* [openIdConnectAuthNew](docs/authnew/README.md#openidconnectauthnew)

### [errors](docs/errors/README.md)

* [connectionErrorGet](docs/errors/README.md#connectionerrorget)
* [statusGet](docs/errors/README.md#statusget)
* [statusPostRetries](docs/errors/README.md#statuspostretries)

### [flattening](docs/flattening/README.md)

* [componentBodyAndParamConflict](docs/flattening/README.md#componentbodyandparamconflict)
* [componentBodyAndParamNoConflict](docs/flattening/README.md#componentbodyandparamnoconflict)
* [conflictingParams](docs/flattening/README.md#conflictingparams)
* [inlineBodyAndParamConflict](docs/flattening/README.md#inlinebodyandparamconflict)
* [inlineBodyAndParamNoConflict](docs/flattening/README.md#inlinebodyandparamnoconflict)

### [generation](docs/generation/README.md)

* [anchorTypesGet](docs/generation/README.md#anchortypesget)
* [circularReferenceGet](docs/generation/README.md#circularreferenceget)
* [~~deprecatedNoCommentsGet~~](docs/generation/README.md#deprecatednocommentsget) - :warning: **Deprecated**
* [~~deprecatedWithCommentsGet~~](docs/generation/README.md#deprecatedwithcommentsget) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated**
* [globalNameOverridden](docs/generation/README.md#globalnameoverridden)
* [ignoredGenerationGet](docs/generation/README.md#ignoredgenerationget)
* [ignoresPost](docs/generation/README.md#ignorespost)
* [nameOverride](docs/generation/README.md#nameoverride)
* [usageExamplePost](docs/generation/README.md#usageexamplepost) - An operation used for testing usage examples

### [globals](docs/globals/README.md)

* [globalPathParameterGet](docs/globals/README.md#globalpathparameterget)
* [globalsQueryParameterGet](docs/globals/README.md#globalsqueryparameterget)

### [parameters](docs/parameters/README.md)

* [deepObjectQueryParamsMap](docs/parameters/README.md#deepobjectqueryparamsmap)
* [deepObjectQueryParamsObject](docs/parameters/README.md#deepobjectqueryparamsobject)
* [formQueryParamsArray](docs/parameters/README.md#formqueryparamsarray)
* [formQueryParamsMap](docs/parameters/README.md#formqueryparamsmap)
* [formQueryParamsObject](docs/parameters/README.md#formqueryparamsobject)
* [formQueryParamsPrimitive](docs/parameters/README.md#formqueryparamsprimitive)
* [formQueryParamsRefParamObject](docs/parameters/README.md#formqueryparamsrefparamobject)
* [headerParamsArray](docs/parameters/README.md#headerparamsarray)
* [headerParamsMap](docs/parameters/README.md#headerparamsmap)
* [headerParamsObject](docs/parameters/README.md#headerparamsobject)
* [headerParamsPrimitive](docs/parameters/README.md#headerparamsprimitive)
* [jsonQueryParamsObject](docs/parameters/README.md#jsonqueryparamsobject)
* [mixedQueryParams](docs/parameters/README.md#mixedqueryparams)
* [pathParameterJson](docs/parameters/README.md#pathparameterjson)
* [pipeDelimitedQueryParamsArray](docs/parameters/README.md#pipedelimitedqueryparamsarray)
* [simplePathParameterArrays](docs/parameters/README.md#simplepathparameterarrays)
* [simplePathParameterMaps](docs/parameters/README.md#simplepathparametermaps)
* [simplePathParameterObjects](docs/parameters/README.md#simplepathparameterobjects)
* [simplePathParameterPrimitives](docs/parameters/README.md#simplepathparameterprimitives)

### [requestBodies](docs/requestbodies/README.md)

* [requestBodyPostApplicationJsonArray](docs/requestbodies/README.md#requestbodypostapplicationjsonarray)
* [requestBodyPostApplicationJsonArrayObj](docs/requestbodies/README.md#requestbodypostapplicationjsonarrayobj)
* [requestBodyPostApplicationJsonArrayOfArray](docs/requestbodies/README.md#requestbodypostapplicationjsonarrayofarray)
* [requestBodyPostApplicationJsonArrayOfArrayOfPrimitive](docs/requestbodies/README.md#requestbodypostapplicationjsonarrayofarrayofprimitive)
* [requestBodyPostApplicationJsonArrayOfMap](docs/requestbodies/README.md#requestbodypostapplicationjsonarrayofmap)
* [requestBodyPostApplicationJsonArrayOfPrimitive](docs/requestbodies/README.md#requestbodypostapplicationjsonarrayofprimitive)
* [requestBodyPostApplicationJsonDeep](docs/requestbodies/README.md#requestbodypostapplicationjsondeep)
* [requestBodyPostApplicationJsonMap](docs/requestbodies/README.md#requestbodypostapplicationjsonmap)
* [requestBodyPostApplicationJsonMapObj](docs/requestbodies/README.md#requestbodypostapplicationjsonmapobj)
* [requestBodyPostApplicationJsonMapOfArray](docs/requestbodies/README.md#requestbodypostapplicationjsonmapofarray)
* [requestBodyPostApplicationJsonMapOfMap](docs/requestbodies/README.md#requestbodypostapplicationjsonmapofmap)
* [requestBodyPostApplicationJsonMapOfMapOfPrimitive](docs/requestbodies/README.md#requestbodypostapplicationjsonmapofmapofprimitive)
* [requestBodyPostApplicationJsonMapOfPrimitive](docs/requestbodies/README.md#requestbodypostapplicationjsonmapofprimitive)
* [requestBodyPostApplicationJsonMultipleJsonFiltered](docs/requestbodies/README.md#requestbodypostapplicationjsonmultiplejsonfiltered)
* [requestBodyPostApplicationJsonSimple](docs/requestbodies/README.md#requestbodypostapplicationjsonsimple)
* [requestBodyPostFormDeep](docs/requestbodies/README.md#requestbodypostformdeep)
* [requestBodyPostFormMapPrimitive](docs/requestbodies/README.md#requestbodypostformmapprimitive)
* [requestBodyPostFormSimple](docs/requestbodies/README.md#requestbodypostformsimple)
* [requestBodyPostMultipleContentTypesComponentFiltered](docs/requestbodies/README.md#requestbodypostmultiplecontenttypescomponentfiltered)
* [requestBodyPostMultipleContentTypesInlineFiltered](docs/requestbodies/README.md#requestbodypostmultiplecontenttypesinlinefiltered)
* [requestBodyPostMultipleContentTypesSplitParamForm](docs/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparamform)
* [requestBodyPostMultipleContentTypesSplitParamJson](docs/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparamjson)
* [requestBodyPostMultipleContentTypesSplitParamMultipart](docs/requestbodies/README.md#requestbodypostmultiplecontenttypessplitparammultipart)
* [requestBodyPostMultipleContentTypesSplitForm](docs/requestbodies/README.md#requestbodypostmultiplecontenttypessplitform)
* [requestBodyPostMultipleContentTypesSplitJson](docs/requestbodies/README.md#requestbodypostmultiplecontenttypessplitjson)
* [requestBodyPostMultipleContentTypesSplitMultipart](docs/requestbodies/README.md#requestbodypostmultiplecontenttypessplitmultipart)
* [requestBodyPutBytes](docs/requestbodies/README.md#requestbodyputbytes)
* [requestBodyPutMultipartDeep](docs/requestbodies/README.md#requestbodyputmultipartdeep)
* [requestBodyPutMultipartFile](docs/requestbodies/README.md#requestbodyputmultipartfile)
* [requestBodyPutMultipartSimple](docs/requestbodies/README.md#requestbodyputmultipartsimple)
* [requestBodyPutString](docs/requestbodies/README.md#requestbodyputstring)

### [responseBodies](docs/responsebodies/README.md)

* [responseBodyBytesGet](docs/responsebodies/README.md#responsebodybytesget)
* [responseBodyStringGet](docs/responsebodies/README.md#responsebodystringget)
* [responseBodyXmlGet](docs/responsebodies/README.md#responsebodyxmlget)

### [servers](docs/servers/README.md)

* [selectGlobalServer](docs/servers/README.md#selectglobalserver)
* [selectServerWithID](docs/servers/README.md#selectserverwithid) - Select a server by ID.
* [serverWithTemplates](docs/servers/README.md#serverwithtemplates)
* [serverWithTemplatesGlobal](docs/servers/README.md#serverwithtemplatesglobal)

### [unions](docs/unions/README.md)

* [mixedTypeOneOfPost](docs/unions/README.md#mixedtypeoneofpost)
* [primitiveTypeOneOfPost](docs/unions/README.md#primitivetypeoneofpost)
* [stronglyTypedOneOfPost](docs/unions/README.md#stronglytypedoneofpost)
* [typedObjectOneOfPost](docs/unions/README.md#typedobjectoneofpost)
* [weaklyTypedOneOfPost](docs/unions/README.md#weaklytypedoneofpost)
<!-- End SDK Available Operations -->

### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage 
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally 
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. 
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
