// Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.

package operations

import (
	"net/http"
)

type TestHooksRequest struct {
	SomeParam string `queryParam:"style=form,explode=true,name=someParam"`
}

func (o *TestHooksRequest) GetSomeParam() string {
	if o == nil {
		return ""
	}
	return o.SomeParam
}

type TestHooksArgs struct {
	SomeParam string `json:"someParam"`
}

func (o *TestHooksArgs) GetSomeParam() string {
	if o == nil {
		return ""
	}
	return o.SomeParam
}

type Headers struct {
	ClientLevelHeader *string `json:"Client-Level-Header,omitempty"`
	IdempotencyKey    *string `json:"Idempotency-Key,omitempty"`
}

func (o *Headers) GetClientLevelHeader() *string {
	if o == nil {
		return nil
	}
	return o.ClientLevelHeader
}

func (o *Headers) GetIdempotencyKey() *string {
	if o == nil {
		return nil
	}
	return o.IdempotencyKey
}

// TestHooksRes - OK
type TestHooksRes struct {
	Args    TestHooksArgs `json:"args"`
	Headers Headers       `json:"headers"`
	URL     string        `json:"url"`
}

func (o *TestHooksRes) GetArgs() TestHooksArgs {
	if o == nil {
		return TestHooksArgs{}
	}
	return o.Args
}

func (o *TestHooksRes) GetHeaders() Headers {
	if o == nil {
		return Headers{}
	}
	return o.Headers
}

func (o *TestHooksRes) GetURL() string {
	if o == nil {
		return ""
	}
	return o.URL
}

type TestHooksResponse struct {
	// HTTP response content type for this operation
	ContentType string
	// HTTP response status code for this operation
	StatusCode int
	// Raw HTTP response; suitable for custom response parsing
	RawResponse *http.Response
	// OK
	Res *TestHooksRes
}

func (o *TestHooksResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *TestHooksResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *TestHooksResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *TestHooksResponse) GetRes() *TestHooksRes {
	if o == nil {
		return nil
	}
	return o.Res
}