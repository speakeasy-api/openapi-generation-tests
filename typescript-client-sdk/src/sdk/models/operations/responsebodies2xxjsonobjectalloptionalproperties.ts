/*
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

import * as z from "zod";
import { safeParse } from "../../../lib/schemas.js";
import { Result as SafeParseResult } from "../../types/fp.js";
import { SDKValidationError } from "../errors/sdkvalidationerror.js";

/**
 * OK
 */
export type ResponseBodies2xxJSONObjectAllOptionalPropertiesResponseBody = {
  data?: string | undefined;
};

/** @internal */
export const ResponseBodies2xxJSONObjectAllOptionalPropertiesResponseBody$inboundSchema:
  z.ZodType<
    ResponseBodies2xxJSONObjectAllOptionalPropertiesResponseBody,
    z.ZodTypeDef,
    unknown
  > = z.object({
    data: z.string().optional(),
  });

/** @internal */
export type ResponseBodies2xxJSONObjectAllOptionalPropertiesResponseBody$Outbound =
  {
    data?: string | undefined;
  };

/** @internal */
export const ResponseBodies2xxJSONObjectAllOptionalPropertiesResponseBody$outboundSchema:
  z.ZodType<
    ResponseBodies2xxJSONObjectAllOptionalPropertiesResponseBody$Outbound,
    z.ZodTypeDef,
    ResponseBodies2xxJSONObjectAllOptionalPropertiesResponseBody
  > = z.object({
    data: z.string().optional(),
  });

/**
 * @internal
 * @deprecated This namespace will be removed in future versions. Use schemas and types that are exported directly from this module.
 */
export namespace ResponseBodies2xxJSONObjectAllOptionalPropertiesResponseBody$ {
  /** @deprecated use `ResponseBodies2xxJSONObjectAllOptionalPropertiesResponseBody$inboundSchema` instead. */
  export const inboundSchema =
    ResponseBodies2xxJSONObjectAllOptionalPropertiesResponseBody$inboundSchema;
  /** @deprecated use `ResponseBodies2xxJSONObjectAllOptionalPropertiesResponseBody$outboundSchema` instead. */
  export const outboundSchema =
    ResponseBodies2xxJSONObjectAllOptionalPropertiesResponseBody$outboundSchema;
  /** @deprecated use `ResponseBodies2xxJSONObjectAllOptionalPropertiesResponseBody$Outbound` instead. */
  export type Outbound =
    ResponseBodies2xxJSONObjectAllOptionalPropertiesResponseBody$Outbound;
}

export function responseBodies2xxJSONObjectAllOptionalPropertiesResponseBodyToJSON(
  responseBodies2xxJSONObjectAllOptionalPropertiesResponseBody:
    ResponseBodies2xxJSONObjectAllOptionalPropertiesResponseBody,
): string {
  return JSON.stringify(
    ResponseBodies2xxJSONObjectAllOptionalPropertiesResponseBody$outboundSchema
      .parse(responseBodies2xxJSONObjectAllOptionalPropertiesResponseBody),
  );
}

export function responseBodies2xxJSONObjectAllOptionalPropertiesResponseBodyFromJSON(
  jsonString: string,
): SafeParseResult<
  ResponseBodies2xxJSONObjectAllOptionalPropertiesResponseBody,
  SDKValidationError
> {
  return safeParse(
    jsonString,
    (x) =>
      ResponseBodies2xxJSONObjectAllOptionalPropertiesResponseBody$inboundSchema
        .parse(JSON.parse(x)),
    `Failed to parse 'ResponseBodies2xxJSONObjectAllOptionalPropertiesResponseBody' from JSON`,
  );
}