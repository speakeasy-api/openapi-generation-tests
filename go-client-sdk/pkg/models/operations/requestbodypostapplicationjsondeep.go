// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
	"openapi/v2/pkg/models/shared"
)

// RequestBodyPostApplicationJSONDeepRes - OK
type RequestBodyPostApplicationJSONDeepRes struct {
	JSON *shared.DeepObject `json:"json,omitempty"`
}

func (o *RequestBodyPostApplicationJSONDeepRes) GetJSON() *shared.DeepObject {
	if o == nil {
		return nil
	}
	return o.JSON
}

type RequestBodyPostApplicationJSONDeepResponse struct {
	// HTTP response content type for this operation
	ContentType string
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
	// OK
	Res *RequestBodyPostApplicationJSONDeepRes
}

func (o *RequestBodyPostApplicationJSONDeepResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *RequestBodyPostApplicationJSONDeepResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *RequestBodyPostApplicationJSONDeepResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *RequestBodyPostApplicationJSONDeepResponse) GetRes() *RequestBodyPostApplicationJSONDeepRes {
	if o == nil {
		return nil
	}
	return o.Res
}
