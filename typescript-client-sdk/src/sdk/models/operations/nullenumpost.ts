/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import * as shared from "../../../sdk/models/shared";
import { z } from "zod";

/**
 * OK
 */
export type NullEnumPostRes = {
    json: shared.ObjectWithNullEnums;
};

export type NullEnumPostResponse = {
    /**
     * HTTP response content type for this operation
     */
    contentType: string;
    /**
     * HTTP response status code for this operation
     */
    statusCode: number;
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    rawResponse: Response;
    /**
     * OK
     */
    res?: NullEnumPostRes | undefined;
};

/** @internal */
export namespace NullEnumPostRes$ {
    export type Inbound = {
        json: shared.ObjectWithNullEnums$.Inbound;
    };

    export const inboundSchema: z.ZodType<NullEnumPostRes, z.ZodTypeDef, Inbound> = z
        .object({
            json: shared.ObjectWithNullEnums$.inboundSchema,
        })
        .transform((v) => {
            return {
                json: v.json,
            };
        });

    export type Outbound = {
        json: shared.ObjectWithNullEnums$.Outbound;
    };

    export const outboundSchema: z.ZodType<Outbound, z.ZodTypeDef, NullEnumPostRes> = z
        .object({
            json: shared.ObjectWithNullEnums$.outboundSchema,
        })
        .transform((v) => {
            return {
                json: v.json,
            };
        });
}

/** @internal */
export namespace NullEnumPostResponse$ {
    export type Inbound = {
        ContentType: string;
        StatusCode: number;
        RawResponse: Response;
        res?: NullEnumPostRes$.Inbound | undefined;
    };

    export const inboundSchema: z.ZodType<NullEnumPostResponse, z.ZodTypeDef, Inbound> = z
        .object({
            ContentType: z.string(),
            StatusCode: z.number().int(),
            RawResponse: z.instanceof(Response),
            res: z.lazy(() => NullEnumPostRes$.inboundSchema).optional(),
        })
        .transform((v) => {
            return {
                contentType: v.ContentType,
                statusCode: v.StatusCode,
                rawResponse: v.RawResponse,
                ...(v.res === undefined ? null : { res: v.res }),
            };
        });

    export type Outbound = {
        ContentType: string;
        StatusCode: number;
        RawResponse: never;
        res?: NullEnumPostRes$.Outbound | undefined;
    };

    export const outboundSchema: z.ZodType<Outbound, z.ZodTypeDef, NullEnumPostResponse> = z
        .object({
            contentType: z.string(),
            statusCode: z.number().int(),
            rawResponse: z.instanceof(Response).transform(() => {
                throw new Error("Response cannot be serialized");
            }),
            res: z.lazy(() => NullEnumPostRes$.outboundSchema).optional(),
        })
        .transform((v) => {
            return {
                ContentType: v.contentType,
                StatusCode: v.statusCode,
                RawResponse: v.rawResponse,
                ...(v.res === undefined ? null : { res: v.res }),
            };
        });
}