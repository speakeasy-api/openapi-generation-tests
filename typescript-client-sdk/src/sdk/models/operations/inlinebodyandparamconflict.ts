/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { AxiosResponse } from "axios";
import { Expose, Type } from "class-transformer";

export class InlineBodyAndParamConflictRequestBody extends SpeakeasyBase {
    @SpeakeasyMetadata()
    @Expose({ name: "str" })
    str: string;
}

export class InlineBodyAndParamConflictRequest extends SpeakeasyBase {
    @SpeakeasyMetadata({ data: "request, media_type=application/json" })
    requestBody: InlineBodyAndParamConflictRequestBody;

    @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=str" })
    str: string;
}

export class Json extends SpeakeasyBase {
    @SpeakeasyMetadata()
    @Expose({ name: "str" })
    str: string;
}

/**
 * OK
 */
export class InlineBodyAndParamConflictRes extends SpeakeasyBase {
    @SpeakeasyMetadata()
    @Expose({ name: "args" })
    args: Record<string, string>;

    @SpeakeasyMetadata()
    @Expose({ name: "json" })
    @Type(() => Json)
    json: Json;
}

export class InlineBodyAndParamConflictResponse extends SpeakeasyBase {
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
    res?: InlineBodyAndParamConflictRes;
}
