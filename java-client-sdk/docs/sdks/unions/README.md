# Unions
(*unions()*)

## Overview

Endpoints for testing union types.

### Available Operations

* [arrayOfDiscriminatedUnions](#arrayofdiscriminatedunions)
* [arrayOfDiscriminatedUnionsMap](#arrayofdiscriminatedunionsmap)
* [collectionOneOfPost](#collectiononeofpost)
* [constDiscriminatedOneOf](#constdiscriminatedoneof)
* [discriminatedOneMultipleMemberships](#discriminatedonemultiplememberships)
* [discriminatedOneMultipleMembershipsHasWheels](#discriminatedonemultiplemembershipshaswheels)
* [flattenedTypedObjectPost](#flattenedtypedobjectpost)
* [infectedWithAny](#infectedwithany)
* [mixedTypeOneOfPost](#mixedtypeoneofpost)
* [mixedUnionTypes](#mixeduniontypes)
* [multiMatchAnyOf](#multimatchanyof)
* [nestedArrayOfDiscriminatedUnions](#nestedarrayofdiscriminatedunions)
* [nullableOneOfRefInObjectPost](#nullableoneofrefinobjectpost)
* [nullableOneOfSchemaPost](#nullableoneofschemapost)
* [nullableOneOfTypeInObjectPost](#nullableoneoftypeinobjectpost)
* [nullableTypedObjectPost](#nullabletypedobjectpost)
* [oneOfOverlappingObjects](#oneofoverlappingobjects)
* [primitiveTypeOneOfPost](#primitivetypeoneofpost)
* [stronglyTypedOneOfDiscriminatedPost](#stronglytypedoneofdiscriminatedpost)
* [stronglyTypedOneOfPost](#stronglytypedoneofpost)
* [stronglyTypedOneOfPostWithNonStandardDiscriminatorName](#stronglytypedoneofpostwithnonstandarddiscriminatorname)
* [typedObjectNullableOneOfPost](#typedobjectnullableoneofpost)
* [typedObjectOneOfPost](#typedobjectoneofpost)
* [unionBigIntStrDecimal](#unionbigintstrdecimal)
* [unionDateNull](#uniondatenull)
* [unionDateTimeBigInt](#uniondatetimebigint)
* [unionDateTimeNull](#uniondatetimenull)
* [unionMap](#unionmap)
* [unionMapOptional](#unionmapoptional)
* [unionNestedEnumsForm](#unionnestedenumsform)
* [unionNestedEnumsMultipart](#unionnestedenumsmultipart)
* [unionOfArraysPost](#unionofarrayspost)
* [weaklyTypedOneOfNullEnumPost](#weaklytypedoneofnullenumpost)
* [weaklyTypedOneOfPost](#weaklytypedoneofpost)

## arrayOfDiscriminatedUnions

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ArrayOfDiscriminatedUnionsResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObjectWithType;
import org.openapis.openapi.models.shared.SimpleObjectWithTypeInt32Enum;
import org.openapis.openapi.models.shared.SimpleObjectWithTypeIntEnum;
import org.openapis.openapi.models.shared.StronglyTypedOneOfObject;

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

        List<StronglyTypedOneOfObject> req = List.of(
                SimpleObjectWithType.builder()
                    .any("any")
                    .bool(true)
                    .date(LocalDate.parse("2020-01-01"))
                    .dateTime(OffsetDateTime.parse("2020-01-01T00:00:00.001Z"))
                    .enum_(Enum.ONE)
                    .float32(1.1f)
                    .int_(1L)
                    .int32(1)
                    .int32Enum(SimpleObjectWithTypeInt32Enum.FIFTY_FIVE)
                    .intEnum(SimpleObjectWithTypeIntEnum.Second)
                    .num(1.1d)
                    .str("test")
                    .type("<value>")
                    .bigint(new BigInteger("8821239038968084"))
                    .bigintStr(new BigInteger("9223372036854775808"))
                    .boolOpt(true)
                    .decimal(new BigDecimal("3.141592653589793"))
                    .decimalStr(new BigDecimal("3.14159265358979344719667586"))
                    .float64Str("1.1")
                    .int64Str("100")
                    .strOpt("testOptional")
                    .build());

        ArrayOfDiscriminatedUnionsResponse res = sdk.unions().arrayOfDiscriminatedUnions()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `request`                                           | [List<StronglyTypedOneOfObject>](../../models//.md) | :heavy_check_mark:                                  | The request object to use for the request.          |

### Response

**[ArrayOfDiscriminatedUnionsResponse](../../models/operations/ArrayOfDiscriminatedUnionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## arrayOfDiscriminatedUnionsMap

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.util.Map;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ArrayOfDiscriminatedUnionsMapResponse;
import org.openapis.openapi.models.shared.ArrayOfDiscriminatedUnionsMap;
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

        ArrayOfDiscriminatedUnionsMap req = ArrayOfDiscriminatedUnionsMap.builder()
                .arrayMap(Map.ofEntries(
                ))
                .build();

        ArrayOfDiscriminatedUnionsMapResponse res = sdk.unions().arrayOfDiscriminatedUnionsMap()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ArrayOfDiscriminatedUnionsMap](../../models/shared/ArrayOfDiscriminatedUnionsMap.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ArrayOfDiscriminatedUnionsMapResponse](../../models/operations/ArrayOfDiscriminatedUnionsMapResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## collectionOneOfPost

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.util.Map;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.CollectionOneOfPostResponse;
import org.openapis.openapi.models.shared.CollectionOneOfObject;
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

        CollectionOneOfObject req = CollectionOneOfObject.of(Map.ofEntries(
            ));

        CollectionOneOfPostResponse res = sdk.unions().collectionOneOfPost()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [CollectionOneOfObject](../../models/shared/CollectionOneOfObject.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[CollectionOneOfPostResponse](../../models/operations/CollectionOneOfPostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## constDiscriminatedOneOf

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ConstDiscriminatedOneOfResponse;
import org.openapis.openapi.models.shared.ConstDiscriminatedOneOf;
import org.openapis.openapi.models.shared.ConstObject1;
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

        ConstDiscriminatedOneOf req = ConstObject1.builder()
                .imageURL("https://austere-cow.net")
                .build();

        ConstDiscriminatedOneOfResponse res = sdk.unions().constDiscriminatedOneOf()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ConstDiscriminatedOneOf](../../models/shared/ConstDiscriminatedOneOf.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ConstDiscriminatedOneOfResponse](../../models/operations/ConstDiscriminatedOneOfResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## discriminatedOneMultipleMemberships

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.DiscriminatedOneMultipleMembershipsResponse;
import org.openapis.openapi.models.shared.Bike;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.Vehicle;

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

        Vehicle req = Bike.builder()
                .colour("<value>")
                .build();

        DiscriminatedOneMultipleMembershipsResponse res = sdk.unions().discriminatedOneMultipleMemberships()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Vehicle](../../models/shared/Vehicle.md)  | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[DiscriminatedOneMultipleMembershipsResponse](../../models/operations/DiscriminatedOneMultipleMembershipsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## discriminatedOneMultipleMembershipsHasWheels

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.DiscriminatedOneMultipleMembershipsHasWheelsResponse;
import org.openapis.openapi.models.shared.Bike;
import org.openapis.openapi.models.shared.HasWheels;
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

        HasWheels req = Bike.builder()
                .colour("<value>")
                .build();

        DiscriminatedOneMultipleMembershipsHasWheelsResponse res = sdk.unions().discriminatedOneMultipleMembershipsHasWheels()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                     | Type                                          | Required                                      | Description                                   |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| `request`                                     | [HasWheels](../../models/shared/HasWheels.md) | :heavy_check_mark:                            | The request object to use for the request.    |

### Response

**[DiscriminatedOneMultipleMembershipsHasWheelsResponse](../../models/operations/DiscriminatedOneMultipleMembershipsHasWheelsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## flattenedTypedObjectPost

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.FlattenedTypedObjectPostResponse;
import org.openapis.openapi.models.shared.FlattenedTypedObject1;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.TypedObject1;
import org.openapis.openapi.models.shared.TypedObject1Type;

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

        FlattenedTypedObject1 req = FlattenedTypedObject1.of(TypedObject1.builder()
                .type(TypedObject1Type.OBJ1)
                .value("<value>")
                .build());

        FlattenedTypedObjectPostResponse res = sdk.unions().flattenedTypedObjectPost()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [FlattenedTypedObject1](../../models/shared/FlattenedTypedObject1.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[FlattenedTypedObjectPostResponse](../../models/operations/FlattenedTypedObjectPostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## infectedWithAny

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.InfectedWithAnyResponse;
import org.openapis.openapi.models.shared.InfectedWithAny;
import org.openapis.openapi.models.shared.InfectedWithAnyData;
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

        InfectedWithAny req = InfectedWithAny.builder()
                .data(InfectedWithAnyData.of("<value>"))
                .build();

        InfectedWithAnyResponse res = sdk.unions().infectedWithAny()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [InfectedWithAny](../../models/shared/InfectedWithAny.md) | :heavy_check_mark:                                        | The request object to use for the request.                |

### Response

**[InfectedWithAnyResponse](../../models/operations/InfectedWithAnyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## mixedTypeOneOfPost

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.MixedTypeOneOfPostRequestBody;
import org.openapis.openapi.models.operations.MixedTypeOneOfPostResponse;
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

        MixedTypeOneOfPostRequestBody req = MixedTypeOneOfPostRequestBody.of(984138L);

        MixedTypeOneOfPostResponse res = sdk.unions().mixedTypeOneOfPost()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [MixedTypeOneOfPostRequestBody](../../models/operations/MixedTypeOneOfPostRequestBody.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[MixedTypeOneOfPostResponse](../../models/operations/MixedTypeOneOfPostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## mixedUnionTypes

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.MixedUnionTypesResponse;
import org.openapis.openapi.models.shared.Bike;
import org.openapis.openapi.models.shared.MixedUnionTypes;
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

        MixedUnionTypes req = MixedUnionTypes.of(Bike.builder()
                .colour("<value>")
                .build());

        MixedUnionTypesResponse res = sdk.unions().mixedUnionTypes()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [MixedUnionTypes](../../models/shared/MixedUnionTypes.md) | :heavy_check_mark:                                        | The request object to use for the request.                |

### Response

**[MixedUnionTypesResponse](../../models/operations/MixedUnionTypesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## multiMatchAnyOf

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.MultiMatchAnyOfResponse;
import org.openapis.openapi.models.shared.AnyOfMultiMatch;
import org.openapis.openapi.models.shared.AnyOfMultiMatchMember2;
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

        AnyOfMultiMatch req = AnyOfMultiMatch.of(AnyOfMultiMatchMember2.builder()
                .description("porter unto yum merrily spherical soon crumble rebuild yahoo")
                .name("<value>")
                .build());

        MultiMatchAnyOfResponse res = sdk.unions().multiMatchAnyOf()
                .request(req)
                .call();

        if (res.anyOfMultiMatch().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [AnyOfMultiMatch](../../models/shared/AnyOfMultiMatch.md) | :heavy_check_mark:                                        | The request object to use for the request.                |

### Response

**[MultiMatchAnyOfResponse](../../models/operations/MultiMatchAnyOfResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## nestedArrayOfDiscriminatedUnions

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.NestedArrayOfDiscriminatedUnionsResponse;
import org.openapis.openapi.models.shared.DeepObjectWithType;
import org.openapis.openapi.models.shared.DeepObjectWithTypeAny;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.NestedArrayOfDiscriminatedUnions;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;
import org.openapis.openapi.models.shared.SimpleObjectWithType;
import org.openapis.openapi.models.shared.SimpleObjectWithTypeInt32Enum;
import org.openapis.openapi.models.shared.SimpleObjectWithTypeIntEnum;

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

        NestedArrayOfDiscriminatedUnions req = NestedArrayOfDiscriminatedUnions.builder()
                .nestedArray(List.of(
                    List.of(
                        DeepObjectWithType.builder()
                            .any(DeepObjectWithTypeAny.of(SimpleObject.builder()
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
                                .build()))
                            .arr(List.of(
                                SimpleObject.builder()
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
                                    .build(),
                                SimpleObject.builder()
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
                                    .build()))
                            .bool(true)
                            .int_(1L)
                            .map(Map.ofEntries(
                                Map.entry("key", SimpleObject.builder()
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
                                    .build()),
                                Map.entry("key2", SimpleObject.builder()
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
                                    .build())))
                            .num(1.1d)
                            .obj(SimpleObject.builder()
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
                            .str("test")
                            .build()),
                    List.of(
                        SimpleObjectWithType.builder()
                            .any("any")
                            .bool(true)
                            .date(LocalDate.parse("2020-01-01"))
                            .dateTime(OffsetDateTime.parse("2020-01-01T00:00:00.001Z"))
                            .enum_(Enum.ONE)
                            .float32(1.1f)
                            .int_(1L)
                            .int32(1)
                            .int32Enum(SimpleObjectWithTypeInt32Enum.FIFTY_FIVE)
                            .intEnum(SimpleObjectWithTypeIntEnum.Second)
                            .num(1.1d)
                            .str("test")
                            .type("<value>")
                            .bigint(new BigInteger("8821239038968084"))
                            .bigintStr(new BigInteger("9223372036854775808"))
                            .boolOpt(true)
                            .decimal(new BigDecimal("3.141592653589793"))
                            .decimalStr(new BigDecimal("3.14159265358979344719667586"))
                            .float64Str("1.1")
                            .int64Str("100")
                            .strOpt("testOptional")
                            .build())))
                .build();

        NestedArrayOfDiscriminatedUnionsResponse res = sdk.unions().nestedArrayOfDiscriminatedUnions()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [NestedArrayOfDiscriminatedUnions](../../models/shared/NestedArrayOfDiscriminatedUnions.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[NestedArrayOfDiscriminatedUnionsResponse](../../models/operations/NestedArrayOfDiscriminatedUnionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## nullableOneOfRefInObjectPost

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.NullableOneOfRefInObjectPostResponse;
import org.openapis.openapi.models.shared.NullableOneOfRefInObject;
import org.openapis.openapi.models.shared.NullableOneOfTwo;
import org.openapis.openapi.models.shared.OneOfOne;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.TypedObject1;
import org.openapis.openapi.models.shared.TypedObject1Type;
import org.openapis.openapi.models.shared.TypedObject2;
import org.openapis.openapi.models.shared.TypedObject2Type;

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

        NullableOneOfRefInObject req = NullableOneOfRefInObject.builder()
                .nullableOneOfOne(TypedObject1.builder()
                    .type(TypedObject1Type.OBJ1)
                    .value("<value>")
                    .build())
                .nullableOneOfTwo(NullableOneOfTwo.of(TypedObject2.builder()
                    .type(TypedObject2Type.OBJ2)
                    .value("<value>")
                    .build()))
                .oneOfOne(OneOfOne.of(TypedObject1.builder()
                    .type(TypedObject1Type.OBJ1)
                    .value("<value>")
                    .build()))
                .build();

        NullableOneOfRefInObjectPostResponse res = sdk.unions().nullableOneOfRefInObjectPost()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [NullableOneOfRefInObject](../../models/shared/NullableOneOfRefInObject.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[NullableOneOfRefInObjectPostResponse](../../models/operations/NullableOneOfRefInObjectPostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## nullableOneOfSchemaPost

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.NullableOneOfSchemaPostRequestBody;
import org.openapis.openapi.models.operations.NullableOneOfSchemaPostResponse;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.TypedObject2;
import org.openapis.openapi.models.shared.TypedObject2Type;

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

        NullableOneOfSchemaPostRequestBody req = NullableOneOfSchemaPostRequestBody.of(TypedObject2.builder()
                .type(TypedObject2Type.OBJ2)
                .value("<value>")
                .build());

        NullableOneOfSchemaPostResponse res = sdk.unions().nullableOneOfSchemaPost()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [NullableOneOfSchemaPostRequestBody](../../models/operations/NullableOneOfSchemaPostRequestBody.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[NullableOneOfSchemaPostResponse](../../models/operations/NullableOneOfSchemaPostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## nullableOneOfTypeInObjectPost

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.NullableOneOfTypeInObjectPostResponse;
import org.openapis.openapi.models.shared.NullableOneOfTypeInObject;
import org.openapis.openapi.models.shared.NullableOneOfTypeInObjectNullableOneOfTwo;
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

        NullableOneOfTypeInObject req = NullableOneOfTypeInObject.builder()
                .nullableOneOfOne(false)
                .nullableOneOfTwo(NullableOneOfTypeInObjectNullableOneOfTwo.of(267984L))
                .oneOfOne(false)
                .build();

        NullableOneOfTypeInObjectPostResponse res = sdk.unions().nullableOneOfTypeInObjectPost()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [NullableOneOfTypeInObject](../../models/shared/NullableOneOfTypeInObject.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[NullableOneOfTypeInObjectPostResponse](../../models/operations/NullableOneOfTypeInObjectPostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## nullableTypedObjectPost

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.NullableTypedObjectPostResponse;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.TypedObject1;
import org.openapis.openapi.models.shared.TypedObject1Type;

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

        TypedObject1 req = TypedObject1.builder()
                .type(TypedObject1Type.OBJ1)
                .value("<value>")
                .build();

        NullableTypedObjectPostResponse res = sdk.unions().nullableTypedObjectPost()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `request`                                           | [TypedObject1](../../models/shared/TypedObject1.md) | :heavy_check_mark:                                  | The request object to use for the request.          |

### Response

**[NullableTypedObjectPostResponse](../../models/operations/NullableTypedObjectPostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## oneOfOverlappingObjects

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.OneOfOverlappingObjectsRequestBody;
import org.openapis.openapi.models.operations.OneOfOverlappingObjectsResponse;
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

        OneOfOverlappingObjectsRequestBody req = OneOfOverlappingObjectsRequestBody.builder()
                .field1("<value>")
                .build();

        OneOfOverlappingObjectsResponse res = sdk.unions().oneOfOverlappingObjects()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [OneOfOverlappingObjectsRequestBody](../../models/operations/OneOfOverlappingObjectsRequestBody.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[OneOfOverlappingObjectsResponse](../../models/operations/OneOfOverlappingObjectsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## primitiveTypeOneOfPost

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PrimitiveTypeOneOfPostRequestBody;
import org.openapis.openapi.models.operations.PrimitiveTypeOneOfPostResponse;
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

        PrimitiveTypeOneOfPostRequestBody req = PrimitiveTypeOneOfPostRequestBody.of("<value>");

        PrimitiveTypeOneOfPostResponse res = sdk.unions().primitiveTypeOneOfPost()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [PrimitiveTypeOneOfPostRequestBody](../../models/operations/PrimitiveTypeOneOfPostRequestBody.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[PrimitiveTypeOneOfPostResponse](../../models/operations/PrimitiveTypeOneOfPostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## stronglyTypedOneOfDiscriminatedPost

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.StronglyTypedOneOfDiscriminatedPostResponse;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.StronglyTypedOneOfDiscriminatedObject;
import org.openapis.openapi.models.shared.TaggedObject1;
import org.openapis.openapi.models.shared.TaggedObject1Tag;

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

        StronglyTypedOneOfDiscriminatedObject req = TaggedObject1.builder()
                .imageURL("https://simplistic-waterspout.org")
                .tag(TaggedObject1Tag.TAG1)
                .build();

        StronglyTypedOneOfDiscriminatedPostResponse res = sdk.unions().stronglyTypedOneOfDiscriminatedPost()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [StronglyTypedOneOfDiscriminatedObject](../../models/shared/StronglyTypedOneOfDiscriminatedObject.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[StronglyTypedOneOfDiscriminatedPostResponse](../../models/operations/StronglyTypedOneOfDiscriminatedPostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## stronglyTypedOneOfPost

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.StronglyTypedOneOfPostResponse;
import org.openapis.openapi.models.shared.DeepObjectWithType;
import org.openapis.openapi.models.shared.DeepObjectWithTypeAny;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;
import org.openapis.openapi.models.shared.StronglyTypedOneOfObject;

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

        StronglyTypedOneOfObject req = DeepObjectWithType.builder()
                .any(DeepObjectWithTypeAny.of(SimpleObject.builder()
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
                    .build()))
                .arr(List.of(
                    SimpleObject.builder()
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
                        .build(),
                    SimpleObject.builder()
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
                        .build()))
                .bool(true)
                .int_(1L)
                .map(Map.ofEntries(
                    Map.entry("key", SimpleObject.builder()
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
                        .build()),
                    Map.entry("key2", SimpleObject.builder()
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
                        .build())))
                .num(1.1d)
                .obj(SimpleObject.builder()
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
                .str("test")
                .build();

        StronglyTypedOneOfPostResponse res = sdk.unions().stronglyTypedOneOfPost()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [StronglyTypedOneOfObject](../../models/shared/StronglyTypedOneOfObject.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[StronglyTypedOneOfPostResponse](../../models/operations/StronglyTypedOneOfPostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## stronglyTypedOneOfPostWithNonStandardDiscriminatorName

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.StronglyTypedOneOfPostWithNonStandardDiscriminatorNameResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObjectWithNonStandardTypeName;
import org.openapis.openapi.models.shared.SimpleObjectWithNonStandardTypeNameInt32Enum;
import org.openapis.openapi.models.shared.SimpleObjectWithNonStandardTypeNameIntEnum;
import org.openapis.openapi.models.shared.StronglyTypedOneOfObjectWithNonStandardDiscriminatorName;

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

        StronglyTypedOneOfObjectWithNonStandardDiscriminatorName req = SimpleObjectWithNonStandardTypeName.builder()
                .any("any")
                .bool(true)
                .date(LocalDate.parse("2020-01-01"))
                .dateTime(OffsetDateTime.parse("2020-01-01T00:00:00.001Z"))
                .enum_(Enum.ONE)
                .float32(1.1f)
                .int_(1L)
                .int32(1)
                .int32Enum(SimpleObjectWithNonStandardTypeNameInt32Enum.FIFTY_FIVE)
                .intEnum(SimpleObjectWithNonStandardTypeNameIntEnum.Second)
                .num(1.1d)
                .objType("<value>")
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

        StronglyTypedOneOfPostWithNonStandardDiscriminatorNameResponse res = sdk.unions().stronglyTypedOneOfPostWithNonStandardDiscriminatorName()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                   | Type                                                                                                                                        | Required                                                                                                                                    | Description                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                   | [StronglyTypedOneOfObjectWithNonStandardDiscriminatorName](../../models/shared/StronglyTypedOneOfObjectWithNonStandardDiscriminatorName.md) | :heavy_check_mark:                                                                                                                          | The request object to use for the request.                                                                                                  |

### Response

**[StronglyTypedOneOfPostWithNonStandardDiscriminatorNameResponse](../../models/operations/StronglyTypedOneOfPostWithNonStandardDiscriminatorNameResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## typedObjectNullableOneOfPost

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.TypedObjectNullableOneOfPostResponse;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.TypedObject2;
import org.openapis.openapi.models.shared.TypedObject2Type;
import org.openapis.openapi.models.shared.TypedObjectNullableOneOf;

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

        TypedObjectNullableOneOf req = TypedObjectNullableOneOf.of(TypedObject2.builder()
                .type(TypedObject2Type.OBJ2)
                .value("<value>")
                .build());

        TypedObjectNullableOneOfPostResponse res = sdk.unions().typedObjectNullableOneOfPost()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [TypedObjectNullableOneOf](../../models/shared/TypedObjectNullableOneOf.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[TypedObjectNullableOneOfPostResponse](../../models/operations/TypedObjectNullableOneOfPostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## typedObjectOneOfPost

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.TypedObjectOneOfPostResponse;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.TypedObject3;
import org.openapis.openapi.models.shared.TypedObject3Type;
import org.openapis.openapi.models.shared.TypedObjectOneOf;

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

        TypedObjectOneOf req = TypedObjectOneOf.of(TypedObject3.builder()
                .type(TypedObject3Type.OBJ3)
                .value("<value>")
                .build());

        TypedObjectOneOfPostResponse res = sdk.unions().typedObjectOneOfPost()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [TypedObjectOneOf](../../models/shared/TypedObjectOneOf.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[TypedObjectOneOfPostResponse](../../models/operations/TypedObjectOneOfPostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## unionBigIntStrDecimal

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.math.BigInteger;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.UnionBigIntStrDecimalRequestBody;
import org.openapis.openapi.models.operations.UnionBigIntStrDecimalResponse;
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

        UnionBigIntStrDecimalRequestBody req = UnionBigIntStrDecimalRequestBody.of(new BigInteger("2045.57"));

        UnionBigIntStrDecimalResponse res = sdk.unions().unionBigIntStrDecimal()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [UnionBigIntStrDecimalRequestBody](../../models/operations/UnionBigIntStrDecimalRequestBody.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[UnionBigIntStrDecimalResponse](../../models/operations/UnionBigIntStrDecimalResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## unionDateNull

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.time.LocalDate;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.UnionDateNullResponse;
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

        LocalDate req = LocalDate.parse("2023-11-26");

        UnionDateNullResponse res = sdk.unions().unionDateNull()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [LocalDate](../../models//.md)             | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[UnionDateNullResponse](../../models/operations/UnionDateNullResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## unionDateTimeBigInt

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.UnionDateTimeBigIntRequestBody;
import org.openapis.openapi.models.operations.UnionDateTimeBigIntResponse;
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

        UnionDateTimeBigIntRequestBody req = UnionDateTimeBigIntRequestBody.of(OffsetDateTime.parse("2022-10-13T05:48:39.528Z"));

        UnionDateTimeBigIntResponse res = sdk.unions().unionDateTimeBigInt()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UnionDateTimeBigIntRequestBody](../../models/operations/UnionDateTimeBigIntRequestBody.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UnionDateTimeBigIntResponse](../../models/operations/UnionDateTimeBigIntResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## unionDateTimeNull

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.UnionDateTimeNullResponse;
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

        OffsetDateTime req = OffsetDateTime.parse("2023-04-13T05:53:48.181Z");

        UnionDateTimeNullResponse res = sdk.unions().unionDateTimeNull()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [OffsetDateTime](../../models//.md)        | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[UnionDateTimeNullResponse](../../models/operations/UnionDateTimeNullResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## unionMap

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.util.Map;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.UnionMapRequestBody;
import org.openapis.openapi.models.operations.UnionMapResponse;
import org.openapis.openapi.models.shared.OneOfPrimitives;
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

        UnionMapRequestBody req = UnionMapRequestBody.builder()
                .input(Map.ofEntries(
                    Map.entry("key", OneOfPrimitives.of(true)),
                    Map.entry("key1", OneOfPrimitives.of("<value>"))))
                .build();

        UnionMapResponse res = sdk.unions().unionMap()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [UnionMapRequestBody](../../models/operations/UnionMapRequestBody.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[UnionMapResponse](../../models/operations/UnionMapResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## unionMapOptional

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.UnionMapOptionalRequestBody;
import org.openapis.openapi.models.operations.UnionMapOptionalResponse;
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

        UnionMapOptionalRequestBody req = UnionMapOptionalRequestBody.builder()
                .build();

        UnionMapOptionalResponse res = sdk.unions().unionMapOptional()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UnionMapOptionalRequestBody](../../models/operations/UnionMapOptionalRequestBody.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UnionMapOptionalResponse](../../models/operations/UnionMapOptionalResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## unionNestedEnumsForm

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.util.List;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.UnionNestedEnumsFormRequestBody;
import org.openapis.openapi.models.operations.UnionNestedEnumsFormResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.NestedEnumArray;
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

        UnionNestedEnumsFormRequestBody req = UnionNestedEnumsFormRequestBody.of(NestedEnumArray.builder()
                .enums(List.of(
                    Enum.ONE))
                .tags("<value>")
                .build());

        UnionNestedEnumsFormResponse res = sdk.unions().unionNestedEnumsForm()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [UnionNestedEnumsFormRequestBody](../../models/operations/UnionNestedEnumsFormRequestBody.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[UnionNestedEnumsFormResponse](../../models/operations/UnionNestedEnumsFormResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## unionNestedEnumsMultipart

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.util.List;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.Enums;
import org.openapis.openapi.models.operations.UnionNestedEnumsMultipartRequestBody;
import org.openapis.openapi.models.operations.UnionNestedEnumsMultipartResponse;
import org.openapis.openapi.models.shared.Enum;
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

        UnionNestedEnumsMultipartRequestBody req = UnionNestedEnumsMultipartRequestBody.builder()
                .enums(Enums.of(List.of(
                    Enum.ONE)))
                .build();

        UnionNestedEnumsMultipartResponse res = sdk.unions().unionNestedEnumsMultipart()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [UnionNestedEnumsMultipartRequestBody](../../models/operations/UnionNestedEnumsMultipartRequestBody.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[UnionNestedEnumsMultipartResponse](../../models/operations/UnionNestedEnumsMultipartResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## unionOfArraysPost

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.util.List;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.UnionOfArraysPostResponse;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.UnionOfArrays2;
import org.openapis.openapi.models.shared.UnionOfArrays;

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

        UnionOfArrays req = UnionOfArrays.ofUnionOfArrays2(List.of(
                UnionOfArrays2.builder()
                    .bar("teststring")
                    .build()));

        UnionOfArraysPostResponse res = sdk.unions().unionOfArraysPost()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `request`                                             | [UnionOfArrays](../../models/shared/UnionOfArrays.md) | :heavy_check_mark:                                    | The request object to use for the request.            |

### Response

**[UnionOfArraysPostResponse](../../models/operations/UnionOfArraysPostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## weaklyTypedOneOfNullEnumPost

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.WeaklyTypedOneOfNullEnumPostResponse;
import org.openapis.openapi.models.shared.Any;
import org.openapis.openapi.models.shared.DeepObject;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;
import org.openapis.openapi.models.shared.WeaklyTypedOneOfNullEnumObject;

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

        WeaklyTypedOneOfNullEnumObject req = WeaklyTypedOneOfNullEnumObject.of(DeepObject.builder()
                .any(Any.of(SimpleObject.builder()
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
                    .build()))
                .arr(List.of(
                    SimpleObject.builder()
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
                        .build(),
                    SimpleObject.builder()
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
                        .build()))
                .bool(true)
                .int_(1L)
                .map(Map.ofEntries(
                    Map.entry("key", SimpleObject.builder()
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
                        .build()),
                    Map.entry("key2", SimpleObject.builder()
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
                        .build())))
                .num(1.1d)
                .obj(SimpleObject.builder()
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
                .str("test")
                .build());

        WeaklyTypedOneOfNullEnumPostResponse res = sdk.unions().weaklyTypedOneOfNullEnumPost()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [WeaklyTypedOneOfNullEnumObject](../../models/shared/WeaklyTypedOneOfNullEnumObject.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[WeaklyTypedOneOfNullEnumPostResponse](../../models/operations/WeaklyTypedOneOfNullEnumPostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## weaklyTypedOneOfPost

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.WeaklyTypedOneOfPostResponse;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.models.shared.Int32Enum;
import org.openapis.openapi.models.shared.IntEnum;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SimpleObject;
import org.openapis.openapi.models.shared.WeaklyTypedOneOfObject;

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

        WeaklyTypedOneOfObject req = WeaklyTypedOneOfObject.of(SimpleObject.builder()
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
                .build());

        WeaklyTypedOneOfPostResponse res = sdk.unions().weaklyTypedOneOfPost()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [WeaklyTypedOneOfObject](../../models/shared/WeaklyTypedOneOfObject.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[WeaklyTypedOneOfPostResponse](../../models/operations/WeaklyTypedOneOfPostResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |