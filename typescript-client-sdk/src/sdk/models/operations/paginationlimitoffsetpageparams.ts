/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { AxiosResponse } from "axios";
import { Expose } from "class-transformer";
export const PaginationLimitOffsetPageParamsServerList = ["http://localhost:35456"] as const;

export class PaginationLimitOffsetPageParamsRequest extends SpeakeasyBase {
    @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=page" })
    page: number;
}

/**
 * OK
 */
export class PaginationLimitOffsetPageParamsRes extends SpeakeasyBase {
    @SpeakeasyMetadata()
    @Expose({ name: "numPages" })
    numPages: number;

    @SpeakeasyMetadata()
    @Expose({ name: "resultArray" })
    resultArray: number[];
}

export class PaginationLimitOffsetPageParamsResponse extends SpeakeasyBase {
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
    res?: PaginationLimitOffsetPageParamsRes;

    next: () => Promise<PaginationLimitOffsetPageParamsResponse | null>;
}
