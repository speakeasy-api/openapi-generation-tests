/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.openapis.openapi.models.operations.NestedFirstGetResponse;
import org.openapis.openapi.models.operations.NestedSecondGetResponse;

public class MultilevelTests {
    @Test
    void testMultilevelGrouping() throws Exception {
        CommonHelpers.recordTest("multi-level-grouping");

        SDK s = SDK.builder().build();
        assertNotNull(s);
        {
            NestedFirstGetResponse res = s.nested().first().get().call();

            assertNotNull(res);
            assertEquals(200, res.statusCode());
        }
        {
            // check that method name override of second.get does not cause a 
            // a conflict with first.get (Guaranteed at compile-time actually)
            NestedSecondGetResponse res = s.nested().second().get().call();

            assertNotNull(res);
            assertEquals(200, res.statusCode());
        }
    }
    
}