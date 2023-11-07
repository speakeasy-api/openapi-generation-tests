# AuthNew
(*.AuthNew*)

## Overview

Endpoints for testing authentication.

### Available Operations

* [ApiKeyAuthGlobalNew](#apikeyauthglobalnew)
* [AuthGlobal](#authglobal)
* [BasicAuthNew](#basicauthnew)
* [MultipleMixedOptionsAuth](#multiplemixedoptionsauth)
* [MultipleMixedSchemeAuth](#multiplemixedschemeauth)
* [MultipleOptionsWithMixedSchemesAuth](#multipleoptionswithmixedschemesauth)
* [MultipleOptionsWithSimpleSchemesAuth](#multipleoptionswithsimpleschemesauth)
* [MultipleSimpleOptionsAuth](#multiplesimpleoptionsauth)
* [MultipleSimpleSchemeAuth](#multiplesimpleschemeauth)
* [Oauth2AuthNew](#oauth2authnew)
* [OpenIdConnectAuthNew](#openidconnectauthnew)

## ApiKeyAuthGlobalNew

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.AuthNew.ApiKeyAuthGlobalNewAsync(new AuthServiceRequestBody() {
    BasicAuth = new BasicAuth() {
        Password = "owsGgP4_AhRPMSJ",
        Username = "Devonte_Bins",
    },
    HeaderAuth = new List<HeaderAuth>() {
        new HeaderAuth() {
            ExpectedValue = "string",
            HeaderName = "string",
        },
    },
});

// handle response
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |
| `serverURL`                                                             | *string*                                                                | :heavy_minus_sign:                                                      | An optional server URL to use.                                          |


### Response

**[ApiKeyAuthGlobalNewResponse](../../models/operations/ApiKeyAuthGlobalNewResponse.md)**


## AuthGlobal

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.AuthNew.AuthGlobalAsync(new AuthServiceRequestBody() {
    BasicAuth = new BasicAuth() {
        Password = "xvJcf9GiJNr7T2x",
        Username = "Cory33",
    },
    HeaderAuth = new List<HeaderAuth>() {
        new HeaderAuth() {
            ExpectedValue = "string",
            HeaderName = "string",
        },
    },
});

// handle response
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |
| `serverURL`                                                             | *string*                                                                | :heavy_minus_sign:                                                      | An optional server URL to use.                                          |


### Response

**[AuthGlobalResponse](../../models/operations/AuthGlobalResponse.md)**


## BasicAuthNew

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.AuthNew.BasicAuthNewAsync(new BasicAuthNewSecurity() {
    Password = "YOUR_PASSWORD",
    Username = "YOUR_USERNAME",
}, new AuthServiceRequestBody() {
    BasicAuth = new BasicAuth() {
        Password = "Z2OStPksFyrcGeu",
        Username = "Ashton.Steuber27",
    },
    HeaderAuth = new List<HeaderAuth>() {
        new HeaderAuth() {
            ExpectedValue = "string",
            HeaderName = "string",
        },
    },
});

// handle response
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |
| `security`                                                              | [BasicAuthNewSecurity](../../models/operations/BasicAuthNewSecurity.md) | :heavy_check_mark:                                                      | The security requirements to use for the request.                       |
| `serverURL`                                                             | *string*                                                                | :heavy_minus_sign:                                                      | An optional server URL to use.                                          |


### Response

**[BasicAuthNewResponse](../../models/operations/BasicAuthNewResponse.md)**


## MultipleMixedOptionsAuth

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.AuthNew.MultipleMixedOptionsAuthAsync(new MultipleMixedOptionsAuthSecurity() {
    ApiKeyAuthNew = "Token <YOUR_API_KEY>",
}, new AuthServiceRequestBody() {
    BasicAuth = new BasicAuth() {
        Password = "Iq1JSzG1wqLDz4v",
        Username = "Ismael.Emmerich",
    },
    HeaderAuth = new List<HeaderAuth>() {
        new HeaderAuth() {
            ExpectedValue = "string",
            HeaderName = "string",
        },
    },
});

// handle response
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md)                         | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |
| `security`                                                                                      | [MultipleMixedOptionsAuthSecurity](../../models/operations/MultipleMixedOptionsAuthSecurity.md) | :heavy_check_mark:                                                                              | The security requirements to use for the request.                                               |
| `serverURL`                                                                                     | *string*                                                                                        | :heavy_minus_sign:                                                                              | An optional server URL to use.                                                                  |


### Response

**[MultipleMixedOptionsAuthResponse](../../models/operations/MultipleMixedOptionsAuthResponse.md)**


## MultipleMixedSchemeAuth

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.AuthNew.MultipleMixedSchemeAuthAsync(new MultipleMixedSchemeAuthSecurity() {
    ApiKeyAuthNew = "Token <YOUR_API_KEY>",
    BasicAuth = new SchemeBasicAuth() {
        Password = "YOUR_PASSWORD",
        Username = "YOUR_USERNAME",
    },
}, new AuthServiceRequestBody() {
    BasicAuth = new BasicAuth() {
        Password = "OcWVV5608IiaWJQ",
        Username = "Kameron42",
    },
    HeaderAuth = new List<HeaderAuth>() {
        new HeaderAuth() {
            ExpectedValue = "string",
            HeaderName = "string",
        },
    },
});

// handle response
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md)                       | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |
| `security`                                                                                    | [MultipleMixedSchemeAuthSecurity](../../models/operations/MultipleMixedSchemeAuthSecurity.md) | :heavy_check_mark:                                                                            | The security requirements to use for the request.                                             |
| `serverURL`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | An optional server URL to use.                                                                |


### Response

**[MultipleMixedSchemeAuthResponse](../../models/operations/MultipleMixedSchemeAuthResponse.md)**


## MultipleOptionsWithMixedSchemesAuth

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.AuthNew.MultipleOptionsWithMixedSchemesAuthAsync(new MultipleOptionsWithMixedSchemesAuthSecurity() {
    Option1 = new MultipleOptionsWithMixedSchemesAuthSecurityOption1() {
        ApiKeyAuthNew = "Token <YOUR_API_KEY>",
        Oauth2 = "Bearer YOUR_OAUTH2_TOKEN",
    },
}, new AuthServiceRequestBody() {
    BasicAuth = new BasicAuth() {
        Password = "fpwNE90MyqKIrXk",
        Username = "Caroline_Walsh",
    },
    HeaderAuth = new List<HeaderAuth>() {
        new HeaderAuth() {
            ExpectedValue = "string",
            HeaderName = "string",
        },
    },
});

// handle response
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md)                                               | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |
| `security`                                                                                                            | [MultipleOptionsWithMixedSchemesAuthSecurity](../../models/operations/MultipleOptionsWithMixedSchemesAuthSecurity.md) | :heavy_check_mark:                                                                                                    | The security requirements to use for the request.                                                                     |
| `serverURL`                                                                                                           | *string*                                                                                                              | :heavy_minus_sign:                                                                                                    | An optional server URL to use.                                                                                        |


### Response

**[MultipleOptionsWithMixedSchemesAuthResponse](../../models/operations/MultipleOptionsWithMixedSchemesAuthResponse.md)**


## MultipleOptionsWithSimpleSchemesAuth

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.AuthNew.MultipleOptionsWithSimpleSchemesAuthAsync(new MultipleOptionsWithSimpleSchemesAuthSecurity() {
    Option1 = new MultipleOptionsWithSimpleSchemesAuthSecurityOption1() {
        ApiKeyAuthNew = "Token <YOUR_API_KEY>",
        Oauth2 = "Bearer YOUR_OAUTH2_TOKEN",
    },
}, new AuthServiceRequestBody() {
    BasicAuth = new BasicAuth() {
        Password = "pibxDTiJSijK04Y",
        Username = "Selena76",
    },
    HeaderAuth = new List<HeaderAuth>() {
        new HeaderAuth() {
            ExpectedValue = "string",
            HeaderName = "string",
        },
    },
});

// handle response
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md)                                                 | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |
| `security`                                                                                                              | [MultipleOptionsWithSimpleSchemesAuthSecurity](../../models/operations/MultipleOptionsWithSimpleSchemesAuthSecurity.md) | :heavy_check_mark:                                                                                                      | The security requirements to use for the request.                                                                       |
| `serverURL`                                                                                                             | *string*                                                                                                                | :heavy_minus_sign:                                                                                                      | An optional server URL to use.                                                                                          |


### Response

**[MultipleOptionsWithSimpleSchemesAuthResponse](../../models/operations/MultipleOptionsWithSimpleSchemesAuthResponse.md)**


## MultipleSimpleOptionsAuth

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.AuthNew.MultipleSimpleOptionsAuthAsync(new MultipleSimpleOptionsAuthSecurity() {
    ApiKeyAuthNew = "Token <YOUR_API_KEY>",
}, new AuthServiceRequestBody() {
    BasicAuth = new BasicAuth() {
        Password = "pzdKQgSGZSrUGNs",
        Username = "Eryn51",
    },
    HeaderAuth = new List<HeaderAuth>() {
        new HeaderAuth() {
            ExpectedValue = "string",
            HeaderName = "string",
        },
    },
});

// handle response
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md)                           | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |
| `security`                                                                                        | [MultipleSimpleOptionsAuthSecurity](../../models/operations/MultipleSimpleOptionsAuthSecurity.md) | :heavy_check_mark:                                                                                | The security requirements to use for the request.                                                 |
| `serverURL`                                                                                       | *string*                                                                                          | :heavy_minus_sign:                                                                                | An optional server URL to use.                                                                    |


### Response

**[MultipleSimpleOptionsAuthResponse](../../models/operations/MultipleSimpleOptionsAuthResponse.md)**


## MultipleSimpleSchemeAuth

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.AuthNew.MultipleSimpleSchemeAuthAsync(new MultipleSimpleSchemeAuthSecurity() {
    ApiKeyAuthNew = "Token <YOUR_API_KEY>",
    Oauth2 = "Bearer YOUR_OAUTH2_TOKEN",
}, new AuthServiceRequestBody() {
    BasicAuth = new BasicAuth() {
        Password = "UrAsw466AAaYtr1",
        Username = "Kenya.Baumbach",
    },
    HeaderAuth = new List<HeaderAuth>() {
        new HeaderAuth() {
            ExpectedValue = "string",
            HeaderName = "string",
        },
    },
});

// handle response
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md)                         | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |
| `security`                                                                                      | [MultipleSimpleSchemeAuthSecurity](../../models/operations/MultipleSimpleSchemeAuthSecurity.md) | :heavy_check_mark:                                                                              | The security requirements to use for the request.                                               |
| `serverURL`                                                                                     | *string*                                                                                        | :heavy_minus_sign:                                                                              | An optional server URL to use.                                                                  |


### Response

**[MultipleSimpleSchemeAuthResponse](../../models/operations/MultipleSimpleSchemeAuthResponse.md)**


## Oauth2AuthNew

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.AuthNew.Oauth2AuthNewAsync(new Oauth2AuthNewSecurity() {
    Oauth2 = "Bearer YOUR_OAUTH2_TOKEN",
}, new AuthServiceRequestBody() {
    BasicAuth = new BasicAuth() {
        Password = "V02sHy2onRTMRgS",
        Username = "Polly.Aufderhar78",
    },
    HeaderAuth = new List<HeaderAuth>() {
        new HeaderAuth() {
            ExpectedValue = "string",
            HeaderName = "string",
        },
    },
});

// handle response
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md)   | :heavy_check_mark:                                                        | The request object to use for the request.                                |
| `security`                                                                | [Oauth2AuthNewSecurity](../../models/operations/Oauth2AuthNewSecurity.md) | :heavy_check_mark:                                                        | The security requirements to use for the request.                         |
| `serverURL`                                                               | *string*                                                                  | :heavy_minus_sign:                                                        | An optional server URL to use.                                            |


### Response

**[Oauth2AuthNewResponse](../../models/operations/Oauth2AuthNewResponse.md)**


## OpenIdConnectAuthNew

### Example Usage

```csharp
using Openapi;
using Openapi.Models.Shared;
using System.Collections.Generic;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.AuthNew.OpenIdConnectAuthNewAsync(new OpenIdConnectAuthNewSecurity() {
    OpenIdConnect = "Bearer YOUR_OPENID_TOKEN",
}, new AuthServiceRequestBody() {
    BasicAuth = new BasicAuth() {
        Password = "1_B3hNdr8HC3AeS",
        Username = "Floy_Heller",
    },
    HeaderAuth = new List<HeaderAuth>() {
        new HeaderAuth() {
            ExpectedValue = "string",
            HeaderName = "string",
        },
    },
});

// handle response
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [AuthServiceRequestBody](../../models/shared/AuthServiceRequestBody.md)                 | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |
| `security`                                                                              | [OpenIdConnectAuthNewSecurity](../../models/operations/OpenIdConnectAuthNewSecurity.md) | :heavy_check_mark:                                                                      | The security requirements to use for the request.                                       |
| `serverURL`                                                                             | *string*                                                                                | :heavy_minus_sign:                                                                      | An optional server URL to use.                                                          |


### Response

**[OpenIdConnectAuthNewResponse](../../models/operations/OpenIdConnectAuthNewResponse.md)**

