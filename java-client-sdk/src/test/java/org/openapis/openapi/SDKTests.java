/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.Exception;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openapis.openapi.models.operations.ResponseBodyJsonGetResponse;
import org.openapis.openapi.models.shared.HttpBinSimpleJsonObject;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.Slides;
import org.openapis.openapi.models.shared.Slideshow;
import org.openapis.openapi.utils.Utils;

public class SDKTests { 
    @Disabled // test marked as skipped for java or generated unit tests not production ready yet
    @Test
    public void testSDK_ResponseBodyJsonGet() throws Exception {
        Utils.recordTest("response-bodies-json-get");

        SDK sdk = SDK.builder()
                .security(Security.builder()
                    .apiKeyAuth("Token YOUR_API_KEY")
                    .build())
                .globalHeaderParam(true)
                .globalHiddenQueryParam("hello")
                .globalPathParam(100L)
                .globalQueryParam("some example global query param")
            .build();

        ResponseBodyJsonGetResponse res = sdk.responseBodyJsonGet()
                .call();

    assertEquals(200, res.statusCode());
        assertEquals(
            HttpBinSimpleJsonObject.builder()
        .slideshow(Slideshow.builder()
            .author("Yours Truly")
            .date("date of publication")
            .slides(List.of(
                Slides.builder()
                    .title("Wake up to WonderWidgets!")
                    .type("all")
                    .build(),
                Slides.builder()
                    .title("Overview")
                    .type("all")
                    .items(List.of(
                        "Why <em>WonderWidgets</em> are great",
                        "Who <em>buys</em> WonderWidgets"))
                    .build()))
            .title("Sample Slide Show")
            .build())
        .build(),
            res.httpBinSimpleJsonObject().get());
    }

}