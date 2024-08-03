# SDKFirst
(*nest().first()*)

### Available Operations

* [get](#get)

## get

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            NestFirstGetResponse res = sdk.nest().first().get()
                .call();

            // handle response
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```


### Response

**[org.openapis.openapi.models.operations.NestFirstGetResponse](../../models/operations/NestFirstGetResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
