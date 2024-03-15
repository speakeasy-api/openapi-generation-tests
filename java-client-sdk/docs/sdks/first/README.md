# First
(*first()*)

### Available Operations

* [get](#get)

## get

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.operations.GroupFirstGetResponse;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Security;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            GroupFirstGetResponse res = sdk.first().get()
                .call();

            // handle response
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[Optional<? extends org.openapis.openapi.models.operations.GroupFirstGetResponse>](../../models/operations/GroupFirstGetResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
