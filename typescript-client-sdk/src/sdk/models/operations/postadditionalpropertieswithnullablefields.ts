/*
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

import * as z from "zod";
import { remap as remap$ } from "../../../lib/primitives.js";
import {
  collectExtraKeys as collectExtraKeys$,
  safeParse,
} from "../../../lib/schemas.js";
import { Result as SafeParseResult } from "../../types/fp.js";
import { SDKValidationError } from "../errors/sdkvalidationerror.js";

export type PostAdditionalPropertiesWithNullableFieldsRequestBody = {
  someCamelCase?: string | null | undefined;
  additionalProperties: { [k: string]: any };
};

/**
 * Ok
 */
export type PostAdditionalPropertiesWithNullableFieldsResponseBody = {
  json: { [k: string]: string };
};

/** @internal */
export const PostAdditionalPropertiesWithNullableFieldsRequestBody$inboundSchema:
  z.ZodType<
    PostAdditionalPropertiesWithNullableFieldsRequestBody,
    z.ZodTypeDef,
    unknown
  > = collectExtraKeys$(
    z.object({
      someCamelCase: z.nullable(z.string()).optional(),
    }).catchall(z.any()),
    "additionalProperties",
  );

/** @internal */
export type PostAdditionalPropertiesWithNullableFieldsRequestBody$Outbound = {
  someCamelCase?: string | null | undefined;
  [additionalProperties: string]: unknown;
};

/** @internal */
export const PostAdditionalPropertiesWithNullableFieldsRequestBody$outboundSchema:
  z.ZodType<
    PostAdditionalPropertiesWithNullableFieldsRequestBody$Outbound,
    z.ZodTypeDef,
    PostAdditionalPropertiesWithNullableFieldsRequestBody
  > = z.object({
    additionalProperties: z.record(z.any()),

    someCamelCase: z.nullable(z.string()).optional(),
  }).transform((v) => {
    return {
      ...v.additionalProperties,
      ...remap$(v, {
        additionalProperties: null,
      }),
    };
  });

/**
 * @internal
 * @deprecated This namespace will be removed in future versions. Use schemas and types that are exported directly from this module.
 */
export namespace PostAdditionalPropertiesWithNullableFieldsRequestBody$ {
  /** @deprecated use `PostAdditionalPropertiesWithNullableFieldsRequestBody$inboundSchema` instead. */
  export const inboundSchema =
    PostAdditionalPropertiesWithNullableFieldsRequestBody$inboundSchema;
  /** @deprecated use `PostAdditionalPropertiesWithNullableFieldsRequestBody$outboundSchema` instead. */
  export const outboundSchema =
    PostAdditionalPropertiesWithNullableFieldsRequestBody$outboundSchema;
  /** @deprecated use `PostAdditionalPropertiesWithNullableFieldsRequestBody$Outbound` instead. */
  export type Outbound =
    PostAdditionalPropertiesWithNullableFieldsRequestBody$Outbound;
}

export function postAdditionalPropertiesWithNullableFieldsRequestBodyToJSON(
  postAdditionalPropertiesWithNullableFieldsRequestBody:
    PostAdditionalPropertiesWithNullableFieldsRequestBody,
): string {
  return JSON.stringify(
    PostAdditionalPropertiesWithNullableFieldsRequestBody$outboundSchema.parse(
      postAdditionalPropertiesWithNullableFieldsRequestBody,
    ),
  );
}

export function postAdditionalPropertiesWithNullableFieldsRequestBodyFromJSON(
  jsonString: string,
): SafeParseResult<
  PostAdditionalPropertiesWithNullableFieldsRequestBody,
  SDKValidationError
> {
  return safeParse(
    jsonString,
    (x) =>
      PostAdditionalPropertiesWithNullableFieldsRequestBody$inboundSchema.parse(
        JSON.parse(x),
      ),
    `Failed to parse 'PostAdditionalPropertiesWithNullableFieldsRequestBody' from JSON`,
  );
}

/** @internal */
export const PostAdditionalPropertiesWithNullableFieldsResponseBody$inboundSchema:
  z.ZodType<
    PostAdditionalPropertiesWithNullableFieldsResponseBody,
    z.ZodTypeDef,
    unknown
  > = z.object({
    json: z.record(z.string()),
  });

/** @internal */
export type PostAdditionalPropertiesWithNullableFieldsResponseBody$Outbound = {
  json: { [k: string]: string };
};

/** @internal */
export const PostAdditionalPropertiesWithNullableFieldsResponseBody$outboundSchema:
  z.ZodType<
    PostAdditionalPropertiesWithNullableFieldsResponseBody$Outbound,
    z.ZodTypeDef,
    PostAdditionalPropertiesWithNullableFieldsResponseBody
  > = z.object({
    json: z.record(z.string()),
  });

/**
 * @internal
 * @deprecated This namespace will be removed in future versions. Use schemas and types that are exported directly from this module.
 */
export namespace PostAdditionalPropertiesWithNullableFieldsResponseBody$ {
  /** @deprecated use `PostAdditionalPropertiesWithNullableFieldsResponseBody$inboundSchema` instead. */
  export const inboundSchema =
    PostAdditionalPropertiesWithNullableFieldsResponseBody$inboundSchema;
  /** @deprecated use `PostAdditionalPropertiesWithNullableFieldsResponseBody$outboundSchema` instead. */
  export const outboundSchema =
    PostAdditionalPropertiesWithNullableFieldsResponseBody$outboundSchema;
  /** @deprecated use `PostAdditionalPropertiesWithNullableFieldsResponseBody$Outbound` instead. */
  export type Outbound =
    PostAdditionalPropertiesWithNullableFieldsResponseBody$Outbound;
}

export function postAdditionalPropertiesWithNullableFieldsResponseBodyToJSON(
  postAdditionalPropertiesWithNullableFieldsResponseBody:
    PostAdditionalPropertiesWithNullableFieldsResponseBody,
): string {
  return JSON.stringify(
    PostAdditionalPropertiesWithNullableFieldsResponseBody$outboundSchema.parse(
      postAdditionalPropertiesWithNullableFieldsResponseBody,
    ),
  );
}

export function postAdditionalPropertiesWithNullableFieldsResponseBodyFromJSON(
  jsonString: string,
): SafeParseResult<
  PostAdditionalPropertiesWithNullableFieldsResponseBody,
  SDKValidationError
> {
  return safeParse(
    jsonString,
    (x) =>
      PostAdditionalPropertiesWithNullableFieldsResponseBody$inboundSchema
        .parse(JSON.parse(x)),
    `Failed to parse 'PostAdditionalPropertiesWithNullableFieldsResponseBody' from JSON`,
  );
}