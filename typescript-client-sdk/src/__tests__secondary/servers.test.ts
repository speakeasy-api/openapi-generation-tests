/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import { expect, test } from "vitest";

import { SDK } from "..";
import { recordTest } from "./common_helpers";

test("Test Select Global Server Valid", async () => {
  recordTest("servers-select-global-server-valid");

  const sdk = new SDK({ serverURL: "http://localhost:35123" });
  const res = await sdk.servers.selectGlobalServer();
  expect(res).toBeDefined();
});

test("Test Select Global Server Broken", async () => {
  recordTest("servers-select-global-server-broken");

  const sdk = new SDK({ serverURL: "http://broken" });
  return sdk.servers.selectGlobalServer().catch((err: unknown) => {
    if (!(err instanceof TypeError)) {
      expect.unreachable("Expected error to be an object");
    }
    if (!("cause" in err) || !(err.cause instanceof Error)) {
      expect.unreachable("Expected error to have an underlying cause");
    }
    if (!("code" in err.cause) || typeof err.cause.code !== "string") {
      expect.unreachable(
        "Expected underlying error to have a code property set to a string",
      );
    }

    expect(err.cause.code).toMatch(/^(ENOTFOUND|EAI_AGAIN)$/);
  });
});

test("Test Select Global Server By Name Default", async () => {
  recordTest("servers-select-global-server-by-name-default");

  const sdk = new SDK();
  const res = await sdk.servers.selectGlobalServer();
  expect(res).toBeDefined();
});

test("Test Select Global Server By Name Valid", async () => {
  recordTest("servers-select-global-server-by-name-valid");

  const sdk = new SDK({ server: "default-server" });
  const res = await sdk.servers.selectGlobalServer();
  expect(res).toBeDefined();
});

test("Test Select Server By Name Invalid", async () => {
  recordTest("servers-select-global-server-by-name-invalid");

  // N.A - server must be keyof typeof ServerList
});

test("Test Select Server By Name Broken", async () => {
  recordTest("servers-select-global-server-by-name-broken");

  const sdk = new SDK({ server: "BrokenServer" });
  return sdk.servers.selectGlobalServer().catch((err: unknown) => {
    if (!(err instanceof TypeError)) {
      expect.unreachable("Expected error to be an object");
    }
    if (!("cause" in err) || !(err.cause instanceof Error)) {
      expect.unreachable("Expected error to have an underlying cause");
    }
    if (!("code" in err.cause) || typeof err.cause.code !== "string") {
      expect.unreachable(
        "Expected underlying error to have a code property set to a string",
      );
    }

    expect(err.cause.code).toMatch(/^(ENOTFOUND|EAI_AGAIN)$/);
  });
});