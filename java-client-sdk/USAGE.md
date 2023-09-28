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

            UsageExamplePostRequest req = new UsageExamplePostRequest(548814L, "provident", false, LocalDate.parse("2021-04-24"), OffsetDateTime.parse("2021-04-14T16:47:33.722Z"), 5448.83d, "illum", 4236.55d, UsageExamplePostEnumParameter.VALUE2, 0d, 6458.94f, 3843.82d, 437587L, 297534, "example 3") {{
                requestBody = new UsageExamplePostRequestBody() {{
                    fakerFormattedStrings = new FakerFormattedStrings() {{
                        addressFormat = "92347 Lehner Lights";
                        directoryFormat = "excepturi";
                        domainFormat = "nisi";
                        emailFormat = "Rocky.Bernier@hotmail.com";
                        filenameFormat = "deserunt";
                        filepathFormat = "perferendis";
                        imageFormat = "ipsam";
                        ipv4Format = "213.245.199.35";
                        ipv6Format = "ddf7:cc78:ca1b:a928:fc81:6742:cb73:9205";
                        jsonFormat = "{"foo":".Y5ZDxt`JB","bar":"Ita*&{_]_0","bike":35815,"a":75068,"b":60783,"name":32504,"prop":"$I[|z*]4\\0"}";
                        macFormat = "repellat";
                        passwordFormat = "mollitia";
                        phoneFormat = "(444) 526-1316 x6317";
                        timezoneFormat = "sequi";
                        unknownFormat = "tenetur";
                        urlFormat = "ipsam";
                        uuidFormat = "ad019da1-ffe7-48f0-97b0-074f15471b5e";
                        zipcodeFormat = "90265";
                    }};;
                    fakerStrings = new FakerStrings() {{
                        city = "Samanthaboro";
                        iban = "praesentium";
                        id = "8e1e91e4-50ad-42ab-9442-69802d502a94";
                        iPv4 = "180.188.73.246";
                        iPv6 = "63c9:69e9:a3ef:a77d:fb14:cd66:ae39:5efb";
                        account = "provident";
                        address = "655 Feeney Pines";
                        amount = "nisi";
                        avatar = "vel";
                        color = "natus";
                        comment = "omnis";
                        company = "Aufderhar - Kovacek";
                        country = "French Polynesia";
                        countryCode = "PL";
                        currency = "id";
                        datatype = "labore";
                        default_ = "labore";
                        description = "suscipit";
                        directory = "natus";
                        domainName = "nobis";
                        emailAddr = "eum";
                        extension = "vero";
                        filename = "aspernatur";
                        filepath = "architecto";
                        filetype = "magnam";
                        firstName = "Audrey";
                        fullName = "excepturi";
                        gender = "female";
                        job = "provident";
                        json = "{"foo":"V$]{]>I5t.","bar":9725,"bike":98404,"a":"9kRbJ**vAc","b":99884,"name":".uq$0PZ0,i","prop":"qlGU.F$'|a"}";
                        key = "ipsam";
                        lastName = "Kling";
                        latitude = "autem";
                        locale = "nam";
                        longitude = "eaque";
                        mac = "pariatur";
                        manufacturer = "nemo";
                        material = "voluptatibus";
                        middleName = "perferendis";
                        model = "fugiat";
                        password = "amet";
                        phone = "839-771-3540";
                        pin = "quis";
                        postalCode = "10174";
                        price = "dolor";
                        product = "vero";
                        sex = "female";
                        street = "967 Bartoletti Shore";
                        timezone = "consequuntur";
                        unit = "blanditiis";
                        url = "error";
                        username = "Amber.Mayert99";
                        uuid = "e49a8d9c-bf48-4633-b23f-9b77f3a41006";
                    }};;
                    simpleObject = new SimpleObject("odio", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00.000Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                        bigint = 696344L;
                        bigintStr = "voluptatibus";
                        boolOpt = true;
                        decimal = 3777.52d;
                        intOptNull = 999999L;
                        numOptNull = 1.1d;
                        strOpt = "optional example";
                    }};;
                }};;
                bigintParameterOptional = 617658L;
                bigintStrParameterOptional = "eos";
                decimalParameterOptional = 5424.99d;
                decimalStrParameterOptional = "sit";
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