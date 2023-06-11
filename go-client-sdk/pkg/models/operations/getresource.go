// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
	"openapi/pkg/models/shared"
)

type GetResourceRequest struct {
	ResourceID string `pathParam:"style=simple,explode=false,name=resourceId"`
}

type GetResourceResponse struct {
	ContentType string
	// OK
	ExampleResource *shared.ExampleResource
	StatusCode      int
	RawResponse     *http.Response
}