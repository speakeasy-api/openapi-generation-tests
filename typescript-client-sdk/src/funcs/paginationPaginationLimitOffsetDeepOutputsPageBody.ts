/*
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

import { SDKCore } from "../core.js";
import { dlv } from "../lib/dlv.js";
import { encodeJSON as encodeJSON$ } from "../lib/encodings.js";
import * as m$ from "../lib/matchers.js";
import * as schemas$ from "../lib/schemas.js";
import { RequestOptions } from "../lib/sdks.js";
import { extractSecurity, resolveGlobalSecurity } from "../lib/security.js";
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
import { PaginationLimitOffsetDeepOutputsPageBodyServerList } from "../sdk/models/operations/paginationlimitoffsetdeepoutputspagebody.js";
import * as shared from "../sdk/models/shared/index.js";
import { Result } from "../sdk/types/fp.js";
import {
  createPageIterator,
  haltIterator,
  PageIterator,
  Paginator,
} from "../sdk/types/operations.js";

export async function paginationPaginationLimitOffsetDeepOutputsPageBody(
  client$: SDKCore,
  request: shared.LimitOffsetConfig,
  options?: RequestOptions & { serverURL?: string },
): Promise<
  PageIterator<
    Result<
      operations.PaginationLimitOffsetDeepOutputsPageBodyResponse,
      | SDKError
      | SDKValidationError
      | UnexpectedClientError
      | InvalidRequestError
      | RequestAbortedError
      | RequestTimeoutError
      | ConnectionError
    >
  >
> {
  const input$ = request;

  const parsed$ = schemas$.safeParse(
    input$,
    (value$) => shared.LimitOffsetConfig$outboundSchema.parse(value$),
    "Input validation failed",
  );
  if (!parsed$.ok) {
    return haltIterator(parsed$);
  }
  const payload$ = parsed$.value;
  const body$ = encodeJSON$("body", payload$, { explode: true });

  const baseURL$ = options?.serverURL
    || pathToFunc(PaginationLimitOffsetDeepOutputsPageBodyServerList[0], {
      charEncoding: "percent",
    })();

  const path$ = pathToFunc("/pagination/limitoffset/deep_outputs/page")();

  const headers$ = new Headers({
    "Content-Type": "application/json",
    Accept: "application/json",
  });

  const security$ = await extractSecurity(client$.options$.security);
  const context = {
    operationID: "paginationLimitOffsetDeepOutputsPageBody",
    oAuth2Scopes: [],
    securitySource: client$.options$.security,
  };
  const securitySettings$ = resolveGlobalSecurity(security$);

  const requestRes = client$.createRequest$(context, {
    security: securitySettings$,
    method: "PUT",
    baseURL: baseURL$,
    path: path$,
    headers: headers$,
    body: body$,
    uaHeader: "x-speakeasy-user-agent",
    timeoutMs: options?.timeoutMs || client$.options$.timeoutMs || -1,
  }, options);
  if (!requestRes.ok) {
    return haltIterator(requestRes);
  }
  const request$ = requestRes.value;

  const doResult = await client$.do$(request$, {
    context,
    errorCodes: ["4XX", "5XX"],
    retryConfig: options?.retries
      || client$.options$.retryConfig,
    retryCodes: options?.retryCodes || ["429", "500", "502", "503", "504"],
  });
  if (!doResult.ok) {
    return haltIterator(doResult);
  }
  const response = doResult.value;

  const responseFields$ = {
    HttpMeta: { Response: response, Request: request$ },
  };

  const [result$, raw$] = await m$.match<
    operations.PaginationLimitOffsetDeepOutputsPageBodyResponse,
    | SDKError
    | SDKValidationError
    | UnexpectedClientError
    | InvalidRequestError
    | RequestAbortedError
    | RequestTimeoutError
    | ConnectionError
  >(
    m$.json(
      200,
      operations.PaginationLimitOffsetDeepOutputsPageBodyResponse$inboundSchema,
      { key: "Result" },
    ),
    m$.fail(["4XX", "5XX"]),
  )(response, { extraFields: responseFields$ });
  if (!result$.ok) {
    return haltIterator(result$);
  }

  const nextFunc = (
    responseData: unknown,
  ): Paginator<
    Result<
      operations.PaginationLimitOffsetDeepOutputsPageBodyResponse,
      | SDKError
      | SDKValidationError
      | UnexpectedClientError
      | InvalidRequestError
      | RequestAbortedError
      | RequestTimeoutError
      | ConnectionError
    >
  > => {
    const page = input$?.page || 0;
    const nextPage = page + 1;
    const numPages = dlv(responseData, "pageInfo.numPages");
    if (numPages == null || numPages <= page) {
      return () => null;
    }

    if (!responseData) {
      return () => null;
    }

    return () =>
      paginationPaginationLimitOffsetDeepOutputsPageBody(
        client$,
        {
          ...input$,
          page: nextPage,
        },
        options,
      );
  };

  const page$ = { ...result$, next: nextFunc(raw$) };
  return { ...page$, ...createPageIterator(page$, (v) => !v.ok) };
}