// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
	"openapi/pkg/models/shared"
)

type ResponseBodyJSONGetResponse struct {
	ContentType string
	StatusCode  int
	RawResponse *http.Response
	// OK
	HTTPBinSimpleJSONObject *shared.HTTPBinSimpleJSONObject
}
