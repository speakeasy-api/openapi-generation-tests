/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import * as z from "zod";

/**
 * Created
 */
export type FlattenedUnionResponseResponseBodiesResponseBody = {
    message: string;
};

/**
 * OK
 */
export type FlattenedUnionResponseResponseBody = {
    message: string;
};

export type FlattenedUnionResponseResponse = {
    /**
     * OK
     */
    twoHundredApplicationJsonObject?: FlattenedUnionResponseResponseBody | undefined;
    /**
     * Created
     */
    twoHundredAndOneApplicationJsonObject?:
        | FlattenedUnionResponseResponseBodiesResponseBody
        | undefined;
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
};

/** @internal */
export namespace FlattenedUnionResponseResponseBodiesResponseBody$ {
    export const inboundSchema: z.ZodType<
        FlattenedUnionResponseResponseBodiesResponseBody,
        z.ZodTypeDef,
        unknown
    > = z
        .object({
            message: z.string(),
        })
        .transform((v) => {
            return {
                message: v.message,
            };
        });

    export type Outbound = {
        message: string;
    };

    export const outboundSchema: z.ZodType<
        Outbound,
        z.ZodTypeDef,
        FlattenedUnionResponseResponseBodiesResponseBody
    > = z
        .object({
            message: z.string(),
        })
        .transform((v) => {
            return {
                message: v.message,
            };
        });
}

/** @internal */
export namespace FlattenedUnionResponseResponseBody$ {
    export const inboundSchema: z.ZodType<
        FlattenedUnionResponseResponseBody,
        z.ZodTypeDef,
        unknown
    > = z
        .object({
            message: z.string(),
        })
        .transform((v) => {
            return {
                message: v.message,
            };
        });

    export type Outbound = {
        message: string;
    };

    export const outboundSchema: z.ZodType<
        Outbound,
        z.ZodTypeDef,
        FlattenedUnionResponseResponseBody
    > = z
        .object({
            message: z.string(),
        })
        .transform((v) => {
            return {
                message: v.message,
            };
        });
}

/** @internal */
export namespace FlattenedUnionResponseResponse$ {
    export const inboundSchema: z.ZodType<FlattenedUnionResponseResponse, z.ZodTypeDef, unknown> = z
        .object({
            "200_application/json_object": z
                .lazy(() => FlattenedUnionResponseResponseBody$.inboundSchema)
                .optional(),
            "201_application/json_object": z
                .lazy(() => FlattenedUnionResponseResponseBodiesResponseBody$.inboundSchema)
                .optional(),
            ContentType: z.string(),
            StatusCode: z.number().int(),
            RawResponse: z.instanceof(Response),
        })
        .transform((v) => {
            return {
                ...(v["200_application/json_object"] === undefined
                    ? null
                    : { twoHundredApplicationJsonObject: v["200_application/json_object"] }),
                ...(v["201_application/json_object"] === undefined
                    ? null
                    : { twoHundredAndOneApplicationJsonObject: v["201_application/json_object"] }),
                contentType: v.ContentType,
                statusCode: v.StatusCode,
                rawResponse: v.RawResponse,
            };
        });

    export type Outbound = {
        "200_application/json_object"?: FlattenedUnionResponseResponseBody$.Outbound | undefined;
        "201_application/json_object"?:
            | FlattenedUnionResponseResponseBodiesResponseBody$.Outbound
            | undefined;
        ContentType: string;
        StatusCode: number;
        RawResponse: never;
    };

    export const outboundSchema: z.ZodType<Outbound, z.ZodTypeDef, FlattenedUnionResponseResponse> =
        z
            .object({
                twoHundredApplicationJsonObject: z
                    .lazy(() => FlattenedUnionResponseResponseBody$.outboundSchema)
                    .optional(),
                twoHundredAndOneApplicationJsonObject: z
                    .lazy(() => FlattenedUnionResponseResponseBodiesResponseBody$.outboundSchema)
                    .optional(),
                contentType: z.string(),
                statusCode: z.number().int(),
                rawResponse: z.instanceof(Response).transform(() => {
                    throw new Error("Response cannot be serialized");
                }),
            })
            .transform((v) => {
                return {
                    ...(v.twoHundredApplicationJsonObject === undefined
                        ? null
                        : { "200_application/json_object": v.twoHundredApplicationJsonObject }),
                    ...(v.twoHundredAndOneApplicationJsonObject === undefined
                        ? null
                        : {
                              "201_application/json_object":
                                  v.twoHundredAndOneApplicationJsonObject,
                          }),
                    ContentType: v.contentType,
                    StatusCode: v.statusCode,
                    RawResponse: v.rawResponse,
                };
            });
}