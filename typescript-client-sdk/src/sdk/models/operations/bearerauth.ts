/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { AxiosResponse } from "axios";
import { Expose } from "class-transformer";

export class BearerAuthSecurity extends SpeakeasyBase {
    @SpeakeasyMetadata({
        data: "security, scheme=true;type=http;subtype=bearer;name=Authorization",
    })
    bearerAuth: string;
}

/**
 * Successful authentication.
 */
export class BearerAuthToken extends SpeakeasyBase {
    @SpeakeasyMetadata()
    @Expose({ name: "authenticated" })
    authenticated: boolean;

    @SpeakeasyMetadata()
    @Expose({ name: "token" })
    token: string;
}

export class BearerAuthResponse extends SpeakeasyBase {
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
     * Successful authentication.
     */
    @SpeakeasyMetadata()
    token?: BearerAuthToken;
}
