/*
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

import { SDKCore } from "../core.js";
import { encodeSimple as encodeSimple$ } from "../lib/encodings.js";
import * as m$ from "../lib/matchers.js";
import * as schemas$ from "../lib/schemas.js";
import { RequestOptions } from "../lib/sdks.js";
import { resolveSecurity, SecurityInput } from "../lib/security.js";
import { pathToFunc } from "../lib/url.js";
import {
  ConnectionError,
  InvalidRequestError,
  RequestAbortedError,
  RequestTimeoutError,
  UnexpectedClientError,
} from "../sdk/models/errors/httpclienterrors.js";
import { SDKError } from "../sdk/models/errors/sdkerror.js";
import { SDKValidationError } from "../sdk/models/errors/sdkvalidationerror.js";
import * as operations from "../sdk/models/operations/index.js";
import { Result } from "../sdk/types/fp.js";

export async function authBasicAuth(
  client$: SDKCore,
  security: operations.BasicAuthSecurity,
  passwd: string,
  user: string,
  options?: RequestOptions,
): Promise<
  Result<
    operations.BasicAuthUser,
    | SDKError
    | SDKValidationError
    | UnexpectedClientError
    | InvalidRequestError
    | RequestAbortedError
    | RequestTimeoutError
    | ConnectionError
  >
> {
  const input$: operations.BasicAuthRequest = {
    passwd: passwd,
    user: user,
  };

  const parsed$ = schemas$.safeParse(
    input$,
    (value$) => operations.BasicAuthRequest$outboundSchema.parse(value$),
    "Input validation failed",
  );
  if (!parsed$.ok) {
    return parsed$;
  }
  const payload$ = parsed$.value;
  const body$ = null;

  const pathParams$ = {
    passwd: encodeSimple$("passwd", payload$.passwd, {
      explode: false,
      charEncoding: "percent",
    }),
    user: encodeSimple$("user", payload$.user, {
      explode: false,
      charEncoding: "percent",
    }),
  };

  const path$ = pathToFunc("/basic-auth/{user}/{passwd}")(pathParams$);

  const headers$ = new Headers({
    Accept: "application/json",
  });

  const security$: SecurityInput[][] = [
    [
      {
        type: "http:basic",
        value: { password: security?.password, username: security?.username },
      },
    ],
  ];
  const securitySettings$ = resolveSecurity(...security$);
  const context = {
    operationID: "basicAuth",
    oAuth2Scopes: [],
    securitySource: security,
  };

  const requestRes = client$.createRequest$(context, {
    security: securitySettings$,
    method: "GET",
    path: path$,
    headers: headers$,
    body: body$,
    uaHeader: "x-speakeasy-user-agent",
    timeoutMs: options?.timeoutMs || client$.options$.timeoutMs || -1,
  }, options);
  if (!requestRes.ok) {
    return requestRes;
  }
  const request$ = requestRes.value;

  const doResult = await client$.do$(request$, {
    context,
    errorCodes: ["401", "4XX", "5XX"],
    retryConfig: options?.retries
      || client$.options$.retryConfig,
    retryCodes: options?.retryCodes || ["429", "500", "502", "503", "504"],
  });
  if (!doResult.ok) {
    return doResult;
  }
  const response = doResult.value;

  const [result$] = await m$.match<
    operations.BasicAuthUser,
    | SDKError
    | SDKValidationError
    | UnexpectedClientError
    | InvalidRequestError
    | RequestAbortedError
    | RequestTimeoutError
    | ConnectionError
  >(
    m$.json(200, operations.BasicAuthUser$inboundSchema),
    m$.fail([401, "4XX", "5XX"]),
  )(response);
  if (!result$.ok) {
    return result$;
  }

  return result$;
}