/*
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

import * as z from "zod";
import { remap as remap$ } from "../../../lib/primitives.js";
import { safeParse } from "../../../lib/schemas.js";
import { Result as SafeParseResult } from "../../types/fp.js";
import { SDKValidationError } from "../errors/sdkvalidationerror.js";

/**
 * A set of strings with kebob case fieldnames that lead to relevant examples being generated for them
 */
export type FakerKebobCasePropertyNameStrings = {
  postalCode: string;
};

/** @internal */
export const FakerKebobCasePropertyNameStrings$inboundSchema: z.ZodType<
  FakerKebobCasePropertyNameStrings,
  z.ZodTypeDef,
  unknown
> = z.object({
  "postal-code": z.string(),
}).transform((v) => {
  return remap$(v, {
    "postal-code": "postalCode",
  });
});

/** @internal */
export type FakerKebobCasePropertyNameStrings$Outbound = {
  "postal-code": string;
};

/** @internal */
export const FakerKebobCasePropertyNameStrings$outboundSchema: z.ZodType<
  FakerKebobCasePropertyNameStrings$Outbound,
  z.ZodTypeDef,
  FakerKebobCasePropertyNameStrings
> = z.object({
  postalCode: z.string(),
}).transform((v) => {
  return remap$(v, {
    postalCode: "postal-code",
  });
});

/**
 * @internal
 * @deprecated This namespace will be removed in future versions. Use schemas and types that are exported directly from this module.
 */
export namespace FakerKebobCasePropertyNameStrings$ {
  /** @deprecated use `FakerKebobCasePropertyNameStrings$inboundSchema` instead. */
  export const inboundSchema = FakerKebobCasePropertyNameStrings$inboundSchema;
  /** @deprecated use `FakerKebobCasePropertyNameStrings$outboundSchema` instead. */
  export const outboundSchema =
    FakerKebobCasePropertyNameStrings$outboundSchema;
  /** @deprecated use `FakerKebobCasePropertyNameStrings$Outbound` instead. */
  export type Outbound = FakerKebobCasePropertyNameStrings$Outbound;
}

export function fakerKebobCasePropertyNameStringsToJSON(
  fakerKebobCasePropertyNameStrings: FakerKebobCasePropertyNameStrings,
): string {
  return JSON.stringify(
    FakerKebobCasePropertyNameStrings$outboundSchema.parse(
      fakerKebobCasePropertyNameStrings,
    ),
  );
}

export function fakerKebobCasePropertyNameStringsFromJSON(
  jsonString: string,
): SafeParseResult<FakerKebobCasePropertyNameStrings, SDKValidationError> {
  return safeParse(
    jsonString,
    (x) => FakerKebobCasePropertyNameStrings$inboundSchema.parse(JSON.parse(x)),
    `Failed to parse 'FakerKebobCasePropertyNameStrings' from JSON`,
  );
}