# Generation
(*generation*)

## Overview

Endpoints for purely testing valid generation behavior.

### Available Operations

* [anchorTypesGet](#anchortypesget)
* [arrayCircularReferenceGet](#arraycircularreferenceget)
* [circularReferenceGet](#circularreferenceget)
* [dateParamWithDefault](#dateparamwithdefault)
* [dateTimeParamWithDefault](#datetimeparamwithdefault)
* [decimalParamWithDefault](#decimalparamwithdefault)
* [deprecatedFieldInSchemaPost](#deprecatedfieldinschemapost)
* [deprecatedObjectInSchemaGet](#deprecatedobjectinschemaget)
* [~~deprecatedOperationNoCommentsGet~~](#deprecatedoperationnocommentsget) - :warning: **Deprecated**
* [~~deprecatedOperationWithCommentsGet~~](#deprecatedoperationwithcommentsget) - This is an endpoint setup to test deprecation with comments :warning: **Deprecated** Use `simplePathParameterObjects` instead.
* [emptyObjectGet](#emptyobjectget)
* [emptyResponseObjectWithCommentGet](#emptyresponseobjectwithcommentget)
* [globalNameOverridden](#globalnameoverridden)
* [ignoredGenerationGet](#ignoredgenerationget)
* [ignoresPost](#ignorespost)
* [nameOverride](#nameoverride)
* [objectCircularReferenceGet](#objectcircularreferenceget)
* [oneOfCircularReferenceGet](#oneofcircularreferenceget)
* [typedParameterGenerationGet](#typedparametergenerationget)
* [usageExamplePost](#usageexamplepost) - An operation used for testing usage examples

## anchorTypesGet

### Example Usage

```typescript
import { SDK } from "openapi";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.generation.anchorTypesGet();

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.AnchorTypesGetResponse](../../sdk/models/operations/anchortypesgetresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## arrayCircularReferenceGet

### Example Usage

```typescript
import { SDK } from "openapi";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.generation.arrayCircularReferenceGet();

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.ArrayCircularReferenceGetResponse](../../sdk/models/operations/arraycircularreferencegetresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## circularReferenceGet

### Example Usage

```typescript
import { SDK } from "openapi";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.generation.circularReferenceGet();

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.CircularReferenceGetResponse](../../sdk/models/operations/circularreferencegetresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## dateParamWithDefault

### Example Usage

```typescript
import { SDK } from "openapi";
import { DateParamWithDefaultRequest } from "openapi/dist/sdk/models/operations";
import { RFCDate } from "openapi/dist/sdk/types";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const dateInput: RFCDate = new RFCDate("2021-11-30");

  const res = await sdk.generation.dateParamWithDefault(dateInput);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `dateInput`                                                  | [RFCDate](../../types/rfcdate.md)                            | :heavy_check_mark:                                           | A date parameter with a default value                        |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.DateParamWithDefaultResponse](../../sdk/models/operations/dateparamwithdefaultresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## dateTimeParamWithDefault

### Example Usage

```typescript
import { SDK } from "openapi";
import { DateTimeParamWithDefaultRequest } from "openapi/dist/sdk/models/operations";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const dateTimeInput: Date = new Date("2023-02-09T21:53:21.077Z");

  const res = await sdk.generation.dateTimeParamWithDefault(dateTimeInput);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `dateTimeInput`                                                                               | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_check_mark:                                                                            | A date time parameter with a default value                                                    |
| `config`                                                                                      | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                  | :heavy_minus_sign:                                                                            | Available config options for making requests.                                                 |


### Response

**Promise<[operations.DateTimeParamWithDefaultResponse](../../sdk/models/operations/datetimeparamwithdefaultresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## decimalParamWithDefault

### Example Usage

```typescript
import { SDK } from "openapi";
import { DecimalParamWithDefaultRequest } from "openapi/dist/sdk/models/operations";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const decimalInput: number = 4060.06;

  const res = await sdk.generation.decimalParamWithDefault(decimalInput);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `decimalInput`                                               | *number*                                                     | :heavy_check_mark:                                           | A decimal parameter with a default value                     |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.DecimalParamWithDefaultResponse](../../sdk/models/operations/decimalparamwithdefaultresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## deprecatedFieldInSchemaPost

### Example Usage

```typescript
import { SDK } from "openapi";
import { DeprecatedEnum } from "openapi/dist/sdk/models/shared";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.generation.deprecatedFieldInSchemaPost({});

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                                            | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `request`                                                                            | [shared.DeprecatedFieldInObject](../../sdk/models/shared/deprecatedfieldinobject.md) | :heavy_check_mark:                                                                   | The request object to use for the request.                                           |
| `config`                                                                             | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                         | :heavy_minus_sign:                                                                   | Available config options for making requests.                                        |


### Response

**Promise<[operations.DeprecatedFieldInSchemaPostResponse](../../sdk/models/operations/deprecatedfieldinschemapostresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## deprecatedObjectInSchemaGet

### Example Usage

```typescript
import { SDK } from "openapi";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.generation.deprecatedObjectInSchemaGet();

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.DeprecatedObjectInSchemaGetResponse](../../sdk/models/operations/deprecatedobjectinschemagetresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## ~~deprecatedOperationNoCommentsGet~~

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

```typescript
import { SDK } from "openapi";
import { DeprecatedOperationNoCommentsGetRequest } from "openapi/dist/sdk/models/operations";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const deprecatedParameter: string = "string";

  const res = await sdk.generation.deprecatedOperationNoCommentsGet(deprecatedParameter);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `deprecatedParameter`                                                                                                   | *string*                                                                                                                | :heavy_minus_sign:                                                                                                      | : warning: ** DEPRECATED **: This will be removed in a future release, please migrate away from it as soon as possible. |
| `config`                                                                                                                | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                            | :heavy_minus_sign:                                                                                                      | Available config options for making requests.                                                                           |


### Response

**Promise<[operations.DeprecatedOperationNoCommentsGetResponse](../../sdk/models/operations/deprecatedoperationnocommentsgetresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## ~~deprecatedOperationWithCommentsGet~~

This is an endpoint setup to test deprecation with comments

> :warning: **DEPRECATED**: This operation is deprecated. Use `simplePathParameterObjects` instead.

### Example Usage

```typescript
import { SDK } from "openapi";
import { DeprecatedOperationWithCommentsGetRequest } from "openapi/dist/sdk/models/operations";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const deprecatedParameter: string = "string";
const newParameter: string = "string";

  const res = await sdk.generation.deprecatedOperationWithCommentsGet(deprecatedParameter, newParameter);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `deprecatedParameter`                                                                                            | *string*                                                                                                         | :heavy_minus_sign:                                                                                               | : warning: ** DEPRECATED **: This parameter is deprecated. Use newParameter instead.<br/><br/>This is a string parameter |
| `newParameter`                                                                                                   | *string*                                                                                                         | :heavy_minus_sign:                                                                                               | This is a string parameter                                                                                       |
| `config`                                                                                                         | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                     | :heavy_minus_sign:                                                                                               | Available config options for making requests.                                                                    |


### Response

**Promise<[operations.DeprecatedOperationWithCommentsGetResponse](../../sdk/models/operations/deprecatedoperationwithcommentsgetresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## emptyObjectGet

### Example Usage

```typescript
import { SDK } from "openapi";
import { EmptyObjectGetRequest } from "openapi/dist/sdk/models/operations";
import { EmptyObjectParam } from "openapi/dist/sdk/models/shared";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const emptyObject: EmptyObjectParam = {};

  const res = await sdk.generation.emptyObjectGet(emptyObject);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `emptyObject`                                                             | [shared.EmptyObjectParam](../../../sdk/models/shared/emptyobjectparam.md) | :heavy_check_mark:                                                        | N/A                                                                       |
| `config`                                                                  | [AxiosRequestConfig](https://axios-http.com/docs/req_config)              | :heavy_minus_sign:                                                        | Available config options for making requests.                             |


### Response

**Promise<[operations.EmptyObjectGetResponse](../../sdk/models/operations/emptyobjectgetresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## emptyResponseObjectWithCommentGet

### Example Usage

```typescript
import { SDK } from "openapi";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.generation.emptyResponseObjectWithCommentGet();

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.EmptyResponseObjectWithCommentGetResponse](../../sdk/models/operations/emptyresponseobjectwithcommentgetresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## globalNameOverridden

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.generation.globalNameOverridden({
    any: "any",
    bigint: 8821239038968084,
    bigintStr: "9223372036854775808",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00.000001Z"),
    decimal: 3.141592653589793,
    decimalStr: "3.14159265358979344719667586",
    enum: Enum.One,
    float32: 1.1,
    int: 1,
    int32: 1,
    int32Enum: Int32Enum.FiftyFive,
    intEnum: IntEnum.Second,
    num: 1.1,
    str: "test",
    strOpt: "testOptional",
  });

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                      | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `request`                                                      | [shared.SimpleObject](../../sdk/models/shared/simpleobject.md) | :heavy_check_mark:                                             | The request object to use for the request.                     |
| `config`                                                       | [AxiosRequestConfig](https://axios-http.com/docs/req_config)   | :heavy_minus_sign:                                             | Available config options for making requests.                  |


### Response

**Promise<[operations.GetGlobalNameOverrideResponse](../../sdk/models/operations/getglobalnameoverrideresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## ignoredGenerationGet

### Example Usage

```typescript
import { SDK } from "openapi";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.generation.ignoredGenerationGet();

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.IgnoredGenerationGetResponse](../../sdk/models/operations/ignoredgenerationgetresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## ignoresPost

### Example Usage

```typescript
import { SDK } from "openapi";
import { IgnoresPostRequest, IgnoresPostRequestBody } from "openapi/dist/sdk/models/operations";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const requestBody: IgnoresPostRequestBody = {};
const testParam: string = "string";

  const res = await sdk.generation.ignoresPost(requestBody, testParam);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                 | [operations.IgnoresPostRequestBody](../../../sdk/models/operations/ignorespostrequestbody.md) | :heavy_check_mark:                                                                            | N/A                                                                                           |
| `testParam`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | N/A                                                                                           |
| `config`                                                                                      | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                  | :heavy_minus_sign:                                                                            | Available config options for making requests.                                                 |


### Response

**Promise<[operations.IgnoresPostResponse](../../sdk/models/operations/ignorespostresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## nameOverride

### Example Usage

```typescript
import { SDK } from "openapi";
import { EnumNameOverride, NameOverrideGetRequest } from "openapi/dist/sdk/models/operations";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const testEnumQueryParam: EnumNameOverride = EnumNameOverride.Value3;
const testQueryParam: string = "example";

  const res = await sdk.generation.nameOverride(testEnumQueryParam, testQueryParam);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       | Example                                                                           |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `testEnumQueryParam`                                                              | [operations.EnumNameOverride](../../../sdk/models/operations/enumnameoverride.md) | :heavy_check_mark:                                                                | An enum type                                                                      | value3                                                                            |
| `testQueryParam`                                                                  | *string*                                                                          | :heavy_check_mark:                                                                | N/A                                                                               | example                                                                           |
| `config`                                                                          | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                      | :heavy_minus_sign:                                                                | Available config options for making requests.                                     |                                                                                   |


### Response

**Promise<[operations.NameOverrideGetResponse](../../sdk/models/operations/nameoverridegetresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## objectCircularReferenceGet

### Example Usage

```typescript
import { SDK } from "openapi";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.generation.objectCircularReferenceGet();

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.ObjectCircularReferenceGetResponse](../../sdk/models/operations/objectcircularreferencegetresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## oneOfCircularReferenceGet

### Example Usage

```typescript
import { SDK } from "openapi";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.generation.oneOfCircularReferenceGet();

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.OneOfCircularReferenceGetResponse](../../sdk/models/operations/oneofcircularreferencegetresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## typedParameterGenerationGet

### Example Usage

```typescript
import { SDK } from "openapi";
import { Obj, TypedParameterGenerationGetRequest } from "openapi/dist/sdk/models/operations";
import { RFCDate } from "openapi/dist/sdk/types";

(async() => {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const bigint: number = 879275;
const date: RFCDate = new RFCDate("2023-11-18");
const decimal: number = 3346.96;
const obj: Obj = {
  bool: false,
  num: 4778.06,
  str: "string",
};

  const res = await sdk.generation.typedParameterGenerationGet(bigint, date, decimal, obj);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `bigint`                                                     | *number*                                                     | :heavy_minus_sign:                                           | N/A                                                          |
| `date`                                                       | [RFCDate](../../types/rfcdate.md)                            | :heavy_minus_sign:                                           | N/A                                                          |
| `decimal`                                                    | *number*                                                     | :heavy_minus_sign:                                           | N/A                                                          |
| `obj`                                                        | [operations.Obj](../../../sdk/models/operations/obj.md)      | :heavy_minus_sign:                                           | N/A                                                          |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.TypedParameterGenerationGetResponse](../../sdk/models/operations/typedparametergenerationgetresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |

## usageExamplePost

An operation used for testing usage examples that includes a large array of parameters and input types to ensure that all are handled correctly

Usage example docs
<https://docs.example.com>

### Example Usage

```typescript
import { SDK } from "openapi";
import { EnumParameter, OptEnumParameter, UsageExamplePostSecurity } from "openapi/dist/sdk/models/operations";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

(async() => {
  const sdk = new SDK({
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const operationSecurity: UsageExamplePostSecurity = {
  password: "YOUR_PASSWORD",
  username: "YOUR_USERNAME",
};

  const res = await sdk.generation.usageExamplePost({
    requestBody: {
      fakerFormattedStrings: {},
      fakerStrings: {},
      simpleObject: {
        any: "any",
        bigint: 8821239038968084,
        bigintStr: "9223372036854775808",
        bool: true,
        boolOpt: true,
        date: new RFCDate("2020-01-01"),
        dateTime: new Date("2020-01-01T00:00:00.000001Z"),
        decimal: 3.141592653589793,
        decimalStr: "3.14159265358979344719667586",
        enum: Enum.One,
        float32: 1.1,
        int: 1,
        int32: 1,
        int32Enum: Int32Enum.FiftyFive,
        intEnum: IntEnum.Second,
        num: 1.1,
        str: "test",
        strOpt: "testOptional",
      },
    },
    bigintParameter: 168827,
    bigintStrParameter: "string",
    boolParameter: false,
    dateParameter: new RFCDate("2022-05-05"),
    dateTimeDefaultParameter: new Date("2023-06-11T00:39:45.412Z"),
    dateTimeParameter: new Date("2022-07-22T13:16:48.221Z"),
    decimalParameter: 2679.33,
    decimalStrParameter: "string",
    doubleParameter: 5223.72,
    enumParameter: EnumParameter.Value1,
    falseyNumberParameter: 0,
    float32Parameter: 6946.59,
    floatParameter: 2286.22,
    int64Parameter: 102975,
    intParameter: 566999,
    optEnumParameter: OptEnumParameter.Value3,
    strParameter: "example 1",
  }, operationSecurity);

  if (res.statusCode == 200) {
    // handle response
  }
})();
```

### Parameters

| Parameter                                                                                      | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `request`                                                                                      | [operations.UsageExamplePostRequest](../../sdk/models/operations/usageexamplepostrequest.md)   | :heavy_check_mark:                                                                             | The request object to use for the request.                                                     |
| `security`                                                                                     | [operations.UsageExamplePostSecurity](../../sdk/models/operations/usageexamplepostsecurity.md) | :heavy_check_mark:                                                                             | The security requirements to use for the request.                                              |
| `config`                                                                                       | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                   | :heavy_minus_sign:                                                                             | Available config options for making requests.                                                  |


### Response

**Promise<[operations.UsageExamplePostResponse](../../sdk/models/operations/usageexamplepostresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 400-600         | */*             |
