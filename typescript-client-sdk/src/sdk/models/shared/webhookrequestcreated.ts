/*
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

import * as z from "zod";
import { safeParse } from "../../../lib/schemas.js";
import { ClosedEnum } from "../../types/enums.js";
import { Result as SafeParseResult } from "../../types/fp.js";
import { SDKValidationError } from "../errors/sdkvalidationerror.js";
import {
  SimpleObject,
  SimpleObject$inboundSchema,
  SimpleObject$Outbound,
  SimpleObject$outboundSchema,
} from "./simpleobject.js";

export const WebhookRequestCreatedType = {
  WebhookCreated: "webhook.created",
} as const;
export type WebhookRequestCreatedType = ClosedEnum<
  typeof WebhookRequestCreatedType
>;

export type WebhookRequestCreated = {
  /**
   * A simple object that uses all our supported primitive types and enums and has optional properties.
   */
  data: SimpleObject;
  type: WebhookRequestCreatedType;
};

/** @internal */
export const WebhookRequestCreatedType$inboundSchema: z.ZodNativeEnum<
  typeof WebhookRequestCreatedType
> = z.nativeEnum(WebhookRequestCreatedType);

/** @internal */
export const WebhookRequestCreatedType$outboundSchema: z.ZodNativeEnum<
  typeof WebhookRequestCreatedType
> = WebhookRequestCreatedType$inboundSchema;

/**
 * @internal
 * @deprecated This namespace will be removed in future versions. Use schemas and types that are exported directly from this module.
 */
export namespace WebhookRequestCreatedType$ {
  /** @deprecated use `WebhookRequestCreatedType$inboundSchema` instead. */
  export const inboundSchema = WebhookRequestCreatedType$inboundSchema;
  /** @deprecated use `WebhookRequestCreatedType$outboundSchema` instead. */
  export const outboundSchema = WebhookRequestCreatedType$outboundSchema;
}

/** @internal */
export const WebhookRequestCreated$inboundSchema: z.ZodType<
  WebhookRequestCreated,
  z.ZodTypeDef,
  unknown
> = z.object({
  data: SimpleObject$inboundSchema,
  type: WebhookRequestCreatedType$inboundSchema,
});

/** @internal */
export type WebhookRequestCreated$Outbound = {
  data: SimpleObject$Outbound;
  type: string;
};

/** @internal */
export const WebhookRequestCreated$outboundSchema: z.ZodType<
  WebhookRequestCreated$Outbound,
  z.ZodTypeDef,
  WebhookRequestCreated
> = z.object({
  data: SimpleObject$outboundSchema,
  type: WebhookRequestCreatedType$outboundSchema,
});

/**
 * @internal
 * @deprecated This namespace will be removed in future versions. Use schemas and types that are exported directly from this module.
 */
export namespace WebhookRequestCreated$ {
  /** @deprecated use `WebhookRequestCreated$inboundSchema` instead. */
  export const inboundSchema = WebhookRequestCreated$inboundSchema;
  /** @deprecated use `WebhookRequestCreated$outboundSchema` instead. */
  export const outboundSchema = WebhookRequestCreated$outboundSchema;
  /** @deprecated use `WebhookRequestCreated$Outbound` instead. */
  export type Outbound = WebhookRequestCreated$Outbound;
}

export function webhookRequestCreatedToJSON(
  webhookRequestCreated: WebhookRequestCreated,
): string {
  return JSON.stringify(
    WebhookRequestCreated$outboundSchema.parse(webhookRequestCreated),
  );
}

export function webhookRequestCreatedFromJSON(
  jsonString: string,
): SafeParseResult<WebhookRequestCreated, SDKValidationError> {
  return safeParse(
    jsonString,
    (x) => WebhookRequestCreated$inboundSchema.parse(JSON.parse(x)),
    `Failed to parse 'WebhookRequestCreated' from JSON`,
  );
}