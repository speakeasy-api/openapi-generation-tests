// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
)

// RequestBodyPostFormMapPrimitiveRes - OK
type RequestBodyPostFormMapPrimitiveRes struct {
	Form map[string]string `json:"form"`
}

func (o *RequestBodyPostFormMapPrimitiveRes) GetForm() map[string]string {
	if o == nil {
		return map[string]string{}
	}
	return o.Form
}

type RequestBodyPostFormMapPrimitiveResponse struct {
	// HTTP response content type for this operation
	ContentType string
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
	// OK
	Res *RequestBodyPostFormMapPrimitiveRes
}

func (o *RequestBodyPostFormMapPrimitiveResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *RequestBodyPostFormMapPrimitiveResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *RequestBodyPostFormMapPrimitiveResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *RequestBodyPostFormMapPrimitiveResponse) GetRes() *RequestBodyPostFormMapPrimitiveRes {
	if o == nil {
		return nil
	}
	return o.Res
}
