/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import { SDK } from "../";
import { recordTest } from "./common_helpers";
import { expect, test } from "vitest";

test("Sdk Response Body Json Get Test", async () => {
    recordTest("response-bodies-json-get");

    const sdk = new SDK({
        security: {
            apiKeyAuth: "Token YOUR_API_KEY",
        },
    });
    const result = await sdk.responseBodyJsonGet();

    expect(result.statusCode).toBe(200);
    expect(result.httpBinSimpleJsonObject).toEqual({
        slideshow: {
            author: "Yours Truly",
            date: "date of publication",
            slides: [
                {
                    title: "Wake up to WonderWidgets!",
                    type: "all",
                },
                {
                    items: [
                        "Why <em>WonderWidgets</em> are great",
                        "Who <em>buys</em> WonderWidgets",
                    ],
                    title: "Overview",
                    type: "all",
                },
            ],
            title: "Sample Slide Show",
        },
    });
});