/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import { ClosedEnum } from "../../types/enums.js";
import * as z from "zod";

export const Tag = {
    Tag1: "tag1",
} as const;
export type Tag = ClosedEnum<typeof Tag>;

export type TaggedError1Data = {
    error: string;
    tag: Tag;
};

export class TaggedError1 extends Error {
    error: string;
    tag: Tag;

    /** The original data that was passed to this error instance. */
    data$: TaggedError1Data;

    constructor(err: TaggedError1Data) {
        const message =
            "message" in err && typeof err.message === "string"
                ? err.message
                : `API error occurred: ${JSON.stringify(err)}`;
        super(message);
        this.data$ = err;

        this.error = err.error;
        this.tag = err.tag;

        this.name = "TaggedError1";
    }
}

/** @internal */
export const Tag$inboundSchema: z.ZodNativeEnum<typeof Tag> = z.nativeEnum(Tag);

/** @internal */
export const Tag$outboundSchema: z.ZodNativeEnum<typeof Tag> = Tag$inboundSchema;

/**
 * @internal
 * @deprecated This namespace will be removed in future versions. Use schemas and types that are exported directly from this module.
 */
export namespace Tag$ {
    /** @deprecated use `Tag$inboundSchema` instead. */
    export const inboundSchema = Tag$inboundSchema;
    /** @deprecated use `Tag$outboundSchema` instead. */
    export const outboundSchema = Tag$outboundSchema;
}

/** @internal */
export const TaggedError1$inboundSchema: z.ZodType<TaggedError1, z.ZodTypeDef, unknown> = z
    .object({
        error: z.string(),
        tag: Tag$inboundSchema,
    })
    .transform((v) => {
        return new TaggedError1(v);
    });

/** @internal */
export type TaggedError1$Outbound = {
    error: string;
    tag: string;
};

/** @internal */
export const TaggedError1$outboundSchema: z.ZodType<
    TaggedError1$Outbound,
    z.ZodTypeDef,
    TaggedError1
> = z
    .instanceof(TaggedError1)
    .transform((v) => v.data$)
    .pipe(
        z.object({
            error: z.string(),
            tag: Tag$outboundSchema,
        })
    );

/**
 * @internal
 * @deprecated This namespace will be removed in future versions. Use schemas and types that are exported directly from this module.
 */
export namespace TaggedError1$ {
    /** @deprecated use `TaggedError1$inboundSchema` instead. */
    export const inboundSchema = TaggedError1$inboundSchema;
    /** @deprecated use `TaggedError1$outboundSchema` instead. */
    export const outboundSchema = TaggedError1$outboundSchema;
    /** @deprecated use `TaggedError1$Outbound` instead. */
    export type Outbound = TaggedError1$Outbound;
}