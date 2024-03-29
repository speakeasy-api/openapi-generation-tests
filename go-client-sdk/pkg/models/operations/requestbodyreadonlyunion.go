// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
	"openapi/v2/pkg/models/shared"
)

var RequestBodyReadOnlyUnionServerList = []string{
	"http://localhost:35456",
}

type RequestBodyReadOnlyUnionResponse struct {
	// HTTP response content type for this operation
	ContentType string
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
	// OK
	WeaklyTypedOneOfReadOnlyObject *shared.WeaklyTypedOneOfReadOnlyObject
}

func (o *RequestBodyReadOnlyUnionResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *RequestBodyReadOnlyUnionResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *RequestBodyReadOnlyUnionResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *RequestBodyReadOnlyUnionResponse) GetWeaklyTypedOneOfReadOnlyObject() *shared.WeaklyTypedOneOfReadOnlyObject {
	if o == nil {
		return nil
	}
	return o.WeaklyTypedOneOfReadOnlyObject
}
