/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import * as z from "zod";

export type OneOfPrimitives = boolean | string;

/** @internal */
export namespace OneOfPrimitives$ {
    export const inboundSchema: z.ZodType<OneOfPrimitives, z.ZodTypeDef, unknown> = z.union([
        z.boolean(),
        z.string(),
    ]);

    export type Outbound = boolean | string;
    export const outboundSchema: z.ZodType<Outbound, z.ZodTypeDef, OneOfPrimitives> = z.union([
        z.boolean(),
        z.string(),
    ]);
}