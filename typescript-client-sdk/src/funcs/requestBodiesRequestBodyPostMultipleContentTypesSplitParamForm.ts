/*
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

import { SDKCore } from "../core.js";
import {
    encodeBodyForm as encodeBodyForm$,
    encodeFormQuery as encodeFormQuery$,
} from "../lib/encodings.js";
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
import { Result } from "../sdk/types/fp.js";

export async function requestBodiesRequestBodyPostMultipleContentTypesSplitParamForm(
    client$: SDKCore,
    requestBody: operations.RequestBodyPostMultipleContentTypesSplitParamFormRequestBody,
    paramStr: string,
    options?: RequestOptions
): Promise<
    Result<
        operations.RequestBodyPostMultipleContentTypesSplitParamFormRes,
        | SDKError
        | SDKValidationError
        | UnexpectedClientError
        | InvalidRequestError
        | RequestAbortedError
        | RequestTimeoutError
        | ConnectionError
    >
> {
    const input$: operations.RequestBodyPostMultipleContentTypesSplitParamFormRequest = {
        requestBody: requestBody,
        paramStr: paramStr,
    };

    const parsed$ = schemas$.safeParse(
        input$,
        (value$) =>
            operations.RequestBodyPostMultipleContentTypesSplitParamFormRequest$outboundSchema.parse(
                value$
            ),
        "Input validation failed"
    );
    if (!parsed$.ok) {
        return parsed$;
    }
    const payload$ = parsed$.value;
    const body$ = Object.entries(payload$.RequestBody || {})
        .map(([k, v]) => {
            return encodeBodyForm$(k, v, { charEncoding: "percent" });
        })
        .join("&");

    const path$ = pathToFunc("/anything/requestBodies/post/multiple/contentTypes/split/param")();

    const query$ = encodeFormQuery$({
        paramStr: payload$.paramStr,
    });

    const headers$ = new Headers({
        "Content-Type": "application/x-www-form-urlencoded",
        Accept: "application/json",
    });

    const security$ = await extractSecurity(client$.options$.security);
    const context = {
        operationID: "requestBodyPostMultipleContentTypesSplitParam_form",
        oAuth2Scopes: [],
        securitySource: client$.options$.security,
    };
    const securitySettings$ = resolveGlobalSecurity(security$);

    const requestRes = client$.createRequest$(
        context,
        {
            security: securitySettings$,
            method: "POST",
            path: path$,
            headers: headers$,
            query: query$,
            body: body$,
            uaHeader: "x-speakeasy-user-agent",
            timeoutMs: options?.timeoutMs || client$.options$.timeoutMs || -1,
        },
        options
    );
    if (!requestRes.ok) {
        return requestRes;
    }
    const request$ = requestRes.value;

    const doResult = await client$.do$(request$, {
        context,
        errorCodes: ["4XX", "5XX"],
        retryConfig: options?.retries || client$.options$.retryConfig,
        retryCodes: options?.retryCodes || ["429", "500", "502", "503", "504"],
    });
    if (!doResult.ok) {
        return doResult;
    }
    const response = doResult.value;

    const [result$] = await m$.match<
        operations.RequestBodyPostMultipleContentTypesSplitParamFormRes,
        | SDKError
        | SDKValidationError
        | UnexpectedClientError
        | InvalidRequestError
        | RequestAbortedError
        | RequestTimeoutError
        | ConnectionError
    >(
        m$.json(200, operations.RequestBodyPostMultipleContentTypesSplitParamFormRes$inboundSchema),
        m$.fail(["4XX", "5XX"])
    )(response);
    if (!result$.ok) {
        return result$;
    }

    return result$;
}