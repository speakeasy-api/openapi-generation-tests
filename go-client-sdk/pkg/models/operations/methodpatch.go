// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package operations

import (
	"net/http"
)

var MethodPatchServerList = []string{
	"http://localhost:35456",
}

type MethodPatchRequestBody struct {
	ID *string `json:"id,omitempty"`
}

func (o *MethodPatchRequestBody) GetID() *string {
	if o == nil {
		return nil
	}
	return o.ID
}

// MethodPatchResponseBody - OK
type MethodPatchResponseBody struct {
	Status *string `json:"status,omitempty"`
}

func (o *MethodPatchResponseBody) GetStatus() *string {
	if o == nil {
		return nil
	}
	return o.Status
}

type MethodPatchResponse struct {
	// HTTP response content type for this operation
	ContentType string
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
	// OK
	Object *MethodPatchResponseBody
}

func (o *MethodPatchResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *MethodPatchResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *MethodPatchResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *MethodPatchResponse) GetObject() *MethodPatchResponseBody {
	if o == nil {
		return nil
	}
	return o.Object
}