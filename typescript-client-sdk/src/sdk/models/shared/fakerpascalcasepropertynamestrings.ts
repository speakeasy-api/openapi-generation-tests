/*
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

import * as z from "zod";
import { safeParse } from "../../../lib/schemas.js";
import { Result as SafeParseResult } from "../../types/fp.js";
import { SDKValidationError } from "../errors/sdkvalidationerror.js";

/**
 * A set of strings with pascal case fieldnames that lead to relevant examples being generated for them
 */
export type FakerPascalCasePropertyNameStrings = {
  account: string;
  address: string;
  addressLine1?: string | undefined;
  amount: string;
  avatar: string;
  city: string;
  color: string;
  comment: string;
  company: string;
  continent: string;
  country: string;
  countryCode: string;
  /**
   * RFC3339 formatted timestamp
   */
  createdAt: string;
  currency: string;
  currencyCode: string;
  currencyISO: string;
  datatype: string;
  default: string;
  description: string;
  directory: string;
  domain: string;
  domainName: string;
  email: string;
  emailAddr: string;
  emailAddress: string;
  expiredAt: string;
  expires: string;
  expiresAt: string;
  extension: string;
  filename: string;
  filepath: string;
  filetype: string;
  firstName: string;
  fullName: string;
  gender: string;
  host: string;
  hostName: string;
  httpStatus: string;
  iban: string;
  id: string;
  ip: string;
  ipAddr: string;
  ipAddress: string;
  ipv4: string;
  ipv6: string;
  job: string;
  json: string;
  key: string;
  lastName: string;
  latitude: string;
  locale: string;
  longitude: string;
  mac: string;
  manufacturer: string;
  material: string;
  middleName: string;
  model: string;
  password: string;
  phone: string;
  pin: string;
  postalCode: string;
  price: string;
  product: string;
  sex: string;
  statusCode: string;
  street: string;
  timezone: string;
  unit: string;
  /**
   * RFC3339 formatted timestamp
   */
  updatedAt: string;
  uri: string;
  url: string;
  username: string;
  uuid: string;
};

/** @internal */
export const FakerPascalCasePropertyNameStrings$inboundSchema: z.ZodType<
  FakerPascalCasePropertyNameStrings,
  z.ZodTypeDef,
  unknown
> = z.object({
  account: z.string(),
  address: z.string(),
  addressLine1: z.string().optional(),
  amount: z.string(),
  avatar: z.string(),
  city: z.string(),
  color: z.string(),
  comment: z.string(),
  company: z.string(),
  continent: z.string(),
  country: z.string(),
  countryCode: z.string(),
  createdAt: z.string(),
  currency: z.string(),
  currencyCode: z.string(),
  currencyISO: z.string(),
  datatype: z.string(),
  default: z.string(),
  description: z.string(),
  directory: z.string(),
  domain: z.string(),
  domainName: z.string(),
  email: z.string(),
  emailAddr: z.string(),
  emailAddress: z.string(),
  expiredAt: z.string(),
  expires: z.string(),
  expiresAt: z.string(),
  extension: z.string(),
  filename: z.string(),
  filepath: z.string(),
  filetype: z.string(),
  firstName: z.string(),
  fullName: z.string(),
  gender: z.string(),
  host: z.string(),
  hostName: z.string(),
  httpStatus: z.string(),
  iban: z.string(),
  id: z.string(),
  ip: z.string(),
  ipAddr: z.string(),
  ipAddress: z.string(),
  ipv4: z.string(),
  ipv6: z.string(),
  job: z.string(),
  json: z.string(),
  key: z.string(),
  lastName: z.string(),
  latitude: z.string(),
  locale: z.string(),
  longitude: z.string(),
  mac: z.string(),
  manufacturer: z.string(),
  material: z.string(),
  middleName: z.string(),
  model: z.string(),
  password: z.string(),
  phone: z.string(),
  pin: z.string(),
  postalCode: z.string(),
  price: z.string(),
  product: z.string(),
  sex: z.string(),
  statusCode: z.string(),
  street: z.string(),
  timezone: z.string(),
  unit: z.string(),
  updatedAt: z.string(),
  uri: z.string(),
  url: z.string(),
  username: z.string(),
  uuid: z.string(),
});

/** @internal */
export type FakerPascalCasePropertyNameStrings$Outbound = {
  account: string;
  address: string;
  addressLine1?: string | undefined;
  amount: string;
  avatar: string;
  city: string;
  color: string;
  comment: string;
  company: string;
  continent: string;
  country: string;
  countryCode: string;
  createdAt: string;
  currency: string;
  currencyCode: string;
  currencyISO: string;
  datatype: string;
  default: string;
  description: string;
  directory: string;
  domain: string;
  domainName: string;
  email: string;
  emailAddr: string;
  emailAddress: string;
  expiredAt: string;
  expires: string;
  expiresAt: string;
  extension: string;
  filename: string;
  filepath: string;
  filetype: string;
  firstName: string;
  fullName: string;
  gender: string;
  host: string;
  hostName: string;
  httpStatus: string;
  iban: string;
  id: string;
  ip: string;
  ipAddr: string;
  ipAddress: string;
  ipv4: string;
  ipv6: string;
  job: string;
  json: string;
  key: string;
  lastName: string;
  latitude: string;
  locale: string;
  longitude: string;
  mac: string;
  manufacturer: string;
  material: string;
  middleName: string;
  model: string;
  password: string;
  phone: string;
  pin: string;
  postalCode: string;
  price: string;
  product: string;
  sex: string;
  statusCode: string;
  street: string;
  timezone: string;
  unit: string;
  updatedAt: string;
  uri: string;
  url: string;
  username: string;
  uuid: string;
};

/** @internal */
export const FakerPascalCasePropertyNameStrings$outboundSchema: z.ZodType<
  FakerPascalCasePropertyNameStrings$Outbound,
  z.ZodTypeDef,
  FakerPascalCasePropertyNameStrings
> = z.object({
  account: z.string(),
  address: z.string(),
  addressLine1: z.string().optional(),
  amount: z.string(),
  avatar: z.string(),
  city: z.string(),
  color: z.string(),
  comment: z.string(),
  company: z.string(),
  continent: z.string(),
  country: z.string(),
  countryCode: z.string(),
  createdAt: z.string(),
  currency: z.string(),
  currencyCode: z.string(),
  currencyISO: z.string(),
  datatype: z.string(),
  default: z.string(),
  description: z.string(),
  directory: z.string(),
  domain: z.string(),
  domainName: z.string(),
  email: z.string(),
  emailAddr: z.string(),
  emailAddress: z.string(),
  expiredAt: z.string(),
  expires: z.string(),
  expiresAt: z.string(),
  extension: z.string(),
  filename: z.string(),
  filepath: z.string(),
  filetype: z.string(),
  firstName: z.string(),
  fullName: z.string(),
  gender: z.string(),
  host: z.string(),
  hostName: z.string(),
  httpStatus: z.string(),
  iban: z.string(),
  id: z.string(),
  ip: z.string(),
  ipAddr: z.string(),
  ipAddress: z.string(),
  ipv4: z.string(),
  ipv6: z.string(),
  job: z.string(),
  json: z.string(),
  key: z.string(),
  lastName: z.string(),
  latitude: z.string(),
  locale: z.string(),
  longitude: z.string(),
  mac: z.string(),
  manufacturer: z.string(),
  material: z.string(),
  middleName: z.string(),
  model: z.string(),
  password: z.string(),
  phone: z.string(),
  pin: z.string(),
  postalCode: z.string(),
  price: z.string(),
  product: z.string(),
  sex: z.string(),
  statusCode: z.string(),
  street: z.string(),
  timezone: z.string(),
  unit: z.string(),
  updatedAt: z.string(),
  uri: z.string(),
  url: z.string(),
  username: z.string(),
  uuid: z.string(),
});

/**
 * @internal
 * @deprecated This namespace will be removed in future versions. Use schemas and types that are exported directly from this module.
 */
export namespace FakerPascalCasePropertyNameStrings$ {
  /** @deprecated use `FakerPascalCasePropertyNameStrings$inboundSchema` instead. */
  export const inboundSchema = FakerPascalCasePropertyNameStrings$inboundSchema;
  /** @deprecated use `FakerPascalCasePropertyNameStrings$outboundSchema` instead. */
  export const outboundSchema =
    FakerPascalCasePropertyNameStrings$outboundSchema;
  /** @deprecated use `FakerPascalCasePropertyNameStrings$Outbound` instead. */
  export type Outbound = FakerPascalCasePropertyNameStrings$Outbound;
}

export function fakerPascalCasePropertyNameStringsToJSON(
  fakerPascalCasePropertyNameStrings: FakerPascalCasePropertyNameStrings,
): string {
  return JSON.stringify(
    FakerPascalCasePropertyNameStrings$outboundSchema.parse(
      fakerPascalCasePropertyNameStrings,
    ),
  );
}

export function fakerPascalCasePropertyNameStringsFromJSON(
  jsonString: string,
): SafeParseResult<FakerPascalCasePropertyNameStrings, SDKValidationError> {
  return safeParse(
    jsonString,
    (x) =>
      FakerPascalCasePropertyNameStrings$inboundSchema.parse(JSON.parse(x)),
    `Failed to parse 'FakerPascalCasePropertyNameStrings' from JSON`,
  );
}