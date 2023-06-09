/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import * as shared from "../shared";
import { AxiosResponse } from "axios";
import { Expose, Type } from "class-transformer";

export class JsonQueryParamsObjectRequest extends SpeakeasyBase {
    @SpeakeasyMetadata({ data: "queryParam, serialization=json;name=deepObjParam" })
    deepObjParam: shared.DeepObject;

    /**
     * A simple object that uses all our supported primitive types and enums and has optional properties.
     */
    @SpeakeasyMetadata({ data: "queryParam, serialization=json;name=simpleObjParam" })
    simpleObjParam: shared.SimpleObject;
}

export class JsonQueryParamsObjectResArgs extends SpeakeasyBase {
    @SpeakeasyMetadata()
    @Expose({ name: "deepObjParam" })
    deepObjParam: string;

    @SpeakeasyMetadata()
    @Expose({ name: "simpleObjParam" })
    simpleObjParam: string;
}

/**
 * OK
 */
export class JsonQueryParamsObjectRes extends SpeakeasyBase {
    @SpeakeasyMetadata()
    @Expose({ name: "args" })
    @Type(() => JsonQueryParamsObjectResArgs)
    args: JsonQueryParamsObjectResArgs;

    @SpeakeasyMetadata()
    @Expose({ name: "url" })
    url: string;
}

export class JsonQueryParamsObjectResponse extends SpeakeasyBase {
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
    res?: JsonQueryParamsObjectRes;
}
