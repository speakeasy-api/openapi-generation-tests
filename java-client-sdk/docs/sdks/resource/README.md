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
                file = new CreateFileRequestBodyFile("culpa".getBytes(), "expedita");;
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
                                add(new ExampleResourceChocolates("consequatur") {{
                                    description = "magnam";
                                }}),
                            }}, "esse", "ipsam",                 new ExampleBoat(3426.11d, "saepe", ExampleBoatType.BOAT) {{
                                createdAt = OffsetDateTime.parse("2021-11-19T14:41:57.682Z");
                                length = 9221.12d;
                                name = "Janet Kuvalis";
                                type = ExampleBoatType.BOAT;
                                updatedAt = OffsetDateTime.parse("2022-07-29T16:33:10.615Z");
                            }}) {{
                arrayOfNumber = new Double[]{{
                    add(6222.31d),
                }};
                arrayOfString = new String[]{{
                    add("consequatur"),
                }};
                createdAt = OffsetDateTime.parse("2022-01-12T08:45:01.658Z");
                enumNumber = ExampleResourceEnumNumber.ONE;
                enumStr = ExampleResourceEnumStr.THREE;
                mapOfInteger = new java.util.HashMap<String, Long>() {{
                    put("dicta", 99416L);
                }};
                mapOfString = new java.util.HashMap<String, String>() {{
                    put("occaecati", "labore");
                }};
                updatedAt = OffsetDateTime.parse("2021-12-03T11:25:52.746Z");
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

            GetResourceResponse res = sdk.resource.getResource("nam");

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

            UpdateResourceResponse res = sdk.resource.updateResource("tenetur");

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

