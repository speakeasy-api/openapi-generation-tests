// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
	"openapi/pkg/models/shared"
)

type JSONQueryParamsObjectRequest struct {
	DeepObjParam shared.DeepObject `queryParam:"serialization=json,name=deepObjParam"`
	// A simple object that uses all our supported primitive types and enums and has optional properties.
	SimpleObjParam shared.SimpleObject `queryParam:"serialization=json,name=simpleObjParam"`
}

type JSONQueryParamsObjectResArgs struct {
	DeepObjParam   string `json:"deepObjParam"`
	SimpleObjParam string `json:"simpleObjParam"`
}

// JSONQueryParamsObjectRes - OK
type JSONQueryParamsObjectRes struct {
	Args JSONQueryParamsObjectResArgs `json:"args"`
	URL  string                       `json:"url"`
}

type JSONQueryParamsObjectResponse struct {
	ContentType string
	StatusCode  int
	RawResponse *http.Response
	// OK
	Res *JSONQueryParamsObjectRes
}
