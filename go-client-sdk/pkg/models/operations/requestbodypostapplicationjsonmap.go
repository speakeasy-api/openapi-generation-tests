// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
	"openapi/pkg/models/shared"
)

var RequestBodyPostApplicationJSONMapServerList = []string{
	"http://localhost:35456",
}

type RequestBodyPostApplicationJSONMapResponse struct {
	ContentType string
	StatusCode  int
	RawResponse *http.Response
	// OK
	Res map[string]shared.SimpleObject
}
