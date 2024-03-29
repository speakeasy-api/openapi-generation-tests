/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { AxiosResponse } from "axios";
import { Expose } from "class-transformer";

export class RequestBodyPostMultipleContentTypesSplitParamJsonRequestBody extends SpeakeasyBase {
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

export class RequestBodyPostMultipleContentTypesSplitParamJsonRequest extends SpeakeasyBase {
    @SpeakeasyMetadata({ data: "request, media_type=application/json" })
    requestBody: RequestBodyPostMultipleContentTypesSplitParamJsonRequestBody;

    @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=paramStr" })
    paramStr: string;
}

/**
 * OK
 */
export class RequestBodyPostMultipleContentTypesSplitParamJsonRes extends SpeakeasyBase {
    @SpeakeasyMetadata()
    @Expose({ name: "args" })
    args?: Record<string, string>;

    @SpeakeasyMetadata()
    @Expose({ name: "form" })
    form?: Record<string, any>;

    @SpeakeasyMetadata()
    @Expose({ name: "json" })
    json?: Record<string, any>;
}

export class RequestBodyPostMultipleContentTypesSplitParamJsonResponse extends SpeakeasyBase {
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
    res?: RequestBodyPostMultipleContentTypesSplitParamJsonRes;
}
