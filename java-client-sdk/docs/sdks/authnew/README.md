# authNew

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
                basicAuth = new AuthServiceRequestBodyBasicAuth("ipsam", "id");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("error", "temporibus") {{
                        expectedValue = "aut";
                        headerName = "quasi";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("reiciendis", "voluptatibus") {{
                        expectedValue = "laborum";
                        headerName = "quasi";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("praesentium", "voluptatibus") {{
                        expectedValue = "vero";
                        headerName = "nihil";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("voluptate", "cum") {{
                        expectedValue = "ipsa";
                        headerName = "omnis";
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
                basicAuth = new AuthServiceRequestBodyBasicAuth("perferendis", "doloremque");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("dicta", "corporis") {{
                        expectedValue = "ut";
                        headerName = "maiores";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("dicta", "harum") {{
                        expectedValue = "dolore";
                        headerName = "iusto";
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
                basicAuth = new AuthServiceRequestBodyBasicAuth("enim", "accusamus");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("ipsum", "quidem") {{
                        expectedValue = "repudiandae";
                        headerName = "quae";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("pariatur", "modi") {{
                        expectedValue = "molestias";
                        headerName = "excepturi";
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
                basicAuth = new AuthServiceRequestBodyBasicAuth("praesentium", "rem");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("sint", "veritatis") {{
                        expectedValue = "quasi";
                        headerName = "repudiandae";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("enim", "consequatur") {{
                        expectedValue = "itaque";
                        headerName = "incidunt";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("explicabo", "deserunt") {{
                        expectedValue = "est";
                        headerName = "quibusdam";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("labore", "modi") {{
                        expectedValue = "distinctio";
                        headerName = "quibusdam";
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
                basicAuth = new AuthServiceRequestBodyBasicAuth("qui", "aliquid");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("magni", "assumenda") {{
                        expectedValue = "quos";
                        headerName = "perferendis";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("fugit", "dolorum") {{
                        expectedValue = "ipsam";
                        headerName = "alias";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("facilis", "tempore") {{
                        expectedValue = "excepturi";
                        headerName = "tempora";
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
                basicAuth = new AuthServiceRequestBodyBasicAuth("labore", "delectus");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("sint", "aliquid") {{
                        expectedValue = "non";
                        headerName = "eligendi";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("sint", "officia") {{
                        expectedValue = "provident";
                        headerName = "necessitatibus";
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
                basicAuth = new AuthServiceRequestBodyBasicAuth("dolor", "debitis");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("in", "illum") {{
                        expectedValue = "dolorum";
                        headerName = "in";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("dicta", "magnam") {{
                        expectedValue = "maiores";
                        headerName = "rerum";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("ea", "aliquid") {{
                        expectedValue = "cumque";
                        headerName = "facere";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("non", "occaecati") {{
                        expectedValue = "laborum";
                        headerName = "accusamus";
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
                basicAuth = new AuthServiceRequestBodyBasicAuth("enim", "accusamus");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("nam", "id") {{
                        expectedValue = "quidem";
                        headerName = "provident";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("sapiente", "amet") {{
                        expectedValue = "blanditiis";
                        headerName = "deleniti";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("vel", "natus") {{
                        expectedValue = "deserunt";
                        headerName = "nisi";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("perferendis", "nihil") {{
                        expectedValue = "omnis";
                        headerName = "molestiae";
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
                basicAuth = new AuthServiceRequestBodyBasicAuth("magnam", "distinctio");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("suscipit", "natus") {{
                        expectedValue = "labore";
                        headerName = "labore";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("vero", "aspernatur") {{
                        expectedValue = "nobis";
                        headerName = "eum";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("et", "excepturi") {{
                        expectedValue = "architecto";
                        headerName = "magnam";
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
                basicAuth = new AuthServiceRequestBodyBasicAuth("ullam", "provident");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("mollitia", "reiciendis") {{
                        expectedValue = "sint";
                        headerName = "accusantium";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("eum", "dolor") {{
                        expectedValue = "mollitia";
                        headerName = "ad";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("nemo", "quasi") {{
                        expectedValue = "necessitatibus";
                        headerName = "odit";
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
                basicAuth = new AuthServiceRequestBodyBasicAuth("iure", "doloribus");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("deleniti", "facilis") {{
                        expectedValue = "eius";
                        headerName = "maxime";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("architecto", "repudiandae") {{
                        expectedValue = "in";
                        headerName = "architecto";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("nihil", "repellat") {{
                        expectedValue = "ullam";
                        headerName = "expedita";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("saepe", "pariatur") {{
                        expectedValue = "quibusdam";
                        headerName = "sed";
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

