/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import * as shared from "../shared";
import { AxiosResponse } from "axios";
import { Expose, Type } from "class-transformer";

/**
 * OK
 */
export class NullableTypedObjectPostRes extends SpeakeasyBase {
    @SpeakeasyMetadata()
    @Expose({ name: "json" })
    @Type(() => shared.TypedObject1)
    json: shared.TypedObject1;
}

export class NullableTypedObjectPostResponse extends SpeakeasyBase {
    @SpeakeasyMetadata()
    contentType: string;

    @SpeakeasyMetadata()
    statusCode: number;

    @SpeakeasyMetadata()
    rawResponse?: AxiosResponse;

    /**
     * OK
     */
    @SpeakeasyMetadata()
    res?: NullableTypedObjectPostRes;
}