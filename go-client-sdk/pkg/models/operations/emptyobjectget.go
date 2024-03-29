// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
	"openapi/v2/pkg/models/shared"
)

type EmptyObjectGetRequest struct {
	EmptyObject shared.EmptyObjectParam `pathParam:"style=simple,explode=false,name=emptyObject"`
}

func (o *EmptyObjectGetRequest) GetEmptyObject() shared.EmptyObjectParam {
	if o == nil {
		return shared.EmptyObjectParam{}
	}
	return o.EmptyObject
}

type EmptyObjectGetResponse struct {
	// HTTP response content type for this operation
	ContentType string
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

func (o *EmptyObjectGetResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *EmptyObjectGetResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *EmptyObjectGetResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}
