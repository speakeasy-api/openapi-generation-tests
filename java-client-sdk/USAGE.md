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

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Second

Do this second

```java
package hello.world;

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
import org.openapis.openapi.models.shared.FakerFormattedStrings;
import org.openapis.openapi.models.shared.FakerStrings;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            UsageExamplePostRequest req = new UsageExamplePostRequest(168827L, "string", false, LocalDate.parse("2022-05-05"), OffsetDateTime.parse("2023-06-11T00:39:45.412Z"), OffsetDateTime.parse("2022-07-22T13:16:48.221Z"), 2679.33d, "string", 5223.72d, EnumParameter.VALUE1, 0d, 6946.59f, 2286.22d, 102975L, 566999, "example 1"){{
                requestBody = new UsageExamplePostRequestBody(){{
                    fakerFormattedStrings = new FakerFormattedStrings(){{
                        addressFormat = "2344 Aufderhar Corner";
                        directoryFormat = "/etc/defaults";
                        domainFormat = "fatal-cutting.name";
                        emailFormat = "Roberta.Kemmer77@gmail.com";
                        filenameFormat = "strategic_southwest_shirt.mp4v";
                        filepathFormat = "/usr/local/bin/target.z4";
                        imageFormat = "https://loremflickr.com/640/480";
                        ipv4Format = "116.31.181.178";
                        ipv6Format = "73ac:9ee2:348d:76c3:164a:258b:e7e1:3586";
                        jsonFormat = "{key: 42822, key1: null, key2: \"string\"}";
                        macFormat = "7d:ac:95:a0:15:23";
                        passwordFormat = "eWzdveK0sHokC9n";
                        phoneFormat = "1-340-562-2122 x175";
                        timezoneFormat = "Asia/Yekaterinburg";
                        unknownFormat = "string";
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
                        default_ = "string";
                        description = "Customizable zero administration open system";
                        directory = "/opt/sbin";
                        domainName = "deep-stallion.info";
                        emailAddr = "Alejandrin.Barrows@hotmail.com";
                        extension = "m1v";
                        filename = "panel_deposit.png";
                        filepath = "/media/executive_automotive_northeast.distz";
                        filetype = "video";
                        firstName = "Dejuan";
                        fullName = "Mrs. Jose Franey";
                        gender = "Trans female";
                        job = "Direct Accountability Liaison";
                        json = "{key: 88901, key1: null, key2: \"string\"}";
                        key = "<key>";
                        lastName = "Metz";
                        latitude = "68.2232";
                        locale = "uk";
                        longitude = "-42.1384";
                        mac = "a2:42:a1:bf:6e:19";
                        manufacturer = "Aston Martin";
                        material = "Concrete";
                        middleName = "Finley";
                        model = "Escalade";
                        password = "_QiNrTzqbDz8AXY";
                        phone = "469-402-6116";
                        pin = "9497";
                        postalCode = "64696";
                        price = "25.00";
                        product = "Recycled Granite Pants";
                        sex = "male";
                        street = "Lura Wells";
                        timezone = "Africa/Nairobi";
                        unit = "degree Celsius";
                        url = "https://crooked-dulcimer.name";
                        username = "Mable76";
                        uuid = "16b919d6-51cd-4e97-81e2-5221b7b6969f";
                    }};
                    simpleObject = new SimpleObject("any", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000000001Z"), Enum.ONE, 1.1f, 1L, 1, Int32Enum.FIFTY_FIVE, IntEnum.Second, 1.1d, "test"){{
                        bigint = 8821239038968084L;
                        bigintStr = "9223372036854775808";
                        boolOpt = true;
                        decimal = 3.141592653589793d;
                        decimalStr = "3.14159265358979344719667586";
                        intOptNull = 809796L;
                        numOptNull = 4812.91d;
                        strOpt = "testOptional";
                    }};
                }};
                bigintParameterOptional = 165468L;
                bigintStrParameterOptional = "string";
                decimalParameterOptional = 5944.32d;
                decimalStrParameterOptional = "string";
                optEnumParameter = OptEnumParameter.VALUE3;
            }};            

            UsageExamplePostResponse res = sdk.generation.usageExamplePost(req, new UsageExamplePostSecurity("YOUR_PASSWORD", "YOUR_USERNAME"){{
                password = "YOUR_PASSWORD";
                username = "YOUR_USERNAME";
            }});

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage -->