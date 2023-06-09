/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { AxiosResponse } from "axios";
import { Expose } from "class-transformer";

export class RequestBodyPostMultipleContentTypesSplitApplicationJSON extends SpeakeasyBase {
    @SpeakeasyMetadata()
    @Expose({ name: "bool" })
    bool: boolean;

    @SpeakeasyMetadata()
    @Expose({ name: "num" })
    num: number;

    @SpeakeasyMetadata()
    @Expose({ name: "str" })
    str: string;
}

/**
 * OK
 */
export class RequestBodyPostMultipleContentTypesSplitJsonRes extends SpeakeasyBase {
    @SpeakeasyMetadata()
    @Expose({ name: "form" })
    form?: Record<string, any>;

    @SpeakeasyMetadata()
    @Expose({ name: "json" })
    json?: Record<string, any>;
}

export class RequestBodyPostMultipleContentTypesSplitJsonResponse extends SpeakeasyBase {
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
    res?: RequestBodyPostMultipleContentTypesSplitJsonRes;
}
