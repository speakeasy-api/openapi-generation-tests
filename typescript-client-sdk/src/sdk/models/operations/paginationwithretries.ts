/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import { remap as remap$ } from "../../../lib/primitives.js";
import * as z from "zod";

export const PaginationWithRetriesServerList = ["http://localhost:35456"] as const;

export type PaginationWithRetriesRequest = {
    /**
     * The page token used to request a specific page of the search results
     */
    cursor?: string | undefined;
    faultSettings?: string | undefined;
    requestId?: string | undefined;
};

/**
 * OK
 */
export type PaginationWithRetriesRes = {
    next?: string | undefined;
    numPages: number;
    resultArray: Array<string>;
};

export type PaginationWithRetriesResponse = {
    result: PaginationWithRetriesRes;
};

/** @internal */
export const PaginationWithRetriesRequest$inboundSchema: z.ZodType<
    PaginationWithRetriesRequest,
    z.ZodTypeDef,
    unknown
> = z
    .object({
        cursor: z.string().optional(),
        "fault-settings": z.string().default('{"error_code": 503, "error_count": 3}'),
        "request-id": z.string().default("paginationWithRetries"),
    })
    .transform((v) => {
        return remap$(v, {
            "fault-settings": "faultSettings",
            "request-id": "requestId",
        });
    });

/** @internal */
export type PaginationWithRetriesRequest$Outbound = {
    cursor?: string | undefined;
    "fault-settings": string;
    "request-id": string;
};

/** @internal */
export const PaginationWithRetriesRequest$outboundSchema: z.ZodType<
    PaginationWithRetriesRequest$Outbound,
    z.ZodTypeDef,
    PaginationWithRetriesRequest
> = z
    .object({
        cursor: z.string().optional(),
        faultSettings: z.string().default('{"error_code": 503, "error_count": 3}'),
        requestId: z.string().default("paginationWithRetries"),
    })
    .transform((v) => {
        return remap$(v, {
            faultSettings: "fault-settings",
            requestId: "request-id",
        });
    });

/**
 * @internal
 * @deprecated This namespace will be removed in future versions. Use schemas and types that are exported directly from this module.
 */
export namespace PaginationWithRetriesRequest$ {
    /** @deprecated use `PaginationWithRetriesRequest$inboundSchema` instead. */
    export const inboundSchema = PaginationWithRetriesRequest$inboundSchema;
    /** @deprecated use `PaginationWithRetriesRequest$outboundSchema` instead. */
    export const outboundSchema = PaginationWithRetriesRequest$outboundSchema;
    /** @deprecated use `PaginationWithRetriesRequest$Outbound` instead. */
    export type Outbound = PaginationWithRetriesRequest$Outbound;
}

/** @internal */
export const PaginationWithRetriesRes$inboundSchema: z.ZodType<
    PaginationWithRetriesRes,
    z.ZodTypeDef,
    unknown
> = z.object({
    next: z.string().optional(),
    numPages: z.number().int(),
    resultArray: z.array(z.string()),
});

/** @internal */
export type PaginationWithRetriesRes$Outbound = {
    next?: string | undefined;
    numPages: number;
    resultArray: Array<string>;
};

/** @internal */
export const PaginationWithRetriesRes$outboundSchema: z.ZodType<
    PaginationWithRetriesRes$Outbound,
    z.ZodTypeDef,
    PaginationWithRetriesRes
> = z.object({
    next: z.string().optional(),
    numPages: z.number().int(),
    resultArray: z.array(z.string()),
});

/**
 * @internal
 * @deprecated This namespace will be removed in future versions. Use schemas and types that are exported directly from this module.
 */
export namespace PaginationWithRetriesRes$ {
    /** @deprecated use `PaginationWithRetriesRes$inboundSchema` instead. */
    export const inboundSchema = PaginationWithRetriesRes$inboundSchema;
    /** @deprecated use `PaginationWithRetriesRes$outboundSchema` instead. */
    export const outboundSchema = PaginationWithRetriesRes$outboundSchema;
    /** @deprecated use `PaginationWithRetriesRes$Outbound` instead. */
    export type Outbound = PaginationWithRetriesRes$Outbound;
}

/** @internal */
export const PaginationWithRetriesResponse$inboundSchema: z.ZodType<
    PaginationWithRetriesResponse,
    z.ZodTypeDef,
    unknown
> = z
    .object({
        Result: z.lazy(() => PaginationWithRetriesRes$inboundSchema),
    })
    .transform((v) => {
        return remap$(v, {
            Result: "result",
        });
    });

/** @internal */
export type PaginationWithRetriesResponse$Outbound = {
    Result: PaginationWithRetriesRes$Outbound;
};

/** @internal */
export const PaginationWithRetriesResponse$outboundSchema: z.ZodType<
    PaginationWithRetriesResponse$Outbound,
    z.ZodTypeDef,
    PaginationWithRetriesResponse
> = z
    .object({
        result: z.lazy(() => PaginationWithRetriesRes$outboundSchema),
    })
    .transform((v) => {
        return remap$(v, {
            result: "Result",
        });
    });

/**
 * @internal
 * @deprecated This namespace will be removed in future versions. Use schemas and types that are exported directly from this module.
 */
export namespace PaginationWithRetriesResponse$ {
    /** @deprecated use `PaginationWithRetriesResponse$inboundSchema` instead. */
    export const inboundSchema = PaginationWithRetriesResponse$inboundSchema;
    /** @deprecated use `PaginationWithRetriesResponse$outboundSchema` instead. */
    export const outboundSchema = PaginationWithRetriesResponse$outboundSchema;
    /** @deprecated use `PaginationWithRetriesResponse$Outbound` instead. */
    export type Outbound = PaginationWithRetriesResponse$Outbound;
}