<!-- Start SDK Example Usage [usage] -->
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
    Float32Parameter = 200.81F,
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
            CreatedAt = "1709207152067",
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
            ExpiredAt = "1737109195115",
            Expires = "<value>",
            ExpiresAt = "1751704367071",
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
            UpdatedAt = "1738167680283",
            Uri = "https://tricky-hydrant.biz",
            Url = "https://selfish-epic.net",
            Username = "Katlyn_OHara",
            Uuid = "34551a37-e5ee-4d18-a1e2-0e05958b9b2d",
        },
        FakerSnakeCasePropertyNameStrings = new FakerSnakeCasePropertyNameStrings() {
            CountryCode = "NC",
            CreatedAt = "1723759920846",
            ExpiredAt = "1737763945289",
            UpdatedAt = "1738132738575",
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