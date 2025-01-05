# Openapi


<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example 1

```csharp
using NodaTime;
using Openapi;
using Openapi.Models.Shared;
using System;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

SimpleObject req = new SimpleObject() {
    Any = "any",
    Bool = true,
    Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
    DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
    Enum = Openapi.Models.Shared.Enum.One,
    Float32 = 1.1F,
    Int = 1,
    Int32 = 1,
    Int32Enum = Int32Enum.FiftyFive,
    IntEnum = IntEnum.Second,
    Num = 1.1D,
    Str = "test",
    Bigint = 8821239038968084,
    BigintStr = 9223372036854775808,
    BoolOpt = true,
    Decimal = 3.141592653589793M,
    DecimalStr = 3.14159265358979344719667586M,
    Float64Str = "1.1",
    Int64Str = "100",
    StrOpt = "testOptional",
};

var res = await sdk.Generation.GlobalNameOverriddenAsync(req);

// handle response
```

### Example 2

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Servers.SelectGlobalServerAsync();

// handle response
```

### Second

Do this second

```csharp
using NodaTime;
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;
using System;

var sdk = new SDK(
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

UsageExamplePostRequest req = new UsageExamplePostRequest() {
    BigintParameter = 168827,
    BigintStrParameter = 813724,
    BoolParameter = false,
    DateParameter = LocalDate.FromDateTime(System.DateTime.Parse("2023-10-21")),
    DateTimeDefaultParameter = System.DateTime.Parse("2023-11-16T02:05:07.748Z"),
    DateTimeParameter = System.DateTime.Parse("2023-09-08T13:40:52.532Z"),
    DecimalParameter = 5669.99M,
    DecimalStrParameter = 5696.63M,
    DoubleParameter = 3527.78D,
    EnumParameter = EnumParameter.Value2,
    FalseyNumberParameter = 0D,
    Float32Parameter = 200.82F,
    Float64StringParameter = "<value>",
    FloatParameter = 1062.86D,
    Int64Parameter = 234682,
    Int64StringParameter = "<value>",
    IntParameter = 215216,
    StrParameter = "example 2",
    RequestBody = new UsageExamplePostRequestBody() {
        FakerCamelCasePropertyNameStrings = new FakerCamelCasePropertyNameStrings() {
            City = "Fort Cassandra",
            Iban = "TR115005745241192470211411",
            Id = "<id>",
            IPv4 = "221.80.210.91",
            IPv6 = "c41e:563b:f5df:3eec:ade0:f7ff:8aae:bcff",
        },
        FakerFormattedStrings = new FakerFormattedStrings() {
            AddressFormat = "2256 Jackie Way",
            DateFormat = LocalDate.FromDateTime(System.DateTime.Parse("2025-05-13")),
            DatetimeFormat = System.DateTime.Parse("2025-11-24T05:08:23.961Z"),
            DirectoryFormat = "/usr/obj",
            DomainFormat = "prudent-kettledrum.net",
            EmailFormat = "Monserrat4@gmail.com",
            FilenameFormat = "example.file",
            FilepathFormat = "/srv/far_off_though.mp2",
            ImageFormat = "https://picsum.photos/seed/1jCnxsrVm/3900/1676",
            Ipv4Format = "241.49.29.216",
            Ipv6Format = "56ad:dd82:32fe:d68b:eafe:fe5c:0e75:3e9a",
            JsonFormat = "{key: 5416874389095425, key1: null, key2: \"<value>\"}",
            MacFormat = "aa:75:4f:92:a3:c6",
            PasswordFormat = "ZYIrZwC2gbXZm0x",
            PhoneFormat = "895.693.7701 x78668",
            TimezoneFormat = "Africa/Juba",
            UnknownFormat = "<value>",
            UrlFormat = "https://devoted-lady.info/",
            UuidFormat = "95e36984-1bdb-4972-b8f8-91d21ba1e292",
            ZipcodeFormat = "09108",
        },
        FakerKebobCasePropertyNameStrings = new FakerKebobCasePropertyNameStrings() {
            PostalCode = "00476",
        },
        FakerPascalCasePropertyNameStrings = new FakerPascalCasePropertyNameStrings() {
            Account = "05267398",
            Address = "8854 Alta Road",
            Amount = "101.02",
            Avatar = "https://loremflickr.com/2780/914?lock=8012325154053812",
            City = "Maggioboro",
            Color = "fuchsia",
            Comment = "Andy shoes are designed to keeping in mind durability as well as trends, the most stylish range of shoes & sandals",
            Company = "Anderson and Sons",
            Continent = "Europe",
            Country = "Russian Federation",
            CountryCode = "YE",
            CreatedAt = "1707047236326",
            Currency = "Hong Kong Dollar",
            CurrencyCode = "ISK",
            CurrencyISO = "SSP",
            Datatype = "point",
            Default = "<value>",
            Description = "without vice um granny straw",
            Directory = "/var/spool",
            Domain = "informal-rawhide.info",
            DomainName = "zany-drive.biz",
            Email = "Kamryn_Harris-Rice@yahoo.com",
            EmailAddr = "Mackenzie.Homenick43@gmail.com",
            EmailAddress = "Jodie_Sawayn64@hotmail.com",
            ExpiredAt = "1734949279374",
            Expires = "<value>",
            ExpiresAt = "1749544451330",
            Extension = "mp4",
            Filename = "example.file",
            Filepath = "/root/what_enlist.dmg",
            Filetype = "text",
            FirstName = "Rick",
            FullName = "Jim Raynor",
            Gender = "Trans male",
            Host = "nice-version.net",
            HostName = "incomparable-expansion.biz",
            HttpStatus = "403",
            Iban = "PT82007863030094674087035",
            Id = "<id>",
            Ip = "95.76.43.117",
            IpAddr = "3b0a:a56f:c6c2:9330:cbeb:47ed:5aa7:4ccc",
            IpAddress = "6aa0:e917:5cea:beae:91db:bbbe:a1eb:c170",
            Ipv4 = "93.70.29.69",
            Ipv6 = "cbde:29fa:2b6c:517a:79fe:aa67:2895:1c28",
            Job = "Future Accountability Consultant",
            Json = "{key: 4839465338338305, key1: null, key2: \"<value>\"}",
            Key = "<key>",
            LastName = "Luettgen",
            Latitude = "16.1719",
            Locale = "sv",
            Longitude = "167.6076",
            Mac = "58:68:b7:7b:b2:42",
            Manufacturer = "Polestar",
            Material = "Steel",
            MiddleName = "Emerson",
            Model = "Civic",
            Password = "0sOktqRR3ChOYIc",
            Phone = "948.650.8331 x5779",
            Pin = "2379",
            PostalCode = "54207",
            Price = "447.26",
            Product = "Rustic Cotton Towels",
            Sex = "female",
            StatusCode = "507",
            Street = "Sydnee Falls",
            Timezone = "America/Cancun",
            Unit = "steradian",
            UpdatedAt = "1736007764542",
            Uri = "https://tricky-hydrant.biz",
            Url = "https://selfish-epic.net",
            Username = "Katlyn_OHara",
            Uuid = "34551a37-e5ee-4d18-a1e2-0e05958b9b2d",
        },
        FakerSnakeCasePropertyNameStrings = new FakerSnakeCasePropertyNameStrings() {
            CountryCode = "NC",
            CreatedAt = "1721600005106",
            ExpiredAt = "1735604029549",
            UpdatedAt = "1735972822835",
        },
        SimpleObject = new SimpleObject() {
            Any = "any",
            Bool = true,
            Date = LocalDate.FromDateTime(System.DateTime.Parse("2020-01-01")),
            DateTime = System.DateTime.Parse("2020-01-01T00:00:00.001Z"),
            Enum = Openapi.Models.Shared.Enum.One,
            Float32 = 1.1F,
            Int = 1,
            Int32 = 1,
            Int32Enum = Int32Enum.FiftyFive,
            IntEnum = IntEnum.Second,
            Num = 1.1D,
            Str = "test",
            Bigint = 8821239038968084,
            BigintStr = 9223372036854775808,
            BoolOpt = true,
            Decimal = 3.141592653589793M,
            DecimalStr = 3.14159265358979344719667586M,
            Float64Str = "1.1",
            Int64Str = "100",
            StrOpt = "testOptional",
        },
    },
    OptEnumParameter = OptEnumParameter.Value3,
};

var res = await sdk.Generation.UsageExamplePostAsync(
    security: new UsageExamplePostSecurity() {
        Password = "YOUR_PASSWORD",
        Username = "YOUR_USERNAME",
    },
    request: req
);

// handle response
```
<!-- End SDK Example Usage [usage] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security schemes globally:

| Name         | Type   | Scheme       |
| ------------ | ------ | ------------ |
| `ApiKeyAuth` | apiKey | API key      |
| `Oauth2`     | oauth2 | OAuth2 token |

You can set the security parameters through the `security` optional parameter when initializing the SDK client instance. The selected scheme will be used by default to authenticate with the API for all operations that support it. For example:
```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.AmbiguousQueryParamAsync(console: Openapi.Models.Operations.Console.Three);

// handle response
```

### Per-Operation Security Schemes

Some operations in this SDK require the security scheme to be specified at the request level. For example:
```csharp
using Openapi;
using Openapi.Models.Operations;

var sdk = new SDK(
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

AuthenticatedRequestRequestBody req = new AuthenticatedRequestRequestBody() {};

var res = await sdk.AuthenticatedRequestAsync(
    security: new AuthenticatedRequestSecurity() {
        ClientCredentials = "<YOUR_CLIENT_CREDENTIALS_HERE>",
    },
    request: req
);

// handle response
```
<!-- End Authentication [security] -->

<!-- Start Global Parameters [global-parameters] -->
## Global Parameters

Certain parameters are configured globally. These parameters may be set on the SDK client instance itself during initialization. When configured as an option during SDK initialization, These global values will be used as defaults on the operations that use them. When such operations are called, there is a place in each to override the global value, if needed.

For example, you can set `globalHeaderParam` to `true` at SDK initialization and then you do not have to pass the same value on calls to operations like `GlobalPathParameterGet`. But if you want to do so you may, which will locally override the global setting. See the example code below for a demonstration.


### Available Globals

The following global parameters are available.

| Name                          | Type   | Description                                                                                                                                                                                                              |
| ----------------------------- | ------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| globalHeaderParam             | bool   | The GlobalHeaderParam parameter.                                                                                                                                                                                         |
| globalHiddenHeaderParam       | string | The GlobalHiddenHeaderParam parameter.                                                                                                                                                                                   |
| globalHiddenPathParam         | string | The GlobalHiddenPathParam parameter.                                                                                                                                                                                     |
| globalHiddenQueryParam        | string | The GlobalHiddenQueryParam parameter.                                                                                                                                                                                    |
| globalOptionalHiddenPathParam | string | An optional and hidden global path parameter. Some paths and operations<br/>will override it to required: true, especially for verifying test<br/>generation where the value should be templated in the SDK client.<br/> |
| globalOptionalPathParam       | string | An optional global path parameter. Some paths and operations will<br/>override it to required: true, especially for verifying test generation<br/>where the value should be templated in the operation request.<br/>     |
| globalPathParam               | long   | The GlobalPathParam parameter.                                                                                                                                                                                           |
| globalQueryParam              | string | The GlobalQueryParam parameter.                                                                                                                                                                                          |

### Example

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Globals.GlobalPathParameterGetAsync(globalPathParam: 100);

// handle response
```
<!-- End Global Parameters [global-parameters] -->

<!-- Start Pagination [pagination] -->
## Pagination

Some of the endpoints in this SDK support pagination. To use pagination, you make your SDK calls as usual, but the
returned response object will have a `Next` method that can be called to pull down the next group of results. If the
return value of `Next` is `null`, then there are no more pages to be fetched.

Here's an example of one such pagination call:
```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

ReactHookCombinedOptionsResponse? res = await sdk.Generation.ReactHookCombinedOptionsAsync(page: 122236);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```
<!-- End Pagination [pagination] -->

<!-- Start Retries [retries] -->
## Retries

Some of the endpoints in this SDK support retries. If you use the SDK without any configuration, it will fall back to the default retry strategy provided by the API. However, the default retry strategy can be overridden on a per-operation basis, or across the entire SDK.

To change the default retry strategy for a single API call, simply pass a `RetryConfig` to the call:
```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

PaginationWithRetriesResponse? res = await sdk.Pagination.PaginationWithRetriesAsync(
    retryConfig: new RetryConfig(
        strategy: RetryConfig.RetryStrategy.BACKOFF,
        backoff: new BackoffStrategy(
            initialIntervalMs: 1L,
            maxIntervalMs: 50L,
            maxElapsedTimeMs: 100L,
            exponent: 1.1
        ),
        retryConnectionErrors: false
    ),
    cursor: "<value>",
    faultSettings: "{\"error_code\": 503, \"error_count\": 3}",
    requestId: "paginationWithRetries"
);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

If you'd like to override the default retry strategy for all operations that support retries, you can use the `RetryConfig` optional parameter when intitializing the SDK:
```csharp
using Openapi;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    retryConfig: new RetryConfig(
        strategy: RetryConfig.RetryStrategy.BACKOFF,
        backoff: new BackoffStrategy(
            initialIntervalMs: 1L,
            maxIntervalMs: 50L,
            maxElapsedTimeMs: 100L,
            exponent: 1.1
        ),
        retryConnectionErrors: false
    ),
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

PaginationWithRetriesResponse? res = await sdk.Pagination.PaginationWithRetriesAsync(
    cursor: "<value>",
    faultSettings: "{\"error_code\": 503, \"error_count\": 3}",
    requestId: "paginationWithRetries"
);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```
<!-- End Retries [retries] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or throw an exception.

By default, an API error will raise a `Openapi.Models.Errors.SDKException` exception, which has the following properties:

| Property      | Type                  | Description           |
|---------------|-----------------------|-----------------------|
| `Message`     | *string*              | The error message     |
| `StatusCode`  | *int*                 | The HTTP status code  |
| `RawResponse` | *HttpResponseMessage* | The raw HTTP response |
| `Body`        | *string*              | The response content  |

When custom error responses are specified for an operation, the SDK may also throw their associated exceptions. You can refer to respective *Errors* tables in SDK docs for more details on possible exception types for each operation. For example, the `ErrorUnionDiscriminatedPostAsync` method throws the following exceptions:

| Error Type                         | Status Code | Content Type     |
| ---------------------------------- | ----------- | ---------------- |
| Openapi.Models.Errors.TaggedError1 | 4XX         | application/json |
| Openapi.Models.Errors.TaggedError2 | 4XX         | application/json |
| Openapi.Models.Errors.SDKException | 5XX         | \*/\*            |

### Example

```csharp
using Openapi;
using Openapi.Models.Errors;
using Openapi.Models.Operations;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

try
{
    ErrorUnionDiscriminatedPostRequestBody req = ErrorUnionDiscriminatedPostRequestBody.CreateTaggedError2RequestBody(
        new TaggedError2RequestBody() {
            Tag = "<value>",
            TaggedError2Message = new TaggedError2Message() {
                Message = "<value>",
            },
        }
    );

    var res = await sdk.Errors.ErrorUnionDiscriminatedPostAsync(req);

    // handle response
}
catch (Exception ex)
{
    if (ex is TaggedError1)
    {
        // Handle exception data
        throw;
    }
    if (ex is TaggedError2)
    {
        // Handle exception data
        throw;
    }
    else if (ex is Openapi.Models.Errors.SDKException)
    {
        // Handle default exception
        throw;
    }
}
```
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally by passing a server index to the `serverIndex: int` optional parameter when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| #   | Server                                        | Variables                                                    | Default values                           |
| --- | --------------------------------------------- | ------------------------------------------------------------ | ---------------------------------------- |
| 0   | `http://localhost:35123`                      |                                                              |                                          |
| 1   | `http://broken`                               |                                                              |                                          |
| 2   | `http://{hostname}:{port}`                    | `hostname: string`<br/>`port: string`                        | `"localhost"`<br/>`"35123"`              |
| 3   | `http://localhost:35123/anything/{something}` | `something: ServerSomething`                                 | `"something"`                            |
| 4   | `{protocol}://{hostname}:{port}`              | `hostname: string`<br/>`port: string`<br/>`protocol: string` | `"localhost"`<br/>`"35123"`<br/>`"http"` |

If the selected server has variables, you may override their default values through the additional parameters made available in the SDK constructor.

#### Example

```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    serverIndex: 4,
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.AmbiguousQueryParamAsync(console: Openapi.Models.Operations.Console.Three);

// handle response
```

### Override Server URL Per-Client

The default server can also be overridden globally by passing a URL to the `serverUrl: string` optional parameter when initializing the SDK client instance. For example:
```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    serverUrl: "http://localhost:35123",
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.AmbiguousQueryParamAsync(console: Openapi.Models.Operations.Console.Three);

// handle response
```

### Override Server URL Per-Operation

The server URL can also be overridden on a per-operation basis, provided a server list was specified for the operation. For example:
```csharp
using Openapi;
using Openapi.Models.Shared;

var sdk = new SDK(
    security: new Security() {
        ApiKeyAuth = "Token YOUR_API_KEY",
    },
    globalHeaderParam: true,
    globalHiddenQueryParam: "hello",
    globalPathParam: 100,
    globalQueryParam: "some example global query param"
);

var res = await sdk.Errors.ConnectionErrorGetAsync(serverUrl: "http://somebrokenapi.broken");

// handle response
```
<!-- End Server Selection [server] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->