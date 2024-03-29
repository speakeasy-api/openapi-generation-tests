// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
	"openapi/v2/pkg/models/shared"
)

// ResponseBodyZeroValueComplexTypePtrsPostResponseBody - OK
type ResponseBodyZeroValueComplexTypePtrsPostResponseBody struct {
	JSON shared.ObjWithZeroValueComplexTypePtrs `json:"json"`
}

func (o *ResponseBodyZeroValueComplexTypePtrsPostResponseBody) GetJSON() shared.ObjWithZeroValueComplexTypePtrs {
	if o == nil {
		return shared.ObjWithZeroValueComplexTypePtrs{}
	}
	return o.JSON
}

type ResponseBodyZeroValueComplexTypePtrsPostResponse struct {
	// HTTP response content type for this operation
	ContentType string
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
	// OK
	Object *ResponseBodyZeroValueComplexTypePtrsPostResponseBody
}

func (o *ResponseBodyZeroValueComplexTypePtrsPostResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *ResponseBodyZeroValueComplexTypePtrsPostResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *ResponseBodyZeroValueComplexTypePtrsPostResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *ResponseBodyZeroValueComplexTypePtrsPostResponse) GetObject() *ResponseBodyZeroValueComplexTypePtrsPostResponseBody {
	if o == nil {
		return nil
	}
	return o.Object
}
