# Unions
(*unions()*)

## Overview

Endpoints for testing union types.

### Available Operations

* [collectionOneOfPost](#collectiononeofpost)
* [constDiscriminatedOneOf](#constdiscriminatedoneof)
* [discriminatedOneMultipleMemberships](#discriminatedonemultiplememberships)
* [discriminatedOneMultipleMembershipsHasWheels](#discriminatedonemultiplemembershipshaswheels)
* [flattenedTypedObjectPost](#flattenedtypedobjectpost)
* [infectedWithAny](#infectedwithany)
* [mixedTypeOneOfPost](#mixedtypeoneofpost)
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
* [unionNestedEnumsForm](#unionnestedenumsform)
* [unionNestedEnumsMultipart](#unionnestedenumsmultipart)
* [weaklyTypedOneOfNullEnumPost](#weaklytypedoneofnullenumpost)
* [weaklyTypedOneOfPost](#weaklytypedoneofpost)

## collectionOneOfPost

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            CollectionOneOfObject req = CollectionOneOfObject.of(java.util.List.of(
                    "<value>"));

            CollectionOneOfPostResponse res = sdk.unions().collectionOneOfPost()
                .request(req)
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                | [org.openapis.openapi.models.shared.CollectionOneOfObject](../../models/shared/CollectionOneOfObject.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |


### Response

**[org.openapis.openapi.models.operations.CollectionOneOfPostResponse](../../models/operations/CollectionOneOfPostResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## constDiscriminatedOneOf

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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
                    .imageURL("<value>")
                    .build();

            ConstDiscriminatedOneOfResponse res = sdk.unions().constDiscriminatedOneOf()
                .request(req)
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [org.openapis.openapi.models.shared.ConstDiscriminatedOneOf](../../models/shared/ConstDiscriminatedOneOf.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[org.openapis.openapi.models.operations.ConstDiscriminatedOneOfResponse](../../models/operations/ConstDiscriminatedOneOfResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## discriminatedOneMultipleMemberships

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                    | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `request`                                                                    | [org.openapis.openapi.models.shared.Vehicle](../../models/shared/Vehicle.md) | :heavy_check_mark:                                                           | The request object to use for the request.                                   |


### Response

**[org.openapis.openapi.models.operations.DiscriminatedOneMultipleMembershipsResponse](../../models/operations/DiscriminatedOneMultipleMembershipsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## discriminatedOneMultipleMembershipsHasWheels

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                        | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `request`                                                                        | [org.openapis.openapi.models.shared.HasWheels](../../models/shared/HasWheels.md) | :heavy_check_mark:                                                               | The request object to use for the request.                                       |


### Response

**[org.openapis.openapi.models.operations.DiscriminatedOneMultipleMembershipsHasWheelsResponse](../../models/operations/DiscriminatedOneMultipleMembershipsHasWheelsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## flattenedTypedObjectPost

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                | [org.openapis.openapi.models.shared.FlattenedTypedObject1](../../models/shared/FlattenedTypedObject1.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |


### Response

**[org.openapis.openapi.models.operations.FlattenedTypedObjectPostResponse](../../models/operations/FlattenedTypedObjectPostResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## infectedWithAny

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                    | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `request`                                                                                    | [org.openapis.openapi.models.shared.InfectedWithAny](../../models/shared/InfectedWithAny.md) | :heavy_check_mark:                                                                           | The request object to use for the request.                                                   |


### Response

**[org.openapis.openapi.models.operations.InfectedWithAnyResponse](../../models/operations/InfectedWithAnyResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## mixedTypeOneOfPost

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            MixedTypeOneOfPostRequestBody req = org.openapis.openapi.models.operations.MixedTypeOneOfPostRequestBody.of(618017L);

            MixedTypeOneOfPostResponse res = sdk.unions().mixedTypeOneOfPost()
                .request(req)
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [org.openapis.openapi.models.operations.MixedTypeOneOfPostRequestBody](../../models/operations/MixedTypeOneOfPostRequestBody.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[org.openapis.openapi.models.operations.MixedTypeOneOfPostResponse](../../models/operations/MixedTypeOneOfPostResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## nullableOneOfRefInObjectPost

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [org.openapis.openapi.models.shared.NullableOneOfRefInObject](../../models/shared/NullableOneOfRefInObject.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[org.openapis.openapi.models.operations.NullableOneOfRefInObjectPostResponse](../../models/operations/NullableOneOfRefInObjectPostResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## nullableOneOfSchemaPost

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            NullableOneOfSchemaPostRequestBody req = org.openapis.openapi.models.operations.NullableOneOfSchemaPostRequestBody.of(TypedObject2.builder()
                    .type(TypedObject2Type.OBJ2)
                    .value("<value>")
                    .build());

            NullableOneOfSchemaPostResponse res = sdk.unions().nullableOneOfSchemaPost()
                .request(req)
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [org.openapis.openapi.models.operations.NullableOneOfSchemaPostRequestBody](../../models/operations/NullableOneOfSchemaPostRequestBody.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[org.openapis.openapi.models.operations.NullableOneOfSchemaPostResponse](../../models/operations/NullableOneOfSchemaPostResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## nullableOneOfTypeInObjectPost

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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
                .nullableOneOfTwo(NullableOneOfTypeInObjectNullableOneOfTwo.of(873677L))
                .oneOfOne(false)
                .build();

            NullableOneOfTypeInObjectPostResponse res = sdk.unions().nullableOneOfTypeInObjectPost()
                .request(req)
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [org.openapis.openapi.models.shared.NullableOneOfTypeInObject](../../models/shared/NullableOneOfTypeInObject.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[org.openapis.openapi.models.operations.NullableOneOfTypeInObjectPostResponse](../../models/operations/NullableOneOfTypeInObjectPostResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## nullableTypedObjectPost

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `request`                                                                              | [org.openapis.openapi.models.shared.TypedObject1](../../models/shared/TypedObject1.md) | :heavy_check_mark:                                                                     | The request object to use for the request.                                             |


### Response

**[org.openapis.openapi.models.operations.NullableTypedObjectPostResponse](../../models/operations/NullableTypedObjectPostResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## oneOfOverlappingObjects

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [org.openapis.openapi.models.operations.OneOfOverlappingObjectsRequestBody](../../models/operations/OneOfOverlappingObjectsRequestBody.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[org.openapis.openapi.models.operations.OneOfOverlappingObjectsResponse](../../models/operations/OneOfOverlappingObjectsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## primitiveTypeOneOfPost

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            PrimitiveTypeOneOfPostRequestBody req = org.openapis.openapi.models.operations.PrimitiveTypeOneOfPostRequestBody.of("<value>");

            PrimitiveTypeOneOfPostResponse res = sdk.unions().primitiveTypeOneOfPost()
                .request(req)
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [org.openapis.openapi.models.operations.PrimitiveTypeOneOfPostRequestBody](../../models/operations/PrimitiveTypeOneOfPostRequestBody.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[org.openapis.openapi.models.operations.PrimitiveTypeOneOfPostResponse](../../models/operations/PrimitiveTypeOneOfPostResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## stronglyTypedOneOfDiscriminatedPost

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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
                    .imageURL("<value>")
                    .tag(TaggedObject1Tag.TAG1)
                    .build();

            StronglyTypedOneOfDiscriminatedPostResponse res = sdk.unions().stronglyTypedOneOfDiscriminatedPost()
                .request(req)
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [org.openapis.openapi.models.shared.StronglyTypedOneOfDiscriminatedObject](../../models/shared/StronglyTypedOneOfDiscriminatedObject.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[org.openapis.openapi.models.operations.StronglyTypedOneOfDiscriminatedPostResponse](../../models/operations/StronglyTypedOneOfDiscriminatedPostResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## stronglyTypedOneOfPost

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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
                    .arr(java.util.List.of(
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
                    .map(java.util.Map.ofEntries(
                            entry("key", SimpleObject.builder()
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
                            entry("key2", SimpleObject.builder()
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
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [org.openapis.openapi.models.shared.StronglyTypedOneOfObject](../../models/shared/StronglyTypedOneOfObject.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[org.openapis.openapi.models.operations.StronglyTypedOneOfPostResponse](../../models/operations/StronglyTypedOneOfPostResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## stronglyTypedOneOfPostWithNonStandardDiscriminatorName

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [org.openapis.openapi.models.shared.StronglyTypedOneOfObjectWithNonStandardDiscriminatorName](../../models/shared/StronglyTypedOneOfObjectWithNonStandardDiscriminatorName.md) | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |


### Response

**[org.openapis.openapi.models.operations.StronglyTypedOneOfPostWithNonStandardDiscriminatorNameResponse](../../models/operations/StronglyTypedOneOfPostWithNonStandardDiscriminatorNameResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## typedObjectNullableOneOfPost

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [org.openapis.openapi.models.shared.TypedObjectNullableOneOf](../../models/shared/TypedObjectNullableOneOf.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[org.openapis.openapi.models.operations.TypedObjectNullableOneOfPostResponse](../../models/operations/TypedObjectNullableOneOfPostResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## typedObjectOneOfPost

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                      | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `request`                                                                                      | [org.openapis.openapi.models.shared.TypedObjectOneOf](../../models/shared/TypedObjectOneOf.md) | :heavy_check_mark:                                                                             | The request object to use for the request.                                                     |


### Response

**[org.openapis.openapi.models.operations.TypedObjectOneOfPostResponse](../../models/operations/TypedObjectOneOfPostResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## unionBigIntStrDecimal

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            UnionBigIntStrDecimalRequestBody req = org.openapis.openapi.models.operations.UnionBigIntStrDecimalRequestBody.of(new BigDecimal("548.89"));

            UnionBigIntStrDecimalResponse res = sdk.unions().unionBigIntStrDecimal()
                .request(req)
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [org.openapis.openapi.models.operations.UnionBigIntStrDecimalRequestBody](../../models/operations/UnionBigIntStrDecimalRequestBody.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[org.openapis.openapi.models.operations.UnionBigIntStrDecimalResponse](../../models/operations/UnionBigIntStrDecimalResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## unionDateNull

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [LocalDate](../../models//.md)             | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[org.openapis.openapi.models.operations.UnionDateNullResponse](../../models/operations/UnionDateNullResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## unionDateTimeBigInt

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            UnionDateTimeBigIntRequestBody req = org.openapis.openapi.models.operations.UnionDateTimeBigIntRequestBody.of(OffsetDateTime.parse("2022-06-19T22:09:58.311Z"));

            UnionDateTimeBigIntResponse res = sdk.unions().unionDateTimeBigInt()
                .request(req)
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [org.openapis.openapi.models.operations.UnionDateTimeBigIntRequestBody](../../models/operations/UnionDateTimeBigIntRequestBody.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[org.openapis.openapi.models.operations.UnionDateTimeBigIntResponse](../../models/operations/UnionDateTimeBigIntResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## unionDateTimeNull

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            OffsetDateTime req = OffsetDateTime.parse("2023-04-13T05:53:47.874Z");

            UnionDateTimeNullResponse res = sdk.unions().unionDateTimeNull()
                .request(req)
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [OffsetDateTime](../../models//.md)        | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[org.openapis.openapi.models.operations.UnionDateTimeNullResponse](../../models/operations/UnionDateTimeNullResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## unionMap

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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
                .input(java.util.Map.ofEntries(
                        entry("key", OneOfPrimitives.of("<value>"))))
                .build();

            UnionMapResponse res = sdk.unions().unionMap()
                .request(req)
                .call();

            if (res.res().isPresent()) {
                // handle response
            }
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [org.openapis.openapi.models.operations.UnionMapRequestBody](../../models/operations/UnionMapRequestBody.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[org.openapis.openapi.models.operations.UnionMapResponse](../../models/operations/UnionMapResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## unionNestedEnumsForm

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
                .build();

            UnionNestedEnumsFormRequestBody req = org.openapis.openapi.models.operations.UnionNestedEnumsFormRequestBody.of(NestedEnumArray.builder()
                    .enums(java.util.List.of(
                            Enum.ONE))
                    .tags("<value>")
                    .build());

            UnionNestedEnumsFormResponse res = sdk.unions().unionNestedEnumsForm()
                .request(req)
                .call();

            // handle response
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [org.openapis.openapi.models.operations.UnionNestedEnumsFormRequestBody](../../models/operations/UnionNestedEnumsFormRequestBody.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[org.openapis.openapi.models.operations.UnionNestedEnumsFormResponse](../../models/operations/UnionNestedEnumsFormResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## unionNestedEnumsMultipart

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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
                .enums(org.openapis.openapi.models.operations.Enums.of(java.util.List.of(
                            Enum.ONE)))
                .build();

            UnionNestedEnumsMultipartResponse res = sdk.unions().unionNestedEnumsMultipart()
                .request(req)
                .call();

            // handle response
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                                      | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                      | [org.openapis.openapi.models.operations.UnionNestedEnumsMultipartRequestBody](../../models/operations/UnionNestedEnumsMultipartRequestBody.md) | :heavy_check_mark:                                                                                                                             | The request object to use for the request.                                                                                                     |


### Response

**[org.openapis.openapi.models.operations.UnionNestedEnumsMultipartResponse](../../models/operations/UnionNestedEnumsMultipartResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## weaklyTypedOneOfNullEnumPost

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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
                    .arr(java.util.List.of(
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
                    .map(java.util.Map.ofEntries(
                            entry("key", SimpleObject.builder()
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
                            entry("key2", SimpleObject.builder()
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
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [org.openapis.openapi.models.shared.WeaklyTypedOneOfNullEnumObject](../../models/shared/WeaklyTypedOneOfNullEnumObject.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[org.openapis.openapi.models.operations.WeaklyTypedOneOfNullEnumPostResponse](../../models/operations/WeaklyTypedOneOfNullEnumPostResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## weaklyTypedOneOfPost

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.models.shared.Enum;
import org.openapis.openapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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
        } catch (org.openapis.openapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [org.openapis.openapi.models.shared.WeaklyTypedOneOfObject](../../models/shared/WeaklyTypedOneOfObject.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[org.openapis.openapi.models.operations.WeaklyTypedOneOfPostResponse](../../models/operations/WeaklyTypedOneOfPostResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
