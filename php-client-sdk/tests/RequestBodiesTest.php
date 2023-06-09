<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI\Tests\Helpers\Helpers;
use OpenAPI\OpenAPI\Utils\JSON;
use PHPUnit\Framework\TestCase;

final class RequestBodiesTest extends TestCase
{
    public function testRequestBodyPostApplicationJsonSimple(): void
    {
        Helpers::recordTest('request-bodies-post-application-json-simple');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $obj = Helpers::createSimpleObject();

        $response = $sdk->requestBodies->requestBodyPostApplicationJsonSimple($obj);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals($obj, $response->res->json);
    }

    public function testRequestBodyPostApplicationJsonArray(): void
    {
        Helpers::recordTest('request-bodies-post-application-json-array');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $obj = Helpers::createSimpleObject();

        $arr = [$obj, $obj];

        $response = $sdk->requestBodies->requestBodyPostApplicationJsonArray($arr);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->simpleObjects);
        $this->assertEquals($arr, $response->simpleObjects);
    }

    public function testRequestBodyPostApplicationJsonArrayOfArray(): void
    {
        Helpers::recordTest('request-bodies-post-application-json-array-of-array');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $obj = Helpers::createSimpleObject();

        $arrArr = [[$obj], [$obj]];

        $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfArray($arrArr);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->arrs);
        $this->assertEquals($arrArr, $response->arrs);
    }

    public function testRequestBodyPostApplicationJsonMap(): void
    {
        Helpers::recordTest('request-bodies-post-application-json-map');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $obj = Helpers::createSimpleObject();

        $m = [
            'mapElem1' => $obj,
            'mapElem2' => $obj,
        ];

        $response = $sdk->requestBodies->requestBodyPostApplicationJsonMap($m);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals($m, $response->res);
    }

    public function testRequestBodyPostApplicationJsonMapOfMap(): void
    {
        Helpers::recordTest('request-bodies-post-application-json-map-of-map');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $obj = Helpers::createSimpleObject();

        $mm = [
            'mapElem1' => [
                'subMapElem1' => $obj,
                'subMapElem2' => $obj,
            ],
            'mapElem2' => [
                'subMapElem1' => $obj,
                'subMapElem2' => $obj,
            ],
        ];

        $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfMap($mm);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals($mm, $response->res);
    }

    public function testRequestBodyPostApplicationJsonMapOfArray(): void
    {
        Helpers::recordTest('request-bodies-post-application-json-map-of-array');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $obj = Helpers::createSimpleObject();

        $mArr = [
            'mapElem1' => [$obj, $obj],
            'mapElem2' => [$obj, $obj],
        ];

        $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfArray($mArr);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals($mArr, $response->res);
    }

    public function testRequestBodyPostApplicationJsonArrayOfMap(): void
    {
        Helpers::recordTest('request-bodies-post-application-json-array-of-map');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $obj = Helpers::createSimpleObject();

        $arrM = [
            [
                'mapElem1' => $obj,
                'mapElem2' => $obj,
            ],
            [
                'mapElem1' => $obj,
                'mapElem2' => $obj,
            ],
        ];

        $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfMap($arrM);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->maps);
        $this->assertEquals($arrM, $response->maps);
    }

    public function testRequestBodyPostApplicationJsonMapOfPrimitive(): void
    {
        Helpers::recordTest('request-bodies-post-application-json-map-of-primitive');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $m = [
            'mapElem1' => 'hello',
            'mapElem2' => 'world',
        ];

        $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfPrimitive($m);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals($m, $response->res);
    }

    public function testRequestBodyPostApplicationJsonArrayOfPrimitive(): void
    {
        Helpers::recordTest('request-bodies-post-application-json-array-of-primitive');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $arr = ['hello', 'world'];

        $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfPrimitive($arr);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->strings);
        $this->assertEquals($arr, $response->strings);
    }

    public function testRequestBodyPostApplicationJsonMapOfMapOfPrimitive(): void
    {
        Helpers::recordTest('request-bodies-post-application-json-map-of-map-of-primitive');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $mm = [
            'mapElem1' => [
                'subMapElem1' => 'foo',
                'subMapElem2' => 'bar',
            ],
            'mapElem2' => [
                'subMapElem1' => 'buzz',
                'subMapElem2' => 'bazz',
            ],
        ];

        $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapOfMapOfPrimitive($mm);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals($mm, $response->res);
    }

    public function testRequestBodyPostApplicationJsonArrayOfArrayOfPrimitive(): void
    {
        Helpers::recordTest('request-bodies-post-application-json-array-of-array-of-primitive');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $arrArr = [
            ['foo', 'bar'],
            ['buzz', 'bazz'],
        ];

        $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayOfArrayOfPrimitive($arrArr);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->arrs);
        $this->assertEquals($arrArr, $response->arrs);
    }

    public function testRequestBodyPostApplicationJsonArrayObject(): void
    {
        Helpers::recordTest('request-bodies-post-application-json-array-object');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $obj = Helpers::createSimpleObject();

        $arr = [$obj, $obj];

        $response = $sdk->requestBodies->requestBodyPostApplicationJsonArrayObj($arr);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->arrObjValue);
        $this->assertEquals($arr, $response->arrObjValue->json);
    }

    public function testRequestBodyPostApplicationJsonMapObject(): void
    {
        Helpers::recordTest('request-bodies-post-application-json-map-object');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $obj = Helpers::createSimpleObject();

        $m = [
            'mapElem1' => $obj,
            'mapElem2' => $obj,
        ];

        $response = $sdk->requestBodies->requestBodyPostApplicationJsonMapObj($m);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->mapObjValue);
        $this->assertEquals($m, $response->mapObjValue->json);
    }

    public function testRequestBodyPostApplicationJsonDeep(): void
    {
        Helpers::recordTest('request-bodies-post-application-json-deep');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $deepObject = Helpers::createDeepObject();

        $response = $sdk->requestBodies->requestBodyPostApplicationJsonDeep($deepObject);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);

        $resAny = (object)$response->res->json->any;

        unset($response->res->json->any);
        unset($deepObject->any);

        $this->assertEquals($deepObject, $response->res->json);
        $this->assertEquals('test', $resAny->str);
        $this->assertEquals('true', $resAny->bool);
        $this->assertEquals('1', $resAny->int);
        $this->assertEquals('1', $resAny->int32);
        $this->assertEquals('1.1', $resAny->num);
        $this->assertEquals('1.1', $resAny->float32);
        $this->assertEquals('one', $resAny->enum);
        $this->assertEquals('any', $resAny->any);
        $this->assertEquals('2020-01-01', $resAny->date);
        $this->assertEquals('2020-01-01T00:00:00.000001Z', $resAny->dateTime);
        $this->assertEquals('true', $resAny->boolOpt);
        $this->assertEquals('testOptional', $resAny->strOpt);
    }

    public function testRequestBodyPostApplicationJsonMultipleJsonFiltered(): void
    {
        Helpers::recordTest('request-bodies-post-application-json-multiple-json-filtered');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $obj = Helpers::createSimpleObject();

        $response = $sdk->requestBodies->requestBodyPostApplicationJsonMultipleJsonFiltered($obj);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals($obj, $response->res->json);
    }

    public function testRequestBodyPostMultipleContentTypesComponentFiltered(): void
    {
        Helpers::recordTest('request-bodies-post-multiple-content-types-component-filtered');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $obj = Helpers::createSimpleObject();

        $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesComponentFiltered($obj);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals($obj, $response->res->json);
    }

    public function testRequestBodyPostMultipleContentTypesInlineFiltered(): void
    {
        Helpers::recordTest('request-bodies-post-multiple-content-types-inline-filtered');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $request = new \OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesInlineFilteredApplicationJSON();
        $request->bool = true;
        $request->num = 1.1;
        $request->str = 'test';

        $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesInlineFiltered($request);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals(true, $response->res->json['bool']);
        $this->assertEquals(1.1, $response->res->json['num']);
        $this->assertEquals('test', $response->res->json['str']);
    }

    public function testRequestBodyPostMultipleContentTypesSplitJson(): void
    {
        Helpers::recordTest('request-bodies-post-multiple-content-types-split-json');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $request = new \OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitApplicationJSON();
        $request->bool = true;
        $request->num = 1.1;
        $request->str = 'test';

        $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitJson($request);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals(true, $response->res->json['bool']);
        $this->assertEquals(1.1, $response->res->json['num']);
        $this->assertEquals('test', $response->res->json['str']);
    }

    public function testRequestBodyPostMultipleContentTypesSplitMultipart(): void
    {
        Helpers::recordTest('request-bodies-post-multiple-content-types-split-multipart');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $request = new \OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitMultipartFormData();
        $request->bool2 = true;
        $request->num2 = 1.1;
        $request->str2 = 'test';

        $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitMultipart($request);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals('true', $response->res->form['bool2']);
        $this->assertEquals('1.1', $response->res->form['num2']);
        $this->assertEquals('test', $response->res->form['str2']);
    }

    public function testRequestBodyPostMultipleContentTypesSplitForm(): void
    {
        Helpers::recordTest('request-bodies-post-multiple-content-types-split-form');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $request = new \OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitApplicationXWwwFormUrlencoded();
        $request->bool3 = true;
        $request->num3 = 1.1;
        $request->str3 = 'test';

        $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitForm($request);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals('true', $response->res->form['bool3']);
        $this->assertEquals('1.1', $response->res->form['num3']);
        $this->assertEquals('test', $response->res->form['str3']);
    }

    public function testRequestBodyPostMultipleContentTypesSplitJsonWithParam(): void
    {
        Helpers::recordTest('request-bodies-post-multiple-content-types-split-json-with-param');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $requestBody = new \OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitParamApplicationJSON();
        $requestBody->bool = true;
        $requestBody->num = 1.1;
        $requestBody->str = 'test body';

        $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitParamJson($requestBody, 'test param');

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals(true, $response->res->json['bool']);
        $this->assertEquals(1.1, $response->res->json['num']);
        $this->assertEquals('test body', $response->res->json['str']);
        $this->assertEquals('test param', $response->res->args['paramStr']);
    }

    public function testRequestBodyPostMultipleContentTypesSplitMultipartWithParam(): void
    {
        Helpers::recordTest('request-bodies-post-multiple-content-types-split-multipart-with-param');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $requestBody = new \OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitParamMultipartFormData();
        $requestBody->bool2 = true;
        $requestBody->num2 = 1.1;
        $requestBody->str2 = 'test body';

        $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitParamMultipart($requestBody, 'test param');

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals('true', $response->res->form['bool2']);
        $this->assertEquals('1.1', $response->res->form['num2']);
        $this->assertEquals('test body', $response->res->form['str2']);
        $this->assertEquals('test param', $response->res->args['paramStr']);
    }

    public function testRequestBodyPostMultipleContentTypesSplitFormWithParam(): void
    {
        Helpers::recordTest('request-bodies-post-multiple-content-types-split-form-with-param');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $requestBody = new \OpenAPI\OpenAPI\Models\Operations\RequestBodyPostMultipleContentTypesSplitParamApplicationXWwwFormUrlencoded();
        $requestBody->bool3 = true;
        $requestBody->num3 = 1.1;
        $requestBody->str3 = 'test body';

        $response = $sdk->requestBodies->requestBodyPostMultipleContentTypesSplitParamForm($requestBody, 'test param');

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals('true', $response->res->form['bool3']);
        $this->assertEquals('1.1', $response->res->form['num3']);
        $this->assertEquals('test body', $response->res->form['str3']);
        $this->assertEquals('test param', $response->res->args['paramStr']);
    }

    public function testRequestBodyPutMultipartSimple(): void
    {
        Helpers::recordTest('request-bodies-put-multipart-simple');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $obj = Helpers::createSimpleObject();

        $response = $sdk->requestBodies->requestBodyPutMultipartSimple($obj);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals('any', $response->res->form->any);
        $this->assertEquals('true', $response->res->form->bool);
        $this->assertEquals('true', $response->res->form->boolOpt);
        $this->assertEquals('2020-01-01', $response->res->form->date);
        $this->assertEquals('2020-01-01T00:00:00.000001Z', $response->res->form->dateTime);
        $this->assertEquals('one', $response->res->form->enum);
        $this->assertEquals('1.1', $response->res->form->float32);
        $this->assertEquals('1', $response->res->form->int);
        $this->assertEquals('1', $response->res->form->int32);
        $this->assertNull($response->res->form->intOptNull);
        $this->assertEquals('1.1', $response->res->form->num);
        $this->assertNull($response->res->form->numOptNull);
        $this->assertEquals('test', $response->res->form->str);
        $this->assertEquals('testOptional', $response->res->form->strOpt);
    }

    public function testRequestBodyPutMultipartDeep(): void
    {
        Helpers::recordTest('request-bodies-put-multipart-deep');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $obj = Helpers::createDeepObject();

        $response = $sdk->requestBodies->requestBodyPutMultipartDeep($obj);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals($obj->str, $response->res->form->str);
        $this->assertEquals($obj->int, $response->res->form->int);
        $this->assertEquals($obj->num, $response->res->form->num);
        $this->assertEquals($obj->bool, $response->res->form->bool);

        $s = JSON::createSerializer();
        $this->assertEquals($s->serialize($obj->arr, 'json'), $response->res->form->arr);
        $this->assertEquals($s->serialize($obj->obj, 'json'), $response->res->form->obj);
        $this->assertEquals($s->serialize($obj->map, 'json'), $response->res->form->map);
    }

    public function testRequestBodyPutMultipartFile(): void
    {
        Helpers::recordTest('request-bodies-put-multipart-file');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $request = new \OpenAPI\OpenAPI\Models\Operations\RequestBodyPutMultipartFileRequestBody();
        $request->file = new \OpenAPI\OpenAPI\Models\Operations\RequestBodyPutMultipartFileRequestBodyFile();

        $path = './tests/testUpload.json';
        $file = fopen($path, 'r');
        $content = fread($file, filesize($path));

        $request->file->file = 'testUpload.json';
        $request->file->content = $content;

        $response = $sdk->requestBodies->requestBodyPutMultipartFile($request);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertArrayHasKey('file', $response->res->files);
        $this->assertEquals($content, $response->res->files['file']);
    }

    public function testRequestBodyPostFormSimple(): void
    {
        Helpers::recordTest('request-bodies-post-form-simple');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $obj = Helpers::createSimpleObject();

        $response = $sdk->requestBodies->requestBodyPostFormSimple($obj);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals('any', $response->res->form->any);
        $this->assertEquals('true', $response->res->form->bool);
        $this->assertEquals('true', $response->res->form->boolOpt);
        $this->assertEquals('2020-01-01', $response->res->form->date);
        $this->assertEquals('2020-01-01T00:00:00.000001Z', $response->res->form->dateTime);
        $this->assertEquals('one', $response->res->form->enum);
        $this->assertEquals('1.1', $response->res->form->float32);
        $this->assertEquals('1', $response->res->form->int);
        $this->assertEquals('1', $response->res->form->int32);
        $this->assertNull($response->res->form->intOptNull);
        $this->assertEquals('1.1', $response->res->form->num);
        $this->assertNull($response->res->form->numOptNull);
        $this->assertEquals('test', $response->res->form->str);
        $this->assertEquals('testOptional', $response->res->form->strOpt);
    }

    public function testRequestBodyPostFormDeep(): void
    {
        Helpers::recordTest('request-bodies-post-form-deep');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $obj = Helpers::createDeepObject();

        $response = $sdk->requestBodies->requestBodyPostFormDeep($obj);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertEquals($obj->str, $response->res->form->str);
        $this->assertEquals($obj->int, $response->res->form->int);
        $this->assertEquals($obj->num, $response->res->form->num);
        $this->assertEquals($obj->bool, $response->res->form->bool);

        $s = JSON::createSerializer();
        $this->assertEquals($s->serialize($obj->arr, 'json'), $response->res->form->arr);
        $this->assertEquals($s->serialize($obj->obj, 'json'), $response->res->form->obj);
        $this->assertEquals($s->serialize($obj->map, 'json'), $response->res->form->map);
    }

    public function testRequestBodyPostFormMapPrimitive(): void
    {
        Helpers::recordTest('request-bodies-post-form-map-primitive');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $m = [
            'key1' => 'value1',
            'key2' => 'value2',
            'key3' => 'value3',
        ];

        $response = $sdk->requestBodies->requestBodyPostFormMapPrimitive($m);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals($m, $response->res->form);
    }

    public function testRequestBodyPutString(): void
    {
        Helpers::recordTest('request-bodies-put-string');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $str = 'Hello World';

        $response = $sdk->requestBodies->requestBodyPutString($str);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals($str, $response->res->data);
    }

    public function testRequestBodyPutBytes(): void
    {
        Helpers::recordTest('request-bodies-put-bytes');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $path = './tests/testUpload.json';
        $file = fopen($path, 'r');
        $content = fread($file, filesize($path));

        $response = $sdk->requestBodies->requestBodyPutBytes($content);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals($content, $response->res->data);
    }

    public function testRequestBodyPutStringWithParams(): void
    {
        Helpers::recordTest('request-bodies-put-string-with-params');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $str = 'Hello World';

        $response = $sdk->requestBodies->requestBodyPutStringWithParams($str, 'test param');

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals($str, $response->res->data);
        $this->assertEquals('test param', $response->res->args->queryStringParam);
    }

    public function testRequestBodyPutBytesWithParams(): void
    {
        Helpers::recordTest('request-bodies-put-bytes-with-params');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $path = './tests/testUpload.json';
        $file = fopen($path, 'r');
        $content = fread($file, filesize($path));

        $response = $sdk->requestBodies->requestBodyPutBytesWithParams($content, 'test param');

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals($content, $response->res->data);
        $this->assertEquals('test param', $response->res->args->queryStringParam);
    }
}
