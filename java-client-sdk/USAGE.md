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