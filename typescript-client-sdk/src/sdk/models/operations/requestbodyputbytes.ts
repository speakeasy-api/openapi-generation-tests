/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { AxiosResponse } from "axios";
import { Expose } from "class-transformer";

/**
 * OK
 */
export class RequestBodyPutBytesRes extends SpeakeasyBase {
    @SpeakeasyMetadata()
    @Expose({ name: "data" })
    data: string;
}

export class RequestBodyPutBytesResponse extends SpeakeasyBase {
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
    res?: RequestBodyPutBytesRes;
}
