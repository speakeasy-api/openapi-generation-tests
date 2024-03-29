/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import * as shared from "../../../sdk/models/shared";
import { RFCDate } from "../../../sdk/types";
import { AxiosResponse } from "axios";
import { Expose, Type } from "class-transformer";

export class UsageExamplePostSecurity extends SpeakeasyBase {
    @SpeakeasyMetadata({ data: "security, scheme=true;type=http;subtype=basic;name=password" })
    password: string;

    @SpeakeasyMetadata({ data: "security, scheme=true;type=http;subtype=basic;name=username" })
    username: string;
}

/**
 * A request body that contains fields with different formats for testing example generation
 */
export class UsageExamplePostRequestBody extends SpeakeasyBase {
    /**
     * A set of strings with format values that lead to relevant examples being generated for them
     */
    @SpeakeasyMetadata()
    @Expose({ name: "fakerFormattedStrings" })
    @Type(() => shared.FakerFormattedStrings)
    fakerFormattedStrings?: shared.FakerFormattedStrings;

    /**
     * A set of strings with fieldnames that lead to relevant examples being generated for them
     */
    @SpeakeasyMetadata()
    @Expose({ name: "fakerStrings" })
    @Type(() => shared.FakerStrings)
    fakerStrings?: shared.FakerStrings;

    /**
     * A simple object that uses all our supported primitive types and enums and has optional properties.
     */
    @SpeakeasyMetadata()
    @Expose({ name: "simpleObject" })
    @Type(() => shared.SimpleObject)
    simpleObject?: shared.SimpleObject;
}

/**
 * An enum type
 */
export enum EnumParameter {
    Value1 = "value1",
    Value2 = "value2",
    Value3 = "value3",
}

/**
 * An enum type
 */
export enum OptEnumParameter {
    Value1 = "value1",
    Value2 = "value2",
    Value3 = "value3",
}

export class UsageExamplePostRequest extends SpeakeasyBase {
    /**
     * A request body that contains fields with different formats for testing example generation
     */
    @SpeakeasyMetadata({ data: "request, media_type=application/json" })
    requestBody?: UsageExamplePostRequestBody;

    /**
     * An bigint parameter
     */
    @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=bigintParameter" })
    bigintParameter: number;

    /**
     * An bigint parameter
     */
    @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=bigintParameterOptional" })
    bigintParameterOptional?: number;

    /**
     * An bigint parameter
     */
    @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=bigintStrParameter" })
    bigintStrParameter: string;

    /**
     * An bigint parameter
     */
    @SpeakeasyMetadata({
        data: "queryParam, style=form;explode=true;name=bigintStrParameterOptional",
    })
    bigintStrParameterOptional?: string;

    /**
     * A boolean parameter
     */
    @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=boolParameter" })
    boolParameter: boolean;

    /**
     * A date parameter
     */
    @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=dateParameter" })
    dateParameter: RFCDate;

    /**
     * A date time parameter with a default value
     */
    @SpeakeasyMetadata({
        data: "queryParam, style=form;explode=true;name=dateTimeDefaultParameter",
    })
    dateTimeDefaultParameter: Date;

    /**
     * A date time parameter
     */
    @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=dateTimeParameter" })
    dateTimeParameter: Date;

    /**
     * A decimal parameter
     */
    @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=decimalParameter" })
    decimalParameter: number;

    /**
     * A decimal parameter
     */
    @SpeakeasyMetadata({
        data: "queryParam, style=form;explode=true;name=decimalParameterOptional",
    })
    decimalParameterOptional?: number;

    /**
     * A decimal parameter
     */
    @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=decimalStrParameter" })
    decimalStrParameter: string;

    /**
     * A decimal parameter
     */
    @SpeakeasyMetadata({
        data: "queryParam, style=form;explode=true;name=decimalStrParameterOptional",
    })
    decimalStrParameterOptional?: string;

    /**
     * A double parameter
     */
    @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=doubleParameter" })
    doubleParameter: number;

    /**
     * An enum parameter
     */
    @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=enumParameter" })
    enumParameter: EnumParameter;

    /**
     * A number parameter that contains a falsey example value
     */
    @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=falseyNumberParameter" })
    falseyNumberParameter: number;

    /**
     * A float32 parameter
     */
    @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=float32Parameter" })
    float32Parameter: number;

    /**
     * A float parameter
     */
    @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=floatParameter" })
    floatParameter: number;

    /**
     * An int64 parameter
     */
    @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=int64Parameter" })
    int64Parameter: number;

    /**
     * An integer parameter
     */
    @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=intParameter" })
    intParameter: number;

    /**
     * An enum parameter
     */
    @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=optEnumParameter" })
    optEnumParameter?: OptEnumParameter;

    /**
     * A string parameter
     */
    @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=strParameter" })
    strParameter: string;
}

export class UsageExamplePostJson extends SpeakeasyBase {
    /**
     * A set of strings with format values that lead to relevant examples being generated for them
     */
    @SpeakeasyMetadata()
    @Expose({ name: "fakerFormattedStrings" })
    @Type(() => shared.FakerFormattedStrings)
    fakerFormattedStrings?: shared.FakerFormattedStrings;

    /**
     * A set of strings with fieldnames that lead to relevant examples being generated for them
     */
    @SpeakeasyMetadata()
    @Expose({ name: "fakerStrings" })
    @Type(() => shared.FakerStrings)
    fakerStrings?: shared.FakerStrings;

    /**
     * A simple object that uses all our supported primitive types and enums and has optional properties.
     */
    @SpeakeasyMetadata()
    @Expose({ name: "simpleObject" })
    @Type(() => shared.SimpleObject)
    simpleObject?: shared.SimpleObject;
}

/**
 * A response body that contains the simpleObject sent in the request body
 */
export class UsageExamplePostResponseBody extends SpeakeasyBase {
    @SpeakeasyMetadata()
    @Expose({ name: "json" })
    @Type(() => UsageExamplePostJson)
    json: UsageExamplePostJson;
}

export class UsageExamplePostResponse extends SpeakeasyBase {
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
     * A successful response that contains the simpleObject sent in the request body
     */
    @SpeakeasyMetadata()
    object?: UsageExamplePostResponseBody;
}
