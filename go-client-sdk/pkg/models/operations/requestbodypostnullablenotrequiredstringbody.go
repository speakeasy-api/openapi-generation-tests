// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
)

// RequestBodyPostNullableNotRequiredStringBodyResponseBody - OK
type RequestBodyPostNullableNotRequiredStringBodyResponseBody struct {
	Data string `json:"data"`
}

func (o *RequestBodyPostNullableNotRequiredStringBodyResponseBody) GetData() string {
	if o == nil {
		return ""
	}
	return o.Data
}

type RequestBodyPostNullableNotRequiredStringBodyResponse struct {
	// HTTP response content type for this operation
	ContentType string
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
	// OK
	Object *RequestBodyPostNullableNotRequiredStringBodyResponseBody
}

func (o *RequestBodyPostNullableNotRequiredStringBodyResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *RequestBodyPostNullableNotRequiredStringBodyResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *RequestBodyPostNullableNotRequiredStringBodyResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *RequestBodyPostNullableNotRequiredStringBodyResponse) GetObject() *RequestBodyPostNullableNotRequiredStringBodyResponseBody {
	if o == nil {
		return nil
	}
	return o.Object
}
