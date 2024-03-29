// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
	"openapi/v2/pkg/models/shared"
)

type ResponseBodyJSONGetResponse struct {
	// HTTP response content type for this operation
	ContentType string
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
	// OK
	HTTPBinSimpleJSONObject *shared.HTTPBinSimpleJSONObject
}

func (o *ResponseBodyJSONGetResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *ResponseBodyJSONGetResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *ResponseBodyJSONGetResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *ResponseBodyJSONGetResponse) GetHTTPBinSimpleJSONObject() *shared.HTTPBinSimpleJSONObject {
	if o == nil {
		return nil
	}
	return o.HTTPBinSimpleJSONObject
}
