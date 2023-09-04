# resource

### Available Operations

* [createFile](#createfile)
* [createResource](#createresource)
* [deleteResource](#deleteresource)
* [getResource](#getresource)
* [updateResource](#updateresource)

## createFile

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.CreateFileRequestBody;
import org.openapis.openapi.models.operations.CreateFileRequestBodyFile;
import org.openapis.openapi.models.operations.CreateFileResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            CreateFileRequestBody req = new CreateFileRequestBody() {{
                file = new CreateFileRequestBodyFile("voluptatibus".getBytes(), "quaerat");;
            }};            

            CreateFileResponse res = sdk.resource.createFile(req);

            if (res.fileResource != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [org.openapis.openapi.models.operations.CreateFileRequestBody](../../models/operations/CreateFileRequestBody.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[org.openapis.openapi.models.operations.CreateFileResponse](../../models/operations/CreateFileResponse.md)**


## createResource

### Example Usage

```java
package hello.world;

import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.CreateResourceResponse;
import org.openapis.openapi.models.shared.ExampleBoat;
import org.openapis.openapi.models.shared.ExampleBoatType;
import org.openapis.openapi.models.shared.ExampleCar;
import org.openapis.openapi.models.shared.ExampleCarType;
import org.openapis.openapi.models.shared.ExampleResource;
import org.openapis.openapi.models.shared.ExampleResourceChocolates;
import org.openapis.openapi.models.shared.ExampleResourceEnumNumber;
import org.openapis.openapi.models.shared.ExampleResourceEnumStr;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            org.openapis.openapi.models.shared.ExampleResource req = new ExampleResource(                new org.openapis.openapi.models.shared.ExampleResourceChocolates[]{{
                                add(new ExampleResourceChocolates("nisi") {{
                                    description = "distinctio";
                                }}),
                                add(new ExampleResourceChocolates("nisi") {{
                                    description = "quis";
                                }}),
                                add(new ExampleResourceChocolates("minus") {{
                                    description = "libero";
                                }}),
                            }}, "facere", "facilis",                 new ExampleBoat(2072.96d, "iusto", ExampleBoatType.BOAT) {{
                                createdAt = OffsetDateTime.parse("2022-01-10T13:20:53.595Z");
                                length = 9745.89d;
                                name = "Raquel Greenfelder";
                                type = ExampleBoatType.BOAT;
                                updatedAt = OffsetDateTime.parse("2022-08-27T21:22:12.876Z");
                            }}) {{
                arrayOfNumber = new Double[]{{
                    add(5221.76d),
                    add(7538.9d),
                    add(8536.06d),
                }};
                arrayOfString = new String[]{{
                    add("officiis"),
                    add("ducimus"),
                    add("dolor"),
                }};
                createdAt = OffsetDateTime.parse("2022-05-18T15:26:53.505Z");
                enumNumber = ExampleResourceEnumNumber.THREE;
                enumStr = ExampleResourceEnumStr.ONE;
                mapOfInteger = new java.util.HashMap<String, Long>() {{
                    put("esse", 854115L);
                    put("ad", 134818L);
                }};
                mapOfString = new java.util.HashMap<String, String>() {{
                    put("delectus", "iusto");
                    put("dignissimos", "libero");
                }};
                updatedAt = OffsetDateTime.parse("2022-12-06T17:57:34.720Z");
            }};            

            CreateResourceResponse res = sdk.resource.createResource(req);

            if (res.exampleResource != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                    | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `request`                                                                                    | [org.openapis.openapi.models.shared.ExampleResource](../../models/shared/ExampleResource.md) | :heavy_check_mark:                                                                           | The request object to use for the request.                                                   |


### Response

**[org.openapis.openapi.models.operations.CreateResourceResponse](../../models/operations/CreateResourceResponse.md)**


## deleteResource

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.DeleteResourceRequest;
import org.openapis.openapi.models.operations.DeleteResourceResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            DeleteResourceResponse res = sdk.resource.deleteResource("incidunt");

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `resourceId`       | *String*           | :heavy_check_mark: | N/A                |


### Response

**[org.openapis.openapi.models.operations.DeleteResourceResponse](../../models/operations/DeleteResourceResponse.md)**


## getResource

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GetResourceRequest;
import org.openapis.openapi.models.operations.GetResourceResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            GetResourceResponse res = sdk.resource.getResource("accusamus");

            if (res.exampleResource != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `resourceId`       | *String*           | :heavy_check_mark: | N/A                |


### Response

**[org.openapis.openapi.models.operations.GetResourceResponse](../../models/operations/GetResourceResponse.md)**


## updateResource

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.UpdateResourceRequest;
import org.openapis.openapi.models.operations.UpdateResourceResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    apiKeyAuth = "Token YOUR_API_KEY";
                }})
                .setGlobalPathParam(100L)
                .setGlobalQueryParam("some example global query param")
                .build();

            UpdateResourceResponse res = sdk.resource.updateResource("saepe");

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `resourceId`       | *String*           | :heavy_check_mark: | N/A                |


### Response

**[org.openapis.openapi.models.operations.UpdateResourceResponse](../../models/operations/UpdateResourceResponse.md)**

