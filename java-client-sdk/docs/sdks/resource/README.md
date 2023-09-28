# Resource
(*resource*)

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
                file = new CreateFileRequestBodyFile("sed".getBytes(), "voluptatem");;
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
                                add(new ExampleResourceChocolates("eveniet") {{
                                    description = "alias";
                                }}),
                            }}, "hic", "voluptatem",                 new ExampleBoat(5629.48d, "officia", ExampleBoatType.BOAT) {{
                                createdAt = OffsetDateTime.parse("2022-10-25T03:32:12.534Z");
                                length = 8959.12d;
                                name = "Nicholas Brekke";
                                type = ExampleBoatType.BOAT;
                                updatedAt = OffsetDateTime.parse("2020-01-29T06:30:42.778Z");
                            }}) {{
                arrayOfNumber = new Double[]{{
                    add(7304.78d),
                }};
                arrayOfString = new String[]{{
                    add("totam"),
                }};
                createdAt = OffsetDateTime.parse("2022-08-08T18:13:57.874Z");
                enumNumber = ExampleResourceEnumNumber.TWO;
                enumStr = ExampleResourceEnumStr.THREE;
                mapOfInteger = new java.util.HashMap<String, Long>() {{
                    put("ducimus", 140957L);
                }};
                mapOfString = new java.util.HashMap<String, String>() {{
                    put("velit", "reiciendis");
                }};
                updatedAt = OffsetDateTime.parse("2020-06-02T01:41:14.280Z");
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

            DeleteResourceResponse res = sdk.resource.deleteResource("laborum");

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

            GetResourceResponse res = sdk.resource.getResource("natus");

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

            UpdateResourceResponse res = sdk.resource.updateResource("accusamus");

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

