/*
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

import { expect, test } from "vitest";
import { SDK } from "../index.js";

import { recordTest } from "./common_helpers.js";
import { createSimpleObject } from "./primary_helpers.js";
import { SDKValidationError } from "../sdk/models/errors/sdkvalidationerror.js";

const consumerURL = "http://localhost:35123/example-consumer-endpoint";

test("Test Webhooks No Signing", async () => {
  recordTest("webhooks-no-signing");

  const sdk = new SDK({});

  const payload = {
    data: createSimpleObject(),
    type: "webhook.created" as const,
  };

  try {
    await sdk.webhooks.sendNoSigning({ url: consumerURL }, payload);
  } catch (e: any) {
    // We're asserting it was able to send the request - ie the request data was valid
    expect(e.httpMeta.response.status).toBe(404);
  }

  const res2 = await sdk.validateWebhook({
    request: {
      body: JSON.stringify(payload),
    },
  });

  expect(res2).toBeDefined();
});

test("Test Webhooks Bad Outgoing Request", async () => {
  recordTest("webhooks-bad-outgoing-request");

  const sdk = new SDK({});

  try {
    await sdk.webhooks.sendNoSigning({ url: consumerURL }, {
      foo: "foo",
    } as any);
  } catch (e: any) {
    expect(e).toBeInstanceOf(SDKValidationError);
  }
});

test("Test Webhooks Bad Incoming Request", async () => {
  recordTest("webhooks-bad-incoming-request");

  const sdk = new SDK({});

  try {
    await sdk.validateWebhook({
      request: {
        body: "{}",
      },
    });
  } catch (e: any) {
    expect(e).toBeInstanceOf(SDKValidationError);
  }
});