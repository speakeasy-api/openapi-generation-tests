// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
)

type HeaderParamsArrayRequest struct {
	XHeaderArray []string `header:"style=simple,explode=false,name=X-Header-Array"`
}

func (o *HeaderParamsArrayRequest) GetXHeaderArray() []string {
	if o == nil {
		return []string{}
	}
	return o.XHeaderArray
}

type Headers struct {
	XHeaderArray string `json:"X-Header-Array"`
}

func (o *Headers) GetXHeaderArray() string {
	if o == nil {
		return ""
	}
	return o.XHeaderArray
}

// HeaderParamsArrayRes - OK
type HeaderParamsArrayRes struct {
	Headers Headers `json:"headers"`
}

func (o *HeaderParamsArrayRes) GetHeaders() Headers {
	if o == nil {
		return Headers{}
	}
	return o.Headers
}

type HeaderParamsArrayResponse struct {
	// HTTP response content type for this operation
	ContentType string
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
	// OK
	Res *HeaderParamsArrayRes
}

func (o *HeaderParamsArrayResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *HeaderParamsArrayResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *HeaderParamsArrayResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *HeaderParamsArrayResponse) GetRes() *HeaderParamsArrayRes {
	if o == nil {
		return nil
	}
	return o.Res
}
