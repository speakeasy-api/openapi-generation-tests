# Auth
(*.auth*)

## Overview

Endpoints for testing authentication.

### Available Operations

* [apiKeyAuth](#apikeyauth)
* [apiKeyAuthGlobal](#apikeyauthglobal)
* [basicAuth](#basicauth)
* [bearerAuth](#bearerauth)
* [globalBearerAuth](#globalbearerauth)
* [oauth2Auth](#oauth2auth)
* [oauth2Override](#oauth2override)
* [openIdConnectAuth](#openidconnectauth)

## apiKeyAuth

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ApiKeyAuthResponse;
import org.openapis.openapi.models.operations.ApiKeyAuthSecurity;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            ApiKeyAuthResponse res = sdk.auth.apiKeyAuth(new ApiKeyAuthSecurity("Token YOUR_API_KEY"){{
                apiKeyAuth = "Token YOUR_API_KEY";
            }});

            if (res.token != null) {
                // handle response
            }
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

**[org.openapis.openapi.models.operations.ApiKeyAuthResponse](../../models/operations/ApiKeyAuthResponse.md)**


## apiKeyAuthGlobal

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ApiKeyAuthGlobalResponse;
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

            ApiKeyAuthGlobalResponse res = sdk.auth.apiKeyAuthGlobal();

            if (res.token != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[org.openapis.openapi.models.operations.ApiKeyAuthGlobalResponse](../../models/operations/ApiKeyAuthGlobalResponse.md)**


## basicAuth

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.BasicAuthRequest;
import org.openapis.openapi.models.operations.BasicAuthResponse;
import org.openapis.openapi.models.operations.BasicAuthSecurity;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            BasicAuthResponse res = sdk.auth.basicAuth(new BasicAuthSecurity("YOUR_PASSWORD", "YOUR_USERNAME"){{
                password = "YOUR_PASSWORD";
                username = "YOUR_USERNAME";
            }}, "string", "string");

            if (res.user != null) {
                // handle response
            }
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

**[org.openapis.openapi.models.operations.BasicAuthResponse](../../models/operations/BasicAuthResponse.md)**


## bearerAuth

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.BearerAuthResponse;
import org.openapis.openapi.models.operations.BearerAuthSecurity;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            BearerAuthResponse res = sdk.auth.bearerAuth(new BearerAuthSecurity("YOUR_JWT"){{
                bearerAuth = "YOUR_JWT";
            }});

            if (res.token != null) {
                // handle response
            }
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

**[org.openapis.openapi.models.operations.BearerAuthResponse](../../models/operations/BearerAuthResponse.md)**


## globalBearerAuth

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GlobalBearerAuthResponse;
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

            GlobalBearerAuthResponse res = sdk.auth.globalBearerAuth();

            if (res.token != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[org.openapis.openapi.models.operations.GlobalBearerAuthResponse](../../models/operations/GlobalBearerAuthResponse.md)**


## oauth2Auth

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.Oauth2AuthResponse;
import org.openapis.openapi.models.operations.Oauth2AuthSecurity;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            Oauth2AuthResponse res = sdk.auth.oauth2Auth(new Oauth2AuthSecurity("Bearer YOUR_OAUTH2_TOKEN"){{
                oauth2 = "Bearer YOUR_OAUTH2_TOKEN";
            }});

            if (res.token != null) {
                // handle response
            }
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

**[org.openapis.openapi.models.operations.Oauth2AuthResponse](../../models/operations/Oauth2AuthResponse.md)**


## oauth2Override

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.Oauth2OverrideRequest;
import org.openapis.openapi.models.operations.Oauth2OverrideResponse;
import org.openapis.openapi.models.operations.Oauth2OverrideSecurity;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            Oauth2OverrideResponse res = sdk.auth.oauth2Override(new Oauth2OverrideSecurity("Bearer YOUR_OAUTH2_TOKEN"){{
                oauth2 = "Bearer YOUR_OAUTH2_TOKEN";
            }});

            if (res.token != null) {
                // handle response
            }
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

**[org.openapis.openapi.models.operations.Oauth2OverrideResponse](../../models/operations/Oauth2OverrideResponse.md)**


## openIdConnectAuth

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.OpenIdConnectAuthResponse;
import org.openapis.openapi.models.operations.OpenIdConnectAuthSecurity;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            OpenIdConnectAuthResponse res = sdk.auth.openIdConnectAuth(new OpenIdConnectAuthSecurity("Bearer YOUR_OPENID_TOKEN"){{
                openIdConnect = "Bearer YOUR_OPENID_TOKEN";
            }});

            if (res.token != null) {
                // handle response
            }
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

**[org.openapis.openapi.models.operations.OpenIdConnectAuthResponse](../../models/operations/OpenIdConnectAuthResponse.md)**

