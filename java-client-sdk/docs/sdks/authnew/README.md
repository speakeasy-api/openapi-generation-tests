# authNew

## Overview

Endpoints for testing authentication.

### Available Operations

* [apiKeyAuthGlobalNew](#apikeyauthglobalnew)
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
                basicAuth = new AuthServiceRequestBodyBasicAuth("tenetur", "ipsam");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("quasi", "error") {{
                        expectedValue = "possimus";
                        headerName = "aut";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("quasi", "reiciendis") {{
                        expectedValue = "temporibus";
                        headerName = "laborum";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("nihil", "praesentium") {{
                        expectedValue = "voluptatibus";
                        headerName = "vero";
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
                basicAuth = new AuthServiceRequestBodyBasicAuth("voluptatibus", "ipsa");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("perferendis", "doloremque") {{
                        expectedValue = "voluptate";
                        headerName = "cum";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("maiores", "dicta") {{
                        expectedValue = "reprehenderit";
                        headerName = "ut";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("iusto", "dicta") {{
                        expectedValue = "corporis";
                        headerName = "dolore";
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
                basicAuth = new AuthServiceRequestBodyBasicAuth("harum", "enim");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("quae", "ipsum") {{
                        expectedValue = "commodi";
                        headerName = "repudiandae";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("excepturi", "pariatur") {{
                        expectedValue = "quidem";
                        headerName = "molestias";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("rem", "voluptates") {{
                        expectedValue = "modi";
                        headerName = "praesentium";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("sint", "veritatis") {{
                        expectedValue = "quasi";
                        headerName = "repudiandae";
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
                basicAuth = new AuthServiceRequestBodyBasicAuth("itaque", "incidunt");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("quibusdam", "explicabo") {{
                        expectedValue = "consequatur";
                        headerName = "est";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("quibusdam", "labore") {{
                        expectedValue = "deserunt";
                        headerName = "distinctio";
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
                basicAuth = new AuthServiceRequestBodyBasicAuth("modi", "qui");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("perferendis", "magni") {{
                        expectedValue = "cupiditate";
                        headerName = "quos";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("alias", "fugit") {{
                        expectedValue = "assumenda";
                        headerName = "ipsam";
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
                basicAuth = new AuthServiceRequestBodyBasicAuth("dolorum", "excepturi");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("labore", "delectus") {{
                        expectedValue = "facilis";
                        headerName = "tempore";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("eligendi", "sint") {{
                        expectedValue = "eum";
                        headerName = "non";
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
                basicAuth = new AuthServiceRequestBodyBasicAuth("aliquid", "provident");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("dolor", "debitis") {{
                        expectedValue = "sint";
                        headerName = "officia";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("in", "in") {{
                        expectedValue = "a";
                        headerName = "dolorum";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("rerum", "dicta") {{
                        expectedValue = "illum";
                        headerName = "maiores";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("facere", "ea") {{
                        expectedValue = "magnam";
                        headerName = "cumque";
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
                basicAuth = new AuthServiceRequestBodyBasicAuth("aliquid", "laborum");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("enim", "accusamus") {{
                        expectedValue = "non";
                        headerName = "occaecati";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("provident", "nam") {{
                        expectedValue = "delectus";
                        headerName = "quidem";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("deleniti", "sapiente") {{
                        expectedValue = "id";
                        headerName = "blanditiis";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("nisi", "vel") {{
                        expectedValue = "amet";
                        headerName = "deserunt";
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
                basicAuth = new AuthServiceRequestBodyBasicAuth("natus", "omnis");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("magnam", "distinctio") {{
                        expectedValue = "perferendis";
                        headerName = "nihil";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("labore", "suscipit") {{
                        expectedValue = "id";
                        headerName = "labore";
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
                basicAuth = new AuthServiceRequestBodyBasicAuth("natus", "nobis");;
                headerAuth = new org.openapis.openapi.models.shared.AuthServiceRequestBodyHeaderAuth[]{{
                    add(new AuthServiceRequestBodyHeaderAuth("architecto", "magnam") {{
                        expectedValue = "vero";
                        headerName = "aspernatur";
                    }}),
                    add(new AuthServiceRequestBodyHeaderAuth("ullam", "provident") {{
                        expectedValue = "et";
                        headerName = "excepturi";
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

