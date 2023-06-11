/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import * as utils from "../internal/utils";
import * as operations from "./models/operations";
import * as shared from "./models/shared";
import { SDKConfiguration } from "./sdk";
import { AxiosInstance, AxiosRequestConfig, AxiosResponse } from "axios";
import jp from "jsonpath";

/**
 * Endpoints for testing the pagination extension
 */
export class Pagination {
    private sdkConfiguration: SDKConfiguration;

    constructor(sdkConfig: SDKConfiguration) {
        this.sdkConfiguration = sdkConfig;
    }

    async paginationCursorBody(
        req: operations.PaginationCursorBodyRequestBody,
        serverURL?: string,
        config?: AxiosRequestConfig
    ): Promise<operations.PaginationCursorBodyResponse> {
        if (!(req instanceof utils.SpeakeasyBase)) {
            req = new operations.PaginationCursorBodyRequestBody(req);
        }

        let baseURL: string = utils.templateUrl(operations.PaginationCursorBodyServerList[0], {});
        if (serverURL) {
            baseURL = serverURL;
        }
        const url: string = baseURL.replace(/\/$/, "") + "/pagination/cursor";

        let [reqBodyHeaders, reqBody]: [object, any] = [{}, {}];

        try {
            [reqBodyHeaders, reqBody] = utils.serializeRequestBody(req, "request", "json");
        } catch (e: unknown) {
            if (e instanceof Error) {
                throw new Error(`Error serializing request body, cause: ${e.message}`);
            }
        }

        const client: AxiosInstance =
            this.sdkConfiguration.securityClient || this.sdkConfiguration.defaultClient;

        const headers = { ...reqBodyHeaders, ...config?.headers };
        headers["Accept"] = "application/json";
        headers[
            "x-speakeasy-user-agent"
        ] = `speakeasy-sdk/${this.sdkConfiguration.language} ${this.sdkConfiguration.sdkVersion} ${this.sdkConfiguration.genVersion} ${this.sdkConfiguration.openapiDocVersion}`;

        const httpRes: AxiosResponse = await client.request({
            validateStatus: () => true,
            url: url,
            method: "put",
            headers: headers,
            data: reqBody,
            ...config,
        });

        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) {
            throw new Error(`status code not found in response: ${httpRes}`);
        }

        const res: operations.PaginationCursorBodyResponse =
            new operations.PaginationCursorBodyResponse({
                statusCode: httpRes.status,
                contentType: contentType,
                rawResponse: httpRes,
            });
        switch (true) {
            case httpRes?.status == 200:
                if (utils.matchContentType(contentType, `application/json`)) {
                    res.res = utils.objectToClass(
                        httpRes?.data,
                        operations.PaginationCursorBodyRes
                    );
                }
                break;
        }

        res.next = async (): Promise<operations.PaginationCursorBodyResponse | null> => {
            const nextCursor = jp.value(httpRes?.data, "$.resultArray[(@.length-1)]");
            if (nextCursor === undefined) {
                return null;
            }

            return await this.paginationCursorBody(
                {
                    ...req,
                    cursor: nextCursor,
                },
                serverURL,
                config
            );
        };
        return res;
    }

    async paginationCursorParams(
        cursor: number,
        serverURL?: string,
        config?: AxiosRequestConfig
    ): Promise<operations.PaginationCursorParamsResponse> {
        const req = new operations.PaginationCursorParamsRequest({
            cursor: cursor,
        });
        let baseURL: string = utils.templateUrl(operations.PaginationCursorParamsServerList[0], {});
        if (serverURL) {
            baseURL = serverURL;
        }
        const url: string = baseURL.replace(/\/$/, "") + "/pagination/cursor";

        const client: AxiosInstance =
            this.sdkConfiguration.securityClient || this.sdkConfiguration.defaultClient;

        const headers = { ...config?.headers };
        const queryParams: string = utils.serializeQueryParams(req, this.sdkConfiguration.globals);
        headers["Accept"] = "application/json";
        headers[
            "x-speakeasy-user-agent"
        ] = `speakeasy-sdk/${this.sdkConfiguration.language} ${this.sdkConfiguration.sdkVersion} ${this.sdkConfiguration.genVersion} ${this.sdkConfiguration.openapiDocVersion}`;

        const httpRes: AxiosResponse = await client.request({
            validateStatus: () => true,
            url: url + queryParams,
            method: "get",
            headers: headers,
            ...config,
        });

        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) {
            throw new Error(`status code not found in response: ${httpRes}`);
        }

        const res: operations.PaginationCursorParamsResponse =
            new operations.PaginationCursorParamsResponse({
                statusCode: httpRes.status,
                contentType: contentType,
                rawResponse: httpRes,
            });
        switch (true) {
            case httpRes?.status == 200:
                if (utils.matchContentType(contentType, `application/json`)) {
                    res.res = utils.objectToClass(
                        httpRes?.data,
                        operations.PaginationCursorParamsRes
                    );
                }
                break;
        }

        res.next = async (): Promise<operations.PaginationCursorParamsResponse | null> => {
            const nextCursor = jp.value(httpRes?.data, "$.resultArray[(@.length-1)]");
            if (nextCursor === undefined) {
                return null;
            }

            return await this.paginationCursorParams(nextCursor, serverURL, config);
        };
        return res;
    }

    async paginationLimitOffsetOffsetBody(
        req: shared.LimitOffsetConfig,
        serverURL?: string,
        config?: AxiosRequestConfig
    ): Promise<operations.PaginationLimitOffsetOffsetBodyResponse> {
        if (!(req instanceof utils.SpeakeasyBase)) {
            req = new shared.LimitOffsetConfig(req);
        }

        let baseURL: string = utils.templateUrl(
            operations.PaginationLimitOffsetOffsetBodyServerList[0],
            {}
        );
        if (serverURL) {
            baseURL = serverURL;
        }
        const url: string = baseURL.replace(/\/$/, "") + "/pagination/limitoffset/offset";

        let [reqBodyHeaders, reqBody]: [object, any] = [{}, {}];

        try {
            [reqBodyHeaders, reqBody] = utils.serializeRequestBody(req, "request", "json");
        } catch (e: unknown) {
            if (e instanceof Error) {
                throw new Error(`Error serializing request body, cause: ${e.message}`);
            }
        }

        const client: AxiosInstance =
            this.sdkConfiguration.securityClient || this.sdkConfiguration.defaultClient;

        const headers = { ...reqBodyHeaders, ...config?.headers };
        headers["Accept"] = "application/json";
        headers[
            "x-speakeasy-user-agent"
        ] = `speakeasy-sdk/${this.sdkConfiguration.language} ${this.sdkConfiguration.sdkVersion} ${this.sdkConfiguration.genVersion} ${this.sdkConfiguration.openapiDocVersion}`;

        const httpRes: AxiosResponse = await client.request({
            validateStatus: () => true,
            url: url,
            method: "put",
            headers: headers,
            data: reqBody,
            ...config,
        });

        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) {
            throw new Error(`status code not found in response: ${httpRes}`);
        }

        const res: operations.PaginationLimitOffsetOffsetBodyResponse =
            new operations.PaginationLimitOffsetOffsetBodyResponse({
                statusCode: httpRes.status,
                contentType: contentType,
                rawResponse: httpRes,
            });
        switch (true) {
            case httpRes?.status == 200:
                if (utils.matchContentType(contentType, `application/json`)) {
                    res.res = utils.objectToClass(
                        httpRes?.data,
                        operations.PaginationLimitOffsetOffsetBodyRes
                    );
                }
                break;
        }

        res.next = async (): Promise<operations.PaginationLimitOffsetOffsetBodyResponse | null> => {
            const offset = req.offset || 0;

            if (!httpRes?.data) {
                return null;
            }
            const results = jp.value(httpRes?.data, "$.resultArray");
            if (!results.length) {
                return null;
            }
            const limit = req.limit || 0;
            if (results.length < limit) {
                return null;
            }
            const newOffset = offset + results.length;

            return await this.paginationLimitOffsetOffsetBody(
                {
                    ...req,
                    offset: newOffset,
                },
                serverURL,
                config
            );
        };
        return res;
    }

    async paginationLimitOffsetOffsetParams(
        limit?: number,
        offset?: number,
        serverURL?: string,
        config?: AxiosRequestConfig
    ): Promise<operations.PaginationLimitOffsetOffsetParamsResponse> {
        const req = new operations.PaginationLimitOffsetOffsetParamsRequest({
            limit: limit,
            offset: offset,
        });
        let baseURL: string = utils.templateUrl(
            operations.PaginationLimitOffsetOffsetParamsServerList[0],
            {}
        );
        if (serverURL) {
            baseURL = serverURL;
        }
        const url: string = baseURL.replace(/\/$/, "") + "/pagination/limitoffset/offset";

        const client: AxiosInstance =
            this.sdkConfiguration.securityClient || this.sdkConfiguration.defaultClient;

        const headers = { ...config?.headers };
        const queryParams: string = utils.serializeQueryParams(req, this.sdkConfiguration.globals);
        headers["Accept"] = "application/json";
        headers[
            "x-speakeasy-user-agent"
        ] = `speakeasy-sdk/${this.sdkConfiguration.language} ${this.sdkConfiguration.sdkVersion} ${this.sdkConfiguration.genVersion} ${this.sdkConfiguration.openapiDocVersion}`;

        const httpRes: AxiosResponse = await client.request({
            validateStatus: () => true,
            url: url + queryParams,
            method: "get",
            headers: headers,
            ...config,
        });

        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) {
            throw new Error(`status code not found in response: ${httpRes}`);
        }

        const res: operations.PaginationLimitOffsetOffsetParamsResponse =
            new operations.PaginationLimitOffsetOffsetParamsResponse({
                statusCode: httpRes.status,
                contentType: contentType,
                rawResponse: httpRes,
            });
        switch (true) {
            case httpRes?.status == 200:
                if (utils.matchContentType(contentType, `application/json`)) {
                    res.res = utils.objectToClass(
                        httpRes?.data,
                        operations.PaginationLimitOffsetOffsetParamsRes
                    );
                }
                break;
        }

        res.next =
            async (): Promise<operations.PaginationLimitOffsetOffsetParamsResponse | null> => {
                const offset = req.offset || 0;

                if (!httpRes?.data) {
                    return null;
                }
                const results = jp.value(httpRes?.data, "$.resultArray");
                if (!results.length) {
                    return null;
                }
                const limit = req.limit || 0;
                if (results.length < limit) {
                    return null;
                }
                const newOffset = offset + results.length;

                return await this.paginationLimitOffsetOffsetParams(
                    limit,
                    newOffset,
                    serverURL,
                    config
                );
            };
        return res;
    }

    async paginationLimitOffsetPageBody(
        req: shared.LimitOffsetConfig,
        serverURL?: string,
        config?: AxiosRequestConfig
    ): Promise<operations.PaginationLimitOffsetPageBodyResponse> {
        if (!(req instanceof utils.SpeakeasyBase)) {
            req = new shared.LimitOffsetConfig(req);
        }

        let baseURL: string = utils.templateUrl(
            operations.PaginationLimitOffsetPageBodyServerList[0],
            {}
        );
        if (serverURL) {
            baseURL = serverURL;
        }
        const url: string = baseURL.replace(/\/$/, "") + "/pagination/limitoffset/page";

        let [reqBodyHeaders, reqBody]: [object, any] = [{}, {}];

        try {
            [reqBodyHeaders, reqBody] = utils.serializeRequestBody(req, "request", "json");
        } catch (e: unknown) {
            if (e instanceof Error) {
                throw new Error(`Error serializing request body, cause: ${e.message}`);
            }
        }

        const client: AxiosInstance =
            this.sdkConfiguration.securityClient || this.sdkConfiguration.defaultClient;

        const headers = { ...reqBodyHeaders, ...config?.headers };
        headers["Accept"] = "application/json";
        headers[
            "x-speakeasy-user-agent"
        ] = `speakeasy-sdk/${this.sdkConfiguration.language} ${this.sdkConfiguration.sdkVersion} ${this.sdkConfiguration.genVersion} ${this.sdkConfiguration.openapiDocVersion}`;

        const httpRes: AxiosResponse = await client.request({
            validateStatus: () => true,
            url: url,
            method: "put",
            headers: headers,
            data: reqBody,
            ...config,
        });

        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) {
            throw new Error(`status code not found in response: ${httpRes}`);
        }

        const res: operations.PaginationLimitOffsetPageBodyResponse =
            new operations.PaginationLimitOffsetPageBodyResponse({
                statusCode: httpRes.status,
                contentType: contentType,
                rawResponse: httpRes,
            });
        switch (true) {
            case httpRes?.status == 200:
                if (utils.matchContentType(contentType, `application/json`)) {
                    res.res = utils.objectToClass(
                        httpRes?.data,
                        operations.PaginationLimitOffsetPageBodyRes
                    );
                }
                break;
        }

        res.next = async (): Promise<operations.PaginationLimitOffsetPageBodyResponse | null> => {
            const page = req.page || 0;
            const newPage = page + 1;
            const numPages = jp.value(httpRes?.data, "$.numPages");
            if (numPages == undefined || numPages <= page) {
                return null;
            }

            if (!httpRes?.data) {
                return null;
            }

            return await this.paginationLimitOffsetPageBody(
                {
                    ...req,
                    page: newPage,
                },
                serverURL,
                config
            );
        };
        return res;
    }

    async paginationLimitOffsetPageParams(
        page: number,
        serverURL?: string,
        config?: AxiosRequestConfig
    ): Promise<operations.PaginationLimitOffsetPageParamsResponse> {
        const req = new operations.PaginationLimitOffsetPageParamsRequest({
            page: page,
        });
        let baseURL: string = utils.templateUrl(
            operations.PaginationLimitOffsetPageParamsServerList[0],
            {}
        );
        if (serverURL) {
            baseURL = serverURL;
        }
        const url: string = baseURL.replace(/\/$/, "") + "/pagination/limitoffset/page";

        const client: AxiosInstance =
            this.sdkConfiguration.securityClient || this.sdkConfiguration.defaultClient;

        const headers = { ...config?.headers };
        const queryParams: string = utils.serializeQueryParams(req, this.sdkConfiguration.globals);
        headers["Accept"] = "application/json";
        headers[
            "x-speakeasy-user-agent"
        ] = `speakeasy-sdk/${this.sdkConfiguration.language} ${this.sdkConfiguration.sdkVersion} ${this.sdkConfiguration.genVersion} ${this.sdkConfiguration.openapiDocVersion}`;

        const httpRes: AxiosResponse = await client.request({
            validateStatus: () => true,
            url: url + queryParams,
            method: "get",
            headers: headers,
            ...config,
        });

        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) {
            throw new Error(`status code not found in response: ${httpRes}`);
        }

        const res: operations.PaginationLimitOffsetPageParamsResponse =
            new operations.PaginationLimitOffsetPageParamsResponse({
                statusCode: httpRes.status,
                contentType: contentType,
                rawResponse: httpRes,
            });
        switch (true) {
            case httpRes?.status == 200:
                if (utils.matchContentType(contentType, `application/json`)) {
                    res.res = utils.objectToClass(
                        httpRes?.data,
                        operations.PaginationLimitOffsetPageParamsRes
                    );
                }
                break;
        }

        res.next = async (): Promise<operations.PaginationLimitOffsetPageParamsResponse | null> => {
            const page = req.page || 0;
            const newPage = page + 1;

            if (!httpRes?.data) {
                return null;
            }
            const results = jp.value(httpRes?.data, "$.resultArray");
            if (!results.length) {
                return null;
            }

            return await this.paginationLimitOffsetPageParams(newPage, serverURL, config);
        };
        return res;
    }
}