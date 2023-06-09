// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
)

type StatusGetRequest struct {
	StatusCode int64 `pathParam:"style=simple,explode=false,name=statusCode"`
}

type StatusGetResponse struct {
	ContentType string
	StatusCode  int
	RawResponse *http.Response
}
