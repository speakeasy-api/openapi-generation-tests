# requestBodies

## Overview

Endpoints for testing request bodies.

### Available Operations

* [nullableObjectPost](#nullableobjectpost)
* [nullableRequiredEmptyObjectPost](#nullablerequiredemptyobjectpost)
* [nullableRequiredPropertyPost](#nullablerequiredpropertypost)
* [nullableRequiredSharedObjectPost](#nullablerequiredsharedobjectpost)
* [requestBodyPostApplicationJsonArray](#requestbodypostapplicationjsonarray)
* [requestBodyPostApplicationJsonArrayCamelCase](#requestbodypostapplicationjsonarraycamelcase)
* [requestBodyPostApplicationJsonArrayObj](#requestbodypostapplicationjsonarrayobj)
* [requestBodyPostApplicationJsonArrayObjCamelCase](#requestbodypostapplicationjsonarrayobjcamelcase)
* [requestBodyPostApplicationJsonArrayOfArray](#requestbodypostapplicationjsonarrayofarray)
* [requestBodyPostApplicationJsonArrayOfArrayCamelCase](#requestbodypostapplicationjsonarrayofarraycamelcase)
* [requestBodyPostApplicationJsonArrayOfArrayOfPrimitive](#requestbodypostapplicationjsonarrayofarrayofprimitive)
* [requestBodyPostApplicationJsonArrayOfMap](#requestbodypostapplicationjsonarrayofmap)
* [requestBodyPostApplicationJsonArrayOfMapCamelCase](#requestbodypostapplicationjsonarrayofmapcamelcase)
* [requestBodyPostApplicationJsonArrayOfPrimitive](#requestbodypostapplicationjsonarrayofprimitive)
* [requestBodyPostApplicationJsonDeep](#requestbodypostapplicationjsondeep)
* [requestBodyPostApplicationJsonDeepCamelCase](#requestbodypostapplicationjsondeepcamelcase)
* [requestBodyPostApplicationJsonMap](#requestbodypostapplicationjsonmap)
* [requestBodyPostApplicationJsonMapCamelCase](#requestbodypostapplicationjsonmapcamelcase)
* [requestBodyPostApplicationJsonMapObj](#requestbodypostapplicationjsonmapobj)
* [requestBodyPostApplicationJsonMapObjCamelCase](#requestbodypostapplicationjsonmapobjcamelcase)
* [requestBodyPostApplicationJsonMapOfArray](#requestbodypostapplicationjsonmapofarray)
* [requestBodyPostApplicationJsonMapOfArrayCamelCase](#requestbodypostapplicationjsonmapofarraycamelcase)
* [requestBodyPostApplicationJsonMapOfMap](#requestbodypostapplicationjsonmapofmap)
* [requestBodyPostApplicationJsonMapOfMapCamelCase](#requestbodypostapplicationjsonmapofmapcamelcase)
* [requestBodyPostApplicationJsonMapOfMapOfPrimitive](#requestbodypostapplicationjsonmapofmapofprimitive)
* [requestBodyPostApplicationJsonMapOfPrimitive](#requestbodypostapplicationjsonmapofprimitive)
* [requestBodyPostApplicationJsonMultipleJsonFiltered](#requestbodypostapplicationjsonmultiplejsonfiltered)
* [requestBodyPostApplicationJsonSimple](#requestbodypostapplicationjsonsimple)
* [requestBodyPostApplicationJsonSimpleCamelCase](#requestbodypostapplicationjsonsimplecamelcase)
* [requestBodyPostComplexNumberTypes](#requestbodypostcomplexnumbertypes)
* [requestBodyPostEmptyObject](#requestbodypostemptyobject)
* [requestBodyPostFormDeep](#requestbodypostformdeep)
* [requestBodyPostFormMapPrimitive](#requestbodypostformmapprimitive)
* [requestBodyPostFormSimple](#requestbodypostformsimple)
* [requestBodyPostMultipleContentTypesComponentFiltered](#requestbodypostmultiplecontenttypescomponentfiltered)
* [requestBodyPostMultipleContentTypesInlineFiltered](#requestbodypostmultiplecontenttypesinlinefiltered)
* [requestBodyPostMultipleContentTypesSplitParamForm](#requestbodypostmultiplecontenttypessplitparamform)
* [requestBodyPostMultipleContentTypesSplitParamJson](#requestbodypostmultiplecontenttypessplitparamjson)
* [requestBodyPostMultipleContentTypesSplitParamMultipart](#requestbodypostmultiplecontenttypessplitparammultipart)
* [requestBodyPostMultipleContentTypesSplitForm](#requestbodypostmultiplecontenttypessplitform)
* [requestBodyPostMultipleContentTypesSplitJson](#requestbodypostmultiplecontenttypessplitjson)
* [requestBodyPostMultipleContentTypesSplitMultipart](#requestbodypostmultiplecontenttypessplitmultipart)
* [requestBodyPostNullArray](#requestbodypostnullarray)
* [requestBodyPostNullDictionary](#requestbodypostnulldictionary)
* [requestBodyPutBytes](#requestbodyputbytes)
* [requestBodyPutBytesWithParams](#requestbodyputbyteswithparams)
* [requestBodyPutMultipartDeep](#requestbodyputmultipartdeep)
* [requestBodyPutMultipartFile](#requestbodyputmultipartfile)
* [requestBodyPutMultipartSimple](#requestbodyputmultipartsimple)
* [requestBodyPutString](#requestbodyputstring)
* [requestBodyPutStringWithParams](#requestbodyputstringwithparams)
* [requestBodyReadAndWrite](#requestbodyreadandwrite)
* [requestBodyReadOnlyInput](#requestbodyreadonlyinput)
* [requestBodyReadOnlyUnion](#requestbodyreadonlyunion)
* [requestBodyReadWriteOnlyUnion](#requestbodyreadwriteonlyunion)
* [requestBodyWriteOnly](#requestbodywriteonly)
* [requestBodyWriteOnlyOutput](#requestbodywriteonlyoutput)
* [requestBodyWriteOnlyUnion](#requestbodywriteonlyunion)

## nullableObjectPost

### Example Usage

```typescript
import { SDK } from "openapi";
import { NullableObjectPostResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.nullableObjectPost({
  optional: "consectetur",
  required: 878870,
}).then((res: NullableObjectPostResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                      | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `request`                                                      | [shared.NullableObject](../../models/shared/nullableobject.md) | :heavy_check_mark:                                             | The request object to use for the request.                     |
| `config`                                                       | [AxiosRequestConfig](https://axios-http.com/docs/req_config)   | :heavy_minus_sign:                                             | Available config options for making requests.                  |


### Response

**Promise<[operations.NullableObjectPostResponse](../../models/operations/nullableobjectpostresponse.md)>**


## nullableRequiredEmptyObjectPost

### Example Usage

```typescript
import { SDK } from "openapi";
import { NullableRequiredEmptyObjectPostResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.nullableRequiredEmptyObjectPost({
  nullableOptionalObj: {},
  nullableRequiredObj: {},
  requiredObj: {},
}).then((res: NullableRequiredEmptyObjectPostResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [operations.NullableRequiredEmptyObjectPostRequestBody](../../models/operations/nullablerequiredemptyobjectpostrequestbody.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `config`                                                                                                                       | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                   | :heavy_minus_sign:                                                                                                             | Available config options for making requests.                                                                                  |


### Response

**Promise<[operations.NullableRequiredEmptyObjectPostResponse](../../models/operations/nullablerequiredemptyobjectpostresponse.md)>**


## nullableRequiredPropertyPost

### Example Usage

```typescript
import { SDK } from "openapi";
import {
  NullableRequiredPropertyPostRequestBodyNullableRequiredEnum,
  NullableRequiredPropertyPostResponse,
} from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.nullableRequiredPropertyPost({
  nullableOptionalInt: 949319,
  nullableRequiredArray: [
    4922.68,
  ],
  nullableRequiredEnum: NullableRequiredPropertyPostRequestBodyNullableRequiredEnum.Second,
  nullableRequiredInt: 715561,
}).then((res: NullableRequiredPropertyPostResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [operations.NullableRequiredPropertyPostRequestBody](../../models/operations/nullablerequiredpropertypostrequestbody.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `config`                                                                                                                 | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                             | :heavy_minus_sign:                                                                                                       | Available config options for making requests.                                                                            |


### Response

**Promise<[operations.NullableRequiredPropertyPostResponse](../../models/operations/nullablerequiredpropertypostresponse.md)>**


## nullableRequiredSharedObjectPost

### Example Usage

```typescript
import { SDK } from "openapi";
import { NullableRequiredSharedObjectPostResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.nullableRequiredSharedObjectPost({
  nullableOptionalObj: {
    optional: "quod",
    required: 486160,
  },
  nullableRequiredObj: {
    optional: "similique",
    required: 708548,
  },
}).then((res: NullableRequiredSharedObjectPostResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [operations.NullableRequiredSharedObjectPostRequestBody](../../models/operations/nullablerequiredsharedobjectpostrequestbody.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `config`                                                                                                                         | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                     | :heavy_minus_sign:                                                                                                               | Available config options for making requests.                                                                                    |


### Response

**Promise<[operations.NullableRequiredSharedObjectPostResponse](../../models/operations/nullablerequiredsharedobjectpostresponse.md)>**


## requestBodyPostApplicationJsonArray

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonArrayResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonArray([
  {
    any: "vero",
    bigint: 498140,
    bigintStr: "dolore",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    decimal: 8445.5,
    enum: Enum.Two,
    float32: 2.2222222,
    int: 999999,
    int32: 1,
    int32Enum: SimpleObjectInt32Enum.OneHundredAndEightyOne,
    intEnum: SimpleObjectIntEnum.First,
    intOptNull: 999999,
    num: 1.1,
    numOptNull: 1.1,
    str: "example",
    strOpt: "optional example",
  },
]).then((res: RequestBodyPostApplicationJsonArrayResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.SimpleObject[]](../../models//.md)                   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonArrayResponse](../../models/operations/requestbodypostapplicationjsonarrayresponse.md)>**


## requestBodyPostApplicationJsonArrayCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonArrayCamelCaseResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectCamelCaseInt32EnumVal, SimpleObjectCamelCaseIntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonArrayCamelCase([
  {
    anyVal: "natus",
    bigintStrVal: "impedit",
    bigintVal: 13236,
    boolOptVal: true,
    boolVal: true,
    dateTimeVal: new Date("2020-01-01T00:00:00Z"),
    dateVal: new RFCDate("2020-01-01"),
    decimalVal: 9742.59,
    enumVal: Enum.Two,
    float32Val: 2.2222222,
    int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
    int32Val: 1,
    intEnumVal: SimpleObjectCamelCaseIntEnumVal.Third,
    intOptNullVal: 999999,
    intVal: 999999,
    numOptNullVal: 1.1,
    numVal: 1.1,
    strOptVal: "optional example",
    strVal: "example",
  },
]).then((res: RequestBodyPostApplicationJsonArrayCamelCaseResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.SimpleObjectCamelCase[]](../../models//.md)          | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonArrayCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonarraycamelcaseresponse.md)>**


## requestBodyPostApplicationJsonArrayObj

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonArrayObjResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonArrayObj([
  {
    any: "fugit",
    bigint: 780427,
    bigintStr: "maiores",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    decimal: 9850.33,
    enum: Enum.Two,
    float32: 2.2222222,
    int: 999999,
    int32: 1,
    int32Enum: SimpleObjectInt32Enum.SixtyNine,
    intEnum: SimpleObjectIntEnum.Third,
    intOptNull: 999999,
    num: 1.1,
    numOptNull: 1.1,
    str: "example",
    strOpt: "optional example",
  },
]).then((res: RequestBodyPostApplicationJsonArrayObjResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.SimpleObject[]](../../models//.md)                   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonArrayObjResponse](../../models/operations/requestbodypostapplicationjsonarrayobjresponse.md)>**


## requestBodyPostApplicationJsonArrayObjCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonArrayObjCamelCaseResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectCamelCaseInt32EnumVal, SimpleObjectCamelCaseIntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonArrayObjCamelCase([
  {
    anyVal: "ducimus",
    bigintStrVal: "alias",
    bigintVal: 639473,
    boolOptVal: true,
    boolVal: true,
    dateTimeVal: new Date("2020-01-01T00:00:00Z"),
    dateVal: new RFCDate("2020-01-01"),
    decimalVal: 2694.79,
    enumVal: Enum.Two,
    float32Val: 2.2222222,
    int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
    int32Val: 1,
    intEnumVal: SimpleObjectCamelCaseIntEnumVal.Second,
    intOptNullVal: 999999,
    intVal: 999999,
    numOptNullVal: 1.1,
    numVal: 1.1,
    strOptVal: "optional example",
    strVal: "example",
  },
]).then((res: RequestBodyPostApplicationJsonArrayObjCamelCaseResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.SimpleObjectCamelCase[]](../../models//.md)          | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonArrayObjCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonarrayobjcamelcaseresponse.md)>**


## requestBodyPostApplicationJsonArrayOfArray

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonArrayOfArrayResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonArrayOfArray([
  [
    {
      any: "aspernatur",
      bigint: 428224,
      bigintStr: "possimus",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 2978.42,
      enum: Enum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32Enum.FiftyFive,
      intEnum: SimpleObjectIntEnum.Second,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
  ],
]).then((res: RequestBodyPostApplicationJsonArrayOfArrayResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.SimpleObject[][]](../../models//.md)                 | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonArrayOfArrayResponse](../../models/operations/requestbodypostapplicationjsonarrayofarrayresponse.md)>**


## requestBodyPostApplicationJsonArrayOfArrayCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonArrayOfArrayCamelCaseResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectCamelCaseInt32EnumVal, SimpleObjectCamelCaseIntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonArrayOfArrayCamelCase([
  [
    {
      anyVal: "laudantium",
      bigintStrVal: "dicta",
      bigintVal: 224317,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 9807,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.FiftyFive,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.Second,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
  ],
]).then((res: RequestBodyPostApplicationJsonArrayOfArrayCamelCaseResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.SimpleObjectCamelCase[][]](../../models//.md)        | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonArrayOfArrayCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonarrayofarraycamelcaseresponse.md)>**


## requestBodyPostApplicationJsonArrayOfArrayOfPrimitive

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonArrayOfArrayOfPrimitive([
  [
    "nulla",
  ],
]).then((res: RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [string[][]](../../models//.md)                              | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse](../../models/operations/requestbodypostapplicationjsonarrayofarrayofprimitiveresponse.md)>**


## requestBodyPostApplicationJsonArrayOfMap

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonArrayOfMapResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonArrayOfMap([
  {
    "excepturi": {
      any: "voluptatibus",
      bigint: 343605,
      bigintStr: "sapiente",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 7888.73,
      enum: Enum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32Enum.OneHundredAndEightyOne,
      intEnum: SimpleObjectIntEnum.Second,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
  },
]).then((res: RequestBodyPostApplicationJsonArrayOfMapResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Record<string, shared.SimpleObject>[]](../../models//.md)   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonArrayOfMapResponse](../../models/operations/requestbodypostapplicationjsonarrayofmapresponse.md)>**


## requestBodyPostApplicationJsonArrayOfMapCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonArrayOfMapCamelCaseResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectCamelCaseInt32EnumVal, SimpleObjectCamelCaseIntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonArrayOfMapCamelCase([
  {
    "impedit": {
      anyVal: "corporis",
      bigintStrVal: "veniam",
      bigintVal: 399499,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 811.01,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.FiftyFive,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.Second,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
  },
]).then((res: RequestBodyPostApplicationJsonArrayOfMapCamelCaseResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [Record<string, shared.SimpleObjectCamelCase>[]](../../models//.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |
| `serverURL`                                                         | *string*                                                            | :heavy_minus_sign:                                                  | An optional server URL to use.                                      |
| `config`                                                            | [AxiosRequestConfig](https://axios-http.com/docs/req_config)        | :heavy_minus_sign:                                                  | Available config options for making requests.                       |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonArrayOfMapCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonarrayofmapcamelcaseresponse.md)>**


## requestBodyPostApplicationJsonArrayOfPrimitive

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonArrayOfPrimitiveResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonArrayOfPrimitive([
  "quo",
]).then((res: RequestBodyPostApplicationJsonArrayOfPrimitiveResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [string[]](../../models//.md)                                | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonArrayOfPrimitiveResponse](../../models/operations/requestbodypostapplicationjsonarrayofprimitiveresponse.md)>**


## requestBodyPostApplicationJsonDeep

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonDeepResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonDeep({
  any: {
    any: "recusandae",
    bigint: 132487,
    bigintStr: "minima",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    decimal: 534.27,
    enum: Enum.Two,
    float32: 2.2222222,
    int: 999999,
    int32: 1,
    int32Enum: SimpleObjectInt32Enum.OneHundredAndEightyOne,
    intEnum: SimpleObjectIntEnum.Third,
    intOptNull: 999999,
    num: 1.1,
    numOptNull: 1.1,
    str: "example",
    strOpt: "optional example",
  },
  arr: [
    {
      any: "aut",
      bigint: 11427,
      bigintStr: "deleniti",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 7705.81,
      enum: Enum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32Enum.FiftyFive,
      intEnum: SimpleObjectIntEnum.First,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
  ],
  bool: false,
  int: 882860,
  map: {
    "inventore": {
      any: "non",
      bigint: 89603,
      bigintStr: "dolorum",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 6720.48,
      enum: Enum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32Enum.OneHundredAndEightyOne,
      intEnum: SimpleObjectIntEnum.First,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
  },
  num: 4321.48,
  obj: {
    any: "autem",
    bigint: 752135,
    bigintStr: "quas",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    decimal: 8296.03,
    enum: Enum.Two,
    float32: 2.2222222,
    int: 999999,
    int32: 1,
    int32Enum: SimpleObjectInt32Enum.OneHundredAndEightyOne,
    intEnum: SimpleObjectIntEnum.Second,
    intOptNull: 999999,
    num: 1.1,
    numOptNull: 1.1,
    str: "example",
    strOpt: "optional example",
  },
  str: "libero",
  type: "quasi",
}).then((res: RequestBodyPostApplicationJsonDeepResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.DeepObject](../../models/shared/deepobject.md)       | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonDeepResponse](../../models/operations/requestbodypostapplicationjsondeepresponse.md)>**


## requestBodyPostApplicationJsonDeepCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonDeepCamelCaseResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectCamelCaseInt32EnumVal, SimpleObjectCamelCaseIntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonDeepCamelCase({
  anyVal: {
    anyVal: "numquam",
    bigintStrVal: "explicabo",
    bigintVal: 591935,
    boolOptVal: true,
    boolVal: true,
    dateTimeVal: new Date("2020-01-01T00:00:00Z"),
    dateVal: new RFCDate("2020-01-01"),
    decimalVal: 553.74,
    enumVal: Enum.Two,
    float32Val: 2.2222222,
    int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
    int32Val: 1,
    intEnumVal: SimpleObjectCamelCaseIntEnumVal.First,
    intOptNullVal: 999999,
    intVal: 999999,
    numOptNullVal: 1.1,
    numVal: 1.1,
    strOptVal: "optional example",
    strVal: "example",
  },
  arrVal: [
    {
      anyVal: "odio",
      bigintStrVal: "eius",
      bigintVal: 458515,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 4561.41,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.Third,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
  ],
  boolVal: false,
  intVal: 442015,
  mapVal: {
    "quidem": {
      anyVal: "fugiat",
      bigintStrVal: "ut",
      bigintVal: 433439,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 3799.27,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.OneHundredAndEightyOne,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.First,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
  },
  numVal: 5093.42,
  objVal: {
    anyVal: "quisquam",
    bigintStrVal: "veritatis",
    bigintVal: 56848,
    boolOptVal: true,
    boolVal: true,
    dateTimeVal: new Date("2020-01-01T00:00:00Z"),
    dateVal: new RFCDate("2020-01-01"),
    decimalVal: 6600.4,
    enumVal: Enum.Two,
    float32Val: 2.2222222,
    int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.OneHundredAndEightyOne,
    int32Val: 1,
    intEnumVal: SimpleObjectCamelCaseIntEnumVal.First,
    intOptNullVal: 999999,
    intVal: 999999,
    numOptNullVal: 1.1,
    numVal: 1.1,
    strOptVal: "optional example",
    strVal: "example",
  },
  strVal: "quo",
  type: "illum",
}).then((res: RequestBodyPostApplicationJsonDeepCamelCaseResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `request`                                                                | [shared.DeepObjectCamelCase](../../models/shared/deepobjectcamelcase.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |
| `config`                                                                 | [AxiosRequestConfig](https://axios-http.com/docs/req_config)             | :heavy_minus_sign:                                                       | Available config options for making requests.                            |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonDeepCamelCaseResponse](../../models/operations/requestbodypostapplicationjsondeepcamelcaseresponse.md)>**


## requestBodyPostApplicationJsonMap

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonMapResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonMap({
  "quo": {
    any: "fuga",
    bigint: 259422,
    bigintStr: "eos",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    decimal: 3738.13,
    enum: Enum.Two,
    float32: 2.2222222,
    int: 999999,
    int32: 1,
    int32Enum: SimpleObjectInt32Enum.FiftyFive,
    intEnum: SimpleObjectIntEnum.Second,
    intOptNull: 999999,
    num: 1.1,
    numOptNull: 1.1,
    str: "example",
    strOpt: "optional example",
  },
}).then((res: RequestBodyPostApplicationJsonMapResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Record<string, shared.SimpleObject>](../../models//.md)     | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMapResponse](../../models/operations/requestbodypostapplicationjsonmapresponse.md)>**


## requestBodyPostApplicationJsonMapCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonMapCamelCaseResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectCamelCaseInt32EnumVal, SimpleObjectCamelCaseIntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonMapCamelCase({
  "consequatur": {
    anyVal: "tempora",
    bigintStrVal: "debitis",
    bigintVal: 370853,
    boolOptVal: true,
    boolVal: true,
    dateTimeVal: new Date("2020-01-01T00:00:00Z"),
    dateVal: new RFCDate("2020-01-01"),
    decimalVal: 1334.65,
    enumVal: Enum.Two,
    float32Val: 2.2222222,
    int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.FiftyFive,
    int32Val: 1,
    intEnumVal: SimpleObjectCamelCaseIntEnumVal.Third,
    intOptNullVal: 999999,
    intVal: 999999,
    numOptNullVal: 1.1,
    numVal: 1.1,
    strOptVal: "optional example",
    strVal: "example",
  },
}).then((res: RequestBodyPostApplicationJsonMapCamelCaseResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [Record<string, shared.SimpleObjectCamelCase>](../../models//.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |
| `serverURL`                                                       | *string*                                                          | :heavy_minus_sign:                                                | An optional server URL to use.                                    |
| `config`                                                          | [AxiosRequestConfig](https://axios-http.com/docs/req_config)      | :heavy_minus_sign:                                                | Available config options for making requests.                     |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMapCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonmapcamelcaseresponse.md)>**


## requestBodyPostApplicationJsonMapObj

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonMapObjResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonMapObj({
  "esse": {
    any: "recusandae",
    bigint: 44612,
    bigintStr: "distinctio",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    decimal: 7997.96,
    enum: Enum.Two,
    float32: 2.2222222,
    int: 999999,
    int32: 1,
    int32Enum: SimpleObjectInt32Enum.SixtyNine,
    intEnum: SimpleObjectIntEnum.First,
    intOptNull: 999999,
    num: 1.1,
    numOptNull: 1.1,
    str: "example",
    strOpt: "optional example",
  },
}).then((res: RequestBodyPostApplicationJsonMapObjResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Record<string, shared.SimpleObject>](../../models//.md)     | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMapObjResponse](../../models/operations/requestbodypostapplicationjsonmapobjresponse.md)>**


## requestBodyPostApplicationJsonMapObjCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonMapObjCamelCaseResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectCamelCaseInt32EnumVal, SimpleObjectCamelCaseIntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonMapObjCamelCase({
  "nihil": {
    anyVal: "totam",
    bigintStrVal: "accusamus",
    bigintVal: 306810,
    boolOptVal: true,
    boolVal: true,
    dateTimeVal: new Date("2020-01-01T00:00:00Z"),
    dateVal: new RFCDate("2020-01-01"),
    decimalVal: 4884.1,
    enumVal: Enum.Two,
    float32Val: 2.2222222,
    int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
    int32Val: 1,
    intEnumVal: SimpleObjectCamelCaseIntEnumVal.Second,
    intOptNullVal: 999999,
    intVal: 999999,
    numOptNullVal: 1.1,
    numVal: 1.1,
    strOptVal: "optional example",
    strVal: "example",
  },
}).then((res: RequestBodyPostApplicationJsonMapObjCamelCaseResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [Record<string, shared.SimpleObjectCamelCase>](../../models//.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |
| `config`                                                          | [AxiosRequestConfig](https://axios-http.com/docs/req_config)      | :heavy_minus_sign:                                                | Available config options for making requests.                     |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMapObjCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonmapobjcamelcaseresponse.md)>**


## requestBodyPostApplicationJsonMapOfArray

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonMapOfArrayResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonMapOfArray({
  "sapiente": [
    {
      any: "dolores",
      bigint: 645570,
      bigintStr: "molestiae",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 353.62,
      enum: Enum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32Enum.OneHundredAndEightyOne,
      intEnum: SimpleObjectIntEnum.Second,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
  ],
}).then((res: RequestBodyPostApplicationJsonMapOfArrayResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Record<string, shared.SimpleObject[]>](../../models//.md)   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMapOfArrayResponse](../../models/operations/requestbodypostapplicationjsonmapofarrayresponse.md)>**


## requestBodyPostApplicationJsonMapOfArrayCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonMapOfArrayCamelCaseResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectCamelCaseInt32EnumVal, SimpleObjectCamelCaseIntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonMapOfArrayCamelCase({
  "quas": [
    {
      anyVal: "praesentium",
      bigintStrVal: "consequuntur",
      bigintVal: 536178,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 1438.29,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.OneHundredAndEightyOne,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.Second,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
  ],
}).then((res: RequestBodyPostApplicationJsonMapOfArrayCamelCaseResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [Record<string, shared.SimpleObjectCamelCase[]>](../../models//.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |
| `serverURL`                                                         | *string*                                                            | :heavy_minus_sign:                                                  | An optional server URL to use.                                      |
| `config`                                                            | [AxiosRequestConfig](https://axios-http.com/docs/req_config)        | :heavy_minus_sign:                                                  | Available config options for making requests.                       |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMapOfArrayCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonmapofarraycamelcaseresponse.md)>**


## requestBodyPostApplicationJsonMapOfMap

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonMapOfMapResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonMapOfMap({
  "incidunt": {
    "atque": {
      any: "explicabo",
      bigint: 325685,
      bigintStr: "nisi",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 1470.14,
      enum: Enum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32Enum.OneHundredAndEightyOne,
      intEnum: SimpleObjectIntEnum.First,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
  },
}).then((res: RequestBodyPostApplicationJsonMapOfMapResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `request`                                                                | [Record<string, Record<string, shared.SimpleObject>>](../../models//.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |
| `serverURL`                                                              | *string*                                                                 | :heavy_minus_sign:                                                       | An optional server URL to use.                                           |
| `config`                                                                 | [AxiosRequestConfig](https://axios-http.com/docs/req_config)             | :heavy_minus_sign:                                                       | Available config options for making requests.                            |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMapOfMapResponse](../../models/operations/requestbodypostapplicationjsonmapofmapresponse.md)>**


## requestBodyPostApplicationJsonMapOfMapCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonMapOfMapCamelCaseResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectCamelCaseInt32EnumVal, SimpleObjectCamelCaseIntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonMapOfMapCamelCase({
  "ratione": {
    "explicabo": {
      anyVal: "saepe",
      bigintStrVal: "occaecati",
      bigintVal: 543806,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 922.6,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.SixtyNine,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.Third,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
  },
}).then((res: RequestBodyPostApplicationJsonMapOfMapCamelCaseResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [Record<string, Record<string, shared.SimpleObjectCamelCase>>](../../models//.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |
| `serverURL`                                                                       | *string*                                                                          | :heavy_minus_sign:                                                                | An optional server URL to use.                                                    |
| `config`                                                                          | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                      | :heavy_minus_sign:                                                                | Available config options for making requests.                                     |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMapOfMapCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonmapofmapcamelcaseresponse.md)>**


## requestBodyPostApplicationJsonMapOfMapOfPrimitive

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonMapOfMapOfPrimitiveResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonMapOfMapOfPrimitive({
  "accusamus": {
    "veritatis": "esse",
  },
}).then((res: RequestBodyPostApplicationJsonMapOfMapOfPrimitiveResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Record<string, Record<string, string>>](../../models//.md)  | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMapOfMapOfPrimitiveResponse](../../models/operations/requestbodypostapplicationjsonmapofmapofprimitiveresponse.md)>**


## requestBodyPostApplicationJsonMapOfPrimitive

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonMapOfPrimitiveResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonMapOfPrimitive({
  "quod": "nam",
}).then((res: RequestBodyPostApplicationJsonMapOfPrimitiveResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Record<string, string>](../../models//.md)                  | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMapOfPrimitiveResponse](../../models/operations/requestbodypostapplicationjsonmapofprimitiveresponse.md)>**


## requestBodyPostApplicationJsonMultipleJsonFiltered

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonMultipleJsonFilteredResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonMultipleJsonFiltered({
  any: "vero",
  bigint: 399025,
  bigintStr: "quasi",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
  decimal: 9040.45,
  enum: Enum.Two,
  float32: 2.2222222,
  int: 999999,
  int32: 1,
  int32Enum: SimpleObjectInt32Enum.SixtyNine,
  intEnum: SimpleObjectIntEnum.Third,
  intOptNull: 999999,
  num: 1.1,
  numOptNull: 1.1,
  str: "example",
  strOpt: "optional example",
}).then((res: RequestBodyPostApplicationJsonMultipleJsonFilteredResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.SimpleObject](../../models/shared/simpleobject.md)   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMultipleJsonFilteredResponse](../../models/operations/requestbodypostapplicationjsonmultiplejsonfilteredresponse.md)>**


## requestBodyPostApplicationJsonSimple

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonSimpleResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonSimple({
  any: "molestiae",
  bigint: 699622,
  bigintStr: "occaecati",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
  decimal: 3277.2,
  enum: Enum.Two,
  float32: 2.2222222,
  int: 999999,
  int32: 1,
  int32Enum: SimpleObjectInt32Enum.OneHundredAndEightyOne,
  intEnum: SimpleObjectIntEnum.Third,
  intOptNull: 999999,
  num: 1.1,
  numOptNull: 1.1,
  str: "example",
  strOpt: "optional example",
}).then((res: RequestBodyPostApplicationJsonSimpleResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.SimpleObject](../../models/shared/simpleobject.md)   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonSimpleResponse](../../models/operations/requestbodypostapplicationjsonsimpleresponse.md)>**


## requestBodyPostApplicationJsonSimpleCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostApplicationJsonSimpleCamelCaseResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectCamelCaseInt32EnumVal, SimpleObjectCamelCaseIntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostApplicationJsonSimpleCamelCase({
  anyVal: "sit",
  bigintStrVal: "culpa",
  bigintVal: 731398,
  boolOptVal: true,
  boolVal: true,
  dateTimeVal: new Date("2020-01-01T00:00:00Z"),
  dateVal: new RFCDate("2020-01-01"),
  decimalVal: 2400.2,
  enumVal: Enum.Two,
  float32Val: 2.2222222,
  int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.OneHundredAndEightyOne,
  int32Val: 1,
  intEnumVal: SimpleObjectCamelCaseIntEnumVal.First,
  intOptNullVal: 999999,
  intVal: 999999,
  numOptNullVal: 1.1,
  numVal: 1.1,
  strOptVal: "optional example",
  strVal: "example",
}).then((res: RequestBodyPostApplicationJsonSimpleCamelCaseResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                    | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `request`                                                                    | [shared.SimpleObjectCamelCase](../../models/shared/simpleobjectcamelcase.md) | :heavy_check_mark:                                                           | The request object to use for the request.                                   |
| `config`                                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                 | :heavy_minus_sign:                                                           | Available config options for making requests.                                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonSimpleCamelCaseResponse](../../models/operations/requestbodypostapplicationjsonsimplecamelcaseresponse.md)>**


## requestBodyPostComplexNumberTypes

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostComplexNumberTypesResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostComplexNumberTypes({
  complexNumberTypes: {
    bigint: 9766,
    bigintStr: "minus",
    decimal: 3082.86,
    decimalStr: "sapiente",
  },
  pathBigInt: 232865,
  pathBigIntStr: "esse",
  pathDecimal: 5034.27,
  pathDecimalStr: "provident",
  queryBigInt: 953722,
  queryBigIntStr: "nulla",
  queryDecimal: 5578.11,
  queryDecimalStr: "esse",
}).then((res: RequestBodyPostComplexNumberTypesResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [operations.RequestBodyPostComplexNumberTypesRequest](../../models/operations/requestbodypostcomplexnumbertypesrequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `config`                                                                                                                   | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                               | :heavy_minus_sign:                                                                                                         | Available config options for making requests.                                                                              |


### Response

**Promise<[operations.RequestBodyPostComplexNumberTypesResponse](../../models/operations/requestbodypostcomplexnumbertypesresponse.md)>**


## requestBodyPostEmptyObject

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostEmptyObjectResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostEmptyObject({
  empty: {},
  emptyWithEmptyProperties: {},
}).then((res: RequestBodyPostEmptyObjectResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [operations.RequestBodyPostEmptyObjectRequestBody](../../models/operations/requestbodypostemptyobjectrequestbody.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `config`                                                                                                             | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                         | :heavy_minus_sign:                                                                                                   | Available config options for making requests.                                                                        |


### Response

**Promise<[operations.RequestBodyPostEmptyObjectResponse](../../models/operations/requestbodypostemptyobjectresponse.md)>**


## requestBodyPostFormDeep

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostFormDeepResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostFormDeep({
  any: {
    any: "a",
    bigint: 621679,
    bigintStr: "sint",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    decimal: 8630.23,
    enum: Enum.Two,
    float32: 2.2222222,
    int: 999999,
    int32: 1,
    int32Enum: SimpleObjectInt32Enum.OneHundredAndEightyOne,
    intEnum: SimpleObjectIntEnum.First,
    intOptNull: 999999,
    num: 1.1,
    numOptNull: 1.1,
    str: "example",
    strOpt: "optional example",
  },
  arr: [
    {
      any: "eveniet",
      bigint: 992430,
      bigintStr: "facere",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 850.01,
      enum: Enum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32Enum.FiftyFive,
      intEnum: SimpleObjectIntEnum.First,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
  ],
  bool: false,
  int: 628899,
  map: {
    "culpa": {
      any: "aliquid",
      bigint: 949298,
      bigintStr: "quae",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 9367.47,
      enum: Enum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32Enum.SixtyNine,
      intEnum: SimpleObjectIntEnum.Second,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
  },
  num: 2586.84,
  obj: {
    any: "libero",
    bigint: 849039,
    bigintStr: "soluta",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    decimal: 333.04,
    enum: Enum.Two,
    float32: 2.2222222,
    int: 999999,
    int32: 1,
    int32Enum: SimpleObjectInt32Enum.FiftyFive,
    intEnum: SimpleObjectIntEnum.Third,
    intOptNull: 999999,
    num: 1.1,
    numOptNull: 1.1,
    str: "example",
    strOpt: "optional example",
  },
  str: "dicta",
  type: "ullam",
}).then((res: RequestBodyPostFormDeepResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.DeepObject](../../models/shared/deepobject.md)       | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostFormDeepResponse](../../models/operations/requestbodypostformdeepresponse.md)>**


## requestBodyPostFormMapPrimitive

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostFormMapPrimitiveResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostFormMapPrimitive({
  "reprehenderit": "ullam",
}).then((res: RequestBodyPostFormMapPrimitiveResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Record<string, string>](../../models//.md)                  | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostFormMapPrimitiveResponse](../../models/operations/requestbodypostformmapprimitiveresponse.md)>**


## requestBodyPostFormSimple

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostFormSimpleResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostFormSimple({
  any: "nisi",
  bigint: 16328,
  bigintStr: "voluptatum",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
  decimal: 1852.32,
  enum: Enum.Two,
  float32: 2.2222222,
  int: 999999,
  int32: 1,
  int32Enum: SimpleObjectInt32Enum.OneHundredAndEightyOne,
  intEnum: SimpleObjectIntEnum.Second,
  intOptNull: 999999,
  num: 1.1,
  numOptNull: 1.1,
  str: "example",
  strOpt: "optional example",
}).then((res: RequestBodyPostFormSimpleResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.SimpleObject](../../models/shared/simpleobject.md)   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostFormSimpleResponse](../../models/operations/requestbodypostformsimpleresponse.md)>**


## requestBodyPostMultipleContentTypesComponentFiltered

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostMultipleContentTypesComponentFilteredResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostMultipleContentTypesComponentFiltered({
  any: "deleniti",
  bigint: 929292,
  bigintStr: "dolorum",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
  decimal: 996.15,
  enum: Enum.Two,
  float32: 2.2222222,
  int: 999999,
  int32: 1,
  int32Enum: SimpleObjectInt32Enum.SixtyNine,
  intEnum: SimpleObjectIntEnum.Third,
  intOptNull: 999999,
  num: 1.1,
  numOptNull: 1.1,
  str: "example",
  strOpt: "optional example",
}).then((res: RequestBodyPostMultipleContentTypesComponentFilteredResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.SimpleObject](../../models/shared/simpleobject.md)   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostMultipleContentTypesComponentFilteredResponse](../../models/operations/requestbodypostmultiplecontenttypescomponentfilteredresponse.md)>**


## requestBodyPostMultipleContentTypesInlineFiltered

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostMultipleContentTypesInlineFilteredResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostMultipleContentTypesInlineFiltered({
  bool: false,
  num: 984.78,
  str: "at",
}).then((res: RequestBodyPostMultipleContentTypesInlineFilteredResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                                                                                                  | Type                                                                                                                                                                       | Required                                                                                                                                                                   | Description                                                                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                                  | [operations.RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON](../../models/operations/requestbodypostmultiplecontenttypesinlinefilteredapplicationjson.md) | :heavy_check_mark:                                                                                                                                                         | The request object to use for the request.                                                                                                                                 |
| `config`                                                                                                                                                                   | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                                                               | :heavy_minus_sign:                                                                                                                                                         | Available config options for making requests.                                                                                                                              |


### Response

**Promise<[operations.RequestBodyPostMultipleContentTypesInlineFilteredResponse](../../models/operations/requestbodypostmultiplecontenttypesinlinefilteredresponse.md)>**


## requestBodyPostMultipleContentTypesSplitParamForm

### Example Usage

```typescript
import { SDK } from "openapi";
import {
  RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded,
  RequestBodyPostMultipleContentTypesSplitParamFormRequest,
  RequestBodyPostMultipleContentTypesSplitParamFormResponse,
} from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const requestBody: RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded = {
  bool3: false,
  num3: 920.27,
  str3: "voluptate",
};
const paramStr: string = "ipsa";

sdk.requestBodies.requestBodyPostMultipleContentTypesSplitParamForm(requestBody, paramStr).then((res: RequestBodyPostMultipleContentTypesSplitParamFormResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                                                                                                                      | Type                                                                                                                                                                                           | Required                                                                                                                                                                                       | Description                                                                                                                                                                                    |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                                                                                                  | [operations.RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded](../../models/operations/requestbodypostmultiplecontenttypessplitparamapplicationxwwwformurlencoded.md) | :heavy_check_mark:                                                                                                                                                                             | N/A                                                                                                                                                                                            |
| `paramStr`                                                                                                                                                                                     | *string*                                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                                             | N/A                                                                                                                                                                                            |
| `config`                                                                                                                                                                                       | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                                                                                   | :heavy_minus_sign:                                                                                                                                                                             | Available config options for making requests.                                                                                                                                                  |


### Response

**Promise<[operations.RequestBodyPostMultipleContentTypesSplitParamFormResponse](../../models/operations/requestbodypostmultiplecontenttypessplitparamformresponse.md)>**


## requestBodyPostMultipleContentTypesSplitParamJson

### Example Usage

```typescript
import { SDK } from "openapi";
import {
  RequestBodyPostMultipleContentTypesSplitParamApplicationJSON,
  RequestBodyPostMultipleContentTypesSplitParamJsonRequest,
  RequestBodyPostMultipleContentTypesSplitParamJsonResponse,
} from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const requestBody: RequestBodyPostMultipleContentTypesSplitParamApplicationJSON = {
  bool: false,
  num: 3267.01,
  str: "veritatis",
};
const paramStr: string = "consectetur";

sdk.requestBodies.requestBodyPostMultipleContentTypesSplitParamJson(requestBody, paramStr).then((res: RequestBodyPostMultipleContentTypesSplitParamJsonResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `requestBody`                                                                                                                                                      | [operations.RequestBodyPostMultipleContentTypesSplitParamApplicationJSON](../../models/operations/requestbodypostmultiplecontenttypessplitparamapplicationjson.md) | :heavy_check_mark:                                                                                                                                                 | N/A                                                                                                                                                                |
| `paramStr`                                                                                                                                                         | *string*                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                 | N/A                                                                                                                                                                |
| `config`                                                                                                                                                           | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                                                       | :heavy_minus_sign:                                                                                                                                                 | Available config options for making requests.                                                                                                                      |


### Response

**Promise<[operations.RequestBodyPostMultipleContentTypesSplitParamJsonResponse](../../models/operations/requestbodypostmultiplecontenttypessplitparamjsonresponse.md)>**


## requestBodyPostMultipleContentTypesSplitParamMultipart

### Example Usage

```typescript
import { SDK } from "openapi";
import {
  RequestBodyPostMultipleContentTypesSplitParamMultipartFormData,
  RequestBodyPostMultipleContentTypesSplitParamMultipartRequest,
  RequestBodyPostMultipleContentTypesSplitParamMultipartResponse,
} from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const requestBody: RequestBodyPostMultipleContentTypesSplitParamMultipartFormData = {
  bool2: false,
  num2: 2371.73,
  str2: "iste",
};
const paramStr: string = "temporibus";

sdk.requestBodies.requestBodyPostMultipleContentTypesSplitParamMultipart(requestBody, paramStr).then((res: RequestBodyPostMultipleContentTypesSplitParamMultipartResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                                                                                              | Type                                                                                                                                                                   | Required                                                                                                                                                               | Description                                                                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                                                                          | [operations.RequestBodyPostMultipleContentTypesSplitParamMultipartFormData](../../models/operations/requestbodypostmultiplecontenttypessplitparammultipartformdata.md) | :heavy_check_mark:                                                                                                                                                     | N/A                                                                                                                                                                    |
| `paramStr`                                                                                                                                                             | *string*                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                     | N/A                                                                                                                                                                    |
| `config`                                                                                                                                                               | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                                                           | :heavy_minus_sign:                                                                                                                                                     | Available config options for making requests.                                                                                                                          |


### Response

**Promise<[operations.RequestBodyPostMultipleContentTypesSplitParamMultipartResponse](../../models/operations/requestbodypostmultiplecontenttypessplitparammultipartresponse.md)>**


## requestBodyPostMultipleContentTypesSplitForm

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostMultipleContentTypesSplitFormResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostMultipleContentTypesSplitForm({
  bool3: false,
  num3: 330.74,
  str3: "rem",
}).then((res: RequestBodyPostMultipleContentTypesSplitFormResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                                                                                                            | Type                                                                                                                                                                                 | Required                                                                                                                                                                             | Description                                                                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                            | [operations.RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded](../../models/operations/requestbodypostmultiplecontenttypessplitapplicationxwwwformurlencoded.md) | :heavy_check_mark:                                                                                                                                                                   | The request object to use for the request.                                                                                                                                           |
| `config`                                                                                                                                                                             | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                   | Available config options for making requests.                                                                                                                                        |


### Response

**Promise<[operations.RequestBodyPostMultipleContentTypesSplitFormResponse](../../models/operations/requestbodypostmultiplecontenttypessplitformresponse.md)>**


## requestBodyPostMultipleContentTypesSplitJson

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostMultipleContentTypesSplitJsonResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostMultipleContentTypesSplitJson({
  bool: false,
  num: 156.06,
  str: "laudantium",
}).then((res: RequestBodyPostMultipleContentTypesSplitJsonResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [operations.RequestBodyPostMultipleContentTypesSplitApplicationJSON](../../models/operations/requestbodypostmultiplecontenttypessplitapplicationjson.md) | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |
| `config`                                                                                                                                                 | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                                             | :heavy_minus_sign:                                                                                                                                       | Available config options for making requests.                                                                                                            |


### Response

**Promise<[operations.RequestBodyPostMultipleContentTypesSplitJsonResponse](../../models/operations/requestbodypostmultiplecontenttypessplitjsonresponse.md)>**


## requestBodyPostMultipleContentTypesSplitMultipart

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostMultipleContentTypesSplitMultipartResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostMultipleContentTypesSplitMultipart({
  bool2: false,
  num2: 4287.96,
  str2: "mollitia",
}).then((res: RequestBodyPostMultipleContentTypesSplitMultipartResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                                                                                    | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                    | [operations.RequestBodyPostMultipleContentTypesSplitMultipartFormData](../../models/operations/requestbodypostmultiplecontenttypessplitmultipartformdata.md) | :heavy_check_mark:                                                                                                                                           | The request object to use for the request.                                                                                                                   |
| `config`                                                                                                                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                                                 | :heavy_minus_sign:                                                                                                                                           | Available config options for making requests.                                                                                                                |


### Response

**Promise<[operations.RequestBodyPostMultipleContentTypesSplitMultipartResponse](../../models/operations/requestbodypostmultiplecontenttypessplitmultipartresponse.md)>**


## requestBodyPostNullArray

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostNullArrayResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostNullArray([
  "ab",
]).then((res: RequestBodyPostNullArrayResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [string[]](../../models//.md)                                | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostNullArrayResponse](../../models/operations/requestbodypostnullarrayresponse.md)>**


## requestBodyPostNullDictionary

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostNullDictionaryResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostNullDictionary({
  "corrupti": "non",
}).then((res: RequestBodyPostNullDictionaryResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Record<string, string>](../../models//.md)                  | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostNullDictionaryResponse](../../models/operations/requestbodypostnulldictionaryresponse.md)>**


## requestBodyPutBytes

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPutBytesResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPutBytes("voluptatem".encode()).then((res: RequestBodyPutBytesResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Uint8Array](../../models//.md)                              | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPutBytesResponse](../../models/operations/requestbodyputbytesresponse.md)>**


## requestBodyPutBytesWithParams

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPutBytesWithParamsRequest, RequestBodyPutBytesWithParamsResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const requestBody: Uint8Array = "dolor".encode();
const queryStringParam: string = "occaecati";

sdk.requestBodies.requestBodyPutBytesWithParams(requestBody, queryStringParam).then((res: RequestBodyPutBytesWithParamsResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `requestBody`                                                | *Uint8Array*                                                 | :heavy_check_mark:                                           | N/A                                                          |
| `queryStringParam`                                           | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPutBytesWithParamsResponse](../../models/operations/requestbodyputbyteswithparamsresponse.md)>**


## requestBodyPutMultipartDeep

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPutMultipartDeepResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPutMultipartDeep({
  any: {
    any: "impedit",
    bigint: 131055,
    bigintStr: "voluptas",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    decimal: 120.36,
    enum: Enum.Two,
    float32: 2.2222222,
    int: 999999,
    int32: 1,
    int32Enum: SimpleObjectInt32Enum.SixtyNine,
    intEnum: SimpleObjectIntEnum.First,
    intOptNull: 999999,
    num: 1.1,
    numOptNull: 1.1,
    str: "example",
    strOpt: "optional example",
  },
  arr: [
    {
      any: "maiores",
      bigint: 618480,
      bigintStr: "velit",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 9742.57,
      enum: Enum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32Enum.SixtyNine,
      intEnum: SimpleObjectIntEnum.Third,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
  ],
  bool: false,
  int: 45659,
  map: {
    "ea": {
      any: "quaerat",
      bigint: 162954,
      bigintStr: "repellendus",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 6387.62,
      enum: Enum.Two,
      float32: 2.2222222,
      int: 999999,
      int32: 1,
      int32Enum: SimpleObjectInt32Enum.OneHundredAndEightyOne,
      intEnum: SimpleObjectIntEnum.Second,
      intOptNull: 999999,
      num: 1.1,
      numOptNull: 1.1,
      str: "example",
      strOpt: "optional example",
    },
  },
  num: 6400.24,
  obj: {
    any: "asperiores",
    bigint: 368102,
    bigintStr: "quae",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    decimal: 3127.53,
    enum: Enum.Two,
    float32: 2.2222222,
    int: 999999,
    int32: 1,
    int32Enum: SimpleObjectInt32Enum.OneHundredAndEightyOne,
    intEnum: SimpleObjectIntEnum.Third,
    intOptNull: 999999,
    num: 1.1,
    numOptNull: 1.1,
    str: "example",
    strOpt: "optional example",
  },
  str: "labore",
  type: "ab",
}).then((res: RequestBodyPutMultipartDeepResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.DeepObject](../../models/shared/deepobject.md)       | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPutMultipartDeepResponse](../../models/operations/requestbodyputmultipartdeepresponse.md)>**


## requestBodyPutMultipartFile

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPutMultipartFileResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPutMultipartFile({
  file: {
    content: "adipisci".encode(),
    file: "fuga",
  },
}).then((res: RequestBodyPutMultipartFileResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [operations.RequestBodyPutMultipartFileRequestBody](../../models/operations/requestbodyputmultipartfilerequestbody.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `config`                                                                                                               | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                           | :heavy_minus_sign:                                                                                                     | Available config options for making requests.                                                                          |


### Response

**Promise<[operations.RequestBodyPutMultipartFileResponse](../../models/operations/requestbodyputmultipartfileresponse.md)>**


## requestBodyPutMultipartSimple

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPutMultipartSimpleResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPutMultipartSimple({
  any: "id",
  bigint: 380729,
  bigintStr: "velit",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
  decimal: 6339.31,
  enum: Enum.Two,
  float32: 2.2222222,
  int: 999999,
  int32: 1,
  int32Enum: SimpleObjectInt32Enum.SixtyNine,
  intEnum: SimpleObjectIntEnum.Third,
  intOptNull: 999999,
  num: 1.1,
  numOptNull: 1.1,
  str: "example",
  strOpt: "optional example",
}).then((res: RequestBodyPutMultipartSimpleResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.SimpleObject](../../models/shared/simpleobject.md)   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPutMultipartSimpleResponse](../../models/operations/requestbodyputmultipartsimpleresponse.md)>**


## requestBodyPutString

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPutStringResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPutString("totam").then((res: RequestBodyPutStringResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [string](../../models//.md)                                  | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPutStringResponse](../../models/operations/requestbodyputstringresponse.md)>**


## requestBodyPutStringWithParams

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPutStringWithParamsRequest, RequestBodyPutStringWithParamsResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});
const requestBody: string = "fugiat";
const queryStringParam: string = "vel";

sdk.requestBodies.requestBodyPutStringWithParams(requestBody, queryStringParam).then((res: RequestBodyPutStringWithParamsResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `requestBody`                                                | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `queryStringParam`                                           | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPutStringWithParamsResponse](../../models/operations/requestbodyputstringwithparamsresponse.md)>**


## requestBodyReadAndWrite

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyReadAndWriteResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyReadAndWrite({
  num1: 497678,
  num2: 554688,
  num3: 427834,
}).then((res: RequestBodyReadAndWriteResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                  | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `request`                                                                  | [shared.ReadWriteObjectInput](../../models/shared/readwriteobjectinput.md) | :heavy_check_mark:                                                         | The request object to use for the request.                                 |
| `serverURL`                                                                | *string*                                                                   | :heavy_minus_sign:                                                         | An optional server URL to use.                                             |
| `config`                                                                   | [AxiosRequestConfig](https://axios-http.com/docs/req_config)               | :heavy_minus_sign:                                                         | Available config options for making requests.                              |


### Response

**Promise<[operations.RequestBodyReadAndWriteResponse](../../models/operations/requestbodyreadandwriteresponse.md)>**


## requestBodyReadOnlyInput

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyReadOnlyInputResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyReadOnlyInput({}).then((res: RequestBodyReadOnlyInputResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `request`                                                                | [shared.ReadOnlyObjectInput](../../models/shared/readonlyobjectinput.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |
| `serverURL`                                                              | *string*                                                                 | :heavy_minus_sign:                                                       | An optional server URL to use.                                           |
| `config`                                                                 | [AxiosRequestConfig](https://axios-http.com/docs/req_config)             | :heavy_minus_sign:                                                       | Available config options for making requests.                            |


### Response

**Promise<[operations.RequestBodyReadOnlyInputResponse](../../models/operations/requestbodyreadonlyinputresponse.md)>**


## requestBodyReadOnlyUnion

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyReadOnlyUnionResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyReadOnlyUnion({
  any: "possimus",
  bigint: 706575,
  bigintStr: "cum",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
  decimal: 4148.57,
  enum: Enum.Two,
  float32: 2.2222222,
  int: 999999,
  int32: 1,
  int32Enum: SimpleObjectInt32Enum.SixtyNine,
  intEnum: SimpleObjectIntEnum.Second,
  intOptNull: 999999,
  num: 1.1,
  numOptNull: 1.1,
  str: "example",
  strOpt: "optional example",
}).then((res: RequestBodyReadOnlyUnionResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [any](../../models//input.md)                                | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyReadOnlyUnionResponse](../../models/operations/requestbodyreadonlyunionresponse.md)>**


## requestBodyReadWriteOnlyUnion

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyReadWriteOnlyUnionResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyReadWriteOnlyUnion({
  num1: 828657,
  num2: 363161,
  num3: 924967,
}).then((res: RequestBodyReadWriteOnlyUnionResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [any](../../models//input.md)                                | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyReadWriteOnlyUnionResponse](../../models/operations/requestbodyreadwriteonlyunionresponse.md)>**


## requestBodyWriteOnly

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyWriteOnlyResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyWriteOnly({
  bool: false,
  num: 3975.33,
  string: "aperiam",
}).then((res: RequestBodyWriteOnlyResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                        | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `request`                                                        | [shared.WriteOnlyObject](../../models/shared/writeonlyobject.md) | :heavy_check_mark:                                               | The request object to use for the request.                       |
| `serverURL`                                                      | *string*                                                         | :heavy_minus_sign:                                               | An optional server URL to use.                                   |
| `config`                                                         | [AxiosRequestConfig](https://axios-http.com/docs/req_config)     | :heavy_minus_sign:                                               | Available config options for making requests.                    |


### Response

**Promise<[operations.RequestBodyWriteOnlyResponse](../../models/operations/requestbodywriteonlyresponse.md)>**


## requestBodyWriteOnlyOutput

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyWriteOnlyOutputResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyWriteOnlyOutput({
  bool: false,
  num: 7386.83,
  string: "consectetur",
}).then((res: RequestBodyWriteOnlyOutputResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                        | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `request`                                                        | [shared.WriteOnlyObject](../../models/shared/writeonlyobject.md) | :heavy_check_mark:                                               | The request object to use for the request.                       |
| `serverURL`                                                      | *string*                                                         | :heavy_minus_sign:                                               | An optional server URL to use.                                   |
| `config`                                                         | [AxiosRequestConfig](https://axios-http.com/docs/req_config)     | :heavy_minus_sign:                                               | Available config options for making requests.                    |


### Response

**Promise<[operations.RequestBodyWriteOnlyOutputResponse](../../models/operations/requestbodywriteonlyoutputresponse.md)>**


## requestBodyWriteOnlyUnion

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyWriteOnlyUnionResponse } from "openapi/dist/sdk/models/operations";
import { Enum, SimpleObjectInt32Enum, SimpleObjectIntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyWriteOnlyUnion({
  any: "exercitationem",
  bigint: 937285,
  bigintStr: "facere",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
  decimal: 2572.33,
  enum: Enum.Two,
  float32: 2.2222222,
  int: 999999,
  int32: 1,
  int32Enum: SimpleObjectInt32Enum.OneHundredAndEightyOne,
  intEnum: SimpleObjectIntEnum.Second,
  intOptNull: 999999,
  num: 1.1,
  numOptNull: 1.1,
  str: "example",
  strOpt: "optional example",
}).then((res: RequestBodyWriteOnlyUnionResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [any](../../models//.md)                                     | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyWriteOnlyUnionResponse](../../models/operations/requestbodywriteonlyunionresponse.md)>**

