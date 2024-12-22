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
    DateParameter = LocalDate.FromDateTime(System.DateTime.Parse("2022-10-21")),
    DateTimeDefaultParameter = System.DateTime.Parse("2022-11-16T02:05:07.748Z"),
    DateTimeParameter = System.DateTime.Parse("2022-09-08T13:40:52.532Z"),
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
            DateFormat = LocalDate.FromDateTime(System.DateTime.Parse("2024-05-13")),
            DatetimeFormat = System.DateTime.Parse("2024-11-24T05:08:23.961Z"),
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
            CreatedAt = "<value>",
            Currency = "Taka",
            CurrencyCode = "HKD",
            CurrencyISO = "ISK",
            Datatype = "text",
            Default = "<value>",
            Description = "cultivated hence atop publicity yuck firsthand pantyhose",
            Directory = "/opt",
            Domain = "innocent-designation.name",
            DomainName = "hefty-goat.info",
            Email = "Emmanuelle78@yahoo.com",
            EmailAddr = "Chanel.Keebler-Robel@yahoo.com",
            EmailAddress = "Katharina88@yahoo.com",
            ExpiredAt = "<value>",
            Expires = "<value>",
            ExpiresAt = "<value>",
            Extension = "wav",
            Filename = "example.file",
            Filepath = "/System/wherever_ugh_amid.tiff",
            Filetype = "video",
            FirstName = "Garret",
            FullName = "Rufus Schaefer",
            Gender = "Trans person",
            Host = "frozen-annual.biz",
            HostName = "all-hubris.org",
            HttpStatus = "505",
            Iban = "MU56RKSN2867031200501700952VCL",
            Id = "<id>",
            Ip = "35.8.149.202",
            IpAddr = "b47e:d5aa:74cc:ce6a:a0e9:175c:eabe:ae91",
            IpAddress = "bbbb:ea1e:bc17:0862:5cbd:e29f:a2b6:c517",
            Ipv4 = "127.91.106.177",
            Ipv6 = "eaa6:7289:51c2:85db:b6cc:ef8c:9baa:9fa4",
            Job = "Product Research Producer",
            Json = "{key: 7725687944244536, key1: null, key2: \"<value>\"}",
            Key = "<key>",
            LastName = "Greenfelder",
            Latitude = "-60.0189",
            Locale = "fi",
            Longitude = "-128.0093",
            Mac = "17:ce:d8:80:0a:35",
            Manufacturer = "Aston Martin",
            Material = "Soft",
            MiddleName = "Jules",
            Model = "Impala",
            Password = "IcbvHqTVqA1XkfF",
            Phone = "945.520.7469 x8191",
            Pin = "8709",
            PostalCode = "17698",
            Price = "443.65",
            Product = "Recycled Fresh Shirt",
            Sex = "male",
            StatusCode = "206",
            Street = "Nader Hollow",
            Timezone = "America/Creston",
            Unit = "radian",
            UpdatedAt = "<value>",
            Uri = "https://hoarse-best-seller.net/",
            Url = "https://lighthearted-toothpick.info/",
            Username = "Travis.Stroman55",
            Uuid = "e20e0595-8b9b-42d8-aa8f-4f055ce98595",
        },
        FakerSnakeCasePropertyNameStrings = new FakerSnakeCasePropertyNameStrings() {
            CountryCode = "KW",
            CreatedAt = "<value>",
            ExpiredAt = "<value>",
            UpdatedAt = "<value>",
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