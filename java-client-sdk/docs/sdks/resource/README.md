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
                file = new CreateFileRequestBodyFile("nisi".getBytes(), "voluptatibus");;
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
                                add(new ExampleResourceChocolates("distinctio") {{
                                    description = "blanditiis";
                                }}),
                                add(new ExampleResourceChocolates("quis") {{
                                    description = "nisi";
                                }}),
                            }}, "nisi", "libero",                 new ExampleCar("nostrum", "neque", "iusto", ExampleCarType.CAR, 6649.65d) {{
                                createdAt = OffsetDateTime.parse("2020-11-18T20:43:00.067Z");
                                make = "ipsum";
                                model = "ad";
                                name = "Courtney Crooks";
                                type = ExampleCarType.CAR;
                                updatedAt = OffsetDateTime.parse("2022-08-22T17:59:10.804Z");
                                year = 4407.77d;
                            }}) {{
                arrayOfNumber = new Double[]{{
                    add(7538.9d),
                    add(8536.06d),
                    add(6040.78d),
                }};
                arrayOfString = new String[]{{
                    add("ducimus"),
                    add("dolor"),
                    add("dicta"),
                    add("error"),
                }};
                createdAt = OffsetDateTime.parse("2022-08-31T21:53:00.029Z");
                enumNumber = ExampleResourceEnumNumber.TWO;
                enumStr = ExampleResourceEnumStr.TWO;
                mapOfInteger = new java.util.HashMap<String, Long>() {{
                    put("ad", 134818L);
                    put("enim", 965090L);
                    put("iusto", 491201L);
                    put("libero", 72350L);
                }};
                mapOfString = new java.util.HashMap<String, String>() {{
                    put("incidunt", "accusamus");
                }};
                updatedAt = OffsetDateTime.parse("2020-10-18T09:05:37.895Z");
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

            DeleteResourceResponse res = sdk.resource.deleteResource("veniam");

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

            GetResourceResponse res = sdk.resource.getResource("eos");

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

            UpdateResourceResponse res = sdk.resource.updateResource("reiciendis");

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

