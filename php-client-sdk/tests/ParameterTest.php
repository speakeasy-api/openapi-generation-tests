<?php

declare(strict_types=1);
require_once 'vendor/autoload.php';

use OpenAPI\OpenAPI\Tests\Helpers\Helpers;
use OpenAPI\OpenAPI\Utils\JSON;
use PHPUnit\Framework\TestCase;

final class ParameterTest extends TestCase
{
    public function testSimplePathParameterPrimitives(): void
    {
        Helpers::recordTest('parameters-simple-path-parameter-primitives');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $response = $sdk->parameters->simplePathParameterPrimitives(true, 1, 1.1, 'test');

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals('http://localhost:35123/anything/pathParams/str/test/bool/true/int/1/num/1.1', $response->res->url);
    }

    public function testSimplePathParameterObjects(): void
    {
        Helpers::recordTest('parameters-simple-path-parameter-objects');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $obj = Helpers::createSimpleObject();

        $response = $sdk->parameters->simplePathParameterObjects($obj, $obj);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals('http://localhost:35123/anything/pathParams/obj/any,any,bool,true,boolOpt,true,date,2020-01-01T00:00:00.000000+00:00,dateTime,2020-01-01T00:00:00.000001+00:00,enum,one,float32,1.1,int,1,int32,1,int32Enum,55,intEnum,2,num,1.1,str,test,strOpt,testOptional/objExploded/any=any,bool=true,boolOpt=true,date=2020-01-01T00:00:00.000000+00:00,dateTime=2020-01-01T00:00:00.000001+00:00,enum=one,float32=1.1,int=1,int32=1,int32Enum=55,intEnum=2,num=1.1,str=test,strOpt=testOptional', $response->res->url);
    }

    public function testSimplePathParameterArrays(): void
    {
        Helpers::recordTest('parameters-simple-path-parameter-arrays');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $response = $sdk->parameters->simplePathParameterArrays(['test', 'test2']);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals('http://localhost:35123/anything/pathParams/arr/test,test2', $response->res->url);
    }

    public function testSimplePathParameterMaps(): void
    {
        Helpers::recordTest('parameters-simple-path-parameter-maps');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $response = $sdk->parameters->simplePathParameterMaps(['test' => 'value', 'test2' => 'value2'], ['test' => 1, 'test2' => 2]);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals('http://localhost:35123/anything/pathParams/map/test,value,test2,value2/mapExploded/test=1,test2=2', $response->res->url);
    }

    public function testPathParameterJson(): void
    {
        Helpers::recordTest('parameters-path-parameter-json');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $response = $sdk->parameters->pathParameterJson(Helpers::createSimpleObject());

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals('http://localhost:35123/anything/pathParams/json/{"any":"any","bool":true,"boolOpt":true,"date":"2020-01-01","dateTime":"2020-01-01T00:00:00.000001Z","enum":"one","float32":1.1,"int":1,"int32":1,"int32Enum":55,"intEnum":2,"num":1.1,"str":"test","strOpt":"testOptional"}', $response->res->url);
    }

    public function testFormQueryParamsPrimitive(): void
    {
        Helpers::recordTest('parameters-form-query-params-primitive');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $response = $sdk->parameters->formQueryParamsPrimitive(true, 1, 1.1, 'test');

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals('http://localhost:35123/anything/queryParams/form/primitive?boolParam=true&intParam=1&numParam=1.1&strParam=test', $response->res->url);
        $this->assertEquals('test', $response->res->args->strParam);
        $this->assertEquals('true', $response->res->args->boolParam);
        $this->assertEquals('1', $response->res->args->intParam);
        $this->assertEquals('1.1', $response->res->args->numParam);
    }

    public function testFormQueryParamsObject(): void
    {
        Helpers::recordTest('parameters-form-query-params-object');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $obj = Helpers::createSimpleObject();

        $response = $sdk->parameters->formQueryParamsObject($obj, $obj);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals('http://localhost:35123/anything/queryParams/form/obj?any=any&bool=true&boolOpt=true&date=2020-01-01&dateTime=2020-01-01T00%3A00%3A00.000001Z&enum=one&float32=1.1&int=1&int32=1&int32Enum=55&intEnum=2&num=1.1&str=test&strOpt=testOptional&objParam=any%2Cany%2Cbool%2Ctrue%2CboolOpt%2Ctrue%2Cdate%2C2020-01-01%2CdateTime%2C2020-01-01T00%3A00%3A00.000001Z%2Cenum%2Cone%2Cfloat32%2C1.1%2Cint%2C1%2Cint32%2C1%2Cint32Enum%2C55%2CintEnum%2C2%2Cnum%2C1.1%2Cstr%2Ctest%2CstrOpt%2CtestOptional', $response->res->url);
        $this->assertEquals('any', $response->res->args->any);
        $this->assertEquals('true', $response->res->args->bool);
        $this->assertEquals('true', $response->res->args->boolOpt);
        $this->assertEquals('2020-01-01', $response->res->args->date);
        $this->assertEquals('2020-01-01T00:00:00.000001Z', $response->res->args->dateTime);
        $this->assertEquals('one', $response->res->args->enum);
        $this->assertEquals('1.1', $response->res->args->float32);
        $this->assertEquals('1', $response->res->args->int);
        $this->assertEquals('1', $response->res->args->int32);
        $this->assertEquals('55', $response->res->args->int32Enum);
        $this->assertEquals('2', $response->res->args->intEnum);
        $this->assertEquals('1.1', $response->res->args->num);
        $this->assertEquals('test', $response->res->args->str);
        $this->assertEquals('testOptional', $response->res->args->strOpt);
        $this->assertNull($response->res->args->intOptNull);
        $this->assertNull($response->res->args->numOptNull);
        $this->assertEquals('any,any,bool,true,boolOpt,true,date,2020-01-01,dateTime,2020-01-01T00:00:00.000001Z,enum,one,float32,1.1,int,1,int32,1,int32Enum,55,intEnum,2,num,1.1,str,test,strOpt,testOptional', $response->res->args->objParam);
    }

    public function testFormQueryParamsRefParamObject(): void
    {
        Helpers::recordTest('parameters-form-query-params-ref-param-object');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $refObjParam = new \OpenAPI\OpenAPI\Models\Shared\RefQueryParamObj();
        $refObjParam->bool = true;
        $refObjParam->int = 1;
        $refObjParam->num = 1.1;
        $refObjParam->str = 'test';

        $refObjParamExploded = new \OpenAPI\OpenAPI\Models\Shared\RefQueryParamObjExploded();
        $refObjParamExploded->bool = true;
        $refObjParamExploded->int = 1;
        $refObjParamExploded->num = 1.1;
        $refObjParamExploded->str = 'test';

        $response = $sdk->parameters->formQueryParamsRefParamObject($refObjParam, $refObjParamExploded);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals('http://localhost:35123/anything/queryParams/form/refParamObject?refObjParam=bool%2Ctrue%2Cint%2C1%2Cnum%2C1.1%2Cstr%2Ctest&bool=true&int=1&num=1.1&str=test', $response->res->url);
        $this->assertEquals('true', $response->res->args->bool);
        $this->assertEquals('1', $response->res->args->int);
        $this->assertEquals('1.1', $response->res->args->num);
        $this->assertEquals('test', $response->res->args->str);
        $this->assertEquals('bool,true,int,1,num,1.1,str,test', $response->res->args->refObjParam);
    }

    public function testFormQueryParamsArray(): void
    {
        Helpers::recordTest('parameters-form-query-params-array');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $response = $sdk->parameters->formQueryParamsArray(['test', 'test2'], [1, 2]);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals('http://localhost:35123/anything/queryParams/form/array?arrParam=test%2Ctest2&arrParamExploded=1&arrParamExploded=2', $response->res->url);
        $this->assertEquals('test,test2', $response->res->args->arrParam);
        $this->assertEquals(['1', '2'], $response->res->args->arrParamExploded);
    }

    public function testPipeDelimitedQueryParamsArray(): void
        {
            Helpers::recordTest('parameters-pipe-query-params-array');

            $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

            $obj = Helpers::createSimpleObject();

            $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

            $response = $sdk->parameters->pipeDelimitedQueryParamsArray(['test', 'test2'], [1, 2], ['key1' => 'val1', 'key2' => 'val2'], $obj);

            $this->assertNotNull($response);
            $this->assertEquals(200, $response->statusCode);
            $this->assertNotNull($response->res);
            $this->assertEquals('http://localhost:35123/anything/queryParams/pipe/array?arrParam=test|test2&arrParamExploded=1&arrParamExploded=2&mapParam=key1|val1|key2|val2&objParam=any|any|bool|true|boolOpt|true|date|2020-01-01|dateTime|2020-01-01T00%3A00%3A00.000001Z|enum|one|float32|1.1|int|1|int32|1|int32Enum|55|intEnum|2|num|1.1|str|test|strOpt|testOptional', $response->res->url);
            $this->assertEquals('test|test2', $response->res->args->arrParam);
            $this->assertEquals(['1', '2'], $response->res->args->arrParamExploded);
        }

    public function testFormQueryParamsMap(): void
    {
        Helpers::recordTest('parameters-form-query-params-map');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $response = $sdk->parameters->formQueryParamsMap(['test' => 'value', 'test2' => 'value2'], ['test' => 1, 'test2' => 2]);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals('http://localhost:35123/anything/queryParams/form/map?mapParam=test%2Cvalue%2Ctest2%2Cvalue2&test=1&test2=2', $response->res->url);
        $this->assertEquals(['test' => '1', 'test2' => '2', 'mapParam' => 'test,value,test2,value2'], $response->res->args);
    }

    public function testDeepObjectQueryParamsObject(): void
    {
        Helpers::recordTest('parameters-deep-object-query-params-object');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $obj = Helpers::createSimpleObject();

        $objArrParam = new \OpenAPI\OpenAPI\Models\Operations\DeepObjectQueryParamsObjectObjArrParam();
        $objArrParam->arr = ['test', 'test2'];

        $response = $sdk->parameters->deepObjectQueryParamsObject($obj, $objArrParam);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals('http://localhost:35123/anything/queryParams/deepObject/obj?objParam[any]=any&objParam[boolOpt]=true&objParam[bool]=true&objParam[dateTime]=2020-01-01T00%3A00%3A00.000001Z&objParam[date]=2020-01-01&objParam[enum]=one&objParam[float32]=1.1&objParam[int32Enum]=55&objParam[int32]=1&objParam[intEnum]=2&objParam[int]=1&objParam[num]=1.1&objParam[strOpt]=testOptional&objParam[str]=test&objArrParam[arr]=test&objArrParam[arr]=test2', $response->res->url);
        $this->assertEquals(['test', 'test2'], $response->res->args->objArrParamArr);
        $this->assertEquals('any', $response->res->args->objParamAny);
        $this->assertEquals('true', $response->res->args->objParamBoolOpt);
        $this->assertEquals('true', $response->res->args->objParamBool);
        $this->assertEquals('2020-01-01T00:00:00.000001Z', $response->res->args->objParamDateTime);
        $this->assertEquals('2020-01-01', $response->res->args->objParamDate);
        $this->assertEquals('one', $response->res->args->objParamEnum);
        $this->assertEquals('1.1', $response->res->args->objParamFloat32);
        $this->assertEquals('1', $response->res->args->objParamInt32);
        $this->assertEquals('1', $response->res->args->objParamInt);
        $this->assertEquals('2', $response->res->args->objParamIntEnum);
        $this->assertEquals('55', $response->res->args->objParamInt32Enum);
        $this->assertEquals('1.1', $response->res->args->objParamNum);
        $this->assertEquals('testOptional', $response->res->args->objParamStrOpt);
        $this->assertEquals('test', $response->res->args->objParamStr);
    }

    public function testDeepObjectQueryParamsMap(): void
    {
        Helpers::recordTest('parameters-deep-object-query-params-map');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $response = $sdk->parameters->deepObjectQueryParamsMap(['test' => 'value', 'test2' => 'value2'], ['test' => ['test', 'test2'], 'test2' => ['test3', 'test4']]);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals('http://localhost:35123/anything/queryParams/deepObject/map?mapParam[test2]=value2&mapParam[test]=value&mapArrParam[test2]=test3&mapArrParam[test2]=test4&mapArrParam[test]=test&mapArrParam[test]=test2', $response->res->url);
        $this->assertEquals(['mapArrParam[test]' => ['test', 'test2'], 'mapArrParam[test2]' => ['test3', 'test4'], 'mapParam[test]' => 'value', 'mapParam[test2]' => 'value2'], $response->res->args);
    }

    public function testJsonQueryParamsObject(): void
    {
        Helpers::recordTest('parameters-json-query-params-object');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $simpleObj = Helpers::createSimpleObject();
        $deepObj = Helpers::createDeepObject();

        $response = $sdk->parameters->jsonQueryParamsObject($deepObj, $simpleObj);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals('http://localhost:35123/anything/queryParams/json/obj?deepObjParam={"any"%3A"{\"any\"%3A\"any\"%2C\"bool\"%3Atrue%2C\"boolOpt\"%3Atrue%2C\"date\"%3A\"2020-01-01\"%2C\"dateTime\"%3A\"2020-01-01T00%3A00%3A00.000001Z\"%2C\"enum\"%3A\"one\"%2C\"float32\"%3A1.1%2C\"int\"%3A1%2C\"int32\"%3A1%2C\"int32Enum\"%3A55%2C\"intEnum\"%3A2%2C\"num\"%3A1.1%2C\"str\"%3A\"test\"%2C\"strOpt\"%3A\"testOptional\"}"%2C"arr"%3A[{"any"%3A"any"%2C"bool"%3Atrue%2C"boolOpt"%3Atrue%2C"date"%3A"2020-01-01"%2C"dateTime"%3A"2020-01-01T00%3A00%3A00.000001Z"%2C"enum"%3A"one"%2C"float32"%3A1.1%2C"int"%3A1%2C"int32"%3A1%2C"int32Enum"%3A55%2C"intEnum"%3A2%2C"num"%3A1.1%2C"str"%3A"test"%2C"strOpt"%3A"testOptional"}%2C{"any"%3A"any"%2C"bool"%3Atrue%2C"boolOpt"%3Atrue%2C"date"%3A"2020-01-01"%2C"dateTime"%3A"2020-01-01T00%3A00%3A00.000001Z"%2C"enum"%3A"one"%2C"float32"%3A1.1%2C"int"%3A1%2C"int32"%3A1%2C"int32Enum"%3A55%2C"intEnum"%3A2%2C"num"%3A1.1%2C"str"%3A"test"%2C"strOpt"%3A"testOptional"}]%2C"bool"%3Atrue%2C"int"%3A1%2C"map"%3A{"key"%3A{"any"%3A"any"%2C"bool"%3Atrue%2C"boolOpt"%3Atrue%2C"date"%3A"2020-01-01"%2C"dateTime"%3A"2020-01-01T00%3A00%3A00.000001Z"%2C"enum"%3A"one"%2C"float32"%3A1.1%2C"int"%3A1%2C"int32"%3A1%2C"int32Enum"%3A55%2C"intEnum"%3A2%2C"num"%3A1.1%2C"str"%3A"test"%2C"strOpt"%3A"testOptional"}}%2C"num"%3A1.1%2C"obj"%3A{"any"%3A"any"%2C"bool"%3Atrue%2C"boolOpt"%3Atrue%2C"date"%3A"2020-01-01"%2C"dateTime"%3A"2020-01-01T00%3A00%3A00.000001Z"%2C"enum"%3A"one"%2C"float32"%3A1.1%2C"int"%3A1%2C"int32"%3A1%2C"int32Enum"%3A55%2C"intEnum"%3A2%2C"num"%3A1.1%2C"str"%3A"test"%2C"strOpt"%3A"testOptional"}%2C"str"%3A"test"}&simpleObjParam={"any"%3A"any"%2C"bool"%3Atrue%2C"boolOpt"%3Atrue%2C"date"%3A"2020-01-01"%2C"dateTime"%3A"2020-01-01T00%3A00%3A00.000001Z"%2C"enum"%3A"one"%2C"float32"%3A1.1%2C"int"%3A1%2C"int32"%3A1%2C"int32Enum"%3A55%2C"intEnum"%3A2%2C"num"%3A1.1%2C"str"%3A"test"%2C"strOpt"%3A"testOptional"}', $response->res->url);
        $s = JSON::createSerializer();
        $this->assertEquals($s->serialize($simpleObj, 'json'), $response->res->args->simpleObjParam);
        $this->assertEquals($s->serialize($deepObj, 'json'), $response->res->args->deepObjParam);
    }

    public function testMixedQueryParams(): void
    {
        Helpers::recordTest('parameters-mixed-query-params');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $obj = Helpers::createSimpleObject();

        $response = $sdk->parameters->mixedQueryParams($obj, $obj, $obj);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals('http://localhost:35123/anything/queryParams/mixed?deepObjectParam[any]=any&deepObjectParam[boolOpt]=true&deepObjectParam[bool]=true&deepObjectParam[dateTime]=2020-01-01T00%3A00%3A00.000001Z&deepObjectParam[date]=2020-01-01&deepObjectParam[enum]=one&deepObjectParam[float32]=1.1&deepObjectParam[int32Enum]=55&deepObjectParam[int32]=1&deepObjectParam[intEnum]=2&deepObjectParam[int]=1&deepObjectParam[num]=1.1&deepObjectParam[strOpt]=testOptional&deepObjectParam[str]=test&any=any&bool=true&boolOpt=true&date=2020-01-01&dateTime=2020-01-01T00%3A00%3A00.000001Z&enum=one&float32=1.1&int=1&int32=1&int32Enum=55&intEnum=2&num=1.1&str=test&strOpt=testOptional&jsonParam={"any"%3A"any"%2C"bool"%3Atrue%2C"boolOpt"%3Atrue%2C"date"%3A"2020-01-01"%2C"dateTime"%3A"2020-01-01T00%3A00%3A00.000001Z"%2C"enum"%3A"one"%2C"float32"%3A1.1%2C"int"%3A1%2C"int32"%3A1%2C"int32Enum"%3A55%2C"intEnum"%3A2%2C"num"%3A1.1%2C"str"%3A"test"%2C"strOpt"%3A"testOptional"}', $response->res->url);

        $s = JSON::createSerializer();
        $this->assertEquals([
            'any' => 'any',
            'bool' => 'true',
            'boolOpt' => 'true',
            'date' => '2020-01-01',
            'dateTime' => '2020-01-01T00:00:00.000001Z',
            'deepObjectParam[any]' => 'any',
            'deepObjectParam[boolOpt]' => 'true',
            'deepObjectParam[bool]' => 'true',
            'deepObjectParam[dateTime]' => '2020-01-01T00:00:00.000001Z',
            'deepObjectParam[date]' => '2020-01-01',
            'deepObjectParam[enum]' => 'one',
            'deepObjectParam[float32]' => '1.1',
            'deepObjectParam[int32]' => '1',
            'deepObjectParam[int]' => '1',
            'deepObjectParam[int32Enum]' => '55',
            'deepObjectParam[intEnum]' => '2',
            'deepObjectParam[num]' => '1.1',
            'deepObjectParam[strOpt]' => 'testOptional',
            'deepObjectParam[str]' => 'test',
            'enum' => 'one',
            'float32' => '1.1',
            'int' => '1',
            'int32' => '1',
            'int32Enum' => '55',
            'intEnum' => '2',
            'jsonParam' => $s->serialize($obj, 'json'),
            'num' => '1.1',
            'str' => 'test',
            'strOpt' => 'testOptional',
        ], $response->res->args);
    }

    public function testHeaderParamsPrimitive(): void
    {
        Helpers::recordTest('parameters-header-params-primitive');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $response = $sdk->parameters->headerParamsPrimitive(true, 1, 1.1, 'test');

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals('test', $response->res->headers->xHeaderString);
        $this->assertEquals('true', $response->res->headers->xHeaderBoolean);
        $this->assertEquals('1', $response->res->headers->xHeaderInteger);
        $this->assertEquals('1.1', $response->res->headers->xHeaderNumber);
    }

    public function testHeaderParamsObject(): void
    {
        Helpers::recordTest('parameters-header-params-object');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $obj = Helpers::createSimpleObject();

        $response = $sdk->parameters->headerParamsObject($obj, $obj);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals('any,any,bool,true,boolOpt,true,date,2020-01-01T00:00:00.000000+00:00,dateTime,2020-01-01T00:00:00.000001+00:00,enum,one,float32,1.1,int,1,int32,1,int32Enum,55,intEnum,2,num,1.1,str,test,strOpt,testOptional', $response->res->headers->xHeaderObj);
        $this->assertEquals('any=any,bool=true,boolOpt=true,date=2020-01-01T00:00:00.000000+00:00,dateTime=2020-01-01T00:00:00.000001+00:00,enum=one,float32=1.1,int=1,int32=1,int32Enum=55,intEnum=2,num=1.1,str=test,strOpt=testOptional', $response->res->headers->xHeaderObjExplode);
    }

    public function testHeaderParamsMap(): void
    {
        Helpers::recordTest('parameters-header-params-map');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $response = $sdk->parameters->headerParamsMap(['key1' => 'value1', 'key2' => 'value2'], ['test1' => 'val1', 'test2' => 'val2']);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals('key1,value1,key2,value2', $response->res->headers->xHeaderMap);
        $this->assertEquals('test1=val1,test2=val2', $response->res->headers->xHeaderMapExplode);
    }

    public function testHeaderParamsArray(): void
    {
        Helpers::recordTest('parameters-header-params-array');

        $sdk = \OpenAPI\OpenAPI\SDK::builder()->build();

        $this->assertInstanceOf(\OpenAPI\OpenAPI\SDK::class, $sdk);

        $response = $sdk->parameters->headerParamsArray(['test1', 'test2']);

        $this->assertNotNull($response);
        $this->assertEquals(200, $response->statusCode);
        $this->assertNotNull($response->res);
        $this->assertEquals('test1,test2', $response->res->headers->xHeaderArray);
    }
}
