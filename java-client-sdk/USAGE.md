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
                .bigintParameter(new BigInteger("321498"))
                .bigintStrParameter(new BigInteger("713333"))
                .boolParameter(true)
                .dateParameter(LocalDate.parse("2024-09-17"))
                .dateTimeDefaultParameter(OffsetDateTime.parse("2023-10-04T08:37:24.631Z"))
                .dateTimeParameter(OffsetDateTime.parse("2024-01-02T00:16:41.967Z"))
                .decimalParameter(new BigDecimal("9223.59"))
                .decimalStrParameter(new BigDecimal("4418.76"))
                .doubleParameter(7032.71d)
                .enumParameter(EnumParameter.VALUE1)
                .falseyNumberParameter(0d)
                .float32Parameter(9014.53f)
                .float64StringParameter("<value>")
                .floatParameter(3341.04d)
                .int64Parameter(901974L)
                .int64StringParameter("<value>")
                .intParameter(300411)
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
                        .dateFormat(LocalDate.parse("2024-05-21"))
                        .datetimeFormat(OffsetDateTime.parse("2024-10-30T03:05:14.934Z"))
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
                        .createdAt("1730711193911")
                        .currency("Balboa")
                        .currencyCode("SBD")
                        .currencyISO("NAD")
                        .datatype("binary")
                        .default_("<value>")
                        .description("jittery furthermore yet mystify euphonium")
                        .directory("/home/user")
                        .domain("educated-aftermath.org")
                        .domainName("whole-help.net")
                        .email("Zoe54@yahoo.com")
                        .emailAddr("Murphy.Heller@gmail.com")
                        .emailAddress("Georgette.Kessler@yahoo.com")
                        .expiredAt("1725272741360")
                        .expires("<value>")
                        .expiresAt("1761117690096")
                        .extension("mp4v")
                        .filename("example.file")
                        .filepath("/etc/ppp/ugh_octave_scorn.htm")
                        .filetype("text")
                        .firstName("Elmira")
                        .fullName("Beulah Rohan")
                        .gender("Two-spirit person")
                        .host("rotating-handful.biz")
                        .hostName("glass-newsstand.com")
                        .httpStatus("401")
                        .iban("GT248U7009M6748Q231241072O84")
                        .id("<id>")
                        .ip("35.8.149.202")
                        .ipAddr("b47e:d5aa:74cc:ce6a:a0e9:175c:eabe:ae91")
                        .ipAddress("bbbb:ea1e:bc17:0862:5cbd:e29f:a2b6:c517")
                        .ipv4("127.91.106.177")
                        .ipv6("eaa6:7289:51c2:85db:b6cc:ef8c:9baa:9fa4")
                        .job("Product Research Producer")
                        .json("{key: 7725687944244536, key1: null, key2: \"<value>\"}")
                        .key("<key>")
                        .lastName("Greenfelder")
                        .latitude("-60.0189")
                        .locale("fi")
                        .longitude("-128.0093")
                        .mac("17:ce:d8:80:0a:35")
                        .manufacturer("Aston Martin")
                        .material("Soft")
                        .middleName("Jules")
                        .model("Impala")
                        .password("IcbvHqTVqA1XkfF")
                        .phone("945.520.7469 x8191")
                        .pin("8709")
                        .postalCode("17698")
                        .price("443.65")
                        .product("Recycled Fresh Shirt")
                        .sex("male")
                        .statusCode("206")
                        .street("Nader Hollow")
                        .timezone("America/Creston")
                        .unit("radian")
                        .updatedAt("1736376787539")
                        .uri("https://blushing-pinstripe.biz/")
                        .url("https://utilized-flight.org/")
                        .username("Tierra12")
                        .uuid("20e05958-b9b2-4d8a-98f4-f055ce98595b")
                        .build())
                    .fakerSnakeCasePropertyNameStrings(FakerSnakeCasePropertyNameStrings.builder()
                        .countryCode("FJ")
                        .createdAt("1731425967045")
                        .expiredAt("1721904043500")
                        .updatedAt("1736349690756")
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