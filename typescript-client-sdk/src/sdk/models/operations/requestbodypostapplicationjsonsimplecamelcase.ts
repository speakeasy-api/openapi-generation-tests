/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import * as shared from "../../../sdk/models/shared";
import { AxiosResponse } from "axios";
import { Expose, Type } from "class-transformer";

/**
 * OK
 */
export class RequestBodyPostApplicationJsonSimpleCamelCaseRes extends SpeakeasyBase {
    /**
     * A simple object that uses all our supported primitive types and enums and has optional properties.
     */
    @SpeakeasyMetadata()
    @Expose({ name: "json" })
    @Type(() => shared.SimpleObjectCamelCase)
    json: shared.SimpleObjectCamelCase;
}

export class RequestBodyPostApplicationJsonSimpleCamelCaseResponse extends SpeakeasyBase {
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
    res?: RequestBodyPostApplicationJsonSimpleCamelCaseRes;
}
