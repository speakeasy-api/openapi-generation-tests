/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openapis.openapi.models.operations.*;
import org.openapis.openapi.models.shared.SimpleObject;

public class FlatteningTests {
    @Test
    void testComponentBodyAndParamNoConflict() throws Exception {
        CommonHelpers.recordTest("flattening-component-body-and-param-no-conflict");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        SimpleObject obj = Helpers.createSimpleObject();

        ComponentBodyAndParamNoConflictResponse res = s.flattening
                .componentBodyAndParamNoConflict("param test", obj);

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertEquals("param test", res.res.args.get("paramStr"));
        Helpers.assertSimpleObject(res.res.json);
    }

    @Test
    void testComponentBodyAndParamConflict() throws Exception {
        CommonHelpers.recordTest("flattening-component-body-and-param-conflict");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        SimpleObject obj = Helpers.createSimpleObject();

        ComponentBodyAndParamConflictResponse res = s.flattening
                .componentBodyAndParamConflict(obj, "param test");

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertEquals("param test", res.res.args.get("str"));
        Helpers.assertSimpleObject(res.res.json);
    }

    @Test
    void testInlineBodyAndParamConflict() throws Exception {
        CommonHelpers.recordTest("flattening-inline-body-and-param-conflict");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        InlineBodyAndParamConflictResponse res = s.flattening
                .inlineBodyAndParamConflict(new InlineBodyAndParamConflictRequestBody("body test"), "param test");

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertEquals("param test", res.res.args.get("str"));
        assertEquals("body test", res.res.json.str);
    }

    @Test
    void testInlineBodyAndParamNoConflict() throws Exception {
        CommonHelpers.recordTest("flattening-inline-body-and-param-no-conflict");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        InlineBodyAndParamNoConflictResponse res = s.flattening
                .inlineBodyAndParamNoConflict(new InlineBodyAndParamNoConflictRequestBody("body test"), "param test");

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertEquals("param test", res.res.args.get("paramStr"));
        assertEquals("body test", res.res.json.bodyStr);
    }

    @Test
    void testConflictingParams() throws Exception {
        CommonHelpers.recordTest("flattening-conflicting-params");

        SDK s = SDK.builder().build();
        assertNotNull(s);

        ConflictingParamsResponse res = s.flattening
                .conflictingParams("pathParam", "queryParam");

        assertNotNull(res);
        assertEquals(200, res.statusCode);
        assertTrue(res.res.url.contains("/pathParam?"));
        assertEquals("queryParam", res.res.args.get("str"));
    }
}