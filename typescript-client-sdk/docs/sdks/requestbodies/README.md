# RequestBodies
(*requestBodies*)

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
* [requestBodyPutMultipartDifferentFileName](#requestbodyputmultipartdifferentfilename)
* [requestBodyPutMultipartFile](#requestbodyputmultipartfile)
* [requestBodyPutMultipartOptionalRequestBody](#requestbodyputmultipartoptionalrequestbody)
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

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.nullableObjectPost({
    required: 302382,
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                          | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `request`                                                          | [shared.NullableObject](../../sdk/models/shared/nullableobject.md) | :heavy_check_mark:                                                 | The request object to use for the request.                         |
| `config`                                                           | [AxiosRequestConfig](https://axios-http.com/docs/req_config)       | :heavy_minus_sign:                                                 | Available config options for making requests.                      |


### Response

**Promise<[operations.NullableObjectPostResponse](../../sdk/models/operations/nullableobjectpostresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## nullableRequiredEmptyObjectPost

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.nullableRequiredEmptyObjectPost({
    nullableOptionalObj: {},
    nullableRequiredObj: {},
    requiredObj: {},
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [operations.NullableRequiredEmptyObjectPostRequestBody](../../sdk/models/operations/nullablerequiredemptyobjectpostrequestbody.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |
| `config`                                                                                                                           | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                       | :heavy_minus_sign:                                                                                                                 | Available config options for making requests.                                                                                      |


### Response

**Promise<[operations.NullableRequiredEmptyObjectPostResponse](../../sdk/models/operations/nullablerequiredemptyobjectpostresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## nullableRequiredPropertyPost

### Example Usage

```typescript
import { SDK } from "openapi";
import { NullableRequiredEnum } from "openapi/dist/sdk/models/operations";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.nullableRequiredPropertyPost({
    nullableRequiredArray: [
      2355.17,
    ],
    nullableRequiredEnum: NullableRequiredEnum.Second,
    nullableRequiredInt: 50266,
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [operations.NullableRequiredPropertyPostRequestBody](../../sdk/models/operations/nullablerequiredpropertypostrequestbody.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `config`                                                                                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                 | :heavy_minus_sign:                                                                                                           | Available config options for making requests.                                                                                |


### Response

**Promise<[operations.NullableRequiredPropertyPostResponse](../../sdk/models/operations/nullablerequiredpropertypostresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## nullableRequiredSharedObjectPost

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.nullableRequiredSharedObjectPost({
    nullableOptionalObj: {
      required: 86533,
    },
    nullableRequiredObj: {
      required: 964394,
    },
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [operations.NullableRequiredSharedObjectPostRequestBody](../../sdk/models/operations/nullablerequiredsharedobjectpostrequestbody.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |
| `config`                                                                                                                             | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                         | :heavy_minus_sign:                                                                                                                   | Available config options for making requests.                                                                                        |


### Response

**Promise<[operations.NullableRequiredSharedObjectPostResponse](../../sdk/models/operations/nullablerequiredsharedobjectpostresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostApplicationJsonArray

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostApplicationJsonArray([
    {
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
  ]);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.SimpleObject[]](../../models/.md)                    | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonArrayResponse](../../sdk/models/operations/requestbodypostapplicationjsonarrayresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostApplicationJsonArrayCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32EnumVal, IntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostApplicationJsonArrayCamelCase([
    {
      anyVal: "any example",
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      enumVal: Enum.One,
      float32Val: 2.2222222,
      int32EnumVal: Int32EnumVal.SixtyNine,
      int32Val: 1,
      intEnumVal: IntEnumVal.Third,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
  ]);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.SimpleObjectCamelCase[]](../../models/.md)           | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonArrayCamelCaseResponse](../../sdk/models/operations/requestbodypostapplicationjsonarraycamelcaseresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostApplicationJsonArrayObj

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostApplicationJsonArrayObj([
    {
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
  ]);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.SimpleObject[]](../../models/.md)                    | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonArrayObjResponse](../../sdk/models/operations/requestbodypostapplicationjsonarrayobjresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostApplicationJsonArrayObjCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32EnumVal, IntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostApplicationJsonArrayObjCamelCase([
    {
      anyVal: "any example",
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      enumVal: Enum.One,
      float32Val: 2.2222222,
      int32EnumVal: Int32EnumVal.SixtyNine,
      int32Val: 1,
      intEnumVal: IntEnumVal.Third,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
  ]);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.SimpleObjectCamelCase[]](../../models/.md)           | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonArrayObjCamelCaseResponse](../../sdk/models/operations/requestbodypostapplicationjsonarrayobjcamelcaseresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostApplicationJsonArrayOfArray

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostApplicationJsonArrayOfArray([
    [
      {
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
    ],
  ]);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.SimpleObject[][]](../../models/.md)                  | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonArrayOfArrayResponse](../../sdk/models/operations/requestbodypostapplicationjsonarrayofarrayresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostApplicationJsonArrayOfArrayCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32EnumVal, IntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostApplicationJsonArrayOfArrayCamelCase([
    [
      {
        anyVal: "any example",
        boolOptVal: true,
        boolVal: true,
        dateTimeVal: new Date("2020-01-01T00:00:00Z"),
        dateVal: new RFCDate("2020-01-01"),
        enumVal: Enum.One,
        float32Val: 2.2222222,
        int32EnumVal: Int32EnumVal.SixtyNine,
        int32Val: 1,
        intEnumVal: IntEnumVal.Third,
        intOptNullVal: 999999,
        intVal: 999999,
        numOptNullVal: 1.1,
        numVal: 1.1,
        strOptVal: "optional example",
        strVal: "example",
      },
    ],
  ]);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.SimpleObjectCamelCase[][]](../../models/.md)         | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonArrayOfArrayCamelCaseResponse](../../sdk/models/operations/requestbodypostapplicationjsonarrayofarraycamelcaseresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostApplicationJsonArrayOfArrayOfPrimitive

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostApplicationJsonArrayOfArrayOfPrimitive([
    [
      "string",
    ],
  ]);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [string[][]](../../models/.md)                               | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse](../../sdk/models/operations/requestbodypostapplicationjsonarrayofarrayofprimitiveresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostApplicationJsonArrayOfMap

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostApplicationJsonArrayOfMap([
    {
      "key": {
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
  ]);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Record<string, shared.SimpleObject>[]](../../models/.md)    | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonArrayOfMapResponse](../../sdk/models/operations/requestbodypostapplicationjsonarrayofmapresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostApplicationJsonArrayOfMapCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32EnumVal, IntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostApplicationJsonArrayOfMapCamelCase([
    {
      "key": {
        anyVal: "any example",
        boolOptVal: true,
        boolVal: true,
        dateTimeVal: new Date("2020-01-01T00:00:00Z"),
        dateVal: new RFCDate("2020-01-01"),
        enumVal: Enum.One,
        float32Val: 2.2222222,
        int32EnumVal: Int32EnumVal.SixtyNine,
        int32Val: 1,
        intEnumVal: IntEnumVal.Third,
        intOptNullVal: 999999,
        intVal: 999999,
        numOptNullVal: 1.1,
        numVal: 1.1,
        strOptVal: "optional example",
        strVal: "example",
      },
    },
  ]);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                          | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `request`                                                          | [Record<string, shared.SimpleObjectCamelCase>[]](../../models/.md) | :heavy_check_mark:                                                 | The request object to use for the request.                         |
| `serverURL`                                                        | *string*                                                           | :heavy_minus_sign:                                                 | An optional server URL to use.                                     |
| `config`                                                           | [AxiosRequestConfig](https://axios-http.com/docs/req_config)       | :heavy_minus_sign:                                                 | Available config options for making requests.                      |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonArrayOfMapCamelCaseResponse](../../sdk/models/operations/requestbodypostapplicationjsonarrayofmapcamelcaseresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostApplicationJsonArrayOfPrimitive

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostApplicationJsonArrayOfPrimitive([
    "string",
  ]);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [string[]](../../models/.md)                                 | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonArrayOfPrimitiveResponse](../../sdk/models/operations/requestbodypostapplicationjsonarrayofprimitiveresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostApplicationJsonDeep

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostApplicationJsonDeep({
    any: "anyOf[0]",
    arr: [
      {
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
      {
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
    ],
    bool: true,
    int: 1,
    map: {
      "key": {
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
      "key2": {
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
    num: 1.1,
    obj: {
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
    str: "test",
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.DeepObject](../../sdk/models/shared/deepobject.md)   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonDeepResponse](../../sdk/models/operations/requestbodypostapplicationjsondeepresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostApplicationJsonDeepCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32EnumVal, IntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostApplicationJsonDeepCamelCase({
    anyVal: "string",
    arrVal: [
      {
        anyVal: "any example",
        boolOptVal: true,
        boolVal: true,
        dateTimeVal: new Date("2020-01-01T00:00:00Z"),
        dateVal: new RFCDate("2020-01-01"),
        enumVal: Enum.One,
        float32Val: 2.2222222,
        int32EnumVal: Int32EnumVal.SixtyNine,
        int32Val: 1,
        intEnumVal: IntEnumVal.Third,
        intOptNullVal: 999999,
        intVal: 999999,
        numOptNullVal: 1.1,
        numVal: 1.1,
        strOptVal: "optional example",
        strVal: "example",
      },
    ],
    boolVal: false,
    intVal: 66469,
    mapVal: {
      "key": {
        anyVal: "any example",
        boolOptVal: true,
        boolVal: true,
        dateTimeVal: new Date("2020-01-01T00:00:00Z"),
        dateVal: new RFCDate("2020-01-01"),
        enumVal: Enum.One,
        float32Val: 2.2222222,
        int32EnumVal: Int32EnumVal.SixtyNine,
        int32Val: 1,
        intEnumVal: IntEnumVal.Third,
        intOptNullVal: 999999,
        intVal: 999999,
        numOptNullVal: 1.1,
        numVal: 1.1,
        strOptVal: "optional example",
        strVal: "example",
      },
    },
    numVal: 9629.09,
    objVal: {
      anyVal: "any example",
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      enumVal: Enum.One,
      float32Val: 2.2222222,
      int32EnumVal: Int32EnumVal.SixtyNine,
      int32Val: 1,
      intEnumVal: IntEnumVal.Third,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
    strVal: "string",
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                                    | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `request`                                                                    | [shared.DeepObjectCamelCase](../../sdk/models/shared/deepobjectcamelcase.md) | :heavy_check_mark:                                                           | The request object to use for the request.                                   |
| `config`                                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                 | :heavy_minus_sign:                                                           | Available config options for making requests.                                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonDeepCamelCaseResponse](../../sdk/models/operations/requestbodypostapplicationjsondeepcamelcaseresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostApplicationJsonMap

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostApplicationJsonMap({
    "key": {
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
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Record<string, shared.SimpleObject>](../../models/.md)      | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMapResponse](../../sdk/models/operations/requestbodypostapplicationjsonmapresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostApplicationJsonMapCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32EnumVal, IntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostApplicationJsonMapCamelCase({
    "key": {
      anyVal: "any example",
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      enumVal: Enum.One,
      float32Val: 2.2222222,
      int32EnumVal: Int32EnumVal.SixtyNine,
      int32Val: 1,
      intEnumVal: IntEnumVal.Third,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                        | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `request`                                                        | [Record<string, shared.SimpleObjectCamelCase>](../../models/.md) | :heavy_check_mark:                                               | The request object to use for the request.                       |
| `serverURL`                                                      | *string*                                                         | :heavy_minus_sign:                                               | An optional server URL to use.                                   |
| `config`                                                         | [AxiosRequestConfig](https://axios-http.com/docs/req_config)     | :heavy_minus_sign:                                               | Available config options for making requests.                    |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMapCamelCaseResponse](../../sdk/models/operations/requestbodypostapplicationjsonmapcamelcaseresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostApplicationJsonMapObj

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostApplicationJsonMapObj({
    "key": {
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
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Record<string, shared.SimpleObject>](../../models/.md)      | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMapObjResponse](../../sdk/models/operations/requestbodypostapplicationjsonmapobjresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostApplicationJsonMapObjCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32EnumVal, IntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostApplicationJsonMapObjCamelCase({
    "key": {
      anyVal: "any example",
      boolOptVal: true,
      boolVal: true,
      dateTimeVal: new Date("2020-01-01T00:00:00Z"),
      dateVal: new RFCDate("2020-01-01"),
      enumVal: Enum.One,
      float32Val: 2.2222222,
      int32EnumVal: Int32EnumVal.SixtyNine,
      int32Val: 1,
      intEnumVal: IntEnumVal.Third,
      intOptNullVal: 999999,
      intVal: 999999,
      numOptNullVal: 1.1,
      numVal: 1.1,
      strOptVal: "optional example",
      strVal: "example",
    },
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                        | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `request`                                                        | [Record<string, shared.SimpleObjectCamelCase>](../../models/.md) | :heavy_check_mark:                                               | The request object to use for the request.                       |
| `config`                                                         | [AxiosRequestConfig](https://axios-http.com/docs/req_config)     | :heavy_minus_sign:                                               | Available config options for making requests.                    |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMapObjCamelCaseResponse](../../sdk/models/operations/requestbodypostapplicationjsonmapobjcamelcaseresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostApplicationJsonMapOfArray

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostApplicationJsonMapOfArray({
    "key": [
      {
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
    ],
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Record<string, shared.SimpleObject[]>](../../models/.md)    | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMapOfArrayResponse](../../sdk/models/operations/requestbodypostapplicationjsonmapofarrayresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostApplicationJsonMapOfArrayCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32EnumVal, IntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostApplicationJsonMapOfArrayCamelCase({
    "key": [
      {
        anyVal: "any example",
        boolOptVal: true,
        boolVal: true,
        dateTimeVal: new Date("2020-01-01T00:00:00Z"),
        dateVal: new RFCDate("2020-01-01"),
        enumVal: Enum.One,
        float32Val: 2.2222222,
        int32EnumVal: Int32EnumVal.SixtyNine,
        int32Val: 1,
        intEnumVal: IntEnumVal.Third,
        intOptNullVal: 999999,
        intVal: 999999,
        numOptNullVal: 1.1,
        numVal: 1.1,
        strOptVal: "optional example",
        strVal: "example",
      },
    ],
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                          | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `request`                                                          | [Record<string, shared.SimpleObjectCamelCase[]>](../../models/.md) | :heavy_check_mark:                                                 | The request object to use for the request.                         |
| `serverURL`                                                        | *string*                                                           | :heavy_minus_sign:                                                 | An optional server URL to use.                                     |
| `config`                                                           | [AxiosRequestConfig](https://axios-http.com/docs/req_config)       | :heavy_minus_sign:                                                 | Available config options for making requests.                      |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMapOfArrayCamelCaseResponse](../../sdk/models/operations/requestbodypostapplicationjsonmapofarraycamelcaseresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostApplicationJsonMapOfMap

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostApplicationJsonMapOfMap({
    "key": {
      "key": {
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
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [Record<string, Record<string, shared.SimpleObject>>](../../models/.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |
| `serverURL`                                                             | *string*                                                                | :heavy_minus_sign:                                                      | An optional server URL to use.                                          |
| `config`                                                                | [AxiosRequestConfig](https://axios-http.com/docs/req_config)            | :heavy_minus_sign:                                                      | Available config options for making requests.                           |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMapOfMapResponse](../../sdk/models/operations/requestbodypostapplicationjsonmapofmapresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostApplicationJsonMapOfMapCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32EnumVal, IntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostApplicationJsonMapOfMapCamelCase({
    "key": {
      "key": {
        anyVal: "any example",
        boolOptVal: true,
        boolVal: true,
        dateTimeVal: new Date("2020-01-01T00:00:00Z"),
        dateVal: new RFCDate("2020-01-01"),
        enumVal: Enum.One,
        float32Val: 2.2222222,
        int32EnumVal: Int32EnumVal.SixtyNine,
        int32Val: 1,
        intEnumVal: IntEnumVal.Third,
        intOptNullVal: 999999,
        intVal: 999999,
        numOptNullVal: 1.1,
        numVal: 1.1,
        strOptVal: "optional example",
        strVal: "example",
      },
    },
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                                        | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `request`                                                                        | [Record<string, Record<string, shared.SimpleObjectCamelCase>>](../../models/.md) | :heavy_check_mark:                                                               | The request object to use for the request.                                       |
| `serverURL`                                                                      | *string*                                                                         | :heavy_minus_sign:                                                               | An optional server URL to use.                                                   |
| `config`                                                                         | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                     | :heavy_minus_sign:                                                               | Available config options for making requests.                                    |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMapOfMapCamelCaseResponse](../../sdk/models/operations/requestbodypostapplicationjsonmapofmapcamelcaseresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostApplicationJsonMapOfMapOfPrimitive

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostApplicationJsonMapOfMapOfPrimitive({
    "key": {
      "key": "string",
    },
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Record<string, Record<string, string>>](../../models/.md)   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMapOfMapOfPrimitiveResponse](../../sdk/models/operations/requestbodypostapplicationjsonmapofmapofprimitiveresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostApplicationJsonMapOfPrimitive

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostApplicationJsonMapOfPrimitive({
    "key": "string",
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Record<string, string>](../../models/.md)                   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMapOfPrimitiveResponse](../../sdk/models/operations/requestbodypostapplicationjsonmapofprimitiveresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostApplicationJsonMultipleJsonFiltered

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostApplicationJsonMultipleJsonFiltered({
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
}

run();
```

### Parameters

| Parameter                                                      | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `request`                                                      | [shared.SimpleObject](../../sdk/models/shared/simpleobject.md) | :heavy_check_mark:                                             | The request object to use for the request.                     |
| `config`                                                       | [AxiosRequestConfig](https://axios-http.com/docs/req_config)   | :heavy_minus_sign:                                             | Available config options for making requests.                  |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonMultipleJsonFilteredResponse](../../sdk/models/operations/requestbodypostapplicationjsonmultiplejsonfilteredresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostApplicationJsonSimple

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostApplicationJsonSimple({
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
}

run();
```

### Parameters

| Parameter                                                      | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `request`                                                      | [shared.SimpleObject](../../sdk/models/shared/simpleobject.md) | :heavy_check_mark:                                             | The request object to use for the request.                     |
| `config`                                                       | [AxiosRequestConfig](https://axios-http.com/docs/req_config)   | :heavy_minus_sign:                                             | Available config options for making requests.                  |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonSimpleResponse](../../sdk/models/operations/requestbodypostapplicationjsonsimpleresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostApplicationJsonSimpleCamelCase

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32EnumVal, IntEnumVal } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostApplicationJsonSimpleCamelCase({
    anyVal: "any example",
    boolOptVal: true,
    boolVal: true,
    dateTimeVal: new Date("2020-01-01T00:00:00Z"),
    dateVal: new RFCDate("2020-01-01"),
    enumVal: Enum.One,
    float32Val: 2.2222222,
    int32EnumVal: Int32EnumVal.SixtyNine,
    int32Val: 1,
    intEnumVal: IntEnumVal.Third,
    intOptNullVal: 999999,
    intVal: 999999,
    numOptNullVal: 1.1,
    numVal: 1.1,
    strOptVal: "optional example",
    strVal: "example",
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                                        | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `request`                                                                        | [shared.SimpleObjectCamelCase](../../sdk/models/shared/simpleobjectcamelcase.md) | :heavy_check_mark:                                                               | The request object to use for the request.                                       |
| `config`                                                                         | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                     | :heavy_minus_sign:                                                               | Available config options for making requests.                                    |


### Response

**Promise<[operations.RequestBodyPostApplicationJsonSimpleCamelCaseResponse](../../sdk/models/operations/requestbodypostapplicationjsonsimplecamelcaseresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostComplexNumberTypes

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostComplexNumberTypes({
    complexNumberTypes: {
      bigint: 765757,
      bigintStr: "string",
      decimal: 9344.87,
      decimalStr: "string",
    },
    pathBigInt: 250514,
    pathBigIntStr: "string",
    pathDecimal: 6831.11,
    pathDecimalStr: "string",
    queryBigInt: 500580,
    queryBigIntStr: "string",
    queryDecimal: 7419.03,
    queryDecimalStr: "string",
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [operations.RequestBodyPostComplexNumberTypesRequest](../../sdk/models/operations/requestbodypostcomplexnumbertypesrequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `config`                                                                                                                       | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                   | :heavy_minus_sign:                                                                                                             | Available config options for making requests.                                                                                  |


### Response

**Promise<[operations.RequestBodyPostComplexNumberTypesResponse](../../sdk/models/operations/requestbodypostcomplexnumbertypesresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostDefaultsAndConsts

### Example Usage

```typescript
import { SDK } from "openapi";
import { ConstEnumInt, ConstEnumStr, DefaultEnumInt, DefaultEnumStr } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostDefaultsAndConsts({
    constBigInt: 559205,
    constBigIntStr: "string",
    constBool: false,
    constDate: new RFCDate("2022-09-14"),
    constDateTime: new Date("2023-12-15T19:54:01.459Z"),
    constDecimal: 9160.69,
    constDecimalStr: "string",
    constEnumInt: ConstEnumInt.One,
    constEnumStr: ConstEnumStr.Three,
    constInt: 299545,
    constNum: 4612.63,
    constStr: "string",
    constStrNull: "string",
    defaultBigInt: 450379,
    defaultBigIntStr: "string",
    defaultBool: false,
    defaultDate: new RFCDate("2024-04-28"),
    defaultDateTime: new Date("2022-10-01T17:08:33.213Z"),
    defaultDecimal: 4585.94,
    defaultDecimalStr: "string",
    defaultEnumInt: DefaultEnumInt.Two,
    defaultEnumStr: DefaultEnumStr.One,
    defaultInt: 788517,
    defaultNum: 639.73,
    defaultStr: "string",
    defaultStrNullable: "string",
    normalField: "string",
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `request`                                                                | [shared.DefaultsAndConsts](../../sdk/models/shared/defaultsandconsts.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |
| `config`                                                                 | [AxiosRequestConfig](https://axios-http.com/docs/req_config)             | :heavy_minus_sign:                                                       | Available config options for making requests.                            |


### Response

**Promise<[operations.RequestBodyPostDefaultsAndConstsResponse](../../sdk/models/operations/requestbodypostdefaultsandconstsresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostEmptyObject

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostEmptyObject({
    empty: {},
    emptyWithEmptyProperties: {},
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [operations.RequestBodyPostEmptyObjectRequestBody](../../sdk/models/operations/requestbodypostemptyobjectrequestbody.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `config`                                                                                                                 | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                             | :heavy_minus_sign:                                                                                                       | Available config options for making requests.                                                                            |


### Response

**Promise<[operations.RequestBodyPostEmptyObjectResponse](../../sdk/models/operations/requestbodypostemptyobjectresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostFormDeep

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostFormDeep({
    any: "anyOf[0]",
    arr: [
      {
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
      {
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
    ],
    bool: true,
    int: 1,
    map: {
      "key": {
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
      "key2": {
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
    num: 1.1,
    obj: {
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
    str: "test",
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.DeepObject](../../sdk/models/shared/deepobject.md)   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostFormDeepResponse](../../sdk/models/operations/requestbodypostformdeepresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostFormMapPrimitive

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostFormMapPrimitive({
    "key": "string",
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Record<string, string>](../../models/.md)                   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostFormMapPrimitiveResponse](../../sdk/models/operations/requestbodypostformmapprimitiveresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostFormSimple

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostFormSimple({
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
}

run();
```

### Parameters

| Parameter                                                      | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `request`                                                      | [shared.SimpleObject](../../sdk/models/shared/simpleobject.md) | :heavy_check_mark:                                             | The request object to use for the request.                     |
| `config`                                                       | [AxiosRequestConfig](https://axios-http.com/docs/req_config)   | :heavy_minus_sign:                                             | Available config options for making requests.                  |


### Response

**Promise<[operations.RequestBodyPostFormSimpleResponse](../../sdk/models/operations/requestbodypostformsimpleresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostJsonDataTypesArrayBigInt

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostJsonDataTypesArrayBigInt([
    564849,
  ]);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [number[]](../../models/.md)                                 | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostJsonDataTypesArrayBigIntResponse](../../sdk/models/operations/requestbodypostjsondatatypesarraybigintresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostJsonDataTypesArrayDate

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostJsonDataTypesArrayDate([
    new RFCDate("2023-03-22"),
  ]);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [RFCDate[]](../../models/.md)                                | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostJsonDataTypesArrayDateResponse](../../sdk/models/operations/requestbodypostjsondatatypesarraydateresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostJsonDataTypesArrayDecimalStr

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostJsonDataTypesArrayDecimalStr([
    "string",
  ]);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [string[]](../../models/.md)                                 | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostJsonDataTypesArrayDecimalStrResponse](../../sdk/models/operations/requestbodypostjsondatatypesarraydecimalstrresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostJsonDataTypesBigInt

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostJsonDataTypesBigInt(687617);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [number](../../models/.md)                                   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostJsonDataTypesBigIntResponse](../../sdk/models/operations/requestbodypostjsondatatypesbigintresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostJsonDataTypesBigIntStr

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostJsonDataTypesBigIntStr("string");

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [string](../../models/.md)                                   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostJsonDataTypesBigIntStrResponse](../../sdk/models/operations/requestbodypostjsondatatypesbigintstrresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostJsonDataTypesBoolean

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostJsonDataTypesBoolean(false);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [boolean](../../models/.md)                                  | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostJsonDataTypesBooleanResponse](../../sdk/models/operations/requestbodypostjsondatatypesbooleanresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostJsonDataTypesDate

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostJsonDataTypesDate(new RFCDate("2023-03-04"));

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [RFCDate](../../models/.md)                                  | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostJsonDataTypesDateResponse](../../sdk/models/operations/requestbodypostjsondatatypesdateresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostJsonDataTypesDateTime

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostJsonDataTypesDateTime(new Date("2024-03-03T18:54:52.196Z"));

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Date](../../models/.md)                                     | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostJsonDataTypesDateTimeResponse](../../sdk/models/operations/requestbodypostjsondatatypesdatetimeresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostJsonDataTypesDecimal

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostJsonDataTypesDecimal(1107.81);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [number](../../models/.md)                                   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostJsonDataTypesDecimalResponse](../../sdk/models/operations/requestbodypostjsondatatypesdecimalresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostJsonDataTypesDecimalStr

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostJsonDataTypesDecimalStr("string");

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [string](../../models/.md)                                   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostJsonDataTypesDecimalStrResponse](../../sdk/models/operations/requestbodypostjsondatatypesdecimalstrresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostJsonDataTypesFloat32

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostJsonDataTypesFloat32(4464.34);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [number](../../models/.md)                                   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostJsonDataTypesFloat32Response](../../sdk/models/operations/requestbodypostjsondatatypesfloat32response.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostJsonDataTypesInt32

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostJsonDataTypesInt32(22155);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [number](../../models/.md)                                   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostJsonDataTypesInt32Response](../../sdk/models/operations/requestbodypostjsondatatypesint32response.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostJsonDataTypesInteger

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostJsonDataTypesInteger(273673);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [number](../../models/.md)                                   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostJsonDataTypesIntegerResponse](../../sdk/models/operations/requestbodypostjsondatatypesintegerresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostJsonDataTypesMapBigIntStr

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostJsonDataTypesMapBigIntStr({
    "key": "string",
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Record<string, string>](../../models/.md)                   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostJsonDataTypesMapBigIntStrResponse](../../sdk/models/operations/requestbodypostjsondatatypesmapbigintstrresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostJsonDataTypesMapDateTime

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostJsonDataTypesMapDateTime({
    "key": new Date("2023-09-04T08:15:28.024Z"),
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Record<string, Date>](../../models/.md)                     | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostJsonDataTypesMapDateTimeResponse](../../sdk/models/operations/requestbodypostjsondatatypesmapdatetimeresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostJsonDataTypesMapDecimal

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostJsonDataTypesMapDecimal({
    "key": 3472.82,
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Record<string, number>](../../models/.md)                   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostJsonDataTypesMapDecimalResponse](../../sdk/models/operations/requestbodypostjsondatatypesmapdecimalresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostJsonDataTypesNumber

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostJsonDataTypesNumber(2193.66);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [number](../../models/.md)                                   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostJsonDataTypesNumberResponse](../../sdk/models/operations/requestbodypostjsondatatypesnumberresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostJsonDataTypesString

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostJsonDataTypesString("string");

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [string](../../models/.md)                                   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostJsonDataTypesStringResponse](../../sdk/models/operations/requestbodypostjsondatatypesstringresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostMultipleContentTypesComponentFiltered

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostMultipleContentTypesComponentFiltered({
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
}

run();
```

### Parameters

| Parameter                                                      | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `request`                                                      | [shared.SimpleObject](../../sdk/models/shared/simpleobject.md) | :heavy_check_mark:                                             | The request object to use for the request.                     |
| `config`                                                       | [AxiosRequestConfig](https://axios-http.com/docs/req_config)   | :heavy_minus_sign:                                             | Available config options for making requests.                  |


### Response

**Promise<[operations.RequestBodyPostMultipleContentTypesComponentFilteredResponse](../../sdk/models/operations/requestbodypostmultiplecontenttypescomponentfilteredresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostMultipleContentTypesInlineFiltered

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostMultipleContentTypesInlineFiltered({
    bool: false,
    num: 3558.41,
    str: "string",
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                              | Type                                                                                                                                                                   | Required                                                                                                                                                               | Description                                                                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                              | [operations.RequestBodyPostMultipleContentTypesInlineFilteredRequestBody](../../sdk/models/operations/requestbodypostmultiplecontenttypesinlinefilteredrequestbody.md) | :heavy_check_mark:                                                                                                                                                     | The request object to use for the request.                                                                                                                             |
| `config`                                                                                                                                                               | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                                                           | :heavy_minus_sign:                                                                                                                                                     | Available config options for making requests.                                                                                                                          |


### Response

**Promise<[operations.RequestBodyPostMultipleContentTypesInlineFilteredResponse](../../sdk/models/operations/requestbodypostmultiplecontenttypesinlinefilteredresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostMultipleContentTypesSplitParamForm

### Example Usage

```typescript
import { SDK } from "openapi";
import {
  RequestBodyPostMultipleContentTypesSplitParamFormRequest,
  RequestBodyPostMultipleContentTypesSplitParamFormRequestBody,
} from "openapi/dist/sdk/models/operations";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const requestBody: RequestBodyPostMultipleContentTypesSplitParamFormRequestBody = {
  bool3: false,
  num3: 8693.24,
  str3: "string",
};
const paramStr: string = "string";

  const res = await sdk.requestBodies.requestBodyPostMultipleContentTypesSplitParamForm(requestBody, paramStr);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                              | Type                                                                                                                                                                   | Required                                                                                                                                                               | Description                                                                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                                                                          | [operations.RequestBodyPostMultipleContentTypesSplitParamFormRequestBody](../../sdk/models/operations/requestbodypostmultiplecontenttypessplitparamformrequestbody.md) | :heavy_check_mark:                                                                                                                                                     | N/A                                                                                                                                                                    |
| `paramStr`                                                                                                                                                             | *string*                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                     | N/A                                                                                                                                                                    |
| `config`                                                                                                                                                               | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                                                           | :heavy_minus_sign:                                                                                                                                                     | Available config options for making requests.                                                                                                                          |


### Response

**Promise<[operations.RequestBodyPostMultipleContentTypesSplitParamFormResponse](../../sdk/models/operations/requestbodypostmultiplecontenttypessplitparamformresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostMultipleContentTypesSplitParamJson

### Example Usage

```typescript
import { SDK } from "openapi";
import {
  RequestBodyPostMultipleContentTypesSplitParamJsonRequest,
  RequestBodyPostMultipleContentTypesSplitParamJsonRequestBody,
} from "openapi/dist/sdk/models/operations";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const requestBody: RequestBodyPostMultipleContentTypesSplitParamJsonRequestBody = {
  bool: false,
  num: 9771.91,
  str: "string",
};
const paramStr: string = "string";

  const res = await sdk.requestBodies.requestBodyPostMultipleContentTypesSplitParamJson(requestBody, paramStr);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                              | Type                                                                                                                                                                   | Required                                                                                                                                                               | Description                                                                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                                                                          | [operations.RequestBodyPostMultipleContentTypesSplitParamJsonRequestBody](../../sdk/models/operations/requestbodypostmultiplecontenttypessplitparamjsonrequestbody.md) | :heavy_check_mark:                                                                                                                                                     | N/A                                                                                                                                                                    |
| `paramStr`                                                                                                                                                             | *string*                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                     | N/A                                                                                                                                                                    |
| `config`                                                                                                                                                               | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                                                           | :heavy_minus_sign:                                                                                                                                                     | Available config options for making requests.                                                                                                                          |


### Response

**Promise<[operations.RequestBodyPostMultipleContentTypesSplitParamJsonResponse](../../sdk/models/operations/requestbodypostmultiplecontenttypessplitparamjsonresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostMultipleContentTypesSplitParamMultipart

### Example Usage

```typescript
import { SDK } from "openapi";
import {
  RequestBodyPostMultipleContentTypesSplitParamMultipartRequest,
  RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody,
} from "openapi/dist/sdk/models/operations";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const requestBody: RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody = {
  bool2: false,
  num2: 7000.76,
  str2: "string",
};
const paramStr: string = "string";

  const res = await sdk.requestBodies.requestBodyPostMultipleContentTypesSplitParamMultipart(requestBody, paramStr);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                        | Type                                                                                                                                                                             | Required                                                                                                                                                                         | Description                                                                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                                                                                    | [operations.RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody](../../sdk/models/operations/requestbodypostmultiplecontenttypessplitparammultipartrequestbody.md) | :heavy_check_mark:                                                                                                                                                               | N/A                                                                                                                                                                              |
| `paramStr`                                                                                                                                                                       | *string*                                                                                                                                                                         | :heavy_check_mark:                                                                                                                                                               | N/A                                                                                                                                                                              |
| `config`                                                                                                                                                                         | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                                                                     | :heavy_minus_sign:                                                                                                                                                               | Available config options for making requests.                                                                                                                                    |


### Response

**Promise<[operations.RequestBodyPostMultipleContentTypesSplitParamMultipartResponse](../../sdk/models/operations/requestbodypostmultiplecontenttypessplitparammultipartresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostMultipleContentTypesSplitForm

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostMultipleContentTypesSplitForm({
    bool3: false,
    num3: 7842.07,
    str3: "string",
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                    | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                    | [operations.RequestBodyPostMultipleContentTypesSplitFormRequestBody](../../sdk/models/operations/requestbodypostmultiplecontenttypessplitformrequestbody.md) | :heavy_check_mark:                                                                                                                                           | The request object to use for the request.                                                                                                                   |
| `config`                                                                                                                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                                                 | :heavy_minus_sign:                                                                                                                                           | Available config options for making requests.                                                                                                                |


### Response

**Promise<[operations.RequestBodyPostMultipleContentTypesSplitFormResponse](../../sdk/models/operations/requestbodypostmultiplecontenttypessplitformresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostMultipleContentTypesSplitJson

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostMultipleContentTypesSplitJson({
    bool: false,
    num: 2445.56,
    str: "string",
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                    | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                    | [operations.RequestBodyPostMultipleContentTypesSplitJsonRequestBody](../../sdk/models/operations/requestbodypostmultiplecontenttypessplitjsonrequestbody.md) | :heavy_check_mark:                                                                                                                                           | The request object to use for the request.                                                                                                                   |
| `config`                                                                                                                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                                                 | :heavy_minus_sign:                                                                                                                                           | Available config options for making requests.                                                                                                                |


### Response

**Promise<[operations.RequestBodyPostMultipleContentTypesSplitJsonResponse](../../sdk/models/operations/requestbodypostmultiplecontenttypessplitjsonresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostMultipleContentTypesSplitMultipart

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostMultipleContentTypesSplitMultipart({
    bool2: false,
    num2: 2079.2,
    str2: "string",
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                              | Type                                                                                                                                                                   | Required                                                                                                                                                               | Description                                                                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                              | [operations.RequestBodyPostMultipleContentTypesSplitMultipartRequestBody](../../sdk/models/operations/requestbodypostmultiplecontenttypessplitmultipartrequestbody.md) | :heavy_check_mark:                                                                                                                                                     | The request object to use for the request.                                                                                                                             |
| `config`                                                                                                                                                               | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                                                           | :heavy_minus_sign:                                                                                                                                                     | Available config options for making requests.                                                                                                                          |


### Response

**Promise<[operations.RequestBodyPostMultipleContentTypesSplitMultipartResponse](../../sdk/models/operations/requestbodypostmultiplecontenttypessplitmultipartresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostNotNullableNotRequiredStringBody

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostNotNullableNotRequiredStringBody("string");

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [string](../../models/.md)                                   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostNotNullableNotRequiredStringBodyResponse](../../sdk/models/operations/requestbodypostnotnullablenotrequiredstringbodyresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostNullArray

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostNullArray([
    "string",
  ]);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [string[]](../../models/.md)                                 | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostNullArrayResponse](../../sdk/models/operations/requestbodypostnullarrayresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostNullDictionary

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostNullDictionary({
    "key": "string",
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Record<string, string>](../../models/.md)                   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostNullDictionaryResponse](../../sdk/models/operations/requestbodypostnulldictionaryresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostNullableNotRequiredStringBody

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostNullableNotRequiredStringBody("string");

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [string](../../models/.md)                                   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostNullableNotRequiredStringBodyResponse](../../sdk/models/operations/requestbodypostnullablenotrequiredstringbodyresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPostNullableRequiredStringBody

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPostNullableRequiredStringBody("string");

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [string](../../models/.md)                                   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPostNullableRequiredStringBodyResponse](../../sdk/models/operations/requestbodypostnullablerequiredstringbodyresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPutBytes

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPutBytes(new TextEncoder().encode("0x5DbFFb1Ff9"));

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [Uint8Array](../../models/.md)                               | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPutBytesResponse](../../sdk/models/operations/requestbodyputbytesresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPutBytesWithParams

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPutBytesWithParamsRequest } from "openapi/dist/sdk/models/operations";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const requestBody: Uint8Array = new TextEncoder().encode("0xC1B9cA4eb5");
const queryStringParam: string = "string";

  const res = await sdk.requestBodies.requestBodyPutBytesWithParams(requestBody, queryStringParam);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `requestBody`                                                | *Uint8Array*                                                 | :heavy_check_mark:                                           | N/A                                                          |
| `queryStringParam`                                           | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPutBytesWithParamsResponse](../../sdk/models/operations/requestbodyputbyteswithparamsresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPutMultipartDeep

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPutMultipartDeep({
    any: "anyOf[0]",
    arr: [
      {
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
      {
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
    ],
    bool: true,
    int: 1,
    map: {
      "key": {
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
      "key2": {
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
    num: 1.1,
    obj: {
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
    str: "test",
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [shared.DeepObject](../../sdk/models/shared/deepobject.md)   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPutMultipartDeepResponse](../../sdk/models/operations/requestbodyputmultipartdeepresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPutMultipartDifferentFileName

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPutMultipartDifferentFileName({
    differentFileName: {
      content: new TextEncoder().encode("0xdF19d43dd2"),
      fileName: "west_tunisian.pdf",
    },
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                            | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                            | [operations.RequestBodyPutMultipartDifferentFileNameRequestBody](../../sdk/models/operations/requestbodyputmultipartdifferentfilenamerequestbody.md) | :heavy_check_mark:                                                                                                                                   | The request object to use for the request.                                                                                                           |
| `config`                                                                                                                                             | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                                         | :heavy_minus_sign:                                                                                                                                   | Available config options for making requests.                                                                                                        |


### Response

**Promise<[operations.RequestBodyPutMultipartDifferentFileNameResponse](../../sdk/models/operations/requestbodyputmultipartdifferentfilenameresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPutMultipartFile

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPutMultipartFile({
    file: {
      content: new TextEncoder().encode("0xa9f2Ee38c3"),
      fileName: "bandwidth_sedan.pdf",
    },
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [operations.RequestBodyPutMultipartFileRequestBody](../../sdk/models/operations/requestbodyputmultipartfilerequestbody.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `config`                                                                                                                   | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                               | :heavy_minus_sign:                                                                                                         | Available config options for making requests.                                                                              |


### Response

**Promise<[operations.RequestBodyPutMultipartFileResponse](../../sdk/models/operations/requestbodyputmultipartfileresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPutMultipartOptionalRequestBody

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPutMultipartOptionalRequestBody({
    sampleFile: {
      content: new TextEncoder().encode("0xEEdefEf24a"),
      fileName: "bluetooth_whoa_diverse.mpg4",
    },
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                                | [operations.RequestBodyPutMultipartOptionalRequestBodyRequestBody](../../sdk/models/operations/requestbodyputmultipartoptionalrequestbodyrequestbody.md) | :heavy_check_mark:                                                                                                                                       | The request object to use for the request.                                                                                                               |
| `config`                                                                                                                                                 | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                                                                                             | :heavy_minus_sign:                                                                                                                                       | Available config options for making requests.                                                                                                            |


### Response

**Promise<[operations.RequestBodyPutMultipartOptionalRequestBodyResponse](../../sdk/models/operations/requestbodyputmultipartoptionalrequestbodyresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPutMultipartSimple

### Example Usage

```typescript
import { SDK } from "openapi";
import { Enum, Int32Enum, IntEnum } from "openapi/dist/sdk/models/shared";
import { RFCDate } from "openapi/dist/sdk/types";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPutMultipartSimple({
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
}

run();
```

### Parameters

| Parameter                                                      | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `request`                                                      | [shared.SimpleObject](../../sdk/models/shared/simpleobject.md) | :heavy_check_mark:                                             | The request object to use for the request.                     |
| `config`                                                       | [AxiosRequestConfig](https://axios-http.com/docs/req_config)   | :heavy_minus_sign:                                             | Available config options for making requests.                  |


### Response

**Promise<[operations.RequestBodyPutMultipartSimpleResponse](../../sdk/models/operations/requestbodyputmultipartsimpleresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPutString

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyPutString("string");

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [string](../../models/.md)                                   | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPutStringResponse](../../sdk/models/operations/requestbodyputstringresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyPutStringWithParams

### Example Usage

```typescript
import { SDK } from "openapi";
import { RequestBodyPutStringWithParamsRequest } from "openapi/dist/sdk/models/operations";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });
const requestBody: string = "string";
const queryStringParam: string = "string";

  const res = await sdk.requestBodies.requestBodyPutStringWithParams(requestBody, queryStringParam);

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `requestBody`                                                | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `queryStringParam`                                           | *string*                                                     | :heavy_check_mark:                                           | N/A                                                          |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyPutStringWithParamsResponse](../../sdk/models/operations/requestbodyputstringwithparamsresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyReadAndWrite

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyReadAndWrite({
    num1: 797612,
    num2: 89374,
    num3: 459345,
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `request`                                                            | [shared.ReadWriteObject](../../sdk/models/shared/readwriteobject.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |
| `serverURL`                                                          | *string*                                                             | :heavy_minus_sign:                                                   | An optional server URL to use.                                       |
| `config`                                                             | [AxiosRequestConfig](https://axios-http.com/docs/req_config)         | :heavy_minus_sign:                                                   | Available config options for making requests.                        |


### Response

**Promise<[operations.RequestBodyReadAndWriteResponse](../../sdk/models/operations/requestbodyreadandwriteresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyReadOnlyInput

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyReadOnlyInput({});

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                                    | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `request`                                                                    | [shared.ReadOnlyObjectInput](../../sdk/models/shared/readonlyobjectinput.md) | :heavy_check_mark:                                                           | The request object to use for the request.                                   |
| `serverURL`                                                                  | *string*                                                                     | :heavy_minus_sign:                                                           | An optional server URL to use.                                               |
| `config`                                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config)                 | :heavy_minus_sign:                                                           | Available config options for making requests.                                |


### Response

**Promise<[operations.RequestBodyReadOnlyInputResponse](../../sdk/models/operations/requestbodyreadonlyinputresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyReadOnlyUnion

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyReadOnlyUnion("string");

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [any](../../models/.md)                                      | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyReadOnlyUnionResponse](../../sdk/models/operations/requestbodyreadonlyunionresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyReadWriteOnlyUnion

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyReadWriteOnlyUnion("string");

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [any](../../models/.md)                                      | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyReadWriteOnlyUnionResponse](../../sdk/models/operations/requestbodyreadwriteonlyunionresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyWriteOnly

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyWriteOnly({
    bool: false,
    num: 3888.42,
    string: "string",
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `request`                                                            | [shared.WriteOnlyObject](../../sdk/models/shared/writeonlyobject.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |
| `serverURL`                                                          | *string*                                                             | :heavy_minus_sign:                                                   | An optional server URL to use.                                       |
| `config`                                                             | [AxiosRequestConfig](https://axios-http.com/docs/req_config)         | :heavy_minus_sign:                                                   | Available config options for making requests.                        |


### Response

**Promise<[operations.RequestBodyWriteOnlyResponse](../../sdk/models/operations/requestbodywriteonlyresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyWriteOnlyOutput

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyWriteOnlyOutput({
    bool: false,
    num: 3867.69,
    string: "string",
  });

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `request`                                                            | [shared.WriteOnlyObject](../../sdk/models/shared/writeonlyobject.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |
| `serverURL`                                                          | *string*                                                             | :heavy_minus_sign:                                                   | An optional server URL to use.                                       |
| `config`                                                             | [AxiosRequestConfig](https://axios-http.com/docs/req_config)         | :heavy_minus_sign:                                                   | Available config options for making requests.                        |


### Response

**Promise<[operations.RequestBodyWriteOnlyOutputResponse](../../sdk/models/operations/requestbodywriteonlyoutputresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |

## requestBodyWriteOnlyUnion

### Example Usage

```typescript
import { SDK } from "openapi";

async function run() {
  const sdk = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
    globalPathParam: 100,
    globalQueryParam: "some example global query param",
  });

  const res = await sdk.requestBodies.requestBodyWriteOnlyUnion("string");

  if (res.statusCode == 200) {
    // handle response
  }
}

run();
```

### Parameters

| Parameter                                                    | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `request`                                                    | [any](../../models/.md)                                      | :heavy_check_mark:                                           | The request object to use for the request.                   |
| `serverURL`                                                  | *string*                                                     | :heavy_minus_sign:                                           | An optional server URL to use.                               |
| `config`                                                     | [AxiosRequestConfig](https://axios-http.com/docs/req_config) | :heavy_minus_sign:                                           | Available config options for making requests.                |


### Response

**Promise<[operations.RequestBodyWriteOnlyUnionResponse](../../sdk/models/operations/requestbodywriteonlyunionresponse.md)>**
### Errors

| Error Object    | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.SDKError | 4xx-5xx         | */*             |
