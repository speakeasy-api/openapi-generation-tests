/*
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

import * as z from "zod";

export type ConstObject2 = {
    profileId: string;
    tag?: "tag2" | undefined;
};

/** @internal */
export const ConstObject2$inboundSchema: z.ZodType<ConstObject2, z.ZodTypeDef, unknown> = z.object({
    profileId: z.string(),
    tag: z.literal("tag2").optional(),
});

/** @internal */
export type ConstObject2$Outbound = {
    profileId: string;
    tag: "tag2";
};

/** @internal */
export const ConstObject2$outboundSchema: z.ZodType<
    ConstObject2$Outbound,
    z.ZodTypeDef,
    ConstObject2
> = z.object({
    profileId: z.string(),
    tag: z.literal("tag2").default("tag2" as const),
});

/**
 * @internal
 * @deprecated This namespace will be removed in future versions. Use schemas and types that are exported directly from this module.
 */
export namespace ConstObject2$ {
    /** @deprecated use `ConstObject2$inboundSchema` instead. */
    export const inboundSchema = ConstObject2$inboundSchema;
    /** @deprecated use `ConstObject2$outboundSchema` instead. */
    export const outboundSchema = ConstObject2$outboundSchema;
    /** @deprecated use `ConstObject2$Outbound` instead. */
    export type Outbound = ConstObject2$Outbound;
}