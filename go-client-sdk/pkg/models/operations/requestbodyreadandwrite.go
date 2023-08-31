// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
	"openapi/pkg/models/shared"
)

var RequestBodyReadAndWriteServerList = []string{
	"http://localhost:35456",
}

type RequestBodyReadAndWriteResponse struct {
	ContentType string
	StatusCode  int
	RawResponse *http.Response
	// OK
	ReadWriteObject *shared.ReadWriteObjectOutput
}

func (o *RequestBodyReadAndWriteResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *RequestBodyReadAndWriteResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *RequestBodyReadAndWriteResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *RequestBodyReadAndWriteResponse) GetReadWriteObject() *shared.ReadWriteObjectOutput {
	if o == nil {
		return nil
	}
	return o.ReadWriteObject
}