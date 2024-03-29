// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
	"openapi/v2/pkg/models/shared"
)

// RequestBodyPostApplicationJSONDeepCamelCaseRes - OK
type RequestBodyPostApplicationJSONDeepCamelCaseRes struct {
	JSON *shared.DeepObjectCamelCase `json:"json,omitempty"`
}

func (o *RequestBodyPostApplicationJSONDeepCamelCaseRes) GetJSON() *shared.DeepObjectCamelCase {
	if o == nil {
		return nil
	}
	return o.JSON
}

type RequestBodyPostApplicationJSONDeepCamelCaseResponse struct {
	// HTTP response content type for this operation
	ContentType string
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
	// OK
	Res *RequestBodyPostApplicationJSONDeepCamelCaseRes
}

func (o *RequestBodyPostApplicationJSONDeepCamelCaseResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *RequestBodyPostApplicationJSONDeepCamelCaseResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *RequestBodyPostApplicationJSONDeepCamelCaseResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *RequestBodyPostApplicationJSONDeepCamelCaseResponse) GetRes() *RequestBodyPostApplicationJSONDeepCamelCaseRes {
	if o == nil {
		return nil
	}
	return o.Res
}
