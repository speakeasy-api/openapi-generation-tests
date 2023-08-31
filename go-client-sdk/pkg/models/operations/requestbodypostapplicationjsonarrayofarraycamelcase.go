// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
	"openapi/pkg/models/shared"
)

var RequestBodyPostApplicationJSONArrayOfArrayCamelCaseServerList = []string{
	"http://localhost:35456",
}

type RequestBodyPostApplicationJSONArrayOfArrayCamelCaseResponse struct {
	ContentType string
	StatusCode  int
	RawResponse *http.Response
	// OK
	Arrs [][]shared.SimpleObjectCamelCase
}

func (o *RequestBodyPostApplicationJSONArrayOfArrayCamelCaseResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *RequestBodyPostApplicationJSONArrayOfArrayCamelCaseResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *RequestBodyPostApplicationJSONArrayOfArrayCamelCaseResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *RequestBodyPostApplicationJSONArrayOfArrayCamelCaseResponse) GetArrs() [][]shared.SimpleObjectCamelCase {
	if o == nil {
		return nil
	}
	return o.Arrs
}