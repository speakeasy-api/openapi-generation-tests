// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
)

type SelectGlobalServerResponse struct {
	// HTTP response content type for this operation
	ContentType string
	Headers     map[string][]string
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
}

func (o *SelectGlobalServerResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *SelectGlobalServerResponse) GetHeaders() map[string][]string {
	if o == nil {
		return nil
	}
	return o.Headers
}

func (o *SelectGlobalServerResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *SelectGlobalServerResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}
