/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Expose } from "class-transformer";

/**
 * @deprecated class: This object is deprecated.
 */
export class DeprecatedObject extends SpeakeasyBase {
    @SpeakeasyMetadata()
    @Expose({ name: "str" })
    str?: string;
}
