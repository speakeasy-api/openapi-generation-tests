# RequestBodies

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
* [requestBodyPostDefaultsAndConsts](#requestbodypostdefaultsandconsts)
* [requestBodyPostEmptyObject](#requestbodypostemptyobject)
* [requestBodyPostFormDeep](#requestbodypostformdeep)
* [requestBodyPostFormMapPrimitive](#requestbodypostformmapprimitive)
* [requestBodyPostFormSimple](#requestbodypostformsimple)
* [requestBodyPostJsonDataTypesArrayBigInt](#requestbodypostjsondatatypesarraybigint)
* [requestBodyPostJsonDataTypesArrayDate](#requestbodypostjsondatatypesarraydate)
* [requestBodyPostJsonDataTypesArrayDecimalStr](#requestbodypostjsondatatypesarraydecimalstr)
* [requestBodyPostJsonDataTypesBigInt](#requestbodypostjsondatatypesbigint)
* [requestBodyPostJsonDataTypesBigIntStr](#requestbodypostjsondatatypesbigintstr)
* [requestBodyPostJsonDataTypesBoolean](#requestbodypostjsondatatypesboolean)
* [requestBodyPostJsonDataTypesDate](#requestbodypostjsondatatypesdate)
* [requestBodyPostJsonDataTypesDateTime](#requestbodypostjsondatatypesdatetime)
* [requestBodyPostJsonDataTypesDecimal](#requestbodypostjsondatatypesdecimal)
* [requestBodyPostJsonDataTypesDecimalStr](#requestbodypostjsondatatypesdecimalstr)
* [requestBodyPostJsonDataTypesFloat32](#requestbodypostjsondatatypesfloat32)
* [requestBodyPostJsonDataTypesInt32](#requestbodypostjsondatatypesint32)
* [requestBodyPostJsonDataTypesInteger](#requestbodypostjsondatatypesinteger)
* [requestBodyPostJsonDataTypesMapBigIntStr](#requestbodypostjsondatatypesmapbigintstr)
* [requestBodyPostJsonDataTypesMapDateTime](#requestbodypostjsondatatypesmapdatetime)
* [requestBodyPostJsonDataTypesMapDecimal](#requestbodypostjsondatatypesmapdecimal)
* [requestBodyPostJsonDataTypesNumber](#requestbodypostjsondatatypesnumber)
* [requestBodyPostJsonDataTypesString](#requestbodypostjsondatatypesstring)
* [requestBodyPostMultipleContentTypesComponentFiltered](#requestbodypostmultiplecontenttypescomponentfiltered)
* [requestBodyPostMultipleContentTypesInlineFiltered](#requestbodypostmultiplecontenttypesinlinefiltered)
* [requestBodyPostMultipleContentTypesSplitParamForm](#requestbodypostmultiplecontenttypessplitparamform)
* [requestBodyPostMultipleContentTypesSplitParamJson](#requestbodypostmultiplecontenttypessplitparamjson)
* [requestBodyPostMultipleContentTypesSplitParamMultipart](#requestbodypostmultiplecontenttypessplitparammultipart)
* [requestBodyPostMultipleContentTypesSplitForm](#requestbodypostmultiplecontenttypessplitform)
* [requestBodyPostMultipleContentTypesSplitJson](#requestbodypostmultiplecontenttypessplitjson)
* [requestBodyPostMultipleContentTypesSplitMultipart](#requestbodypostmultiplecontenttypessplitmultipart)
* [requestBodyPostNotNullableNotRequiredStringBody](#requestbodypostnotnullablenotrequiredstringbody)
* [requestBodyPostNullArray](#requestbodypostnullarray)
* [requestBodyPostNullDictionary](#requestbodypostnulldictionary)
* [requestBodyPostNullableNotRequiredStringBody](#requestbodypostnullablenotrequiredstringbody)
* [requestBodyPostNullableRequiredStringBody](#requestbodypostnullablerequiredstringbody)
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
  optional: "ab",
  required: 587600,
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
  nullableOptionalInt: 9688,
  nullableRequiredArray: [
    2728.22,
  ],
  nullableRequiredEnum: NullableRequiredPropertyPostRequestBodyNullableRequiredEnum.Second,
  nullableRequiredInt: 370853,
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
    optional: "aspernatur",
    required: 197054,
  },
  nullableRequiredObj: {
    optional: "quo",
    required: 459856,
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
    anyVal: "nihil",
    bigintStrVal: "totam",
    bigintVal: 882710,
    boolOptVal: true,
    boolVal: true,
    dateTimeVal: new Date("2020-01-01T00:00:00Z"),
    dateVal: new RFCDate("2020-01-01"),
    decimalVal: 3068.1,
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
    any: "commodi",
    bigint: 959434,
    bigintStr: "dolores",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    decimal: 6455.7,
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
    anyVal: "porro",
    bigintStrVal: "eum",
    bigintVal: 556429,
    boolOptVal: true,
    boolVal: true,
    dateTimeVal: new Date("2020-01-01T00:00:00Z"),
    dateVal: new RFCDate("2020-01-01"),
    decimalVal: 5100.17,
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
      any: "fugit",
      bigint: 681393,
      bigintStr: "mollitia",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 2775.96,
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
      anyVal: "minima",
      bigintStrVal: "nisi",
      bigintVal: 147014,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 9564.06,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.FiftyFive,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.First,
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
    "explicabo",
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
    "saepe": {
      any: "occaecati",
      bigint: 543806,
      bigintStr: "et",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 4569.11,
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
    "veritatis": {
      anyVal: "esse",
      bigintStrVal: "quod",
      bigintVal: 724168,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 8771.31,
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
  "saepe",
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
    any: "harum",
    bigint: 473221,
    bigintStr: "rerum",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    decimal: 5801.97,
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
  arr: [
    {
      any: "eligendi",
      bigint: 27069,
      bigintStr: "culpa",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 7313.98,
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
  ],
  bool: false,
  int: 160538,
  map: {
    "consequatur": {
      any: "minus",
      bigint: 308286,
      bigintStr: "sapiente",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 2328.65,
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
  num: 5909.84,
  obj: {
    any: "a",
    bigint: 857723,
    bigintStr: "quas",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    decimal: 4572.23,
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
  str: "error",
  type: "sint",
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
  anyVal: "possimus",
  arrVal: [
    {
      anyVal: "quia",
      bigintStrVal: "eveniet",
      bigintVal: 992430,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 8155.24,
      enumVal: Enum.Two,
      float32Val: 2.2222222,
      int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.FiftyFive,
      int32Val: 1,
      intEnumVal: SimpleObjectCamelCaseIntEnumVal.First,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
  ],
  boolVal: false,
  intVal: 94458,
  mapVal: {
    "similique": {
      anyVal: "culpa",
      bigintStrVal: "aliquid",
      bigintVal: 949298,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 627.13,
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
  },
  numVal: 4473.78,
  objVal: {
    anyVal: "eius",
    bigintStrVal: "libero",
    bigintVal: 849039,
    boolOptVal: true,
    boolVal: true,
    dateTimeVal: new Date("2020-01-01T00:00:00Z"),
    dateVal: new RFCDate("2020-01-01"),
    decimalVal: 7422.38,
    enumVal: Enum.Two,
    float32Val: 2.2222222,
    int32EnumVal: SimpleObjectCamelCaseInt32EnumVal.FiftyFive,
    int32Val: 1,
    intEnumVal: SimpleObjectCamelCaseIntEnumVal.First,
    intOptNullVal: 999999,
    intVal: 999999,
    numOptNullVal: 1.1,
    numVal: 1.1,
    strOptVal: "optional example",
    strVal: "example",
  },
  strVal: "sapiente",
  type: "dicta",
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
  "ullam": {
    any: "reprehenderit",
    bigint: 356707,
    bigintStr: "nisi",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    decimal: 163.28,
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
  "quibusdam": {
    anyVal: "ex",
    bigintStrVal: "deleniti",
    bigintVal: 929292,
    boolOptVal: true,
    boolVal: true,
    dateTimeVal: new Date("2020-01-01T00:00:00Z"),
    dateVal: new RFCDate("2020-01-01"),
    decimalVal: 6802.7,
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
  "tenetur": {
    any: "quasi",
    bigint: 869489,
    bigintStr: "et",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    decimal: 4541.62,
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
  "veritatis": {
    anyVal: "consectetur",
    bigintStrVal: "adipisci",
    bigintVal: 614465,
    boolOptVal: true,
    boolVal: true,
    dateTimeVal: new Date("2020-01-01T00:00:00Z"),
    dateVal: new RFCDate("2020-01-01"),
    decimalVal: 8395.13,
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
  "aut": [
    {
      any: "laudantium",
      bigint: 428796,
      bigintStr: "mollitia",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 680.74,
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
  "voluptatem": [
    {
      anyVal: "dolor",
      bigintStrVal: "occaecati",
      bigintVal: 253191,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 7710.89,
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
  "aut": {
    "dignissimos": {
      any: "dicta",
      bigint: 981640,
      bigintStr: "natus",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 2446.51,
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
  "asperiores": {
    "aperiam": {
      anyVal: "ea",
      bigintStrVal: "quaerat",
      bigintVal: 162954,
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      decimalVal: 8315.2,
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
  "dignissimos": {
    "officia": "asperiores",
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
  "nemo": "quae",
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
  any: "quaerat",
  bigint: 783235,
  bigintStr: "quod",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
  decimal: 2883.98,
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
  any: "fuga",
  bigint: 662505,
  bigintStr: "suscipit",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
  decimal: 2460.63,
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
  anyVal: "recusandae",
  bigintStrVal: "totam",
  bigintVal: 853940,
  boolOptVal: true,
  boolVal: true,
  dateTimeVal: new Date("2020-01-01T00:00:00Z"),
  dateVal: new RFCDate("2020-01-01"),
  decimalVal: 4240.89,
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
    bigint: 427834,
    bigintStr: "labore",
    decimal: 8225.6,
    decimalStr: "facilis",
  },
  pathBigInt: 738227,
  pathBigIntStr: "commodi",
  pathDecimal: 4471.44,
  pathDecimalStr: "corporis",
  queryBigInt: 968904,
  queryBigIntStr: "assumenda",
  queryDecimal: 3631.61,
  queryDecimalStr: "recusandae",
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


## requestBodyPostDefaultsAndConsts

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostDefaultsAndConstsResponse } from "openapi/dist/sdk/models/operations";
import {
  DefaultsAndConstsConstEnumInt,
  DefaultsAndConstsConstEnumStr,
  DefaultsAndConstsDefaultEnumInt,
  DefaultsAndConstsDefaultEnumStr,
  DefaultsAndConstsSingleEnumConstStr,
} from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostDefaultsAndConsts({
  constBigInt: 397533,
  constBigIntStr: "aperiam",
  constBool: false,
  constDate: new RFCDate("2022-07-15"),
  constDateTime: new Date("2022-08-26T18:58:12.703Z"),
  constDecimal: 9372.85,
  constDecimalStr: "facere",
  constEnumInt: DefaultsAndConstsConstEnumInt.One,
  constEnumStr: DefaultsAndConstsConstEnumStr.Three,
  constInt: 381760,
  constNum: 9689.72,
  constStr: "quidem",
  constStrNull: "saepe",
  defaultBigInt: 897071,
  defaultBigIntStr: "dolore",
  defaultBool: false,
  defaultDate: new RFCDate("2022-01-03"),
  defaultDateTime: new Date("2022-10-01T23:04:48.771Z"),
  defaultDecimal: 2282.63,
  defaultDecimalStr: "beatae",
  defaultEnumInt: DefaultsAndConstsDefaultEnumInt.Two,
  defaultEnumStr: DefaultsAndConstsDefaultEnumStr.Three,
  defaultInt: 891523,
  defaultNum: 2334.2,
  defaultStr: "corporis",
  defaultStrNullable: "harum",
  defaultStrOptional: "laboriosam",
  normalField: "ipsa",
  singleEnumConstBool: false,
  singleEnumConstStr: DefaultsAndConstsSingleEnumConstStr.One,
}).then((res: RequestBodyPostDefaultsAndConstsResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `request`                                                            | [shared.DefaultsAndConsts](../../models/shared/defaultsandconsts.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |
| `config`                                                             | [AxiosRequestConfig](https://axios-http.com/docs/req_config)         | :heavy_minus_sign:                                                   | Available config options for making requests.                        |


### Response

**Promise<[operations.RequestBodyPostDefaultsAndConstsResponse](../../models/operations/requestbodypostdefaultsandconstsresponse.md)>**


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
  any: "libero",
  arr: [
    {
      any: "vitae",
      bigint: 881721,
      bigintStr: "similique",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 2724.37,
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
  bool: false,
  int: 374244,
  map: {
    "voluptas": {
      any: "minima",
      bigint: 748789,
      bigintStr: "dolorum",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 2378.07,
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
  num: 5039.34,
  obj: {
    any: "in",
    bigint: 296242,
    bigintStr: "aliquam",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    decimal: 8859.63,
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
  str: "adipisci",
  type: "cum",
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
  "blanditiis": "quas",
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
  any: "hic",
  bigint: 201517,
  bigintStr: "culpa",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
  decimal: 5485.19,
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


## requestBodyPostJsonDataTypesArrayBigInt

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostJsonDataTypesArrayBigIntResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostJsonDataTypesArrayBigInt([
  940210,
]).then((res: RequestBodyPostJsonDataTypesArrayBigIntResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [number[]](../../models//.md)                                | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostJsonDataTypesArrayBigIntResponse](../../models/operations/requestbodypostjsondatatypesarraybigintresponse.md)>**


## requestBodyPostJsonDataTypesArrayDate

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostJsonDataTypesArrayDateResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostJsonDataTypesArrayDate([
  new RFCDate("2022-04-01"),
]).then((res: RequestBodyPostJsonDataTypesArrayDateResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [RFCDate[]](../../models//.md)                               | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostJsonDataTypesArrayDateResponse](../../models/operations/requestbodypostjsondatatypesarraydateresponse.md)>**


## requestBodyPostJsonDataTypesArrayDecimalStr

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostJsonDataTypesArrayDecimalStrResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostJsonDataTypesArrayDecimalStr([
  "sit",
]).then((res: RequestBodyPostJsonDataTypesArrayDecimalStrResponse) => {
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

**Promise<[operations.RequestBodyPostJsonDataTypesArrayDecimalStrResponse](../../models/operations/requestbodypostjsondatatypesarraydecimalstrresponse.md)>**


## requestBodyPostJsonDataTypesBigInt

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostJsonDataTypesBigIntResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostJsonDataTypesBigInt(699575).then((res: RequestBodyPostJsonDataTypesBigIntResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [number](../../models//.md)                                  | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostJsonDataTypesBigIntResponse](../../models/operations/requestbodypostjsondatatypesbigintresponse.md)>**


## requestBodyPostJsonDataTypesBigIntStr

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostJsonDataTypesBigIntStrResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostJsonDataTypesBigIntStr("sed").then((res: RequestBodyPostJsonDataTypesBigIntStrResponse) => {
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

**Promise<[operations.RequestBodyPostJsonDataTypesBigIntStrResponse](../../models/operations/requestbodypostjsondatatypesbigintstrresponse.md)>**


## requestBodyPostJsonDataTypesBoolean

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostJsonDataTypesBooleanResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostJsonDataTypesBoolean(false).then((res: RequestBodyPostJsonDataTypesBooleanResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [boolean](../../models//.md)                                 | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostJsonDataTypesBooleanResponse](../../models/operations/requestbodypostjsondatatypesbooleanresponse.md)>**


## requestBodyPostJsonDataTypesDate

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostJsonDataTypesDateResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostJsonDataTypesDate(new RFCDate("2022-08-09")).then((res: RequestBodyPostJsonDataTypesDateResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [RFCDate](../../models//.md)                                 | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostJsonDataTypesDateResponse](../../models/operations/requestbodypostjsondatatypesdateresponse.md)>**


## requestBodyPostJsonDataTypesDateTime

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostJsonDataTypesDateTimeResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostJsonDataTypesDateTime(new Date("2020-11-16T19:55:44.497Z")).then((res: RequestBodyPostJsonDataTypesDateTimeResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Date](../../models//.md)                                    | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostJsonDataTypesDateTimeResponse](../../models/operations/requestbodypostjsondatatypesdatetimeresponse.md)>**


## requestBodyPostJsonDataTypesDecimal

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostJsonDataTypesDecimalResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostJsonDataTypesDecimal(4518.22).then((res: RequestBodyPostJsonDataTypesDecimalResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [number](../../models//.md)                                  | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostJsonDataTypesDecimalResponse](../../models/operations/requestbodypostjsondatatypesdecimalresponse.md)>**


## requestBodyPostJsonDataTypesDecimalStr

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostJsonDataTypesDecimalStrResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostJsonDataTypesDecimalStr("expedita").then((res: RequestBodyPostJsonDataTypesDecimalStrResponse) => {
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

**Promise<[operations.RequestBodyPostJsonDataTypesDecimalStrResponse](../../models/operations/requestbodypostjsondatatypesdecimalstrresponse.md)>**


## requestBodyPostJsonDataTypesFloat32

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostJsonDataTypesFloat32Response } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostJsonDataTypesFloat32(708.69).then((res: RequestBodyPostJsonDataTypesFloat32Response) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [number](../../models//.md)                                  | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostJsonDataTypesFloat32Response](../../models/operations/requestbodypostjsondatatypesfloat32response.md)>**


## requestBodyPostJsonDataTypesInt32

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostJsonDataTypesInt32Response } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostJsonDataTypesInt32(611749).then((res: RequestBodyPostJsonDataTypesInt32Response) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [number](../../models//.md)                                  | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostJsonDataTypesInt32Response](../../models/operations/requestbodypostjsondatatypesint32response.md)>**


## requestBodyPostJsonDataTypesInteger

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostJsonDataTypesIntegerResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostJsonDataTypesInteger(292794).then((res: RequestBodyPostJsonDataTypesIntegerResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [number](../../models//.md)                                  | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostJsonDataTypesIntegerResponse](../../models/operations/requestbodypostjsondatatypesintegerresponse.md)>**


## requestBodyPostJsonDataTypesMapBigIntStr

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostJsonDataTypesMapBigIntStrResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostJsonDataTypesMapBigIntStr({
  "laborum": "sed",
}).then((res: RequestBodyPostJsonDataTypesMapBigIntStrResponse) => {
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

**Promise<[operations.RequestBodyPostJsonDataTypesMapBigIntStrResponse](../../models/operations/requestbodypostjsondatatypesmapbigintstrresponse.md)>**


## requestBodyPostJsonDataTypesMapDateTime

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostJsonDataTypesMapDateTimeResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostJsonDataTypesMapDateTime({
  "in": new Date("2022-04-21T22:21:50.112Z"),
}).then((res: RequestBodyPostJsonDataTypesMapDateTimeResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Record<string, Date>](../../models//.md)                    | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostJsonDataTypesMapDateTimeResponse](../../models/operations/requestbodypostjsondatatypesmapdatetimeresponse.md)>**


## requestBodyPostJsonDataTypesMapDecimal

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostJsonDataTypesMapDecimalResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostJsonDataTypesMapDecimal({
  "explicabo": 3783.26,
}).then((res: RequestBodyPostJsonDataTypesMapDecimalResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Record<string, number>](../../models//.md)                  | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostJsonDataTypesMapDecimalResponse](../../models/operations/requestbodypostjsondatatypesmapdecimalresponse.md)>**


## requestBodyPostJsonDataTypesNumber

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostJsonDataTypesNumberResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostJsonDataTypesNumber(6041.18).then((res: RequestBodyPostJsonDataTypesNumberResponse) => {
  if (res.statusCode == 200) {
    // handle response
  }
});
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [number](../../models//.md)                                  | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostJsonDataTypesNumberResponse](../../models/operations/requestbodypostjsondatatypesnumberresponse.md)>**


## requestBodyPostJsonDataTypesString

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostJsonDataTypesStringResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostJsonDataTypesString("architecto").then((res: RequestBodyPostJsonDataTypesStringResponse) => {
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

**Promise<[operations.RequestBodyPostJsonDataTypesStringResponse](../../models/operations/requestbodypostjsondatatypesstringresponse.md)>**


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
  any: "suscipit",
  bigint: 960257,
  bigintStr: "debitis",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
  decimal: 724.34,
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
  num: 5468.85,
  str: "maiores",
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
  num3: 2748.23,
  str3: "sed",
};
const paramStr: string = "provident";

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
  num: 2587.02,
  str: "necessitatibus",
};
const paramStr: string = "ipsum";

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
  num2: 4067.33,
  str2: "occaecati",
};
const paramStr: string = "quos";

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
  num3: 9757.52,
  str3: "tempora",
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
  num: 2730.09,
  str: "voluptate",
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
  num2: 9700.76,
  str2: "ex",
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


## requestBodyPostNotNullableNotRequiredStringBody

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostNotNullableNotRequiredStringBodyResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostNotNullableNotRequiredStringBody("sit").then((res: RequestBodyPostNotNullableNotRequiredStringBodyResponse) => {
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

**Promise<[operations.RequestBodyPostNotNullableNotRequiredStringBodyResponse](../../models/operations/requestbodypostnotnullablenotrequiredstringbodyresponse.md)>**


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
  "non",
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
  "officiis": "praesentium",
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


## requestBodyPostNullableNotRequiredStringBody

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostNullableNotRequiredStringBodyResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostNullableNotRequiredStringBody("facilis").then((res: RequestBodyPostNullableNotRequiredStringBodyResponse) => {
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

**Promise<[operations.RequestBodyPostNullableNotRequiredStringBodyResponse](../../models/operations/requestbodypostnullablenotrequiredstringbodyresponse.md)>**


## requestBodyPostNullableRequiredStringBody

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPostNullableRequiredStringBodyResponse } from "openapi/dist/sdk/models/operations";

const sdk = new SDK({
  security: {
    apiKeyAuth: "Token YOUR_API_KEY",
  },
  globalPathParam: 100,
  globalQueryParam: "some example global query param",
});

sdk.requestBodies.requestBodyPostNullableRequiredStringBody("quaerat").then((res: RequestBodyPostNullableRequiredStringBodyResponse) => {
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

**Promise<[operations.RequestBodyPostNullableRequiredStringBodyResponse](../../models/operations/requestbodypostnullablerequiredstringbodyresponse.md)>**


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

sdk.requestBodies.requestBodyPutBytes("incidunt".encode()).then((res: RequestBodyPutBytesResponse) => {
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
const requestBody: Uint8Array = "ipsam".encode();
const queryStringParam: string = "debitis";

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
  any: "sit",
  arr: [
    {
      any: "nobis",
      bigint: 625637,
      bigintStr: "veniam",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 3295.43,
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
  ],
  bool: false,
  int: 862319,
  map: {
    "magni": {
      any: "aperiam",
      bigint: 901483,
      bigintStr: "numquam",
      bool: true,
      boolOpt: true,
      date: new RFCDate("2020-01-01"),
      dateTime: new Date("2020-01-01T00:00:00Z"),
      decimal: 3299.35,
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
  },
  num: 1046.27,
  obj: {
    any: "laudantium",
    bigint: 348476,
    bigintStr: "praesentium",
    bool: true,
    boolOpt: true,
    date: new RFCDate("2020-01-01"),
    dateTime: new Date("2020-01-01T00:00:00Z"),
    decimal: 7400.98,
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
  str: "voluptatum",
  type: "error",
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
    content: "hic".encode(),
    file: "expedita",
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
  any: "debitis",
  bigint: 204923,
  bigintStr: "dolorum",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
  decimal: 3416.98,
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

sdk.requestBodies.requestBodyPutString("corrupti").then((res: RequestBodyPutStringResponse) => {
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
const requestBody: string = "accusamus";
const queryStringParam: string = "tempora";

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
  num1: 543678,
  num2: 148268,
  num3: 282699,
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

sdk.requestBodies.requestBodyReadOnlyUnion({}).then((res: RequestBodyReadOnlyUnionResponse) => {
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
  any: "culpa",
  bigint: 710337,
  bigintStr: "magnam",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
  decimal: 78.84,
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
  num: 245.27,
  string: "voluptatum",
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
  num: 5580.65,
  string: "repudiandae",
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
  any: "et",
  bigint: 502710,
  bigintStr: "ex",
  bool: true,
  boolOpt: true,
  date: new RFCDate("2020-01-01"),
  dateTime: new Date("2020-01-01T00:00:00Z"),
  decimal: 1536.27,
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

