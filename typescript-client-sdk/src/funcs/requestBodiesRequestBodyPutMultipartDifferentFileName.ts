/*
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

import { SDKCore } from "../core.js";
import { readableStreamToArrayBuffer } from "../lib/files.js";
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
import { isBlobLike } from "../sdk/types/blobs.js";
import { Result } from "../sdk/types/fp.js";
import { isReadableStream } from "../sdk/types/streams.js";

export async function requestBodiesRequestBodyPutMultipartDifferentFileName(
    client$: SDKCore,
    request: operations.RequestBodyPutMultipartDifferentFileNameRequestBody,
    options?: RequestOptions
): Promise<
    Result<
        operations.RequestBodyPutMultipartDifferentFileNameRes,
        | SDKError
        | SDKValidationError
        | UnexpectedClientError
        | InvalidRequestError
        | RequestAbortedError
        | RequestTimeoutError
        | ConnectionError
    >
> {
    const input$ = request;

    const parsed$ = schemas$.safeParse(
        input$,
        (value$) =>
            operations.RequestBodyPutMultipartDifferentFileNameRequestBody$outboundSchema.parse(
                value$
            ),
        "Input validation failed"
    );
    if (!parsed$.ok) {
        return parsed$;
    }
    const payload$ = parsed$.value;
    const body$ = new FormData();

    if (payload$.differentFileName !== undefined) {
        if (isBlobLike(payload$.differentFileName)) {
            body$.append("differentFileName", payload$.differentFileName);
        } else if (isReadableStream(payload$.differentFileName.content)) {
            const buffer = await readableStreamToArrayBuffer(payload$.differentFileName.content);
            const blob = new Blob([buffer], { type: "application/octet-stream" });
            body$.append("differentFileName", blob);
        } else {
            body$.append(
                "differentFileName",
                new Blob([payload$.differentFileName.content], {
                    type: "application/octet-stream",
                }),
                payload$.differentFileName.fileName
            );
        }
    }

    const path$ = pathToFunc("/anything/requestBodies/put/multipart/differentFileName")();

    const headers$ = new Headers({
        Accept: "application/json",
    });

    const security$ = await extractSecurity(client$.options$.security);
    const context = {
        operationID: "requestBodyPutMultipartDifferentFileName",
        oAuth2Scopes: [],
        securitySource: client$.options$.security,
    };
    const securitySettings$ = resolveGlobalSecurity(security$);

    const requestRes = client$.createRequest$(
        context,
        {
            security: securitySettings$,
            method: "PUT",
            path: path$,
            headers: headers$,
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
        operations.RequestBodyPutMultipartDifferentFileNameRes,
        | SDKError
        | SDKValidationError
        | UnexpectedClientError
        | InvalidRequestError
        | RequestAbortedError
        | RequestTimeoutError
        | ConnectionError
    >(
        m$.json(200, operations.RequestBodyPutMultipartDifferentFileNameRes$inboundSchema),
        m$.fail(["4XX", "5XX"])
    )(response);
    if (!result$.ok) {
        return result$;
    }

    return result$;
}