/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import { remap as remap$ } from "../../../lib/primitives.js";
import * as shared from "../shared/index.js";
import * as z from "zod";

export type DeepObjectQueryParamsDeepObjectRequest = {
    /**
     * deepObject style query parameter serialization is undefined for arrays or nested objects by the specification:
     *
     * @remarks
     *    https://github.com/OAI/OpenAPI-Specification/issues/1706
     * This schema covers the intended implementation cases rather than the fully complex deepObject schema.
     *
     */
    deepObj: shared.DeepObjectQueryParams;
};

export type DeepObjectQueryParamsDeepObjectArgs = {
    deepObjArr: Array<string>;
    deepObjBool: string;
    deepObjInt: string;
    deepObjMapTestkey1: string;
    deepObjMapTestkey2: string;
    deepObjNum: string;
    deepObjObjAny: string;
    deepObjObjBigintStr: string;
    deepObjObjBigint: string;
    deepObjObjBoolOpt: string;
    deepObjObjBool: string;
    deepObjObjDateTime: string;
    deepObjObjDate: string;
    deepObjObjDecimalStr: string;
    deepObjObjDecimal: string;
    deepObjObjEnum: string;
    deepObjObjFloat32: string;
    deepObjObjFloat64Str?: string | undefined;
    deepObjObjInt32Enum: string;
    deepObjObjInt32: string;
    deepObjObjInt64Str?: string | undefined;
    deepObjObjIntEnum: string;
    deepObjObjInt: string;
    deepObjObjNum: string;
    deepObjObjStrOpt: string;
    deepObjObjStr: string;
    deepObjStr: string;
};

/**
 * OK
 */
export type DeepObjectQueryParamsDeepObjectRes = {
    args: DeepObjectQueryParamsDeepObjectArgs;
    url: string;
};

/** @internal */
export const DeepObjectQueryParamsDeepObjectRequest$inboundSchema: z.ZodType<
    DeepObjectQueryParamsDeepObjectRequest,
    z.ZodTypeDef,
    unknown
> = z.object({
    deepObj: shared.DeepObjectQueryParams$inboundSchema,
});

/** @internal */
export type DeepObjectQueryParamsDeepObjectRequest$Outbound = {
    deepObj: shared.DeepObjectQueryParams$Outbound;
};

/** @internal */
export const DeepObjectQueryParamsDeepObjectRequest$outboundSchema: z.ZodType<
    DeepObjectQueryParamsDeepObjectRequest$Outbound,
    z.ZodTypeDef,
    DeepObjectQueryParamsDeepObjectRequest
> = z.object({
    deepObj: shared.DeepObjectQueryParams$outboundSchema,
});

/**
 * @internal
 * @deprecated This namespace will be removed in future versions. Use schemas and types that are exported directly from this module.
 */
export namespace DeepObjectQueryParamsDeepObjectRequest$ {
    /** @deprecated use `DeepObjectQueryParamsDeepObjectRequest$inboundSchema` instead. */
    export const inboundSchema = DeepObjectQueryParamsDeepObjectRequest$inboundSchema;
    /** @deprecated use `DeepObjectQueryParamsDeepObjectRequest$outboundSchema` instead. */
    export const outboundSchema = DeepObjectQueryParamsDeepObjectRequest$outboundSchema;
    /** @deprecated use `DeepObjectQueryParamsDeepObjectRequest$Outbound` instead. */
    export type Outbound = DeepObjectQueryParamsDeepObjectRequest$Outbound;
}

/** @internal */
export const DeepObjectQueryParamsDeepObjectArgs$inboundSchema: z.ZodType<
    DeepObjectQueryParamsDeepObjectArgs,
    z.ZodTypeDef,
    unknown
> = z
    .object({
        "deepObj[arr]": z.array(z.string()),
        "deepObj[bool]": z.string(),
        "deepObj[int]": z.string(),
        "deepObj[map][testkey1]": z.string(),
        "deepObj[map][testkey2]": z.string(),
        "deepObj[num]": z.string(),
        "deepObj[obj][any]": z.string(),
        "deepObj[obj][bigintStr]": z.string(),
        "deepObj[obj][bigint]": z.string(),
        "deepObj[obj][boolOpt]": z.string(),
        "deepObj[obj][bool]": z.string(),
        "deepObj[obj][dateTime]": z.string(),
        "deepObj[obj][date]": z.string(),
        "deepObj[obj][decimalStr]": z.string(),
        "deepObj[obj][decimal]": z.string(),
        "deepObj[obj][enum]": z.string(),
        "deepObj[obj][float32]": z.string(),
        "deepObj[obj][float64Str]": z.string().optional(),
        "deepObj[obj][int32Enum]": z.string(),
        "deepObj[obj][int32]": z.string(),
        "deepObj[obj][int64Str]": z.string().optional(),
        "deepObj[obj][intEnum]": z.string(),
        "deepObj[obj][int]": z.string(),
        "deepObj[obj][num]": z.string(),
        "deepObj[obj][strOpt]": z.string(),
        "deepObj[obj][str]": z.string(),
        "deepObj[str]": z.string(),
    })
    .transform((v) => {
        return remap$(v, {
            "deepObj[arr]": "deepObjArr",
            "deepObj[bool]": "deepObjBool",
            "deepObj[int]": "deepObjInt",
            "deepObj[map][testkey1]": "deepObjMapTestkey1",
            "deepObj[map][testkey2]": "deepObjMapTestkey2",
            "deepObj[num]": "deepObjNum",
            "deepObj[obj][any]": "deepObjObjAny",
            "deepObj[obj][bigintStr]": "deepObjObjBigintStr",
            "deepObj[obj][bigint]": "deepObjObjBigint",
            "deepObj[obj][boolOpt]": "deepObjObjBoolOpt",
            "deepObj[obj][bool]": "deepObjObjBool",
            "deepObj[obj][dateTime]": "deepObjObjDateTime",
            "deepObj[obj][date]": "deepObjObjDate",
            "deepObj[obj][decimalStr]": "deepObjObjDecimalStr",
            "deepObj[obj][decimal]": "deepObjObjDecimal",
            "deepObj[obj][enum]": "deepObjObjEnum",
            "deepObj[obj][float32]": "deepObjObjFloat32",
            "deepObj[obj][float64Str]": "deepObjObjFloat64Str",
            "deepObj[obj][int32Enum]": "deepObjObjInt32Enum",
            "deepObj[obj][int32]": "deepObjObjInt32",
            "deepObj[obj][int64Str]": "deepObjObjInt64Str",
            "deepObj[obj][intEnum]": "deepObjObjIntEnum",
            "deepObj[obj][int]": "deepObjObjInt",
            "deepObj[obj][num]": "deepObjObjNum",
            "deepObj[obj][strOpt]": "deepObjObjStrOpt",
            "deepObj[obj][str]": "deepObjObjStr",
            "deepObj[str]": "deepObjStr",
        });
    });

/** @internal */
export type DeepObjectQueryParamsDeepObjectArgs$Outbound = {
    "deepObj[arr]": Array<string>;
    "deepObj[bool]": string;
    "deepObj[int]": string;
    "deepObj[map][testkey1]": string;
    "deepObj[map][testkey2]": string;
    "deepObj[num]": string;
    "deepObj[obj][any]": string;
    "deepObj[obj][bigintStr]": string;
    "deepObj[obj][bigint]": string;
    "deepObj[obj][boolOpt]": string;
    "deepObj[obj][bool]": string;
    "deepObj[obj][dateTime]": string;
    "deepObj[obj][date]": string;
    "deepObj[obj][decimalStr]": string;
    "deepObj[obj][decimal]": string;
    "deepObj[obj][enum]": string;
    "deepObj[obj][float32]": string;
    "deepObj[obj][float64Str]"?: string | undefined;
    "deepObj[obj][int32Enum]": string;
    "deepObj[obj][int32]": string;
    "deepObj[obj][int64Str]"?: string | undefined;
    "deepObj[obj][intEnum]": string;
    "deepObj[obj][int]": string;
    "deepObj[obj][num]": string;
    "deepObj[obj][strOpt]": string;
    "deepObj[obj][str]": string;
    "deepObj[str]": string;
};

/** @internal */
export const DeepObjectQueryParamsDeepObjectArgs$outboundSchema: z.ZodType<
    DeepObjectQueryParamsDeepObjectArgs$Outbound,
    z.ZodTypeDef,
    DeepObjectQueryParamsDeepObjectArgs
> = z
    .object({
        deepObjArr: z.array(z.string()),
        deepObjBool: z.string(),
        deepObjInt: z.string(),
        deepObjMapTestkey1: z.string(),
        deepObjMapTestkey2: z.string(),
        deepObjNum: z.string(),
        deepObjObjAny: z.string(),
        deepObjObjBigintStr: z.string(),
        deepObjObjBigint: z.string(),
        deepObjObjBoolOpt: z.string(),
        deepObjObjBool: z.string(),
        deepObjObjDateTime: z.string(),
        deepObjObjDate: z.string(),
        deepObjObjDecimalStr: z.string(),
        deepObjObjDecimal: z.string(),
        deepObjObjEnum: z.string(),
        deepObjObjFloat32: z.string(),
        deepObjObjFloat64Str: z.string().optional(),
        deepObjObjInt32Enum: z.string(),
        deepObjObjInt32: z.string(),
        deepObjObjInt64Str: z.string().optional(),
        deepObjObjIntEnum: z.string(),
        deepObjObjInt: z.string(),
        deepObjObjNum: z.string(),
        deepObjObjStrOpt: z.string(),
        deepObjObjStr: z.string(),
        deepObjStr: z.string(),
    })
    .transform((v) => {
        return remap$(v, {
            deepObjArr: "deepObj[arr]",
            deepObjBool: "deepObj[bool]",
            deepObjInt: "deepObj[int]",
            deepObjMapTestkey1: "deepObj[map][testkey1]",
            deepObjMapTestkey2: "deepObj[map][testkey2]",
            deepObjNum: "deepObj[num]",
            deepObjObjAny: "deepObj[obj][any]",
            deepObjObjBigintStr: "deepObj[obj][bigintStr]",
            deepObjObjBigint: "deepObj[obj][bigint]",
            deepObjObjBoolOpt: "deepObj[obj][boolOpt]",
            deepObjObjBool: "deepObj[obj][bool]",
            deepObjObjDateTime: "deepObj[obj][dateTime]",
            deepObjObjDate: "deepObj[obj][date]",
            deepObjObjDecimalStr: "deepObj[obj][decimalStr]",
            deepObjObjDecimal: "deepObj[obj][decimal]",
            deepObjObjEnum: "deepObj[obj][enum]",
            deepObjObjFloat32: "deepObj[obj][float32]",
            deepObjObjFloat64Str: "deepObj[obj][float64Str]",
            deepObjObjInt32Enum: "deepObj[obj][int32Enum]",
            deepObjObjInt32: "deepObj[obj][int32]",
            deepObjObjInt64Str: "deepObj[obj][int64Str]",
            deepObjObjIntEnum: "deepObj[obj][intEnum]",
            deepObjObjInt: "deepObj[obj][int]",
            deepObjObjNum: "deepObj[obj][num]",
            deepObjObjStrOpt: "deepObj[obj][strOpt]",
            deepObjObjStr: "deepObj[obj][str]",
            deepObjStr: "deepObj[str]",
        });
    });

/**
 * @internal
 * @deprecated This namespace will be removed in future versions. Use schemas and types that are exported directly from this module.
 */
export namespace DeepObjectQueryParamsDeepObjectArgs$ {
    /** @deprecated use `DeepObjectQueryParamsDeepObjectArgs$inboundSchema` instead. */
    export const inboundSchema = DeepObjectQueryParamsDeepObjectArgs$inboundSchema;
    /** @deprecated use `DeepObjectQueryParamsDeepObjectArgs$outboundSchema` instead. */
    export const outboundSchema = DeepObjectQueryParamsDeepObjectArgs$outboundSchema;
    /** @deprecated use `DeepObjectQueryParamsDeepObjectArgs$Outbound` instead. */
    export type Outbound = DeepObjectQueryParamsDeepObjectArgs$Outbound;
}

/** @internal */
export const DeepObjectQueryParamsDeepObjectRes$inboundSchema: z.ZodType<
    DeepObjectQueryParamsDeepObjectRes,
    z.ZodTypeDef,
    unknown
> = z.object({
    args: z.lazy(() => DeepObjectQueryParamsDeepObjectArgs$inboundSchema),
    url: z.string(),
});

/** @internal */
export type DeepObjectQueryParamsDeepObjectRes$Outbound = {
    args: DeepObjectQueryParamsDeepObjectArgs$Outbound;
    url: string;
};

/** @internal */
export const DeepObjectQueryParamsDeepObjectRes$outboundSchema: z.ZodType<
    DeepObjectQueryParamsDeepObjectRes$Outbound,
    z.ZodTypeDef,
    DeepObjectQueryParamsDeepObjectRes
> = z.object({
    args: z.lazy(() => DeepObjectQueryParamsDeepObjectArgs$outboundSchema),
    url: z.string(),
});

/**
 * @internal
 * @deprecated This namespace will be removed in future versions. Use schemas and types that are exported directly from this module.
 */
export namespace DeepObjectQueryParamsDeepObjectRes$ {
    /** @deprecated use `DeepObjectQueryParamsDeepObjectRes$inboundSchema` instead. */
    export const inboundSchema = DeepObjectQueryParamsDeepObjectRes$inboundSchema;
    /** @deprecated use `DeepObjectQueryParamsDeepObjectRes$outboundSchema` instead. */
    export const outboundSchema = DeepObjectQueryParamsDeepObjectRes$outboundSchema;
    /** @deprecated use `DeepObjectQueryParamsDeepObjectRes$Outbound` instead. */
    export type Outbound = DeepObjectQueryParamsDeepObjectRes$Outbound;
}