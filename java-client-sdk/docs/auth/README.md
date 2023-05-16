# auth

## Overview

Endpoints for testing authentication.

### Available Operations

* [apiKeyAuth](#apikeyauth)
* [apiKeyAuthGlobal](#apikeyauthglobal)
* [basicAuth](#basicauth)
* [bearerAuth](#bearerauth)
* [oauth2Auth](#oauth2auth)
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

            ApiKeyAuthResponse res = sdk.auth.apiKeyAuth(new ApiKeyAuthSecurity("Token YOUR_API_KEY") {{
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
                .setSecurity(new Security() {{
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

            BasicAuthResponse res = sdk.auth.basicAuth(new BasicAuthSecurity("YOUR_PASSWORD", "YOUR_USERNAME") {{
                password = "YOUR_PASSWORD";
                username = "YOUR_USERNAME";
            }}, "quo", "sequi");

            if (res.user != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

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

            BearerAuthResponse res = sdk.auth.bearerAuth(new BearerAuthSecurity("YOUR_JWT") {{
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

            Oauth2AuthResponse res = sdk.auth.oauth2Auth(new Oauth2AuthSecurity("Bearer YOUR_OAUTH2_TOKEN") {{
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

            OpenIdConnectAuthResponse res = sdk.auth.openIdConnectAuth(new OpenIdConnectAuthSecurity("Bearer YOUR_OPENID_TOKEN") {{
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
