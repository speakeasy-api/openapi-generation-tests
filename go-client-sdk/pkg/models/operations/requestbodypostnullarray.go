// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
)

// RequestBodyPostNullArrayResponseBody - OK
type RequestBodyPostNullArrayResponseBody struct {
	Data string `json:"data"`
}

func (o *RequestBodyPostNullArrayResponseBody) GetData() string {
	if o == nil {
		return ""
	}
	return o.Data
}

type RequestBodyPostNullArrayResponse struct {
	// HTTP response content type for this operation
	ContentType string
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
	// OK
	Object *RequestBodyPostNullArrayResponseBody
}

func (o *RequestBodyPostNullArrayResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *RequestBodyPostNullArrayResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *RequestBodyPostNullArrayResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *RequestBodyPostNullArrayResponse) GetObject() *RequestBodyPostNullArrayResponseBody {
	if o == nil {
		return nil
	}
	return o.Object
}
