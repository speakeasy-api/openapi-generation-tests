/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.*;
import org.openapis.openapi.utils.JSON;

public class RequestBodiesTests {
    @Test
    void testRequestBodyPostApplicationJsonSimple() throws Exception {
        CommonHelpers.recordTest("request-bodies-post-application-json-simple");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        SimpleObject obj = Helpers.createSimpleObject();

        RequestBodyPostApplicationJsonSimpleResponse res = s.requestBodies
                .requestBodyPostApplicationJsonSimple(obj);

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        Helpers.assertSimpleObject(res.res.json);
    }

    @Test
    void testRequestBodyPostApplicationJsonArray() throws Exception {
        CommonHelpers.recordTest("request-bodies-post-application-json-array");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        SimpleObject obj = Helpers.createSimpleObject();

        RequestBodyPostApplicationJsonArrayResponse res = s.requestBodies
                .requestBodyPostApplicationJsonArray(new SimpleObject[] { obj, obj });

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        assertEquals(res.res.length, 2);
        Helpers.assertSimpleObject(res.res[0]);
        Helpers.assertSimpleObject(res.res[1]);
    }

    @Test
    void testRequestBodyPostApplicationJsonArrayOfArray() throws Exception {
        CommonHelpers.recordTest("request-bodies-post-application-json-array-of-array");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        SimpleObject obj = Helpers.createSimpleObject();

        RequestBodyPostApplicationJsonArrayOfArrayResponse res = s.requestBodies
                .requestBodyPostApplicationJsonArrayOfArray(new SimpleObject[][] {
                        { obj, obj },
                        { obj, obj }
                });

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        assertEquals(res.res.length, 2);
        assertEquals(res.res[0].length, 2);
        assertEquals(res.res[1].length, 2);
        Helpers.assertSimpleObject(res.res[0][0]);
        Helpers.assertSimpleObject(res.res[0][1]);
        Helpers.assertSimpleObject(res.res[1][0]);
        Helpers.assertSimpleObject(res.res[1][1]);
    }

    @Test
    void testRequestBodyPostApplicationJsonMap() throws Exception {
        CommonHelpers.recordTest("request-bodies-post-application-json-map");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        SimpleObject obj = Helpers.createSimpleObject();

        RequestBodyPostApplicationJsonMapResponse res = s.requestBodies
                .requestBodyPostApplicationJsonMap(new HashMap<String, SimpleObject>() {
                    {
                        put("mapElem1", obj);
                        put("mapElem2", obj);
                    }
                });

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        assertEquals(res.res.size(), 2);
        Helpers.assertSimpleObject(res.res.get("mapElem1"));
        Helpers.assertSimpleObject(res.res.get("mapElem2"));
    }

    @Test
    void testRequestBodyPostApplicationJsonMapOfMap() throws Exception {
        CommonHelpers.recordTest("request-bodies-post-application-json-map-of-map");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        SimpleObject obj = Helpers.createSimpleObject();

        RequestBodyPostApplicationJsonMapOfMapResponse res = s.requestBodies
                .requestBodyPostApplicationJsonMapOfMap(new HashMap<String, Map<String, SimpleObject>>() {
                    {
                        put("mapElem1", new HashMap<String, SimpleObject>() {
                            {
                                put("subMapElem1", obj);
                                put("subMapElem2", obj);
                            }
                        });
                        put("mapElem2", new HashMap<String, SimpleObject>() {
                            {
                                put("subMapElem1", obj);
                                put("subMapElem2", obj);
                            }
                        });
                    }
                });

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        assertEquals(res.res.size(), 2);
        assertEquals(res.res.get("mapElem1").size(), 2);
        assertEquals(res.res.get("mapElem2").size(), 2);
        Helpers.assertSimpleObject(res.res.get("mapElem1").get("subMapElem1"));
        Helpers.assertSimpleObject(res.res.get("mapElem1").get("subMapElem2"));
        Helpers.assertSimpleObject(res.res.get("mapElem2").get("subMapElem1"));
        Helpers.assertSimpleObject(res.res.get("mapElem2").get("subMapElem2"));
    }

    @Test
    void testRequestBodyPostApplicationJsonMapOfArray() throws Exception {
        CommonHelpers.recordTest("request-bodies-post-application-json-map-of-array");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        SimpleObject obj = Helpers.createSimpleObject();

        RequestBodyPostApplicationJsonMapOfArrayResponse res = s.requestBodies
                .requestBodyPostApplicationJsonMapOfArray(new HashMap<String, SimpleObject[]>() {
                    {
                        put("mapElem1", new SimpleObject[] { obj, obj });
                        put("mapElem2", new SimpleObject[] { obj, obj });
                    }
                });

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        assertEquals(res.res.size(), 2);
        assertEquals(res.res.get("mapElem1").length, 2);
        assertEquals(res.res.get("mapElem2").length, 2);
        Helpers.assertSimpleObject(res.res.get("mapElem1")[0]);
        Helpers.assertSimpleObject(res.res.get("mapElem1")[1]);
        Helpers.assertSimpleObject(res.res.get("mapElem2")[0]);
        Helpers.assertSimpleObject(res.res.get("mapElem2")[1]);
    }

    @Test
    void testRequestBodyPostApplicationJsonArrayOfMap() throws Exception {
        CommonHelpers.recordTest("request-bodies-post-application-json-array-of-map");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        SimpleObject obj = Helpers.createSimpleObject();

        Map<String, SimpleObject>[] arrOfMaps = new HashMap[2];
        for (int i = 0; i < 2; i++) {
            arrOfMaps[i] = new HashMap<String, SimpleObject>();
            arrOfMaps[i].put("mapElem1", obj);
            arrOfMaps[i].put("mapElem2", obj);
        }

        RequestBodyPostApplicationJsonArrayOfMapResponse res = s.requestBodies
                .requestBodyPostApplicationJsonArrayOfMap(arrOfMaps);

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        assertEquals(res.res.length, 2);
        assertEquals(res.res[0].size(), 2);
        assertEquals(res.res[1].size(), 2);
        Helpers.assertSimpleObject(res.res[0].get("mapElem1"));
        Helpers.assertSimpleObject(res.res[0].get("mapElem2"));
        Helpers.assertSimpleObject(res.res[1].get("mapElem1"));
        Helpers.assertSimpleObject(res.res[1].get("mapElem2"));
    }

    @Test
    void testRequestBodyPostApplicationJsonMapOfPrimitive() throws Exception {
        CommonHelpers.recordTest("request-bodies-post-application-json-map-of-primitive");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        RequestBodyPostApplicationJsonMapOfPrimitiveResponse res = s.requestBodies
                .requestBodyPostApplicationJsonMapOfPrimitive(new HashMap<String, String>() {
                    {
                        put("mapElem1", "hello");
                        put("mapElem2", "world");
                    }
                });

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        assertEquals(res.res.size(), 2);
        assertEquals(res.res.get("mapElem1"), "hello");
        assertEquals(res.res.get("mapElem2"), "world");
    }

    @Test
    void testRequestBodyPostApplicationJsonArrayOfPrimitive() throws Exception {
        CommonHelpers.recordTest("request-bodies-post-application-json-array-of-primitive");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        RequestBodyPostApplicationJsonArrayOfPrimitiveResponse res = s.requestBodies
                .requestBodyPostApplicationJsonArrayOfPrimitive(new String[] { "hello", "world" });

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        assertEquals(res.res.length, 2);
        assertEquals(res.res[0], "hello");
        assertEquals(res.res[1], "world");
    }

    @Test
    void testRequestBodyPostApplicationJsonMapOfMapOfPrimitive() throws Exception {
        CommonHelpers.recordTest("request-bodies-post-application-json-map-of-map-of-primitive");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        RequestBodyPostApplicationJsonMapOfMapOfPrimitiveResponse res = s.requestBodies
                .requestBodyPostApplicationJsonMapOfMapOfPrimitive(new HashMap<String, Map<String, String>>() {
                    {
                        put("mapElem1", new HashMap<String, String>() {
                            {
                                put("subMapElem1", "foo");
                                put("subMapElem2", "bar");
                            }
                        });
                        put("mapElem2", new HashMap<String, String>() {
                            {
                                put("subMapElem1", "buzz");
                                put("subMapElem2", "bazz");
                            }
                        });
                    }
                });

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        assertEquals(res.res.size(), 2);
        assertEquals(res.res.get("mapElem1").size(), 2);
        assertEquals(res.res.get("mapElem2").size(), 2);
        assertEquals(res.res.get("mapElem1").get("subMapElem1"), "foo");
        assertEquals(res.res.get("mapElem1").get("subMapElem2"), "bar");
        assertEquals(res.res.get("mapElem2").get("subMapElem1"), "buzz");
        assertEquals(res.res.get("mapElem2").get("subMapElem2"), "bazz");
    }

    @Test
    void testRequestBodyPostApplicationJsonArrayOfArrayOfPrimitive() throws Exception {
        CommonHelpers.recordTest("request-bodies-post-application-json-array-of-array-of-primitive");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        RequestBodyPostApplicationJsonArrayOfArrayOfPrimitiveResponse res = s.requestBodies
                .requestBodyPostApplicationJsonArrayOfArrayOfPrimitive(new String[][] {
                        { "foo", "bar" },
                        { "buzz", "bazz" }
                });

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        assertEquals(res.res.length, 2);
        assertEquals(res.res[0].length, 2);
        assertEquals(res.res[1].length, 2);
        assertEquals(res.res[0][0], "foo");
        assertEquals(res.res[0][1], "bar");
        assertEquals(res.res[1][0], "buzz");
        assertEquals(res.res[1][1], "bazz");
    }

    @Test
    void testRequestBodyPostApplicationJsonArrayObject() throws Exception {
        CommonHelpers.recordTest("request-bodies-post-application-json-array-object");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        SimpleObject obj = Helpers.createSimpleObject();

        RequestBodyPostApplicationJsonArrayObjResponse res = s.requestBodies
                .requestBodyPostApplicationJsonArrayObj(new SimpleObject[] { obj, obj });

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.arrObjValue);
        assertNotNull(res.arrObjValue.json);
        assertEquals(res.arrObjValue.json.length, 2);
        Helpers.assertSimpleObject(res.arrObjValue.json[0]);
        Helpers.assertSimpleObject(res.arrObjValue.json[1]);
    }

    @Test
    void testRequestBodyPostApplicationJsonMapObject() throws Exception {
        CommonHelpers.recordTest("request-bodies-post-application-json-map-object");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        SimpleObject obj = Helpers.createSimpleObject();

        RequestBodyPostApplicationJsonMapObjResponse res = s.requestBodies
                .requestBodyPostApplicationJsonMapObj(new HashMap<String, SimpleObject>() {
                    {
                        put("mapElem1", obj);
                        put("mapElem2", obj);
                    }
                });

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.mapObjValue);
        assertNotNull(res.mapObjValue.json);
        assertEquals(res.mapObjValue.json.size(), 2);
        Helpers.assertSimpleObject(res.mapObjValue.json.get("mapElem1"));
        Helpers.assertSimpleObject(res.mapObjValue.json.get("mapElem2"));
    }

    @Test
    void testRequestBodyPostApplicationJsonDeep() throws Exception {
        CommonHelpers.recordTest("request-bodies-post-application-json-deep");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        DeepObject obj = Helpers.createDeepObject();

        RequestBodyPostApplicationJsonDeepResponse res = s.requestBodies
                .requestBodyPostApplicationJsonDeep(obj);

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        Helpers.assertDeepObjectEqual(obj, res.res.json);
    }

    @Test
    void testRequestBodyPostApplicationJsonMultipleJsonFiltered() throws Exception {
        CommonHelpers.recordTest("request-bodies-post-application-json-multiple-json-filtered");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        SimpleObject obj = Helpers.createSimpleObject();

        RequestBodyPostApplicationJsonMultipleJsonFilteredResponse res = s.requestBodies
                .requestBodyPostApplicationJsonMultipleJsonFiltered(obj);

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        Helpers.assertSimpleObject(res.res.json);
    }

    @Test
    void testRequestBodyPostMultipleContentTypesComponentFiltered() throws Exception {
        CommonHelpers.recordTest("request-bodies-post-multiple-content-types-component-filtered");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        SimpleObject obj = Helpers.createSimpleObject();

        RequestBodyPostMultipleContentTypesComponentFilteredResponse res = s.requestBodies
                .requestBodyPostMultipleContentTypesComponentFiltered(obj);

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        Helpers.assertSimpleObject(res.res.json);
    }

    @Test
    void testRequestBodyPostMultipleContentTypesInlineFiltered() throws Exception {
        CommonHelpers.recordTest("request-bodies-post-multiple-content-types-inline-filtered");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        RequestBodyPostMultipleContentTypesInlineFilteredResponse res = s.requestBodies
                .requestBodyPostMultipleContentTypesInlineFiltered(
                        new RequestBodyPostMultipleContentTypesInlineFilteredRequestBody(true, 1.1,
                                "test"));

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        assertEquals(new HashMap<>() {
            {
                put("bool", true);
                put("num", 1.1);
                put("str", "test");
            }
        }, res.res.json);
    }

    @Test
    void testRequestBodyPostMultipleContentTypesSplitJson() throws Exception {
        CommonHelpers.recordTest("request-bodies-post-multiple-content-types-split-json");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        RequestBodyPostMultipleContentTypesSplitJsonResponse res = s.requestBodies
                .requestBodyPostMultipleContentTypesSplitJson(
                        new RequestBodyPostMultipleContentTypesSplitJsonRequestBody(true, 1.1, "test"));

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        assertEquals(new HashMap<>() {
            {
                put("bool", true);
                put("num", 1.1);
                put("str", "test");
            }
        }, res.res.json);
    }

    @Test
    void testRequestBodyPostMultipleContentTypesSplitMultipart() throws Exception {
        CommonHelpers.recordTest("request-bodies-post-multiple-content-types-split-multipart");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        RequestBodyPostMultipleContentTypesSplitMultipartResponse res = s.requestBodies
                .requestBodyPostMultipleContentTypesSplitMultipart(
                        new RequestBodyPostMultipleContentTypesSplitMultipartRequestBody(true, 1.1, "test"));

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        assertEquals(new HashMap<>() {
            {
                put("bool2", "true");
                put("num2", "1.1");
                put("str2", "test");
            }
        }, res.res.form);
    }

    @Test
    void testRequestBodyPostMultipleContentTypesSplitForm() throws Exception {
        CommonHelpers.recordTest("request-bodies-post-multiple-content-types-split-form");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        RequestBodyPostMultipleContentTypesSplitFormResponse res = s.requestBodies
                .requestBodyPostMultipleContentTypesSplitForm(
                        new RequestBodyPostMultipleContentTypesSplitFormRequestBody(true, 1.1, "test"));

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        assertEquals(new HashMap<>() {
            {
                put("bool3", "true");
                put("num3", "1.1");
                put("str3", "test");
            }
        }, res.res.form);
    }

    @Test
    void testRequestBodyPostMultipleContentTypesSplitJsonWithParam() throws Exception {
        CommonHelpers.recordTest("request-bodies-post-multiple-content-types-split-json-with-param");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        RequestBodyPostMultipleContentTypesSplitParamJsonRequestBody requestBody = new RequestBodyPostMultipleContentTypesSplitParamJsonRequestBody(
                true, 1.1, "test body");

        RequestBodyPostMultipleContentTypesSplitParamJsonResponse res = s.requestBodies
                .requestBodyPostMultipleContentTypesSplitParamJson(requestBody, "test param");

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        assertEquals(new HashMap<>() {
            {
                put("bool", true);
                put("num", 1.1);
                put("str", "test body");
            }
        }, res.res.json);
        assertEquals(new HashMap<>() {
            {
                put("paramStr", "test param");
            }
        }, res.res.args);
    }

    @Test
    void testRequestBodyPostMultipleContentTypesSplitMultipartWithParam() throws Exception {
        CommonHelpers.recordTest("request-bodies-post-multiple-content-types-split-multipart-with-param");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody formData = new RequestBodyPostMultipleContentTypesSplitParamMultipartRequestBody(
                true, 1.1, "test body");
        RequestBodyPostMultipleContentTypesSplitParamMultipartResponse res = s.requestBodies
                .requestBodyPostMultipleContentTypesSplitParamMultipart(formData, "test param");

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        assertEquals(new HashMap<>() {
            {
                put("bool2", "true");
                put("num2", "1.1");
                put("str2", "test body");
            }
        }, res.res.form);
        assertEquals(new HashMap<>() {
            {
                put("paramStr", "test param");
            }
        }, res.res.args);
    }

    @Test
    void testRequestBodyPostMultipleContentTypesSplitFormWithParam() throws Exception {
        CommonHelpers.recordTest("request-bodies-post-multiple-content-types-split-form-with-param");

        SDK s = SDK.builder().build();
        assertNotNull(s);
        RequestBodyPostMultipleContentTypesSplitParamFormRequestBody requestBody = new RequestBodyPostMultipleContentTypesSplitParamFormRequestBody(
                true, 1.1, "test body");
        RequestBodyPostMultipleContentTypesSplitParamFormResponse res = s.requestBodies
                .requestBodyPostMultipleContentTypesSplitParamForm(requestBody, "test param");

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        assertEquals(new HashMap<>() {
            {
                put("bool3", "true");
                put("num3", "1.1");
                put("str3", "test body");
            }
        }, res.res.form);
        assertEquals(new HashMap<>() {
            {
                put("paramStr", "test param");
            }
        }, res.res.args);
    }

    @Test
    void testRequestBodyPutMultipartSimple() throws Exception {
        CommonHelpers.recordTest("request-bodies-put-multipart-simple");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        SimpleObject obj = Helpers.createSimpleObject();

        RequestBodyPutMultipartSimpleResponse res = s.requestBodies
                .requestBodyPutMultipartSimple(obj);

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        assertEquals("any", res.res.form.any);
        assertEquals("true", res.res.form.bool);
        assertEquals("true", res.res.form.boolOpt);
        assertEquals("2020-01-01", res.res.form.date);
        assertEquals("2020-01-01T00:00:00.000000001Z", res.res.form.dateTime);
        assertEquals("one", res.res.form.enum_);
        assertEquals("1.1", res.res.form.float32);
        assertEquals("1", res.res.form.int_);
        assertEquals("1", res.res.form.int32);
        assertEquals("1.1", res.res.form.num);
        assertEquals("test", res.res.form.str);
        assertEquals("testOptional", res.res.form.strOpt);
    }

    @Test
    void testRequestBodyPutMultipartDeep() throws Exception {
        CommonHelpers.recordTest("request-bodies-put-multipart-deep");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        DeepObject obj = Helpers.createDeepObject();

        RequestBodyPutMultipartDeepResponse res = s.requestBodies
                .requestBodyPutMultipartDeep(obj);

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        assertEquals(JSON.getMapper().writeValueAsString(obj.arr), res.res.form.arr);
        assertEquals("true", res.res.form.bool);
        assertEquals("1", res.res.form.int_);
        assertEquals(JSON.getMapper().writeValueAsString(obj.map), res.res.form.map);
        assertEquals("1.1", res.res.form.num);
        assertEquals(JSON.getMapper().writeValueAsString(obj.obj), res.res.form.obj);
        assertEquals("test", res.res.form.str);
    }

    @Test
    void testRequestBodyPutMultipartFile() throws Exception {
        CommonHelpers.recordTest("request-bodies-put-multipart-file");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        byte[] data = Helpers.getData();

        RequestBodyPutMultipartFileResponse res = s.requestBodies
                .requestBodyPutMultipartFile(new RequestBodyPutMultipartFileRequestBody() {
                    {
                        file = new File(data, "testUpload.json");
                    }
                });

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        assertEquals(new HashMap<String, String>() {
            {
                put("file", new String(data, StandardCharsets.UTF_8));
            }
        }, res.res.files);
    }

    @Test
    void testRequestBodyPostFormSimple() throws Exception {
        CommonHelpers.recordTest("request-bodies-post-form-simple");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        SimpleObject obj = Helpers.createSimpleObject();

        RequestBodyPostFormSimpleResponse res = s.requestBodies
                .requestBodyPostFormSimple(obj);

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        assertEquals("any", res.res.form.any);
        assertEquals("true", res.res.form.bool);
        assertEquals("true", res.res.form.boolOpt);
        assertEquals("2020-01-01", res.res.form.date);
        assertEquals("2020-01-01T00:00:00.000000001Z", res.res.form.dateTime);
        assertEquals("one", res.res.form.enum_);
        assertEquals("1.1", res.res.form.float32);
        assertEquals("1", res.res.form.int_);
        assertEquals("1", res.res.form.int32);
        assertEquals("1.1", res.res.form.num);
        assertEquals("test", res.res.form.str);
        assertEquals("testOptional", res.res.form.strOpt);
    }

    @Test
    void testRequestBodyPostFormDeep() throws Exception {
        CommonHelpers.recordTest("request-bodies-post-form-deep");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        DeepObject obj = Helpers.createDeepObject();

        RequestBodyPostFormDeepResponse res = s.requestBodies
                .requestBodyPostFormDeep(obj);

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        assertEquals(JSON.getMapper().writeValueAsString(obj.arr), res.res.form.arr);
        assertEquals("true", res.res.form.bool);
        assertEquals("1", res.res.form.int_);
        assertEquals(JSON.getMapper().writeValueAsString(obj.map), res.res.form.map);
        assertEquals("1.1", res.res.form.num);
        assertEquals(JSON.getMapper().writeValueAsString(obj.obj), res.res.form.obj);
        assertEquals("test", res.res.form.str);
    }

    @Test
    void testRequestBodyPostFormMapPrimitive() throws Exception {
        CommonHelpers.recordTest("request-bodies-post-form-map-primitive");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        Map<String, String> map = new HashMap<String, String>() {
            {
                put("key1", "value1");
                put("key2", "value2");
                put("key3", "value3");
            }
        };

        RequestBodyPostFormMapPrimitiveResponse res = s.requestBodies
                .requestBodyPostFormMapPrimitive(map);

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        assertEquals(map, res.res.form);
    }

    @Test
    void testRequestBodyPutString() throws Exception {
        CommonHelpers.recordTest("request-bodies-put-string");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        String str = "Hello world";
        RequestBodyPutStringResponse res = s.requestBodies
                .requestBodyPutString(str);

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        assertEquals(str, res.res.data);
    }

    @Test
    void testRequestBodyPutBytes() throws Exception {
        CommonHelpers.recordTest("request-bodies-put-bytes");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        byte[] data = Helpers.getData();
        RequestBodyPutBytesResponse res = s.requestBodies
                .requestBodyPutBytes(data);

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        assertEquals(new String(data, StandardCharsets.UTF_8), res.res.data);
    }

    @Test
    void testRequestBodyPutStringWithParams() throws Exception {
        CommonHelpers.recordTest("request-bodies-put-string-with-params");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        String str = "Hello world";
        RequestBodyPutStringWithParamsResponse res = s.requestBodies
                .requestBodyPutStringWithParams(str, "test param");

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        assertEquals(str, res.res.data);
        assertEquals("test param", res.res.args.queryStringParam);
    }

    @Test
    void testRequestBodyPutBytesWithParams() throws Exception {
        CommonHelpers.recordTest("request-bodies-put-bytes-with-params");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        byte[] data = Helpers.getData();
        RequestBodyPutBytesWithParamsResponse res = s.requestBodies
                .requestBodyPutBytesWithParams(data, "test param");

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        assertEquals(new String(data, StandardCharsets.UTF_8), res.res.data);
        assertEquals("test param", res.res.args.queryStringParam);
    }

    @Test
    void testRequestBodyEmptyObject() throws Exception {
        CommonHelpers.recordTest("request-bodies-post-empty-object");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        RequestBodyPostEmptyObjectResponse res = s.requestBodies
                .requestBodyPostEmptyObject(new RequestBodyPostEmptyObjectRequestBody());

        assertNotNull(res);
        assertEquals(200, res.statusCode);
    }

    @Test
    void testRequestBodyCamelCase() throws Exception {
        CommonHelpers.recordTest("request-bodies-post-application-json-simple-camel-case");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        SimpleObjectCamelCase obj = Helpers.createSimpleObjectCamelCase();

        RequestBodyPostApplicationJsonSimpleCamelCaseResponse res = s.requestBodies
                .requestBodyPostApplicationJsonSimpleCamelCase(obj);

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.res);
        Helpers.assertSimpleObjectCamelCase(res.res.json);
    }

    @Test
    void testRequestBodyReadOnlyInput() throws Exception {
        CommonHelpers.recordTest("request-bodies-read-only-input");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        RequestBodyReadOnlyInputResponse res = s.requestBodies
                .requestBodyReadOnlyInput(new ReadOnlyObjectInput());

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.readOnlyObject);
        assertEquals(true, res.readOnlyObject.bool);
        assertEquals(1.0, res.readOnlyObject.num);
        assertEquals("hello", res.readOnlyObject.string);
    }

    @Test
    void testRequestBodyWriteOnlyOutput() throws Exception {
        CommonHelpers.recordTest("request-bodies-write-only-output");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        RequestBodyWriteOnlyOutputResponse res = s.requestBodies
                .requestBodyWriteOnlyOutput(new WriteOnlyObject(true, 1.0, "hello"));

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.writeOnlyObject);
    }

    @Test
    void testRequestBodyWriteOnly() throws Exception {
        CommonHelpers.recordTest("request-bodies-write-only");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        RequestBodyWriteOnlyResponse res = s.requestBodies
                .requestBodyWriteOnly(new WriteOnlyObject(true, 1.0, "hello"));

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.readOnlyObject);
        assertEquals(true, res.readOnlyObject.bool);
        assertEquals(1.0, res.readOnlyObject.num);
        assertEquals("hello", res.readOnlyObject.string);
    }

    @Test
    void testRequestBodyReadAndWrite() throws Exception {
        CommonHelpers.recordTest("request-bodies-read-and-write");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        RequestBodyReadAndWriteResponse res = s.requestBodies
                .requestBodyReadAndWrite(new ReadWriteObject(1l, 2l, 4l));

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertNotNull(res.readWriteObject);
        assertEquals(4l, res.readWriteObject.num3);
        assertEquals(7l, res.readWriteObject.sum);
    }
}