# AuthNew
(*authNew*)

## Overview

Endpoints for testing authentication.

### Available Operations

* [apiKeyAuthGlobalNew](#apikeyauthglobalnew)
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

## apiKeyAuthGlobalNew

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ApiKeyAuthGlobalNewResponse;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.AuthServiceRequestBodyBasicAuth;
import org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth;
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

            org.openapis.openapi.models.shared.AuthServiceRequestBody req = new AuthServiceRequestBody() {{
                basicAuth = new AuthServiceRequestBodyBasicAuth("velit", "culpa");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("totam", "fugiat") {{
                        expectedValue = "est";
                        headerName = "recusandae";
                    }}),
                }};
            }};            

            ApiKeyAuthGlobalNewResponse res = sdk.authNew.apiKeyAuthGlobalNew(req);

            if (res.statusCode == 200) {
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
| `request`                                                                                                  | [org.openapis.openapi.models.shared.AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |
| `serverURL`                                                                                                | *String*                                                                                                   | :heavy_minus_sign:                                                                                         | An optional server URL to use.                                                                             |


### Response

**[org.openapis.openapi.models.operations.ApiKeyAuthGlobalNewResponse](../../models/operations/ApiKeyAuthGlobalNewResponse.md)**


## authGlobal

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.AuthGlobalResponse;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.AuthServiceRequestBodyBasicAuth;
import org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth;
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

            org.openapis.openapi.models.shared.AuthServiceRequestBody req = new AuthServiceRequestBody() {{
                basicAuth = new AuthServiceRequestBodyBasicAuth("vel", "ducimus");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("labore", "possimus") {{
                        expectedValue = "quos";
                        headerName = "vel";
                    }}),
                }};
            }};            

            AuthGlobalResponse res = sdk.authNew.authGlobal(req);

            if (res.statusCode == 200) {
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
| `request`                                                                                                  | [org.openapis.openapi.models.shared.AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |
| `serverURL`                                                                                                | *String*                                                                                                   | :heavy_minus_sign:                                                                                         | An optional server URL to use.                                                                             |


### Response

**[org.openapis.openapi.models.operations.AuthGlobalResponse](../../models/operations/AuthGlobalResponse.md)**


## basicAuthNew

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.BasicAuthNewResponse;
import org.openapis.openapi.models.operations.BasicAuthNewSecurity;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.AuthServiceRequestBodyBasicAuth;
import org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.AuthServiceRequestBody req = new AuthServiceRequestBody() {{
                basicAuth = new AuthServiceRequestBodyBasicAuth("facilis", "cum");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("corporis", "reiciendis") {{
                        expectedValue = "commodi";
                        headerName = "in";
                    }}),
                }};
            }};            

            BasicAuthNewResponse res = sdk.authNew.basicAuthNew(req, new BasicAuthNewSecurity("YOUR_PASSWORD", "YOUR_USERNAME") {{
                password = "YOUR_PASSWORD";
                username = "YOUR_USERNAME";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
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

**[org.openapis.openapi.models.operations.BasicAuthNewResponse](../../models/operations/BasicAuthNewResponse.md)**


## multipleMixedOptionsAuth

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.MultipleMixedOptionsAuthResponse;
import org.openapis.openapi.models.operations.MultipleMixedOptionsAuthSecurity;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.AuthServiceRequestBodyBasicAuth;
import org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth;
import org.openapis.openapi.models.shared.SchemeBasicAuth;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.AuthServiceRequestBody req = new AuthServiceRequestBody() {{
                basicAuth = new AuthServiceRequestBodyBasicAuth("assumenda", "nemo");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("aperiam", "cum") {{
                        expectedValue = "recusandae";
                        headerName = "aliquid";
                    }}),
                }};
            }};            

            MultipleMixedOptionsAuthResponse res = sdk.authNew.multipleMixedOptionsAuth(req, new MultipleMixedOptionsAuthSecurity() {{
                apiKeyAuthNew = "Token <YOUR_API_KEY>";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
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

**[org.openapis.openapi.models.operations.MultipleMixedOptionsAuthResponse](../../models/operations/MultipleMixedOptionsAuthResponse.md)**


## multipleMixedSchemeAuth

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.MultipleMixedSchemeAuthResponse;
import org.openapis.openapi.models.operations.MultipleMixedSchemeAuthSecurity;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.AuthServiceRequestBodyBasicAuth;
import org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth;
import org.openapis.openapi.models.shared.SchemeBasicAuth;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.AuthServiceRequestBody req = new AuthServiceRequestBody() {{
                basicAuth = new AuthServiceRequestBodyBasicAuth("consectetur", "in");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("facere", "numquam") {{
                        expectedValue = "exercitationem";
                        headerName = "earum";
                    }}),
                }};
            }};            

            MultipleMixedSchemeAuthResponse res = sdk.authNew.multipleMixedSchemeAuth(req, new MultipleMixedSchemeAuthSecurity("Token <YOUR_API_KEY>",                 new SchemeBasicAuth("YOUR_PASSWORD", "YOUR_USERNAME");) {{
                apiKeyAuthNew = "Token <YOUR_API_KEY>";
                basicAuth = new SchemeBasicAuth("YOUR_PASSWORD", "YOUR_USERNAME") {{
                    password = "YOUR_PASSWORD";
                    username = "YOUR_USERNAME";
                }};
            }});

            if (res.statusCode == 200) {
                // handle response
            }
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

**[org.openapis.openapi.models.operations.MultipleMixedSchemeAuthResponse](../../models/operations/MultipleMixedSchemeAuthResponse.md)**


## multipleOptionsWithMixedSchemesAuth

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.MultipleOptionsWithMixedSchemesAuthResponse;
import org.openapis.openapi.models.operations.MultipleOptionsWithMixedSchemesAuthSecurity;
import org.openapis.openapi.models.operations.MultipleOptionsWithMixedSchemesAuthSecurityOption1;
import org.openapis.openapi.models.operations.MultipleOptionsWithMixedSchemesAuthSecurityOption2;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.AuthServiceRequestBodyBasicAuth;
import org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth;
import org.openapis.openapi.models.shared.SchemeBasicAuth;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.AuthServiceRequestBody req = new AuthServiceRequestBody() {{
                basicAuth = new AuthServiceRequestBodyBasicAuth("doloribus", "suscipit");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("saepe", "necessitatibus") {{
                        expectedValue = "reiciendis";
                        headerName = "quidem";
                    }}),
                }};
            }};            

            MultipleOptionsWithMixedSchemesAuthResponse res = sdk.authNew.multipleOptionsWithMixedSchemesAuth(req, new MultipleOptionsWithMixedSchemesAuthSecurity() {{
                option1 = new MultipleOptionsWithMixedSchemesAuthSecurityOption1("Token <YOUR_API_KEY>", "Bearer YOUR_OAUTH2_TOKEN") {{
                    apiKeyAuthNew = "Token <YOUR_API_KEY>";
                    oauth2 = "Bearer YOUR_OAUTH2_TOKEN";
                }};
            }});

            if (res.statusCode == 200) {
                // handle response
            }
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

**[org.openapis.openapi.models.operations.MultipleOptionsWithMixedSchemesAuthResponse](../../models/operations/MultipleOptionsWithMixedSchemesAuthResponse.md)**


## multipleOptionsWithSimpleSchemesAuth

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.MultipleOptionsWithSimpleSchemesAuthResponse;
import org.openapis.openapi.models.operations.MultipleOptionsWithSimpleSchemesAuthSecurity;
import org.openapis.openapi.models.operations.MultipleOptionsWithSimpleSchemesAuthSecurityOption1;
import org.openapis.openapi.models.operations.MultipleOptionsWithSimpleSchemesAuthSecurityOption2;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.AuthServiceRequestBodyBasicAuth;
import org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.AuthServiceRequestBody req = new AuthServiceRequestBody() {{
                basicAuth = new AuthServiceRequestBodyBasicAuth("dolore", "sunt");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("non", "amet") {{
                        expectedValue = "asperiores";
                        headerName = "adipisci";
                    }}),
                }};
            }};            

            MultipleOptionsWithSimpleSchemesAuthResponse res = sdk.authNew.multipleOptionsWithSimpleSchemesAuth(req, new MultipleOptionsWithSimpleSchemesAuthSecurity() {{
                option1 = new MultipleOptionsWithSimpleSchemesAuthSecurityOption1("Token <YOUR_API_KEY>", "Bearer YOUR_OAUTH2_TOKEN") {{
                    apiKeyAuthNew = "Token <YOUR_API_KEY>";
                    oauth2 = "Bearer YOUR_OAUTH2_TOKEN";
                }};
            }});

            if (res.statusCode == 200) {
                // handle response
            }
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

**[org.openapis.openapi.models.operations.MultipleOptionsWithSimpleSchemesAuthResponse](../../models/operations/MultipleOptionsWithSimpleSchemesAuthResponse.md)**


## multipleSimpleOptionsAuth

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.MultipleSimpleOptionsAuthResponse;
import org.openapis.openapi.models.operations.MultipleSimpleOptionsAuthSecurity;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.AuthServiceRequestBodyBasicAuth;
import org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.AuthServiceRequestBody req = new AuthServiceRequestBody() {{
                basicAuth = new AuthServiceRequestBodyBasicAuth("beatae", "dignissimos");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("consectetur", "corporis") {{
                        expectedValue = "a";
                        headerName = "debitis";
                    }}),
                }};
            }};            

            MultipleSimpleOptionsAuthResponse res = sdk.authNew.multipleSimpleOptionsAuth(req, new MultipleSimpleOptionsAuthSecurity() {{
                apiKeyAuthNew = "Token <YOUR_API_KEY>";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
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

**[org.openapis.openapi.models.operations.MultipleSimpleOptionsAuthResponse](../../models/operations/MultipleSimpleOptionsAuthResponse.md)**


## multipleSimpleSchemeAuth

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.MultipleSimpleSchemeAuthResponse;
import org.openapis.openapi.models.operations.MultipleSimpleSchemeAuthSecurity;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.AuthServiceRequestBodyBasicAuth;
import org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.AuthServiceRequestBody req = new AuthServiceRequestBody() {{
                basicAuth = new AuthServiceRequestBodyBasicAuth("harum", "laboriosam");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("libero", "vitae") {{
                        expectedValue = "ipsa";
                        headerName = "voluptates";
                    }}),
                }};
            }};            

            MultipleSimpleSchemeAuthResponse res = sdk.authNew.multipleSimpleSchemeAuth(req, new MultipleSimpleSchemeAuthSecurity("Token <YOUR_API_KEY>", "Bearer YOUR_OAUTH2_TOKEN") {{
                apiKeyAuthNew = "Token <YOUR_API_KEY>";
                oauth2 = "Bearer YOUR_OAUTH2_TOKEN";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
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

**[org.openapis.openapi.models.operations.MultipleSimpleSchemeAuthResponse](../../models/operations/MultipleSimpleSchemeAuthResponse.md)**


## oauth2AuthNew

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.Oauth2AuthNewResponse;
import org.openapis.openapi.models.operations.Oauth2AuthNewSecurity;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.AuthServiceRequestBodyBasicAuth;
import org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.AuthServiceRequestBody req = new AuthServiceRequestBody() {{
                basicAuth = new AuthServiceRequestBodyBasicAuth("accusamus", "similique");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("voluptas", "voluptas") {{
                        expectedValue = "tempora";
                        headerName = "aspernatur";
                    }}),
                }};
            }};            

            Oauth2AuthNewResponse res = sdk.authNew.oauth2AuthNew(req, new Oauth2AuthNewSecurity("Bearer YOUR_OAUTH2_TOKEN") {{
                oauth2 = "Bearer YOUR_OAUTH2_TOKEN";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [org.openapis.openapi.models.shared.AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md)       | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |
| `security`                                                                                                       | [org.openapis.openapi.models.operations.Oauth2AuthNewSecurity](../../models/operations/Oauth2AuthNewSecurity.md) | :heavy_check_mark:                                                                                               | The security requirements to use for the request.                                                                |
| `serverURL`                                                                                                      | *String*                                                                                                         | :heavy_minus_sign:                                                                                               | An optional server URL to use.                                                                                   |


### Response

**[org.openapis.openapi.models.operations.Oauth2AuthNewResponse](../../models/operations/Oauth2AuthNewResponse.md)**


## openIdConnectAuthNew

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.OpenIdConnectAuthNewResponse;
import org.openapis.openapi.models.operations.OpenIdConnectAuthNewSecurity;
import org.openapis.openapi.models.shared.AuthServiceRequestBody;
import org.openapis.openapi.models.shared.AuthServiceRequestBodyBasicAuth;
import org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.AuthServiceRequestBody req = new AuthServiceRequestBody() {{
                basicAuth = new AuthServiceRequestBodyBasicAuth("voluptas", "minima");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("adipisci", "minus") {{
                        expectedValue = "nobis";
                        headerName = "dolorum";
                    }}),
                }};
            }};            

            OpenIdConnectAuthNewResponse res = sdk.authNew.openIdConnectAuthNew(req, new OpenIdConnectAuthNewSecurity("Bearer YOUR_OPENID_TOKEN") {{
                openIdConnect = "Bearer YOUR_OPENID_TOKEN";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
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

**[org.openapis.openapi.models.operations.OpenIdConnectAuthNewResponse](../../models/operations/OpenIdConnectAuthNewResponse.md)**

