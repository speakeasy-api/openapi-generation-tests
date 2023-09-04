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

            UsageExamplePostRequest req = new UsageExamplePostRequest(111111L, false, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), 1.1d, 2.2222222d, UsageExamplePostEnumParameter.VALUE3, 0d, 1.1f, 1.1d, 111111L, 1, "example 2") {{
                requestBody = new UsageExamplePostRequestBody() {{
                    email = "Micheal_Sporer@yahoo.com";
                    formatEmail = "Roselyn_Kassulke@yahoo.com";
                    formatUri = "http://innocent-effect.org";
                    formatUuid = "0f467cc8-796e-4d15-9a05-dfc2ddf7cc78";
                    hostname = "soulful-poppy.com";
                    ipv4 = "184.163.148.36";
                    ipv6 = "8fc8:1674:2cb7:3920:5929:396f:ea75:96eb";
                    simpleObject = new SimpleObject("architecto", true, LocalDate.parse("2020-01-01"), OffsetDateTime.parse("2020-01-01T00:00:00Z"), Enum.TWO, 2.2222222f, 999999L, 1, SimpleObjectInt32Enum.FIFTY_FIVE, SimpleObjectIntEnum.Third, 1.1d, "example") {{
                        bigint = 666767L;
                        bigintStr = "mollitia";
                        boolOpt = true;
                        decimal = 6706.38d;
                        intOptNull = 999999L;
                        numOptNull = 1.1d;
                        strOpt = "optional example";
                    }};;
                    unknown = "dolores";
                    uri = "http://growing-cappelletti.net";
                    uuid = "5955907a-ff1a-43a2-ba94-67739251aa52";
                }};;
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