/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Expose } from "class-transformer";

export class NullableObject extends SpeakeasyBase {
    @SpeakeasyMetadata()
    @Expose({ name: "optional" })
    optional?: string;

    @SpeakeasyMetadata()
    @Expose({ name: "required" })
    required: number;
}