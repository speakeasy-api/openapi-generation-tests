// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
	"openapi/pkg/models/shared"
)

// NullableObjectPostRes - OK
type NullableObjectPostRes struct {
	JSON *shared.NullableObject `json:"json"`
}

func (o *NullableObjectPostRes) GetJSON() *shared.NullableObject {
	if o == nil {
		return nil
	}
	return o.JSON
}

type NullableObjectPostResponse struct {
	ContentType string
	StatusCode  int
	RawResponse *http.Response
	// OK
	Res *NullableObjectPostRes
}

func (o *NullableObjectPostResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *NullableObjectPostResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *NullableObjectPostResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *NullableObjectPostResponse) GetRes() *NullableObjectPostRes {
	if o == nil {
		return nil
	}
	return o.Res
}