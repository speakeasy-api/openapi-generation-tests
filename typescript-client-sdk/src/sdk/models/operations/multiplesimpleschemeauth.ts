/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { AxiosResponse } from "axios";
export const MultipleSimpleSchemeAuthServerList = ["http://localhost:35456"] as const;

export class MultipleSimpleSchemeAuthSecurity extends SpeakeasyBase {
    @SpeakeasyMetadata({ data: "security, scheme=true;type=apiKey;subtype=header;name=x-api-key" })
    apiKeyAuthNew: string;

    @SpeakeasyMetadata({ data: "security, scheme=true;type=oauth2;name=Authorization" })
    oauth2: string;
}

export class MultipleSimpleSchemeAuthResponse extends SpeakeasyBase {
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
