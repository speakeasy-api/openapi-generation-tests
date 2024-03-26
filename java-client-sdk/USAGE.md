<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.operations.GetGlobalNameOverrideResponse;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            SimpleObject req = SimpleObject.builder()
                .any("any")
                .bool(true)
                .date(LocalDate.parse("2020-01-01"))
                .dateTime(OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"))
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
                .intOptNull(697039L)
                .numOptNull(6448.77d)
                .strOpt("testOptional")
                .build();

            GetGlobalNameOverrideResponse res = sdk.generation().globalNameOverridden()
                .request(req)
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.operations.SelectGlobalServerResponse;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Security;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            SelectGlobalServerResponse res = sdk.servers().selectGlobalServer()
                .call();

            // handle response
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Second

Do this second

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.operations.EnumParameter;
import org.openapis.openapi.models.operations.OptEnumParameter;
import org.openapis.openapi.models.operations.UsageExamplePostRequest;
import org.openapis.openapi.models.operations.UsageExamplePostRequestBody;
import org.openapis.openapi.models.operations.UsageExamplePostResponse;
import org.openapis.openapi.models.operations.UsageExamplePostSecurity;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.FakerFormattedStrings;
import org.openapis.openapi.models.shared.FakerStrings;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.SimpleObject;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            UsageExamplePostRequest req = UsageExamplePostRequest.builder()
                .bigintParameter(new BigInteger("168827"))
                .bigintStrParameter(new BigInteger("446729"))
                .boolParameter(false)
                .dateParameter(LocalDate.parse("2024-06-10"))
                .dateTimeDefaultParameter(OffsetDateTime.parse("2023-07-23T01:43:10.512Z"))
                .dateTimeParameter(OffsetDateTime.parse("2022-10-21T15:42:48.223Z"))
                .decimalParameter(new BigDecimal("5223.72"))
                .decimalStrParameter(new BigDecimal("2911.37"))
                .doubleParameter(6946.59d)
                .enumParameter(EnumParameter.VALUE1)
                .falseyNumberParameter(0d)
                .float32Parameter(1029.75f)
                .floatParameter(5669.99d)
                .int64Parameter(195232L)
                .intParameter(569663)
                .strParameter("example 1")
                .requestBody(UsageExamplePostRequestBody.builder()
                    .fakerFormattedStrings(FakerFormattedStrings.builder()
                        .addressFormat("4470 Bennett Forest")
                        .directoryFormat("/lib")
                        .domainFormat("ornate-courthouse.org")
                        .emailFormat("Sofia_Gulgowski29@yahoo.com")
                        .filenameFormat("southwest.mp2a")
                        .filepathFormat("/usr/green_target.z4")
                        .imageFormat("https://loremflickr.com/640/480")
                        .ipv4Format("116.31.181.178")
                        .ipv6Format("73ac:9ee2:348d:76c3:164a:258b:e7e1:3586")
                        .jsonFormat("{key: 42822, key1: null, key2: \"<value>\"}")
                        .macFormat("7d:ac:95:a0:15:23")
                        .passwordFormat("eWzdveK0sHokC9n")
                        .phoneFormat("1-340-562-2122 x175")
                        .timezoneFormat("Asia/Yekaterinburg")
                        .unknownFormat("<value>")
                        .urlFormat("https://wilted-cytoplasm.biz")
                        .uuidFormat("e0f62de2-e2d4-47a9-bf10-0f753b9b364b")
                        .zipcodeFormat("73625")
                        .build())
                    .fakerStrings(FakerStrings.builder()
                        .city("Schuppecester")
                        .iban("NO0300631256004")
                        .id("<id>")
                        .iPv4("251.251.208.201")
                        .iPv6("ffbd:3ad7:2b20:8b2c:8188:308b:b979:0237")
                        .account("29659826")
                        .address("2500 Ambrose Circles")
                        .amount("89.73")
                        .avatar("https://loremflickr.com/640/480")
                        .color("fuchsia")
                        .comment("Carbonite web goalkeeper gloves are ergonomically designed to give easy fit")
                        .company("Sipes - Buckridge")
                        .country("Turkey")
                        .countryCode("NF")
                        .currency("Pakistan Rupee")
                        .datatype("real")
                        .default_("<value>")
                        .description("Customizable zero administration open system")
                        .directory("/opt/sbin")
                        .domainName("deep-stallion.info")
                        .emailAddr("Alejandrin.Barrows@hotmail.com")
                        .extension("m1v")
                        .filename("panel_deposit.png")
                        .filepath("/media/executive_automotive_northeast.distz")
                        .filetype("video")
                        .firstName("Dejuan")
                        .fullName("Mrs. Jose Franey")
                        .gender("Trans female")
                        .job("Direct Accountability Liaison")
                        .json("{key: 88901, key1: null, key2: \"<value>\"}")
                        .key("<key>")
                        .lastName("Metz")
                        .latitude("68.2232")
                        .locale("uk")
                        .longitude("-42.1384")
                        .mac("a2:42:a1:bf:6e:19")
                        .manufacturer("Aston Martin")
                        .material("Concrete")
                        .middleName("Finley")
                        .model("Escalade")
                        .password("_QiNrTzqbDz8AXY")
                        .phone("469-402-6116")
                        .pin("9497")
                        .postalCode("64696")
                        .price("25.00")
                        .product("Recycled Granite Pants")
                        .sex("male")
                        .street("Lura Wells")
                        .timezone("Africa/Nairobi")
                        .unit("degree Celsius")
                        .url("https://crooked-dulcimer.name")
                        .username("Mable76")
                        .uuid("16b919d6-51cd-4e97-81e2-5221b7b6969f")
                        .build())
                    .simpleObject(SimpleObject.builder()
                        .any("any")
                        .bool(true)
                        .date(LocalDate.parse("2020-01-01"))
                        .dateTime(OffsetDateTime.parse("2020-01-01T00:00:00.000001Z"))
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
                        .intOptNull(809796L)
                        .numOptNull(4812.91d)
                        .strOpt("testOptional")
                        .build())
                    .build())
                .bigintParameterOptional(new BigInteger("165468"))
                .bigintStrParameterOptional(new BigInteger("594432"))
                .decimalParameterOptional(new BigDecimal("9247.93"))
                .decimalStrParameterOptional(new BigDecimal("5834.81"))
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
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->