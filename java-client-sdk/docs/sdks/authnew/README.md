# AuthNew
(*authNew()*)

## Overview

Endpoints for testing authentication.

### Available Operations

* [authGlobal](#authglobal)
* [basicAuthNew](#basicauthnew)
* [multipleMixedOptionsAuth](#multiplemixedoptionsauth)
* [multipleMixedSchemeAuth](#multiplemixedschemeauth)
* [multipleOptionsWithMixedSchemesAuth](#multipleoptionswithmixedschemesauth)
* [multipleOptionsWithSimpleSchemesAuth](#multipleoptionswithsimpleschemesauth)
* [multipleSimpleOptionsAuth](#multiplesimpleoptionsauth)
* [multipleSimpleSchemeAuth](#multiplesimpleschemeauth)
* [oauth2AuthNew](#oauth2authnew)
* [openIdConnectAuthNew](#openidconnectauthnew)

## authGlobal

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
import org.openapis.openapi.models.operations.AuthGlobalResponse;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.BasicAuth;
import org.openapis.openapi.models.shared.HeaderAuth;
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

            AuthServiceRequestBody req = AuthServiceRequestBody.builder()
                .basicAuth(BasicAuth.builder()
                    .password("<value>")
                    .username("<value>")
                    .build())
                .headerAuth(java.util.List.of(
                    HeaderAuth.builder()
                        .expectedValue("<value>")
                        .headerName("<value>")
                        .build()))
                .build();

            AuthGlobalResponse res = sdk.authNew().authGlobal()
                .request(req)
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

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [org.openapis.openapi.models.shared.AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |
| `serverURL`                                                                                                | *String*                                                                                                   | :heavy_minus_sign:                                                                                         | An optional server URL to use.                                                                             |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.AuthGlobalResponse>](../../models/operations/AuthGlobalResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## basicAuthNew

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
import org.openapis.openapi.models.operations.BasicAuthNewResponse;
import org.openapis.openapi.models.operations.BasicAuthNewSecurity;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.BasicAuth;
import org.openapis.openapi.models.shared.HeaderAuth;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            AuthServiceRequestBody req = AuthServiceRequestBody.builder()
                .basicAuth(BasicAuth.builder()
                    .password("<value>")
                    .username("<value>")
                    .build())
                .headerAuth(java.util.List.of(
                    HeaderAuth.builder()
                        .expectedValue("<value>")
                        .headerName("<value>")
                        .build()))
                .build();

            BasicAuthNewResponse res = sdk.authNew().basicAuthNew()
                .request(req)
                .security(BasicAuthNewSecurity.builder()
                    .password("YOUR_PASSWORD")
                    .username("YOUR_USERNAME")
                    .build())
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

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [org.openapis.openapi.models.shared.AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md)     | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |
| `security`                                                                                                     | [org.openapis.openapi.models.operations.BasicAuthNewSecurity](../../models/operations/BasicAuthNewSecurity.md) | :heavy_check_mark:                                                                                             | The security requirements to use for the request.                                                              |
| `serverURL`                                                                                                    | *String*                                                                                                       | :heavy_minus_sign:                                                                                             | An optional server URL to use.                                                                                 |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.BasicAuthNewResponse>](../../models/operations/BasicAuthNewResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## multipleMixedOptionsAuth

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
import org.openapis.openapi.models.operations.MultipleMixedOptionsAuthResponse;
import org.openapis.openapi.models.operations.MultipleMixedOptionsAuthSecurity;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.BasicAuth;
import org.openapis.openapi.models.shared.HeaderAuth;
import org.openapis.openapi.models.shared.SchemeBasicAuth;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            AuthServiceRequestBody req = AuthServiceRequestBody.builder()
                .basicAuth(BasicAuth.builder()
                    .password("<value>")
                    .username("<value>")
                    .build())
                .headerAuth(java.util.List.of(
                    HeaderAuth.builder()
                        .expectedValue("<value>")
                        .headerName("<value>")
                        .build()))
                .build();

            MultipleMixedOptionsAuthResponse res = sdk.authNew().multipleMixedOptionsAuth()
                .request(req)
                .security(MultipleMixedOptionsAuthSecurity.builder()
                    .apiKeyAuthNew("Token <YOUR_API_KEY>")
                    .build())
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

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [org.openapis.openapi.models.shared.AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md)                             | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [org.openapis.openapi.models.operations.MultipleMixedOptionsAuthSecurity](../../models/operations/MultipleMixedOptionsAuthSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |
| `serverURL`                                                                                                                            | *String*                                                                                                                               | :heavy_minus_sign:                                                                                                                     | An optional server URL to use.                                                                                                         |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.MultipleMixedOptionsAuthResponse>](../../models/operations/MultipleMixedOptionsAuthResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## multipleMixedSchemeAuth

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
import org.openapis.openapi.models.operations.MultipleMixedSchemeAuthResponse;
import org.openapis.openapi.models.operations.MultipleMixedSchemeAuthSecurity;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.BasicAuth;
import org.openapis.openapi.models.shared.HeaderAuth;
import org.openapis.openapi.models.shared.SchemeBasicAuth;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            AuthServiceRequestBody req = AuthServiceRequestBody.builder()
                .basicAuth(BasicAuth.builder()
                    .password("<value>")
                    .username("<value>")
                    .build())
                .headerAuth(java.util.List.of(
                    HeaderAuth.builder()
                        .expectedValue("<value>")
                        .headerName("<value>")
                        .build()))
                .build();

            MultipleMixedSchemeAuthResponse res = sdk.authNew().multipleMixedSchemeAuth()
                .request(req)
                .security(MultipleMixedSchemeAuthSecurity.builder()
                    .apiKeyAuthNew("Token <YOUR_API_KEY>")
                    .basicAuth(SchemeBasicAuth.builder()
                        .password("YOUR_PASSWORD")
                        .username("YOUR_USERNAME")
                        .build())
                    .build())
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

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [org.openapis.openapi.models.shared.AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md)                           | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |
| `security`                                                                                                                           | [org.openapis.openapi.models.operations.MultipleMixedSchemeAuthSecurity](../../models/operations/MultipleMixedSchemeAuthSecurity.md) | :heavy_check_mark:                                                                                                                   | The security requirements to use for the request.                                                                                    |
| `serverURL`                                                                                                                          | *String*                                                                                                                             | :heavy_minus_sign:                                                                                                                   | An optional server URL to use.                                                                                                       |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.MultipleMixedSchemeAuthResponse>](../../models/operations/MultipleMixedSchemeAuthResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## multipleOptionsWithMixedSchemesAuth

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
import org.openapis.openapi.models.operations.MultipleOptionsWithMixedSchemesAuthResponse;
import org.openapis.openapi.models.operations.MultipleOptionsWithMixedSchemesAuthSecurity;
import org.openapis.openapi.models.operations.MultipleOptionsWithMixedSchemesAuthSecurityOption1;
import org.openapis.openapi.models.operations.MultipleOptionsWithMixedSchemesAuthSecurityOption2;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.BasicAuth;
import org.openapis.openapi.models.shared.HeaderAuth;
import org.openapis.openapi.models.shared.SchemeBasicAuth;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            AuthServiceRequestBody req = AuthServiceRequestBody.builder()
                .basicAuth(BasicAuth.builder()
                    .password("<value>")
                    .username("<value>")
                    .build())
                .headerAuth(java.util.List.of(
                    HeaderAuth.builder()
                        .expectedValue("<value>")
                        .headerName("<value>")
                        .build()))
                .build();

            MultipleOptionsWithMixedSchemesAuthResponse res = sdk.authNew().multipleOptionsWithMixedSchemesAuth()
                .request(req)
                .security(MultipleOptionsWithMixedSchemesAuthSecurity.builder()
                    .option1(MultipleOptionsWithMixedSchemesAuthSecurityOption1.builder()
                        .apiKeyAuthNew("Token <YOUR_API_KEY>")
                        .oauth2("Bearer YOUR_OAUTH2_TOKEN")
                        .build())
                    .build())
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

### Parameters

| Parameter                                                                                                                                                    | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                    | [org.openapis.openapi.models.shared.AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md)                                                   | :heavy_check_mark:                                                                                                                                           | The request object to use for the request.                                                                                                                   |
| `security`                                                                                                                                                   | [org.openapis.openapi.models.operations.MultipleOptionsWithMixedSchemesAuthSecurity](../../models/operations/MultipleOptionsWithMixedSchemesAuthSecurity.md) | :heavy_check_mark:                                                                                                                                           | The security requirements to use for the request.                                                                                                            |
| `serverURL`                                                                                                                                                  | *String*                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                           | An optional server URL to use.                                                                                                                               |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.MultipleOptionsWithMixedSchemesAuthResponse>](../../models/operations/MultipleOptionsWithMixedSchemesAuthResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## multipleOptionsWithSimpleSchemesAuth

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
import org.openapis.openapi.models.operations.MultipleOptionsWithSimpleSchemesAuthResponse;
import org.openapis.openapi.models.operations.MultipleOptionsWithSimpleSchemesAuthSecurity;
import org.openapis.openapi.models.operations.MultipleOptionsWithSimpleSchemesAuthSecurityOption1;
import org.openapis.openapi.models.operations.MultipleOptionsWithSimpleSchemesAuthSecurityOption2;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.BasicAuth;
import org.openapis.openapi.models.shared.HeaderAuth;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            AuthServiceRequestBody req = AuthServiceRequestBody.builder()
                .basicAuth(BasicAuth.builder()
                    .password("<value>")
                    .username("<value>")
                    .build())
                .headerAuth(java.util.List.of(
                    HeaderAuth.builder()
                        .expectedValue("<value>")
                        .headerName("<value>")
                        .build()))
                .build();

            MultipleOptionsWithSimpleSchemesAuthResponse res = sdk.authNew().multipleOptionsWithSimpleSchemesAuth()
                .request(req)
                .security(MultipleOptionsWithSimpleSchemesAuthSecurity.builder()
                    .option1(MultipleOptionsWithSimpleSchemesAuthSecurityOption1.builder()
                        .apiKeyAuthNew("Token <YOUR_API_KEY>")
                        .oauth2("Bearer YOUR_OAUTH2_TOKEN")
                        .build())
                    .build())
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

### Parameters

| Parameter                                                                                                                                                      | Type                                                                                                                                                           | Required                                                                                                                                                       | Description                                                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                      | [org.openapis.openapi.models.shared.AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md)                                                     | :heavy_check_mark:                                                                                                                                             | The request object to use for the request.                                                                                                                     |
| `security`                                                                                                                                                     | [org.openapis.openapi.models.operations.MultipleOptionsWithSimpleSchemesAuthSecurity](../../models/operations/MultipleOptionsWithSimpleSchemesAuthSecurity.md) | :heavy_check_mark:                                                                                                                                             | The security requirements to use for the request.                                                                                                              |
| `serverURL`                                                                                                                                                    | *String*                                                                                                                                                       | :heavy_minus_sign:                                                                                                                                             | An optional server URL to use.                                                                                                                                 |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.MultipleOptionsWithSimpleSchemesAuthResponse>](../../models/operations/MultipleOptionsWithSimpleSchemesAuthResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## multipleSimpleOptionsAuth

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
import org.openapis.openapi.models.operations.MultipleSimpleOptionsAuthResponse;
import org.openapis.openapi.models.operations.MultipleSimpleOptionsAuthSecurity;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.BasicAuth;
import org.openapis.openapi.models.shared.HeaderAuth;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            AuthServiceRequestBody req = AuthServiceRequestBody.builder()
                .basicAuth(BasicAuth.builder()
                    .password("<value>")
                    .username("<value>")
                    .build())
                .headerAuth(java.util.List.of(
                    HeaderAuth.builder()
                        .expectedValue("<value>")
                        .headerName("<value>")
                        .build()))
                .build();

            MultipleSimpleOptionsAuthResponse res = sdk.authNew().multipleSimpleOptionsAuth()
                .request(req)
                .security(MultipleSimpleOptionsAuthSecurity.builder()
                    .apiKeyAuthNew("Token <YOUR_API_KEY>")
                    .build())
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

### Parameters

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [org.openapis.openapi.models.shared.AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md)                               | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |
| `security`                                                                                                                               | [org.openapis.openapi.models.operations.MultipleSimpleOptionsAuthSecurity](../../models/operations/MultipleSimpleOptionsAuthSecurity.md) | :heavy_check_mark:                                                                                                                       | The security requirements to use for the request.                                                                                        |
| `serverURL`                                                                                                                              | *String*                                                                                                                                 | :heavy_minus_sign:                                                                                                                       | An optional server URL to use.                                                                                                           |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.MultipleSimpleOptionsAuthResponse>](../../models/operations/MultipleSimpleOptionsAuthResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## multipleSimpleSchemeAuth

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
import org.openapis.openapi.models.operations.MultipleSimpleSchemeAuthResponse;
import org.openapis.openapi.models.operations.MultipleSimpleSchemeAuthSecurity;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.BasicAuth;
import org.openapis.openapi.models.shared.HeaderAuth;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            AuthServiceRequestBody req = AuthServiceRequestBody.builder()
                .basicAuth(BasicAuth.builder()
                    .password("<value>")
                    .username("<value>")
                    .build())
                .headerAuth(java.util.List.of(
                    HeaderAuth.builder()
                        .expectedValue("<value>")
                        .headerName("<value>")
                        .build()))
                .build();

            MultipleSimpleSchemeAuthResponse res = sdk.authNew().multipleSimpleSchemeAuth()
                .request(req)
                .security(MultipleSimpleSchemeAuthSecurity.builder()
                    .apiKeyAuthNew("Token <YOUR_API_KEY>")
                    .oauth2("Bearer YOUR_OAUTH2_TOKEN")
                    .build())
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

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [org.openapis.openapi.models.shared.AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md)                             | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [org.openapis.openapi.models.operations.MultipleSimpleSchemeAuthSecurity](../../models/operations/MultipleSimpleSchemeAuthSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |
| `serverURL`                                                                                                                            | *String*                                                                                                                               | :heavy_minus_sign:                                                                                                                     | An optional server URL to use.                                                                                                         |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.MultipleSimpleSchemeAuthResponse>](../../models/operations/MultipleSimpleSchemeAuthResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## oauth2AuthNew

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
import org.openapis.openapi.models.operations.Oauth2AuthNewResponse;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.BasicAuth;
import org.openapis.openapi.models.shared.HeaderAuth;
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

            AuthServiceRequestBody req = AuthServiceRequestBody.builder()
                .basicAuth(BasicAuth.builder()
                    .password("<value>")
                    .username("<value>")
                    .build())
                .headerAuth(java.util.List.of(
                    HeaderAuth.builder()
                        .expectedValue("<value>")
                        .headerName("<value>")
                        .build()))
                .build();

            Oauth2AuthNewResponse res = sdk.authNew().oauth2AuthNew()
                .request(req)
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

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [org.openapis.openapi.models.shared.AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |
| `serverURL`                                                                                                | *String*                                                                                                   | :heavy_minus_sign:                                                                                         | An optional server URL to use.                                                                             |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.Oauth2AuthNewResponse>](../../models/operations/Oauth2AuthNewResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## openIdConnectAuthNew

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
import org.openapis.openapi.models.operations.OpenIdConnectAuthNewResponse;
import org.openapis.openapi.models.operations.OpenIdConnectAuthNewSecurity;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.BasicAuth;
import org.openapis.openapi.models.shared.HeaderAuth;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            AuthServiceRequestBody req = AuthServiceRequestBody.builder()
                .basicAuth(BasicAuth.builder()
                    .password("<value>")
                    .username("<value>")
                    .build())
                .headerAuth(java.util.List.of(
                    HeaderAuth.builder()
                        .expectedValue("<value>")
                        .headerName("<value>")
                        .build()))
                .build();

            OpenIdConnectAuthNewResponse res = sdk.authNew().openIdConnectAuthNew()
                .request(req)
                .security(OpenIdConnectAuthNewSecurity.builder()
                    .openIdConnect("Bearer YOUR_OPENID_TOKEN")
                    .build())
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

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [org.openapis.openapi.models.shared.AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md)                     | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [org.openapis.openapi.models.operations.OpenIdConnectAuthNewSecurity](../../models/operations/OpenIdConnectAuthNewSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |
| `serverURL`                                                                                                                    | *String*                                                                                                                       | :heavy_minus_sign:                                                                                                             | An optional server URL to use.                                                                                                 |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.OpenIdConnectAuthNewResponse>](../../models/operations/OpenIdConnectAuthNewResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
