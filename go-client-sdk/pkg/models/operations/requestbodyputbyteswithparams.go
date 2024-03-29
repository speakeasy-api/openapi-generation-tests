// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
)

type RequestBodyPutBytesWithParamsRequest struct {
	RequestBody      []byte `request:"mediaType=application/octet-stream"`
	QueryStringParam string `queryParam:"style=form,explode=true,name=queryStringParam"`
}

func (o *RequestBodyPutBytesWithParamsRequest) GetRequestBody() []byte {
	if o == nil {
		return []byte{}
	}
	return o.RequestBody
}

func (o *RequestBodyPutBytesWithParamsRequest) GetQueryStringParam() string {
	if o == nil {
		return ""
	}
	return o.QueryStringParam
}

type RequestBodyPutBytesWithParamsArgs struct {
	QueryStringParam string `json:"queryStringParam"`
}

func (o *RequestBodyPutBytesWithParamsArgs) GetQueryStringParam() string {
	if o == nil {
		return ""
	}
	return o.QueryStringParam
}

// RequestBodyPutBytesWithParamsRes - OK
type RequestBodyPutBytesWithParamsRes struct {
	Args RequestBodyPutBytesWithParamsArgs `json:"args"`
	Data string                            `json:"data"`
}

func (o *RequestBodyPutBytesWithParamsRes) GetArgs() RequestBodyPutBytesWithParamsArgs {
	if o == nil {
		return RequestBodyPutBytesWithParamsArgs{}
	}
	return o.Args
}

func (o *RequestBodyPutBytesWithParamsRes) GetData() string {
	if o == nil {
		return ""
	}
	return o.Data
}

type RequestBodyPutBytesWithParamsResponse struct {
	// HTTP response content type for this operation
	ContentType string
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
	// OK
	Res *RequestBodyPutBytesWithParamsRes
}

func (o *RequestBodyPutBytesWithParamsResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *RequestBodyPutBytesWithParamsResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *RequestBodyPutBytesWithParamsResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *RequestBodyPutBytesWithParamsResponse) GetRes() *RequestBodyPutBytesWithParamsRes {
	if o == nil {
		return nil
	}
	return o.Res
}
