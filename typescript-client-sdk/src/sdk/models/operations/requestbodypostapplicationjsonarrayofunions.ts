/*
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

import * as z from "zod";
import { RFCDate } from "../../types/rfcdate.js";
import * as shared from "../shared/index.js";

export const RequestBodyPostApplicationJsonArrayOfUnionsServerList = [
  "http://localhost:35456",
] as const;

export type RequestBodyPostApplicationJsonArrayOfUnionsRequestBody = {
  dates: Array<RFCDate>;
  unions: Array<shared.TypedObjectOneOf>;
};

/** @internal */
export const RequestBodyPostApplicationJsonArrayOfUnionsRequestBody$inboundSchema:
  z.ZodType<
    RequestBodyPostApplicationJsonArrayOfUnionsRequestBody,
    z.ZodTypeDef,
    unknown
  > = z.object({
    dates: z.array(z.string().transform(v => new RFCDate(v))),
    unions: z.array(shared.TypedObjectOneOf$inboundSchema),
  });

/** @internal */
export type RequestBodyPostApplicationJsonArrayOfUnionsRequestBody$Outbound = {
  dates: Array<string>;
  unions: Array<shared.TypedObjectOneOf$Outbound>;
};

/** @internal */
export const RequestBodyPostApplicationJsonArrayOfUnionsRequestBody$outboundSchema:
  z.ZodType<
    RequestBodyPostApplicationJsonArrayOfUnionsRequestBody$Outbound,
    z.ZodTypeDef,
    RequestBodyPostApplicationJsonArrayOfUnionsRequestBody
  > = z.object({
    dates: z.array(z.instanceof(RFCDate).transform(v => v.toString())),
    unions: z.array(shared.TypedObjectOneOf$outboundSchema),
  });

/**
 * @internal
 * @deprecated This namespace will be removed in future versions. Use schemas and types that are exported directly from this module.
 */
export namespace RequestBodyPostApplicationJsonArrayOfUnionsRequestBody$ {
  /** @deprecated use `RequestBodyPostApplicationJsonArrayOfUnionsRequestBody$inboundSchema` instead. */
  export const inboundSchema =
    RequestBodyPostApplicationJsonArrayOfUnionsRequestBody$inboundSchema;
  /** @deprecated use `RequestBodyPostApplicationJsonArrayOfUnionsRequestBody$outboundSchema` instead. */
  export const outboundSchema =
    RequestBodyPostApplicationJsonArrayOfUnionsRequestBody$outboundSchema;
  /** @deprecated use `RequestBodyPostApplicationJsonArrayOfUnionsRequestBody$Outbound` instead. */
  export type Outbound =
    RequestBodyPostApplicationJsonArrayOfUnionsRequestBody$Outbound;
}