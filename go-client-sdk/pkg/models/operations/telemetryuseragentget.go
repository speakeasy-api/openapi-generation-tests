// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
)

// TelemetryUserAgentGetRes - OK
type TelemetryUserAgentGetRes struct {
	Headers map[string]string `json:"headers"`
}

type TelemetryUserAgentGetResponse struct {
	ContentType string
	StatusCode  int
	RawResponse *http.Response
	// OK
	Res *TelemetryUserAgentGetRes
}