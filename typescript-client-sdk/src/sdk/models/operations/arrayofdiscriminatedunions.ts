/*
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

import * as z from "zod";
import { safeParse } from "../../../lib/schemas.js";
import { Result as SafeParseResult } from "../../types/fp.js";
import { SDKValidationError } from "../errors/sdkvalidationerror.js";
import * as shared from "../shared/index.js";

/**
 * OK
 */
export type ArrayOfDiscriminatedUnionsRes = {
  json: Array<shared.StronglyTypedOneOfObject>;
};

/** @internal */
export const ArrayOfDiscriminatedUnionsRes$inboundSchema: z.ZodType<
  ArrayOfDiscriminatedUnionsRes,
  z.ZodTypeDef,
  unknown
> = z.object({
  json: z.array(shared.StronglyTypedOneOfObject$inboundSchema),
});

/** @internal */
export type ArrayOfDiscriminatedUnionsRes$Outbound = {
  json: Array<shared.StronglyTypedOneOfObject$Outbound>;
};

/** @internal */
export const ArrayOfDiscriminatedUnionsRes$outboundSchema: z.ZodType<
  ArrayOfDiscriminatedUnionsRes$Outbound,
  z.ZodTypeDef,
  ArrayOfDiscriminatedUnionsRes
> = z.object({
  json: z.array(shared.StronglyTypedOneOfObject$outboundSchema),
});

/**
 * @internal
 * @deprecated This namespace will be removed in future versions. Use schemas and types that are exported directly from this module.
 */
export namespace ArrayOfDiscriminatedUnionsRes$ {
  /** @deprecated use `ArrayOfDiscriminatedUnionsRes$inboundSchema` instead. */
  export const inboundSchema = ArrayOfDiscriminatedUnionsRes$inboundSchema;
  /** @deprecated use `ArrayOfDiscriminatedUnionsRes$outboundSchema` instead. */
  export const outboundSchema = ArrayOfDiscriminatedUnionsRes$outboundSchema;
  /** @deprecated use `ArrayOfDiscriminatedUnionsRes$Outbound` instead. */
  export type Outbound = ArrayOfDiscriminatedUnionsRes$Outbound;
}

export function arrayOfDiscriminatedUnionsResToJSON(
  arrayOfDiscriminatedUnionsRes: ArrayOfDiscriminatedUnionsRes,
): string {
  return JSON.stringify(
    ArrayOfDiscriminatedUnionsRes$outboundSchema.parse(
      arrayOfDiscriminatedUnionsRes,
    ),
  );
}

export function arrayOfDiscriminatedUnionsResFromJSON(
  jsonString: string,
): SafeParseResult<ArrayOfDiscriminatedUnionsRes, SDKValidationError> {
  return safeParse(
    jsonString,
    (x) => ArrayOfDiscriminatedUnionsRes$inboundSchema.parse(JSON.parse(x)),
    `Failed to parse 'ArrayOfDiscriminatedUnionsRes' from JSON`,
  );
}