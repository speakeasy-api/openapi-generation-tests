/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import { expect, test } from "vitest";

import { SDK } from "..";
import { TestHooksRes } from "../sdk/models/operations";
import { recordTest } from "./common_helpers";

test("Test hooks", async () => {
  recordTest("test-hooks");

  const s = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
  });

  const response = await s.hooks.testHooks("someInitialValue");
  expect(response).toBeDefined();
  expect(response.statusCode).toBe(200);
  expect(response.res).toEqual({
    args: {
      someParam: "overriddenParam",
    },
    headers: {
      clientLevelHeader: "added by client",
      idempotencyKey: "some-key",
    },
    url: "http://localhost:35123/anything/hooks?someParam=overriddenParam",
  } as TestHooksRes);
});

test("Test hooks after response", async () => {
  recordTest("test-hooks-after-response");

  const s = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
  });

  await s.hooks.testHooksAfterResponse().then(
    () => {
      expect.unreachable("sdk call is expected to fail");
    },
    (err) => {
      expect(err).toBeInstanceOf(Error);
      expect(`${err}`).toBe("Error: validation failed");
    },
  );
});

test("Test hooks error", async () => {
  recordTest("test-hooks-error");

  const s = new SDK({
    security: {
      apiKeyAuth: "Token YOUR_API_KEY",
    },
  });

  await s.hooks.testHooksError().then(
    () => {
      expect.unreachable("sdk call is expected to fail");
    },
    (err) => {
      expect(err).toBeInstanceOf(Error);
      expect(`${err}`).toBe("Error: special test error case");
    },
  );
});