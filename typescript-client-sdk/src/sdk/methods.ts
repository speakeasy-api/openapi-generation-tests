/*
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

import { methodsMethodDelete } from "../funcs/methodsMethodDelete.js";
import { methodsMethodGet } from "../funcs/methodsMethodGet.js";
import { methodsMethodHead } from "../funcs/methodsMethodHead.js";
import { methodsMethodOptions } from "../funcs/methodsMethodOptions.js";
import { methodsMethodPatch } from "../funcs/methodsMethodPatch.js";
import { methodsMethodPost } from "../funcs/methodsMethodPost.js";
import { methodsMethodPut } from "../funcs/methodsMethodPut.js";
import { methodsMethodTrace } from "../funcs/methodsMethodTrace.js";
import { ClientSDK, RequestOptions } from "../lib/sdks.js";
import * as operations from "./models/operations/index.js";
import { unwrapAsync } from "./types/fp.js";

export class Methods extends ClientSDK {
    async methodDelete(
        request: operations.MethodDeleteRequestBody,
        options?: RequestOptions & { serverURL?: string }
    ): Promise<operations.MethodDeleteResponseBody> {
        return unwrapAsync(methodsMethodDelete(this, request, options));
    }

    async methodGet(
        options?: RequestOptions & { serverURL?: string }
    ): Promise<operations.MethodGetResponseBody> {
        return unwrapAsync(methodsMethodGet(this, options));
    }

    async methodHead(options?: RequestOptions & { serverURL?: string }): Promise<void> {
        return unwrapAsync(methodsMethodHead(this, options));
    }

    async methodOptions(
        options?: RequestOptions & { serverURL?: string }
    ): Promise<operations.MethodOptionsResponse | undefined> {
        return unwrapAsync(methodsMethodOptions(this, options));
    }

    async methodPatch(
        request: operations.MethodPatchRequestBody,
        options?: RequestOptions & { serverURL?: string }
    ): Promise<operations.MethodPatchResponseBody> {
        return unwrapAsync(methodsMethodPatch(this, request, options));
    }

    async methodPost(
        request: operations.MethodPostRequestBody,
        options?: RequestOptions & { serverURL?: string }
    ): Promise<operations.MethodPostResponseBody> {
        return unwrapAsync(methodsMethodPost(this, request, options));
    }

    async methodPut(
        request: operations.MethodPutRequestBody,
        options?: RequestOptions & { serverURL?: string }
    ): Promise<operations.MethodPutResponseBody> {
        return unwrapAsync(methodsMethodPut(this, request, options));
    }

    async methodTrace(options?: RequestOptions & { serverURL?: string }): Promise<string> {
        return unwrapAsync(methodsMethodTrace(this, options));
    }
}