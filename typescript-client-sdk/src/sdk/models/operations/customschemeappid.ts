/*
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

import * as z from "zod";
import { safeParse } from "../../../lib/schemas.js";
import { Result as SafeParseResult } from "../../types/fp.js";
import { SDKValidationError } from "../errors/sdkvalidationerror.js";

export const CustomSchemeAppIdServerList = [
  "http://localhost:35456",
] as const;

export type CustomSchemeAppIdSecurity = {
  appId: string;
  secret: string;
};

/** @internal */
export const CustomSchemeAppIdSecurity$inboundSchema: z.ZodType<
  CustomSchemeAppIdSecurity,
  z.ZodTypeDef,
  unknown
> = z.object({
  appId: z.string(),
  secret: z.string(),
});

/** @internal */
export type CustomSchemeAppIdSecurity$Outbound = {
  appId: string;
  secret: string;
};

/** @internal */
export const CustomSchemeAppIdSecurity$outboundSchema: z.ZodType<
  CustomSchemeAppIdSecurity$Outbound,
  z.ZodTypeDef,
  CustomSchemeAppIdSecurity
> = z.object({
  appId: z.string(),
  secret: z.string(),
});

/**
 * @internal
 * @deprecated This namespace will be removed in future versions. Use schemas and types that are exported directly from this module.
 */
export namespace CustomSchemeAppIdSecurity$ {
  /** @deprecated use `CustomSchemeAppIdSecurity$inboundSchema` instead. */
  export const inboundSchema = CustomSchemeAppIdSecurity$inboundSchema;
  /** @deprecated use `CustomSchemeAppIdSecurity$outboundSchema` instead. */
  export const outboundSchema = CustomSchemeAppIdSecurity$outboundSchema;
  /** @deprecated use `CustomSchemeAppIdSecurity$Outbound` instead. */
  export type Outbound = CustomSchemeAppIdSecurity$Outbound;
}

export function customSchemeAppIdSecurityToJSON(
  customSchemeAppIdSecurity: CustomSchemeAppIdSecurity,
): string {
  return JSON.stringify(
    CustomSchemeAppIdSecurity$outboundSchema.parse(customSchemeAppIdSecurity),
  );
}

export function customSchemeAppIdSecurityFromJSON(
  jsonString: string,
): SafeParseResult<CustomSchemeAppIdSecurity, SDKValidationError> {
  return safeParse(
    jsonString,
    (x) => CustomSchemeAppIdSecurity$inboundSchema.parse(JSON.parse(x)),
    `Failed to parse 'CustomSchemeAppIdSecurity' from JSON`,
  );
}