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
                file = new CreateFileRequestBodyFile("sequi".getBytes(), "nihil");;
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
                                add(new ExampleResourceChocolates("labore") {{
                                    description = "illo";
                                }}),
                                add(new ExampleResourceChocolates("aliquam") {{
                                    description = "assumenda";
                                }}),
                                add(new ExampleResourceChocolates("provident") {{
                                    description = "quisquam";
                                }}),
                            }}, "laudantium", "repudiandae",                 new ExampleBoat(8738.33d, "similique", ExampleBoatType.BOAT) {{
                                createdAt = OffsetDateTime.parse("2022-08-04T16:32:15.873Z");
                                length = 7239.42d;
                                name = "Willard McLaughlin";
                                type = ExampleBoatType.BOAT;
                                updatedAt = OffsetDateTime.parse("2022-08-22T06:12:50.001Z");
                            }}) {{
                arrayOfNumber = new Double[]{{
                    add(4348.27d),
                    add(2138.35d),
                    add(4138.01d),
                    add(7712.26d),
                }};
                arrayOfString = new String[]{{
                    add("aut"),
                    add("voluptatem"),
                }};
                createdAt = OffsetDateTime.parse("2022-12-09T17:41:00.537Z");
                enumNumber = ExampleResourceEnumNumber.ONE;
                enumStr = ExampleResourceEnumStr.THREE;
                mapOfInteger = new java.util.HashMap<String, Long>() {{
                    put("quidem", 736853L);
                    put("amet", 97676L);
                    put("dicta", 514922L);
                }};
                mapOfString = new java.util.HashMap<String, String>() {{
                    put("earum", "iusto");
                }};
                updatedAt = OffsetDateTime.parse("2022-05-31T09:24:28.393Z");
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

            DeleteResourceResponse res = sdk.resource.deleteResource("dolorum");

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

            GetResourceResponse res = sdk.resource.getResource("necessitatibus");

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

            UpdateResourceResponse res = sdk.resource.updateResource("provident");

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

