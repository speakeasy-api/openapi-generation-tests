// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
)

type TelemetrySpeakeasyUserAgentGetRequest struct {
	UserAgent string `header:"style=simple,explode=false,name=User-Agent"`
}

// TelemetrySpeakeasyUserAgentGetRes - OK
type TelemetrySpeakeasyUserAgentGetRes struct {
	Headers map[string]string `json:"headers"`
}

type TelemetrySpeakeasyUserAgentGetResponse struct {
	ContentType string
	StatusCode  int
	RawResponse *http.Response
	// OK
	Res *TelemetrySpeakeasyUserAgentGetRes
}