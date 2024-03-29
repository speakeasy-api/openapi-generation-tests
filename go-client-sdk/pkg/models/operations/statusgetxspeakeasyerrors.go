// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
)

var StatusGetXSpeakeasyErrorsServerList = []string{
	"http://localhost:35456",
}

type StatusGetXSpeakeasyErrorsRequest struct {
	StatusCode int64 `pathParam:"style=simple,explode=false,name=statusCode"`
}

func (o *StatusGetXSpeakeasyErrorsRequest) GetStatusCode() int64 {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

type StatusGetXSpeakeasyErrorsResponse struct {
	// HTTP response content type for this operation
	ContentType string
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

func (o *StatusGetXSpeakeasyErrorsResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *StatusGetXSpeakeasyErrorsResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *StatusGetXSpeakeasyErrorsResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}
