/*
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

import { getRandomValues } from "crypto";
import { HTTPClient } from "../lib/http.js";

export function createTestHTTPClient(testName: string): HTTPClient {
  const httpClient = new HTTPClient({
    fetcher: (request: URL | RequestInfo) => {
      return fetch(request);
    },
  });

  const testInstanceId = genTestId();

  httpClient.addHook("beforeRequest", (request: Request) => {
    const nextRequest = new Request(request, {
      signal: request.signal || AbortSignal.timeout(5000),
    });

    nextRequest.headers.set("x-speakeasy-test-name", testName);
    nextRequest.headers.set("x-speakeasy-test-instance-id", testInstanceId);

    return nextRequest;
  });

  return httpClient;
}

function genTestId(): string {
  const b = new Uint8Array(16);
  getRandomValues(b);

  return `${buf2hex(b.slice(0, 4))}-${buf2hex(b.slice(4, 6))}-${
    buf2hex(
      b.slice(6, 8),
    )
  }-${buf2hex(b.slice(8, 10))}-${buf2hex(b.slice(10))}`;
}

// Helper function to convert buffer to hex string
function buf2hex(buffer: Uint8Array): string {
  return [...buffer]
    .map((x) => x.toString(16).padStart(2, "0"))
    .join("")
    .toUpperCase();
}