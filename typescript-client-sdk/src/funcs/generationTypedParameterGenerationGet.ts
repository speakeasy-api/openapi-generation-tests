/*
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

import { SDKCore } from "../core.js";
import { encodeFormQuery as encodeFormQuery$ } from "../lib/encodings.js";
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
import { Decimal as Decimal$ } from "../sdk/types/decimal.js";
import { Result } from "../sdk/types/fp.js";
import { RFCDate } from "../sdk/types/rfcdate.js";
import * as z from "zod";

export async function generationTypedParameterGenerationGet(
    client$: SDKCore,
    bigint?: bigint | undefined,
    date?: RFCDate | undefined,
    decimal?: Decimal$ | number | undefined,
    obj?: operations.Obj | undefined,
    options?: RequestOptions
): Promise<
    Result<
        void,
        | SDKError
        | SDKValidationError
        | UnexpectedClientError
        | InvalidRequestError
        | RequestAbortedError
        | RequestTimeoutError
        | ConnectionError
    >
> {
    const input$: operations.TypedParameterGenerationGetRequest = {
        bigint: bigint,
        date: date,
        decimal: decimal,
        obj: obj,
    };

    const parsed$ = schemas$.safeParse(
        input$,
        (value$) => operations.TypedParameterGenerationGetRequest$outboundSchema.parse(value$),
        "Input validation failed"
    );
    if (!parsed$.ok) {
        return parsed$;
    }
    const payload$ = parsed$.value;
    const body$ = null;

    const path$ = pathToFunc("/anything/typedParameterGeneration")();

    const query$ = encodeFormQuery$({
        bigint: payload$.bigint,
        date: payload$.date,
        decimal: payload$.decimal,
        obj: payload$.obj,
    });

    const headers$ = new Headers({
        Accept: "*/*",
    });

    const security$ = await extractSecurity(client$.options$.security);
    const context = {
        operationID: "typedParameterGenerationGet",
        oAuth2Scopes: [],
        securitySource: client$.options$.security,
    };
    const securitySettings$ = resolveGlobalSecurity(security$);

    const requestRes = client$.createRequest$(
        context,
        {
            security: securitySettings$,
            method: "GET",
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
        void,
        | SDKError
        | SDKValidationError
        | UnexpectedClientError
        | InvalidRequestError
        | RequestAbortedError
        | RequestTimeoutError
        | ConnectionError
    >(
        m$.nil(200, z.void()),
        m$.fail(["4XX", "5XX"])
    )(response);
    if (!result$.ok) {
        return result$;
    }

    return result$;
}