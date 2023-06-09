// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
)

type DeprecatedWithCommentsGetRequest struct {
	// This is a string parameter
	//
	// Deprecated: this field will be removed in a future release, please migrate away from it as soon as possible. Use NewParameter instead.
	DeprecatedParameter *string `queryParam:"style=form,explode=true,name=deprecatedParameter"`
	// This is a string parameter
	NewParameter *string `queryParam:"style=form,explode=true,name=newParameter"`
}

type DeprecatedWithCommentsGetResponse struct {
	ContentType string
	StatusCode  int
	RawResponse *http.Response
}
