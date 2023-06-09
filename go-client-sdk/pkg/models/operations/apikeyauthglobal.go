// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
)

// APIKeyAuthGlobalToken - Successful authentication.
type APIKeyAuthGlobalToken struct {
	Authenticated bool   `json:"authenticated"`
	Token         string `json:"token"`
}

type APIKeyAuthGlobalResponse struct {
	ContentType string
	StatusCode  int
	RawResponse *http.Response
	// Successful authentication.
	Token *APIKeyAuthGlobalToken
}
