<!-- Start SDK Example Usage -->


```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GetGlobalNameOverrideResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            GetGlobalNameOverrideResponse res = sdk.generation.globalNameOverridden();

            if (res.getGlobalNameOverride200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


## Second
Do this second
```java
package hello.world;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.UsageExamplePostEnumParameter;
import org.openapis.openapi.models.operations.UsageExamplePostOptEnumParameter;
import org.openapis.openapi.models.operations.UsageExamplePostRequest;
import org.openapis.openapi.models.operations.UsageExamplePostRequestBody;
import org.openapis.openapi.models.operations.UsageExamplePostResponse;
import org.openapis.openapi.models.operations.UsageExamplePostSecurity;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.FakerFormattedStrings;
import org.openapis.openapi.models.shared.FakerStrings;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;
import org.openapis.openapi.models.shared.SimpleObjectInt32Enum;
import org.openapis.openapi.models.shared.SimpleObjectIntEnum;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            UsageExamplePostRequest req = new UsageExamplePostRequest(168827L, "Gasoline Sleek", false, LocalDate.parse("2021-04-23"), OffsetDateTime.parse("2022-09-13T20:44:04.193Z"), 1952.32d, "Shoes Brockton", 1062.86d, UsageExamplePostEnumParameter.VALUE1, 0d, 2346.82f, 5954.85d, 215216L, 834441, "example 2") {{
                requestBody = new UsageExamplePostRequestBody() {{
                    fakerFormattedStrings = new FakerFormattedStrings() {{
                        addressFormat = "279 Cassandra Club";
                        directoryFormat = "/var/mail";
                        domainFormat = "dizzy-geology.net";
                        emailFormat = "Pierre49@yahoo.com";
                        filenameFormat = "deposit_male_dram.mpg4";
                        filepathFormat = "/srv/deeply_gloves_program.st";
                        imageFormat = "https://loremflickr.com/640/480";
                        ipv4Format = "101.207.63.27";
                        ipv6Format = "64a2:58be:7e13:5866:7dac:95a0:1523:5912";
                        jsonFormat = "{rate: 57509, underwire: null, cent: \"male Iodine\"}";
                        macFormat = "02:f2:2d:15:6d:c5";
                        passwordFormat = "9nF4NLa49gS71tG";
                        phoneFormat = "1-891-918-2466";
                        timezoneFormat = "Asia/Jakarta";
                        unknownFormat = "Northeast Uzbekistan HDD";
                        urlFormat = "http://sane-network.net";
                        uuidFormat = "364b6b4a-48ad-4bb3-b96c-2e388ca7107f";
                        zipcodeFormat = "87997-8268";
                    }};;
                    fakerStrings = new FakerStrings() {{
                        city = "Carolinafort";
                        iban = "CY35007005052574022Q9F55000Q";
                        id = "<ID>";
                        iPv4 = "128.213.29.233";
                        iPv6 = "aa92:fb62:d7b0:075d:a754:8270:74e6:53f1";
                        account = "10128020";
                        address = "97181 Metz Trafficway";
                        amount = "896.58";
                        avatar = "https://loremflickr.com/640/480";
                        color = "grey";
                        comment = "Carbonite web goalkeeper gloves are ergonomically designed to give easy fit";
                        company = "Gottlieb Inc";
                        country = "Nicaragua";
                        countryCode = "BO";
                        currency = "Seychelles Rupee";
                        datatype = "point";
                        default_ = "as Rock";
                        description = "Extended encompassing framework";
                        directory = "/Users";
                        domainName = "lumpy-sand.name";
                        emailAddr = "Jayde_Stracke94@gmail.com";
                        extension = "m1v";
                        filename = "oof_plastic.gif";
                        filepath = "/srv/yum.mrcx";
                        filetype = "audio";
                        firstName = "Lula";
                        fullName = "Bonnie Nitzsche";
                        gender = "Transmasculine";
                        job = "Legacy Markets Orchestrator";
                        json = "{housing: 65187, wine: null, planter: \"Lafayette array\"}";
                        key = "<key>";
                        lastName = "Leannon";
                        latitude = "-38.3898";
                        locale = "ko";
                        longitude = "179.7448";
                        mac = "99:b2:4a:a3:1c:16";
                        manufacturer = "Nissan";
                        material = "Rubber";
                        middleName = "Austin";
                        model = "Model Y";
                        password = "qIlrvZKw0C22gKb";
                        phone = "1-646-984-1595 x907";
                        pin = "4985";
                        postalCode = "51983";
                        price = "356.00";
                        product = "Handcrafted Plastic Cheese";
                        sex = "male";
                        street = "Humberto Court";
                        timezone = "Europe/Ljubljana";
                        unit = "gray";
                        url = "http://striped-cutlet.net";
                        username = "Jeanette82";
                        uuid = "004523e8-6559-4551-a938-6a9f8f4b14b9";
                    }};;
                    simpleObject = new SimpleObject("Pickup", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z"), Enum.ONE, 1.1f, 1L, 1, SimpleObjectInt32Enum.ONE_HUNDRED_AND_EIGHTY_ONE, SimpleObjectIntEnum.Second, 1.1d, "test") {{
                        bigint = 8821239038968084L;
                        bigintStr = "9223372036854775808";
                        boolOpt = true;
                        decimal = 3.141592653589793d;
                        decimalStr = "3.14159265358979344719667586";
                        intOptNull = 513927L;
                        numOptNull = 4837.7d;
                        strOpt = "testOptional";
                    }};;
                }};;
                bigintParameterOptional = 460571L;
                bigintStrParameterOptional = "South";
                decimalParameterOptional = 2056.71d;
                decimalStrParameterOptional = "provided blue Luxurious";
                optEnumParameter = UsageExamplePostOptEnumParameter.VALUE3;
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