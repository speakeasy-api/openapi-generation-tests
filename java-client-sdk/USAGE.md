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
                .setSecurity(new Security(){{
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

            UsageExamplePostRequest req = new UsageExamplePostRequest(168827L, "invoice", false, LocalDate.parse("2022-07-22"), OffsetDateTime.parse("2021-10-21T09:16:58.799Z"), 5223.72d, "Electronic", 5669.99d, UsageExamplePostEnumParameter.VALUE1, 0d, 5696.63f, 2642.95d, 352778L, 460053, "example 2"){{
                requestBody = new UsageExamplePostRequestBody(){{
                    fakerFormattedStrings = new FakerFormattedStrings(){{
                        addressFormat = "011 Darrin Park";
                        directoryFormat = "/home/user";
                        domainFormat = "tame-homogenate.org";
                        emailFormat = "Oran16@gmail.com";
                        filenameFormat = "cornmeal.png";
                        filepathFormat = "/usr/green_target.z4";
                        imageFormat = "https://loremflickr.com/640/480";
                        ipv4Format = "116.31.181.178";
                        ipv6Format = "73ac:9ee2:348d:76c3:164a:258b:e7e1:3586";
                        jsonFormat = "{hill: 44935, spider: null, poem: \"lumen\"}";
                        macFormat = "5a:01:52:35:91:2b";
                        passwordFormat = "WzdveK0sHokC9nF";
                        phoneFormat = "504.722.1221";
                        timezoneFormat = "Asia/Krasnoyarsk";
                        unknownFormat = "alarm";
                        urlFormat = "https://wilted-cytoplasm.biz";
                        uuidFormat = "e0f62de2-e2d4-47a9-bf10-0f753b9b364b";
                        zipcodeFormat = "73625";
                    }};
                    fakerStrings = new FakerStrings(){{
                        city = "Schuppecester";
                        iban = "NO0300631256004";
                        id = "<ID>";
                        iPv4 = "251.251.208.201";
                        iPv6 = "ffbd:3ad7:2b20:8b2c:8188:308b:b979:0237";
                        account = "29659826";
                        address = "2500 Ambrose Circles";
                        amount = "89.73";
                        avatar = "https://loremflickr.com/640/480";
                        color = "fuchsia";
                        comment = "Carbonite web goalkeeper gloves are ergonomically designed to give easy fit";
                        company = "Sipes - Buckridge";
                        country = "Turkey";
                        countryCode = "NF";
                        currency = "Pakistan Rupee";
                        datatype = "real";
                        default_ = "Predovic";
                        description = "Switchable holistic open system";
                        directory = "/bin";
                        domainName = "all-input.biz";
                        emailAddr = "Litzy.Kozey@hotmail.com";
                        extension = "jpeg";
                        filename = "east_ubiquitous.png";
                        filepath = "/opt/buying.iota";
                        filetype = "video";
                        firstName = "Beulah";
                        fullName = "Angel Bednar II";
                        gender = "Two-spirit person";
                        job = "Legacy Security Facilitator";
                        json = "{cart: 88901, nonsense: null, switch: \"jovially\"}";
                        key = "<key>";
                        lastName = "Murazik";
                        latitude = "-66.8568";
                        locale = "en_IE";
                        longitude = "-124.4225";
                        mac = "a1:bf:6e:19:04:55";
                        manufacturer = "Mercedes Benz";
                        material = "Granite";
                        middleName = "Reese";
                        model = "Land Cruiser";
                        password = "NrTzqbDz8AXYBy7";
                        phone = "1-316-949-7364 x6960";
                        pin = "4535";
                        postalCode = "69567";
                        price = "155.00";
                        product = "Incredible Rubber Tuna";
                        sex = "female";
                        street = "Novella Center";
                        timezone = "Europe/Amsterdam";
                        unit = "sievert";
                        url = "https://burly-nondisclosure.org";
                        username = "Herman79";
                        uuid = "de9701e2-5221-4b7b-a969-fc729e9f1c7e";
                    }};
                    simpleObject = new SimpleObject("any", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z"), Enum.ONE, 1.1f, 1L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Second, 1.1d, "test"){{
                        bigint = 8821239038968084L;
                        bigintStr = "9223372036854775808";
                        boolOpt = true;
                        decimal = 3.141592653589793d;
                        decimalStr = "3.14159265358979344719667586";
                        intOptNull = 870078L;
                        numOptNull = 5823.74d;
                        strOpt = "testOptional";
                    }};
                }};
                bigintParameterOptional = 134186L;
                bigintStrParameterOptional = "bypass";
                decimalParameterOptional = 9388.52d;
                decimalStrParameterOptional = "Fiat";
                optEnumParameter = UsageExamplePostOptEnumParameter.VALUE3;
            }};            

            UsageExamplePostResponse res = sdk.generation.usageExamplePost(req, new UsageExamplePostSecurity("YOUR_PASSWORD", "YOUR_USERNAME"){{
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