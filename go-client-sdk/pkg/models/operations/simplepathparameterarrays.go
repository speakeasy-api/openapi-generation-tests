// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
)

type SimplePathParameterArraysRequest struct {
	ArrParam []string `pathParam:"style=simple,explode=false,name=arrParam"`
}

// SimplePathParameterArraysRes - OK
type SimplePathParameterArraysRes struct {
	URL string `json:"url"`
}

type SimplePathParameterArraysResponse struct {
	ContentType string
	StatusCode  int
	RawResponse *http.Response
	// OK
	Res *SimplePathParameterArraysRes
}
