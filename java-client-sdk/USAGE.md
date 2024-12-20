<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import java.lang.Exception;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GetGlobalNameOverrideResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        SimpleObject req = SimpleObject.builder()
                .any("any")
                .bool(true)
                .date(LocalDate.parse("2020-01-01"))
                .dateTime(OffsetDateTime.parse("2020-01-01T00:00:00.001Z"))
                .enum_(Enum.ONE)
                .float32(1.1f)
                .int_(1L)
                .int32(1)
                .int32Enum(Int32Enum.FIFTY_FIVE)
                .intEnum(IntEnum.Second)
                .num(1.1d)
                .str("test")
                .bigint(new BigInteger("8821239038968084"))
                .bigintStr(new BigInteger("9223372036854775808"))
                .boolOpt(true)
                .decimal(new BigDecimal("3.141592653589793"))
                .decimalStr(new BigDecimal("3.14159265358979344719667586"))
                .float64Str("1.1")
                .int64Str("100")
                .strOpt("testOptional")
                .build();

        GetGlobalNameOverrideResponse res = sdk.generation().globalNameOverridden()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.SelectGlobalServerResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        SelectGlobalServerResponse res = sdk.servers().selectGlobalServer()
                .call();

        // handle response
    }
}
```

### Second

Do this second

```java
package hello.world;

import java.lang.Exception;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.EnumParameter;
import org.openapis.openapi.models.operations.OptEnumParameter;
import org.openapis.openapi.models.operations.UsageExamplePostRequest;
import org.openapis.openapi.models.operations.UsageExamplePostRequestBody;
import org.openapis.openapi.models.operations.UsageExamplePostResponse;
import org.openapis.openapi.models.operations.UsageExamplePostSecurity;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.FakerCamelCasePropertyNameStrings;
import org.openapis.openapi.models.shared.FakerFormattedStrings;
import org.openapis.openapi.models.shared.FakerKebobCasePropertyNameStrings;
import org.openapis.openapi.models.shared.FakerPascalCasePropertyNameStrings;
import org.openapis.openapi.models.shared.FakerSnakeCasePropertyNameStrings;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.SimpleObject;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        UsageExamplePostRequest req = UsageExamplePostRequest.builder()
                .bigintParameter(new BigInteger("341377"))
                .bigintStrParameter(new BigInteger("935014"))
                .boolParameter(false)
                .dateParameter(LocalDate.parse("2022-06-17"))
                .dateTimeDefaultParameter(OffsetDateTime.parse("2024-09-08T16:41:18.590Z"))
                .dateTimeParameter(OffsetDateTime.parse("2022-02-25T19:24:58.319Z"))
                .decimalParameter(new BigDecimal("1207.65"))
                .decimalStrParameter(new BigDecimal("5574.60"))
                .doubleParameter(1210.26d)
                .enumParameter(EnumParameter.VALUE1)
                .falseyNumberParameter(0d)
                .float32Parameter(8680.17f)
                .float64StringParameter("<value>")
                .floatParameter(9262.70d)
                .int64Parameter(921028L)
                .int64StringParameter("<value>")
                .intParameter(466225)
                .strParameter("example 1")
                .requestBody(UsageExamplePostRequestBody.builder()
                    .fakerCamelCasePropertyNameStrings(FakerCamelCasePropertyNameStrings.builder()
                        .city("Port Domenicboro")
                        .iban("TL115340030031304452481")
                        .id("<id>")
                        .iPv4("78.38.131.239")
                        .iPv6("e4c9:ca70:74d2:c3d9:33d6:c7c4:1e56:3bf5")
                        .build())
                    .fakerFormattedStrings(FakerFormattedStrings.builder()
                        .addressFormat("919 Vicarage Lane")
                        .dateFormat(LocalDate.parse("2023-05-22"))
                        .datetimeFormat(OffsetDateTime.parse("2023-10-31T03:05:14.934Z"))
                        .directoryFormat("/var/spool")
                        .domainFormat("aggravating-vanadyl.biz")
                        .emailFormat("Mateo_Rice@hotmail.com")
                        .filenameFormat("example.file")
                        .filepathFormat("/usr/obj/boo_magnificent_and.jpeg")
                        .imageFormat("https://loremflickr.com/2371/2464?lock=4205364297848786")
                        .ipv4Format("234.138.226.158")
                        .ipv6Format("5141:db2e:df9c:f06d:8b99:e7e4:2c56:addd")
                        .jsonFormat("{key: 3449297471398524, key1: null, key2: \"<value>\"}")
                        .macFormat("22:1f:e9:45:8a:7f")
                        .passwordFormat("zbz8X7IgZMC4iGZ")
                        .phoneFormat("(508) 609-3176 x5681")
                        .timezoneFormat("Pacific/Efate")
                        .unknownFormat("<value>")
                        .urlFormat("https://stark-trick.name")
                        .uuidFormat("8f5bc12b-caad-4053-9859-5e369841bdb9")
                        .zipcodeFormat("59560")
                        .build())
                    .fakerKebobCasePropertyNameStrings(FakerKebobCasePropertyNameStrings.builder()
                        .postalCode("10760-9151")
                        .build())
                    .fakerPascalCasePropertyNameStrings(FakerPascalCasePropertyNameStrings.builder()
                        .account("82091084")
                        .address("14760 Gerhold Prairie")
                        .amount("707.58")
                        .avatar("https://picsum.photos/seed/MQvsb2J6/1388/3681")
                        .city("Fayborough")
                        .color("turquoise")
                        .comment("The Football Is Good For Training And Recreational Purposes")
                        .company("Gusikowski Group")
                        .continent("Africa")
                        .country("Japan")
                        .countryCode("AG")
                        .createdAt("<value>")
                        .currency("Baht")
                        .currencyCode("PAB")
                        .currencyISO("SBD")
                        .datatype("varchar")
                        .default_("<value>")
                        .description("secondary punctually carp")
                        .directory("/var/yp")
                        .domain("front-seafood.biz")
                        .domainName("worse-heating.biz")
                        .email("Dell.Reichel10@yahoo.com")
                        .emailAddr("Coralie_Aufderhar@gmail.com")
                        .emailAddress("Janelle54@hotmail.com")
                        .expiredAt("<value>")
                        .expires("<value>")
                        .expiresAt("<value>")
                        .extension("wav")
                        .filename("example.file")
                        .filepath("/usr/lib/meh_rubbery.spx")
                        .filetype("video")
                        .firstName("Virgil")
                        .fullName("Celia Lockman")
                        .gender("Intersex")
                        .host("neighboring-backbone.org")
                        .hostName("fantastic-swim.net")
                        .httpStatus("206")
                        .iban("SK4700200863715636017876")
                        .id("<id>")
                        .ip("6070:9eea:ee8f:b94b:bdb6:a7b2:863a:c3b0")
                        .ipAddr("a56f:c6c2:9330:cbeb:47ed:5aa7:4ccc:e6aa")
                        .ipAddress("171.109.23.85")
                        .ipv4("63.149.162.195")
                        .ipv6("beae:91db:bbbe:a1eb:c170:8625:cbde:29fa")
                        .job("Direct Operations Specialist")
                        .json("{key: 5315518856826349, key1: null, key2: \"<value>\"}")
                        .key("<key>")
                        .lastName("Block")
                        .latitude("-26.8203")
                        .locale("zh")
                        .longitude("-51.1636")
                        .mac("6b:f7:74:51:67:41")
                        .manufacturer("Land Rover")
                        .material("Concrete")
                        .middleName("Gray")
                        .model("Challenger")
                        .password("sjTUYDUJQfNKef2")
                        .phone("378-421-8104 x788")
                        .pin("5500")
                        .postalCode("13074-5402")
                        .price("700.26")
                        .product("Incredible Steel Mouse")
                        .sex("male")
                        .statusCode("103")
                        .street("Eusebio Curve")
                        .timezone("Asia/Kabul")
                        .unit("steradian")
                        .updatedAt("<value>")
                        .uri("https://willing-e-mail.info")
                        .url("https://whirlwind-insolence.name")
                        .username("Hettie44")
                        .uuid("fc2e2cb0-e33c-4afd-9729-b4c83a9a6345")
                        .build())
                    .fakerSnakeCasePropertyNameStrings(FakerSnakeCasePropertyNameStrings.builder()
                        .countryCode("BE")
                        .createdAt("<value>")
                        .expiredAt("<value>")
                        .updatedAt("<value>")
                        .build())
                    .simpleObject(SimpleObject.builder()
                        .any("any")
                        .bool(true)
                        .date(LocalDate.parse("2020-01-01"))
                        .dateTime(OffsetDateTime.parse("2020-01-01T00:00:00.001Z"))
                        .enum_(Enum.ONE)
                        .float32(1.1f)
                        .int_(1L)
                        .int32(1)
                        .int32Enum(Int32Enum.FIFTY_FIVE)
                        .intEnum(IntEnum.Second)
                        .num(1.1d)
                        .str("test")
                        .bigint(new BigInteger("8821239038968084"))
                        .bigintStr(new BigInteger("9223372036854775808"))
                        .boolOpt(true)
                        .decimal(new BigDecimal("3.141592653589793"))
                        .decimalStr(new BigDecimal("3.14159265358979344719667586"))
                        .float64Str("1.1")
                        .int64Str("100")
                        .strOpt("testOptional")
                        .build())
                    .build())
                .optEnumParameter(OptEnumParameter.VALUE3)
                .build();

        UsageExamplePostResponse res = sdk.generation().usageExamplePost()
                .request(req)
                .security(UsageExamplePostSecurity.builder()
                    .password("YOUR_PASSWORD")
                    .username("YOUR_USERNAME")
                    .build())
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->