/*
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

import {
    DeepObject,
    DeepObject$inboundSchema,
    DeepObject$Outbound,
    DeepObject$outboundSchema,
} from "./deepobject.js";
import {
    SimpleObject,
    SimpleObject$inboundSchema,
    SimpleObject$Outbound,
    SimpleObject$outboundSchema,
} from "./simpleobject.js";
import * as z from "zod";

export type InfectedWithAnyData = DeepObject | SimpleObject | any;

export type InfectedWithAny = {
    data?: DeepObject | SimpleObject | any | undefined;
};

/** @internal */
export const InfectedWithAnyData$inboundSchema: z.ZodType<
    InfectedWithAnyData,
    z.ZodTypeDef,
    unknown
> = z.union([DeepObject$inboundSchema, SimpleObject$inboundSchema, z.any()]);

/** @internal */
export type InfectedWithAnyData$Outbound = DeepObject$Outbound | SimpleObject$Outbound | any;

/** @internal */
export const InfectedWithAnyData$outboundSchema: z.ZodType<
    InfectedWithAnyData$Outbound,
    z.ZodTypeDef,
    InfectedWithAnyData
> = z.union([DeepObject$outboundSchema, SimpleObject$outboundSchema, z.any()]);

/**
 * @internal
 * @deprecated This namespace will be removed in future versions. Use schemas and types that are exported directly from this module.
 */
export namespace InfectedWithAnyData$ {
    /** @deprecated use `InfectedWithAnyData$inboundSchema` instead. */
    export const inboundSchema = InfectedWithAnyData$inboundSchema;
    /** @deprecated use `InfectedWithAnyData$outboundSchema` instead. */
    export const outboundSchema = InfectedWithAnyData$outboundSchema;
    /** @deprecated use `InfectedWithAnyData$Outbound` instead. */
    export type Outbound = InfectedWithAnyData$Outbound;
}

/** @internal */
export const InfectedWithAny$inboundSchema: z.ZodType<InfectedWithAny, z.ZodTypeDef, unknown> =
    z.object({
        data: z.union([DeepObject$inboundSchema, SimpleObject$inboundSchema, z.any()]).optional(),
    });

/** @internal */
export type InfectedWithAny$Outbound = {
    data?: DeepObject$Outbound | SimpleObject$Outbound | any | undefined;
};

/** @internal */
export const InfectedWithAny$outboundSchema: z.ZodType<
    InfectedWithAny$Outbound,
    z.ZodTypeDef,
    InfectedWithAny
> = z.object({
    data: z.union([DeepObject$outboundSchema, SimpleObject$outboundSchema, z.any()]).optional(),
});

/**
 * @internal
 * @deprecated This namespace will be removed in future versions. Use schemas and types that are exported directly from this module.
 */
export namespace InfectedWithAny$ {
    /** @deprecated use `InfectedWithAny$inboundSchema` instead. */
    export const inboundSchema = InfectedWithAny$inboundSchema;
    /** @deprecated use `InfectedWithAny$outboundSchema` instead. */
    export const outboundSchema = InfectedWithAny$outboundSchema;
    /** @deprecated use `InfectedWithAny$Outbound` instead. */
    export type Outbound = InfectedWithAny$Outbound;
}