# Auth
(*auth()*)

## Overview

Endpoints for testing authentication.

### Available Operations

* [apiKeyAuth](#apikeyauth)
* [apiKeyAuthGlobal](#apikeyauthglobal)
* [basicAuth](#basicauth)
* [bearerAuth](#bearerauth)
* [globalBearerAuth](#globalbearerauth)
* [noAuth](#noauth)
* [oauth2Auth](#oauth2auth)
* [oauth2Override](#oauth2override)
* [openIdConnectAuth](#openidconnectauth)

## apiKeyAuth

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
import org.openapis.openapi.models.operations.ApiKeyAuthResponse;
import org.openapis.openapi.models.operations.ApiKeyAuthSecurity;
import org.openapis.openapi.models.shared.*;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            ApiKeyAuthResponse res = sdk.auth().apiKeyAuth()
                .security(ApiKeyAuthSecurity.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .call();

            if (res.token().isPresent()) {
                // handle response
            }
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
| `security`                                                                                                 | [org.openapis.openapi.models.operations.ApiKeyAuthSecurity](../../models/operations/ApiKeyAuthSecurity.md) | :heavy_check_mark:                                                                                         | The security requirements to use for the request.                                                          |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.ApiKeyAuthResponse>](../../models/operations/ApiKeyAuthResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## apiKeyAuthGlobal

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
import org.openapis.openapi.models.operations.ApiKeyAuthGlobalResponse;
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

            ApiKeyAuthGlobalResponse res = sdk.auth().apiKeyAuthGlobal()
                .call();

            if (res.token().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[Optional<? extends org.openapis.openapi.models.operations.ApiKeyAuthGlobalResponse>](../../models/operations/ApiKeyAuthGlobalResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## basicAuth

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
import org.openapis.openapi.models.operations.BasicAuthRequest;
import org.openapis.openapi.models.operations.BasicAuthResponse;
import org.openapis.openapi.models.operations.BasicAuthSecurity;
import org.openapis.openapi.models.shared.*;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            BasicAuthResponse res = sdk.auth().basicAuth()
                .security(BasicAuthSecurity.builder()
                    .password("YOUR_PASSWORD")
                    .username("YOUR_USERNAME")
                    .build())
                .passwd("<value>")
                .user("<value>")
                .call();

            if (res.user().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `security`                                                                                               | [org.openapis.openapi.models.operations.BasicAuthSecurity](../../models/operations/BasicAuthSecurity.md) | :heavy_check_mark:                                                                                       | The security requirements to use for the request.                                                        |
| `passwd`                                                                                                 | *String*                                                                                                 | :heavy_check_mark:                                                                                       | N/A                                                                                                      |
| `user`                                                                                                   | *String*                                                                                                 | :heavy_check_mark:                                                                                       | N/A                                                                                                      |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.BasicAuthResponse>](../../models/operations/BasicAuthResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## bearerAuth

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
import org.openapis.openapi.models.operations.BearerAuthResponse;
import org.openapis.openapi.models.operations.BearerAuthSecurity;
import org.openapis.openapi.models.shared.*;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            BearerAuthResponse res = sdk.auth().bearerAuth()
                .security(BearerAuthSecurity.builder()
                    .bearerAuth("YOUR_JWT")
                    .build())
                .call();

            if (res.token().isPresent()) {
                // handle response
            }
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
| `security`                                                                                                 | [org.openapis.openapi.models.operations.BearerAuthSecurity](../../models/operations/BearerAuthSecurity.md) | :heavy_check_mark:                                                                                         | The security requirements to use for the request.                                                          |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.BearerAuthResponse>](../../models/operations/BearerAuthResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## globalBearerAuth

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
import org.openapis.openapi.models.operations.GlobalBearerAuthResponse;
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

            GlobalBearerAuthResponse res = sdk.auth().globalBearerAuth()
                .call();

            if (res.token().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[Optional<? extends org.openapis.openapi.models.operations.GlobalBearerAuthResponse>](../../models/operations/GlobalBearerAuthResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## noAuth

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
import org.openapis.openapi.models.operations.NoAuthResponse;
import org.openapis.openapi.models.shared.*;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            NoAuthResponse res = sdk.auth().noAuth()
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

**[Optional<? extends org.openapis.openapi.models.operations.NoAuthResponse>](../../models/operations/NoAuthResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## oauth2Auth

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
import org.openapis.openapi.models.operations.Oauth2AuthResponse;
import org.openapis.openapi.models.operations.Oauth2AuthSecurity;
import org.openapis.openapi.models.shared.*;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            Oauth2AuthResponse res = sdk.auth().oauth2Auth()
                .security(Oauth2AuthSecurity.builder()
                    .oauth2("Bearer YOUR_OAUTH2_TOKEN")
                    .build())
                .call();

            if (res.token().isPresent()) {
                // handle response
            }
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
| `security`                                                                                                 | [org.openapis.openapi.models.operations.Oauth2AuthSecurity](../../models/operations/Oauth2AuthSecurity.md) | :heavy_check_mark:                                                                                         | The security requirements to use for the request.                                                          |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.Oauth2AuthResponse>](../../models/operations/Oauth2AuthResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## oauth2Override

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
import org.openapis.openapi.models.operations.Oauth2OverrideRequest;
import org.openapis.openapi.models.operations.Oauth2OverrideResponse;
import org.openapis.openapi.models.operations.Oauth2OverrideSecurity;
import org.openapis.openapi.models.shared.*;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            Oauth2OverrideResponse res = sdk.auth().oauth2Override()
                .security(Oauth2OverrideSecurity.builder()
                    .oauth2("Bearer YOUR_OAUTH2_TOKEN")
                    .build())
                .call();

            if (res.token().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `security`                                                                                                         | [org.openapis.openapi.models.operations.Oauth2OverrideSecurity](../../models/operations/Oauth2OverrideSecurity.md) | :heavy_check_mark:                                                                                                 | The security requirements to use for the request.                                                                  |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.Oauth2OverrideResponse>](../../models/operations/Oauth2OverrideResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## openIdConnectAuth

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
import org.openapis.openapi.models.operations.OpenIdConnectAuthResponse;
import org.openapis.openapi.models.operations.OpenIdConnectAuthSecurity;
import org.openapis.openapi.models.shared.*;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            OpenIdConnectAuthResponse res = sdk.auth().openIdConnectAuth()
                .security(OpenIdConnectAuthSecurity.builder()
                    .openIdConnect("Bearer YOUR_OPENID_TOKEN")
                    .build())
                .call();

            if (res.token().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `security`                                                                                                               | [org.openapis.openapi.models.operations.OpenIdConnectAuthSecurity](../../models/operations/OpenIdConnectAuthSecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


### Response

**[Optional<? extends org.openapis.openapi.models.operations.OpenIdConnectAuthResponse>](../../models/operations/OpenIdConnectAuthResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
