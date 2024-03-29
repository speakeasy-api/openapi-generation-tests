/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { AxiosResponse } from "axios";
import { Expose } from "class-transformer";

export class DeepObjectQueryParamsMapRequest extends SpeakeasyBase {
    @SpeakeasyMetadata({ data: "queryParam, style=deepObject;explode=true;name=mapParam" })
    mapParam: Record<string, string>;

    @SpeakeasyMetadata({ data: "queryParam, style=deepObject;explode=true;name=mapArrParam" })
    mapArrParam?: Record<string, string[]>;
}

/**
 * OK
 */
export class DeepObjectQueryParamsMapRes extends SpeakeasyBase {
    @SpeakeasyMetadata()
    @Expose({ name: "args" })
    args: Record<string, any>;

    @SpeakeasyMetadata()
    @Expose({ name: "url" })
    url: string;
}

export class DeepObjectQueryParamsMapResponse extends SpeakeasyBase {
    /**
     * HTTP response content type for this operation
     */
    @SpeakeasyMetadata()
    contentType: string;

    /**
     * HTTP response status code for this operation
     */
    @SpeakeasyMetadata()
    statusCode: number;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @SpeakeasyMetadata()
    rawResponse?: AxiosResponse;

    /**
     * OK
     */
    @SpeakeasyMetadata()
    res?: DeepObjectQueryParamsMapRes;
}
