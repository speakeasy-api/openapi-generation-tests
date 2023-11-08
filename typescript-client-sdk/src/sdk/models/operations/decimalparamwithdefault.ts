/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { AxiosResponse } from "axios";

export class DecimalParamWithDefaultRequest extends SpeakeasyBase {
    /**
     * A decimal parameter with a default value
     */
    @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=decimalInput" })
    decimalInput: number;
}

export class DecimalParamWithDefaultResponse extends SpeakeasyBase {
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
}