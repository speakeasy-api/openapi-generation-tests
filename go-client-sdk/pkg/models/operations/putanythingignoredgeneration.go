// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
)

// PutAnythingIgnoredGeneration200ApplicationJSON - OK
type PutAnythingIgnoredGeneration200ApplicationJSON struct {
	JSON *string `json:"json,omitempty"`
}

type PutAnythingIgnoredGenerationResponse struct {
	ContentType string
	StatusCode  int
	RawResponse *http.Response
	// OK
	PutAnythingIgnoredGeneration200ApplicationJSONObject *PutAnythingIgnoredGeneration200ApplicationJSON
}
