/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import {
  ApiKeyAuthHoistedResponse,
  ApiKeyOrBearerAuthResponse,
  BasicAuthResponse,
  NoAuthResponse,
} from "../sdk/models/operations";
import { expect, test } from "vitest";

import { SDK } from "..";
import { recordTest } from "./common_helpers";

test("Test No Auth", async () => {
  recordTest("auth-no-auth");

  const sdk = new SDK({});

  const res: NoAuthResponse = await sdk.auth.noAuth();

  expect(res.statusCode).toBeDefined();
  expect(res.statusCode).toBe(200);
});

test("Test Basic Auth", async () => {
  recordTest("auth-basic-auth");

  const sdk = new SDK({});

  const res: BasicAuthResponse = await sdk.auth.basicAuth(
    {
      username: "testUser",
      password: "testPass",
    },
    "testPass",
    "testUser",
  );

  expect(res.statusCode).toBeDefined();
  expect(res.statusCode).toBe(200);
  expect(res.user?.authenticated).toBe(true);
});

test("Test API Key Auth Global", async () => {
  recordTest("auth-api-key-auth-global");

  const sdk = new SDK({ apiKeyAuth: "Bearer test_token" });

  const res: ApiKeyAuthHoistedResponse = await sdk.auth.apiKeyAuthHoisted();

  expect(res.statusCode).toBeDefined();
  expect(res.statusCode).toBe(200);
  expect(res.token?.authenticated).toBe(true);
  expect(res.token?.token).toBe("test_token");
});

test("Test API Key Auth Operation", async () => {
  recordTest("auth-api-key-auth-operation");

  const sdk = new SDK({});

  const res: ApiKeyOrBearerAuthResponse = await sdk.auth.apiKeyOrBearerAuth({
    apiKeyAuth: "Bearer test_token",
  });

  expect(res.statusCode).toBeDefined();
  expect(res.statusCode).toBe(200);
  expect(res.token?.authenticated).toBe(true);
  expect(res.token?.token).toBe("test_token");
});