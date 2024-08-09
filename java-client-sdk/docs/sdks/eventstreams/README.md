# Eventstreams
(*eventstreams()*)

## Overview

Endpoints for testing server-sent events streaming

### Available Operations

* [chat](#chat)
* [chatSkipSentinel](#chatskipsentinel)
* [differentDataSchemas](#differentdataschemas)
* [json](#json)
* [multiline](#multiline)
* [rich](#rich)
* [text](#text)

## chat

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.errors.SDKError;
import org.openapis.openapi.models.operations.ChatRequestBody;
import org.openapis.openapi.models.operations.ChatResponse;
import org.openapis.openapi.models.shared.ChatCompletionStream;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;

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

            ChatRequestBody req = ChatRequestBody.builder()
                .prompt("<value>")
                .build();

            ChatResponse res = sdk.eventstreams().chat()
                .request(req)
                .call();

            // handle event stream, must be closed after use!
            try (EventStream<ChatCompletionStream> events = res.events()) {
                events.stream().forEach(System.out::println);
            }
        } catch (SDKError e) {
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

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [ChatRequestBody](../../models/operations/ChatRequestBody.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |
| `serverURL`                                                   | *String*                                                      | :heavy_minus_sign:                                            | An optional server URL to use.                                |


### Response

**[ChatResponse](../../models/operations/ChatResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## chatSkipSentinel

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.errors.SDKError;
import org.openapis.openapi.models.operations.ChatSkipSentinelRequestBody;
import org.openapis.openapi.models.operations.ChatSkipSentinelResponse;
import org.openapis.openapi.models.shared.ChatCompletionEvent;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;

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

            ChatSkipSentinelRequestBody req = ChatSkipSentinelRequestBody.builder()
                .prompt("<value>")
                .build();

            ChatSkipSentinelResponse res = sdk.eventstreams().chatSkipSentinel()
                .request(req)
                .call();

            // handle event stream, must be closed after use!
            try (EventStream<ChatCompletionEvent> events = res.events()) {
                events.stream().forEach(System.out::println);
            }
        } catch (SDKError e) {
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

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ChatSkipSentinelRequestBody](../../models/operations/ChatSkipSentinelRequestBody.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |
| `serverURL`                                                                           | *String*                                                                              | :heavy_minus_sign:                                                                    | An optional server URL to use.                                                        |


### Response

**[ChatSkipSentinelResponse](../../models/operations/ChatSkipSentinelResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## differentDataSchemas

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.errors.SDKError;
import org.openapis.openapi.models.operations.DifferentDataSchemasResponse;
import org.openapis.openapi.models.shared.DifferentDataSchemas;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;

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

            DifferentDataSchemasResponse res = sdk.eventstreams().differentDataSchemas()
                .call();

            // handle event stream, must be closed after use!
            try (EventStream<DifferentDataSchemas> events = res.events()) {
                events.stream().forEach(System.out::println);
            }
        } catch (SDKError e) {
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

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[DifferentDataSchemasResponse](../../models/operations/DifferentDataSchemasResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## json

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.errors.SDKError;
import org.openapis.openapi.models.operations.JsonResponse;
import org.openapis.openapi.models.shared.JsonEvent;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;

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

            JsonResponse res = sdk.eventstreams().json()
                .call();

            // handle event stream, must be closed after use!
            try (EventStream<JsonEvent> events = res.events()) {
                events.stream().forEach(System.out::println);
            }
        } catch (SDKError e) {
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

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[JsonResponse](../../models/operations/JsonResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## multiline

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.errors.SDKError;
import org.openapis.openapi.models.operations.MultilineResponse;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.TextEvent;
import org.openapis.openapi.utils.EventStream;

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

            MultilineResponse res = sdk.eventstreams().multiline()
                .call();

            // handle event stream, must be closed after use!
            try (EventStream<TextEvent> events = res.events()) {
                events.stream().forEach(System.out::println);
            }
        } catch (SDKError e) {
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

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[MultilineResponse](../../models/operations/MultilineResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## rich

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.errors.SDKError;
import org.openapis.openapi.models.operations.RichResponse;
import org.openapis.openapi.models.shared.RichStream;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.utils.EventStream;

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

            RichResponse res = sdk.eventstreams().rich()
                .call();

            // handle event stream, must be closed after use!
            try (EventStream<RichStream> events = res.events()) {
                events.stream().forEach(System.out::println);
            }
        } catch (SDKError e) {
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

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[RichResponse](../../models/operations/RichResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## text

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.errors.SDKError;
import org.openapis.openapi.models.operations.TextResponse;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.TextEvent;
import org.openapis.openapi.utils.EventStream;

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

            TextResponse res = sdk.eventstreams().text()
                .call();

            // handle event stream, must be closed after use!
            try (EventStream<TextEvent> events = res.events()) {
                events.stream().forEach(System.out::println);
            }
        } catch (SDKError e) {
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

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |


### Response

**[TextResponse](../../models/operations/TextResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
